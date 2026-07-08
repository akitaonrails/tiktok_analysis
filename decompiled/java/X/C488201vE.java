package X;

import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemLayout;
import com.bytedance.android.livesdk.model.BoardItemPosition;

/* JADX INFO: renamed from: X.01vE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C488201vE {
    public static final boolean LJ(BoardItemLayout boardItemLayout) {
        if (boardItemLayout.layoutOrder != 0 || boardItemLayout.verticalAnchor != 0 || boardItemLayout.horizontalAnchor != 0 || boardItemLayout.offsetX != 0.0f || boardItemLayout.offsetY != 0.0f || boardItemLayout.defaultXSpacing != 0.0f || boardItemLayout.defaultYSpacing != 0.0f || boardItemLayout.collisionResolve != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(BoardItemPosition boardItemPosition) {
        if (boardItemPosition.x == 0 && boardItemPosition.y == 0 && boardItemPosition.percentageX == 0 && boardItemPosition.percentageY == 0) {
            return true;
        }
        return false;
    }

    public static final void LJI(BoardItem boardItem) {
        float f;
        float f2;
        BoardItemPosition boardItemPosition = boardItem.canvasPosition;
        if (boardItemPosition != null && !LJFF(boardItemPosition)) {
            C488301vF c488301vFLIZ = C488601vI.LIZ();
            float f3 = c488301vFLIZ.LIZ;
            float f4 = c488301vFLIZ.LIZIZ;
            float f5 = c488301vFLIZ.LIZJ;
            float f6 = C488301vF.LJ;
            long j = boardItemPosition.percentageX;
            if (j == 0 && boardItemPosition.percentageY == 0) {
                f = boardItemPosition.x;
                f2 = boardItemPosition.y;
            } else {
                f = (j * f6) / 100.0f;
                f2 = (boardItemPosition.percentageY * f6) / 100.0f;
            }
            float f7 = ((f2 * f3) / f6) + f5;
            BoardItemPosition boardItemPosition2 = new BoardItemPosition();
            boardItemPosition2.x = 0L;
            boardItemPosition2.y = 0L;
            boardItemPosition2.percentageX = (long) ((((f * f3) / f6) / f3) * 100.0f);
            boardItemPosition2.percentageY = (long) ((f7 / f4) * 100.0f);
            boardItem.position = boardItemPosition2;
        }
        BoardItemLayout boardItemLayout = boardItem.canvasItemLayout;
        if (boardItemLayout != null && !LJ(boardItemLayout)) {
            C488301vF c488301vFLIZ2 = C488601vI.LIZ();
            float f8 = c488301vFLIZ2.LIZ;
            float f9 = 1.0f;
            if (f8 < 1.0f) {
                f8 = 1.0f;
            }
            float f10 = c488301vFLIZ2.LIZIZ - c488301vFLIZ2.LIZLLL;
            float f11 = c488301vFLIZ2.LIZJ;
            float f12 = f10 / f8;
            if (f12 < 1.0E-6f) {
                f12 = 1.0E-6f;
            }
            int i = boardItemLayout.verticalAnchor;
            if (i != 1) {
                if (i != 2) {
                    f9 = 0.0f;
                }
            } else {
                f9 = 0.5f;
            }
            float f13 = (((f9 * (f10 - f8)) - f11) / f8) * 100.0f;
            BoardItemLayout boardItemLayout2 = new BoardItemLayout();
            boardItemLayout2.forceLayout = boardItemLayout.forceLayout;
            boardItemLayout2.layoutOrder = boardItemLayout.layoutOrder;
            boardItemLayout2.verticalAnchor = boardItemLayout.verticalAnchor;
            boardItemLayout2.horizontalAnchor = boardItemLayout.horizontalAnchor;
            boardItemLayout2.offsetX = boardItemLayout.offsetX;
            boardItemLayout2.offsetY = (boardItemLayout.offsetY - f13) / f12;
            boardItemLayout2.defaultXSpacing = boardItemLayout.defaultXSpacing;
            boardItemLayout2.defaultYSpacing = boardItemLayout.defaultYSpacing / f12;
            boardItemLayout2.collisionResolve = boardItemLayout.collisionResolve;
            boardItemLayout2.isValid = boardItemLayout.isValid;
            boardItem.boardItemLayout = boardItemLayout2;
        }
    }

    public static final BoardItemLayout LIZ(BoardItem boardItem, C488301vF c488301vF) {
        float f;
        BoardItemLayout boardItemLayout = boardItem.canvasItemLayout;
        if (boardItemLayout != null && !LJ(boardItemLayout)) {
            return boardItemLayout;
        }
        BoardItemLayout boardItemLayout2 = boardItem.boardItemLayout;
        if (boardItemLayout2 == null) {
            return null;
        }
        float f2 = c488301vF.LIZ;
        float f3 = c488301vF.LIZIZ - c488301vF.LIZLLL;
        float f4 = c488301vF.LIZJ;
        float f5 = f3 / f2;
        int i = boardItemLayout2.verticalAnchor;
        if (i != 1) {
            if (i != 2) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
        } else {
            f = 0.5f;
        }
        float f6 = (((f * (f3 - f2)) - f4) / f2) * 100.0f;
        BoardItemLayout boardItemLayout3 = new BoardItemLayout();
        boardItemLayout3.forceLayout = boardItemLayout2.forceLayout;
        boardItemLayout3.layoutOrder = boardItemLayout2.layoutOrder;
        boardItemLayout3.verticalAnchor = boardItemLayout2.verticalAnchor;
        boardItemLayout3.horizontalAnchor = boardItemLayout2.horizontalAnchor;
        boardItemLayout3.offsetX = boardItemLayout2.offsetX;
        boardItemLayout3.offsetY = (boardItemLayout2.offsetY * f5) + f6;
        boardItemLayout3.defaultXSpacing = boardItemLayout2.defaultXSpacing;
        boardItemLayout3.defaultYSpacing = boardItemLayout2.defaultYSpacing * f5;
        boardItemLayout3.collisionResolve = boardItemLayout2.collisionResolve;
        boardItemLayout3.isValid = boardItemLayout2.isValid;
        return boardItemLayout3;
    }

    public static final BoardItemPosition LIZJ(BoardItem boardItem, C488301vF c488301vF) {
        float f;
        float f2;
        BoardItemPosition boardItemPosition = boardItem.canvasPosition;
        if (boardItemPosition != null && !LJFF(boardItemPosition)) {
            return boardItemPosition;
        }
        BoardItemPosition boardItemPosition2 = boardItem.position;
        if (boardItemPosition2 == null) {
            return null;
        }
        float f3 = c488301vF.LIZ;
        float f4 = c488301vF.LIZIZ;
        float f5 = c488301vF.LIZJ;
        float f6 = C488301vF.LJ;
        long j = boardItemPosition2.percentageX;
        if (j == 0 && boardItemPosition2.percentageY == 0) {
            f = (boardItemPosition2.x * f3) / 720.0f;
            f2 = (f4 * boardItemPosition2.y) / 1280.0f;
        } else {
            f = (j * f3) / 100.0f;
            f2 = (f4 * boardItemPosition2.percentageY) / 100.0f;
        }
        BoardItemPosition boardItemPosition3 = new BoardItemPosition();
        float f7 = 100;
        boardItemPosition3.percentageX = (long) ((((f * f6) / f3) / f6) * f7);
        boardItemPosition3.percentageY = (long) (((((f2 - f5) * f6) / f3) / f6) * f7);
        return boardItemPosition3;
    }
}
