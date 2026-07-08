package Y;

import X.C1722410uvH;
import X.C20085613iQ;
import X.C2280601EOk;
import android.text.Spanned;
import com.ss.android.ugc.aweme.account.login.ui.CountryListSheetFragment;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.component.components.countrylist.MusCountryListSheetFragment;
import java.util.Comparator;

/* JADX INFO: loaded from: classes27.dex */
public class AComparatorS523S0100000_26 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS523S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS523S0100000_26 aComparatorS523S0100000_26, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Spanned) aComparatorS523S0100000_26.l0).getSpanStart(obj)), Integer.valueOf(((Spanned) aComparatorS523S0100000_26.l0).getSpanStart(obj2)));
    }

    public static final int compare$1(AComparatorS523S0100000_26 aComparatorS523S0100000_26, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Spanned) aComparatorS523S0100000_26.l0).getSpanStart(obj)), Integer.valueOf(((Spanned) aComparatorS523S0100000_26.l0).getSpanStart(obj2)));
    }

    public static final int compare$2(AComparatorS523S0100000_26 aComparatorS523S0100000_26, Object obj, Object obj2) {
        return ((MusCountryListSheetFragment) aComparatorS523S0100000_26.l0).getResources().getString(((C1722410uvH) obj).LIZ).compareTo(((MusCountryListSheetFragment) aComparatorS523S0100000_26.l0).getResources().getString(((C1722410uvH) obj2).LIZ));
    }

    public static final int compare$3(AComparatorS523S0100000_26 aComparatorS523S0100000_26, Object obj, Object obj2) {
        return ((CountryListSheetFragment) aComparatorS523S0100000_26.l0).getString(((C2280601EOk) obj).LIZ).compareTo(((CountryListSheetFragment) aComparatorS523S0100000_26.l0).getString(((C2280601EOk) obj2).LIZ));
    }

    public static final int compare$4(AComparatorS523S0100000_26 aComparatorS523S0100000_26, Object obj, Object obj2) {
        MusCountryListActivity musCountryListActivity = (MusCountryListActivity) aComparatorS523S0100000_26.l0;
        String str = MusCountryListActivity._pnsPageId;
        return musCountryListActivity.getResources().getString(((C2280601EOk) obj).LIZ).compareTo(musCountryListActivity.getResources().getString(((C2280601EOk) obj2).LIZ));
    }
}
