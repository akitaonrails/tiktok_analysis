package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.storage.IRelationStorageService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263110iyT {
    public final C1262930iyB LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final IRelationStorageService LIZJ;
    public final IMafUserApi LIZLLL;
    public final Function0<Unit> LJ;
    public final Set<String> LJFF;
    public final boolean LJI;
    public final Set<String> LJII;
    public boolean LJIIIIZZ;
    public C2252321DDq LJIIIZ;
    public C1263310iyn LJIIJ;
    public C1263310iyn LJIIJJI;
    public C1263190iyb LJIIL;

    public C1263110iyT() {
        throw null;
    }

    public final C1263190iyb LIZIZ() {
        C1263190iyb c1263190iyb = this.LJIIL;
        if (c1263190iyb != null) {
            return c1263190iyb;
        }
        return null;
    }

    public final void LJI(Function1<? super C1263210iyd, C1263210iyd> function1) {
        C2252321DDq c2252321DDq = this.LJIIIZ;
        C2252321DDq c2252321DDq2 = null;
        if (c2252321DDq == null) {
            c2252321DDq = null;
        }
        C1263210iyd c1263210iydInvoke = function1.invoke(c2252321DDq.getValue());
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update to new state: ");
        sbLIZ.append(c1263210iydInvoke);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL("MafSource", strLIZIZ);
        C2252321DDq c2252321DDq3 = this.LJIIIZ;
        if (c2252321DDq3 != null) {
            c2252321DDq2 = c2252321DDq3;
        }
        c2252321DDq2.setValue(c1263210iydInvoke);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1263190iyb r23, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.relation.model.MaFListResponse> r24) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263110iyT.LIZ(X.0iyb, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C1263330iyp r15, X.InterfaceC1364105Vn<? super X.C1263310iyn> r16) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263110iyT.LJ(X.0iyp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1263330iyp r7, java.util.Set<java.lang.String> r8, X.InterfaceC1364105Vn<? super X.C1263310iyn> r9) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263110iyT.LIZLLL(X.0iyp, java.util.Set, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023d A[Catch: all -> 0x02c1, TryCatch #1 {all -> 0x02c1, blocks: (B:26:0x00a7, B:28:0x00b4, B:29:0x00b8, B:30:0x00cf, B:32:0x00d5, B:34:0x00e1, B:35:0x00e5, B:38:0x00f2, B:39:0x0103, B:41:0x0109, B:43:0x0112, B:48:0x0121, B:49:0x0125, B:51:0x0138, B:52:0x0140, B:54:0x0153, B:59:0x0166, B:60:0x016f, B:62:0x0175, B:65:0x0181, B:67:0x0185, B:68:0x0189, B:71:0x01a4, B:72:0x01ac, B:74:0x01b2, B:76:0x01c3, B:78:0x01c7, B:79:0x01d4, B:81:0x01e5, B:92:0x01fb, B:93:0x020a, B:95:0x0210, B:102:0x021e, B:104:0x0224, B:106:0x023d, B:107:0x024a, B:109:0x0250, B:111:0x025c, B:112:0x0260, B:114:0x026e, B:116:0x028f, B:115:0x0286, B:83:0x01e9, B:85:0x01ef, B:70:0x01a0, B:23:0x006b), top: B:123:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026e A[Catch: all -> 0x02c1, TryCatch #1 {all -> 0x02c1, blocks: (B:26:0x00a7, B:28:0x00b4, B:29:0x00b8, B:30:0x00cf, B:32:0x00d5, B:34:0x00e1, B:35:0x00e5, B:38:0x00f2, B:39:0x0103, B:41:0x0109, B:43:0x0112, B:48:0x0121, B:49:0x0125, B:51:0x0138, B:52:0x0140, B:54:0x0153, B:59:0x0166, B:60:0x016f, B:62:0x0175, B:65:0x0181, B:67:0x0185, B:68:0x0189, B:71:0x01a4, B:72:0x01ac, B:74:0x01b2, B:76:0x01c3, B:78:0x01c7, B:79:0x01d4, B:81:0x01e5, B:92:0x01fb, B:93:0x020a, B:95:0x0210, B:102:0x021e, B:104:0x0224, B:106:0x023d, B:107:0x024a, B:109:0x0250, B:111:0x025c, B:112:0x0260, B:114:0x026e, B:116:0x028f, B:115:0x0286, B:83:0x01e9, B:85:0x01ef, B:70:0x01a0, B:23:0x006b), top: B:123:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0286 A[Catch: all -> 0x02c1, TryCatch #1 {all -> 0x02c1, blocks: (B:26:0x00a7, B:28:0x00b4, B:29:0x00b8, B:30:0x00cf, B:32:0x00d5, B:34:0x00e1, B:35:0x00e5, B:38:0x00f2, B:39:0x0103, B:41:0x0109, B:43:0x0112, B:48:0x0121, B:49:0x0125, B:51:0x0138, B:52:0x0140, B:54:0x0153, B:59:0x0166, B:60:0x016f, B:62:0x0175, B:65:0x0181, B:67:0x0185, B:68:0x0189, B:71:0x01a4, B:72:0x01ac, B:74:0x01b2, B:76:0x01c3, B:78:0x01c7, B:79:0x01d4, B:81:0x01e5, B:92:0x01fb, B:93:0x020a, B:95:0x0210, B:102:0x021e, B:104:0x0224, B:106:0x023d, B:107:0x024a, B:109:0x0250, B:111:0x025c, B:112:0x0260, B:114:0x026e, B:116:0x028f, B:115:0x0286, B:83:0x01e9, B:85:0x01ef, B:70:0x01a0, B:23:0x006b), top: B:123:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0iyT] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1263330iyp r22, X.C1263190iyb r23, java.util.Set<java.lang.String> r24, X.InterfaceC1364105Vn<? super X.C1263310iyn> r25) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263110iyT.LIZJ(X.0iyp, X.0iyb, java.util.Set, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List r6, int r7, java.lang.String r8, X.InterfaceC1364105Vn r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1263320iyo
            if (r0 == 0) goto L20
            r4 = r9
            X.0iyo r4 = (X.C1263320iyo) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3c
        L20:
            X.0iyo r4 = new X.0iyo
            r4.<init>(r5, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L45
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r0.recordRecMoreExposure(r6, r8, r7, r4)     // Catch: java.lang.Throwable -> L45
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L45
        L3f:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3     // Catch: java.lang.Throwable -> L45
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L45
            goto L51
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L51:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r3)
            java.lang.String r2 = "MafSource"
            if (r0 == 0) goto L63
            X.0j0Q r0 = X.C1264320j0Q.LIZ
            r0.getClass()
            java.lang.String r0 = "recordRecMoreExposure SUCCESS"
            X.C1264320j0Q.LIZLLL(r2, r0)
        L63:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r1 == 0) goto L73
            X.0j0Q r0 = X.C1264320j0Q.LIZ
            r0.getClass()
            java.lang.String r0 = "recordRecMoreExposure FAIL"
            X.C1264320j0Q.LIZIZ(r2, r0, r1)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263110iyT.LJFF(java.util.List, int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public C1263110iyT(C1262930iyB c1262930iyB, InterfaceC497601wk interfaceC497601wk, Function0 function0, Set set, boolean z) {
        C1263390iyv c1263390iyv = C1263390iyv.LIZIZ;
        MafUserApiService mafUserApiService = MafUserApiService.LIZIZ;
        this.LIZ = c1262930iyB;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = c1263390iyv;
        this.LIZLLL = mafUserApiService;
        this.LJ = function0;
        this.LJFF = set;
        this.LJI = z;
        this.LJII = new LinkedHashSet();
    }
}
