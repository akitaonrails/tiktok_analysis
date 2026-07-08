package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2244708qr extends AbstractC2255721DQs<InterfaceC361290EEl> implements InterfaceC361290EEl, InterfaceC379610EuV {
    public static final C2246008r4 LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public static final int LLJJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC361290EEl LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1635410sex LLILZIL = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC2189708hz.class, null);
    public final LinkedHashMap<Pair<String, String>, Boolean> LLIZ = new LinkedHashMap<>();
    public final HashMap<Pair<String, String>, Effect> LLIZLLLIL = new HashMap<>();
    public final HashMap<Pair<String, String>, String> LLJ = new HashMap<>();
    public final HashSet<String> LLJI = new HashSet<>();
    public final boolean LLJIJIL = C289190BVd.LIZ(getEditModel());
    public final Map<String, EffectSearchModel> LLJILJIL = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.08r4] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2244708qr.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C2244708qr.class, "favManager", "getFavManager()Lcom/ss/ugc/android/editor/core/favorite/IFavoriteMaterialManager;", 0)};
        LLJILJILJ = new Object() { // from class: X.08r4
        };
        LLJJ = 8;
        LLJJI = ((Number) C2245608r0.LIZ.getValue()).intValue();
    }

    public final InterfaceC2189708hz G2() {
        return (InterfaceC2189708hz) this.LLILZLL.getValue(this, LLJILLL[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJILLL[0]);
    }

    private final void X1() {
        C0CHQ.LIZ().LJIJI();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJILJIL.putAll(getEditModel().getEditorProModel().getFavoriteEffectSearchInfo());
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    public InterfaceC361290EEl w2() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC361290EEl
    public EffectSearchModel jl2(String str) {
        return this.LLJILJIL.get(str);
    }

    public C2244708qr(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.InterfaceC361290EEl
    public boolean Ar1(String str, List<String> list) {
        X1();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(this.LLIZ.get(new Pair(str, it2.next())), Boolean.TRUE)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H2(final java.lang.String r12, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r13) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2244708qr.H2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(java.lang.String r10, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>> r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2244708qr.T2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(java.lang.String r4, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>> r5) {
        /*
            r3 = this;
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r2.<init>(r0)
            boolean r0 = r3.LLJIJIL     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L16
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L26
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L26
            r2.resumeWith(r0)     // Catch: java.lang.Throwable -> L26
            goto L43
        L16:
            X.0sex r1 = r3.LLILZIL     // Catch: java.lang.Throwable -> L26
            X.08nm r0 = new X.08nm     // Catch: java.lang.Throwable -> L26
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L26
            r1.Bg(r4, r0)     // Catch: java.lang.Throwable -> L26
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L26
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L32:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto L43
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            r2.resumeWith(r0)
        L43:
            java.lang.Object r1 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L50
            X.C099Q.LIZJ(r5)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2244708qr.W2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // X.InterfaceC361290EEl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Xu2(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.ugc.android.editor.base.resource.ResourceItem>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2245008qu
            if (r0 == 0) goto L4a
            r4 = r7
            X.08qu r4 = (X.C2245008qu) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L3d
            if (r1 != r0) goto L50
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r1 = r3.m10unboximpl()
        L28:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            if (r0 == 0) goto L39
            java.util.List r1 = (java.util.List) r1
            X.0EUc r0 = X.C365360EUc.LIZ
            r0.getClass()
            java.util.List r1 = X.C365360EUc.LIZIZ(r1)
        L39:
            X.C189200o6.m2constructorimpl(r1)
            return r1
        L3d:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            r0 = 0
            java.lang.Object r1 = r5.SS0(r6, r0, r4)
            if (r1 != r2) goto L28
            return r2
        L4a:
            X.08qu r4 = new X.08qu
            r4.<init>(r5, r7)
            goto L12
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2244708qr.Xu2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:26:0x0091, B:27:0x0094, B:29:0x009a, B:30:0x00a6, B:31:0x00bd, B:33:0x00c3, B:35:0x00d4, B:36:0x00d8, B:37:0x00e3, B:39:0x00e9, B:40:0x0125, B:21:0x007a, B:22:0x007d, B:17:0x0069), top: B:45:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[Catch: all -> 0x0132, TryCatch #0 {all -> 0x0132, blocks: (B:26:0x0091, B:27:0x0094, B:29:0x009a, B:30:0x00a6, B:31:0x00bd, B:33:0x00c3, B:35:0x00d4, B:36:0x00d8, B:37:0x00e3, B:39:0x00e9, B:40:0x0125, B:21:0x007a, B:22:0x007d, B:17:0x0069), top: B:45:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9 A[Catch: all -> 0x0132, LOOP:1: B:37:0x00e3->B:39:0x00e9, LOOP_END, TryCatch #0 {all -> 0x0132, blocks: (B:26:0x0091, B:27:0x0094, B:29:0x009a, B:30:0x00a6, B:31:0x00bd, B:33:0x00c3, B:35:0x00d4, B:36:0x00d8, B:37:0x00e3, B:39:0x00e9, B:40:0x0125, B:21:0x007a, B:22:0x007d, B:17:0x0069), top: B:45:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o2(java.lang.String r12, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r13) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2244708qr.o2(java.lang.String, X.05Vn):java.lang.Object");
    }

    private final void W1(LinkedHashMap<Pair<String, String>, Boolean> linkedHashMap, Pair<String, String> pair, boolean z) {
        linkedHashMap.remove(pair);
        linkedHashMap.put(pair, Boolean.valueOf(z));
    }

    private final void m3(String str, List<String> list, List<String> list2) {
        if (Intrinsics.LJFF(list, list2)) {
            return;
        }
        InterfaceC2189708hz interfaceC2189708hzG2 = G2();
        interfaceC2189708hzG2.LIZ(str, list);
        interfaceC2189708hzG2.LIZIZ(str, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // X.InterfaceC361290EEl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object SS0(java.lang.String r7, boolean r8, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C2245108qv
            if (r0 == 0) goto L4f
            r5 = r9
            X.08qv r5 = (X.C2245108qv) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L5d
            if (r0 != r2) goto L55
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
        L2b:
            return r0
        L2c:
            X.C155000ia.LIZIZ(r4)
            java.util.HashSet<java.lang.String> r0 = r6.LLJI
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L46
            if (r8 != 0) goto L46
            boolean r0 = r6.LLJIJIL
            if (r0 == 0) goto L46
            r5.LLILLL = r1
            java.lang.Object r0 = r6.H2(r7, r5)
            if (r0 != r3) goto L66
            return r3
        L46:
            r5.LLILLL = r2
            java.lang.Object r0 = r6.o2(r7, r5)
            if (r0 != r3) goto L2b
            return r3
        L4f:
            X.08qv r5 = new X.08qv
            r5.<init>(r6, r9)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5d:
            X.C155000ia.LIZIZ(r4)
            X.00o6 r4 = (X.C189200o6) r4
            java.lang.Object r0 = r4.m10unboximpl()
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2244708qr.SS0(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    public final Object Z1(String str, final List<String> list, InterfaceC1364105Vn<? super List<? extends Effect>> interfaceC1364105Vn) {
        Object c098200Yq;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (list.isEmpty()) {
            C13BV c13bv = C13BV.INSTANCE;
            C189200o6.m2constructorimpl(c13bv);
            c23260099m.resumeWith(c13bv);
        } else {
            try {
                this.LLILZIL.LJFF(list, false, null, new IFetchEffectListListener() { // from class: X.08nk
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        Exception runtimeException;
                        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
                            runtimeException = new RuntimeException("unknown error");
                        }
                        C563650M8t c563650M8t = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetch favorites by id failed, reason: ");
                        sbLIZ.append(runtimeException.getMessage());
                        sbLIZ.append(", ids: ");
                        sbLIZ.append(list);
                        C201955140j.LJIIIIZZ(c563650M8t, "Favorite", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC1364105Vn<List<? extends Effect>> interfaceC1364105Vn2 = c23260099m;
                        C098200Yq c098200Yq2 = new C098200Yq(runtimeException);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        interfaceC1364105Vn2.resumeWith(c098200Yq2);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list2) {
                        if (list2 == null) {
                            list2 = C13BV.INSTANCE;
                        }
                        InterfaceC1364105Vn<List<? extends Effect>> interfaceC1364105Vn2 = c23260099m;
                        C189200o6.m2constructorimpl(list2);
                        interfaceC1364105Vn2.resumeWith(list2);
                    }
                });
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C098200Yq c098200Yq2 = new C098200Yq(thM5exceptionOrNullimpl);
                C189200o6.m2constructorimpl(c098200Yq2);
                c23260099m.resumeWith(c098200Yq2);
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object c3(String str, List<String> list, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2189608hy(z, this, str, list, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final Object i3(final String str, final List<String> list, boolean z, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        Object c098200Yq;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        try {
            this.LLILZIL.qg(new IModFavoriteList() { // from class: X.08nl
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
                public final void onFail(ExceptionResult exceptionResult) {
                    Exception runtimeException;
                    if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
                        runtimeException = new RuntimeException("unknown error");
                    }
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("modify panel favorites failed, panel: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", reason: ");
                    sbLIZ.append(runtimeException.getMessage());
                    sbLIZ.append(", ids: ");
                    sbLIZ.append(list);
                    C201955140j.LJIIIIZZ(c563650M8t, "Favorite", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<List<String>> interfaceC1364105Vn2 = c23260099m;
                    C098200Yq c098200Yq2 = new C098200Yq(runtimeException);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    interfaceC1364105Vn2.resumeWith(c098200Yq2);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<String> list2) {
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    InterfaceC1364105Vn<List<String>> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(list2);
                    interfaceC1364105Vn2.resumeWith(list2);
                }
            }, str, list, z);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C098200Yq c098200Yq2 = new C098200Yq(thM5exceptionOrNullimpl);
            C189200o6.m2constructorimpl(c098200Yq2);
            c23260099m.resumeWith(c098200Yq2);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // X.InterfaceC361290EEl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x20(java.lang.String r14, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r15, java.lang.Boolean r16, java.util.Map<java.lang.String, com.ss.android.ugc.aweme.effect.EffectSearchModel> r17) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2244708qr.x20(java.lang.String, java.util.List, java.lang.Boolean, java.util.Map):boolean");
    }
}
