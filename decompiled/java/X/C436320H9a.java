package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0H9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436320H9a {
    public static Pair LIZ(Bitmap bitmap) {
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
        c204674156yLIZ.LJFF(0.0f);
        c204674156yLIZ.LJI(0.0f);
        c204674156yLIZ.LJ(0.0f, 0.08f, 0.36f, 0.65f, 0.97f);
        int[] iArrLIZ = c204674156yLIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("weight is ");
        sbLIZ.append(C13LQ.LJJIL(Arrays.copyOf(c204674156yLIZ.LJI, Math.max(0, c204674156yLIZ.LIZLLL)), ",", null, 62));
        C1022620cia.LIZ("AnoleAdCardView", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("histogram is ");
        sbLIZ2.append(C13LQ.LJJIL(Arrays.copyOf(c204674156yLIZ.LJFF, Math.max(0, c204674156yLIZ.LIZLLL)), ",", null, 62));
        C1022620cia.LIZ("AnoleAdCardView", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("result is ");
        sbLIZ3.append(C13LQ.LJJIL(c204674156yLIZ.LIZ(), ",", AFwS236S0000000_6.get$arr$(506), 30));
        C1022620cia.LIZ("AnoleAdCardView", C2188811AlT.LIZIZ(sbLIZ3));
        if (iArrLIZ.length < 2) {
            return null;
        }
        return new Pair(Integer.valueOf(iArrLIZ[0]), Integer.valueOf(iArrLIZ[1]));
    }
}
