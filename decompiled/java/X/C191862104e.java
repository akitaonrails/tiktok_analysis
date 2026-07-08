package X;

import Y.AfS197S0100000_28;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.usersettings.BatchUpdatePrivacySettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.usersettings.PrivacyUserSettingsResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.104e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191862104e {
    public static final C191862104e LIZ = new C191862104e();
    public static final List<InterfaceC989510brB<PrivacyUserSettingsV2>> LIZIZ = new CopyOnWriteArrayList();

    public static C11ON LIZ(Map map) {
        InterfaceC191863104f interfaceC191863104f = (InterfaceC191863104f) C191865104h.LIZ.getValue();
        BatchUpdatePrivacySettings batchUpdatePrivacySettings = new BatchUpdatePrivacySettings(map);
        InterfaceC191863104f.LIZ.getClass();
        String str = C191864104g.LIZIZ;
        C11JN c11jnLJJIJIIJIL = interfaceC191863104f.LIZLLL(batchUpdatePrivacySettings, str).LJJIJIIJIL(new AfS197S0100000_28(map, 43)).LJJIJIIJIL(new C09JN() { // from class: X.0zFy
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("UserSettingsApiManager@d79.updatePrivacySettings$2");
                C1888960zFu.LIZ.getClass();
                C1888960zFu.LIZ();
                C1C7U.LIZIZ("UserSettingsApiManager@d79.updatePrivacySettings$2");
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(((Number) entry.getValue()).intValue()));
        }
        return C1888930zFr.LIZIZ(c11jnLJJIJIIJIL, str, linkedHashMap).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00Xt
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return obj;
            }
        });
    }

    public static void LIZJ(InterfaceC989510brB interfaceC989510brB) {
        ((CopyOnWriteArrayList) LIZIZ).add(interfaceC989510brB);
    }

    public static void LIZLLL(InterfaceC989510brB interfaceC989510brB) {
        ((CopyOnWriteArrayList) LIZIZ).remove(interfaceC989510brB);
    }

    public static void LIZIZ(String str, Function0 function0, boolean z) {
        boolean zLJI = MethodIDManager.LJI(137314);
        if (C191868104k.LIZIZ(EnumC191875104r.SETTING, z)) {
            boolean zLJI2 = MethodIDManager.LJI(137917);
            InterfaceC191863104f interfaceC191863104f = (InterfaceC191863104f) C191865104h.LIZ.getValue();
            InterfaceC191863104f.LIZ.getClass();
            String str2 = C191864104g.LIZLLL;
            C11NZ<PrivacyUserSettingsResponse> c11nzLJ = interfaceC191863104f.LJ(str2);
            C13DA c13da = new C13DA();
            if (str != null) {
                c13da.put("scenario", str);
            }
            c13da.put("report_to_tea", "true");
            C11JN c11jnLJJIJIIJIL = C1888930zFr.LIZIZ(c11nzLJ, str2, c13da.build()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS197S0100000_28(function0, 42));
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            c11jnLJJIJIIJIL.LJJLL(new C09JN() { // from class: X.00Pi
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("UserSettingsApiManager@d79.fetchPrivacyUserSettingsBackground$1");
                    C1C7U.LIZIZ("UserSettingsApiManager@d79.fetchPrivacyUserSettingsBackground$1");
                }
            }, new C09JN() { // from class: X.00Pj
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("UserSettingsApiManager@d79.fetchPrivacyUserSettingsBackground$2");
                    C1C7U.LIZIZ("UserSettingsApiManager@d79.fetchPrivacyUserSettingsBackground$2");
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r13.equals("dm_setting_potential_connection") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r13.equals("dm_setting_friends") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r13.equals("dm_setting_others") == false) goto L4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11J7 LJ(final int r11, int r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191862104e.LJ(int, int, java.lang.String):X.11J7");
    }
}
