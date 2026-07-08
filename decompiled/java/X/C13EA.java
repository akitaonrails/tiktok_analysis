package X;

import Y.AObjectS359S0100000_16;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* JADX INFO: renamed from: X.13EA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EA extends AbstractC2253808sK<MatchGroup> {
    public final /* synthetic */ C0XJM LL;

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LL.LIZ.groupCount() + 1;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<MatchGroup> iterator() {
        return new C08LX(new C08LY(new C1939607ik(C1697810uHb.LJIIIZ(this)), new AObjectS359S0100000_16(this, 5)));
    }

    public C13EA(C0XJM c0xjm) {
        this.LL = c0xjm;
    }

    public final MatchGroup LJ(int i) {
        Matcher matcher = this.LL.LIZ;
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(matcher.start(i), matcher.end(i));
        if (intRangeLJIILJJIL.getStart().intValue() >= 0) {
            return new MatchGroup(this.LL.LIZ.group(i), intRangeLJIILJJIL);
        }
        return null;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null && !(obj instanceof MatchGroup)) {
            return false;
        }
        return super.contains(obj);
    }
}
