package X;

import Y.AObserverS227S0100000_25;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.tools.infosticker.repository.internal.recent.InfoStickerRecentListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.recent.InfoStickerRecentListViewModel$requestData$6", f = "InfoStickerRecentListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1634500sdU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveData<List<C1635170seZ>> LL;
    public final /* synthetic */ InfoStickerRecentListViewModel LLILLJJLI;
    public final /* synthetic */ LiveData<List<C1635170seZ>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1634500sdU(LiveData<List<C1635170seZ>> liveData, InfoStickerRecentListViewModel infoStickerRecentListViewModel, LiveData<List<C1635170seZ>> liveData2, InterfaceC1364105Vn<? super C1634500sdU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveData;
        this.LLILLJJLI = infoStickerRecentListViewModel;
        this.LLILLL = liveData2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1634500sdU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfoStickerRecentListViewModel@cb72.requestData$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.removeObservers(this.LLILLJJLI.LLILZLL);
        this.LLILLL.removeObservers(this.LLILLJJLI.LLILZLL);
        LiveData<List<C1635170seZ>> liveData = this.LL;
        InfoStickerRecentListViewModel infoStickerRecentListViewModel = this.LLILLJJLI;
        liveData.observe(infoStickerRecentListViewModel.LLILZLL, new AObserverS227S0100000_25(infoStickerRecentListViewModel, 87));
        LiveData<List<C1635170seZ>> liveData2 = this.LLILLL;
        InfoStickerRecentListViewModel infoStickerRecentListViewModel2 = this.LLILLJJLI;
        liveData2.observe(infoStickerRecentListViewModel2.LLILZLL, new AObserverS227S0100000_25(infoStickerRecentListViewModel2, 88));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerRecentListViewModel@cb72.requestData$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
