package X;

import com.bytedance.scene.Scene;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00j6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C158200j6 extends AbstractC1493005su {
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158200j6)) {
            return false;
        }
        C158200j6 c158200j6 = (C158200j6) obj;
        return Intrinsics.LJFF(this.LIZLLL, c158200j6.LIZLLL) && this.LJ == c158200j6.LJ;
    }

    public final int hashCode() {
        return (this.LIZLLL.hashCode() * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterStickerSetDetailEventBody(scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stickerSetId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C158200j6(String str, long j) {
        super(C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, str)), null, C2097908Jt.LIZJ(new Pair("sticker_set_id", Long.valueOf(j))), 2);
        this.LIZLLL = str;
        this.LJ = j;
    }
}
