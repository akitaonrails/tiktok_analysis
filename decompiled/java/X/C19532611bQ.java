package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11bQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19532611bQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1211030hcT LL;
    public final /* synthetic */ InterfaceC19526511aR LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1219340hps LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C19536511c3 LLILZLL;
    public final /* synthetic */ C19530211b2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19532611bQ(C1211030hcT c1211030hcT, InterfaceC19526511aR interfaceC19526511aR, boolean z, InterfaceC1219340hps interfaceC1219340hps, String str, int i, C19536511c3 c19536511c3, C19530211b2 c19530211b2) {
        super(0);
        this.LL = c1211030hcT;
        this.LLILLJJLI = interfaceC19526511aR;
        this.LLILLL = z;
        this.LLILZ = interfaceC1219340hps;
        this.LLILZIL = i;
        this.LLILZLL = c19536511c3;
        this.LLIZ = c19530211b2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue;
        String str;
        Integer numValueOf;
        String str2;
        String str3;
        C11YJ c11yj;
        this.LL.LIZJ();
        InterfaceC19526511aR interfaceC19526511aR = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC19526611aS interfaceC19526611aS : interfaceC19526511aR.LLILIL()) {
            if (interfaceC19526611aS.LJJI()) {
                String str4 = (String) interfaceC19526611aS.LJIIL("res_vc_file_path");
                C19536311c1 c19536311c1 = (C19536311c1) interfaceC19526611aS.LJIIL("voice_change_model");
                if (c19536311c1 != null) {
                    c19536311c1.LJ = str4;
                    arrayList.add(c19536311c1);
                }
            }
        }
        if (this.LLILLL) {
            this.LLILZ.LIZJ(this.LLILZIL, arrayList);
        } else {
            this.LLILZ.LIZLLL(this.LLILZIL, new C19536611c4((Map) null, (List) null, -1, 14));
        }
        C19533011bU c19533011bU = C19533011bU.LIZ;
        C19536511c3 c19536511c3 = this.LLILZLL;
        int i = c19536511c3.LIZ;
        boolean z = this.LLILLL;
        C19530211b2 c19530211b2 = this.LLIZ;
        InterfaceC19526511aR interfaceC19526511aR2 = this.LLILLJJLI;
        double videoLength = ((double) c19536511c3.LIZJ.getVideoLength()) / 1000.0d;
        c19533011bU.getClass();
        ArrayList arrayList2 = new ArrayList();
        C19527211aY c19527211aY = new C19527211aY(new LinkedHashMap());
        C19525411aG c19525411aG = new C19525411aG(new LinkedHashMap());
        C19525711aJ c19525711aJ = new C19525711aJ(new LinkedHashMap());
        C19525511aH c19525511aH = new C19525511aH(new LinkedHashMap());
        C19527311aZ c19527311aZ = new C19527311aZ(new LinkedHashMap());
        C19525811aK c19525811aK = new C19525811aK(new LinkedHashMap());
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC19524811aA<Integer> abstractC19524811aA = new AbstractC19524811aA<Integer>(linkedHashMap) { // from class: X.11aI
            public final Map<String, Integer> LIZIZ;

            {
                super(linkedHashMap);
                this.LIZIZ = linkedHashMap;
            }

            @Override // X.AbstractC19524811aA
            public final void LIZ(InterfaceC19526611aS interfaceC19526611aS2, C19525911aL c19525911aL) {
                int iIntValue2;
                Integer num = (Integer) interfaceC19526611aS2.LJIIL("audio_type");
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                this.LIZIZ.put(interfaceC19526611aS2.LJJ(), Integer.valueOf(iIntValue2));
            }
        };
        arrayList2.add(c19527211aY);
        arrayList2.add(c19525411aG);
        arrayList2.add(c19525711aJ);
        arrayList2.add(c19525511aH);
        arrayList2.add(c19527311aZ);
        arrayList2.add(c19525811aK);
        arrayList2.add(abstractC19524811aA);
        long jLIZ = C19525311aF.LIZ(interfaceC19526511aR2, arrayList2);
        List listLLIIII = C13LP.LLIIII(linkedHashMap.values());
        Integer num = (Integer) C13LP.LJJJLL(listLLIIII);
        if (num == null) {
            iIntValue = -1;
        } else if (listLLIIII.isEmpty()) {
            iIntValue = num.intValue();
        } else {
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).intValue() != num.intValue()) {
                    iIntValue = 3;
                    break;
                }
            }
            iIntValue = num.intValue();
        }
        float size = c19525711aJ.LIZIZ.get("ExtractAudio") != null ? r8.getSecond().size() / r8.getFirst().size() : 0.0f;
        float size2 = c19525711aJ.LIZIZ.get("UploadAudioFile") != null ? r0.getSecond().size() / r0.getFirst().size() : 0.0f;
        float size3 = c19525711aJ.LIZIZ.get("VCCacheCheck") != null ? r9.getSecond().size() / r9.getFirst().size() : 0.0f;
        Long l = c19525411aG.LIZIZ.get("ExtractAudio");
        Long l2 = c19525411aG.LIZIZ.get("FetchVC");
        Long l3 = c19525411aG.LIZIZ.get("UploadAudioFile");
        Long l4 = c19525411aG.LIZIZ.get("DownloadVC");
        Long l5 = c19527211aY.LIZIZ.get("pp_data_key_original_file_size");
        Long l6 = c19527211aY.LIZIZ.get("pp_data_key_extract_file_size");
        Long l7 = c19527211aY.LIZIZ.get("pp_data_key_download_file_size");
        String str5 = c19527311aZ.LIZIZ.get("speaker_id");
        String str6 = c19527311aZ.LIZIZ.get("speaker_name");
        String str7 = c19525811aK.LIZIZ.get("server_log_id");
        C19525111aD c19525111aD = (C19525111aD) C13LP.LJJJLIIL(c19525511aH.LIZIZ.values());
        if (c19525111aD != null) {
            numValueOf = Integer.valueOf(c19525111aD.LIZ);
            str2 = c19525111aD.LIZIZ;
            str3 = c19525111aD.LIZJ;
            str = c19525111aD.LIZLLL;
            c11yj = c19525111aD.LJ;
        } else {
            str = null;
            numValueOf = null;
            str2 = null;
            str3 = null;
            c11yj = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "bizType");
        c2344009Gk.LIZJ(interfaceC19526511aR2.LLILIL().size(), "total_slots_size");
        c2344009Gk.LJFF("effect_name", str6);
        c2344009Gk.LJFF("speakerID", str5);
        c2344009Gk.LIZJ(iIntValue, "process_track");
        c2344009Gk.LIZ(videoLength, "video_duration");
        c2344009Gk.LIZIZ(size, "extract_audio_cache_rate");
        c2344009Gk.LIZIZ(size2, "upload_cache_rate");
        c2344009Gk.LIZIZ(size3, "changed_cache_rate");
        c2344009Gk.LJ(l, "export_duration");
        c2344009Gk.LJ(l3, "upload_duration");
        c2344009Gk.LJ(l2, "fetch_duration");
        c2344009Gk.LJ(l4, "download_duration");
        c2344009Gk.LIZLLL(jLIZ, "total_duration");
        c2344009Gk.LJ(l5, "extract_max_file_length");
        c2344009Gk.LJ(l6, "upload_max_file_length");
        c2344009Gk.LJ(l7, "download_max_file_length");
        c2344009Gk.LJFF("logid", str7);
        if (z) {
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LJFF("error_msg", "");
            c2344009Gk.LJFF("error_sample", "");
            c2344009Gk.LIZJ(0, "pipeline_state_code");
            c2344009Gk.LIZJ(0, "pipeline_error_stage");
        } else if (c19530211b2 == null || c19530211b2.LIZ != -1) {
            c2344009Gk.LIZJ(-2, "pipeline_state_code");
            c2344009Gk.LJ(numValueOf, "error_code");
            c2344009Gk.LJFF("error_msg", str2);
            c2344009Gk.LJ(((LinkedHashMap) C19533011bU.LIZIZ).get(str3), "pipeline_error_stage");
            c2344009Gk.LJFF("error_sample", str);
        } else {
            c2344009Gk.LIZJ(-1, "pipeline_state_code");
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LJFF("error_msg", "cancel by user");
            c2344009Gk.LJ(((LinkedHashMap) C19533011bU.LIZIZ).get(c19530211b2.LIZJ), "pipeline_error_stage");
        }
        C11YX c11yx = new C11YX();
        c11yx.LIZIZ(numValueOf);
        c11yx.LIZJ(str2);
        c11yx.LIZLLL(c11yj);
        c11yx.LJ("voice_conversion_effect");
        if (c11yj == C11YJ.SAMI_SERVER) {
            if (str == null || str.length() == 0) {
                c11yx.LJFF("unknown task id");
                c11yx.LIZ();
            } else {
                c11yx.LJFF(str);
                c11yx.LIZ();
            }
        }
        Map<String, String> map = c2344009Gk.LIZ;
        C19518711Yb c19518711Yb = C19518711Yb.LIZ;
        C11YY c11yyLIZ = c11yx.LIZ();
        c19518711Yb.getClass();
        C19518711Yb.LIZIZ("voice_conversion_effect", map, c11yyLIZ);
        C11YY c11yyLIZ2 = c11yx.LIZ();
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("duration", Long.valueOf(jLIZ));
        if (str3 == null) {
            str3 = "";
        }
        c2241008qG.LIZ.put("error_stage", str3);
        if (str2 == null) {
            str2 = "";
        }
        c2241008qG.LIZ.put("error_detail", str2);
        c2241008qG.LIZ.put("error_code", Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
        C794240VDq.LIZJ("creative_tool_tt_voice_conversion", c2241008qG.LJ());
        C19518711Yb.LIZ(c11yyLIZ2);
        C794240VDq.LIZJ("sami_business_error_mob", C2347509Ht.LIZ(c11yyLIZ2.LIZ));
        return Unit.LIZ;
    }
}
