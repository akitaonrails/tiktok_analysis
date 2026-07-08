package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: renamed from: X.00q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C201400q4 {
    public static final C201600q6 LIZ(C201600q6 c201600q6) {
        C201600q6 c201600q62 = new C201600q6(null);
        c201600q62.LIZ.addAll(c201600q6.LIZ);
        c201600q62.LIZIZ = c201600q6.LIZIZ;
        c201600q62.LIZJ = c201600q6.LIZJ;
        return c201600q62;
    }

    public static final HostBoard LIZIZ(InterfaceC201500q5 interfaceC201500q5) {
        HostBoard hostBoardLIZ = interfaceC201500q5.LIZ();
        HostBoard hostBoard = new HostBoard();
        hostBoard.boardId = hostBoardLIZ.boardId;
        hostBoard.bizType = hostBoardLIZ.bizType;
        hostBoard.subBizType = hostBoardLIZ.subBizType;
        hostBoard.nonFoldable = hostBoardLIZ.nonFoldable;
        hostBoard.nonDeletable = hostBoardLIZ.nonDeletable;
        hostBoard.nonClippable = hostBoardLIZ.nonClippable;
        hostBoard.boardInfo = hostBoardLIZ.boardInfo;
        return hostBoard;
    }

    public static final MultiHostBoard LIZJ(C201600q6 c201600q6) {
        MultiHostBoard multiHostBoard = new MultiHostBoard();
        List<C2757014x> list = c201600q6.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C2757014x> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        multiHostBoard.hostBoardList = new ArrayList(arrayList);
        multiHostBoard.position = c201600q6.LIZIZ;
        return multiHostBoard;
    }
}
