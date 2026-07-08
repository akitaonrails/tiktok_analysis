package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eQI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088160eQI {
    public final ViewGroup LIZ;
    public final ViewGroup LIZIZ;
    public final Fragment LIZJ;
    public final LiveIconView LIZLLL;
    public final C16F5 LJ;

    public final void LIZ(boolean z) {
        if (z) {
            LiveIconView liveIconView = this.LIZLLL;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.el4);
            }
            C16F5 c16f5 = this.LJ;
            if (c16f5 != null) {
                c16f5.setText(2131852011);
            }
            ViewGroup viewGroup = this.LIZ;
            viewGroup.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey0, viewGroup.getContext()));
            return;
        }
        LiveIconView liveIconView2 = this.LIZLLL;
        if (liveIconView2 != null) {
            liveIconView2.setIconAttr(R.attr.el1);
        }
        C16F5 c16f52 = this.LJ;
        if (c16f52 != null) {
            c16f52.setText(2131852012);
        }
        ViewGroup viewGroup2 = this.LIZ;
        viewGroup2.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey8, viewGroup2.getContext()));
    }

    public C1088160eQI(ViewGroup viewGroup, ViewGroup viewGroup2, Fragment fragment) {
        this.LIZ = viewGroup;
        this.LIZIZ = viewGroup2;
        this.LIZJ = fragment;
        this.LIZLLL = (LiveIconView) viewGroup.findViewById(R.id.fl8);
        this.LJ = (C16F5) viewGroup.findViewById(R.id.fl9);
    }
}
