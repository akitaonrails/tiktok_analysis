package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.0fc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133920fc6 implements Sequence<Object> {
    public final /* synthetic */ Sequence<Object> LIZ;
    public final /* synthetic */ Comparator<Object> LIZIZ;

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        List listLJJIII = C09RB.LJJIII(this.LIZ);
        C08XD.LJJ(listLJJIII, this.LIZIZ);
        return listLJJIII.iterator();
    }

    public C1133920fc6(Sequence<Object> sequence, Comparator<Object> comparator) {
        this.LIZ = sequence;
        this.LIZIZ = comparator;
    }
}
