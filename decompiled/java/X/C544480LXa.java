package X;

import Y.AgS100S1100000_8;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$observeGenerationState$1", f = "AIGCOfflineProcessingViewModel.kt", l = {616, 618}, m = "invokeSuspend")
public final class C544480LXa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544480LXa(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, String str, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C544480LXa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
        this.LLILLL = str;
        this.LLILZ = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544480LXa(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.observeGenerationState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.observeGenerationState$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C545090LZj c545090LZj = this.LLILLJJLI.LLJILJIL;
            String str = this.LLILLL;
            LifecycleOwner lifecycleOwner = this.LLILZ;
            this.LL = 1;
            obj = c545090LZj.LJIIIIZZ(lifecycleOwner, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.observeGenerationState$1");
                return objLJFF;
            }
        }
        C05RH c05rh = new C05RH((InterfaceC346201Wa) obj);
        AgS100S1100000_8 agS100S1100000_8 = new AgS100S1100000_8(this.LLILLJJLI, this.LLILLL, 3);
        this.LL = 2;
        if (c05rh.collect(agS100S1100000_8, this) == objLJFF) {
            C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.observeGenerationState$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.observeGenerationState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
