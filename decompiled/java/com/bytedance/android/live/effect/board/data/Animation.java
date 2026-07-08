package com.bytedance.android.live.effect.board.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class Animation {

    @C09CT("boardID")
    public long boardID;

    @C09CT("parameters")
    public final FadeParameters parameters;

    @C09CT("type")
    public String type;

    public Animation() {
        this(0L, "fade", new FadeParameters(0, 1.0f, 1.0f, 0.3f, 1, 1, 1.0f));
    }

    public Animation(long j, String str, FadeParameters fadeParameters) {
        this.boardID = j;
        this.type = str;
        this.parameters = fadeParameters;
    }
}
