package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.outreach.frequency.config.CommonConfigs;
import com.ss.android.ugc.aweme.outreach.frequency.config.CommonFrequencyAbilityConfig;
import com.ss.android.ugc.aweme.outreach.frequency.config.UploadRecordConfig;
import com.ss.android.ugc.aweme.report.ClickReportInfo;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20676915vb {
    public static final InterfaceC20676615vY LIZ;
    public static final C01GW LIZIZ;
    public static volatile long LIZJ;

    static {
        InterfaceC20676615vY.LIZ.getClass();
        LIZ = C20677015vc.LIZJ;
        LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(570));
        LIZJ = -1L;
    }

    public static void LIZ(List list, Function1 function1, Function0 function0) {
        UploadRecordConfig uploadRecordConfig;
        int i;
        CommonConfigs commonConfigs;
        String str;
        if (LIZ == null) {
            Throwable th = new Throwable("Can't get api object.");
            th.getMessage();
            function1.invoke(th);
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            OutreachFlowReportItem outreachFlowReportItem = (OutreachFlowReportItem) it2.next();
            List<ClickReportInfo> list2 = outreachFlowReportItem.clickReportInfo;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<ClickReportInfo> it3 = list2.iterator();
            while (true) {
                str = "";
                if (!it3.hasNext()) {
                    break;
                }
                ClickReportInfo next = it3.next();
                String str2 = next.time;
                String str3 = next.clickType;
                if (Intrinsics.LJFF(str3, "positive_click")) {
                    str = "positive";
                } else if (Intrinsics.LJFF(str3, "negative_click")) {
                    str = "negative";
                }
                arrayList2.add(next.copy(str2, str, next.clickAction));
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            OutreachInfo outreachInfo = outreachFlowReportItem.outreachInfo;
            String str4 = outreachFlowReportItem.triggerTiming;
            if (str4 != null) {
                str = str4;
            }
            arrayList.add(outreachFlowReportItem.copy(outreachInfo, str, outreachFlowReportItem.triggerScene, outreachFlowReportItem.triggerSession, outreachFlowReportItem.showReportInfo, arrayList3));
        }
        List listLLIIII = C13LP.LLIIII(arrayList);
        long jCurrentTimeMillis = System.currentTimeMillis();
        CommonFrequencyAbilityConfig commonFrequencyAbilityConfig = (CommonFrequencyAbilityConfig) C20677515vh.LIZ.getValue();
        if (commonFrequencyAbilityConfig != null && (commonConfigs = commonFrequencyAbilityConfig.commonConfigs) != null) {
            uploadRecordConfig = commonConfigs.unifiedUploadRecords;
        } else {
            uploadRecordConfig = null;
        }
        if (uploadRecordConfig != null) {
            i = uploadRecordConfig.minInterval;
        } else {
            i = 3;
        }
        if (jCurrentTimeMillis - LIZJ < i * LSPassThroughRecordSizeConfig.DEFAULT) {
            Throwable th2 = new Throwable("Too frequent report.");
            th2.getMessage();
            function1.invoke(th2);
        } else {
            LIZJ = jCurrentTimeMillis;
            C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C20676815va(listLLIIII, null, function0, function1), 3);
        }
    }
}
