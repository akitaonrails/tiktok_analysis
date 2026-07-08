package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Lc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546560Lc6 extends C09AY implements InterfaceC1631630sYr<Boolean, Long, Integer, String, Unit> {
    public final /* synthetic */ AITheaterModel LL;
    public final /* synthetic */ CreativeModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546560Lc6(AITheaterModel aITheaterModel, CreativeModel creativeModel, String str) {
        super(4);
        this.LL = aITheaterModel;
        this.LLILLJJLI = creativeModel;
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, Long l, Integer num, String str) {
        boolean zBooleanValue = bool.booleanValue();
        long jLongValue = l.longValue();
        int iIntValue = num.intValue();
        String str2 = str;
        if (zBooleanValue) {
            this.LL.getExtraModel().aigcEditSource = "draft_restore";
            this.LL.getExtraModel().aigcFirstEdit = true;
            C546030LbF c546030LbF = C546030LbF.LIZ;
            C546030LbF.LIZIZ(c546030LbF, this.LLILLJJLI, EnumC546550Lc5.NLE_REPLACE_SUCCESS, 1, null, C2097608Jq.LJIIIIZZ(new Pair("replace_duration", Long.valueOf(jLongValue)), new Pair("server_task_id", this.LLILLL)), 24);
            C546030LbF.LIZIZ(c546030LbF, this.LLILLJJLI, EnumC546550Lc5.ASYNC_TASK_DB_CHECKED, 1, null, null, 56);
        } else {
            CreativeModel creativeModel = this.LLILLJJLI;
            String str3 = this.LLILLL;
            EnumC546550Lc5 enumC546550Lc5 = EnumC546550Lc5.NLE_REPLACE_FAIL;
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("replace_duration", Long.valueOf(jLongValue)), new Pair("server_task_id", str3));
            String branchName = enumC546550Lc5.getBranchName();
            C547410LdT c547410LdT = C547410LdT.LIZ;
            EnumC543480LTe enumC543480LTe = EnumC543480LTe.RESTORE;
            Map mapLJ = C2097608Jq.LJ();
            c547410LdT.getClass();
            C547410LdT.LIZJ(creativeModel, enumC543480LTe, branchName, 0, iIntValue, str2, mapLJIIIIZZ, mapLJ);
        }
        return Unit.LIZ;
    }
}
