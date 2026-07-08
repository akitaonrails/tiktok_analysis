package Y;

import X.C1389880mGw;
import X.C1389890mGx;
import X.C1619880sFu;
import X.C1779306xz;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2251708rz;
import X.C2344009Gk;
import X.C2355109Kr;
import X.C586580MzY;
import X.C612370O0d;
import X.C793770VBv;
import X.C794240VDq;
import X.C797930VRv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.homepage.TiktokBaseMainHelper;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS28S0110000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playUrl", JsonParseUtils.LJ(((Video) this.l0).getPlayAddrBytevc1()));
            C586580MzY.LIZIZ(jSONObject);
            File fileLIZ = C2355109Kr.LIZ();
            if (fileLIZ == null) {
                string = "";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(fileLIZ.getPath());
                sbLIZ.append("/");
                C2251708rz c2251708rz = C2251708rz.LIZ;
                String uri = ((Video) this.l0).getProperPlayAddr().getUri();
                c2251708rz.getClass();
                sbLIZ.append(C2251708rz.LIZ(uri));
                string = new C612370O0d(C2188811AlT.LIZIZ(sbLIZ)).toString();
            }
            jSONObject.put("file", string);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i = !this.z1 ? 1 : 0;
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_media_bytevc1_error_rate", i, jSONObject);
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1619880sFu c1619880sFu = (C1619880sFu) this.l0;
        boolean z = this.z1;
        c2344009Gk.LJFF("enter_from", c1619880sFu.LIZLLL);
        c2344009Gk.LJFF("enter_method", z ? "feature_disable_user" : "feature_new_user");
        c2344009Gk.LJFF("group_id", c1619880sFu.LIZJ);
        C20684815ws.LJIILLIIL("playback_speed_guide_toast", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS28S0110000_9 aRunnableS28S0110000_9) {
        PlayerController playerController = (PlayerController) aRunnableS28S0110000_9.l0;
        boolean z = aRunnableS28S0110000_9.z1;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onPageScroll$1L");
        playerController.M(1, null, !z, C1779306xz.LJIIJJI());
        C1C7U.LIZIZ("PlayerController@7763.onPageScroll$1L");
    }

    public static final void run$1(ARunnableS28S0110000_9 aRunnableS28S0110000_9) {
        boolean zLIZ;
        C1C7U.LIZ("TiktokBaseMainHelper@f503.onBackPressedContinuous$1");
        try {
            if (aRunnableS28S0110000_9.z1) {
                C1389880mGw c1389880mGw = new C1389880mGw(((TiktokBaseMainHelper) aRunnableS28S0110000_9.l0).LIZ);
                c1389880mGw.LJIIIIZZ(2131827243);
                c1389880mGw.LJIIJ();
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(((TiktokBaseMainHelper) aRunnableS28S0110000_9.l0).LIZ);
                c1389890mGx.LJIIIZ(2131827243);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TiktokBaseMainHelper@f503.onBackPressedContinuous$1");
    }

    public static final void run$2(ARunnableS28S0110000_9 aRunnableS28S0110000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerMonitorUtil@47e8.monitorBytevc1Play$1");
        try {
            aRunnableS28S0110000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerMonitorUtil@47e8.monitorBytevc1Play$1");
    }

    public static final void run$3(ARunnableS28S0110000_9 aRunnableS28S0110000_9) {
        boolean zLIZ;
        C1C7U.LIZ("EdgeSpeedupGuideController@e9dd.mobShowGuide$1");
        try {
            aRunnableS28S0110000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EdgeSpeedupGuideController@e9dd.mobShowGuide$1");
    }

    public static final void run$4(ARunnableS28S0110000_9 aRunnableS28S0110000_9) {
        boolean zLIZ;
        C1C7U.LIZ("ColdCacheFetchFeedOpt@d703.suppleStartCache$1");
        try {
            C797930VRv.LIZIZ("suppleStartCache");
            ((IFeedCacheLoaderService) aRunnableS28S0110000_9.l0).LJFF(aRunnableS28S0110000_9.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ColdCacheFetchFeedOpt@d703.suppleStartCache$1");
    }

    public ARunnableS28S0110000_9(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
