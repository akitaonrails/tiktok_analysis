package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.outreach.dispersion.data.DispersionModel;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.feed.platform.popup.exp.FeedPopupManagerBugfixConfig;
import com.ss.android.ugc.feed.platform.popupclean.tool.PopupMonitorSetting;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20608915kd extends C09AY implements Function0<C20651515rV> {
    public C20608915kd() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15rV] */
    @Override // kotlin.jvm.functions.Function0
    public final C20651515rV invoke() {
        return new AbstractC20651615rW() { // from class: X.15rV
            public final C20625715nL LIZJ = new C20625715nL();
            public final C20625615nK LIZLLL = new C20625615nK();
            public final ExecutorService LJ;
            public final boolean LJFF;
            public final C14M0 LJI;
            public final C01GW LJII;
            public final C20656315sH LJIIIIZZ;
            public final C20647715qt LJIIIZ;

            @Override // X.AbstractC20651615rW
            public final Function2<String, String, Unit> LIZ() {
                if (((Boolean) C266060Abk.LIZ.getValue()).booleanValue()) {
                    return AFwS319S0000000_31.get$arr$(22);
                }
                return null;
            }

            @Override // X.AbstractC20651615rW
            public final Function1<String, Unit> LIZIZ() {
                if (((Boolean) C266060Abk.LIZ.getValue()).booleanValue()) {
                    return AFwS276S0000000_31.get$arr$(151);
                }
                return null;
            }

            @Override // X.AbstractC20651615rW
            public final boolean LIZJ() {
                return ((Boolean) C266060Abk.LIZ.getValue()).booleanValue();
            }

            @Override // X.AbstractC20651615rW
            public final JSONObject LJII() {
                return (JSONObject) this.LJII.getValue();
            }

            @Override // X.AbstractC20651615rW
            public final void LJIIJJI() {
                C20650415rK.LIZ.getClass();
                DispersionModel dispersionModelLIZ = C20650415rK.LIZ();
                if ((dispersionModelLIZ != null ? dispersionModelLIZ.outreachDispersionExpValue : 0) > 0 && C282000B3m.LIZ()) {
                    C1590630rUj.LIZ = C20650415rK.LJ;
                    PopupManager.LJII = new InterfaceC20659115sj() { // from class: X.15qp
                        @Override // X.InterfaceC20659115sj
                        public final boolean LIZ(AbstractC20656215sG abstractC20656215sG) {
                            C19EG c19eg;
                            Object obj;
                            Object obj2;
                            FeedFragment feedFragmentUx;
                            Aweme aweme;
                            C20647415qq.LIZ.getClass();
                            Activity activityLIZ = C2421209eE.LIZ();
                            String strLJIIZILJ = null;
                            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                                if (abstractC1387200mCcLJ != null) {
                                    obj = abstractC1387200mCcLJ.LIZ;
                                } else {
                                    obj = null;
                                }
                                if (obj instanceof InterfaceC1711206n0) {
                                    if (C486860J7k.LIZIZ(c19eg).FQ2("page_feed")) {
                                        C128Y c128yDQ2 = C343710Ddh.LIZ(c19eg).DQ2();
                                        if ((c128yDQ2 instanceof InterfaceC1593630rZZ) && (feedFragmentUx = ((InterfaceC1593630rZZ) c128yDQ2).ux()) != null && ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJIIZ(feedFragmentUx) && (aweme = C680080Qly.LIZIZ(c19eg).LLJILJILJ) != null) {
                                            strLJIIZILJ = aweme.getGroupId();
                                        }
                                    }
                                } else {
                                    DetailFeedService detailFeedService = (DetailFeedService) ServiceManager.get().getService(DetailFeedService.class);
                                    AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                                    if (abstractC1387200mCcLJ2 != null) {
                                        obj2 = abstractC1387200mCcLJ2.LIZ;
                                    } else {
                                        obj2 = null;
                                    }
                                    Fragment fragmentLJFF = detailFeedService.LJFF(obj2);
                                    if (fragmentLJFF != null) {
                                        C20571715ed.LIZ.getClass();
                                        if (C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(fragmentLJFF)) {
                                            strLJIIZILJ = detailFeedService.LJIIZILJ(obj2);
                                        }
                                    }
                                }
                            }
                            String typeName = EnumC20654715s1.POPUP.getTypeName();
                            String str = abstractC20656215sG.elementLabel;
                            String str2 = abstractC20656215sG.triggerId;
                            C20648315qz c20648315qz = C20648315qz.LIZ;
                            Date date = new Date(System.currentTimeMillis());
                            c20648315qz.getClass();
                            OutreachRecordData outreachRecordData = new OutreachRecordData(typeName, str, str2, "", C20648315qz.LJI(date), C20648315qz.LJFF, "");
                            outreachRecordData.setGroupId(strLJIIZILJ);
                            C1593900ra0.LIZ.getClass();
                            C1593900ra0.LIZJ(outreachRecordData);
                            C20647815qu.LIZ.getClass();
                            return C20647815qu.LJ(outreachRecordData, true).LIZ();
                        }

                        @Override // X.InterfaceC20659115sj
                        public final void LIZIZ(String str, String str2, boolean z) {
                            if (str == null) {
                                C20571715ed.LIZ.getClass();
                                return;
                            }
                            C20647815qu.LIZ.getClass();
                            if (C282000B3m.LIZ()) {
                                try {
                                    C20571715ed c20571715ed = C20571715ed.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("checkRestoreQuota, key:");
                                    sbLIZ.append(str);
                                    sbLIZ.append(", triggerId:");
                                    sbLIZ.append(str2);
                                    sbLIZ.append(", show:");
                                    sbLIZ.append(z);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c20571715ed.getClass();
                                    C20648715r3.LIZ.getClass();
                                    OutreachRecordData outreachRecordDataLIZJ = C20648715r3.LIZJ(str, str2);
                                    if (outreachRecordDataLIZJ == null) {
                                        C20571715ed.LIZ("checkRestoreQuota, record is null");
                                        return;
                                    }
                                    if (z) {
                                        outreachRecordDataLIZJ.setShowTimeMiles(Long.valueOf(System.currentTimeMillis()));
                                        return;
                                    }
                                    if (C20646815qk.LIZ(outreachRecordDataLIZJ.getShowTimeMiles())) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("restoreQuota: ");
                                        sbLIZ2.append(str);
                                        sbLIZ2.append(", ");
                                        sbLIZ2.append(str2);
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                        ArrayList<C20648515r1> updateQuotaRuleList = outreachRecordDataLIZJ.getUpdateQuotaRuleList();
                                        if (updateQuotaRuleList != null) {
                                            for (C20648515r1 c20648515r1 : updateQuotaRuleList) {
                                                C20571715ed c20571715ed2 = C20571715ed.LIZ;
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("restore quota, rule: ");
                                                sbLIZ3.append(c20648515r1.LIZ);
                                                sbLIZ3.append(", elementId: ");
                                                sbLIZ3.append(str);
                                                sbLIZ3.append(", triggerId: ");
                                                sbLIZ3.append(str2);
                                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                                c20571715ed2.getClass();
                                                C20571715ed.LIZ(strLIZIZ);
                                                int i = c20648515r1.LJII;
                                                if (i < c20648515r1.LJI) {
                                                    c20648515r1.LJII = i + 1;
                                                    for (OutreachRecordData outreachRecordData : c20648515r1.LJIIIIZZ) {
                                                        if (Intrinsics.LJFF(outreachRecordData.getKey(), outreachRecordDataLIZJ.getKey()) && Intrinsics.LJFF(outreachRecordData.getTriggerId(), outreachRecordDataLIZJ.getTriggerId())) {
                                                            c20648515r1.LJIIIIZZ.remove(outreachRecordData);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C20648715r3.LIZ.getClass();
                                        C20648715r3.LJFF(outreachRecordDataLIZJ);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1AF0.LJFF(e, "dispersion manager exception");
                                }
                            }
                        }
                    };
                }
                if (C314160CTe.LIZ() != 0) {
                    PopupManager.LJIIJJI = new InterfaceC20655315s7() { // from class: X.15sa
                        /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
                        /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
                        @Override // X.InterfaceC20655315s7
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean filterTask(X.C688120Qyw r11, X.AbstractC20656215sG r12, java.lang.String r13, X.InterfaceC20658115sZ r14) {
                            /*
                                Method dump skipped, instruction units count: 592
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C20658215sa.filterTask(X.0Qyw, X.15sG, java.lang.String, X.15sZ):boolean");
                        }
                    };
                }
                PopupManager.LJIIL = true;
                if (((FeedPopupManagerBugfixConfig) C20653315rn.LIZIZ.getValue()).enableOptimizedObserver) {
                    PopupManager.LJIILIIL = true;
                }
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [X.15sH] */
            /* JADX WARN: Type inference failed for: r0v13, types: [X.15qt] */
            {
                C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
                c2123408To.LIZIZ = "popup_task_thread";
                c2123408To.LIZJ = 3;
                this.LJ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
                this.LJFF = !C1835007Gq.LIZ();
                this.LJI = new C14M0();
                this.LJII = C452501pT.LIZIZ(new C20251714Lz());
                this.LJIIIIZZ = new InterfaceC20658115sZ() { // from class: X.15sH
                    public final C20652615rg LIZ = new C20652615rg("PopupConfigTask");

                    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
                    @Override // X.InterfaceC20658115sZ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(X.AbstractC20656215sG r18) {
                        /*
                            Method dump skipped, instruction units count: 476
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C20656315sH.LIZIZ(X.15sG):void");
                    }

                    @Override // X.InterfaceC20658115sZ
                    public final void LIZJ(AbstractC20656215sG abstractC20656215sG) {
                        String strValue;
                        C0T87 popupExtraParams;
                        String str;
                        C0T87 popupExtraParams2;
                        FeedCommonService feedCommonService = (FeedCommonService) ServiceManager.get().getService(FeedCommonService.class);
                        InterfaceC20647615qs interfaceC20647615qs = (InterfaceC20647615qs) abstractC20656215sG.getClass().getAnnotation(InterfaceC20647615qs.class);
                        String str2 = "";
                        if (interfaceC20647615qs == null || (strValue = interfaceC20647615qs.value()) == null) {
                            strValue = "";
                        }
                        if (Intrinsics.LJFF(strValue, "global_shop_tab_tooltip")) {
                            C1440005kM.LIZ(new C1619150sEj(1));
                        }
                        EnumC1202290hON popupType = abstractC20656215sG.getPopupType();
                        EnumC1202290hON enumC1202290hON = EnumC1202290hON.CONTAINER;
                        if (popupType == enumC1202290hON && ((popupExtraParams2 = abstractC20656215sG.getPopupExtraParams()) == null || (strValue = popupExtraParams2.LIZ) == null)) {
                            strValue = "";
                        }
                        PopupMonitorSetting.PopupMonitorData popupMonitorData = (PopupMonitorSetting.PopupMonitorData) PopupMonitorSetting.LIZ.getValue();
                        if (popupMonitorData != null && popupMonitorData.enable) {
                            C20656415sI.LIZ.getClass();
                            C20656415sI.LIZIZ(strValue, false);
                            C20656415sI.LIZ(strValue);
                        }
                        InterfaceC20658015sY interfaceC20658015sY = abstractC20656215sG.scene;
                        if (interfaceC20658015sY != null) {
                            interfaceC20658015sY.getSceneId();
                        }
                        feedCommonService.LJIILLIIL();
                        InterfaceC20658015sY interfaceC20658015sY2 = abstractC20656215sG.scene;
                        if (interfaceC20658015sY2 != null) {
                            interfaceC20658015sY2.getSceneId();
                        }
                        feedCommonService.LJJIIJZLJL();
                        if (abstractC20656215sG.getPopupType() == enumC1202290hON && (popupExtraParams = abstractC20656215sG.getPopupExtraParams()) != null && (str = popupExtraParams.LIZ) != null) {
                            str2 = str;
                        }
                        C20652615rg c20652615rg = this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("popupDismissed:");
                        sbLIZ.append(strValue);
                        sbLIZ.append(",sceneId:");
                        sbLIZ.append(abstractC20656215sG.scene.getSceneId());
                        sbLIZ.append(",contentId:");
                        sbLIZ.append(str2);
                        c20652615rg.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
                    @Override // X.InterfaceC20658115sZ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.AbstractC20656215sG r6, int r7, java.lang.String r8) {
                        /*
                            Method dump skipped, instruction units count: 243
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C20656315sH.LIZ(X.15sG, int, java.lang.String):void");
                    }
                };
                this.LJIIIZ = new InterfaceC20655515s9() { // from class: X.15qt
                    @Override // X.InterfaceC20655515s9
                    public final void LIZ(AbstractC20656215sG abstractC20656215sG, long j) {
                        if (abstractC20656215sG.elementLabel.length() != 0 && abstractC20656215sG.triggerId.length() != 0) {
                            C849850XVn.LIZIZ.LIZJ().LJIILLIIL(j, abstractC20656215sG.elementLabel, abstractC20656215sG.triggerId);
                        }
                    }

                    @Override // X.InterfaceC20655515s9
                    public final void LIZIZ(AbstractC20656215sG abstractC20656215sG, C688120Qyw c688120Qyw, String str) {
                        if (abstractC20656215sG.elementLabel.length() != 0 && abstractC20656215sG.triggerId.length() != 0) {
                            C849850XVn.LIZIZ.LIZJ().LJJI(new C1390700mIG(abstractC20656215sG.elementLabel, abstractC20656215sG.triggerId, str), c688120Qyw.LIZ);
                        }
                    }
                };
            }

            @Override // X.AbstractC20651615rW
            public final ExecutorService LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC20651615rW
            public final C20625715nL LJ() {
                return this.LIZJ;
            }

            @Override // X.AbstractC20651615rW
            public final C20625615nK LJFF() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC20651615rW
            public final Function2<String, HashMap<String, String>, Unit> LJI() {
                return this.LJI;
            }

            @Override // X.AbstractC20651615rW
            public final InterfaceC20658115sZ LJIIIIZZ() {
                return this.LJIIIIZZ;
            }

            @Override // X.AbstractC20651615rW
            public final InterfaceC20655515s9 LJIIIZ() {
                return this.LJIIIZ;
            }

            @Override // X.AbstractC20651615rW
            public final boolean LJIIJ() {
                return this.LJFF;
            }
        };
    }
}
