package X;

import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: renamed from: X.0LFX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LFX {
    public final C375830EoP<List<C539860LFg>> LIZ;
    public final C375830EoP<FrameLayout.LayoutParams> LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final C375830EoP<Boolean> LIZLLL;

    public C0LFX() {
        this(null, null, null, null);
    }

    public C0LFX(C375830EoP<List<C539860LFg>> c375830EoP, C375830EoP<FrameLayout.LayoutParams> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<Boolean> c375830EoP4) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
    }

    public static C0LFX LIZ(C0LFX c0lfx, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c0lfx.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c0lfx.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP3 = c0lfx.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP4 = c0lfx.LIZLLL;
        }
        c0lfx.getClass();
        return new C0LFX(c375830EoP, c375830EoP2, c375830EoP3, c375830EoP4);
    }
}
