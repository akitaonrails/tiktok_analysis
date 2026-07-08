package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12EE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.creative.GuideCreateVideoWithEffectRepo$triggerUpdate$1", f = "GuideCreateVideoWithEffectRepo.kt", l = {95, 99, 103}, m = "invokeSuspend")
public final class C12EE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12EH LLILLJJLI;
    public final /* synthetic */ C12ED LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12EE(C12EH c12eh, C12ED c12ed, InterfaceC1364105Vn<? super C12EE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12eh;
        this.LLILLL = c12ed;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12EE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        Object objLIZIZ2;
        C1C7U.LIZ("GuideCreateVideoWithEffectRepo@1a2.triggerUpdate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = C12EG.LIZ[this.LLILLJJLI.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4 && i2 != 5) {
                            throw new C1954807lC();
                        }
                    } else {
                        C12ED c12ed = this.LLILLL;
                        this.LL = 3;
                        c12ed.LIZIZ.LIZJ();
                        Pair pair = new Pair(C2286608xc.LJ(c12ed.LIZIZ.LJFF()), C2286608xc.LJ(c12ed.LIZIZ.LIZIZ()));
                        int iIntValue = ((Number) pair.getFirst()).intValue();
                        int iIntValue2 = ((Number) pair.getSecond()).intValue();
                        if (iIntValue2 > 0 && iIntValue % iIntValue2 != 0) {
                            objLIZIZ2 = Unit.LIZ;
                        } else {
                            c12ed.LIZIZ.LJIIJ();
                            if (c12ed.LIZIZ.LIZ()) {
                                objLIZIZ2 = c12ed.LJ(C12EH.VISIBILITY_CHANGE, this);
                                if (objLIZIZ2 != C099R.LJFF()) {
                                    objLIZIZ2 = Unit.LIZ;
                                }
                            } else {
                                objLIZIZ2 = c12ed.LIZIZ(C12EH.VISIBILITY_CHANGE, this);
                                if (objLIZIZ2 != C099R.LJFF()) {
                                    objLIZIZ2 = Unit.LIZ;
                                }
                            }
                        }
                        if (objLIZIZ2 == objLJFF) {
                            C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.triggerUpdate$1");
                            return objLJFF;
                        }
                    }
                } else {
                    C12ED c12ed2 = this.LLILLL;
                    this.LL = 2;
                    c12ed2.LIZIZ.LIZLLL();
                    Pair pair2 = new Pair(C2286608xc.LJ(c12ed2.LIZIZ.LJI()), C2286608xc.LJ(c12ed2.LIZIZ.LJ()));
                    int iIntValue3 = ((Number) pair2.getFirst()).intValue();
                    int iIntValue4 = ((Number) pair2.getSecond()).intValue();
                    if (iIntValue4 > 0 && iIntValue3 % iIntValue4 != 0) {
                        objLIZIZ = Unit.LIZ;
                    } else {
                        c12ed2.LIZIZ.LJIIJ();
                        if (c12ed2.LIZIZ.LIZ()) {
                            objLIZIZ = c12ed2.LJ(C12EH.PULL_TO_REFRESH, this);
                            if (objLIZIZ != C099R.LJFF()) {
                                objLIZIZ = Unit.LIZ;
                            }
                        } else {
                            objLIZIZ = c12ed2.LIZIZ(C12EH.PULL_TO_REFRESH, this);
                            if (objLIZIZ != C099R.LJFF()) {
                                objLIZIZ = Unit.LIZ;
                            }
                        }
                    }
                    if (objLIZIZ == objLJFF) {
                        C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.triggerUpdate$1");
                        return objLJFF;
                    }
                }
            } else {
                C12ED c12ed3 = this.LLILLL;
                this.LL = 1;
                c12ed3.LIZIZ.LJII();
                Object objLIZIZ3 = c12ed3.LIZIZ(C12EH.PAGE_INIT, this);
                if (objLIZIZ3 != C099R.LJFF()) {
                    objLIZIZ3 = Unit.LIZ;
                }
                if (objLIZIZ3 == objLJFF) {
                    C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.triggerUpdate$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.triggerUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
