package X;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2301108zx {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static final void LIZ(String str) {
        String strLIZJ = C570490MZb.LIZJ(str);
        if (!Intrinsics.LJFF(strLIZJ, C570490MZb.LIZJ(C0CHQ.LIZ.getFilesDir().getAbsolutePath())) && !Intrinsics.LJFF(strLIZJ, C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot()) && !Intrinsics.LJFF(strLIZJ, C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot()) && !Intrinsics.LJFF(strLIZJ, C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF()) && !Intrinsics.LJFF(strLIZJ, C0CHQ.LIZ().LJJIIJZLJL().getPathService().getRoot())) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(LIZ);
            C2286708xd.LJIJJ(str, new InterfaceC2287108xh() { // from class: X.08zw
                @Override // X.InterfaceC2287108xh
                public final Object apply(Object obj) {
                    return Boolean.valueOf(!linkedHashSet.contains(((File) obj).getPath()));
                }
            });
        }
    }
}
