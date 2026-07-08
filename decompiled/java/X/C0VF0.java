package X;

import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.feed.SampleSceneConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VF0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VF0 implements C0V22, InterfaceC791210V1z, InterfaceC792030V5d {
    public static volatile boolean LLJIJIL;
    public final String LL;
    public long LLILLL;
    public long LLILZ;
    public JSONObject LLILZLL;
    public boolean LLIZLLLIL;
    public long LLILLJJLI = -1;
    public double LLILZIL = -1.0d;
    public final HashMap<String, String> LLIZ = new HashMap<>();
    public final LinkedList<C0VF1> LLJ = new LinkedList<>();
    public final RunnableC585230MxN LLJI = new Runnable() { // from class: X.0MxN
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("FpsReporter@6993.perfectFpsRunnable$1");
            try {
                this.LL.LIZIZ(60.0d);
                this.LL.LIZLLL(new JSONObject());
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("FpsReporter@6993.perfectFpsRunnable$1");
        }
    };

    @Override // X.InterfaceC792030V5d
    public final void LIZ() {
        LLJIJIL = true;
        ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).unregisterConfigListener(this);
        if (this.LLILZLL != null || (true ^ this.LLJ.isEmpty())) {
            LIZJ();
        }
    }

    @Override // X.InterfaceC792030V5d
    public final void LJFF(JSONObject jSONObject, boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VF0.LIZJ():void");
    }

    public final boolean LJ() {
        if (C583330MuJ.LIZ(this.LL)) {
            return true;
        }
        String str = this.LL;
        if (Intrinsics.LJFF(str, "dsp_sub_player_launch") || Intrinsics.LJFF(str, "dsp_launch")) {
            return true;
        }
        SampleSceneConfig sampleSceneConfig = (SampleSceneConfig) C0VF2.LIZ.getValue();
        String str2 = this.LL;
        if (str2 == null) {
            sampleSceneConfig.getClass();
        } else if (sampleSceneConfig.sceneList.contains(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0MxN] */
    public C0VF0(String str) {
        this.LL = str;
    }

    @Override // X.C0V22
    public final void LIZIZ(double d) {
        this.LLILZIL = d;
        C2113808Pw.LIZIZ.LL.removeCallbacks(this.LLJI);
    }

    @Override // X.InterfaceC791210V1z
    public final void LIZLLL(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        this.LLILZLL = jSONObject;
        if (!LLJIJIL && !this.LLIZLLLIL && LJ()) {
            this.LLIZLLLIL = true;
            ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).registerConfigListener(this);
        }
        if (!LLJIJIL && LJ()) {
            if (this.LLILLJJLI > 0 && this.LLILZIL > 0.0d && this.LLILZLL != null) {
                HashMap<String, String> map = this.LLIZ;
                if (C0VT7.LIZ().LIZ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_battery_saver", str);
                try {
                    LinkedList<C0VF1> linkedList = this.LLJ;
                    long j = this.LLILLJJLI;
                    double d = this.LLILZIL;
                    JSONObject jSONObject3 = this.LLILZLL;
                    if (jSONObject3 != null) {
                        jSONObject2 = new JSONObject();
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject2.put(next, jSONObject3.get(next));
                        }
                    } else {
                        jSONObject2 = new JSONObject();
                    }
                    HashMap<String, String> map2 = this.LLIZ;
                    HashMap map3 = new HashMap(map2.size());
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        map3.put(entry.getKey(), entry.getValue());
                    }
                    C189200o6.m2constructorimpl(Boolean.valueOf(linkedList.add(new C0VF1(j, d, jSONObject2, map3, this.LLILLL, this.LLILZ))));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            this.LLIZ.clear();
            this.LLILLJJLI = -1L;
            this.LLILZIL = -1.0d;
            this.LLILZLL = null;
            this.LLILLL = 0L;
            this.LLILZ = 0L;
            return;
        }
        LIZJ();
    }
}
