package X;

import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120040fFi extends AnonymousClass1684<PriorityQueue<AbstractC1120020fFg>> {
    public C1120040fFi() {
        super(new PriorityQueue(10, new Comparator() { // from class: X.0fFh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Intrinsics.LJI(((AbstractC1120020fFg) obj).LIZIZ(), ((AbstractC1120020fFg) obj2).LIZIZ());
            }
        }));
    }
}
