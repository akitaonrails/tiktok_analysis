package Y;

import X.C0WZX;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1B72;
import X.C1BS0;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2204971BRn;
import X.C2204981BRo;
import X.C2205091BRz;
import X.C2248531Czb;
import X.C2248581Czg;
import X.C2248641Czm;
import X.C290940Bam;
import X.EnumC1250000idK;
import X.InterfaceC2205021BRs;
import com.bytedance.scene.Scene;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS281S0000000_34;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS6S0401000_34 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public final void LIZ$0() {
        IDownloadListener iDownloadListener = (IDownloadListener) this.l0;
        if (iDownloadListener != null) {
            int i = this.i4;
            if (i == -3) {
                iDownloadListener.onSuccessed((DownloadInfo) this.l1);
                ((DownloadTask) this.l2).removeCallback((C1B72) this.l3, (IDownloadListener) this.l0);
            } else if (i == -1) {
                iDownloadListener.onFailed((DownloadInfo) this.l1, new BaseException(LSPassThroughRecordSizeConfig.DEFAULT, "try add listener for failed task"));
                ((DownloadTask) this.l2).removeCallback((C1B72) this.l3, (IDownloadListener) this.l0);
            }
        }
    }

    public final void LIZ$2() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2248581Czg c2248581Czg = (C2248581Czg) this.l0;
        C2248531Czb c2248531Czb = (C2248531Czb) this.l1;
        List list = (List) this.l2;
        int i = this.i4;
        C2248641Czm c2248641Czm = (C2248641Czm) this.l3;
        jSONObject.put("notice_id", c2248581Czg.LIZJ.LIZ());
        c2248531Czb.getClass();
        C2248531Czb.LIZ(jSONObject, c2248581Czg);
        c2248581Czg.LIZJ.LIZIZ.LIZ(jSONObject);
        C2248531Czb.LJI(jSONObject, c2248581Czg, list, i);
        jSONObject.put(Scene.SCENE_SERVICE, c2248581Czg.LIZJ.LIZJ.getValue());
        jSONObject.put("is_reduce", c2248581Czg.LIZJ.LIZLLL.getValue());
        jSONObject.put("notice_show_duration", System.currentTimeMillis() - c2248641Czm.LIZ);
        EnumC1250000idK enumC1250000idK = c2248581Czg.LJI;
        if (enumC1250000idK != null) {
            jSONObject.put("disappear_reason", enumC1250000idK.getReason());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C2248581Czg) this.l0).LIZJ.LIZ());
        sbLIZ.append("] ttinfra_reddot_disappear: ");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        C20684815ws.LJIJ("ttinfra_reddot_disappear", jSONObject);
    }

    public final void LIZ$1() throws Throwable {
        LatLngBounds latLngBounds;
        if (C290940Bam.LIZ()) {
            C2204971BRn c2204971BRn = new C2204971BRn();
            C1177960gl8 c1177960gl8 = (C1177960gl8) this.l0;
            C2204971BRn c2204971BRnLLLLLLZZ = C2204961BRm.LLLLLLZZ(c2204971BRn, new LatLng(c1177960gl8.lat, c1177960gl8.lon), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
            C1177960gl8 c1177960gl82 = (C1177960gl8) this.l1;
            latLngBounds = C2204961BRm.LLLLLLZZ(c2204971BRnLLLLLLZZ, new LatLng(c1177960gl82.lat, c1177960gl82.lon), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null)).LIZ();
        } else {
            latLngBounds = new LatLngBounds(new LatLng(((C1177960gl8) this.l1).lat, ((C1177960gl8) this.l0).lon), new LatLng(((C1177960gl8) this.l0).lat, ((C1177960gl8) this.l1).lon));
        }
        C2204981BRo c2204981BRoLLLLLLL = C2204961BRm.LLLLLLL(latLngBounds, this.i4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
        final C1178480gly c1178480gly = (C1178480gly) this.l2;
        final C1BS0 c1bs0 = (C1BS0) this.l3;
        InterfaceC2205021BRs interfaceC2205021BRs = new InterfaceC2205021BRs() { // from class: X.1BRx
            /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.InterfaceC2205021BRs
            public final void LIZLLL() {
                ?? r0;
                C1178480gly c1178480gly2 = c1178480gly;
                if (c1178480gly2 != null && (r0 = c1178480gly2.LIZJ) != 0) {
                    r0.invoke();
                }
                c1bs0.LIZLLL = false;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.InterfaceC2205021BRs
            public final void onCancel() {
                ?? r0;
                C1178480gly c1178480gly2 = c1178480gly;
                if (c1178480gly2 != null && (r0 = c1178480gly2.LIZLLL) != 0) {
                    r0.invoke();
                }
                c1bs0.LIZLLL = false;
            }
        };
        if (c1178480gly != null) {
            if (c1178480gly.LIZ && (!c1bs0.LIZLLL)) {
                c1bs0.LIZLLL = true;
                c1bs0.LJIL(c2204981BRoLLLLLLL, c1178480gly.LIZIZ, interfaceC2205021BRs);
                return;
            } else if (c1178480gly.LIZ && c1bs0.LIZLLL) {
                C2205091BRz c2205091BRz = C2205091BRz.LIZ;
                c2205091BRz.getClass();
                c2205091BRz.LIZJ("google_map_anim_camera_recall", AFwS281S0000000_34.get$arr$(61));
            }
        }
        c1bs0.LJJ(c2204981BRoLLLLLLL);
    }

    public static final void run$0(ARunnableS6S0401000_34 aRunnableS6S0401000_34) {
        boolean zLIZ;
        C1C7U.LIZ("AbsDownloadEngine@9f1b.addDownloadListener$1");
        try {
            aRunnableS6S0401000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsDownloadEngine@9f1b.addDownloadListener$1");
    }

    public static final void run$1(ARunnableS6S0401000_34 aRunnableS6S0401000_34) {
        boolean zLIZ;
        C1C7U.LIZ("GoogleMapHandler@f4b9.moveCamera$2");
        try {
            aRunnableS6S0401000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GoogleMapHandler@f4b9.moveCamera$2");
    }

    public static final void run$2(ARunnableS6S0401000_34 aRunnableS6S0401000_34) {
        boolean zLIZ;
        C1C7U.LIZ("RedDotMobReporter@a285.reportRedDotDisappear$1");
        try {
            aRunnableS6S0401000_34.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RedDotMobReporter@a285.reportRedDotDisappear$1");
    }

    public ARunnableS6S0401000_34(C1177960gl8 c1177960gl8, C1177960gl8 c1177960gl82, C1178480gly c1178480gly, C1BS0 c1bs0, int i) {
        this.$t = i;
        this.l0 = c1177960gl8;
        this.l1 = c1177960gl82;
        this.i4 = 0;
        this.l2 = c1178480gly;
        this.l3 = c1bs0;
    }

    public ARunnableS6S0401000_34(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i4 = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
