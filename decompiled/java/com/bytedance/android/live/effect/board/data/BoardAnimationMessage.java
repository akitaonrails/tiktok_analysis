package com.bytedance.android.live.effect.board.data;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class BoardAnimationMessage {

    @C09CT("animations")
    public final ArrayList<Animation> animations;

    @C09CT("key")
    public final String key;

    public BoardAnimationMessage() {
        this("LiveBoard_Anim", new ArrayList());
    }

    public BoardAnimationMessage(String str, ArrayList<Animation> arrayList) {
        this.key = str;
        this.animations = arrayList;
    }
}
