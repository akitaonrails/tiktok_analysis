package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab.BottomProfileObserver$requirePermissionPopUp$1", f = "BottomProfileObserver.kt", l = {542}, m = "invokeSuspend")
public final class C1073480e2c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1255210ilj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073480e2c(C1255210ilj c1255210ilj, InterfaceC1364105Vn<? super C1073480e2c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1255210ilj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1073480e2c c1073480e2c = new C1073480e2c(this.LLILLL, interfaceC1364105Vn);
        c1073480e2c.LLILLJJLI = obj;
        return c1073480e2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZIZ;
        C1C7U.LIZ("BottomProfileObserver@b5db.requirePermissionPopUp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1264610j0t interfaceC1264610j0tLIZ = C1072350e0n.LIZ(this.LLILLL.LL, new AwS595S0100000_16((InterfaceC497601wk) this.LLILLJJLI, 321));
            if (interfaceC1264610j0tLIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                Object obj2 = new InterfaceC346701Wf() { // from class: X.0e2Q
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                        C1073120e22 c1073120e22 = (C1073120e22) obj3;
                        int i2 = C1073350e2P.LIZ[c1073120e22.LJI.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                C2277881EDy.LIZIZ.updateProfilePermission(false);
                            }
                        } else if (c1073120e22.LIZ) {
                            C2277881EDy.LIZIZ.updateProfilePermission(true);
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (c095dLIZIZ.collect(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("BottomProfileObserver@b5db.requirePermissionPopUp$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomProfileObserver@b5db.requirePermissionPopUp$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
