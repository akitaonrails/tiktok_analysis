package com.bytedance.android.live.rank.impl.entrance.widget;

import X.AbstractC1842530y31;
import X.AbstractViewOnClickListenerC1105820esm;
import X.C011Z;
import X.C0GY9;
import X.C1086060eMu;
import X.C1091250eVH;
import X.C1119850fFP;
import X.C1133830fbx;
import X.C1161920gLG;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1810410xDD;
import X.C1810690xDf;
import X.C1810700xDg;
import X.C1811840xFW;
import X.C1842360y2k;
import X.C1842380y2m;
import X.C1842420y2q;
import X.C1842430y2r;
import X.C1842460y2u;
import X.C1842470y2v;
import X.C1842480y2w;
import X.C1842520y30;
import X.C1842540y32;
import X.C1843120y3y;
import X.C1844320y5u;
import X.C1864940ydA;
import X.C1CC2;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C497740JfY;
import X.C500260Jjc;
import X.C635860Owq;
import X.C775900Uc8;
import X.C786410Ut5;
import X.EnumC1100320eju;
import X.EnumC1811400xEo;
import X.EnumC1842500y2y;
import X.EnumC781860Ulk;
import X.InterfaceC1114220f6K;
import X.InterfaceC1702950uPt;
import X.InterfaceC1702970uPv;
import X.InterfaceC1842620y3A;
import X.InterfaceC1842780y3Q;
import X.InterfaceC1842810y3T;
import X.InterfaceC1842820y3U;
import X.InterfaceC919320a1y;
import Y.ARunnableS127S0100000_27;
import Y.AUListenerS275S0100000_27;
import Y.AUListenerS73S0101000_27;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.dataChannel.GameLiveIsBackgroundData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameStopBackgroundAnimationSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingActiveUpdateSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingDowngradeServiceSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveMusicSpotlightSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingCompetitiveAtmosphereSetting;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.LiveRankingCompetitiveAtmosphereConfig;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.CreatorRankingBGHighlightBeforeSettlementChannel;
import com.bytedance.android.livesdk.rank.impl.CreatorRankingSettlementCountdownAnimationListChannel;
import com.bytedance.android.livesdk.rank.impl.MockMusicSpotlightFirstLaunchAnimationChannel;
import com.bytedance.android.livesdk.rank.impl.OpenRankDialogEvent;
import com.bytedance.android.livesdk.rank.impl.PopularityRankingBonusTimeAnimationChannel;
import com.bytedance.android.livesdk.rank.impl.RankingEntranceRefreshEvent;
import com.bytedance.android.livesdk.rank.impl.RemoveCreatorRankingCacheDataEvent;
import com.bytedance.android.livesdk.rank.impl.RemoveCreatorRankingEntranceAffiliatedInfoEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class RankEntranceWidget extends PerformProcessWidget implements InterfaceC919320a1y, InterfaceC1842810y3T, InterfaceC1702950uPt, InterfaceC1842620y3A {
    public C1842380y2m LL;
    public final EnumC1100320eju LLILLL;
    public final Function0<? extends C1091250eVH> LLILZ;
    public final Function0<Integer> LLILZIL;
    public CardView LLILZLL;
    public C1842360y2k LLIZ;
    public InterfaceC1842780y3Q LLIZLLLIL;
    public C1842470y2v LLJ;
    public Room LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public C1843120y3y LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public boolean LLILLJJLI = false;
    public EnumC1100320eju LLJJ = EnumC1100320eju.EXPAND;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h3w;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1842810y3T
    public final void J0() {
        C1842360y2k c1842360y2k;
        C1842470y2v c1842470y2v;
        C1842380y2m c1842380y2m;
        int size;
        RankAnimationInfo rankAnimationInfo;
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "RankEntranceWidget - onLoopListener");
        if (this.LLJJ == EnumC1100320eju.COLLAPSE || (c1842360y2k = this.LLIZ) == null || !c1842360y2k.LIZLLL() || (c1842470y2v = this.LLJ) == null || (c1842380y2m = this.LL) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try loop rank entrances size: ");
        sbLIZ.append(c1842380y2m.LIZJ.size());
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        if (d()) {
            int size2 = c1842380y2m.LIZJ.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    size = 0;
                    break;
                } else {
                    if (Intrinsics.LJFF(((C1842420y2q) ListProtector.get(c1842380y2m.LIZJ, i)).LIZ.LIZIZ, c1842470y2v.LIZ.LIZIZ) && ((C1842420y2q) ListProtector.get(c1842380y2m.LIZJ, i)).LJ == c1842470y2v.LIZJ) {
                        size = (i + 1) % c1842380y2m.LIZJ.size();
                        break;
                    }
                    i++;
                }
            }
            RankAnimationType rankAnimationType = RankAnimationType.LIZ;
            RankAnimationType rankAnimationType2 = RankAnimationType.LIZJ;
            C1842420y2q c1842420y2q = (C1842420y2q) ListProtector.get(c1842380y2m.LIZJ, size);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get delayed animation: ");
            sbLIZ2.append((c1842420y2q == null || (c1810410xDD = c1842420y2q.LIZ) == null || (rankTypeV2 = c1810410xDD.LIZIZ) == null) ? null : Integer.valueOf(rankTypeV2.type));
            sbLIZ2.append(" ,");
            sbLIZ2.append((c1842420y2q == null || (rankAnimationInfo = c1842420y2q.LJIIIIZZ) == null) ? null : Integer.valueOf(rankAnimationInfo.type));
            sbLIZ2.append(", ");
            sbLIZ2.append(rankAnimationType2.type);
            C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ2));
            if (c1842420y2q != null) {
                C1842470y2v c1842470y2vX1 = x1(c1842420y2q);
                RankAnimationInfo rankAnimationInfo2 = new RankAnimationInfo();
                rankAnimationInfo2.type = rankAnimationType2.type;
                RankAnimationInfo rankAnimationInfo3 = c1842420y2q.LJIIIIZZ;
                rankAnimationInfo2.contentText = rankAnimationInfo3 != null ? rankAnimationInfo3.contentText : null;
                RankAnimationInfo rankAnimationInfo4 = c1842470y2vX1.LJI;
                rankAnimationInfo2.setContent(C1133830fbx.LJIILIIL(rankAnimationInfo4 != null ? rankAnimationInfo4.contentText : null, "").toString());
                c1842470y2vX1.LJI = rankAnimationInfo2;
                A1(c1842470y2vX1);
            }
            z1(c1842470y2v, false, c1842470y2v.LIZ.LIZIZ.type);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    @Override // X.InterfaceC1842620y3A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K0() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.K0():boolean");
    }

    @Override // X.InterfaceC1842810y3T
    public final void LIZ() {
        if (this.LLJJ == EnumC1100320eju.EXPAND) {
            this.LLJJIII = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.InterfaceC1842620y3A
    public final boolean LLLFZ() {
        C1810410xDD c1810410xDD;
        C1842470y2v c1842470y2v = this.LLJ;
        RankTypeV2 rankTypeV2 = (c1842470y2v == null || (c1810410xDD = c1842470y2v.LIZ) == null) ? null : c1810410xDD.LIZIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        return Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJJIIZ);
    }

    @Override // X.InterfaceC1842810y3T
    public final void LLLLJI() {
        C1842360y2k c1842360y2k;
        C1842470y2v c1842470y2v;
        if (this.LLJJ == EnumC1100320eju.COLLAPSE || (c1842360y2k = this.LLIZ) == null) {
            return;
        }
        C1842430y2r c1842430y2r = c1842360y2k.LIZIZ;
        if (c1842430y2r.LJIL != null || (c1842470y2v = c1842430y2r.LJIIZILJ) == null) {
            return;
        }
        c1842360y2k.LIZJ().LJIIIIZZ(c1842470y2v, null);
    }

    @Override // X.InterfaceC1842620y3A
    public final boolean c1() {
        C1842360y2k c1842360y2k = this.LLIZ;
        return c1842360y2k != null && c1842360y2k.LIZLLL();
    }

    @Override // X.InterfaceC1842810y3T
    public final boolean d() {
        List<C1842420y2q> list;
        C1842380y2m c1842380y2m = this.LL;
        return (c1842380y2m == null || (list = c1842380y2m.LIZJ) == null || list.size() <= 1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7 A[PHI: r6
      0x01d7: PHI (r6v7 com.bytedance.android.livesdk.rank.api.RankTypeV2) = (r6v0 com.bytedance.android.livesdk.rank.api.RankTypeV2), (r6v8 com.bytedance.android.livesdk.rank.api.RankTypeV2) binds: [B:69:0x01d5, B:67:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df A[PHI: r6
      0x01df: PHI (r6v1 com.bytedance.android.livesdk.rank.api.RankTypeV2) = 
      (r6v0 com.bytedance.android.livesdk.rank.api.RankTypeV2)
      (r6v7 com.bytedance.android.livesdk.rank.api.RankTypeV2)
      (r6v7 com.bytedance.android.livesdk.rank.api.RankTypeV2)
     binds: [B:69:0x01d5, B:71:0x01d9, B:73:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0286 A[PHI: r13
      0x0286: PHI (r13v4 com.bytedance.android.livesdk.rank.api.RankTypeV2) = (r13v1 com.bytedance.android.livesdk.rank.api.RankTypeV2), (r13v5 com.bytedance.android.livesdk.rank.api.RankTypeV2) binds: [B:85:0x0284, B:83:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028e A[PHI: r13
      0x028e: PHI (r13v2 com.bytedance.android.livesdk.rank.api.RankTypeV2) = 
      (r13v1 com.bytedance.android.livesdk.rank.api.RankTypeV2)
      (r13v4 com.bytedance.android.livesdk.rank.api.RankTypeV2)
      (r13v4 com.bytedance.android.livesdk.rank.api.RankTypeV2)
     binds: [B:85:0x0284, B:87:0x0288, B:89:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUnload() {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.onUnload():void");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStart() {
        super.onStart();
        C1842470y2v c1842470y2v = this.LLJ;
        if (c1842470y2v != null) {
            C1811840xFW.LJI(c1842470y2v.LIZ.LIZIZ, true);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C1842470y2v c1842470y2v = this.LLJ;
        if (c1842470y2v != null) {
            C1811840xFW.LJI(c1842470y2v.LIZ.LIZIZ, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            r5 = this;
            super.show()
            boolean r0 = r5.LLJILLL
            if (r0 != 0) goto L26
            r0 = 1
            r5.LLJILLL = r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r5.LLJI
            if (r4 == 0) goto L26
            X.0y2m r3 = r5.LL
            r2 = 0
            if (r3 == 0) goto L2a
            X.0xEo r1 = r3.LIZIZ
        L15:
            X.0xEo r0 = X.EnumC1811400xEo.E_COMMERCE
            if (r1 == r0) goto L27
            if (r3 == 0) goto L1d
            X.0xEo r2 = r3.LIZIZ
        L1d:
            X.0xEo r0 = X.EnumC1811400xEo.GAME_RANK
            if (r2 == r0) goto L27
            java.lang.String r0 = "rank"
        L23:
            X.C0IZP.LIZJ(r4, r0)
        L26:
            return
        L27:
            java.lang.String r0 = "vertical_rank"
            goto L23
        L2a:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.show():void");
    }

    @Override // X.InterfaceC1842620y3A
    public final EnumC1100320eju I0() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1842620y3A
    public final long LLILIL() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1842620y3A
    public final long LLLIIL() {
        return this.LLJJIII;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1(X.C1842470y2v r14) {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.A1(X.0y2v):void");
    }

    @Override // X.InterfaceC1842620y3A
    public final void LJJJJIZL(boolean z) {
        EnumC1811400xEo enumC1811400xEo;
        C1810410xDD c1810410xDD;
        C1810410xDD c1810410xDD2;
        EnumC1100320eju enumC1100320eju = EnumC1100320eju.EXPAND;
        this.LLJJ = enumC1100320eju;
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        C1842380y2m c1842380y2m = this.LL;
        RankTypeV2 rankTypeV2 = null;
        if (c1842380y2m != null) {
            enumC1811400xEo = c1842380y2m.LIZIZ;
        } else {
            enumC1811400xEo = null;
        }
        c1810690xDf.getClass();
        C1810690xDf.LJJJJI(enumC1811400xEo, enumC1100320eju);
        this.LLJJI = SystemClock.elapsedRealtime();
        C1842360y2k c1842360y2k = this.LLIZ;
        if (c1842360y2k != null) {
            C1842520y30 c1842520y30 = (C1842520y30) c1842360y2k.LJIILJJIL.getValue(c1842360y2k, C1842360y2k.LJIJI[12]);
            c1842520y30.LIZIZ.LJIL = c1842520y30;
            if (z) {
                C500260Jjc.LLFFF(c1842520y30.LJIILIIL);
                AbstractC1842530y31.LJIILJJIL(c1842520y30.LJIILIIL, -2);
                C1842520y30.LJIJI(C1842520y30.LJJIIZ, c1842520y30.LJIILIIL);
                AbstractC1842530y31.LJIIJ(c1842520y30.LIZJ);
                int measuredWidth = c1842520y30.LJIILIIL.getMeasuredWidth();
                AbstractC1842530y31.LJIILJJIL(c1842520y30.LJIILIIL, 0);
                C1842520y30.LJIJI(0, c1842520y30.LJIILIIL);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat.setDuration(600L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS73S0101000_27(c1842520y30, measuredWidth, 1));
                valueAnimatorOfFloat.addListener(new C1864940ydA(c1842520y30, 1));
                valueAnimatorOfFloat.start();
                C786410Ut5.S4(0.0f, c1842520y30.LJIILIIL);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat2.setDuration(300L);
                valueAnimatorOfFloat2.setStartDelay(300L);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(c1842520y30, 27));
                valueAnimatorOfFloat2.start();
            } else {
                C500260Jjc.LLFFF(c1842520y30.LJIILIIL);
                AbstractC1842530y31.LJIILJJIL(c1842520y30.LJIILIIL, -2);
                C1842520y30.LJIJI(C1842520y30.LJJIIZ, c1842520y30.LJIILIIL);
                int i = C1842520y30.LJJIJ;
                int i2 = C1842520y30.LJJIJIIJI;
                LinearLayout linearLayout = c1842520y30.LJIIJJI;
                linearLayout.setPaddingRelative(i, linearLayout.getPaddingTop(), i2, c1842520y30.LJIIJJI.getPaddingBottom());
                c1842520y30.LJIJ();
            }
        }
        C1842360y2k c1842360y2k2 = this.LLIZ;
        if (c1842360y2k2 != null) {
            c1842360y2k2.LIZIZ.LJJII = false;
        }
        if (!z) {
            DataChannel dataChannel = this.dataChannel;
            C1842470y2v c1842470y2v = this.LLJ;
            if (c1842470y2v != null && (c1810410xDD2 = c1842470y2v.LIZ) != null) {
                rankTypeV2 = c1810410xDD2.LIZIZ;
            }
            C1810690xDf.LJJIJ(rankTypeV2, dataChannel, "expand");
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        C1842470y2v c1842470y2v2 = this.LLJ;
        if (c1842470y2v2 != null && (c1810410xDD = c1842470y2v2.LIZ) != null) {
            rankTypeV2 = c1810410xDD.LIZIZ;
        }
        C1810690xDf.LJJIJ(rankTypeV2, dataChannel2, "collapse_to_expand");
    }

    @Override // X.InterfaceC1842810y3T
    public final boolean LJLJJL(int i) {
        List<C1842420y2q> list;
        C1842420y2q c1842420y2q;
        int i2;
        C1842430y2r c1842430y2r;
        C1842470y2v c1842470y2v;
        Map.Entry entryPollFirstEntry;
        C1842470y2v c1842470y2v2;
        C1842380y2m c1842380y2m = this.LL;
        if (c1842380y2m == null || (list = c1842380y2m.LIZJ) == null || (c1842420y2q = (C1842420y2q) C13LP.LJLL(list)) == null || i == (i2 = c1842420y2q.LIZ.LIZIZ.type)) {
            return false;
        }
        C1842360y2k c1842360y2k = this.LLIZ;
        if (c1842360y2k != null && (c1842470y2v = (c1842430y2r = c1842360y2k.LIZIZ).LJIILLIIL) != null) {
            TreeMap treeMap = (TreeMap) ((LinkedHashMap) c1842430y2r.LJIJJ).get(Integer.valueOf(i2));
            if (treeMap != null && (entryPollFirstEntry = treeMap.pollFirstEntry()) != null && (c1842470y2v2 = (C1842470y2v) entryPollFirstEntry.getValue()) != null) {
                c1842430y2r.LIZ.LJFF(c1842470y2v, c1842470y2v2.LIZ());
                return true;
            }
        }
        A1(x1(c1842420y2q));
        return true;
    }

    @Override // X.InterfaceC1702950uPt
    public final void LLLFF(C1842380y2m c1842380y2m) {
        if (!isViewValid()) {
            return;
        }
        B1(c1842380y2m, false, false);
    }

    @Override // X.InterfaceC1842620y3A
    public final void d0(boolean z) {
        EnumC1811400xEo enumC1811400xEo;
        C1810410xDD c1810410xDD;
        C1810410xDD c1810410xDD2;
        EnumC1100320eju enumC1100320eju = EnumC1100320eju.COLLAPSE;
        this.LLJJ = enumC1100320eju;
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        C1842380y2m c1842380y2m = this.LL;
        RankTypeV2 rankTypeV2 = null;
        if (c1842380y2m != null) {
            enumC1811400xEo = c1842380y2m.LIZIZ;
        } else {
            enumC1811400xEo = null;
        }
        c1810690xDf.getClass();
        C1810690xDf.LJJJJI(enumC1811400xEo, enumC1100320eju);
        C1842360y2k c1842360y2k = this.LLIZ;
        if (c1842360y2k != null) {
            C1842540y32 c1842540y32 = (C1842540y32) c1842360y2k.LJIILIIL.getValue(c1842360y2k, C1842360y2k.LJIJI[11]);
            c1842540y32.LIZIZ.LJIL = c1842540y32;
            if (z) {
                int width = c1842540y32.LJIILIIL.getWidth();
                C1842540y32.LJIJ(C1842540y32.LJJIIZ, c1842540y32.LJIILIIL);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat.setDuration(600L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS73S0101000_27(c1842540y32, width, 0));
                valueAnimatorOfFloat.addListener(new C1864940ydA(c1842540y32, 0));
                valueAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat2.setDuration(300L);
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(c1842540y32, 26));
                valueAnimatorOfFloat2.start();
            } else {
                C500260Jjc.LJIILIIL(c1842540y32.LJIILIIL);
                int i = C1842540y32.LJJIJIIJI;
                LinearLayout linearLayout = c1842540y32.LJIIJJI;
                linearLayout.setPaddingRelative(i, linearLayout.getPaddingTop(), i, c1842540y32.LJIIJJI.getPaddingBottom());
                c1842540y32.LIZIZ.LJIL = null;
            }
        }
        C1842360y2k c1842360y2k2 = this.LLIZ;
        if (c1842360y2k2 != null) {
            C1842430y2r c1842430y2r = c1842360y2k2.LIZIZ;
            c1842430y2r.LJJII = true;
            ARunnableS127S0100000_27 aRunnableS127S0100000_27 = c1842430y2r.LJJI;
            if (aRunnableS127S0100000_27 != null) {
                c1842430y2r.LJJ.removeCallbacks(aRunnableS127S0100000_27);
            }
            ARunnableS127S0100000_27 aRunnableS127S0100000_272 = c1842430y2r.LJJIFFI;
            if (aRunnableS127S0100000_272 != null) {
                c1842430y2r.LJJ.removeCallbacks(aRunnableS127S0100000_272);
            }
        }
        if (!z) {
            DataChannel dataChannel = this.dataChannel;
            C1842470y2v c1842470y2v = this.LLJ;
            if (c1842470y2v != null && (c1810410xDD2 = c1842470y2v.LIZ) != null) {
                rankTypeV2 = c1810410xDD2.LIZIZ;
            }
            C1810690xDf.LJJIJ(rankTypeV2, dataChannel, "collapse");
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        C1842470y2v c1842470y2v2 = this.LLJ;
        if (c1842470y2v2 != null && (c1810410xDD = c1842470y2v2.LIZ) != null) {
            rankTypeV2 = c1810410xDD.LIZIZ;
        }
        C1810690xDf.LJJIJ(rankTypeV2, dataChannel2, "expand_to_collapse");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... objArr) {
        Boolean bool;
        C1842380y2m c1842380y2m;
        super.initConstructor(Arrays.copyOf(objArr, objArr.length));
        boolean zBooleanValue = false;
        Object objLJJIIZ = C13LQ.LJJIIZ(0, objArr);
        C1842380y2m c1842380y2mLIZ = null;
        if ((objLJJIIZ instanceof C1842380y2m) && (c1842380y2m = (C1842380y2m) objLJJIIZ) != null) {
            c1842380y2mLIZ = c1842380y2m.LIZ();
        }
        this.LL = c1842380y2mLIZ;
        Object objLJJIIZ2 = C13LQ.LJJIIZ(2, objArr);
        if ((objLJJIIZ2 instanceof Boolean) && (bool = (Boolean) objLJJIIZ2) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLILLJJLI = zBooleanValue;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        boolean zBooleanValue;
        Boolean bool;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "Rank Widget - onInit");
        this.LLILZLL = (CardView) findViewById(R.id.sqr);
        C1086060eMu c1086060eMu = (C1086060eMu) findViewById(R.id.sqj);
        boolean z = true;
        try {
            View view = getView();
            if (view != null) {
                C1843120y3y c1843120y3y = new C1843120y3y(view, c1086060eMu, this.LLILZIL);
                this.LLJILJILJ = c1843120y3y;
                C1844320y5u c1844320y5u = c1843120y3y.LJ;
                if (c1844320y5u != null) {
                    c1844320y5u.setEnableAdaptive(true);
                }
                C1844320y5u c1844320y5u2 = c1843120y3y.LIZLLL;
                if (c1844320y5u2 != null) {
                    c1844320y5u2.setEnableAdaptive(true);
                }
                C1844320y5u c1844320y5u3 = c1843120y3y.LJFF;
                if (c1844320y5u3 != null) {
                    c1844320y5u3.setEnableAdaptive(true);
                }
                if (c1086060eMu != null) {
                    c1086060eMu.setOnPreMeasureListener(new AwS641S0100000_27(c1843120y3y, 131));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("rank_init_exception", e);
        }
        this.LLJILJIL = C20736316Cj.LIZIZ(R.attr.euj, this.context);
        CardView cardView = this.LLILZLL;
        if (cardView != null) {
            C786410Ut5.X7(cardView, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xFc
                /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
                @Override // X.AbstractViewOnClickListenerC1105820esm
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        r9 = this;
                        com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget r4 = r9.LLILZIL
                        boolean r0 = r4.LLJIJIL
                        if (r0 == 0) goto L28
                        X.0y2v r3 = r4.LLJ
                        r2 = 0
                        if (r3 == 0) goto L3e
                        X.0xDD r0 = r3.LIZ
                        if (r0 == 0) goto L3e
                        X.0xEo r1 = r0.LIZ
                    L11:
                        X.0xEo r0 = X.EnumC1811400xEo.GIFT_RANK
                        if (r1 == r0) goto L21
                        if (r3 == 0) goto L1d
                        X.0xDD r0 = r3.LIZ
                        if (r0 == 0) goto L1d
                        X.0xEo r2 = r0.LIZ
                    L1d:
                        X.0xEo r0 = X.EnumC1811400xEo.GAME_RANK
                        if (r2 != r0) goto L28
                    L21:
                        com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
                        java.lang.Class<com.bytedance.android.livesdk.rank.impl.RankingEntranceClickEvent> r0 = com.bytedance.android.livesdk.rank.impl.RankingEntranceClickEvent.class
                        r1.FQ2(r0)
                    L28:
                        com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget r1 = r9.LLILZIL
                        X.0xEo r0 = X.EnumC1811400xEo.DEFAULT
                        int r5 = r0.getType()
                        com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LJJIJIIJI
                        int r6 = r0.type
                        r8 = 1
                        java.lang.String r4 = "room_entrance_click"
                        r2 = 0
                        r7 = r6
                        r1.y1(r2, r4, r5, r6, r7, r8)
                        return
                    L3e:
                        r1 = r2
                        goto L11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1811900xFc.LIZ():void");
                }

                {
                    super(1200L);
                }
            });
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        StringBuilder sb = new StringBuilder("Rank Widget - onInit - AnimationManager - ");
        if (this.context != null) {
            z = false;
        }
        sb.append(z);
        C20441214yg.LIZIZ("Ranking Entrance Unification", sb.toString());
        this.LLIZ = new C1842360y2k((CardView) this.contentView.findViewById(R.id.sqr), this, this.dataChannel, this.context, zBooleanValue, this.LLJILJILJ, this.LLILZ, this.LLILZIL);
        View view2 = getView();
        Integer num = 24;
        if (num != null && num.intValue() >= 0 && view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = (int) C497740JfY.LIZIZ(num.intValue());
            C786410Ut5.W5(view2, layoutParams);
        }
        CardView cardView2 = this.LLILZLL;
        if (cardView2 != null) {
            C635860Owq.LIZ.getClass();
            C635860Owq.LIZIZ(0, 0, 2, 0, cardView2, null, true);
        }
        View view3 = getView();
        if (view3 != null) {
            C635860Owq.LIZ(view3, 2, 4, 0, 4);
        }
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            View view4 = this.contentView;
            c1119850fFP.getClass();
            C1119850fFP.LIZ(view4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.0y3N] */
    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean zBooleanValue;
        Boolean bool;
        int i;
        int i2;
        C20441214yg.LIZIZ("Ranking Entrance Unification", "Rank Widget - onLoad");
        DataChannel dataChannel = this.dataChannel;
        EnumC1811400xEo enumC1811400xEo = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJI = room;
        C1843120y3y c1843120y3y = this.LLJILJILJ;
        if (c1843120y3y != null) {
            DataChannel dataChannel2 = this.dataChannel;
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            if (iRoomFunctionService != null && iRoomFunctionService.db0(room, dataChannel2)) {
                i2 = c1843120y3y.LJI;
            } else {
                i2 = c1843120y3y.LJII;
            }
            CardView cardView = c1843120y3y.LIZJ;
            if (cardView != null) {
                cardView.setCardBackgroundColor(i2);
            }
        }
        C1843120y3y c1843120y3y2 = this.LLJILJILJ;
        if (c1843120y3y2 != null) {
            IRoomFunctionService iRoomFunctionService2 = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            if (iRoomFunctionService2 != null && iRoomFunctionService2.db0(this.LLJI, this.dataChannel)) {
                i = c1843120y3y2.LJI;
            } else {
                i = c1843120y3y2.LJII;
            }
            this.LLJILJIL = i;
            C1842360y2k c1842360y2k = this.LLIZ;
            if (c1842360y2k != null) {
                c1842360y2k.LIZIZ.LJIIIIZZ = i;
            }
        }
        ((C1086060eMu) findViewById(R.id.sqj)).setMaxWidthProvider(this.LLILZIL);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJIJIL = zBooleanValue;
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        C1842380y2m c1842380y2m = this.LL;
        if (c1842380y2m != null) {
            enumC1811400xEo = c1842380y2m.LIZIZ;
        }
        EnumC1100320eju enumC1100320eju = this.LLILLL;
        if (enumC1100320eju == null) {
            enumC1100320eju = EnumC1100320eju.EXPAND;
        }
        c1810690xDf.getClass();
        C1810690xDf.LJJJJI(enumC1811400xEo, enumC1100320eju);
        B1(this.LL, false, this.LLILLJJLI);
        if (this.LLILLL == EnumC1100320eju.COLLAPSE) {
            d0(false);
        } else {
            LJJJJIZL(false);
        }
        C1842360y2k c1842360y2k2 = this.LLIZ;
        if (c1842360y2k2 != null) {
            c1842360y2k2.LIZ = this.dataChannel;
        }
        if (!(!LiveCreatorRankingDowngradeServiceSetting.INSTANCE.getValue())) {
            if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
                AwS641S0100000_27 awS641S0100000_27 = new AwS641S0100000_27(this, 130);
                EnumC781860Ulk enumC781860Ulk = EnumC781860Ulk.RANK_BANNER_SWITCH_INTERVAL_INCREASE;
                C2252331DDr c2252331DDr = C775900Uc8.LIZ;
                C775900Uc8.LJFF(enumC781860Ulk, new AwS440S0200000_4(enumC781860Ulk, awS641S0100000_27, 12));
                C775900Uc8.LJFF(EnumC781860Ulk.RANK_BANNER_SWITCH_BLOCK, new AwS631S0100000_17(new AwS606S0100000_27(this, 488), 23));
            }
            InterfaceC1842820y3U interfaceC1842820y3U = (InterfaceC1842820y3U) C1842460y2u.LIZLLL.LIZ(this.dataChannel).LIZIZ(EnumC1842500y2y.DOWNGRADE);
            if (interfaceC1842820y3U != 0) {
                interfaceC1842820y3U.LIZ(new InterfaceC1114220f6K() { // from class: X.0y3N
                    @Override // X.InterfaceC1114220f6K
                    public final void LIZ(long j) {
                        C1842360y2k c1842360y2k3 = this.LIZ.LLIZ;
                        if (c1842360y2k3 != null) {
                            c1842360y2k3.LIZIZ.LJI = j;
                        }
                    }

                    @Override // X.InterfaceC1114220f6K
                    public final void LIZIZ(boolean z) {
                        RankEntranceWidget rankEntranceWidget = this.LIZ;
                        C1842360y2k c1842360y2k3 = rankEntranceWidget.LLIZ;
                        if (c1842360y2k3 != null) {
                            boolean z2 = !c1842360y2k3.LJIJ;
                            c1842360y2k3.LJIJ = z;
                            if (z2 && z) {
                                rankEntranceWidget.J0();
                            }
                        }
                    }
                });
                interfaceC1842820y3U.LIZIZ(this);
            }
        }
        InterfaceC1842780y3Q interfaceC1842780y3Q = (InterfaceC1842780y3Q) C1842460y2u.LIZLLL.LIZ(this.dataChannel).LIZIZ(EnumC1842500y2y.MOCK_ANIMATION);
        this.LLIZLLLIL = interfaceC1842780y3Q;
        if (interfaceC1842780y3Q != null) {
            interfaceC1842780y3Q.LIZIZ(new InterfaceC1702970uPv() { // from class: X.0y2t
                public final C0N5A LIZ = C0N5A.BONUS_TIME;
                public final RankAnimationType LIZIZ;

                {
                    RankAnimationType rankAnimationType = RankAnimationType.LIZ;
                    this.LIZIZ = RankAnimationType.LJIILJJIL;
                }

                @Override // X.InterfaceC1702970uPv
                public final RankAnimationType LIZJ() {
                    return LIZLLL();
                }

                public final RankAnimationType LIZLLL() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1702970uPv
                public final C0N5A scenario() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1702970uPv
                public final C1842380y2m LIZ(C1842380y2m c1842380y2m2) {
                    List<C1842420y2q> list;
                    String str;
                    if (c1842380y2m2 != null && (list = c1842380y2m2.LIZJ) != null) {
                        for (C1842420y2q c1842420y2q : list) {
                            RankTypeV2 rankTypeV2 = c1842420y2q.LIZ.LIZIZ;
                            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
                            if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
                                C1842420y2q c1842420y2qLIZ = c1842420y2q.LIZ();
                                RankAnimationInfo rankAnimationInfo = c1842420y2qLIZ.LJIIIIZZ;
                                if (rankAnimationInfo != null) {
                                    rankAnimationInfo.type = this.LIZIZ.type;
                                    Text text = new Text();
                                    text.defaultPattern = "Bonus period";
                                    if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
                                        str = "ttlive_popularLIVE_popularHour_popLIVEPortal_text";
                                    } else {
                                        str = "ttlive_popLIVEBonusTime_popLIVEPortal_text";
                                    }
                                    text.key = str;
                                    rankAnimationInfo.contentText = text;
                                }
                                C1842380y2m c1842380y2m3 = new C1842380y2m();
                                c1842380y2m3.LIZ = 10L;
                                c1842380y2m3.LIZIZ = EnumC1811400xEo.GIFT_RANK;
                                c1842380y2m3.LJ = EnumC1842510y2z.BASIC_ANIMATION.getType();
                                c1842380y2m3.LIZJ = C1697810uHb.LJIILJJIL(c1842420y2qLIZ);
                                C20441214yg.LIZIZ("BonusTimeMockStrategy", "Created bonus time mock entrance data");
                                return c1842380y2m3;
                            }
                        }
                    }
                    C20441214yg.LIZIZ("BonusTimeMockStrategy", "No TEAM_RANK entrance data found for bonus time animation");
                    return null;
                }

                @Override // X.InterfaceC1702970uPv
                public final boolean LIZIZ(C1842380y2m c1842380y2m2) {
                    List<C1842420y2q> list;
                    if (!LivePopularityRankingBonusTimeSetting.INSTANCE.getOverallOpt()) {
                        C20441214yg.LIZIZ("BonusTimeMockStrategy", "Bonus time animation disabled by setting");
                        return false;
                    }
                    if (c1842380y2m2 != null && (list = c1842380y2m2.LIZJ) != null && !list.isEmpty()) {
                        Iterator<C1842420y2q> it2 = list.iterator();
                        while (it2.hasNext()) {
                            RankTypeV2 rankTypeV2 = it2.next().LIZ.LIZIZ;
                            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
                            if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
                                C20441214yg.LIZIZ("BonusTimeMockStrategy", "Bonus time animation can trigger");
                                return true;
                            }
                        }
                    }
                    C20441214yg.LIZIZ("BonusTimeMockStrategy", "No TEAM_RANK entrance data available");
                    return false;
                }
            });
            interfaceC1842780y3Q.LIZIZ(new InterfaceC1702970uPv() { // from class: X.0y2l
                public final C0N5A LIZ = C0N5A.MUSIC_SPOTLIGHT_FIRST_LAUNCH;
                public final RankAnimationType LIZIZ;

                {
                    RankAnimationType rankAnimationType = RankAnimationType.LIZ;
                    this.LIZIZ = RankAnimationType.LJIJ;
                }

                @Override // X.InterfaceC1702970uPv
                public final RankAnimationType LIZJ() {
                    return LIZLLL();
                }

                public final RankAnimationType LIZLLL() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1702970uPv
                public final C0N5A scenario() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1702970uPv
                public final C1842380y2m LIZ(C1842380y2m c1842380y2m2) {
                    List<C1842420y2q> list;
                    if (c1842380y2m2 != null && (list = c1842380y2m2.LIZJ) != null) {
                        for (C1842420y2q c1842420y2q : list) {
                            RankTypeV2 rankTypeV2 = c1842420y2q.LIZ.LIZIZ;
                            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
                            if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJJIIJZLJL)) {
                                C1842420y2q c1842420y2qLIZ = c1842420y2q.LIZ();
                                RankAnimationInfo rankAnimationInfo = c1842420y2qLIZ.LJIIIIZZ;
                                if (rankAnimationInfo != null) {
                                    rankAnimationInfo.type = this.LIZIZ.type;
                                    Text text = new Text();
                                    text.defaultPattern = "Music Spotlight";
                                    text.key = "ttlive_musicSpotlight_shortEntry";
                                    rankAnimationInfo.contentText = text;
                                }
                                C1842380y2m c1842380y2m3 = new C1842380y2m();
                                c1842380y2m3.LIZ = 10L;
                                c1842380y2m3.LIZIZ = EnumC1811400xEo.CONTENT_SPOTLIGHT;
                                c1842380y2m3.LJ = EnumC1842510y2z.BASIC_ANIMATION.getType();
                                c1842380y2m3.LIZJ = C1697810uHb.LJIILJJIL(c1842420y2qLIZ);
                                C20441214yg.LIZIZ("MusicSpotlightFirstLaunchStrategy", "Created music spotlight first launch mock entrance data");
                                return c1842380y2m3;
                            }
                        }
                    }
                    C20441214yg.LIZIZ("MusicSpotlightFirstLaunchStrategy", "No MUSIC_SPOTLIGHT entrance data found for music spotlight first launch animation");
                    return null;
                }

                @Override // X.InterfaceC1702970uPv
                public final boolean LIZIZ(C1842380y2m c1842380y2m2) {
                    List<C1842420y2q> list;
                    if (!LiveMusicSpotlightSetting.INSTANCE.isMusicSpotlightEnabled()) {
                        C20441214yg.LIZIZ("MusicSpotlightFirstLaunchStrategy", "Music spotlight first launch animation disabled by setting");
                        return false;
                    }
                    if (c1842380y2m2 != null && (list = c1842380y2m2.LIZJ) != null && !list.isEmpty()) {
                        Iterator<C1842420y2q> it2 = list.iterator();
                        while (it2.hasNext()) {
                            RankTypeV2 rankTypeV2 = it2.next().LIZ.LIZIZ;
                            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
                            if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJJIIJZLJL)) {
                                C0JT6<Boolean> c0jt6 = InterfaceC1094280eaA.Kd;
                                Boolean boolLIZ = c0jt6.LIZ();
                                if (boolLIZ != null && boolLIZ.booleanValue()) {
                                    C20441214yg.LIZIZ("MusicSpotlightFirstLaunchStrategy", "Music spotlight first launch animation disabled by frequency control");
                                    return false;
                                }
                                c0jt6.LIZJ(Boolean.TRUE);
                                C20441214yg.LIZIZ("MusicSpotlightFirstLaunchStrategy", "Music spotlight first launch animation can trigger");
                                return true;
                            }
                        }
                    }
                    C20441214yg.LIZIZ("MusicSpotlightFirstLaunchStrategy", "No MUSIC_SPOTLIGHT entrance data available");
                    return false;
                }
            });
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(this, MicRoomDisableInteractionEvent.class, new AwS606S0100000_27(this, 48));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(this, OpenRankDialogEvent.class, new AwS606S0100000_27(this, 49));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.BQ2(this, FansClubEvent.class, new AwS596S0100000_17(this, 80));
        }
        DataChannel dataChannel7 = this.dataChannel;
        if (dataChannel7 != null) {
            dataChannel7.EQ2(this, PopularityRankingBonusTimeAnimationChannel.class, new AwS606S0100000_27(this, 50));
            dataChannel7.EQ2(this, MockMusicSpotlightFirstLaunchAnimationChannel.class, new AwS606S0100000_27(this, 51));
        }
        DataChannel dataChannel8 = this.dataChannel;
        if (dataChannel8 != null) {
            dataChannel8.BQ2(this, CreatorRankingSettlementCountdownAnimationListChannel.class, new AwS606S0100000_27(this, 52));
            dataChannel8.BQ2(this, RemoveCreatorRankingEntranceAffiliatedInfoEvent.class, new AwS606S0100000_27(this, 53));
            dataChannel8.BQ2(this, RemoveCreatorRankingCacheDataEvent.class, AFwS254S0000000_17.get$arr$(39));
            dataChannel8.BQ2(this, CreatorRankingBGHighlightBeforeSettlementChannel.class, new AwS606S0100000_27(this, 54));
        }
        if (GameStopBackgroundAnimationSetting.INSTANCE.getValue()) {
            DataChannelGlobal.LLILZ.EQ2(this, this, GameLiveIsBackgroundData.class, new AwS606S0100000_27(this, 47));
        }
    }

    @Override // X.InterfaceC1842620y3A
    public final void v0(boolean z) {
        this.LLJJIJI = z;
    }

    public final C1842470y2v x1(C1842420y2q c1842420y2q) {
        int color;
        C1810410xDD c1810410xDD = c1842420y2q.LIZ;
        String string = C1133830fbx.LJIILIIL(c1842420y2q.LIZJ, "").toString();
        boolean z = c1842420y2q.LJ;
        boolean z2 = c1842420y2q.LJFF;
        long j = c1842420y2q.LJI;
        boolean z3 = c1842420y2q.LJIIIZ;
        RankAnimationInfo rankAnimationInfo = c1842420y2q.LJIIIIZZ;
        ImageModel imageModel = c1842420y2q.LJIIJ;
        C1810410xDD c1810410xDD2 = c1842420y2q.LIZIZ;
        int i = c1842420y2q.LJIIJJI;
        if (rankAnimationInfo != null) {
            if (TextUtils.isEmpty(rankAnimationInfo.backgroundColorString)) {
                color = this.LLJILJIL;
            } else {
                try {
                    color = Color.parseColor(rankAnimationInfo.backgroundColorString);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    color = this.LLJILJIL;
                }
            }
            rankAnimationInfo.setBackgroundColor(color);
            rankAnimationInfo.setContent(C1133830fbx.LJIILIIL(rankAnimationInfo.contentText, "").toString());
        }
        return new C1842470y2v(c1810410xDD, string, z, z2, j, z3, rankAnimationInfo, imageModel, c1810410xDD2, i);
    }

    @Override // X.InterfaceC1842620y3A
    public final boolean z0(C1842380y2m c1842380y2m) {
        List<C1842420y2q> list;
        int i;
        C1842380y2m c1842380y2m2 = this.LL;
        if (c1842380y2m2 != null && (list = c1842380y2m2.LIZJ) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1842420y2q> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ.LIZIZ);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            if (setLLIIJI != null) {
                List<C1842420y2q> list2 = c1842380y2m.LIZJ;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (C1842420y2q c1842420y2q : list2) {
                        RankAnimationType rankAnimationType = RankAnimationType.LIZ;
                        RankAnimationInfo rankAnimationInfo = c1842420y2q.LJIIIIZZ;
                        if (rankAnimationInfo != null) {
                            i = rankAnimationInfo.type;
                        } else {
                            i = 0;
                        }
                        if (C1842480y2w.LIZIZ(i) && setLLIIJI.contains(c1842420y2q.LIZ.LIZIZ)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(X.C1842380y2m r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.B1(X.0y2m, boolean, boolean):void");
    }

    public final void z1(C1842470y2v c1842470y2v, boolean z, int i) {
        boolean z2;
        boolean zNeedToActiveUpdateScoreInfo;
        if (this.LLJIJIL && LiveRankingCompetitiveAtmosphereSetting.INSTANCE.getValue()) {
            if (LiveCreatorRankingActiveUpdateSetting.INSTANCE.getValue()) {
                if (c1842470y2v.LIZLLL && c1842470y2v.LIZJ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    zNeedToActiveUpdateScoreInfo = LiveRankingCompetitiveAtmosphereConfig.INSTANCE.needToActiveUpdateScoreInfo(i, C1810700xDg.LIZIZ(i, false));
                } else {
                    zNeedToActiveUpdateScoreInfo = false;
                }
                if (!z2 && !zNeedToActiveUpdateScoreInfo) {
                    return;
                }
            } else if ((!c1842470y2v.LIZLLL || !c1842470y2v.LIZJ) && !z) {
                return;
            }
            this.dataChannel.FQ2(RankingEntranceRefreshEvent.class);
        }
    }

    public RankEntranceWidget(C1842380y2m c1842380y2m, EnumC1100320eju enumC1100320eju, Function0 function0, Function0 function02) {
        this.LL = c1842380y2m;
        this.LLILLL = enumC1100320eju;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0551  */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(long r24, java.lang.String r26, int r27, int r28, int r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.y1(long, java.lang.String, int, int, int, boolean):void");
    }
}
