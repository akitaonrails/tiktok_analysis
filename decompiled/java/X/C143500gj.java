package X;

import com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp.FrequencyControlSyncSettingsData;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.00gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C143500gj {
    public static final FrequencyControlSyncSettingsData LIZ;
    public static final C01GW LIZIZ;

    static {
        InterfaceC2044707zh<EnumC12986056i> entries = EnumC12986056i.getEntries();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(entries, 10));
        Iterator<EnumC12986056i> it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getSceneName());
        }
        LIZ = new FrequencyControlSyncSettingsData(true, new ArrayList(arrayList));
        LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(282));
    }

    public static boolean LIZ() {
        return ((FrequencyControlSyncSettingsData) LIZIZ.getValue()).enabled && C0C64.LJIILLIIL().LJIJ(31744, 0, "dm_popup_frequency_server_global_enable", true) == 1;
    }

    public static boolean LIZIZ(String str) {
        if (!LIZ() || str.length() == 0) {
            return false;
        }
        return ((FrequencyControlSyncSettingsData) LIZIZ.getValue()).enabledScenes.contains(str);
    }
}
