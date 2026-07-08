package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakWeekSettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15Yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20538115Yd {
    public static C20539115Yn LIZ() {
        int i;
        ArrayList arrayList;
        ScheduleBreakSettings scheduleBreakSettingsLIZ = ComplianceServiceProvider.LJIL().LIZ();
        int i2 = 0;
        if (scheduleBreakSettingsLIZ != null) {
            i = scheduleBreakSettingsLIZ.downTimeStatus;
            i2 = scheduleBreakSettingsLIZ.skipDownTimeStatus;
            List<ScheduleBreakWeekSettings> list = scheduleBreakSettingsLIZ.weekSettings;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (ScheduleBreakWeekSettings scheduleBreakWeekSettings : list) {
                    arrayList.add(new C15ZD(scheduleBreakWeekSettings.weekDay, scheduleBreakWeekSettings.startHour, scheduleBreakWeekSettings.startMinute, scheduleBreakWeekSettings.endHour, scheduleBreakWeekSettings.endMinute, scheduleBreakWeekSettings.status));
                }
            }
            return new C20539115Yn(i, i2, arrayList);
        }
        i = 0;
        arrayList = null;
        return new C20539115Yn(i, i2, arrayList);
    }
}
