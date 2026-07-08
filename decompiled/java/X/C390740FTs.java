package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390740FTs extends C0FUE {
    public final C1664680tQA<BaseStickerModel> LLJJ;
    public final C386740FEi LLJJI;
    public final C390420FSm LLJJIII;
    public final C01GW LLJJIJI;

    @Override // X.C0FUE
    public final C1664680tQA<BaseStickerModel> LJJJIL() {
        return this.LLJJ;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        RectF visibleRectWithoutRotation = this.LLJJ.LIZ.getVisibleRectWithoutRotation();
        if (!C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), this.LLJJ.LIZ.getRotation(), this.LLJJI.getDeleteIconRect(), 0.0f) && C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), this.LLJJ.LIZ.getRotation(), visibleRectWithoutRotation, 0.0f)) {
            C386740FEi c386740FEi = this.LLJJI;
            c386740FEi.LLJJJIL = true;
            c386740FEi.invalidate();
        }
        super.onDown(motionEvent);
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!LJJJJ()) {
            return false;
        }
        RectF visibleRectWithoutRotation = this.LLJJ.LIZ.getVisibleRectWithoutRotation();
        if (!C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), this.LLJJ.LIZ.getRotation(), visibleRectWithoutRotation, 0.0f)) {
            return false;
        }
        for (C0FUD c0fud : this.LLILZ) {
            int id = this.LLJJ.LIZ.getId();
            this.LLJJ.LIZ.getType();
            motionEvent.getX();
            motionEvent.getY();
            new RectF(visibleRectWithoutRotation);
            if (c0fud.LJJIIJ(id)) {
                return true;
            }
        }
        LJJJJL(new AwS214S0300000_5(this, motionEvent, visibleRectWithoutRotation, 33));
        return true;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), this.LLJJ.LIZ.getRotation(), this.LLJJI.getDeleteIconRect(), 0.0f)) {
            C0CNO.LIZLLL(100L, new AwS549S0100000_5(this, 1491));
            return true;
        }
        super.onUp(motionEvent);
        return false;
    }

    public C390740FTs(C1664680tQA c1664680tQA, C386740FEi c386740FEi, C390420FSm c390420FSm) {
        super(c1664680tQA, c390420FSm);
        this.LLJJ = c1664680tQA;
        this.LLJJI = c386740FEi;
        this.LLJJIII = c390420FSm;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1492));
    }
}
