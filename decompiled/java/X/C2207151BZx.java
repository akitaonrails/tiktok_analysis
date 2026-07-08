package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207151BZx {
    public static final C818460W8u LIZ = new InterfaceC2207141BZw() { // from class: X.0W8u
        public final C818470W8v LIZ = new C818470W8v();
        public final C790690Uzz LIZIZ = new Object() { // from class: X.0Uzz
        };
        public final C01GW LIZJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 169));
        public String LIZLLL;
        public long LJ;
        public boolean LJFF;

        public static String LIZJ(String str) {
            List<String> listSplit;
            if (TextUtils.isEmpty(str) || str == null || (listSplit = new Regex("\\.").split(str, 0)) == null || listSplit.isEmpty()) {
                return "unknown";
            }
            return (String) ListProtector.get(listSplit, listSplit.size() - 1);
        }

        @Override // X.InterfaceC2207141BZw
        public final void LIZ(Activity activity) {
            this.LIZLLL = activity.getClass().getName();
            this.LJ = System.currentTimeMillis();
            this.LJFF = true;
        }

        @Override // X.InterfaceC2207141BZw
        public final void onActivityDestroyed(Activity activity) {
            if (!TextUtils.isEmpty(this.LIZLLL) && this.LJFF && this.LJ != 0 && TextUtils.equals(activity.getClass().getName(), this.LIZLLL)) {
                LIZLLL(LIZJ(this.LIZLLL), C0W93.CANCEL, 0L);
                this.LJFF = false;
            }
        }

        @Override // X.InterfaceC2207141BZw
        public final void LIZIZ(Activity activity, boolean z) {
            if (z && !TextUtils.isEmpty(this.LIZLLL) && this.LJFF && this.LJ != 0 && TextUtils.equals(activity.getClass().getName(), this.LIZLLL)) {
                final String strLIZJ = LIZJ(this.LIZLLL);
                final long jCurrentTimeMillis = System.currentTimeMillis() - this.LJ;
                final C790690Uzz c790690Uzz = this.LIZIZ;
                if (c790690Uzz != null) {
                    C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0Uzy
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MonitorServiceStat@d680.report$1");
                            try {
                                C790690Uzz c790690Uzz2 = c790690Uzz;
                                String str = strLIZJ;
                                long j = jCurrentTimeMillis;
                                c790690Uzz2.getClass();
                                if (C2548409yk.LIZ && C790620Uzs.LIZ.getLogTypeSwitch("prf_page_start_time")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(Scene.SCENE_SERVICE, str);
                                    jSONObject.put("load_time", j);
                                    C20684815ws.LJIJ("prf_page_start_time", jSONObject);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MonitorServiceStat@d680.report$1");
                        }
                    });
                }
                LIZLLL(strLIZJ, C0W93.SUCCESS, jCurrentTimeMillis);
                this.LJFF = false;
            }
        }

        public final void LIZLLL(String str, C0W93 c0w93, long j) {
            String str2;
            C818470W8v c818470W8v;
            if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) this.LIZJ.getValue()).containsKey(str) && (str2 = (String) ((ConcurrentHashMap) this.LIZJ.getValue()).get(str)) != null && (c818470W8v = this.LIZ) != null) {
                C823050WQl.LIZIZ().execute(new RunnableC818500W8y(c818470W8v, str2, c0w93, j, null));
            }
        }
    };
    public static InterfaceC2207161BZy LIZIZ;
}
