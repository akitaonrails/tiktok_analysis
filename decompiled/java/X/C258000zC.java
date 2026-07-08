package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.billboard.IBillboardService;
import com.ss.android.ugc.aweme.feed.model.live.GuessOptions;
import com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo;
import com.ss.android.ugc.aweme.feed.model.live.GuessRound;
import com.ss.android.ugc.aweme.feed.model.live.GuessText;
import com.ss.android.ugc.aweme.feed.model.live.GuessWidget;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.ImageStyle;
import webcast.data.host_board.Padding;

/* JADX INFO: renamed from: X.00zC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C258000zC implements InterfaceC260000zW {
    public final Long LIZ;
    public String LIZIZ = "INVALID";
    public C258300zF LIZJ;
    public C11JF LIZLLL;
    public HostBoard LJ;
    public EnumC259000zM LJFF;
    public GuessRankUserInfo LJI;

    public final void LIZLLL() {
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZIZ = "INVALID";
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C258300zF c258300zF = this.LIZJ;
        if (c258300zF != null) {
            C466310IQj c466310IQj = c258300zF.LJ;
            if (c466310IQj != null) {
                c466310IQj.LIZ();
            }
            C466310IQj c466310IQj2 = c258300zF.LJFF;
            if (c466310IQj2 != null) {
                c466310IQj2.LIZ();
            }
            C466310IQj c466310IQj3 = c258300zF.LJI;
            if (c466310IQj3 != null) {
                c466310IQj3.LIZ();
            }
            c258300zF.LJFF = null;
            c258300zF.LJI = null;
            c258300zF.LJ = null;
            c258300zF.LIZIZ = EnumC259000zM.IDLE;
            c258300zF.LIZJ = false;
            c258300zF.LIZLLL.clear();
            c258300zF.LJII = null;
            c258300zF.LJIIIIZZ = null;
            c258300zF.LJIIIZ = null;
        }
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }

    public C258000zC(Long l) {
        this.LIZ = l;
    }

    public static String LIZIZ(GuessWidget guessWidget) {
        GuessRound guessRound;
        GuessOptions next;
        String strLIZIZ;
        if (guessWidget == null || (guessRound = guessWidget.guessRound) == null) {
            return "";
        }
        if (guessRound.guessStatus == 20) {
            return C497740JfY.LJIJI(2131852802);
        }
        String str = guessRound.correctedOption;
        if (a0.LJJJIL(str)) {
            str = guessRound.winOption;
        }
        if (str != null && !a0.LJJJIL(str)) {
            String str2 = null;
            if ((!false) && str != null) {
                Iterator<GuessOptions> it2 = guessRound.guessOptions.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.optionIdStr, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                GuessOptions guessOptions = next;
                if (guessOptions == null) {
                    return "";
                }
                GuessText guessText = guessOptions.text;
                if (guessText != null) {
                    strLIZIZ = guessText.desc;
                } else {
                    strLIZIZ = null;
                }
                if (!C123100dR.LIZ(strLIZIZ) || strLIZIZ == null) {
                    C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                    GuessText guessText2 = guessOptions.text;
                    if (guessText2 != null) {
                        str2 = guessText2.key;
                    }
                    c1124870fNVLIZJ.getClass();
                    strLIZIZ = C1124870fNV.LIZIZ(str2);
                    if (strLIZIZ == null) {
                        return "";
                    }
                }
                return strLIZIZ;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.live.GuessWidgets r18, com.ss.android.ugc.aweme.feed.model.live.GuessWidgets r19) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258000zC.LIZJ(com.ss.android.ugc.aweme.feed.model.live.GuessWidgets, com.ss.android.ugc.aweme.feed.model.live.GuessWidgets):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22 */
    @Override // X.InterfaceC260000zW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EnumC259000zM r26, boolean r27, com.ss.android.ugc.aweme.feed.model.live.GuessWidget r28, com.ss.android.ugc.aweme.feed.model.live.GuessWidget r29, com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo r30) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258000zC.LIZ(X.00zM, boolean, com.ss.android.ugc.aweme.feed.model.live.GuessWidget, com.ss.android.ugc.aweme.feed.model.live.GuessWidget, com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo):void");
    }

    public static void LJ(C258000zC c258000zC, String str, GuessRankUserInfo guessRankUserInfo, String str2, Long l, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            guessRankUserInfo = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        c258000zC.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        C011V c011v = C011V.PREVIEW_CARD;
        IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
        final HostBoard hostBoard = new HostBoard();
        hostBoard.boardId = "game_guess";
        hostBoard.bizType = "game";
        hostBoard.subBizType = "game_guess";
        List<BoardCell> list = hostBoard.cellList;
        BoardCell boardCell = new BoardCell();
        boardCell.type = "title";
        boardCell.text = C20642515q3.LJI(2131852519);
        boardCell.alignment = 2;
        boardCell.id = "guess_title";
        list.add(boardCell);
        BoardCell boardCell2 = new BoardCell();
        boardCell2.type = "divider_line";
        boardCell2.alignment = 2;
        Padding padding = new Padding();
        padding.paddingTop = 8;
        boardCell2.padding = padding;
        boardCell2.id = "guess_divider";
        list.add(boardCell2);
        if (str != null) {
            BoardCell boardCell3 = new BoardCell();
            boardCell3.type = "text";
            boardCell3.text = str;
            boardCell3.alignment = 2;
            Padding padding2 = new Padding();
            padding2.paddingTop = 8;
            boardCell3.padding = padding2;
            boardCell3.id = "guess_content";
            list.add(boardCell3);
        }
        if (guessRankUserInfo != null) {
            BoardCell boardCell4 = new BoardCell();
            boardCell4.type = "image";
            ImageStyle imageStyle = new ImageStyle();
            imageStyle.round = true;
            boardCell4.imageStyle = imageStyle;
            boardCell4.alignment = 2;
            ImageModel imageModel = new ImageModel();
            C842240X2g.LIZ(imageModel).add(guessRankUserInfo.avatarUri);
            imageModel.width = 28;
            imageModel.height = 28;
            boardCell4.image = imageModel;
            Padding padding3 = new Padding();
            padding3.paddingTop = 8;
            boardCell4.padding = padding3;
            boardCell4.id = "guess_image";
            list.add(boardCell4);
        }
        if (l != null) {
            BoardCell boardCell5 = new BoardCell();
            boardCell5.type = "text_trailing_image";
            boardCell5.text = l.toString();
            Padding padding4 = new Padding();
            padding4.paddingTop = 6;
            boardCell5.padding = padding4;
            boardCell5.alignment = 2;
            boardCell5.id = "guess_one_settle_text";
            list.add(boardCell5);
        }
        if (str2 != null) {
            BoardCell boardCell6 = new BoardCell();
            boardCell6.type = "text";
            boardCell6.text = str2;
            Padding padding5 = new Padding();
            padding5.paddingTop = 6;
            boardCell6.padding = padding5;
            boardCell6.alignment = 2;
            boardCell6.id = "guess_sub_text";
            list.add(boardCell6);
        }
        Padding padding6 = new Padding();
        padding6.paddingLeft = 8;
        padding6.paddingRight = 8;
        padding6.paddingTop = 8;
        padding6.paddingBottom = 8;
        hostBoard.padding = padding6;
        c258000zC.LJ = hostBoard;
        if (Intrinsics.LJFF(c258000zC.LIZIZ, "INVALID")) {
            c258000zC.LIZIZ = iBillboardService.r92(new InterfaceC201500q5() { // from class: X.00za
                @Override // X.InterfaceC201500q5
                public final HostBoard LIZ() {
                    return hostBoard;
                }
            }, c011v, c258000zC.LIZ, null);
        } else {
            hostBoard.boardId = c258000zC.LIZIZ;
            iBillboardService.Ox1(new InterfaceC201500q5() { // from class: X.00zb
                @Override // X.InterfaceC201500q5
                public final HostBoard LIZ() {
                    return hostBoard;
                }
            }, c011v, c258000zC.LIZ);
        }
    }
}
