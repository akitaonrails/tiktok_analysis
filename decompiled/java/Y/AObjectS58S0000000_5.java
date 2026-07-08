package Y;

import X.C2222731Bz5;
import X.C2239171CkV;
import X.C353010Dsh;
import X.C357530Dzz;
import X.C366380EYa;
import X.InterfaceC2239231Ckb;
import com.bytedance.ies.cutsame.source.api.AfrApi;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AObjectS58S0000000_5 implements Function0 {
    public final int $t;

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

    public AObjectS58S0000000_5(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS58S0000000_5 aObjectS58S0000000_5) {
        return new C2222731Bz5();
    }

    public static final Object invoke$1(AObjectS58S0000000_5 aObjectS58S0000000_5) {
        C357530Dzz c357530Dzz = C366380EYa.LIZ;
        if (c357530Dzz == null) {
            c357530Dzz = null;
        }
        return c357530Dzz.LIZ.LIZIZ(AfrApi.class);
    }

    public static final Object invoke$2(AObjectS58S0000000_5 aObjectS58S0000000_5) {
        C357530Dzz c357530Dzz = C366380EYa.LIZ;
        C357530Dzz c357530Dzz2 = null;
        if (c357530Dzz == null) {
            c357530Dzz = null;
        }
        InterfaceC2239231Ckb interfaceC2239231Ckb = c357530Dzz.LIZIZ;
        NLEModelDownloader nLEModelDownloader = (NLEModelDownloader) C366380EYa.LIZJ.getValue();
        AfrApi afrApi = (AfrApi) C366380EYa.LIZLLL.getValue();
        C357530Dzz c357530Dzz3 = C366380EYa.LIZ;
        if (c357530Dzz3 != null) {
            c357530Dzz2 = c357530Dzz3;
        }
        return new C2239171CkV(interfaceC2239231Ckb, nLEModelDownloader, afrApi, c357530Dzz2.LJFF);
    }

    public static final Object invoke$3(AObjectS58S0000000_5 aObjectS58S0000000_5) {
        return new C353010Dsh();
    }
}
