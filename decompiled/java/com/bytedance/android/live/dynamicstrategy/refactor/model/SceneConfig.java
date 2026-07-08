package com.bytedance.android.live.dynamicstrategy.refactor.model;

import X.C09CT;
import X.C0J0E;
import X.C0J0F;
import X.C0J0Q;
import X.C13BV;
import X.C2188811AlT;
import X.C500260Jjc;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SceneConfig {

    @C09CT("life_cycle")
    public int lifeCycle;

    @C09CT(Scene.SCENE_SERVICE)
    public String sceneName = "";

    @C09CT("features")
    public List<String> featuresString = new ArrayList();

    public final C0J0Q getFeatureLifecycle() {
        int i = this.lifeCycle;
        return i == 0 ? C500260Jjc.LJIJ(DataChannelGlobal.LLILZ) ? C0J0Q.ANCHOR : C0J0Q.ROOM : i == 1 ? C0J0Q.LIVE : C0J0Q.APP;
    }

    public final List<C0J0E> getFeatures() {
        if (!(!this.featuresString.isEmpty())) {
            return C13BV.INSTANCE;
        }
        List<String> list = this.featuresString;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C0J0E c0j0eLIZ = C0J0F.LIZ(it2.next());
            if (c0j0eLIZ != null) {
                arrayList.add(c0j0eLIZ);
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneConfig(sceneName='");
        sbLIZ.append(this.sceneName);
        sbLIZ.append("', lifeCycle=");
        sbLIZ.append(this.lifeCycle);
        sbLIZ.append(", featureLifecycle=");
        sbLIZ.append(getFeatureLifecycle());
        sbLIZ.append(", featuresString=");
        sbLIZ.append(this.featuresString);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getFeaturesString() {
        return this.featuresString;
    }

    public final int getLifeCycle() {
        return this.lifeCycle;
    }

    public final String getSceneName() {
        return this.sceneName;
    }

    public final void setFeaturesString(List<String> list) {
        this.featuresString = list;
    }

    public final void setLifeCycle(int i) {
        this.lifeCycle = i;
    }

    public final void setSceneName(String str) {
        this.sceneName = str;
    }
}
