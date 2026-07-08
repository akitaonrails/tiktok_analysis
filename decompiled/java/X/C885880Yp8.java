package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885880Yp8 {
    public final List<C890610Ywl> LIZ;
    public final boolean LIZIZ;
    public final FilterTabType LIZJ;
    public final Set<EnumC880480YgQ> LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C885880Yp8)) {
            return false;
        }
        C885880Yp8 c885880Yp8 = (C885880Yp8) obj;
        return Intrinsics.LJFF(this.LIZ, c885880Yp8.LIZ) && this.LIZIZ == c885880Yp8.LIZIZ && this.LIZJ == c885880Yp8.LIZJ && Intrinsics.LJFF(this.LIZLLL, c885880Yp8.LIZLLL) && this.LJ == c885880Yp8.LJ && this.LJFF == c885880Yp8.LJFF && this.LJI == c885880Yp8.LJI;
    }

    public C885880Yp8() {
        this(C13BV.INSTANCE, true, FilterTabType.NULL, Collections.singleton(EnumC880480YgQ.NULL), 1, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C885880Yp8(List<? extends C890610Ywl> list, boolean z, FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set, int i, boolean z2, boolean z3) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = filterTabType;
        this.LIZLLL = set;
        this.LJ = i;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
