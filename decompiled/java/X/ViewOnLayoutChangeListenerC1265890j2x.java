package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarCenterComponent;

/* JADX INFO: renamed from: X.0j2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewOnLayoutChangeListenerC1265890j2x implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1265890j2x(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1265890j2x viewOnLayoutChangeListenerC1265890j2x, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1265890j2x);
        ViewGroup.LayoutParams layoutParams = ((View) viewOnLayoutChangeListenerC1265890j2x.l0).getLayoutParams();
        if ((layoutParams instanceof C16G1) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C1229200i5m.LIZLLL((Context) viewOnLayoutChangeListenerC1265890j2x.l1) + ((FindSchoolFriendsPageContainerAssem) viewOnLayoutChangeListenerC1265890j2x.l2).lp() + view.getHeight();
            C786410Ut5.W5((View) viewOnLayoutChangeListenerC1265890j2x.l0, marginLayoutParams);
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1265890j2x viewOnLayoutChangeListenerC1265890j2x, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1265890j2x);
        ProfileNavBarCenterComponent profileNavBarCenterComponent = (ProfileNavBarCenterComponent) viewOnLayoutChangeListenerC1265890j2x.l0;
        ViewGroup viewGroup = (ViewGroup) viewOnLayoutChangeListenerC1265890j2x.l1;
        ViewGroup viewGroup2 = (ViewGroup) viewOnLayoutChangeListenerC1265890j2x.l2;
        profileNavBarCenterComponent.getClass();
        ProfileNavBarCenterComponent.kp(viewGroup, viewGroup2);
    }
}
