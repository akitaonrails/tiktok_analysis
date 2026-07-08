package Y;

import X.C034Y;
import X.C09A6;
import X.C09A7;
import X.C2124108Tv;
import X.C2124208Tw;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS152S1100000_3;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS160S0000000_3 implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS160S0000000_3(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS160S0000000_3 aObjectS160S0000000_3, Object obj, Object obj2) {
        LynxView lynxView;
        String str = (String) obj;
        C2124208Tw c2124208Tw = (C2124208Tw) obj2;
        ConcurrentHashMap<String, WeakReference<LynxView>> concurrentHashMap = C2124108Tv.LLILLL;
        WeakReference<LynxView> weakReference = concurrentHashMap.get(str);
        if (weakReference != null && (lynxView = weakReference.get()) != null) {
            C2124108Tv.LL.getClass();
            C2124108Tv.LIZIZ(str, lynxView, c2124208Tw);
            return Boolean.TRUE;
        }
        new AwS152S1100000_3(str, c2124208Tw, 0);
        C034Y.LIZ();
        concurrentHashMap.remove(str);
        return Boolean.FALSE;
    }

    public static final Object invoke$1(AObjectS160S0000000_3 aObjectS160S0000000_3, Object obj, Object obj2) {
        return C09A7.LJIIIIZZ((String) obj, (CoroutineContext.Element) obj2);
    }

    public static final Object invoke$2(AObjectS160S0000000_3 aObjectS160S0000000_3, Object obj, Object obj2) {
        return C09A6.LIZJ((CoroutineContext) obj, (CoroutineContext.Element) obj2);
    }
}
