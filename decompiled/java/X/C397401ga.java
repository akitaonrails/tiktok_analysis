package X;

import com.bytedance.android.live.effect.board.data.Board;
import com.bytedance.android.live.effect.board.data.BoardPos;
import com.bytedance.android.live.effect.board.data.BoardSize;
import com.bytedance.android.live.effect.board.data.BoardUpdateMessage;
import com.bytedance.android.live.effect.board.data.LocalLayout;
import com.bytedance.android.live.effect.board.data.SubTexture;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.01ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C397401ga {
    public static final String LIZIZ(InterfaceC395901gL interfaceC395901gL) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("board_image_");
        sbLIZ.append(interfaceC395901gL.getBoardId());
        sbLIZ.append("_btm");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZJ(InterfaceC395901gL interfaceC395901gL) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("board_image_");
        sbLIZ.append(interfaceC395901gL.getBoardId());
        sbLIZ.append("_top");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZ(InterfaceC395901gL interfaceC395901gL, C388501f9 c388501f9) {
        boolean z;
        float f;
        BoardUpdateMessage boardUpdateMessage = new BoardUpdateMessage("LiveBoard_Update", new Board(0, "", new BoardSize(0.3f, 0.3f), new BoardPos(0.5f, 0.5f), new ArrayList(), 0));
        boardUpdateMessage.board.boardID = String.valueOf(interfaceC395901gL.getBoardId());
        boardUpdateMessage.board.needMatting = interfaceC395901gL.getConfig().LJI ? 1 : 0;
        BoardSize boardSize = boardUpdateMessage.board.boardSize;
        float f2 = interfaceC395901gL.getConfig().LJIJJLI;
        C394501g7 config = interfaceC395901gL.getConfig();
        boardSize.w = f2 * config.LJJ * config.LJJIIZ;
        BoardSize boardSize2 = boardUpdateMessage.board.boardSize;
        float f3 = interfaceC395901gL.getConfig().LJIL;
        C394501g7 config2 = interfaceC395901gL.getConfig();
        boardSize2.h = f3 * config2.LJJ * config2.LJJIIZ;
        boardUpdateMessage.board.boardPos.x = interfaceC395901gL.getConfig().LJIJI;
        boardUpdateMessage.board.boardPos.y = interfaceC395901gL.getConfig().LJIJJ;
        if (c388501f9 != null && c388501f9.LIZ != null && c388501f9.LIZ == EnumC395001gC.FADE) {
            z = true;
        } else {
            z = false;
        }
        SubTexture subTexture = new SubTexture("", new LocalLayout(0.0f, 0.0f, 1.0f, 1.0f), 1.0f);
        subTexture.renderCacheKey = LIZIZ(interfaceC395901gL);
        float f4 = 1.0f;
        if (!interfaceC395901gL.getConfig().LIZLLL && z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        subTexture.opacity = f;
        boardUpdateMessage.board.subTextures.add(subTexture);
        SubTexture subTexture2 = new SubTexture("", new LocalLayout(0.0f, 0.0f, 1.0f, 1.0f), 1.0f);
        subTexture2.renderCacheKey = LIZJ(interfaceC395901gL);
        if (interfaceC395901gL.getConfig().LIZLLL || z) {
            f4 = 0.0f;
        }
        subTexture2.opacity = f4;
        boardUpdateMessage.board.subTextures.add(subTexture2);
        boardUpdateMessage.board.zIndex = interfaceC395901gL.getConfig().LJJIIJ;
        return GsonProtectorUtils.toJson(C293501Bt.LIZ(), boardUpdateMessage);
    }
}
