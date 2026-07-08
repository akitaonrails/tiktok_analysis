package X;

import Y.ARunnableS35S0201000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.fetch.OutreachCategoryParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.report.IOutreachFlowReport;
import com.ss.android.ugc.feed.platform.popup.dynamic.DynamicPopup;
import com.ss.android.ugc.feed.platform.popup.dynamic.DynamicPopupInfo;
import com.ss.android.ugc.feed.platform.popup.exp.DynamicPopupExp;
import com.ss.android.ugc.feed.platform.popup.exp.FeedDynamicPopupMonitorConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20588615hM {
    public static final C20588615hM LIZ = new C20588615hM();
    public static final C20645015qS LIZIZ = new AbstractC637050Oyl() { // from class: X.15qS
        @Override // X.AbstractC637050Oyl
        public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
            String str2;
            String str3;
            int i;
            final C20645815qa c20645815qa;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFetchTimingResult: timing: ");
            sbLIZ.append(str);
            sbLIZ.append(", errorCode=");
            sbLIZ.append(c20554115bn.LIZ);
            sbLIZ.append(", logId=");
            sbLIZ.append(c20554115bn.LIZJ);
            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (c20554115bn.LIZ != 0) {
                return;
            }
            try {
                C1227904rF.LIZ.getClass();
                DynamicPopup dynamicPopup = (DynamicPopup) C1227904rF.LIZLLL().LIZJ(nVar, DynamicPopup.class);
                if (dynamicPopup != null) {
                    List<DynamicPopupInfo> list = dynamicPopup.showDynamicPopupList;
                    if (list != null && !list.isEmpty()) {
                        final int i2 = 0;
                        for (DynamicPopupInfo dynamicPopupInfo : dynamicPopup.showDynamicPopupList) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                DynamicPopupInfo dynamicPopupInfo2 = dynamicPopupInfo;
                                String str4 = dynamicPopupInfo2.popupKey;
                                if (str4 != null && str4.length() != 0 && (str2 = dynamicPopupInfo2.triggerId) != null && str2.length() != 0 && (str3 = dynamicPopupInfo2.geckoSchema) != null && str3.length() != 0) {
                                    C01GW c01gw = C204730159c.LIZ;
                                    DynamicPopupExp dynamicPopupExp = (DynamicPopupExp) c01gw.getValue();
                                    int i4 = 5;
                                    if (dynamicPopupExp != null) {
                                        i = dynamicPopupExp.maxFetchPopupCount;
                                    } else {
                                        i = 5;
                                    }
                                    if (i2 >= i) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("onFetchTimingResult: too much popup, index=");
                                        sbLIZ2.append(i2);
                                        sbLIZ2.append(", max=");
                                        DynamicPopupExp dynamicPopupExp2 = (DynamicPopupExp) c01gw.getValue();
                                        if (dynamicPopupExp2 != null) {
                                            i4 = dynamicPopupExp2.maxFetchPopupCount;
                                        }
                                        sbLIZ2.append(i4);
                                        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                        C1877490yxP c1877490yxP = C1877490yxP.LIZ;
                                        EnumC20645715qZ enumC20645715qZ = EnumC20645715qZ.FETCH;
                                        String str5 = dynamicPopupInfo2.popupKey;
                                        String str6 = dynamicPopupInfo2.triggerId;
                                        String str7 = c20554115bn.LIZJ;
                                        c1877490yxP.getClass();
                                        C1877490yxP.LIZ(enumC20645715qZ, "too_much_popup", str5, str6, str, null, str7);
                                    } else {
                                        String str8 = dynamicPopupInfo2.popupKey;
                                        String str9 = "";
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        String str10 = dynamicPopupInfo2.triggerId;
                                        if (str10 != null) {
                                            str9 = str10;
                                        }
                                        if (((FeedDynamicPopupMonitorConfig) C20646215qe.LIZIZ.getValue()).enableFunnel) {
                                            c20645815qa = new C20645815qa(str8, str9);
                                            c20645815qa.LIZJ = str;
                                            c20645815qa.LIZLLL = c20554115bn.LIZJ;
                                            EnumC20645715qZ enumC20645715qZ2 = EnumC20645715qZ.REQUEST;
                                            long j = c20554115bn.LIZLLL;
                                            c20645815qa.LJI = enumC20645715qZ2;
                                            c20645815qa.LJ = j;
                                            c20645815qa.LJII = j;
                                        } else {
                                            c20645815qa = null;
                                        }
                                        dynamicPopupInfo2.LIZ = str;
                                        C1877490yxP.LIZ.getClass();
                                        C1877490yxP.LIZJ("client_receive", dynamicPopupInfo2);
                                        if (c20645815qa != null) {
                                            C20645815qa.LIZ(c20645815qa, EnumC20645715qZ.FETCH, EnumC20645615qY.ON_FETCH_CALLBACK);
                                        }
                                        String str11 = dynamicPopupInfo2.triggerTiming;
                                        if (str11 != null && str11.length() != 0) {
                                            C23250099c.LIZLLL(C1303570k1j.LIZ, null, null, new C20644715qP(dynamicPopupInfo2, null), 3);
                                        } else {
                                            C20588615hM.LIZ.getClass();
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("triggerImmediately: info=");
                                            sbLIZ3.append(dynamicPopupInfo2.LIZ());
                                            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                            new C20644815qQ(dynamicPopupInfo2, c20645815qa).LIZLLL(new InterfaceC20646115qd() { // from class: X.15qc
                                                @Override // X.InterfaceC20646115qd
                                                public final void LIZIZ() {
                                                }

                                                @Override // X.InterfaceC20646115qd
                                                public final void LIZ(C20644815qQ c20644815qQ) {
                                                    C0CAU.LIZIZ(new ARunnableS35S0201000_31(i2, c20645815qa, c20644815qQ, 6));
                                                }
                                            });
                                        }
                                    }
                                } else {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("onFetchTimingResult: invalid info=");
                                    sbLIZ4.append(dynamicPopupInfo2.LIZ());
                                    C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                    C1877490yxP c1877490yxP2 = C1877490yxP.LIZ;
                                    EnumC20645715qZ enumC20645715qZ3 = EnumC20645715qZ.FETCH;
                                    String str12 = c20554115bn.LIZJ;
                                    c1877490yxP2.getClass();
                                    C1877490yxP.LIZ(enumC20645715qZ3, "invalid_info", null, null, str, null, str12);
                                }
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        return;
                    }
                    C20589415hU.LIZIZ("onFetchTimingResult: list is empty");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1720106oR.LIZIZ("FeedPopupLog", "onFetchTimingResult error", th);
                C1877490yxP c1877490yxP3 = C1877490yxP.LIZ;
                EnumC20645715qZ enumC20645715qZ4 = EnumC20645715qZ.FETCH;
                String str13 = c20554115bn.LIZJ;
                c1877490yxP3.getClass();
                C1877490yxP.LIZ(enumC20645715qZ4, "parse_error", null, null, str, null, str13);
                C805380Via.LIZJ(th, "DynamicPopupLog");
            }
        }
    };
    public static final C20644615qO LIZJ = new InterfaceC1273504yb() { // from class: X.15qO
        @Override // X.InterfaceC1273504yb
        public final void ac(String str, Map<String, Object> map) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTriggerTimingResult: timing: ");
            sbLIZ.append(str);
            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            C054G c054g = C1303570k1j.LIZ;
            ArrayList arrayList = new ArrayList();
            C1303560k1i c1303560k1i = C1303570k1j.LIZIZ;
            synchronized (c1303560k1i) {
                try {
                    for (Map.Entry<C20644415qM, C20644815qQ> entry : c1303560k1i.snapshot().entrySet()) {
                        C20644415qM c20644415qMLIZ = C20644515qN.LIZ(entry.getValue().LIZ);
                        if (c20644415qMLIZ == null) {
                            C20589415hU.LIZIZ("getManagerList: key is null");
                        } else if (Intrinsics.LJFF(entry.getValue().LIZ.triggerTiming, str)) {
                            arrayList.add(C1303570k1j.LIZIZ.remove(c20644415qMLIZ));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (arrayList.isEmpty()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onTriggerTimingResult: list is empty. timing=");
                sbLIZ2.append(str);
                C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    C0CAU.LIZIZ(new ARunnableS35S0201000_31(i, null, (C20644815qQ) obj, 6));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    };
    public static final C20585815gu LIZLLL = new AbstractC637410OzL() { // from class: X.15gu
        @Override // X.AbstractC637410OzL
        public final OutreachCategoryParams LIZ() {
            String strLJIILL;
            IOutreachFlowReport iOutreachFlowReport;
            C20588615hM.LIZ.getClass();
            try {
                iOutreachFlowReport = (IOutreachFlowReport) PluggableExtentionKt.pluggableSpi$default(IOutreachFlowReport.class, false, false, false, 14, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1720106oR.LIZIZ("FeedPopupLog", "DynamicPopupLog", e);
            }
            if (iOutreachFlowReport != null) {
                C1227904rF.LIZ.getClass();
                strLJIILL = new Gson().LJIILL(C2097608Jq.LJIIJ(new Pair("unrepored_outreach_info_list", C1227904rF.LIZLLL().LJIILL(iOutreachFlowReport.LIZ()))));
                strLJIILL.toString();
            } else {
                strLJIILL = null;
            }
            return new OutreachCategoryParams(strLJIILL, null);
        }
    };
    public static boolean LJ;
    public static boolean LJFF;
}
