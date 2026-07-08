package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.11B0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11B0 {
    public static final C11B0 LIZ = new C11B0();

    public static String LIZ() {
        InterfaceC1457290o1f interfaceC1457290o1f = (InterfaceC1457290o1f) PluggableExtentionKt.pluggableSpi$default(InterfaceC1457290o1f.class, false, false, false, 14, null);
        if (interfaceC1457290o1f != null) {
            return interfaceC1457290o1f.getCurrentUserID();
        }
        return null;
    }
}
