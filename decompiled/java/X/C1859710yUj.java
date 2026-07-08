package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import com.ss.android.ugc.aweme.tako.preload.TakoCarryPreloadProviderImpl;
import java.util.Collection;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS18S1210000_18;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0yUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.preload.TakoCarryPreloadProviderImpl$preloadCarryFirstAnswer$3", f = "TakoCarryPreloadProviderImpl.kt", l = {117}, m = "invokeSuspend")
public final class C1859710yUj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1859730yUl LLILLL;
    public final /* synthetic */ TakoCarryPreloadProviderImpl LLILZ;
    public final /* synthetic */ Function0<TakoSearchCarryInItem> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<TakoSearchCarryInItem, TakoEventTracker> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Context LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1859710yUj(C1859730yUl c1859730yUl, TakoCarryPreloadProviderImpl takoCarryPreloadProviderImpl, Function0<TakoSearchCarryInItem> function0, String str, Function1<? super TakoSearchCarryInItem, TakoEventTracker> function1, String str2, String str3, String str4, Context context, InterfaceC1364105Vn<? super C1859710yUj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1859730yUl;
        this.LLILZ = takoCarryPreloadProviderImpl;
        this.LLILZIL = function0;
        this.LLILZLL = str;
        this.LLIZ = function1;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = str4;
        this.LLJIJIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1859710yUj c1859710yUj = new C1859710yUj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1859710yUj.LLILLJJLI = obj;
        return c1859710yUj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        C1860130yVP c1860130yVP;
        Object c098200Yq4;
        C1859750yUn c1859750yUn;
        Object c098200Yq5;
        T t;
        Object c098200Yq6;
        boolean z;
        T tLJIIIIZZ;
        boolean z2;
        TakoEventTracker c098200Yq7;
        C1C7U.LIZ("TakoCarryPreloadProviderImpl@fddf.preloadCarryFirstAnswer$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z3 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoCarryPreloadProviderImpl@fddf.preloadCarryFirstAnswer$3");
                return objLJFF;
            }
        }
        C1859730yUl c1859730yUl = this.LLILLL;
        C21419418s4 c21419418s4LIZIZ = null;
        if (c1859730yUl == null) {
            TakoCarryPreloadProviderImpl takoCarryPreloadProviderImpl = this.LLILZ;
            Function0<TakoSearchCarryInItem> function0 = this.LLILZIL;
            Function1<TakoSearchCarryInItem, TakoEventTracker> function1 = this.LLIZ;
            takoCarryPreloadProviderImpl.getClass();
            TakoSearchCarryInItem takoSearchCarryInItemLJI = TakoCarryPreloadProviderImpl.LJI(function0);
            if (takoSearchCarryInItemLJI == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoCarryPreloadProviderImpl@fddf.preloadCarryFirstAnswer$3");
                return unit;
            }
            try {
                c098200Yq7 = function1.invoke(takoSearchCarryInItemLJI);
                C189200o6.m2constructorimpl(c098200Yq7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq7 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq7);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq7)) {
                c098200Yq7 = null;
            }
            c1859730yUl = new C1859730yUl(takoSearchCarryInItemLJI, (TakoEventTracker) c098200Yq7);
        }
        TakoSearchCarryInItem takoSearchCarryInItem = c1859730yUl.LIZ;
        TakoEventTracker takoEventTracker = c1859730yUl.LIZIZ;
        System.currentTimeMillis();
        TakoCarryPreloadProviderImpl takoCarryPreloadProviderImpl2 = this.LLILZ;
        String str = this.LLILZLL;
        String str2 = this.LLIZLLLIL;
        String str3 = this.LLJ;
        String str4 = this.LLJI;
        Context context = this.LLJIJIL;
        try {
            takoCarryPreloadProviderImpl2.getClass();
            TakoMixFeed takoMixFeedLJFF = TakoCarryPreloadProviderImpl.LJFF(str, takoSearchCarryInItem, str2, takoEventTracker, str3, str4);
            if (((Boolean) C2273971DzX.LJIIJ.getValue()).booleanValue()) {
                String string = UUID.randomUUID().toString();
                takoMixFeedLJFF.LIZIZ = string;
                boolean zBooleanValue = ((Boolean) C2273971DzX.LJIIJJI.getValue()).booleanValue();
                int iIntValue = ((Number) C0AXC.LIZ.getValue()).intValue();
                int iIntValue2 = ((Number) C0AXE.LIZ.getValue()).intValue();
                try {
                    String str5 = takoMixFeedLJFF.text;
                    for (int i2 = 0; i2 < str5.length(); i2++) {
                        str5.charAt(i2);
                    }
                    C1859250yTz.LJIIL(str5, takoMixFeedLJFF.placeholderSources);
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                C259800zU c259800zU = new C259800zU();
                C259800zU c259800zU2 = new C259800zU();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ?? LJIIIIZZ = C1859250yTz.LJIIIIZZ(null, takoMixFeedLJFF.text, takoMixFeedLJFF.placeholderSources, false, string, false, null, null);
                    c259800zU.element = LJIIIIZZ;
                    if (string.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        C1859600yUY.LIZ.put(string, (String) LJIIIIZZ);
                    }
                    if (!zBooleanValue) {
                        tLJIIIIZZ = LJIIIIZZ;
                    } else {
                        tLJIIIIZZ = C1859250yTz.LJIIIIZZ(null, takoMixFeedLJFF.text, takoMixFeedLJFF.placeholderSources, false, string, false, C2286608xc.LJ(iIntValue), C2286608xc.LJ(iIntValue2));
                    }
                    c259800zU2.element = tLJIIIIZZ;
                    if (zBooleanValue) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    new C1859720yUk(string, jCurrentTimeMillis, takoMixFeedLJFF, LJIIIIZZ, c259800zU2, z2, iIntValue, iIntValue2);
                    c098200Yq3 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                try {
                    System.currentTimeMillis();
                    c1860130yVP = new C1860130yVP(context) { // from class: X.0yUn
                    };
                    try {
                        c1860130yVP = c1860130yVP;
                        try {
                            c21419418s4LIZIZ = C1859250yTz.LIZIZ(c1860130yVP, true, false, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(48))), null, takoMixFeedLJFF, null, null, AFwS216S0000000_27.get$arr$(207), AFwS216S0000000_27.get$arr$(208), true);
                            C1859570yUV.LIZ.put(string, c21419418s4LIZIZ);
                            c098200Yq4 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq4);
                            c1859750yUn = c1860130yVP;
                        } catch (Throwable th4) {
                            th = th4;
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq4 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq4);
                            c1859750yUn = c1860130yVP;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c1860130yVP = c1860130yVP;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c1860130yVP = null;
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq4);
                if (c259800zU2.element != 0 && c1859750yUn != 0 && c21419418s4LIZIZ != null) {
                    Collection collection = c21419418s4LIZIZ.LIZJ;
                    if (collection == null) {
                        collection = C13BV.INSTANCE;
                    }
                    C21419418s4 c21419418s4LIZ = C21419418s4.LIZ(c21419418s4LIZIZ, C13LP.LJLIL(C1859250yTz.LIZLLL(c1859750yUn, string), collection), 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -5, 16777215);
                    try {
                        System.currentTimeMillis();
                        InterfaceC342000Daw interfaceC342000DawLIZIZ = C1859430yUH.LIZIZ(c1859750yUn, c21419418s4LIZ, (String) c259800zU2.element);
                        if (interfaceC342000DawLIZIZ != null) {
                            C1859580yUW.LIZ.put(string, interfaceC342000DawLIZIZ);
                        }
                        c098200Yq5 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq5);
                    } catch (Throwable th7) {
                        TryCatchGuardChecker.doCheck(th7);
                        c098200Yq5 = new C098200Yq(th7);
                        C189200o6.m2constructorimpl(c098200Yq5);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq5);
                    if (zBooleanValue && (t = c259800zU.element) != 0 && !Intrinsics.LJFF(t, c259800zU2.element)) {
                        try {
                            System.currentTimeMillis();
                            InterfaceC342000Daw interfaceC342000DawLIZIZ2 = C1859430yUH.LIZIZ(c1859750yUn, c21419418s4LIZ, (String) c259800zU.element);
                            if (interfaceC342000DawLIZIZ2 != null) {
                                C1859590yUX.LIZ.put(string, interfaceC342000DawLIZIZ2);
                            }
                            c098200Yq6 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq6);
                        } catch (Throwable th8) {
                            TryCatchGuardChecker.doCheck(th8);
                            c098200Yq6 = new C098200Yq(th8);
                            C189200o6.m2constructorimpl(c098200Yq6);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq6);
                        C189200o6.m1boximpl(c098200Yq6);
                    } else {
                        new AwS18S1210000_18(zBooleanValue, (boolean) c259800zU, (C259800zU<String>) c259800zU2, (C259800zU<String>) string, (String) 0);
                    }
                }
            }
            if (str.length() != 0) {
                z3 = false;
            }
            if (!z3) {
                C1859740yUm.LIZ.put(str, takoMixFeedLJFF);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th9) {
            TryCatchGuardChecker.doCheck(th9);
            c098200Yq = new C098200Yq(th9);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoCarryPreloadProviderImpl@fddf.preloadCarryFirstAnswer$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
