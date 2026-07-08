package X;

import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ipb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataCacheManager$preloadMultiTopLiveData$1$feedJob$1", f = "MultiTopLiveDataCacheManager.kt", l = {160}, m = "invokeSuspend")
public final class C478490Ipb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C479150Iqf>>, Object> {
    public int LL;
    public final /* synthetic */ MultiTopLivePlayFeedListViewModel LLILLJJLI;
    public final /* synthetic */ EnumC479370Ir1 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C479440Ir8 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478490Ipb(MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel, EnumC479370Ir1 enumC479370Ir1, String str, C479440Ir8 c479440Ir8, InterfaceC1364105Vn<? super C478490Ipb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiTopLivePlayFeedListViewModel;
        this.LLILLL = enumC479370Ir1;
        this.LLILZ = str;
        this.LLILZIL = c479440Ir8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478490Ipb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C479450Ir9 c479450Ir9;
        C1C7U.LIZ("MultiTopLiveDataCacheManager@c5a0.preloadMultiTopLiveData$1$feedJob$1");
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
            MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel = this.LLILLJJLI;
            EnumC479370Ir1 enumC479370Ir1 = this.LLILLL;
            String str = this.LLILZ;
            C479440Ir8 c479440Ir8 = this.LLILZIL;
            if (c479440Ir8 != null) {
                c479450Ir9 = c479440Ir8.LIZIZ;
            } else {
                c479450Ir9 = null;
            }
            this.LL = 1;
            obj = multiTopLivePlayFeedListViewModel.zQ2(enumC479370Ir1, str, c479450Ir9, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiTopLiveDataCacheManager@c5a0.preloadMultiTopLiveData$1$feedJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MultiTopLiveDataCacheManager@c5a0.preloadMultiTopLiveData$1$feedJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C479150Iqf>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
