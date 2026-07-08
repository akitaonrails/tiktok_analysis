package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1939407ii extends C2217421BqW implements Function1<Iterable<Object>, Iterator<Object>> {
    public static final C1939407ii LL = new C1939407ii();

    public C1939407ii() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        return iterable.iterator();
    }
}
