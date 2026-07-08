package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSeaPdpPreloadCardModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpPreloadSceneModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.utils.SeaPdpDynamicContainerPreloadUtil$pdpPreloadDynamicContainer$1$1", f = "SeaPdpDynamicContainerPreloadUtil.kt", l = {51}, m = "invokeSuspend")
public final class C1757540vpw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSeaPdpPreloadSceneModel LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ EnumC1757510vpt LLILZ;
    public final /* synthetic */ AbstractC21321718cJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757540vpw(EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel, InterfaceC665370Q7z interfaceC665370Q7z, EnumC1757510vpt enumC1757510vpt, AbstractC21321718cJ abstractC21321718cJ, InterfaceC1364105Vn<? super C1757540vpw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSeaPdpPreloadSceneModel;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = enumC1757510vpt;
        this.LLILZIL = abstractC21321718cJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1757540vpw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpDynamicContainerPreloadUtil@4eb4.pdpPreloadDynamicContainer$1$1");
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
            Long l = this.LLILLJJLI.delay;
            if (l != null) {
                long jLongValue = l.longValue();
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpDynamicContainerPreloadUtil@4eb4.pdpPreloadDynamicContainer$1$1");
                    return objLJFF;
                }
            }
        }
        C1758180vqy c1758180vqy = C1758180vqy.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
        List<ECSeaPdpPreloadCardModel> list = this.LLILLJJLI.tasks;
        AbstractC21321718cJ abstractC21321718cJ = this.LLILZIL;
        c1758180vqy.getClass();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ECSeaPdpPreloadCardModel eCSeaPdpPreloadCardModel : list) {
                C1758180vqy c1758180vqy2 = C1758180vqy.LIZ;
                String str = eCSeaPdpPreloadCardModel.type;
                c1758180vqy2.getClass();
                Pair pairLIZIZ = C1758180vqy.LIZIZ(interfaceC665370Q7z, str);
                if (pairLIZIZ != null) {
                    arrayList.add(new ECSeaPdpPreloadCardModel(eCSeaPdpPreloadCardModel.type, eCSeaPdpPreloadCardModel.action, eCSeaPdpPreloadCardModel.count, (String) pairLIZIZ.getFirst(), (String) pairLIZIZ.getSecond()));
                }
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1757530vpv(arrayList, abstractC21321718cJ, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpDynamicContainerPreloadUtil@4eb4.pdpPreloadDynamicContainer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
