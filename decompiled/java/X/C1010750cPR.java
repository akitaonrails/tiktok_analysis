package X;

import Y.ARunnableS109S0100000_9;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0cPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010750cPR {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4698));
    public final InterfaceC657510Pqf LIZIZ = C655610Pnb.LIZIZ.LIZLLL();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(466));

    public final AbstractC1023470cjx LIZIZ() {
        return (AbstractC1023470cjx) this.LIZJ.getValue();
    }

    public final void LIZ(Aweme aweme) {
        String desc;
        InterfaceC657510Pqf interfaceC657510Pqf;
        C1007860cKm c1007860cKmLJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearState aweme=");
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = null;
        }
        sbLIZ.append(desc);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (aweme != null && (interfaceC657510Pqf = this.LIZIZ) != null && (c1007860cKmLJIILIIL = interfaceC657510Pqf.LJIILIIL()) != null) {
            c1007860cKmLJIILIIL.LIZLLL(aweme, EnumC590180NCu.NOT_TRACK);
        }
    }

    public final void LIZJ(Aweme aweme, String str, C622570ObP c622570ObP) {
        if (aweme == null) {
            return;
        }
        LIZIZ().withContext(aweme, C1010120cOQ.LJIIIIZZ(aweme));
        if (C1011530cQh.LIZ().enableLiteShowEventLogger || ((Boolean) this.LIZ.getValue()).booleanValue()) {
            LIZLLL(aweme, str, c622570ObP);
        } else {
            C1012040cRW c1012040cRWLIZ = ((IFeedSharePlayInfoHelperProvider) ServiceManager.get().getService(IFeedSharePlayInfoHelperProvider.class)).LIZ();
            C0R12 c0r12 = C0R12.LIZIZ;
            InterfaceC688220Qz6 interfaceC688220Qz6LJJI = c0r12.LJJI();
            InterfaceC1010140cOS interfaceC1010140cOSLJIIIIZZ = c0r12.LJIIIIZZ();
            if (c1012040cRWLIZ.LJIIJ && interfaceC1010140cOSLJIIIIZZ.LJIIJJI(aweme)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Old track EVENT_RESULT_PAGE_VIDEO_OTHERSHOW aweme=");
                sbLIZ.append(aweme.getDesc());
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C2510609se.LIZ;
                interfaceC688220Qz6LJJI.LJIIJ(aweme.getAwemeRawAd(), false, false);
                c1012040cRWLIZ.LJIIJ = false;
            } else {
                interfaceC688220Qz6LJJI.LJIIIZ(aweme.getAwemeRawAd(), str, C1019100ccu.LJ(aweme));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Old track EVENT_SHOW aweme=");
                sbLIZ2.append(aweme.getDesc());
                C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2510609se.LIZ;
            }
        }
        if (C288610BSx.LIZ()) {
            C11S5.LIZ().LIZIZ(new ARunnableS109S0100000_9(aweme.getAwemeRawAd(), 203));
        }
    }

    public final void LIZLLL(Aweme aweme, String str, C622570ObP c622570ObP) {
        EnumC590180NCu enumC590180NCuLIZJ;
        AFwS252S0000000_16 aFwS252S0000000_16;
        C1007860cKm c1007860cKmLJIILIIL;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        C1007860cKm c1007860cKmLJIILIIL2;
        InterfaceC657510Pqf interfaceC657510Pqf = this.LIZIZ;
        if (interfaceC657510Pqf != null && (c1007860cKmLJIILIIL2 = interfaceC657510Pqf.LJIILIIL()) != null) {
            enumC590180NCuLIZJ = c1007860cKmLJIILIIL2.LIZJ(aweme);
        } else {
            enumC590180NCuLIZJ = null;
        }
        if (enumC590180NCuLIZJ != EnumC590180NCu.NOT_TRACK && (CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk || (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (num = searchAdInfo.searchDeliveryType) != null && num.intValue() == 3))) {
            AbstractC1023470cjx abstractC1023470cjxLIZIZ = LIZIZ();
            C1009980cOC.LIZ.getClass();
            abstractC1023470cjxLIZIZ.logAd(C1009980cOC.LJIILJJIL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("track EVENT_RESULT_PAGE_VIDEO_OTHERSHOW aweme=");
            sbLIZ.append(aweme.getDesc());
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2510609se.LIZ;
            return;
        }
        C01GW c01gw = C1010760cPS.LIZ;
        C1009980cOC.LIZ.getClass();
        C1023960ckk c1023960ckk = C1009980cOC.LIZIZ;
        String second = c1023960ckk.LJI.getSecond();
        if (C2264471DkD.LJ() && C1010760cPS.LIZIZ.contains(c1023960ckk) && C1010760cPS.LIZ().LIZ(aweme, String.valueOf(second))) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
        } else {
            if ((C2264471DkD.LJFF() || C2264471DkD.LIZJ()) && C1010760cPS.LIZ().LIZ(aweme, String.valueOf(second))) {
                MeasurementDependencyModules.LIZ.getClass();
                C04TF.LIZ().isDebug();
                aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(449);
            } else {
                MeasurementDependencyModules.LIZ.getClass();
                C04TF.LIZ().isDebug();
                aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(450);
            }
            C1009940cO8.LJIIIZ(LIZIZ(), aweme, str, c622570ObP, aFwS252S0000000_16);
        }
        InterfaceC657510Pqf interfaceC657510Pqf2 = this.LIZIZ;
        if (interfaceC657510Pqf2 != null && (c1007860cKmLJIILIIL = interfaceC657510Pqf2.LJIILIIL()) != null) {
            c1007860cKmLJIILIIL.LIZLLL(aweme, EnumC590180NCu.HAS_TRACKED_IN_RESULT_PAGE);
        }
        aweme.getDesc();
        int i2 = C2510609se.LIZ;
    }
}
