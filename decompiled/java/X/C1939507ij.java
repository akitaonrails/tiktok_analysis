package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.07ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1939507ij extends C2217421BqW implements Function1<Sequence<Object>, Iterator<Object>> {
    public static final C1939507ij LL = new C1939507ij();

    public C1939507ij() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<Object> invoke(Sequence<Object> sequence) {
        return sequence.iterator();
    }
}
