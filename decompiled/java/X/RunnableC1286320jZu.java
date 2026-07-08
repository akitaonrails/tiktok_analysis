package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.vesdk.VEBingoInvoker;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1286320jZu implements Runnable {
    public final /* synthetic */ long[] LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1464150oCj LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int[] LLIZ;
    public final /* synthetic */ int[] LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ VEBingoInvoker LLJIJIL;

    public final void LIZ() {
        final ByteBuffer[] byteBufferArr = {null};
        final float[] fArr = {0.0f};
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(new InterfaceC1286300jZs() { // from class: X.0jZt
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ.LL[0];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("frameProcessSoft");
                sbLIZ.append(this.LIZJ.LLILLJJLI);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" cost time :");
                sbLIZ2.append(jCurrentTimeMillis);
                sbLIZ2.append(" ptsMs: ");
                sbLIZ2.append(i3);
                C2484209oO.LJI(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ.LL[0] = System.currentTimeMillis();
                ByteBuffer[] byteBufferArr2 = byteBufferArr;
                ByteBuffer byteBuffer2 = byteBufferArr2[0];
                if (byteBuffer2 == null) {
                    byteBufferArr2[0] = byteBuffer;
                    fArr[0] = i3;
                    RunnableC1286320jZu runnableC1286320jZu = this.LIZJ;
                    return runnableC1286320jZu.LLJIJIL.genFrameMap.get(Integer.valueOf(runnableC1286320jZu.LLILLJJLI)).booleanValue();
                }
                RunnableC1286320jZu runnableC1286320jZu2 = this.LIZJ;
                runnableC1286320jZu2.LLJIJIL.mNativeBingoHandler.processBingoFrames(byteBuffer2, byteBuffer, i, i2, fArr[0], runnableC1286320jZu2.LLILLL);
                byteBufferArr[0] = null;
                fArr[0] = 0.0f;
                RunnableC1286320jZu runnableC1286320jZu3 = this.LIZJ;
                runnableC1286320jZu3.LLJIJIL.progressBack(runnableC1286320jZu3.LLILZ, runnableC1286320jZu3.LLILZIL, runnableC1286320jZu3.LLILLJJLI, runnableC1286320jZu3.LLILZLL, runnableC1286320jZu3.LLIZ);
                RunnableC1286320jZu runnableC1286320jZu4 = this.LIZJ;
                return runnableC1286320jZu4.LLJIJIL.genFrameMap.get(Integer.valueOf(runnableC1286320jZu4.LLILLJJLI)).booleanValue();
            }
        });
        TEVideoUtils.nativeGetVideoFrameMore(this.LLILLL, this.LLIZLLLIL, this.LLJ, this.LLJI, false, false, 2, true, tEVideoUtilsCallback);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VEBingoInvoker@daec.beginGenVideoFrames$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEBingoInvoker@daec.beginGenVideoFrames$1");
    }

    public RunnableC1286320jZu(VEBingoInvoker vEBingoInvoker, long[] jArr, int i, String str, InterfaceC1464150oCj interfaceC1464150oCj, int i2, long j, int[] iArr, int[] iArr2, int i3, int i4) {
        this.LLJIJIL = vEBingoInvoker;
        this.LL = jArr;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = interfaceC1464150oCj;
        this.LLILZIL = i2;
        this.LLILZLL = j;
        this.LLIZ = iArr;
        this.LLIZLLLIL = iArr2;
        this.LLJ = i3;
        this.LLJI = i4;
    }
}
