package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559560Lx4 extends AbstractC1664490tPr<C559530Lx1, C07T9> {
    public C559570Lx5 LLJJJIL;
    public final List<C420880Ges> LLJJJJ = new ArrayList();
    public final List<View> LLJJJJJIL = new ArrayList();
    public final C559580Lx6 LLJJJJLIIL = new C559580Lx6();
    public List<String> LLJJL;
    public C1416905gd LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        for (C420880Ges c420880Ges : (ArrayList) this.LLJJJJ) {
            AnimatorSet animatorSet = c420880Ges.LIZ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            c420880Ges.LIZ = null;
        }
        ((ArrayList) this.LLJJJJ).clear();
        C559580Lx6 c559580Lx6 = this.LLJJJJLIIL;
        ObjectAnimator objectAnimator = c559580Lx6.LIZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        c559580Lx6.LIZ = null;
        C1416905gd c1416905gd = this.LLJJLIIIJLLLLLLLZ;
        if (c1416905gd != null) {
            AnonymousClass0956 anonymousClass0956 = c1416905gd.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1416905gd.LIZJ = null;
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        C1416905gd c1416905gd;
        AnonymousClass0956 anonymousClass0956;
        ObjectAnimator objectAnimator;
        super.onPause();
        C559530Lx1 c559530Lx1 = LLLLILI().LIZ;
        if (c559530Lx1.LIZLLL) {
            Iterator it2 = ((ArrayList) this.LLJJJJ).iterator();
            while (it2.hasNext()) {
                AnimatorSet animatorSet = ((C420880Ges) it2.next()).LIZ;
                if (animatorSet != null) {
                    animatorSet.pause();
                }
            }
        }
        if (c559530Lx1.LIZJ && (objectAnimator = this.LLJJJJLIIL.LIZ) != null) {
            objectAnimator.pause();
        }
        if (!c559530Lx1.LJ || (c1416905gd = this.LLJJLIIIJLLLLLLLZ) == null || (anonymousClass0956 = c1416905gd.LIZJ) == null) {
            return;
        }
        anonymousClass0956.LIZIZ(null);
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        C1416905gd c1416905gd;
        ObjectAnimator objectAnimator;
        super.onResume();
        C559530Lx1 c559530Lx1 = LLLLILI().LIZ;
        if (c559530Lx1.LIZLLL) {
            Iterator it2 = ((ArrayList) this.LLJJJJ).iterator();
            while (it2.hasNext()) {
                AnimatorSet animatorSet = ((C420880Ges) it2.next()).LIZ;
                if (animatorSet != null) {
                    animatorSet.resume();
                }
            }
        }
        if (c559530Lx1.LIZJ && (objectAnimator = this.LLJJJJLIIL.LIZ) != null) {
            objectAnimator.resume();
        }
        if (!c559530Lx1.LJ || (c1416905gd = this.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = c1416905gd.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1416905gd.LIZJ = null;
        c1416905gd.LIZJ = C23250099c.LIZLLL(c1416905gd.LIZIZ, null, null, new C1416805gc(c1416905gd, null), 3);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        List<String> list;
        C559570Lx5 c559570Lx5;
        TuxTextView tuxTextView2;
        C0MXY c0mxy;
        C0MXY c0mxy2;
        C559570Lx5 c559570Lx52;
        View view;
        TuxTextView tuxTextView3;
        LinearLayout linearLayout2;
        View view2;
        int i;
        super.onActivityCreated(bundle);
        C559530Lx1 c559530Lx1 = LLLLILI().LIZ;
        C559570Lx5 c559570Lx53 = this.LLJJJIL;
        if (c559570Lx53 != null && (view2 = c559570Lx53.LLILZIL) != null) {
            if (c559530Lx1.LIZJ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        if (c559530Lx1.LIZLLL) {
            C559570Lx5 c559570Lx54 = this.LLJJJIL;
            if (c559570Lx54 != null && (linearLayout2 = c559570Lx54.LLILZ) != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
        } else {
            C559570Lx5 c559570Lx55 = this.LLJJJIL;
            if (c559570Lx55 != null && (linearLayout = c559570Lx55.LLILZ) != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        }
        if (c559530Lx1.LJ) {
            C559570Lx5 c559570Lx56 = this.LLJJJIL;
            if (c559570Lx56 != null && (tuxTextView3 = c559570Lx56.LLILZLL) != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
        } else {
            C559570Lx5 c559570Lx57 = this.LLJJJIL;
            if (c559570Lx57 != null && (tuxTextView = c559570Lx57.LLILZLL) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
        C559530Lx1 c559530Lx12 = LLLLILI().LIZ;
        if (c559530Lx12.LIZJ && (c559570Lx52 = this.LLJJJIL) != null && (view = c559570Lx52.LLILZIL) != null) {
            C559580Lx6 c559580Lx6 = this.LLJJJJLIIL;
            c559580Lx6.getClass();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(800L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(2);
            c559580Lx6.LIZ = objectAnimatorOfFloat;
            ObjectAnimator objectAnimator = this.LLJJJJLIIL.LIZ;
            if (objectAnimator != null) {
                C786410Ut5.Pd(objectAnimator);
            }
        }
        if (c559530Lx12.LIZLLL) {
            C559570Lx5 c559570Lx58 = this.LLJJJIL;
            if (c559570Lx58 != null && (c0mxy2 = c559570Lx58.LLILLL) != null) {
                c0mxy2.LIZ(c559530Lx12.LJFF);
            }
            for (C420880Ges c420880Ges : (ArrayList) this.LLJJJJ) {
                AnimatorSet animatorSet = c420880Ges.LIZ;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                c420880Ges.LIZ = null;
            }
            ((ArrayList) this.LLJJJJ).clear();
            ((ArrayList) this.LLJJJJJIL).clear();
            C559570Lx5 c559570Lx59 = this.LLJJJIL;
            if (c559570Lx59 != null && (c0mxy = c559570Lx59.LLILLL) != null) {
                C531650Kt9 it2 = C13LZ.LJIILJJIL(0, c0mxy.getChildCount()).iterator();
                while (it2.LLILLL) {
                    View childAt = c0mxy.getChildAt(it2.nextInt());
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        C531650Kt9 it3 = C13LZ.LJIILJJIL(0, viewGroup.getChildCount()).iterator();
                        while (it3.LLILLL) {
                            View childAt2 = viewGroup.getChildAt(it3.nextInt());
                            if ((childAt2 instanceof ViewGroup) && ((ViewGroup) childAt2).getChildCount() > 0) {
                                ((ArrayList) this.LLJJJJJIL).add(childAt2);
                            }
                        }
                    }
                }
            }
            int i2 = 0;
            for (Object obj : (ArrayList) this.LLJJJJJIL) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view3 = (View) obj;
                    C420880Ges c420880Ges2 = new C420880Ges();
                    c420880Ges2.LIZ(i2, view3);
                    AnimatorSet animatorSet2 = c420880Ges2.LIZ;
                    if (animatorSet2 != null && animatorSet2.isRunning()) {
                        animatorSet2.cancel();
                    }
                    c420880Ges2.LIZ(i2, view3);
                    AnimatorSet animatorSet3 = c420880Ges2.LIZ;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                    ((ArrayList) this.LLJJJJ).add(c420880Ges2);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            for (C420880Ges c420880Ges3 : (ArrayList) this.LLJJJJ) {
                AnimatorSet animatorSet4 = c420880Ges3.LIZ;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                c420880Ges3.LIZ = null;
            }
            ((ArrayList) this.LLJJJJ).clear();
            ((ArrayList) this.LLJJJJJIL).clear();
        }
        this.LLJJL = c559530Lx12.LJI;
        if (c559530Lx12.LJ && (list = c559530Lx12.LJII) != null && !list.isEmpty()) {
            if (this.LLJJLIIIJLLLLLLLZ == null && (c559570Lx5 = this.LLJJJIL) != null && (tuxTextView2 = c559570Lx5.LLILZLL) != null) {
                requireSceneContext();
                this.LLJJLIIIJLLLLLLLZ = new C1416905gd(tuxTextView2);
            }
            C1416905gd c1416905gd = this.LLJJLIIIJLLLLLLLZ;
            if (c1416905gd != null) {
                List<String> list2 = c559530Lx12.LJII;
                if (true ^ list2.isEmpty()) {
                    c1416905gd.LIZLLL = list2;
                }
                c1416905gd.LJ = 0;
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lx2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C559530Lx1) obj2).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 713));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lx3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C559530Lx1) obj2).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS581S0100000_2(this, 605));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.o6, viewGroup, false);
        int i = R.id.iu1;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.iu1, viewTd);
        if (tuxTextView != null) {
            i = R.id.jqc;
            C0MXY c0mxy = (C0MXY) C1616006Uk.LIZ(R.id.jqc, viewTd);
            if (c0mxy != null) {
                i = R.id.jqd;
                LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.jqd, viewTd);
                if (linearLayout != null) {
                    i = R.id.t16;
                    View viewLIZ = C1616006Uk.LIZ(R.id.t16, viewTd);
                    if (viewLIZ != null) {
                        i = R.id.tsk;
                        TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.tsk, viewTd);
                        if (tuxTextView2 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) viewTd;
                            this.LLJJJIL = new C559570Lx5(linearLayout2, tuxTextView, c0mxy, linearLayout, viewLIZ, tuxTextView2);
                            return linearLayout2;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
