package X;

import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005320cGg extends AbstractC991850bux {
    public final int LIZ;
    public final Map<String, Object> LIZIZ;
    public final CRouterCoreModel LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final AiAgentConfig LJI;
    public final Map<String, Object> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005320cGg)) {
            return false;
        }
        C1005320cGg c1005320cGg = (C1005320cGg) obj;
        return this.LIZ == c1005320cGg.LIZ && Intrinsics.LJFF(this.LIZIZ, c1005320cGg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Tap(touchNumber=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tapParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1005320cGg(int i, Map<String, ? extends Object> map) {
        CRouterCoreModel cRouterCoreModel;
        int iIntValue;
        String str;
        AiAgentConfig aiAgentConfig;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        Boolean bool2;
        Map<String, Object> map2;
        String str5;
        Integer num;
        this.LIZ = i;
        this.LIZIZ = map;
        Object obj = map.get(EnumC1005330cGh.CROUTER_JUMP_MODEL.getRName());
        if (obj instanceof CRouterCoreModel) {
            cRouterCoreModel = (CRouterCoreModel) obj;
        } else {
            cRouterCoreModel = null;
        }
        this.LIZJ = cRouterCoreModel;
        Object obj2 = map.get(EnumC1005330cGh.ENTER_FROM.getRName());
        if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        this.LIZLLL = iIntValue;
        Object obj3 = map.get(EnumC1005330cGh.REFER.getRName());
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        String str6 = "";
        this.LJ = str == null ? "" : str;
        Object obj4 = map.get(EnumC1005330cGh.TAG.getRName());
        this.LJFF = (!(obj4 instanceof String) || (str5 = (String) obj4) == null) ? "" : str5;
        Object obj5 = map.get(EnumC1005330cGh.AI_AGENT_CONFIG.getRName());
        if (obj5 instanceof AiAgentConfig) {
            aiAgentConfig = (AiAgentConfig) obj5;
        } else {
            aiAgentConfig = null;
        }
        this.LJI = aiAgentConfig;
        Object obj6 = map.get(EnumC1005330cGh.AD_EXTRA_DATA.getRName());
        this.LJII = (!(obj6 instanceof Map) || (map2 = (Map) obj6) == null) ? C2097608Jq.LJ() : map2;
        Object obj7 = map.get(EnumC1005330cGh.REPORT_CLICK.getRName());
        if ((obj7 instanceof Boolean) && (bool2 = (Boolean) obj7) != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LJIIIIZZ = zBooleanValue;
        Object obj8 = map.get(EnumC1005330cGh.C_ROUTER_ENABLE.getRName());
        if ((obj8 instanceof Boolean) && (bool = (Boolean) obj8) != null) {
            zBooleanValue2 = bool.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        this.LJIIIZ = zBooleanValue2;
        Object obj9 = map.get(EnumC1005330cGh.COMPONENT_TYPE.getRName());
        this.LJIIJ = (!(obj9 instanceof String) || (str4 = (String) obj9) == null) ? "" : str4;
        Object obj10 = map.get(EnumC1005330cGh.FIXED_TAG.getRName());
        this.LJIIJJI = (!(obj10 instanceof String) || (str3 = (String) obj10) == null) ? "" : str3;
        Object obj11 = map.get(EnumC1005330cGh.FIXED_REFER.getRName());
        if ((obj11 instanceof String) && (str2 = (String) obj11) != null) {
            str6 = str2;
        }
        this.LJIIL = str6;
    }
}
