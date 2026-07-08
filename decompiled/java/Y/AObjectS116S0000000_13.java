package Y;

import X.C06W2;
import X.C2188811AlT;
import X.C844830XCf;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AObjectS116S0000000_13 implements Function1 {
    public final int $t;

    public static final Object invoke$1(AObjectS116S0000000_13 aObjectS116S0000000_13, Object obj) {
        return null;
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
            default:
                return null;
        }
    }

    public AObjectS116S0000000_13(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS116S0000000_13 aObjectS116S0000000_13, Object obj) {
        String str = PushLoginActivity._pnsPageId;
        ((C06W2) obj).Dw2(new AObjectS66S0000000_13(1));
        return null;
    }

    public static final Object invoke$2(AObjectS116S0000000_13 aObjectS116S0000000_13, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initTicketGuard =");
        sbLIZ.append(obj);
        C844830XCf.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }
}
