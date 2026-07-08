package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audiometrics.AudioMetricsHelper$checkAndDetectUploadVideoAudioMetrics$1", f = "AudioMetricsHelper.kt", l = {166, 176}, m = "invokeSuspend")
public final class C1406970miV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ BaseShortVideoContext LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ double LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406970miV(BaseShortVideoContext baseShortVideoContext, String str, double d, int i, InterfaceC1364105Vn<? super C1406970miV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseShortVideoContext;
        this.LLILZ = str;
        this.LLILZIL = d;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1406970miV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object objLIZ = obj;
        C1C7U.LIZ("AudioMetricsHelper@eff5.checkAndDetectUploadVideoAudioMetrics$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(objLIZ);
                    C1407050mid c1407050mid = C1407050mid.LIZ;
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLILLL;
                    String str = this.LLILZ;
                    double d = this.LLILZIL;
                    int i2 = this.LLILZLL;
                    c1407050mid.getClass();
                    C1407050mid.LJFF(4, jCurrentTimeMillis, videoPublishEditModel, (String) objLIZ, str, d, i2);
                    C560870LzB.LIZ("zxz", "index = 4, INDEX_UPLOAD_VIDEO_SUCCESS");
                    Keva.getRepo("audio_metrics").storeInt("audio_metrics_time", 0);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectUploadVideoAudioMetrics$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            C05X0 c05x0 = C05X0.LIZ;
            this.LLILLJJLI = 1;
            c05x0.getClass();
            objLIZ = C05X0.LIZ("", "audio_metrics", this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectUploadVideoAudioMetrics$1");
                return objLJFF;
            }
        }
        String str2 = (String) objLIZ;
        if (str2.length() == 0) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectUploadVideoAudioMetrics$1");
            return unit2;
        }
        String outputFile = ((VideoPublishEditModelKt) this.LLILLL).getOutputFile();
        if (outputFile != null && FileUtils.INSTANCE.checkFileExists(outputFile)) {
            jCurrentTimeMillis = System.currentTimeMillis();
            String strLIZJ = C1404630mej.LIZJ();
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 2;
            objLIZ = C1407310mj3.LIZIZ(outputFile, str2, strLIZJ, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectUploadVideoAudioMetrics$1");
                return objLJFF;
            }
            C1407050mid c1407050mid2 = C1407050mid.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.LLILLL;
            String str3 = this.LLILZ;
            double d2 = this.LLILZIL;
            int i22 = this.LLILZLL;
            c1407050mid2.getClass();
            C1407050mid.LJFF(4, jCurrentTimeMillis, videoPublishEditModel2, (String) objLIZ, str3, d2, i22);
            C560870LzB.LIZ("zxz", "index = 4, INDEX_UPLOAD_VIDEO_SUCCESS");
            Keva.getRepo("audio_metrics").storeInt("audio_metrics_time", 0);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectUploadVideoAudioMetrics$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectUploadVideoAudioMetrics$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
