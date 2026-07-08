package com.bytedance.android.live.effect.model.composer;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveComposerTagNode {
    public final String LIZ;
    public LiveEffect.ComposerConfig LIZJ;

    @C09CT("uiValue")
    public Integer uiValue;

    @C09CT("value")
    public float value;
    public float LIZIZ = -999.0f;

    @C09CT("resourceId")
    public String resourceId = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveComposerTagNode(tag='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", uiValue=");
        sbLIZ.append(this.uiValue);
        sbLIZ.append(", resourceId: ");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveComposerTagNode(String str) {
        this.LIZ = str;
    }
}
