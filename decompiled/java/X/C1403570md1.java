package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0md1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403570md1 {
    public static Set LIZ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EnumC1403640md8.Companion.getClass();
        Set setLJIIIZ = C15442062u.LJIIIZ(linkedHashSet, EnumC1403640md8.PARAM_SET);
        EnumC1403590md3.Companion.getClass();
        return C15442062u.LJIIIZ(setLJIIIZ, EnumC1403590md3.PARAM_SET);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0md0] */
    public static C1403560md0 LIZIZ() {
        final Set setLIZ = LIZ();
        return new C0LAB(setLIZ) { // from class: X.0md0
            public static final /* synthetic */ int LIZIZ = 0;

            {
                C1403570md1.LIZ();
                this.LIZ = new C20584084o(setLIZ);
            }
        };
    }
}
