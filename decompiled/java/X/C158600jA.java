package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00jA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C158600jA extends AbstractC1493005su {
    public final String LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158600jA)) {
            return false;
        }
        C158600jA c158600jA = (C158600jA) obj;
        return Intrinsics.LJFF(this.LIZLLL, c158600jA.LIZLLL) && Intrinsics.LJFF(this.LJ, c158600jA.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        Long l = this.LJ;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterStickerInputPanelEventBody(scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stickerSetId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C158600jA(String str, Long l) {
        long jLongValue;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, str));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        super(mapLIZJ, null, C2097908Jt.LIZJ(new Pair("sticker_set_id", Long.valueOf(jLongValue))), 2);
        this.LIZLLL = str;
        this.LJ = l;
    }
}
