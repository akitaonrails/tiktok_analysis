package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.011d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2659011d {
    public static final <T extends AnonymousClass0101> T LIZ(DataChannel dataChannel, Class<T> cls) {
        C2660011e c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class);
        if (c2660011e != null) {
            return (T) c2660011e.LIZ(cls);
        }
        return null;
    }

    public static final void LIZIZ(DataChannel dataChannel, Class cls, AnonymousClass0101 anonymousClass0101, boolean z) {
        C2660011e c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class);
        if (c2660011e != null) {
            if (((ConcurrentHashMap) c2660011e.LIZ).containsKey(cls) && !z) {
                return;
            }
            ((ConcurrentHashMap) c2660011e.LIZ).put(cls, anonymousClass0101);
        }
    }
}
