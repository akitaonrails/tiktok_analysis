package com.bytedance.android.live.liveinteract.multihost.biz.link.layout;

import X.C09CT;
import X.InterfaceC1294060jmO;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC1294060jmO
public final class CoHostLayoutExtra {

    @C09CT("isZoomLayout")
    public final int isZoomLayout;

    @C09CT("offsetY")
    public final int offsetY;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public CoHostLayoutExtra(int i, int i2, int i3) {
        this.offsetY = i;
        this.isZoomLayout = i2;
        this.scene = i3;
    }
}
