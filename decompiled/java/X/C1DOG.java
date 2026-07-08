package X;

import Y.ARunnableS135S0100000_35;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEReverseCallback;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.runtime.VEEditorResManager;

/* JADX INFO: renamed from: X.1DOG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOG implements InterfaceC1464200oCo {
    public final /* synthetic */ VEEditor LL;
    public final /* synthetic */ boolean LLILLJJLI = true;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TEReverseCallback LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ VEEditorResManager LLIZ;
    public final /* synthetic */ C1DOH LLIZLLLIL;

    @Override // X.InterfaceC1464200oCo
    public final void onCallback(int i, int i2, float f, String str) {
        boolean z;
        if (i != 4103) {
            if (i == 4105) {
                this.LLILZIL.onProgressChanged(((double) f) * 0.5d);
                return;
            }
            return;
        }
        VEEditor vEEditor = this.LL;
        synchronized (vEEditor) {
            try {
                if (vEEditor.LLJLLIL.getNativeHandler() != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            return;
        }
        if (this.LLILLJJLI) {
            TEVideoUtils.nativeReverseAllIVideo2(this.LLILLL, this.LLILZ, this.LLILZIL);
        } else {
            TEVideoUtils.nativeReverseAllIFrameVideoAndMuxAudio2(this.LLILLL, this.LLILZLL, this.LLILZ, this.LLILZIL);
        }
        new BPEAThread(new ARunnableS135S0100000_35(this, 20)).start();
    }

    public C1DOG(VEEditor vEEditor, String str, String str2, TEReverseCallback tEReverseCallback, String str3, VEEditorResManager vEEditorResManager, C1DOH c1doh) {
        this.LL = vEEditor;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = tEReverseCallback;
        this.LLILZLL = str3;
        this.LLIZ = vEEditorResManager;
        this.LLIZLLLIL = c1doh;
    }
}
