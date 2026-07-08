package X;

import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.AwS31S2200000_8;

/* JADX INFO: renamed from: X.0MOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class CallableC567830MOv<V> implements Callable {
    public final /* synthetic */ C567820MOu LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Pair<Integer, Integer> LLILZ;

    public CallableC567830MOv(C567820MOu c567820MOu, String str, String str2, Pair<Integer, Integer> pair) {
        this.LL = c567820MOu;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = pair;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("CanvasDataGeneratorForStory@ae03.prepareOriginFile$1");
        C567820MOu c567820MOu = this.LL;
        AwS31S2200000_8 awS31S2200000_8 = new AwS31S2200000_8(c567820MOu, (C567820MOu) this.LLILLJJLI, this.LLILLL, (String) this.LLILZ, (Pair<Integer, Integer>) 1);
        c567820MOu.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = awS31S2200000_8.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CanvasDataGeneratorForStory ");
        sbLIZ.append("prepareCopyOriginFile");
        sbLIZ.append(": cost = ");
        sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbLIZ.append(" ms");
        C567850MOx.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("CanvasDataGeneratorForStory@ae03.prepareOriginFile$1");
        return objInvoke;
    }
}
