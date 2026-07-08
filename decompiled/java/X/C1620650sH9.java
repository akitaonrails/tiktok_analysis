package X;

import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.assem.NoPaymentSeriesPanelSquareAssem;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleAssem;
import com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionAssem;

/* JADX INFO: renamed from: X.0sH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620650sH9 extends AbstractC214823195h {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public C1620650sH9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C1620650sH9 c1620650sH9, int i) {
        if (i < ((NoPaymentSeriesPanelSquareAssem) c1620650sH9.l0).Go().getState().LJIIIIZZ()) {
            InterfaceC1891350zJl interfaceC1891350zJlLJI = ((NoPaymentSeriesPanelSquareAssem) c1620650sH9.l0).Go().getState().LJI(i);
            if (!(interfaceC1891350zJlLJI instanceof C1613170s55) && !(interfaceC1891350zJlLJI instanceof C007R) && !(interfaceC1891350zJlLJI instanceof C1271404yG)) {
                return 1;
            }
            return ((NoPaymentSeriesPanelSquareAssem) c1620650sH9.l0).Lo();
        }
        return ((NoPaymentSeriesPanelSquareAssem) c1620650sH9.l0).Lo();
    }

    public static final int LJFF$1(C1620650sH9 c1620650sH9, int i) {
        if (i < ((MiniDramaCenterNewStyleAssem) c1620650sH9.l0).Go().getState().LJIIIIZZ()) {
            return 1;
        }
        return 3;
    }

    public static final int LJFF$2(C1620650sH9 c1620650sH9, int i) {
        if (i >= ((SeriesVipSubscriptionAssem) c1620650sH9.l0).Go().getState().LJIIIIZZ() || !(((SeriesVipSubscriptionAssem) c1620650sH9.l0).Go().getState().LJI(i) instanceof C1573110r2T)) {
            return 3;
        }
        return 1;
    }
}
