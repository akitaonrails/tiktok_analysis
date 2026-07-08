package X;

import Y.AfS141S0200000_5;
import Y.AfS163S0200000_29;
import android.app.Application;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.aweme.shortvideo.subtitle.QueryAudioResponse;
import com.ss.android.ugc.aweme.shortvideo.subtitle.SubmitAudioBody;
import com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS17S1210000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217061Bpw extends AbstractC2217051Bpv {
    public C11JL LJJII;
    public C11JL LJJIII;
    public final C383310F1d LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public Function0<Unit> LJJIIZ;

    @Override // X.AbstractC2217051Bpv
    public final void LJIIIIZZ() {
        this.LJ = null;
        this.LJIIIZ = null;
        C0CNO.LIZLLL(0L, new AwS578S0100000_34(this, 84));
    }

    @Override // X.AbstractC2217051Bpv
    public final void LIZ() {
        C11JL c11jl = this.LJJIII;
        if (c11jl == null || c11jl.isDisposed()) {
            return;
        }
        C0EVI c0evi = this.LJIIJ;
        if (c0evi != null) {
            c0evi.t4(false);
        }
        C11JL c11jl2 = this.LJJIII;
        if (c11jl2 != null) {
            c11jl2.dispose();
        }
        LJ();
        C353050Dsl.LIZIZ();
        C0CNO.LIZLLL(0L, new AwS578S0100000_34(this, 82));
        this.LJJIIZ = null;
        this.LJIJJ = false;
    }

    @Override // X.AbstractC2217051Bpv
    public final boolean LJI() {
        return this.LJJIIJ.hasChanged(this.LIZ);
    }

    @Override // X.AbstractC2217051Bpv
    public final void LJIIJ() {
        if (this.LJIJJLI != null) {
            LJIJJ();
            this.LJIJJLI = null;
        }
    }

    @Override // X.AbstractC2217051Bpv
    public final void LJIILL() {
        C11JL c11jl = this.LJJII;
        if (c11jl != null && !c11jl.isDisposed()) {
            C11JL c11jl2 = this.LJJII;
            if (c11jl2 != null) {
                c11jl2.dispose();
            }
            LJ();
            C353050Dsl.LIZIZ();
        }
        LJIJJ();
    }

    public final void LJIJJ() {
        CreativeInfo creativeInfo = this.LIZ.getCreativeInfo();
        C201955140j.LJIIL("RecognizeCaptionExecutor delete audio file");
        C2354709Kn.LJIJJLI(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIII(creativeInfo, "output.aac")).getPath());
        C2354709Kn.LJIJJLI(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIII(creativeInfo, "origin.aac")).getPath());
        C2354709Kn.LJIJJLI(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIII(creativeInfo, "outputmix.aac")).getPath());
        this.LJIILL = 0L;
        this.LJIILLIIL = "";
        if (((Boolean) C0ACV.LIZ.getValue()).booleanValue()) {
            C2354709Kn.LJIJJLI(this.LIZJ);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJIIIZ = null;
        C0CNO.LIZLLL(0L, new AwS549S0100000_5(this, 113));
    }

    @Override // X.AbstractC2217051Bpv
    public final void LJIIIZ() {
        LJIJJ();
    }

    public C2217061Bpw(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LJJIIJ = new C383310F1d();
    }

    @Override // X.AbstractC2217051Bpv
    public final void LJII(NLEModel nLEModel) {
        final NLEModel nLEModelDynamicCast;
        NLENode nLENodeDeepClone;
        C11JL c11jl = this.LJJII;
        if (c11jl != null && !c11jl.isDisposed()) {
            return;
        }
        this.LJIILJJIL = new C2217101Bq0();
        C19484011Ks c19484011KsLJJIJIIJI = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1Bpz
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<UploadVideoConfig> interfaceC2329309At) {
                UploadVideoConfig uploadVideoConfig = this.LL.LIZIZ;
                if (uploadVideoConfig == null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C1408410mkp<UploadVideoConfig> c1408410mkpLIZJ = this.LL.LIZJ();
                    this.LL.LJIILJJIL.LIZIZ = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NewRecognizeCaptionPresenter step ");
                    this.LL.getClass();
                    sbLIZ.append(AbstractC2217051Bpv.LJFF(10));
                    sbLIZ.append(" end failedCode: ");
                    sbLIZ.append(c1408410mkpLIZJ.LIZ);
                    sbLIZ.append(" failedMsg ");
                    sbLIZ.append(c1408410mkpLIZJ.LIZIZ);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                    C201955140j.LJIIL("NewRecognizeCaptionPresenter preprocess getAuthKey");
                    if (this.LL.LJJIIJZLJL) {
                        this.LL.LJIILJJIL.LJIIL = SystemClock.elapsedRealtime() - this.LL.LJIJI;
                    }
                    if (interfaceC2329309At.isDisposed()) {
                        return;
                    }
                    if (c1408410mkpLIZJ.LIZ()) {
                        this.LL.LJIILJJIL.LJIILLIIL = 10;
                        this.LL.LIZIZ(c1408410mkpLIZJ.LIZ, c1408410mkpLIZJ.LIZIZ);
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    } else {
                        C2217061Bpw c2217061Bpw = this.LL;
                        UploadVideoConfig uploadVideoConfig2 = c1408410mkpLIZJ.LIZJ;
                        c2217061Bpw.LIZIZ = uploadVideoConfig2;
                        interfaceC2329309At.onSuccess(uploadVideoConfig2);
                        return;
                    }
                }
                interfaceC2329309At.onSuccess(uploadVideoConfig);
            }
        }).LJJIJIIJI(C11S5.LIZ());
        if (!C0C1N.LIZ() && !C0A1H.LIZ()) {
            nLEModelDynamicCast = nLEModel;
        } else if (nLEModel != null && (nLENodeDeepClone = nLEModel.deepClone()) != null) {
            nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
        } else {
            nLEModelDynamicCast = null;
        }
        C0C1N.LIZ();
        this.LJJII = (C11JL) AbstractC19484711Kz.LJJJ(c19484011KsLJJIJIIJI, AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1Bpy
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                double videoLength;
                if (!C2286708xd.LIZJ(this.LL.LIZJ)) {
                    this.LL.LJIIZILJ(20);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C353050Dsl c353050DslLJ = this.LL.LJ();
                    VideoPublishEditModel videoPublishEditModel = this.LL.LIZ;
                    SettingsManager.LIZLLL().getClass();
                    int iLJ = SettingsManager.LJ("caption_audio_sample_rate", 16000);
                    SettingsManager.LIZLLL().getClass();
                    int iLJ2 = SettingsManager.LJ("caption_audio_bps", 96000);
                    SettingsManager.LIZLLL().getClass();
                    int iLJ3 = SettingsManager.LJ("caption_audio_channel_count", 1);
                    NLEModel nLEModel2 = nLEModelDynamicCast;
                    new AwS578S0100000_34((C11KT) interfaceC2329309At, 83);
                    c353050DslLJ.getClass();
                    C1408410mkp c1408410mkpLIZ = C353050Dsl.LIZ(videoPublishEditModel, iLJ, iLJ2, iLJ3, nLEModel2);
                    this.LL.LJIILJJIL.LIZJ = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    C2217061Bpw c2217061Bpw = this.LL;
                    C2217101Bq0 c2217101Bq0 = c2217061Bpw.LJIILJJIL;
                    if (c2217061Bpw.LIZ.getVideoLength() > 0) {
                        videoLength = r4.LJIILJJIL.LIZJ / ((double) this.LL.LIZ.getVideoLength());
                    } else {
                        videoLength = 0.0d;
                    }
                    c2217101Bq0.LJII = videoLength;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NewRecognizeCaptionPresenter step ");
                    this.LL.getClass();
                    sbLIZ.append(AbstractC2217051Bpv.LJFF(20));
                    sbLIZ.append(" end failedCode: ");
                    sbLIZ.append(c1408410mkpLIZ.LIZ);
                    sbLIZ.append(" failedMsg ");
                    sbLIZ.append(c1408410mkpLIZ.LIZIZ);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("NewRecognizeCaptionPresenter preprocess extractAudio ");
                    sbLIZ2.append((String) c1408410mkpLIZ.LIZJ);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                    if (this.LL.LJJIIJZLJL) {
                        this.LL.LJIILJJIL.LJIILIIL = SystemClock.elapsedRealtime() - this.LL.LJIJI;
                    }
                    if (interfaceC2329309At.isDisposed()) {
                        return;
                    }
                    if (c1408410mkpLIZ.LIZ()) {
                        this.LL.LJIILJJIL.LJIILLIIL = 20;
                        this.LL.LIZIZ(c1408410mkpLIZ.LIZ, c1408410mkpLIZ.LIZIZ);
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    }
                    C2217061Bpw c2217061Bpw2 = this.LL;
                    c2217061Bpw2.LIZJ = (String) c1408410mkpLIZ.LIZJ;
                    c2217061Bpw2.LJIILL = new C0VSJ((String) c1408410mkpLIZ.LIZJ).length() / ((long) 1024);
                    C2217061Bpw c2217061Bpw3 = this.LL;
                    c2217061Bpw3.LJJIIJ.getData(c2217061Bpw3.LIZ);
                    T t = c1408410mkpLIZ.LIZJ;
                    if (t == null) {
                        return;
                    }
                    interfaceC2329309At.onSuccess(t);
                }
            }
        }).LJJIJIIJI(C11S5.LIZ()), new InterfaceC500500Jk0() { // from class: X.11Tt
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return Boolean.TRUE;
            }
        }).LJJIJIIJIL(this.LJIIJJI, TimeUnit.MILLISECONDS).LJJIIZ(new AfS163S0200000_29(this, nLEModel, 0), new AfS163S0200000_29(this, nLEModel, 1));
    }

    @Override // X.AbstractC2217051Bpv
    public final void LJIIJJI(NLEModel nLEModel) {
        String str;
        this.LJJI = "";
        this.LJJIIJZLJL = true;
        this.LJIJI = SystemClock.elapsedRealtime();
        C11JL c11jl = this.LJJII;
        if (c11jl != null && !c11jl.isDisposed()) {
            return;
        }
        long j = this.LJIIJJI;
        if (C289240BVi.LIZ(this.LIZ)) {
            str = "big_caption";
        } else {
            str = null;
        }
        C289220BVg c289220BVg = C289220BVg.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        c289220BVg.getClass();
        boolean zLIZ = C289220BVg.LIZ(videoPublishEditModel);
        LJIJJLI(j, true, true, "", nLEModel, Boolean.FALSE, false, false, str, C1416310mxZ.LJII(this.LIZ), zLIZ);
        this.LJJIIJZLJL = false;
    }

    public final void LJIILLIIL(int i) throws JSONException {
        double videoLength;
        this.LJIILJJIL.LIZ = SystemClock.elapsedRealtime() - this.LJIJI;
        C2217101Bq0 c2217101Bq0 = this.LJIILJJIL;
        if (this.LIZ.getVideoLength() > 0) {
            videoLength = this.LJIILJJIL.LIZ / ((double) this.LIZ.getVideoLength());
        } else {
            videoLength = 0.0d;
        }
        c2217101Bq0.LJIIJJI = videoLength;
        C2217101Bq0 c2217101Bq02 = this.LJIILJJIL;
        String str = this.LIZLLL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c2217101Bq02.LJIILJJIL = str;
        String str3 = this.LJ;
        if (str3 != null) {
            str2 = str3;
        }
        c2217101Bq02.LJIILL = str2;
        c2217101Bq02.LJI = this.LIZ.getVideoLength();
        C2217101Bq0 c2217101Bq03 = this.LJIILJJIL;
        c2217101Bq03.LJIJI = this.LJIILL;
        c2217101Bq03.LJIJJ = this.LJIILLIIL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", Float.valueOf(c2217101Bq03.LIZ));
        jSONObject.put("get_config_duration", Float.valueOf(c2217101Bq03.LIZIZ));
        jSONObject.put("extract_duration", Float.valueOf(c2217101Bq03.LIZJ));
        jSONObject.put("upload_duration", Float.valueOf(c2217101Bq03.LIZLLL));
        jSONObject.put("submit_duration", Float.valueOf(c2217101Bq03.LJ));
        jSONObject.put("query_duration", Float.valueOf(c2217101Bq03.LJFF));
        jSONObject.put("extract_duration_per_second", c2217101Bq03.LJII);
        jSONObject.put("upload_duration_per_second", c2217101Bq03.LJIIIIZZ);
        jSONObject.put("submit_duration_per_second", c2217101Bq03.LJIIIZ);
        jSONObject.put("query_duration_per_second", c2217101Bq03.LJIIJ);
        jSONObject.put("recognize_duration_per_second", c2217101Bq03.LJIIJJI);
        jSONObject.put("perceived_get_config_duration", Float.valueOf(c2217101Bq03.LJIIL));
        jSONObject.put("perceived_extract_duration", Float.valueOf(c2217101Bq03.LJIILIIL));
        jSONObject.put("tos_key", c2217101Bq03.LJIILJJIL);
        jSONObject.put("job_id", c2217101Bq03.LJIILL);
        jSONObject.put("failed_step", c2217101Bq03.LJIILLIIL);
        jSONObject.put("failed_code", c2217101Bq03.LJIIZILJ);
        jSONObject.put("failed_msg", c2217101Bq03.LJIJ);
        jSONObject.put("audio_file_size", Float.valueOf(c2217101Bq03.LJIJI));
        jSONObject.put("audio_upload_domain", c2217101Bq03.LJIJJ);
        jSONObject.put("creation_duration", c2217101Bq03.LJI);
        C1637890six.LIZ.LJIIIZ("tt_recognize_caption_monitor", i, jSONObject, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitor tt_recognize_caption_monitor status: ");
        sbLIZ.append(i);
        sbLIZ.append(" data: ");
        sbLIZ.append(jSONObject);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIZILJ(int i) {
        this.LJIJ = SystemClock.elapsedRealtime();
        this.LJIILJJIL.LJIILLIIL = i;
    }

    public final void LJIJI(NLEModel nLEModel) {
        String str;
        if (!this.LJJIIJZLJL) {
            return;
        }
        long j = this.LJIIJJI;
        long jMin = Math.min(j, (j - SystemClock.elapsedRealtime()) + this.LJIJI);
        String str2 = this.LJJI;
        if (C289240BVi.LIZ(this.LIZ)) {
            str = "big_caption";
        } else {
            str = null;
        }
        boolean zLJII = C1416310mxZ.LJII(this.LIZ);
        C289220BVg c289220BVg = C289220BVg.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        c289220BVg.getClass();
        LJIJJLI(jMin, false, false, str2, nLEModel, Boolean.FALSE, false, false, str, zLJII, C289220BVg.LIZ(videoPublishEditModel));
        this.LJJIIJZLJL = false;
    }

    @Override // X.AbstractC2217051Bpv
    public final void LJIILJJIL(NLEModel nLEModel, AwS406S0200000_5 awS406S0200000_5) {
        String str;
        this.LJJIIZ = awS406S0200000_5;
        this.LJJI = "auto_language";
        C371890Ei3 c371890Ei3 = C371890Ei3.LIZ;
        C2216191BoX.LIZ.getClass();
        Application applicationLIZ = C2216191BoX.LIZ();
        c371890Ei3.getClass();
        this.LJJIFFI = C371890Ei3.LIZ(applicationLIZ);
        this.LJJIIJZLJL = true;
        this.LJIJI = SystemClock.elapsedRealtime();
        this.LJIJJ = true;
        long j = this.LJIIJJI;
        Boolean bool = Boolean.FALSE;
        boolean zLIZ = C294870Bh7.LIZ(this.LIZ);
        boolean zLJIILJJIL = C1416310mxZ.LJIILJJIL(this.LIZ);
        if (C289240BVi.LIZ(this.LIZ)) {
            str = "big_caption";
        } else {
            str = null;
        }
        boolean zLJII = C1416310mxZ.LJII(this.LIZ);
        C289220BVg c289220BVg = C289220BVg.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        c289220BVg.getClass();
        LJIJJLI(j, true, true, "auto_language", nLEModel, bool, zLIZ, zLJIILJJIL, str, zLJII, C289220BVg.LIZ(videoPublishEditModel));
        this.LJJIIJZLJL = false;
        this.LJIJJLI = null;
    }

    public final void LJIJ(int i, int i2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewRecognizeCaptionPresenter step ");
        sbLIZ.append(AbstractC2217051Bpv.LJFF(i));
        sbLIZ.append(" end failedCode: ");
        sbLIZ.append(i2);
        sbLIZ.append(" failedMsg ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        int i3 = this.LJIILJJIL.LJIILLIIL;
        if (i3 != 10) {
            if (i3 != 20) {
                if (i3 != 30) {
                    if (i3 != 40) {
                        if (i3 == 50) {
                            this.LJIILJJIL.LJFF = SystemClock.elapsedRealtime() - this.LJIJ;
                            this.LJIILJJIL.LJIIJ = LIZLLL();
                            return;
                        }
                        return;
                    }
                    this.LJIILJJIL.LJ = SystemClock.elapsedRealtime() - this.LJIJ;
                    this.LJIILJJIL.LJIIIZ = LIZLLL();
                    return;
                }
                this.LJIILJJIL.LIZLLL = SystemClock.elapsedRealtime() - this.LJIJ;
                this.LJIILJJIL.LJIIIIZZ = LIZLLL();
                return;
            }
            this.LJIILJJIL.LIZJ = SystemClock.elapsedRealtime() - this.LJIJ;
            this.LJIILJJIL.LJII = LIZLLL();
            return;
        }
        this.LJIILJJIL.LIZIZ = SystemClock.elapsedRealtime() - this.LJIJ;
    }

    @Override // X.AbstractC2217051Bpv
    public final void LJIIL(String str, NLEModel nLEModel, Boolean bool, boolean z, boolean z2, String str2) {
        LanguageDetail languageDetail;
        NLENode nLENodeDeepClone;
        List listLJJLL;
        Object next;
        NLEModel nLEModelDynamicCast = null;
        if (this.LJIJJ) {
            this.LJIJJ = false;
            C0EVI c0evi = this.LJIIJ;
            if (c0evi != null) {
                c0evi.t4(true);
            }
            this.LJJIIZ = null;
            return;
        }
        C391210FVn c391210FVn = this.LJIJJLI;
        if (c391210FVn != null) {
            C01TT.LIZJ(new AwS406S0200000_5(this, c391210FVn, 17));
            this.LJIJJLI = null;
            this.LJJIIZ = null;
            return;
        }
        this.LJJI = str;
        LanguageDetail[] languageDetailArrLIZJ = C371890Ei3.LIZJ();
        if (languageDetailArrLIZJ != null && (listLJJLL = C13LQ.LJJLL(languageDetailArrLIZJ)) != null) {
            Iterator it2 = listLJJLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((LanguageDetail) next).code, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            languageDetail = (LanguageDetail) next;
        } else {
            languageDetail = null;
        }
        this.LJJIFFI = languageDetail;
        this.LJJIIJZLJL = true;
        this.LJIJI = SystemClock.elapsedRealtime();
        C11JL c11jl = this.LJJII;
        if (c11jl != null && !c11jl.isDisposed()) {
            return;
        }
        if (!C0C1N.LIZ() && !C0A1H.LIZ()) {
            nLEModelDynamicCast = nLEModel;
        } else if (nLEModel != null && (nLENodeDeepClone = nLEModel.deepClone()) != null) {
            nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
        }
        long j = this.LJIIJJI;
        C289220BVg c289220BVg = C289220BVg.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        c289220BVg.getClass();
        LJIJJLI(j, true, true, str, nLEModelDynamicCast, bool, z, z2, str2, C1416310mxZ.LJII(this.LIZ), C289220BVg.LIZ(videoPublishEditModel));
        this.LJJIIJZLJL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0LAB] */
    public final void LJIJJLI(long j, final boolean z, final boolean z2, final String str, final NLEModel nLEModel, Boolean bool, boolean z3, final boolean z4, String str2, final boolean z5, final boolean z6) {
        String strLJL;
        ?? r1;
        String str3;
        ?? LIZ;
        final String str4 = str2;
        if (LJI()) {
            LJIILL();
        }
        C0CNO.LIZLLL(0L, new AwS549S0100000_5(this, 114));
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        boolean z7 = this.LJFF;
        String str5 = this.LJJI;
        Boolean boolValueOf = Boolean.valueOf(z3);
        boolean z8 = this.LJIJJ;
        final boolean z9 = true;
        if (str5.length() == 0) {
            strLJL = C0CHQ.LIZ().LJJIJIIJIL();
        } else {
            strLJL = u4.LJL(str5);
        }
        ?? LJJI = u4.LJJI(videoPublishEditModel, 0, 6);
        LJJI.LIZ(videoPublishEditModel.getVideoLength(), "video_duration");
        LJJI.LIZ(z7 ? 1 : 0, "is_editor_pro");
        if (!z7 && !z8) {
            r1 = videoPublishEditModel.creativeModel.stickerModel.captionItemBarVisible;
        } else {
            r1 = 0;
        }
        LJJI.LIZ(r1, "is_from_pinned_captions");
        LJJI.LIZ(u4.LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
        LJJI.LIZ(u4.LJJIZ(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab_captions");
        LJJI.LJ("app_language", C0CHQ.LIZ().LJJIJIIJIL());
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            strLJL = "";
        }
        LJJI.LJ("asr_model_lang", strLJL);
        if (boolValueOf != null) {
            LIZ = boolValueOf.booleanValue();
        } else {
            InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel != null && (str3 = inlineCaptionModel.selectLanguageCode) != null) {
                LIZ = Intrinsics.LJFF(str3, "auto_language");
            } else {
                LIZ = C294870Bh7.LIZ(videoPublishEditModel);
            }
        }
        LJJI.LIZ(LIZ, "is_auto_language");
        LJJI.LIZ(u4.LJJJJJ(videoPublishEditModel, z7 ? 1 : 0) ? 1 : 0, "is_remove_filler_words");
        u4.LIZ(videoPublishEditModel.creativeModel, LJJI);
        C20684815ws.LJIILLIIL("auto_subtitle_start", LJJI.LIZ);
        if (!z3 || !Intrinsics.LJFF("auto_language", str)) {
            z9 = false;
        }
        if (((Boolean) C273520Anm.LIZ.getValue()).booleanValue()) {
            str4 = "big_caption49";
        } else if (!z9) {
            str4 = null;
        }
        this.LJJIII = (C11JL) AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.1Bpx
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<QueryAudioResponse> interfaceC2329309At) {
                boolean z10;
                boolean z11;
                C1408410mkp c1408410mkp;
                int i;
                C1408410mkp c1408410mkp2;
                int i2;
                C1408410mkp c1408410mkp3;
                C2217061Bpw c2217061Bpw = this.LL;
                if (c2217061Bpw.LIZIZ == null) {
                    if (!z) {
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    }
                    c2217061Bpw.LJIIZILJ(10);
                    C1408410mkp<UploadVideoConfig> c1408410mkpLIZJ = this.LL.LIZJ();
                    this.LL.LJIJ(10, c1408410mkpLIZJ.LIZ, c1408410mkpLIZJ.LIZIZ);
                    C2217101Bq0 c2217101Bq0 = this.LL.LJIILJJIL;
                    c2217101Bq0.LJIIL = c2217101Bq0.LIZIZ;
                    if (interfaceC2329309At.isDisposed()) {
                        return;
                    }
                    if (c1408410mkpLIZJ.LIZ()) {
                        this.LL.LIZIZ(c1408410mkpLIZJ.LIZ, c1408410mkpLIZJ.LIZIZ);
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    }
                }
                if (!C2286708xd.LIZJ(this.LL.LIZJ)) {
                    if (!z2) {
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    }
                    this.LL.LJIIZILJ(20);
                    C353050Dsl c353050DslLJ = this.LL.LJ();
                    VideoPublishEditModel videoPublishEditModel2 = this.LL.LIZ;
                    SettingsManager.LIZLLL().getClass();
                    int iLJ = SettingsManager.LJ("caption_audio_sample_rate", 16000);
                    SettingsManager.LIZLLL().getClass();
                    int iLJ2 = SettingsManager.LJ("caption_audio_bps", 96000);
                    SettingsManager.LIZLLL().getClass();
                    int iLJ3 = SettingsManager.LJ("caption_audio_channel_count", 1);
                    NLEModel nLEModel2 = nLEModel;
                    new AwS578S0100000_34((C11KT) interfaceC2329309At, 85);
                    c353050DslLJ.getClass();
                    C1408410mkp c1408410mkpLIZ = C353050Dsl.LIZ(videoPublishEditModel2, iLJ, iLJ2, iLJ3, nLEModel2);
                    this.LL.LJIJ(20, c1408410mkpLIZ.LIZ, c1408410mkpLIZ.LIZIZ);
                    C2217101Bq0 c2217101Bq02 = this.LL.LJIILJJIL;
                    c2217101Bq02.LJIILIIL = c2217101Bq02.LIZJ;
                    if (interfaceC2329309At.isDisposed()) {
                        return;
                    }
                    if (c1408410mkpLIZ.LIZ()) {
                        this.LL.LIZIZ(c1408410mkpLIZ.LIZ, c1408410mkpLIZ.LIZIZ);
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    }
                    this.LL.LIZJ = (String) c1408410mkpLIZ.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NewRecognizeCaptionPresenter audioFile ");
                    sbLIZ.append(this.LL.LIZJ);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                    this.LL.LJIILL = new C0VSJ((String) c1408410mkpLIZ.LIZJ).length() / ((long) 1024);
                    C2217061Bpw c2217061Bpw2 = this.LL;
                    c2217061Bpw2.LJJIIJ.getData(c2217061Bpw2.LIZ);
                }
                String str6 = this.LL.LIZLLL;
                if (str6 != null && str6.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    this.LL.LJIIZILJ(30);
                    C2217061Bpw c2217061Bpw3 = this.LL;
                    String str7 = c2217061Bpw3.LIZIZ.videoHostName;
                    if (str7 == null) {
                        str7 = "";
                    }
                    c2217061Bpw3.LJIILLIIL = str7;
                    C353050Dsl c353050DslLJ2 = c2217061Bpw3.LJ();
                    C2217061Bpw c2217061Bpw4 = this.LL;
                    String str8 = c2217061Bpw4.LIZJ;
                    if (str8 == null) {
                        str8 = "";
                    }
                    final UploadVideoConfig uploadVideoConfig = c2217061Bpw4.LIZIZ;
                    c353050DslLJ2.getClass();
                    if (C2486109oh.LIZ(str8) != 0) {
                        c1408410mkp3 = new C1408410mkp(1, "audio file is not valid", null, 4);
                    } else {
                        C1441720ncY c1441720ncY = C1441720ncY.LIZ;
                        EnumC19551211eQ enumC19551211eQ = EnumC19551211eQ.CAPTION;
                        c1441720ncY.getClass();
                        final C2207921BbC c2207921BbC = new C2207921BbC(uploadVideoConfig, enumC19551211eQ);
                        c2207921BbC.LIZLLL("captions_audio");
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        final C259800zU c259800zU = new C259800zU();
                        final C013C c013c = new C013C();
                        final C259800zU c259800zU2 = new C259800zU();
                        c259800zU2.element = "";
                        try {
                            c2207921BbC = c2207921BbC;
                            i2 = 4;
                        } catch (Exception e) {
                            e = e;
                            c2207921BbC = c2207921BbC;
                            i2 = 4;
                        }
                        try {
                            c2207921BbC.LJ(new InterfaceC2208111BbV() { // from class: X.0ncZ
                                @Override // X.InterfaceC2208111BbV
                                public final void LIZ() {
                                }

                                @Override // X.InterfaceC2208111BbV
                                public final void LIZIZ() {
                                }

                                @Override // X.InterfaceC2208111BbV
                                public final void LIZJ() {
                                }

                                @Override // X.InterfaceC2208111BbV
                                public final int LJ() {
                                    return C1404960mfG.LIZ(uploadVideoConfig, "SubtitleOriginalSoundUpload");
                                }

                                /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
                                /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
                                @Override // X.InterfaceC2208111BbV
                                public final void LIZLLL(int i3, long j2, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                                    c2207921BbC.LIZIZ();
                                    if (i3 == 0) {
                                        c259800zU.element = videoUploadInfo.mTosKey;
                                        c2207921BbC.LIZ();
                                        countDownLatch.countDown();
                                        return;
                                    }
                                    c2207921BbC.LIZJ();
                                    if (i3 != 2) {
                                        return;
                                    }
                                    c2207921BbC.LIZ();
                                    countDownLatch.countDown();
                                    c013c.element = true;
                                    C259800zU<String> c259800zU3 = c259800zU2;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("err: ");
                                    sbLIZ2.append(Long.valueOf(videoUploadInfo.mErrorCode));
                                    sbLIZ2.append(" extra: ");
                                    sbLIZ2.append(videoUploadInfo.mExtra);
                                    c259800zU3.element = C2188811AlT.LIZIZ(sbLIZ2);
                                }
                            });
                            c2207921BbC.LJFF(str8);
                            c2207921BbC.LJII();
                            try {
                                countDownLatch.await(c353050DslLJ2.LIZIZ, TimeUnit.MILLISECONDS);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C201955140j.LJIIJ(C1662160tM6.LIZIZ, "RecognizeCaptionExecutor.uploadAudioFile await error", e2);
                            }
                            CharSequence charSequence = (CharSequence) c259800zU.element;
                            if (charSequence != null && charSequence.length() != 0) {
                                c1408410mkp3 = new C1408410mkp(0, null, c259800zU.element, 3);
                            } else if (c013c.element) {
                                c1408410mkp3 = new C1408410mkp(1, (String) c259800zU2.element, null, 4);
                            } else {
                                c1408410mkp3 = new C1408410mkp(4, "upload timeout", null, 4);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                            c2207921BbC.LIZ();
                            c1408410mkp3 = new C1408410mkp(3, String.valueOf(e.getMessage()), null, i2);
                        }
                    }
                    this.LL.LJIJ(30, c1408410mkp3.LIZ, c1408410mkp3.LIZIZ);
                    if (interfaceC2329309At.isDisposed()) {
                        return;
                    }
                    if (c1408410mkp3.LIZ()) {
                        this.LL.LIZIZ(c1408410mkp3.LIZ, c1408410mkp3.LIZIZ);
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    }
                    this.LL.LIZLLL = (String) c1408410mkp3.LIZJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("NewRecognizeCaptionPresenter tosKey ");
                    sbLIZ2.append(this.LL.LIZLLL);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                }
                String str9 = this.LL.LJ;
                if (str9 != null && str9.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    this.LL.LJIIZILJ(40);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("NewRecognizeCaptionPresenter -> startRecognizeInternal -> selectLanguage's code = ");
                    sbLIZ3.append(str);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    C353050Dsl c353050DslLJ3 = this.LL.LJ();
                    C2217061Bpw c2217061Bpw5 = this.LL;
                    String str10 = c2217061Bpw5.LIZLLL;
                    CaptionConfig captionConfig = c2217061Bpw5.LJIIL;
                    int i3 = captionConfig.maxLines;
                    LanguageDetail languageDetail = c2217061Bpw5.LJJIFFI;
                    if (languageDetail != null) {
                        i = languageDetail.maxLineLength;
                    } else {
                        i = captionConfig.wordsPerLine;
                    }
                    String str11 = str;
                    boolean z12 = z9;
                    boolean z13 = z4;
                    String str12 = str4;
                    boolean z14 = z5;
                    boolean z15 = z6;
                    c353050DslLJ3.getClass();
                    try {
                        SubmitAudioBody submitAudioBody = ((SubtitleApi) c353050DslLJ3.LIZ.getValue()).submit(str10, i3, i, str11, z12, z13, str12, z14, z15).execute().LIZIZ;
                        if (submitAudioBody.statusCode == 0 && submitAudioBody.videoCaption.id.length() > 0) {
                            c1408410mkp2 = new C1408410mkp(0, null, submitAudioBody.videoCaption.id, 3);
                        } else {
                            c1408410mkp2 = new C1408410mkp(1, null, null, 6);
                        }
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        C201955140j.LJIIJ(C1662160tM6.LIZIZ, "RecognizeCaptionExecutor.submitAudio error", e4);
                        c1408410mkp2 = new C1408410mkp(-1, null, null, 6);
                    }
                    this.LL.LJIJ(40, c1408410mkp2.LIZ, c1408410mkp2.LIZIZ);
                    if (interfaceC2329309At.isDisposed()) {
                        return;
                    }
                    if (c1408410mkp2.LIZ()) {
                        this.LL.LIZIZ(c1408410mkp2.LIZ, c1408410mkp2.LIZIZ);
                        interfaceC2329309At.onError(new RuntimeException());
                        return;
                    }
                    this.LL.LJ = (String) c1408410mkp2.LIZJ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("NewRecognizeCaptionPresenter taskId ");
                    sbLIZ4.append(this.LL.LJ);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ4));
                }
                C2217061Bpw c2217061Bpw6 = this.LL;
                if (c2217061Bpw6.LJIIIZ == null) {
                    c2217061Bpw6.LJIIZILJ(50);
                    C353050Dsl c353050DslLJ4 = this.LL.LJ();
                    String str13 = this.LL.LJ;
                    if (str13 == null) {
                        str13 = "";
                    }
                    c353050DslLJ4.getClass();
                    try {
                        SubmitAudioBody submitAudioBody2 = ((SubtitleApi) c353050DslLJ4.LIZ.getValue()).query(str13).execute().LIZIZ;
                        int i4 = submitAudioBody2.statusCode;
                        if (i4 == 0) {
                            c1408410mkp = new C1408410mkp(0, null, submitAudioBody2.videoCaption, 3);
                        } else {
                            c1408410mkp = new C1408410mkp(i4, null, null, 6);
                        }
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        C201955140j.LJIIJ(C1662160tM6.LIZIZ, "RecognizeCaptionExecutor.queryTask error", e5);
                        c1408410mkp = new C1408410mkp(-1, null, null, 6);
                    }
                    this.LL.LJIJ(50, c1408410mkp.LIZ, c1408410mkp.LIZIZ);
                    if (interfaceC2329309At.isDisposed()) {
                        return;
                    }
                    if (c1408410mkp.LIZ()) {
                        this.LL.LIZIZ(c1408410mkp.LIZ, c1408410mkp.LIZIZ);
                        interfaceC2329309At.onError(new C0EVK(50, c1408410mkp.LIZ));
                        return;
                    } else {
                        this.LL.LJIIIZ = (QueryAudioResponse) c1408410mkp.LIZJ;
                    }
                }
                QueryAudioResponse queryAudioResponse = this.LL.LJIIIZ;
                if (queryAudioResponse == null) {
                    queryAudioResponse = new QueryAudioResponse();
                }
                interfaceC2329309At.onSuccess(queryAudioResponse);
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(j, TimeUnit.MILLISECONDS).LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0EVL
            @Override // X.InterfaceC781210Ukh
            public final void run() throws JSONException {
                C0CNO.LIZLLL(0L, new AwS549S0100000_5(this.LIZ, 115));
                this.LIZ.LJIJJ = false;
                C2217061Bpw c2217061Bpw = this.LIZ;
                c2217061Bpw.LJJIIZ = null;
                c2217061Bpw.LJIILLIIL(3);
                C2217061Bpw c2217061Bpw2 = this.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = c2217061Bpw2.LIZ;
                long j2 = c2217061Bpw2.LJIJI;
                C2217061Bpw c2217061Bpw3 = this.LIZ;
                boolean z10 = c2217061Bpw3.LJFF;
                u4.LJJLIIIJILLIZJL(videoPublishEditModel2, j2, "cancel", null, z10 ? 1 : 0, c2217061Bpw3.LJJI, 56);
            }
        }).LJJIIZ(new AfS141S0200000_5(this, bool, 0), new C09JN() { // from class: X.0EVJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NewRecognizeCaptionPresenter@6e2f.startRecognizeInternal$4");
                C2217061Bpw c2217061Bpw = this.LL;
                c2217061Bpw.LJJIIZ = null;
                boolean z10 = c2217061Bpw.LJIJJ;
                this.LL.LJIJJ = false;
                C0CNO.LIZLLL(0L, new AwS17S1210000_5(this.LL, (Throwable) obj, z10, str4, 0));
                C1C7U.LIZIZ("NewRecognizeCaptionPresenter@6e2f.startRecognizeInternal$4");
            }
        });
    }
}
