package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.dependency.friend.FriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751830vgj extends FrameLayout implements InterfaceC1751840vgk {
    public final InterfaceC1751840vgk LL;

    @Override // X.InterfaceC1751840vgk
    public final void LIZ(C1908330zl9 c1908330zl9) {
        this.LL.LIZ(c1908330zl9);
    }

    @Override // X.InterfaceC1751840vgk
    public final void LIZIZ(Function1<? super C197039127h, Unit> function1) {
        this.LL.LIZIZ(function1);
    }

    @Override // X.InterfaceC1751810vgh
    public View getView() {
        return this.LL.getView();
    }

    @Override // X.InterfaceC1751810vgh
    public void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
        this.LL.setDataChangeListener(function1);
    }

    @Override // X.InterfaceC1751810vgh
    public void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
        this.LL.setFollowClickInterceptor(function1);
    }

    @Override // X.InterfaceC1751810vgh
    public void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
        this.LL.setFollowClickListener(function2);
    }

    @Override // X.InterfaceC1751840vgk
    public void setLoading(boolean z) {
        this.LL.setLoading(z);
    }

    @Override // X.InterfaceC1751810vgh
    public void setTracker(Function0<C1909690znL> function0) {
        this.LL.setTracker(function0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C786410Ut5.LJLLLLLL(i, this.LL.getView());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751830vgj(Context context, AttributeSet attributeSet) {
        AnonymousClass0317 anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin;
        String name;
        super(context, attributeSet, R.attr.xj);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = FriendDependencyService.createIFriendDependencyServicebyMonsterPlugin(false);
            boolean z = anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null;
            String name2 = IFriendDependencyService.class.getName();
            if (anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IFriendDependencyService.class);
        }
        InterfaceC1751840vgk interfaceC1751840vgkCreateECRelationButtonDelegate = ((IFriendDependencyService) anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin).createECRelationButtonDelegate(context, attributeSet, R.attr.xj);
        this.LL = interfaceC1751840vgkCreateECRelationButtonDelegate;
        addView(interfaceC1751840vgkCreateECRelationButtonDelegate.getView(), new FrameLayout.LayoutParams(-1, -1));
    }
}
