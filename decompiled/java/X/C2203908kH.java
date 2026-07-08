package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.affinity.api.SocialAffinityResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.08kH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.affinity.SocialAffinityManager$fetchAffinityData$2", f = "SocialAffinityManager.kt", l = {149}, m = "invokeSuspend")
public final class C2203908kH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SocialAffinityResponse>, Object> {
    public int LL;
    public final /* synthetic */ C2204508kN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203908kH(C2204508kN c2204508kN, InterfaceC1364105Vn<? super C2203908kH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2204508kN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2203908kH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAffinityManager@25b4.fetchAffinityData$2");
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
            List listLIZ = C2206608ki.LIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                arrayList.add(C2097908Jt.LIZJ(new Pair("site", C2286608xc.LJ(((Number) it2.next()).intValue()))));
            }
            if (arrayList.isEmpty()) {
                SocialAffinityResponse socialAffinityResponse = new SocialAffinityResponse(null);
                C1C7U.LIZIZ("SocialAffinityManager@25b4.fetchAffinityData$2");
                return socialAffinityResponse;
            }
            n nVar = (n) C2204008kI.LIZIZ.getValue();
            C2204508kN c2204508kN = this.LLILLJJLI;
            AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(284);
            C2203808kG c2203808kG = new C2203808kG(arrayList, nVar, null);
            this.LL = 1;
            obj = c2204508kN.LIZ(4, aFwS231S0000000_3, c2203808kG, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAffinityManager@25b4.fetchAffinityData$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAffinityManager@25b4.fetchAffinityData$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SocialAffinityResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
