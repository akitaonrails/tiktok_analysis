package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19532711bR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1211030hcT LL;
    public final /* synthetic */ InterfaceC19526511aR LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1219340hps LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C19530211b2 LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19532711bR(C1211030hcT c1211030hcT, InterfaceC19526511aR interfaceC19526511aR, boolean z, InterfaceC1219340hps interfaceC1219340hps, String str, int i, C19530211b2 c19530211b2, int i2) {
        super(0);
        this.LL = c1211030hcT;
        this.LLILLJJLI = interfaceC19526511aR;
        this.LLILLL = z;
        this.LLILZ = interfaceC1219340hps;
        this.LLILZIL = i;
        this.LLILZLL = c19530211b2;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        C11YJ c11yj;
        this.LL.LIZJ();
        InterfaceC19526511aR interfaceC19526511aR = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC19526611aS interfaceC19526611aS : interfaceC19526511aR.LLILIL()) {
            if (interfaceC19526611aS.LJJI()) {
                String str4 = (String) interfaceC19526611aS.LJIIL("res_vc_file_path");
                List<? extends List<Double>> list = (List) interfaceC19526611aS.LJIIL("time_warp");
                C19536311c1 c19536311c1 = (C19536311c1) interfaceC19526611aS.LJIIL("voice_change_model");
                if (c19536311c1 != null) {
                    c19536311c1.LJ = str4;
                    c19536311c1.LJFF = list;
                    arrayList.add(c19536311c1);
                }
            }
        }
        if (this.LLILLL) {
            this.LLILZ.LIZJ(this.LLILZIL, arrayList);
        } else {
            this.LLILZ.LIZLLL(this.LLILZIL, new C19536611c4((Map) null, (List) null, -1, 14));
        }
        C19533111bV c19533111bV = C19533111bV.LIZ;
        boolean z = this.LLILLL;
        C19530211b2 c19530211b2 = this.LLILZLL;
        InterfaceC19526511aR interfaceC19526511aR2 = this.LLILLJJLI;
        int i = this.LLIZ;
        c19533111bV.getClass();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C19527211aY c19527211aY = new C19527211aY(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C19525411aG c19525411aG = new C19525411aG(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C19525711aJ c19525711aJ = new C19525711aJ(linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        C19525511aH c19525511aH = new C19525511aH(linkedHashMap4);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        C19527311aZ c19527311aZ = new C19527311aZ(linkedHashMap5);
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        C19525811aK c19525811aK = new C19525811aK(linkedHashMap6);
        arrayList2.add(c19527211aY);
        arrayList2.add(c19525411aG);
        arrayList2.add(c19525711aJ);
        arrayList2.add(c19525511aH);
        arrayList2.add(c19527311aZ);
        arrayList2.add(c19525811aK);
        long jLIZ = C19525311aF.LIZ(interfaceC19526511aR2, arrayList2);
        float size = ((Pair) linkedHashMap3.get("ExtractAudio")) != null ? ((Set) r8.getSecond()).size() / ((Set) r8.getFirst()).size() : 0.0f;
        float size2 = ((Pair) linkedHashMap3.get("UploadAudioFile")) != null ? ((Set) r11.getSecond()).size() / ((Set) r11.getFirst()).size() : 0.0f;
        float size3 = ((Pair) linkedHashMap3.get("SCCacheCheck")) != null ? ((Set) r10.getSecond()).size() / ((Set) r10.getFirst()).size() : 0.0f;
        Object obj = linkedHashMap2.get("ExtractAudio");
        Object obj2 = linkedHashMap2.get("FetchSC");
        Object obj3 = linkedHashMap2.get("UploadAudioFile");
        Object obj4 = linkedHashMap2.get("DownloadSC");
        Object obj5 = linkedHashMap.get("pp_data_key_extract_file_size");
        Object obj6 = linkedHashMap.get("pp_data_key_download_file_size");
        String str5 = (String) linkedHashMap5.get("speaker_id");
        String str6 = (String) linkedHashMap5.get("speaker_name");
        String str7 = (String) linkedHashMap6.get("server_log_id");
        C19525111aD c19525111aD = (C19525111aD) C13LP.LJJJLIIL(linkedHashMap4.values());
        if (c19525111aD != null) {
            numValueOf = Integer.valueOf(c19525111aD.LIZ);
            str = c19525111aD.LIZIZ;
            str2 = c19525111aD.LIZJ;
            str3 = c19525111aD.LIZLLL;
            c11yj = c19525111aD.LJ;
        } else {
            numValueOf = null;
            str = null;
            str2 = null;
            str3 = null;
            c11yj = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("effect_name", str6);
        c2344009Gk.LJFF("speakerID", str5);
        c2344009Gk.LIZJ(i, "video_duration");
        c2344009Gk.LIZIZ(size, "extract_audio_cache_rate");
        c2344009Gk.LIZIZ(size2, "upload_cache_rate");
        c2344009Gk.LIZIZ(size3, "changed_cache_rate");
        c2344009Gk.LJ(obj, "export_duration");
        c2344009Gk.LJ(obj3, "upload_duration");
        c2344009Gk.LJ(obj2, "fetch_duration");
        c2344009Gk.LJ(obj4, "download_duration");
        c2344009Gk.LIZLLL(jLIZ, "total_duration");
        c2344009Gk.LJ(obj5, "upload_file_length");
        c2344009Gk.LJ(obj6, "download_file_length");
        c2344009Gk.LJFF("logid", str7);
        if (z) {
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LJFF("error_msg", "");
            c2344009Gk.LIZJ(0, "pipeline_state_code");
            c2344009Gk.LIZJ(0, "pipeline_error_stage");
        } else if (c19530211b2 == null || c19530211b2.LIZ != -1) {
            c2344009Gk.LIZJ(-2, "pipeline_state_code");
            c2344009Gk.LJ(numValueOf, "error_code");
            c2344009Gk.LJFF("error_msg", str);
            c2344009Gk.LJFF("pipeline_error_stage", (String) ((LinkedHashMap) C19533111bV.LIZIZ).get(str2));
        } else {
            c2344009Gk.LIZJ(-1, "pipeline_state_code");
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LJFF("error_msg", "cancel by user");
            c2344009Gk.LJFF("pipeline_error_stage", (String) ((LinkedHashMap) C19533111bV.LIZIZ).get(c19530211b2.LIZJ));
        }
        C11YX c11yx = new C11YX();
        c11yx.LIZIZ(numValueOf);
        c11yx.LIZJ(str);
        c11yx.LIZLLL(c11yj);
        c11yx.LJ("style_conversion_effect");
        if (c11yj == C11YJ.SAMI_SERVER) {
            if (str3 == null) {
                str3 = "unknown task id";
            }
            c11yx.LJFF(str3);
        }
        Map<String, String> map = c2344009Gk.LIZ;
        C19518711Yb c19518711Yb = C19518711Yb.LIZ;
        C11YY c11yyLIZ = c11yx.LIZ();
        c19518711Yb.getClass();
        C19518711Yb.LIZIZ("style_conversion_effect", map, c11yyLIZ);
        C11YY c11yyLIZ2 = c11yx.LIZ();
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("duration", Long.valueOf(jLIZ));
        if (str2 == null) {
            str2 = "";
        }
        c2241008qG.LIZ.put("error_stage", str2);
        c2241008qG.LIZ.put("error_detail", str != null ? str : "");
        c2241008qG.LIZ.put("error_code", Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
        C794240VDq.LIZJ("creative_tool_tt_style_conversion", c2241008qG.LJ());
        C19518711Yb.LIZ(c11yyLIZ2);
        C794240VDq.LIZJ("sami_business_error_mob", C2347509Ht.LIZ(c11yyLIZ2.LIZ));
        return Unit.LIZ;
    }
}
