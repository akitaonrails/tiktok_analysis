package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: renamed from: X.129A, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C129A {
    public static final int LJFF = View.generateViewId();
    public final ViewGroup LIZ;
    public final C129D LIZIZ;
    public final C129C LIZJ;
    public final ViewGroup LIZLLL;
    public C129B LJ;

    public final void LIZ(MusicModel musicModel, boolean z) {
        boolean z2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C0HZQ c0hzq;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        C129C c129c = this.LIZJ;
        if (c129c.LJFF || !c129c.LIZLLL) {
            return;
        }
        if (musicModel != null && z && musicModel.hasLyricsCopyRight() && !musicModel.isLocalMusic()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C129B c129b = this.LJ;
            if (c129b != null) {
                ViewParent parent = c129b.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup4 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(c129b, viewGroup4);
                }
            }
            this.LJ = null;
            return;
        }
        if (this.LJ == null) {
            C129B c129b2 = new C129B(this.LIZLLL.getContext());
            c129b2.setId(LJFF);
            int visibility = c129b2.getVisibility();
            c129b2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c129b2);
            this.LJ = c129b2;
        }
        View viewFindViewById = this.LIZLLL.findViewById(R.id.i3m);
        if ((viewFindViewById instanceof FrameLayout) && (viewGroup2 = (ViewGroup) viewFindViewById) != null) {
            C129B c129b3 = this.LJ;
            if (c129b3 != null) {
                ViewParent parent2 = c129b3.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(c129b3, viewGroup3);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                viewGroup2.addView(c129b3, layoutParams);
            }
            C129B c129b4 = this.LJ;
            if (c129b4 != null) {
                c129b4.LLILZ = new AwS395S0200000_29(this, musicModel, 104);
            }
            boolean zLJ = this.LIZIZ.LJ();
            C129B c129b5 = this.LJ;
            if (c129b5 != null && (c0hzq = c129b5.LLILLJJLI) != null) {
                c0hzq.setChecked(zLJ);
            }
            viewGroup2.requestLayout();
            this.LIZLLL.requestLayout();
            return;
        }
        C129B c129b6 = this.LJ;
        if (c129b6 != null) {
            ViewParent parent3 = c129b6.getParent();
            if ((parent3 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent3) != null) {
                C786410Ut5.LJJJLZIJ(c129b6, viewGroup);
            }
        }
        this.LJ = null;
    }

    public C129A(ViewGroup viewGroup, AnonymousClass1299 anonymousClass1299, C129C c129c) {
        this.LIZ = viewGroup;
        this.LIZIZ = anonymousClass1299;
        this.LIZJ = c129c;
        this.LIZLLL = viewGroup;
    }
}
