package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0gkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177850gkx extends FrameLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public boolean LL;
    public float LLILLJJLI;
    public float LLILLL;
    public Integer LLILZ;
    public final C1177860gky LLILZIL;

    public final AbstractC1177930gl5 getBottomSheetCallback() {
        return this.LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0gky] */
    public C1177850gkx(Context context) {
        super(context, null);
        this.LLILLJJLI = -1.0f;
        this.LLILLL = -1.0f;
        this.LLILZIL = new AbstractC1177930gl5() { // from class: X.0gky
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
                float f2;
                C1177850gkx c1177850gkx = this.LIZ;
                if (!c1177850gkx.LL) {
                    C1177850gkx c1177850gkx2 = this.LIZ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1177850gkx2);
                    c1177850gkx2.setAlpha(f);
                    return;
                }
                if (f < 0.01d) {
                    return;
                }
                if (c1177850gkx.LLILLJJLI == -1.0f) {
                    c1177850gkx.LLILLJJLI = f;
                    return;
                }
                if (c1177850gkx.LLILLL == -1.0f) {
                    c1177850gkx.LLILLL = f;
                    return;
                }
                C1177850gkx c1177850gkx3 = this.LIZ;
                float f3 = c1177850gkx3.LLILLJJLI;
                if (f3 > c1177850gkx3.LLILLL) {
                    if (c1177850gkx3.LLILZ == null) {
                        return;
                    } else {
                        f2 = f * (1.0f / f3);
                    }
                } else {
                    f2 = ((1.0f / (1.0f - f3)) * f) + (f3 / (f3 - 1.0f));
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1177850gkx3);
                c1177850gkx3.setAlpha(f2);
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                if (i != 1) {
                    if (i != 3) {
                        if (i != 4) {
                            C786410Ut5.l1(this.LIZ, 0);
                            return;
                        } else {
                            this.LIZ.LLILZ = 4;
                            C786410Ut5.l1(this.LIZ, 8);
                            return;
                        }
                    }
                    this.LIZ.LLILZ = 3;
                    C786410Ut5.l1(this.LIZ, 0);
                    return;
                }
                C786410Ut5.l1(this.LIZ, 0);
                C1177850gkx c1177850gkx = this.LIZ;
                c1177850gkx.LLILLJJLI = -1.0f;
                c1177850gkx.LLILLL = -1.0f;
            }
        };
    }

    public final void setHalfInitial(boolean z) {
        this.LL = z;
    }
}
