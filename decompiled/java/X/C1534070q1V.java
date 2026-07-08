package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534070q1V {
    public static Function1<? super C1534070q1V, String> LJIILJJIL;
    public static Function1<? super C1534070q1V, Unit> LJIILL;
    public final boolean LIZ;
    public final C1533790q13 LIZIZ;
    public final InterfaceC1534850q2l LIZJ;
    public Function1<? super Boolean, Unit> LIZLLL;
    public volatile boolean LJFF;
    public volatile String LJI;
    public AbstractC1522680pj8 LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public Object LJIILIIL;
    public volatile EnumC1534560q2I LJ = EnumC1534560q2I.LL;
    public C1533640q0o LJII = new C1533640q0o(this);

    public final void LIZJ() {
        this.LJ = EnumC1534560q2I.LLILLJJLI;
        this.LIZIZ.LIZIZ = true;
        this.LJIILIIL = null;
        Function1<? super Boolean, Unit> function1 = this.LIZLLL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        this.LIZLLL = null;
    }

    public final void LIZ(C1533670q0r c1533670q0r) {
        this.LIZIZ.LIZLLL.LIZJ = c1533670q0r.getHttpCode();
        AbstractC1522680pj8 abstractC1522680pj8 = this.LJIIIIZZ;
        if (abstractC1522680pj8 != null) {
            C1534080q1W.LIZJ.remove(abstractC1522680pj8.toString());
        }
        if (!this.LIZIZ.LJIIL && this.LJII.LJ(c1533670q0r)) {
            InterfaceC1534850q2l interfaceC1534850q2l = this.LIZJ;
            this.LIZIZ.LIZ.LJJJJJ.getApplication();
            interfaceC1534850q2l.LIZJ(this);
            return;
        }
        this.LIZIZ.LIZLLL.LIZ("cdn", String.valueOf(c1533670q0r.getMessage()));
        this.LJ = EnumC1534560q2I.LLILLL;
        this.LJIILIIL = null;
        this.LIZIZ.LIZIZ = false;
        if (this.LJ != EnumC1534560q2I.LLILZ) {
            C1533810q15 c1533810q15 = this.LIZIZ.LIZLLL;
            int errorCode = c1533670q0r.getErrorCode();
            String message = c1533670q0r.getMessage();
            if (message == null) {
                message = "download failed";
            }
            c1533810q15.LIZIZ(errorCode, "cdn", message);
        }
        Function1<? super Boolean, Unit> function1 = this.LIZLLL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        this.LIZLLL = null;
    }

    public final boolean LIZLLL(C1534070q1V c1534070q1V) throws InterruptedException {
        if (Intrinsics.LJFF(c1534070q1V, this)) {
            C1533480q0Y.LIZJ("FETCH_TASK", null, null, null, "unexpected behavior: self-register", null, null, null, null, null, null, 8174);
            return true;
        }
        this.LJFF = true;
        while (this.LJ == EnumC1534560q2I.LL) {
            Thread.sleep(10L);
        }
        String str = this.LJI;
        if (str != null) {
            c1534070q1V.LIZIZ(str, this);
            return true;
        }
        if (C1534800q2g.LIZ[this.LJ.ordinal()] == 1) {
            if (!C1533950q1J.LIZ(this.LIZIZ, c1534070q1V.LIZIZ)) {
                return false;
            }
            c1534070q1V.LJII = this.LJII;
            c1534070q1V.LIZIZ.LJIJ = EnumC1534700q2W.REUSE;
            c1534070q1V.LIZJ();
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not success, state: ");
        sbLIZ.append(this.LJ);
        C1534250q1n.LIZIZ("CDNFetcher", C2188811AlT.LIZIZ(sbLIZ), null);
        return false;
    }

    public final void LIZIZ(String str, C1534070q1V c1534070q1V) {
        C1533790q13 c1533790q13;
        this.LJI = str;
        this.LJ = EnumC1534560q2I.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("redirected to ");
        sbLIZ.append(this.LJII.LIZLLL);
        C1534250q1n.LJII("CDNFetcher", C2188811AlT.LIZIZ(sbLIZ), false);
        if (!this.LJIIL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("disable to redirect to ");
            sbLIZ2.append(str);
            LIZ(new C1533670q0r(9, 0, C2188811AlT.LIZIZ(sbLIZ2)));
            return;
        }
        if (c1534070q1V != null && (c1533790q13 = c1534070q1V.LIZIZ) != null && C1533950q1J.LIZ(c1533790q13, this.LIZIZ)) {
            LIZJ();
            return;
        }
        C1533640q0o c1533640q0o = this.LJII;
        c1533640q0o.getClass();
        c1533640q0o.LIZJ(UriProtector.parse(str), str);
        c1533640q0o.LJIIJ = false;
        InterfaceC1534850q2l interfaceC1534850q2l = this.LIZJ;
        this.LIZIZ.LIZ.LJJJJJ.getApplication();
        interfaceC1534850q2l.LIZJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1534070q1V(boolean r6, X.C1533790q13 r7, X.InterfaceC1534850q2l r8, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.LIZ = r6
            r5.LIZIZ = r7
            r5.LIZJ = r8
            r5.LIZLLL = r9
            X.0q2I r0 = X.EnumC1534560q2I.LL
            r5.LJ = r0
            X.0q0o r0 = new X.0q0o
            r0.<init>(r5)
            r5.LJII = r0
            X.0q0Z r0 = r7.LIZ
            boolean r0 = r0.LJJIJL
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L2b
            X.086F r0 = X.C086F.LIZ
            r0.getClass()
            boolean r0 = X.C086F.LIZ()
            if (r0 == 0) goto L75
            if (r6 != 0) goto L75
        L2b:
            r0 = 1
        L2c:
            r5.LJIIIZ = r0
            if (r0 != 0) goto L73
            X.0q0Z r1 = r7.LIZ
            boolean r0 = r1.LJJIJLIJ
            if (r0 != 0) goto L3e
            java.lang.Boolean r0 = r1.LJIILL
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L73
        L3e:
            r0 = 1
        L3f:
            r5.LJIIJ = r0
            if (r0 == 0) goto L71
            X.0q0Z r0 = r7.LIZ
            java.lang.Boolean r0 = r0.LJIJ
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L71
            r0 = 1
        L4e:
            r5.LJIIJJI = r0
            X.0q0Z r2 = r7.LIZ
            boolean r0 = r2.LIZIZ
            if (r0 == 0) goto L6c
            X.0q1M r1 = r2.LJJJ
            X.0q1M r0 = X.EnumC1533980q1M.WEB_MAIN_DOCUMENT
            if (r1 == r0) goto L6c
            java.lang.Object r1 = r2.LJJJJI
            boolean r0 = r1 instanceof android.webkit.WebResourceRequest
            if (r0 == 0) goto L6f
            android.webkit.WebResourceRequest r1 = (android.webkit.WebResourceRequest) r1
            if (r1 == 0) goto L6f
            boolean r0 = r1.isForMainFrame()
            if (r0 != r3) goto L6f
        L6c:
            r5.LJIIL = r4
            return
        L6f:
            r4 = 1
            goto L6c
        L71:
            r0 = 0
            goto L4e
        L73:
            r0 = 0
            goto L3f
        L75:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534070q1V.<init>(boolean, X.0q13, X.0q2l, kotlin.jvm.functions.Function1):void");
    }
}
