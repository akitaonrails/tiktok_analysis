package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.popupclean.tool.PopupMonitorSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15sI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20656415sI {
    public static final C20656415sI LIZ = new C20656415sI();
    public static final List<String> LIZIZ = new ArrayList();
    public static final List<C20657815sW> LIZJ = new ArrayList();
    public static final Map<String, Timer> LIZLLL = new HashMap();

    public static void LIZ(String str) {
        Timer timer;
        HashMap map = (HashMap) LIZLLL;
        if (map.get(str) != null && (timer = (Timer) map.get(str)) != null) {
            timer.cancel();
        }
    }

    public static void LIZIZ(String str, boolean z) {
        int i;
        int i2;
        ((ArrayList) LIZIZ).remove(str);
        if (z) {
            C20657815sW c20657815sW = null;
            for (C20657815sW c20657815sW2 : (ArrayList) LIZJ) {
                if (Intrinsics.LJFF(c20657815sW2.LIZ, str)) {
                    c20657815sW = c20657815sW2;
                }
            }
            C19719512Dh.LIZ(LIZJ).remove(c20657815sW);
            return;
        }
        for (C20657815sW c20657815sW3 : (ArrayList) LIZJ) {
            if (Intrinsics.LJFF(c20657815sW3.LIZ, str)) {
                c20657815sW3.LJFF = System.currentTimeMillis();
                return;
            }
        }
        C01GW c01gw = PopupMonitorSetting.LIZ;
        PopupMonitorSetting.PopupMonitorData popupMonitorData = (PopupMonitorSetting.PopupMonitorData) c01gw.getValue();
        if (popupMonitorData != null) {
            i = popupMonitorData.popupFrequencyLimit;
        } else {
            i = -1;
        }
        PopupMonitorSetting.PopupMonitorData popupMonitorData2 = (PopupMonitorSetting.PopupMonitorData) c01gw.getValue();
        if (popupMonitorData2 != null) {
            i2 = popupMonitorData2.popupFrequencySpecifiedTime;
        } else {
            i2 = -1;
        }
        if (i != -1 && i2 != -1) {
            ArrayList arrayList = (ArrayList) LIZJ;
            if (arrayList.size() >= i) {
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    ArrayList<C20657815sW> arrayList3 = new ArrayList();
                    arrayList3.add(ListProtector.get(LIZJ, i3));
                    int i4 = i3 + 1;
                    int i5 = 1;
                    for (int i6 = i4; i6 < size; i6++) {
                        i5++;
                        List<C20657815sW> list = LIZJ;
                        arrayList3.add(ListProtector.get(list, i6));
                        long j = ((C20657815sW) ListProtector.get(list, i6)).LJ - ((C20657815sW) ListProtector.get(list, i3)).LJ;
                        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j3 = i2;
                        if (j / j2 < j3 && i5 >= i) {
                            z2 = true;
                        }
                        if ((((C20657815sW) ListProtector.get(list, i3)).LJ - ((C20657815sW) ListProtector.get(list, i6)).LJ) / j2 >= j3 && i5 < i) {
                            arrayList2.add(Integer.valueOf(i3));
                        }
                    }
                    if (z2) {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        for (C20657815sW c20657815sW4 : arrayList3) {
                            String str2 = c20657815sW4.LIZ;
                            String str3 = "";
                            if (str2 == null) {
                                str2 = "";
                            }
                            arrayList4.add(str2);
                            String str4 = c20657815sW4.LIZIZ;
                            if (str4 == null) {
                                str4 = "";
                            }
                            arrayList5.add(str4);
                            String str5 = c20657815sW4.LIZLLL;
                            if (str5 != null) {
                                str3 = str5;
                            }
                            arrayList6.add(str3);
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("popup_id_list", arrayList4.toString());
                        c2344009Gk.LJIIIIZZ("content_id_list", arrayList6.toString());
                        c2344009Gk.LJIIIIZZ("scene_id_List", arrayList5.toString());
                        C20684815ws.LJIILLIIL("popup_show_high_frequency", c2344009Gk.LIZ);
                    } else {
                        i3 = i4;
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ListProtector.remove(LIZJ, ((Number) it2.next()).intValue());
                }
            }
        }
    }
}
