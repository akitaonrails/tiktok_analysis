package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1976, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1976 {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;

    public AnonymousClass1976(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.video_rewrite_panel);
        this.LIZ = viewFindViewById;
        this.LIZIZ = viewGroup.findViewById(R.id.video_rewrite_loading);
        this.LIZJ = viewGroup.findViewById(R.id.video_rewrite_fail_container);
        this.LIZLLL = viewGroup.findViewById(R.id.video_rewrite_result_btn_container);
        this.LJ = viewGroup.findViewById(R.id.video_rewrite_cancel_btn);
        this.LJFF = viewGroup.findViewById(R.id.video_rewrite_retry_btn);
        this.LJI = viewGroup.findViewById(R.id.video_rewrite_original_btn);
        this.LJII = viewGroup.findViewById(R.id.video_rewrite_regenerate_btn);
        if (viewFindViewById != null) {
            viewFindViewById.setTag(R.id.vfz, Boolean.TRUE);
            C1443400nfG.LIZ(viewFindViewById);
        }
    }

    public final void LIZ(View view) {
        int i;
        int i2;
        View view2 = this.LIZ;
        if (view2 != null) {
            view2.setTag(R.id.vfz, Boolean.TRUE);
            C1443400nfG.LIZ(view2);
        }
        View view3 = this.LIZ;
        int i3 = 0;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LIZIZ;
        if (view4 != null) {
            if (view == view4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view4);
        }
        View view5 = this.LIZJ;
        if (view5 != null) {
            if (view == view5) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view5);
        }
        View view6 = this.LIZLLL;
        if (view6 != null) {
            if (view != view6) {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view6);
        }
    }
}
