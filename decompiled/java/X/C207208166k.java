package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.166k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207208166k {
    public static final /* synthetic */ int LIZ = 0;

    public static C207211166n LIZ(AbstractC207210166m abstractC207210166m) {
        Boolean bool;
        if (abstractC207210166m.LJII != null) {
            bool = abstractC207210166m.LJII;
        } else {
            boolean z = true;
            if (abstractC207210166m.LJ.length() <= 0 || Intrinsics.LJFF(abstractC207210166m.LJ, "") || !abstractC207210166m.LJFF || Math.floor(Math.random() * ((double) 100)) > abstractC207210166m.LIZIZ()) {
                z = false;
            }
            abstractC207210166m.LJII = Boolean.valueOf(z);
            bool = abstractC207210166m.LJII;
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C207211166n c207211166n = new C207211166n();
            c207211166n.LIZIZ.put("file_scene", abstractC207210166m.LJ);
            c207211166n.LIZIZ.put("file_dir", abstractC207210166m.LIZIZ.getSimpleString$livestorage_release());
            c207211166n.LIZLLL.put("file_name", abstractC207210166m.LIZ);
            c207211166n.LIZLLL.put("file_path", C771370UNr.LIZJ(abstractC207210166m));
            abstractC207210166m.LIZ(c207211166n.LIZ, c207211166n.LIZIZ, c207211166n.LIZJ, c207211166n.LIZLLL);
            return c207211166n;
        }
        return null;
    }
}
