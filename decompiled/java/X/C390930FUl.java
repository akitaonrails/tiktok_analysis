package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390930FUl implements InterfaceC390990FUr {
    public StickerModel LIZ;
    public final C01GW LIZIZ;

    public final void LIZIZ() {
        StickerModel stickerModel = this.LIZ;
        if (stickerModel == null) {
            return;
        }
        RectF viewRect = stickerModel.getBaseModel().getViewRect();
        ((C0FUM) this.LIZIZ.getValue()).onDown(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, viewRect.centerX(), viewRect.centerY(), 0));
    }

    public final MotionEvent LIZJ() {
        StickerModel stickerModel = this.LIZ;
        if (stickerModel == null) {
            return null;
        }
        RectF viewRect = stickerModel.getBaseModel().getViewRect();
        MotionEvent motionEventObtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, viewRect.centerX(), viewRect.centerY(), 0);
        ((C0FUM) this.LIZIZ.getValue()).onUp(motionEventObtain);
        return motionEventObtain;
    }

    public C390930FUl(C390420FSm c390420FSm) {
        this.LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1019));
    }

    @Override // X.InterfaceC390990FUr
    public final C390930FUl LIZ(StickerModel stickerModel) {
        this.LIZ = stickerModel;
        return this;
    }

    public final void LIZLLL(C391000FUs c391000FUs) {
        if (Intrinsics.LJFF(c391000FUs, C391000FUs.LIZ)) {
            LIZIZ();
            MotionEvent motionEventLIZJ = LIZJ();
            if (motionEventLIZJ != null) {
                ((C0FUM) this.LIZIZ.getValue()).onSingleTapConfirmed(motionEventLIZJ);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c391000FUs, new AbstractC390980FUq() { // from class: X.0FUp
        })) {
            C1DFK c1dfkLIZ = C23118094a.LIZ();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(c1dfkLIZ)), null, null, new C390940FUm(this, null), 3);
            c1dfkLIZ.LIZIZ(null);
            return;
        }
        throw new C1954807lC();
    }
}
