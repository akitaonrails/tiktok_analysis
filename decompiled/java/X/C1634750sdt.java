package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelCollectData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0sdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel$requestData$6$1$1", f = "InfoStickerCollectListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1634750sdt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1634770sdv LL;
    public final /* synthetic */ InfoStickerCollectListViewModel LLILLJJLI;
    public final /* synthetic */ List<Effect> LLILLL;
    public final /* synthetic */ InfoStickerPanelCollectData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1634750sdt(C1634770sdv c1634770sdv, InfoStickerCollectListViewModel infoStickerCollectListViewModel, InfoStickerPanelCollectData infoStickerPanelCollectData, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1634770sdv;
        this.LLILLJJLI = infoStickerCollectListViewModel;
        this.LLILLL = list;
        this.LLILZ = infoStickerPanelCollectData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1634750sdt(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfoStickerCollectListViewModel@520b.requestData$6$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLJI)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InfoStickerCollectListViewModel@520b.requestData$6$1$1");
            return unit;
        }
        InfoStickerCollectListViewModel infoStickerCollectListViewModel = this.LLILLJJLI;
        infoStickerCollectListViewModel.LLJILLL = false;
        infoStickerCollectListViewModel.LLJILJILJ.clear();
        this.LLILLJJLI.LLJILJILJ.addAll(this.LLILLL);
        InfoStickerCollectListViewModel infoStickerCollectListViewModel2 = this.LLILLJJLI;
        C1634770sdv c1634770sdv = this.LL;
        List<Effect> list = this.LLILLL;
        InfoStickerPanelCollectData infoStickerPanelCollectData = this.LLILZ;
        infoStickerCollectListViewModel2.LLJI = new C1634770sdv(c1634770sdv, list, infoStickerPanelCollectData.nextCursor, infoStickerPanelCollectData.imStickerNextCursor, infoStickerPanelCollectData.hasMore);
        infoStickerCollectListViewModel2.xQ2(1, false, infoStickerCollectListViewModel2.vQ2());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerCollectListViewModel@520b.requestData$6$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
