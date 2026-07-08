package X;

import android.content.Context;
import com.bytedance.android.live.DecorationEditLogDataEvent;
import com.bytedance.android.live.DecorationJumpToItemEditorEvent;
import com.bytedance.android.live.EditDecorationItemEvent;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.android.livesdk.model.BoardItemTransform;
import com.bytedance.android.livesdk.model.LastUsedLiveBoardsModel;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS13S0410000_27;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0xJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814520xJq implements InterfaceC1814530xJr {
    public static final C1814520xJq LIZ = new C1814520xJq();
    public static final C2252321DDq LIZIZ = C1BNE.LIZ(C1700920uMc.LIZ);
    public static DataChannel LIZJ;

    @Override // X.InterfaceC1814530xJr
    public final void LJIILIIL() {
        LIZJ = null;
        C2252321DDq c2252321DDq = LIZIZ;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), C1700920uMc.LIZ)) {
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final void release() {
        LIZJ = null;
    }

    @Override // X.InterfaceC1814530xJr
    public final Long LJ() {
        AbstractC1700910uMb abstractC1700910uMb = (AbstractC1700910uMb) LIZIZ.getValue();
        if (abstractC1700910uMb instanceof C1700890uMZ) {
            return Long.valueOf(((C1700890uMZ) abstractC1700910uMb).LIZ.id);
        }
        if (abstractC1700910uMb instanceof C1700900uMa) {
            return Long.valueOf(((C1700900uMa) abstractC1700910uMb).LIZIZ.id);
        }
        return null;
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJIIJJI() {
        C2252321DDq c2252321DDq = LIZIZ;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), C1700920uMc.LIZ)) {
        }
        C20337914i1<LastUsedLiveBoardsModel> c20337914i1 = C0KPJ.pf;
        LastUsedLiveBoardsModel lastUsedLiveBoardsModelLIZIZ = c20337914i1.LIZIZ();
        lastUsedLiveBoardsModelLIZIZ.boardId = 0L;
        lastUsedLiveBoardsModelLIZIZ.updateTime = System.currentTimeMillis();
        lastUsedLiveBoardsModelLIZIZ.needRestore = false;
        c20337914i1.LIZJ();
        if (C500260Jjc.LJJ()) {
            C768300UBw.LJIIL(null, C784830UqX.LIZ);
            C784830UqX.LIZ = null;
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final AnonymousClass0951 LJIIL() {
        return C09IC.LIZIZ(LIZIZ);
    }

    @Override // X.InterfaceC1814530xJr
    public final void LIZ(DataChannel dataChannel) {
        LIZJ = dataChannel;
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJIILJJIL(InterfaceC1776570wKd interfaceC1776570wKd) {
        InterfaceC490060JJs interfaceC490060JJs;
        Object value = LIZIZ.getValue();
        if ((value instanceof InterfaceC490060JJs) && (interfaceC490060JJs = (InterfaceC490060JJs) value) != null) {
            List<BoardItem> list = interfaceC490060JJs.LIZIZ().boardItemList;
            ArrayList arrayList = new ArrayList();
            for (BoardItem boardItem : list) {
                BoardItem boardItem2 = boardItem;
                if (interfaceC1776570wKd instanceof C1776560wKc) {
                    if (boardItem2.boardItemType != ((C1776560wKc) interfaceC1776570wKd).LIZ) {
                        arrayList.add(boardItem);
                    }
                } else if (interfaceC1776570wKd instanceof C1776890wL9) {
                    if (boardItem2.id != ((C1776890wL9) interfaceC1776570wKd).LIZ) {
                        arrayList.add(boardItem);
                    }
                } else {
                    throw new C1954807lC();
                }
            }
            interfaceC490060JJs.LIZIZ().boardItemList = new ArrayList(arrayList);
            C13LP.LJJLIIIJ(interfaceC490060JJs.LIZIZ().boardItemList, null, null, null, 0, null, AFwS269S0000000_27.get$arr$(484), 31);
            if (arrayList.isEmpty() && (interfaceC490060JJs instanceof C1700890uMZ)) {
                LIZ.LJIIJJI();
            }
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJIILL(Board board) {
        C2252321DDq c2252321DDq = LIZIZ;
        Object obj = (AbstractC1700910uMb) c2252321DDq.getValue();
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ei().LJIIIIZZ();
        C1790620whI c1790620whI = C1790620whI.LIZ;
        if (board != null) {
            c1790620whI.LIZ(0L);
            c1790620whI.LIZLLL(EnumC1779720wPi.AUTO_APPLY_BOARD_AFTER_EDIT);
            C1790620whI.LJIILIIL(EnumC1154390g97.BOARD_APPLY, board.id);
            LJIIIZ(board, false, AFwS237S0000000_7.get$arr$(365), null);
            return;
        }
        if (obj instanceof InterfaceC1700930uMd) {
            InterfaceC1700930uMd interfaceC1700930uMd = (InterfaceC1700930uMd) obj;
            if (interfaceC1700930uMd.LIZ().id != 0 && interfaceC1700930uMd.LIZ().status == 2) {
                c1790620whI.LIZ(0L);
                c1790620whI.LIZLLL(EnumC1779720wPi.AUTO_APPLY_BOARD_AFTER_EDIT);
                C1790620whI.LJIILIIL(EnumC1154390g97.BOARD_APPLY, interfaceC1700930uMd.LIZ().id);
                while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1700890uMZ(interfaceC1700930uMd.LIZ()))) {
                }
                return;
            }
        }
        LJIIJJI();
    }

    @Override // X.InterfaceC1814530xJr
    public final void LIZIZ(Board board, C1814120xJC c1814120xJC) {
        C2252321DDq c2252321DDq = LIZIZ;
        AbstractC1700910uMb abstractC1700910uMb = (AbstractC1700910uMb) c2252321DDq.getValue();
        if (!(abstractC1700910uMb instanceof C1700890uMZ)) {
            if (abstractC1700910uMb instanceof C1700900uMa) {
                while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1700880uMY(board, ((C1700900uMa) abstractC1700910uMb).LIZJ, c1814120xJC))) {
                }
                return;
            } else {
                while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1700880uMY(board, new Board(), new AwS393S0200000_27(abstractC1700910uMb, c1814120xJC, 168)))) {
                }
                return;
            }
        }
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1700880uMY(board, ((C1700890uMZ) abstractC1700910uMb).LIZ, c1814120xJC))) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1814530xJr
    public final void LIZJ(C1776890wL9 c1776890wL9, float f) {
        InterfaceC490060JJs interfaceC490060JJs;
        Object value = LIZIZ.getValue();
        BoardItem boardItem = null;
        if ((value instanceof InterfaceC490060JJs) && (interfaceC490060JJs = (InterfaceC490060JJs) value) != null) {
            for (BoardItem boardItem2 : interfaceC490060JJs.LIZIZ().boardItemList) {
                BoardItem boardItem3 = boardItem2;
                if (c1776890wL9 instanceof C1776560wKc) {
                    if (boardItem3.boardItemType == ((C1776560wKc) c1776890wL9).LIZ) {
                        boardItem = boardItem2;
                        break;
                    }
                } else if (boardItem3.id == c1776890wL9.LIZ) {
                    boardItem = boardItem2;
                    break;
                }
            }
            BoardItem boardItem4 = boardItem;
            if (boardItem4 != null) {
                BoardItemTransform boardItemTransform = boardItem4.transform;
                if (boardItemTransform == null) {
                    boardItemTransform = new BoardItemTransform();
                }
                boardItemTransform.scale = f;
                boardItem4.transform = boardItemTransform;
            }
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJI(Board board, HashMap map) {
        Pair pair;
        String string;
        int size;
        C1700890uMZ c1700890uMZ;
        List<BoardItem> list;
        C1700890uMZ c1700890uMZ2;
        AbstractC1700910uMb abstractC1700910uMb = (AbstractC1700910uMb) LIZIZ.getValue();
        if (board.status == 2) {
            boolean z = abstractC1700910uMb instanceof C1700890uMZ;
            Board board2 = null;
            if (z && (c1700890uMZ2 = (C1700890uMZ) abstractC1700910uMb) != null) {
                board2 = c1700890uMZ2.LIZ;
            }
            long j = board.id;
            if (j != 0 && board2 != null && j == board2.id) {
                int size2 = board.boardItemList.size();
                if (board2 != null && (list = board2.boardItemList) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                if (size2 == size && z && (c1700890uMZ = (C1700890uMZ) abstractC1700910uMb) != null) {
                    board.boardItemList = new ArrayList(c1700890uMZ.LIZ.boardItemList);
                }
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<BoardItem> list2 = board.boardItemList;
        ArrayList arrayList = new ArrayList();
        for (BoardItem boardItem : list2) {
            if (linkedHashSet.add(Long.valueOf(boardItem.id))) {
                arrayList.add(boardItem);
            }
        }
        board.boardItemList = new ArrayList(arrayList);
        DataChannel dataChannel = LIZJ;
        if (dataChannel != null) {
            if (map == null) {
                map = new HashMap();
            }
            RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
            if (recommendBoardInfo == null || (string = Long.valueOf(recommendBoardInfo.recommendBoardId).toString()) == null) {
                string = "";
            }
            dataChannel.LC0(DecorationEditLogDataEvent.class, new C1817550xOj(map, string, String.valueOf(board.id), 8));
        }
        C2252321DDq c2252321DDq = LIZIZ;
        AbstractC1700910uMb abstractC1700910uMb2 = (AbstractC1700910uMb) c2252321DDq.getValue();
        if (abstractC1700910uMb2 instanceof C1700890uMZ) {
            C1700890uMZ c1700890uMZ3 = (C1700890uMZ) abstractC1700910uMb2;
            pair = new Pair(c1700890uMZ3.LIZ, c1700890uMZ3.LIZIZ);
        } else {
            pair = new Pair(new Board(), AFwS231S0000000_3.get$arr$(269));
        }
        Board board3 = (Board) pair.getFirst();
        pair.getSecond();
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1700900uMa(new C1777850wMh(true, false, 2), board, board3))) {
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJIIIIZZ(Board board, HashMap<String, String> map) {
        C2252321DDq c2252321DDq = LIZIZ;
        AbstractC1700910uMb abstractC1700910uMb = (AbstractC1700910uMb) c2252321DDq.getValue();
        if (board != null) {
            LJIIIZ(board, false, AFwS237S0000000_7.get$arr$(365), map);
            return;
        }
        if (abstractC1700910uMb instanceof C1700880uMY) {
            C1700880uMY c1700880uMY = (C1700880uMY) abstractC1700910uMb;
            if (c1700880uMY.LIZIZ.id != 0) {
                while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1700890uMZ(c1700880uMY.LIZIZ))) {
                }
                return;
            }
        }
        LJIIJJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r8.add(r11);
     */
    @Override // X.InterfaceC1814530xJr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.InterfaceC1815550xLV r10, com.bytedance.android.livesdk.model.BoardItem r11) {
        /*
            r9 = this;
            X.1DDq r0 = X.C1814520xJq.LIZIZ
            java.lang.Object r5 = r0.getValue()
            boolean r0 = r5 instanceof X.C1700900uMa
            if (r0 == 0) goto L6b
            X.0uMa r5 = (X.C1700900uMa) r5
            if (r5 == 0) goto L6b
            com.bytedance.android.livesdk.model.Board r0 = r5.LIZIZ
            java.util.List<com.bytedance.android.livesdk.model.BoardItem> r8 = r0.boardItemList
            if (r11 == 0) goto L3d
            java.util.Iterator r7 = r8.iterator()
            r6 = 0
        L19:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r7.next()
            com.bytedance.android.livesdk.model.BoardItem r0 = (com.bytedance.android.livesdk.model.BoardItem) r0
            long r3 = r0.id
            long r1 = r11.id
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
            if (r6 < 0) goto L51
            boolean r0 = r10 instanceof X.C1777850wMh
            if (r0 == 0) goto L4a
            r0 = r10
            X.0wMh r0 = (X.C1777850wMh) r0
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L4a
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r8, r6)
        L3d:
            X.0xLV r0 = r5.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)
            if (r0 == 0) goto L55
            boolean r0 = r10 instanceof X.C1777850wMh
            if (r0 == 0) goto L55
            return
        L4a:
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r8, r6, r11)
            goto L3d
        L4e:
            int r6 = r6 + 1
            goto L19
        L51:
            r8.add(r11)
            goto L3d
        L55:
            X.1DDq r4 = X.C1814520xJq.LIZIZ
        L57:
            java.lang.Object r3 = r4.getValue()
            com.bytedance.android.livesdk.model.Board r2 = r5.LIZIZ
            com.bytedance.android.livesdk.model.Board r1 = r5.LIZJ
            X.0uMa r0 = new X.0uMa
            r0.<init>(r10, r2, r1)
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L57
            return
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1814520xJq.LJIIJ(X.0xLV, com.bytedance.android.livesdk.model.BoardItem):void");
    }

    @Override // X.InterfaceC1814530xJr
    public final void LIZLLL(InterfaceC1776570wKd interfaceC1776570wKd, BoardItemPosition boardItemPosition, C1814560xJu c1814560xJu) {
        InterfaceC490060JJs interfaceC490060JJs;
        BoardItem next;
        Object value = LIZIZ.getValue();
        if ((value instanceof InterfaceC490060JJs) && (interfaceC490060JJs = (InterfaceC490060JJs) value) != null) {
            List<BoardItem> list = interfaceC490060JJs.LIZIZ().boardItemList;
            interfaceC490060JJs.LIZIZ();
            Iterator<BoardItem> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    BoardItem boardItem = next;
                    if (interfaceC1776570wKd instanceof C1776560wKc) {
                        if (boardItem.boardItemType == ((C1776560wKc) interfaceC1776570wKd).LIZ) {
                            break;
                        }
                    } else if (interfaceC1776570wKd instanceof C1776890wL9) {
                        if (boardItem.id == ((C1776890wL9) interfaceC1776570wKd).LIZ) {
                            break;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BoardItem boardItem2 = next;
            if (boardItem2 != null) {
                boardItem2.canvasPosition = boardItemPosition;
                boardItem2.canvasItemLayout = null;
                c1814560xJu.invoke(boardItem2);
            }
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJFF(Context context, BoardItem boardItem, HashMap<String, String> map) {
        Board board = new Board();
        board.version = 2;
        LJI(board, map);
        DataChannel dataChannel = LIZJ;
        if (dataChannel != null) {
            dataChannel.LC0(EditDecorationItemEvent.class, new C1556390qbV(boardItem));
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJII(Context context, Board board, HashMap map) {
        LJI(board, map);
        DataChannel dataChannel = LIZJ;
        if (dataChannel != null) {
            dataChannel.LC0(DecorationJumpToItemEditorEvent.class, new C048900Fr(board));
        }
    }

    @Override // X.InterfaceC1814530xJr
    public final void LJIIIZ(Board board, boolean z, Function1<? super Boolean, Unit> function1, HashMap<String, String> map) {
        C2252321DDq c2252321DDq = LIZIZ;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1700890uMZ(board, new AwS13S0410000_27(board, (Board) map, (HashMap<String, String>) z, (boolean) c2252321DDq.getValue(), (AbstractC1700910uMb) function1, (Function1<? super Boolean, Unit>) 1)))) {
        }
    }
}
