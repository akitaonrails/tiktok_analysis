package com.bytedance.android.live.effect.api.soundeffect;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class SoundEffect {
    public int LIZ;

    @C09CT("icon")
    public ImageModel iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("name")
    public String name = "";

    @C09CT("eng_name")
    public String nameEn = "";

    @C09CT("url")
    public ImageModel resourceUrl;

    @C09CT("version")
    public long version;

    public final int hashCode() {
        return C786410Ut5.Y2(this.id);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(SoundEffect.class, cls) && this.id == ((SoundEffect) obj).id) {
            return true;
        }
        return false;
    }
}
