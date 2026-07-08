package X;

import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373330EkN {
    public static final Map<EnumC373450EkZ, C373430EkX> LJFF;
    public final Map<EnumC373450EkZ, C373430EkX> LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final EnumC373340EkO LIZLLL;
    public final EnumC373600Eko LJ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Pair[] pairArr = new Pair[6];
        Object[] objArr = 0;
        pairArr[0] = new Pair(EnumC373450EkZ.TIME_PROGRESS, new C373430EkX(0, (boolean) (0 == true ? 1 : 0), 0.0f, (Integer) null, 30));
        int i = 16;
        pairArr[1] = new Pair(EnumC373450EkZ.PLAY_PAUSE, new C373430EkX((int) (0 == true ? 1 : 0), true, 1.0f, Integer.valueOf(R.raw.icon_play_fill), i));
        float f = 0.34f;
        pairArr[2] = new Pair(EnumC373450EkZ.UNDO, new C373430EkX((int) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), f, Integer.valueOf(R.raw.icon_arrow_turn_left_ltr), i));
        pairArr[3] = new Pair(EnumC373450EkZ.REDO, new C373430EkX((int) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), f, Integer.valueOf(R.raw.icon_arrow_turn_right_ltr), i));
        boolean z = true;
        float f2 = 1.0f;
        pairArr[4] = new Pair(EnumC373450EkZ.FULL_SCREEN, new C373430EkX((int) (objArr == true ? 1 : 0), z, f2, Integer.valueOf(C293800BfO.LIZ() ? R.raw.icon_arrow_expand : R.raw.icon_full_screen), i));
        pairArr[5] = new Pair(EnumC373450EkZ.KEY_FRAME, new C373430EkX(4, z, f2, Integer.valueOf(R.raw.icon_tetragon_plus), i));
        LJFF = C2097608Jq.LJIIIIZZ(pairArr);
    }

    public C373330EkN() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C373330EkN)) {
            return false;
        }
        C373330EkN c373330EkN = (C373330EkN) obj;
        return Intrinsics.LJFF(this.LIZ, c373330EkN.LIZ) && this.LIZIZ == c373330EkN.LIZIZ && this.LIZJ == c373330EkN.LIZJ && this.LIZLLL == c373330EkN.LIZLLL && this.LJ == c373330EkN.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsoleBarStates(viewStates=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentPlayTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalPlayTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", keyframeState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", playState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C373330EkN(Map map, int i) {
        long j;
        EnumC373340EkO enumC373340EkO;
        Map map2 = (i & 1) != 0 ? LJFF : map;
        if ((i & 2) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        long j2 = (i & 4) == 0 ? 0L : -1L;
        if ((i & 8) != 0) {
            enumC373340EkO = EnumC373340EkO.ADD_KEYFRAME;
        } else {
            enumC373340EkO = null;
        }
        this(map2, j, j2, enumC373340EkO, (i & 16) != 0 ? EnumC373600Eko.PAUSE : null);
    }

    public C373330EkN(Map<EnumC373450EkZ, C373430EkX> map, long j, long j2, EnumC373340EkO enumC373340EkO, EnumC373600Eko enumC373600Eko) {
        this.LIZ = map;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = enumC373340EkO;
        this.LJ = enumC373600Eko;
    }

    public static C373330EkN LIZ(C373330EkN c373330EkN, Map map, long j, long j2, EnumC373340EkO enumC373340EkO, EnumC373600Eko enumC373600Eko, int i) {
        long j3 = j2;
        EnumC373600Eko enumC373600Eko2 = enumC373600Eko;
        long j4 = j;
        EnumC373340EkO enumC373340EkO2 = enumC373340EkO;
        Map map2 = map;
        if ((i & 1) != 0) {
            map2 = c373330EkN.LIZ;
        }
        if ((i & 2) != 0) {
            j4 = c373330EkN.LIZIZ;
        }
        if ((i & 4) != 0) {
            j3 = c373330EkN.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC373340EkO2 = c373330EkN.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC373600Eko2 = c373330EkN.LJ;
        }
        c373330EkN.getClass();
        return new C373330EkN(map2, j4, j3, enumC373340EkO2, enumC373600Eko2);
    }
}
