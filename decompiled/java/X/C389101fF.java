package X;

import android.content.Context;
import com.bytedance.android.live.effect.api.IEffectService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$checkBoardTypeConflict$1", f = "PCSBoardEffectManager.kt", l = {429, 438, 449, 453, 457}, m = "invokeSuspend")
public final class C389101fF extends C09AX implements Function2<InterfaceC346701Wf<? super Integer>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ EnumC389301fH LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389101fF(Context context, EnumC389301fH enumC389301fH, InterfaceC1364105Vn<? super C389101fF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = enumC389301fH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C389101fF c389101fF = new C389101fF(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c389101fF.LLILLJJLI = obj;
        return c389101fF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC346701Wf interfaceC346701Wf;
        InterfaceC390601fU effectBoardService;
        List<InterfaceC395901gL> listLJFF;
        Object objLJI = obj;
        C1C7U.LIZ("PCSBoardEffectManager@20d3.checkBoardTypeConflict$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
                C155000ia.LIZIZ(objLJI);
                if (objLJI instanceof C510401yo) {
                    Integer numLJ = C2286608xc.LJ(2);
                    this.LLILLJJLI = null;
                    this.LL = 3;
                    if (interfaceC346701Wf.emit(numLJ, this) == objLJFF) {
                        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardTypeConflict$1");
                        return objLJFF;
                    }
                } else if (objLJI instanceof C510201ym) {
                    Integer numLJ2 = C2286608xc.LJ(3);
                    this.LLILLJJLI = null;
                    this.LL = 4;
                    if (interfaceC346701Wf.emit(numLJ2, this) == objLJFF) {
                        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardTypeConflict$1");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
            if (iEffectService != null && (effectBoardService = iEffectService.getEffectBoardService("anchor", "")) != null && (listLJFF = effectBoardService.LJFF()) != null) {
                EnumC389301fH enumC389301fH = this.LLILZ;
                Iterator<InterfaceC395901gL> it2 = listLJFF.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC395901gL next = it2.next();
                    if (next.getConfig().LIZ != enumC389301fH) {
                        if (next != null && this.LLILLL != null) {
                            int i2 = C389201fG.LIZ[this.LLILZ.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    Context context = this.LLILLL;
                                    this.LLILLJJLI = interfaceC346701Wf;
                                    this.LL = 2;
                                    C1DFH c1dfh = C0PEM.LIZ;
                                    objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C389401fI(context, 2131855469, 2131855466, 2131855468, 2131855467, null));
                                    if (objLJI == objLJFF) {
                                        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardTypeConflict$1");
                                        return objLJFF;
                                    }
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                Context context2 = this.LLILLL;
                                this.LLILLJJLI = interfaceC346701Wf;
                                this.LL = 1;
                                C1DFH c1dfh2 = C0PEM.LIZ;
                                objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C389401fI(context2, 2131851362, 2131851359, 2131851364, 2131851363, null));
                                if (objLJI == objLJFF) {
                                    C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardTypeConflict$1");
                                    return objLJFF;
                                }
                            }
                        }
                    }
                }
            }
            Integer numLJ3 = C2286608xc.LJ(1);
            this.LL = 5;
            if (interfaceC346701Wf.emit(numLJ3, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardTypeConflict$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardTypeConflict$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Integer> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
