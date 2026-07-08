package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;

/* JADX INFO: renamed from: X.06g9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1668706g9 {
    public static final /* synthetic */ C1668706g9 LIZ = new C1668706g9();
    public static final IIMBusinessChatService LIZIZ = (IIMBusinessChatService) PluggableExtentionKt.pluggableSpiForReal(IIMBusinessChatService.class);

    public static IIMBusinessChatService LIZ(C1668706g9 c1668706g9) {
        c1668706g9.getClass();
        IIMBusinessChatService iIMBusinessChatService = (IIMBusinessChatService) PluggableExtentionKt.pluggableSpi$default(IIMBusinessChatService.class, false, false, false, 12, null);
        if (iIMBusinessChatService == null) {
            return C1668406g6.LIZIZ;
        }
        return iIMBusinessChatService;
    }
}
