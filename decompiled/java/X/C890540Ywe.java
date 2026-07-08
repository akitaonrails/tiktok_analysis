package X;

import Y.AAListenerS325S0100000_14;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS258S0300000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ywe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890540Ywe extends AbstractC1903430zdF<C890590Ywj> implements C0Z37<C890590Ywj>, InterfaceC892580Yzw, InterfaceC1508640pMU {
    public List<C890020Yvo> LLJ;
    public ViewTreeObserver LLJI;
    public boolean LLJIJIL;
    public final ViewTreeObserverOnScrollChangedListenerC890530Ywd LLJILJIL;
    public final ViewTreeObserverOnDrawListenerC890520Ywc LLJILJILJ;
    public final HorizontalScrollView LLJILLL;
    public final C422140Ggu LLJJ;
    public final C428710GrV LLJJI;
    public final C367030EaD LLJJIII;
    public C890590Ywj LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public AnimatorSet LLJJJ;
    public AnimatorSet LLJJJIL;
    public TuxSingleSelectionSheet LLJJJJ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "InboxFilterBarVH";
    }

    public final void T5() {
        int width = this.LLJJ.getWidth() - this.LLJILLL.getWidth();
        if (width < 0) {
            C367030EaD c367030EaD = this.LLJJIII;
            int visibility = c367030EaD.getVisibility();
            c367030EaD.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c367030EaD);
            return;
        }
        if (C426750GoL.LJ(this.LLJILLL)) {
            width = 0;
        }
        C786410Ut5.LJLLLLLL(this.LLJILLL.getScrollX() != width ? 0 : 8, this.LLJJIII);
    }

    public final boolean U5() {
        C885880Yp8 c885880Yp8T6;
        List<C890610Ywl> list;
        InboxAbilityCenter$IMessageInboxWidgetAbility inboxAbilityCenter$IMessageInboxWidgetAbility = (InboxAbilityCenter$IMessageInboxWidgetAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), InboxAbilityCenter$IMessageInboxWidgetAbility.class, null);
        return inboxAbilityCenter$IMessageInboxWidgetAbility == null || (c885880Yp8T6 = inboxAbilityCenter$IMessageInboxWidgetAbility.t6()) == null || (list = c885880Yp8T6.LIZ) == null || list.isEmpty();
    }

    public final boolean V5() {
        return C889930Yvf.LIZ.LJIIL() && this.LLJJIJIL && !U5();
    }

    public final boolean W5() {
        if (this.LLJJIJIL) {
            return (C889930Yvf.LIZ.LJIIL() && U5()) ? false : true;
        }
        return false;
    }

    @Override // X.AbstractC1903430zdF
    public final void reportShowEvent() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = false;
        int i = 0;
        int i2 = 0;
        for (C890020Yvo c890020Yvo : this.LLJ) {
            int i3 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C890020Yvo c890020Yvo2 = c890020Yvo;
            float fLIZ = C0Z8D.LIZ(c890020Yvo2);
            if (fLIZ > 0.0f) {
                z = true;
            }
            if (fLIZ >= 1.0f) {
                i2++;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(c890020Yvo2.getTab$awemenotice_release().LIZ.getMobValue());
            sbLIZ.append("\":\"");
            sbLIZ.append((int) (fLIZ * 100));
            sbLIZ.append('\"');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            if (i < this.LLJ.size() - 1) {
                sb.append(",");
            }
            i = i3;
        }
        sb.append("}");
        if (z) {
            C890550Ywf c890550Ywf = new C890550Ywf();
            c890550Ywf.LJII = this.LLJ.size();
            c890550Ywf.LJI = i2;
            c890550Ywf.LJIIIIZZ = sb.toString();
            c890550Ywf.LJII();
        }
    }

    @Override // X.AbstractC1903430zdF, X.C0Z32
    public final void onAttach() {
        super.onAttach();
        if (this.LLJIJIL) {
            return;
        }
        if (C1591220rVg.LIZLLL()) {
            this.LLJI = this.LLJILLL.getViewTreeObserver();
            ViewTreeObserver viewTreeObserver = this.LLJI;
            if (viewTreeObserver != null) {
                ViewTreeObserverOnScrollChangedListenerC890530Ywd viewTreeObserverOnScrollChangedListenerC890530Ywd = this.LLJILJIL;
                viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC890530Ywd);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC890530Ywd, ViewTreeObserver.OnScrollChangedListener.class);
            }
            ViewTreeObserver viewTreeObserver2 = this.LLJI;
            if (viewTreeObserver2 != null) {
                ViewTreeObserverOnDrawListenerC890520Ywc viewTreeObserverOnDrawListenerC890520Ywc = this.LLJILJILJ;
                viewTreeObserver2.addOnDrawListener(viewTreeObserverOnDrawListenerC890520Ywc);
                C2187701Ajg.LIZ(viewTreeObserver2, viewTreeObserverOnDrawListenerC890520Ywc, ViewTreeObserver.OnDrawListener.class);
            }
        } else {
            C786410Ut5.z3(this.LLJILLL.getViewTreeObserver(), new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0Ywg
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    this.LL.T5();
                }
            });
            C786410Ut5.w3(this.LLJILLL.getViewTreeObserver(), new ViewTreeObserver.OnDrawListener() { // from class: X.0Ywh
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    this.LL.T5();
                }
            });
        }
        this.LLJIJIL = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Ywd] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Ywc] */
    public C890540Ywe(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.LLJ = C13BV.INSTANCE;
        this.LLJILJIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0Ywd
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.LL.T5();
            }
        };
        this.LLJILJILJ = new ViewTreeObserver.OnDrawListener() { // from class: X.0Ywc
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                this.LL.T5();
            }
        };
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(constraintLayout.getContext());
        horizontalScrollView.setId(View.generateViewId());
        C786410Ut5.b6(horizontalScrollView, new C19ME(0, -1));
        C1383370m6R.LIZIZ(horizontalScrollView, AFwS248S0000000_14.get$arr$(419));
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setBackgroundColor(0);
        horizontalScrollView.setOverScrollMode(2);
        this.LLJILLL = horizontalScrollView;
        C422140Ggu c422140Ggu = new C422140Ggu(constraintLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c422140Ggu);
        c422140Ggu.setLayoutParams(layoutParams);
        c422140Ggu.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0, 0);
        horizontalScrollView.addView(c422140Ggu);
        this.LLJJ = c422140Ggu;
        C428710GrV c428710GrV = new C428710GrV(constraintLayout.getContext());
        C1618770sE7.LJI(c428710GrV, new AwS558S0100000_14(this, 1407));
        this.LLJJI = c428710GrV;
        C367030EaD c367030EaD = new C367030EaD(constraintLayout.getContext(), null, 6);
        c367030EaD.setId(ViewGroup.generateViewId());
        C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c367030EaD);
        c367030EaD.setLayoutParams(c19me);
        this.LLJJIII = c367030EaD;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1406));
        C786410Ut5.m6(constraintLayout, new C19ME(-1, -2));
        constraintLayout.setPaddingRelative(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        constraintLayout.addView(horizontalScrollView);
        constraintLayout.addView(c367030EaD);
        constraintLayout.addView(c428710GrV);
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(horizontalScrollView.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(horizontalScrollView.getId(), 4, 0, 4);
        c19mb.LJIIIIZZ(horizontalScrollView.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(horizontalScrollView.getId(), 7, c428710GrV.getId(), 6);
        c19mb.LJIIIIZZ(c367030EaD.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(c367030EaD.getId(), 4, 0, 4);
        c19mb.LJIIIIZZ(c367030EaD.getId(), 7, 0, 7);
        c19mb.LJIIIIZZ(c428710GrV.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(c428710GrV.getId(), 4, 0, 4);
        c19mb.LJIIIIZZ(c428710GrV.getId(), 7, 0, 7);
        c19mb.LIZIZ(constraintLayout);
    }

    @Override // X.InterfaceC892580Yzw
    public final void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        boolean z;
        FilterTabType filterTabType;
        FilterTabType filterTabType2;
        FilterTabType filterTabType3;
        if (interfaceC887660Ys0 != null && interfaceC887660Ys0.isInMultiSelectMode()) {
            z = true;
        } else {
            z = false;
        }
        float f = 1.0f;
        if (z) {
            this.LLJJIJIL = true;
            AnimatorSet animatorSet = this.LLJJJIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LLJJJIL = null;
            if (this.LLJJJ == null) {
                if (interfaceC887660Ys0.isSwitchingMode()) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    for (C890020Yvo c890020Yvo : this.LLJ) {
                        FilterTabType filterTabType4 = c890020Yvo.getTab$awemenotice_release().LIZ;
                        C890590Ywj c890590Ywj = this.LLJJIJI;
                        if (c890590Ywj != null) {
                            filterTabType3 = c890590Ywj.LLILZIL;
                        } else {
                            filterTabType3 = null;
                        }
                        if (filterTabType4 != filterTabType3 && W5()) {
                            animatorSet2.playTogether(C0H61.GRADIENT.createAnimator$awemenotice_api_release(c890020Yvo, true, null));
                        }
                    }
                    if (V5()) {
                        animatorSet2.playTogether(C0H61.GRADIENT.createAnimator$awemenotice_api_release(this.LLJJI, true, null));
                    }
                    animatorSet2.addListener(new AAListenerS325S0100000_14(this, 3));
                    this.LLJJJ = animatorSet2;
                    animatorSet2.start();
                    return;
                }
                for (C890020Yvo c890020Yvo2 : this.LLJ) {
                    FilterTabType filterTabType5 = c890020Yvo2.getTab$awemenotice_release().LIZ;
                    C890590Ywj c890590Ywj2 = this.LLJJIJI;
                    if (c890590Ywj2 != null) {
                        filterTabType2 = c890590Ywj2.LLILZIL;
                    } else {
                        filterTabType2 = null;
                    }
                    if (filterTabType5 != filterTabType2 && W5()) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c890020Yvo2);
                        c890020Yvo2.setAlpha(0.5f);
                    }
                }
                C428710GrV c428710GrV = this.LLJJI;
                if (V5()) {
                    f = 0.5f;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428710GrV);
                c428710GrV.setAlpha(f);
                return;
            }
            return;
        }
        this.LLJJIJIL = false;
        AnimatorSet animatorSet3 = this.LLJJJ;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.LLJJJ = null;
        if (this.LLJJJIL == null) {
            if (interfaceC887660Ys0 != null && interfaceC887660Ys0.isSwitchingMode()) {
                AnimatorSet animatorSet4 = new AnimatorSet();
                for (C890020Yvo c890020Yvo3 : this.LLJ) {
                    FilterTabType filterTabType6 = c890020Yvo3.getTab$awemenotice_release().LIZ;
                    C890590Ywj c890590Ywj3 = this.LLJJIJI;
                    if (c890590Ywj3 != null) {
                        filterTabType = c890590Ywj3.LLILZIL;
                    } else {
                        filterTabType = null;
                    }
                    if (filterTabType6 != filterTabType) {
                        animatorSet4.playTogether(C0H61.GRADIENT.createAnimator$awemenotice_api_release(c890020Yvo3, false, null));
                    }
                }
                animatorSet4.playTogether(C0H61.GRADIENT.createAnimator$awemenotice_api_release(this.LLJJI, false, null));
                animatorSet4.addListener(new AAListenerS325S0100000_14(this, 4));
                this.LLJJJIL = animatorSet4;
                animatorSet4.start();
                return;
            }
            for (C890020Yvo c890020Yvo4 : this.LLJ) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c890020Yvo4);
                c890020Yvo4.setAlpha(1.0f);
            }
            C428710GrV c428710GrV2 = this.LLJJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c428710GrV2);
            c428710GrV2.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [X.0Yvp] */
    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        C889910Yvd next;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C890590Ywj c890590Ywj = (C890590Ywj) abstractC895380ZAq;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindData, data: ");
        sbLIZ.append(c890590Ywj);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJIJI = c890590Ywj;
        List<C890020Yvo> list = this.LLJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C890020Yvo> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getTab$awemenotice_release().LIZ);
        }
        List<C889910Yvd> list2 = c890590Ywj.LLILLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C889910Yvd> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().LIZ);
        }
        boolean zLJFF = Intrinsics.LJFF(arrayList, arrayList2);
        C889910Yvd c889910Yvd = null;
        int i2 = 8;
        if (!zLJFF) {
            List<C889910Yvd> list3 = c890590Ywj.LLILLL;
            C422140Ggu c422140Ggu = this.LLJJ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c422140Ggu, null);
            c422140Ggu.removeAllViews();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (C889910Yvd c889910Yvd2 : list3) {
                C890020Yvo c890020Yvo = new C890020Yvo(this.itemView.getContext(), c889910Yvd2);
                C1618770sE7.LJI(c890020Yvo, new AwS258S0300000_14(this, c890020Yvo, c889910Yvd2, 15));
                arrayList3.add(c890020Yvo);
            }
            int i3 = 0;
            for (Object obj : arrayList3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    final C890020Yvo c890020Yvo2 = (C890020Yvo) obj;
                    if (i3 < arrayList3.size() - 1) {
                        ViewGroup.LayoutParams layoutParams = c890020Yvo2.getLayoutParams();
                        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        }
                    }
                    this.LLJJ.addView(c890020Yvo2);
                    c890020Yvo2.getClass();
                    c890020Yvo2.LLILZIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0Yvp
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            if (C0Z8D.LIZ(c890020Yvo2) >= c890020Yvo2.getExposureRatioThreshold()) {
                                C890020Yvo c890020Yvo3 = c890020Yvo2;
                                if (c890020Yvo3.LLILZIL == null) {
                                    return;
                                }
                                C786410Ut5.E3(c890020Yvo3.getViewTreeObserver(), c890020Yvo2.LLILZIL);
                                c890020Yvo2.LLILZIL = null;
                                IMChatListApi.LJJIII.getClass();
                                C890330YwJ.LIZ().LIZIZ().LJIIJ("notification_page", c890020Yvo2.getTab$awemenotice_release().LIZ.getMobValue());
                                if (c890020Yvo2.getTab$awemenotice_release().LIZ == FilterTabType.REQUEST) {
                                    C890330YwJ.LIZ().LJII();
                                }
                            }
                        }
                    };
                    C786410Ut5.z3(c890020Yvo2.getViewTreeObserver(), c890020Yvo2.LLILZIL);
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("build new tab btns, newEnableTabs: ");
            sbLIZ2.append(list3);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (this.LLJJ.getWidth() > this.LLJILLL.getWidth()) {
                C367030EaD c367030EaD = this.LLJJIII;
                int visibility = c367030EaD.getVisibility();
                c367030EaD.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c367030EaD);
            }
            this.LLJ = arrayList3;
        } else {
            for (C890020Yvo c890020Yvo3 : this.LLJ) {
                Iterator<C889910Yvd> it4 = c890590Ywj.LLILLL.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (next.LIZ == c890020Yvo3.getTab$awemenotice_release().LIZ) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C889910Yvd tab$awemenotice_release = next;
                if (tab$awemenotice_release == null) {
                    tab$awemenotice_release = c890020Yvo3.getTab$awemenotice_release();
                }
                c890020Yvo3.setTab$awemenotice_release(tab$awemenotice_release);
            }
        }
        for (C890020Yvo c890020Yvo4 : this.LLJ) {
            if (c890020Yvo4.getTab$awemenotice_release().LIZ == c890590Ywj.LLILZIL) {
                z = true;
            } else {
                z = false;
            }
            c890020Yvo4.LL = c890020Yvo4.getTab$awemenotice_release();
            c890020Yvo4.LIZ(z);
            if (z && c890590Ywj.LLIZ && C0Z8D.LIZ(c890020Yvo4) < 1.0f) {
                this.LLJILLL.scrollTo(c890020Yvo4.getLeft() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
            }
        }
        this.LLJJI.LIZ(c890590Ywj.LLILZLL);
        C428710GrV c428710GrV = this.LLJJI;
        if (c890590Ywj.LLIZLLLIL) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, c428710GrV);
        InboxFilterBarViewModel inboxFilterBarViewModel = (InboxFilterBarViewModel) this.LLJJIJIIJIL.getValue();
        if (inboxFilterBarViewModel != null) {
            Iterator<C889910Yvd> it5 = c890590Ywj.LLILLL.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                C889910Yvd next2 = it5.next();
                if (next2.LIZ == c890590Ywj.LLILZIL) {
                    c889910Yvd = next2;
                    break;
                }
            }
            InboxFilterBarViewModel.yQ2(inboxFilterBarViewModel, c889910Yvd, null, null, null, 14);
        }
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }
}
