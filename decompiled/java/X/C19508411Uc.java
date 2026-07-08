package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.List;

/* JADX INFO: renamed from: X.11Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19508411Uc extends FrameLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public List<String> LL;
    public final SmartImageView LLILLJJLI;
    public LinearGradient LLILLL;
    public final Paint LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO r15) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19508411Uc.LIZ(com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO):void");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LinearGradient linearGradient = this.LLILLL;
        if (linearGradient != null) {
            this.LLILZ.setShader(linearGradient);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLILZ);
        }
    }

    public C19508411Uc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, -1));
        this.LLILLJJLI = smartImageView;
        addView(smartImageView);
        setBackgroundColor(0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LLILZ = paint;
    }
}
