package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel$refreshFromCache$1$1", f = "InfoStickerListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C330210Cx1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InfoStickerListViewModel LL;
    public final /* synthetic */ List<Effect> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C330210Cx1(InfoStickerListViewModel infoStickerListViewModel, List<? extends Effect> list, InterfaceC1364105Vn<? super C330210Cx1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = infoStickerListViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330210Cx1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1641470soj enumC1641470soj;
        C1C7U.LIZ("InfoStickerListViewModel@dce1.refreshFromCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.setValue((List<DATA>) this.LLILLJJLI);
        MutableLiveData<EnumC1641470soj> mutableLiveData = this.LL.LLILLJJLI;
        if (this.LLILLJJLI.isEmpty()) {
            enumC1641470soj = EnumC1641470soj.EMPTY;
        } else {
            enumC1641470soj = EnumC1641470soj.NONE;
        }
        mutableLiveData.setValue(enumC1641470soj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerListViewModel@dce1.refreshFromCache$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
