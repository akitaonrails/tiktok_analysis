package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0leg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366160leg implements InterfaceC1366180lei {
    public final Map<String, C1366170leh> LIZIZ = new LinkedHashMap();
    public final Map<String, String> LIZJ = new LinkedHashMap();
    public boolean LIZLLL;

    public final void LIZJ() {
        this.LIZLLL = true;
        ((LinkedHashMap) this.LIZIZ).clear();
        ((LinkedHashMap) this.LIZJ).clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1366180lei
    public final void LIZIZ(String str) {
        C1366170leh c1366170leh;
        C1366170leh c1366170leh2;
        C1366170leh c1366170leh3;
        C1366170leh c1366170leh4;
        C1366170leh c1366170leh5;
        C1366170leh c1366170leh6;
        if (this.LIZLLL) {
        }
        switch (str.hashCode()) {
            case -1977508354:
                if (str.equals("view_attached")) {
                    this.LIZIZ.put("im_data_load_latency", new C1366170leh(System.currentTimeMillis(), 2));
                }
                break;
            case -1956024065:
                if (str.equals("end_load_data") && (c1366170leh = (C1366170leh) ((LinkedHashMap) this.LIZIZ).get("load_data_duration")) != null) {
                    c1366170leh.LIZIZ = System.currentTimeMillis();
                    break;
                }
                break;
            case -1494212051:
                if (str.equals("start_fetch_user")) {
                    this.LIZIZ.put("fetch_user_duration", new C1366170leh(System.currentTimeMillis(), 2));
                }
                break;
            case -1390692553:
                if (str.equals("end_fetch_contact") && (c1366170leh2 = (C1366170leh) ((LinkedHashMap) this.LIZIZ).get("fetch_contact_duration")) != null) {
                    c1366170leh2.LIZIZ = System.currentTimeMillis();
                    break;
                }
                break;
            case -1146264746:
                if (str.equals("end_fetch_group") && (c1366170leh3 = (C1366170leh) ((LinkedHashMap) this.LIZIZ).get("fetch_group_duration")) != null) {
                    c1366170leh3.LIZIZ = System.currentTimeMillis();
                    break;
                }
                break;
            case -930504084:
                if (str.equals("bind_data")) {
                    C1366170leh c1366170leh7 = (C1366170leh) ((LinkedHashMap) this.LIZIZ).get("im_data_load_latency");
                    if (c1366170leh7 != null) {
                        c1366170leh7.LIZIZ = System.currentTimeMillis();
                    }
                    if (!this.LIZIZ.isEmpty() && !this.LIZLLL) {
                        InterfaceC1366180lei.LIZ.getClass();
                        String strValueOf = String.valueOf(C1366190lej.LIZIZ);
                        C1366190lej.LIZIZ = 0;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                            C1366170leh c1366170leh8 = (C1366170leh) entry.getValue();
                            long j = c1366170leh8.LIZ;
                            if (j > 0) {
                                long j2 = c1366170leh8.LIZIZ;
                                if (j2 > 0 && j <= j2) {
                                    linkedHashMap.put(entry.getKey(), String.valueOf(((C1366170leh) entry.getValue()).LIZIZ - ((C1366170leh) entry.getValue()).LIZ));
                                }
                            }
                        }
                        linkedHashMap.putAll(this.LIZJ);
                        linkedHashMap.put("is_first_show", strValueOf);
                        ((LinkedHashMap) this.LIZIZ).clear();
                        ((LinkedHashMap) this.LIZJ).clear();
                        C823050WQl.LIZJ().execute(new RunnableC514801zW(linkedHashMap, 58));
                        break;
                    }
                }
                break;
            case -863574092:
                if (str.equals("start_filter_data")) {
                    this.LIZIZ.put("filter_data_duration", new C1366170leh(System.currentTimeMillis(), 2));
                }
                break;
            case -497019909:
                if (str.equals("start_local_data")) {
                    this.LIZIZ.put("local_data_duration", new C1366170leh(System.currentTimeMillis(), 2));
                }
                break;
            case -313653228:
                if (str.equals("end_fetch_user") && (c1366170leh4 = (C1366170leh) ((LinkedHashMap) this.LIZIZ).get("fetch_user_duration")) != null) {
                    c1366170leh4.LIZIZ = System.currentTimeMillis();
                    break;
                }
                break;
            case -192991290:
                if (str.equals("start_load_data")) {
                    this.LIZIZ.put("load_data_duration", new C1366170leh(System.currentTimeMillis(), 2));
                }
                break;
            case 68598398:
                if (str.equals("start_fetch_contact")) {
                    this.LIZIZ.put("fetch_contact_duration", new C1366170leh(System.currentTimeMillis(), 2));
                }
                break;
            case 683538914:
                if (str.equals("end_local_data") && (c1366170leh5 = (C1366170leh) ((LinkedHashMap) this.LIZIZ).get("local_data_duration")) != null) {
                    c1366170leh5.LIZIZ = System.currentTimeMillis();
                    break;
                }
                break;
            case 911117405:
                if (str.equals("start_fetch_group")) {
                    this.LIZIZ.put("fetch_group_duration", new C1366170leh(System.currentTimeMillis(), 2));
                }
                break;
            case 1374011053:
                if (str.equals("end_filter_data") && (c1366170leh6 = (C1366170leh) ((LinkedHashMap) this.LIZIZ).get("filter_data_duration")) != null) {
                    c1366170leh6.LIZIZ = System.currentTimeMillis();
                    break;
                }
                break;
        }
    }

    @Override // X.InterfaceC1366180lei
    public final void LIZ(String str, String str2) {
        this.LIZJ.put(str, str2);
    }
}
