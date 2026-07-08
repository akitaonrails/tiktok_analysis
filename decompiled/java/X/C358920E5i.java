package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS145S0101000_5;

/* JADX INFO: renamed from: X.0E5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358920E5i implements INLEListenerSeek {
    public final INLEListenerSeek LIZ;
    public final boolean LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
    public final void onSeekDone(int i) {
        if (this.LIZJ.get()) {
            return;
        }
        synchronized (this.LIZJ) {
            try {
                if (this.LIZJ.get()) {
                    return;
                }
                this.LIZJ.set(true);
                if (this.LIZIZ) {
                    C354270Duj.LIZ(0L, new AwS145S0101000_5(this, i, 4));
                } else {
                    this.LIZ.onSeekDone(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C358920E5i(INLEListenerSeek iNLEListenerSeek, boolean z) {
        this.LIZ = iNLEListenerSeek;
        this.LIZIZ = z;
    }
}
