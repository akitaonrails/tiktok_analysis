package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS455S0200000_19;

/* JADX INFO: renamed from: X.0iX4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246120iX4 extends LinearLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public TuxNavBar LL;
    public Integer LLILLJJLI;

    public final void setNavBarBackground$tux_theme_release(Integer num) {
        this.LLILLJJLI = num;
        if (num != null) {
            int iIntValue = num.intValue();
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.setNavBackground(iIntValue);
            }
        }
    }

    public C1246120iX4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setGravity(1);
    }

    public final void LIZ(boolean z, boolean z2) {
        ViewGroup viewGroup;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        if (z) {
            C21578619ce c21578619ce = new C21578619ce(getContext());
            if (z2) {
                addView(c21578619ce, -1, -2);
                viewGroup = c21578619ce;
            } else {
                addView(c21578619ce, -2, -2);
                viewGroup = c21578619ce;
            }
        } else {
            viewGroup = this;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.z0v);
        if (z2) {
            viewGroup.addView(frameLayout, -1, -2);
        } else {
            viewGroup.addView(frameLayout, -2, -2);
        }
    }

    public final void LIZIZ(FragmentManager fragmentManager, Fragment fragment) {
        if (fragment != null) {
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.z0v, fragment, "modal_content");
            c19ehLJIIJ.LJIIJ();
        }
        fragmentManager.LJZL(new C0R19(new AwS455S0200000_19(fragment, this, 2)), false);
    }
}
