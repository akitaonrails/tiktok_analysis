package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelCollectData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0sds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel$requestMoreData$7$1$1", f = "InfoStickerCollectListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1634740sds extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1634770sdv LL;
    public final /* synthetic */ InfoStickerCollectListViewModel LLILLJJLI;
    public final /* synthetic */ InfoStickerPanelCollectData LLILLL;
    public final /* synthetic */ List<Effect> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1634740sds(C1634770sdv c1634770sdv, InfoStickerCollectListViewModel infoStickerCollectListViewModel, InfoStickerPanelCollectData infoStickerPanelCollectData, List<? extends Effect> list, InterfaceC1364105Vn<? super C1634740sds> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1634770sdv;
        this.LLILLJJLI = infoStickerCollectListViewModel;
        this.LLILLL = infoStickerPanelCollectData;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1634740sds(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1641470soj enumC1641470soj;
        C1C7U.LIZ("InfoStickerCollectListViewModel@520b.requestMoreData$7$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLJI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InfoStickerCollectListViewModel@520b.requestMoreData$7$1$1");
            return unit;
        }
        MutableLiveData<EnumC1641470soj> mutableLiveData = this.LLILLJJLI.LLIZ;
        if (!this.LLILLL.hasMore) {
            enumC1641470soj = EnumC1641470soj.EMPTY;
        } else {
            enumC1641470soj = EnumC1641470soj.NONE;
        }
        mutableLiveData.setValue(enumC1641470soj);
        this.LLILLJJLI.LLJILJILJ.addAll(this.LLILZ);
        InfoStickerCollectListViewModel infoStickerCollectListViewModel = this.LLILLJJLI;
        C1634770sdv c1634770sdv = this.LL;
        List<Effect> list = this.LLILZ;
        InfoStickerPanelCollectData infoStickerPanelCollectData = this.LLILLL;
        infoStickerCollectListViewModel.LLJI = new C1634770sdv(c1634770sdv, list, infoStickerPanelCollectData.nextCursor, infoStickerPanelCollectData.imStickerNextCursor, infoStickerPanelCollectData.hasMore);
        infoStickerCollectListViewModel.xQ2(1, true, infoStickerCollectListViewModel.vQ2());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerCollectListViewModel@520b.requestMoreData$7$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
