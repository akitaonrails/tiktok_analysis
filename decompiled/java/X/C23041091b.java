package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$refreshHorizontalEffectsWhenFilterChange$1", f = "DefaultStickerSource.kt", l = {350}, m = "invokeSuspend")
public final class C23041091b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ d0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23041091b(d0 d0Var, InterfaceC1364105Vn<? super C23041091b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = d0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23041091b(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<? extends Effect> listLJJII;
        List<? extends Effect> listLJJII2;
        C1C7U.LIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1");
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
            C1641640sp0<HorizontalEffectsModel> value = this.LLILLJJLI.LJIJJ.getValue().getValue();
            if (value == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1");
                return unit;
            }
            if (value.LIZIZ != EnumC1641550sor.SUCCESS) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1");
                return unit2;
            }
            HorizontalEffectsModel horizontalEffectsModel = value.LIZ;
            if (horizontalEffectsModel == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1");
                return unit3;
            }
            List<? extends Effect> listLJJII3 = d0.LJJII(this.LLILLJJLI, horizontalEffectsModel.trending_effects);
            List<? extends Effect> list = horizontalEffectsModel.favorite_effects;
            List<? extends Effect> listLJJII4 = null;
            if (list != null) {
                listLJJII = d0.LJJII(this.LLILLJJLI, list);
            } else {
                listLJJII = null;
            }
            List<? extends Effect> list2 = horizontalEffectsModel.recent_effects;
            if (list2 != null) {
                listLJJII2 = d0.LJJII(this.LLILLJJLI, list2);
            } else {
                listLJJII2 = null;
            }
            List<? extends Effect> list3 = horizontalEffectsModel.insert_effects;
            if (list3 != null) {
                listLJJII4 = d0.LJJII(this.LLILLJJLI, list3);
            }
            HorizontalEffectsModel horizontalEffectsModelCopy = horizontalEffectsModel.copy(listLJJII3, listLJJII, listLJJII2, listLJJII4, horizontalEffectsModel.left_trending_effects, horizontalEffectsModel.url_prefix, horizontalEffectsModel.from_cache, horizontalEffectsModel.logId);
            if (Intrinsics.LJFF(horizontalEffectsModelCopy, horizontalEffectsModel)) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1");
                return unit4;
            }
            C1632470saD c1632470saD = C1632470saD.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshHorizontalEffectsWhenFilterChange, dataStatus = ");
            sbLIZ.append(value.LIZIZ);
            C201955140j.LJIILL(c1632470saD, "StickerSource", C2188811AlT.LIZIZ(sbLIZ));
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C23040091a c23040091a = new C23040091a(value, horizontalEffectsModelCopy, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c23040091a) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1");
                return objLJFF;
            }
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
