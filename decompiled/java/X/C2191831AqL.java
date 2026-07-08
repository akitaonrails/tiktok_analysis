package X;

import com.bytedance.applog.priority.PriorityCallback;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS134S1200000_18;
import kotlin.jvm.internal.AwS38S1101000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191831AqL implements InterfaceC2191181ApI, InterfaceC1179804jU {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C2191191ApJ LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2191821AqK());
    public C2191841AqM LIZJ = new C2191841AqM(new CopyOnWriteArrayList());
    public final C2192021Aqe LIZLLL;
    public final C2191661Aq4 LJ;
    public final C2191171ApH LJFF;
    public C2191951AqX LJI;
    public C2191951AqX LJII;
    public C2191951AqX LJIIIIZZ;

    public final JSONObject LIZJ() throws JSONException {
        if (this.LJI == null && this.LJII == null && this.LJIIIIZZ == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        C2191951AqX c2191951AqX = this.LJI;
        if (c2191951AqX != null) {
            jSONObject.put("backoff_priority", c2191951AqX.LIZ());
        }
        C2191951AqX c2191951AqX2 = this.LJII;
        if (c2191951AqX2 != null) {
            jSONObject.put("event_priority_config", c2191951AqX2.LIZ());
        }
        C2191951AqX c2191951AqX3 = this.LJIIIIZZ;
        if (c2191951AqX3 != null) {
            jSONObject.put("group_priority", c2191951AqX3.LIZ());
        }
        return jSONObject;
    }

    public final ConcurrentHashMap<EnumC2191941AqW, RunnableC2191761AqE> LIZLLL() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Engine-");
        sbLIZ.append(this.LIZ.LIZIZ.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2191831AqL(C2191191ApJ c2191191ApJ) {
        this.LIZ = c2191191ApJ;
        this.LIZLLL = new C2192021Aqe(c2191191ApJ.LIZIZ.LIZ);
        this.LJ = new C2191661Aq4(c2191191ApJ.LIZJ, c2191191ApJ.LIZ, c2191191ApJ.LIZIZ.LIZ);
        this.LJFF = new C2191171ApH(c2191191ApJ, this, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x027a A[Catch: all -> 0x02fe, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001f, B:7:0x0024, B:9:0x003b, B:10:0x0040, B:12:0x0051, B:13:0x0056, B:15:0x0067, B:19:0x0073, B:20:0x00fd, B:22:0x0103, B:24:0x011a, B:28:0x0125, B:34:0x016f, B:36:0x0199, B:37:0x01d5, B:39:0x01e1, B:40:0x0223, B:29:0x0145, B:33:0x0150, B:41:0x0265, B:43:0x0273, B:48:0x028e, B:50:0x029c, B:55:0x02b7, B:57:0x02c5, B:62:0x02e0, B:59:0x02cc, B:61:0x02d4, B:52:0x02a3, B:54:0x02ab, B:45:0x027a, B:47:0x0282), top: B:68:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a3 A[Catch: all -> 0x02fe, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001f, B:7:0x0024, B:9:0x003b, B:10:0x0040, B:12:0x0051, B:13:0x0056, B:15:0x0067, B:19:0x0073, B:20:0x00fd, B:22:0x0103, B:24:0x011a, B:28:0x0125, B:34:0x016f, B:36:0x0199, B:37:0x01d5, B:39:0x01e1, B:40:0x0223, B:29:0x0145, B:33:0x0150, B:41:0x0265, B:43:0x0273, B:48:0x028e, B:50:0x029c, B:55:0x02b7, B:57:0x02c5, B:62:0x02e0, B:59:0x02cc, B:61:0x02d4, B:52:0x02a3, B:54:0x02ab, B:45:0x027a, B:47:0x0282), top: B:68:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02cc A[Catch: all -> 0x02fe, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001f, B:7:0x0024, B:9:0x003b, B:10:0x0040, B:12:0x0051, B:13:0x0056, B:15:0x0067, B:19:0x0073, B:20:0x00fd, B:22:0x0103, B:24:0x011a, B:28:0x0125, B:34:0x016f, B:36:0x0199, B:37:0x01d5, B:39:0x01e1, B:40:0x0223, B:29:0x0145, B:33:0x0150, B:41:0x0265, B:43:0x0273, B:48:0x028e, B:50:0x029c, B:55:0x02b7, B:57:0x02c5, B:62:0x02e0, B:59:0x02cc, B:61:0x02d4, B:52:0x02a3, B:54:0x02ab, B:45:0x027a, B:47:0x0282), top: B:68:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJ(org.json.JSONObject r34) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191831AqL.LJ(org.json.JSONObject):void");
    }

    public final void LJFF(JSONObject jSONObject) {
        boolean z;
        if (!jSONObject.has("backoff_priority_list") && !jSONObject.has("event_priority_config") && !jSONObject.has("group_priority_list")) {
            return;
        }
        JSONObject jSONObjectLIZ = this.LIZLLL.LIZ();
        if (jSONObjectLIZ == null) {
            jSONObjectLIZ = new JSONObject();
        }
        boolean zLJI = LJI(jSONObject, jSONObjectLIZ, "backoff_priority_list");
        if (!LJI(jSONObject, jSONObjectLIZ, "event_priority_config") && !zLJI) {
            z = false;
        } else {
            z = true;
        }
        if (!LJI(jSONObject, jSONObjectLIZ, "group_priority_list") && !z) {
            this.LIZ.LIZJ.LIZ("Engine:setConfig", new AwS546S0100000_2(this, 1233));
            return;
        }
        C2192021Aqe c2192021Aqe = this.LIZLLL;
        c2192021Aqe.LIZ.storeStringJustDisk("data", C786410Ut5.J3(jSONObjectLIZ));
        LJ(jSONObjectLIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r0, r5) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (kotlin.Unit.LIZ == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJI(org.json.JSONObject r8, org.json.JSONObject r9, java.lang.String r10) throws org.json.JSONException {
        /*
            org.json.JSONObject r8 = r8.optJSONObject(r10)
            r7 = 0
            if (r8 == 0) goto L47
            org.json.JSONObject r6 = r9.optJSONObject(r10)
            r5 = 0
            r4 = 1
            if (r6 == 0) goto L43
            java.lang.String r0 = "version"
            int r3 = r8.optInt(r0, r7)
            java.lang.String r1 = "config_ids"
            org.json.JSONArray r2 = r8.optJSONArray(r1)
            int r0 = r6.optInt(r0, r7)
            org.json.JSONArray r1 = r6.optJSONArray(r1)
            if (r3 > r0) goto L39
            if (r3 < r0) goto L3f
            if (r2 == 0) goto L3d
            java.lang.String r0 = r2.toString()
        L2d:
            if (r1 == 0) goto L33
            java.lang.String r5 = r1.toString()
        L33:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 != 0) goto L3f
        L39:
            r9.put(r10, r8)
            return r4
        L3d:
            r0 = r5
            goto L2d
        L3f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L47
        L43:
            r9.put(r10, r8)
            return r4
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191831AqL.LJI(org.json.JSONObject, org.json.JSONObject, java.lang.String):boolean");
    }

    @Override // X.InterfaceC1179804jU
    public final boolean LIZ(String str, int i, C01GW<? extends JSONObject> c01gw) {
        boolean z;
        Set<String> set;
        this.LIZ.LIZJ.LIZ("Engine:onEvent", new AwS38S1101000_18(this, str, i, 1));
        EnumC2191921AqU.Companion.getClass();
        EnumC2191921AqU enumC2191921AqULIZ = C2191891AqR.LIZ(i);
        C2191841AqM c2191841AqM = this.LIZJ;
        String str2 = "";
        C2191701Aq8 c2191701Aq8 = null;
        if (!c2191841AqM.LIZ.isEmpty()) {
            if (C2191971AqZ.LIZ[enumC2191921AqULIZ.ordinal()] == 1) {
                if (c2191841AqM.LIZIZ || ((set = c2191841AqM.LIZJ) != null && set.contains(str))) {
                    JSONObject jSONObjectOptJSONObject = c01gw.getValue().optJSONObject("params");
                    Iterator<C2191701Aq8> it2 = c2191841AqM.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C2191701Aq8 next = it2.next();
                        if (next.LJFF(enumC2191921AqULIZ, str, jSONObjectOptJSONObject)) {
                            c2191701Aq8 = next;
                            break;
                        }
                    }
                    c2191701Aq8 = c2191701Aq8;
                }
            } else {
                Set<EnumC2191921AqU> set2 = c2191841AqM.LIZLLL;
                if (set2 != null && set2.contains(enumC2191921AqULIZ)) {
                    Iterator<C2191701Aq8> it3 = c2191841AqM.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C2191701Aq8 next2 = it3.next();
                        if (next2.LJFF(enumC2191921AqULIZ, "", null)) {
                            c2191701Aq8 = next2;
                            break;
                        }
                    }
                    c2191701Aq8 = c2191701Aq8;
                }
            }
        }
        if (c2191701Aq8 == null) {
            return false;
        }
        PriorityCallback priorityCallback = this.LIZ.LIZIZ.LJFF;
        JSONObject value = c01gw.getValue();
        C2191711Aq9 c2191711Aq9 = c2191701Aq8.LIZIZ;
        C2191771AqF.LJIIIIZZ(priorityCallback, "2A", i, value, c2191711Aq9.LJ.LIZJ, c2191711Aq9.LIZ);
        JSONObject value2 = c01gw.getValue();
        String strJ3 = C786410Ut5.J3(value2);
        int iLJ = C2191771AqF.LJ(strJ3);
        if (c2191701Aq8.LIZIZ.LJ.LIZLLL < iLJ) {
            int i2 = C2191881AqQ.LIZ[enumC2191921AqULIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        Iterator it4 = C09RB.LJJII(C09RB.LJIIJ(C09R4.LIZIZ(value2.keys()), new C5183020f(C13LQ.LJLIIL(new String[]{"monitor_id", "event_stained"}), (Set<Integer>) 379))).iterator();
                        while (it4.hasNext()) {
                            value2.remove((String) it4.next());
                        }
                        value2.put("params_cleared_by_event_size_limit", iLJ);
                        value2.put("max_event_size", c2191701Aq8.LIZIZ.LJ.LIZLLL);
                    } else {
                        Iterator it5 = C09RB.LJJII(C09RB.LJIIJ(C09R4.LIZIZ(value2.keys()), new C5183020f(C13LQ.LJLIIL(new String[]{"log_type", "monitor_id", "event_stained"}), (Set<Integer>) 378))).iterator();
                        while (it5.hasNext()) {
                            value2.remove((String) it5.next());
                        }
                        value2.put("params_cleared_by_event_size_limit", iLJ);
                        value2.put("max_event_size", c2191701Aq8.LIZIZ.LJ.LIZLLL);
                    }
                } else {
                    Iterator it6 = C09RB.LJJII(C09RB.LJIIJ(C09R4.LIZIZ(value2.keys()), new C5183020f(C13LQ.LJLIIL(new String[]{"tag", "label", "monitor_id", "event_stained"}), (Set<Integer>) 377))).iterator();
                    while (it6.hasNext()) {
                        value2.remove((String) it6.next());
                    }
                    value2.put("params_cleared_by_event_size_limit", iLJ);
                    value2.put("max_event_size", c2191701Aq8.LIZIZ.LJ.LIZLLL);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_cleared_by_event_size_limit", iLJ);
                jSONObject.put("max_event_size", c2191701Aq8.LIZIZ.LJ.LIZLLL);
                value2.put("params", jSONObject);
            }
            strJ3 = C786410Ut5.J3(value2);
        }
        int i3 = c2191701Aq8.LIZIZ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (value2.optInt("event_stained") > 0) {
            z = true;
        } else {
            z = false;
        }
        String strOptString = value2.optString("monitor_id");
        if (strOptString != null) {
            str2 = strOptString;
        }
        this.LIZ.LIZJ.LIZ("Engine:onEvent", new AwS134S1200000_18(this, str, c2191701Aq8.LJFF.LJ(new C2191641Aq2(-1L, i3, jCurrentTimeMillis, enumC2191921AqULIZ, z, str2, str), strJ3), 5));
        PriorityCallback priorityCallback2 = this.LIZ.LIZIZ.LJFF;
        JSONObject value3 = c01gw.getValue();
        C2191711Aq9 c2191711Aq92 = c2191701Aq8.LIZIZ;
        C2191771AqF.LJIIIIZZ(priorityCallback2, "2F", i, value3, c2191711Aq92.LJ.LIZJ, c2191711Aq92.LIZ);
        return true;
    }

    @Override // X.InterfaceC2191181ApI
    public final void LIZIZ(String str, String str2, boolean z) {
        this.LIZ.LIZJ.LIZ("Engine:onSessionChanged", new C1181004jg(this, str, z, str2));
    }
}
