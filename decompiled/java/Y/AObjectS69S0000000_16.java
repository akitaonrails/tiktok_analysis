package Y;

import X.C1268304xl;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS69S0000000_16 implements Function0 {
    public final int $t;

    public static final Object invoke$1(AObjectS69S0000000_16 aObjectS69S0000000_16) {
        return null;
    }

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public AObjectS69S0000000_16(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS69S0000000_16 aObjectS69S0000000_16) {
        String str = CrossPlatformActivity._pnsPageId;
        return new C1268304xl(true, true);
    }

    public static final Object invoke$2(AObjectS69S0000000_16 aObjectS69S0000000_16) {
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AObjectS69S0000000_16 aObjectS69S0000000_16) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$4(AObjectS69S0000000_16 aObjectS69S0000000_16) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$5(AObjectS69S0000000_16 aObjectS69S0000000_16) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$6(AObjectS69S0000000_16 aObjectS69S0000000_16) {
        return new BPEAHandler(Looper.getMainLooper());
    }
}
