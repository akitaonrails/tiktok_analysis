package X;

import android.content.Context;
import com.bytedance.push.settings.storage.PushProvider;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFG implements C0WFF {
    public static final ConcurrentHashMap<String, InterfaceC810050Vq7> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC810050Vq7> LIZIZ = new ConcurrentHashMap<>();

    public static final InterfaceC810050Vq7 LIZ(Context context, String str, boolean z) {
        InterfaceC810050Vq7 c0wfh;
        if (z) {
            ConcurrentHashMap<String, InterfaceC810050Vq7> concurrentHashMap = LIZIZ;
            InterfaceC810050Vq7 interfaceC810050Vq7 = concurrentHashMap.get(str);
            if (interfaceC810050Vq7 != null) {
                return interfaceC810050Vq7;
            }
            if (!PushProvider.LLILZ && !C2162308dZ.LJI(context)) {
                c0wfh = new C0WFM(context, str);
            } else {
                c0wfh = new C0WFH(context, str);
            }
            concurrentHashMap.put(str, c0wfh);
            return c0wfh;
        }
        ConcurrentHashMap<String, InterfaceC810050Vq7> concurrentHashMap2 = LIZ;
        InterfaceC810050Vq7 interfaceC810050Vq72 = concurrentHashMap2.get(str);
        if (interfaceC810050Vq72 != null) {
            return interfaceC810050Vq72;
        }
        C0WFI c0wfi = new C0WFI(context, str);
        concurrentHashMap2.put(str, c0wfi);
        return c0wfi;
    }
}
