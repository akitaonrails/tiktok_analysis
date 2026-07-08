package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.120E, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120E extends Scene implements InterfaceC379610EuV, ViewTreeObserver.OnScrollChangedListener {
    public final C1DRG LLJI;
    public TuxTextView LLJILJIL;
    public C427660Gpo LLJILJILJ;
    public final C01GW LLJIJIL = C1449630npJ.LIZ(this, C120F.class);
    public final int LLJILLL = 150;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        if (iArr[1] < this.LLJILLL) {
            ((C120F) this.LLJIJIL.getValue()).gh1();
        } else {
            ((C120F) this.LLJIJIL.getValue()).MD0();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C786410Ut5.E3(this.mView.getViewTreeObserver(), this);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C120E(C1DRG c1drg) {
        this.LLJI = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel avatarThumb;
        super.onViewCreated(view, bundle);
        this.LLJILJIL = (TuxTextView) view.findViewById(R.id.p9k);
        this.LLJILJILJ = (C427660Gpo) view.findViewById(R.id.biz);
        TuxTextView tuxTextView = this.LLJILJIL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C1464900oDw c1464900oDw = C1464900oDw.LIZ;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        Resources resources = getResources();
        c1464900oDw.getClass();
        tuxTextView.setText(C1464900oDw.LIZJ(currentUser, resources));
        C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        C427660Gpo c427660Gpo = this.LLJILJILJ;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        if (currentUser2 != null) {
            avatarThumb = currentUser2.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1428310nGv.LIZ(c427660Gpo, avatarThumb);
        TuxTextView tuxTextView3 = this.LLJILJIL;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        C786410Ut5.z3(tuxTextView2.getViewTreeObserver(), this);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.e_t, viewGroup, false);
    }
}
