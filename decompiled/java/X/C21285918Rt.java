package X;

import Y.ACListenerS166S0100000_32;
import Y.ARunnableS43S0101000_32;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21285918Rt extends AbstractC1664490tPr<C18S0, C18RY> {
    public static final int LLLIIL;
    public static final int LLLIILIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 611));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 605));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 614));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 621));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 616));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 619));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 604));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 612));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 610));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 617));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 618));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 607));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 620));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 609));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 615));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 613));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 608));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 606));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 603));
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public final C21286018Ru LLLIIIIL;
    public int LLLIIIL;

    public final C0I7D LLLLLLL() {
        return (C0I7D) this.LLJJJJ.getValue();
    }

    public final C1643640ssE LLLLLLLLL() {
        return (C1643640ssE) this.LLLFFI.getValue();
    }

    public final LinearLayout LLLLLLLLLL() {
        return (LinearLayout) this.LLJJJIL.getValue();
    }

    public final RecyclerView LLLLLLLZIL() {
        return (RecyclerView) this.LLLF.getValue();
    }

    public final RecyclerView LLLLLLZ() {
        return (RecyclerView) this.LLJJJJJIL.getValue();
    }

    public final C1643670ssH LLLLLLZZ() {
        return (C1643670ssH) this.LLJLL.getValue();
    }

    static {
        LLLIIL = C255770A0p.LIZ() ? 166 : 147;
        LLLIILIL = C255770A0p.LIZ() ? 86 : 117;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [X.18Ru] */
    public C21285918Rt() {
        C388240FKc.LIZ();
        this.LLLIIIIL = new InterfaceC1391500mJY() { // from class: X.18Ru
            @Override // X.InterfaceC1391500mJY
            public final void LLLL(int i) {
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJJIIJ(int i) {
                this.LL.LLLLIL().LJ.invoke(new C1838890xx9(true, i, 4));
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJZI(int i) {
                this.LL.LLLLIL().LJ.invoke(new C1838890xx9(false, i, 4));
                this.LL.LLLLLLL().clearFocus();
            }
        };
    }

    public final void LLLLLJLJLL() {
        if (C255770A0p.LIZ()) {
            C1643670ssH c1643670ssHLLLLLLZZ = LLLLLLZZ();
            int i = c1643670ssHLLLLLLZZ.LLILLL;
            if (i != -1) {
                c1643670ssHLLLLLLZZ.LLILLL = -1;
                c1643670ssHLLLLLLZZ.notifyItemChanged(i, "sel");
                return;
            }
            return;
        }
        C1643640ssE c1643640ssELLLLLLLLL = LLLLLLLLL();
        int i2 = c1643640ssELLLLLLLLL.LLILLL;
        if (i2 != -1) {
            c1643640ssELLLLLLLLL.LLILLL = -1;
            c1643640ssELLLLLLLLL.notifyItemChanged(i2, "sel");
        }
    }

    public final List<AIPlaygroundChipsModel> LLLLLZ() {
        FlexboxLayoutManager flexboxLayoutManager;
        RecyclerView.LayoutManager layoutManager = LLLLLLZ().getLayoutManager();
        if (!(layoutManager instanceof FlexboxLayoutManager) || (flexboxLayoutManager = (FlexboxLayoutManager) layoutManager) == null) {
            return C13BV.INSTANCE;
        }
        View viewLJIJ = flexboxLayoutManager.LJIJ(0, flexboxLayoutManager.getChildCount(), false);
        int position = viewLJIJ == null ? -1 : flexboxLayoutManager.getPosition(viewLJIJ);
        int iFindLastVisibleItemPosition = flexboxLayoutManager.findLastVisibleItemPosition();
        if (position == -1 || iFindLastVisibleItemPosition < position) {
            return C13BV.INSTANCE;
        }
        List<T> list = LLLLLLZZ().LL.LJFF;
        int i = iFindLastVisibleItemPosition + 1;
        int size = list.size();
        if (i > size) {
            i = size;
        }
        return list.subList(position, i);
    }

    public final boolean LLLLZ() throws Throwable {
        Editable editableLLLLJI = C2204961BRm.LLLLJI(LLLLLLL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhZJyA3Tu71kQ2UKO9NhKPwoII+Q0PN53jtJdJrkzeqfiYSWknhRaXgzeaXGu9vqQpIfTV", null));
        return editableLLLLJI != null && editableLLLLJI.length() > 1500;
    }

    public final void LLLLLL(boolean z) {
        int i;
        TuxTextView tuxTextView = (TuxTextView) this.LLJL.getValue();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
    }

    public final void LLLLLLIL(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (C255770A0p.LIZ()) {
            LinearLayout linearLayout = (LinearLayout) this.LLJLILLLLZIIL.getValue();
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.LJZL(i4, linearLayout);
            TuxIconView tuxIconView = (TuxIconView) this.LLJLIL.getValue();
            if (z) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i5);
            TuxTextView tuxTextView = (TuxTextView) this.LLJJJJLIIL.getValue();
            if (z) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i6);
            RecyclerView recyclerViewLLLLLLZ = LLLLLLZ();
            if (z) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            C786410Ut5.LLIZLLLIL(recyclerViewLLLLLLZ, i7);
            FrameLayout frameLayout = (FrameLayout) this.LLJJL.getValue();
            if (!z) {
                i8 = 8;
            }
            C786410Ut5.LJZ(i8, frameLayout);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) this.LLJLILLLLZIIL.getValue();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZL(i, linearLayout2);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJLIL.getValue(), 8);
        TuxTextView tuxTextView2 = (TuxTextView) this.LLJJJJLIIL.getValue();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, i2);
        RecyclerView recyclerViewLLLLLLLZIL = LLLLLLLZIL();
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LLIZLLLIL(recyclerViewLLLLLLLZIL, i3);
        FrameLayout frameLayout2 = (FrameLayout) this.LLL.getValue();
        if (!z) {
            i8 = 8;
        }
        C786410Ut5.LJZ(i8, frameLayout2);
    }

    public final void LLLLLLJ(boolean z) {
        int i;
        int i2;
        int i3 = 8;
        if (C255770A0p.LIZ()) {
            ((View) this.LLJLLIL.getValue()).getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            View view = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            LinearLayout linearLayout = (LinearLayout) this.LLJLLIL.getValue();
            if (z) {
                i3 = 0;
            }
            C786410Ut5.LJZL(i3, linearLayout);
            return;
        }
        ((View) this.LLJLLL.getValue()).getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        View view2 = (View) this.LLLFF.getValue();
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        LinearLayout linearLayout2 = (LinearLayout) this.LLJLLL.getValue();
        if (z) {
            i3 = 0;
        }
        C786410Ut5.LJZL(i3, linearLayout2);
    }

    public final void LLLLZIL(int i) {
        if (i < 0) {
            LLLLLJLJLL();
            return;
        }
        if (C255770A0p.LIZ()) {
            C1643670ssH c1643670ssHLLLLLLZZ = LLLLLLZZ();
            if (i < c1643670ssHLLLLLLZZ.getItemCount()) {
                int i2 = c1643670ssHLLLLLLZZ.LLILLL;
                c1643670ssHLLLLLLZZ.LLILLL = i;
                if (i2 != -1) {
                    c1643670ssHLLLLLLZZ.notifyItemChanged(i2, "sel");
                }
                c1643670ssHLLLLLLZZ.notifyItemChanged(i, "sel");
                return;
            }
            c1643670ssHLLLLLLZZ.getClass();
            return;
        }
        C1643640ssE c1643640ssELLLLLLLLL = LLLLLLLLL();
        if (i < c1643640ssELLLLLLLLL.getItemCount()) {
            int i3 = c1643640ssELLLLLLLLL.LLILLL;
            c1643640ssELLLLLLLLL.LLILLL = i;
            if (i3 != -1) {
                c1643640ssELLLLLLLLL.notifyItemChanged(i3, "sel");
            }
            c1643640ssELLLLLLLLL.notifyItemChanged(i, "sel");
        } else {
            c1643640ssELLLLLLLLL.getClass();
        }
        HandlerHook.viewPost(LLLLLLLZIL(), new ARunnableS43S0101000_32(i, this, 5));
    }

    public final void LLLLZLL(boolean z) {
        int i;
        int i2;
        int i3 = 0;
        if (C255770A0p.LIZ()) {
            View view = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            RecyclerView recyclerViewLLLLLLZ = LLLLLLZ();
            if (z) {
                i3 = 8;
            }
            C786410Ut5.LLIZLLLIL(recyclerViewLLLLLLZ, i3);
            if (z) {
                C786410Ut5.LJZL(8, (LinearLayout) this.LLJLLIL.getValue());
                return;
            }
            return;
        }
        View view2 = (View) this.LLLFF.getValue();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        RecyclerView recyclerViewLLLLLLLZIL = LLLLLLLZIL();
        if (z) {
            i3 = 8;
        }
        C786410Ut5.LLIZLLLIL(recyclerViewLLLLLLLZIL, i3);
        if (!z) {
            return;
        }
        C786410Ut5.LJZL(8, (LinearLayout) this.LLJLLL.getValue());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onViewCreated(this.mView, bundle);
        Activity activity = this.mActivity;
        if (activity != null) {
            C0FWN.LIZ(activity).LIZIZ(this.LLLIIIIL);
        }
        C0I7D c0i7dLLLLLLL = LLLLLLL();
        c0i7dLLLLLLL.setImeOptions(6);
        c0i7dLLLLLLL.setRawInputType(1);
        c0i7dLLLLLLL.addTextChangedListener(new C1864790ycv(this, 6));
        c0i7dLLLLLLL.setOnFocusChangeListener(new C12YL(this, 4));
        c0i7dLLLLLLL.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GkS
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        });
        c0i7dLLLLLLL.setOnEditorActionListener(new C12YA(this, 3));
        if (C255770A0p.LIZ()) {
            C786410Ut5.h9((TuxTextView) this.LLJZ.getValue(), new ACListenerS166S0100000_32(this, 84));
        } else {
            C786410Ut5.h9((TuxTextView) this.LLJZIJLIL.getValue(), new ACListenerS166S0100000_32(this, 85));
        }
        C786410Ut5.a9((TuxIconView) this.LLJLIL.getValue(), new ACListenerS166S0100000_32(this, 86));
        if (C255770A0p.LIZ()) {
            LLLLZLL(true);
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                RecyclerView recyclerViewLLLLLLZ = LLLLLLZ();
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(sceneContext, 0);
                flexboxLayoutManager.LJJIFFI(0);
                flexboxLayoutManager.LJJII(1);
                flexboxLayoutManager.LJJIII(0);
                flexboxLayoutManager.LJJI(0);
                recyclerViewLLLLLLZ.setLayoutManager(flexboxLayoutManager);
            }
            LLLLLLZ().setAdapter(LLLLLLZZ());
            LLLLLLZ().setHasFixedSize(false);
        } else {
            LLLLZLL(true);
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 != null) {
                LLLLLLLZIL().setLayoutManager(new LinearLayoutManager(sceneContext2, 0, false));
                LLLLLLLZIL().setAdapter(LLLLLLLLL());
            }
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.18Rx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LIZJ;
            }
        }, new AwS606S0100000_27(this, 423));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yGy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 427));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.18Ry
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LJIIJJI;
            }
        }, new AwS611S0100000_32(this, 303));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.1202
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LJ;
            }
        }, new AwS608S0100000_29(this, 663));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.18Rz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LJI;
            }
        }, new AwS611S0100000_32(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.18Rv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LJII;
            }
        }, new AwS611S0100000_32(this, 301));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.18Rw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LJIIIIZZ;
            }
        }, new AwS611S0100000_32(this, 302));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0yGz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C18S0) obj).LJIIJ;
            }
        }, new AwS606S0100000_27(this, 419));
    }

    public final void LLLLLJIL(int i, final AIGenerationType aIGenerationType, boolean z) {
        View viewFindViewById;
        int iLIZIZ;
        float fLIZIZ;
        int iLIZIZ2;
        final FrameLayout frameLayout;
        View view;
        float f;
        float fLIZIZ2;
        int iLIZIZ3;
        final C817403Hg c817403Hg = new C817403Hg();
        final C817403Hg c817403Hg2 = new C817403Hg();
        final C118300cf c118300cf = new C118300cf();
        final C118300cf c118300cf2 = new C118300cf();
        if (aIGenerationType == AIGenerationType.IMAGE_TO_VIDEO) {
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            c817403Hg.element = f;
            if (z) {
                f2 = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            c817403Hg2.element = f2;
            if (z) {
                fLIZIZ2 = C418440Gaw.LIZIZ(Integer.valueOf(LLLIILIL));
            } else {
                fLIZIZ2 = C418440Gaw.LIZIZ(80);
            }
            c118300cf.element = C814420VxA.LIZIZ(fLIZIZ2);
            if (z) {
                if (LLLLZ()) {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
                } else {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                }
            } else {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIILIL)));
            }
            c118300cf2.element = iLIZIZ3;
        } else if (aIGenerationType == AIGenerationType.AI_TRANSITION) {
            if (z) {
                fLIZIZ = C418440Gaw.LIZIZ(166);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(80);
            }
            c118300cf.element = C814420VxA.LIZIZ(fLIZIZ);
            if (z) {
                if (LLLLZ()) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                }
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166));
            }
            c118300cf2.element = iLIZIZ2;
        } else if (aIGenerationType == AIGenerationType.TEXT_TO_VIDEO) {
            Scene scene = this.mParentScene;
            if (scene != null && (viewFindViewById = scene.findViewById(R.id.apn)) != null) {
                int height = ((((((((viewFindViewById.getHeight() - viewFindViewById.getPaddingTop()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))) - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                this.LLLIIIL = height;
                if (LLLLZ()) {
                    height -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
                }
                if (z) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIIL)));
                } else {
                    iLIZIZ = height;
                }
                c118300cf.element = iLIZIZ;
                if (!z) {
                    height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIIL)));
                }
                c118300cf2.element = height;
            } else {
                return;
            }
        }
        Scene scene2 = this.mParentScene;
        if (scene2 != null && (view = scene2.mView) != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.apk);
        } else {
            frameLayout = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0xvv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout frameLayout2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int iLIZIZ4 = C814420VxA.LIZIZ(c118300cf.element + ((c118300cf2.element - r2) * animatedFraction));
                C0I7D c0i7dLLLLLLL = this.LLLLLLL();
                ViewGroup.LayoutParams layoutParams = c0i7dLLLLLLL.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iLIZIZ4;
                    C786410Ut5.W5(c0i7dLLLLLLL, layoutParams);
                    if (aIGenerationType == AIGenerationType.IMAGE_TO_VIDEO && (frameLayout2 = frameLayout) != null) {
                        float f3 = c817403Hg.element;
                        C786410Ut5.fd(frameLayout2, f3 + ((c817403Hg2.element - f3) * animatedFraction));
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void LLLLLZL(AIPlaygroundChipsModel aIPlaygroundChipsModel, int i, boolean z) {
        if (C255770A0p.LIZ()) {
            LLLLIL().LIZJ.invoke(LLLLLZ());
            if (z) {
                LLLLIL().LIZLLL.invoke(Integer.valueOf(i));
            } else {
                LLLLIL().LIZLLL.invoke(-1);
            }
        } else if (z) {
            LLLLIL().LIZIZ.invoke(C13LP.LLIIII(LLLLLLLLL().LL.LJFF), Integer.valueOf(i), C13BV.INSTANCE);
        } else {
            LLLLIL().LIZIZ.invoke(C13LP.LLIIII(LLLLLLLLL().LL.LJFF), -1, C13BV.INSTANCE);
        }
        C786410Ut5.LLLLZLL((TuxTextView) this.LLLFZ.getValue(), 8);
        this.LLLII = false;
        String str = aIPlaygroundChipsModel.content;
        this.LLLI = true;
        LLLLLLL().setText(str);
        this.LLLI = false;
        if (z) {
            LLLLIL().LJII.invoke("click_choose_pre_prompt");
        } else {
            LLLLIL().LJII.invoke("click_cancel_pre_prompt");
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mx, viewGroup, false);
    }
}
