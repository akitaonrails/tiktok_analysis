package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postSearchUpdate$1", f = "DefaultStickerSource.kt", l = {651}, m = "invokeSuspend")
public final class C091V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchEffectResponseV2 LLILLJJLI;
    public final /* synthetic */ d0 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1641640sp0<SearchEffectResponseV2> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091V(SearchEffectResponseV2 searchEffectResponseV2, d0 d0Var, int i, C1641640sp0<SearchEffectResponseV2> c1641640sp0, InterfaceC1364105Vn<? super C091V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchEffectResponseV2;
        this.LLILLL = d0Var;
        this.LLILZ = i;
        this.LLILZIL = c1641640sp0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091V(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<Effect> arrayList;
        List<Effect> bindEffects;
        List<Effect> collectionList;
        C1C7U.LIZ("DefaultStickerSource@cf79.postSearchUpdate$1");
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
            SearchEffectModel data = this.LLILLJJLI.getData();
            if (data == null || (arrayList = data.getEffectList()) == null) {
                arrayList = new ArrayList<>();
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.LLILLL.LIZ.getValue().LIZ("", arrayList2);
            SearchEffectModel data2 = this.LLILLJJLI.getData();
            if (data2 != null) {
                data2.setEffectList(arrayList2);
            }
            SearchEffectModel data3 = this.LLILLJJLI.getData();
            if (data3 != null && (collectionList = data3.getCollectionList()) != null) {
                this.LLILLL.LJIJ(collectionList);
            }
            SearchEffectModel data4 = this.LLILLJJLI.getData();
            if (data4 != null && (bindEffects = data4.getBindEffects()) != null) {
                this.LLILLL.LJII(bindEffects);
            }
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C091U c091u = new C091U(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c091u) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.postSearchUpdate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postSearchUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
