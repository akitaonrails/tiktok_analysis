package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: renamed from: X.15mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20621515mf extends AbstractC1563960qni {
    public final String LJ;
    public final EnumC325100Com LJFF;

    public C20621515mf() {
        this(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20621515mf(int i) {
        super(0, "prepare");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        EnumC325100Com networkStatus = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        this.LJ = curUserId;
        this.LJFF = networkStatus;
    }
}
