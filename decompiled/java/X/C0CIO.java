package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CIO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIO {
    public static final C01GW<C0CIO> LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2380));
    public final ReentrantLock LIZ = new ReentrantLock();
    public final Map<C0CIJ, InterfaceC1631630sYr<VideoPublishEditModel, NLEModel, NLETrack, NLETrackSlot, Boolean>> LIZIZ = new LinkedHashMap();

    public final void LIZ(C0CIJ c0cij, InterfaceC1631630sYr<? super VideoPublishEditModel, ? super NLEModel, ? super NLETrack, ? super NLETrackSlot, Boolean> interfaceC1631630sYr) {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            this.LIZIZ.put(c0cij, interfaceC1631630sYr);
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
