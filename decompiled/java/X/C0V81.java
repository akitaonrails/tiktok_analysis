package X;

import Y.ARunnableS18S1100000_13;
import Y.ARunnableS2S1110000_13;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V81, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V81 implements C0V89, InterfaceC792700V7s {
    public static String LLJJIJIL = "bg_never_front";
    public volatile boolean LL;
    public volatile boolean LLILLJJLI;
    public Map<String, C793240V9u<Long, Long>> LLILZIL;
    public Map<String, C793240V9u<Long, Long>> LLILZLL;
    public Map<String, C793240V9u<Long, Long>> LLIZ;
    public long LLIZLLLIL;
    public long LLJILLL;
    public final C0V85 LLJJI;
    public volatile C792560V7e LLJJIII;
    public final C0V82 LLJJIJI;
    public final C0V6Z<C0V6Q> LLILLL = new C0V6Z<>(20);
    public final C0V6Z<String> LLILZ = new C0V6Z<>(20);
    public long LLJ = -1;
    public long LLJI = 0;
    public long LLJIJIL = 0;
    public long LLJILJIL = 0;
    public long LLJILJILJ = 0;
    public long LLJJ = 0;
    public final C0V7R LLJJIJIIJIL = (C0V7R) C792590V7h.LIZ(C0V7R.class);

    @Override // X.InterfaceC792700V7s
    public final void LJ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIJ(Activity activity) {
    }

    public final synchronized void LJIIL() {
        if (this.LLJJIII == null || this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        this.LLJJI.LIZIZ();
        EnumC792970V8t enumC792970V8t = EnumC792970V8t.LIGHT_WEIGHT;
        C792490V6x.LIZ(enumC792970V8t).LIZIZ(this.LLJJIJI);
        C792490V6x.LIZ(enumC792970V8t).LIZJ(this.LLJJIJI);
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityStarted(Activity activity) {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0V82] */
    public C0V81() {
        C0V85 c0v85 = C792660V7o.LIZ;
        this.LLJJI = c0v85;
        c0v85.LIZIZ();
        c0v85.LIZ.LIZ(LJFF());
        this.LLJJIJI = new AbstractRunnableC792500V6y() { // from class: X.0V82
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:106:0x03ba  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x03fa  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0405  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0254 A[Catch: JSONException -> 0x0367, TryCatch #1 {JSONException -> 0x0367, blocks: (B:65:0x01fc, B:67:0x0254, B:68:0x025a, B:70:0x0277, B:71:0x0289, B:73:0x028c, B:75:0x028f, B:76:0x029e, B:78:0x02a4, B:80:0x02b8, B:81:0x02e8, B:83:0x02ef, B:85:0x02fb, B:86:0x0304, B:88:0x030a, B:89:0x032f, B:90:0x0334, B:92:0x034a, B:93:0x0350, B:95:0x0365, B:96:0x0366, B:72:0x028a), top: B:121:0x01fc, inners: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0277 A[Catch: JSONException -> 0x0367, TryCatch #1 {JSONException -> 0x0367, blocks: (B:65:0x01fc, B:67:0x0254, B:68:0x025a, B:70:0x0277, B:71:0x0289, B:73:0x028c, B:75:0x028f, B:76:0x029e, B:78:0x02a4, B:80:0x02b8, B:81:0x02e8, B:83:0x02ef, B:85:0x02fb, B:86:0x0304, B:88:0x030a, B:89:0x032f, B:90:0x0334, B:92:0x034a, B:93:0x0350, B:95:0x0365, B:96:0x0366, B:72:0x028a), top: B:121:0x01fc, inners: #0 }] */
            /* JADX WARN: Type inference failed for: r12v0 */
            /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r12v9 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 1037
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0V82.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainProcessCollector@ccfe.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainProcessCollector@ccfe.<init>$1");
            }

            {
                super(0L, 600000L);
            }
        };
    }

    public static boolean LJFF() {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isBackground(): ");
            sbLIZ.append(!ActivityLifeObserver.getInstance().isForeground());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return !ActivityLifeObserver.getInstance().isForeground();
    }

    public static final void LJIIJJI(C791160V1u c791160V1u) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendPerfLog[");
            sbLIZ.append(c791160V1u.LIZ);
            sbLIZ.append("] = ");
            sbLIZ.append(C786410Ut5.J3(c791160V1u.LIZ()));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        String strLJ = C2257208ss.LIZ().LJ();
        JSONObject jSONObject = c791160V1u.LJ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(strLJ)) {
                strLJ = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put(Scene.SCENE_SERVICE, strLJ);
            jSONObject.put("process_name", C792400V6o.LIZIZ());
            jSONObject.put("is_main_process", C792400V6o.LJIIIZ());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            c791160V1u.LJ = jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C791030V1h.LIZ(c791160V1u, TextUtils.equals(c791160V1u.LIZ, "memory"));
        C792310V6f.LJIIIZ().LIZJ(c791160V1u);
    }

    @Override // X.C0V89
    public final synchronized void LIZ(C792560V7e c792560V7e) {
        C792190V5t.LIZ();
        this.LLJJIII = c792560V7e;
        if (!this.LL) {
            C792190V5t.LIZ();
            return;
        }
        if (c792560V7e.LIZIZ) {
            C0V8O c0v8o = C0V8S.LIZ;
            c0v8o.start();
            c0v8o.LJII(c792560V7e.LJFF);
            c0v8o.LIZLLL(c792560V7e.LJI);
        }
        JSONObject jSONObject = c792560V7e.LIZ;
        while (!this.LLILLL.LIZ()) {
            LIZJ(this.LLILLL.LIZIZ(), jSONObject, this.LLILZ.LIZIZ());
        }
        LJIIL();
    }

    @Override // X.InterfaceC792700V7s
    public final void LIZLLL(Activity activity) {
        C792190V5t.LIZ();
        if (this.LLJJIII != null) {
            LJIIL();
        }
        LLJJIJIL = "bg_ever_front";
        this.LLJJI.LIZ.LIZ(false);
    }

    @Override // X.InterfaceC792700V7s
    public final void LJII(Activity activity) {
        C792190V5t.LIZ();
        C792190V5t.LIZ();
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            C792490V6x.LIZ(EnumC792970V8t.LIGHT_WEIGHT).LIZIZ(this.LLJJIJI);
        }
        this.LLJJI.LIZ.LIZ(true);
    }

    @Override // X.C0V89
    public final synchronized void LJJIJLIJ(String str) {
        C787900UvU.LIZ.LIZJ(new ARunnableS18S1100000_13(this, str, 10));
    }

    @Override // X.C0V89
    public final void LIZIZ(boolean z, boolean z2) {
        C792560V7e config;
        if (this.LL) {
            return;
        }
        this.LL = true;
        C792590V7h.LIZ(InterfaceC792570V7f.class);
        C792190V5t.LIZ();
        ActivityLifeObserver.getInstance().register(this);
        this.LLJJI.LIZIZ();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "traffic_monitor_info");
        long j = sharedPreferencesLIZJ.getLong("init", -1L);
        long j2 = sharedPreferencesLIZJ.getLong("init_ts", 0L);
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initTraffic==");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j > -1) {
            long j3 = sharedPreferencesLIZJ.getLong("usage", 0L);
            long j4 = sharedPreferencesLIZJ.getLong("usage_ts", 0L);
            long j5 = j3 - j;
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("statsUsageTraffic==");
                sbLIZ2.append(j3);
                C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("statsUsageTrafficTs==");
                sbLIZ3.append(j4);
                C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("lastUsageTraffic==");
                sbLIZ4.append(j5);
                C2188811AlT.LIZIZ(sbLIZ4);
            }
            if (j5 > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("total_usage", j5);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("total_usage_duration", ((j4 - j2) / 1000) / 60);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("init_ts", j2);
                    jSONObject3.put("usage_ts", j4);
                    jSONObject3.put("biz_usage", sharedPreferencesLIZJ.getLong("biz_usage", 0L));
                    jSONObject3.put("init", j);
                    try {
                        jSONObject3.put("usage", j3);
                        String string = sharedPreferencesLIZJ.getString("biz_json", "");
                        if (C792190V5t.LIZ()) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("detailUsage==");
                            sbLIZ5.append(string);
                            C2188811AlT.LIZIZ(sbLIZ5);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("usage", new JSONArray(string));
                            jSONObject3.put("detail", jSONObject4);
                        }
                        try {
                            String str = this.LLJJI.LIZIZ;
                            if (!TextUtils.isEmpty(str)) {
                                jSONObject3.put("traffic_impl", str);
                            }
                            C791160V1u c791160V1u = new C791160V1u();
                            c791160V1u.LIZ = "traffic";
                            c791160V1u.LIZLLL = jSONObject;
                            c791160V1u.LJ = jSONObject2;
                            c791160V1u.LJI = jSONObject3;
                            LJIIJJI(c791160V1u);
                        } catch (JSONException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (JSONException e2) {
                        e = e2;
                    }
                } catch (JSONException e3) {
                    e = e3;
                }
            }
        }
        this.LLJJ = this.LLJJI.LIZ();
        SharedPreferences.Editor editorEdit = sharedPreferencesLIZJ.edit();
        editorEdit.putLong("init", this.LLJJ);
        editorEdit.putLong("init_ts", System.currentTimeMillis());
        editorEdit.putLong("usage", 0L);
        editorEdit.apply();
        InterfaceC792570V7f interfaceC792570V7f = (InterfaceC792570V7f) C792590V7h.LIZ(InterfaceC792570V7f.class);
        if (interfaceC792570V7f != null && (config = interfaceC792570V7f.getConfig()) != null) {
            LIZ(config);
        }
    }

    @Override // X.C0V89
    public final synchronized void LJJLJLI(String str, boolean z) {
        C787900UvU.LIZ.LIZJ(new ARunnableS2S1110000_13(this, str, z, 2));
    }

    public static void LIZJ(C0V6Q c0v6q, JSONObject jSONObject, String str) {
        boolean zLIZ = C790620Uzs.LIZ("traffic");
        boolean z = false;
        if (jSONObject.optInt(str, 0) == 1) {
            z = true;
        }
        if (zLIZ || z) {
            boolean z2 = C0V6Y.LIZ;
            if (c0v6q != null) {
                C0VBB.LIZ(c0v6q);
            }
        }
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSampled=");
            sbLIZ.append(zLIZ);
            sbLIZ.append(" + metricEnabled=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LJI(long j, boolean z, boolean z2) {
        if (j > this.LLJJIII.LIZJ) {
            C0V5B.LIZ("APM-TrafficInfo", C786410Ut5.j4("periodTrafficBytes: %d, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2)}));
        }
        if (C792190V5t.LIZ()) {
            C786410Ut5.j4("periodTrafficBytes: %d, isWifi: %b, isFront: %b", new Object[]{Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2)});
        }
    }

    public final void LJIIIZ(String str, Map map, JSONArray jSONArray) {
        if (map != null && map.size() != 0) {
            try {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    JSONObject jSONObjectLIZIZ = ((C0V83) ((Map.Entry) it2.next()).getValue()).LIZIZ(this.LLJJIII.LJII);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObjectLIZIZ.put("traffic_category", str);
                    }
                    jSONArray.put(jSONObjectLIZIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
