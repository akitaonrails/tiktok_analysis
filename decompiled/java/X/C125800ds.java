package X;

import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C125800ds {
    public static final Board LIZ(Board board) {
        return (Board) C105700ad.LIZ(C105700ad.LIZIZ(board), Board.class);
    }

    public static final boolean LIZIZ(Board board) {
        BoardItem next;
        boolean z;
        boolean z2;
        SceneryContent sceneryContent;
        ImageContent imageContent;
        Iterator<BoardItem> it2 = board.boardItemList.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (next.boardItemType != 6);
        BoardItem boardItem = next;
        if (boardItem != null && (sceneryContent = boardItem.sceneryContent) != null && (imageContent = sceneryContent.imageContent) != null && imageContent.image != null) {
            z = false;
        } else {
            z = true;
        }
        List<BoardItem> list = board.boardItemList;
        if ((list instanceof Collection) && list.isEmpty()) {
            z2 = true;
        } else {
            Iterator<BoardItem> it3 = list.iterator();
            while (it3.hasNext()) {
                if (it3.next().boardItemType != 6) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        if (!board.boardItemList.isEmpty() && (!z || !z2)) {
            return false;
        }
        return true;
    }
}
