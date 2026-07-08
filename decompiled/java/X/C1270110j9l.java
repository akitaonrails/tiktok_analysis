package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;

/* JADX INFO: renamed from: X.0j9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1270110j9l extends C1270270jA1 {
    public long LLJLLL;
    public long LLJZ;
    public final VideoFrameStatics LLJZIJLIL;
    public float[] LLL;
    public int LLLF;
    public float LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public C1271450jBv LLLI;
    public C777170UeB LLLII;
    public final /* synthetic */ LiveStreamVideoCapture LLLIIII;

    @Override // X.AbstractC1268600j7K
    public final float LLIZLLLIL() {
        VideoFrameStatics videoFrameStatics = this.LLJZIJLIL;
        if (videoFrameStatics != null) {
            return videoFrameStatics.getRealRatePerSecond();
        }
        return 0.0f;
    }

    @Override // X.C1270270jA1, X.C1270170j9r, com.ss.ttlivestreamer.core.engine.NativeObject
    public final void release() {
        C1271450jBv c1271450jBv = this.LLLI;
        if (c1271450jBv != null) {
            c1271450jBv.LJIIIIZZ(0);
            this.LLLI = null;
        }
        super.release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1270110j9l(LiveStreamVideoCapture liveStreamVideoCapture, Intent intent, InterfaceC1270200j9u interfaceC1270200j9u, int i) {
        boolean z;
        super(intent, interfaceC1270200j9u);
        this.LLLIIII = liveStreamVideoCapture;
        this.LLJZIJLIL = new VideoFrameStatics(LSPassThroughRecordSizeConfig.DEFAULT);
        this.LLJJJ = i;
        int iLIZLLL = liveStreamVideoCapture.LLLLII.LIZ.mPushBase.LIZLLL();
        if (iLIZLLL > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLLIL = z;
        this.LLJLL = iLIZLLL;
    }

    @Override // X.AbstractC1268600j7K
    public final int LLJ(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) buffer;
        interfaceC1271560jC6.getTextureId();
        interfaceC1271560jC6.getWidth();
        interfaceC1271560jC6.getHeight();
        int[] iArrLLJJI = LLJJI(interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight(), this.LLLFFI, this.LLLFZ, this.LLLF);
        C777170UeB c777170UeB = this.LLLII;
        if (c777170UeB != null) {
            int i4 = c777170UeB.LIZ;
            c777170UeB.LIZ = i4 - 1;
            if (i4 > 0) {
                this.LLLI.LJFF(interfaceC1271560jC6, iArrLLJJI[0], iArrLLJJI[1]);
            }
        }
        if (this.LLJLLL == 0) {
            this.LLJLLL = j;
        }
        if (this.LLJZ == 0) {
            this.LLJZ = TimeUtils.nativeNanoTime() / 1000;
            long jLLJILLL = LiveStreamVideoCapture.LLJILLL(j);
            if (jLLJILLL > 0) {
                this.LLJZ -= jLLJILLL;
            }
        }
        VideoFrameStatics videoFrameStatics = this.LLJZIJLIL;
        if (videoFrameStatics != null) {
            videoFrameStatics.add();
        }
        long j2 = this.LLJZ + (j - this.LLJLLL);
        this.LLJZ = j2;
        this.LLJLLL = j;
        return this.LLLIIII.LLJ(buffer, i, i2, 0, j2);
    }

    public final int[] LLJJI(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = new int[2];
        if (i3 > 0 && i4 > 0) {
            iArr[0] = i3;
            iArr[1] = i4;
            return iArr;
        }
        if (i5 > 0) {
            if (i2 < i) {
                iArr[0] = i5;
                iArr[1] = (this.LLJI * i5) / this.LLJ;
                return iArr;
            }
            iArr[1] = i5;
            iArr[0] = (this.LLJ * i5) / this.LLJI;
            return iArr;
        }
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }
}
