package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.level.GuidanceConfig;
import com.bytedance.android.livesdk.livesetting.level.TriggerConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: renamed from: X.0eXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092510eXJ {
    public final DataChannel LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 9));

    public C1092510eXJ(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x012a, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff A[PHI: r3
      0x00ff: PHI (r3v12 java.lang.String) = (r3v11 java.lang.String), (r3v14 java.lang.String), (r3v14 java.lang.String), (r3v14 java.lang.String) binds: [B:92:0x00fc, B:54:0x008f, B:56:0x0093, B:58:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r20) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1092510eXJ.LIZ(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig):void");
    }

    public final void LIZIZ(GuidanceConfig guidanceConfig) {
        TriggerConfiguration triggerConfiguration;
        if (guidanceConfig == null) {
            return;
        }
        List<TriggerConfiguration> list = guidanceConfig.triggerConfiguration;
        if (list != null && (triggerConfiguration = (TriggerConfiguration) C13LP.LJJJLL(list)) != null) {
            long j = ((long) triggerConfiguration.delay) * 1000;
            if (j != 0) {
                C786410Ut5.LJLJLJ(this.LIZLLL, this.LIZLLL.obtainMessage(11, guidanceConfig), j);
                return;
            }
        }
        LIZ(guidanceConfig);
    }
}
