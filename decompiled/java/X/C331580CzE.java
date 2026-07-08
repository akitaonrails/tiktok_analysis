package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchPDPData$2$1$productResult$1", f = "PDPDataRepository.kt", l = {177}, m = "invokeSuspend")
public final class C331580CzE extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public final /* synthetic */ InterfaceC331650CzL LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331580CzE(C331730CzT c331730CzT, InterfaceC331650CzL interfaceC331650CzL, String str, String str2, int i, InterfaceC1364105Vn<? super C331580CzE> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
        this.LLILLL = interfaceC331650CzL;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331580CzE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ;
        C1C7U.LIZ("PDPDataRepository@79c7.fetchPDPData$2$1$productResult$1");
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
            C331730CzT c331730CzT = this.LLILLJJLI;
            InterfaceC331650CzL interfaceC331650CzL = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            int i2 = this.LLILZLL;
            c331730CzT.getClass();
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_UID, str), new Pair("shop_domain", str2), new Pair("protocol_type", String.valueOf(i2)));
            C331570CzD c331570CzD = new C331570CzD(this.LLILZLL, this.LLILZIL, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            objLJIIIIZZ = c331730CzT.LJIIIIZZ(interfaceC331650CzL, "/api/v1/ucp/product", mapLJIIJ, c331570CzD, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchPDPData$2$1$productResult$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIIZZ);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchPDPData$2$1$productResult$1");
        return c189200o6M1boximpl;
    }
}
