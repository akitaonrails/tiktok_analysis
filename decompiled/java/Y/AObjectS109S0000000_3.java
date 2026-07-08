package Y;

import X.C2342709Fx;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.Map;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS109S0000000_3 implements Function1 {
    public final int $t;

    public static final Object invoke$11(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return obj;
    }

    public static final Object invoke$9(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return Boolean.valueOf(obj == null);
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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public AObjectS109S0000000_3(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
    }

    public static final Object invoke$1(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
    }

    public static final Object invoke$10(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return new ViewModelStoreOwnerViewModel();
    }

    public static final Object invoke$2(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Byte) obj).byteValue())}, 1));
    }

    public static final Object invoke$3(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Byte) obj).byteValue())}, 1));
    }

    public static final Object invoke$4(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
    }

    public static final Object invoke$5(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Byte) obj).byteValue())}, 1));
    }

    public static final Object invoke$6(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb = new StringBuilder();
        C2342709Fx.LIZ(str, sb);
        sb.append(':');
        sb.append(value);
        return sb.toString();
    }

    public static final Object invoke$7(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return ((Sequence) obj).iterator();
    }

    public static final Object invoke$8(AObjectS109S0000000_3 aObjectS109S0000000_3, Object obj) {
        return ((IndexedValue) obj).LIZIZ;
    }
}
