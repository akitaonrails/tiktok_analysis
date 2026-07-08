package Y;

import X.AbstractC1250290idn;
import X.C06W2;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C1251150ifB;
import X.C19319810iC;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AObjectS128S0000000_31 implements Function1 {
    public final int $t;

    public static final Object invoke$3(AObjectS128S0000000_31 aObjectS128S0000000_31, Object obj) {
        return PushSettingActivity.LLLLLZL((C19319810iC) obj);
    }

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

    public AObjectS128S0000000_31(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS128S0000000_31 aObjectS128S0000000_31, Object obj) {
        AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) obj;
        if (abstractC1250290idn instanceof C1251150ifB) {
            ((C1251150ifB) abstractC1250290idn).LJI = true;
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS128S0000000_31 aObjectS128S0000000_31, Object obj) {
        String str = MusicDetailListActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        ((C06W2) obj).Dw2(new AObjectS405S0100000_31(c1193630hAP, 1));
        return null;
    }

    public static final Object invoke$2(AObjectS128S0000000_31 aObjectS128S0000000_31, Object obj) {
        String str = PushSettingActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        ((C06W2) obj).Dw2(new AObjectS405S0100000_31(c1193630hAP, 2));
        return null;
    }

    public static final Object invoke$4(AObjectS128S0000000_31 aObjectS128S0000000_31, Object obj) {
        String str = QRCodeFragment._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        ((C06W2) obj).Dw2(new AObjectS405S0100000_31(c1193630hAP, 3));
        return null;
    }

    public static final Object invoke$5(AObjectS128S0000000_31 aObjectS128S0000000_31, Object obj) {
        String str = QRCodeFragment._pnsPageId;
        ((C06W2) obj).Dw2(new Function0() { // from class: X.15yp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str2 = QRCodeFragment._pnsPageId;
                return new C06W5(0);
            }
        });
        return null;
    }
}
