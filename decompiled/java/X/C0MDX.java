package X;

import Y.ACListenerS143S0100000_8;
import Y.AComparatorS25S0000000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS108S0100000_8;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS16S0000000_8;
import irm.AkS53S0200000_8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0MDX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDX extends AbstractC1664490tPr<C0MDU, C564760MDa> implements InterfaceC1391500mJY {
    public C0MDK LLJLL;
    public boolean LLJLLIL;
    public boolean LLJZ;
    public Integer LLL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 532));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 534));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 529));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 531));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 530));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 527));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 526));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 528));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 533));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(249));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(247));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(248));

    @Override // X.InterfaceC1391500mJY
    public final void LLLL(int i) {
    }

    public final C0I7D LLLLLJIL() {
        return (C0I7D) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C438070HFt LLLLLJLJLL() {
        return (C438070HFt) this.LLJJJJLIIL.getValue();
    }

    public final C451370Hmx LLLLLL() {
        return (C451370Hmx) this.LLJLLL.getValue();
    }

    public final void LLLLLLIL() {
        ((SoftKeyBoardListener) this.LLJLILLLLZIIL.getValue()).LIZ();
        KeyboardUtils.LIZ(requireSceneContext(), LLLLLJIL());
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        Window window;
        Integer num = this.LLL;
        if (num != null) {
            int iIntValue = num.intValue();
            Activity activity = this.mActivity;
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        this.LLJZ = false;
        LLLLLJLJLL().LIZIZ(false);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() throws Throwable {
        Window window;
        Window window2;
        Window window3;
        WindowManager.LayoutParams attributes;
        Activity activity = this.mActivity;
        this.LLL = (activity == null || (window3 = activity.getWindow()) == null || (attributes = window3.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT >= 35) {
            Activity activity2 = this.mActivity;
            if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                window2.setSoftInputMode(48);
            }
        } else {
            Activity activity3 = this.mActivity;
            if (activity3 != null && (window = activity3.getWindow()) != null) {
                window.setSoftInputMode(16);
            }
        }
        LLLLLJIL().requestFocus();
        C0I7D c0i7dLLLLLJIL = LLLLLJIL();
        Editable editableLLLLJI = C2204961BRm.LLLLJI(LLLLLJIL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0HZ4QeWTB9SdOOpmZTFjztWs4BJQP1JU=", null));
        c0i7dLLLLLJIL.setSelection(editableLLLLJI != null ? editableLLLLJI.length() : 0);
        LLLLLJLJLL().LIZIZ(true);
        this.LLJLLIL = false;
        ((Set) this.LLJZIJLIL.getValue()).clear();
        LLLLLLL();
    }

    public final void LLLLLLL() {
        for (C438110HFx c438110HFx : LLLLLJLJLL().getAttachedItemList()) {
            InterfaceC434700H2u interfaceC434700H2u = c438110HFx.LIZ;
            int i = c438110HFx.LIZIZ;
            if (interfaceC434700H2u instanceof PromptModel) {
                PromptModel promptModel = (PromptModel) interfaceC434700H2u;
                if (((Set) this.LLJZIJLIL.getValue()).add(promptModel.prompt)) {
                    C564410MBr.LIZ.getClass();
                    C564410MBr.LJIL(LLLLILI().LIZ.LIZIZ, i + 1, promptModel);
                }
            }
        }
    }

    public final void LLLLLLLLL() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), new C09AL(), null, new C0MDY(this, null), 2);
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        this.LLJZ = true;
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        if (this.LLJZ) {
            this.LLJZ = false;
            LLLLIL().LIZJ.invoke();
            LLLLLJIL().clearFocus();
        }
    }

    public final void LLLLLLLLLL(List<PromptModel> list) {
        boolean z;
        LinearLayout.LayoutParams layoutParams;
        if (LLLLLJLJLL().getHeight() == 0) {
            C438070HFt c438070HFtLLLLLJLJLL = LLLLLJLJLL();
            ViewGroup.LayoutParams layoutParams2 = c438070HFtLLLLLJLJLL.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.height = -2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c438070HFtLLLLLJLJLL);
                c438070HFtLLLLLJLJLL.setLayoutParams(layoutParams);
                C786410Ut5.LJLLLLLL(0, c438070HFtLLLLLJLJLL);
                c438070HFtLLLLLJLJLL.animate().alpha(1.0f).setDuration(300L).setInterpolator(C1619980sG4.LIZLLL()).start();
                c438070HFtLLLLLJLJLL.requestLayout();
            }
        }
        if (((Boolean) this.LLLF.getValue()).booleanValue()) {
            PromptRequestState promptRequestState = LLLLILI().LIZ.LJ;
            PromptRequestState promptRequestState2 = LLLLILI().LIZ.LJFF;
            if (LLLLLJLJLL().getPrompts().isEmpty()) {
                PromptRequestStateType promptRequestStateType = promptRequestState.state;
                PromptRequestStateType promptRequestStateType2 = PromptRequestStateType.SUCCESS;
                if (promptRequestStateType == promptRequestStateType2 && promptRequestState2.state != promptRequestStateType2) {
                    LLLLLJLJLL().LIZJ(1);
                }
                LLLLLL().LIZLLL(list);
                LLLLLJLJLL().setPrompts(LLLLLL().LIZJ());
                LLLLLLJ(LLLLLJIL(), LLLLLL().LIZIZ().prompt);
            } else {
                if ((LLLLLJLJLL().getListLayoutManager() instanceof StaggeredGridLayoutManager) && LLLLLJLJLL().getSpanCount() == 1) {
                    z = true;
                    LLLLLJLJLL().LIZJ(2);
                } else {
                    z = false;
                }
                C451370Hmx c451370HmxLLLLLL = LLLLLL();
                int spanCount = LLLLLJLJLL().getSpanCount();
                int iMin = Math.min(c451370HmxLLLLLL.LIZ().size(), c451370HmxLLLLLL.LIZ / spanCount);
                ArrayList arrayList = new ArrayList(c451370HmxLLLLLL.LIZLLL);
                int i = c451370HmxLLLLLL.LIZIZ;
                for (PromptModel promptModel : C13LP.LJLLLL(new AComparatorS25S0000000_6(4), list)) {
                    Iterator<PromptModel> it2 = c451370HmxLLLLLL.LIZLLL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().prompt, promptModel.prompt)) {
                                break;
                            }
                        } else {
                            arrayList.add(promptModel);
                            break;
                        }
                    }
                }
                c451370HmxLLLLLL.LIZLLL(arrayList);
                c451370HmxLLLLLL.LIZIZ = i;
                if (z) {
                    ArrayList<List<PromptModel>> arrayList2 = c451370HmxLLLLLL.LIZJ;
                    ArrayList arrayList3 = new ArrayList(c451370HmxLLLLLL.LIZ());
                    if (!arrayList3.isEmpty()) {
                        for (int i2 = iMin - 1; -1 < i2; i2--) {
                            int i3 = spanCount * i2;
                            if (i3 < c451370HmxLLLLLL.LIZ().size() && i2 != i3) {
                                C1463700oC0.LIZJ(i2, i3, arrayList3);
                            }
                        }
                    }
                    ListProtector.set(arrayList2, i, arrayList3);
                }
                LLLLLJLJLL().setPrompts(LLLLLL().LIZ());
                if (z) {
                    C438070HFt c438070HFtLLLLLJLJLL2 = LLLLLJLJLL();
                    if (c438070HFtLLLLLJLJLL2.LLJILJIL >= 0) {
                        c438070HFtLLLLLJLJLL2.getPromptListView().scrollToPosition(0);
                        HandlerHook.viewPost(c438070HFtLLLLLJLJLL2.getPromptListView(), new ARunnableS106S0100000_6((Object) c438070HFtLLLLLJLJLL2, 180));
                    }
                }
            }
        } else {
            LLLLLL().LIZLLL(list);
            LLLLLJLJLL().setPrompts(LLLLLL().LIZJ());
            LLLLLLJ(LLLLLJIL(), LLLLLL().LIZIZ().prompt);
        }
        C438070HFt c438070HFtLLLLLJLJLL3 = LLLLLJLJLL();
        if (!c438070HFtLLLLLJLJLL3.getPrompts().isEmpty()) {
            int measuredHeight = c438070HFtLLLLLJLJLL3.getPromptListView().getMeasuredHeight();
            c438070HFtLLLLLJLJLL3.getPromptListView().measure(0, 0);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(measuredHeight, c438070HFtLLLLLJLJLL3.getPromptListView().getMeasuredHeight());
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(c438070HFtLLLLLJLJLL3, 76));
            valueAnimatorOfInt.start();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJLL = new C0MDK(LLLLILI().LIZ.LIZJ);
        C1664590tQ1.LIZLLL(this, "AILivePhotoScene", false, AFwS239S0000000_8.get$arr$(175), 2);
        C1664600tQ2.LIZ(this, "AILivePhotoScene", new AwS587S0100000_8(this, 347));
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.y08) {
            this.LLJZ = false;
            LLLLIL().LIZJ.invoke();
        } else {
            if (id != R.id.isy) {
                return;
            }
            LLLLIL().LIZIZ.invoke();
        }
    }

    public final void LLLLLLJ(C0I7D c0i7d, String str) {
        if (str.length() > 0) {
            c0i7d.setHint(getString(2131820674, str));
        } else {
            c0i7d.setHint("");
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            q0.LJJII((View) this.LLJJJIL.getValue(), new C14JJ() { // from class: X.0MEx
                {
                    super(0);
                }

                @Override // X.C14JJ
                public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                    int i;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<C14JM> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if ((it2.next().LIZ() & 8) != 0) {
                                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(8);
                                C20244914Jj c20244914JjLIZ2 = c20246014Ju.LIZ(7);
                                if (c20246014Ju.LJIIIIZZ(8)) {
                                    i = c20244914JjLIZ.LIZLLL - c20244914JjLIZ2.LIZLLL;
                                } else {
                                    i = 0;
                                }
                                ((View) this.LLILLL.LLJJJIL.getValue()).setPadding(c20244914JjLIZ2.LIZ, c20244914JjLIZ2.LIZIZ, c20244914JjLIZ2.LIZJ, Math.max(i, 0));
                                return c20246014Ju;
                            }
                        }
                    }
                    return c20246014Ju;
                }
            });
            final C013C c013c = new C013C();
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0MDZ
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(8);
                    if (c013c.element) {
                        if (!zLJIIIIZZ) {
                            this.LJZI(c20244914JjLIZ.LIZLLL);
                        }
                    } else if (zLJIIIIZZ) {
                        this.LLJZ = true;
                    }
                    c013c.element = zLJIIIIZZ;
                    if (!c20246014Ju.LJIIIIZZ(8)) {
                        C20244914Jj c20244914JjLIZ2 = c20246014Ju.LIZ(7);
                        ((View) this.LLJJJIL.getValue()).setPadding(c20244914JjLIZ2.LIZ, c20244914JjLIZ2.LIZIZ, c20244914JjLIZ2.LIZJ, c20244914JjLIZ2.LIZLLL);
                    }
                    return c20246014Ju;
                }
            });
        }
        C786410Ut5.I7(new AkS16S0000000_8(2), (View) this.LLJJJIL.getValue());
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJJJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS409S0200000_8(this, tuxNavBar, 77));
        int iIntValue2 = 0;
        c0om1.LJ(c1251150ifB);
        if (!LLLLILI().LIZ.LJII) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131820675);
            c0om1.LIZJ = c1250250idj;
        }
        tuxNavBar.setNavActions(c0om1);
        LLLLLJLJLL().LIZ(getLifecycle());
        View view2 = (View) this.LLJJL.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        view2.setBackground(c384050F3z.LIZ(view2.getContext()));
        TuxIconView tuxIconView = (TuxIconView) this.LLJLIL.getValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(16));
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        int[] iArr = new int[2];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cc, tuxIconView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ce, tuxIconView.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        iArr[1] = iIntValue2;
        gradientDrawable.setColors(iArr);
        tuxIconView.setBackground(gradientDrawable);
        C786410Ut5.I7(new AkS53S0200000_8(this, tuxIconView, 12), tuxIconView);
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJL.getValue();
        C786410Ut5.a9(tuxIconView2, new ACListenerS143S0100000_8(this, 96));
        C786410Ut5.LLLLLLZZ(tuxIconView2, 4);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_x_mark_circle_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        tuxIconView2.setTuxIcon(c419910GdJ);
        C0I7D c0i7dLLLLLJIL = LLLLLJIL();
        c0i7dLLLLLJIL.addTextChangedListener(new C581030Mqb(this, 2));
        c0i7dLLLLLJIL.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0MDd
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return i == 6;
            }
        });
        C1322090kVb c1322090kVb = (C1322090kVb) this.LLJJJJJIL.getValue();
        C0ID9 c0id9 = new C0ID9(10);
        c1322090kVb.setAspectRatio(0.5625f);
        c1322090kVb.setOutlineProvider(c0id9);
        c1322090kVb.setClipToOutline(true);
        HandlerHook.viewPost((View) this.LLJJL.getValue(), new ARunnableS108S0100000_8(this, 76));
        ((SoftKeyBoardListener) this.LLJLILLLLZIIL.getValue()).LIZJ();
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MDc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0MDU) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 376));
        if (((Boolean) this.LLLF.getValue()).booleanValue()) {
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MDN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0MDU) obj).LJ;
                }
            }, Lifecycle.State.RESUMED, new AwS587S0100000_8(this, 400));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MDV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0MDU) obj).LJFF;
            }
        }, Lifecycle.State.RESUMED, new AwS587S0100000_8(this, 329));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MDQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0MDU) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 335));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0MDb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0MDU) obj).LJI;
            }
        }, new AwS587S0100000_8(this, 367));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0MDR(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0MDS(this, null), 3);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(C545820Lau.LIZIZ(this), R.style.y0)), R.layout.emk, viewGroup, false);
    }
}
