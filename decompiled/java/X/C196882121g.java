package X;

import android.view.View;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;

/* JADX INFO: renamed from: X.121g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196882121g {
    public final /* synthetic */ C121Y LIZ;

    public C196882121g(C121Y c121y) {
        this.LIZ = c121y;
    }

    public final void LIZ(boolean z) {
        C196925122x c196925122x;
        C121V c121v;
        View view;
        ((FTCEditTextStickerViewModel) this.LIZ.LLJJI.getValue()).iJ2(C121Y.LLLII(!z), false);
        if (z) {
            C121I c121i = this.LIZ.LLLIILIL().LLL;
            if (c121i instanceof C196925122x) {
                c196925122x = (C196925122x) c121i;
            } else {
                c196925122x = null;
            }
            if (c196925122x != null) {
                c196925122x.LJJIII(C121Y.LLLII(true), false);
            }
            Object obj = this.LIZ.LLLIILIL().LLL;
            if ((obj instanceof C19610711o1) && (view = (View) obj) != null) {
                float fLLLII = C121Y.LLLII(true);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                view.setAlpha(fLLLII);
            }
            C121I c121i2 = this.LIZ.LLLIILIL().LLL;
            if ((c121i2 instanceof C121V) && (c121v = (C121V) c121i2) != null) {
                this.LIZ.getClass();
                c121v.LIZ();
            }
        }
    }
}
