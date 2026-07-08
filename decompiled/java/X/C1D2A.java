package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS85S1000000_35;

/* JADX INFO: renamed from: X.1D2A, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D2A {
    public final C2249111D1h LIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1D1h] */
    public C1D2A() {
        final Object[] objArr = new Object[0];
        this.LIZ = new AbstractC1023470cjx(objArr) { // from class: X.1D1h
            @Override // X.AbstractC1023380cjo, X.C1023640ckE
            public final C1023630ckD<?>[] getInternalLogics() {
                return new C1023630ckD[0];
            }
        };
    }

    public final void LIZ(Aweme aweme, EnumC673040Qac enumC673040Qac, String str) {
        C1023960ckk c1023960ckk;
        if (enumC673040Qac == EnumC673040Qac.COMMENTS_HIGHLIGHT_WORD && !((Boolean) C077N.LIZ.getValue()).booleanValue()) {
            return;
        }
        C2249111D1h c2249111D1h = this.LIZ;
        int i = C673050Qad.LIZ[enumC673040Qac.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c1023960ckk = C1D2B.LIZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1023960ckk = C1D2C.LIZ;
            }
        } else {
            c1023960ckk = C1D26.LIZ;
        }
        c2249111D1h.withContext(aweme);
        c2249111D1h.logAd(c1023960ckk, new AwS85S1000000_35(str, 15));
    }

    public final void LIZIZ(Aweme aweme, EnumC673040Qac enumC673040Qac, String str) {
        C1023960ckk c1023960ckk;
        if (enumC673040Qac == EnumC673040Qac.COMMENTS_HIGHLIGHT_WORD && !((Boolean) C077N.LIZ.getValue()).booleanValue()) {
            return;
        }
        C2249111D1h c2249111D1h = this.LIZ;
        int i = C673050Qad.LIZ[enumC673040Qac.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c1023960ckk = C1D28.LIZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1023960ckk = C1D2D.LIZ;
            }
        } else {
            c1023960ckk = C1D22.LIZ;
        }
        c2249111D1h.withContext(aweme);
        c2249111D1h.logAd(c1023960ckk, new AwS85S1000000_35(str, 16));
    }
}
