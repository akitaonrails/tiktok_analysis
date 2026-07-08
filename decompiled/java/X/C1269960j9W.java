package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0j9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1269960j9W extends C1271610jCB {
    public final List<InterfaceC1269980j9Y> LLILLJJLI = new CopyOnWriteArrayList();

    public final void LJI(InterfaceC1269980j9Y interfaceC1269980j9Y) {
        if (((CopyOnWriteArrayList) this.LLILLJJLI).contains(interfaceC1269980j9Y)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LLILLJJLI).add(interfaceC1269980j9Y);
    }

    public final void LJIIIIZZ(InterfaceC1269980j9Y interfaceC1269980j9Y) {
        ((CopyOnWriteArrayList) this.LLILLJJLI).remove(interfaceC1269980j9Y);
    }

    public final void LJIIIZ(VideoFrame videoFrame, Bundle bundle) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC1269980j9Y) it2.next()).onData(videoFrame, bundle);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
