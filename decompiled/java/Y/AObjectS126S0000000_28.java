package Y;

import X.AbstractC1250290idn;
import X.C06W2;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C1250300ido;
import X.C13J1;
import X.C766270U4b;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.trill.language.view.AppLanguageListFragment;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AObjectS126S0000000_28 implements Function1 {
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public AObjectS126S0000000_28(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        String str = AppLanguageListFragment._pnsPageId;
        ((C1250300ido) ((AbstractC1250290idn) obj)).LJ = false;
        return null;
    }

    public static final Object invoke$1(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        String str = AppLanguageListFragment._pnsPageId;
        ((C1250300ido) ((AbstractC1250290idn) obj)).LJ = true;
        return null;
    }

    public static final Object invoke$2(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        String str = ScanQRCodeActivityV2._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        c06w2.Dw2(new AObjectS402S0100000_28(c1193630hAP, 2));
        c06w2.Dw2(new AObjectS78S0000000_28(3));
        c06w2.Dw2(new AObjectS78S0000000_28(4));
        return null;
    }

    public static final Object invoke$3(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        C13J1 c13j1 = (C13J1) obj;
        c13j1.LIZJ = true;
        c13j1.LJIIJJI = true;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        ((C13J1) obj).LIZJ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        C766270U4b.LJIIJJI((String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS126S0000000_28 aObjectS126S0000000_28, Object obj) {
        C766270U4b.LJIIJJI((String) obj);
        return Unit.LIZ;
    }
}
