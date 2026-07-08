package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerRecommendTabViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerRecommendTabViewModel$updateListData$1", f = "InfoStickerRecommendTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1634420sdM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InfoStickerRecommendTabViewModel LL;
    public final /* synthetic */ List<Effect> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1634420sdM(InfoStickerRecommendTabViewModel infoStickerRecommendTabViewModel, List<? extends Effect> list, InterfaceC1364105Vn<? super C1634420sdM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = infoStickerRecommendTabViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1634420sdM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1641470soj enumC1641470soj;
        C1C7U.LIZ("InfoStickerRecommendTabViewModel@8058.updateListData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InfoStickerRecommendTabViewModel infoStickerRecommendTabViewModel = this.LL;
        List<Effect> list = this.LLILLJJLI;
        infoStickerRecommendTabViewModel.getClass();
        Iterator<Effect> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Effect next = it2.next();
            if (C1462570oAB.LJ(next)) {
                infoStickerRecommendTabViewModel.LLJI.setValue(next);
                break;
            }
        }
        this.LL.LLILZIL.setValue(this.LLILLJJLI);
        MutableLiveData<EnumC1641470soj> mutableLiveData = this.LL.LLIZ;
        if (this.LLILLJJLI.isEmpty()) {
            enumC1641470soj = EnumC1641470soj.EMPTY;
        } else {
            enumC1641470soj = EnumC1641470soj.NONE;
        }
        mutableLiveData.setValue(enumC1641470soj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerRecommendTabViewModel@8058.updateListData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
