package com.bytedance.android.live.effect.board.data;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Board {

    @C09CT("boardID")
    public String boardID;

    @C09CT("boardPos")
    public final BoardPos boardPos;

    @C09CT("boardSize")
    public final BoardSize boardSize;

    @C09CT("needMatting")
    public int needMatting;

    @C09CT("subTextures")
    public final ArrayList<SubTexture> subTextures;

    @C09CT("zIndex")
    public int zIndex;

    public Board() {
        this(0, "", new BoardSize(0.3f, 0.3f), new BoardPos(0.5f, 0.5f), new ArrayList(), 0);
    }

    public Board(int i, String str, BoardSize boardSize, BoardPos boardPos, ArrayList<SubTexture> arrayList, int i2) {
        this.needMatting = i;
        this.boardID = str;
        this.boardSize = boardSize;
        this.boardPos = boardPos;
        this.subTextures = arrayList;
        this.zIndex = i2;
    }
}
