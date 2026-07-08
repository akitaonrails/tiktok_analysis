package Y;

import X.C06W2;
import X.C1014200cV0;
import X.C1018070cbF;
import X.C1023640ckE;
import X.C1192870h9B;
import X.C1193630hAP;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS118S0000000_16 implements Function1 {
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
            default:
                return null;
        }
    }

    public AObjectS118S0000000_16(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS118S0000000_16 aObjectS118S0000000_16, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        String str = CrossPlatformActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        c06w2.Dw2(new AObjectS391S0100000_16(c1193630hAP, 0));
        c06w2.Dw2(new AObjectS69S0000000_16(0));
        return null;
    }

    public static final Object invoke$1(AObjectS118S0000000_16 aObjectS118S0000000_16, Object obj) {
        C1014200cV0.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1014200cV0.LJI, "no_cache");
        return null;
    }

    public static final Object invoke$2(AObjectS118S0000000_16 aObjectS118S0000000_16, Object obj) {
        ((C1023640ckE) obj).withParam(C1018070cbF.LJIL, "no_data");
        return null;
    }

    public static final Object invoke$3(AObjectS118S0000000_16 aObjectS118S0000000_16, Object obj) {
        ((C1023640ckE) obj).withParam(C1018070cbF.LJIL, "exception");
        return null;
    }
}
