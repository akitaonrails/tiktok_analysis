package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673940Qc4 {
    public static final C673940Qc4 LIZ = new C673940Qc4();
    public static C673950Qc5 LIZIZ;
    public static C673950Qc5 LIZJ;

    public static final void LIZ() {
        C673950Qc5 c673950Qc5 = LIZIZ;
        if (c673950Qc5 != null) {
            if (c673950Qc5.LJIIL != null) {
                return;
            }
            if (c673950Qc5 != null) {
                c673950Qc5.LJIIL = Long.valueOf(System.currentTimeMillis());
            }
        }
        LJIIIZ(EnumC673930Qc3.ASSEM_SHOW, null);
    }

    public static C673950Qc5 LIZIZ(EnumC673970Qc7 enumC673970Qc7) {
        int i = C674000QcA.LIZ[enumC673970Qc7.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return LIZJ;
            }
            throw new C1954807lC();
        }
        return LIZIZ;
    }

    public static final void LJ(EnumC673970Qc7 enumC673970Qc7) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJIJI = Long.valueOf(System.currentTimeMillis());
        }
        LJIIIZ(EnumC673930Qc3.FIRST_SCREEN, enumC673970Qc7);
    }

    public static final void LJFF(EnumC673970Qc7 enumC673970Qc7) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJIL = Long.valueOf(System.currentTimeMillis());
        }
    }

    public static final void LJIIJJI(EnumC673970Qc7 enumC673970Qc7) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJIIJ = Long.valueOf(System.currentTimeMillis());
        }
        LJIIIZ(EnumC673930Qc3.BLANK_INIT, enumC673970Qc7);
    }

    public static final void LIZJ(EnumC673970Qc7 enumC673970Qc7, boolean z) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJIILLIIL = Long.valueOf(System.currentTimeMillis());
            c673950Qc5LIZIZ.LJIIZILJ = Boolean.valueOf(z);
        }
    }

    public static final void LIZLLL(EnumC673970Qc7 enumC673970Qc7, int i) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJIILJJIL = Long.valueOf(System.currentTimeMillis());
            c673950Qc5LIZIZ.LJIILL = Integer.valueOf(i);
        }
    }

    public static final void LJI(EnumC673970Qc7 enumC673970Qc7, boolean z) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJJ = Long.valueOf(System.currentTimeMillis());
            c673950Qc5LIZIZ.LJJI = Boolean.valueOf(z);
        }
        LJIIIZ(EnumC673930Qc3.GUESS_RESPONSE, enumC673970Qc7);
    }

    public static final void LJII(EnumC673970Qc7 enumC673970Qc7, Map map) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJIJJ = Long.valueOf(System.currentTimeMillis());
            c673950Qc5LIZIZ.LJIJJLI = map;
        }
        LJIIIZ(EnumC673930Qc3.LYNX_FIRST_SCREEN, enumC673970Qc7);
    }

    public static final void LJIIIIZZ(EnumC673970Qc7 enumC673970Qc7, boolean z) {
        C673950Qc5 c673950Qc5LIZIZ = LIZIZ(enumC673970Qc7);
        if (c673950Qc5LIZIZ != null) {
            c673950Qc5LIZIZ.LJIILIIL = z;
            c673950Qc5LIZIZ.LJIJ = Long.valueOf(System.currentTimeMillis());
        }
        LJIIIZ(EnumC673930Qc3.LYNX_INIT, enumC673970Qc7);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0008 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0002, B:7:0x000c, B:8:0x001e, B:5:0x0008), top: B:13:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c A[Catch: all -> 0x0024, PHI: r0
      0x000c: PHI (r0v3 X.0Qc5) = (r0v0 X.0Qc5), (r0v6 X.0Qc5) binds: [B:4:0x0006, B:6:0x000a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0002, B:7:0x000c, B:8:0x001e, B:5:0x0008), top: B:13:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIIIZ(X.EnumC673930Qc3 r5, X.EnumC673970Qc7 r6) {
        /*
            if (r6 == 0) goto L8
            X.0Qc5 r0 = LIZIZ(r6)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto Lc
        L8:
            X.0Qc5 r0 = X.C673940Qc4.LIZIZ     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1e
        Lc:
            java.util.Map r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L24
            X.03Hh r4 = X.C817503Hh.LL     // Catch: java.lang.Throwable -> L24
            X.1DFB r3 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L24
            X.0Qc6 r2 = new X.0Qc6     // Catch: java.lang.Throwable -> L24
            r1 = 0
            r2.<init>(r0, r5, r6, r1)     // Catch: java.lang.Throwable -> L24
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)     // Catch: java.lang.Throwable -> L24
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L24
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C673940Qc4.LJIIIZ(X.0Qc3, X.0Qc7):java.lang.Object");
    }

    public static final void LJIIJ(SearchResultParam searchResultParam, C0QER c0qer) {
        String keyword;
        boolean zLIZJ = C650500PfM.LIZJ(c0qer);
        String initSugWord = c0qer.getInitSugWord();
        boolean z = false;
        if ((initSugWord == null || initSugWord.length() == 0) && ((keyword = searchResultParam.getKeyword()) == null || keyword.length() == 0)) {
            z = true;
        }
        if (zLIZJ && z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iLIZIZ = C650500PfM.LIZIZ(c0qer);
            C673950Qc5 c673950Qc5 = LIZIZ;
            if (c673950Qc5 == null || !Intrinsics.LJFF(c673950Qc5.LIZ, Boolean.TRUE)) {
                c673950Qc5 = new C673950Qc5();
            }
            LIZIZ = c673950Qc5;
            c673950Qc5.LJFF = Long.valueOf(jCurrentTimeMillis);
            c673950Qc5.LJI = "search";
            c673950Qc5.LJII = Integer.valueOf(iLIZIZ);
            C673950Qc5 c673950Qc52 = new C673950Qc5();
            c673950Qc52.LJFF = Long.valueOf(jCurrentTimeMillis);
            c673950Qc52.LJI = "search";
            c673950Qc52.LJII = Integer.valueOf(iLIZIZ);
            LIZJ = c673950Qc52;
        }
        LJIIIZ(EnumC673930Qc3.START, null);
    }
}
