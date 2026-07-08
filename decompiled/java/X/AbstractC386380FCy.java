package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VESize;

/* JADX INFO: renamed from: X.0FCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC386380FCy implements InterfaceC386690FEd {
    @Override // X.InterfaceC386690FEd
    public final int LLL() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSessionF1 = f1();
        return (int) (((iNLEMediaSessionF1 == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) ? 0L : playerApi.getCurrentPosition()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC386690FEd
    public final int getDuration() {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSessionF1 = f1();
        return (int) (((iNLEMediaSessionF1 == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) ? 0L : playerApi.getDuration()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC386690FEd
    public final VESize getInitSize() {
        int first;
        INLEMediaRuntime mediaRuntimeApi;
        INLEMediaSession iNLEMediaSessionF1 = f1();
        PairIntInt initSize = (iNLEMediaSessionF1 == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null) ? null : mediaRuntimeApi.getInitSize();
        int second = 0;
        if (initSize != null) {
            first = initSize.getFirst();
            second = initSize.getSecond();
        } else {
            first = 0;
        }
        return new VESize(first, second);
    }
}
