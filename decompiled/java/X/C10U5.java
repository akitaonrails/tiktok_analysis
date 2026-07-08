package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountTipsViewDelegate;
import com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView;

/* JADX INFO: renamed from: X.10U5, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10U5 implements IPrivateAccountTipsView {
    public static final C10U5 LIZIZ = new C10U5();
    public final /* synthetic */ IPrivateAccountTipsView LIZ;

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.LIZ.LIZ(layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void LIZIZ(View view, InterfaceC341040DYo interfaceC341040DYo) {
        this.LIZ.LIZIZ(view, interfaceC341040DYo);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onCreate(Bundle bundle) {
        this.LIZ.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onDestroyView() {
        this.LIZ.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onResume() {
        this.LIZ.onResume();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onStop() {
        this.LIZ.onStop();
    }

    public C10U5() {
        IPrivateAccountTipsView iPrivateAccountTipsView;
        Object objLIZ = C04TD.LIZ(IPrivateAccountTipsView.class, false);
        if (objLIZ != null) {
            iPrivateAccountTipsView = (IPrivateAccountTipsView) objLIZ;
        } else {
            if (C04TD.LJLJI == null) {
                synchronized (IPrivateAccountTipsView.class) {
                    if (C04TD.LJLJI == null) {
                        C04TD.LJLJI = new PrivateAccountTipsViewDelegate();
                    }
                }
            }
            iPrivateAccountTipsView = C04TD.LJLJI;
        }
        this.LIZ = iPrivateAccountTipsView;
    }
}
