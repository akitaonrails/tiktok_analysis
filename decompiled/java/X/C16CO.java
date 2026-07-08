package X;

import Y.ACListenerS165S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaState;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS610S0100000_31;
import wh6.AbS710S0100000_31;

/* JADX INFO: renamed from: X.16CO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16CO extends C19A3 implements InterfaceC20735516Cb, InterfaceC724530SbT {
    public boolean LLJILLL = true;
    public boolean LLJJ = true;
    public ViewPager LLJJI;
    public C16CP LLJJIII;
    public C20749216Hi LLJJIJI;
    public ChooseMediaViewModel LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public TextView LLJJJJ;
    public View LLJJJJJIL;
    public TextView LLJJJJLIIL;
    public int LLJJL;
    public C16CR LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public View LLJLIL;
    public C1322110kVd LLJLILLLLZIIL;
    public FrameLayout LLJLL;

    @Override // X.InterfaceC20735516Cb
    public final void LJII() {
        this.LLJILLL = false;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC20735516Cb
    public final View LIZJ() {
        List<TikTokMediaModel> list;
        C16CP c16cp = this.LLJJIII;
        if (c16cp != null && (list = c16cp.LLILZLL) != null) {
            ViewPager viewPager = this.LLJJI;
            C13LP.LJJJLZIJ(viewPager != null ? viewPager.getCurrentItem() : -1, list);
        }
        C16CR c16cr = this.LLJJLIIIJLLLLLLLZ;
        if (c16cr != null) {
            return c16cr.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC20735516Cb
    public final void onExit() {
        C19A3 c19a3;
        Scene scene = this.mParentScene;
        if (!(scene instanceof NavigationScene)) {
            if (!(scene instanceof C19A3) || (c19a3 = (C19A3) scene) == null) {
                return;
            }
            c19a3.remove(this);
            return;
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            C560320LyI c560320LyI = new C560320LyI();
            c560320LyI.LIZ = new C214798194i();
            navigationSceneLIZ.LLLLLLIL(c560320LyI.LIZ());
        }
    }

    @Override // X.InterfaceC20735516Cb
    public final boolean LJJI() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC20735516Cb
    public final void LJIIIZ(float f) {
        int iMax = Math.max(0, (int) (255 * f));
        ViewPager viewPager = this.LLJJI;
        if (viewPager != null) {
            viewPager.setBackgroundColor(Color.argb(iMax, 0, 0, 0));
        }
        if (f == 1.0f) {
            if (this.LLJJ) {
                this.LLJJ = false;
            }
            View view = this.LLJJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = this.LLJJJ;
            if (view2 != null) {
                view2.requestLayout();
                return;
            }
            return;
        }
        View view3 = this.LLJJJ;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, view3);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Context context;
        TextView textView;
        Context context2;
        Integer numLIZJ;
        Activity activity;
        Window window;
        int iIntValue;
        super.onActivityCreated(bundle);
        Activity activityRequireActivity = requireActivity();
        C1654320t9S.LIZIZ(this, AFwS283S0000000_35.get$arr$(133));
        C1664590tQ1.LIZLLL(this, "PreviewRootScene", false, new AwS587S0100000_8(activityRequireActivity, 603), 2);
        C1664600tQ2.LIZ(this, "PreviewRootScene", AFwS276S0000000_31.get$arr$(273));
        this.LLJJIII = new C16CP(this, this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.LLJJI = viewPager;
        if (viewPager != null) {
            viewPager.setAdapter(this.LLJJIII);
        }
        this.LLJJIJIIJIL = (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
        int iIntValue2 = -16777216;
        if (getSceneContext() != null && (activity = this.mActivity) != null && (window = activity.getWindow()) != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e1, requireSceneContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -16777216;
            }
            window.setNavigationBarColor(iIntValue);
        }
        this.LLJJJ = findViewById(R.id.rq4);
        this.LLJJJIL = findViewById(R.id.ccw);
        this.LLJJIJIL = (TextView) findViewById(R.id.vcj);
        this.LLJJJJ = (TextView) findViewById(R.id.keq);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.p5u);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS165S0100000_31(this, 152));
        }
        View viewFindViewById = findViewById(R.id.ul1);
        this.LLJJJJJIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS710S0100000_31(this, 13), viewFindViewById);
        }
        this.LLJJJJLIIL = (TextView) findViewById(R.id.p8l);
        this.LLJL = (LinearLayout) this.mView.findViewById(R.id.video_cover_layout);
        this.LLJLIL = this.mView.findViewById(R.id.rp6);
        C1322110kVd c1322110kVd = (C1322110kVd) this.mView.findViewById(R.id.video_cover);
        this.LLJLILLLLZIIL = c1322110kVd;
        if (c1322110kVd != null) {
            c1322110kVd.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.LLJLL = (FrameLayout) this.mView.findViewById(R.id.fkz);
        LinearLayout linearLayout = this.LLJL;
        if (linearLayout != null) {
            Context context3 = linearLayout.getContext();
            if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e3, context3)) != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            linearLayout.setBackgroundColor(iIntValue2);
        }
        View view = this.LLJLIL;
        if (view != null && (context2 = view.getContext()) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJFF = Integer.valueOf(R.attr.a04);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            Drawable drawableLIZ = c384050F3z.LIZ(context2);
            View view2 = this.LLJLIL;
            if (view2 != null) {
                view2.setBackground(drawableLIZ);
            }
        }
        this.mView.findViewById(R.id.fkx);
        TextView textView2 = this.LLJJJJLIIL;
        if (textView2 != null && (context = textView2.getContext()) != null && (textView = this.LLJJJJLIIL) != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            textView.setBackground(c384050F3z2.LIZ(context));
        }
        TextView textView3 = this.LLJJJJLIIL;
        if (textView3 != null) {
            C786410Ut5.T7(textView3, new ACListenerS165S0100000_31(this, 153));
        }
        C20749216Hi c20749216Hi = new C20749216Hi(this, 1);
        this.LLJJIJI = c20749216Hi;
        ViewPager viewPager2 = this.LLJJI;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(c20749216Hi);
        }
        ChooseMediaViewModel chooseMediaViewModel = this.LLJJIJIIJIL;
        if (chooseMediaViewModel != null) {
            BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.16CQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getMediaListState();
                }
            }, new AwS610S0100000_31(this, 376));
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LLJJIJIIJIL;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.jR2(this, new C2217381BqS() { // from class: X.16C8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getSelectPhotoMedia();
                }
            }, new C1765020w20(), new AwS610S0100000_31(this, 377));
        }
        C1447800nmM.LIZIZ(this).LLLIILIL(this, new C20750216Hs(this, 1));
    }

    public final void LLLLIIIILLL(List<TikTokMediaModel> list, Function1<? super Boolean, Unit> function1) {
        int currentItem;
        ViewPager viewPager = this.LLJJI;
        if (viewPager != null) {
            currentItem = viewPager.getCurrentItem();
        } else {
            currentItem = -1;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(currentItem, list);
        if (tikTokMediaModel == null) {
            return;
        }
        C16CR c16cr = this.LLJJLIIIJLLLLLLLZ;
        if (c16cr != null && c16cr.LJFF()) {
            TextView textView = this.LLJJJJLIIL;
            if (textView != null) {
                C786410Ut5.S4(1.0f, textView);
            }
        } else {
            TextView textView2 = this.LLJJJJLIIL;
            if (textView2 != null) {
                C786410Ut5.S4(0.5f, textView2);
            }
        }
        C531320Ksc.LIZ(tikTokMediaModel.LJFF(), true, new AwS240S0300000_31(this, (C16CO) tikTokMediaModel, (TikTokMediaModel) function1, (Function1<? super Boolean, Unit>) 34));
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.avb, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
