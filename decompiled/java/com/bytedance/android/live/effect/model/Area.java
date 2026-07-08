package com.bytedance.android.live.effect.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class Area {

    @C09CT("bottom")
    public Integer bottom;

    @C09CT("left")
    public int left;

    @C09CT("right")
    public int right;

    @C09CT("top")
    public int top;

    public Area(int i, Integer num, int i2, int i3) {
        this.top = i;
        this.bottom = num;
        this.left = i2;
        this.right = i3;
    }
}
