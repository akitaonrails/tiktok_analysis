package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799200VWs {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final Thread LIZIZ = Looper.getMainLooper().getThread();
    public static final Map<Thread, List<C0VX3>> LIZJ = new LinkedHashMap();
    public static final C799210VWt LIZLLL = new InterfaceC795660VJc() { // from class: X.0VWt
        @Override // X.InterfaceC795660VJc
        public final void LIZ(Thread thread, long[] jArr) {
            if (C799200VWs.LIZ.get() && !Intrinsics.LJFF(thread, C799200VWs.LIZIZ)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) C799200VWs.LIZJ;
                Object arrayList = linkedHashMap.get(thread);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(thread, arrayList);
                }
                ((List) arrayList).add(new C0VX3(C07KH.LJI.invoke().longValue(), jArr));
            }
        }
    };

    public static List LIZ(Thread thread) {
        return (List) ((LinkedHashMap) LIZJ).get(thread);
    }
}
