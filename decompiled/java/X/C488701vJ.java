package X;

import com.bytedance.android.livesdk.model.BoardItemPosition;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C488701vJ {
    public static final /* synthetic */ int LIZ = 0;

    public static BoardItemPosition LIZIZ(float f, float f2) {
        float f3 = C488301vF.LJ;
        BoardItemPosition boardItemPosition = new BoardItemPosition();
        boardItemPosition.percentageX = (long) ((f / f3) * 100.0f);
        boardItemPosition.percentageY = (long) ((f2 / f3) * 100.0f);
        return boardItemPosition;
    }

    public static Pair LIZ(BoardItemPosition boardItemPosition, float f, float f2) {
        float f3;
        float f4;
        C488301vF c488301vFLIZ = C488601vI.LIZ();
        float f5 = C488301vF.LJ;
        float f6 = c488301vFLIZ.LIZ;
        long j = boardItemPosition.percentageX;
        if (j == 0 && boardItemPosition.percentageY == 0) {
            f3 = boardItemPosition.x;
            f4 = boardItemPosition.y;
        } else {
            f3 = (j * f5) / 100.0f;
            f4 = (boardItemPosition.percentageY * f5) / 100.0f;
        }
        float f7 = 2;
        return new Pair(Float.valueOf(((f3 * f6) / f5) - (f / f7)), Float.valueOf((((f4 * f6) / f5) + c488301vFLIZ.LIZJ) - (f2 / f7)));
    }

    public static BoardItemPosition LIZJ(float f, float f2, float f3, float f4) {
        C488301vF c488301vFLIZ = C488601vI.LIZ();
        float f5 = C488301vF.LJ;
        float f6 = c488301vFLIZ.LIZ;
        float f7 = 2;
        return LIZIZ(((f + (f3 / f7)) * f5) / f6, (((f2 + (f4 / f7)) - c488301vFLIZ.LIZJ) * f5) / f6);
    }
}
