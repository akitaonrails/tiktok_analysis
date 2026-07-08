package X;

import X.C19563711gR;
import Y.ACListenerS163S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11gS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19563811gS<RESOURCE_ITEM_VIEW_HOLDER extends RecyclerView.ViewHolder, ACTIONS extends C19563711gR> extends AbstractC1664490tPr<C387490FHf, ACTIONS> {
    public RecyclerView LLJJJIL;
    public C386550FDp LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public C197039127h LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C19561611g6 LLJL;
    public boolean LLJLIL;
    public C21594419fC LLJLILLLLZIIL;
    public final AnimatorSet LLJLL = new AnimatorSet();
    public boolean LLJLLIL = true;
    public View LLJLLL;
    public TuxIconView LLJZ;
    public C19564111gV<RESOURCE_ITEM_VIEW_HOLDER> LLJZIJLIL;

    public abstract void LLLLLJIL(RecyclerView.ViewHolder viewHolder, C0FGT c0fgt);

    public abstract RecyclerView.ViewHolder LLLLLJLJLL(ViewGroup viewGroup);

    public final void LLLLLLL() {
        View viewFindViewById;
        this.LLJLLIL = true;
        this.LLJLL.cancel();
        View view = this.mView;
        View viewFindViewById2 = view != null ? view.findViewById(R.id.wx5) : null;
        if (viewFindViewById2 != null) {
            if (!(viewFindViewById2.getAlpha() == 1.0f) || viewFindViewById2.getTranslationY() != 0.0f) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById2, "alpha", viewFindViewById2.getAlpha(), 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById2, "translationY", viewFindViewById2.getTranslationY(), 0.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
                this.LLJLL.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat);
                this.LLJLL.start();
            }
        }
        View view2 = this.mView;
        if (view2 == null || (viewFindViewById = view2.findViewById(R.id.pyr)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
    }

    public void LLLLLL() {
        C19561611g6 c19561611g6 = this.LLJL;
        if (c19561611g6 != null) {
            c19561611g6.addOnTabSelectedListener(new InterfaceC19561911g9(this) { // from class: X.11gO
                public final /* synthetic */ AbstractC19563811gS<RESOURCE_ITEM_VIEW_HOLDER, ACTIONS> LIZ;

                @Override // X.InterfaceC19561911g9
                public final void LIZ(C12H3 c12h3) {
                }

                @Override // X.InterfaceC19561911g9
                public final void LIZIZ(C12H3 c12h3) {
                }

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC19561911g9
                public final void LIZJ(C12H3 c12h3, boolean z) {
                    C21594419fC c21594419fC;
                    if (c12h3 != null) {
                        int i = c12h3.LIZLLL;
                        AbstractC19563811gS<RESOURCE_ITEM_VIEW_HOLDER, ACTIONS> abstractC19563811gS = this.LIZ;
                        if (!z && (c21594419fC = abstractC19563811gS.LLJLILLLLZIIL) != null) {
                            c21594419fC.setCurrentItem(i, true);
                        }
                    }
                }
            });
        }
        C21594419fC c21594419fC = this.LLJLILLLLZIIL;
        if (c21594419fC != null) {
            c21594419fC.addOnPageChangeListener(new C19642311t7(this.LLJL));
            c21594419fC.addOnPageChangeListener(new C19774712Yn(this, 15));
        }
        View view = this.LLJJJJLIIL;
        if (view != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.11gc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
        }
        C197039127h c197039127h = this.LLJJL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS163S0100000_29(this, 320));
        }
        C19564111gV<RESOURCE_ITEM_VIEW_HOLDER> c19564111gV = this.LLJZIJLIL;
        if (c19564111gV != null) {
            c19564111gV.LLJIJIL = new InterfaceC19564911gd(this) { // from class: X.11gP
                public boolean LIZ;
                public int LIZIZ;
                public Boolean LIZJ;
                public final /* synthetic */ AbstractC19563811gS<RESOURCE_ITEM_VIEW_HOLDER, ACTIONS> LIZLLL;

                {
                    this.LIZLLL = this;
                }

                @Override // X.InterfaceC19564911gd
                public final void LIZ(RecyclerView recyclerView, int i, int i2) {
                    Boolean bool;
                    View viewFindViewById;
                    View viewFindViewById2;
                    boolean z;
                    C21594419fC c21594419fC2 = this.LIZLLL.LLJLILLLLZIIL;
                    if (c21594419fC2 != null && i == c21594419fC2.getCurrentItem() && i2 == 0) {
                        this.LIZIZ = 0;
                        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                        if (this.LIZ && (bool = this.LIZJ) != null) {
                            this.LIZ = false;
                            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                                this.LIZLLL.LLLLLLL();
                            } else {
                                AbstractC19563811gS<RESOURCE_ITEM_VIEW_HOLDER, ACTIONS> abstractC19563811gS = this.LIZLLL;
                                abstractC19563811gS.LLJLLIL = false;
                                abstractC19563811gS.LLJLL.cancel();
                                View view2 = abstractC19563811gS.mView;
                                if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.wx5)) != null) {
                                    if (viewFindViewById2.getAlpha() == 0.0f) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (!z || viewFindViewById2.getTranslationY() != C418440Gaw.LIZIZ(-44)) {
                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById2, "alpha", viewFindViewById2.getAlpha(), 0.0f);
                                        objectAnimatorOfFloat.setDuration(200L);
                                        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById2, "translationY", viewFindViewById2.getTranslationY(), C418440Gaw.LIZIZ(-44));
                                        objectAnimatorOfFloat2.setDuration(200L);
                                        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
                                        abstractC19563811gS.LLJLL.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat);
                                        abstractC19563811gS.LLJLL.start();
                                    }
                                }
                                View view3 = abstractC19563811gS.mView;
                                if (view3 != null && (viewFindViewById = view3.findViewById(R.id.pyr)) != null) {
                                    C786410Ut5.LJLLLLLL(4, viewFindViewById);
                                }
                                this.LIZLLL.getClass();
                                int iComputeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset();
                                if (iComputeVerticalScrollOffset2 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))) {
                                    recyclerView.smoothScrollBy(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) - iComputeVerticalScrollOffset2, C1619980sG4.LJIIIZ(), 200);
                                }
                            }
                            this.LIZJ = null;
                            return;
                        }
                        if (iComputeVerticalScrollOffset != 0) {
                            return;
                        }
                        AbstractC19563811gS<RESOURCE_ITEM_VIEW_HOLDER, ACTIONS> abstractC19563811gS2 = this.LIZLLL;
                        if (abstractC19563811gS2.LLJLLIL) {
                            return;
                        }
                        abstractC19563811gS2.LLLLLLL();
                    }
                }

                @Override // X.InterfaceC19564911gd
                public final void LLFF(RecyclerView recyclerView, int i, int i2) {
                    boolean z;
                    ConstraintLayout constraintLayout;
                    View viewFindViewById;
                    boolean z2;
                    C21594419fC c21594419fC2 = this.LIZLLL.LLJLILLLLZIIL;
                    int i3 = 0;
                    if (c21594419fC2 != null && i == c21594419fC2.getCurrentItem()) {
                        if (recyclerView.getScrollState() == 1) {
                            this.LIZ = true;
                        }
                        if (!this.LIZ) {
                            return;
                        }
                        if (this.LIZJ == null) {
                            if (i2 < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.LIZJ = Boolean.valueOf(z2);
                        }
                        if (this.LIZIZ * i2 < 0) {
                            this.LIZIZ = 0;
                        }
                        if (Math.abs(this.LIZIZ) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)))) {
                            this.LIZIZ += i2;
                        } else {
                            if (this.LIZIZ < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.LIZJ = Boolean.valueOf(z);
                        }
                        if (this.LIZLLL.LLJLL.isRunning()) {
                            this.LIZLLL.LLJLL.cancel();
                        }
                        View view2 = this.LIZLLL.mView;
                        if (view2 != null && (constraintLayout = (ConstraintLayout) view2.findViewById(R.id.wx5)) != null) {
                            AbstractC1664490tPr abstractC1664490tPr = this.LIZLLL;
                            float translationY = constraintLayout.getTranslationY() - i2;
                            if (translationY < C418440Gaw.LIZIZ(-44)) {
                                translationY = C418440Gaw.LIZIZ(-44);
                            }
                            if (translationY > 0.0f) {
                                translationY = 0.0f;
                            }
                            View view3 = abstractC1664490tPr.mView;
                            if (view3 != null && (viewFindViewById = view3.findViewById(R.id.pyr)) != null) {
                                if (translationY != 0.0f) {
                                    i3 = 4;
                                }
                                C786410Ut5.LJLLLLLL(i3, viewFindViewById);
                            }
                            C786410Ut5.jd(constraintLayout, translationY);
                            C786410Ut5.c5(constraintLayout, 1.0f - Math.abs(translationY / C418440Gaw.LIZIZ(44)));
                        }
                    }
                }
            };
        }
    }

    public void LLLLLLIL() {
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0FHj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LIZ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29((AbstractC19563811gS) this, 873));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.11ga
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LIZIZ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29((AbstractC19563811gS) this, 874));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.11gb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LIZJ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29((AbstractC19563811gS) this, 875));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.11gN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LIZLLL;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29((AbstractC19563811gS) this, 876));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0FOU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJ;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29((AbstractC19563811gS) this, 867));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0FHk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C387490FHf) obj).LJFF);
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29((AbstractC19563811gS) this, 868));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0FHn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C387490FHf) obj).LJI);
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS608S0100000_29((AbstractC19563811gS) this, 869));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11gZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJII;
            }
        }, new AwS608S0100000_29((AbstractC19563811gS) this, 870));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FHh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJIIIZ;
            }
        }, new AwS608S0100000_29((AbstractC19563811gS) this, 871));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FHi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387490FHf) obj).LJIIIIZZ;
            }
        }, new AwS608S0100000_29((AbstractC19563811gS) this, 872));
    }

    public final void LLLLLLJ(C387180FGa c387180FGa) {
        String effectId;
        String str;
        String id;
        String str2;
        String resourceId;
        List<C0FGS> list = LLLLILI().LIZ.LIZIZ;
        if (list != null) {
            Iterator<C0FGS> it2 = list.iterator();
            while (it2.hasNext()) {
                for (C0FGT c0fgt : it2.next().LIZ) {
                    c0fgt.LIZJ = false;
                    Effect effect = c0fgt.LIZ;
                    String str3 = null;
                    if (effect != null) {
                        effectId = effect.getEffectId();
                    } else {
                        effectId = null;
                    }
                    if (c387180FGa != null) {
                        str = c387180FGa.LIZ;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(effectId, str)) {
                        c0fgt.LIZJ = true;
                    } else {
                        Effect effect2 = c0fgt.LIZ;
                        if (effect2 != null) {
                            id = effect2.getId();
                        } else {
                            id = null;
                        }
                        if (c387180FGa != null) {
                            str2 = c387180FGa.LIZ;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(id, str2)) {
                            c0fgt.LIZJ = true;
                        } else {
                            Effect effect3 = c0fgt.LIZ;
                            if (effect3 != null) {
                                resourceId = effect3.getResourceId();
                            } else {
                                resourceId = null;
                            }
                            if (c387180FGa != null) {
                                str3 = c387180FGa.LIZIZ;
                            }
                            if (Intrinsics.LJFF(resourceId, str3)) {
                                c0fgt.LIZJ = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void LLLLLLLLL(int i) {
        C12H3 tabAt;
        C19561611g6 c19561611g6 = this.LLJL;
        if (c19561611g6 != null && (tabAt = c19561611g6.getTabAt(i)) != null) {
            C19561611g6 c19561611g62 = this.LLJL;
            if (c19561611g62 != null) {
                c19561611g62.smoothSelectTab(tabAt, true);
            }
            this.LLJLIL = false;
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLLL();
        LLLLLLIL();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        setTheme(R.style.y0);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(requireSceneContext());
        if (C357780E0y.LIZ()) {
            i = R.layout.fsl;
        } else {
            i = R.layout.fsk;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false);
        C786410Ut5.LJLLLLLL(8, viewTd);
        this.LLJJLIIIJLLLLLLLZ = viewTd.findViewById(R.id.q1k);
        this.LLJJJJJIL = viewTd.findViewById(R.id.wx5);
        View viewFindViewById = viewTd.findViewById(R.id.pyr);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        this.LLJJJIL = (RecyclerView) viewTd.findViewById(R.id.nna);
        C386550FDp c386550FDp = new C386550FDp(requireSceneContext(), this.LLJJJIL);
        this.LLJJJJ = c386550FDp;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c386550FDp.LIZJ = 4;
        c386550FDp.LIZLLL = 3;
        c386550FDp.LJ = iLIZIZ;
        c386550FDp.LJFF = 0;
        c386550FDp.LJI = iLIZIZ2;
        ((GridLayoutManager) c386550FDp.LJIIIIZZ.getValue()).LJIJ(3);
        c386550FDp.LJIIIZ.notifyDataSetChanged();
        this.LLJJJJLIIL = viewTd.findViewById(R.id.hbi);
        this.LLJJL = (C197039127h) viewTd.findViewById(R.id.cuf);
        this.LLJL = (C19561611g6) viewTd.findViewById(R.id.wya);
        this.LLJLLL = viewTd.findViewById(R.id.hfj);
        this.LLJZ = (TuxIconView) viewTd.findViewById(R.id.k0h);
        View viewFindViewById2 = viewTd.findViewById(R.id.v_b);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View view = this.LLJLLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C19561611g6 c19561611g6 = this.LLJL;
        if (c19561611g6 != null) {
            c19561611g6.setSupportCustomIndicator(false);
        }
        C21594419fC c21594419fC = (C21594419fC) viewTd.findViewById(R.id.viewpager);
        this.LLJLILLLLZIIL = c21594419fC;
        C19564111gV<RESOURCE_ITEM_VIEW_HOLDER> c19564111gV = new C19564111gV<>(c21594419fC, requireSceneContext(), LLLLIL(), new C19564011gU(this), new C19563911gT(this), LLLLIL().LIZIZ);
        this.LLJZIJLIL = c19564111gV;
        C21594419fC c21594419fC2 = this.LLJLILLLLZIIL;
        if (c21594419fC2 != null) {
            c21594419fC2.setAdapter(c19564111gV);
        }
        return (ViewGroup) viewTd;
    }
}
