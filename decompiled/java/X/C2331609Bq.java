package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.bridge.DefaultGenAIBridge$executeTaskIfNeeded$1", f = "DefaultGenAIBridge.kt", l = {586, 587}, m = "invokeSuspend")
public final class C2331609Bq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC2331909Bt LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331609Bq(EnumC2331909Bt enumC2331909Bt, String str, InterfaceC1364105Vn<? super C2331609Bq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC2331909Bt;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2331609Bq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C0LSZ> listLJIIL;
        C1C7U.LIZ("DefaultGenAIBridge@a8d8.executeTaskIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    listLJIIL = (List) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                listLJIIL = C1697810uHb.LJIIL(obj);
            }
        } else {
            C155000ia.LIZIZ(obj);
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.executeTaskIfNeeded$1");
                return unit;
            }
            int i2 = C2332009Bu.LIZ[this.LLILLJJLI.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    String str = this.LLILLL;
                    this.LL = 2;
                    obj = iCreationAsyncTaskManagerLIZ.LJJIJLIJ(str, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.executeTaskIfNeeded$1");
                        return objLJFF;
                    }
                    listLJIIL = (List) obj;
                } else {
                    throw new C1954807lC();
                }
            } else {
                String str2 = this.LLILLL;
                this.LL = 1;
                obj = iCreationAsyncTaskManagerLIZ.LJFF(str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.executeTaskIfNeeded$1");
                    return objLJFF;
                }
                listLJIIL = C1697810uHb.LJIIL(obj);
            }
        }
        for (C0LSZ c0lsz : listLJIIL) {
            if (!C381270ExB.LIZ(c0lsz.LJFF)) {
                C01GW c01gw = AnonymousClass0913.LIZ;
                AnonymousClass0913.LIZLLL.add(c0lsz.LIZ);
                AnonymousClass0913.LIZIZ();
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.executeTaskIfNeeded$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
