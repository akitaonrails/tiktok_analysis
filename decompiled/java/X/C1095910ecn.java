package X;

import Y.AAListenerS139S0300000_17;
import Y.AAListenerS328S0100000_17;
import Y.AAListenerS90S0101000_17;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import Y.ALAdapterS2S0400000_17;
import Y.ALAdapterS3S0210000_17;
import Y.ALAdapterS7S0300000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS86S0200000_17;
import Y.AfS178S0100000_9;
import Y.AfS186S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting;
import com.bytedance.android.livesdk.livesetting.level.ContentConfiguration;
import com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration;
import com.bytedance.android.livesdk.livesetting.level.FansClaimResConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.livesetting.level.GuidanceConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubClaimPointsOptSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubLandscapeEventSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubQuitMarginFixSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubTextLanguageSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubTopOneOptSetting;
import com.bytedance.android.livesdk.livesetting.level.TextConfig;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveRankingAndPrivilegeDowngradeSetting;
import com.bytedance.android.livesdk.model.message.EntranceGuidanceContainer;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.revenue.level.api.event.EntranceCommonGuideEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.OpenFansClubEntranceView;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0ecn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095910ecn extends C1095950ecr {
    public final ViewGroup LJIIL;
    public final InterfaceC1095350ebt LJIILIIL;
    public final LifecycleOwner LJIILJJIL;
    public final DataChannel LJIILL;
    public final C1091250eVH LJIILLIIL;
    public final ConstraintLayout LJIIZILJ;
    public final FrameLayout LJIJ;
    public final C1324720kZq LJIJI;
    public final C16F5 LJIJJ;
    public final C16F5 LJIJJLI;
    public final FrameLayout LJIL;
    public final C430340Gu8 LJJ;
    public final C430340Gu8 LJJI;
    public final C1126540fQC LJJIFFI;
    public final C1126540fQC LJJII;
    public final ImageView LJJIII;
    public final ImageView LJJIIJ;
    public final C1295960jpS LJJIIJZLJL;
    public final C1295960jpS LJJIIZ;
    public final C16F5 LJJIIZI;
    public final ImageView LJJIJ;
    public final C430340Gu8 LJJIJIIJI;
    public final C1295960jpS LJJIJIIJIL;
    public final C1295960jpS LJJIJIL;
    public final ImageView LJJIJL;
    public final LinearLayout LJJIJLIJ;
    public final C16F5 LJJIL;
    public AnimatorSet LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public C1095930ecp LJJJJ;
    public final boolean LJJJJI;
    public boolean LJJJJIZL;
    public final InterfaceC1095420ec0 LJJJJJL;
    public boolean LJJJJLI;
    public final boolean LJJJJZ;
    public boolean LJJJJZI;
    public boolean LJJJLIIL;
    public EnumC1095860eci LJJJLL;
    public EnumC1095860eci LJJJLZIJ;
    public long LJJJZ;
    public boolean LJJLI;
    public boolean LJJLIIIIJ;
    public final View LJJLIIIJ;
    public final C1095840ecg LJJJIL = new C1095840ecg();
    public final ARunnableS117S0100000_17 LJJJJJ = new ARunnableS117S0100000_17(this, 138);
    public long LJJJJL = -1;
    public final Set<Long> LJJJJLL = new LinkedHashSet();
    public C00DF LJJL = C00DF.FANS_CLUB_BADGE;
    public final C1092520eXK LJJLIIIJILLIZJL = new C1092520eXK();
    public final C1095850ech LJJLIIIJJI = new C1095850ech(this);

    public final boolean LJIILLIIL() {
        try {
            Boolean boolLIZ = InterfaceC1093910eZZ.LLLLLLZ.LIZ();
            if (boolLIZ == null || !boolLIZ.booleanValue()) {
                return this.LJJJJZ;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LJIIZILJ() {
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        C1143920fsE c1143920fsE;
        C1095930ecp c1095930ecp;
        C1143920fsE c1143920fsE2;
        ArrayList<Animator> childAnimations;
        this.LJJJJZI = false;
        this.LJJJ = false;
        this.LJJJJIZL = false;
        this.LJJJIL.LIZ.clear();
        C1295960jpS c1295960jpS = this.LJJIIJZLJL;
        if (c1295960jpS != null && c1295960jpS.isAnimating()) {
            C1295960jpS c1295960jpS2 = this.LJJIIJZLJL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.cancelAnimation();
            }
            C1295960jpS c1295960jpS3 = this.LJJIIJZLJL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.removeAllAnimatorListeners();
            }
        }
        C1295960jpS c1295960jpS4 = this.LJJIJIIJIL;
        if (c1295960jpS4 != null && c1295960jpS4.isAnimating()) {
            C1295960jpS c1295960jpS5 = this.LJJIJIIJIL;
            if (c1295960jpS5 != null) {
                c1295960jpS5.cancelAnimation();
            }
            C1295960jpS c1295960jpS6 = this.LJJIJIIJIL;
            if (c1295960jpS6 != null) {
                c1295960jpS6.removeAllAnimatorListeners();
            }
        }
        C1295960jpS c1295960jpS7 = this.LJJIJIL;
        if (c1295960jpS7 != null && c1295960jpS7.isAnimating()) {
            C1295960jpS c1295960jpS8 = this.LJJIJIL;
            if (c1295960jpS8 != null) {
                c1295960jpS8.cancelAnimation();
            }
            C1295960jpS c1295960jpS9 = this.LJJIJIL;
            if (c1295960jpS9 != null) {
                c1295960jpS9.removeAllAnimatorListeners();
            }
        }
        C1295960jpS c1295960jpS10 = this.LJJIIZ;
        if (c1295960jpS10 != null && c1295960jpS10.isAnimating()) {
            C1295960jpS c1295960jpS11 = this.LJJIIZ;
            if (c1295960jpS11 != null) {
                c1295960jpS11.cancelAnimation();
            }
            C1295960jpS c1295960jpS12 = this.LJJIIZ;
            if (c1295960jpS12 != null) {
                c1295960jpS12.removeAllAnimatorListeners();
            }
        }
        AnimatorSet animatorSet = this.LJJIZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJJIZ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.LJJIZ;
            if (animatorSet3 != null) {
                animatorSet3.removeAllListeners();
            }
        }
        AnimatorSet animatorSet4 = this.LJJIZ;
        if (animatorSet4 != null && (childAnimations = animatorSet4.getChildAnimations()) != null) {
            Iterator<Animator> it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                it2.next().removeAllListeners();
            }
        }
        C1095930ecp c1095930ecp2 = this.LJJJJ;
        if (c1095930ecp2 != null && (c1143920fsE = c1095930ecp2.LJJJIL) != null && c1143920fsE.LIZJ() && (c1095930ecp = this.LJJJJ) != null && (c1143920fsE2 = c1095930ecp.LJJJIL) != null) {
            c1143920fsE2.LIZ();
        }
        this.LJ.removeCallbacksAndMessages(null);
        this.LJJJJLL.clear();
        C1095930ecp c1095930ecp3 = this.LJJJJ;
        if (c1095930ecp3 != null) {
            c1095930ecp3.LJJIIJ(true);
        }
        C12ES.LJIILL(8, this.LJJIIZI);
        C12ES.LJIILL(8, this.LJJIFFI);
        C12ES.LJIILL(8, this.LJJIJIIJI);
        C12ES.LJIILL(8, this.LJJIJIIJIL);
        C12ES.LJIILL(8, this.LJJIJIL);
        C12ES.LJIILL(8, this.LJJIIJZLJL);
        C12ES.LJIILL(8, this.LJJI);
        C12ES.LJIILL(8, this.LJJIJL);
        C12ES.LJIILL(8, this.LJJIJLIJ);
        C12ES.LJIILL(0, this.LJIJI);
        C16F5 c16f5 = this.LJJIIZI;
        if (c16f5 != null && (layoutParams3 = c16f5.getLayoutParams()) != null) {
            layoutParams3.width = -2;
            layoutParams3.height = -1;
            C16F5 c16f52 = this.LJJIIZI;
            if (c16f52 != null) {
                C786410Ut5.y6(c16f52, layoutParams3);
            }
        }
        InterfaceC1095350ebt interfaceC1095350ebt = this.LJIILIIL;
        if (interfaceC1095350ebt != null && (viewGroup2 = ((C1096340edU) interfaceC1095350ebt).LJIILJJIL) != null && (layoutParams2 = viewGroup2.getLayoutParams()) != null) {
            layoutParams2.width = -2;
            ViewGroup viewGroup3 = ((C1096340edU) this.LJIILIIL).LJIILJJIL;
            if (viewGroup3 != null) {
                C786410Ut5.W5(viewGroup3, layoutParams2);
            }
        }
        InterfaceC1095350ebt interfaceC1095350ebt2 = this.LJIILIIL;
        if (interfaceC1095350ebt2 != null && (viewGroup = ((C1096340edU) interfaceC1095350ebt2).LJ) != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.width = -2;
            ViewGroup viewGroup4 = ((C1096340edU) this.LJIILIIL).LJ;
            if (viewGroup4 != null) {
                C786410Ut5.W5(viewGroup4, layoutParams);
            }
        }
        LJJJJIZL(this.LJIJI);
        LJJJJIZL(this.LJJIII);
        LJJJJIZL(this.LJJIIJ);
        LJJJJIZL(this.LJJIIZI);
        LJJJJIZL(this.LJJ);
        LJJJJIZL(this.LJJIJIIJI);
        LJJJJIZL(this.LJJIL);
        InterfaceC1095350ebt interfaceC1095350ebt3 = this.LJIILIIL;
        LJJJJIZL(interfaceC1095350ebt3 != null ? ((C1096340edU) interfaceC1095350ebt3).LIZIZ : null);
        C430340Gu8 c430340Gu8 = this.LJJ;
        if (c430340Gu8 != null) {
            C786410Ut5.sd(c430340Gu8, 0.0f);
        }
        C430340Gu8 c430340Gu82 = this.LJJI;
        if (c430340Gu82 != null) {
            C786410Ut5.sd(c430340Gu82, 0.0f);
        }
        C430340Gu8 c430340Gu83 = this.LJJIJIIJI;
        if (c430340Gu83 != null) {
            C786410Ut5.sd(c430340Gu83, 0.0f);
        }
        LJJ();
        this.LJJJJLI = false;
        C12ES.LJIILL(8, this.LJJIIJ);
        LJJJJIZL(this.LJJIIJ);
        LJIL();
        LJJJJI();
    }

    @Override // X.InterfaceC1096360edW
    public final void LIZIZ() {
        C12ES.LJIILL(8, this.LJIL);
        C12ES.LJIILL(4, this.LJJIII);
        C12ES.LJIILL(4, this.LJIJI);
        C12ES.LJIILL(4, this.LJJIL);
        C1324720kZq c1324720kZq = this.LJIJI;
        if (c1324720kZq != null) {
            c1324720kZq.setImageResource(R.drawable.elj);
        }
        ImageView imageView = this.LJJIII;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ejq);
        }
    }

    @Override // X.C1095950ecr, X.InterfaceC1096360edW
    public final boolean LIZLLL() {
        C1095140ebY c1095140ebY = this.LIZLLL;
        return c1095140ebY != null && c1095140ebY.LIZ > 0;
    }

    @Override // X.InterfaceC1096360edW
    public final void LJFF() {
        C12ES.LJIILL(8, this.LJIL);
        C12ES.LJIILL(0, this.LJJIII);
        C12ES.LJIILL(0, this.LJIJI);
        C12ES.LJIILL(0, this.LJJIL);
    }

    @Override // X.InterfaceC1096360edW
    public final int LJIIJ() {
        TextPaint paint;
        CharSequence text;
        C16F5 c16f5 = this.LJJIL;
        if (c16f5 != null && (paint = c16f5.getPaint()) != null) {
            C16F5 c16f52 = this.LJJIL;
            int iMeasureText = (int) paint.measureText((c16f52 == null || (text = c16f52.getText()) == null) ? null : text.toString());
            if (iMeasureText > 0) {
                return iMeasureText + C497740JfY.LJIIIZ(R.dimen.ao4) + C497740JfY.LJIIIZ(R.dimen.ao0) + C497740JfY.LJIIIZ(R.dimen.ao1) + C497740JfY.LJIIIZ(R.dimen.ao4);
            }
        }
        return 0;
    }

    @Override // X.C1095950ecr
    public final void LJIIJJI() {
        DataChannel dataChannel = this.LJIILL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LJIILJJIL, FansClubEvent.class, new AwS596S0100000_17(this, 267));
        }
        DataChannel dataChannel2 = this.LJIILL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this.LJIILJJIL, EntranceCommonGuideEvent.class, new AwS596S0100000_17(this, 268));
        }
        DataChannel dataChannel3 = this.LJIILL;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this.LJIILJJIL, OpenFansClubEntranceView.class, new AwS596S0100000_17(this, 269));
        }
        C784440Upu.LIZ().LIZJ(this.LJIILJJIL, C0KVO.class).LIZJ(new AfS186S0100000_17(this, 67));
    }

    public final void LJIJ() {
        if (this.LJIIZILJ == null) {
            return;
        }
        if (LiveFansClubTopOneOptSetting.INSTANCE.getValue() && this.LJJLIIIIJ) {
            this.LJJLIIIIJ = false;
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LJIIZILJ);
        c19mb.LJI(R.id.lgs, 6);
        c19mb.LJI(R.id.lgs, 7);
        c19mb.LJIIIIZZ(R.id.lgs, 6, R.id.ho0, 6);
        c19mb.LJIIIIZZ(R.id.lgs, 7, R.id.hnu, 7);
        c19mb.LIZIZ(this.LJIIZILJ);
        this.LJJLIIIIJ = true;
    }

    public final void LJIJI() {
        String string;
        final Pair<Boolean, String> pair;
        Long l;
        String string2;
        Room room;
        Boolean bool;
        final ViewGroup viewGroup = this.LJIIL;
        if (viewGroup != null) {
            LJJ();
            DataChannel dataChannel = this.LJIILL;
            boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) ? true : bool.booleanValue();
            C1095140ebY c1095140ebY = this.LIZLLL;
            final long j = c1095140ebY != null ? c1095140ebY.LIZ : 0L;
            C1092520eXK c1092520eXK = this.LJJLIIIJILLIZJL;
            DataChannel dataChannel2 = this.LJIILL;
            final String strLIZLLL = c1092520eXK.LIZLLL(dataChannel2 != null ? C500260Jjc.LJJLIIIJ(dataChannel2) : 0L);
            C1092520eXK c1092520eXK2 = this.LJJLIIIJILLIZJL;
            DataChannel dataChannel3 = this.LJIILL;
            final C1096010ecx c1096010ecx = new C1096010ecx(new C1096070ed3("fans_club_join_team_page"), c1092520eXK2.LIZJ(dataChannel3 != null ? C500260Jjc.LJJLIIIJ(dataChannel3) : 0L));
            DataChannel dataChannel4 = this.LJIILL;
            if (dataChannel4 == null || (string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel4)).toString()) == null) {
                string = "";
            }
            try {
                C0JT6<Map<String, String>> c0jt6 = InterfaceC1106030et7.c9;
                Map<String, String> mapLIZ = c0jt6.LIZ();
                LinkedHashMap linkedHashMap = mapLIZ != null ? new LinkedHashMap(mapLIZ) : new LinkedHashMap();
                if (linkedHashMap.containsKey(string)) {
                    String str = (String) linkedHashMap.get(string);
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.remove(string);
                    if (linkedHashMap.size() > 50) {
                        linkedHashMap.clear();
                    }
                    c0jt6.LIZJ(linkedHashMap);
                    pair = new Pair<>(Boolean.TRUE, str);
                } else {
                    pair = new Pair<>(Boolean.FALSE, "");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("[shouldShowCelebrationPage]milestone keva crash", e);
                pair = new Pair<>(Boolean.FALSE, "");
            }
            if (zBooleanValue) {
                LJJJJ(c1096010ecx, pair, strLIZLLL, viewGroup, j);
            } else {
                DataChannel dataChannel5 = this.LJIILL;
                if (dataChannel5 != null) {
                    dataChannel5.FQ2(OrientationChangeEvent.class);
                }
                C11NZ.LJLJJLL(1000L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0ect
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("FansClubEntranceController@e036.entranceClickOperation$1$1");
                        this.LL.LJJJJ(c1096010ecx, pair, strLIZLLL, viewGroup, j);
                        C1C7U.LIZIZ("FansClubEntranceController@e036.entranceClickOperation$1$1");
                    }
                });
                DataChannel dataChannel6 = this.LJIILL;
                if (dataChannel6 != null && (l = (Long) dataChannel6.gg0(AudienceShowOrientationBeginTime.class)) != null) {
                    IDefinitionService iDefinitionService = (IDefinitionService) C1161920gLG.LIZJ(IDefinitionService.class);
                    DataChannel dataChannel7 = this.LJIILL;
                    if (dataChannel7 == null || (room = (Room) dataChannel7.gg0(RoomChannel.class)) == null || (string2 = Long.valueOf(room.getId()).toString()) == null) {
                        string2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    iDefinitionService.vu2(1, 0, -1, l.longValue(), string2, "click_fans");
                }
            }
            if (!LiveFansClubLandscapeEventSetting.INSTANCE.getValue()) {
                LJIJJ(c1096010ecx);
            }
            C1092520eXK c1092520eXK3 = this.LJJLIIIJILLIZJL;
            DataChannel dataChannel8 = this.LJIILL;
            long jLJJLIIIJ = dataChannel8 != null ? C500260Jjc.LJJLIIIJ(dataChannel8) : 0L;
            c1092520eXK3.getClass();
            C1092520eXK.LIZIZ(jLJJLIIIJ);
        }
    }

    public final void LJIJJLI() {
        this.LIZLLL = new C1095140ebY(0L, 0L, null, 0, "#FFFF984D", 0L, 7936);
        InterfaceC1095350ebt interfaceC1095350ebt = this.LJIILIIL;
        if (interfaceC1095350ebt != null) {
            C1096340edU c1096340edU = (C1096340edU) interfaceC1095350ebt;
            c1096340edU.LJJIJIL = true;
            C12ES.LJIILL(8, c1096340edU.LJJIIZ);
            C12ES.LJIILL(8, c1096340edU.LJJIIZI);
            c1096340edU.LIZ(c1096340edU.LJIIJJI() ? EnumC1096020ecy.FOLLOWED : EnumC1096020ecy.UNFOLLOW);
            c1096340edU.LJJIJIL = false;
        }
        LJJJJI();
        C1091250eVH c1091250eVH = this.LJIILLIIL;
        if (c1091250eVH != null) {
            c1091250eVH.LLJ.run();
        }
        this.LJJJI = false;
        this.LJJLIIIIJ = false;
    }

    public final void LJIL() {
        C12ES.LJIILL(8, this.LJIJJ);
        LJJJJIZL(this.LJIJJ);
        C16F5 c16f5 = this.LJIJJ;
        if (c16f5 != null) {
            C786410Ut5.Rc(c16f5, 0.0f);
        }
        C16F5 c16f52 = this.LJIJJ;
        if (c16f52 != null) {
            C786410Ut5.od(c16f52, 0.0f);
        }
        C12ES.LJIILL(8, this.LJIJJLI);
        LJJJJIZL(this.LJIJJLI);
        C16F5 c16f53 = this.LJIJJLI;
        if (c16f53 != null) {
            C786410Ut5.Rc(c16f53, 0.0f);
        }
        C16F5 c16f54 = this.LJIJJLI;
        if (c16f54 != null) {
            C786410Ut5.od(c16f54, 0.0f);
        }
    }

    public final void LJJ() {
        C12ES.LJIILL(8, this.LJJIJ);
        ImageView imageView = this.LJJIJ;
        if (imageView != null) {
            C786410Ut5.gd(imageView, 0.0f);
        }
        ImageView imageView2 = this.LJJIJ;
        if (imageView2 != null) {
            C786410Ut5.V4(imageView2, 1.0f);
        }
    }

    public final void LJJIJ() {
        DataChannel dataChannel = this.LJIILL;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C1083540eIq.class), Boolean.TRUE)) {
            this.LJJJ = false;
            return;
        }
        if (this.LJIILIIL != null) {
            this.LJJJ = true;
            try {
                C0JT6<Double> c0jt6 = InterfaceC1093910eZZ.LLLLLLLLLL;
                c0jt6.LIZJ(Double.valueOf(((int) (c0jt6.LIZ() != null ? r0.doubleValue() : 0.0d)) + 1));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1095930ecp c1095930ecp = this.LJJJJ;
            if (c1095930ecp != null) {
                AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 278);
                if (c1095930ecp.LIZLLL != null) {
                    C16F5 c16f5 = c1095930ecp.LJIJJLI;
                    if (c16f5 != null) {
                        c16f5.setText(C497740JfY.LJIJI(FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2() ? 2131852371 : 2131841652));
                    }
                    ((C1096340edU) c1095930ecp.LIZLLL).LIZJ();
                    C443120HZe c443120HZeLJIIJJI = AbstractC1096120ed8.LJIIJJI(c1095930ecp, c1095930ecp.LIZLLL, c1095930ecp.LJIJJLI, 2700L, 100L, 200L, null, null, false, 448);
                    Object first = c443120HZeLJIIJJI.getFirst();
                    long jLongValue = ((Number) c443120HZeLJIIJJI.getSecond()).longValue();
                    long jLongValue2 = ((Number) c443120HZeLJIIJJI.getThird()).longValue();
                    long j = jLongValue + 100;
                    ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ.setDuration(200L);
                    ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIZILJ, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ2.setDuration(200L);
                    objectAnimatorLIZ2.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 104));
                    ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ3.setDuration(200L);
                    objectAnimatorLIZ3.setStartDelay(j);
                    ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIZILJ, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ4.setDuration(200L);
                    objectAnimatorLIZ4.setStartDelay(j);
                    objectAnimatorLIZ4.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 105));
                    c1095930ecp.LJJIL.LIZ(C11NZ.LJJJJZ(1).LJJI(jLongValue2 + 100, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS178S0100000_9(awS561S0100000_17, 86)).LJJLJ());
                    AnimatorSet animatorSetInvoke = c1095930ecp.LJJIJIL.invoke();
                    if (animatorSetInvoke != null) {
                        C323580CmK c323580CmK = new C323580CmK(5);
                        c323580CmK.LIZIZ(first);
                        c323580CmK.LIZ(objectAnimatorLIZ);
                        c323580CmK.LIZ(objectAnimatorLIZ2);
                        c323580CmK.LIZ(objectAnimatorLIZ3);
                        c323580CmK.LIZ(objectAnimatorLIZ4);
                        animatorSetInvoke.playTogether((Animator[]) c323580CmK.LIZLLL(new Animator[c323580CmK.LIZJ()]));
                        animatorSetInvoke.start();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIZ() {
        if (!this.LJJJJLI) {
            this.LJJLIIIJJI.LIZ();
            return;
        }
        this.LJJJ = true;
        C1095930ecp c1095930ecp = this.LJJJJ;
        if (c1095930ecp != null) {
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 271);
            ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJIILIIL, View.ALPHA, 1.0f, 0.0f);
            objectAnimatorLIZ.setDuration(300L);
            objectAnimatorLIZ.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 114));
            ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIJI, View.ALPHA, 0.0f, 1.0f);
            objectAnimatorLIZ2.setDuration(200L);
            objectAnimatorLIZ2.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 116));
            Pair pairLIZIZ = AbstractC1096120ed8.LIZIZ(0.0f, 1.0f, 300L, 0L, c1095930ecp.LJIJI);
            ((Animator) pairLIZIZ.getFirst()).addListener(new ALAdapterS13S0100000_17(awS561S0100000_17, 118));
            AnimatorSet animatorSetInvoke = c1095930ecp.LJJIJIL.invoke();
            if (animatorSetInvoke != null) {
                animatorSetInvoke.playTogether(objectAnimatorLIZ2, objectAnimatorLIZ, pairLIZIZ.getFirst(), pairLIZIZ.getSecond());
                animatorSetInvoke.start();
            }
        }
    }

    public final void LJJJJI() {
        C1091250eVH c1091250eVH = this.LJIILLIIL;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(true);
        }
        C1091250eVH c1091250eVH2 = this.LJIILLIIL;
        if (c1091250eVH2 != null) {
            c1091250eVH2.setEnableFixedSize(false);
        }
    }

    public final void LJJJJJ() {
        C12ES.LJIILL(8, this.LJIL);
        C12ES.LJIILL(0, this.LJJIII);
        C1324720kZq c1324720kZq = this.LJIJI;
        if (c1324720kZq != null) {
            c1324720kZq.setImageResource(R.drawable.elj);
        }
        ImageView imageView = this.LJJIII;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ejq);
        }
        C12ES.LJIILL(0, this.LJJIL);
        this.LJJJJLI = false;
        C12ES.LJIILL(8, this.LJJIIJ);
        LJJJJIZL(this.LJJIIJ);
        LJJ();
    }

    @Override // X.C1095950ecr, X.InterfaceC1096360edW
    public final void onRelease() {
        ViewGroup viewGroup = this.LJIIL;
        if (viewGroup != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup, this.LJJJJJ);
        }
        this.LJJJLL = null;
        this.LJJJLZIJ = null;
        this.LIZLLL = null;
        LJIIZILJ();
        this.LJJJJ = null;
        this.LJJLI = false;
        this.LJJLIIIIJ = false;
        super.onRelease();
    }

    @Override // X.InterfaceC1096360edW
    public final int LJ() {
        return C497740JfY.LJIIIZ(R.dimen.anx);
    }

    @Override // X.InterfaceC1096360edW
    public final View LIZJ() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1096360edW
    public final View LJI() {
        return this.LJJIL;
    }

    @Override // X.InterfaceC1096360edW
    public final View LJIIIIZZ() {
        return this.LJJIII;
    }

    public static void LJJJJIZL(View view) {
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
        }
    }

    @Override // X.InterfaceC1096360edW
    public final void LIZ(C1094740eau c1094740eau) {
        if (c1094740eau == null) {
            return;
        }
        C1096000ecw c1096000ecw = new C1096000ecw(0L, (Text) null, (FansEventData.EntranceGuidanceData) null, 0L, (GuidanceConfig) null, c1094740eau);
        EnumC1095860eci enumC1095860eci = EnumC1095860eci.FANS_CLUB_ROOM_INFO_ANIM_GUIDE_TYPE;
        C1095140ebY c1095140ebY = this.LIZLLL;
        LJJJJJL(enumC1095860eci, c1095140ebY, c1095140ebY, 0L, 0L, c1096000ecw);
    }

    @Override // X.InterfaceC1096360edW
    public final void LJII(Object obj) {
        EnumC1096020ecy enumC1096020ecy;
        String str;
        boolean z;
        int i;
        if (obj instanceof EnumC1096020ecy) {
            enumC1096020ecy = (EnumC1096020ecy) obj;
        } else {
            enumC1096020ecy = null;
        }
        LJJJJLI(enumC1096020ecy);
        if (enumC1096020ecy != null) {
            int i2 = C1095870ecj.LIZ[enumC1096020ecy.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            LJIJ();
                            LJJJJZ(this.LIZLLL);
                            LJJJJLL(this.LIZLLL, false);
                        } else {
                            return;
                        }
                    } else {
                        this.LJJJ = false;
                        LJJJJJ();
                        EnumC1095860eci enumC1095860eci = EnumC1095860eci.FANS_CLUB_ANIM_PLUS_TO_ONE_TYPE;
                        C1095140ebY c1095140ebY = this.LIZLLL;
                        LJJJJJL(enumC1095860eci, c1095140ebY, c1095140ebY, 0L, 0L, null);
                    }
                } else {
                    LJJJJJ();
                }
            } else {
                LJJJJJ();
                this.LJJJ = false;
                try {
                    C011Z.LIZ.LJJII();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (1 != 0) {
                if (enumC1096020ecy == null || ((i = C1095870ecj.LIZ[enumC1096020ecy.ordinal()]) != 4 && i != 5)) {
                    str = "guidance_page";
                } else {
                    str = "task_page";
                }
                DataChannel dataChannel = this.LJIILL;
                InterfaceC1095350ebt interfaceC1095350ebt = this.LJIILIIL;
                if (interfaceC1095350ebt != null && ((C1096340edU) interfaceC1095350ebt).LJIIJJI()) {
                    z = true;
                } else {
                    z = false;
                }
                LJIILJJIL(dataChannel, z, false, this.LJI, str, null, C500260Jjc.LJJJJIZL(this.LJJIJLIJ), this.LJJJLZIJ, Long.valueOf(this.LJJJZ), false, this.LJIIJ, false, null);
                DataChannel dataChannel2 = this.LJIILL;
                if (LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting.INSTANCE.enableReport()) {
                    C235400vY.LIZ(dataChannel2, "livesdk_fans_club_entrance_show_frame_check");
                }
            }
            if (1 != 0 && !this.LJJJJIZL) {
                this.LJJJJIZL = true;
                ViewGroup viewGroup = this.LJIIL;
                if (viewGroup != null) {
                    HandlerHook.viewPostDelay(viewGroup, this.LJJJJJ, 2000L);
                }
            }
        }
    }

    @Override // X.InterfaceC1096360edW
    public final void LJIIIZ(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (this.LJIIZILJ == null) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LJIIZILJ);
        if (z) {
            if (LiveFansClubTopOneOptSetting.INSTANCE.getValue() && this.LJJLIIIIJ) {
                this.LJJLIIIIJ = false;
            } else {
                c19mb.LJI(R.id.lgs, 7);
                c19mb.LJIIIIZZ(R.id.lgs, 7, R.id.hnu, 7);
                c19mb.LJI(R.id.lgu, 6);
                c19mb.LJIIIIZZ(R.id.lgu, 6, R.id.hnx, 6);
                c19mb.LIZIZ(this.LJIIZILJ);
                this.LJJLIIIIJ = true;
            }
        } else {
            c19mb.LJI(R.id.lgs, 7);
            c19mb.LJI(R.id.lgu, 6);
            c19mb.LJIIIIZZ(R.id.lgu, 7, R.id.lgs, 7);
            if (LiveFansClubQuitMarginFixSetting.INSTANCE.getValue()) {
                c19mb.LJI(R.id.zlk, 7);
                c19mb.LJIIIZ(R.id.zlk, 7, 0, 7, C497740JfY.LJIIIZ(R.dimen.ao4));
            }
            c19mb.LIZIZ(this.LJIIZILJ);
        }
        ConstraintLayout constraintLayout = this.LJIIZILJ;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (constraintLayout != null) {
            layoutParams = constraintLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.width = -2;
        }
        ConstraintLayout constraintLayout2 = this.LJIIZILJ;
        if (constraintLayout2 != null) {
            C786410Ut5.m6(constraintLayout2, marginLayoutParams);
        }
    }

    public final void LJIJJ(C1096010ecx c1096010ecx) {
        boolean z;
        boolean z2;
        DataChannel dataChannel = this.LJIILL;
        InterfaceC1095350ebt interfaceC1095350ebt = this.LJIILIIL;
        if (interfaceC1095350ebt != null && ((C1096340edU) interfaceC1095350ebt).LJIIJJI()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.LJI;
        String str = c1096010ecx.LIZIZ;
        C1096070ed3 c1096070ed3 = c1096010ecx.LIZ;
        boolean zLJJJJIZL = C500260Jjc.LJJJJIZL(this.LJJIJLIJ);
        EnumC1095860eci enumC1095860eci = this.LJJJLZIJ;
        Long lValueOf = Long.valueOf(this.LJJJZ);
        boolean z4 = this.LJIIIZ;
        String str2 = this.LJIIJ;
        if (this.LJIIJJI > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJIILJJIL(dataChannel, z, true, z3, str, c1096070ed3, zLJJJJIZL, enumC1095860eci, lValueOf, z4, str2, z2, c1096010ecx.LIZJ);
        DataChannel dataChannel2 = this.LJIILL;
        if (this.LJJJLL == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_GUIDE_TYPE) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_claim_point_guide_entrance_click");
            C498410Jgd.LIZ(c474500IjALIZ, dataChannel2);
            C518180KTw.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(C518180KTw.LJFF(((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0()), "fans_club_relation_info");
            c474500IjALIZ.LJJII(Long.valueOf(C518180KTw.LJJIFFI()), "duration_after_watch");
            c474500IjALIZ.LJJII("entrance", "enter_from");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJIJL();
            }
        }
        DataChannel dataChannel3 = this.LJIILL;
        if (LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting.INSTANCE.enableReport()) {
            C235400vY.LIZ(dataChannel3, "livesdk_fans_club_entrance_click_frame_check");
        }
        this.LJIIJJI = 0L;
    }

    public final void LJJII(long j) {
        int i;
        if (this.LJIILIIL != null) {
            C518180KTw.LJ(this.LJIILL);
            this.LJJJ = true;
            this.LJJJJLI = true;
            this.LJJJJZI = true;
            InterfaceC1093910eZZ.LLLLLLZ.LIZJ(Boolean.TRUE);
            C1095930ecp c1095930ecp = this.LJJJJ;
            if (c1095930ecp != null) {
                AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 275);
                if (c1095930ecp.LIZLLL != null) {
                    C16F5 c16f5 = c1095930ecp.LJIJJLI;
                    if (c16f5 != null) {
                        if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                            i = 2131852368;
                        } else {
                            i = 2131856936;
                        }
                        c16f5.setText(C497740JfY.LJIJI(i));
                    }
                    C16F5 c16f52 = c1095930ecp.LJJIIJ;
                    if (c16f52 != null) {
                        c16f52.setText(C1095930ecp.LJIJI(j));
                    }
                    ((C1096340edU) c1095930ecp.LIZLLL).LIZJ();
                    int iLJIJJ = c1095930ecp.LJIJJ(j);
                    C443120HZe c443120HZeLJIIJJI = AbstractC1096120ed8.LJIIJJI(c1095930ecp, c1095930ecp.LIZLLL, c1095930ecp.LJIJJLI, 1500L, 0L, 0L, null, null, false, 500);
                    Object first = c443120HZeLJIIJJI.getFirst();
                    long jLongValue = ((Number) c443120HZeLJIIJJI.getSecond()).longValue();
                    ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJJII, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ.setDuration(300L);
                    objectAnimatorLIZ.setStartDelay(jLongValue);
                    objectAnimatorLIZ.addListener(new AAListenerS328S0100000_17(c1095930ecp, 40));
                    ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp.LJJIIZ, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ2.setDuration(300L);
                    objectAnimatorLIZ2.setStartDelay(jLongValue);
                    objectAnimatorLIZ2.addListener(new AAListenerS90S0101000_17(iLJIJJ, c1095930ecp, 8));
                    objectAnimatorLIZ2.addListener(new AAListenerS328S0100000_17(awS561S0100000_17, 42));
                    AnimatorSet animatorSetInvoke = c1095930ecp.LJJIJIL.invoke();
                    if (animatorSetInvoke != null) {
                        C323580CmK c323580CmK = new C323580CmK(3);
                        c323580CmK.LIZIZ(first);
                        c323580CmK.LIZ(objectAnimatorLIZ);
                        c323580CmK.LIZ(objectAnimatorLIZ2);
                        animatorSetInvoke.playTogether((Animator[]) c323580CmK.LIZLLL(new Animator[c323580CmK.LIZJ()]));
                        animatorSetInvoke.start();
                    }
                }
            }
        }
    }

    public final void LJJIIJ(C1095140ebY c1095140ebY) {
        int width;
        ViewGroup viewGroup;
        this.LJJJ = true;
        C1095930ecp c1095930ecp = this.LJJJJ;
        if (c1095930ecp != null) {
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 277);
            if (c1095140ebY != null) {
                long j = c1095140ebY.LIZ;
                C430340Gu8 c430340Gu8 = c1095930ecp.LJIILIIL;
                if (c430340Gu8 != null) {
                    c430340Gu8.setText(String.valueOf(j));
                }
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1095930ecp.LJIIL, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat.addListener(new AAListenerS328S0100000_17(c1095930ecp, 46));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1095930ecp.LJJII, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 1.2f);
            objectAnimatorOfFloat2.setInterpolator(AbstractC1096120ed8.LJIIL(2));
            objectAnimatorOfFloat2.setDuration(400L);
            objectAnimatorOfFloat2.addListener(new AAListenerS328S0100000_17(c1095930ecp, 48));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1095930ecp.LJJII, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 1.2f);
            objectAnimatorOfFloat3.setInterpolator(AbstractC1096120ed8.LJIIL(2));
            objectAnimatorOfFloat3.setDuration(400L);
            objectAnimatorOfFloat3.addListener(new AAListenerS328S0100000_17(c1095930ecp, 56));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1095930ecp.LJJII, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(400L);
            objectAnimatorOfFloat4.setInterpolator(AbstractC1096120ed8.LJIIL(1));
            objectAnimatorOfFloat4.addListener(new AAListenerS328S0100000_17(c1095930ecp, 65));
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c1095930ecp.LJIIIZ, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat5.setDuration(400L);
            objectAnimatorOfFloat5.setInterpolator(AbstractC1096120ed8.LJIIL(1));
            objectAnimatorOfFloat5.addListener(new AAListenerS328S0100000_17(c1095930ecp, 68));
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(c1095930ecp.LJIIIZ, (Property<C1324720kZq, Float>) View.SCALE_X, 0.83f, 1.0f);
            objectAnimatorOfFloat6.setInterpolator(AbstractC1096120ed8.LJIIL(2));
            objectAnimatorOfFloat6.setDuration(400L);
            objectAnimatorOfFloat6.addListener(new AAListenerS328S0100000_17(c1095930ecp, 72));
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(c1095930ecp.LJIIIZ, (Property<C1324720kZq, Float>) View.SCALE_Y, 0.83f, 1.0f);
            objectAnimatorOfFloat7.setInterpolator(AbstractC1096120ed8.LJIIL(2));
            objectAnimatorOfFloat7.setDuration(400L);
            objectAnimatorOfFloat7.addListener(new AAListenerS328S0100000_17(c1095930ecp, 74));
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(c1095930ecp.LJJIIJ, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat8.setDuration(200L);
            objectAnimatorOfFloat8.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat8.addListener(new AAListenerS328S0100000_17(c1095930ecp, 76));
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(c1095930ecp.LJJIIJZLJL, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat9.setDuration(200L);
            objectAnimatorOfFloat9.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat9.addListener(new AAListenerS328S0100000_17(c1095930ecp, 77));
            InterfaceC1095350ebt interfaceC1095350ebt = c1095930ecp.LIZLLL;
            if (interfaceC1095350ebt != null && (viewGroup = ((C1096340edU) interfaceC1095350ebt).LJ) != null) {
                width = viewGroup.getWidth();
            } else {
                width = 0;
            }
            ValueAnimator valueAnimatorLJIIIZ = c1095930ecp.LJIIIZ(width, C497740JfY.LJIIIZ(R.dimen.anx));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, valueAnimatorLJIIIZ);
            animatorSet.addListener(new AAListenerS328S0100000_17(awS561S0100000_17, 79));
            animatorSet.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0085 A[PHI: r1
      0x0085: PHI (r1v1 boolean) = (r1v0 boolean), (r1v6 boolean), (r1v6 boolean), (r1v6 boolean) binds: [B:16:0x0029, B:25:0x003b, B:27:0x003f, B:29:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0089 A[PHI: r1 r6
      0x0089: PHI (r1v2 boolean) = (r1v1 boolean), (r1v5 boolean), (r1v5 boolean), (r1v5 boolean) binds: [B:55:0x0086, B:32:0x0049, B:34:0x004d, B:36:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r6v1 int) = (r6v0 int), (r6v5 int), (r6v5 int), (r6v5 int) binds: [B:55:0x0086, B:32:0x0049, B:34:0x004d, B:36:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r10) {
        /*
            r9 = this;
            X.0ebt r0 = r9.LJIILIIL
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L84
            r9.LJJJ = r1
            java.lang.String r0 = "common"
            r9.LJIIJ = r0
            if (r10 == 0) goto L1e
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r10.displayConfiguration
            if (r0 == 0) goto L1e
            com.bytedance.android.livesdk.livesetting.level.ContentConfiguration r0 = r0.contentConfiguration
            if (r0 == 0) goto L1e
            com.bytedance.android.livesdk.livesetting.level.IconConfig r0 = r0.icon
            if (r0 == 0) goto L1e
            java.lang.String r2 = r0.geckoChannel
            if (r2 != 0) goto L20
        L1e:
            java.lang.String r2 = ""
        L20:
            X.0eae r0 = X.C1094580eae.LIZ
            r0.getClass()
            java.lang.String r3 = X.C1094580eae.LJIIL(r10)
            if (r10 == 0) goto L85
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r10.displayConfiguration
            if (r0 == 0) goto L39
            com.bytedance.android.livesdk.livesetting.level.ContentConfiguration r0 = r0.contentConfiguration
            if (r0 == 0) goto L39
            com.bytedance.android.livesdk.livesetting.level.IconConfig r0 = r0.icon
            if (r0 == 0) goto L39
            boolean r1 = r0.useDpUnit
        L39:
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r10.displayConfiguration
            if (r0 == 0) goto L85
            com.bytedance.android.livesdk.livesetting.level.ContentConfiguration r0 = r0.contentConfiguration
            if (r0 == 0) goto L85
            com.bytedance.android.livesdk.livesetting.level.IconConfig r0 = r0.icon
            if (r0 == 0) goto L85
            int r6 = r0.height
        L47:
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r10.displayConfiguration
            if (r0 == 0) goto L89
            com.bytedance.android.livesdk.livesetting.level.ContentConfiguration r0 = r0.contentConfiguration
            if (r0 == 0) goto L89
            com.bytedance.android.livesdk.livesetting.level.IconConfig r0 = r0.icon
            if (r0 == 0) goto L89
            int r5 = r0.width
        L55:
            if (r1 == 0) goto L5d
            float r0 = (float) r6
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r6 = (int) r0
        L5d:
            if (r1 == 0) goto L65
            float r0 = (float) r5
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r5 = (int) r0
        L65:
            if (r10 == 0) goto L75
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r10.displayConfiguration
            if (r0 == 0) goto L75
            com.bytedance.android.livesdk.livesetting.level.ContentConfiguration r0 = r0.contentConfiguration
            if (r0 == 0) goto L75
            com.bytedance.android.livesdk.livesetting.level.IconConfig r0 = r0.icon
            if (r0 == 0) goto L75
            int r7 = r0.containerFixedHeight
        L75:
            X.0ecp r1 = r9.LJJJJ
            if (r1 == 0) goto L84
            r4 = 1
            kotlin.jvm.internal.AwS418S0200000_17 r8 = new kotlin.jvm.internal.AwS418S0200000_17
            r0 = 37
            r8.<init>(r9, r10, r0)
            r1.LJJIII(r2, r3, r4, r5, r6, r7, r8)
        L84:
            return
        L85:
            r6 = 0
            if (r10 == 0) goto L89
            goto L47
        L89:
            r5 = 0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1095910ecn.LJJIIJZLJL(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f8 A[PHI: r14
      0x02f8: PHI (r14v8 boolean) = (r14v7 boolean), (r14v12 boolean), (r14v12 boolean), (r14v12 boolean) binds: [B:116:0x02f4, B:64:0x00db, B:66:0x00df, B:68:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fd A[PHI: r9 r14
      0x02fd: PHI (r9v7 int) = (r9v6 int), (r9v11 int), (r9v11 int), (r9v11 int) binds: [B:119:0x02f9, B:71:0x00e9, B:73:0x00ed, B:75:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r14v9 boolean) = (r14v8 boolean), (r14v11 boolean), (r14v11 boolean), (r14v11 boolean) binds: [B:119:0x02f9, B:71:0x00e9, B:73:0x00ed, B:75:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r38) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1095910ecn.LJJIIZ(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e A[PHI: r10
      0x004e: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:29:0x004c, B:27:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4 A[PHI: r6
      0x00e4: PHI (r6v1 int) = (r6v0 int), (r6v3 int) binds: [B:63:0x00e0, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r18) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1095910ecn.LJJIIZI(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig):void");
    }

    public final void LJJIJIL(boolean z) {
        if (!this.LJJJJLI) {
            this.LJJLIIIJJI.LIZ();
            return;
        }
        this.LJJJ = true;
        C1095930ecp c1095930ecp = this.LJJJJ;
        if (c1095930ecp != null) {
            AwS135S0110000_17 awS135S0110000_17 = new AwS135S0110000_17(z, this, 1);
            ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJIILIIL, View.ALPHA, 0.0f, 1.0f);
            objectAnimatorLIZ.setDuration(300L);
            objectAnimatorLIZ.setStartDelay(0L);
            objectAnimatorLIZ.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 115));
            AnimatorSet animatorSetInvoke = c1095930ecp.LJJIJIL.invoke();
            if (animatorSetInvoke != null) {
                C323580CmK c323580CmK = new C323580CmK(2);
                c323580CmK.LIZ(objectAnimatorLIZ);
                c323580CmK.LIZIZ(c1095930ecp.LJIJJLI(awS135S0110000_17));
                animatorSetInvoke.playTogether((Animator[]) c323580CmK.LIZLLL(new Animator[c323580CmK.LIZJ()]));
                animatorSetInvoke.start();
            }
        }
    }

    public final void LJJIJL(C1095140ebY c1095140ebY) {
        this.LJJJ = true;
        LJJJJLL(c1095140ebY, false);
        this.LIZLLL = c1095140ebY;
        if (this.LJJJJI) {
            this.LJJLIIIJJI.LIZ();
            return;
        }
        C1095930ecp c1095930ecp = this.LJJJJ;
        if (c1095930ecp == null) {
            return;
        }
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 280);
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJIILIIL, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ.setDuration(200L);
        ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ2.setDuration(200L);
        objectAnimatorLIZ2.addListener(new ALAdapterS13S0100000_17(awS561S0100000_17, 107));
        AnimatorSet animatorSetInvoke = c1095930ecp.LJJIJIL.invoke();
        if (animatorSetInvoke == null) {
            return;
        }
        animatorSetInvoke.playTogether(objectAnimatorLIZ, objectAnimatorLIZ2);
        animatorSetInvoke.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJLIJ(final long j) {
        this.LJJJ = true;
        final C1095930ecp c1095930ecp = this.LJJJJ;
        if (c1095930ecp != null) {
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 281);
            C16F5 c16f5 = c1095930ecp.LJJIIJ;
            if (c16f5 != null) {
                c16f5.setText(C1095930ecp.LJIJI(j));
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1095930ecp.LJJIII, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 1.8f);
            objectAnimatorOfFloat.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.addListener(new AAListenerS328S0100000_17(c1095930ecp, 71));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1095930ecp.LJJIII, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 1.8f);
            objectAnimatorOfFloat2.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat2.setDuration(400L);
            Pair pair = new Pair(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1095930ecp.LJJIII, (Property<ImageView, Float>) View.ALPHA, 0.3f, 0.0f);
            objectAnimatorOfFloat3.setStartDelay(100L);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(AbstractC1096120ed8.LJIIL(4));
            objectAnimatorOfFloat3.addListener(new AAListenerS328S0100000_17(c1095930ecp, 44));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1095930ecp.LJJIIZ, (Property<LinearLayout, Float>) View.SCALE_X, 1.0f, 1.24f, 1.0f);
            objectAnimatorOfFloat4.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat4.setDuration(400L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c1095930ecp.LJJIIZ, (Property<LinearLayout, Float>) View.SCALE_Y, 1.0f, 1.24f, 1.0f);
            objectAnimatorOfFloat5.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat5.setDuration(400L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(pair.getFirst(), pair.getSecond(), objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5);
            animatorSet.addListener(new AAListenerS328S0100000_17(awS561S0100000_17, 45));
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0ec1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    ViewGroup viewGroup;
                    ViewGroup.LayoutParams layoutParams;
                    InterfaceC1095350ebt interfaceC1095350ebt = c1095930ecp.LIZLLL;
                    if (interfaceC1095350ebt != null && (viewGroup = ((C1096340edU) interfaceC1095350ebt).LJ) != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                        layoutParams.width = c1095930ecp.LJIJJ(j);
                        C786410Ut5.W5(viewGroup, layoutParams);
                    }
                }
            });
            animatorSet.start();
        }
    }

    public final void LJJJIL(GuidanceConfig guidanceConfig) {
        TextConfig textConfig;
        long j;
        int i;
        ContentConfiguration contentConfiguration;
        if (guidanceConfig != null && this.LJIILIIL != null) {
            this.LJJJ = true;
            this.LJIIJ = "common";
            C1095930ecp c1095930ecp = this.LJJJJ;
            if (c1095930ecp != null) {
                AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, guidanceConfig, 34);
                if (c1095930ecp.LIZLLL != null) {
                    C1094580eae c1094580eae = C1094580eae.LIZ;
                    DisplayConfiguration displayConfiguration = guidanceConfig.displayConfiguration;
                    if (displayConfiguration != null && (contentConfiguration = displayConfiguration.contentConfiguration) != null) {
                        textConfig = contentConfiguration.text;
                    } else {
                        textConfig = null;
                    }
                    c1094580eae.getClass();
                    Text textLJIIJJI = C1094580eae.LJIIJJI(textConfig);
                    C16F5 c16f5 = c1095930ecp.LJIJJLI;
                    if (c16f5 != null) {
                        c1094580eae.getClass();
                        c16f5.setText(C1094580eae.LJFF(textLJIIJJI));
                    }
                    ((C1096340edU) c1095930ecp.LIZLLL).LIZJ();
                    DisplayConfiguration displayConfiguration2 = guidanceConfig.displayConfiguration;
                    if (displayConfiguration2 != null && (i = displayConfiguration2.duration) > 0) {
                        j = ((long) i) * 1000;
                    } else {
                        j = 2700;
                    }
                    C443120HZe c443120HZeLJIIJJI = AbstractC1096120ed8.LJIIJJI(c1095930ecp, c1095930ecp.LIZLLL, c1095930ecp.LJIJJLI, j, 100L, 200L, null, null, false, 448);
                    Object first = c443120HZeLJIIJJI.getFirst();
                    long jLongValue = ((Number) c443120HZeLJIIJJI.getSecond()).longValue();
                    long jLongValue2 = ((Number) c443120HZeLJIIJJI.getThird()).longValue();
                    long j2 = jLongValue + 100;
                    ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ.setDuration(200L);
                    ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIZILJ, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ2.setDuration(200L);
                    objectAnimatorLIZ2.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 102));
                    ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ3.setDuration(200L);
                    objectAnimatorLIZ3.setStartDelay(j2);
                    ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIZILJ, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ4.setDuration(200L);
                    objectAnimatorLIZ4.setStartDelay(j2);
                    objectAnimatorLIZ4.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 103));
                    c1095930ecp.LJJIL.LIZ(C11NZ.LJJJJZ(1).LJJI(jLongValue2 + 100, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS178S0100000_9(awS418S0200000_17, 85)).LJJLJ());
                    AnimatorSet animatorSetInvoke = c1095930ecp.LJJIJIL.invoke();
                    if (animatorSetInvoke != null) {
                        C323580CmK c323580CmK = new C323580CmK(5);
                        c323580CmK.LIZIZ(first);
                        c323580CmK.LIZ(objectAnimatorLIZ);
                        c323580CmK.LIZ(objectAnimatorLIZ2);
                        c323580CmK.LIZ(objectAnimatorLIZ3);
                        c323580CmK.LIZ(objectAnimatorLIZ4);
                        animatorSetInvoke.playTogether((Animator[]) c323580CmK.LIZLLL(new Animator[c323580CmK.LIZJ()]));
                        animatorSetInvoke.start();
                    }
                }
            }
        }
    }

    public final void LJJJJLI(EnumC1096020ecy enumC1096020ecy) {
        InterfaceC1095350ebt interfaceC1095350ebt = this.LJIILIIL;
        if (interfaceC1095350ebt != null) {
            C1096340edU c1096340edU = (C1096340edU) interfaceC1095350ebt;
            if (enumC1096020ecy instanceof EnumC1096020ecy) {
                c1096340edU.LJIILL = enumC1096020ecy;
            }
        }
        this.LIZJ = enumC1096020ecy;
    }

    public final void LJJJJZ(C1095140ebY c1095140ebY) {
        C1091250eVH c1091250eVH = this.LJIILLIIL;
        boolean z = true;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(true);
        }
        C1091250eVH c1091250eVH2 = this.LJIILLIIL;
        if (c1091250eVH2 != null) {
            if (c1095140ebY == null || c1095140ebY.LIZ <= 0) {
                z = false;
            }
            c1091250eVH2.setEnableFixedSize(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIFFI(C1095140ebY c1095140ebY, C1095140ebY c1095140ebY2) {
        Context context;
        C430340Gu8 c430340Gu8;
        FansEntranceResConfig fansEntranceResConfigGY;
        boolean zU61;
        C1324720kZq c1324720kZq;
        this.LJJJ = true;
        String str = "#FFFFA25F";
        if (this.LJJJJI) {
            C1095930ecp c1095930ecp = this.LJJJJ;
            if (c1095930ecp != null) {
                AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, c1095140ebY2, 35);
                C12ES.LJIILL(8, c1095930ecp.LJJIFFI);
                ImageView imageView = c1095930ecp.LJJIFFI;
                if (imageView != null) {
                    C786410Ut5.gd(imageView, 0.0f);
                }
                ImageView imageView2 = c1095930ecp.LJJIFFI;
                if (imageView2 != null) {
                    C786410Ut5.V4(imageView2, 1.0f);
                }
                C12ES.LJIILL(8, c1095930ecp.LJIILL);
                C12ES.LJIILL(0, c1095930ecp.LJIIIZ);
                C12ES.LJIILL(0, c1095930ecp.LJIILIIL);
                C12ES.LJIILL(8, c1095930ecp.LJIJI);
                C12ES.LJIILL(0, c1095930ecp.LJIIL);
                C12ES.LJIILL(8, c1095930ecp.LJIIZILJ);
                C1819620xS4.LIZ().LJIIIZ(c1095140ebY2.LIZJ).LJJI(c1095930ecp.LJIIIZ);
                C430340Gu8 c430340Gu82 = c1095930ecp.LJIILIIL;
                if (c430340Gu82 != null) {
                    c430340Gu82.setText(String.valueOf(c1095140ebY2.LIZ));
                }
                C430340Gu8 c430340Gu83 = c1095930ecp.LJIILIIL;
                if (c430340Gu83 != null) {
                    c430340Gu83.LJJJJI(-1);
                }
                C430340Gu8 c430340Gu84 = c1095930ecp.LJIILIIL;
                if (c430340Gu84 != null) {
                    String str2 = c1095140ebY2.LJI;
                    if (str2 != null) {
                        str = str2;
                    }
                    c430340Gu84.setTextColor(C497740JfY.LJI(0, str));
                }
                awS418S0200000_17.invoke();
                return;
            }
            return;
        }
        C1095930ecp c1095930ecp2 = this.LJJJJ;
        if (c1095930ecp2 == null) {
            return;
        }
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c1095140ebY, 273);
        AwS418S0200000_17 awS418S0200000_172 = new AwS418S0200000_17(this, c1095140ebY2, 36);
        AwS561S0100000_17 awS561S0100000_172 = new AwS561S0100000_17(this, 274);
        C12ES.LJIILL(8, c1095930ecp2.LJJIFFI);
        ImageView imageView3 = c1095930ecp2.LJJIFFI;
        if (imageView3 != null) {
            C786410Ut5.gd(imageView3, 0.0f);
        }
        ImageView imageView4 = c1095930ecp2.LJJIFFI;
        if (imageView4 != null) {
            C786410Ut5.V4(imageView4, 1.0f);
        }
        LiveFansClubClaimPointsOptSetting liveFansClubClaimPointsOptSetting = LiveFansClubClaimPointsOptSetting.INSTANCE;
        if (!liveFansClubClaimPointsOptSetting.enableFansClubPointOpt()) {
            C12ES.LJIILL(4, c1095930ecp2.LJJIFFI);
        }
        C12ES.LJIILL(0, c1095930ecp2.LJIILL);
        C12ES.LJIILL(0, c1095930ecp2.LJIIIZ);
        C12ES.LJIILL(0, c1095930ecp2.LJIILIIL);
        C12ES.LJIILL(0, c1095930ecp2.LJIIL);
        C12ES.LJIILL(8, c1095930ecp2.LJIIZILJ);
        C013C c013c = new C013C();
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService != null && (fansEntranceResConfigGY = iFansClubService.gY((int) c1095140ebY2.LIZ)) != null) {
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource != null) {
                zU61 = iHostResource.u61(fansEntranceResConfigGY.geckoChannel);
            } else {
                zU61 = false;
            }
            c013c.element = zU61;
            if (zU61 && !TextUtils.isEmpty(fansEntranceResConfigGY.geckoChannel) && !TextUtils.isEmpty(fansEntranceResConfigGY.entranceAnimFileName)) {
                String str3 = fansEntranceResConfigGY.geckoChannel;
                String str4 = fansEntranceResConfigGY.entranceAnimFileName;
                c1095930ecp2.LJJJIL = null;
                if (C497740JfY.LJJ() && (c1324720kZq = c1095930ecp2.LJIILL) != null) {
                    C786410Ut5.Yb(c1324720kZq, -1.0f);
                }
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LJIILJJIL = true;
                c1143920fsE.LIZ = c1095930ecp2.LJIILL;
                c1143920fsE.LIZIZ = str3;
                c1143920fsE.LIZJ = str4;
                c1143920fsE.LJFF = true;
                c1143920fsE.LJ = new C1151950g5B(c1095930ecp2, 10);
                c1143920fsE.LJIILIIL = true;
                C1143680frq.LJIIIIZZ(c1143920fsE);
                c1095930ecp2.LJJJIL = c1143920fsE;
            }
        }
        C430340Gu8 c430340Gu85 = c1095930ecp2.LJIILIIL;
        if (c430340Gu85 != null) {
            c430340Gu85.setText(String.valueOf(c1095140ebY.LIZ));
        }
        ViewGroup viewGroup = c1095930ecp2.LJ;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (c430340Gu8 = c1095930ecp2.LJIILIIL) != null) {
            c430340Gu8.LJJJJI(C20736316Cj.LIZIZ(R.attr.c9i, context));
        }
        C430340Gu8 c430340Gu86 = c1095930ecp2.LJIILIIL;
        if (c430340Gu86 != null) {
            String str5 = c1095140ebY.LJI;
            if (str5 != null) {
                str = str5;
            }
            c430340Gu86.setTextColor(C497740JfY.LJI(0, str));
        }
        if (!c013c.element) {
            Pair pairLIZIZ = AbstractC1096120ed8.LIZIZ(1.0f, 0.6f, 200L, 0L, c1095930ecp2.LJIILIIL);
            ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIILIIL, View.ALPHA, 1.0f, 0.0f);
            objectAnimatorLIZ.setDuration(200L);
            Pair pairLIZIZ2 = AbstractC1096120ed8.LIZIZ(1.0f, 0.6f, 200L, 0L, c1095930ecp2.LJIIIZ);
            ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIIIZ, View.ALPHA, 1.0f, 0.0f);
            objectAnimatorLIZ2.setDuration(200L);
            Pair pairLIZIZ3 = AbstractC1096120ed8.LIZIZ(0.6f, 1.0f, 200L, 200L, c1095930ecp2.LJIILIIL);
            ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIILIIL, View.ALPHA, 0.0f, 1.0f);
            objectAnimatorLIZ3.setDuration(200L);
            objectAnimatorLIZ3.setStartDelay(200L);
            objectAnimatorLIZ3.addListener(new ALAdapterS7S0300000_17(awS418S0200000_172, c1095140ebY2, c1095930ecp2, 13));
            Pair pairLIZIZ4 = AbstractC1096120ed8.LIZIZ(0.6f, 1.0f, 200L, 200L, c1095930ecp2.LJIIIZ);
            ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIIIZ, View.ALPHA, 0.0f, 1.0f);
            objectAnimatorLIZ4.setDuration(200L);
            objectAnimatorLIZ4.setStartDelay(200L);
            ObjectAnimator objectAnimatorLIZ5 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJJIFFI, View.ALPHA, 0.0f, 1.0f);
            objectAnimatorLIZ5.setDuration(400L);
            objectAnimatorLIZ5.setStartDelay(400L);
            ObjectAnimator objectAnimatorLIZ6 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJJIFFI, View.TRANSLATION_Y, 1.0f, -C497740JfY.LJIIIZ(R.dimen.anp));
            objectAnimatorLIZ6.setDuration(400L);
            objectAnimatorLIZ6.setStartDelay(400L);
            objectAnimatorLIZ6.addListener(new ALAdapterS12S0200000_17(c1095930ecp2, awS561S0100000_172, 40));
            AnimatorSet animatorSetInvoke = c1095930ecp2.LJJIJIL.invoke();
            if (!liveFansClubClaimPointsOptSetting.enableFansClubPointOpt()) {
                if (animatorSetInvoke == null) {
                    return;
                } else {
                    animatorSetInvoke.playTogether(pairLIZIZ.getFirst(), pairLIZIZ.getSecond(), objectAnimatorLIZ, pairLIZIZ2.getFirst(), pairLIZIZ2.getSecond(), objectAnimatorLIZ2, pairLIZIZ3.getFirst(), pairLIZIZ3.getSecond(), objectAnimatorLIZ3, pairLIZIZ4.getFirst(), pairLIZIZ4.getSecond(), objectAnimatorLIZ4, objectAnimatorLIZ5, objectAnimatorLIZ6);
                }
            } else {
                if (animatorSetInvoke == null) {
                    return;
                }
                animatorSetInvoke.playTogether(pairLIZIZ.getFirst(), pairLIZIZ.getSecond(), objectAnimatorLIZ, pairLIZIZ2.getFirst(), pairLIZIZ2.getSecond(), objectAnimatorLIZ2, pairLIZIZ3.getFirst(), pairLIZIZ3.getSecond(), objectAnimatorLIZ3, pairLIZIZ4.getFirst(), pairLIZIZ4.getSecond(), objectAnimatorLIZ4);
                animatorSetInvoke.addListener(new AAListenerS328S0100000_17(awS561S0100000_172, 34));
            }
            animatorSetInvoke.start();
            return;
        }
        Pair pairLIZIZ5 = AbstractC1096120ed8.LIZIZ(1.0f, 0.6f, 200L, 300L, c1095930ecp2.LJIILIIL);
        ObjectAnimator objectAnimatorLIZ7 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIILIIL, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ7.setDuration(200L);
        objectAnimatorLIZ7.setStartDelay(300L);
        objectAnimatorLIZ7.addListener(new ALAdapterS7S0300000_17(awS561S0100000_17, c1095140ebY2, c1095930ecp2, 16));
        Pair pairLIZIZ6 = AbstractC1096120ed8.LIZIZ(0.6f, 1.0f, 300L, 3700L, c1095930ecp2.LJIILIIL);
        ObjectAnimator objectAnimatorLIZ8 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIILIIL, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ8.setDuration(300L);
        objectAnimatorLIZ8.setStartDelay(3700L);
        objectAnimatorLIZ8.addListener(new ALAdapterS2S0400000_17(c013c, c1095930ecp2, c1095140ebY2, awS418S0200000_172, 5));
        ObjectAnimator objectAnimatorLIZ9 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJJIFFI, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ9.setDuration(300L);
        objectAnimatorLIZ9.setStartDelay(3700L);
        ObjectAnimator objectAnimatorLIZ10 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJJIFFI, View.TRANSLATION_Y, 1.0f, -C497740JfY.LJIIIZ(R.dimen.anp));
        objectAnimatorLIZ10.setDuration(300L);
        objectAnimatorLIZ10.setStartDelay(3700L);
        objectAnimatorLIZ10.addListener(new ALAdapterS13S0100000_17(c1095930ecp2, 101));
        ObjectAnimator objectAnimatorLIZ11 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIILIIL, View.ALPHA, 1.0f, 1.0f);
        objectAnimatorLIZ11.setDuration(640L);
        objectAnimatorLIZ11.setStartDelay(4000L);
        objectAnimatorLIZ11.addListener(new ALAdapterS12S0200000_17(c1095930ecp2, awS561S0100000_172, 39));
        AnimatorSet animatorSetInvoke2 = c1095930ecp2.LJJIJIL.invoke();
        if (!liveFansClubClaimPointsOptSetting.enableFansClubPointOpt()) {
            if (animatorSetInvoke2 == null) {
                return;
            } else {
                animatorSetInvoke2.playTogether(pairLIZIZ5.getFirst(), pairLIZIZ5.getSecond(), objectAnimatorLIZ7, pairLIZIZ6.getFirst(), pairLIZIZ6.getSecond(), objectAnimatorLIZ8, objectAnimatorLIZ9, objectAnimatorLIZ10, objectAnimatorLIZ11);
            }
        } else if (animatorSetInvoke2 == null) {
            return;
        } else {
            animatorSetInvoke2.playTogether(pairLIZIZ5.getFirst(), pairLIZIZ5.getSecond(), objectAnimatorLIZ7, pairLIZIZ6.getFirst(), pairLIZIZ6.getSecond(), objectAnimatorLIZ8, objectAnimatorLIZ11);
        }
        animatorSetInvoke2.start();
    }

    public final void LJJIII(long j, boolean z) {
        String strValueOf;
        String strLIZIZ;
        Object[] objArrLIZLLL;
        float f;
        this.LJJJ = true;
        if (z) {
            this.LJJJJLI = true;
        }
        C1095930ecp c1095930ecp = this.LJJJJ;
        if (c1095930ecp != null) {
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 276);
            if (j < 1000) {
                strValueOf = String.valueOf(j);
            } else if (j < 50000) {
                strValueOf = String.valueOf((j + ((long) 500)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            } else {
                strValueOf = String.valueOf((50000 + ((long) 500)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            if (j < 1000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('+');
                sbLIZ.append(strValueOf);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('+');
                sbLIZ2.append(strValueOf);
                sbLIZ2.append('K');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C16F5 c16f5 = c1095930ecp.LJIIJ;
            C16F5 c16f52 = c1095930ecp.LJIIJJI;
            c1095930ecp.LJIIJ = c16f52;
            c1095930ecp.LJIIJJI = c16f5;
            if (c16f52 != null) {
                c16f52.setText(strLIZIZ);
            }
            C16F5 c16f53 = c1095930ecp.LJIIJ;
            if (c16f53 != null) {
                if (j < 100) {
                    f = 14.0f;
                } else {
                    f = 12.0f;
                }
                c16f53.setTextSize(f);
            }
            ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIJ, View.ALPHA, 0.0f, 1.0f);
            objectAnimatorLIZ.setDuration(300L);
            objectAnimatorLIZ.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 108));
            Pair pairLIZIZ = AbstractC1096120ed8.LIZIZ(0.2f, 1.0f, 300L, 0L, c1095930ecp.LJIIJ);
            ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIJ, View.TRANSLATION_Y, 20.0f, 1.0f);
            objectAnimatorLIZ2.setDuration(300L);
            ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIJ, View.ALPHA, 1.0f, 1.0f);
            objectAnimatorLIZ3.setStartDelay(300L);
            objectAnimatorLIZ3.setDuration(1000L);
            objectAnimatorLIZ3.addListener(new ALAdapterS13S0100000_17(awS561S0100000_17, 109));
            AnimatorSet animatorSetInvoke = c1095930ecp.LJJIJIL.invoke();
            if (z) {
                ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 1.0f, 0.0f);
                objectAnimatorLIZ4.setDuration(200L);
                ObjectAnimator objectAnimatorLIZ5 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIILIIL, View.ALPHA, 1.0f, 0.0f);
                objectAnimatorLIZ5.setDuration(200L);
                objectAnimatorLIZ5.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 113));
                if (C12ES.LJIILIIL(c1095930ecp.LJIILIIL)) {
                    objArrLIZLLL = new ObjectAnimator[]{objectAnimatorLIZ4, objectAnimatorLIZ5};
                } else {
                    C323580CmK c323580CmK = new C323580CmK(2);
                    c323580CmK.LIZ(objectAnimatorLIZ4);
                    c323580CmK.LIZIZ(c1095930ecp.LJIJJLI(AFwS205S0000000_17.get$arr$(398)));
                    objArrLIZLLL = c323580CmK.LIZLLL(new ObjectAnimator[c323580CmK.LIZJ()]);
                }
            } else {
                ObjectAnimator objectAnimatorLIZ6 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIJJI, View.ALPHA, 1.0f, 0.0f);
                objectAnimatorLIZ6.setDuration(200L);
                objectAnimatorLIZ6.addListener(new ALAdapterS13S0100000_17(c1095930ecp, 117));
                objArrLIZLLL = new ObjectAnimator[]{objectAnimatorLIZ6};
            }
            if (animatorSetInvoke != null) {
                C323580CmK c323580CmK2 = new C323580CmK(6);
                c323580CmK2.LIZIZ(objArrLIZLLL);
                c323580CmK2.LIZ(objectAnimatorLIZ);
                c323580CmK2.LIZ(pairLIZIZ.getFirst());
                c323580CmK2.LIZ(pairLIZIZ.getSecond());
                c323580CmK2.LIZ(objectAnimatorLIZ2);
                c323580CmK2.LIZ(objectAnimatorLIZ3);
                animatorSetInvoke.playTogether((Animator[]) c323580CmK2.LIZLLL(new Animator[c323580CmK2.LIZJ()]));
                animatorSetInvoke.start();
            }
        }
    }

    public final void LJJIJIIJIL(GuidanceConfig guidanceConfig, FansEventData.EntranceGuidanceData entranceGuidanceData) {
        String string;
        EntranceGuidanceContainer entranceGuidanceContainer;
        int visibility;
        int visibility2;
        int visibility3;
        DisplayConfiguration displayConfiguration;
        ContentConfiguration contentConfiguration;
        ViewGroup.LayoutParams layoutParams;
        LinkedHashMap linkedHashMap;
        if (this.LJIILIIL != null) {
            this.LJJJ = true;
            this.LJIIJ = "new_milestone";
            DataChannel dataChannel = this.LJIILL;
            if (dataChannel == null || (string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)).toString()) == null) {
                string = "";
            }
            TextConfig textConfig = null;
            if (entranceGuidanceData != null) {
                entranceGuidanceContainer = entranceGuidanceData.entranceGuidanceContainer;
            } else {
                entranceGuidanceContainer = null;
            }
            try {
                C0JT6<Map<String, String>> c0jt6 = InterfaceC1106030et7.c9;
                Map<String, String> mapLIZ = c0jt6.LIZ();
                if (mapLIZ != null) {
                    linkedHashMap = new LinkedHashMap(mapLIZ);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(string, C1092540eXM.LIZ(guidanceConfig, entranceGuidanceContainer));
                c0jt6.LIZJ(linkedHashMap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("[recordMilestoneAnimShowed]milestone keva set crash", e);
            }
            C1095930ecp c1095930ecp = this.LJJJJ;
            if (c1095930ecp != null) {
                AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 279);
                InterfaceC1095350ebt interfaceC1095350ebt = c1095930ecp.LIZLLL;
                if (interfaceC1095350ebt != null) {
                    ((C1096340edU) interfaceC1095350ebt).LIZJ();
                    ViewGroup viewGroup = ((C1096340edU) c1095930ecp.LIZLLL).LJ;
                    if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                        layoutParams.width = -2;
                    }
                    C1094580eae c1094580eae = C1094580eae.LIZ;
                    if (guidanceConfig != null && (displayConfiguration = guidanceConfig.displayConfiguration) != null && (contentConfiguration = displayConfiguration.contentConfiguration) != null) {
                        textConfig = contentConfiguration.text;
                    }
                    c1094580eae.getClass();
                    Text textLJIIJJI = C1094580eae.LJIIJJI(textConfig);
                    C16F5 c16f5 = c1095930ecp.LJIJJLI;
                    if (c16f5 != null) {
                        c1094580eae.getClass();
                        c16f5.setText(C1094580eae.LJFF(textLJIIJJI));
                    }
                    C1324720kZq c1324720kZq = c1095930ecp.LJIIIZ;
                    int visibility4 = 8;
                    if (c1324720kZq != null) {
                        visibility = c1324720kZq.getVisibility();
                    } else {
                        visibility = 8;
                    }
                    C430340Gu8 c430340Gu8 = c1095930ecp.LJIILIIL;
                    if (c430340Gu8 != null) {
                        visibility2 = c430340Gu8.getVisibility();
                    } else {
                        visibility2 = 8;
                    }
                    View view = c1095930ecp.LJJIJIIJI;
                    if (view != null) {
                        visibility3 = view.getVisibility();
                    } else {
                        visibility3 = 8;
                    }
                    ImageView imageView = c1095930ecp.LJIIZILJ;
                    if (imageView != null) {
                        visibility4 = imageView.getVisibility();
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    C443120HZe c443120HZeLJIIJJI = AbstractC1096120ed8.LJIIJJI(c1095930ecp, c1095930ecp.LIZLLL, c1095930ecp.LJIJJLI, 1500L, 0L, 0L, null, null, C500260Jjc.LJJJJIZL(c1095930ecp.LJJIIZ), 244);
                    Object first = c443120HZeLJIIJJI.getFirst();
                    long jLongValue = ((Number) c443120HZeLJIIJJI.getSecond()).longValue();
                    ((Number) c443120HZeLJIIJJI.getThird()).longValue();
                    ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ.setDuration(200L);
                    objectAnimatorLIZ.addListener(new AAListenerS328S0100000_17(c1095930ecp, 66));
                    ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIILIIL, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ2.setDuration(200L);
                    objectAnimatorLIZ2.addListener(new AAListenerS328S0100000_17(c1095930ecp, 69));
                    ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(c1095930ecp.LJJIJIIJI, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ3.setDuration(200L);
                    objectAnimatorLIZ3.addListener(new AAListenerS328S0100000_17(c1095930ecp, 73));
                    ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIZILJ, View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorLIZ4.setDuration(200L);
                    objectAnimatorLIZ4.addListener(new AAListenerS328S0100000_17(c1095930ecp, 75));
                    C323580CmK c323580CmK = new C323580CmK(5);
                    c323580CmK.LIZIZ(first);
                    c323580CmK.LIZ(objectAnimatorLIZ);
                    c323580CmK.LIZ(objectAnimatorLIZ2);
                    c323580CmK.LIZ(objectAnimatorLIZ3);
                    c323580CmK.LIZ(objectAnimatorLIZ4);
                    animatorSet.playTogether((Animator[]) c323580CmK.LIZLLL(new Animator[c323580CmK.LIZJ()]));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator objectAnimatorLIZ5 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIIIZ, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ5.setDuration(200L);
                    objectAnimatorLIZ5.addListener(new AAListenerS90S0101000_17(visibility, c1095930ecp, 9));
                    ObjectAnimator objectAnimatorLIZ6 = AbstractC1096120ed8.LIZ(c1095930ecp.LJIILIIL, View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorLIZ6.setDuration(200L);
                    objectAnimatorLIZ6.addListener(new AAListenerS90S0101000_17(visibility2, c1095930ecp, 10));
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1095930ecp.LJJIJIIJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat.setInterpolator(AbstractC1096120ed8.LJIIL(5));
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.addListener(new AAListenerS90S0101000_17(visibility3, c1095930ecp, 11));
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1095930ecp.LJIIZILJ, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat2.setInterpolator(AbstractC1096120ed8.LJIIL(5));
                    objectAnimatorOfFloat2.setDuration(200L);
                    objectAnimatorOfFloat2.addListener(new AAListenerS90S0101000_17(visibility4, c1095930ecp, 12));
                    animatorSet2.setStartDelay(jLongValue);
                    animatorSet2.playTogether(objectAnimatorLIZ5, objectAnimatorLIZ6, objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.addListener(new AAListenerS328S0100000_17(awS561S0100000_17, 57));
                    animatorSet3.playTogether(animatorSet, animatorSet2);
                    animatorSet3.start();
                }
            }
        }
    }

    public final void LJJIL(long j, long j2) {
        float f;
        C1324720kZq c1324720kZq;
        this.LJJJ = true;
        C1095930ecp c1095930ecp = this.LJJJJ;
        if (c1095930ecp != null) {
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 270);
            C013C c013c = new C013C();
            FansClaimResConfig fansClubAnimResConfig = LiveFansClubClaimPointsOptSetting.INSTANCE.getFansClubAnimResConfig((int) j2, c1095930ecp.LJJIJLIJ);
            if (fansClubAnimResConfig != null && !TextUtils.isEmpty(fansClubAnimResConfig.geckoChannel) && !TextUtils.isEmpty(fansClubAnimResConfig.webpFileName)) {
                String str = fansClubAnimResConfig.geckoChannel;
                String str2 = fansClubAnimResConfig.webpFileName;
                AwS261S0300000_17 awS261S0300000_17 = new AwS261S0300000_17(c1095930ecp, awS561S0100000_17, c013c, 26);
                c1095930ecp.LJJJIL = null;
                if (C497740JfY.LJJ() && (c1324720kZq = c1095930ecp.LJIILL) != null) {
                    C786410Ut5.Yb(c1324720kZq, -1.0f);
                }
                C12ES.LJIILL(0, c1095930ecp.LJIILLIIL);
                C12ES.LJIILL(4, c1095930ecp.LJIIIZ);
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LJIILJJIL = true;
                c1143920fsE.LIZ = c1095930ecp.LJIILLIIL;
                c1143920fsE.LIZIZ = str;
                c1143920fsE.LIZJ = str2;
                c1143920fsE.LJFF = true;
                c1143920fsE.LJ = new C1151950g5B(awS261S0300000_17, 9);
                c1143920fsE.LJIILIIL = true;
                C1143680frq.LJIIIIZZ(c1143920fsE);
                c1095930ecp.LJJJIL = c1143920fsE;
            }
            ValueAnimator valueAnimatorLJIIIZ = c1095930ecp.LJIIIZ(C497740JfY.LJIIIZ(R.dimen.anx), c1095930ecp.LJIJJ(j));
            LinearLayout linearLayout = c1095930ecp.LJJIIZ;
            Property property = View.TRANSLATION_X;
            float[] fArr = new float[2];
            if (C497740JfY.LJJ()) {
                f = 8.0f;
            } else {
                f = -8.0f;
            }
            fArr[0] = f;
            fArr[1] = 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
            objectAnimatorOfFloat.setStartDelay(300L);
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.setInterpolator(AbstractC1096120ed8.LJIIL(3));
            objectAnimatorOfFloat.addListener(new AAListenerS328S0100000_17(c1095930ecp, 67));
            objectAnimatorOfFloat.addListener(new AAListenerS139S0300000_17(c1095930ecp, c013c, awS561S0100000_17, 6));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1095930ecp.LJJIIJ, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat2.setStartDelay(500L);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1095930ecp.LJJIIJZLJL, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat3.setStartDelay(500L);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1095930ecp.LJIIL, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(100L);
            objectAnimatorOfFloat4.setInterpolator(AbstractC1096120ed8.LJIIL(0));
            objectAnimatorOfFloat4.addListener(new AAListenerS328S0100000_17(c1095930ecp, 70));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorLJIIIZ);
            animatorSet.start();
        }
    }

    public final void LJJJ(C1095140ebY c1095140ebY, C1095140ebY c1095140ebY2) {
        int measuredHeight;
        ViewParent parent;
        boolean clipChildren;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Context context;
        C430340Gu8 c430340Gu8;
        Context context2;
        C430340Gu8 c430340Gu82;
        this.LJJJ = true;
        if (this.LJJJJI) {
            C1095930ecp c1095930ecp = this.LJJJJ;
            if (c1095930ecp != null) {
                AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, c1095140ebY2, 30);
                C12ES.LJIILL(8, c1095930ecp.LJIIZILJ);
                C12ES.LJIILL(0, c1095930ecp.LJIIL);
                C12ES.LJIILL(0, c1095930ecp.LJIILIIL);
                C12ES.LJIILL(8, c1095930ecp.LJIJI);
                C430340Gu8 c430340Gu83 = c1095930ecp.LJIILIIL;
                if (c430340Gu83 != null) {
                    c430340Gu83.setText(String.valueOf(c1095140ebY2.LIZ));
                }
                C430340Gu8 c430340Gu84 = c1095930ecp.LJIILIIL;
                if (c430340Gu84 != null) {
                    c430340Gu84.LJJJJI(-1);
                }
                C430340Gu8 c430340Gu85 = c1095930ecp.LJIILIIL;
                if (c430340Gu85 != null) {
                    c430340Gu85.setTextColor(C497740JfY.LJI(0, c1095140ebY2.LJI));
                }
                C1819620xS4.LIZ().LJIIIZ(c1095140ebY2.LIZJ).LJJI(c1095930ecp.LJIIIZ);
                awS418S0200000_17.invoke();
                return;
            }
            return;
        }
        boolean zLIZ = C1095130ebX.LIZ();
        int i = (int) c1095140ebY.LIZ;
        C518180KTw.LJJIJIIJIL(i, i, "fans_club_entrance_icon", zLIZ);
        C1095930ecp c1095930ecp2 = this.LJJJJ;
        if (c1095930ecp2 == null) {
            return;
        }
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 272);
        AwS418S0200000_17 awS418S0200000_172 = new AwS418S0200000_17(this, c1095140ebY2, 31);
        C12ES.LJIILL(8, c1095930ecp2.LJIIZILJ);
        C12ES.LJIILL(0, c1095930ecp2.LJIIL);
        C12ES.LJIILL(4, c1095930ecp2.LJIILIIL);
        C12ES.LJIILL(0, c1095930ecp2.LJIILJJIL);
        C430340Gu8 c430340Gu86 = c1095930ecp2.LJIILIIL;
        if (c430340Gu86 != null) {
            c430340Gu86.setText(String.valueOf(c1095140ebY2.LIZ));
        }
        ViewGroup viewGroup3 = c1095930ecp2.LJ;
        if (viewGroup3 != null && (context2 = viewGroup3.getContext()) != null && (c430340Gu82 = c1095930ecp2.LJIILIIL) != null) {
            c430340Gu82.LJJJJI(C20736316Cj.LIZIZ(R.attr.c9i, context2));
        }
        C430340Gu8 c430340Gu87 = c1095930ecp2.LJIILIIL;
        if (c430340Gu87 != null) {
            c430340Gu87.setTextColor(C497740JfY.LJI(0, c1095140ebY2.LJI));
        }
        C1819620xS4.LIZ().LJIIIZ(c1095140ebY2.LIZJ).LJJI(c1095930ecp2.LJIIIZ);
        C430340Gu8 c430340Gu88 = c1095930ecp2.LJIILIIL;
        if (c430340Gu88 != null) {
            measuredHeight = c430340Gu88.getMeasuredHeight();
        } else {
            measuredHeight = 2;
        }
        int i2 = measuredHeight - 2;
        C430340Gu8 c430340Gu89 = c1095930ecp2.LJIILJJIL;
        if (c430340Gu89 != null) {
            c430340Gu89.setText(String.valueOf(c1095140ebY.LIZ));
        }
        ViewGroup viewGroup4 = c1095930ecp2.LJ;
        if (viewGroup4 != null && (context = viewGroup4.getContext()) != null && (c430340Gu8 = c1095930ecp2.LJIILJJIL) != null) {
            c430340Gu8.LJJJJI(C20736316Cj.LIZIZ(R.attr.c9i, context));
        }
        C430340Gu8 c430340Gu810 = c1095930ecp2.LJIILJJIL;
        if (c430340Gu810 != null) {
            c430340Gu810.setTextColor(C497740JfY.LJI(0, c1095140ebY2.LJI));
        }
        float f = i2;
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIILJJIL, View.TRANSLATION_Y, 1.0f, -f);
        objectAnimatorLIZ.setDuration(500L);
        C1096060ed2.LIZ(c1095930ecp2.LJFF, true);
        C1096060ed2.LIZ(c1095930ecp2.LJI, true);
        C1096060ed2.LIZ(c1095930ecp2.LJII, true);
        C1096060ed2.LIZ(c1095930ecp2.LJIIIIZZ, true);
        ViewGroup viewGroup5 = c1095930ecp2.LJ;
        ViewParent parent2 = null;
        if (viewGroup5 != null) {
            parent = viewGroup5.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            clipChildren = viewGroup2.getClipChildren();
        } else {
            clipChildren = true;
        }
        ViewGroup viewGroup6 = c1095930ecp2.LJ;
        if (viewGroup6 != null) {
            parent2 = viewGroup6.getParent();
        }
        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
            viewGroup.setClipChildren(true);
        }
        objectAnimatorLIZ.addListener(new ALAdapterS3S0210000_17(awS561S0100000_17, c1095930ecp2, clipChildren, 4));
        ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIILIIL, View.TRANSLATION_Y, f, 1.0f);
        objectAnimatorLIZ2.setDuration(500L);
        objectAnimatorLIZ2.addListener(new ALAdapterS12S0200000_17(c1095930ecp2, awS418S0200000_172, 46));
        AnimatorSet animatorSetInvoke = c1095930ecp2.LJJIJIL.invoke();
        if (animatorSetInvoke == null) {
            return;
        }
        animatorSetInvoke.playTogether(objectAnimatorLIZ, objectAnimatorLIZ2);
        animatorSetInvoke.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig] */
    public final void LJJJI(C1095140ebY c1095140ebY, long j) {
        ?? GY;
        IHostResource iHostResource;
        Context context;
        C430340Gu8 c430340Gu8;
        C1095140ebY c1095140ebYLIZ = C1095140ebY.LIZ(c1095140ebY, c1095140ebY.LIZ, c1095140ebY.LIZIZ + j, c1095140ebY.LIZJ, c1095140ebY.LIZLLL, c1095140ebY.LJ, c1095140ebY.LJFF, c1095140ebY.LJI, c1095140ebY.LJII, 0L, 0L, 0L, 0L, null, 7936);
        this.LJJJ = true;
        if (this.LJJJJI) {
            C1095930ecp c1095930ecp = this.LJJJJ;
            if (c1095930ecp != null) {
                AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, c1095140ebYLIZ, 32);
                c1095930ecp.LJJIIJ(false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('+');
                sbLIZ.append(j);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C430340Gu8 c430340Gu82 = c1095930ecp.LJIL;
                if (c430340Gu82 != null) {
                    c430340Gu82.setText(strLIZIZ);
                }
                C430340Gu8 c430340Gu83 = c1095930ecp.LJIL;
                if (c430340Gu83 != null) {
                    c430340Gu83.LJJJJI(-1);
                }
                C12ES.LJIILL(0, c1095930ecp.LJIL);
                C786410Ut5.LJLIIL(1700L, c1095930ecp.LJJIJL, new ARunnableS86S0200000_17(c1095930ecp, awS418S0200000_17, 89));
                return;
            }
            return;
        }
        C1095930ecp c1095930ecp2 = this.LJJJJ;
        if (c1095930ecp2 == null) {
            return;
        }
        AwS418S0200000_17 awS418S0200000_172 = new AwS418S0200000_17(this, c1095140ebYLIZ, 33);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('+');
        sbLIZ2.append(j);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C430340Gu8 c430340Gu84 = c1095930ecp2.LJIL;
        if (c430340Gu84 != null) {
            c430340Gu84.setText(strLIZIZ2);
        }
        ViewGroup viewGroup = c1095930ecp2.LJ;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (c430340Gu8 = c1095930ecp2.LJIL) != null) {
            c430340Gu8.LJJJJI(C20736316Cj.LIZIZ(R.attr.c9i, context));
        }
        C12ES.LJIILL(0, c1095930ecp2.LJIL);
        C259800zU c259800zU = new C259800zU();
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService != null && (GY = iFansClubService.gY((int) c1095140ebY.LIZ)) != 0 && (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null && iHostResource.u61(GY.geckoChannel)) {
            c259800zU.element = GY;
        }
        c1095930ecp2.LJJIIJ(false);
        Pair pairLIZIZ = AbstractC1096120ed8.LIZIZ(0.6f, 1.1f, 100L, 0L, c1095930ecp2.LJIL);
        Pair pairLIZIZ2 = AbstractC1096120ed8.LIZIZ(1.1f, 1.0f, 100L, 100L, c1095930ecp2.LJIL);
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIL, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ.setDuration(100L);
        objectAnimatorLIZ.addListener(new ALAdapterS12S0200000_17(c259800zU, c1095930ecp2, 47));
        ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIL, View.TRANSLATION_Y, 1.0f, -C497740JfY.LJIIIZ(R.dimen.ao7));
        objectAnimatorLIZ2.setDuration(300L);
        objectAnimatorLIZ2.setStartDelay(700L);
        ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(c1095930ecp2.LJIL, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ3.setDuration(600L);
        objectAnimatorLIZ3.setStartDelay(700L);
        objectAnimatorLIZ3.addListener(new ALAdapterS12S0200000_17(c1095930ecp2, awS418S0200000_172, 38));
        AnimatorSet animatorSetInvoke = c1095930ecp2.LJJIJIL.invoke();
        if (animatorSetInvoke == null) {
            return;
        }
        animatorSetInvoke.playTogether(pairLIZIZ.getFirst(), pairLIZIZ.getSecond(), pairLIZIZ2.getFirst(), pairLIZIZ2.getSecond(), objectAnimatorLIZ, objectAnimatorLIZ2, objectAnimatorLIZ3);
        animatorSetInvoke.start();
    }

    public final void LJJJJLL(C1095140ebY c1095140ebY, boolean z) {
        Context context;
        C430340Gu8 c430340Gu8;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (c1095140ebY != null) {
            ImageView imageView = this.LJJIII;
            if (imageView != null) {
                C786410Ut5.V4(imageView, 1.0f);
            }
            C16F5 c16f5 = this.LJJIL;
            if (c16f5 != null) {
                C786410Ut5.k5(c16f5, 1.0f);
            }
            ImageView imageView2 = this.LJJIII;
            if (imageView2 != null) {
                C786410Ut5.Qb(imageView2, 1.0f);
            }
            ImageView imageView3 = this.LJJIII;
            if (imageView3 != null) {
                C786410Ut5.rc(imageView3, 1.0f);
            }
            ConstraintLayout constraintLayout = this.LJIIZILJ;
            ViewGroup.LayoutParams layoutParams = null;
            if (constraintLayout != null) {
                layoutParams = constraintLayout.getLayoutParams();
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.anx);
                if (marginLayoutParams.width != iLJIIIZ) {
                    marginLayoutParams.width = iLJIIIZ;
                }
                ConstraintLayout constraintLayout2 = this.LJIIZILJ;
                if (constraintLayout2 != null) {
                    C786410Ut5.m6(constraintLayout2, marginLayoutParams);
                }
            }
            C12ES.LJIILL(8, this.LJJIII);
            C12ES.LJIILL(8, this.LJJIL);
            int i = 0;
            C12ES.LJIILL(0, this.LJIL);
            C12ES.LJIILL(0, this.LJIJI);
            if (!this.LJJJJLI) {
                C12ES.LJIILL(0, this.LJJ);
                C12ES.LJIILL(8, this.LJJIIJ);
            } else {
                C12ES.LJIILL(0, this.LJJIIJ);
                C12ES.LJIILL(8, this.LJJ);
            }
            C430340Gu8 c430340Gu82 = this.LJJ;
            if (c430340Gu82 != null) {
                c430340Gu82.setText(String.valueOf(c1095140ebY.LIZ));
            }
            ViewGroup viewGroup = this.LJIIL;
            if (viewGroup != null && (context = viewGroup.getContext()) != null && (c430340Gu8 = this.LJJ) != null) {
                c430340Gu8.LJJJJI(C20736316Cj.LIZIZ(R.attr.c9i, context));
            }
            C430340Gu8 c430340Gu83 = this.LJJ;
            if (c430340Gu83 != null) {
                String str = c1095140ebY.LJI;
                if (str == null) {
                    str = "#FFFFA25F";
                }
                c430340Gu83.setTextColor(C497740JfY.LJI(0, str));
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1095140ebY.LIZJ);
            if (z) {
                i = R.drawable.elj;
            }
            c1324610kZfLJIIIZ.LJIIIZ = i;
            c1324610kZfLJIIIZ.LJJI(this.LJIJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae A[PHI: r4
      0x00ae: PHI (r4v1 boolean) = (r4v0 boolean), (r4v4 boolean) binds: [B:14:0x00a2, B:19:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(long r9, long r11, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1095910ecn.LJJI(long, long, java.lang.String):void");
    }

    public C1095910ecn(ViewGroup viewGroup, InterfaceC1095350ebt interfaceC1095350ebt, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        C1091250eVH c1091250eVH;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        FrameLayout frameLayout;
        C1324720kZq c1324720kZq;
        C16F5 c16f5;
        C16F5 c16f52;
        C16F5 c16f53;
        FrameLayout frameLayout2;
        C430340Gu8 c430340Gu8;
        C430340Gu8 c430340Gu82;
        C1126540fQC c1126540fQC;
        C1126540fQC c1126540fQC2;
        ImageView imageView;
        ImageView imageView2;
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        C16F5 c16f54;
        C430340Gu8 c430340Gu83;
        C1295960jpS c1295960jpS3;
        C1295960jpS c1295960jpS4;
        ImageView imageView3;
        ImageView imageView4;
        C16F5 c16f55;
        C16F5 c16f56;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View viewFindViewById;
        ImageView imageView5;
        LinearLayout linearLayout3;
        ImageView imageView6;
        Room roomLJJLIIIIJ;
        DataChannel dataChannel2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams4;
        Room room;
        this.LJIIL = viewGroup;
        this.LJIILIIL = interfaceC1095350ebt;
        this.LJIILJJIL = lifecycleOwner;
        this.LJIILL = dataChannel;
        this.LJJJJI = LiveRankingAndPrivilegeDowngradeSetting.isCreatorEntranceAnimDisabled(C500260Jjc.LJIIZILJ(dataChannel));
        this.LIZ = false;
        if (viewGroup != null) {
            c1091250eVH = (C1091250eVH) viewGroup.findViewById(R.id.hwk);
        } else {
            c1091250eVH = null;
        }
        this.LJIILLIIL = c1091250eVH;
        if (viewGroup != null) {
            constraintLayout = (ConstraintLayout) viewGroup.findViewById(R.id.dw1);
            constraintLayout2 = (ConstraintLayout) viewGroup.findViewById(R.id.dwq);
        } else {
            constraintLayout = null;
            constraintLayout2 = null;
        }
        this.LJIIZILJ = constraintLayout2;
        if (viewGroup != null) {
            frameLayout = (FrameLayout) viewGroup.findViewById(R.id.dvk);
        } else {
            frameLayout = null;
        }
        this.LJIJ = frameLayout;
        if (viewGroup != null) {
            c1324720kZq = (C1324720kZq) viewGroup.findViewById(R.id.lgs);
        } else {
            c1324720kZq = null;
        }
        this.LJIJI = c1324720kZq;
        if (viewGroup != null) {
            c16f5 = (C16F5) viewGroup.findViewById(R.id.zlk);
        } else {
            c16f5 = null;
        }
        this.LJJIL = c16f5;
        if (viewGroup != null) {
            c16f52 = (C16F5) viewGroup.findViewById(R.id.zli);
        } else {
            c16f52 = null;
        }
        this.LJIJJ = c16f52;
        if (viewGroup != null) {
            c16f53 = (C16F5) viewGroup.findViewById(R.id.zlj);
        } else {
            c16f53 = null;
        }
        this.LJIJJLI = c16f53;
        if (viewGroup != null) {
            frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.i5v);
        } else {
            frameLayout2 = null;
        }
        this.LJIL = frameLayout2;
        if (viewGroup != null) {
            c430340Gu8 = (C430340Gu8) viewGroup.findViewById(R.id.zlo);
        } else {
            c430340Gu8 = null;
        }
        this.LJJ = c430340Gu8;
        if (viewGroup != null) {
            c430340Gu82 = (C430340Gu8) viewGroup.findViewById(R.id.zle);
        } else {
            c430340Gu82 = null;
        }
        this.LJJI = c430340Gu82;
        if (viewGroup != null) {
            c1126540fQC = (C1126540fQC) viewGroup.findViewById(R.id.hoe);
        } else {
            c1126540fQC = null;
        }
        this.LJJIFFI = c1126540fQC;
        if (viewGroup != null) {
            c1126540fQC2 = (C1126540fQC) viewGroup.findViewById(R.id.hoa);
        } else {
            c1126540fQC2 = null;
        }
        this.LJJII = c1126540fQC2;
        if (viewGroup != null) {
            imageView = (ImageView) viewGroup.findViewById(R.id.lgu);
        } else {
            imageView = null;
        }
        this.LJJIII = imageView;
        if (viewGroup != null) {
            imageView2 = (ImageView) viewGroup.findViewById(R.id.lgv);
        } else {
            imageView2 = null;
        }
        this.LJJIIJ = imageView2;
        if (viewGroup != null) {
            c1295960jpS = (C1295960jpS) viewGroup.findViewById(R.id.lgr);
        } else {
            c1295960jpS = null;
        }
        this.LJJIIJZLJL = c1295960jpS;
        if (viewGroup != null) {
            c1295960jpS2 = (C1295960jpS) viewGroup.findViewById(R.id.lgq);
        } else {
            c1295960jpS2 = null;
        }
        this.LJJIIZ = c1295960jpS2;
        if (viewGroup != null) {
            c16f54 = (C16F5) viewGroup.findViewById(R.id.zlm);
        } else {
            c16f54 = null;
        }
        this.LJJIIZI = c16f54;
        if (viewGroup != null) {
            c430340Gu83 = (C430340Gu8) viewGroup.findViewById(R.id.tv_task_score);
        } else {
            c430340Gu83 = null;
        }
        this.LJJIJIIJI = c430340Gu83;
        if (viewGroup != null) {
            c1295960jpS3 = (C1295960jpS) viewGroup.findViewById(R.id.l8a);
        } else {
            c1295960jpS3 = null;
        }
        this.LJJIJIIJIL = c1295960jpS3;
        if (viewGroup != null) {
            c1295960jpS4 = (C1295960jpS) viewGroup.findViewById(R.id.lx7);
        } else {
            c1295960jpS4 = null;
        }
        this.LJJIJIL = c1295960jpS4;
        if (viewGroup != null) {
            imageView3 = (ImageView) viewGroup.findViewById(R.id.lgw);
        } else {
            imageView3 = null;
        }
        this.LJJIJL = imageView3;
        if (viewGroup != null) {
            imageView4 = (ImageView) viewGroup.findViewById(R.id.lgx);
            c16f55 = (C16F5) viewGroup.findViewById(R.id.zlq);
            c16f56 = (C16F5) viewGroup.findViewById(R.id.zlp);
            linearLayout = (LinearLayout) viewGroup.findViewById(R.id.hoc);
        } else {
            imageView4 = null;
            c16f55 = null;
            c16f56 = null;
            linearLayout = null;
        }
        this.LJJIJLIJ = linearLayout;
        if (viewGroup != null) {
            linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.wpo);
            viewFindViewById = viewGroup.findViewById(R.id.hob);
        } else {
            linearLayout2 = null;
            viewFindViewById = null;
        }
        this.LJJLIIIJ = viewFindViewById;
        if (viewGroup != null) {
            imageView5 = (ImageView) viewGroup.findViewById(R.id.wpq);
            linearLayout3 = (LinearLayout) viewGroup.findViewById(R.id.ho5);
        } else {
            imageView5 = null;
            linearLayout3 = null;
        }
        if (interfaceC1095350ebt != null) {
            imageView6 = ((C1096340edU) interfaceC1095350ebt).LJJIIJZLJL;
        } else {
            imageView6 = null;
        }
        this.LJJIJ = imageView6;
        C1095990ecv c1095990ecv = new C1095990ecv(this);
        BPEAHandler bPEAHandler = this.LJ;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        C1126540fQC c1126540fQC3 = c1126540fQC;
        this.LJJJJ = new C1095930ecp(interfaceC1095350ebt, viewGroup, c1091250eVH, constraintLayout, constraintLayout2, frameLayout, c1324720kZq, c16f52, c16f53, frameLayout2, c430340Gu8, c430340Gu82, c1126540fQC3, c1126540fQC2, imageView, c16f5, imageView2, c1295960jpS, c1295960jpS2, c16f54, c430340Gu83, c1295960jpS3, c1295960jpS4, imageView6, imageView3, imageView4, c16f55, c16f56, linearLayout, linearLayout2, imageView5, viewFindViewById, linearLayout3, c1095990ecv, bPEAHandler, roomLJJLIIIIJ);
        BPEAHandler bPEAHandler2 = this.LJ;
        if (bPEAHandler2 != null) {
            C786410Ut5.LJLIIL(150L, bPEAHandler2, new ARunnableS117S0100000_17(this, 137));
        }
        if (this.LJIILIIL != null && c16f54 != null) {
            c16f54.setBackgroundResource(R.drawable.dz1);
        }
        DataChannel dataChannel3 = this.LJIILL;
        if (dataChannel3 != null && (room = (Room) dataChannel3.gg0(RoomChannel.class)) != null) {
            IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
            this.LIZLLL = iFansClubService != null ? iFansClubService.tL1(room.getOwner()) : null;
            this.LJJJJZ = LIZLLL();
        }
        ViewGroup viewGroup2 = this.LJIIL;
        if (viewGroup2 != null) {
            C786410Ut5.I7(new AbS698S0100000_17(this, 3), viewGroup2);
        }
        LJJJJI();
        DataChannel dataChannel4 = this.LJIILL;
        if (dataChannel4 != null) {
            InterfaceC1095420ec0 interfaceC1095420ec0CreateTeamChallengeChecker = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).createTeamChallengeChecker(dataChannel4);
            this.LJJJJJL = interfaceC1095420ec0CreateTeamChallengeChecker;
            if (interfaceC1095420ec0CreateTeamChallengeChecker != null) {
                C1094580eae c1094580eae = C1094580eae.LIZ;
                DataChannel dataChannel5 = this.LJIILL;
                c1094580eae.getClass();
                if (C1094580eae.LIZJ(dataChannel5, interfaceC1095420ec0CreateTeamChallengeChecker)) {
                    BPEAHandler bPEAHandler3 = this.LJ;
                    ARunnableS86S0200000_17 aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(this, interfaceC1095420ec0CreateTeamChallengeChecker, 32);
                    interfaceC1095420ec0CreateTeamChallengeChecker.LIZIZ();
                    C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, bPEAHandler3, aRunnableS86S0200000_17);
                }
            }
        }
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ant);
        if (imageView3 != null && (layoutParams4 = imageView3.getLayoutParams()) != null) {
            layoutParams4.width = iLJIIIZ;
            layoutParams4.height = iLJIIIZ;
            ImageView imageView7 = this.LJJIJL;
            if (imageView7 != null) {
                C786410Ut5.c6(imageView7, layoutParams4);
            }
        }
        if (c1126540fQC2 != null && (layoutParams3 = c1126540fQC2.getLayoutParams()) != null) {
            layoutParams3.width = iLJIIIZ;
            layoutParams3.height = iLJIIIZ;
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.setMarginStart(C497740JfY.LJIIIZ(R.dimen.ans));
            }
            C1126540fQC c1126540fQC4 = this.LJJII;
            if (c1126540fQC4 != null) {
                C786410Ut5.t6(c1126540fQC4, layoutParams3);
            }
        }
        if (imageView3 != null) {
            imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.anx);
        if (c1126540fQC3 != null && (layoutParams2 = c1126540fQC3.getLayoutParams()) != null) {
            layoutParams2.width = iLJIIIZ2;
            C1126540fQC c1126540fQC5 = this.LJJIFFI;
            if (c1126540fQC5 != null) {
                C786410Ut5.t6(c1126540fQC5, layoutParams2);
            }
        }
        ConstraintLayout constraintLayout3 = this.LJIIZILJ;
        if (constraintLayout3 != null && (layoutParams = constraintLayout3.getLayoutParams()) != null) {
            layoutParams.width = iLJIIIZ2;
            ConstraintLayout constraintLayout4 = this.LJIIZILJ;
            if (constraintLayout4 != null) {
                C786410Ut5.m6(constraintLayout4, layoutParams);
            }
        }
        String strLIZ = C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        if (C500260Jjc.LJIJI(this.LJIILL) && (dataChannel2 = this.LJIILL) != null && Intrinsics.LJFF(Boolean.TRUE, dataChannel2.gg0(C0TZM.class))) {
            LiveFansClubTextLanguageSetting liveFansClubTextLanguageSetting = LiveFansClubTextLanguageSetting.INSTANCE;
            if (liveFansClubTextLanguageSetting.useTwelve(strLIZ)) {
                C16F5 c16f57 = this.LJJIL;
                if (c16f57 != null) {
                    c16f57.setTextSize(1, 12.0f);
                    return;
                }
                return;
            }
            if (liveFansClubTextLanguageSetting.useTen(strLIZ)) {
                C16F5 c16f58 = this.LJJIL;
                if (c16f58 == null) {
                    return;
                }
                c16f58.setTextSize(1, 10.0f);
                return;
            }
            C16F5 c16f59 = this.LJJIL;
            if (c16f59 == null) {
                return;
            }
            c16f59.setTextSize(1, 14.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172 A[PHI: r4
      0x0172: PHI (r4v6 java.util.Map<java.lang.String, java.lang.String>) = 
      (r4v4 java.util.Map<java.lang.String, java.lang.String>)
      (r4v9 java.util.Map<java.lang.String, java.lang.String>)
      (r4v9 java.util.Map<java.lang.String, java.lang.String>)
     binds: [B:66:0x016f, B:55:0x014c, B:57:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(X.C1096010ecx r26, kotlin.Pair<java.lang.Boolean, java.lang.String> r27, java.lang.String r28, android.view.View r29, long r30) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1095910ecn.LJJJJ(X.0ecx, kotlin.Pair, java.lang.String, android.view.View, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:301:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(X.EnumC1095860eci r34, X.C1095140ebY r35, X.C1095140ebY r36, long r37, long r39, X.C1096000ecw r41) {
        /*
            Method dump skipped, instruction units count: 2776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1095910ecn.LJJIJIIJI(X.0eci, X.0ebY, X.0ebY, long, long, X.0ecw):void");
    }

    public final void LJJJJJL(EnumC1095860eci enumC1095860eci, C1095140ebY c1095140ebY, C1095140ebY c1095140ebY2, long j, long j2, C1096000ecw c1096000ecw) {
        if (this.LJJJ) {
            C1095840ecg c1095840ecg = this.LJJJIL;
            c1095840ecg.LIZ.add(new C1095900ecm(enumC1095860eci, c1095140ebY2, j, j2, c1096000ecw));
        } else if (enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_NOTIF_TYPE_SEQ_START && LJIILLIIL()) {
            LJJIJIIJI(EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_GUIDE_TYPE, c1095140ebY, c1095140ebY2, j, j2, c1096000ecw);
        } else if (enumC1095860eci == EnumC1095860eci.FANS_CLUB_ANIM_POINTS_INCREASE_FROM_ZERO && LJIILLIIL()) {
            LJJIJIIJI(EnumC1095860eci.FANS_CLUB_ANIM_CLAIM_GUIDE_OPT_TYPE, c1095140ebY, c1095140ebY2, j, j2, c1096000ecw);
        } else {
            LJJIJIIJI(enumC1095860eci, c1095140ebY, c1095140ebY2, j, j2, c1096000ecw);
        }
    }
}
