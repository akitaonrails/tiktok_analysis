package X;

import java.util.EnumSet;

/* JADX INFO: renamed from: X.1BJW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJW {
    public static EnumSet LIZ(long j) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(C1BJP.class);
        for (C1BJP c1bjp : C1BJP.ALL) {
            if ((c1bjp.getValue() & j) != 0) {
                enumSetNoneOf.add(c1bjp);
            }
        }
        return enumSetNoneOf;
    }
}
