package X;

import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S1110000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700300RdU extends C09AY implements Function2<String, C699980Rcy, Boolean> {
    public final /* synthetic */ C701360RfC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700300RdU(C701360RfC c701360RfC) {
        super(2);
        this.LL = c701360RfC;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, C699980Rcy c699980Rcy) {
        ConditionData conditionData;
        boolean z;
        RuleHitState ruleHitStateLIZ;
        Map<String, ConditionData> map;
        String str2 = str;
        C699980Rcy c699980Rcy2 = c699980Rcy;
        ClientStandardModel clientStandardModelKn = this.LL.LLILLJJLI.getContext().LJFF.kn(this.LL.LL);
        String str3 = null;
        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsConditionMap) != null) {
            conditionData = map.get(str2);
        } else {
            conditionData = null;
        }
        boolean z2 = true;
        if (conditionData != null && conditionData.canApplySlot) {
            z = true;
            C20653815rs c20653815rs = C20653815rs.LIZ;
            String strLJLI = this.LL.LLJJ.LJLI();
            String logId = this.LL.LLJJ.getLogId();
            c20653815rs.getClass();
            ruleHitStateLIZ = C20653815rs.LIZ(strLJLI, str2, logId);
        } else {
            z = false;
            ruleHitStateLIZ = null;
        }
        boolean zLIZ = C700340RdY.LIZ(ruleHitStateLIZ);
        if (!zLIZ) {
            C699180Rbg c699180Rbg = C699180Rbg.LIZ;
            AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this.LL, 1372);
            c699180Rbg.getClass();
            C699180Rbg.LIZ(awS555S0100000_11, str2, ruleHitStateLIZ);
        }
        if (c699980Rcy2 != null) {
            c699980Rcy2.LIZIZ = Boolean.valueOf(z);
        }
        if (!z) {
            if (c699980Rcy2 != null) {
                c699980Rcy2.LIZJ = "active check failed";
                c699980Rcy2.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("biz_active", Boolean.valueOf(z)), new Pair("can_apply_slot", Boolean.FALSE));
                c699980Rcy2.LJII = Boolean.valueOf(zLIZ);
            }
        } else if (c699980Rcy2 != null) {
            c699980Rcy2.LJII = Boolean.valueOf(zLIZ);
        }
        if (!zLIZ && c699980Rcy2 != null) {
            c699980Rcy2.LJIIIIZZ = "density check failed";
            if (ruleHitStateLIZ != null) {
                str3 = ruleHitStateLIZ.ruleStrategy;
            }
            c699980Rcy2.LJIIIZ = C2097908Jt.LIZJ(new Pair("outreach_strategy", str3));
        }
        this.LL.LLJJ.LJLI();
        new AwS18S1110000_11(str2, z, conditionData, 1);
        C0T6L.LIZLLL();
        this.LL.LLJJ.LJLI();
        new C0209004x(str2, z);
        C0T6L.LIZLLL();
        if (!z || !zLIZ) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
