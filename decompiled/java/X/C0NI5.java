package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NI5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0NI5 extends C2217421BqW implements Function1<C0NF3, Double> {
    public C0NI5(Object obj) {
        super(1, obj, C0NFB.class, "getIOCost", "getIOCost(Lcom/ss/android/ugc/aweme/coldcache/sorter/ColdCacheSorterInput;)D", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Double invoke(C0NF3 c0nf3) {
        C0NF3 c0nf32 = c0nf3;
        C0NFB c0nfb = (C0NFB) this.receiver;
        c0nfb.getClass();
        return Double.valueOf((C0NFB.LJIIIIZZ(c0nf32) - c0nfb.LJ(c0nf32)) * (c0nf32.LIZ.LIZ() / 8388608.0d));
    }
}
