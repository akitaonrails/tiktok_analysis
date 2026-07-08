package X;

import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEPreviewMusicParams;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1446740nke extends InterfaceC1455860nzM {
    void De1();

    LiveData<Boolean> FV1();

    void Fh2();

    LiveData<Unit> GW1();

    void Jy0(long j, long j2);

    VideoPublishEditModel LJJJLIIL();

    NLEModel LLZ();

    LiveData<VEPreviewMusicParams> ML1();

    C385670FAf<Boolean> Md2();

    void Ov2(LivePhotoPreviewMode livePhotoPreviewMode);

    void Qb1(boolean z);

    void Qd0();

    void RF0();

    void Rd0(float f, float f2, float f3);

    LiveData<Boolean> SE();

    LiveData<Unit> Te1();

    LiveData<Unit> Tf2();

    LiveData<Unit> UU();

    void Vc2();

    LiveData<SwitchModePayload> Vh();

    LiveData<Integer> ZK();

    LiveData<Unit> a62();

    InterfaceC356850Dyt az1();

    LiveData<Boolean> cA2();

    LiveData<Unit> cW0();

    void eD0(boolean z);

    boolean eS0();

    void i61(String str);

    LiveData<Unit> l02();

    boolean mi2();

    void nn1(FilterBean filterBean);

    List<EffectPointModel> o9();

    void oL2();

    void oz1(long j, long j2, String str);

    void pH0();

    void rh0(boolean z);

    LiveEvent<Unit> t90();

    void u90();

    void x61(SwitchModePayload switchModePayload);

    VEPreviewMusicParams xI();

    List<EffectPointModel> xl2();
}
