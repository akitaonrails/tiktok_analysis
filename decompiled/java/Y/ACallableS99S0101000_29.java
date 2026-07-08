package Y;

import X.C118L;
import X.C118O;
import X.C118V;
import X.C119K;
import X.C1233040iBy;
import X.C1C7U;
import com.ss.android.ugc.aweme.api.resp.AnchorSelectionResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS99S0101000_29 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object call$0(ACallableS99S0101000_29 aCallableS99S0101000_29) throws ExecutionException, InterruptedException {
        C1C7U.LIZ("AnchorSelectionModel@95de.fetchList$1");
        C118V c118v = C118V.LIZ;
        int i = ((C118L) aCallableS99S0101000_29.l0).LL;
        int i2 = aCallableS99S0101000_29.i1;
        c118v.getClass();
        AnchorSelectionResponse anchorSelectionResponse = ((C118O) C118V.LIZIZ.create(C118O.class)).LIZIZ(i, 0, i2, 20).get();
        C1C7U.LIZIZ("AnchorSelectionModel@95de.fetchList$1");
        return anchorSelectionResponse;
    }

    public static final Object call$1(ACallableS99S0101000_29 aCallableS99S0101000_29) {
        C1C7U.LIZ("FTCAudioItemAdapter@d5bf.onClickAudioEffect$1$onFail$1");
        C1233040iBy c1233040iBy = new C1233040iBy(((C119K) aCallableS99S0101000_29.l0).LL);
        c1233040iBy.LIZIZ(2131826992);
        c1233040iBy.LIZLLL();
        ((C119K) aCallableS99S0101000_29.l0).LLLI(aCallableS99S0101000_29.i1, 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FTCAudioItemAdapter@d5bf.onClickAudioEffect$1$onFail$1");
        return unit;
    }

    public ACallableS99S0101000_29(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
