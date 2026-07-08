package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.expriment.AnchorMonitorSettings;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.156m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204662156m {
    public static final C204660156k LIZ;
    public static final C20328514gV LIZIZ;
    public static final Set<InterfaceC20328314gT> LIZJ;
    public static final C01GW LIZLLL;
    public static final AtomicBoolean LJ;

    static {
        final C204660156k c204660156k = new C204660156k();
        LIZ = c204660156k;
        LIZIZ = new C20328514gV("monitor");
        LIZJ = C13LQ.LJLIIL(new InterfaceC20328314gT[]{new InterfaceC20328314gT(c204660156k) { // from class: X.156s
            public final C204660156k LIZ;

            @Override // X.InterfaceC20328214gS
            public final boolean isEnable() {
                return AnchorMonitorSettings.LIZ() && ((AnchorMonitorSettings.AnchorMonitorSettingsModel) AnchorMonitorSettings.LIZIZ.getValue()).enableApm;
            }

            {
                this.LIZ = c204660156k;
            }

            @Override // X.InterfaceC20328214gS
            public final void LIZ(String str, String str2, String str3) throws JSONException {
                String str4;
                int i;
                int i2;
                int i3;
                List<String> list;
                String strLJJLIIIJ;
                String strLJJLIIIJ2;
                String strLJJLIIIJ3;
                if (!isEnable()) {
                    return;
                }
                C204660156k c204660156k2 = this.LIZ;
                c204660156k2.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
                sbLIZ.append('-');
                sbLIZ.append(str2);
                CopyOnWriteArrayList<C204664156o> copyOnWriteArrayList = c204660156k2.LIZ.get(C2188811AlT.LIZIZ(sbLIZ));
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                }
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                C305750Byf c305750Byf = new C305750Byf();
                c305750Byf.LIZ = "anchor_monitor_data_processor";
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                int value = EnumC204669156t.NO_FILTER.getValue();
                for (C204664156o c204664156o : copyOnWriteArrayList) {
                    jSONObject.put(c204664156o.LIZIZ.getStepName(), c204664156o.LJ);
                }
                String extraName = EnumC1779310wP3.ANCHOR_REQUEST.getExtraName();
                C204664156o c204664156o2 = (C204664156o) C13LP.LJJJLL(copyOnWriteArrayList);
                String str5 = null;
                if (c204664156o2 != null) {
                    str4 = c204664156o2.LIZ;
                } else {
                    str4 = null;
                }
                jSONObject2.put(extraName, str4);
                Iterator<C204664156o> it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    i = 1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C204664156o next = it2.next();
                    int i4 = C204670156u.LIZ[next.LIZIZ.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                String extraName2 = EnumC1779310wP3.ANCHOR_MAKER_LIST.getExtraName();
                                List<String> list2 = next.LIZJ;
                                if (list2 != null) {
                                    strLJJLIIIJ3 = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63);
                                } else {
                                    strLJJLIIIJ3 = null;
                                }
                                jSONObject2.put(extraName2, strLJJLIIIJ3);
                            }
                        } else {
                            String extraName3 = EnumC1779310wP3.ANCHOR_FCP_FILTER_LIST.getExtraName();
                            List<String> list3 = next.LIZJ;
                            if (list3 != null) {
                                strLJJLIIIJ2 = C13LP.LJJLIIIJ(list3, null, null, null, 0, null, null, 63);
                            } else {
                                strLJJLIIIJ2 = null;
                            }
                            jSONObject2.put(extraName3, strLJJLIIIJ2);
                        }
                    } else {
                        String extraName4 = EnumC1779310wP3.ANCHOR_SERVER_LIST.getExtraName();
                        List<String> list4 = next.LIZJ;
                        if (list4 != null) {
                            strLJJLIIIJ = C13LP.LJJLIIIJ(list4, null, null, null, 0, null, null, 63);
                        } else {
                            strLJJLIIIJ = null;
                        }
                        jSONObject2.put(extraName4, strLJJLIIIJ);
                    }
                    if (next.LJ == 2) {
                        value = next.LIZIZ.getValue();
                    }
                }
                jSONObject.put(EnumC1779120wOk.ANCHOR_FILTER_REASON.getCategoryName(), value);
                c305750Byf.LIZIZ = jSONObject;
                if (C806950Vl7.LIZIZ.LIZ()) {
                    jSONObject2.put(C807330Vlj.LIZIZ.LJ(), str);
                }
                c305750Byf.LIZJ = jSONObject2;
                C793770VBv.LJI(new C305780Byi(c305750Byf));
                String strLJIIJ = C807280Vle.LIZIZ.LJIIJ(str);
                C305750Byf c305750Byf2 = new C305750Byf();
                c305750Byf2.LIZ = "anchor_data_processor";
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String extraName5 = EnumC1779310wP3.ANCHOR_REQUEST.getExtraName();
                C204664156o c204664156o3 = (C204664156o) C13LP.LJJJLL(copyOnWriteArrayList);
                if (c204664156o3 != null) {
                    str5 = c204664156o3.LIZ;
                }
                jSONObject4.put(extraName5, str5);
                C204664156o c204664156o4 = (C204664156o) C13LP.LJJJLL(copyOnWriteArrayList);
                if (c204664156o4 != null && (list = c204664156o4.LIZJ) != null) {
                    jSONObject4.put("component_key", list);
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                ArrayList<AnchorCommonStruct> arrayList = new ArrayList();
                Iterator<C204664156o> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    Iterable iterable = it3.next().LIZLLL;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(iterable, arrayList);
                }
                for (AnchorCommonStruct anchorCommonStruct : arrayList) {
                    UrlModel icon = anchorCommonStruct.getIcon();
                    String keyword = anchorCommonStruct.getKeyword();
                    UrlModel thumbnail = anchorCommonStruct.getThumbnail();
                    String componentKey = anchorCommonStruct.getComponentKey();
                    if (keyword == null || keyword.length() == 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("keyword : ");
                        sbLIZ2.append(componentKey);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (icon != null && C438710HIf.LIZ(icon).isEmpty()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("icon : ");
                        sbLIZ3.append(componentKey);
                        sb2.append(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (thumbnail != null && C438710HIf.LIZ(thumbnail).isEmpty()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("thumbnail : ");
                        sbLIZ4.append(componentKey);
                        sb3.append(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                sb4.append((CharSequence) sb);
                sb4.append((CharSequence) sb2);
                sb4.append((CharSequence) sb3);
                jSONObject4.put("anchor_invalid_data", sb4.toString());
                String categoryName = EnumC1779120wOk.ANCHOR_EMPTY_TITLE.getCategoryName();
                if (sb.length() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject3.put(categoryName, i2);
                String categoryName2 = EnumC1779120wOk.ANCHOR_EMPTY_ICON.getCategoryName();
                if (sb2.length() == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                jSONObject3.put(categoryName2, i3);
                String categoryName3 = EnumC1779120wOk.ANCHOR_EMPTY_THUMBNAIL.getCategoryName();
                if (sb3.length() != 0) {
                    i = 0;
                }
                jSONObject3.put(categoryName3, i);
                c305750Byf2.LIZIZ = jSONObject3;
                if (C806950Vl7.LIZIZ.LIZ()) {
                    jSONObject4.put(C807330Vlj.LIZIZ.LJ(), strLJIIJ);
                }
                c305750Byf2.LIZJ = jSONObject4;
                C793770VBv.LJI(new C305780Byi(c305750Byf2));
            }
        }, new InterfaceC20328314gT(c204660156k) { // from class: X.156r
            public final C204660156k LIZ;

            @Override // X.InterfaceC20328214gS
            public final boolean isEnable() {
                return AnchorMonitorSettings.LIZ() && ((AnchorMonitorSettings.AnchorMonitorSettingsModel) AnchorMonitorSettings.LIZIZ.getValue()).enableAppLog;
            }

            {
                this.LIZ = c204660156k;
            }

            @Override // X.InterfaceC20328214gS
            public final void LIZ(String str, String str2, String str3) {
                String str4;
                int i;
                String str5;
                int i2;
                int i3;
                List<String> list;
                String strLJJLIIIJ;
                String strLJJLIIIJ2;
                String strLJJLIIIJ3;
                if (!isEnable()) {
                    return;
                }
                C204660156k c204660156k2 = this.LIZ;
                c204660156k2.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
                sbLIZ.append('-');
                sbLIZ.append(str2);
                CopyOnWriteArrayList<C204664156o> copyOnWriteArrayList = c204660156k2.LIZ.get(C2188811AlT.LIZIZ(sbLIZ));
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                }
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                c2344009Gk.LJIIIIZZ("group_id", str3);
                C204664156o c204664156o = (C204664156o) C13LP.LJJJLL(copyOnWriteArrayList);
                if (c204664156o != null) {
                    str4 = c204664156o.LIZ;
                } else {
                    str4 = null;
                }
                c2344009Gk.LJIIIIZZ("request_id", str4);
                int value = EnumC204669156t.NO_FILTER.getValue();
                Iterator<C204664156o> it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    i = 1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C204664156o next = it2.next();
                    c2344009Gk.LIZJ(next.LJ, next.LIZIZ.getStepName());
                    if (next.LJ == 2) {
                        value = next.LIZIZ.getValue();
                    }
                    int i4 = C204671156v.LIZ[next.LIZIZ.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                List<String> list2 = next.LIZJ;
                                if (list2 != null) {
                                    strLJJLIIIJ = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63);
                                } else {
                                    strLJJLIIIJ = null;
                                }
                                c2344009Gk.LJFF("anchor_maker_list", strLJJLIIIJ);
                            }
                        } else {
                            List<String> list3 = next.LIZJ;
                            if (list3 != null) {
                                strLJJLIIIJ2 = C13LP.LJJLIIIJ(list3, null, null, null, 0, null, null, 63);
                            } else {
                                strLJJLIIIJ2 = null;
                            }
                            c2344009Gk.LJFF("anchor_fcp_invalid_list", strLJJLIIIJ2);
                        }
                    } else {
                        List<String> list4 = next.LIZJ;
                        if (list4 != null) {
                            strLJJLIIIJ3 = C13LP.LJJLIIIJ(list4, null, null, null, 0, null, null, 63);
                        } else {
                            strLJJLIIIJ3 = null;
                        }
                        c2344009Gk.LJFF("anchor_server_list", strLJJLIIIJ3);
                    }
                }
                c2344009Gk.LIZJ(value, "anchor_avoid_reason");
                StringBuilder sb = new StringBuilder();
                Map<String, String> map = c2344009Gk.LIZ;
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    String str6 = (String) entry.getKey();
                    String str7 = (String) entry.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" key :");
                    sbLIZ2.append(str6);
                    sbLIZ2.append(" , value : ");
                    sbLIZ2.append(str7);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
                C20328514gV c20328514gV = C20328614gW.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AnchorData monitor data ");
                sbLIZ3.append((Object) sb);
                c20328514gV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                C807840VmY.LIZIZ(str, map);
                C20684815ws.LJIILLIIL("anchor_monitor_data_processor", map);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", str2);
                c2344009Gk2.LJIIIIZZ("group_id", str3);
                C204664156o c204664156o2 = (C204664156o) C13LP.LJJJLL(copyOnWriteArrayList);
                if (c204664156o2 != null) {
                    str5 = c204664156o2.LIZ;
                } else {
                    str5 = null;
                }
                c2344009Gk2.LJIIIIZZ("request_id", str5);
                C204664156o c204664156o3 = (C204664156o) C13LP.LJJJLL(copyOnWriteArrayList);
                if (c204664156o3 != null && (list = c204664156o3.LIZJ) != null) {
                    c2344009Gk2.LJ(list, "component_key");
                }
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                StringBuilder sb5 = new StringBuilder();
                String strLJIIJ = C807280Vle.LIZIZ.LJIIJ(str);
                ArrayList<AnchorCommonStruct> arrayList = new ArrayList();
                Iterator<C204664156o> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    Iterable iterable = it3.next().LIZLLL;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(iterable, arrayList);
                }
                for (AnchorCommonStruct anchorCommonStruct : arrayList) {
                    UrlModel icon = anchorCommonStruct.getIcon();
                    String keyword = anchorCommonStruct.getKeyword();
                    UrlModel thumbnail = anchorCommonStruct.getThumbnail();
                    String componentKey = anchorCommonStruct.getComponentKey();
                    if (keyword == null || keyword.length() == 0) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("keyword : ");
                        sbLIZ4.append(componentKey);
                        sb2.append(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (icon != null && C438710HIf.LIZ(icon).isEmpty()) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("icon : ");
                        sbLIZ5.append(componentKey);
                        sb3.append(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                    if (thumbnail != null && C438710HIf.LIZ(thumbnail).isEmpty()) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("thumbnail : ");
                        sbLIZ6.append(componentKey);
                        sb4.append(C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
                sb5.append((CharSequence) sb2);
                sb5.append((CharSequence) sb3);
                sb5.append((CharSequence) sb4);
                c2344009Gk2.LJFF("anchor_invalid_data", sb5.toString());
                if (sb2.length() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c2344009Gk2.LIZJ(i2, "anchor_keyword_status");
                if (sb3.length() == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                c2344009Gk2.LIZJ(i3, "anchor_icon_status");
                if (sb4.length() != 0) {
                    i = 0;
                }
                c2344009Gk2.LIZJ(i, "anchor_thumbnail_status");
                Map<String, String> map2 = c2344009Gk2.LIZ;
                C807840VmY.LIZIZ(strLJIIJ, map2);
                C20684815ws.LJIILLIIL("anchor_data_processor", map2);
            }
        }});
        LIZLLL = C452501pT.LIZIZ(new C204663156n());
        LJ = new AtomicBoolean(true);
    }

    public static final void LIZ(final String str, final String str2, final C204664156o c204664156o) {
        if (!AnchorMonitorSettings.LIZ()) {
            return;
        }
        ((ExecutorService) LIZLLL.getValue()).execute(new Runnable() { // from class: X.156l
            public final void LIZ() {
                try {
                    if (C204662156m.LJ.compareAndSet(true, false)) {
                        C204662156m.LIZ.LIZ.clear();
                    }
                    C204662156m.LIZ.LIZ(str, str2, c204664156o);
                    C20328514gV c20328514gV = C204662156m.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("record awemeTrace: ");
                    sbLIZ.append(c204664156o.LIZ);
                    sbLIZ.append(" step: ");
                    sbLIZ.append(c204664156o.LIZIZ);
                    sbLIZ.append(" state: ");
                    sbLIZ.append(c204664156o.LJ);
                    sbLIZ.append("  componentKey : ");
                    sbLIZ.append(c204664156o.LIZJ);
                    c20328514gV.LJIIIIZZ(null, "AnchorMonitor", C2188811AlT.LIZIZ(sbLIZ));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AnchorMonitor@9c78.record$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AnchorMonitor@9c78.record$1");
            }
        });
    }
}
