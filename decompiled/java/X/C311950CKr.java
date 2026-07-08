package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.abmock.IAbMockService;

/* JADX INFO: renamed from: X.0CKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C311950CKr extends C307970C5j {
    @Override // X.C307970C5j, X.InterfaceC292790Bdl
    public final C0C5H LIZ() {
        return ((IAbMockService) PluggableExtentionKt.pluggableSpi(IAbMockService.class, false, false)).LIZ();
    }

    @Override // X.C307970C5j, X.InterfaceC292790Bdl
    public final boolean LIZIZ() {
        ((IAbMockService) PluggableExtentionKt.pluggableSpi(IAbMockService.class)).isOpen();
        return false;
    }
}
