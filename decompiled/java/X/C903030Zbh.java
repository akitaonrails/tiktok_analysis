package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: renamed from: X.0Zbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903030Zbh implements HasDefaultViewModelProviderFactory {
    public final SessionInfo LL;
    public final InterfaceC1808750xAX LLILLJJLI;
    public final C913940ZtI LLILLL = new C913940ZtI(this, 0);

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.LLILLL;
    }

    public C903030Zbh(SessionInfo sessionInfo, InterfaceC1808750xAX interfaceC1808750xAX) {
        this.LL = sessionInfo;
        this.LLILLJJLI = interfaceC1808750xAX;
    }
}
