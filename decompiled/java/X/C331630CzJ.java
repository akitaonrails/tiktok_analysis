package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0CzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchGlobalProduct$2", f = "PDPDataRepository.kt", l = {239}, m = "invokeSuspend")
public final class C331630CzJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331630CzJ(C331730CzT c331730CzT, int i, String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C331630CzJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331630CzJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ;
        C1C7U.LIZ("PDPDataRepository@79c7.fetchGlobalProduct$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIIIZZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC331650CzL interfaceC331650CzLLJIIIZ = this.LLILLJJLI.LJIIIZ(this.LLILLL);
            if (!interfaceC331650CzLLJIIIZ.LJFF()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("global product fetch is not supported for protocolType=");
                sbLIZ.append(this.LLILLL);
                C098200Yq c098200Yq = new C098200Yq(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchGlobalProduct$2");
                return c189200o6M1boximpl;
            }
            C331730CzT c331730CzT = this.LLILLJJLI;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            int i2 = this.LLILLL;
            c331730CzT.getClass();
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_UID, str), new Pair("shop_domain", str2), new Pair("source", "catalog_global"), new Pair("protocol_type", String.valueOf(i2)));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!u.LJJIIJZLJL(key, "option.", false)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("option.");
                    sbLIZ2.append(key);
                    key = C2188811AlT.LIZIZ(sbLIZ2);
                }
                mapLJIIJ.put(key, value);
            }
            C331640CzK c331640CzK = new C331640CzK(interfaceC331650CzLLJIIIZ, this.LLILZIL, this.LLILZ, this.LLILZLL, null);
            this.LL = 1;
            objLJIIIIZZ = c331730CzT.LJIIIIZZ(interfaceC331650CzLLJIIIZ, "/api/v1/ucp/product", mapLJIIJ, c331640CzK, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchGlobalProduct$2");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(objLJIIIIZZ);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchGlobalProduct$2");
        return c189200o6M1boximpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
