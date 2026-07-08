package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audiometrics.AudioMetricsHelper$checkAndDetectDUBAudioMetrics$1", f = "AudioMetricsHelper.kt", l = {121, 131}, m = "invokeSuspend")
public final class C1406990miX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1406990miX(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C1406990miX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1406990miX(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String audioUrl;
        long jCurrentTimeMillis;
        C1C7U.LIZ("AudioMetricsHelper@eff5.checkAndDetectDUBAudioMetrics$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(obj);
                    C1407050mid c1407050mid = C1407050mid.LIZ;
                    VideoPublishEditModel videoPublishEditModel = this.LLILLL;
                    c1407050mid.getClass();
                    C1407050mid.LJ(2, jCurrentTimeMillis, videoPublishEditModel, (String) obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectDUBAudioMetrics$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05X0 c05x0 = C05X0.LIZ;
            this.LLILLJJLI = 1;
            c05x0.getClass();
            obj = C05X0.LIZ("", "audio_metrics", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectDUBAudioMetrics$1");
                return objLJFF;
            }
        }
        String str = (String) obj;
        if (str.length() == 0) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectDUBAudioMetrics$1");
            return unit2;
        }
        AudioRecorderParam veAudioRecorderParam = this.LLILLL.getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            audioUrl = veAudioRecorderParam.getAudioUrl();
            if (audioUrl != null && audioUrl.length() == 0) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectDUBAudioMetrics$1");
                return unit3;
            }
        } else {
            audioUrl = null;
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZJ = C1404630mej.LIZJ();
        this.LL = jCurrentTimeMillis;
        this.LLILLJJLI = 2;
        obj = C1407310mj3.LIZIZ(audioUrl, str, strLIZJ, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectDUBAudioMetrics$1");
            return objLJFF;
        }
        C1407050mid c1407050mid2 = C1407050mid.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LLILLL;
        c1407050mid2.getClass();
        C1407050mid.LJ(2, jCurrentTimeMillis, videoPublishEditModel2, (String) obj);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("AudioMetricsHelper@eff5.checkAndDetectDUBAudioMetrics$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
