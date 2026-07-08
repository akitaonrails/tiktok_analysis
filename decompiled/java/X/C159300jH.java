package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00jH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C159300jH extends AbstractC1493005su {
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C159300jH)) {
            return false;
        }
        C159300jH c159300jH = (C159300jH) obj;
        return Intrinsics.LJFF(this.LIZLLL, c159300jH.LIZLLL) && Intrinsics.LJFF(this.LJ, c159300jH.LJ) && Intrinsics.LJFF(this.LJFF, c159300jH.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        String str = this.LJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterStickerStoreEventBody(scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tab=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C159300jH(String str, String str2, String str3) {
        String str4;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, str), new Pair("tab", str3));
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        super(mapLJIIIIZZ, null, C2097908Jt.LIZJ(new Pair("creator_user_id", str4)), 2);
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
