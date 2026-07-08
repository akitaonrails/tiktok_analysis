package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DQG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQG {
    public final View LIZ;
    public View LIZIZ;
    public View LIZJ;
    public C1390410mHn LIZLLL;

    public final void LIZ() {
        Object c098200Yq;
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        View viewFindViewById = this.LIZIZ;
        if (viewFindViewById == null) {
            try {
                ViewStub viewStub = (ViewStub) view.findViewById(R.id.x6h);
                c098200Yq = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            viewFindViewById = (View) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            if (viewFindViewById == null) {
                viewFindViewById = view.findViewById(R.id.x6g);
            }
            this.LIZIZ = viewFindViewById;
            this.LIZJ = viewFindViewById.findViewById(R.id.x6f);
            this.LIZLLL = (C1390410mHn) viewFindViewById.findViewById(R.id.x6d);
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.xcw);
            if (textView != null) {
                textView.setText(C1852920yJm.LIZ.botName);
                C426750GoL.LJIIIZ(textView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, false, 30);
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            SmartImageView smartImageView = (SmartImageView) viewFindViewById.findViewById(R.id.xcx);
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ;
            C786410Ut5.G6(smartImageView, layoutParams);
            C1857690yRT.LJII(smartImageView, iLIZIZ, iLIZIZ, false);
            C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(ScreenUtils.getStatusBarHeight(viewFindViewById.getContext())), null, null, false, 29);
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        C1390410mHn c1390410mHn = this.LIZLLL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    public C0DQG(View view) {
        this.LIZ = view;
    }
}
