package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager;

/* JADX INFO: renamed from: X.15mM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20619615mM {
    public static final C20619615mM LIZ = new C20619615mM();
    public static boolean LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.15mN] */
    static {
        IInboxVisibilityChangeManager iInboxVisibilityChangeManager = (IInboxVisibilityChangeManager) PluggableExtentionKt.pluggableSpiForReal(IInboxVisibilityChangeManager.class);
        if (iInboxVisibilityChangeManager != 0) {
            iInboxVisibilityChangeManager.LIZIZ(new InterfaceC20619815mO() { // from class: X.15mN
                @Override // X.InterfaceC20619815mO
                public final void LIZ(boolean z, boolean z2) {
                    if (!z || !z2) {
                        C20619615mM.LIZ.getClass();
                        C20619615mM.LIZIZ = false;
                    }
                }
            });
        }
    }

    public static String LIZ() {
        if (LIZIZ) {
            return "";
        }
        return null;
    }
}
