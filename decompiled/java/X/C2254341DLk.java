package X;

import Y.ARunnableS104S0200000_35;
import android.os.Looper;
import android.util.Pair;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.qr.PicScanner;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import gro.a;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254341DLk implements InterfaceC2254211DKx, MessageCenter.Listener {
    public final VERecorder LL;
    public final C1DKV LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public C1DML LLILZ;
    public PicScanner LLILZIL;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS104S0200000_35 LLIZ = new ARunnableS104S0200000_35(this, 8);

    @Override // X.InterfaceC2254211DKx
    public final void release() {
        PicScanner picScanner = this.LLILZIL;
        if (picScanner != null) {
            picScanner.release();
        }
        MessageCenter.removeListener(this);
    }

    @Override // X.InterfaceC2254211DKx
    public final void stopPicScan() {
        PicScanner picScanner = this.LLILZIL;
        if (picScanner != null) {
            picScanner.stop();
        }
        ARunnableS104S0200000_35 aRunnableS104S0200000_35 = this.LLIZ;
        if (aRunnableS104S0200000_35 != null) {
            this.LLILZLL.removeCallbacks(aRunnableS104S0200000_35);
        }
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC2254211DKx
    public final void stop() {
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
        a aVarLJIIL = this.LL.LJIIL();
        aVarLJIIL.getClass();
        if (((HashMap) aVarLJIIL.LLILZLL).containsKey(7)) {
            Pair pair = (Pair) ((HashMap) aVarLJIIL.LLILZLL).get(7);
            aVarLJIIL.removeTrackAlgorithm(((Integer) pair.second).intValue());
            ((HashMap) aVarLJIIL.LLILZLL).remove(pair);
        }
    }

    @Override // X.InterfaceC2254211DKx
    public final void LIZJ(C2254661DMq c2254661DMq) {
        this.LLILZ = c2254661DMq;
    }

    @Override // X.InterfaceC2254211DKx
    public final void pauseEffectAudio(boolean z) {
        a aVarLJIIL = this.LL.LJIIL();
        aVarLJIIL.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 27);
        tEBundleObtain.setBool("effectaudio", z);
        aVarLJIIL.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC2254211DKx
    public final void processTouchEvent(float f, float f2) {
        this.LL.LJIIL().LJIIL(C1DM1.LIZ(f, f2));
    }

    public C2254341DLk(C1DKV c1dkv, VERecorder vERecorder, Function0 function0) {
        this.LL = vERecorder;
        this.LLILLJJLI = c1dkv;
        this.LLILLL = function0;
    }

    @Override // X.InterfaceC2254211DKx
    public final void LIZIZ(String str, ScanSettings scanSettings, long j) {
        C1DML c1dml;
        stopPicScan();
        if (this.LLILZIL == null) {
            this.LLILZIL = new PicScanner();
        }
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
        PicScanner picScanner = this.LLILZIL;
        if ((picScanner == null || picScanner.start(str, scanSettings) < 0) && (c1dml = this.LLILZ) != null) {
            c1dml.onFail(-2000);
        }
        ARunnableS104S0200000_35 aRunnableS104S0200000_35 = this.LLIZ;
        aRunnableS104S0200000_35.l0 = this.LLILZIL;
        C786410Ut5.LJLIIL(j, this.LLILZLL, aRunnableS104S0200000_35);
    }

    @Override // X.InterfaceC2254211DKx
    public final int LIZ(float f, float f2, float f3, float f4) {
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
        C1DM3 c1dm3 = new C1DM3();
        c1dm3.LIZ = f;
        c1dm3.LIZIZ = f2;
        c1dm3.LIZJ = f3;
        c1dm3.LIZLLL = f4;
        c1dm3.LJ = true;
        c1dm3.LJFF = 65536L;
        return this.LL.LIZIZ.LJJIZ.addTrackAlgorithm(0, 0, c1dm3, 0, Integer.MAX_VALUE);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        EnigmaResult enigmaResult;
        if (!this.LLILLL.invoke().booleanValue() && i == 24) {
            PicScanner picScanner = this.LLILZIL;
            if (picScanner != null) {
                C1DML c1dml = this.LLILZ;
                if (c1dml != null) {
                    c1dml.LIZ(picScanner.getEnigmaResult());
                    return;
                }
                return;
            }
            a aVarLJIIL = this.LL.LJIIL();
            aVarLJIIL.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 104);
            tEBundleObtain.setInt("effectEngineType", 0);
            Object objCallEffectInterfaceWithResult = aVarLJIIL.LL.callEffectInterfaceWithResult(tEBundleObtain);
            if (objCallEffectInterfaceWithResult != null) {
                enigmaResult = (EnigmaResult) objCallEffectInterfaceWithResult;
            } else {
                enigmaResult = null;
            }
            C1DML c1dml2 = this.LLILZ;
            if (c1dml2 == null) {
                return;
            }
            c1dml2.LIZ(enigmaResult);
        }
    }

    @Override // X.InterfaceC2254211DKx
    public final void switchEffectWithTag(String str, int i, int i2, String str2) {
        VERecorder vERecorder = this.LL;
        vERecorder.getClass();
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        vEEffectFilterParam.effectPath = str;
        vEEffectFilterParam.stickerId = i;
        vEEffectFilterParam.reqId = i2;
        vEEffectFilterParam.stickerTag = str2;
        vERecorder.LJJJJJL(vEEffectFilterParam);
    }
}
