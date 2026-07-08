package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.wallet.viewmodel.recharge.RechargeDialogVM;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ycy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864820ycy implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws Throwable {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
            case 2:
                mh2$2(this, c262100zr);
                break;
            case 3:
                mh2$3(this, c262100zr);
                break;
            case 4:
                mh2$4(this, c262100zr);
                break;
            case 5:
                mh2$5(this, c262100zr);
                break;
            case 6:
                mh2$6(this, c262100zr);
                break;
        }
    }

    public C1864820ycy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C1864820ycy c1864820ycy, C262100zr c262100zr) {
        RankPageController rankPageControllerRR;
        int iLIZLLL;
        int iLIZLLL2;
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        int iLIZLLL3;
        String strLJFF;
        InterfaceC1871920yoQ interfaceC1871920yoQLIZ;
        int iLIZLLL4;
        int iLIZLLL5;
        int size;
        Object objLJII;
        RankPageController rankPageControllerRR2;
        RankRootController rankRootController;
        boolean z;
        boolean z2;
        String strLJFF2;
        RankListFragment rankListFragment = (RankListFragment) c1864820ycy.l0;
        rankListFragment.getClass();
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttlive_anchor_ranking_click_cell_event") && rankListFragment.LLILZIL != null && rankListFragment.RR() != null && (rankPageControllerRR = rankListFragment.RR()) != null && rankPageControllerRR.LLILZLL != null && rankListFragment.Fn()) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "rank_type", -1);
            } else {
                iLIZLLL = -1;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                iLIZLLL2 = C1871910yoP.LIZLLL(interfaceC1107590evd2, "related_rank_type", -1);
            } else {
                iLIZLLL2 = -1;
            }
            RankListController rankListController = rankListFragment.LLILZIL;
            if (rankListController != null && (c1810410xDD = rankListController.LLILLL) != null && (rankTypeV2 = c1810410xDD.LIZIZ) != null && iLIZLLL2 == rankTypeV2.type) {
                boolean z3 = C1105900esu.LIZIZ;
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (Math.abs(jUptimeMillis - C1105900esu.LIZ) >= 1200) {
                    C1105900esu.LIZ = jUptimeMillis;
                    InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd3 != null) {
                        iLIZLLL3 = C1871910yoP.LIZLLL(interfaceC1107590evd3, "rank_period", 0);
                    } else {
                        iLIZLLL3 = 0;
                    }
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    String str = "";
                    if (interfaceC1107590evd4 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd4, "rank_info", "")) == null) {
                        strLJFF = "";
                    }
                    InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                    Object obj = null;
                    if (interfaceC1107590evd5 != null) {
                        interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evd5, "room_ids", null);
                    } else {
                        interfaceC1871920yoQLIZ = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 != null) {
                        iLIZLLL4 = C1871910yoP.LIZLLL(interfaceC1107590evd6, "anchor_rank", 0);
                    } else {
                        iLIZLLL4 = 0;
                    }
                    InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd7 != null) {
                        iLIZLLL5 = C1871910yoP.LIZLLL(interfaceC1107590evd7, "list_type", 0);
                    } else {
                        iLIZLLL5 = 0;
                    }
                    InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd8 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd8, "current_user_id", "")) != null) {
                        str = strLJFF2;
                    }
                    long jLIZIZ = C0IZJ.LIZIZ(str);
                    if (interfaceC1871920yoQLIZ != null) {
                        size = interfaceC1871920yoQLIZ.size();
                    } else {
                        size = 0;
                    }
                    long[] jArr = new long[size];
                    try {
                        if (!TextUtils.isEmpty(strLJFF)) {
                            objLJII = C19748512Ol.LIZJ.LJII(strLJFF, RankListV2Response.RankInfo.class);
                        } else {
                            objLJII = null;
                        }
                        if (interfaceC1871920yoQLIZ != null) {
                            try {
                                int size2 = interfaceC1871920yoQLIZ.size();
                                for (int i = 0; i < size2; i++) {
                                    jArr[i] = C0IZJ.LIZIZ(interfaceC1871920yoQLIZ.getString(i));
                                }
                                obj = Unit.LIZ;
                            } catch (Throwable th) {
                                th = th;
                                obj = objLJII;
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                objLJII = obj;
                            }
                        }
                        C189200o6.m2constructorimpl(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) objLJII;
                    if (rankInfo != null && (rankPageControllerRR2 = rankListFragment.RR()) != null && (rankRootController = rankPageControllerRR2.LLILZLL) != null) {
                        EnumC1811400xEo enumC1811400xEo = rankListFragment.LLILLL.LIZ;
                        if (iLIZLLL3 == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C1810410xDD c1810410xDD2 = new C1810410xDD(enumC1811400xEo, iLIZLLL, iLIZLLL2, iLIZLLL2, z);
                        long j = iLIZLLL4;
                        if (iLIZLLL5 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        rankRootController.LJIIIIZZ(rankInfo, new C1790680whO(c1810410xDD2, jArr, null, jLIZIZ, j, z2, true));
                    }
                }
            }
        }
    }

    public static final void mh2$1(C1864820ycy c1864820ycy, C262100zr c262100zr) {
        InterfaceC1805160x4k interfaceC1805160x4k = ((RechargeDialogVM) c1864820ycy.l0).LLILLJJLI;
        if (interfaceC1805160x4k != null) {
            interfaceC1805160x4k.dismiss();
        }
    }

    public static final void mh2$2(C1864820ycy c1864820ycy, C262100zr c262100zr) {
        C1805950x61 c1805950x61LIZ = C1805500x5I.LIZ(c262100zr);
        C1805940x60 c1805940x60 = ((C1805720x5e) c1864820ycy.l0).LIZIZ;
        c1805940x60.getClass();
        if (c1805950x61LIZ.LIZIZ) {
            c1805940x60.LIZ.setValue(c1805950x61LIZ.LIZLLL);
        }
        C786410Ut5.LJZL(8, ((C1805720x5e) c1864820ycy.l0).LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: all -> 0x0072, PHI: r1
      0x0063: PHI (r1v30 webcast.api.ranklist_class.LeagueMatchBannerInfo) = (r1v28 webcast.api.ranklist_class.LeagueMatchBannerInfo), (r1v31 webcast.api.ranklist_class.LeagueMatchBannerInfo) binds: [B:25:0x0061, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0072, blocks: (B:12:0x0033, B:14:0x0039, B:16:0x0041, B:18:0x0047, B:19:0x004b, B:21:0x0055, B:26:0x0063, B:27:0x0065, B:29:0x0069, B:30:0x006e, B:23:0x0059), top: B:121:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void mh2$3(X.C1864820ycy r15, X.C262100zr r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1864820ycy.mh2$3(X.0ycy, X.00zr):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void mh2$4(C1864820ycy c1864820ycy, C262100zr c262100zr) {
        String string;
        String string2;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null || (string = interfaceC1107590evd.getString("action")) == null) {
            string = "";
        }
        Integer numValueOf = null;
        if (interfaceC1107590evd != null) {
            string2 = interfaceC1107590evd.getString("gift_id");
            numValueOf = Integer.valueOf(interfaceC1107590evd.getInt("max_amount"));
        } else {
            string2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kycAnnualLimitJsbEventSubscriber.onReceiveJsEvent: action=");
        sbLIZ.append(string);
        sbLIZ.append(", gift_id=");
        sbLIZ.append(string2);
        sbLIZ.append(", max_amount=");
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("KycPopupPageJsbEventListener", C2188811AlT.LIZIZ(sbLIZ));
        C1805920x5y c1805920x5y = (C1805920x5y) c1864820ycy.l0;
        c1805920x5y.getClass();
        switch (string.hashCode()) {
            case -1573402998:
                if (string.equals("view_gift")) {
                    if (string2 == null) {
                        return;
                    }
                    c1805920x5y.LIZ.LJ(string2);
                    return;
                }
                break;
            case -1032684016:
                if (string.equals("verify_now")) {
                    c1805920x5y.LIZ.LIZJ();
                    return;
                }
                break;
            case -349896467:
                if (string.equals("kyc_recharge_limit")) {
                    if (numValueOf == null || numValueOf.intValue() < 0) {
                        return;
                    }
                    c1805920x5y.LIZ.LIZIZ(numValueOf.intValue());
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    c1805920x5y.LIZ.LJFF();
                    return;
                }
                break;
            case 1503711039:
                if (string.equals("continue_recharge")) {
                    c1805920x5y.LIZ.LJI();
                    return;
                }
                break;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleKycAnnualLimitJsbEvent NOTREACHED action=");
        sbLIZ2.append(string);
        C20441214yg.LIZIZ("KycPopupPageJsbEventListener", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void mh2$5(C1864820ycy c1864820ycy, C262100zr c262100zr) {
        String string;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null || (string = interfaceC1107590evd.getString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) == null) {
            string = "canceled";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pipoKycEventSubscriber.onReceiveJsEvent: status=");
        sbLIZ.append(string);
        C20441214yg.LIZIZ("KycPopupPageJsbEventListener", C2188811AlT.LIZIZ(sbLIZ));
        C1805920x5y c1805920x5y = (C1805920x5y) c1864820ycy.l0;
        c1805920x5y.getClass();
        if (Intrinsics.LJFF(string, "submitted")) {
            c1805920x5y.LIZ.LIZLLL();
            return;
        }
        if (Intrinsics.LJFF(string, "canceled")) {
            c1805920x5y.LIZ.LIZ();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handlePipoKycJsbEvent NOTREACHED status=");
        sbLIZ2.append(string);
        C20441214yg.LIZIZ("KycPopupPageJsbEventListener", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void mh2$6(C1864820ycy c1864820ycy, C262100zr c262100zr) {
        Object c098200Yq;
        try {
            InterfaceC1806230x6T interfaceC1806230x6T = ((C1803430x1x) c1864820ycy.l0).LIZIZ;
            if (interfaceC1806230x6T != null) {
                interfaceC1806230x6T.onSuccess(-1L);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1803430x1x c1803430x1x = (C1803430x1x) c1864820ycy.l0;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c1803430x1x.LIZIZ = null;
        }
        Function1<? super C262100zr, Unit> function1 = ((C1803430x1x) c1864820ycy.l0).LIZJ;
        if (function1 != null) {
            function1.invoke(c262100zr);
        }
    }
}
