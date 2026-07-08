package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.17s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractRunnableC21164217s0 implements Runnable {
    public static final Map<Integer, Integer> LLILZIL = new LinkedHashMap();
    public static volatile int LLILZLL;
    public final int LL;
    public final AtomicInteger LLILLJJLI = new AtomicInteger(EnumC21164117rz.Waiting.ordinal());
    public volatile int LLILLL;
    public volatile int LLILZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(EnumC21164117rz.values()[this.LLILLJJLI.get()].name());
        sbLIZ.append('-');
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('-');
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractRunnableC21164217s0(int i) {
        this.LL = i;
    }
}
