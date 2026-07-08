package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0qze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571360qze implements InterfaceC1571000qz4 {
    public TuxIconView LL;
    public InterfaceC1617760sCU LLILLJJLI;
    public final IECommerceMallService LLILLL = (IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class);
    public final String LLILZ = EnumC1584350rKb.SHOP_CART.getTag();

    @Override // X.InterfaceC1570900qyu
    public final void S1(boolean z) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void U1(View view) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void a2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean b2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean c2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void e2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void g2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onCreate() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onPause() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onResume() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void LIZ() {
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(R.attr.u_);
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final void T1() {
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(R.attr.ef);
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean enabled() {
        return this.LLILLL.shouldShowMallTopTab();
    }

    @Override // X.InterfaceC1570900qyu
    public final String getTag() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1570900qyu
    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LLILLJJLI = interfaceC1617760sCU;
    }

    @Override // X.InterfaceC1570900qyu
    public final void d2(Integer num) {
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            C1593860rZw.LIZ(tuxIconView, num, true);
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final View f2(Context context) {
        InterfaceC1617760sCU interfaceC1617760sCU = this.LLILLJJLI;
        if (interfaceC1617760sCU == null) {
            interfaceC1617760sCU = null;
        }
        C19EG activity = interfaceC1617760sCU.getActivity();
        if (activity == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C341940Daq.LIZ(56.0d), C341940Daq.LIZ(56.0d));
        if (!C1581510rG1.LIZIZ()) {
            layoutParams.setMargins(0, 0, C341940Daq.LIZ(7.0d), 0);
        }
        View viewLJIIL = this.LLILLL.LJIIL(activity);
        if (viewLJIIL == null) {
            return null;
        }
        this.LL = this.LLILLL.LJ(activity);
        C786410Ut5.W5(viewLJIIL, layoutParams);
        return viewLJIIL;
    }

    @Override // X.InterfaceC1570900qyu
    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LLILLJJLI = interfaceC1617760sCU;
    }
}
