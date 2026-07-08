package com.bytedance.android.live.effect.board.data;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class BoardUpdateMessage {

    @C09CT("board")
    public final Board board;

    @C09CT("key")
    public final String key;

    public BoardUpdateMessage() {
        this("LiveBoard_Update", new Board(0, "", new BoardSize(0.3f, 0.3f), new BoardPos(0.5f, 0.5f), new ArrayList(), 0));
    }

    public BoardUpdateMessage(String str, Board board) {
        this.key = str;
        this.board = board;
    }
}
