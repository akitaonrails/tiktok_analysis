package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgVideoInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245110iVR {
    public final Fragment LIZ;
    public boolean LIZIZ;
    public SmartImageView LIZJ;
    public FrameLayout LIZLLL;
    public View LJ;
    public View LJFF;
    public ViewGroup LJI;
    public ViewGroup LJII;
    public TuxNavBar LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public View LJIIL;
    public Drawable LJIILIIL;
    public Integer LJIILJJIL;
    public Integer LJIILL;
    public Drawable LJIILLIIL;
    public Drawable LJIIZILJ;
    public Drawable LJIJ;
    public Integer LJIJI;
    public Boolean LJIJJ;
    public Integer LJIJJLI;
    public boolean LJIL;
    public Aweme LJJI;
    public List<String> LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public Integer LJJIIJZLJL;
    public boolean LJJIIZ;
    public float LJJIIZI;
    public TuxTextView LJJIJIL;
    public TuxIconView LJJIJL;
    public float LJJ = 0.5f;
    public final C01GW LJJIJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2928));
    public final C01GW LJJIJIIJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(658));
    public final C1245120iVS LJJIJIIJIL = new C0TS5() { // from class: X.0iVS
        @Override // X.C0TS5
        public final void LIZ(List<String> list) {
            if (list != null && !list.isEmpty()) {
                C1245110iVR c1245110iVR = this.LIZ;
                c1245110iVR.LIZLLL(1, list, null, Float.valueOf(c1245110iVR.LJJ));
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ() {
        /*
            r4 = this;
            android.view.View r3 = r4.LJIIJJI
            r0 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r3 != 0) goto L13
            float r0 = X.C418440Gaw.LIZIZ(r1)
            int r0 = X.C814420VxA.LIZIZ(r0)
            return r0
        L13:
            java.lang.Integer r0 = r4.LJIIIIZZ(r3)
            if (r0 == 0) goto L5c
            int r2 = r0.intValue()
            int r0 = r3.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 > 0) goto L57
            r0 = 0
            if (r0 != 0) goto L57
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 == 0) goto L48
            int r0 = r0.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L48
            int r0 = r1.intValue()
        L44:
            int r0 = r0 / 2
            int r2 = r2 + r0
            return r2
        L48:
            r0 = 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            goto L44
        L57:
            int r0 = r1.intValue()
            goto L44
        L5c:
            float r0 = X.C418440Gaw.LIZIZ(r1)
            int r0 = X.C814420VxA.LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1245110iVR.LIZJ():int");
    }

    public final void LJI() {
        List<String> list;
        boolean z = (this.LJJII != 1 || (list = this.LJJIFFI) == null || list.isEmpty()) ? false : true;
        boolean z2 = this.LJJII == 2 && this.LJJI != null;
        if (z || z2) {
            ProfileBgInfo profileBgInfo = new ProfileBgInfo();
            profileBgInfo.setMediaType(this.LJJII);
            List<String> list2 = this.LJJIFFI;
            profileBgInfo.setImageUrlList(list2 != null ? new ArrayList(list2) : null);
            if (z2) {
                ProfileBgVideoInfo profileBgVideoInfo = new ProfileBgVideoInfo();
                profileBgVideoInfo.setAwemeInfo(this.LJJI);
                profileBgVideoInfo.setOffsetYRatio(this.LJJ);
                profileBgVideoInfo.setAutoPlay(true);
                profileBgInfo.setVideoInfo(profileBgVideoInfo);
            }
            if (profileBgInfo.hasBackground()) {
                int mediaType = profileBgInfo.getMediaType();
                if (mediaType == 1) {
                    ((C1254890ilD) this.LJJIJ.getValue()).LIZJ(this.LIZ, profileBgInfo, true, this.LIZJ);
                } else if (mediaType == 2) {
                    ((C1245290iVj) this.LJJIJIIJI.getValue()).LIZJ(this.LIZ, profileBgInfo, true, this.LIZLLL);
                }
            }
        }
    }

    public final void LJII() {
        Context context;
        int iLIZLLL;
        Window window;
        C19EG activity = this.LIZ.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            C0DRA.LIZ(window, false);
            window.setStatusBarColor(0);
        }
        ViewGroup viewGroup = this.LJII;
        if (viewGroup != null) {
            viewGroup.setFitsSystemWindows(false);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            viewGroup.requestApplyInsets();
        }
        ViewGroup viewGroup2 = this.LJI;
        if (viewGroup2 != null && (context = this.LIZ.getContext()) != null && (iLIZLLL = C1229200i5m.LIZLLL(context)) > 0) {
            View view = this.LJFF;
            if (view == null) {
                this.LJIL = true;
                view = new View(context);
                view.setId(R.id.w0u);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, iLIZLLL);
                layoutParams.addRule(10);
                C786410Ut5.W5(view, layoutParams);
                view.setBackgroundColor(0);
                C786410Ut5.LJLLLLLL(0, view);
                viewGroup2.addView(view, 0);
                this.LJFF = view;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.LayoutParams) && layoutParams2 != null && layoutParams2.height != iLIZLLL) {
                layoutParams2.height = iLIZLLL;
                C786410Ut5.W5(view, layoutParams2);
            }
            view.setBackgroundColor(0);
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LJIIIZ;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        TuxNavBar tuxNavBar = this.LJIIIIZZ;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(0);
        }
        TuxNavBar tuxNavBar2 = this.LJIIIIZZ;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setBackgroundColor(0);
        }
        TuxNavBar tuxNavBar3 = this.LJIIIIZZ;
        if (tuxNavBar3 != null) {
            tuxNavBar3.setBackground(null);
        }
        TuxTextView tuxTextView = this.LJJIJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        LJIIIZ();
        LIZIZ(true);
        View view3 = this.LJFF;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
        View view4 = this.LJIIJ;
        if (view4 != null) {
            view4.setBackgroundColor(0);
        }
        this.LJJIII = false;
        LJIIJJI(this.LIZIZ);
    }

    public final void LJIIIZ() {
        View viewFindViewById;
        TuxNavBar tuxNavBar = this.LJIIIIZZ;
        if (tuxNavBar == null || (viewFindViewById = tuxNavBar.findViewById(R.id.p1k)) == null) {
            return;
        }
        TuxTextView tuxTextView = this.LJJIJIL;
        int i = 0;
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            i = 4;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0iVS] */
    public C1245110iVR(MusProfileEditFragment musProfileEditFragment) {
        this.LIZ = musProfileEditFragment;
    }

    public static TuxIconView LJFF(TuxNavBar tuxNavBar) {
        ViewGroup viewGroup;
        if (tuxNavBar != null && (viewGroup = (ViewGroup) tuxNavBar.findViewById(R.id.p25)) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TuxIconView) {
                    return (TuxIconView) childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final void LIZIZ(boolean z) {
        TuxIconView tuxIconViewLJFF = this.LJJIJL;
        if (tuxIconViewLJFF == null) {
            tuxIconViewLJFF = LJFF(this.LJIIIIZZ);
            this.LJJIJL = tuxIconViewLJFF;
            if (tuxIconViewLJFF == null) {
                return;
            }
        }
        Context contextRequireContext = this.LIZ.requireContext();
        if (z) {
            contextRequireContext = C1385040m98.LIZ(contextRequireContext, true);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, contextRequireContext);
        if (numLIZJ != null) {
            tuxIconViewLJFF.setTintColor(numLIZJ.intValue());
        }
    }

    public final void LJ(boolean z) {
        String string;
        if (this.LJJIJIL == null) {
            TuxNavBar tuxNavBar = this.LJIIIIZZ;
            if (tuxNavBar != null) {
                if (z) {
                    string = this.LIZ.getString(2131845381);
                } else {
                    string = this.LIZ.getString(2131845380);
                }
                int i = 0;
                TuxTextView tuxTextView = new TuxTextView(this.LIZ.requireContext(), null, 6, i);
                tuxTextView.setText(string);
                tuxTextView.setTuxFont(62);
                tuxTextView.setGravity(17);
                tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                tuxTextView.setSingleLine(true);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                Float fValueOf = Float.valueOf(7.5f);
                tuxTextView.setPadding(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
                LIZ(tuxTextView, z);
                C786410Ut5.h9(tuxTextView, new ACListenerS154S0100000_19(this, 215));
                this.LJJIJIL = tuxTextView;
                C1250280idm c1250280idm = new C1250280idm();
                c1250280idm.LIZIZ = "nav_bar_bg_action";
                c1250280idm.LIZJ = tuxTextView;
                c1250280idm.LIZLLL = true;
                tuxNavBar.LIZ(c1250280idm);
                if (this.LJJIII) {
                    i = 8;
                }
                C786410Ut5.LLLLZLL(tuxTextView, i);
                LJIIIZ();
                return;
            }
            return;
        }
        LJIIJ(z);
    }

    public final Integer LJIIIIZZ(View view) {
        View view2 = this.LJIIJ;
        if (view2 == null) {
            return null;
        }
        int top = 0;
        while (view != null) {
            if (view != view2) {
                top += view.getTop();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                if (view != view2) {
                    return null;
                }
                return Integer.valueOf(top);
            }
        }
        return null;
    }

    public final void LJIIJ(boolean z) {
        int i;
        String string;
        this.LIZIZ = z;
        TuxTextView tuxTextView = this.LJJIJIL;
        if (tuxTextView != null) {
            if (z) {
                string = this.LIZ.getString(2131845381);
            } else {
                string = this.LIZ.getString(2131845380);
            }
            tuxTextView.setText(string);
        }
        TuxTextView tuxTextView2 = this.LJJIJIL;
        if (tuxTextView2 != null) {
            if (this.LJJIII) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i);
        }
        TuxTextView tuxTextView3 = this.LJJIJIL;
        if (tuxTextView3 != null) {
            LIZ(tuxTextView3, z);
        }
        LIZIZ(z);
        LJIIIZ();
    }

    public final void LJIIJJI(boolean z) {
        boolean z2;
        if (z && !this.LJJIII) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.LJIIL;
        if (view != null) {
            view.setClickable(z2);
        }
        View view2 = this.LJIIL;
        if (view2 != null) {
            view2.setFocusable(z2);
        }
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout != null) {
            frameLayout.setClickable(z2);
        }
        FrameLayout frameLayout2 = this.LIZLLL;
        if (frameLayout2 != null) {
            frameLayout2.setFocusable(z2);
        }
        View view3 = this.LJ;
        if (view3 != null) {
            view3.setClickable(z2);
        }
        View view4 = this.LJ;
        if (view4 != null) {
            view4.setFocusable(z2);
        }
    }

    public final void LJIIL(int i) {
        View view;
        boolean z;
        Window window;
        if (!this.LIZIZ || (view = this.LJIIJJI) == null || !view.isAttachedToWindow()) {
            return;
        }
        Integer numLJIIIIZZ = LJIIIIZZ(view);
        if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() > 0) {
            this.LJJIIJZLJL = numLJIIIIZZ;
        } else {
            numLJIIIIZZ = this.LJJIIJZLJL;
            if (numLJIIIIZZ == null || numLJIIIIZZ.intValue() <= 0) {
                return;
            }
        }
        if (i >= numLJIIIIZZ.intValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.LJJIII) {
            return;
        }
        if (z) {
            C19EG activity = this.LIZ.getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                C0DRA.LIZ(window, false);
                window.setStatusBarColor(this.LJJIIJ);
            }
            View view2 = this.LJIIIZ;
            if (view2 != null) {
                view2.setBackgroundColor(this.LJJIIJ);
            }
            TuxNavBar tuxNavBar = this.LJIIIIZZ;
            if (tuxNavBar != null) {
                tuxNavBar.setNavBackground(this.LJJIIJ);
            }
            TuxNavBar tuxNavBar2 = this.LJIIIIZZ;
            if (tuxNavBar2 != null) {
                tuxNavBar2.setBackgroundColor(this.LJJIIJ);
            }
            TuxNavBar tuxNavBar3 = this.LJIIIIZZ;
            if (tuxNavBar3 != null) {
                tuxNavBar3.setBackground(null);
            }
            TuxTextView tuxTextView = this.LJJIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            LJIIIZ();
            LIZIZ(false);
            View view3 = this.LJFF;
            if (view3 != null) {
                view3.setBackgroundColor(this.LJJIIJ);
            }
            this.LJJIII = true;
            LJIIJJI(this.LIZIZ);
            return;
        }
        LJII();
    }

    public final void LIZ(TuxTextView tuxTextView, boolean z) {
        Integer numValueOf;
        Context contextRequireContext = this.LIZ.requireContext();
        if (z) {
            contextRequireContext = C1385040m98.LIZ(contextRequireContext, true);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, contextRequireContext);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            numValueOf = Integer.valueOf(R.attr.a0w);
        } else {
            numValueOf = Integer.valueOf(R.attr.a03);
        }
        c384050F3z.LIZIZ = numValueOf;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        tuxTextView.setBackground(c384050F3z.LIZ(contextRequireContext));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0160 A[PHI: r10
      0x0160: PHI (r10v11 java.lang.Integer) = (r10v3 java.lang.Integer), (r10v4 java.lang.Integer), (r10v13 java.lang.Integer) binds: [B:170:0x030c, B:165:0x02f8, B:105:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r15, java.util.List<java.lang.String> r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, java.lang.Float r18) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1245110iVR.LIZLLL(int, java.util.List, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Float):void");
    }
}
