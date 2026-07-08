package com.bytedance.android.live.userinfowidget;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.LiveUserInfoMuteUIAudienceToastRoomCache;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class MuteToastMemory {
    public static MuteToastMemory LIZJ;
    public final int LIZ = LiveUserInfoMuteUIAudienceToastRoomCache.cacheSize();
    public final Set<Long> LIZIZ = new LinkedHashSet();

    public static final class Companion {
        public static MuteToastMemory LIZ(LifecycleOwner lifecycleOwner) {
            MuteToastMemory muteToastMemory = MuteToastMemory.LIZJ;
            if (muteToastMemory != null) {
                return muteToastMemory;
            }
            if (lifecycleOwner == null) {
                return null;
            }
            MuteToastMemory.LIZJ = new MuteToastMemory();
            lifecycleOwner.getLifecycle().addObserver(new MuteToastMemory$Companion$getMuteToastMemory$observer$1());
            return MuteToastMemory.LIZJ;
        }
    }

    public final boolean LIZ(Long l) {
        if (l == null) {
            return false;
        }
        l.longValue();
        if (l.longValue() <= 0 || this.LIZIZ.contains(l)) {
            return false;
        }
        if (this.LIZIZ.size() >= this.LIZ) {
            Iterator<Long> it2 = this.LIZIZ.iterator();
            if (it2.hasNext()) {
                it2.next();
                it2.remove();
            }
        }
        this.LIZIZ.add(l);
        return true;
    }
}
