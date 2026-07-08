package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;

/* JADX INFO: renamed from: X.0u0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687000u0A {
    public final InterfaceC550750Lir LIZ;

    public static String LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }

    public C1687000u0A(int i) {
        InterfaceC550750Lir interfaceC550750LirG9;
        AITheaterProfileService.LIZ.getClass();
        AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
        if (aITheaterProfileServiceLIZ != null) {
            interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9();
        } else {
            interfaceC550750LirG9 = null;
        }
        this.LIZ = interfaceC550750LirG9;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.InterfaceC549230LgP> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1687010u0B
            if (r0 == 0) goto L57
            r7 = r9
            X.0u0B r7 = (X.C1687010u0B) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L5d
            X.0Lir r4 = r7.LL
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            r1.m10unboximpl()
        L29:
            X.0LgP r0 = r4.LIZLLL()
            return r0
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Lir r4 = r8.LIZ
            r3 = 0
            if (r4 != 0) goto L37
            return r3
        L37:
            X.0LgP r0 = r4.LIZLLL()
            boolean r0 = r0 instanceof X.C558690Lvf
            if (r0 == 0) goto L29
            java.lang.String r2 = LIZ()
            r1 = 0
            if (r2 == 0) goto L65
            int r0 = r2.length()
            if (r0 == 0) goto L65
            r7.LL = r4
            r7.LLILZ = r5
            java.lang.Object r0 = r4.LJIILIIL(r2, r1, r3, r7)
            if (r0 != r6) goto L29
            return r6
        L57:
            X.0u0B r7 = new X.0u0B
            r7.<init>(r8, r9)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687000u0A.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa A[RETURN] */
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
    public final java.lang.Object LIZJ(int r9, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1687040u0E
            if (r0 == 0) goto L25
            r7 = r10
            X.0u0E r7 = (X.C1687040u0E) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r0 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L33
            if (r1 != r5) goto L2b
            java.lang.Object r3 = r7.LL
            java.lang.String r3 = (java.lang.String) r3
            goto L6c
        L25:
            X.0u0E r7 = new X.0u0E
            r7.<init>(r8, r10)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r0)
            java.lang.String r3 = LIZ()     // Catch: java.lang.Throwable -> L97
            X.0CcH r2 = X.C317350CcH.LIZ     // Catch: java.lang.Throwable -> L97
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = X.C317350CcH.LIZLLL     // Catch: java.lang.Throwable -> L94
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L47
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L97
            goto L59
        L47:
            java.util.List<com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem> r1 = X.C317350CcH.LIZIZ     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L97
            goto L59
        L4d:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L57
            X.C317350CcH.LIZIZ = r4     // Catch: java.lang.Throwable -> L94
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L97
            goto L59
        L57:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L97
            goto L5a
        L59:
            r1 = r4
        L5a:
            if (r1 != 0) goto L90
            X.0sf5 r0 = X.C1635490sf5.LIZ     // Catch: java.lang.Throwable -> L97
            r7.LL = r3     // Catch: java.lang.Throwable -> L97
            r7.LLILZ = r5     // Catch: java.lang.Throwable -> L97
            r0.getClass()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = X.C1635490sf5.LIZ(r9, r7)     // Catch: java.lang.Throwable -> L97
            if (r0 != r6) goto L6f
            return r6
        L6c:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L97
        L6f:
            com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse r0 = (com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse) r0     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L75
            r1 = r4
            goto L90
        L75:
            com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel r0 = r0.getData()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L86
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Asset> r1 = r0.asset_list     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L86
            X.0MXq r0 = X.EnumC570120MXq.CAROUSEL     // Catch: java.lang.Throwable -> L97
            java.util.List r1 = X.C1415750mwf.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L97
            goto L87
        L86:
            r1 = r4
        L87:
            if (r1 != 0) goto L8b
            X.13BV r1 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L97
        L8b:
            X.0CcH r0 = X.C317350CcH.LIZ     // Catch: java.lang.Throwable -> L97
            r0.LIZ(r3, r1)     // Catch: java.lang.Throwable -> L97
        L90:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L97
            goto La3
        L94:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        La3:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto Laa
            return r1
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687000u0A.LIZJ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC497601wk r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1687030u0D
            if (r0 == 0) goto L49
            r5 = r8
            X.0u0D r5 = (X.C1687030u0D) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L4f
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            r1.m10unboximpl()
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0Lir r2 = r6.LIZ
            if (r2 != 0) goto L34
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            java.lang.String r1 = LIZ()
            if (r1 == 0) goto L57
            int r0 = r1.length()
            if (r0 == 0) goto L57
            r5.LLILLL = r3
            java.lang.Object r0 = r2.LJIILIIL(r1, r3, r7, r5)
            if (r0 != r4) goto L27
            return r4
        L49:
            X.0u0D r5 = new X.0u0D
            r5.<init>(r6, r8)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L57:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687000u0A.LJ(X.01wk, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
    
        if (r4 != null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r9, int r10, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse> r11) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687000u0A.LIZLLL(int, int, X.05Vn):java.lang.Object");
    }
}
