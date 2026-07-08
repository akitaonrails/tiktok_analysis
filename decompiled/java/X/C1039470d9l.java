package X;

import Y.ARunnableS116S0100000_16;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.LogItem;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric.State;
import java.util.List;

/* JADX INFO: renamed from: X.0d9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039470d9l {
    public State LIZ = new State(false, false, false);
    public C1039460d9k LIZIZ;

    public final void LIZ(EnumC1039490d9n enumC1039490d9n, State state) {
        C1035890d3z adCommonData;
        List<LogItem> list;
        State state2 = this.LIZ;
        state2.getClass();
        State state3 = new State(state2.viewable, state2.usable, state2.sessionStarted);
        this.LIZ = state;
        C1039460d9k c1039460d9k = this.LIZIZ;
        if (c1039460d9k != null) {
            State state4 = new State(state.viewable, state.usable, state.sessionStarted);
            C1035880d3y c1035880d3y = c1039460d9k.LJIIIIZZ;
            if (c1035880d3y != null && (adCommonData = c1035880d3y.getAdCommonData()) != null && (list = adCommonData.logList) != null) {
                list.add(new LogItem(enumC1039490d9n.getValue(), state3, state4));
            }
            if (enumC1039490d9n == EnumC1039490d9n.GA_SESSION_START || enumC1039490d9n == EnumC1039490d9n.ADOBE_SESSION_START) {
                for (InterfaceC1039570d9v interfaceC1039570d9v : c1039460d9k.LIZIZ) {
                    if (interfaceC1039570d9v != null) {
                        interfaceC1039570d9v.I1(enumC1039490d9n.getValue(), state4.viewable);
                    }
                }
            }
            if (state4.viewable && state4.usable) {
                if (state3.viewable && state3.usable) {
                    return;
                }
                if (!state4.sessionStarted) {
                    c1039460d9k.LIZIZ(EnumC1039490d9n.DEFAULT_SESSION_START);
                }
                C786410Ut5.LJL(c1039460d9k.LJII, new ARunnableS116S0100000_16(c1039460d9k, 139));
            }
        }
    }
}
