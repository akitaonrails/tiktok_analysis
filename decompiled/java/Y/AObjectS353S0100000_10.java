package Y;

import X.C0QLX;
import X.C644560PPy;
import X.C650120Pek;
import X.C650950Pg5;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoImmersiveVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public class AObjectS353S0100000_10 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public AObjectS353S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS353S0100000_10 aObjectS353S0100000_10, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                ((SearchVideoImmersiveVM) aObjectS353S0100000_10.l0).setStateImmediate(AFwS241S0000000_10.get$arr$(260));
            }
        } else {
            ((SearchVideoImmersiveVM) aObjectS353S0100000_10.l0).setStateImmediate(AFwS241S0000000_10.get$arr$(259));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS353S0100000_10 aObjectS353S0100000_10, Object obj) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObjectS353S0100000_10.l0;
        C650950Pg5 c650950Pg5 = (C650950Pg5) obj;
        searchContainerFragment.getClass();
        return c650950Pg5.copy(c650950Pg5.getImmutableData(), c650950Pg5.getMutableData().refreshFragmentData(searchContainerFragment.NR().LLILZIL));
    }

    public static final Object invoke$2(AObjectS353S0100000_10 aObjectS353S0100000_10, Object obj) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObjectS353S0100000_10.l0;
        searchContainerFragment.getClass();
        if (!((Boolean) obj).booleanValue()) {
            int iLJIJJLI = C644560PPy.LJIJJLI();
            if (iLJIJJLI < 0) {
                iLJIJJLI = 0;
            }
            searchContainerFragment.cS(iLJIJJLI);
            return null;
        }
        return null;
    }

    public static final Object invoke$3(AObjectS353S0100000_10 aObjectS353S0100000_10, Object obj) {
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aObjectS353S0100000_10.l0;
        C650120Pek c650120Pek = (C650120Pek) obj;
        if (!searchContainerFragment.LLLIL) {
            searchContainerFragment.LLILZIL.setCurrentItem(C644560PPy.LJIIJ(c650120Pek.LIZ));
            return null;
        }
        return null;
    }

    public static final Object invoke$4(AObjectS353S0100000_10 aObjectS353S0100000_10, Object obj) {
        ((BaseDiscoverAndSearchFragmentNew) aObjectS353S0100000_10.l0).LLLFF = (C0QLX) obj;
        return null;
    }

    public static final Object invoke$5(AObjectS353S0100000_10 aObjectS353S0100000_10, Object obj) {
        ((BaseDiscoverAndSearchFragmentNew) aObjectS353S0100000_10.l0).LLLFFI = (C0QLX) obj;
        return null;
    }
}
