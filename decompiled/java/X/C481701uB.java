package X;

import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01uB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C481701uB extends C09AY implements Function0<List<? extends InterfaceC482101uF>> {
    public C481701uB() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC482101uF> invoke() {
        return C1697810uHb.LJIIJJI(new InterfaceC482101uF() { // from class: X.01uC
            @Override // X.InterfaceC482101uF
            public final int LIZ() {
                return 20100;
            }

            @Override // X.InterfaceC482101uF
            public final int LIZJ() {
                return 20000;
            }

            @Override // X.InterfaceC482101uF
            public final Board LIZIZ(Board board) {
                Board boardLIZ = board.LIZ();
                boardLIZ.dslVersion = 20100L;
                boardLIZ.minCompatibleDslVersion = 20000L;
                return boardLIZ;
            }
        }, new InterfaceC482101uF() { // from class: X.01uG
            @Override // X.InterfaceC482101uF
            public final int LIZ() {
                return 20200;
            }

            @Override // X.InterfaceC482101uF
            public final int LIZJ() {
                return 20100;
            }

            @Override // X.InterfaceC482101uF
            public final Board LIZIZ(Board board) {
                Board boardLIZ = board.LIZ();
                for (BoardItem boardItem : boardLIZ.boardItemList) {
                    if (boardItem.canvasPosition == null) {
                        boardItem.canvasPosition = C488201vE.LIZJ(boardItem, C488601vI.LIZ());
                    }
                    if (boardItem.canvasItemLayout == null) {
                        boardItem.canvasItemLayout = C488201vE.LIZ(boardItem, C488601vI.LIZ());
                    }
                }
                boardLIZ.dslVersion = 20200L;
                boardLIZ.minCompatibleDslVersion = 20200L;
                return boardLIZ;
            }
        });
    }
}
