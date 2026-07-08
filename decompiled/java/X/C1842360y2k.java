package X;

import Y.ARunnableS60S0300000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.dataChannel.GameLiveIsBackgroundData;
import com.bytedance.android.livesdk.livesetting.broadcast.GameStopBackgroundAnimationSetting;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS428S0200000_27;

/* JADX INFO: renamed from: X.0y2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842360y2k {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIJI;
    public DataChannel LIZ;
    public final C1842430y2r LIZIZ;
    public final C1842650y3D LIZJ;
    public final C1842650y3D LIZLLL;
    public final C1842650y3D LJ;
    public final C1842650y3D LJFF;
    public final C1842650y3D LJI;
    public final C1842650y3D LJII;
    public final C1842650y3D LJIIIIZZ;
    public final C1842650y3D LJIIIZ;
    public final C1842650y3D LJIIJ;
    public final C1842650y3D LJIIJJI;
    public final C1842650y3D LJIIL;
    public final C1842650y3D LJIILIIL;
    public final C1842650y3D LJIILJJIL;
    public final C1844320y5u LJIILL;
    public final C1844320y5u LJIILLIIL;
    public ARunnableS60S0300000_27 LJIIZILJ;
    public boolean LJIJ = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1842360y2k.class, "generalSingleTransitionProcessor", "getGeneralSingleTransitionProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/GeneralSingleTransitionProcessor;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1842360y2k.class, "generalAdvancedTransitionProcessor", "getGeneralAdvancedTransitionProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/GeneralAdvancedTransitionProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1842360y2k.class, "enterRankProcessor", "getEnterRankProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/EnterRankProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1842360y2k.class, "generalAdvancedTransitionAdaptingForIconChangeProcessor", "getGeneralAdvancedTransitionAdaptingForIconChangeProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/GeneralAdvancedTransitionAdaptingForIconChangeProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1842360y2k.class, "riseAndFallProcessor", "getRiseAndFallProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/RiseAndFallProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1842360y2k.class, "countDownProcessor", "getCountDownProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/CountDownProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1842360y2k.class, "lastPeriodResultProcessor", "getLastPeriodResultProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/LastPeriodResultProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1842360y2k.class, "riseAndFallAlphaProcessor", "getRiseAndFallAlphaProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/sticker/RiseAndFallAlphaProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1842360y2k.class, "enterAndDropAlphaProcessor", "getEnterAndDropAlphaProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/sticker/EnterAndDropAlphaProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1842360y2k.class, "defaultProcessor", "getDefaultProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/DefaultProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1842360y2k.class, "marqueeProcessor", "getMarqueeProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/processor/MarqueeProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1842360y2k.class, "collapseProcessor", "getCollapseProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/expand/CollapseProcessor;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1842360y2k.class, "expandProcessor", "getExpandProcessor()Lcom/bytedance/android/live/rank/impl/entrance/animation/expand/ExpandProcessor;", 0);
        c09r3.getClass();
        LJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13};
    }

    public final C1843210y47 LIZ() {
        return (C1843210y47) this.LIZLLL.getValue(this, LJIJI[1]);
    }

    public final C1842600y38 LIZJ() {
        return (C1842600y38) this.LJIIL.getValue(this, LJIJI[10]);
    }

    public final boolean LIZLLL() {
        return this.LIZIZ.LJIL == null;
    }

    public final C1842470y2v LIZIZ() {
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        C1810410xDD c1810410xDD2;
        RankTypeV2 rankTypeV22;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getInAnimationTextInfo - ");
        C1842470y2v c1842470y2v = this.LIZIZ.LJIJ;
        Integer numValueOf = null;
        sbLIZ.append((c1842470y2v == null || (c1810410xDD2 = c1842470y2v.LIZ) == null || (rankTypeV22 = c1810410xDD2.LIZIZ) == null) ? null : Integer.valueOf(rankTypeV22.type));
        sbLIZ.append(" - ");
        C1842470y2v c1842470y2v2 = this.LIZIZ.LJIJ;
        if (c1842470y2v2 != null && (c1810410xDD = c1842470y2v2.LJIIIIZZ) != null && (rankTypeV2 = c1810410xDD.LIZIZ) != null) {
            numValueOf = Integer.valueOf(rankTypeV2.type);
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        return this.LIZIZ.LJIJ;
    }

    public final void LJ(C1810410xDD c1810410xDD, String str) {
        C1810690xDf.LIZ.getClass();
        C1810690xDf.LIZIZ = str;
        C1810690xDf.LJJIIZI(c1810410xDD, this.LIZ, "room_topleft", false);
    }

    public final void LJFF(C1842470y2v c1842470y2v, C1842470y2v c1842470y2v2) {
        Integer numValueOf;
        RankAnimationInfo rankAnimationInfo;
        if (GameStopBackgroundAnimationSetting.INSTANCE.getValue() && C176600m4.LIZIZ((Boolean) DataChannelGlobal.LLILZ.gg0(GameLiveIsBackgroundData.class))) {
            C20441214yg.LIZIZ("Ranking Entrance Unification", "play Animation Exit: Game is background!");
            this.LJIIZILJ = new ARunnableS60S0300000_27(this, c1842470y2v, c1842470y2v2, 7);
            return;
        }
        C20441214yg.LIZIZ("Ranking Entrance Unification", "AnimationManager - play");
        if (c1842470y2v == null) {
            ((AbstractC1842530y31) this.LJIIJJI.getValue(this, LJIJI[9])).LJIIIIZZ(c1842470y2v2, null);
            return;
        }
        if (this.LIZIZ.LJIL != null && (rankAnimationInfo = c1842470y2v2.LJI) != null && rankAnimationInfo.type == RankAnimationType.LIZJ.type) {
            C20441214yg.LIZIZ("Ranking Entrance Unification", "check currentProcessor != null return");
            return;
        }
        if (LIZJ().LJJIIZI != 0) {
            RankAnimationInfo rankAnimationInfo2 = c1842470y2v2.LJI;
            if (rankAnimationInfo2 != null) {
                numValueOf = Integer.valueOf(rankAnimationInfo2.type);
            } else {
                numValueOf = null;
            }
            int i = RankAnimationType.LJ.type;
            if (numValueOf == null || numValueOf.intValue() != i) {
                int i2 = RankAnimationType.LJFF.type;
                if (numValueOf == null || numValueOf.intValue() != i2) {
                    int i3 = RankAnimationType.LJIIIZ.type;
                    if (numValueOf == null || numValueOf.intValue() != i3) {
                        int i4 = RankAnimationType.LJIIJ.type;
                        if (numValueOf == null || numValueOf.intValue() != i4) {
                            int i5 = RankAnimationType.LJIILLIIL.type;
                            if (numValueOf == null || numValueOf.intValue() != i5) {
                                int i6 = RankAnimationType.LJIIZILJ.type;
                                if (numValueOf == null || numValueOf.intValue() != i6) {
                                    int i7 = RankAnimationType.LJIIJJI.type;
                                    if (numValueOf == null || numValueOf.intValue() != i7) {
                                        int i8 = RankAnimationType.LJIIL.type;
                                        if (numValueOf == null || numValueOf.intValue() != i8) {
                                            int i9 = RankAnimationType.LIZ.type;
                                            if (numValueOf == null || numValueOf.intValue() != i9) {
                                                int i10 = RankAnimationType.LIZIZ.type;
                                                if (numValueOf == null || numValueOf.intValue() != i10) {
                                                    int i11 = RankAnimationType.LJIILIIL.type;
                                                    if (numValueOf == null || numValueOf.intValue() != i11) {
                                                        int i12 = RankAnimationType.LJIILJJIL.type;
                                                        if (numValueOf == null || numValueOf.intValue() != i12) {
                                                            int i13 = RankAnimationType.LJIJ.type;
                                                            if (numValueOf == null || numValueOf.intValue() != i13) {
                                                                int i14 = RankAnimationType.LJIJI.type;
                                                                if (numValueOf == null || numValueOf.intValue() != i14) {
                                                                    int i15 = RankAnimationType.LJIJJ.type;
                                                                    if (numValueOf == null || numValueOf.intValue() != i15) {
                                                                        C20441214yg.LIZIZ("Ranking Entrance Unification", "set pendingRunnable");
                                                                        LIZJ().LJJIIZ = new ARunnableS60S0300000_27(this, c1842470y2v, c1842470y2v2, 8);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C1842600y38 c1842600y38LIZJ = this.LIZIZ.LIZ.LIZJ();
            c1842600y38LIZJ.LJJIJIIJI = true;
            ValueAnimator valueAnimator = c1842600y38LIZJ.LJJIJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            LIZJ().LJJIIZ = null;
            LJI(c1842470y2v, c1842470y2v2);
            return;
        }
        LJI(c1842470y2v, c1842470y2v2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0208, code lost:
    
        if (r20.LJ > 0) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C1842470y2v r19, X.C1842470y2v r20) {
        /*
            Method dump skipped, instruction units count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1842360y2k.LJI(X.0y2v, X.0y2v):void");
    }

    public final void LJII(int i, int i2) {
        this.LIZIZ.LJIIL.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public C1842360y2k(CardView cardView, InterfaceC1842810y3T interfaceC1842810y3T, DataChannel dataChannel, Context context, boolean z, C1843120y3y c1843120y3y, Function0 function0, Function0 function02) {
        this.LIZ = dataChannel;
        this.LIZIZ = new C1842430y2r(this, interfaceC1842810y3T, context, c1843120y3y, function0, function02);
        this.LIZJ = new C1842650y3D(new AwS428S0200000_27(cardView, this, 68));
        this.LIZLLL = new C1842650y3D(new AwS428S0200000_27(cardView, this, 67));
        this.LJ = new C1842650y3D(new AwS428S0200000_27(cardView, this, 64));
        this.LJFF = new C1842650y3D(new AwS428S0200000_27(cardView, this, 66));
        this.LJI = new C1842650y3D(new AwS428S0200000_27(cardView, this, 72));
        this.LJII = new C1842650y3D(new AwS428S0200000_27(cardView, this, 61));
        this.LJIIIIZZ = new C1842650y3D(new AwS428S0200000_27(cardView, this, 69));
        this.LJIIIZ = new C1842650y3D(new AwS428S0200000_27(cardView, this, 71));
        this.LJIIJ = new C1842650y3D(new AwS428S0200000_27(cardView, this, 63));
        this.LJIIJJI = new C1842650y3D(new AwS428S0200000_27(cardView, this, 62));
        this.LJIIL = new C1842650y3D(new AwS428S0200000_27(cardView, this, 70));
        this.LJIILIIL = new C1842650y3D(new AwS428S0200000_27(cardView, this, 60));
        this.LJIILJJIL = new C1842650y3D(new AwS428S0200000_27(cardView, this, 65));
        this.LJIILL = (C1844320y5u) cardView.findViewById(R.id.tv_ranking_entrance_text);
        this.LJIILLIIL = (C1844320y5u) cardView.findViewById(R.id.tv_ranking_entrance_animation_text);
    }
}
