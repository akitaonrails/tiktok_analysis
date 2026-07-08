package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveMktAndQualToFoundationBoardConvertSetting;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C125700dr {
    public static final List<InterfaceC050600Gi> LIZ = C1697810uHb.LJIIJJI(new InterfaceC050600Gi() { // from class: X.00Gd
        /* JADX WARN: Removed duplicated region for block: B:101:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
        @Override // X.InterfaceC050600Gi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.bytedance.android.livesdk.model.BoardItem LIZ(com.bytedance.android.livesdk.model.BoardItem r17) {
            /*
                Method dump skipped, instruction units count: 463
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C050100Gd.LIZ(com.bytedance.android.livesdk.model.BoardItem):com.bytedance.android.livesdk.model.BoardItem");
        }
    }, new InterfaceC050600Gi() { // from class: X.00Gh
        @Override // X.InterfaceC050600Gi
        public final BoardItem LIZ(BoardItem boardItem) {
            if (boardItem.boardItemType != 4) {
                return boardItem;
            }
            BoardItem boardItemLIZ = boardItem.LIZ();
            if (LiveMktAndQualToFoundationBoardConvertSetting.INSTANCE.getValue()) {
                boardItemLIZ.boardItemType = 7;
            }
            BoardItemStyle boardItemStyle = boardItemLIZ.style;
            if (boardItemStyle == null) {
                boardItemStyle = new BoardItemStyle();
            }
            BoardItemStyle boardItemStyleLIZ = boardItemStyle.LIZ();
            boardItemStyleLIZ.colorTheme = "#FFFFFF";
            boardItemStyleLIZ.fonts.clear();
            boardItemLIZ.style = boardItemStyleLIZ;
            return boardItemLIZ;
        }
    });

    public static Board LIZ(Board board) {
        boolean z;
        boolean z2;
        BoardItemStyle boardItemStyle;
        List<BoardItem> list = board.boardItemList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<BoardItem> it2 = list.iterator();
        while (it2.hasNext()) {
            BoardItem next = it2.next();
            Iterator<InterfaceC050600Gi> it3 = LIZ.iterator();
            while (it3.hasNext()) {
                next = it3.next().LIZ(next);
            }
            arrayList.add(next);
        }
        Iterable iterableLJIIIZ = C1697810uHb.LJIIIZ(arrayList);
        boolean z3 = true;
        if ((iterableLJIIIZ instanceof Collection) && ((Collection) iterableLJIIIZ).isEmpty()) {
            z = false;
        } else {
            C531650Kt9 it4 = iterableLJIIIZ.iterator();
            while (it4.LLILLL) {
                int iNextInt = it4.nextInt();
                if (ListProtector.get(arrayList, iNextInt) != ListProtector.get(list, iNextInt)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (board.version < 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return board;
        }
        Board boardLIZ = board.LIZ();
        boardLIZ.version = 2;
        String str = board.previewBgColor;
        if (str.length() <= 0) {
            z3 = false;
        }
        String str2 = null;
        if (!Boolean.valueOf(z3).booleanValue()) {
            BoardItem boardItem = (BoardItem) C13LP.LJJJLL(board.boardItemList);
            if (boardItem != null && (boardItemStyle = boardItem.style) != null) {
                str2 = boardItemStyle.colorTheme;
            }
            Map<String, String> map = C1EAT.LIZ;
            str = C1EAT.LIZ.get(String.valueOf(str2));
            if (str == null) {
                str = "#505050";
            }
        }
        boardLIZ.previewBgColor = str;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (ListProtector.get(arrayList, i) != ListProtector.get(list, i)) {
                ListProtector.set(boardLIZ.boardItemList, i, ListProtector.get(arrayList, i));
            }
        }
        return boardLIZ;
    }
}
