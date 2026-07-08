package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$dealCategoryEffectsOperate$1$1$1$1", f = "DefaultStickerSource.kt", l = {456}, m = "invokeSuspend")
public final class C091C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CategoryEffectModel LLILLJJLI;
    public final /* synthetic */ C091D LLILLL;
    public final /* synthetic */ d0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091C(C091D c091d, d0 d0Var, CategoryEffectModel categoryEffectModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = categoryEffectModel;
        this.LLILLL = c091d;
        this.LLILZ = d0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091C(this.LLILLL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.dealCategoryEffectsOperate$1$1$1$1");
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
            ArrayList arrayList = new ArrayList(this.LLILLJJLI.getEffects());
            Iterator<C091E> it2 = this.LLILLL.LIZ().iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            Map<String, List<Effect>> map = this.LLILZ.LJIIL;
            String strLIZIZ = this.LLILLL.LIZIZ();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(((Effect) obj2).getEffectId())) {
                    arrayList2.add(obj2);
                }
            }
            map.put(strLIZIZ, arrayList2);
            CategoryEffectModel categoryEffectModel = this.LLILLJJLI;
            List<? extends Effect> arrayList3 = (List) ((LinkedHashMap) this.LLILZ.LJIIL).get(this.LLILLL.LIZIZ());
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>();
            }
            categoryEffectModel.setEffects(arrayList3);
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C091B c091b = new C091B(this.LLILLL, this.LLILZ, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c091b) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.dealCategoryEffectsOperate$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.dealCategoryEffectsOperate$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
