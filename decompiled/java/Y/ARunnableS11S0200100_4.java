package Y;

import X.C1C7U;
import X.C292750Bdh;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS11S0200100_4 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        Object objInvoke = ((Function0) this.l0).invoke();
        String str = objInvoke instanceof String ? (String) objInvoke : null;
        Long l = (Long) ((HashMap) ((C292750Bdh) this.l1).LIZIZ).get((str == null || !a0.LJJIIZI(str, "lynx", false)) ? objInvoke : "lynx");
        long jLongValue = l != null ? l.longValue() : 0L;
        JSONObject jSONObject = new JSONObject();
        long j = this.j2;
        C292750Bdh c292750Bdh = (C292750Bdh) this.l1;
        String string = objInvoke.toString();
        jSONObject.put("type", string);
        jSONObject.put("cost", j);
        jSONObject.put("create_cost", jLongValue);
        jSONObject.put("first_bind", ((HashSet) c292750Bdh.LIZJ).add(string));
        AppLogNewUtils.onEventV3("search_card_monitor", jSONObject);
    }

    public final void LIZ$1() throws JSONException {
        Object obj = this.l0;
        String str = obj instanceof String ? (String) obj : null;
        Long l = (Long) ((HashMap) ((C292750Bdh) this.l1).LIZIZ).get((str == null || !a0.LJJIIZI(str, "lynx", false)) ? this.l0 : "lynx");
        long jLongValue = l != null ? l.longValue() : 0L;
        JSONObject jSONObject = new JSONObject();
        Object obj2 = this.l0;
        long j = this.j2;
        C292750Bdh c292750Bdh = (C292750Bdh) this.l1;
        String string = obj2.toString();
        jSONObject.put("type", string);
        jSONObject.put("cost", j);
        jSONObject.put("create_cost", jLongValue);
        jSONObject.put("first_bind", ((HashSet) c292750Bdh.LIZJ).add(string));
        AppLogNewUtils.onEventV3("search_card_monitor", jSONObject);
    }

    public static final void run$0(ARunnableS11S0200100_4 aRunnableS11S0200100_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchCardMonitor@506d.bindHolderEnd$1");
        try {
            aRunnableS11S0200100_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchCardMonitor@506d.bindHolderEnd$1");
    }

    public static final void run$1(ARunnableS11S0200100_4 aRunnableS11S0200100_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchCardMonitor@506d.bindHolderEnd$2");
        try {
            aRunnableS11S0200100_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchCardMonitor@506d.bindHolderEnd$2");
    }

    public static final void run$2(ARunnableS11S0200100_4 aRunnableS11S0200100_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchCardMonitor@506d.createHolderEnd$1");
        try {
            ((HashMap) ((C292750Bdh) aRunnableS11S0200100_4.l0).LIZIZ).put(((Function0) aRunnableS11S0200100_4.l1).invoke(), Long.valueOf(aRunnableS11S0200100_4.j2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchCardMonitor@506d.createHolderEnd$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS11S0200100_4(long r2, X.C292750Bdh r4, kotlin.jvm.functions.Function0 r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto Lf
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.j2 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.j2 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S0200100_4.<init>(long, X.0Bdh, kotlin.jvm.functions.Function0, int):void");
    }

    public ARunnableS11S0200100_4(Object obj, C292750Bdh c292750Bdh, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = c292750Bdh;
        this.j2 = j;
    }
}
