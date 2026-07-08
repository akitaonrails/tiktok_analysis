package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayEffectHelper$fetchSingleEffect$2", f = "PlayEffectHelper.kt", l = {76, 83}, m = "invokeSuspend")
public final class C760780Tsq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC760840Tsw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760780Tsq(String str, String str2, InterfaceC760840Tsw interfaceC760840Tsw, InterfaceC1364105Vn<? super C760780Tsq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = interfaceC760840Tsw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760780Tsq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJI;
        C1C7U.LIZ("PlayEffectHelper@5c03.fetchSingleEffect$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffect$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0U40 liveEffectDataProvider = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            String str = this.LLILLJJLI;
            List<String> listSingletonList = Collections.singletonList(this.LLILLL);
            this.LL = 1;
            HashMap map = new HashMap();
            liveEffectDataProvider.getClass();
            obj = C0U8T.LIZ.LJIILJJIL(str, listSingletonList, "all", map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffect$2");
                return objLJFF;
            }
        }
        List list = (List) obj;
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(list);
        if (liveEffect != null && (strLJI = liveEffect.LJI()) != null) {
            C762030Tur.LIZJ = strLJI;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C760790Tsr c760790Tsr = new C760790Tsr(this.LLILLJJLI, list, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c760790Tsr) == objLJFF) {
            C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffect$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffect$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
