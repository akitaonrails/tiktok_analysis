package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.JsonRpcContentDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.JsonRpcRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.JsonRpcResponseDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.JsonRpcResultDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UcpMcpResponseDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network.PdpApiService;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0D13, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.ucp.UcpRealDataSource$fetchVariant$2", f = "UcpRealDataSource.kt", l = {183}, m = "invokeSuspend")
public final class C0D13 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D13(String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C0D13> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D13(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<JsonRpcContentDto> list;
        UniversalProductDto universalProductDtoLIZJ;
        boolean z;
        UcpMcpResponseDto ucpMcpResponseDto;
        C1C7U.LIZ("UcpRealDataSource@7c39.fetchVariant$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C0D15 c0d15 = C0D12.LIZ;
                String str = this.LLILLJJLI;
                c0d15.getClass();
                String strLIZIZ = C0D15.LIZIZ(str);
                if (a0.LJJJIL(this.LLILLL)) {
                    C098200Yq c098200Yq = new C098200Yq(new IllegalArgumentException("shopDomain is required for UCP V3"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                    C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchVariant$2");
                    return c189200o6M1boximpl;
                }
                Map mapLIZ = C0D15.LIZ(strLIZIZ, this.LLILZ, true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append("/api/ucp/mcp");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                JsonRpcRequestDto jsonRpcRequestDto = new JsonRpcRequestDto("2.0", UUID.randomUUID().toString(), "tools/call", C2097608Jq.LJIIIIZZ(new Pair("name", "get_product"), new Pair("arguments", C2097608Jq.LJIIIIZZ(new Pair("meta", C2097908Jt.LIZJ(new Pair("ucp-agent", C2097908Jt.LIZJ(new Pair("profile", C0D48.LIZIZ().agentProfileUrl))))), new Pair("catalog", mapLIZ)))));
                PdpApiService pdpApiService = (PdpApiService) C334130D7z.LJFF.getValue();
                this.LL = 1;
                obj = pdpApiService.getProductDetails(strLIZIZ2, jsonRpcRequestDto, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchVariant$2");
                    return objLJFF;
                }
            }
            JsonRpcResponseDto jsonRpcResponseDto = (JsonRpcResponseDto) obj;
            if (jsonRpcResponseDto.error != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RPC Error: ");
                sbLIZ2.append(jsonRpcResponseDto.error.code);
                sbLIZ2.append(" - ");
                sbLIZ2.append(jsonRpcResponseDto.error.message);
                C098200Yq c098200Yq2 = new C098200Yq(new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                C189200o6.m2constructorimpl(c098200Yq2);
                C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(c098200Yq2);
                C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchVariant$2");
                return c189200o6M1boximpl2;
            }
            JsonRpcResultDto jsonRpcResultDto = jsonRpcResponseDto.result;
            UcpMcpResponseDto ucpMcpResponseDto2 = null;
            if (jsonRpcResultDto == null || (ucpMcpResponseDto = jsonRpcResultDto.structuredContent) == null || (universalProductDtoLIZJ = ucpMcpResponseDto.product) == null) {
                C0D15 c0d152 = C0D12.LIZ;
                if (jsonRpcResultDto != null) {
                    list = jsonRpcResultDto.content;
                } else {
                    list = null;
                }
                c0d152.getClass();
                universalProductDtoLIZJ = C0D15.LIZJ(list);
            }
            if (universalProductDtoLIZJ == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Empty product in response, result is null? ");
                if (jsonRpcResponseDto.result == null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ3.append(z);
                sbLIZ3.append(", structuredContent is null? ");
                JsonRpcResultDto jsonRpcResultDto2 = jsonRpcResponseDto.result;
                if (jsonRpcResultDto2 != null) {
                    ucpMcpResponseDto2 = jsonRpcResultDto2.structuredContent;
                }
                if (ucpMcpResponseDto2 == null) {
                    z2 = true;
                }
                sbLIZ3.append(z2);
                C098200Yq c098200Yq3 = new C098200Yq(new Exception(C2188811AlT.LIZIZ(sbLIZ3)));
                C189200o6.m2constructorimpl(c098200Yq3);
                C189200o6 c189200o6M1boximpl3 = C189200o6.m1boximpl(c098200Yq3);
                C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchVariant$2");
                return c189200o6M1boximpl3;
            }
            C189200o6.m2constructorimpl(universalProductDtoLIZJ);
            C189200o6 c189200o6M1boximpl4 = C189200o6.m1boximpl(universalProductDtoLIZJ);
            C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchVariant$2");
            return c189200o6M1boximpl4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq4 = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq4);
            C189200o6 c189200o6M1boximpl5 = C189200o6.m1boximpl(c098200Yq4);
            C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchVariant$2");
            return c189200o6M1boximpl5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
