package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel$permissionGranted$1", f = "TTEPVideoSaveViewModel.kt", l = {29}, m = "invokeSuspend")
public final class C1409130mlz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C560530Lyd LL;
    public C560530Lyd LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ TTEPVideoSaveViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409130mlz(TTEPVideoSaveViewModel tTEPVideoSaveViewModel, InterfaceC1364105Vn<? super C1409130mlz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = tTEPVideoSaveViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409130mlz(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0062: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777314), block:B:20:0x005d */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1409150mm1 abstractC1409150mm1;
        C560530Lyd<AbstractC1409150mm1> c560530Lyd;
        C560530Lyd<AbstractC1409150mm1> c560530Lyd2;
        C1C7U.LIZ("TTEPVideoSaveViewModel@68b1.permissionGranted$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c560530Lyd2 = this.LLILLJJLI;
                    C560530Lyd c560530Lyd3 = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                TTEPVideoSaveViewModel tTEPVideoSaveViewModel = this.LLILZ;
                C560530Lyd<AbstractC1409150mm1> c560530Lyd4 = tTEPVideoSaveViewModel.LLILLJJLI;
                PublishModel publishModel = tTEPVideoSaveViewModel.LL;
                this.LL = c560530Lyd4;
                this.LLILLJJLI = c560530Lyd4;
                this.LLILLL = 1;
                obj = TTEPVideoSaveViewModel.wQ2(publishModel, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TTEPVideoSaveViewModel@68b1.permissionGranted$1");
                    return objLJFF;
                }
                c560530Lyd2 = c560530Lyd4;
            }
            if (((Boolean) obj).booleanValue()) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("shoot_way", "scan");
                C20684815ws.LJIILLIIL("save_demo_success", c0lab.LIZ);
                abstractC1409150mm1 = C1409160mm2.LIZ;
            } else {
                abstractC1409150mm1 = C1409140mm0.LIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            abstractC1409150mm1 = C1409140mm0.LIZ;
            c560530Lyd2 = c560530Lyd;
        }
        c560530Lyd2.LJIIJ(abstractC1409150mm1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTEPVideoSaveViewModel@68b1.permissionGranted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
