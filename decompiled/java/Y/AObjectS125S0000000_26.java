package Y;

import X.C06W2;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C19D5;
import X.C19D6;
import com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AObjectS125S0000000_26 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS125S0000000_26(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS125S0000000_26 aObjectS125S0000000_26, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        String str = TimeUnlockActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        c06w2.Dw2(new AObjectS400S0100000_26(c1193630hAP, 2));
        c06w2.Dw2(new AObjectS76S0000000_26(0));
        return null;
    }

    public static final Object invoke$1(AObjectS125S0000000_26 aObjectS125S0000000_26, Object obj) {
        String str = MusCountryListActivity._pnsPageId;
        C19D5 c19d5 = C19D6.LIZ;
        ((C06W2) obj).Dw2(new AObjectS76S0000000_26(2));
        return null;
    }

    public static final Object invoke$2(AObjectS125S0000000_26 aObjectS125S0000000_26, Object obj) {
        String str = com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        ((C06W2) obj).Dw2(new AObjectS400S0100000_26(c1193630hAP, 24));
        return null;
    }
}
