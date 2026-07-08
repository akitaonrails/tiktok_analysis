package X;

import Y.AkS199S0300000_15;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953360aus<T, R> implements InterfaceC1487280oo2 {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Function2<Integer, Integer, Unit> LLILLJJLI;
    public final /* synthetic */ List<C917840Zza> LLILLL;

    public C953360aus(long j, List list, Function2 function2) {
        this.LL = j;
        this.LLILLJJLI = function2;
        this.LLILLL = list;
    }

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        IndexedValue indexedValue = (IndexedValue) obj;
        return C11NZ.LJJJJZ(indexedValue).LJJI(this.LL, TimeUnit.MILLISECONDS).LJJJIL(new AkS199S0300000_15((Object) this.LLILLJJLI, (C971050bNP) indexedValue, (List<String>) this.LLILLL, (C259800zU<List<C953770avX>>) 1));
    }
}
