package X;

import android.view.View;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusContainerChangeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpContainerViewShowEventForReductionPhase2;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2DebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3DebuffChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionLayoutNewEventSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20489815Fo extends AbstractC977390bXd {
    public MatchBaseWidget LLILZ;
    public DataChannel LLILZIL;
    public C20490115Fr LLILZLL;
    public C15G1 LLIZ;
    public SparkContext LLIZLLLIL;

    @Override // X.AbstractC977390bXd, X.InterfaceC977420bXg
    public final void reset() {
    }

    public final View LJIIIIZZ() {
        C20490115Fr c20490115Fr;
        View viewLIZIZ;
        if (this.LLILZLL == null) {
            final MatchBaseWidget matchBaseWidget = this.LLILZ;
            if (matchBaseWidget == null) {
                return null;
            }
            View view = matchBaseWidget.contentView;
            if (view == null) {
                C20441214yg.LJ("contributorListComponent", "getContentView: contentView is null, skip initializing observer view manager");
                return null;
            }
            C15G1 c15g1 = new C15G1(view, this.LLILZIL);
            this.LLIZ = c15g1;
            C20490115Fr c20490115Fr2 = new C20490115Fr();
            View view2 = c15g1.LIZ;
            if (view2 == null) {
                throw new IllegalStateException("Unable to find view by id due to null root view.");
            }
            C20489915Fp c20489915Fp = new C20489915Fp(c15g1.LIZIZ, view2.findViewById(R.id.mdj), c15g1);
            c20489915Fp.LJFF = new C15G3() { // from class: X.04zu
                @Override // X.C15G3
                public final void LIZ(View view3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("init, view = ");
                    sbLIZ.append(view3);
                    sbLIZ.append(", lifecycleOwner = ");
                    sbLIZ.append(matchBaseWidget);
                    C20441214yg.LIZIZ("BattleMvpListObserverView", C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            c20489915Fp.LJ = matchBaseWidget;
            C20489915Fp c20489915FpLIZ = c20489915Fp.LIZ(BattleMvpLeftListChannel.class, new C15G2() { // from class: X.15Fu
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    ((C1146260fw0) view3).LJIILL((List) obj);
                }
            }).LIZ(BattleMvpRightListChannel.class, new C15G2() { // from class: X.15Fv
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    ((C1146260fw0) view3).LJIILJJIL((List) obj, false);
                }
            }).LIZ(BattleIsCurrentWinChannel.class, new C15G2() { // from class: X.15Ft
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    ((C1146260fw0) view3).LJIIIIZZ(((Boolean) obj).booleanValue());
                }
            }).LIZ(BattleBonusContainerChangeEvent.class, new C15G2() { // from class: X.15G0
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    ((Integer) obj).intValue();
                    view3.getClass();
                }
            }).LIZ(BattleTop2CardEffectChannel.class, new C15G2() { // from class: X.15Fw
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    C1146260fw0 c1146260fw0 = (C1146260fw0) view3;
                    EnumC919030a1V enumC919030a1V = (EnumC919030a1V) obj;
                    if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BattleTop2CardEffectChannel Received = ");
                        sbLIZ.append(enumC919030a1V.ordinal());
                        C20441214yg.LJIIIZ("BattleMvpListObserverView", C2188811AlT.LIZIZ(sbLIZ));
                        c1146260fw0.LJIIL(true, true, enumC919030a1V);
                    }
                }
            }).LIZ(BattleTop3CardEffectChannel.class, new C15G2() { // from class: X.15Fx
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    C1146260fw0 c1146260fw0 = (C1146260fw0) view3;
                    EnumC919030a1V enumC919030a1V = (EnumC919030a1V) obj;
                    if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BattleTop3CardEffectChannel Received = ");
                        sbLIZ.append(enumC919030a1V.ordinal());
                        C20441214yg.LJIIIZ("BattleMvpListObserverView", C2188811AlT.LIZIZ(sbLIZ));
                        c1146260fw0.LJIIL(false, true, enumC919030a1V);
                    }
                }
            }).LIZ(BattleTop2DebuffChannel.class, new C15G2() { // from class: X.15Fy
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    C1146260fw0 c1146260fw0 = (C1146260fw0) view3;
                    EnumC919030a1V enumC919030a1V = (EnumC919030a1V) obj;
                    if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BattleTop2DebuffChannel Received = ");
                        sbLIZ.append(enumC919030a1V.ordinal());
                        C20441214yg.LJIIIZ("BattleMvpListObserverView", C2188811AlT.LIZIZ(sbLIZ));
                        c1146260fw0.LJIIL(true, false, enumC919030a1V);
                    }
                }
            }).LIZ(BattleTop3DebuffChannel.class, new C15G2() { // from class: X.15Fz
                @Override // X.C15G2
                public final void LIZ(View view3, Object obj) {
                    C1146260fw0 c1146260fw0 = (C1146260fw0) view3;
                    EnumC919030a1V enumC919030a1V = (EnumC919030a1V) obj;
                    if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BattleTop3DebuffChannel Received = ");
                        sbLIZ.append(enumC919030a1V.ordinal());
                        C20441214yg.LJIIIZ("BattleMvpListObserverView", C2188811AlT.LIZIZ(sbLIZ));
                        c1146260fw0.LJIIL(false, false, enumC919030a1V);
                    }
                }
            });
            C20490015Fq<C1146260fw0> c20490015Fq = new C20490015Fq<>(c20489915FpLIZ.LIZJ, c20489915FpLIZ.LIZLLL, c20489915FpLIZ.LIZ);
            Set<C20490015Fq> set = c20489915FpLIZ.LIZIZ.LIZJ;
            if (set != null) {
                ((HashSet) set).add(c20490015Fq);
            }
            c20490115Fr2.LIZ = c20490015Fq;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BattleMvpListNewObserverView start, view = ");
            C20490015Fq<C1146260fw0> c20490015Fq2 = c20490115Fr2.LIZ;
            if (c20490015Fq2 == null) {
                c20490015Fq2 = null;
            }
            sbLIZ.append(c20490015Fq2.LIZIZ);
            C20441214yg.LIZIZ("BattleMvpListObserverView", C2188811AlT.LIZIZ(sbLIZ));
            C20490015Fq<C1146260fw0> c20490015Fq3 = c20490115Fr2.LIZ;
            if (c20490015Fq3 == null) {
                c20490015Fq3 = null;
            }
            ((C1146260fw0) c20490015Fq3.LIZIZ).LJIILIIL();
            AwS397S0200000_31 awS397S0200000_31 = new AwS397S0200000_31(this, matchBaseWidget, 66);
            C20490015Fq<C1146260fw0> c20490015Fq4 = c20490115Fr2.LIZ;
            if (c20490015Fq4 == null) {
                c20490015Fq4 = null;
            }
            ((C1146260fw0) c20490015Fq4.LIZIZ).setClickCallback(awS397S0200000_31);
            this.LLILZLL = c20490115Fr2;
            if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled && (c20490115Fr = this.LLILZLL) != null && (viewLIZIZ = c20490115Fr.LIZIZ()) != null) {
                viewLIZIZ.setTag("biz_contributor");
            }
        }
        C20490115Fr c20490115Fr3 = this.LLILZLL;
        if (c20490115Fr3 != null) {
            return c20490115Fr3.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        View viewLIZIZ;
        C20490115Fr c20490115Fr = this.LLILZLL;
        if (c20490115Fr != null) {
            c20490115Fr.LIZ();
        }
        C20490115Fr c20490115Fr2 = this.LLILZLL;
        if (c20490115Fr2 != null && (viewLIZIZ = c20490115Fr2.LIZIZ()) != null) {
            C786410Ut5.LJLLLLLL(8, viewLIZIZ);
        }
        C20490115Fr c20490115Fr3 = this.LLILZLL;
        if (c20490115Fr3 != null) {
            c20490115Fr3.LIZLLL();
        }
        SparkContext sparkContext = this.LLIZLLLIL;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LLIZLLLIL = null;
    }

    @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
    public final void onUnload() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        View viewLIZIZ;
        Set<C20490015Fq> set;
        super.onUnload();
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C15G1 c15g1 = this.LLIZ;
        if (c15g1 != null && (set = c15g1.LIZJ) != null) {
            for (C20490015Fq c20490015Fq : (HashSet) set) {
                c20490015Fq.LIZ.zQ2(c20490015Fq);
                ((HashMap) c20490015Fq.LIZJ).clear();
            }
            ((HashSet) c15g1.LIZJ).clear();
        }
        if (SettingsManager.INSTANCE.getBooleanValue("live_match_audience_mvp_reset_enable", true)) {
            C20490115Fr c20490115Fr = this.LLILZLL;
            if (c20490115Fr != null) {
                c20490115Fr.LIZ();
            }
            C20490115Fr c20490115Fr2 = this.LLILZLL;
            if (c20490115Fr2 != null && (viewLIZIZ = c20490115Fr2.LIZIZ()) != null) {
                C786410Ut5.LJLLLLLL(8, viewLIZIZ);
            }
            C20490115Fr c20490115Fr3 = this.LLILZLL;
            if (c20490115Fr3 != null) {
                c20490115Fr3.LIZLLL();
            }
            this.LLILZLL = null;
            SparkContext sparkContext = this.LLIZLLLIL;
            if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
                interfaceC1059280dfiLJJIJLIJ.close();
            }
            this.LLIZLLLIL = null;
        }
    }

    @Override // X.AbstractC977390bXd, X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        C1146260fw0 c1146260fw0;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        View viewLIZIZ = null;
        if (abstractC986700bme instanceof C986690bmd) {
            SparkContext sparkContext = this.LLIZLLLIL;
            if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
                interfaceC1059280dfiLJJIJLIJ.close();
            }
            this.LLIZLLLIL = null;
        }
        C20490115Fr c20490115Fr = this.LLILZLL;
        if (c20490115Fr != null) {
            viewLIZIZ = c20490115Fr.LIZIZ();
        }
        if ((viewLIZIZ instanceof C1146260fw0) && (c1146260fw0 = (C1146260fw0) viewLIZIZ) != null) {
            c1146260fw0.LJFF();
        }
    }

    @Override // X.AbstractC977390bXd, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        View viewLJIIIIZZ;
        super.LIZLLL(matchBaseWidget);
        this.LLILZ = matchBaseWidget;
        this.LLILZIL = matchBaseWidget.dataChannel;
        C20441214yg.LIZIZ("contributorListComponent", "contributorList onLoad");
        if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled && (viewLJIIIIZZ = LJIIIIZZ()) != null) {
            viewLJIIIIZZ.setTag("biz_contributor");
        }
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.BQ2(matchBaseWidget, BattleMvpContainerViewShowEventForReductionPhase2.class, new AwS595S0100000_16(this, 188));
            dataChannel.BQ2(matchBaseWidget, UserWannaSendMessageEvent.class, new AwS610S0100000_31(this, 291));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0130 A[PHI: r7
      0x0130: PHI (r7v2 boolean) = (r7v4 boolean), (r7v6 boolean) binds: [B:77:0x012e, B:75:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    @Override // X.AbstractC977390bXd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C975960bVK r14) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20489815Fo.LJI(X.0bVK):void");
    }
}
