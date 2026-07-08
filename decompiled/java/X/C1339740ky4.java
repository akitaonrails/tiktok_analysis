package X;

import Y.ARunnableS119S0100000_19;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.comment.experiment.HighLightAheadPrefetchConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0ky4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339740ky4 {
    public static List<Float> LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final C01GW LIZLLL;

    static {
        C1339800kyA.LIZ.getClass();
        LIZIZ = C1339800kyA.LIZ().prefetchCount;
        C1339730ky3.LIZ.getClass();
        LIZJ = ((HighLightAheadPrefetchConfig) C1339730ky3.LIZJ.getValue()).prefetchCount;
        LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(142));
    }

    public static void LIZ(Aweme aweme) {
        C1339800kyA.LIZ.getClass();
        if (C1339800kyA.LIZ().enableSmartPrefetch == 2) {
            C0N33 c0n33 = new C0N33();
            c0n33.LJIIJ = aweme;
            c0n33.LIZIZ = "";
            AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) LIZLLL.getValue();
            if (abstractC1511510pR7 != null) {
                abstractC1511510pR7.runAsyncDelay(0L, c0n33, new InterfaceC1511740pRU() { // from class: X.0kyB
                    @Override // X.InterfaceC1511740pRU
                    public final void LIZ(C1512100pS4 c1512100pS4) {
                        ArrayList arrayList;
                        float fFloatValue;
                        Map<String, Float> map;
                        Float f;
                        List<Float> list = C1339740ky4.LIZ;
                        C1339800kyA.LIZ.getClass();
                        List<String> list2 = C1339800kyA.LIZ().labelList;
                        if (list2 != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            for (String str : list2) {
                                if (c1512100pS4 != null && (map = c1512100pS4.LIZJ) != null && (f = map.get(str)) != null) {
                                    fFloatValue = f.floatValue();
                                } else {
                                    fFloatValue = 0.0f;
                                }
                                arrayList.add(Float.valueOf(fFloatValue));
                            }
                        } else {
                            arrayList = null;
                        }
                        C1339740ky4.LIZ = arrayList;
                    }
                });
            }
        }
    }

    public static void LIZIZ(long j, Function1 function1) {
        C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new ARunnableS119S0100000_19(function1, 145));
    }
}
