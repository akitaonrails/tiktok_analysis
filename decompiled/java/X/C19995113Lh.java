package X;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.13Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19995113Lh implements Sequence<IntRange> {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> LIZLLL;

    @Override // kotlin.sequences.Sequence
    public final Iterator<IntRange> iterator() {
        return new C19995013Lg(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19995113Lh(CharSequence charSequence, int i, int i2, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        this.LIZ = charSequence;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = function2;
    }
}
