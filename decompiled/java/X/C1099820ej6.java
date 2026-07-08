package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkLayoutRefactorAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ej6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099820ej6 extends C21538619Qy {
    public final Paint LLILZIL;
    public final Path LLILZLL;
    public final Rect LLIZ;

    @Override // X.C21538619Qy, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        boolean booleanValue = true;
        if (room != null && (owner = room.getOwner()) != null && UserService.getInstance().user().getCurrentUserId() == owner.getId()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            booleanValue = LiveAbLabelSetting.INSTANCE.getBooleanValue("linkmic_sdk_layout_refactor");
        } else if (!C176600m4.LIZIZ(C931820aM8.LIZLLL("linkmic_sdk_layout_refactor")) || !LinkmicSdkLayoutRefactorAudienceSetting.INSTANCE.getEnable()) {
            booleanValue = false;
        }
        if (booleanValue) {
            super.onDraw(canvas);
            if (!this.LLILZLL.isEmpty()) {
                int iSaveLayer = canvas.saveLayer(new RectF(this.LLIZ), null);
                canvas.drawPath(this.LLILZLL, this.LLILZIL);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
            return;
        }
        if (!this.LLILZLL.isEmpty()) {
            canvas.saveLayer(new RectF(this.LLIZ), null);
        }
        super.onDraw(canvas);
        if (this.LLILZLL.isEmpty()) {
            return;
        }
        canvas.drawPath(this.LLILZLL, this.LLILZIL);
        canvas.restore();
    }

    public C1099820ej6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        Paint paint = new Paint(1);
        this.LLILZIL = paint;
        Path path = new Path();
        this.LLILZLL = path;
        this.LLIZ = new Rect();
        path.setFillType(Path.FillType.WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public final void LIZ(List<Rect> list, float f) {
        this.LLILZLL.reset();
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLILZLL.addRoundRect(new RectF((Rect) it2.next()), f, f, Path.Direction.CW);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateClipPath => ");
        sbLIZ.append(list);
        sbLIZ.append(" , size = ");
        sbLIZ.append(arrayList.size());
        C20441214yg.LIZIZ("maskhollow", C2188811AlT.LIZIZ(sbLIZ));
        invalidate();
    }

    @Override // X.C21538619Qy, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZ.set(0, 0, i, i2);
    }
}
