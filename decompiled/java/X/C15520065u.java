package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.065u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15520065u {
    public static final C15520065u LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public static final C01GW LJ;
    public static C099G LJFF;
    public static final C01GW LJI;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C15520065u.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C15520065u c15520065u = new C15520065u();
        LIZIZ = c15520065u;
        C1598406Nq c1598406Nq = c15520065u.LIZ;
        if (c1598406Nq == null) {
            synchronized (c15520065u) {
                c1598406Nq = c15520065u.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c15520065u.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ);
        LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1133));
        LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1132));
        new StreakShareInfo("", null, null, "");
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.05eG
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        C15520065u c15520065u2 = C15520065u.LIZIZ;
                        c15520065u2.getClass();
                        C15520065u.LIZ().clear();
                        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) C15520065u.LJI.getValue();
                        if (interfaceC1411705fn != null) {
                            interfaceC1411705fn.LIZJ("");
                        }
                        synchronized (c15520065u2) {
                            try {
                                C099G c099g = C15520065u.LJFF;
                                if (c099g != null) {
                                    c099g.LIZIZ(null);
                                }
                                C15520065u.LJFF = null;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }
            }
        });
    }

    public static Keva LIZ() {
        return (Keva) LJ.getValue();
    }

    public static StreakShareInfo LIZIZ(Keva keva) {
        return new StreakShareInfo(keva.getString("share_url", ""), null, null, keva.getString("h5_url", ""));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        if (X.C894660Z7w.LJ() != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15520065u.LJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:18:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:18:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x0081
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C15522065w
            if (r0 == 0) goto L26
            r5 = r10
            X.065w r5 = (X.C15522065w) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r0 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r4 = 1
            java.lang.String r3 = "StreakShareDataCenter preHeat attempt "
            if (r1 == 0) goto L38
            if (r1 != r4) goto L30
            int r2 = r5.LLILLJJLI
            int r9 = r5.LL
            goto L2c
        L26:
            X.065w r5 = new X.065w
            r5.<init>(r8, r10)
            goto L12
        L2c:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L3d X.C094W -> L83
            goto L71
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r0)
            r2 = 0
            goto L62
        L3d:
            r0 = move-exception
        L3e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r1 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r7 = X.C2188811AlT.LIZ()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r1 = " failed: "
            r7.append(r1)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r7)
            X.C1590906Kt.LIZIZ(r0)
        L60:
            int r2 = r2 + 1
        L62:
            if (r2 > r9) goto La1
            r5.LL = r9     // Catch: java.lang.Exception -> L7f X.C094W -> L81
            r5.LLILLJJLI = r2     // Catch: java.lang.Exception -> L7f X.C094W -> L81
            r5.LLILZIL = r4     // Catch: java.lang.Exception -> L7f X.C094W -> L81
            java.lang.Object r0 = r8.LJ(r5)     // Catch: java.lang.Exception -> L7f X.C094W -> L81
            if (r0 != r6) goto L71
            goto La0
        L71:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L7b X.C094W -> L7d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L7b X.C094W -> L7d
            if (r0 == 0) goto L60
            r2 = r9
            goto L60
        L7b:
            r0 = move-exception
            goto L3e
        L7d:
            r0 = move-exception
            goto L84
        L7f:
            r0 = move-exception
            goto L3e
        L81:
            r0 = move-exception
            goto L84
        L83:
            r0 = move-exception
        L84:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r0 = " timed out"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZIZ(r0)
            goto L60
        La0:
            return r6
        La1:
            com.bytedance.keva.Keva r0 = LIZ()
            com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo r0 = LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15520065u.LIZLLL(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: Exception -> 0x005b, 094W -> 0x0081, TRY_ENTER, TryCatch #2 {094W -> 0x0081, Exception -> 0x005b, blocks: (B:12:0x002e, B:18:0x0046), top: B:29:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:25:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:25:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0082 -> B:25:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r9, long r10, X.InterfaceC1364105Vn r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C15521065v
            if (r0 == 0) goto L28
            r5 = r12
            X.065v r5 = (X.C15521065v) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r4 = 1
            java.lang.String r3 = "StreakShareDataCenter preHeat attempt "
            if (r0 == 0) goto L3a
            if (r0 != r4) goto L32
            int r9 = r5.LLILLJJLI
            long r10 = r5.LL
            X.00cf r2 = r5.LLILLL
            goto L2e
        L28:
            X.065v r5 = new X.065v
            r5.<init>(r8, r12)
            goto L12
        L2e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            goto L9f
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.C155000ia.LIZIZ(r1)
            X.00cf r2 = new X.00cf
            r2.<init>()
        L42:
            int r0 = r2.element
            if (r0 > r9) goto La7
            X.05eC r1 = new X.05eC     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            r0 = 0
            r1.<init>(r2, r9, r0)     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            r5.LL = r10     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            r5.LLILLJJLI = r9     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            r5.LLILZLL = r4     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            java.lang.Object r0 = X.C099A.LIZIZ(r10, r1, r5)     // Catch: java.lang.Exception -> L5b X.C094W -> L81
            if (r0 != r6) goto L9f
            goto La6
        L5b:
            r7 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r7)
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            int r0 = r2.element
            r1.append(r0)
            java.lang.String r0 = " failed: "
            r1.append(r0)
            java.lang.String r0 = r7.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZIZ(r0)
            goto L9f
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            boolean r0 = X.C1590906Kt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            int r0 = r2.element
            r1.append(r0)
            java.lang.String r0 = " timed out"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590906Kt.LIZIZ(r0)
        L9f:
            int r0 = r2.element
            int r0 = r0 + 1
            r2.element = r0
            goto L42
        La6:
            return r6
        La7:
            com.bytedance.keva.Keva r0 = LIZ()
            com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo r0 = LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15520065u.LIZJ(int, long, X.05Vn):java.lang.Object");
    }
}
