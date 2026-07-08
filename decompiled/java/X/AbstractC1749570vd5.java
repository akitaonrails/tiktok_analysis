package X;

import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1749570vd5 implements Comparable<AbstractC1749570vd5> {
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL = System.currentTimeMillis();
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS570S0100000_26(this, 1324));
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS570S0100000_26(this, 1323));
    public AnonymousClass0956 LLILZLL;
    public boolean LLIZ;

    public abstract void LIZJ();

    public final int getPriority() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC1749570vd5 abstractC1749570vd5) {
        AbstractC1749570vd5 abstractC1749570vd52 = abstractC1749570vd5;
        if (getPriority() == abstractC1749570vd52.getPriority()) {
            return Intrinsics.LJII(this.LLILLL, abstractC1749570vd52.LLILLL);
        }
        return abstractC1749570vd52.getPriority() - getPriority();
    }

    public AbstractC1749570vd5(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
