package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAb;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAbModel;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.BaseRankModel;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CandidateAdData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CorrespondPostRollAdData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.ExtraLastState;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.FeedActionData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.PostRollAdData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.feed.candidate.CandidateRequestImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1CuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245331CuR implements InterfaceC1603020roi, InterfaceC2245571Cup {
    public final EnumC584610MwN LIZ;
    public long LIZLLL;
    public InterfaceC1609890rzn LJ;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C2245281CuM LIZIZ = new C2245281CuM();
    public final C2245361CuU LIZJ = new C2245361CuU();
    public final Map<String, BaseRankModel> LJFF = new LinkedHashMap();
    public String LJI = "";
    public String LJIIIZ = "";
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public final C01GW LJIIL = C452501pT.LIZIZ(new C2245621Cuu(this));
    public C2245641Cuw LJIILIIL = new C2245641Cuw();
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C2245551Cun());
    public final C01GW LJIILL = C452501pT.LIZIZ(new C2245421Cua());
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new C2245391CuX());
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new C2245461Cue());
    public final C01GW LJIJ = C452501pT.LIZIZ(new C2245451Cud());
    public final C01GW LJIJI = C452501pT.LIZIZ(new C2245471Cuf());
    public final C01GW LJIJJ = C452501pT.LIZIZ(new C2245401CuY());
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new C2245531Cul());
    public final C01GW LJIL = C452501pT.LIZIZ(new C2245541Cum());
    public final C01GW LJJ = C452501pT.LIZIZ(new C2245411CuZ());
    public final C01GW LJJI = C452501pT.LIZIZ(new C2245501Cui());
    public final C01GW LJJIFFI = C452501pT.LIZIZ(new C2245511Cuj());
    public final C01GW LJJII = C452501pT.LIZIZ(new C2245491Cuh());
    public final C01GW LJJIII = C452501pT.LIZIZ(new C293470Ber());
    public final C01GW LJJIIJ = C452501pT.LIZIZ(new C2245481Cug());
    public final C01GW LJJIIJZLJL = C452501pT.LIZIZ(new C2245431Cub());
    public final C01GW LJJIIZ = C452501pT.LIZIZ(new C2245441Cuc());
    public final C01GW LJJIIZI = C452501pT.LIZIZ(new C2245521Cuk());
    public final C01GW LJJIJ = C452501pT.LIZIZ(new C288520BSo());

    @Override // X.InterfaceC1603020roi
    public final void L4() {
        C2245361CuU c2245361CuU = this.LIZJ;
        if (c2245361CuU.LIZLLL) {
            C1022620cia.LIZ("PostRollAdManager", "[updateAsyncTime]");
            c2245361CuU.LIZ = System.currentTimeMillis() / 1000;
        }
    }

    public final boolean LJFF() {
        boolean z = false;
        if (!((Boolean) this.LJIILL.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[checkReRankEnabled] rerank disabled, enableReRank=");
            sbLIZ.append(AdPitayaReRankClientAb.get().enablePitayaReRank);
            C1022620cia.LIZIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (!this.LJII) {
            AdPitayaReRankClientAbModel adPitayaReRankClientAbModel = AdPitayaReRankClientAb.get();
            C1776310wKD c1776310wKD = new C1776310wKD(adPitayaReRankClientAbModel.businessName, adPitayaReRankClientAbModel.coreTaskName, adPitayaReRankClientAbModel.prepareTaskName, this.LIZ.ordinal());
            C7740030o.LIZ().getGson();
            C2245211CuF.LIZ.put(this.LIZ.name(), new C2245221CuG(c1776310wKD, new ConcurrentHashMap()));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[init] sceneConfig=");
            sbLIZ2.append(c1776310wKD);
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[printReRankConfig] minFloorStep=");
            sbLIZ3.append(((Number) this.LJIJ.getValue()).intValue());
            sbLIZ3.append(", postOnHolderSelectedDelay=");
            sbLIZ3.append(((Number) this.LJIJI.getValue()).longValue());
            sbLIZ3.append("ms, slideOptimization=");
            sbLIZ3.append(((Boolean) this.LJIJJLI.getValue()).booleanValue());
            sbLIZ3.append(", timerOptimization=");
            sbLIZ3.append(((Boolean) this.LJIJJ.getValue()).booleanValue());
            sbLIZ3.append(", supportCancelReRank=");
            sbLIZ3.append(((Boolean) this.LJIL.getValue()).booleanValue());
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[printPostRollDropConfig] insertCheckPostRoll=");
            sbLIZ4.append(AdPitayaReRankClientAb.get().insertCheckPostRoll);
            sbLIZ4.append(", replaceInsertCheck=");
            sbLIZ4.append(AdPitayaReRankClientAb.get().replaceInsertCheck);
            sbLIZ4.append(", rerankTriggerCheckShowOptimization=");
            sbLIZ4.append(LJIIJJI());
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[post-roll] enable_show_time_post_roll=");
            C293430Ben c293430Ben = C293430Ben.LIZ;
            c293430Ben.getClass();
            sbLIZ5.append(C293430Ben.LIZ());
            sbLIZ5.append(", rerank_before_get_post_roll_source=");
            C274660Apc.LIZ.getClass();
            c293430Ben.getClass();
            sbLIZ5.append(C293430Ben.LIZ() && ((Number) C274660Apc.LIZIZ.getValue()).intValue() == 1);
            sbLIZ5.append(", rerank_get_post_roll_source=");
            C293460Beq.LIZ.getClass();
            sbLIZ5.append(((Number) C293460Beq.LIZIZ.getValue()).intValue());
            sbLIZ5.append(", rerank_show_post_roll_source=");
            C274680Ape.LIZ.getClass();
            c293430Ben.getClass();
            if (C293430Ben.LIZ() && ((Number) C274680Ape.LIZIZ.getValue()).intValue() == 1) {
                z = true;
            }
            sbLIZ5.append(z);
            sbLIZ5.append(", disable_show_post_roll_for_long_video=");
            C293440Beo.LIZ.getClass();
            sbLIZ5.append(C293440Beo.LIZ());
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ5));
            this.LJII = true;
        }
        return true;
    }

    public final boolean LJIIIZ() {
        return ((Boolean) this.LJJIJ.getValue()).booleanValue();
    }

    public final boolean LJIIJ() {
        return ((Boolean) this.LJJIIJ.getValue()).booleanValue();
    }

    public final boolean LJIIJJI() {
        return ((Boolean) this.LJJI.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1603020roi
    public final long N4() {
        long j;
        synchronized (C2245381CuW.LIZ) {
            j = C2245381CuW.LIZIZ.LIZ;
            if (j == -1) {
                j = 0;
            }
        }
        return j;
    }

    @Override // X.InterfaceC1603020roi
    public final long R4() {
        if (this.LJIILIIL.LIZJ == -1) {
            return -1L;
        }
        Gson gson = C1617880sCg.LIZ;
        List listLIZ = C1617880sCg.LIZ(this.LJ);
        int size = listLIZ.size() - AdPitayaReRankClientAb.get().recentFeedCount;
        if (size < 0) {
            size = 0;
        }
        int size2 = listLIZ.size() - 1;
        if (size <= size2) {
            while (true) {
                Aweme aweme = (Aweme) ListProtector.get(listLIZ, size2);
                if (aweme.isAd()) {
                    String str = this.LJIILIIL.LIZIZ;
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (TextUtils.equals(str, awemeRawAd != null ? awemeRawAd.getCreativeIdStr() : null)) {
                        return this.LJIILIIL.LIZJ / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                }
                if (size2 == size) {
                    break;
                }
                size2--;
            }
        }
        return -1L;
    }

    @Override // X.InterfaceC1603020roi
    public final void T4() {
        this.LIZJ.LIZJ(null);
    }

    @Override // X.InterfaceC1603020roi
    public final String U4() {
        StringBuilder sb = new StringBuilder();
        Gson gson = C1617880sCg.LIZ;
        List listLIZ = C1617880sCg.LIZ(this.LJ);
        int size = listLIZ.size() - AdPitayaReRankClientAb.get().recentFeedCount;
        if (size < 0) {
            size = 0;
        }
        int size2 = listLIZ.size();
        while (size < size2) {
            Aweme aweme = (Aweme) ListProtector.get(listLIZ, size);
            sb.append(aweme.getAid());
            if (aweme.isAd()) {
                sb.append("_");
                sb.append(aweme.getAwemeRawAd().getAdId().longValue());
            } else if (C2245741Cv6.LIZIZ(aweme)) {
                int iIndexOf = listLIZ.indexOf(aweme);
                String string = null;
                if (iIndexOf != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    if (iIndexOf <= this.LJIIJ) {
                        HashMap<String, Aweme> map = C0N6Z.LIZ;
                        Aweme awemeLIZIZ = C0N6Z.LIZIZ(aweme.getAid());
                        if (awemeLIZIZ != null && awemeLIZIZ.isAd()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("_midroll_");
                            sbLIZ.append(awemeLIZIZ.getAid());
                            sbLIZ.append('_');
                            AwemeRawAd awemeRawAd = awemeLIZIZ.getAwemeRawAd();
                            sbLIZ.append(awemeRawAd != null ? awemeRawAd.getAdId() : null);
                            sb2.append(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        sb2.append("_midroll");
                    }
                    string = sb2.toString();
                }
                sb.append(string);
            }
            sb.append(",");
            size++;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // X.InterfaceC1603020roi
    public final long W4() {
        return this.LIZIZ.LIZIZ;
    }

    @Override // X.InterfaceC1603020roi
    public final long X4() {
        return C2245381CuW.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC1603020roi
    public final long g5() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.InterfaceC1603020roi
    public final void unBind() {
        C1022620cia.LIZ("AdReRankImpl", "[unBind]");
        C2245211CuF.LIZ(this.LIZ.name());
        C1022620cia.LIZ("AdReRankImpl", "[resetData]");
        ((LinkedHashMap) this.LJFF).clear();
        this.LIZLLL = 0L;
        this.LJIIJJI = -1;
        this.LJ = null;
        this.LJI = "";
        C2245641Cuw c2245641Cuw = this.LJIILIIL;
        c2245641Cuw.LIZ = "";
        c2245641Cuw.LIZIZ = "";
        c2245641Cuw.LIZJ = -1L;
        c2245641Cuw.LIZLLL = null;
        C2245281CuM c2245281CuM = this.LIZIZ;
        synchronized (c2245281CuM) {
            c2245281CuM.LIZ.clear();
            c2245281CuM.LIZIZ = 0L;
            c2245281CuM.LIZJ = 0L;
            c2245281CuM.LJFF = "";
            c2245281CuM.LJ.LIZ.clear();
        }
        this.LIZJ.LIZIZ();
        C2245381CuW.LIZ.LIZ();
    }

    @Override // X.InterfaceC1603020roi
    public final boolean S4() {
        return this.LJIIIIZZ;
    }

    public C2245331CuR(EnumC584610MwN enumC584610MwN) {
        this.LIZ = enumC584610MwN;
    }

    @Override // X.InterfaceC1603020roi
    public final void I4(C1609880rzm c1609880rzm) {
        this.LJ = c1609880rzm;
        if (!LJIIIZ()) {
            boolean zLJFF = LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[bind] rerankEnabled=");
            sbLIZ.append(zLJFF);
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void J4(int i) {
        int i2 = this.LJIIJJI - i;
        if (i2 < -1) {
            i2 = -1;
        }
        this.LJIIJJI = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onPositionTrimmed] trimmedCount=");
        sbLIZ.append(i);
        sbLIZ.append(", curPos=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", maxPos=");
        sbLIZ.append(this.LJIIJJI);
        C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2245571Cup
    public final void LIZ(String str) {
        List<Aweme> listFg;
        String eventType;
        C0SR4 c0sr4;
        C2245281CuM c2245281CuM = this.LIZIZ;
        InterfaceC1609890rzn interfaceC1609890rzn = this.LJ;
        if (interfaceC1609890rzn == null || (c0sr4 = ((C1609880rzm) interfaceC1609890rzn).LIZ.LLJL) == null || (listFg = c0sr4.Fg()) == null) {
            listFg = C13BV.INSTANCE;
        }
        InterfaceC1609890rzn interfaceC1609890rzn2 = this.LJ;
        if (interfaceC1609890rzn2 == null || (eventType = ((C1609880rzm) interfaceC1609890rzn2).LIZ.getEventType()) == null) {
            eventType = "";
        }
        c2245281CuM.getClass();
        c2245281CuM.LIZJ = System.currentTimeMillis() / 1000;
        CandidateRequestImpl.LIZJ().LIZ(eventType, str, listFg);
    }

    @Override // X.InterfaceC2245571Cup
    public final void LIZIZ(List<String> list) {
        RankData rankData;
        Aweme originItem;
        String aid;
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            CandidateAdData candidateAdData = this.LIZIZ.LIZ.get(it2.next());
            if (candidateAdData != null && (rankData = candidateAdData.getRankData()) != null && (originItem = rankData.getOriginItem()) != null && (aid = originItem.getAid()) != null && aid.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[preloadCandidateAd] aid=");
                sbLIZ.append(originItem.getAid());
                C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZIZ.getClass();
                CandidateRequestImpl.LIZJ().LIZIZ(originItem);
                this.LJFF.put(originItem.getAid(), LJII(originItem, EnumC1159890gHz.UNSHOWN_ADJUSTABLE));
            }
        }
        C2245281CuM c2245281CuM = this.LIZIZ;
        synchronized (c2245281CuM) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (String str : list) {
                linkedHashMap.put(str, str);
            }
            for (String str2 : c2245281CuM.LIZ.keySet()) {
                if (linkedHashMap.containsKey(str2)) {
                    c2245281CuM.LIZ.remove(str2);
                }
            }
            if (list.isEmpty() && (!c2245281CuM.LIZ.isEmpty())) {
                c2245281CuM.LIZLLL++;
            } else {
                c2245281CuM.LIZLLL = 0;
            }
        }
    }

    @Override // X.InterfaceC2245571Cup
    public final Aweme LIZJ(String str) {
        String aid;
        PostRollAdData postRollAdData;
        RankData rankData;
        RankData rankData2;
        C2245361CuU c2245361CuU = this.LIZJ;
        PostRollAdData postRollAdData2 = c2245361CuU.LIZJ;
        if (postRollAdData2 != null && (rankData2 = postRollAdData2.getRankData()) != null) {
            aid = rankData2.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid) || (postRollAdData = c2245361CuU.LIZJ) == null || (rankData = postRollAdData.getRankData()) == null) {
            return null;
        }
        return rankData.getOriginItem();
    }

    @Override // X.InterfaceC2245571Cup
    public final Aweme LIZLLL(String str) {
        RankData rankData;
        CandidateAdData candidateAdData = this.LIZIZ.LIZ.get(str);
        if (candidateAdData != null && (rankData = candidateAdData.getRankData()) != null) {
            return rankData.getOriginItem();
        }
        return null;
    }

    @Override // X.InterfaceC2245571Cup
    public final void LJ(boolean z) {
        List<Aweme> listFg;
        this.LJIIIIZZ = z;
        if (!z) {
            C1022620cia.LIZ("AdReRankImpl", "[updateReRankStatus] rerank end");
            InterfaceC1609890rzn interfaceC1609890rzn = this.LJ;
            if (interfaceC1609890rzn != null) {
                C1609880rzm c1609880rzm = (C1609880rzm) interfaceC1609890rzn;
                if (C2512709sz.LIZ || C1786206z6.LIZ()) {
                    int iLIZ = c1609880rzm.LIZ();
                    C0SR4 c0sr4 = c1609880rzm.LIZ.LLJL;
                    if (c0sr4 != null && (listFg = c0sr4.Fg()) != null && iLIZ <= listFg.size()) {
                        C1483340ohg.LJJIIZ(c1609880rzm.LIZ.Zc(), c1609880rzm.LIZ.getEventType(), listFg.subList(iLIZ, listFg.size()));
                    }
                }
            }
            ((IAdFastScrollService) ServiceManager.get().getService(IAdFastScrollService.class)).LIZLLL();
        }
    }

    public final boolean LJI(Aweme aweme) {
        BaseRankModel baseRankModel = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(aweme.getAid());
        if (baseRankModel != null && baseRankModel.getFeedStatus() == EnumC1159890gHz.SHOWN.getValue()) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(List<? extends Aweme> list) {
        Integer numValueOf;
        String aid;
        C2245321CuQ c2245321CuQ = C2245321CuQ.LIZ;
        EnumC2245291CuN enumC2245291CuN = EnumC2245291CuN.ON_LOAD_MORE;
        int iOrdinal = enumC2245291CuN.ordinal();
        InterfaceC1609890rzn interfaceC1609890rzn = this.LJ;
        Integer numValueOf2 = null;
        if (interfaceC1609890rzn != null) {
            numValueOf = Integer.valueOf(((C1609880rzm) interfaceC1609890rzn).LIZ());
        } else {
            numValueOf = null;
        }
        c2245321CuQ.getClass();
        C2245321CuQ.LJ(iOrdinal, numValueOf);
        if (!LJFF()) {
            int iOrdinal2 = enumC2245291CuN.ordinal();
            InterfaceC1609890rzn interfaceC1609890rzn2 = this.LJ;
            if (interfaceC1609890rzn2 != null) {
                numValueOf2 = Integer.valueOf(((C1609880rzm) interfaceC1609890rzn2).LIZ());
            }
            C2245321CuQ.LJI(iOrdinal2, numValueOf2, "rerank_disabled");
            return;
        }
        List<Aweme> listLLIIII = C13LP.LLIIII(list);
        C2245281CuM c2245281CuM = this.LIZIZ;
        c2245281CuM.getClass();
        c2245281CuM.LIZIZ = System.currentTimeMillis() / 1000;
        int i = 0;
        for (Aweme aweme : listLLIIII) {
            if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0 && !this.LJFF.containsKey(aweme.getAid())) {
                this.LJFF.put(aweme.getAid(), LJII(aweme, EnumC1159890gHz.UNSHOWN_ADJUSTABLE));
                if (aweme.isAd()) {
                    i++;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLoadMore] feed.size=");
        sbLIZ.append(listLLIIII.size());
        sbLIZ.append(", ad.size=");
        sbLIZ.append(i);
        C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJIJ(EnumC2245291CuN.ON_LOAD_MORE);
    }

    public final void LJIILJJIL(List<? extends Aweme> list) {
        String aid;
        Integer numValueOf;
        if (!LJFF()) {
            C2245321CuQ c2245321CuQ = C2245321CuQ.LIZ;
            int iOrdinal = EnumC2245291CuN.ON_SELECTED.ordinal();
            InterfaceC1609890rzn interfaceC1609890rzn = this.LJ;
            if (interfaceC1609890rzn != null) {
                numValueOf = Integer.valueOf(((C1609880rzm) interfaceC1609890rzn).LIZ());
            } else {
                numValueOf = null;
            }
            c2245321CuQ.getClass();
            C2245321CuQ.LJI(iOrdinal, numValueOf, "rerank_disabled");
            return;
        }
        List<Aweme> listLLIIII = C13LP.LLIIII(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onRefresh] size=");
        sbLIZ.append(listLLIIII.size());
        C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
        C2245281CuM c2245281CuM = this.LIZIZ;
        c2245281CuM.getClass();
        c2245281CuM.LIZIZ = System.currentTimeMillis() / 1000;
        C2245281CuM c2245281CuM2 = this.LIZIZ;
        synchronized (c2245281CuM2) {
            c2245281CuM2.LIZ.clear();
        }
        ((LinkedHashMap) this.LJFF).clear();
        this.LJIIJJI = -1;
        for (Aweme aweme : listLLIIII) {
            if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                this.LJFF.put(aweme.getAid(), LJII(aweme, EnumC1159890gHz.UNSHOWN_ADJUSTABLE));
                aweme.isAd();
            }
        }
        if (!listLLIIII.isEmpty()) {
            H4(0, (Aweme) ListProtector.get(listLLIIII, 0));
        }
    }

    public final void LJIILL(Aweme aweme) {
        Integer numValueOf;
        C2245321CuQ c2245321CuQ = C2245321CuQ.LIZ;
        EnumC2245291CuN enumC2245291CuN = EnumC2245291CuN.ON_COMPLETED_PLAY;
        int iOrdinal = enumC2245291CuN.ordinal();
        InterfaceC1609890rzn interfaceC1609890rzn = this.LJ;
        String aid = null;
        Integer numValueOf2 = null;
        if (interfaceC1609890rzn != null) {
            numValueOf = Integer.valueOf(((C1609880rzm) interfaceC1609890rzn).LIZ());
        } else {
            numValueOf = null;
        }
        c2245321CuQ.getClass();
        C2245321CuQ.LJ(iOrdinal, numValueOf);
        if (!LJFF()) {
            int iOrdinal2 = enumC2245291CuN.ordinal();
            InterfaceC1609890rzn interfaceC1609890rzn2 = this.LJ;
            if (interfaceC1609890rzn2 != null) {
                numValueOf2 = Integer.valueOf(((C1609880rzm) interfaceC1609890rzn2).LIZ());
            }
            C2245321CuQ.LJI(iOrdinal2, numValueOf2, "rerank_disabled");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onVideoPlayOver] aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (aweme != null) {
            LJIJ(enumC2245291CuN);
        }
    }

    public final void LJIJ(EnumC2245291CuN enumC2245291CuN) {
        boolean z;
        Gson gson = C1617880sCg.LIZ;
        List listLLIIII = C13LP.LLIIII(C1617880sCg.LIZ(this.LJ));
        int iLIZ = 0;
        if (listLLIIII != null && !listLLIIII.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Integer numValueOf = null;
        if (z) {
            C2245321CuQ c2245321CuQ = C2245321CuQ.LIZ;
            int iOrdinal = enumC2245291CuN.ordinal();
            InterfaceC1609890rzn interfaceC1609890rzn = this.LJ;
            if (interfaceC1609890rzn != null) {
                numValueOf = Integer.valueOf(((C1609880rzm) interfaceC1609890rzn).LIZ());
            }
            c2245321CuQ.getClass();
            C2245321CuQ.LJI(iOrdinal, numValueOf, "datasource_empty");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[submitReRankTask] scene=");
            sbLIZ.append(enumC2245291CuN.name());
            sbLIZ.append(", drop, reason=DATASOURCE_EMPTY, return.");
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LJIIJJI() && ((!((Boolean) this.LJJIFFI.getValue()).booleanValue() || enumC2245291CuN == EnumC2245291CuN.ON_GET_POSTROLL) && this.LJIIJ < this.LJIIJJI)) {
            C2245321CuQ c2245321CuQ2 = C2245321CuQ.LIZ;
            int iOrdinal2 = enumC2245291CuN.ordinal();
            InterfaceC1609890rzn interfaceC1609890rzn2 = this.LJ;
            if (interfaceC1609890rzn2 != null) {
                numValueOf = Integer.valueOf(((C1609880rzm) interfaceC1609890rzn2).LIZ());
            }
            c2245321CuQ2.getClass();
            C2245321CuQ.LJI(iOrdinal2, numValueOf, "next_video_shown");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[submitReRankTask] scene=");
            sbLIZ2.append(enumC2245291CuN.name());
            sbLIZ2.append(", drop, reason=NEXT_VIDEO_SHOWN, max=");
            sbLIZ2.append(this.LJIIJJI);
            sbLIZ2.append(", cur=");
            sbLIZ2.append(this.LJIIJ);
            sbLIZ2.append(", return.");
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        InterfaceC1609890rzn interfaceC1609890rzn3 = this.LJ;
        if (interfaceC1609890rzn3 != null) {
            iLIZ = ((C1609880rzm) interfaceC1609890rzn3).LIZ();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(C823050WQl.LJFF())), null, null, new C2245271CuL(enumC2245291CuN, iLIZ, this, listLLIIII, null), 3);
    }

    @Override // X.InterfaceC1603020roi
    public final void M4(List<? extends Aweme> list) {
        if (LJIIIZ()) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = new C2245591Cur(this, list);
            C312240CLu.LIZ(c0cm3);
            return;
        }
        LJIILJJIL(list);
    }

    @Override // X.InterfaceC1603020roi
    public final void P4(long j) {
        C1022620cia.LIZ("AdReRankImpl", "[onCandidateResponseError]");
        C2245631Cuv c2245631Cuv = this.LIZIZ.LJ;
        ExtraLastState extraLastState = new ExtraLastState(Long.valueOf(j), 2);
        if (c2245631Cuv.LIZ.size() >= 5) {
            c2245631Cuv.LIZ.removeFirst();
        }
        c2245631Cuv.LIZ.addLast(extraLastState);
    }

    @Override // X.InterfaceC1603020roi
    public final void V4(List<? extends Aweme> list) {
        if (LJIIIZ()) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = new C2245581Cuq(this, list);
            C312240CLu.LIZ(c0cm3);
            return;
        }
        LJIILIIL(list);
    }

    @Override // X.InterfaceC1603020roi
    public final void Z4(EnumC2245291CuN enumC2245291CuN) {
        Gson gson = C1617880sCg.LIZ;
        AwS435S0200000_34 awS435S0200000_34 = new AwS435S0200000_34(enumC2245291CuN, this, 12);
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            awS435S0200000_34.invoke();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3((Object) awS435S0200000_34, 149));
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void a5(String str) {
        if (str != null && (!a0.LJJJIL(str))) {
            this.LJI = str;
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void b5(Aweme aweme) {
        C2245641Cuw c2245641Cuw;
        if (aweme != null && (c2245641Cuw = this.LJIILIIL.LIZLLL) != null) {
            this.LJIILIIL = c2245641Cuw;
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void d5(String str) {
        C2245361CuU c2245361CuU = this.LIZJ;
        synchronized (c2245361CuU) {
            if (!c2245361CuU.LIZLLL) {
                return;
            }
            if (str != null && (!a0.LJJJIL(str))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[setPostRollSatiParamsForPitaya] params=");
                sbLIZ.append(str);
                C1022620cia.LIZ("PostRollAdManager", C2188811AlT.LIZIZ(sbLIZ));
                c2245361CuU.LIZIZ = str;
            }
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void e5(Aweme aweme) {
        if (LJIIIZ()) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = new AwS435S0200000_34(this, aweme, 13);
            C312240CLu.LIZ(c0cm3);
            return;
        }
        LJIILL(aweme);
    }

    @Override // X.InterfaceC1603020roi
    public final void f5(Aweme aweme) {
        if (LJFF() && !this.LJIIIIZZ && !C1030680cva.LJIIJJI(aweme) && aweme != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onAwemeDeleted] aid=");
            sbLIZ.append(aweme.getAid());
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
            if (((Boolean) this.LJJ.getValue()).booleanValue()) {
                String aid = aweme.getAid();
                if (aid != null && aid.length() != 0) {
                    this.LJFF.remove(aweme.getAid());
                    return;
                }
                return;
            }
            C1022620cia.LIZ("AdReRankImpl", "[resetData]");
            ((LinkedHashMap) this.LJFF).clear();
            this.LIZLLL = 0L;
            this.LJIIJJI = -1;
            C2487409ou.LIZ((Runnable) this.LJIIL.getValue());
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void H4(int i, Aweme aweme) {
        if (LJIIIZ()) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = new C2245661Cuy(this, i, aweme);
            C312240CLu.LIZ(c0cm3);
            return;
        }
        LJIILLIIL(i, aweme);
    }

    @Override // X.InterfaceC1603020roi
    public final void K4(int i, Aweme aweme) {
        synchronized (C2245381CuW.LIZ) {
            if (!aweme.isAd()) {
                return;
            }
            HashSet<String> hashSet = C2245381CuW.LIZLLL;
            if (hashSet.contains(aweme.getAid())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onAdShow] aid=");
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(", position=");
                sbLIZ.append(i);
                sbLIZ.append(", has shown, return");
                C1022620cia.LIZ("RerankShowTimeManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            hashSet.add(aweme.getAid());
            C2245701Cv2 c2245701Cv2 = C2245381CuW.LIZIZ;
            C2245701Cv2 c2245701Cv22 = C2245381CuW.LIZJ;
            c2245701Cv22.getClass();
            c2245701Cv2.getClass();
            c2245701Cv2.LIZ = c2245701Cv22.LIZ;
            aweme.getAid();
            C2245381CuW.LIZJ.LIZ = jCurrentTimeMillis;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[onAdShow] aid=");
            sbLIZ2.append(aweme.getAid());
            sbLIZ2.append(", position=");
            sbLIZ2.append(i);
            sbLIZ2.append(", lastShowAdTime=");
            sbLIZ2.append(jCurrentTimeMillis);
            sbLIZ2.append(", preLastShowAdTime=");
            sbLIZ2.append(C2245381CuW.LIZIZ.LIZ);
            C1022620cia.LIZ("RerankShowTimeManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final BaseRankModel LJII(Aweme aweme, EnumC1159890gHz enumC1159890gHz) {
        BaseRankModel baseRankModel = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(aweme.getAid());
        if (baseRankModel == null) {
            String aid = aweme.getAid();
            int value = enumC1159890gHz.getValue();
            FeedActionData feedActionData = new FeedActionData(0L);
            RankData.Companion.getClass();
            BaseRankModel baseRankModel2 = new BaseRankModel(aid, value, feedActionData, C2189331AmJ.LIZIZ(aweme));
            this.LJFF.put(aweme.getAid(), baseRankModel2);
            return baseRankModel2;
        }
        return baseRankModel;
    }

    public final void LJIIL(int i, Aweme aweme) {
        String string;
        String string2;
        String string3;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return;
        }
        Long adId = awemeRawAd.getAdId();
        if (adId != null) {
            string = adId.toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, this.LJIILIIL.LIZ)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onAdShow] pos=");
        sbLIZ.append(i);
        sbLIZ.append(", adid=");
        sbLIZ.append(awemeRawAd.getAdId());
        C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
        C2245641Cuw c2245641Cuw = new C2245641Cuw();
        Long creativeId = awemeRawAd.getCreativeId();
        String str = "";
        if (creativeId == null || (string2 = creativeId.toString()) == null) {
            string2 = "";
        }
        c2245641Cuw.LIZIZ = string2;
        Long adId2 = awemeRawAd.getAdId();
        if (adId2 != null && (string3 = adId2.toString()) != null) {
            str = string3;
        }
        c2245641Cuw.LIZ = str;
        c2245641Cuw.LIZJ = System.currentTimeMillis() / 1000;
        c2245641Cuw.LIZLLL = this.LJIILIIL;
        this.LJIILIIL = c2245641Cuw;
    }

    public final void LJIILLIIL(int i, Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onViewHolderSelected] position=");
        sbLIZ.append(i);
        sbLIZ.append(", aid=");
        Boolean boolValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", isAd=");
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.isAd());
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append('.');
        C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (aweme != null) {
            if (this.LJIIJ == i) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[onViewHolderSelected] position invalid, return! lastPos=");
                sbLIZ2.append(this.LJIIJ);
                sbLIZ2.append(", pos=");
                sbLIZ2.append(i);
                C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            C2245321CuQ c2245321CuQ = C2245321CuQ.LIZ;
            EnumC2245291CuN enumC2245291CuN = EnumC2245291CuN.ON_SELECTED;
            int iOrdinal = enumC2245291CuN.ordinal();
            Integer numValueOf = Integer.valueOf(i);
            c2245321CuQ.getClass();
            C2245321CuQ.LJ(iOrdinal, numValueOf);
            if (!LJFF()) {
                C2245321CuQ.LJI(enumC2245291CuN.ordinal(), Integer.valueOf(i), "rerank_disabled");
                return;
            }
            this.LJIIJ = i;
            if (this.LJIIJJI < i) {
                this.LJIIJJI = i;
            }
            if (!LJIIJJI() && LJI(aweme)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[onViewHolderSelected] video has showed, max=");
                sbLIZ3.append(this.LJIIJJI);
                sbLIZ3.append(", cur=");
                sbLIZ3.append(this.LJIIJ);
                sbLIZ3.append(", return!");
                C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (((Boolean) this.LJJII.getValue()).booleanValue()) {
                if (!LJIIJJI() || (LJIIJJI() && !LJI(aweme))) {
                    if (aweme.isAd()) {
                        LJIIL(i, aweme);
                    }
                    String aid2 = aweme.getAid();
                    if (aid2 != null && aid2.length() != 0) {
                        LJII(aweme, EnumC1159890gHz.UNSHOWN_ADJUSTABLE);
                        LJIJI(i, aweme);
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[onViewHolderSelected] rerankTriggerCheckShowOptimization=true, video has showed, max=");
                    sbLIZ4.append(this.LJIIJJI);
                    sbLIZ4.append(", cur=");
                    sbLIZ4.append(this.LJIIJ);
                    C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ4));
                }
            } else {
                if (aweme.isAd()) {
                    LJIIL(i, aweme);
                }
                String aid3 = aweme.getAid();
                if (aid3 != null && aid3.length() != 0) {
                    LJII(aweme, EnumC1159890gHz.UNSHOWN_ADJUSTABLE);
                    LJIJI(i, aweme);
                }
            }
            C2487409ou.LIZLLL(((Number) this.LJIJI.getValue()).longValue(), new Runnable() { // from class: X.1CuV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AdReRankImpl@8850.onViewHolderSelectedInternal$1$1");
                    try {
                        this.LL.LJIJ(EnumC2245291CuN.ON_SELECTED);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AdReRankImpl@8850.onViewHolderSelectedInternal$1$1");
                }
            });
        }
    }

    public final void LJIJI(int i, Aweme aweme) {
        String aid = aweme.getAid();
        if (aid != null && aid.length() != 0) {
            LJIIZILJ(this.LJFF, EnumC1159890gHz.SHOWN, aweme.getAid());
            Map<String, BaseRankModel> map = this.LJFF;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = jCurrentTimeMillis / j;
            String aid2 = aweme.getAid();
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            BaseRankModel baseRankModel = (BaseRankModel) linkedHashMap.get(aid2);
            if (baseRankModel != null) {
                linkedHashMap.put(aid2, new BaseRankModel(baseRankModel.getId(), baseRankModel.getFeedStatus(), new FeedActionData(j2), baseRankModel.getRankData()));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[updateBaseRankModel] aid=");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(", showtime=");
            sbLIZ.append(System.currentTimeMillis() / j);
            C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
            int iIntValue = ((Number) this.LJIJ.getValue()).intValue();
            for (int i2 = 1; i2 < iIntValue; i2++) {
                Map<String, BaseRankModel> map2 = this.LJFF;
                EnumC1159890gHz enumC1159890gHz = EnumC1159890gHz.UNSHOWN_NONADJUSTABLE;
                Gson gson = C1617880sCg.LIZ;
                List listLIZ = C1617880sCg.LIZ(this.LJ);
                int i3 = i + i2;
                if (i3 >= 0 && i3 < listLIZ.size()) {
                    Aweme aweme2 = (Aweme) ListProtector.get(listLIZ, i3);
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                    BaseRankModel baseRankModel2 = (BaseRankModel) linkedHashMap2.get(aweme2.getAid());
                    if (baseRankModel2 != null && Integer.valueOf(baseRankModel2.getFeedStatus()) != null && baseRankModel2.getFeedStatus() != EnumC1159890gHz.SHOWN.getValue()) {
                        LJIIZILJ(linkedHashMap2, enumC1159890gHz, aweme2.getAid());
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void O4(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        synchronized (C2245381CuW.LIZ) {
            if (!aweme.isAd()) {
                return;
            }
            HashSet<String> hashSet = C2245381CuW.LJFF;
            if (hashSet.contains(aweme.getAid())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onAdEndShow] aid=");
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(", position=");
                sbLIZ.append(i);
                sbLIZ.append(", has shown, return");
                C1022620cia.LIZ("RerankShowTimeManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            hashSet.add(aweme.getAid());
            C2245701Cv2 c2245701Cv2 = C2245381CuW.LJ;
            aweme.getAid();
            c2245701Cv2.getClass();
            C2245381CuW.LJ.LIZ = jCurrentTimeMillis;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[onAdEndShow] aid=");
            sbLIZ2.append(aweme.getAid());
            sbLIZ2.append(", position=");
            sbLIZ2.append(i);
            sbLIZ2.append(", lastAdEndShowTime=");
            sbLIZ2.append(jCurrentTimeMillis);
            C1022620cia.LIZ("RerankShowTimeManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void Y4(Aweme aweme, String str) {
        EnumC1159890gHz enumC1159890gHz;
        aweme.isAd();
        BaseRankModel baseRankModel = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(str);
        Integer numValueOf = null;
        if (baseRankModel != null && baseRankModel.getRankData().getRollAdData() == null) {
            RankData rankData = baseRankModel.getRankData();
            Integer numValueOf2 = Integer.valueOf(EnumC1159890gHz.UNSHOWN_ADJUSTABLE.getValue());
            FeedActionData feedActionData = new FeedActionData(0L);
            RankData.Companion.getClass();
            rankData.setRollAdData(new CorrespondPostRollAdData(numValueOf2, feedActionData, C2189331AmJ.LIZIZ(aweme)));
        }
        Map<String, BaseRankModel> map = this.LJFF;
        String aid = aweme.getAid();
        if (((Boolean) this.LJJIII.getValue()).booleanValue()) {
            enumC1159890gHz = EnumC1159890gHz.UNSHOWN_ADJUSTABLE;
        } else {
            enumC1159890gHz = EnumC1159890gHz.UNSHOWN_NONADJUSTABLE;
        }
        map.put(aid, LJII(aweme, enumC1159890gHz));
        BaseRankModel baseRankModel2 = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(aweme.getAid());
        if (baseRankModel2 != null) {
            if (!LJIIJ()) {
                numValueOf = Integer.valueOf(baseRankModel2.getFeedStatus());
            }
            PostRollAdData postRollAdData = new PostRollAdData(numValueOf, baseRankModel2.getRankData());
            postRollAdData.getRankData().setRollType(-1);
            this.LIZJ.LIZJ(postRollAdData);
        }
    }

    public static void LJIIZILJ(Map map, EnumC1159890gHz enumC1159890gHz, String str) {
        BaseRankModel baseRankModel = (BaseRankModel) map.get(str);
        if (baseRankModel != null) {
            map.put(str, new BaseRankModel(baseRankModel.getId(), enumC1159890gHz.getValue(), baseRankModel.getFeedActionData(), baseRankModel.getRankData()));
        }
    }

    @Override // X.InterfaceC1603020roi
    public final void Q4(long j, long j2, AwemeRawAd awemeRawAd) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendPostRollTimeCheckEvent] insertTime=");
        sbLIZ.append(j);
        sbLIZ.append(", duration=");
        sbLIZ.append(j2);
        C1022620cia.LIZ("AdReRankImpl", C2188811AlT.LIZIZ(sbLIZ));
        new C1AF2().logAd(C2246221Cvs.LIZ, awemeRawAd, new C2246211Cvr(j, j2));
    }

    @Override // X.InterfaceC1603020roi
    public final void c5(long j, String str, String str2) {
        Integer numValueOf;
        RankData rankData;
        CorrespondPostRollAdData rollAdData;
        BaseRankModel baseRankModel;
        RankData rankData2;
        if (str == null || str2 == null) {
            return;
        }
        BaseRankModel baseRankModel2 = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(str);
        if (baseRankModel2 != null && (rankData = baseRankModel2.getRankData()) != null && (rollAdData = rankData.getRollAdData()) != null && (baseRankModel = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(str)) != null && (rankData2 = baseRankModel.getRankData()) != null) {
            rankData2.setRollAdData(new CorrespondPostRollAdData(Integer.valueOf(EnumC1159890gHz.SHOWN.getValue()), new FeedActionData(j), rollAdData.getRankData()));
        }
        BaseRankModel baseRankModel3 = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(str2);
        if (baseRankModel3 != null) {
            this.LJFF.put(str2, new BaseRankModel(baseRankModel3.getId(), EnumC1159890gHz.SHOWN.getValue(), new FeedActionData(j), baseRankModel3.getRankData()));
        }
        BaseRankModel baseRankModel4 = (BaseRankModel) ((LinkedHashMap) this.LJFF).get(str2);
        if (baseRankModel4 != null) {
            if (LJIIJ()) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(baseRankModel4.getFeedStatus());
            }
            PostRollAdData postRollAdData = new PostRollAdData(numValueOf, baseRankModel4.getRankData());
            postRollAdData.getRankData().setRollType(-1);
            this.LIZJ.LIZJ(postRollAdData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af A[Catch: all -> 0x0192, TryCatch #0 {, blocks: (B:17:0x0083, B:19:0x008b, B:20:0x008d, B:23:0x009f, B:25:0x00af, B:26:0x00b4, B:29:0x00c4, B:30:0x00ce, B:32:0x00d4, B:34:0x00ee, B:36:0x0108, B:37:0x010c, B:39:0x0119, B:40:0x0122, B:42:0x0128, B:44:0x0130, B:48:0x014c, B:47:0x0142), top: B:60:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0192, TryCatch #0 {, blocks: (B:17:0x0083, B:19:0x008b, B:20:0x008d, B:23:0x009f, B:25:0x00af, B:26:0x00b4, B:29:0x00c4, B:30:0x00ce, B:32:0x00d4, B:34:0x00ee, B:36:0x0108, B:37:0x010c, B:39:0x0119, B:40:0x0122, B:42:0x0128, B:44:0x0130, B:48:0x014c, B:47:0x0142), top: B:60:0x0083 }] */
    @Override // X.InterfaceC1603020roi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h5(long r14, java.lang.String r16, java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2245331CuR.h5(long, java.lang.String, java.util.List):void");
    }
}
