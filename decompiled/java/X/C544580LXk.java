package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$retryGeneration$2$2", f = "AIGCOfflineProcessingViewModel.kt", l = {606}, m = "invokeSuspend")
public final class C544580LXk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544580LXk(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C544580LXk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544580LXk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.retryGeneration$2$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel = this.LLILLJJLI;
            AIGCOfflineModel aIGCOfflineModel = ((C0LY8) aIGCOfflineProcessingViewModel.LLJILLL.getValue()).LJIIJJI;
            if (aIGCOfflineModel != null) {
                i = aIGCOfflineModel.estimatedWaitingTime;
            } else {
                i = 60;
            }
            this.LL = 1;
            if (aIGCOfflineProcessingViewModel.FQ2(i, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.retryGeneration$2$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.retryGeneration$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
