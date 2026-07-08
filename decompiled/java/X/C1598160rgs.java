package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.widget.IStoryWidgetService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598160rgs {
    public static final C1598160rgs LIZ = new C1598160rgs();

    public static boolean LIZ() {
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        boolean zLJJII = C729510SjV.LJJII(c1618440sDa.LJJLIIIJLJLI().LJIIIIZZ());
        if (c1618440sDa.LJJIIZI().shouldShowShootingEntrance(false, false)) {
            return (c1618440sDa.LJJIFFI().LJIIIIZZ() || zLJJII) && c1618440sDa.LJJIIZI().canShowStoryCell();
        }
        return false;
    }

    public static StoryInboxItem LIZLLL() {
        if (LIZ()) {
            return new StoryInboxItem(C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ(), Integer.MAX_VALUE, true, null, null, true, 0, -1, null, 0, System.currentTimeMillis());
        }
        return null;
    }

    public static InterfaceC1891350zJl LJFF() {
        IStoryWidgetService iStoryWidgetService;
        Pair<InterfaceC1891350zJl, Boolean> pairLIZLLL;
        if (C295190Bhd.LIZ() || (iStoryWidgetService = (IStoryWidgetService) PluggableExtentionKt.pluggableSpi$default(IStoryWidgetService.class, false, false, false, 14, null)) == null || (pairLIZLLL = iStoryWidgetService.LIZLLL()) == null || pairLIZLLL.getFirst() == null || pairLIZLLL.getSecond().booleanValue()) {
            return null;
        }
        return ((InterfaceC1597720rgA) pairLIZLLL.getFirst()).LLILL(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static List LIZJ(SkylightDataResponse skylightDataResponse) {
        List<SkylightData> dataList;
        ArrayList arrayList = new ArrayList();
        if (skylightDataResponse != null && (dataList = skylightDataResponse.getDataList()) != null) {
            ArrayList<SkylightData> arrayList2 = new ArrayList();
            for (SkylightData skylightData : dataList) {
                if (skylightData.bizType == 1) {
                    arrayList2.add(skylightData);
                }
            }
            for (SkylightData skylightData2 : arrayList2) {
                LIZ.getClass();
                C1598140rgq c1598140rgqLJ = LJ(skylightData2);
                if (c1598140rgqLJ != null) {
                    arrayList.add(c1598140rgqLJ);
                }
            }
        }
        return arrayList;
    }

    public static C1598140rgq LJ(SkylightData skylightData) {
        int i = skylightData.bizType;
        if (i != 1 && i != 7 && i != 8) {
            return null;
        }
        return new C1598140rgq(skylightData);
    }

    public static String LIZIZ(int i, SkylightData skylightData) {
        Integer num;
        if (i != 1) {
            if (i != 2) {
                String strLIZ = null;
                if (i != 7) {
                    return null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("celebration_");
                StoryCelebrationInboxParam storyCelebrationInboxParamLIZ = C0MTJ.LIZ(skylightData);
                if (storyCelebrationInboxParamLIZ != null && (num = storyCelebrationInboxParamLIZ.celebrationType) != null) {
                    strLIZ = C0MLA.LIZ(num);
                }
                sbLIZ.append(strLIZ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return "now";
        }
        return "friends";
    }
}
