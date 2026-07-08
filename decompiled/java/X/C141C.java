package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.model.TakoSettingsEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.settings.ui.TakoSettingsOperationListAssem;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.141C, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C141C extends C2217421BqW implements Function1<C20106713lp, Unit> {
    public C141C(TakoSettingsOperationListAssem takoSettingsOperationListAssem) {
        super(1, takoSettingsOperationListAssem, TakoSettingsOperationListAssem.class, "onTitleSpanClick", "onTitleSpanClick(Lcom/ss/android/ugc/aweme/tako/otherpage/settings/ui/TakoSettingsOperationItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20106713lp c20106713lp) {
        String enterMethod;
        String processId;
        String takoSessionId;
        String takoChatId;
        TakoSettingsOperationListAssem takoSettingsOperationListAssem = (TakoSettingsOperationListAssem) this.receiver;
        takoSettingsOperationListAssem.getClass();
        if (Intrinsics.LJFF(c20106713lp.LL.LIZJ, "2")) {
            C201996141y c201996141y = C201996141y.LIZ;
            Context context = takoSettingsOperationListAssem.getContentView().getContext();
            Pair[] pairArr = new Pair[5];
            TakoSettingsEnterParams takoSettingsEnterParamsHp = takoSettingsOperationListAssem.hp();
            String enterFrom = null;
            if (takoSettingsEnterParamsHp != null) {
                enterFrom = takoSettingsEnterParamsHp.getEnterFrom();
            }
            String str = "";
            if (enterFrom == null) {
                enterFrom = "";
            }
            pairArr[0] = new Pair("enter_from", enterFrom);
            TakoSettingsEnterParams takoSettingsEnterParamsHp2 = takoSettingsOperationListAssem.hp();
            if (takoSettingsEnterParamsHp2 == null || (enterMethod = takoSettingsEnterParamsHp2.getEnterMethod()) == null) {
                enterMethod = "";
            }
            pairArr[1] = new Pair("enter_method", enterMethod);
            TakoSettingsEnterParams takoSettingsEnterParamsHp3 = takoSettingsOperationListAssem.hp();
            if (takoSettingsEnterParamsHp3 == null || (processId = takoSettingsEnterParamsHp3.getProcessId()) == null) {
                processId = "";
            }
            pairArr[2] = new Pair("process_id", processId);
            TakoSettingsEnterParams takoSettingsEnterParamsHp4 = takoSettingsOperationListAssem.hp();
            if (takoSettingsEnterParamsHp4 == null || (takoSessionId = takoSettingsEnterParamsHp4.getTakoSessionId()) == null) {
                takoSessionId = "";
            }
            pairArr[3] = new Pair("tako_session_id", takoSessionId);
            TakoSettingsEnterParams takoSettingsEnterParamsHp5 = takoSettingsOperationListAssem.hp();
            if (takoSettingsEnterParamsHp5 != null && (takoChatId = takoSettingsEnterParamsHp5.getTakoChatId()) != null) {
                str = takoChatId;
            }
            pairArr[4] = new Pair("tako_chat_id", str);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            c201996141y.getClass();
            C201996141y.LIZJ(context, mapLJIIJ);
            C201996141y.LJI("click_memory_about_page_icon", mapLJIIJ);
        }
        return Unit.LIZ;
    }
}
