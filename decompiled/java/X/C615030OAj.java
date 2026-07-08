package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S0310000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM$translateAddYoursTopic$1", f = "AddYoursCollectionListVM.kt", l = {98}, m = "invokeSuspend")
public final class C615030OAj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C615070OAn LLILLJJLI;
    public final /* synthetic */ AddYoursCollectionListVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615030OAj(C615070OAn c615070OAn, AddYoursCollectionListVM addYoursCollectionListVM, InterfaceC1364105Vn<? super C615030OAj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c615070OAn;
        this.LLILLL = addYoursCollectionListVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C615030OAj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objLIZ = obj;
        C1C7U.LIZ("AddYoursCollectionListVM@bf39.translateAddYoursTopic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                C615180OAy c615180OAy = C615180OAy.LIZ;
                C615070OAn c615070OAn = this.LLILLJJLI;
                long j = c615070OAn.LL;
                String str = c615070OAn.LLILLL;
                this.LL = 1;
                c615180OAy.getClass();
                objLIZ = C615180OAy.LIZ(j, str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("AddYoursCollectionListVM@bf39.translateAddYoursTopic$1");
                    return objLJFF;
                }
            }
            C615190OAz c615190OAz = (C615190OAz) objLIZ;
            AddYoursCollectionListVM addYoursCollectionListVM = this.LLILLL;
            C615070OAn c615070OAn2 = this.LLILLJJLI;
            addYoursCollectionListVM.getClass();
            addYoursCollectionListVM.withState(new AwS31S0310000_9(addYoursCollectionListVM, c615070OAn2, true, c615190OAz, 1));
            C189200o6.m2constructorimpl(c615190OAz);
            obj2 = c615190OAz;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C098200Yq c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        this.LLILLL.setState(new AwS588S0100000_9(obj2, 490));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursCollectionListVM@bf39.translateAddYoursTopic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
