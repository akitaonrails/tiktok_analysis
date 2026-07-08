package X;

import com.ss.android.ugc.gamora.editorpro.dynamic.VideoEffectStrategyApi;

/* JADX INFO: renamed from: X.0E6X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6X {
    public static int LIZ() {
        C1455910nzR.LIZ.getClass();
        VideoEffectStrategyApi videoEffectStrategyApi = (VideoEffectStrategyApi) C1455910nzR.LIZIZ().LJII(VideoEffectStrategyApi.class);
        if (videoEffectStrategyApi == null) {
            return 5;
        }
        int iTrackLimit = videoEffectStrategyApi.trackLimit();
        C0E6T c0e6t = new C0E6N() { // from class: X.0E6T
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effectTrackLimitCount = ");
        sbLIZ.append(iTrackLimit);
        C356530DyN.LIZ(c0e6t, C2188811AlT.LIZIZ(sbLIZ));
        return iTrackLimit;
    }
}
