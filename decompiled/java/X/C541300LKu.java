package X;

import java.util.List;

/* JADX INFO: renamed from: X.0LKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541300LKu {
    public final List<String> LIZ;
    public final Long LIZIZ;
    public final String LIZJ;

    public C541300LKu() {
        this(null, null, null, 7);
    }

    public C541300LKu(List list, Long l, String str, int i) {
        list = (i & 1) != 0 ? C13BV.INSTANCE : list;
        l = (i & 2) != 0 ? null : l;
        str = (i & 4) != 0 ? null : str;
        this.LIZ = list;
        this.LIZIZ = l;
        this.LIZJ = str;
    }
}
