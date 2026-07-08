package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.affinity.api.SocialAffinityApi;
import com.ss.android.ugc.aweme.affinity.api.SocialAffinityResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08kG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.affinity.SocialAffinityManager$fetchAffinityData$2$2", f = "SocialAffinityManager.kt", l = {155}, m = "invokeSuspend")
public final class C2203808kG extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super SocialAffinityResponse>, Object> {
    public int LL;
    public final /* synthetic */ List<Map<String, Integer>> LLILLJJLI;
    public final /* synthetic */ n LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2203808kG(List<? extends Map<String, Integer>> list, n nVar, InterfaceC1364105Vn<? super C2203808kG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2203808kG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAffinityManager@25b4.fetchAffinityData$2$2");
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
            SocialAffinityApi socialAffinityApi = SocialAffinityApi.LIZIZ;
            C1227904rF c1227904rF = C1227904rF.LIZ;
            List<Map<String, Integer>> list = this.LLILLJJLI;
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(list);
            String strLJI2 = C1227904rF.LJI(this.LLILLL);
            if (strLJI2 == null) {
                strLJI2 = "";
            }
            this.LL = 1;
            obj = socialAffinityApi.fetchSocialAffinity(strLJI, strLJI2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAffinityManager@25b4.fetchAffinityData$2$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAffinityManager@25b4.fetchAffinityData$2$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super SocialAffinityResponse> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
