package X;

import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Pk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653380Pk0 {
    public static final void LIZ(EventBus eventBus, Object obj) {
        if (eventBus != null && !eventBus.LJIIJ(obj)) {
            eventBus.LJIJJ(obj);
        }
    }

    public static final void LIZIZ(EventBus eventBus, Object obj) {
        if (eventBus != null && eventBus.LJIIJ(obj)) {
            eventBus.LJJI(obj);
        }
    }
}
