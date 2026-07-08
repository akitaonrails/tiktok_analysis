package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12GL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12GL extends RecyclerView.ViewHolder {
    public final boolean LL;
    public final Context LLILLJJLI;
    public final C1322110kVd LLILLL;

    public final float I5() {
        return this.LL ? C418440Gaw.LIZIZ(8) : C418440Gaw.LIZIZ(10);
    }

    public final float L5() {
        return this.LL ? C418440Gaw.LIZIZ(8) : C418440Gaw.LIZIZ(6);
    }

    public C12GL(FrameLayout frameLayout, boolean z) {
        super(frameLayout);
        this.LL = z;
        this.LLILLJJLI = frameLayout.getContext();
        this.LLILLL = (C1322110kVd) frameLayout.findViewById(R.id.kf2);
        frameLayout.getLayoutParams().height = C12GK.LLJILLL;
        if (z) {
            frameLayout.getLayoutParams().height = C12GK.LLJJIJIIJIL;
            C426750GoL.LJIIIZ(frameLayout, null, 0, null, null, false, 29);
        }
    }

    public static void N5(View view, boolean z, boolean z2) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            i = C12GK.LLJILLL;
        } else {
            i = C12GK.LLJJ;
        }
        int iLIZIZ = (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))) / 2;
        if (z2) {
            C338840DQc.LIZ(view, Integer.valueOf(iLIZIZ));
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.topMargin = iLIZIZ;
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
