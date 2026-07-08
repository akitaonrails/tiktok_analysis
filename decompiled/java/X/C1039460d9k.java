package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.State;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0d9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039460d9k {
    public final C1039470d9l LIZ;
    public final CopyOnWriteArraySet<InterfaceC1039570d9v> LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final AtomicBoolean LJ;
    public int LJFF;
    public long LJI;
    public final BPEAHandler LJII;
    public C1035880d3y LJIIIIZZ;

    public final List<LogItem> LIZ() {
        C1035890d3z adCommonData;
        List<LogItem> list;
        C1035880d3y c1035880d3y = this.LJIIIIZZ;
        return (c1035880d3y == null || (adCommonData = c1035880d3y.getAdCommonData()) == null || (list = adCommonData.logList) == null) ? C13BV.INSTANCE : list;
    }

    public C1039460d9k() {
        C1039470d9l c1039470d9l = new C1039470d9l();
        this.LIZ = c1039470d9l;
        this.LIZIZ = new CopyOnWriteArraySet<>();
        this.LIZJ = System.currentTimeMillis();
        this.LJ = new AtomicBoolean(false);
        this.LJII = new BPEAHandler(Looper.getMainLooper());
        c1039470d9l.LIZIZ = this;
    }

    public final void LIZIZ(EnumC1039490d9n enumC1039490d9n) {
        EnumC1039490d9n enumC1039490d9n2;
        C1035880d3y c1035880d3y;
        C1035890d3z adCommonData;
        C1035890d3z adCommonData2;
        if (!this.LIZ.LIZ.viewable) {
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
        }
        C1035880d3y c1035880d3y2 = this.LJIIIIZZ;
        if (c1035880d3y2 != null && (adCommonData2 = c1035880d3y2.getAdCommonData()) != null) {
            enumC1039490d9n2 = adCommonData2.sessionType;
        } else {
            enumC1039490d9n2 = null;
        }
        if (enumC1039490d9n2 == EnumC1039490d9n.DEFAULT_SESSION_START && (c1035880d3y = this.LJIIIIZZ) != null && (adCommonData = c1035880d3y.getAdCommonData()) != null) {
            adCommonData.setSessionType(enumC1039490d9n);
        }
        C1039470d9l c1039470d9l = this.LIZ;
        c1039470d9l.getClass();
        State state = c1039470d9l.LIZ;
        c1039470d9l.LIZ(enumC1039490d9n, new State(state.viewable, state.usable, true));
    }
}
