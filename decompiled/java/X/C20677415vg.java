package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.outreach.frequency.config.Abilities;
import com.ss.android.ugc.aweme.outreach.frequency.config.CustomConfig;
import com.ss.android.ugc.aweme.outreach.frequency.config.UnifiedUploadRecordsAbility;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15vg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20677415vg {
    public static final void LIZ() {
        C20677815vk.Companion.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(C13LP.LLIIII(C20677815vk.instance.getCacheRecords().values()));
        BPEAHandler bPEAHandler = C20547083d.LIZ;
        C786410Ut5.LJJZZIII(C20547083d.LIZ, new RunnableC20548083e(new AwS575S0100000_31(copyOnWriteArrayList, (CopyOnWriteArrayList<OutreachFlowReportItem>) 1518)));
    }

    public static final void LIZIZ(EnumC748390TXh enumC748390TXh, InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, OutreachFlowReportItem outreachFlowReportItem) {
        Abilities abilities;
        UnifiedUploadRecordsAbility unifiedUploadRecordsAbility;
        List<String> list;
        String str = outreachInfo.outreachType;
        String str2 = outreachInfo.outreachKey;
        CustomConfig customConfigLIZ = C20677515vh.LIZ(str);
        if (customConfigLIZ != null && (abilities = customConfigLIZ.abilities) != null && str2 != null && (unifiedUploadRecordsAbility = abilities.unifiedUploadRecords) != null && unifiedUploadRecordsAbility.enable && (list = unifiedUploadRecordsAbility.uploadKeys) != null && list.contains(str2)) {
            LIZ();
            if (enumC748390TXh == EnumC748390TXh.REPORT) {
                InterfaceC20676615vY interfaceC20676615vY = C20676915vb.LIZ;
                C20676915vb.LIZ(Collections.singletonList(outreachFlowReportItem), AFwS276S0000000_31.get$arr$(333), new AwS575S0100000_31(interfaceC20677715vj, 1519));
                return;
            }
            return;
        }
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachRecordData: report filter by config. status=");
        sbLIZ.append(enumC748390TXh.ordinal());
        sbLIZ.append(", ");
        sbLIZ.append(outreachInfo.outreachType);
        sbLIZ.append(", ");
        sbLIZ.append(outreachInfo.outreachKey);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20571615ec.getClass();
        C20571615ec.LIZLLL(strLIZIZ);
    }
}
