package Y;

import X.C1290500jge;
import X.C1290610jgp;
import X.C1291600jiQ;
import X.C1295960jpS;
import X.C1C7U;
import X.C2188811AlT;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public class ACallableS97S0101000_20 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    public static final Object call$0(ACallableS97S0101000_20 aCallableS97S0101000_20) {
        return ((C1295960jpS) aCallableS97S0101000_20.l0).lambda$fromRawRes$1(aCallableS97S0101000_20.i1);
    }

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

    public static final Object call$1(ACallableS97S0101000_20 aCallableS97S0101000_20) {
        C1290500jge<C1291600jiQ> c1290500jge;
        C1C7U.LIZ("LottieCompositionFactory@fe8.fromRawRes$1");
        Context context = (Context) aCallableS97S0101000_20.l0;
        int i = aCallableS97S0101000_20.i1;
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rawRes_");
            sbLIZ.append(i);
            c1290500jge = C1290610jgp.LJFF(inputStreamOpenRawResource, C2188811AlT.LIZIZ(sbLIZ), true);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            c1290500jge = new C1290500jge<>(e);
        }
        C1C7U.LIZIZ("LottieCompositionFactory@fe8.fromRawRes$1");
        return c1290500jge;
    }

    public ACallableS97S0101000_20(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
