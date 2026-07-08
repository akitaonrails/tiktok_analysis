package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;

/* JADX INFO: renamed from: X.06fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1665606fe {
    public static boolean LIZ() {
        InterfaceC1712506nD interfaceC1712506nDLJFF;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("enable_business_inbox_buyer_label", false)) {
            return false;
        }
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService == null || (interfaceC1712506nDLJFF = iIMBusinessChatService.LJFF()) == null) {
            return false;
        }
        InterfaceC1712506nD.LIZ.getClass();
        return interfaceC1712506nDLJFF.LJIILIIL(AnonymousClass0613.LIZ());
    }
}
