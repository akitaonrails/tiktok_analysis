package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0LZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545090LZj {
    public static final C545090LZj LIZ = new C545090LZj();
    public static final ICreationAsyncTaskManager LIZIZ = C09BV.LIZ();
    public static final AIGCWorkflowCreationService LIZJ = C2387909Xh.LIZ();
    public static final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final ConcurrentHashMap<String, C0LZU> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C0LZU> LJFF = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C0LZU> LJI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJII = new ConcurrentHashMap<>();
    public static final C1DEV LJIIIIZZ = C2191201ApK.LIZ();
    public static final C1DEV LJIIIZ = C2191201ApK.LIZ();
    public static final C1DEV LJIIJ = C2191201ApK.LIZ();

    public static void LJIIJJI() {
        ICreationAsyncTaskManager iCreationAsyncTaskManager;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_offline_effect_use_new_aigc_arch", true) == 1 || (iCreationAsyncTaskManager = LIZIZ) == null) {
            return;
        }
        iCreationAsyncTaskManager.LJI("AIGCGenerationDraftComponent", AFwS189S0000000_3.get$arr$(377), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C545280La2
            if (r0 == 0) goto L66
            r6 = r9
            X.0La2 r6 = (X.C545280La2) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L36
            if (r0 != r3) goto L6c
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            r6.LL = r8
            r6.LLILZ = r2
            java.lang.Object r5 = r7.LIZJ(r8, r6)
            if (r5 != r4) goto L3d
            return r4
        L36:
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r5)
        L3d:
            X.0LZU r5 = (X.C0LZU) r5
            int[] r1 = X.C0LZW.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L74
            if (r1 == r3) goto L54
            r0 = 3
            if (r1 == r0) goto L7b
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L54:
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r1 = X.C545090LZj.LIZJ
            if (r1 == 0) goto L7b
            r0 = 0
            r6.LL = r0
            r6.LLILZ = r3
            X.09aZ r0 = X.EnumC2398509aZ.CANCEL
            java.lang.Object r0 = r1.LJIIJ(r8, r0, r6)
            if (r0 != r4) goto L25
            return r4
        L66:
            X.0La2 r6 = new X.0La2
            r6.<init>(r7, r9)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L74:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C545090LZj.LIZIZ
            if (r0 == 0) goto L7b
            r0.LJJIL(r8)
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
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
    public final java.lang.Object LIZIZ(X.C0LY5 r11, X.InterfaceC1364105Vn<? super X.C0LYT> r12) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LIZIZ(X.0LY5, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x008b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r9, X.InterfaceC1364105Vn<? super X.C0LZU> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C545190LZt
            if (r0 == 0) goto L28
            r7 = r10
            X.0LZt r7 = (X.C545190LZt) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L40
            if (r0 == r3) goto L36
            if (r0 != r4) goto L2e
            X.01eN r2 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            goto L76
        L28:
            X.0LZt r7 = new X.0LZt
            r7.<init>(r8, r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.01eN r2 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r1)
            goto L5b
        L40:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJ
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L4c
            return r0
        L4c:
            X.1DEV r2 = X.C545090LZj.LJIIIIZZ
            r7.LL = r9
            r7.LLILLJJLI = r2
            r7.LLILZIL = r3
            java.lang.Object r0 = r2.LIZLLL(r5, r7)
            if (r0 != r6) goto L5b
            return r6
        L5b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJ     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L8b
            X.0LZU r1 = (X.C0LZU) r1     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L87
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r0 = X.C545090LZj.LIZJ     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7d
            r7.LL = r9     // Catch: java.lang.Throwable -> L8b
            r7.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L8b
            r7.LLILZIL = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.LJIILIIL(r9, r7)     // Catch: java.lang.Throwable -> L8b
            if (r1 != r6) goto L79
            return r6
        L76:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L85
        L79:
            X.0LZU r1 = (X.C0LZU) r1     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L7f
        L7d:
            X.0LZU r1 = X.C0LZU.NONE     // Catch: java.lang.Throwable -> L8b
        L7f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJ     // Catch: java.lang.Throwable -> L85
            r0.put(r9, r1)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto L8c
        L87:
            r2.LIZIZ(r5)
            return r1
        L8b:
            r0 = move-exception
        L8c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
            r2.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x008b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r9, X.InterfaceC1364105Vn<? super X.C0LZU> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C545200LZu
            if (r0 == 0) goto L28
            r7 = r10
            X.0LZu r7 = (X.C545200LZu) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L40
            if (r0 == r3) goto L36
            if (r0 != r4) goto L2e
            X.01eN r2 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            goto L76
        L28:
            X.0LZu r7 = new X.0LZu
            r7.<init>(r8, r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.01eN r2 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r1)
            goto L5b
        L40:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJI
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L4c
            return r0
        L4c:
            X.1DEV r2 = X.C545090LZj.LJIIJ
            r7.LL = r9
            r7.LLILLJJLI = r2
            r7.LLILZIL = r3
            java.lang.Object r0 = r2.LIZLLL(r5, r7)
            if (r0 != r6) goto L5b
            return r6
        L5b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJI     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L8b
            X.0LZU r1 = (X.C0LZU) r1     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L87
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r0 = X.C545090LZj.LIZJ     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7d
            r7.LL = r9     // Catch: java.lang.Throwable -> L8b
            r7.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L8b
            r7.LLILZIL = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.LJIILLIIL(r9, r7)     // Catch: java.lang.Throwable -> L8b
            if (r1 != r6) goto L79
            return r6
        L76:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L85
        L79:
            X.0LZU r1 = (X.C0LZU) r1     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L7f
        L7d:
            X.0LZU r1 = X.C0LZU.NONE     // Catch: java.lang.Throwable -> L8b
        L7f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJI     // Catch: java.lang.Throwable -> L85
            r0.put(r9, r1)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto L8c
        L87:
            r2.LIZIZ(r5)
            return r1
        L8b:
            r0 = move-exception
        L8c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
            r2.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x008b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r9, X.InterfaceC1364105Vn<? super X.C0LZU> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C545210LZv
            if (r0 == 0) goto L28
            r7 = r10
            X.0LZv r7 = (X.C545210LZv) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L40
            if (r0 == r3) goto L36
            if (r0 != r4) goto L2e
            X.01eN r2 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            goto L76
        L28:
            X.0LZv r7 = new X.0LZv
            r7.<init>(r8, r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.01eN r2 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r1)
            goto L5b
        L40:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJFF
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L4c
            return r0
        L4c:
            X.1DEV r2 = X.C545090LZj.LJIIIZ
            r7.LL = r9
            r7.LLILLJJLI = r2
            r7.LLILZIL = r3
            java.lang.Object r0 = r2.LIZLLL(r5, r7)
            if (r0 != r6) goto L5b
            return r6
        L5b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJFF     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L8b
            X.0LZU r1 = (X.C0LZU) r1     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L87
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r0 = X.C545090LZj.LIZJ     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7d
            r7.LL = r9     // Catch: java.lang.Throwable -> L8b
            r7.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L8b
            r7.LLILZIL = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.LJIJJ(r9, r7)     // Catch: java.lang.Throwable -> L8b
            if (r1 != r6) goto L79
            return r6
        L76:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L85
        L79:
            X.0LZU r1 = (X.C0LZU) r1     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L7f
        L7d:
            X.0LZU r1 = X.C0LZU.NONE     // Catch: java.lang.Throwable -> L8b
        L7f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0LZU> r0 = X.C545090LZj.LJFF     // Catch: java.lang.Throwable -> L85
            r0.put(r9, r1)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r0 = move-exception
            goto L8c
        L87:
            r2.LIZIZ(r5)
            return r1
        L8b:
            r0 = move-exception
        L8c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
            r2.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[PHI: r4 r10
      0x0123: PHI (r4v2 java.lang.Object) = 
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v4 java.lang.Object)
      (r4v0 java.lang.Object)
     binds: [B:52:0x0112, B:31:0x00ad, B:46:0x00fc, B:25:0x0097, B:21:0x008d, B:56:0x0121, B:37:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r10v14 java.lang.String) = 
      (r10v11 java.lang.String)
      (r10v12 java.lang.String)
      (r10v13 java.lang.String)
      (r10v13 java.lang.String)
      (r10v13 java.lang.String)
      (r10v15 java.lang.String)
      (r10v18 java.lang.String)
     binds: [B:52:0x0112, B:31:0x00ad, B:46:0x00fc, B:25:0x0097, B:21:0x008d, B:56:0x0121, B:37:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r10, X.InterfaceC1364105Vn<? super X.C0LY5> r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f A[PHI: r4 r10
      0x010f: PHI (r4v2 java.lang.Object) = 
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v0 java.lang.Object)
      (r4v4 java.lang.Object)
      (r4v0 java.lang.Object)
     binds: [B:52:0x00fe, B:31:0x0099, B:46:0x00e8, B:25:0x0083, B:21:0x0079, B:56:0x010d, B:37:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r10v14 java.lang.String) = 
      (r10v11 java.lang.String)
      (r10v12 java.lang.String)
      (r10v13 java.lang.String)
      (r10v13 java.lang.String)
      (r10v13 java.lang.String)
      (r10v15 java.lang.String)
      (r10v18 java.lang.String)
     binds: [B:52:0x00fe, B:31:0x0099, B:46:0x00e8, B:25:0x0083, B:21:0x0079, B:56:0x010d, B:37:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r10, X.InterfaceC1364105Vn<? super X.C0LY5> r11) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r6, com.ss.android.ugc.aweme.creative.model.CreativeModel r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C545260La0
            if (r0 == 0) goto L58
            r4 = r8
            X.0La0 r4 = (X.C545260La0) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 != r2) goto L5e
            com.ss.android.ugc.aweme.creative.model.CreativeModel r7 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.0LZU r3 = (X.C0LZU) r3
            int[] r1 = X.C0LZW.LIZ
            int r0 = r3.ordinal()
            r1 = r1[r0]
            r0 = 2
            if (r1 != r0) goto L3d
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCWorkflowModel r0 = r7.aigcWorkflowModel
            r0.getClass()
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCWorkflowModel r0 = new com.ss.android.ugc.aweme.creative.model.aigc.AIGCWorkflowModel
            r0.<init>(r2)
            r7.aigcWorkflowModel = r0
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L66
            boolean r0 = kotlin.text.a0.LJJJIL(r6)
            if (r0 != 0) goto L66
            if (r7 == 0) goto L66
            r4.LL = r7
            r4.LLILZ = r2
            java.lang.Object r3 = r5.LIZJ(r6, r4)
            if (r3 != r1) goto L24
            return r1
        L58:
            X.0La0 r4 = new X.0La0
            r4.<init>(r5, r8)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJII(java.lang.String, com.ss.android.ugc.aweme.creative.model.CreativeModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(androidx.lifecycle.LifecycleOwner r9, java.lang.String r10, X.InterfaceC1364105Vn r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C545220LZw
            if (r0 == 0) goto L7a
            r7 = r11
            X.0LZw r7 = (X.C545220LZw) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r2 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r5 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 == r4) goto L41
            if (r0 != r5) goto L80
            X.C155000ia.LIZIZ(r2)
        L26:
            X.01Wa r2 = (X.InterfaceC346201Wa) r2
            if (r2 == 0) goto L8e
            X.01Wa r1 = X.C09IC.LJIILL(r2)
            if (r1 == 0) goto L8e
            return r1
        L31:
            X.C155000ia.LIZIZ(r2)
            r7.LL = r10
            r7.LLILLJJLI = r9
            r7.LLILZIL = r4
            java.lang.Object r2 = r8.LJ(r10, r7)
            if (r2 != r6) goto L4a
            return r6
        L41:
            androidx.lifecycle.LifecycleOwner r9 = r7.LLILLJJLI
            java.lang.Object r10 = r7.LL
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r2)
        L4a:
            X.0LZU r2 = (X.C0LZU) r2
            int[] r1 = X.C0LZW.LIZ
            int r0 = r2.ordinal()
            r1 = r1[r0]
            if (r1 == r4) goto L93
            if (r1 == r5) goto L60
            r0 = 3
            if (r1 != r0) goto L88
            X.1DDq r1 = X.C1BNE.LIZ(r3)
            return r1
        L60:
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r2 = X.C545090LZj.LIZJ
            if (r2 == 0) goto L8e
            X.0LaR r1 = new X.0LaR
            androidx.lifecycle.Lifecycle r0 = r9.getLifecycle()
            r1.<init>(r0, r4, r4)
            r7.LL = r3
            r7.LLILLJJLI = r3
            r7.LLILZIL = r5
            java.lang.Object r2 = r2.LJIIJJI(r10, r1, r7)
            if (r2 != r6) goto L26
            return r6
        L7a:
            X.0LZw r7 = new X.0LZw
            r7.<init>(r8, r11)
            goto L12
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L8e:
            X.1DDq r1 = X.C1BNE.LIZ(r3)
            return r1
        L93:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C545090LZj.LIZIZ
            if (r0 == 0) goto Lb6
            X.01Wa r0 = r0.LJJJJL(r10)
            if (r0 == 0) goto Lb6
            X.05RH r1 = new X.05RH
            r1.<init>(r0)
            r0 = 47
            kotlin.jvm.internal.AFwS291S0000000_8 r0 = kotlin.jvm.internal.AFwS291S0000000_8.get$arr$(r0)
            X.01Wa r2 = X.C09IC.LJIILJJIL(r0, r1)
            if (r2 == 0) goto Lb6
            X.0Mqo r1 = new X.0Mqo
            r0 = 11
            r1.<init>(r2, r0)
            return r1
        Lb6:
            X.1DDq r1 = X.C1BNE.LIZ(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJIIIIZZ(androidx.lifecycle.LifecycleOwner, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C545240LZy
            if (r0 == 0) goto L6e
            r7 = r11
            X.0LZy r7 = (X.C545240LZy) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r2 = r7.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L3b
            if (r0 == r4) goto L91
            if (r0 != r5) goto L74
            X.C155000ia.LIZIZ(r2)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r2)
            r7.LL = r9
            r7.LLILLJJLI = r10
            r7.LLILZIL = r3
            java.lang.Object r2 = r8.LJ(r9, r7)
            if (r2 != r6) goto L46
            return r6
        L3b:
            java.lang.Object r10 = r7.LLILLJJLI
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r7.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r2)
        L46:
            X.0LZU r2 = (X.C0LZU) r2
            int[] r1 = X.C0LZW.LIZ
            int r0 = r2.ordinal()
            r0 = r1[r0]
            r2 = 0
            if (r0 == r3) goto L7c
            if (r0 == r4) goto L5d
            if (r0 == r5) goto L97
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L5d:
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r0 = X.C545090LZj.LIZJ
            if (r0 == 0) goto L97
            r7.LL = r2
            r7.LLILLJJLI = r2
            r7.LLILZIL = r5
            java.lang.Object r0 = r0.LJI(r2, r9, r7)
            if (r0 != r6) goto L28
            return r6
        L6e:
            X.0LZy r7 = new X.0LZy
            r7.<init>(r8, r11)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7c:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = X.C545090LZj.LIZIZ
            if (r1 == 0) goto L97
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r7.LL = r2
            r7.LLILLJJLI = r2
            r7.LLILZIL = r4
            java.lang.Object r0 = r1.LJIJI(r10, r0, r7)
            if (r0 != r6) goto L94
            return r6
        L91:
            X.C155000ia.LIZIZ(r2)
        L94:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L97:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJIIIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C545250LZz
            if (r0 == 0) goto L6c
            r6 = r10
            X.0LZz r6 = (X.C545250LZz) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L38
            if (r0 != r3) goto L72
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILZIL = r2
            java.lang.Object r5 = r7.LIZJ(r8, r6)
            if (r5 != r4) goto L43
            return r4
        L38:
            java.lang.Object r9 = r6.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r5)
        L43:
            X.0LZU r5 = (X.C0LZU) r5
            int[] r1 = X.C0LZW.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L7a
            if (r1 == r3) goto L5a
            r0 = 3
            if (r1 == r0) goto L81
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L5a:
            com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService r1 = X.C545090LZj.LIZJ
            if (r1 == 0) goto L81
            r0 = 0
            r6.LL = r0
            r6.LLILLJJLI = r0
            r6.LLILZIL = r3
            java.lang.Object r0 = r1.LJIL(r8, r9, r6)
            if (r0 != r4) goto L25
            return r4
        L6c:
            X.0LZz r6 = new X.0LZz
            r6.<init>(r7, r10)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7a:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C545090LZj.LIZIZ
            if (r0 == 0) goto L81
            r0.LJJIJIIJI(r8, r9)
        L81:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJIIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel r14, X.C545510LaP<X.C550580Lia<X.C551070LjN>> r15, java.lang.String r16, java.lang.String r17, boolean r18, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r19, X.InterfaceC1364105Vn<? super java.lang.String> r20) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545090LZj.LJIIJ(com.ss.android.ugc.aweme.aigc.migration.model.OldFrameworkInputModel, X.0LaP, java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }
}
