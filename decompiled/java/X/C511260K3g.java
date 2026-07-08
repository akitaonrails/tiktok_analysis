package X;

import Y.ACListenerS142S0100000_7;
import android.view.View;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;

/* JADX INFO: renamed from: X.0K3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511260K3g extends C0K3V {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;

    public C511260K3g(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 314), this.LL);
    }
}
