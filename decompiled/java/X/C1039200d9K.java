package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d9K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039200d9K {
    public static final /* synthetic */ int LJIILIIL = 0;
    public long LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI = "";
    public int LJIIL = 999999999;

    public final void LIZIZ(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, int i, int i2) {
        String str2;
        int i3;
        JSONObject jSONObject3 = jSONObject2;
        JSONObject jSONObject4 = jSONObject;
        if (this.LIZ == 0 || j <= 0) {
            return;
        }
        String str3 = "load";
        if (this.LIZJ || !this.LIZLLL || this.LJ) {
            str2 = "load";
        } else {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                C1041070dCL.LIZ();
                C1028210crb.LJIILLIIL();
            }
            str2 = "load_finish";
        }
        try {
            EnumC804620VhM enumC804620VhMLJ = C804420Vh2.LJ(C1330760kja.LIZ);
            if (enumC804620VhMLJ == EnumC804620VhM.NONE) {
                return;
            }
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            jSONObject4.put("ac", C804420Vh2.LIZLLL(enumC804620VhMLJ));
            long jCurrentTimeMillis = this.LIZIZ;
            if (jCurrentTimeMillis <= 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long jMin = jCurrentTimeMillis - this.LIZ;
            if (this.LJ) {
                str3 = "load_fail";
            } else {
                if (this.LIZIZ > 0) {
                    str3 = str2;
                }
                if (enumC804620VhMLJ != EnumC804620VhM.WIFI) {
                    if (jMin < 1) {
                        return;
                    }
                } else if (jMin < 1) {
                    return;
                }
                if (jMin <= 0) {
                    return;
                }
                jMin = Math.min(jMin, 90000L);
                jSONObject4.put("duration", jMin);
            }
            if ((str != null || (str = this.LJFF) != null) && !Intrinsics.LJFF("about:blank", str)) {
                jSONObject4.put("is_ad_event", "1");
                jSONObject4.put("tag", "draw_ad");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                jSONObject3.put("next_url", str);
                jSONObject3.put("page_id", this.LJII);
                if (this.LJIIIZ && this.LJIIJ != 1) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                jSONObject3.put("first_page", i3);
                jSONObject3.put("ix_to_externalurl", 0);
                jSONObject3.put("landing_page_style", i);
                jSONObject3.put("duration", jMin);
                jSONObject3.put("render_type", "h5");
                jSONObject3.put("preload_status", -1);
                jSONObject3.put("container_type", "bullet");
                if (TextUtils.equals(str3, "load_finish")) {
                    jSONObject3.put("event_time", i2);
                }
                jSONObject4.put("ad_extra_data", C786410Ut5.J3(jSONObject3));
                if (this.LJIIIIZZ) {
                    return;
                }
                this.LJIIIIZZ = true;
                C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", str3, String.valueOf(j), "", CardStruct.IStatusCode.DEFAULT);
                Iterator<String> itKeys = jSONObject4.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c1022820ciuLJ.LIZJ(jSONObject4.opt(next), next);
                }
                c1022820ciuLJ.LJII();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public final void LIZ(Context context, String str, long j, String str2, JSONObject jSONObject, JSONObject jSONObject2, int i, int i2) {
        EnumC804620VhM enumC804620VhMLJ;
        JSONObject jSONObject3;
        String str3;
        int i3;
        JSONObject jSONObject4 = jSONObject2;
        if (context != null) {
            try {
                if (this.LIZ == 0 || j <= 0 || (enumC804620VhMLJ = C804420Vh2.LJ(context)) == EnumC804620VhM.NONE) {
                    return;
                }
                if (jSONObject != null) {
                    jSONObject3 = jSONObject;
                } else {
                    jSONObject3 = new JSONObject();
                }
                jSONObject3.put("ac", C804420Vh2.LIZLLL(enumC804620VhMLJ));
                long jCurrentTimeMillis = this.LIZIZ;
                if (jCurrentTimeMillis <= 0) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                long j2 = jCurrentTimeMillis - this.LIZ;
                if (enumC804620VhMLJ != EnumC804620VhM.WIFI) {
                    if (j2 < 1) {
                        return;
                    }
                } else if (j2 < 1) {
                    return;
                }
                if (j2 <= 0) {
                    return;
                }
                long jMin = Math.min(j2, 90000L);
                jSONObject3.put("duration", jMin);
                if (str != null) {
                    str3 = str;
                } else {
                    str3 = this.LJFF;
                    if (str3 == null) {
                        return;
                    }
                }
                if (!Intrinsics.LJFF("about:blank", str3)) {
                    jSONObject3.put("is_ad_event", "1");
                    jSONObject3.put("tag", "draw_ad");
                    if (jSONObject4 == null) {
                        jSONObject4 = new JSONObject();
                    }
                    JSONObject jSONObject5 = new JSONObject(C786410Ut5.J3(jSONObject4));
                    jSONObject4.put("next_url", str3);
                    if (this.LJIIIZ && this.LJIIJ != 1) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    jSONObject4.put("first_page", i3);
                    jSONObject4.put("page_id", this.LJII);
                    jSONObject4.put("render_type", "h5");
                    jSONObject4.put("ix_to_externalurl", 0);
                    jSONObject4.put("pct", i);
                    jSONObject4.put("duration", jMin);
                    jSONObject4.put("preload_status", -1);
                    jSONObject4.put("landing_page_style", i2);
                    jSONObject4.put("landing_type", 2);
                    jSONObject3.put("ad_extra_data", C786410Ut5.J3(jSONObject4));
                    ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL();
                    if (iTalentAdRevenueShareServiceLJIIL != null) {
                        iTalentAdRevenueShareServiceLJIIL.LIZLLL(str2, jSONObject);
                    }
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "progress_load_finish", String.valueOf(j), "", CardStruct.IStatusCode.DEFAULT);
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        c1022820ciuLJ.LIZJ(jSONObject3.opt(next), next);
                    }
                    c1022820ciuLJ.LJII();
                    if (C07J2.LIZ() && i == 100 && !this.LIZJ && !this.LIZLLL) {
                        this.LIZIZ = System.currentTimeMillis();
                        this.LIZLLL = true;
                        LIZIZ(str, j, jSONObject, jSONObject5, i2, 2);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
