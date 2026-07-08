package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel$enableMusicSticker$1$2$2", f = "InfoStickerListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C330170Cwx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InfoStickerListViewModel LL;
    public final /* synthetic */ List<Effect> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330170Cwx(InfoStickerListViewModel infoStickerListViewModel, List<Effect> list, InterfaceC1364105Vn<? super C330170Cwx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = infoStickerListViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330170Cwx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfoStickerListViewModel@dce1.enableMusicSticker$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.setValue((List<DATA>) this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerListViewModel@dce1.enableMusicSticker$1$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
