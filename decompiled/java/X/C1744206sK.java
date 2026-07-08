package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.landing.LandingMessageRequestBody;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.preload.IMBusinessChatLandingMsgPreLoadHelper$preloadResource$1", f = "IMBusinessChatLandingMsgPreLoadHelper.kt", l = {179, 105}, m = "invokeSuspend")
public final class C1744206sK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public C1744706sP LLILLL;
    public int LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ C1744706sP LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744206sK(C259800zU<String> c259800zU, C1744706sP c1744706sP, InterfaceC1364105Vn<? super C1744206sK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c259800zU;
        this.LLILZLL = c1744706sP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744206sK(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC383701eN interfaceC383701eN;
        C259800zU<String> c259800zU;
        C1744706sP c1744706sP;
        boolean z;
        C1C7U.LIZ("IMBusinessChatLandingMsgPreLoadHelper@e73c.preloadResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z2 = true;
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c1744706sP = (C1744706sP) this.LLILLJJLI;
                        interfaceC383701eN = this.LL;
                        try {
                            C155000ia.LIZIZ(obj);
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1744306sL(c1744706sP.LIZ, C2286608xc.LJ(c1744706sP.LIZIZ), null), 3);
                            interfaceC383701eN.LIZIZ(null);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("IMBusinessChatLandingMsgPreLoadHelper@e73c.preloadResource$1");
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        interfaceC383701eN.LIZIZ(null);
                                        throw th;
                                    } catch (Exception e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                        C1744106sJ c1744106sJ = C1744106sJ.LIZ;
                                        String str = this.LLILZIL.element;
                                        c1744106sJ.getClass();
                                        ((ConcurrentHashMap) C1744106sJ.LIZJ.getValue()).remove(str);
                                        Unit unit2 = Unit.LIZ;
                                        C1C7U.LIZIZ("IMBusinessChatLandingMsgPreLoadHelper@e73c.preloadResource$1");
                                        return unit2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c1744706sP = this.LLILLL;
                    c259800zU = (C259800zU) this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    C155000ia.LIZIZ(obj);
                }
            } else {
                C155000ia.LIZIZ(obj);
                interfaceC383701eN = C1744106sJ.LIZLLL;
                c259800zU = this.LLILZIL;
                c1744706sP = this.LLILZLL;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = c259800zU;
                this.LLILLL = c1744706sP;
                this.LLILZ = 1;
                if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                    C1C7U.LIZIZ("IMBusinessChatLandingMsgPreLoadHelper@e73c.preloadResource$1");
                    return objLJFF;
                }
            }
            C1744106sJ c1744106sJ2 = C1744106sJ.LIZ;
            String str2 = c1744706sP.LIZJ;
            c1744106sJ2.getClass();
            c259800zU.element = C0YNP.LJ(str2);
            LandingMessageRequestBody landingMessageRequestBodyLIZ = C1744106sJ.LIZ(c1744706sP);
            String str3 = c259800zU.element;
            boolean z3 = false;
            if (str3.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (C1744106sJ.LIZIZ(str3, landingMessageRequestBodyLIZ, null, true) != null) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (!z3) {
                Unit unit3 = Unit.LIZ;
                interfaceC383701eN.LIZIZ(null);
                C1C7U.LIZIZ("IMBusinessChatLandingMsgPreLoadHelper@e73c.preloadResource$1");
                return unit3;
            }
            C1744506sN c1744506sN = new C1744506sN();
            ((ConcurrentHashMap) C1744106sJ.LIZJ.getValue()).put(c259800zU.element, c1744506sN);
            EnumC1001040c9m enumC1001040c9m = c1744706sP.LIZ;
            this.LL = interfaceC383701eN;
            this.LLILLJJLI = c1744706sP;
            this.LLILLL = null;
            this.LLILZ = 2;
            if (c1744506sN.LIZ(landingMessageRequestBodyLIZ, enumC1001040c9m, this) == objLJFF) {
                C1C7U.LIZIZ("IMBusinessChatLandingMsgPreLoadHelper@e73c.preloadResource$1");
                return objLJFF;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1744306sL(c1744706sP.LIZ, C2286608xc.LJ(c1744706sP.LIZIZ), null), 3);
            interfaceC383701eN.LIZIZ(null);
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("IMBusinessChatLandingMsgPreLoadHelper@e73c.preloadResource$1");
            return unit22;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC383701eN.LIZIZ(null);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
