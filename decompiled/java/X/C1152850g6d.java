package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageCompressRateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageWidthSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0g6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152850g6d implements InterfaceC1270140j9o {
    public final /* synthetic */ C1286510jaD LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.InterfaceC1270140j9o
    public final /* synthetic */ void LIZIZ(ByteBuffer byteBuffer, int i, int i2) {
    }

    @Override // X.InterfaceC1267390j5N
    public final void onComplete() {
    }

    public C1152850g6d(C1286510jaD c1286510jaD, long j) {
        this.LIZ = c1286510jaD;
        this.LIZIZ = j;
    }

    @Override // X.InterfaceC1270140j9o
    public final void LIZ(boolean z, C1271450jBv c1271450jBv) {
        if (c1271450jBv == null || z) {
            return;
        }
        C20441214yg.LIZIZ("CaptureImageUploadController", "capture catched pic");
        try {
            byte[] bArrLIZ = c1271450jBv.LIZ(LiveBroadcastUploadVideoImageCompressRateSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageWidthSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageHeightSetting.INSTANCE.getValue());
            C1286510jaD c1286510jaD = this.LIZ;
            long j = this.LIZIZ;
            synchronized (this) {
                try {
                    c1286510jaD.LJ.add(new Pair<>(bArrLIZ, Long.valueOf(j)));
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LIZ.LJ();
        } catch (IOException th) {
        }
    }

    @Override // X.InterfaceC1267390j5N
    public final void onError(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("capture error code:");
        sbLIZ.append(i);
        sbLIZ.append(" msg ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CaptureImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
    }
}
