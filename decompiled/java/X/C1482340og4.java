package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0og4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482340og4 {
    public static volatile C1482340og4 LIZ;
    public static volatile C1482350og5 LIZIZ;
    public static boolean LIZJ;

    public static C1482340og4 LIZIZ() {
        if (LIZ == null) {
            synchronized (C1482340og4.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1482340og4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static void LJFF() {
        C1482350og5 c1482350og5 = LIZIZ;
        c1482350og5.getClass();
        LinkedList<String> linkedList = new LinkedList();
        int size = c1482350og5.LIZLLL.size();
        if (size > 0) {
            for (String str : c1482350og5.LIZLLL) {
                if (!linkedList.contains(str)) {
                    linkedList.addLast(str);
                }
                c1482350og5.LIZLLL.remove(str);
                size--;
                if (size <= 0) {
                    break;
                }
            }
        }
        int size2 = c1482350og5.LJFF.size();
        if (size2 > 0) {
            for (String str2 : c1482350og5.LJFF) {
                if (!linkedList.contains(str2)) {
                    linkedList.addLast(str2);
                }
                c1482350og5.LJFF.remove(str2);
                size2--;
                if (size2 <= 0) {
                    break;
                }
            }
        }
        for (String str3 : linkedList) {
            JSONObject jSONObjectLIZ = LIZIZ.LIZ(str3);
            JSONObject jSONObjectLIZIZ = LIZIZ.LIZIZ(str3);
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject, jSONObjectLIZ, jSONObjectLIZIZ);
            if (jSONObject.length() == 0) {
                return;
            } else {
                LJ(jSONObject);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI() {
        /*
            X.0og5 r2 = X.C1482340og4.LIZIZ
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r2.LJFF
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3b
            int r0 = X.C1474810oTv.LLIFFJFJJ()
            if (r0 <= 0) goto L39
            r1 = 0
        L11:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r2.LJFF
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3b
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r2.LJFF
            int r0 = r0.size()
            if (r0 < r1) goto L3b
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r2.LJFF
            java.lang.Object r1 = r0.poll()
            java.lang.String r1 = (java.lang.String) r1
            X.0ofP r0 = r2.LIZJ(r1)
            if (r0 == 0) goto L32
            r0.LIZ()
        L32:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L3d
            return
        L39:
            r1 = 4
            goto L11
        L3b:
            r1 = 0
            goto L32
        L3d:
            X.0og5 r0 = X.C1482340og4.LIZIZ
            org.json.JSONObject r2 = r0.LIZ(r1)
            X.0og5 r0 = X.C1482340og4.LIZIZ
            org.json.JSONObject r0 = r0.LIZIZ(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            LIZ(r1, r2, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L58
            return
        L58:
            LJ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1482340og4.LJI():void");
    }

    public static void LJII() {
        String strRemoveFirst;
        C1482350og5 c1482350og5 = LIZIZ;
        if (c1482350og5.LJ.isEmpty()) {
            strRemoveFirst = null;
        } else {
            strRemoveFirst = c1482350og5.LJ.removeFirst();
            InterfaceC1481930ofP interfaceC1481930ofPLIZJ = c1482350og5.LIZJ(strRemoveFirst);
            if (interfaceC1481930ofPLIZJ != null) {
                interfaceC1481930ofPLIZJ.LIZ();
            }
        }
        if (TextUtils.isEmpty(strRemoveFirst)) {
            return;
        }
        JSONObject jSONObjectLIZ = LIZIZ.LIZ(strRemoveFirst);
        JSONObject jSONObjectLIZIZ = LIZIZ.LIZIZ(strRemoveFirst);
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject, jSONObjectLIZ, jSONObjectLIZIZ);
        if (jSONObject.length() == 0) {
            return;
        }
        LJ(jSONObject);
    }

    public C1482340og4() {
        LIZIZ = new C1482350og5();
        C1475000oUE.LIZ.registerActivityLifecycleCallbacks(new C1482390og9(this));
    }

    public static void LIZLLL(JSONObject jSONObject) {
        jSONObject.remove("engine_state");
        jSONObject.remove("play_url");
        Object objRemove = jSONObject.remove("play_type");
        Object objRemove2 = jSONObject.remove("audio_bitrate");
        if (objRemove != null) {
            try {
                jSONObject.put("sim_play_type", objRemove);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (objRemove2 != null) {
            jSONObject.put("sim_audio_bitrate", objRemove2);
        }
    }

    public static void LJ(JSONObject jSONObject) {
        IEvent iEventLIZJ = C1475000oUE.LIZJ();
        if (iEventLIZJ != null && jSONObject != null && jSONObject.length() > 2) {
            iEventLIZJ.onEvent("play_session_events", jSONObject);
        }
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        int i;
        if (jSONObject3 != null) {
            try {
                if (jSONObject3.length() > 0) {
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject3.get(next));
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObject.put(next2, jSONObject2.get(next2));
            }
        }
        if (!jSONObject.has("engine_enter_from") && jSONObject.has("enter_from")) {
            String str = (String) jSONObject.get("enter_from");
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("engine_enter_from", str);
            }
        }
        int i2 = 1;
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("has_oneplay", i);
        if (jSONObject3 == null || jSONObject3.length() <= 0) {
            i2 = 0;
        }
        jSONObject.put("has_playsessionevents", i2);
    }

    public static void LIZJ(JSONObject jSONObject, String str, boolean z) {
        boolean zBooleanValue;
        JSONObject jSONObjectLIZIZ;
        try {
            jSONObject.put("has_playsessionevents", 1);
            jSONObject.put("has_oneplay", 0);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (TextUtils.isEmpty(str)) {
            if (((Boolean) C1474810oTv.F2.getValue()).booleanValue()) {
                LJ(jSONObject);
                return;
            }
            return;
        }
        LJII();
        LJI();
        if (((Boolean) C1474810oTv.D2.getValue()).booleanValue()) {
            C1482350og5 c1482350og5 = LIZIZ;
            c1482350og5.getClass();
            if (!TextUtils.isEmpty(str) && c1482350og5.LIZIZ.containsKey(str) && (jSONObjectLIZIZ = LIZIZ.LIZIZ(str)) != null) {
                try {
                    Iterator<String> itKeys = jSONObjectLIZIZ.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectLIZIZ.get(next));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        LIZLLL(jSONObject);
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        synchronized (c1477400oY6) {
            if (!TextUtils.isEmpty(str)) {
                Boolean bool = c1477400oY6.LJIL.get(str);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    C1482350og5 c1482350og52 = LIZIZ;
                    c1482350og52.getClass();
                    if (!TextUtils.isEmpty(str) && c1482350og52.LIZJ.containsKey(str)) {
                        LIZIZ.LIZLLL(str);
                        JSONObject jSONObject2 = new JSONObject();
                        LIZ(jSONObject2, LIZIZ.LIZ(str), jSONObject);
                        LJ(jSONObject2);
                        return;
                    }
                    if (z && jSONObject.length() > 0) {
                        if (C1474810oTv.LLIFFJFJJ() > 0) {
                            LJ(jSONObject);
                            return;
                        } else {
                            LIZIZ.LJ(str, jSONObject);
                            LIZIZ.LJI(EnumC1482380og8.PlaySessionEvents, str, C786410Ut5.J3(jSONObject));
                            return;
                        }
                    }
                    C1482350og5 c1482350og53 = LIZIZ;
                    c1482350og53.getClass();
                    if (!TextUtils.isEmpty(str) && c1482350og53.LIZIZ.containsKey(str)) {
                        LJ(jSONObject);
                        return;
                    } else {
                        LIZIZ.LJ(str, jSONObject);
                        return;
                    }
                }
            }
        }
        LJ(jSONObject);
    }
}
