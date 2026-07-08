package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class LongChainGetParamsConfig extends LazyDataBase {

    @C09CT("first_scene")
    public final LongChainFirstScene firstScene = new LongChainFirstScene();

    public final LongChainFirstScene LIZ() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.firstScene, "first_scene");
        return this.firstScene;
    }
}
