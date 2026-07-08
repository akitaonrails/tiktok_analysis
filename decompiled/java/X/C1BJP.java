package X;

import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: X.1BJP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1BJP {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    public final long LL;
    public static final C1BJW Companion = new C1BJW();
    public static final EnumSet<C1BJP> ALL = EnumSet.allOf(C1BJP.class);

    public static final EnumSet<C1BJP> parseOptions(long j) {
        Companion.getClass();
        return C1BJW.LIZ(j);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static C1BJP[] valuesCustom() {
        return (C1BJP[]) Arrays.copyOf(values(), 3);
    }

    public final long getValue() {
        return this.LL;
    }

    C1BJP(long j) {
        this.LL = j;
    }
}
