package X;

import com.ss.android.ugc.feed.platform.panel.base.EventCenter;

/* JADX INFO: renamed from: X.0RBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691710RBh {
    public static final <T extends InterfaceC1565640qqQ & InterfaceC691700RBg> void LIZ(T t, String str, Object obj) {
        EventCenter eventCenter = t.getEventCenter();
        if (eventCenter != null) {
            eventCenter.CQ2(t, str, obj);
            return;
        }
        throw new IllegalStateException("EventCenter must not null !");
    }
}
