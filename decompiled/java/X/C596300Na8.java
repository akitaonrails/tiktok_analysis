package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Na8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596300Na8 {
    public static final Set<String> LIZIZ = Collections.singleton("live");
    public final LinkedHashSet<C1249580ice> LIZ = new LinkedHashSet<>();

    public final void LIZ(List<? extends InterfaceC596290Na7> list) {
        if (list != null) {
            for (InterfaceC596290Na7 interfaceC596290Na7 : list) {
                Iterator<C1249580ice> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LLIZLLLIL, interfaceC596290Na7.LIZ())) {
                        it2.remove();
                    }
                }
            }
            return;
        }
        this.LIZ.clear();
    }
}
