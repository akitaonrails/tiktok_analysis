package X;

import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotExtras;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206030hUP {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0gTu] */
    public static final C1167280gTu LIZ(C1698606ky c1698606ky, C1170020gYK c1170020gYK) {
        String str;
        final int i;
        final boolean zLJFF = Intrinsics.LJFF(c1170020gYK.LIZIZ, c1698606ky.LIZIZ.getEffect_id());
        AIGroupShotExtras aIGroupShotExtras = (AIGroupShotExtras) C051M.LIZIZ(AIGroupShotExtras.class, c1698606ky.LIZIZ.getExtra());
        final String name = c1698606ky.LIZIZ.getName();
        final String effect_id = c1698606ky.LIZIZ.getEffect_id();
        final String resourceId = c1698606ky.LIZIZ.getResourceId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) C13LP.LJJJLL(c1698606ky.LIZ));
        if (aIGroupShotExtras == null || (str = aIGroupShotExtras.coverImg) == null) {
            str = "";
        }
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (aIGroupShotExtras != null) {
            i = aIGroupShotExtras.count;
        } else {
            i = 0;
        }
        return new Object(i, name, effect_id, resourceId, strLIZIZ, zLJFF) { // from class: X.0gTu
            public final String LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final int LJ;
            public final boolean LJFF;

            {
                this.LIZ = name;
                this.LIZIZ = effect_id;
                this.LIZJ = resourceId;
                this.LIZLLL = strLIZIZ;
                this.LJ = i;
                this.LJFF = zLJFF;
            }
        };
    }
}
