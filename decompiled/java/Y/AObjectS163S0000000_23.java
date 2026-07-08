package Y;

import X.C1476040oVu;
import X.C1507560pKk;
import X.C1507770pL5;
import X.C1523320pkA;
import X.C786410Ut5;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS138S1200000_23;
import kotlin.jvm.internal.AwS172S1100000_23;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS163S0000000_23 implements Function2 {
    public final int $t;

    public static final Object invoke$2(AObjectS163S0000000_23 aObjectS163S0000000_23, Object obj, Object obj2) {
        ((Long) obj2).longValue();
        return C1476040oVu.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS163S0000000_23(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS163S0000000_23 aObjectS163S0000000_23, Object obj, Object obj2) {
        LynxView lynxView;
        String str = (String) obj;
        C1507770pL5 c1507770pL5 = (C1507770pL5) obj2;
        new AwS172S1100000_23(str, c1507770pL5, 5);
        C1507560pKk.LIZ();
        if (c1507770pL5 == null) {
            return Boolean.FALSE;
        }
        Reference reference = (Reference) ((LinkedHashMap) C1523320pkA.LLILLJJLI).get(str);
        if (reference != null && (lynxView = (LynxView) reference.get()) != null) {
            C786410Ut5.LJL(C1523320pkA.LLILZIL, new ARunnableS119S0100000_19((Object) new AwS138S1200000_23(str, c1507770pL5, lynxView, 1), 56));
            return Boolean.FALSE;
        }
        C1507560pKk.LIZ();
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AObjectS163S0000000_23 aObjectS163S0000000_23, Object obj, Object obj2) {
        int bitRate;
        SimAudioBitrate simAudioBitrate = (SimAudioBitrate) obj;
        SimAudioBitrate simAudioBitrate2 = (SimAudioBitrate) obj2;
        int bitRate2 = 0;
        if (simAudioBitrate != null) {
            bitRate = simAudioBitrate.getBitRate();
        } else {
            bitRate = 0;
        }
        if (simAudioBitrate2 != null) {
            bitRate2 = simAudioBitrate2.getBitRate();
        }
        return Integer.valueOf(bitRate - bitRate2);
    }

    public static final Object invoke$3(AObjectS163S0000000_23 aObjectS163S0000000_23, Object obj, Object obj2) {
        return Integer.valueOf(((SimBitRate) obj2).getBitRate() - ((SimBitRate) obj).getBitRate());
    }
}
