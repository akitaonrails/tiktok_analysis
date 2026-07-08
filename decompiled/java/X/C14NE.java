package X;

import com.ss.android.ugc.aweme.nimblecard.tako.model.LoopVariables;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14NE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14NE {
    public static final Map<String, Object> LIZIZ(C14ND c14nd) {
        String str;
        String str2;
        Pair[] pairArr = new Pair[2];
        LoopVariables loopVariables = c14nd.LIZIZ;
        String str3 = "";
        if (loopVariables == null || (str = loopVariables.itemKey) == null) {
            str = "";
        }
        pairArr[0] = new Pair(str, c14nd.LIZJ);
        LoopVariables loopVariables2 = c14nd.LIZIZ;
        if (loopVariables2 != null && (str2 = loopVariables2.indexKey) != null) {
            str3 = str2;
        }
        pairArr[1] = new Pair(str3, Integer.valueOf(c14nd.LIZ));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final C14NX LIZ(C14NX c14nx, Function1<? super C14NX, Boolean> function1) {
        if (function1.invoke(c14nx).booleanValue()) {
            return c14nx;
        }
        if (c14nx instanceof InterfaceC689530R2x) {
            Iterator<C14NX> it2 = ((InterfaceC689530R2x) c14nx).LIZ().iterator();
            while (it2.hasNext()) {
                C14NX c14nxLIZ = LIZ(it2.next(), function1);
                if (c14nxLIZ != null) {
                    return c14nxLIZ;
                }
            }
            return null;
        }
        return null;
    }
}
