package X;

import com.bytedance.pns.engine.builtin.StrategyProtocol;
import com.bytedance.pumbaa.aspect.apicalling.systemapi.SystemApiConfig;
import com.bytedance.pumbaa.aspect.apicalling.systemapi.SystemApiServiceImpl;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825390WZl implements StrategyProtocol {
    public static final C825390WZl LIZ = new C825390WZl();
    public static JSONArray LIZIZ;

    @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
    public final boolean LIZIZ() {
        return true;
    }

    @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
    public final C825550Wa1 config() {
        String str = C825410WZn.LIZIZ;
        String str2 = C825410WZn.LIZJ;
        String str3 = C825410WZn.LIZLLL;
        String str4 = C825410WZn.LJ;
        String str5 = C825410WZn.LJFF;
        String str6 = C825410WZn.LJI;
        return new C825550Wa1(C13LQ.LJLIIL(new C825470WZt[]{new C825470WZt(str, str, null), new C825470WZt("system_api_fuse_report", str2, C2097608Jq.LJIIIIZZ(new Pair(str3, "fuse_system_api"), new Pair(str4, LIZIZ), new Pair(str5, str6))), new C825470WZt("system_api_common_report", str2, C2097608Jq.LJIIIIZZ(new Pair(str3, "system_api"), new Pair(str4, LIZIZ), new Pair(str5, str6)))}), "system_api_local_strategy", "1");
    }

    public static C825530WZz LIZJ(InterfaceC825580Wa4 interfaceC825580Wa4) {
        Object objLIZ;
        C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query("is_personal_account");
        if (c0wr6Query != null) {
            objLIZ = c0wr6Query.LIZ();
        } else {
            objLIZ = null;
        }
        if (!(objLIZ instanceof Boolean)) {
            objLIZ = null;
        }
        if (Intrinsics.LJFF(objLIZ, Boolean.FALSE)) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(C825410WZn.LIZIZ, "system_api_fuse_report");
            C13BV c13bv = C13BV.INSTANCE;
            return new C825530WZz(listLJIIJJI, true, c13bv, c13bv);
        }
        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "system_api_local:contact_is_personal_or_null_return_null");
        return null;
    }

    @Override // com.bytedance.pns.engine.builtin.StrategyProtocol
    public final C825530WZz LIZ(InterfaceC825580Wa4 interfaceC825580Wa4) {
        boolean z;
        Object objLIZ;
        Integer num;
        Object objLIZ2;
        Integer num2;
        Object objLIZ3;
        Object[] objArr;
        C825530WZz c825530WZzLIZJ;
        C825530WZz c825530WZzLIZJ2;
        SystemApiConfig systemApiConfig = SystemApiServiceImpl.LIZ;
        if (systemApiConfig != null && systemApiConfig.enableLocalInterceptStrategy) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0WR6 c0wr6Query = interfaceC825580Wa4.contextInfo().query("api_id");
            if (c0wr6Query != null) {
                objLIZ2 = c0wr6Query.LIZ();
            } else {
                objLIZ2 = null;
            }
            if (objLIZ2 instanceof Integer) {
                num2 = (Integer) objLIZ2;
            } else {
                num2 = null;
            }
            if (num2 != null && num2.intValue() == 10107 && (c825530WZzLIZJ2 = LIZJ(interfaceC825580Wa4)) != null) {
                C0WRU.LIZ(interfaceC825580Wa4, "builtin", "system_api_local:contact_fuse_return_actions");
                return c825530WZzLIZJ2;
            }
            if (C13LP.LJJJJ(num2, C825410WZn.LIZ)) {
                C0WR6 c0wr6Query2 = interfaceC825580Wa4.contextInfo().query("permission");
                if (c0wr6Query2 != null) {
                    objLIZ3 = c0wr6Query2.LIZ();
                } else {
                    objLIZ3 = null;
                }
                if ((objLIZ3 instanceof String[]) && (objArr = (Object[]) objLIZ3) != null && C13LQ.LJJIJIIJI("android.permission.READ_CONTACTS", objArr) >= 0 && (c825530WZzLIZJ = LIZJ(interfaceC825580Wa4)) != null) {
                    C0WRU.LIZ(interfaceC825580Wa4, "builtin", "system_api_local:contact_fuse_return_actions");
                    return c825530WZzLIZJ;
                }
            }
        }
        if (systemApiConfig != null && systemApiConfig.enableLocalGuardStrategy) {
            C0WR6 c0wr6Query3 = interfaceC825580Wa4.contextInfo().query("origin_api_id");
            if (c0wr6Query3 != null) {
                objLIZ = c0wr6Query3.LIZ();
            } else {
                objLIZ = null;
            }
            if ((objLIZ instanceof Integer) && (num = (Integer) objLIZ) != null && systemApiConfig.LIZIZ(num.intValue()) && !systemApiConfig.LIZ(num.intValue())) {
                C0WRU.LIZ(interfaceC825580Wa4, "builtin", "system_api_local:guard_not_hit_sample_return_null");
                return null;
            }
            C0WRU.LIZ(interfaceC825580Wa4, "builtin", "system_api_local:guard_common_report_return_actions");
            List listSingletonList = Collections.singletonList("system_api_common_report");
            C13BV c13bv = C13BV.INSTANCE;
            return new C825530WZz(listSingletonList, true, c13bv, c13bv);
        }
        C0WRU.LIZ(interfaceC825580Wa4, "builtin", "system_api_local:no_match_return_null");
        return null;
    }
}
