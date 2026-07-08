package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS111S0100000_11;
import Y.AfS180S0100000_11;
import Y.AkS481S0100000_19;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.11TL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TL {
    public final ConcurrentHashMap<String, User> LIZ = new ConcurrentHashMap<>();
    public final AObserverS231S0100000_29 LIZIZ = new AObserverS231S0100000_29(this, 254);

    public C11TL() {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS111S0100000_11(this, 197));
        C11TN.LIZ.getClass();
        C11T2.LIZ(C11TN.LIZJ.LIZJ).LIZLLL(true, new InterfaceC19505211Sw[0]).LJJJLZIJ(C11S5.LIZ).LJJJJZI(new AkS481S0100000_19(this, 13)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS180S0100000_11(this, 18));
    }
}
