package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.E2EGeneralAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.FriendsV3MusicTitleAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.MinisAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.PineDramaAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.ServicePluginAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.ShortDramaReserveAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.TicketMasterNewAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.TicketMasterOldAnchorMaker;
import com.ss.android.ugc.aweme.utils.ILyricEffectAnchorService;
import com.ss.android.ugc.aweme.utils.ISportAnchorProviderService;
import com.ss.android.ugc.tiktok.anchor.EffectAnchorServiceImpl;
import com.ss.android.ugc.tiktok.anchor.lyric.LyricEffectAnchorServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067020dsC {
    public static final C1067020dsC LIZ = new C1067020dsC();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(325));
    public static List<InterfaceC1393560mMs> LIZJ;

    public static List LIZIZ() {
        ILyricEffectAnchorService iLyricEffectAnchorService;
        InterfaceC1393560mMs[] interfaceC1393560mMsArr = new InterfaceC1393560mMs[82];
        interfaceC1393560mMsArr[0] = new C1050180dR2();
        interfaceC1393560mMsArr[1] = new C11W7();
        interfaceC1393560mMsArr[2] = new C1613970s6N();
        interfaceC1393560mMsArr[3] = new C1056530dbH();
        interfaceC1393560mMsArr[4] = new C1067030dsD();
        interfaceC1393560mMsArr[5] = new C21272318Mn();
        interfaceC1393560mMsArr[6] = new FriendsV3MusicTitleAnchorMaker();
        interfaceC1393560mMsArr[7] = new ShopWindowAnchorMaker();
        interfaceC1393560mMsArr[8] = new C1392780mLc();
        interfaceC1393560mMsArr[9] = new C1067140dsO();
        interfaceC1393560mMsArr[10] = new C1067150dsP();
        interfaceC1393560mMsArr[11] = new C1067180dsS();
        interfaceC1393560mMsArr[12] = new PoiAnchorMaker();
        interfaceC1393560mMsArr[13] = new C1066810drr();
        interfaceC1393560mMsArr[14] = new C19327910jV();
        interfaceC1393560mMsArr[15] = EffectAnchorServiceImpl.LIZLLL().LIZ();
        interfaceC1393560mMsArr[16] = EffectAnchorServiceImpl.LIZLLL().LIZJ();
        interfaceC1393560mMsArr[17] = new C1397440mT8();
        interfaceC1393560mMsArr[18] = new C1067340dsi();
        interfaceC1393560mMsArr[19] = new C1067420dsq();
        interfaceC1393560mMsArr[20] = new C19580511j9();
        interfaceC1393560mMsArr[21] = new C1392740mLY();
        interfaceC1393560mMsArr[22] = new C1076810e7z();
        interfaceC1393560mMsArr[23] = new C1392710mLV();
        interfaceC1393560mMsArr[24] = new C1392720mLW();
        interfaceC1393560mMsArr[25] = new C1392730mLX();
        interfaceC1393560mMsArr[26] = new C1392690mLT();
        interfaceC1393560mMsArr[27] = new C1392680mLS();
        interfaceC1393560mMsArr[28] = new C1392700mLU();
        interfaceC1393560mMsArr[29] = new C1394000mNa();
        interfaceC1393560mMsArr[30] = new C1058090ddn();
        interfaceC1393560mMsArr[31] = new C1050360dRK();
        interfaceC1393560mMsArr[32] = new C1050340dRI();
        interfaceC1393560mMsArr[33] = new C1067500dsy();
        interfaceC1393560mMsArr[34] = new C1067490dsx();
        interfaceC1393560mMsArr[35] = new C1067510dsz();
        interfaceC1393560mMsArr[36] = new C1067010dsB();
        interfaceC1393560mMsArr[37] = new C1050910dSD();
        interfaceC1393560mMsArr[38] = new C1050210dR5();
        interfaceC1393560mMsArr[39] = new GamingAnchorMaker();
        interfaceC1393560mMsArr[40] = new C1050230dR7();
        interfaceC1393560mMsArr[41] = new C1050690dRr();
        interfaceC1393560mMsArr[42] = new C1050260dRA();
        interfaceC1393560mMsArr[43] = new C1050220dR6();
        interfaceC1393560mMsArr[44] = new C1067960dti();
        interfaceC1393560mMsArr[45] = new C1067930dtf();
        ISportAnchorProviderService iSportAnchorProviderService = (ISportAnchorProviderService) PluggableExtentionKt.pluggableSpi$default(ISportAnchorProviderService.class, false, false, false, 14, null);
        interfaceC1393560mMsArr[46] = iSportAnchorProviderService != null ? iSportAnchorProviderService.LIZIZ() : null;
        interfaceC1393560mMsArr[47] = new C21285018Rk();
        interfaceC1393560mMsArr[48] = new C21284818Ri();
        interfaceC1393560mMsArr[49] = new C1067470dsv();
        interfaceC1393560mMsArr[50] = new C1056510dbF();
        interfaceC1393560mMsArr[51] = new TicketMasterNewAnchorMaker();
        interfaceC1393560mMsArr[52] = new TicketMasterOldAnchorMaker();
        interfaceC1393560mMsArr[53] = new C1065110dp7();
        interfaceC1393560mMsArr[54] = new C1067060dsG();
        interfaceC1393560mMsArr[55] = new C1067080dsI();
        interfaceC1393560mMsArr[56] = new C1067070dsH();
        interfaceC1393560mMsArr[57] = new ServicePluginAnchorMaker();
        interfaceC1393560mMsArr[58] = new MinisAnchorMaker();
        interfaceC1393560mMsArr[59] = new C1393860mNM();
        interfaceC1393560mMsArr[60] = new C1067050dsF();
        interfaceC1393560mMsArr[61] = new C1052280dUQ();
        interfaceC1393560mMsArr[62] = new C1050470dRV();
        interfaceC1393560mMsArr[63] = new C1050740dRw();
        interfaceC1393560mMsArr[64] = new C1399210mVz();
        interfaceC1393560mMsArr[65] = new C1399360mWE();
        interfaceC1393560mMsArr[66] = new C1066400drC();
        interfaceC1393560mMsArr[67] = new C1066440drG();
        interfaceC1393560mMsArr[68] = new C1066420drE();
        interfaceC1393560mMsArr[69] = new C0MUX();
        Object objLIZ = C04TD.LIZ(ILyricEffectAnchorService.class, false);
        if (objLIZ != null) {
            iLyricEffectAnchorService = (ILyricEffectAnchorService) objLIZ;
        } else {
            if (C04TD.V6 == null) {
                synchronized (ILyricEffectAnchorService.class) {
                    if (C04TD.V6 == null) {
                        C04TD.V6 = new LyricEffectAnchorServiceImpl();
                    }
                }
            }
            iLyricEffectAnchorService = C04TD.V6;
        }
        interfaceC1393560mMsArr[70] = iLyricEffectAnchorService.LIZ();
        interfaceC1393560mMsArr[71] = new C0M72();
        interfaceC1393560mMsArr[72] = new PineDramaAnchorMaker();
        interfaceC1393560mMsArr[73] = new ShortDramaReserveAnchorMaker();
        interfaceC1393560mMsArr[74] = new E2EGeneralAnchorMaker();
        interfaceC1393560mMsArr[75] = new CommonAnchorMaker();
        interfaceC1393560mMsArr[76] = new C1050750dRx();
        interfaceC1393560mMsArr[77] = new C1067040dsE();
        interfaceC1393560mMsArr[78] = new C1394060mNg();
        interfaceC1393560mMsArr[79] = new C1394670mOf();
        interfaceC1393560mMsArr[80] = new C1399410mWJ();
        interfaceC1393560mMsArr[81] = new C1067130dsN();
        return new ArrayList(C13LP.LJJJJLI(C1697810uHb.LJ(interfaceC1393560mMsArr)));
    }

    public static ArrayList LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : (ArrayList) list) {
            LIZ.getClass();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) it2.next();
                    LIZ.getClass();
                    if (anchorCommonStruct2 == null || !Intrinsics.LJFF(anchorCommonStruct.getId(), anchorCommonStruct2.getId()) || !Intrinsics.LJFF(anchorCommonStruct.getKeyword(), anchorCommonStruct2.getKeyword()) || anchorCommonStruct.getType() != EnumC1430380nKG.PROP.getTYPE()) {
                    }
                } else {
                    arrayList.add(anchorCommonStruct);
                    break;
                }
            }
        }
        return arrayList;
    }
}
