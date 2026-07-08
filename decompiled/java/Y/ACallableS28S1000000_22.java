package Y;

import X.C0CHQ;
import X.C1436840nUg;
import X.C1C7U;
import X.C2260008tK;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS28S1000000_22 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS28S1000000_22 aCallableS28S1000000_22) {
        String str = aCallableS28S1000000_22.s0;
        C1C7U.LIZ("ShortVideoConfig2@82cb.saveCreativeToolRootDirToSP$1L");
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        if (str == null) {
            str = "";
        }
        c1436840nUg.LIZJ().edit().putString("creative_tools_root_path", str).apply();
        C1C7U.LIZIZ("ShortVideoConfig2@82cb.saveCreativeToolRootDirToSP$1L");
        return null;
    }

    public static final Object call$1(ACallableS28S1000000_22 aCallableS28S1000000_22) {
        String str = aCallableS28S1000000_22.s0;
        C1C7U.LIZ("AwemePublishCallback@8484.addLocalVideoCache$2L$1L");
        C2260008tK.LIZLLL(str);
        C1C7U.LIZIZ("AwemePublishCallback@8484.addLocalVideoCache$2L$1L");
        return null;
    }

    public ACallableS28S1000000_22(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
