package Y;

import X.C0Q3E;
import X.C0QER;
import X.C1558360qeg;
import X.C640270P9l;
import X.C640850PBr;
import X.C645140PSe;
import X.C650500PfM;
import X.C650950Pg5;
import X.C651580Ph6;
import X.C669070QMf;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AObjectS385S0100000_10 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS385S0100000_10 aObjectS385S0100000_10) {
        C669070QMf c669070QMf = (C669070QMf) aObjectS385S0100000_10.l0;
        if (C650950Pg5.fetchOwnImmutableData(C651580Ph6.LIZLLL(c669070QMf.LLJIJIL), c669070QMf.LLJI) != null) {
            C0QER c0qer = C640270P9l.LIZ(C651580Ph6.LIZLLL(c669070QMf.LLJIJIL), c669070QMf.LLJI).LL;
            ECSearchEntranceData.Companion.getClass();
            if (C650500PfM.LIZJ(c0qer)) {
                return null;
            }
        }
        KeyboardModel keyboardModel = c669070QMf.LLILZLL;
        if (keyboardModel != null) {
            ((LiveData) keyboardModel.LL.getValue()).setValue(1);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS385S0100000_10 aObjectS385S0100000_10) {
        return C1558360qeg.LJFF(((C645140PSe) aObjectS385S0100000_10.l0).LLILZIL.getFragment(), null);
    }

    public static final Object invoke$2(AObjectS385S0100000_10 aObjectS385S0100000_10) {
        return C1558360qeg.LJFF(((C645140PSe) aObjectS385S0100000_10.l0).LLILZIL.getFragment(), null);
    }

    public static final Object invoke$3(AObjectS385S0100000_10 aObjectS385S0100000_10) {
        BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) aObjectS385S0100000_10.l0;
        if (!baseDiscoverAndSearchFragmentNew.mStatusDestroyed && !baseDiscoverAndSearchFragmentNew.LLJLL.LLILZ) {
            baseDiscoverAndSearchFragmentNew.cS().setCursorVisible(true);
            HandlerHook.viewPost(baseDiscoverAndSearchFragmentNew.cS(), new ARunnableS110S0100000_10(baseDiscoverAndSearchFragmentNew, 216));
            baseDiscoverAndSearchFragmentNew.LLJLL.LL = true;
            C0Q3E.LIZIZ(baseDiscoverAndSearchFragmentNew).fe(new C640850PBr());
            return null;
        }
        return null;
    }

    public AObjectS385S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
