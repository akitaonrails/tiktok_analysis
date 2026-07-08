package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634630sdh {
    public static final C1634630sdh LIZ = new C1634630sdh();
    public static String LIZIZ = "";
    public static C1634700sdo LIZJ;
    public static C1634670sdl LIZLLL;
    public static C1634680sdm LJ;

    public static void LIZ(int i, String str, List list, boolean z) {
        if (C1634690sdn.LIZ() && str != null && str.length() != 0) {
            if (!Intrinsics.LJFF(str, LIZIZ)) {
                LIZJ = null;
                LIZLLL = null;
                LJ = null;
                LIZIZ = str;
            }
            C1634680sdm c1634680sdm = LJ;
            if (c1634680sdm != null) {
                c1634680sdm.LIZ = i;
                c1634680sdm.LIZIZ = z;
                List<ProviderEffect> list2 = c1634680sdm.LIZJ;
                if (list2 != null && Boolean.valueOf(list2.addAll(list)) != null) {
                    return;
                }
            }
            LJ = new C1634680sdm(i, z, new ArrayList(list));
        }
    }
}
