package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0jHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275030jHh extends C1274970jHb {
    public String LJJIJIL;
    public List<String> LJJIJL;
    public InterfaceC1276590jKD LJJIJLIJ;
    public String LJJIL;
    public InterfaceC1275660jIi LJJJ;
    public String LJJJI;
    public boolean LJJJIL;
    public int LJJJJI;
    public int LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public String LJJJJLI;
    public boolean LJJJJLL;
    public int[] LJJJJZ;
    public boolean LJJIZ = true;
    public int LJJJJ = 200;
    public boolean LJJJJL = true;

    public final int LIZJ() {
        if (TextUtils.isEmpty(this.LJJIL)) {
            return 0;
        }
        if (this.LJJIL.startsWith("#")) {
            this.LJJIL = this.LJJIL.substring(1);
        }
        try {
            return CastIntegerProtector.valueOf(this.LJJIL, 16).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractConfig{mMixStreamUrl='");
        sbLIZ.append(this.LJJIJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", mAnchorNetUrls=");
        sbLIZ.append(this.LJJIJL);
        sbLIZ.append(", mMixer=");
        sbLIZ.append(this.LJJIJLIJ);
        sbLIZ.append(", mBackgroundColor='");
        sbLIZ.append(this.LJJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", mCreateClientStack='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", mEnableInteractConnectionStatics=");
        sbLIZ.append(false);
        sbLIZ.append(", mEnableRemoteUserStatics=");
        sbLIZ.append(this.LJJIZ);
        sbLIZ.append(", mEnableProcStatics=");
        sbLIZ.append(false);
        sbLIZ.append(", mUrlDispatcher=");
        sbLIZ.append(this.LJJJ);
        sbLIZ.append(", mRtcABTestConfig='");
        sbLIZ.append(this.LJJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mRtcClientMixUseOriginStream=");
        sbLIZ.append(this.LJJJIL);
        sbLIZ.append(", mVideoFrozenLimitMSec=");
        sbLIZ.append(this.LJJJJ);
        sbLIZ.append(", mRtcSyncQueueLengthMs=");
        sbLIZ.append(this.LJJJJI);
        sbLIZ.append(", mRtcSyncClientAudioMixLengthMs=");
        sbLIZ.append(this.LJJJJIZL);
        sbLIZ.append(", mMixStreamConfigIndependent=");
        sbLIZ.append(this.LJJJJJ);
        sbLIZ.append(", mRtcUseVideoRangeDefault=");
        sbLIZ.append(this.LJJJJJL);
        sbLIZ.append(", mEnableVideoBFrameOnMixStream=");
        sbLIZ.append(this.LJJJJL);
        sbLIZ.append(", mLinkMicLayoutConfig='");
        sbLIZ.append(this.LJJJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", mEnableTalkVolumeLevels=");
        sbLIZ.append(this.LJJJJLL);
        sbLIZ.append(", mTalkVolumeLevels=");
        sbLIZ.append(Arrays.toString(this.LJJJJZ));
        sbLIZ.append(", mEnableNativeLive=");
        sbLIZ.append(false);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
