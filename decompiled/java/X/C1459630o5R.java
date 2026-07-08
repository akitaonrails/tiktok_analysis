package X;

import Y.AObjectS245S0100000_22;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker;
import com.zhiliaoapp.musically.R;
import irm.AkS30S0300000_22;
import irm.AkS60S0200000_22;
import irm.AkS90S0100000_22;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459630o5R extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664740tQG LLJILJILJ;
    public FrameLayout LLJILLL;
    public RelativeLayout LLJJ;
    public View LLJJI;
    public LinearLayout LLJJIII;
    public C0GYA LLJJIJI;
    public C1459590o5N LLJJIJIL;
    public int LLJJJ;
    public final C1664750tQH LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C01GW LLJILJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final Map<Integer, View> LLJJIJIIJIL = new LinkedHashMap();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459630o5R.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459630o5R.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1459630o5R.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1459630o5R.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1459630o5R.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void LLLII() {
        ((InterfaceC1455860nzM) this.LLJILJIL.getValue()).wi0();
        InterfaceC1453760nvy interfaceC1453760nvy = (InterfaceC1453760nvy) this.LLJJJJ.getValue(this, LLJJJJJIL[4]);
        if (interfaceC1453760nvy == null || !interfaceC1453760nvy.KB2("video_edit_page", "click_edit_page_next", !LLLIIIIL().creativeModel.audioCopyrightDetectModel.getContinueSelected(), null, new AwS566S0100000_22(this, 780))) {
            C201955140j.LIZ("VEVideoPublishEditActivity nextStep OnClick");
            LLLIIIIL().setClickNextToPublishPage(true);
            ((InterfaceC1455860nzM) this.LLJILJIL.getValue()).fA1();
        }
    }

    public final VideoPublishEditModel LLLIIIIL() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLJJJJJIL[0]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C1459590o5N c1459590o5N = this.LLJJIJIL;
        if (c1459590o5N != null) {
            c1459590o5N.clear();
        }
        C0GYA c0gya = this.LLJJIJI;
        if (c0gya != null) {
            c0gya.LLILZIL.cancel();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
    }

    public C1459630o5R(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453760nvy.class, null);
    }

    public final void LLLIILIL(List<C1460620o72> list) {
        HashMap<String, Integer> extraShareOptions;
        HashMap<String, Integer> extraShareOptions2;
        Integer num;
        LinearLayout linearLayout = this.LLJJIII;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        ((LinkedHashMap) this.LLJJIJIIJIL).clear();
        this.LLJJJ = 0;
        for (C1460620o72 c1460620o72 : (ArrayList) list) {
            int i = C1460640o74.LLIZLLLIL;
            Context contextLIZIZ = C545820Lau.LIZIZ(this);
            if (contextLIZIZ != null) {
                C1460640o74 c1460640o74LIZ = C1460630o73.LIZ(contextLIZIZ, c1460620o72);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart((int) C12ES.LIZJ(4.0f, getApplicationContext()));
                LinearLayout linearLayout2 = this.LLJJIII;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                linearLayout2.addView(c1460640o74LIZ, layoutParams);
                this.LLJJJ += layoutParams.getMarginStart() + c1460640o74LIZ.getTextWidth$tools_camera_edit_release();
                c1460640o74LIZ.LIZ(0);
                this.LLJJIJIIJIL.put(Integer.valueOf(c1460620o72.LIZ), c1460640o74LIZ);
                C786410Ut5.ta(c1460640o74LIZ, new AkS30S0300000_22(c1460640o74LIZ, this, c1460620o72, 2));
                if (c1460620o72.LIZ == 1 && (extraShareOptions = LLLIIIIL().getCreativeFlowData().getExtraShareOptions()) != null && extraShareOptions.containsKey("tiktok_videokit_disable_music_selection") && (extraShareOptions2 = LLLIIIIL().getCreativeFlowData().getExtraShareOptions()) != null && (num = extraShareOptions2.get("tiktok_videokit_disable_music_selection")) != null && num.intValue() == 1) {
                    CharSequence text = getResources().getText(2131847058);
                    C19471411Fw c19471411Fw = c1460640o74LIZ.LL;
                    if (c19471411Fw == null) {
                        c19471411Fw = null;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19471411Fw);
                    c19471411Fw.setAlpha(0.5f);
                    SmartImageView smartImageView = c1460640o74LIZ.LLILLJJLI;
                    if (smartImageView == null) {
                        smartImageView = null;
                    }
                    C786410Ut5.u5(smartImageView, 0.5f);
                    C786410Ut5.ta(c1460640o74LIZ, new AkS60S0200000_22(c1460640o74LIZ, text, 2));
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 588));
        Integer num2 = C1450870nrJ.LJII;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (C1462920oAk.LIZLLL()) {
                LLLIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58)));
            } else {
                LLLIL(iIntValue);
            }
        }
    }

    public final void LLLIL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RelativeLayout relativeLayout = this.LLJJ;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            relativeLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.height = i;
            RelativeLayout relativeLayout3 = this.LLJJ;
            if (relativeLayout3 != null) {
                relativeLayout2 = relativeLayout3;
            }
            C786410Ut5.e6(relativeLayout2, marginLayoutParams);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = null;
        ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1457600o2A.class, new AwS601S0100000_22(this, 592));
        ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 594));
        ((IVideoLengthChecker) ServiceManager.get().getService(IVideoLengthChecker.class)).LIZLLL(this, LLLIIIIL(), (InterfaceC1455860nzM) this.LLJILJIL.getValue());
        ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 589));
        Activity activity = this.mActivity;
        if (activity != null && !C744570TIp.LIZ(activity)) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZ = C0F39.LIZ();
            RelativeLayout relativeLayout = this.LLJJ;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            int paddingStart = iLIZ - relativeLayout.getPaddingStart();
            RelativeLayout relativeLayout2 = this.LLJJ;
            if (relativeLayout2 == null) {
                relativeLayout2 = null;
            }
            int paddingEnd = ((paddingStart - relativeLayout2.getPaddingEnd()) - iLIZIZ) - this.LLJJJ;
            View view2 = this.LLJJI;
            if (view2 == null) {
                view2 = null;
            }
            if (paddingEnd < view2.getMinimumWidth()) {
                View view3 = this.LLJJI;
                if (view3 == null) {
                    view3 = null;
                }
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                layoutParams.width = paddingEnd;
                View view4 = this.LLJJI;
                if (view4 != null) {
                    view = view4;
                }
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        GradientDrawable gradientDrawable;
        LiveEvent<Unit> liveEventJY;
        TextView textView;
        super.onViewCreated(view, bundle);
        this.LLJILLL = (FrameLayout) requireViewById(R.id.u0y);
        this.LLJJ = (RelativeLayout) requireViewById(R.id.m99);
        this.LLJJIII = (LinearLayout) requireViewById(R.id.cbk);
        this.LLJJI = requireViewById(R.id.p8u);
        C0GYA c0gya = (C0GYA) requireViewById(R.id.s8q);
        this.LLJJIJI = c0gya;
        int visibility = c0gya.getVisibility();
        c0gya.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0gya);
        View view2 = this.LLJJI;
        Drawable background = null;
        if (view2 == null) {
            view2 = null;
        }
        view2.setBackgroundResource(R.drawable.a8u);
        if (C571290Mat.LIZJ(LLLIIIIL())) {
            View view3 = this.LLJJI;
            if (view3 == null) {
                view3 = null;
            }
            if ((view3 instanceof TextView) && (textView = (TextView) view3) != null) {
                textView.setText(2131824466);
            }
        }
        View view4 = this.LLJJI;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.I7(new AkS90S0100000_22(this, 20, 42), view4);
        Activity activity = this.mActivity;
        if (activity != null && C744570TIp.LIZ(activity)) {
            Activity activity2 = this.mActivity;
            if (C1388580mEq.LIZIZ(activity2)) {
                View view5 = this.LLJJI;
                if (view5 == null) {
                    view5 = null;
                }
                view5.setBackground(C800330VaR.LIZIZ(activity2, R.drawable.a8s));
            } else {
                View view6 = this.LLJJI;
                if (view6 == null) {
                    view6 = null;
                }
                view6.setBackground(C800330VaR.LIZIZ(activity2, R.drawable.a8r));
            }
        }
        InterfaceC377540ErA interfaceC377540ErA = (InterfaceC377540ErA) this.LLJILJILJ.getValue(this, LLJJJJJIL[1]);
        if (interfaceC377540ErA != null && (liveEventJY = interfaceC377540ErA.JY()) != null) {
            liveEventJY.LIZ(this, new AObjectS245S0100000_22(this, 239));
        }
        View view7 = this.LLJJI;
        if (view7 != null) {
            background = view7.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = this.mActivity;
        if (activity != null && C744570TIp.LIZ(activity)) {
            return C786410Ut5.Td(layoutInflater, R.layout.eo2, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.eo1, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
