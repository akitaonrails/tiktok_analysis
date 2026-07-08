package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.collect.InfoStickerCollectListViewModel$requestData$6$2$1", f = "InfoStickerCollectListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1634710sdp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InfoStickerCollectListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1634710sdp(InfoStickerCollectListViewModel infoStickerCollectListViewModel, InterfaceC1364105Vn<? super C1634710sdp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = infoStickerCollectListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1634710sdp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfoStickerCollectListViewModel@520b.requestData$6$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InfoStickerCollectListViewModel infoStickerCollectListViewModel = this.LL;
        boolean z = false;
        if (((List) ((Pair) ListProtector.get(infoStickerCollectListViewModel.LLJJ, 0)).getSecond()).isEmpty() && ((List) ((Pair) ListProtector.get(infoStickerCollectListViewModel.LLJJ, 1)).getSecond()).isEmpty()) {
            z = true;
        }
        infoStickerCollectListViewModel.LLJILLL = true;
        if (z) {
            infoStickerCollectListViewModel.LLILZLL.setValue(EnumC1641470soj.ERROR);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerCollectListViewModel@520b.requestData$6$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
