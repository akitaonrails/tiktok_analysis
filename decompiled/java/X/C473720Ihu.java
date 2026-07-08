package X;

import com.bytedance.android.livesdk.livesetting.feed.TopliveGoLiveButtonCooldownTimeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.skylight.tooltip.ShowRecordsModel;
import com.ss.android.ugc.aweme.live.skylight.tooltip.ToolTipInteractRecord;
import com.ss.android.ugc.aweme.live.skylight.tooltip.ToolTipShowRecordModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS26S0000100_7;

/* JADX INFO: renamed from: X.0Ihu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473720Ihu {
    public static long LIZJ;
    public static final int LIZ = (TopliveGoLiveButtonCooldownTimeSetting.INSTANCE.getValue() * 60) * 60;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(302));
    public static ToolTipShowRecordModel LIZLLL = new ToolTipShowRecordModel(new ShowRecordsModel(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()), 0);

    public static void LIZ() {
        List<ToolTipInteractRecord> list;
        List<ToolTipInteractRecord> list2;
        List<ToolTipInteractRecord> list3;
        List<ToolTipInteractRecord> list4;
        ToolTipShowRecordModel toolTipShowRecordModelLIZIZ = LIZIZ();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        ShowRecordsModel showRecordsModel = toolTipShowRecordModelLIZIZ.showRecords;
        if (showRecordsModel != null && (list4 = showRecordsModel.typeFiveRecords) != null) {
            C19719612Di.LJJIIJ(list4, new AwS26S0000100_7(jCurrentTimeMillis, 5), true);
        }
        ShowRecordsModel showRecordsModel2 = toolTipShowRecordModelLIZIZ.showRecords;
        if (showRecordsModel2 != null && (list3 = showRecordsModel2.typeSixRecords) != null) {
            C19719612Di.LJJIIJ(list3, new AwS26S0000100_7(jCurrentTimeMillis, 6), true);
        }
        ShowRecordsModel showRecordsModel3 = toolTipShowRecordModelLIZIZ.showRecords;
        if (showRecordsModel3 != null && (list2 = showRecordsModel3.typeSevenRecords) != null) {
            C19719612Di.LJJIIJ(list2, new AwS26S0000100_7(jCurrentTimeMillis, 7), true);
        }
        ShowRecordsModel showRecordsModel4 = toolTipShowRecordModelLIZIZ.showRecords;
        if (showRecordsModel4 == null || (list = showRecordsModel4.typeEightRecords) == null) {
            return;
        }
        C19719612Di.LJJIIJ(list, new AwS26S0000100_7(jCurrentTimeMillis, 8), true);
    }

    public static ToolTipShowRecordModel LIZIZ() {
        Object c098200Yq;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (LIZJ == currentUserId) {
            return LIZLLL;
        }
        LIZJ = currentUserId;
        try {
            c098200Yq = (ToolTipShowRecordModel) C19748512Ol.LIZIZ.LJII((String) ((Map) LIZIZ.getValue()).get(Long.valueOf(currentUserId)), ToolTipShowRecordModel.class);
            if (c098200Yq == null) {
                c098200Yq = new ToolTipShowRecordModel(new ShowRecordsModel(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()), 0L);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        ToolTipShowRecordModel toolTipShowRecordModel = new ToolTipShowRecordModel(new ShowRecordsModel(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()), 0L);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = toolTipShowRecordModel;
        }
        ToolTipShowRecordModel toolTipShowRecordModel2 = (ToolTipShowRecordModel) c098200Yq;
        LIZLLL = toolTipShowRecordModel2;
        return toolTipShowRecordModel2;
    }

    public static void LIZJ() {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C20337914i1<Map<Long, String>> c20337914i1 = InterfaceC1106030et7.U9;
        Map<Long, String> mapLIZIZ = c20337914i1.LIZIZ();
        Long lValueOf = Long.valueOf(currentUserId);
        LIZ();
        LIZLLL.curClientTimeStamps = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        mapLIZIZ.put(lValueOf, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, LIZLLL));
        c20337914i1.LIZJ();
    }
}
