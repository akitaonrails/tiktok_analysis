package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.dataChannel.GameBroadcastFrameEndEvent;
import com.bytedance.android.livesdk.livesetting.game.GameBgFrameFirstDelayTimeSetting;
import com.bytedance.android.livesdk.livesetting.game.GameBgFrameIntervalSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0Udj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776890Udj implements InterfaceC777020Udw {
    public static final long LJFF = GameBgFrameFirstDelayTimeSetting.INSTANCE.getValue();
    public static final long LJI = GameBgFrameIntervalSetting.INSTANCE.getValue();
    public final DataChannel LIZ;
    public Bitmap LIZIZ;
    public C11JF LIZJ;
    public C776910Udl LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC777020Udw
    public final void LIZ() {
    }

    public C776890Udj(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC777020Udw
    public final void LIZIZ(long j, long j2, Object... objArr) {
        ByteBuffer byteBuffer;
        Integer num;
        DataChannel dataChannel;
        Object obj = objArr[0];
        Integer num2 = null;
        if (obj instanceof ByteBuffer) {
            byteBuffer = (ByteBuffer) obj;
        } else {
            byteBuffer = null;
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        Object obj3 = objArr[2];
        if (obj3 instanceof Integer) {
            num2 = (Integer) obj3;
        }
        if (num != null && num2 != null && byteBuffer != null) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
                byteBuffer.rewind();
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
                Bitmap bitmapLIZ = C09BC.LIZ(0.9f, bitmapCreateBitmap);
                this.LIZIZ = bitmapLIZ;
                if (bitmapLIZ != null && (dataChannel = this.LIZ) != null) {
                    dataChannel.FQ2(GameBroadcastFrameEndEvent.class);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("genReportFile failure. exception=");
                sbLIZ.append(e.getMessage());
                C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
