package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11bS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19532811bS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC1219270hpl LLILLJJLI;
    public final /* synthetic */ C19536511c3 LLILLL;
    public final /* synthetic */ C19530211b2 LLILZ;
    public final /* synthetic */ InterfaceC19526511aR LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19532811bS(boolean z, InterfaceC1219270hpl interfaceC1219270hpl, C19536511c3 c19536511c3, C19530211b2 c19530211b2, InterfaceC19526511aR interfaceC19526511aR) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = interfaceC1219270hpl;
        this.LLILLL = c19536511c3;
        this.LLILZ = c19530211b2;
        this.LLILZIL = interfaceC19526511aR;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        C11YJ c11yj;
        if (this.LL) {
            InterfaceC1219270hpl interfaceC1219270hpl = this.LLILLJJLI;
            if (interfaceC1219270hpl != null) {
                interfaceC1219270hpl.onSuccess();
            }
        } else {
            InterfaceC1219270hpl interfaceC1219270hpl2 = this.LLILLJJLI;
            if (interfaceC1219270hpl2 != null) {
                interfaceC1219270hpl2.onFailed();
            }
        }
        C19533211bW c19533211bW = C19533211bW.LIZ;
        C19536511c3 c19536511c3 = this.LLILLL;
        int i = c19536511c3.LIZ;
        boolean z = this.LL;
        C19530211b2 c19530211b2 = this.LLILZ;
        InterfaceC19526511aR interfaceC19526511aR = this.LLILZIL;
        double videoLength = ((double) c19536511c3.LIZJ.getVideoLength()) / 1000.0d;
        c19533211bW.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C19527211aY c19527211aY = new C19527211aY(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C19525711aJ c19525711aJ = new C19525711aJ(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C19525511aH c19525511aH = new C19525511aH(linkedHashMap3);
        arrayList.add(c19527211aY);
        arrayList.add(c19525711aJ);
        arrayList.add(c19525511aH);
        long jLIZ = C19525311aF.LIZ(interfaceC19526511aR, arrayList);
        float size = ((Pair) linkedHashMap2.get("UploadAudioFile")) != null ? ((Set) r7.getSecond()).size() / ((Set) r7.getFirst()).size() : 0.0f;
        Object obj = linkedHashMap.get("pp_data_key_original_file_size");
        Object obj2 = linkedHashMap.get("pp_data_key_extract_file_size");
        C19525111aD c19525111aD = (C19525111aD) C13LP.LJJJLIIL(linkedHashMap3.values());
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
        c2344009Gk.LIZJ(i, "bizType");
        c2344009Gk.LIZ(videoLength, "video_duration");
        c2344009Gk.LIZIZ(size, "upload_cache");
        c2344009Gk.LIZLLL(jLIZ, "total_duration");
        c2344009Gk.LJ(obj, "origin_file_length");
        c2344009Gk.LJ(obj2, "upload_file_length");
        c2344009Gk.LJFF("export_upload_type", "exportAndUpload");
        if (z) {
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LJFF("error_msg", "");
            c2344009Gk.LIZJ(0, "pipeline_state_code");
            c2344009Gk.LIZJ(0, "pipeline_error_stage");
        } else if (c19530211b2 == null || c19530211b2.LIZ != -1) {
            c2344009Gk.LIZJ(-2, "pipeline_state_code");
            c2344009Gk.LJ(numValueOf, "error_code");
            c2344009Gk.LJFF("error_msg", str);
            c2344009Gk.LJ(((LinkedHashMap) C19533211bW.LIZIZ).get(str2), "pipeline_error_stage");
        } else {
            c2344009Gk.LIZJ(-1, "pipeline_state_code");
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LJFF("error_msg", "cancel by user");
            c2344009Gk.LJ(((LinkedHashMap) C19533211bW.LIZIZ).get(c19530211b2.LIZJ), "pipeline_error_stage");
        }
        C11YX c11yx = new C11YX();
        c11yx.LIZIZ(numValueOf);
        c11yx.LIZJ(str);
        c11yx.LIZLLL(c11yj);
        c11yx.LJ("voice_conversion_effect_file_pre");
        if (c11yj == C11YJ.SAMI_SERVER) {
            if (str3 == null || str3.length() == 0) {
                c11yx.LJFF("unknown task id");
                c11yx.LIZ();
            } else {
                c11yx.LJFF(str3);
                c11yx.LIZ();
            }
        }
        Map<String, String> map = c2344009Gk.LIZ;
        C19518711Yb c19518711Yb = C19518711Yb.LIZ;
        C11YY c11yyLIZ = c11yx.LIZ();
        c19518711Yb.getClass();
        C19518711Yb.LIZIZ("voice_conversion_effect_file_pre", map, c11yyLIZ);
        return Unit.LIZ;
    }
}
