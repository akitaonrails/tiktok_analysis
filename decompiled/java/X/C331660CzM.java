package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchDynamicVariant$2", f = "PDPDataRepository.kt", l = {253}, m = "invokeSuspend")
public final class C331660CzM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331660CzM(C331730CzT c331730CzT, int i, String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C331660CzM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331660CzM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI;
        Object obj2;
        String str;
        List<VariantOptionDto> list;
        C1C7U.LIZ("PDPDataRepository@79c7.fetchDynamicVariant$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJI = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC331650CzL interfaceC331650CzLLJIIIZ = this.LLILLJJLI.LJIIIZ(this.LLILLL);
            C331730CzT c331730CzT = this.LLILLJJLI;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            C331620CzI c331620CzI = new C331620CzI(c331730CzT, interfaceC331650CzLLJIIIZ, str3, str2, map, this.LLILLL, null);
            this.LL = 1;
            objLJI = c331730CzT.LJI(interfaceC331650CzLLJIIIZ, str2, str3, map, c331620CzI, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchDynamicVariant$2");
                return objLJFF;
            }
        }
        if (C189200o6.m8isSuccessimpl(objLJI)) {
            VariantDto variantDto = null;
            if (C189200o6.m7isFailureimpl(objLJI)) {
                objLJI = null;
            }
            UniversalProductDto universalProductDto = (UniversalProductDto) objLJI;
            if (universalProductDto != null) {
                List<VariantDto> list2 = universalProductDto.variants;
                if (list2 != null) {
                    Iterator<VariantDto> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        VariantDto next = it2.next();
                        List<VariantOptionDto> list3 = next.options;
                        if (list3 != null && (list = universalProductDto.selected) != null && list3.size() == list.size() && list3.containsAll(list)) {
                            variantDto = next;
                            break;
                        }
                    }
                    VariantDto variantDto2 = variantDto;
                    if (variantDto2 != null && (str = variantDto2.id) != null) {
                        C13LN.LL(8, str);
                    }
                }
                C189200o6.m2constructorimpl(universalProductDto);
                obj2 = universalProductDto;
            } else {
                C098200Yq c098200Yq = new C098200Yq(new Exception("Variant fetch succeeded with empty result"));
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = c098200Yq;
            }
        } else {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJI);
            if (thM5exceptionOrNullimpl == null) {
                thM5exceptionOrNullimpl = new Exception("Variant fetch failed");
            }
            C098200Yq c098200Yq2 = new C098200Yq(thM5exceptionOrNullimpl);
            C189200o6.m2constructorimpl(c098200Yq2);
            obj2 = c098200Yq2;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj2);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchDynamicVariant$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
