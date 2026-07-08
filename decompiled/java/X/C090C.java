package X;

import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel$dealTrendingDataChanged$1$1", f = "SearchStickerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C090C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchStickerViewModel LL;
    public final /* synthetic */ List<Effect> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C090C(SearchStickerViewModel searchStickerViewModel, List<? extends Effect> list, InterfaceC1364105Vn<? super C090C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchStickerViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C090C(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchStickerViewModel@2710.dealTrendingDataChanged$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJJJLIIL.setValue(new C090E(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchStickerViewModel@2710.dealTrendingDataChanged$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
