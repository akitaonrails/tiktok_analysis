package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0crz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028450crz {
    public static C1035340d36 LIZ(Activity activity, boolean z) {
        C1035340d36 c1035340d36 = (C1035340d36) LIZIZ(activity, z).findViewById(R.id.aai);
        if (!(c1035340d36 instanceof C1035340d36)) {
            return null;
        }
        return c1035340d36;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FrameLayout LIZIZ(Activity activity, boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ViewGroup viewGroup;
        View view = null;
        if (z) {
            frameLayout = (FrameLayout) activity.findViewById(R.id.pax);
            if (frameLayout == null) {
                frameLayout = new FrameLayout(activity);
                frameLayout.setId(R.id.pax);
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                if (!C294780Bgy.LIZ() ? !(activity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activity).getEnableSAF() : !(activity instanceof InterfaceC214897198d)) {
                    viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
                } else {
                    Object objLIZJ = C20629915o1.LIZJ((InterfaceC20622815ms) activity);
                    if (objLIZJ != null) {
                        view = ((Fragment) objLIZJ).getView();
                    }
                    if (view instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view;
                    }
                }
                if (viewGroup != null) {
                    viewGroup.addView(frameLayout, -1, -1);
                }
            }
        } else {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.a91);
            if (viewStub == null) {
                frameLayout = (FrameLayout) activity.findViewById(R.id.a90);
            } else {
                viewStub.setLayoutResource(R.layout.cd4);
                frameLayout = (FrameLayout) C786410Ut5.LJLLLL(viewStub);
            }
            if (frameLayout == null) {
                ViewStub viewStub2 = (ViewStub) activity.findViewById(R.id.a7l);
                if (viewStub2 == null) {
                    frameLayout = (FrameLayout) activity.findViewById(R.id.a7k);
                } else {
                    viewStub2.setLayoutResource(R.layout.kz);
                    frameLayout = (FrameLayout) C786410Ut5.LJLLLL(viewStub2);
                }
                if (frameLayout == null) {
                    View viewFindViewById = activity.findViewById(R.id.vs5);
                    if (viewFindViewById != null && (frameLayout2 = (FrameLayout) viewFindViewById.findViewById(R.id.ab6)) != null) {
                        return frameLayout2;
                    }
                    frameLayout = (FrameLayout) C786410Ut5.LJLLJ(activity, R.layout.ld, null);
                    View viewFindViewById2 = activity.findViewById(R.id.vs5);
                    if (viewFindViewById2 != null && (activity instanceof SparkActivity) && viewFindViewById2.getHeight() > C14KQ.LJ(activity) - C497820Jfg.LIZJ(activity)) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C14KQ.LJIIIIZZ(activity), C14KQ.LJ(activity) - C497820Jfg.LIZJ(activity));
                        marginLayoutParams.topMargin = C497820Jfg.LIZJ(activity);
                        C786410Ut5.a6(frameLayout, marginLayoutParams);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(R.id.vs5);
                    if (viewGroup2 != null) {
                        viewGroup2.addView(frameLayout);
                        return frameLayout;
                    }
                }
            }
        }
        return frameLayout;
    }
}
