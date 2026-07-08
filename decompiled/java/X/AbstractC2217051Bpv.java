package X;

import Y.ALAdapterS27S0100000_33;
import Y.AUListenerS235S0200000_33;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.setting.CaptionConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.aweme.shortvideo.subtitle.QueryAudioResponse;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.1Bpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2217051Bpv {
    public VideoPublishEditModel LIZ;
    public UploadVideoConfig LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public QueryAudioResponse LJIIIZ;
    public C0EVI LJIIJ;
    public final CaptionConfig LJIIL;
    public final C01GW LJIILIIL;
    public C2217101Bq0 LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public final C01GW LJIIZILJ;
    public volatile long LJIJ;
    public volatile long LJIJI;
    public volatile boolean LJIJJ;
    public volatile C391210FVn LJIJJLI;
    public final MutableLiveData<Integer> LJIL;
    public final ValueAnimator LJJ;
    public volatile String LJJI;
    public LanguageDetail LJJIFFI;
    public C364440EQo LJI = new C364440EQo();
    public final C364440EQo LJII = new C364440EQo();
    public String LJIIIIZZ = "";
    public final long LJIIJJI = C306660C0i.LIZ();

    public static String LJFF(int i) {
        return i != 10 ? i != 20 ? i != 30 ? i != 40 ? i != 50 ? "started_step" : "query_task" : "submit_task" : "upload_audio" : "extract_audio" : "get_auth_key";
    }

    public abstract void LIZ();

    public abstract boolean LJI();

    public abstract void LJII(NLEModel nLEModel);

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract void LJIIJ();

    public abstract void LJIIJJI(NLEModel nLEModel);

    public abstract void LJIIL(String str, NLEModel nLEModel, Boolean bool, boolean z, boolean z2, String str2);

    public abstract void LJIILJJIL(NLEModel nLEModel, AwS406S0200000_5 awS406S0200000_5);

    public abstract void LJIILL();

    /* JADX WARN: Multi-variable type inference failed */
    public final C1408410mkp<UploadVideoConfig> LIZJ() {
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22((C2217061Bpw) this, 334);
        int i = 0;
        C1408410mkp c1408410mkp = null;
        while (true) {
            if (i < 3) {
                c1408410mkp = (C1408410mkp) awS566S0100000_22.invoke();
                if (c1408410mkp.LIZ == 0) {
                    break;
                }
                i++;
            } else if (c1408410mkp == null) {
                c1408410mkp = new C1408410mkp(-1, null, null, 6);
            }
        }
        if (!c1408410mkp.LIZ()) {
            if (c1408410mkp.LIZJ instanceof UploadAuthKeyConfig) {
                ((C2217011Bpr) this.LJIIZILJ.getValue()).LIZ.storeLong("authkey_store_time", System.currentTimeMillis());
                ((C2217011Bpr) this.LJIIZILJ.getValue()).LIZ.storeString("authkey_value", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), c1408410mkp.LIZJ));
                UploadVideoConfig uploadVideoConfig = ((UploadAuthKeyConfig) c1408410mkp.LIZJ).videoConfig;
                this.LIZIZ = uploadVideoConfig;
                if (uploadVideoConfig == null) {
                    c1408410mkp = new C1408410mkp(2, "parse upload config failed", null, 4);
                } else {
                    String str = uploadVideoConfig.videoHostName;
                    if (str == null) {
                        str = "";
                    }
                    this.LJIILLIIL = str;
                }
            } else {
                c1408410mkp = new C1408410mkp(2, "upload config is empty", null, 4);
            }
        }
        UploadVideoConfig uploadVideoConfig2 = this.LIZIZ;
        C1408410mkp<UploadVideoConfig> c1408410mkp2 = uploadVideoConfig2 != null ? new C1408410mkp<>(0, null, uploadVideoConfig2, 3) : new C1408410mkp<>(c1408410mkp.LIZ, c1408410mkp.LIZIZ, null, 4);
        C201955140j.LJIIL("BaseRecognizeCaptionPresenter get authKey from server");
        return c1408410mkp2;
    }

    public final double LIZLLL() {
        if (this.LIZ.getVideoLength() > 0) {
            return (SystemClock.elapsedRealtime() - this.LJIJ) / ((double) this.LIZ.getVideoLength());
        }
        return 0.0d;
    }

    public final C353050Dsl LJ() {
        return (C353050Dsl) this.LJIILIIL.getValue();
    }

    public AbstractC2217051Bpv(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
        CaptionConfig captionConfig = (CaptionConfig) SettingsManager.LIZLLL().LJIIIIZZ("tool_caption_config", CaptionConfig.class, null);
        this.LJIIL = captionConfig == null ? new CaptionConfig(80, 1) : captionConfig;
        this.LJIILIIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(128));
        this.LJIILJJIL = new C2217101Bq0();
        this.LJIILLIIL = "";
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(127));
        this.LJIL = new MutableLiveData<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(15400L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS235S0200000_33(valueAnimatorOfFloat, this, 2));
        valueAnimatorOfFloat.addListener(new ALAdapterS27S0100000_33(this, 11));
        this.LJJ = valueAnimatorOfFloat;
        this.LJJI = "";
    }

    public final void LIZIZ(int i, String str) {
        C2217101Bq0 c2217101Bq0 = this.LJIILJJIL;
        c2217101Bq0.LJIIZILJ = i;
        c2217101Bq0.LJIJ = str;
    }
}
