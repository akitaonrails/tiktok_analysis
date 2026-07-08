package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NI6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0NI6 extends C2217421BqW implements Function1<C0NF3, Double> {
    public C0NI6(Object obj) {
        super(1, obj, C0NFB.class, "getBitrateInMB", "getBitrateInMB(Lcom/ss/android/ugc/aweme/coldcache/sorter/ColdCacheSorterInput;)D", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Double invoke(C0NF3 c0nf3) {
        this.receiver.getClass();
        return Double.valueOf(c0nf3.LIZ.LIZ() / 8388608.0d);
    }
}
