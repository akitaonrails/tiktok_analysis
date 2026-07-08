package X;

import Y.ACListenerS165S0100000_31;
import Y.AUListenerS2S0101001_6;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.IEcPermissionAbility;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.EcPermissionVM;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20734616Bs extends C19A3 implements InterfaceC523020KfE, InterfaceC724530SbT {
    public ViewPagerBottomSheetBehavior<View> LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public TextView LLJJIJI;
    public ImageView LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public C16C4 LLJJJIL;
    public C20639615pa LLJJJJ;
    public List<TikTokMediaModel> LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public ChooseMediaViewModel LLJLIL;
    public boolean LLJLL;
    public LinearLayout LLJLLIL;
    public C197039127h LLJLLL;
    public TuxIconView LLJZ;
    public EcPermissionVM LLJZIJLIL;
    public IEcPermissionAbility LLL;
    public LinearLayout LLLF;
    public C1322110kVd LLLFF;
    public FrameLayout LLLFFI;
    public TuxIconView LLLFZ;
    public TuxTextView LLLI;
    public final ArrayList<C16CI> LLJILLL = new ArrayList<>();
    public final int LLJJJJJIL = 1;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1360));

    public final void fullRefreshMediaSelectorData() {
        Context sceneContext;
        C16CD c16cd;
        this.LLJJJJLIIL = null;
        ChooseMediaViewModel chooseMediaViewModel = this.LLJLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.setState(AFwS276S0000000_31.get$arr$(303));
        }
        C16C4 c16c4 = this.LLJJJIL;
        if (c16c4 != null && (c16cd = c16c4.LLJJ) != null) {
            Iterator<TikTokMediaModel> it2 = c16cd.LLILLL.iterator();
            while (it2.hasNext()) {
                it2.next().selectIndex = -1;
            }
            Iterator it3 = ((ArrayList) c16cd.LLJ).iterator();
            while (it3.hasNext()) {
                ((TikTokMediaModel) it3.next()).selectIndex = -1;
            }
            c16cd.LLILLL.clear();
            c16cd.LLLIL();
        }
        C20639615pa c20639615pa = this.LLJJJJ;
        if (c20639615pa == null || (sceneContext = c20639615pa.getSceneContext()) == null) {
            return;
        }
        C948503nH.LJ(c20639615pa, C0PEM.LIZJ, new C2401509b3(c20639615pa, sceneContext, null));
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

    public final void LLLLIL() {
        ArrayList<? extends Parcelable> arrayList;
        if (C756302xN.LIZ(this.LLJJJJLIIL)) {
            List<TikTokMediaModel> list = this.LLJJJJLIIL;
            if (list == null || (arrayList = C09HN.LIZ(list)) == null) {
                arrayList = new ArrayList<>();
            }
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("choose_photo", arrayList);
            Activity activity = this.mActivity;
            if (activity != null) {
                C2204961BRm.LJIIL(this.LLJL, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LAdj/Y/yaYwNkLtwNy3CDW60pYi7OM/eDfcpSZPnI1uFg==", null));
            }
            if (this.mActivity != null) {
                requireActivity().finish();
            }
            Activity activity2 = this.mActivity;
            if (activity2 != null) {
                C786410Ut5.ae(0, activity2, R.anim.l0);
            }
        }
    }

    public final void LLLLILI() {
        C1766710w4j c1766710w4j = C1766710w4j.LIZ;
        Context sceneContext = getSceneContext();
        c1766710w4j.getClass();
        if (!C1766710w4j.LIZIZ(sceneContext) && !C1766710w4j.LIZ(getSceneContext())) {
            C16C4 c16c4 = this.LLJJJIL;
            if (c16c4 != null) {
                c16c4.LLLLIIIILLL(C13BV.INSTANCE, true);
                return;
            }
            return;
        }
        if (this.mActivity == null || getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (!this.LLJLL) {
            C20639615pa c20639615pa = new C20639615pa();
            this.LLJJJJ = c20639615pa;
            c20639615pa.LLJJJ = new C20639715pb(this);
            beginTransaction();
            C1658150tFd.LIZLLL(this, R.id.iiv, c20639615pa, "album_Fragment");
            hide(c20639615pa);
            commitTransaction();
        }
        this.LLJLL = true;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        ((LinkedHashMap) C531320Ksc.LIZ).clear();
        if (requireActivity() instanceof EcChoosePhotoActivity) {
            return;
        }
        FragmentManager supportFragmentManager = ((C19EG) requireActivity()).getSupportFragmentManager();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(R.id.qce);
        sbLIZ.append(':');
        sbLIZ.append(0);
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentLJJJJZI != null) {
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
        }
        Fragment fragmentLJJJJZI2 = supportFragmentManager.LJJJJZI("album_Fragment");
        if (fragmentLJJJJZI2 != null) {
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI2);
        }
        c19ehLJIIJ.LJIIJ();
        ChooseMediaViewModel chooseMediaViewModel = this.LLJLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.LLILZIL.clear();
            chooseMediaViewModel.setState(AFwS276S0000000_31.get$arr$(304));
        }
        this.LLJLIL = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        List<C16CI> list;
        int size;
        C16CD c16cd;
        super.onStart();
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C1766710w4j.LIZ.getClass();
            if (!C1766710w4j.LIZIZ(sceneContext) && C1766710w4j.LIZ(sceneContext) && this.LLJILLL.isEmpty()) {
                ArrayList<C16CI> arrayList = this.LLJILLL;
                final ACListenerS165S0100000_31 aCListenerS165S0100000_31 = new ACListenerS165S0100000_31(this, 150);
                arrayList.add(new C16CI(aCListenerS165S0100000_31) { // from class: X.16By
                    public static final int $stable = 8;
                    public final View.OnClickListener LL;

                    @Override // X.C16CI
                    public int layoutRes() {
                        return R.layout.any;
                    }

                    @Override // X.C16CI
                    public View.OnClickListener getClickListener() {
                        return this.LL;
                    }

                    {
                        this.LL = aCListenerS165S0100000_31;
                    }
                });
                C16C4 c16c4 = this.LLJJJIL;
                if (c16c4 != null) {
                    ArrayList<C16CI> arrayList2 = this.LLJILLL;
                    c16c4.LLJJJ = arrayList2;
                    C16CD c16cd2 = c16c4.LLJJ;
                    if (c16cd2 != null) {
                        c16cd2.LLJI = arrayList2;
                        c16cd2.LLLII();
                    }
                }
                C16C4 c16c42 = this.LLJJJIL;
                if (c16c42 != null && (list = c16c42.LLJJJ) != null && (size = list.size()) > 0 && (c16cd = c16c42.LLJJ) != null) {
                    c16cd.notifyItemRangeChanged(0, size);
                }
            }
        }
        LLLLILI();
    }

    public final void LLLLIIIILLL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel != null) {
            C03DZ.LIZJ(this.LLLF);
            C0HV4.LIZ(this.LLLFF, tikTokMediaModel, new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))));
            TuxTextView tuxTextView = this.LLLI;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, 1.0f);
                return;
            }
            return;
        }
        C03DZ.LIZ(this.LLLF);
        TuxTextView tuxTextView2 = this.LLLI;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.B5(tuxTextView2, 0.5f);
    }

    public final int LLLLIILL(TikTokMediaModel tikTokMediaModel) {
        C16CD c16cd;
        String str;
        C16C4 c16c4 = this.LLJJJIL;
        if (c16c4 != null && (c16cd = c16c4.LLJJ) != null) {
            int size = ((ArrayList) c16cd.LLJ).size();
            for (int i = 0; i < size; i++) {
                MediaModel mediaModel = (MediaModel) C13LP.LJJJLZIJ(i, c16cd.LLJ);
                if (mediaModel != null) {
                    str = mediaModel.id;
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, ((MediaModel) tikTokMediaModel).id)) {
                    return i + c16cd.LLJILJILJ;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void animAlbumTabImg(boolean z) {
        float f;
        float f2;
        View view = this.LLJJIJIL;
        float f3 = 0.0f;
        if (view != null) {
            float[] fArr = new float[2];
            float f4 = 180.0f;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 180.0f;
            }
            fArr[0] = f2;
            if (!z) {
                f4 = 0.0f;
            }
            fArr[1] = f4;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", fArr);
            objectAnimatorOfFloat.setDuration(150L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        C20639615pa c20639615pa = this.LLJJJJ;
        if (c20639615pa != null) {
            c20639615pa.LLJJJJ = z;
            if (z) {
                f = -1.0f;
            } else {
                f = 0.0f;
                f3 = -1.0f;
            }
            int screenHeight = ScreenUtils.getScreenHeight(C798140VSq.LIZ);
            ValueAnimator duration = ValueAnimator.ofFloat(f, f3).setDuration(500L);
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.addUpdateListener(new AUListenerS2S0101001_6(screenHeight, c20639615pa, f3, 0));
            duration.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b7  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20734616Bs.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.av_, viewGroup, false);
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
