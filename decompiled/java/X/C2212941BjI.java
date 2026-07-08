package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212941BjI extends C2212981BjM {
    public final /* synthetic */ C2212201Bi6 LIZIZ;
    public final /* synthetic */ C2212931BjH LIZJ;

    @Override // X.InterfaceC1473480oRm
    public final void LIZ(boolean z) {
        Object obj;
        int i = 2;
        this.LIZJ.LJII(2);
        C2212931BjH c2212931BjH = this.LIZJ;
        c2212931BjH.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", c2212931BjH.LLJLIL.LLJ);
            jSONObject.put("show_type", "not_real_time");
            int i2 = C2212231Bi9.LJJIJIIJI;
            if (i2 != -1) {
                if (i2 == 1) {
                    i = 1;
                }
                jSONObject.put("awemelaunch", i);
            }
            jSONObject.put("load_type", c2212931BjH.LLJLIL.LLJLILLLLZIIL);
            if (C2212161Bi2.LJIJI(c2212931BjH.LLJLIL)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_topview", obj);
            jSONObject.put("ad_sequence", C2212141Bi0.LJIIIIZZ().LJIIJJI());
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            if (!C1293990jmH.LIZ(c2212931BjH.LLJLIL.LLJJIJI)) {
                jSONObject2.put("log_extra", c2212931BjH.LLJLIL.LLJJIJI);
            }
            jSONObject2.put("ad_fetch_time", c2212931BjH.LLJLIL.LLILLJJLI);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject2 = null;
        }
        C2212051Bhr.LIZJ().LJFF("splash_ad", "play", jSONObject2, c2212931BjH.LLJLIL.LLJI);
        if (c2212931BjH.LLJLIL.LLJLIL != null) {
            C2213281Bjq value = C2213281Bjq.LIZJ.getValue();
            C2212201Bi6 c2212201Bi6 = c2212931BjH.LLJLIL;
            value.LIZ(null, c2212201Bi6.LLJI, c2212201Bi6.LLJLIL.LIZ, c2212201Bi6.LLJJIJI, true, -1L, null);
        }
        this.LIZJ.LLJJLIIIJLLLLLLLZ = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2212931BjH c2212931BjH2 = this.LIZJ;
        long j = jCurrentTimeMillis - c2212931BjH2.LLLIIL;
        C2212201Bi6 c2212201Bi62 = this.LIZIZ;
        c2212931BjH2.LLLII.LJFF();
        int iLIZJ = (int) C1293980jmG.LIZJ(C2212161Bi2.LJIILL(this.LIZIZ.LLJLIL));
        C2212151Bi1 c2212151Bi1 = c2212201Bi62.LLJLIL;
        HashMap<String, Object> map = new HashMap<>();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c2212151Bi1.LJFF);
        sbLIZ.append("x");
        sbLIZ.append(c2212151Bi1.LJ);
        map.put("video_density", C2188811AlT.LIZIZ(sbLIZ));
        map.put("display_density", c2212201Bi62.LLLLILI);
        map.put("is_tt_player", "1");
        map.put("is_encrypt", CardStruct.IStatusCode.DEFAULT);
        map.put("is_nssr", CardStruct.IStatusCode.DEFAULT);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(iLIZJ);
        sbLIZ2.append("");
        map.put("cache_size", C2188811AlT.LIZIZ(sbLIZ2));
        map.put("is_h265", CardStruct.IStatusCode.DEFAULT);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(j);
        sbLIZ3.append("");
        map.put("render_duration", C2188811AlT.LIZIZ(sbLIZ3));
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi62, 0L, "splash_video_quality", null, map);
        InterfaceC2213031BjR interfaceC2213031BjRLJFF = C2212231Bi9.LJFF();
        long duration = this.LIZJ.LLLII.getDuration();
        this.LIZJ.LLLII.getVolume();
        this.LIZJ.LLLII.LJIIJ();
        interfaceC2213031BjRLJFF.LJIIIZ(duration);
    }

    @Override // X.InterfaceC1473480oRm
    public final void LIZLLL(int i) {
        this.LIZJ.LLLIIL = System.currentTimeMillis();
        C2212201Bi6 c2212201Bi6 = this.LIZIZ;
        if (c2212201Bi6.LLJJIJIL == 1) {
            this.LIZJ.LJIIIZ(c2212201Bi6.LJII());
        } else {
            this.LIZJ.LJIIIZ(i);
        }
    }

    public C2212941BjI(C2212931BjH c2212931BjH, C2212201Bi6 c2212201Bi6) {
        this.LIZJ = c2212931BjH;
        this.LIZIZ = c2212201Bi6;
    }

    @Override // X.InterfaceC1473480oRm
    public final void LIZIZ(int i, int i2) {
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            long j = i;
            jSONObject.put("duration", Long.toString(j));
            jSONObject.put("percent", C199635139d.LIZ(j, i2));
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("category", "umeng");
            jSONObject.put("ad_fetch_time", this.LIZIZ.LLILLJJLI);
            jSONObject.put("break_reason", this.LIZJ.LLJJJJLIIL);
            if (!C1293990jmH.LIZ(this.LIZIZ.LLJJIJI)) {
                jSONObject.put("log_extra", this.LIZIZ.LLJJIJI);
            }
            jSONObject2.put("break_reason", this.LIZJ.LLJJJJLIIL);
            jSONObject2.put("load_type", this.LIZIZ.LLJLILLLLZIIL);
            if (!C2212161Bi2.LJIJI(this.LIZIZ)) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject2.put("is_topview", str);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        C2212051Bhr.LIZJ().LJFF("splash_ad", "play_break", jSONObject, this.LIZIZ.LLJI);
    }

    @Override // X.InterfaceC1473480oRm
    public final void LJ(int i, boolean z) {
        Object obj;
        this.LIZJ.LLLII.LJFF();
        int iLIZLLL = this.LIZJ.LLLII.LIZLLL();
        if (C2212231Bi9.LJIIIIZZ().LJIIJ) {
            this.LIZJ.LJIIJ(true);
            return;
        }
        C2212981BjM.LJI(i, this.LIZIZ);
        C2212201Bi6 c2212201Bi6 = this.LIZIZ;
        if (c2212201Bi6.LLJLIL != null) {
            C2213281Bjq.LIZJ.getValue().LIZLLL(null, c2212201Bi6.LLJI, c2212201Bi6.LLJLIL.LIZIZ, c2212201Bi6.LLJJIJI, true, -1L, null);
        }
        C2212201Bi6 c2212201Bi62 = this.LIZIZ;
        int iLIZJ = (int) C1293980jmG.LIZJ(C2212161Bi2.LJIILL(c2212201Bi62.LLJLIL));
        boolean z2 = this.LIZJ.LLJJLIIIJLLLLLLLZ;
        long j = i;
        C2212151Bi1 c2212151Bi1 = c2212201Bi62.LLJLIL;
        HashMap<String, Object> map = new HashMap<>();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c2212151Bi1.LJFF);
        sbLIZ.append("x");
        sbLIZ.append(c2212151Bi1.LJ);
        map.put("video_density", C2188811AlT.LIZIZ(sbLIZ));
        map.put("display_density", c2212201Bi62.LLLLILI);
        String str = "1";
        map.put("is_tt_player", "1");
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_encrypt", obj);
        map.put("is_nssr", CardStruct.IStatusCode.DEFAULT);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(iLIZJ);
        sbLIZ2.append("");
        map.put("cache_size", C2188811AlT.LIZIZ(sbLIZ2));
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("play_success", str);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(j);
        sbLIZ3.append("");
        map.put("duration", C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(100);
        sbLIZ4.append("");
        map.put("percent", C2188811AlT.LIZIZ(sbLIZ4));
        map.put("is_h265", CardStruct.IStatusCode.DEFAULT);
        map.put("sr_error_code", Integer.valueOf(iLIZLLL));
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi62, 0L, "splash_video_end", null, map);
        ((C2212921BjG) this.LIZJ.LLJLILLLLZIIL).LJFF(this.LIZIZ);
        ((C2212921BjG) this.LIZJ.LLJLILLLLZIIL).LJ();
    }

    @Override // X.InterfaceC1473480oRm
    public final void LIZJ(int i, String str, boolean z) {
        C2212201Bi6 c2212201Bi6 = this.LIZIZ;
        C2212931BjH c2212931BjH = this.LIZJ;
        c2212931BjH.getClass();
        c2212931BjH.LLLII.LJFF();
        int iLIZJ = (int) C1293980jmG.LIZJ(C2212161Bi2.LJIILL(this.LIZIZ.LLJLIL));
        boolean z2 = this.LIZJ.LLJJLIIIJLLLLLLLZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ.LLJL;
        C2212151Bi1 c2212151Bi1 = c2212201Bi6.LLJLIL;
        HashMap<String, Object> map = new HashMap<>();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c2212151Bi1.LJFF);
        sbLIZ.append("x");
        sbLIZ.append(c2212151Bi1.LJ);
        map.put("video_density", C2188811AlT.LIZIZ(sbLIZ));
        map.put("display_density", c2212201Bi6.LLLLILI);
        String str2 = "1";
        map.put("is_tt_player", "1");
        map.put("is_encrypt", CardStruct.IStatusCode.DEFAULT);
        map.put("is_nssr", CardStruct.IStatusCode.DEFAULT);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(iLIZJ);
        sbLIZ2.append("");
        map.put("cache_size", C2188811AlT.LIZIZ(sbLIZ2));
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("play_success", str2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(jCurrentTimeMillis);
        sbLIZ3.append("");
        map.put("duration", C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(100);
        sbLIZ4.append("");
        map.put("percent", C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(i);
        sbLIZ5.append("");
        map.put("errorCode", C2188811AlT.LIZIZ(sbLIZ5));
        map.put("errorDesc", str);
        map.put("is_h265", CardStruct.IStatusCode.DEFAULT);
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, "splash_video_failed", new HashMap<>(), map);
        ((C2212921BjG) this.LIZJ.LLJLILLLLZIIL).LIZJ();
    }

    public final void LJII(int i, int i2, String str) {
        String str2 = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            long j = i2;
            jSONObject.put("duration", Long.toString(j));
            jSONObject.put("percent", C199635139d.LIZ(i, j));
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", this.LIZIZ.LLILLJJLI);
            jSONObject2.put("load_type", this.LIZIZ.LLJLILLLLZIIL);
            if (!C2212161Bi2.LJIJI(this.LIZIZ)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject2.put("is_topview", str2);
            if (!TextUtils.isEmpty(this.LIZIZ.LLJJIJI)) {
                jSONObject.put("log_extra", this.LIZIZ.LLJJIJI);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C2212051Bhr.LIZJ().LJFF("splash_ad", str, jSONObject, this.LIZIZ.LLJI);
    }
}
