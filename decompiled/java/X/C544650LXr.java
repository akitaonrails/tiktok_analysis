package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$restartGeneration$1", f = "AIGCOfflineProcessingViewModel.kt", l = {590}, m = "invokeSuspend")
public final class C544650LXr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544650LXr(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C544650LXr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544650LXr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.restartGeneration$1");
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
            AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel = this.LLILLJJLI;
            int i2 = aIGCOfflineProcessingViewModel.LLJIJIL;
            if (i2 < 3) {
                aIGCOfflineProcessingViewModel.LLJIJIL = i2 + 1;
                C2252321DDq c2252321DDq = aIGCOfflineProcessingViewModel.LLJILLL;
                do {
                    value = c2252321DDq.getValue();
                } while (!c2252321DDq.compareAndSet(value, C0LY8.LIZ((C0LY8) value, null, null, null, null, null, null, 0L, null, null, null, null, null, null, 32703)));
                String str = ((C0LY8) aIGCOfflineProcessingViewModel.LLJILLL.getValue()).LIZ;
                if (str != null) {
                    aIGCOfflineProcessingViewModel.LLILZIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIGCOfflineProcessingViewModel), C0PEM.LIZJ, null, new C544500LXc(aIGCOfflineProcessingViewModel, str, null), 2);
                    aIGCOfflineProcessingViewModel.LLJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIGCOfflineProcessingViewModel), null, null, new C544580LXk(aIGCOfflineProcessingViewModel, null), 3);
                }
            } else {
                this.LL = 1;
                C544640LXq.LIZ.LIZLLL(((C0LY8) aIGCOfflineProcessingViewModel.LLJILLL.getValue()).LJIIJJI, EnumC544660LXs.EXCEED_LIMIT.getType());
                Object objLJIJI = aIGCOfflineProcessingViewModel.LLJILJILJ.LJIJI(C544730LXz.LIZ, this);
                if (objLJIJI != C099R.LJFF()) {
                    objLJIJI = Unit.LIZ;
                }
                if (objLJIJI == objLJFF) {
                    C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.restartGeneration$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.restartGeneration$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
