package X;

import androidx.appcompat.app.AppCompatDelegateImpl;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19WU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19WU implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl LL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AppCompatDelegateImpl appCompatDelegateImpl = this.LL;
            if ((appCompatDelegateImpl.LLLJ & 1) != 0) {
                appCompatDelegateImpl.LJJJJ(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = this.LL;
            if ((appCompatDelegateImpl2.LLLJ & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                appCompatDelegateImpl2.LJJJJ(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = this.LL;
            appCompatDelegateImpl3.LLLIZZ = false;
            appCompatDelegateImpl3.LLLJ = 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public C19WU(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.LL = appCompatDelegateImpl;
    }
}
