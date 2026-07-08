package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C01GW;
import X.C098200Yq;
import X.C0U78;
import X.C0UAH;
import X.C0UD4;
import X.C0UD7;
import X.C0UEH;
import X.C0UHQ;
import X.C0UHS;
import X.C0UHT;
import X.C0UHV;
import X.C0UHX;
import X.C0UHZ;
import X.C1161920gLG;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19P4;
import X.C19U0;
import X.C19U1;
import X.C20136513qd;
import X.C20441214yg;
import X.C20587315h9;
import X.C2217371BqR;
import X.C292401Bi;
import X.C360660ECa;
import X.C474640IjO;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766990U6v;
import X.C767250U7v;
import X.C769640UHa;
import X.C769660UHc;
import X.C769700UHg;
import X.C786410Ut5;
import X.C924220a9s;
import X.C924620aAW;
import X.InterfaceC1584740rLE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC769000UEo;
import X.InterfaceC769650UHb;
import X.InterfaceC769710UHh;
import X.InterfaceC923870a9J;
import X.InterfaceC927690aFT;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AUListenerS262S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2SelfReachTargetEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2StatusChangeEvent;
import com.bytedance.android.livesdk.livesetting.effect.EnableAudienceEffectControlSetting;
import com.bytedance.android.livesdk.model.message.EffectControlMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS97S1000000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.CountdownForAllConfig;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestEffectSwitchFragment extends BaseFragment {
    public static final C769660UHc LLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZyI2LCwtZygmLTY4Zyo1LiAvPWEePSk4IAgmLTY4DCk1LSY4Gjg6PCYkDz0yLygpJzs=";
    public final C20136513qd LL;
    public C19P4 LLILLJJLI;
    public C16F5 LLILLL;
    public C19U1 LLILZ;
    public ViewPager LLILZIL;
    public ImageView LLILZLL;
    public FrameLayout LLIZ;
    public MultiGuestEffectViewModel LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public View LLJIJIL;
    public int LLJILJIL;
    public DataChannel LLJILJILJ;
    public String LLJILLL;
    public int LLJJ;
    public Integer LLJJI;
    public C0UHX LLJJIII;
    public InterfaceC769650UHb LLJJIJI;
    public C0UHS LLJJIJIIJIL;
    public LiveEffect LLJJIJIL;
    public int LLJJJ;
    public InterfaceC923870a9J LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public MultiGuestFullPropsPageFragment LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0UHc] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(MultiGuestEffectSwitchFragment.class, "isFromLinkedPreviewPage", "isFromLinkedPreviewPage()Z", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217371BqR};
        LLJL = new Object() { // from class: X.0UHc
        };
    }

    public final boolean NR() {
        C769640UHa c769640UHa = C0UHZ.LJIIJ;
        int i = this.LLJJJ;
        c769640UHa.getClass();
        return C769640UHa.LIZ(i);
    }

    public final boolean OR() {
        C769640UHa c769640UHa = C0UHZ.LJIIJ;
        int i = this.LLJJJ;
        c769640UHa.getClass();
        return i == 1 || i == 2;
    }

    public final void RR() {
        InterfaceC769000UEo interfaceC769000UEoVQ2;
        LiveEffect liveEffect;
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        InterfaceC769000UEo interfaceC769000UEoVQ22;
        MultiGuestEffectViewModel multiGuestEffectViewModel = this.LLIZLLLIL;
        if (multiGuestEffectViewModel != null && (interfaceC769000UEoVQ22 = multiGuestEffectViewModel.vQ2()) != null) {
            LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLZIJ(0, interfaceC769000UEoVQ22.qr(C0UD4.LJ));
            if (C767250U7v.LIZLLL(liveEffect2)) {
                return;
            }
            if (liveEffect2 != null && C767250U7v.LJ(liveEffect2)) {
                return;
            }
        }
        MultiGuestEffectViewModel multiGuestEffectViewModel2 = this.LLIZLLLIL;
        if (multiGuestEffectViewModel2 == null || (interfaceC769000UEoVQ2 = multiGuestEffectViewModel2.vQ2()) == null || (liveEffect = (LiveEffect) C13LP.LJJJLZIJ(0, interfaceC769000UEoVQ2.qr(C0UD4.LJ))) == null || (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) == null || stickerSDKExtraLJLJLLL.pl == null) {
            FrameLayout frameLayout = this.LLJ;
            if (C500260Jjc.LJJJJIZL(frameLayout != null ? frameLayout.getChildAt(0) : null)) {
                return;
            }
            FrameLayout frameLayout2 = this.LLJ;
            if (C500260Jjc.LJJJJIZL(frameLayout2 != null ? frameLayout2.getChildAt(1) : null)) {
                return;
            }
            FrameLayout frameLayout3 = this.LLJI;
            if (C500260Jjc.LJJJJIZL(frameLayout3 != null ? frameLayout3.getChildAt(0) : null)) {
                return;
            }
            FrameLayout frameLayout4 = this.LLJI;
            C500260Jjc.LJJJJIZL(frameLayout4 != null ? frameLayout4.getChildAt(1) : null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void UR() {
        C0UHX c0uhx;
        LiveData liveData;
        TextView textView;
        C19U1 c19u1 = this.LLILZ;
        final ViewPager viewPager = this.LLILZIL;
        int i = -1;
        if (c19u1 != null && viewPager != null) {
            Iterator<C0UHQ> it2 = tT().iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                C0UHQ next = it2.next();
                C769640UHa c769640UHa = C0UHZ.LJIIJ;
                int i3 = next.LIZ;
                c769640UHa.getClass();
                if (C769640UHa.LIZ(i3)) {
                    break;
                } else {
                    i2++;
                }
            }
            this.LLJJ = i2;
            if (i2 < 0) {
                this.LLJJ = 0;
            }
            int i4 = 0;
            for (C0UHQ c0uhq : tT()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C0UHQ c0uhq2 = c0uhq;
                C19U0 c19u0NewTab = c19u1.newTab();
                if (c19u0NewTab != null) {
                    c19u0NewTab.LIZJ(c0uhq2.LIZJ);
                    View view = c19u0NewTab.LJFF;
                    if (view != null && (textView = (TextView) view.findViewById(R.id.wyg)) != null) {
                        textView.setText(c0uhq2.LIZIZ);
                    }
                }
                if (i4 == this.LLJJ) {
                    C0UHT.LIZ(c19u0NewTab);
                } else {
                    C0UHT.LIZIZ(c19u0NewTab);
                }
                c19u1.addTab(c19u0NewTab);
                i4 = i5;
            }
            c19u1.addOnTabSelectedListener((InterfaceC1584740rLE) new C766990U6v(viewPager) { // from class: X.0UHW
                public static final /* synthetic */ int LLILLJJLI = 0;

                @Override // X.C766990U6v, X.InterfaceC1586460rO0
                public final void Oq(C19U0 c19u0) {
                    this.LL.setCurrentItem(c19u0.LJ);
                    C0UHT.LIZ(c19u0);
                }

                @Override // X.C766990U6v, X.InterfaceC1586460rO0
                public final void Yn(C19U0 c19u0) {
                    if (c19u0 != null) {
                        C0UHT.LIZIZ(c19u0);
                    }
                }
            });
            viewPager.addOnPageChangeListener(new C20587315h9(c19u1));
            c19u1.setSelectedTabIndicatorColor(0);
        }
        C19U1 c19u12 = this.LLILZ;
        ViewPager viewPager2 = this.LLILZIL;
        if (c19u12 == null || viewPager2 == null) {
            return;
        }
        C0UHV c0uhv = new C0UHV(getChildFragmentManager());
        viewPager2.setAdapter(c0uhv);
        C12ES.LJIILL(0, viewPager2);
        viewPager2.addOnPageChangeListener(new C360660ECa() { // from class: X.0UHR
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i6) {
                boolean z;
                String str;
                boolean z2;
                LiveData liveData2;
                if (i6 >= 0 && i6 < this.LL.tT().size()) {
                    MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = this.LL;
                    int i7 = multiGuestEffectSwitchFragment.LLJJJ;
                    multiGuestEffectSwitchFragment.LLJJJ = ((C0UHQ) ListProtector.get(multiGuestEffectSwitchFragment.tT(), i6)).LIZ;
                    C769640UHa c769640UHa2 = C0UHZ.LJIIJ;
                    int i8 = this.LL.LLJJJ;
                    c769640UHa2.getClass();
                    if (C769640UHa.LIZ(i8)) {
                        if (this.LL.PR()) {
                            View view2 = this.LL.LLJIJIL;
                            if (view2 != null) {
                                C786410Ut5.LJLLLLLL(0, view2);
                            }
                        } else {
                            View view3 = this.LL.LLJIJIL;
                            if (view3 != null) {
                                C786410Ut5.LJLLLLLL(8, view3);
                            }
                        }
                    }
                    MultiGuestEffectViewModel multiGuestEffectViewModel = this.LL.LLIZLLLIL;
                    if (multiGuestEffectViewModel != null && (liveData2 = (LiveData) multiGuestEffectViewModel.LLJJ.getValue()) != null) {
                        liveData2.setValue(Integer.valueOf(this.LL.LLJJJ));
                    }
                    c769640UHa2.getClass();
                    if (i7 != 1 && i7 != 2) {
                        C769640UHa.LIZ(i7);
                    }
                    int i9 = this.LL.LLJJJ;
                    c769640UHa2.getClass();
                    if (i9 != 1 && i9 != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        str = "beauty";
                    } else if (C769640UHa.LIZ(i9)) {
                        str = "props";
                    } else {
                        str = "";
                    }
                    if (C0UEX.LIZJ.length() == 0) {
                        C0UEX.LIZJ = str;
                    } else {
                        C0UEX.LJ(C0UEX.LIZIZ, C0UEX.LIZJ);
                        C0UEX.LIZJ = str;
                        C0UEX.LIZIZ = System.currentTimeMillis();
                    }
                    MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment2 = this.LL;
                    InterfaceC769650UHb interfaceC769650UHb = multiGuestEffectSwitchFragment2.LLJJIJI;
                    if (interfaceC769650UHb != null) {
                        interfaceC769650UHb.LJFF(multiGuestEffectSwitchFragment2.LLJJJ, false);
                    }
                    if (((C0UHQ) ListProtector.get(this.LL.tT(), i6)).LIZ == 1) {
                        C500260Jjc.LLFFF(this.LL.LLIZ);
                    } else {
                        C500260Jjc.LJIILIIL(this.LL.LLIZ);
                    }
                    if (((C0UHQ) ListProtector.get(this.LL.tT(), i6)).LIZ == 4) {
                        this.LL.getClass();
                    } else {
                        this.LL.getClass();
                    }
                    if (i7 != 1 && i7 != 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2 && C769640UHa.LIZ(this.LL.LLJJJ)) {
                        if (this.LL.PR()) {
                            View view4 = this.LL.LLJIJIL;
                            if (view4 != null) {
                                C786410Ut5.LJLLLLLL(0, view4);
                            }
                        } else {
                            View view5 = this.LL.LLJIJIL;
                            if (view5 != null) {
                                C786410Ut5.LJLLLLLL(8, view5);
                            }
                        }
                        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment3 = this.LL;
                        C0UHS c0uhs = multiGuestEffectSwitchFragment3.LLJJIJIIJIL;
                        if (c0uhs != null) {
                            multiGuestEffectSwitchFragment3.RR();
                            AnimatorSet animatorSet = c0uhs.LJIIJJI;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            AnimatorSet animatorSet2 = c0uhs.LJIIL;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            ArrayList arrayList = new ArrayList();
                            C19P4 c19p4 = c0uhs.LIZ;
                            if (c19p4 != null) {
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19p4);
                                c19p4.setAlpha(1.0f);
                            }
                            ValueAnimator valueAnimatorLJ = C0UHS.LJ(1.0f, 0.0f, c0uhs.LIZ);
                            valueAnimatorLJ.addUpdateListener(new AUListenerS262S0100000_12(c0uhs, 38));
                            arrayList.add(valueAnimatorLJ);
                            arrayList.add(C0UHS.LIZJ(c0uhs.LIZIZ));
                            animatorSet3.playSequentially(arrayList);
                            c0uhs.LJIIL = animatorSet3;
                            animatorSet3.start();
                        }
                        C0UEY liveMultiGuestStickerLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveMultiGuestStickerLogManager();
                        if (liveMultiGuestStickerLogManager != null) {
                            liveMultiGuestStickerLogManager.LJIIIZ(C475510Ikn.LJ(this.LL), "props");
                        }
                    }
                    if (C769640UHa.LIZ(i7)) {
                        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment4 = this.LL;
                        int i10 = multiGuestEffectSwitchFragment4.LLJJJ;
                        if (i10 == 1 || i10 == 2) {
                            View view6 = multiGuestEffectSwitchFragment4.LLJIJIL;
                            if (view6 != null) {
                                C786410Ut5.LJLLLLLL(8, view6);
                            }
                            MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment5 = this.LL;
                            C0UHS c0uhs2 = multiGuestEffectSwitchFragment5.LLJJIJIIJIL;
                            if (c0uhs2 != null) {
                                multiGuestEffectSwitchFragment5.RR();
                                AnimatorSet animatorSet4 = c0uhs2.LJIIJJI;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = c0uhs2.LJIIL;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                }
                                AnimatorSet animatorSet6 = new AnimatorSet();
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(C0UHS.LIZLLL(c0uhs2.LIZIZ));
                                C19P4 c19p42 = c0uhs2.LIZ;
                                if (c19p42 != null) {
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19p42);
                                    c19p42.setAlpha(0.0f);
                                }
                                C19P4 c19p43 = c0uhs2.LIZ;
                                if (c19p43 != null) {
                                    C12ES.LJIILL(0, c19p43);
                                }
                                arrayList2.add(C0UHS.LJ(0.0f, 1.0f, c0uhs2.LIZ));
                                animatorSet6.playSequentially(arrayList2);
                                c0uhs2.LJIIJJI = animatorSet6;
                                animatorSet6.start();
                            }
                            C0UEY liveMultiGuestStickerLogManager2 = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveMultiGuestStickerLogManager();
                            if (liveMultiGuestStickerLogManager2 != null) {
                                liveMultiGuestStickerLogManager2.LJIIIZ(C475510Ikn.LJ(this.LL), "beauty");
                            }
                            C0UHX c0uhx2 = this.LL.LLJJIII;
                            if (c0uhx2 != null) {
                                c0uhx2.LIZIZ();
                            }
                        }
                    }
                }
            }
        });
        List<C0UHQ> listTT = tT();
        ((List) c0uhv.LLJ.getValue()).clear();
        ((List) c0uhv.LLJ.getValue()).addAll(listTT);
        c0uhv.notifyDataSetChanged();
        Iterator<C0UHQ> it3 = tT().iterator();
        int i6 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C0UHQ next2 = it3.next();
            C769640UHa c769640UHa2 = C0UHZ.LJIIJ;
            int i7 = next2.LIZ;
            c769640UHa2.getClass();
            if (C769640UHa.LIZ(i7)) {
                i = i6;
                break;
            }
            i6++;
        }
        this.LLJJ = i;
        if (i < 0) {
            this.LLJJ = 0;
        }
        viewPager2.setCurrentItem(this.LLJJ);
        if (!tT().isEmpty()) {
            this.LLJJJ = ((C0UHQ) ListProtector.get(tT(), this.LLJJ)).LIZ;
        }
        MultiGuestEffectViewModel multiGuestEffectViewModel = this.LLIZLLLIL;
        if (multiGuestEffectViewModel != null && (liveData = (LiveData) multiGuestEffectViewModel.LLJJ.getValue()) != null) {
            liveData.setValue(Integer.valueOf(this.LLJJJ));
        }
        InterfaceC769650UHb interfaceC769650UHb = this.LLJJIJI;
        if (interfaceC769650UHb != null) {
            interfaceC769650UHb.LJFF(this.LLJJJ, true);
        }
        C769640UHa c769640UHa3 = C0UHZ.LJIIJ;
        int i8 = this.LLJJJ;
        c769640UHa3.getClass();
        if (i8 != 1) {
            C500260Jjc.LJIILIIL(this.LLIZ);
        }
        int i9 = this.LLJJJ;
        if (!C500260Jjc.LJJIFFI(Boolean.valueOf(i9 == 1 || i9 == 2)) || (c0uhx = this.LLJJIII) == null) {
            return;
        }
        c0uhx.LIZLLL();
    }

    public final List<C0UHQ> tT() {
        return (List) this.LLJJJJJIL.getValue();
    }

    public MultiGuestEffectSwitchFragment() {
        C769700UHg.LIZ.getClass();
        this.LL = new C20136513qd();
        this.LLJILLL = "";
        this.LLJJJJJIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 69));
    }

    public final boolean PR() {
        long jLIZLLL;
        InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
        boolean z = !Intrinsics.LJFF(interfaceC927690aFTLIZ != null ? interfaceC927690aFTLIZ.getEffectId() : null, "");
        boolean zLJIJI = C500260Jjc.LJIJI(this.LLJILJILJ);
        boolean zLJJJI = C500260Jjc.LJJJI(interfaceC927690aFTLIZ != null ? Boolean.valueOf(interfaceC927690aFTLIZ.LJFF()) : null);
        long j = 0;
        if (interfaceC927690aFTLIZ != null) {
            jLIZLLL = interfaceC927690aFTLIZ.LIZLLL(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
            CountdownForAllConfig config = interfaceC927690aFTLIZ.getConfig();
            if (config != null) {
                j = config.targetScore;
            }
        } else {
            jLIZLLL = 0;
        }
        boolean z2 = jLIZLLL >= j;
        if (z && zLJIJI && zLJJJI && !z2) {
            C474640IjO.LIZ = Boolean.TRUE;
            return true;
        }
        C474640IjO.LIZ = Boolean.FALSE;
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJIJIL = null;
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJJJJLIIL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MultiGuestEffectViewModel multiGuestEffectViewModel;
        EffectControlMessage effectControlMessage;
        C0U78 c0u78WQ2;
        int iIntValue;
        int iIntValue2;
        super.onViewCreated(view, bundle);
        this.LLJILJILJ = C475510Ikn.LJ(this);
        final InterfaceC923870a9J interfaceC923870a9J = this.LLJJJIL;
        final LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        final DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        C0U78 c0u78WQ22 = null;
        if (isAdded()) {
            multiGuestEffectViewModel = (MultiGuestEffectViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory() { // from class: X.0UHU
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    return new MultiGuestEffectViewModel(dataChannelLJ, viewLifecycleOwner, interfaceC923870a9J);
                }
            }).get(MultiGuestEffectViewModel.class);
        } else {
            multiGuestEffectViewModel = null;
        }
        this.LLIZLLLIL = multiGuestEffectViewModel;
        if (multiGuestEffectViewModel != null) {
            multiGuestEffectViewModel.LLJILJILJ = this.LLJJIJI;
        }
        if (multiGuestEffectViewModel != null) {
            multiGuestEffectViewModel.LLJILLL = ((Boolean) this.LL.getValue(this, LLJLIL[0])).booleanValue();
        }
        this.LLILZ = (C19U1) view.findViewById(R.id.gxe);
        this.LLILZIL = (ViewPager) view.findViewById(R.id.gxq);
        this.LLILZLL = (ImageView) view.findViewById(R.id.tcc);
        this.LLILLL = (C16F5) view.findViewById(R.id.fh5);
        this.LLJIJIL = view.findViewById(R.id.gvu);
        this.LLIZ = (FrameLayout) view.findViewById(R.id.tcd);
        C19P4 c19p4 = this.LLILLJJLI;
        if (c19p4 != null) {
            c19p4.LIZJ(100, 0, 0, true);
            Context context = getContext();
            if (context != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.fxm, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -65536;
                }
                int iLJFF = C497740JfY.LJFF(R.color.aaw);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.fx1, context);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = -1;
                }
                c19p4.LLIZ = iIntValue;
                c19p4.LLIZLLLIL = iLJFF;
                c19p4.LLLII = iIntValue2;
                c19p4.setUpUiColor(false);
            }
            if (C497740JfY.LJJ()) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19p4);
                c19p4.setScaleX(-1.0f);
            }
            c19p4.setVisibilityListener(new InterfaceC769710UHh() { // from class: X.0UHY
                @Override // X.InterfaceC769710UHh
                public final void LJIIJJI(int i, int i2) {
                    C0UHX c0uhx;
                    C0UHX c0uhx2;
                    if (i != 4 && i != 8) {
                        if (i == 0) {
                            if ((i2 != 4 && i2 != 8) || (c0uhx2 = this.LIZ.LLJJIII) == null) {
                                return;
                            }
                            c0uhx2.LIZ();
                            return;
                        }
                        return;
                    }
                    if (i2 != 0 || (c0uhx = this.LIZ.LLJJIII) == null) {
                        return;
                    }
                    c0uhx.LIZIZ();
                }
            });
        }
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C12ES.LJIILL(0, imageView);
        }
        if (this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJL = true;
            UR();
        }
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, CountDownForAllV2SelfReachTargetEvent.class, new AwS591S0100000_12(this, 130));
            dataChannel.BQ2(this, CountDownForAllV2StatusChangeEvent.class, new AwS591S0100000_12(this, 131));
        }
        C474640IjO.LJFF = new AwS97S1000000_12(this.LLJILLL, 16);
        if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getMultiGuestBeautyLogManager() != null) {
            C0UD7.LJIIJJI = C924620aAW.LJIILL();
            MultiGuestEffectViewModel multiGuestEffectViewModel2 = this.LLIZLLLIL;
            if (multiGuestEffectViewModel2 != null && (c0u78WQ2 = multiGuestEffectViewModel2.wQ2()) != null) {
                C0UD7.LJIIJ = c0u78WQ2;
            }
        }
        if (this.LLJJJJ && EnableAudienceEffectControlSetting.INSTANCE.enable()) {
            C0UAH effectControlMessageHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectControlMessageHelper();
            MultiGuestEffectViewModel multiGuestEffectViewModel3 = this.LLIZLLLIL;
            if (multiGuestEffectViewModel3 != null) {
                c0u78WQ22 = multiGuestEffectViewModel3.wQ2();
            }
            effectControlMessageHelper.getClass();
            C20441214yg.LJIIIZ("EffectControlMessage", "consumeIMOnGuestPreviewPanel");
            if (c0u78WQ22 != null && (effectControlMessage = C0UEH.LJI) != null) {
                C0UEH.LJ(effectControlMessage, c0u78WQ22);
            }
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).preloadMultiGuestEffects(this.LLJILJILJ, this.LLJILJIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.df7, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Boolean] */
    public static final MultiGuestEffectSwitchFragment SR(InterfaceC923870a9J interfaceC923870a9J, C0UHX c0uhx, boolean z, InterfaceC769650UHb interfaceC769650UHb, FrameLayout frameLayout, FrameLayout frameLayout2, Integer num, C0UHS c0uhs, String str, LiveEffect liveEffect, boolean z2) {
        C19P4 c19p4LIZJ;
        LLJL.getClass();
        MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment = new MultiGuestEffectSwitchFragment();
        multiGuestEffectSwitchFragment.LLJJJIL = interfaceC923870a9J;
        C20136513qd c20136513qd = multiGuestEffectSwitchFragment.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        c20136513qd.LL = Boolean.valueOf(z);
        if (c0uhx != null) {
            c19p4LIZJ = c0uhx.LIZJ();
        } else {
            c19p4LIZJ = null;
        }
        multiGuestEffectSwitchFragment.LLILLJJLI = c19p4LIZJ;
        multiGuestEffectSwitchFragment.LLJJIII = c0uhx;
        multiGuestEffectSwitchFragment.LLJJIJI = interfaceC769650UHb;
        multiGuestEffectSwitchFragment.LLJI = frameLayout2;
        multiGuestEffectSwitchFragment.LLJ = frameLayout;
        multiGuestEffectSwitchFragment.LLJJI = num;
        multiGuestEffectSwitchFragment.LLJJIJIIJIL = c0uhs;
        multiGuestEffectSwitchFragment.LLJILJIL = 1;
        multiGuestEffectSwitchFragment.LLJILLL = str;
        multiGuestEffectSwitchFragment.LLJJIJIL = liveEffect;
        multiGuestEffectSwitchFragment.LLJJJJ = z2;
        return multiGuestEffectSwitchFragment;
    }
}
