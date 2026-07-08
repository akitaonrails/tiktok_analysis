package Y;

import X.AbstractC1126600fQI;
import X.AnonymousClass0054;
import X.C013C;
import X.C0GRR;
import X.C0IJT;
import X.C1094360eaI;
import X.C1112390f3N;
import X.C1117710fBx;
import X.C1124290fMZ;
import X.C1125870fP7;
import X.C1126410fPz;
import X.C1126460fQ4;
import X.C1128590fTV;
import X.C1128640fTa;
import X.C1128970fU7;
import X.C1129710fVJ;
import X.C1130100fVw;
import X.C1130140fW0;
import X.C1131070fXV;
import X.C1131080fXW;
import X.C1131790fYf;
import X.C1139230fkf;
import X.C1139310fkn;
import X.C1142730fqJ;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1146260fw0;
import X.C1146270fw1;
import X.C1149220g0m;
import X.C1151950g5B;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C1389890mGx;
import X.C13LP;
import X.C15DS;
import X.C15DT;
import X.C15DV;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1C7U;
import X.C20441214yg;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C781550UlF;
import X.C786410Ut5;
import X.EnumC1087130eOd;
import X.InterfaceC1142720fqI;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.livesetting.level.GiftPanelAnimatorConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateCTNViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS44S0102000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS28S0101000_17 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1324720kZq c1324720kZq = ((C1146270fw1) this.l0).LLILZIL;
        if (c1324720kZq != null && c1324720kZq.getVisibility() == 8) {
            C1324720kZq c1324720kZq2 = ((C1146270fw1) this.l0).LLILZIL;
            if (c1324720kZq2 != null) {
                c1324720kZq2.setActualImageResource(this.i1);
            }
            C1324720kZq c1324720kZq3 = ((C1146270fw1) this.l0).LLILZIL;
            if (c1324720kZq3 != null) {
                C500260Jjc.LLFFF(c1324720kZq3);
            }
            C1146270fw1 c1146270fw1 = (C1146270fw1) this.l0;
            if (c1146270fw1.LLJJ) {
                C1324720kZq c1324720kZq4 = c1146270fw1.LLILZIL;
                if (c1324720kZq4 != null) {
                    C786410Ut5.h5(c1324720kZq4, 0.0f);
                }
            } else {
                C1324720kZq c1324720kZq5 = c1146270fw1.LLILZIL;
                if (c1324720kZq5 != null) {
                    C786410Ut5.h5(c1324720kZq5, 1.0f);
                }
            }
        }
        C0GRR c0grr = ((C1146270fw1) this.l0).LLIZ;
        if (c0grr != null && c0grr.getVisibility() == 8) {
            C20441214yg.LIZIZ("MatchMvpSeatView", "stroke view set visible");
            C1146270fw1 c1146270fw12 = (C1146270fw1) this.l0;
            if (c1146270fw12.LLIZ != null) {
                c1146270fw12.getRingColor();
            }
            C0GRR c0grr2 = ((C1146270fw1) this.l0).LLIZ;
            if (c0grr2 != null) {
                int visibility = c0grr2.getVisibility();
                c0grr2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c0grr2);
            }
        }
        C1324720kZq c1324720kZq6 = ((C1146270fw1) this.l0).LLILLL;
        if (c1324720kZq6 != null) {
            C786410Ut5.LLJJIII(c1324720kZq6, 0);
        }
    }

    public final void LIZ$1() {
        long jLIZIZ = (this.i1 / ((int) C497740JfY.LIZIZ(40.0f))) * LSPassThroughRecordSizeConfig.DEFAULT;
        final C013C c013c = new C013C();
        ValueAnimator valueAnimator = ((C1149220g0m) this.l0).LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((C1149220g0m) this.l0).LLIZLLLIL = ValueAnimator.ofInt(0, this.i1);
        final C1149220g0m c1149220g0m = (C1149220g0m) this.l0;
        ValueAnimator valueAnimator2 = c1149220g0m.LLIZLLLIL;
        if (valueAnimator2 != null) {
            final int i = this.i1;
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0g0n
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    if (c1149220g0m.LLILLL == null) {
                        return;
                    }
                    int iIntValue = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                    HorizontalScrollView horizontalScrollView = c1149220g0m.LLILLL;
                    if (horizontalScrollView != null) {
                        int scrollX = iIntValue - horizontalScrollView.getScrollX();
                        if (C497740JfY.LJJ()) {
                            HorizontalScrollView horizontalScrollView2 = c1149220g0m.LLILLL;
                            if (horizontalScrollView2 != null) {
                                horizontalScrollView2.scrollTo(i - ((Integer) valueAnimator3.getAnimatedValue()).intValue(), 0);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            HorizontalScrollView horizontalScrollView3 = c1149220g0m.LLILLL;
                            if (horizontalScrollView3 != null) {
                                horizontalScrollView3.scrollBy(scrollX, 0);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        if (((Integer) valueAnimator3.getAnimatedValue()).intValue() == i) {
                            C013C c013c2 = c013c;
                            if (!c013c2.element && c1149220g0m.LL) {
                                c013c2.element = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            });
        }
        C1149220g0m c1149220g0m2 = (C1149220g0m) this.l0;
        ValueAnimator valueAnimator3 = c1149220g0m2.LLIZLLLIL;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new AAListenerS328S0100000_17(c1149220g0m2, 4));
        }
        C1149220g0m c1149220g0m3 = (C1149220g0m) this.l0;
        ValueAnimator valueAnimator4 = c1149220g0m3.LLIZLLLIL;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new AAListenerS328S0100000_17(c1149220g0m3, 3));
        }
        ValueAnimator valueAnimator5 = ((C1149220g0m) this.l0).LLIZLLLIL;
        if (valueAnimator5 != null) {
            valueAnimator5.setDuration(jLIZIZ);
        }
        ValueAnimator valueAnimator6 = ((C1149220g0m) this.l0).LLIZLLLIL;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public final void LIZ$2() {
        if (((C1126410fPz) this.l0).itemView.getParent() != null) {
            C1126410fPz c1126410fPz = (C1126410fPz) this.l0;
            int i = this.i1;
            c1126410fPz.getClass();
            C15DT[] c15dtArr = new C15DT[2];
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1126410fPz.LLJJLIIIJLLLLLLLZ;
            final Long lValueOf = abstractC1126600fQI != null ? Long.valueOf(abstractC1126600fQI.LJFF()) : null;
            c15dtArr[0] = new C15DT(lValueOf) { // from class: X.0fQ2
                {
                    super(0, new AwS561S0100000_17(lValueOf, 508), null, null, AFwS205S0000000_17.get$arr$(262), 56);
                }
            };
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1126410fPz.LLJJLIIIJLLLLLLLZ;
            c15dtArr[1] = new C1125870fP7(abstractC1126600fQI2 != null ? Long.valueOf(abstractC1126600fQI2.LJFF()) : null, new AwS596S0100000_17(c1126410fPz, 319), new AwS561S0100000_17(c1126410fPz, 336), new AwS561S0100000_17(c1126410fPz, 337), i);
            AnimatorSet animatorSetLIZ = C15DS.LIZ(C13LP.LJLLLL(new AComparatorS36S0000000_17(14), C1697810uHb.LJIIJJI(c15dtArr)), new C15DV(c1126410fPz.LLLLLIL, c1126410fPz.LLJILLL, c1126410fPz.LLILZ));
            c1126410fPz.LLLLLLIL = animatorSetLIZ;
            if (animatorSetLIZ != null) {
                animatorSetLIZ.start();
            }
        }
    }

    public final void LIZ$3() {
        C1139310fkn c1139310fkn = (C1139310fkn) ((HashMap) C1142730fqJ.LIZIZ).get(((C1139230fkf) this.l0).LIZ);
        if (c1139310fkn == null) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) c1139310fkn.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1142720fqI) it2.next()).onProgress(this.i1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final void LIZ$4() {
        String str;
        List<GiftPanelAnimatorConfig> list = UserLevelSettings.INSTANCE.getUserLevelConfig().giftPanelAnimatorConfig;
        String str2 = "";
        if (list != null) {
            str = "";
            int i = 0;
            for (GiftPanelAnimatorConfig giftPanelAnimatorConfig : list) {
                if (giftPanelAnimatorConfig != null) {
                    int i2 = this.i1;
                    int i3 = giftPanelAnimatorConfig.grade;
                    if (i2 <= i3 && (i > i3 || i == 0)) {
                        str2 = giftPanelAnimatorConfig.channel;
                        str = giftPanelAnimatorConfig.lightName;
                        i = i3;
                    }
                }
            }
        } else {
            str = "";
        }
        C1117710fBx c1117710fBx = (C1117710fBx) this.l0;
        C786410Ut5.LLJJI(c1117710fBx.LLJJIII, 0);
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LJIILJJIL = true;
        c1143920fsE.LIZ = c1117710fBx.LLJJIII;
        c1143920fsE.LIZIZ = str2;
        c1143920fsE.LIZJ = str;
        c1143920fsE.LJFF = true;
        c1143920fsE.LJ = new C1151950g5B(c1117710fBx, 4);
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        ?? U61 = iHostResource != null ? iHostResource.u61(str2) : 0;
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        int i4 = c1094360eaIHP != null ? c1094360eaIHP.LIZ : -1;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_gecko_resource_exist");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf((int) U61), "is_exist");
        c474500IjALIZ.LJJII("gift_panel_level_upgrade", Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "grade");
        c474500IjALIZ.LIZ();
        C1143680frq.LJIIIIZZ(c1143920fsE);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010a A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:22:0x0099, B:23:0x00a7, B:25:0x00ad, B:27:0x00b8, B:32:0x00c6, B:33:0x00cc, B:35:0x00d2, B:36:0x00d6, B:38:0x00dc, B:39:0x00de, B:46:0x00f3, B:48:0x00f7, B:51:0x0101, B:53:0x010a, B:59:0x0115, B:62:0x011b, B:64:0x0121, B:67:0x0129, B:50:0x00ff), top: B:136:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS28S0101000_17.LIZ$5():void");
    }

    public final void LIZ$6() {
        if (((C1126460fQ4) this.l0).itemView.getParent() != null) {
            C1126460fQ4 c1126460fQ4 = (C1126460fQ4) this.l0;
            int i = this.i1;
            c1126460fQ4.getClass();
            AbstractC1126600fQI<?> abstractC1126600fQI = c1126460fQ4.LLIZLLLIL;
            AnimatorSet animatorSetLIZ = C15DS.LIZ(C13LP.LJLLLL(new AComparatorS36S0000000_17(30), Collections.singletonList(new C1125870fP7(abstractC1126600fQI != null ? Long.valueOf(abstractC1126600fQI.LJI()) : null, new AwS596S0100000_17(c1126460fQ4, 683), new AwS561S0100000_17(c1126460fQ4, 644), new AwS561S0100000_17(c1126460fQ4, 645), i))), new C15DV(c1126460fQ4.LLJLIL, c1126460fQ4.LLILZIL, c1126460fQ4.LLILLL));
            c1126460fQ4.LLJL = animatorSetLIZ;
            if (animatorSetLIZ != null) {
                animatorSetLIZ.start();
            }
        }
    }

    public final void LIZ$7() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) this.l0;
        String str = liveNewGiftPanelWidget.LLLFF;
        C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
        String str2 = c1128970fU7.LIZJ;
        int i = liveNewGiftPanelWidget.LLJZ;
        int i2 = liveNewGiftPanelWidget.LLJZIJLIL;
        C1128590fTV c1128590fTV = C1128590fTV.LIZ;
        int i3 = C1128590fTV.LJ;
        int i4 = this.i1;
        C1131790fYf c1131790fYf = new C1131790fYf(str, str2, i, i2, i3, i4, Math.min(i4, Math.max(C1128590fTV.LJJIJ, C1128590fTV.LJJIIZI)), Math.min(this.i1, C1128590fTV.LJJIIZI), true);
        C1130140fW0 c1130140fW0 = new C1130140fW0(c1128590fTV);
        C1129710fVJ c1129710fVJ = new C1129710fVJ(c1128590fTV, ((LiveNewGiftPanelWidget) this.l0).LLJLILLLLZIIL - c1128970fU7.LJII);
        C1128640fTa c1128640fTa = new C1128640fTa(c1128590fTV);
        C1131070fXV.LJIIIZ(c1131790fYf, c1130140fW0, c1129710fVJ, c1128640fTa);
        C1131080fXW.LIZIZ(c1131790fYf, c1130140fW0, c1129710fVJ, c1128640fTa, SystemClock.uptimeMillis() - ((LiveNewGiftPanelWidget) this.l0).LLJLILLLLZIIL, C1128590fTV.LIZJ(), C1128590fTV.LIZLLL(), C1128590fTV.LJI, 0L, 0L, 0);
    }

    public final void LIZ$8() {
        long jLIZIZ = (this.i1 / ((int) C497740JfY.LIZIZ(40.0f))) * LSPassThroughRecordSizeConfig.DEFAULT;
        ValueAnimator valueAnimator = ((C1146260fw0) this.l0).LLJLLIL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((C1146260fw0) this.l0).LLJLLIL = ValueAnimator.ofInt(0, this.i1);
        C1146260fw0 c1146260fw0 = (C1146260fw0) this.l0;
        ValueAnimator valueAnimator2 = c1146260fw0.LLJLLIL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS70S0101000_17(this.i1, c1146260fw0, 2));
        }
        ValueAnimator valueAnimator3 = ((C1146260fw0) this.l0).LLJLLIL;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(jLIZIZ);
        }
        ValueAnimator valueAnimator4 = ((C1146260fw0) this.l0).LLJLLIL;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public static final void run$0(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("MatchMvpSeatView@5104.setMvpSeat$2");
        try {
            aRunnableS28S0101000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchMvpSeatView@5104.setMvpSeat$2");
    }

    public static final void run$1(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("MatchMarqueeView@9316.doTipsScrollAnimator$1");
        try {
            aRunnableS28S0101000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchMarqueeView@9316.doTipsScrollAnimator$1");
    }

    public static final void run$10(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftPanelBottomLeaf@1211.tryShowPanelBottom$4");
        try {
            RecyclerView recyclerView = ((C1124290fMZ) aRunnableS28S0101000_17.l0).LLJ;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(aRunnableS28S0101000_17.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelBottomLeaf@1211.tryShowPanelBottom$4");
    }

    public static final void run$11(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftPanelLeafV2@f893.onGiftPanelShowMonitor$1$1");
        try {
            aRunnableS28S0101000_17.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.onGiftPanelShowMonitor$1$1");
    }

    public static final void run$12(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BackpackGiftUtils@8b34.showBackpackGiftToast$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) aRunnableS28S0101000_17.l0);
            c1389890mGx.LJIIIZ(aRunnableS28S0101000_17.i1);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackpackGiftUtils@8b34.showBackpackGiftToast$1");
    }

    public static final void run$13(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aRunnableS28S0101000_17.l0;
        int i = aRunnableS28S0101000_17.i1;
        C1112390f3N c1112390f3N = publicScreenWidget.LLJLLIL;
        if (c1112390f3N != null && i < c1112390f3N.LIZLLL()) {
            C1112390f3N c1112390f3N2 = publicScreenWidget.LLJLLIL;
            c1112390f3N2.getClass();
            c1112390f3N2.LIZIZ(new AwS44S0102000_17(c1112390f3N2, i, 0, 3));
            publicScreenWidget.LLJJIII = false;
            publicScreenWidget.d2(EnumC1087130eOd.FOCUS, false);
            C1112390f3N c1112390f3N3 = publicScreenWidget.LLJLLIL;
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(publicScreenWidget, 276);
            C781550UlF c781550UlF = c1112390f3N3.LIZ;
            if (c781550UlF != null) {
                HandlerHook.viewPost(c781550UlF, aRunnableS117S0100000_17);
            }
        }
    }

    public static final void run$14(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LandscapeGiftPanelViewHolder@266f.giftIconLoaded$1");
        try {
            aRunnableS28S0101000_17.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandscapeGiftPanelViewHolder@266f.giftIconLoaded$1");
    }

    public static final void run$15(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewGiftPanelWidget@197e.monitorPanelShow$1");
        try {
            aRunnableS28S0101000_17.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewGiftPanelWidget@197e.monitorPanelShow$1");
    }

    public static final void run$16(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BattleNewMvpContainerLayout@9816.doTipsScrollAnimator$1");
        try {
            aRunnableS28S0101000_17.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BattleNewMvpContainerLayout@9816.doTipsScrollAnimator$1");
    }

    public static final void run$2(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewGiftBottomWidget@e9ff.initTabs$1");
        try {
            RecyclerView recyclerView = ((LiveNewGiftBottomWidget) aRunnableS28S0101000_17.l0).LLILLJJLI;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.scrollToPosition(aRunnableS28S0101000_17.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewGiftBottomWidget@e9ff.initTabs$1");
    }

    public static final void run$3(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewGiftPanelWidget@197e.changeData$2");
        try {
            RecyclerView recyclerView = ((LiveNewGiftPanelWidget) aRunnableS28S0101000_17.l0).LL;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(aRunnableS28S0101000_17.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewGiftPanelWidget@197e.changeData$2");
    }

    public static final void run$4(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewGiftPanelWidget@197e.changeData$3");
        try {
            RecyclerView recyclerView = ((LiveNewGiftPanelWidget) aRunnableS28S0101000_17.l0).LL;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(aRunnableS28S0101000_17.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewGiftPanelWidget@197e.changeData$3");
    }

    public static final void run$5(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewGiftPanelWidget@197e.postScroll$1");
        try {
            RecyclerView recyclerView = ((LiveNewGiftPanelWidget) aRunnableS28S0101000_17.l0).LL;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(aRunnableS28S0101000_17.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewGiftPanelWidget@197e.postScroll$1");
    }

    public static final void run$6(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("AgeGateCTNViewModel@704c.pageChangeInPosition$1");
        try {
            ((AgeGateCTNViewModel) aRunnableS28S0101000_17.l0).LLILLJJLI.postValue(Integer.valueOf(aRunnableS28S0101000_17.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AgeGateCTNViewModel@704c.pageChangeInPosition$1");
    }

    public static final void run$7(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftPanelViewHolderV2@abf8.giftIconLoaded$2");
        try {
            aRunnableS28S0101000_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftPanelViewHolderV2@abf8.giftIconLoaded$2");
    }

    public static final void run$8(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("CommentGiftResourceFetcher@97b4.onProgress$1");
        try {
            aRunnableS28S0101000_17.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentGiftResourceFetcher@97b4.onProgress$1");
    }

    public static final void run$9(ARunnableS28S0101000_17 aRunnableS28S0101000_17) {
        boolean zLIZ;
        C1C7U.LIZ("UserLevelPanel@7018.shineAnimation$runnable$1");
        try {
            aRunnableS28S0101000_17.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserLevelPanel@7018.shineAnimation$runnable$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS28S0101000_17(com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget r2, int r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                case 4: goto Le;
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.i1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.i1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS28S0101000_17.<init>(com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget, int, int):void");
    }

    public ARunnableS28S0101000_17(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
