package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.awemepushlib.interaction.IntelligencePushHelper$runIntelligencePushTaskAsync$2", f = "IntelligencePushHelper.kt", l = {569}, m = "invokeSuspend")
public final class C609520NvS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C609530NvT>, Object> {
    public int LL;
    public final /* synthetic */ C814730Vxf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609520NvS(C814730Vxf c814730Vxf, InterfaceC1364105Vn<? super C609520NvS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c814730Vxf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609520NvS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IntelligencePushHelper@722a.runIntelligencePushTaskAsync$2");
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
            C814730Vxf c814730Vxf = this.LLILLJJLI;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            try {
                C609620Nvc c609620Nvc = C609620Nvc.LIZ;
                AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(c2252611DEt, 418);
                c609620Nvc.getClass();
                C609620Nvc.LJ(awS588S0100000_9, c814730Vxf);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C609530NvT c609530NvT = new C609530NvT(new PTYError(e.getMessage(), -1, -1, e.toString(), null), 13);
                C189200o6.m2constructorimpl(c609530NvT);
                c2252611DEt.resumeWith(c609530NvT);
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IntelligencePushHelper@722a.runIntelligencePushTaskAsync$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IntelligencePushHelper@722a.runIntelligencePushTaskAsync$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C609530NvT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
