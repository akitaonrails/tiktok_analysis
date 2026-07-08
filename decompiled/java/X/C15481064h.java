package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* JADX INFO: renamed from: X.064h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15481064h {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final C054G LIZ;
    public final C603820NmG<String, ConstructMessageContentPbResponse> LIZIZ;
    public final C1DEV LIZJ;
    public volatile C1598406Nq LIZLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C15481064h.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C15481064h() {
        C1598406Nq c1598406Nq = this.LIZLLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LIZLLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LIZLLL = c1598406Nq;
                }
            }
        }
        this.LIZ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LIZIZ = new C603820NmG<>(100);
        this.LIZJ = C2191201ApK.LIZ();
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.064i
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        C15481064h c15481064h = this.LL;
                        synchronized (c15481064h.LIZIZ) {
                            try {
                                c15481064h.LIZIZ.LJIIIZ(-1);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C2296808zG.LIZJ(c15481064h.LIZ, null);
                    }
                }
            }
        });
    }

    public static String LIZ(int i, String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('-');
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(C13LP.LJJLIIIJ(C13LP.LJLLLL(new C512401z8(64), map.entrySet()), "-", null, null, 0, null, AnonymousClass0207.get$arr$(143), 30));
        return String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #0 {all -> 0x00a9, blocks: (B:26:0x0096, B:27:0x0099, B:29:0x009d, B:19:0x006c, B:23:0x007e), top: B:36:0x0025 }] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.01eN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r14, java.lang.String r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse> r18) {
        /*
            r13 = this;
            r10 = r16
            r6 = r17
            r3 = r18
            r9 = r15
            r8 = r14
            boolean r0 = r3 instanceof X.C15480064g
            if (r0 == 0) goto L32
            r12 = r3
            X.064g r12 = (X.C15480064g) r12
            int r2 = r12.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L32
            int r2 = r2 - r1
            r12.LLIZLLLIL = r2
        L1a:
            java.lang.Object r7 = r12.LLILZLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r12.LLIZLLLIL
            r0 = 1
            r4 = 2
            r3 = 0
            if (r1 == 0) goto L54
            if (r1 == r0) goto L40
            if (r1 != r4) goto L38
            java.lang.Object r1 = r12.LLILLL
            java.lang.Object r2 = r12.LLILLJJLI
            X.01eN r2 = (X.InterfaceC383701eN) r2
            goto L96
        L32:
            X.064g r12 = new X.064g
            r12.<init>(r13, r3)
            goto L1a
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L40:
            int r8 = r12.LL
            X.1DEV r2 = r12.LLILZIL
            java.lang.Object r6 = r12.LLILZ
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r10 = r12.LLILLL
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r12.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r7)
            goto L6c
        L54:
            X.C155000ia.LIZIZ(r7)
            X.1DEV r2 = r13.LIZJ
            r12.LLILLJJLI = r9
            r12.LLILLL = r10
            r12.LLILZ = r6
            r12.LLILZIL = r2
            r12.LL = r8
            r12.LLIZLLLIL = r0
            java.lang.Object r0 = r2.LIZLLL(r3, r12)
            if (r0 != r5) goto L6c
            return r5
        L6c:
            java.lang.String r1 = LIZ(r8, r9, r6)     // Catch: java.lang.Throwable -> La9
            X.0NmG<java.lang.String, com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse> r0 = r13.LIZIZ     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = r0.LIZJ(r1)     // Catch: java.lang.Throwable -> La9
            com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse r0 = (com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse) r0     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L7e
            r2.LIZIZ(r3)
            return r0
        L7e:
            com.ss.android.ugc.aweme.im.sdk.common.data.service.ConstructMessageContentPbApi r7 = com.ss.android.ugc.aweme.im.sdk.common.data.service.ConstructMessageContentPbApi.LIZIZ     // Catch: java.lang.Throwable -> La9
            r0 = 0
            java.lang.String r11 = X.C051M.LJ(r6, r0)     // Catch: java.lang.Throwable -> La9
            r12.LLILLJJLI = r2     // Catch: java.lang.Throwable -> La9
            r12.LLILLL = r1     // Catch: java.lang.Throwable -> La9
            r12.LLILZ = r3     // Catch: java.lang.Throwable -> La9
            r12.LLILZIL = r3     // Catch: java.lang.Throwable -> La9
            r12.LLIZLLLIL = r4     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = r7.constructMessageContentPb(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La9
            if (r7 != r5) goto L99
            return r5
        L96:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> La9
        L99:
            com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse r7 = (com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse) r7     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto La5
            X.0NmG<java.lang.String, com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse> r0 = r13.LIZIZ     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = r0.LIZLLL(r1, r7)     // Catch: java.lang.Throwable -> La9
            com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse r0 = (com.ss.android.ugc.aweme.im.service.service.ConstructMessageContentPbResponse) r0     // Catch: java.lang.Throwable -> La9
        La5:
            r2.LIZIZ(r3)
            return r7
        La9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La9
            r2.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15481064h.LIZIZ(int, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
