package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$startGenerationTask$1", f = "AIGCOfflineProcessingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C544600LXm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGCOfflineModel LLILLJJLI;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLL;
    public final /* synthetic */ CreativeInfo LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544600LXm(AIGCOfflineModel aIGCOfflineModel, AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, CreativeInfo creativeInfo, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C544600LXm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineModel;
        this.LLILLL = aIGCOfflineProcessingViewModel;
        this.LLILZ = creativeInfo;
        this.LLILZIL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C544600LXm c544600LXm = new C544600LXm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c544600LXm.LL = obj;
        return c544600LXm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI.subAiPropType, "i2i");
        this.LLILLL.LLJJIII = System.currentTimeMillis();
        AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel = this.LLILLL;
        aIGCOfflineProcessingViewModel.LLILZIL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C544610LXn(aIGCOfflineProcessingViewModel, this.LLILZ, this.LLILLJJLI, this.LLILZIL, zLJFF, null), 3);
        AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel2 = this.LLILLL;
        aIGCOfflineProcessingViewModel2.LLJI = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C544590LXl(aIGCOfflineProcessingViewModel2, this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
