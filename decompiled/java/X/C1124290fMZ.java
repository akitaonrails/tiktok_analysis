package X;

import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS0S0300000_5;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS2S0100000_5;
import Y.ALAdapterS2S0200000_5;
import Y.ALAdapterS7S0300000_17;
import Y.AObserverS211S0100000_7;
import Y.AObserverS221S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS28S0101000_17;
import Y.AUListenerS266S0100000_17;
import Y.AfS186S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.livesdk.ExclusiveShowRedDotEvent;
import com.bytedance.android.livesdk.GiftCPCFaqIconVisibilityChange;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShowPrivilegeCenterEvent;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractivePanelSetting;
import com.bytedance.android.livesdk.livesetting.reddot.RedDotAssetsSetting;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS157S0101000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124290fMZ extends AbstractC1100460ek8 {
    public RecyclerView LLJ;
    public C1124490fMt LLJI;
    public TextView LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public C1324720kZq LLJJIII;
    public C1295960jpS LLJJIJI;
    public C1295960jpS LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public TextView LLJJJ;
    public View LLJJJIL;
    public C1324720kZq LLJJJJ;
    public C1324720kZq LLJJJJJIL;
    public View LLJJJJLIIL;
    public ImageView LLJJL;
    public C1295960jpS LLJJLIIIJLLLLLLLZ;
    public C1295960jpS LLJL;
    public ImageView LLJLIL;
    public long LLJLILLLLZIIL;
    public View LLJLL;
    public FrameLayout LLJLLIL;
    public Room LLJLLL;
    public boolean LLJZ;
    public final ViewTreeObserverOnGlobalLayoutListenerC1151700g4m LLJZIJLIL;
    public float LLL;
    public final C11NJ LLLF;
    public C11JF LLLFF;
    public boolean LLLFFI;
    public ConstraintLayout LLLFZ;
    public final int LLLI;
    public View LLLII;
    public ConstraintLayout LLLIIII;
    public C1126540fQC LLLIIIIL;
    public C16F5 LLLIIIL;
    public HorizontalScrollView LLLIIL;
    public ConstraintLayout LLLIILIL;
    public C1324720kZq LLLIL;
    public C1324720kZq LLLILZ;
    public final C1124250fMV LLLILZJ;
    public C421390Gfh LLLILZLLLI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ() {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1124290fMZ.LJJLIIIJ():void");
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZ() {
        Fragment fragment;
        View view;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<PrivilegeCenterConfig> mutableLiveData3;
        C1100690ekV<AbstractC1124410fMl> c1100690ekV;
        Context context;
        FrameLayout frameLayout;
        DataChannel dataChannel;
        C1124490fMt c1124490fMt;
        C1100530ekF c1100530ekF = this.LLIZ;
        if (c1100530ekF != null) {
            c1100530ekF.LIZ(new InterfaceC1100540ekG() { // from class: X.0fMa
                @Override // X.InterfaceC1100540ekG
                public final void LIZ(C1100530ekF c1100530ekF2, EnumC1100550ekH enumC1100550ekH) {
                    C1100420ek4 c1100420ek4;
                    Fragment fragment2;
                    DataChannel dataChannel2;
                    DataChannel dataChannel3;
                    ViewTreeObserver viewTreeObserver;
                    ViewTreeObserver viewTreeObserver2;
                    C1100420ek4 c1100420ek42;
                    Fragment fragment3;
                    int i = C1100560ekI.LIZ[enumC1100550ekH.ordinal()];
                    Room room = null;
                    if (i != 1) {
                        if (i == 2) {
                            C1124290fMZ c1124290fMZ = this.LIZ;
                            C421390Gfh c421390Gfh = c1124290fMZ.LLLILZLLLI;
                            if (c421390Gfh != null) {
                                c421390Gfh.LJI();
                            }
                            c1124290fMZ.LLLF.LJ();
                            C11JF c11jf = c1124290fMZ.LLLFF;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                            c1124290fMZ.LLLFF = null;
                            GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJI = c1124290fMZ.LJJJJI();
                            if (giftPanelLeafViewModelLJJJJI != null && (c1100420ek42 = c1124290fMZ.LLILZIL) != null && (fragment3 = c1100420ek42.getFragment()) != null) {
                                giftPanelLeafViewModelLJJJJI.LLJJJJ.removeObservers(fragment3);
                            }
                            View view2 = c1124290fMZ.LLILZ;
                            if (view2 != null && (viewTreeObserver2 = view2.getViewTreeObserver()) != null) {
                                ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m = c1124290fMZ.LLJZIJLIL;
                                viewTreeObserver2.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
                                C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnGlobalLayoutListenerC1151700g4m, ViewTreeObserver.OnGlobalLayoutListener.class);
                                return;
                            }
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C1124290fMZ c1124290fMZ2 = this.LIZ;
                    View view3 = c1124290fMZ2.LLILZ;
                    if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                        ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m2 = c1124290fMZ2.LLJZIJLIL;
                        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151700g4m2);
                        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151700g4m2, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                    c1124290fMZ2.LLJLILLLLZIIL = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
                    c1124290fMZ2.LJJLI();
                    c1124290fMZ2.LJJLIIIJ();
                    PrivilegeCenterConfig privilegeCenterConfigLJI = C498240JgM.LJI();
                    c1124290fMZ2.LJJJJLI(privilegeCenterConfigLJI, false);
                    GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ = c1124290fMZ2.LJJJJJ();
                    if (giftLeafRootViewModelLJJJJJ != null && (dataChannel3 = giftLeafRootViewModelLJJJJJ.LL) != null) {
                        room = (Room) dataChannel3.gg0(RoomChannel.class);
                    }
                    c1124290fMZ2.LLJLLL = room;
                    GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModelLJJJJL = c1124290fMZ2.LJJJJL();
                    if (giftPrivilegeCenterViewModelLJJJJL != null) {
                        Room room2 = c1124290fMZ2.LLJLLL;
                        c1124290fMZ2.LJJJJJ();
                        giftPrivilegeCenterViewModelLJJJJL.vQ2(privilegeCenterConfigLJI, room2);
                    }
                    GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ2 = c1124290fMZ2.LJJJJJ();
                    if (giftLeafRootViewModelLJJJJJ2 != null && (dataChannel2 = giftLeafRootViewModelLJJJJJ2.LL) != null) {
                        dataChannel2.CQ2(ExclusiveShowRedDotEvent.class, c1124290fMZ2, new AwS596S0100000_17(c1124290fMZ2, 454));
                        dataChannel2.DQ2(GiftCPCFaqIconVisibilityChange.class, c1124290fMZ2, new AwS596S0100000_17(c1124290fMZ2, 457));
                        dataChannel2.CQ2(ShowPrivilegeCenterEvent.class, c1124290fMZ2, new C020W(c1124290fMZ2, privilegeCenterConfigLJI, 59));
                    }
                    c1124290fMZ2.LLLFF = (C11JF) C784440Upu.LIZ().LJ(C915950ZwX.class).LJJLL(new AfS186S0100000_17(c1124290fMZ2, 130), new C516201zk(c1124290fMZ2, 247));
                    GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJI2 = c1124290fMZ2.LJJJJI();
                    if (giftPanelLeafViewModelLJJJJI2 == null || (c1100420ek4 = c1124290fMZ2.LLILZIL) == null || (fragment2 = c1100420ek4.getFragment()) == null) {
                        return;
                    }
                    giftPanelLeafViewModelLJJJJI2.LLJJJJ.observe(fragment2, new AObserverS221S0100000_17(c1124290fMZ2, 10));
                }
            });
        }
        View view2 = this.LLILZ;
        ConstraintLayout constraintLayout = view2 instanceof ConstraintLayout ? (ConstraintLayout) view2 : null;
        this.LLLFZ = constraintLayout;
        if (constraintLayout != null) {
            this.LLJLLIL = (FrameLayout) constraintLayout.findViewById(R.id.m7b);
            this.LLJIJIL = (TextView) constraintLayout.findViewById(R.id.bqj);
            this.LLJJJIL = constraintLayout.findViewById(R.id.p_2);
            TextView textView = (TextView) constraintLayout.findViewById(R.id.swo);
            this.LLJILLL = textView;
            if (textView != null) {
                textView.setContentDescription(C497740JfY.LJIJI(2131851130));
            }
            this.LLJJ = (TextView) constraintLayout.findViewById(R.id.wa1);
            this.LLJJI = (TextView) constraintLayout.findViewById(R.id.wa2);
            this.LLJJL = (ImageView) constraintLayout.findViewById(R.id.e3l);
            this.LLJJLIIIJLLLLLLLZ = (C1295960jpS) constraintLayout.findViewById(R.id.wa3);
            this.LLJL = (C1295960jpS) constraintLayout.findViewById(R.id.p_4);
            this.LLJLIL = (ImageView) constraintLayout.findViewById(R.id.p_3);
            this.LLJILJIL = constraintLayout.findViewById(R.id.sw0);
            this.LLJILJILJ = constraintLayout.findViewById(R.id.olo);
            this.LLJJIII = (C1324720kZq) constraintLayout.findViewById(R.id.lsz);
            this.LLJJIJI = (C1295960jpS) constraintLayout.findViewById(R.id.sm2);
            this.LLJJIJIIJIL = (C1295960jpS) constraintLayout.findViewById(R.id.sm0);
            this.LLJJIJIL = (TextView) constraintLayout.findViewById(R.id.sm1);
            this.LLJJJ = (TextView) constraintLayout.findViewById(R.id.acj);
            this.LLJJJJ = (C1324720kZq) constraintLayout.findViewById(R.id.lrx);
            this.LLJJJJJIL = (C1324720kZq) constraintLayout.findViewById(R.id.lry);
            this.LLJJJJLIIL = constraintLayout.findViewById(R.id.rvz);
            this.LLJLL = constraintLayout.findViewById(R.id.swm);
            constraintLayout.findViewById(R.id.oio);
            View view3 = this.LLJJJIL;
            if (view3 != null) {
                C786410Ut5.I7(new ACListenerS152S0100000_17(this, 147), view3);
            }
            View view4 = this.LLJILJIL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS152S0100000_17(this, 140), view4);
            }
            TextView textView2 = (TextView) constraintLayout.findViewById(R.id.e6q);
            textView2.setTypeface(C1119920fFW.LIZJ(textView2.getTextSize(), 500, constraintLayout.getContext()));
            RecyclerView recyclerView = (RecyclerView) constraintLayout.findViewById(R.id.p8c);
            C786410Ut5.LJLLLLLL(0, recyclerView);
            this.LLJ = recyclerView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.LL);
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            C1124490fMt c1124490fMt2 = new C1124490fMt(LJJJJIZL());
            this.LLJI = c1124490fMt2;
            c1124490fMt2.LLILLL = this;
            GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ = LJJJJJ();
            if (giftLeafRootViewModelLJJJJJ != null && (dataChannel = giftLeafRootViewModelLJJJJJ.LL) != null && (c1124490fMt = this.LLJI) != null) {
                c1124490fMt.LLILZLL = dataChannel;
            }
            RecyclerView recyclerView2 = this.LLJ;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.LLJI);
            }
            this.LLJLILLLLZIIL = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
            LJJLI();
            LJJLIIIJ();
            C11O8 c11o8L22 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().l22();
            C1100420ek4 c1100420ek4 = this.LLILZIL;
            ((C0J1N) c11o8L22.LIZJ(C11RD.LIZLLL(c1100420ek4 != null ? c1100420ek4.getFragment() : null))).LIZ(new AfS186S0100000_17(this, 116), new C516901zr(this, 21));
            this.LLLII = constraintLayout.findViewById(R.id.hjj);
            this.LLLIIII = (ConstraintLayout) constraintLayout.findViewById(R.id.rvq);
            this.LLLIIIIL = (C1126540fQC) constraintLayout.findViewById(R.id.rvr);
            this.LLLIIIL = (C16F5) constraintLayout.findViewById(R.id.rvs);
            this.LLLIIL = (HorizontalScrollView) constraintLayout.findViewById(R.id.rvt);
            this.LLLIILIL = (ConstraintLayout) constraintLayout.findViewById(R.id.rvu);
            this.LLLIL = (C1324720kZq) constraintLayout.findViewById(R.id.lye);
            this.LLLILZ = (C1324720kZq) constraintLayout.findViewById(R.id.laa);
            View view5 = this.LLILZ;
            if (view5 != null && (context = view5.getContext()) != null && C426750GoL.LIZLLL(context) && (frameLayout = this.LLJLLIL) != null) {
                C786410Ut5.Pb(frameLayout, -1.0f);
            }
        }
        ConstraintLayout constraintLayout2 = this.LLLFZ;
        if (constraintLayout2 != null) {
            C786410Ut5.LJLLLLLL(0, constraintLayout2);
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ2 = LJJJJJ();
        if (giftLeafRootViewModelLJJJJJ2 != null && (c1100690ekV = giftLeafRootViewModelLJJJJJ2.LLILZIL) != null) {
            c1100690ekV.LIZJ(this.LLILLL, this.LLLILZJ);
        }
        C1100420ek4 c1100420ek42 = this.LLILZIL;
        if (c1100420ek42 == null || (fragment = c1100420ek42.getFragment()) == null) {
            return;
        }
        GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModelLJJJJL = LJJJJL();
        if (giftPrivilegeCenterViewModelLJJJJL != null && (mutableLiveData3 = giftPrivilegeCenterViewModelLJJJJL.LL) != null) {
            mutableLiveData3.observe(fragment, new AObserverS211S0100000_7(this, 54));
        }
        GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModelLJJJJL2 = LJJJJL();
        if (giftPrivilegeCenterViewModelLJJJJL2 != null && (mutableLiveData2 = giftPrivilegeCenterViewModelLJJJJL2.LLILLJJLI) != null) {
            mutableLiveData2.observe(fragment, new AObserverS211S0100000_7(this, 55));
        }
        GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModelLJJJJL3 = LJJJJL();
        if (giftPrivilegeCenterViewModelLJJJJL3 != null && (mutableLiveData = giftPrivilegeCenterViewModelLJJJJL3.LLILLL) != null) {
            mutableLiveData.observe(fragment, new AObserverS221S0100000_17(this, 40));
        }
        if (!RedDotAssetsSetting.INSTANCE.enableAssetsRedDot() || (view = this.LLJJJJLIIL) == null) {
            return;
        }
        RedDotExtensionKt.LJIIJ(C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER, view, fragment, null, "watch_gift", 4);
    }

    public final AnimatorSet LJJJIL() {
        float fMeasureText;
        float fMeasureText2;
        String string;
        String string2;
        View view = this.LLJJJIL;
        TextView textView = (view == null || view.getVisibility() != 0) ? this.LLJIJIL : this.LLJILLL;
        View view2 = this.LLJJJIL;
        TextView textView2 = (view2 == null || view2.getVisibility() != 0) ? this.LLJJ : this.LLJJI;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
        String str = "";
        if (textView2 != null) {
            TextPaint paint = textView2.getPaint();
            CharSequence text = textView2.getText();
            if (text == null || (string2 = text.toString()) == null) {
                string2 = "";
            }
            fMeasureText = paint.measureText(string2);
        } else {
            fMeasureText = 0.0f;
        }
        if (textView != null) {
            TextPaint paint2 = textView.getPaint();
            CharSequence text2 = textView.getText();
            if (text2 != null && (string = text2.toString()) != null) {
                str = string;
            }
            fMeasureText2 = paint2.measureText(str);
        } else {
            fMeasureText2 = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMeasureText2, fMeasureText);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(textView2, 93));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fMeasureText, fMeasureText2);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(textView2, 92));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000L);
        animatorSet.addListener(new ALAdapterS2S0100000_5(textView, 27));
        animatorSet.playTogether(objectAnimatorOfFloat4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(1000L);
        animatorSet2.addListener(new ALAdapterS2S0200000_5(animatorSet, textView2, 13));
        animatorSet2.playTogether(objectAnimatorOfFloat3, valueAnimatorOfFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(1000L);
        animatorSet3.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
        animatorSet3.addListener(new ALAdapterS7S0300000_17(animatorSet2, textView2, this, 4));
        animatorSet3.playTogether(objectAnimatorOfFloat2, valueAnimatorOfFloat);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(1000L);
        animatorSet4.setStartDelay(500L);
        animatorSet4.addListener(new ALAdapterS0S0300000_5(animatorSet3, textView, this, 3));
        animatorSet4.playTogether(objectAnimatorOfFloat);
        return animatorSet4;
    }

    public final GiftPanelLeafViewModel LJJJJI() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) new ViewModelProvider(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftPanelLeafViewModel LJJJJIZL() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) new ViewModelProvider(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftLeafRootViewModel LJJJJJ() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null) {
            return null;
        }
        return (GiftLeafRootViewModel) new ViewModelProvider(fragment).get(GiftLeafRootViewModel.class);
    }

    public final int LJJJJJL() {
        C1128710fTh c1128710fTh;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null) {
            return 1;
        }
        return c1128710fTh.P1();
    }

    public final GiftPrivilegeCenterViewModel LJJJJL() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null) {
            return null;
        }
        return (GiftPrivilegeCenterViewModel) new ViewModelProvider(fragment).get(GiftPrivilegeCenterViewModel.class);
    }

    public final void LJJJJLL() {
        ConstraintLayout constraintLayout = this.LLLIIII;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        ConstraintLayout constraintLayout2 = this.LLLIILIL;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(8, constraintLayout2);
        }
        View view = this.LLJJJJLIIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C421390Gfh c421390Gfh = this.LLLILZLLLI;
        if (c421390Gfh != null) {
            c421390Gfh.LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0fMi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ() {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1124290fMZ.LJJJLZIJ():void");
    }

    public final void LJJLI() {
        BalanceStruct balanceStructG52;
        View view;
        String strValueOf;
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            if (UserService.getInstance().user().isLogin()) {
                long j = this.LLJLILLLLZIIL;
                if (10000 <= j && j < 1000000) {
                    double d = j / ((double) LSPassThroughRecordSizeConfig.DEFAULT);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)));
                    sbLIZ.append('K');
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                } else if (j >= 1000000) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / ((double) 1000000))}, 1)));
                    sbLIZ2.append('M');
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
                } else if (j >= 1000) {
                    StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
                    stringBuffer.insert(1, ',');
                    strValueOf = stringBuffer.toString();
                } else {
                    strValueOf = String.valueOf(j);
                }
            } else {
                strValueOf = CardStruct.IStatusCode.DEFAULT;
            }
            textView.setText(strValueOf);
        }
        TextView textView2 = this.LLJIJIL;
        if (textView2 != null) {
            long j2 = this.LLJLILLLLZIIL;
            textView2.setContentDescription(C497740JfY.LJIIL(2131755790, (int) j2, Integer.valueOf((int) j2)));
        }
        if (GiftManager.inst().hideBottomBar() || HideChargeIconForUserSetting.INSTANCE.getValue()) {
            if (this.LLJLILLLLZIIL > 0) {
                View view2 = this.LLJJJIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                View view3 = this.LLJILJIL;
                if (view3 != null) {
                    C500260Jjc.LJLJLJ(view3, !LJJJJZI());
                    return;
                }
                return;
            }
            return;
        }
        if (InterfaceC1094160eZy.J0.LIZIZ().booleanValue() && (balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52()) != null && balanceStructG52.validUser && (view = this.LLJLL) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (this.LLJLILLLLZIIL > 0) {
            View view4 = this.LLJJJIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            View view5 = this.LLJILJIL;
            if (view5 != null) {
                C500260Jjc.LJLJLJ(view5, !LJJJJZI());
                return;
            }
            return;
        }
        View view6 = this.LLJJJIL;
        if (view6 != null) {
            C500260Jjc.LJLJLJ(view6, !LJJJJZI());
        }
        View view7 = this.LLJILJIL;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(8, view7);
        }
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIZ() {
        C1100690ekV<AbstractC1124410fMl> c1100690ekV;
        DataChannel dataChannel;
        super.LJJIZ();
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ = LJJJJJ();
        if (giftLeafRootViewModelLJJJJJ != null && (dataChannel = giftLeafRootViewModelLJJJJJ.LL) != null) {
            dataChannel.zQ2(this);
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ2 = LJJJJJ();
        if (giftLeafRootViewModelLJJJJJ2 != null && (c1100690ekV = giftLeafRootViewModelLJJJJJ2.LLILZIL) != null) {
            c1100690ekV.LIZLLL(this.LLLILZJ);
        }
        C11JF c11jf = this.LLLFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLLFF = null;
    }

    public final long LJJJJ() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL = LJJJJIZL();
        if (giftPanelLeafViewModelLJJJJIZL == null || (mutableLiveData = giftPanelLeafViewModelLJJJJIZL.LLILZIL) == null || (value = mutableLiveData.getValue()) == null) {
            return 0L;
        }
        return value.longValue();
    }

    public final boolean LJJJJZI() {
        DataChannel dataChannel;
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ = LJJJJJ();
        return (giftLeafRootViewModelLJJJJJ == null || (dataChannel = giftLeafRootViewModelLJJJJJ.LL) == null || !C500260Jjc.LJJJIL(dataChannel)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fMV] */
    public C1124290fMZ(Context context) {
        super(context, EnumC1129580fV6.GIFT_PANEL_SUB.getZIndex());
        this.LLJZIJLIL = new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 10);
        this.LLLF = new C11NJ();
        this.LLLI = R.layout.hz9;
        this.LLLILZJ = new InterfaceC1100670ekT<AbstractC1124410fMl>() { // from class: X.0fMV
            @Override // X.InterfaceC1100670ekT
            public final void LLZZLLIL(AbstractC1124410fMl abstractC1124410fMl) {
                ArrayList<GiftPage> arrayList;
                int i;
                AbstractC21673619ry adapter;
                int iLLLFZ;
                RecyclerView recyclerView;
                ArrayList<GiftPage> arrayList2;
                C1128710fTh c1128710fTh;
                C1124490fMt c1124490fMt;
                int iLJJJJJL;
                boolean zBQ2;
                C0UX6 c0ux6VQ2;
                int i2;
                C09AY awS157S0101000_17;
                C0UX6 c0ux6VQ22;
                int iXQ2;
                EnumC1130940fXI value;
                MutableLiveData<EnumC1130940fXI> mutableLiveData;
                MutableLiveData<EnumC1130940fXI> mutableLiveData2;
                C1128710fTh c1128710fTh2;
                AbstractC1124410fMl abstractC1124410fMl2 = abstractC1124410fMl;
                if (abstractC1124410fMl2 instanceof C1124420fMm) {
                    C1124290fMZ c1124290fMZ = this.LIZ;
                    String str = ((C1124420fMm) abstractC1124410fMl2).LIZ;
                    c1124290fMZ.LJJLI();
                    C1DFH c1dfh = C0PEM.LIZ;
                    GiftPage giftPage = null;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1124180fMO(c1124290fMZ, null), 3);
                    ArrayList<C1124240fMU> arrayList3 = new ArrayList(8);
                    AbstractC1100450ek7 abstractC1100450ek7 = c1124290fMZ.LLIZLLLIL;
                    if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh2 = (C1128710fTh) abstractC1100450ek7) == null || (arrayList = c1128710fTh2.LLLIL) == null) {
                        arrayList = new ArrayList<>();
                    }
                    Iterator<GiftPage> it2 = arrayList.iterator();
                    int i3 = 1;
                    while (true) {
                        i = 16;
                        boolean zBQ22 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        GiftPage next = it2.next();
                        if (next.display && (i2 = next.pageType) != 5 && (i2 != 17 || LiveGiftInteractivePanelSetting.INSTANCE.isEnable())) {
                            C1124240fMU c1124240fMU = new C1124240fMU();
                            c1124240fMU.LIZ = next.pageName;
                            c1124240fMU.LIZJ = next.pageType;
                            c1124240fMU.LIZLLL = i3;
                            c1124240fMU.LJII = str;
                            if (c1124290fMZ.LJJJJIZL() != null && next.pageType == 1) {
                                c1124240fMU.LJIIJJI = EnumC1130940fXI.DEFAULT;
                                if (c1124290fMZ.LJJJJIZL() != null) {
                                    iXQ2 = GiftPanelLeafViewModel.xQ2(next.pageType, c1124240fMU.LJIIJJI);
                                } else {
                                    iXQ2 = 0;
                                }
                                c1124240fMU.LJIIIIZZ = iXQ2;
                                GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL = c1124290fMZ.LJJJJIZL();
                                if (giftPanelLeafViewModelLJJJJIZL != null && (mutableLiveData2 = giftPanelLeafViewModelLJJJJIZL.LLJJJIL) != null) {
                                    mutableLiveData2.setValue(c1124240fMU.LJIIJJI);
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("tryShowPanelBottom, state: ");
                                GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL2 = c1124290fMZ.LJJJJIZL();
                                if (giftPanelLeafViewModelLJJJJIZL2 != null && (mutableLiveData = giftPanelLeafViewModelLJJJJIZL2.LLJJJIL) != null) {
                                    value = mutableLiveData.getValue();
                                } else {
                                    value = null;
                                }
                                sbLIZ.append(value);
                                C20441214yg.LIZIZ("giftpanelsort", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            c1124240fMU.LJ = next.pagePanelBanner;
                            GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL3 = c1124290fMZ.LJJJJIZL();
                            if (giftPanelLeafViewModelLJJJJIZL3 != null) {
                                zBQ22 = giftPanelLeafViewModelLJJJJIZL3.BQ2(next.pageType);
                            }
                            c1124240fMU.LJFF = zBQ22;
                            int i4 = i3 - 1;
                            if (next.pageType == 16) {
                                awS157S0101000_17 = new AwS157S0101000_17(c1124290fMZ, i4, 2);
                            } else {
                                awS157S0101000_17 = AFwS205S0000000_17.get$arr$(230);
                            }
                            c1124240fMU.LJIIIZ = awS157S0101000_17;
                            GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJI = c1124290fMZ.LJJJJI();
                            if (giftPanelLeafViewModelLJJJJI != null) {
                                c0ux6VQ22 = giftPanelLeafViewModelLJJJJI.vQ2(next.pageType);
                            } else {
                                c0ux6VQ22 = null;
                            }
                            c1124240fMU.LJI = c0ux6VQ22;
                            i3++;
                            arrayList3.add(c1124240fMU);
                        }
                    }
                    if (C1121600fIE.LIZLLL()) {
                        C1124240fMU c1124240fMU2 = new C1124240fMU();
                        c1124240fMU2.LIZ = "";
                        c1124240fMU2.LIZJ = 16;
                        c1124240fMU2.LIZLLL = i3;
                        c1124240fMU2.LJ = null;
                        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL4 = c1124290fMZ.LJJJJIZL();
                        if (giftPanelLeafViewModelLJJJJIZL4 != null) {
                            zBQ2 = giftPanelLeafViewModelLJJJJIZL4.BQ2(16);
                        } else {
                            zBQ2 = false;
                        }
                        c1124240fMU2.LJFF = zBQ2;
                        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJI2 = c1124290fMZ.LJJJJI();
                        if (giftPanelLeafViewModelLJJJJI2 != null) {
                            c0ux6VQ2 = giftPanelLeafViewModelLJJJJI2.vQ2(16);
                        } else {
                            c0ux6VQ2 = null;
                        }
                        c1124240fMU2.LJI = c0ux6VQ2;
                        c1124240fMU2.LJIIIZ = new AwS157S0101000_17(c1124290fMZ, i3 - 1, 2);
                        c1124240fMU2.LIZIZ = R.drawable.ev6;
                        arrayList3.add(c1124240fMU2);
                    }
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList3, 10));
                    if (iLIZIZ >= 16) {
                        i = iLIZIZ;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (C1124240fMU c1124240fMU3 : arrayList3) {
                        Pair pair = new Pair(Integer.valueOf(c1124240fMU3.LIZJ), Integer.valueOf(c1124240fMU3.LIZLLL));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    C1128590fTV.LJ(linkedHashMap);
                    RecyclerView recyclerView2 = c1124290fMZ.LLJ;
                    if (recyclerView2 != null) {
                        adapter = recyclerView2.getAdapter();
                    } else {
                        adapter = null;
                    }
                    if ((adapter instanceof C1124490fMt) && (c1124490fMt = (C1124490fMt) adapter) != null) {
                        c1124490fMt.LLILLJJLI = arrayList3;
                        C1124290fMZ c1124290fMZ2 = c1124490fMt.LLILLL;
                        if (c1124290fMZ2 != null) {
                            iLJJJJJL = c1124290fMZ2.LJJJJJL();
                        } else {
                            iLJJJJJL = 0;
                        }
                        c1124490fMt.LLILZIL = iLJJJJJL;
                        c1124490fMt.notifyDataSetChanged();
                        List<C1124240fMU> list = c1124490fMt.LLILLJJLI;
                        if (list != null) {
                            int i5 = 0;
                            for (C1124240fMU c1124240fMU4 : list) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    C1124240fMU c1124240fMU5 = c1124240fMU4;
                                    if (c1124240fMU5.LIZJ == c1124490fMt.LLILZIL) {
                                        c1124240fMU5.LJFF = false;
                                        C0UX6 c0ux6 = c1124240fMU5.LJI;
                                        if (c0ux6 != null) {
                                            RedDotExtensionKt.LIZ(c0ux6);
                                        }
                                        if (c1124490fMt.LLILZIL == 15) {
                                            InterfaceC1094160eZy.u1.LJFF(Boolean.FALSE);
                                            ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Wt2();
                                        }
                                        c1124490fMt.notifyItemChanged(i5);
                                    }
                                    i5 = i6;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                    }
                    if (arrayList3.size() <= 1) {
                        RecyclerView recyclerView3 = c1124290fMZ.LLJ;
                        if (recyclerView3 != null) {
                            C786410Ut5.LLIZLLLIL(recyclerView3, 8);
                        }
                    } else {
                        if (!arrayList3.isEmpty()) {
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if (((C1124240fMU) it3.next()).LIZJ == 18) {
                                    AbstractC1100450ek7 abstractC1100450ek72 = c1124290fMZ.LLIZLLLIL;
                                    if (!(abstractC1100450ek72 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek72) == null || (arrayList2 = c1128710fTh.LLLIL) == null) {
                                        arrayList2 = new ArrayList<>();
                                    }
                                    Iterator<GiftPage> it4 = arrayList2.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        GiftPage next2 = it4.next();
                                        if (next2.pageType == 18) {
                                            giftPage = next2;
                                            break;
                                        }
                                    }
                                    GiftPage giftPage2 = giftPage;
                                    if (giftPage2 != null && giftPage2.display) {
                                        if (!giftPage2.clientCanReorder) {
                                            C1124260fMW.LJI();
                                        } else if (str != null && !Intrinsics.LJFF(C1124260fMW.LIZIZ, str)) {
                                            C1124260fMW.LIZIZ = str;
                                            C1124260fMW.LJFF().storeInt(C1124260fMW.LJ(), C1124260fMW.LIZLLL() + 1);
                                        }
                                    }
                                }
                            }
                        }
                        RecyclerView recyclerView4 = c1124290fMZ.LLJ;
                        if (recyclerView4 != null) {
                            C786410Ut5.LLIZLLLIL(recyclerView4, 0);
                        }
                        C1124490fMt c1124490fMt2 = c1124290fMZ.LLJI;
                        if (c1124490fMt2 != null && (iLLLFZ = c1124490fMt2.LLLFZ()) > 0 && (recyclerView = c1124290fMZ.LLJ) != null) {
                            HandlerHook.viewPostDelay(recyclerView, new ARunnableS28S0101000_17(iLLLFZ, c1124290fMZ, 10), 20L);
                        }
                    }
                    RecyclerView recyclerView5 = c1124290fMZ.LLJ;
                    if (recyclerView5 != null) {
                        HandlerHook.viewPost(recyclerView5, new ARunnableS117S0100000_17(c1124290fMZ, 231));
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
        };
    }

    public final void LJJJLIIL(Function0<Unit> function0) {
        boolean z;
        C1295960jpS c1295960jpS = this.LLJL;
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation((Animation) null);
        }
        C1295960jpS c1295960jpS2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setAnimation((Animation) null);
        }
        View view = this.LLJJJIL;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1295960jpS c1295960jpS3 = this.LLJL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.addAnimatorListener(new ALAdapterS12S0200000_17(this, function0, 28));
            }
            C1295960jpS c1295960jpS4 = this.LLJL;
            if (c1295960jpS4 != null) {
                C786410Ut5.LLD(0, c1295960jpS4);
            }
            C1143680frq.LJIILJJIL(this.LLJL, "tiktok_live_revenue_normal_1", "strategy_recharge_lottie.zip", true);
            return;
        }
        C1295960jpS c1295960jpS5 = this.LLJJLIIIJLLLLLLLZ;
        if (c1295960jpS5 != null) {
            c1295960jpS5.addAnimatorListener(new ALAdapterS12S0200000_17(this, function0, 29));
        }
        C1295960jpS c1295960jpS6 = this.LLJJLIIIJLLLLLLLZ;
        if (c1295960jpS6 != null) {
            C786410Ut5.LLD(0, c1295960jpS6);
        }
        C1143680frq.LJIILJJIL(this.LLJJLIIIJLLLLLLLZ, "tiktok_live_revenue_normal_1", "strategy_recharge_lottie.zip", true);
    }

    public final void LJJL(boolean z) {
        if (z) {
            View view = this.LLJILJILJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            LJJLI();
            return;
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJJJIL;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view3);
    }

    public final void LJJLIIIIJ(boolean z) {
        DataChannel dataChannel;
        if (!z) {
            return;
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ = LJJJJJ();
        if (giftLeafRootViewModelLJJJJJ != null) {
            dataChannel = giftLeafRootViewModelLJJJJJ.LL;
        } else {
            dataChannel = null;
        }
        Room room = this.LLJLLL;
        View view = this.LLJJJJLIIL;
        boolean z2 = false;
        if (view != null && C500260Jjc.LJJJJIZL(view)) {
            z2 = true;
        }
        C498240JgM.LJFF("show", "gift_panel", dataChannel, room, z2);
    }

    public static final void LJJJZ(String str, Map<String, String> map) {
        String str2;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map2 = new HashMap();
        C1126800fQc.LIZ.M92();
        boolean zLJIIJJI = C1133940fc8.LJIIJJI();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map2.put("room_id", idStr);
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map2.put("user_id", String.valueOf(currentUser.getId()));
        }
        map2.put("gift_enter_from", C1130100fVw.LIZ.LIZJ);
        if (zLJIIJJI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_first_recharge", str2);
        if (map != null) {
            map2.putAll(map);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_recharge_button_show");
        c474500IjALIZ.LJJII(str, "task_type");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        C1CC2.LIZLLL("ttlive_gift_panel_recharge_button_show", map2, new HashMap(), new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0345  */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, kotlin.jvm.internal.AwS373S0200000_7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI(com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1124290fMZ.LJJJJLI(com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig, boolean):void");
    }

    @Override // X.AbstractC1100450ek7
    public final Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C0J3Y c0j3y = C0J3Y.LIZ;
        int i = this.LLLI;
        c0j3y.getClass();
        View viewLJIIIIZZ = C0J3Y.LJIIIIZZ(i);
        if (viewLJIIIIZZ == null && (viewLJIIIIZZ = C786410Ut5.Td(layoutInflater, this.LLLI, viewGroup, false)) == null) {
            return null;
        }
        this.LLILZ = viewLJIIIIZZ;
        return new Pair<>(this.LLILZ, new C19ME(-1, -1));
    }
}
