package X;

import android.app.Activity;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516200KMg extends AbstractC516450KNf<CreateSubOrderResult> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public C0KJK LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new C0KMS());
    public final C516460KNg LJFF = new C516460KNg(0);
    public final C01GW LJI = C452501pT.LIZIZ(new C516590KNt(this));
    public final C01GW LJII = C452501pT.LIZIZ(new C0KO0(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C0KO5());

    @Override // X.AbstractC516450KNf
    public final void LIZ() {
        this.LJFF.LIZJ = System.currentTimeMillis();
        final C0KJK c0kjk = this.LIZLLL;
        if (c0kjk != null) {
            final C516440KNe c516440KNe = (C516440KNe) this.LJI.getValue();
            final C0KNZ c0knz = new C0KNZ(this, c0kjk);
            C516550KNp c516550KNpLIZ = AbstractC516340KMu.LIZ(c516440KNe.LIZLLL, c0kjk, 0L, null, null, null, 30);
            c516440KNe.LIZLLL.getClass();
            AbstractC516340KMu.LIZJ(c516550KNpLIZ);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c516440KNe.LIZLLL.LJ(c0kjk).LJJLL(new C09JN() { // from class: X.0KMs
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str;
                    C1C7U.LIZ("SubscribeCreateContractRepo@e1bd.createContract$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    CreateSubOrderResult createSubOrderResult = (CreateSubOrderResult) baseResponse.data;
                    Object obj2 = null;
                    C516550KNp c516550KNpLIZ2 = AbstractC516340KMu.LIZ(c516440KNe.LIZLLL, c0kjk, System.currentTimeMillis() - jCurrentTimeMillis, createSubOrderResult.contractId, null, null, 24);
                    c516440KNe.LIZLLL.getClass();
                    AbstractC516340KMu.LIZLLL(c516550KNpLIZ2);
                    C516330KMt c516330KMt = (C516330KMt) c516440KNe.LIZJ.getValue();
                    C0KJK c0kjk2 = c0kjk;
                    String str2 = c0kjk2.LJIIIZ;
                    String str3 = c0kjk2.LJIJJ;
                    String str4 = c0kjk2.LJIJJLI;
                    String str5 = c0kjk2.LJIIJJI;
                    String str6 = c0kjk2.LJI;
                    HashMap<String, Object> map = c0kjk2.LJIJI;
                    if (map != null) {
                        obj2 = map.get("log_anchor_id");
                    }
                    if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                        str = "";
                    }
                    c516330KMt.LIZIZ = str3;
                    c516330KMt.LIZ = str2;
                    c516330KMt.LIZJ = str4;
                    c516330KMt.LIZLLL = str5;
                    c516330KMt.LJ = str6;
                    c516330KMt.LJFF = str;
                    C0KJK c0kjk3 = c0kjk;
                    String str7 = createSubOrderResult.contractId;
                    c0kjk3.LJJIII = str7;
                    C0KMK c0kmk = C0KMK.LIZ;
                    String str8 = c0kjk3.LJIIIZ;
                    boolean zLIZ = c0kjk3.LIZ();
                    Integer numValueOf = Integer.valueOf(c0kjk.LJIILL);
                    c0kmk.getClass();
                    C0KMK.LIZ(str8, numValueOf, str7, zLIZ);
                    c516440KNe.LIZ.LIZ((CreateSubOrderResult) baseResponse.data);
                    C1C7U.LIZIZ("SubscribeCreateContractRepo@e1bd.createContract$1");
                }
            }, new C09JN() { // from class: X.0KMk
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String logId;
                    C0KMQ c0kmq;
                    C501470JlZ c501470JlZ;
                    C501470JlZ c501470JlZ2;
                    C1C7U.LIZ("SubscribeCreateContractRepo@e1bd.createContract$2");
                    Throwable th = (Throwable) obj;
                    int iIntValue = ((Number) C517450KRb.LIZ(-1, th).getFirst()).intValue();
                    c0knz.invoke(Integer.valueOf(iIntValue), th);
                    String logId2 = null;
                    AbstractC516340KMu.LIZIZ(c516440KNe.LIZLLL, AbstractC516340KMu.LIZ(c516440KNe.LIZLLL, c0kjk, System.currentTimeMillis() - jCurrentTimeMillis, null, th, C512300K7g.LIZJ(th), 4));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("contract/failed failed: ");
                    sbLIZ.append(th);
                    sbLIZ.append(", logId=");
                    boolean z = th instanceof C501470JlZ;
                    if (z && (c501470JlZ2 = (C501470JlZ) th) != null) {
                        logId = c501470JlZ2.getLogId();
                    } else {
                        logId = null;
                    }
                    sbLIZ.append(logId);
                    sbLIZ.append("show_entrance=");
                    sbLIZ.append(c0kjk.LIZIZ);
                    sbLIZ.append(" detail_code=");
                    sbLIZ.append(iIntValue);
                    C20441214yg.LIZIZ("SubscribePaymentV2", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("contract/failed failed: ");
                    sbLIZ2.append(th);
                    sbLIZ2.append(", logId=");
                    if (z && (c501470JlZ = (C501470JlZ) th) != null) {
                        logId2 = c501470JlZ.getLogId();
                    }
                    sbLIZ2.append(logId2);
                    sbLIZ2.append(",tpl_id=");
                    sbLIZ2.append(c0kjk.LJIJJ);
                    sbLIZ2.append(" offer_token=");
                    sbLIZ2.append(c0kjk.LJJ);
                    sbLIZ2.append(" show_entrance=");
                    sbLIZ2.append(c0kjk.LIZIZ);
                    C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), th);
                    C1796590wqv.LIZJ("ttlive_create_subscription", 31, iIntValue, th.getMessage(), c516440KNe.LIZIZ.LIZ);
                    C0K8M rechargeMonitor = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
                    if (rechargeMonitor != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getClass());
                        sbLIZ3.append(" : ");
                        sbLIZ3.append(th);
                        rechargeMonitor.LIZIZ(iIntValue, C2188811AlT.LIZIZ(sbLIZ3), c516440KNe.LIZIZ.LIZ);
                    }
                    if ((!z || ((C501520Jle) th).getErrorCode() != 4025009) && (c0kmq = c0kjk.LJJI) != null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        c0kmq.onFail(iIntValue, message);
                    }
                    C1C7U.LIZIZ("SubscribeCreateContractRepo@e1bd.createContract$2");
                }
            });
        }
    }

    @Override // X.AbstractC516450KNf
    public final void LIZJ() {
        this.LJFF.LIZJ = System.currentTimeMillis();
        final C0KJK c0kjk = this.LIZLLL;
        if (c0kjk != null) {
            final C516440KNe c516440KNe = (C516440KNe) this.LJI.getValue();
            final C516630KNx c516630KNx = new C516630KNx();
            C516550KNp c516550KNpLIZ = AbstractC516340KMu.LIZ(c516440KNe.LIZLLL, c0kjk, 0L, null, null, null, 30);
            c516440KNe.LIZLLL.getClass();
            AbstractC516340KMu.LIZJ(c516550KNpLIZ);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c516440KNe.LIZLLL.LJ(c0kjk).LJJLL(new C09JN() { // from class: X.0KNP
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubscribeCreateContractRepo@e1bd.preCreateContract$1");
                    C516550KNp c516550KNpLIZ2 = AbstractC516340KMu.LIZ(c516440KNe.LIZLLL, c0kjk, System.currentTimeMillis() - jCurrentTimeMillis, ((CreateSubOrderResult) ((BaseResponse) obj).data).contractId, null, null, 24);
                    c516440KNe.LIZLLL.getClass();
                    AbstractC516340KMu.LIZLLL(c516550KNpLIZ2);
                    C1C7U.LIZIZ("SubscribeCreateContractRepo@e1bd.preCreateContract$1");
                }
            }, new C09JN() { // from class: X.0KN1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubscribeCreateContractRepo@e1bd.preCreateContract$2");
                    Throwable th = (Throwable) obj;
                    c516630KNx.invoke(Integer.valueOf(((Number) C517450KRb.LIZ(-1, th).getFirst()).intValue()), th);
                    AbstractC516340KMu.LIZIZ(c516440KNe.LIZLLL, AbstractC516340KMu.LIZ(c516440KNe.LIZLLL, c0kjk, System.currentTimeMillis() - jCurrentTimeMillis, null, th, C512300K7g.LIZJ(th), 4));
                    C1C7U.LIZIZ("SubscribeCreateContractRepo@e1bd.preCreateContract$2");
                }
            });
        }
    }

    @Override // X.AbstractC516450KNf
    public final void LJFF() {
        C0KN4 c0kn4;
        C516190KMf c516190KMf = (C516190KMf) this.LJII.getValue();
        IMessageManager iMessageManager = c516190KMf.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(c516190KMf);
        }
        c516190KMf.LLILLJJLI = null;
        C516350KMv.LIZJ.remove(c516190KMf);
        C0KNX c0knx = this.LIZ;
        if (c0knx == null || (c0kn4 = c0knx.LIZ) == null) {
            return;
        }
        c0kn4.LIZJ();
    }

    @Override // X.AbstractC516450KNf
    public final void LIZIZ(CreateSubOrderResult createSubOrderResult) {
        CreateSubOrderResult createSubOrderResult2 = createSubOrderResult;
        C0KJK c0kjk = this.LIZLLL;
        if (c0kjk != null) {
            C516190KMf c516190KMf = (C516190KMf) this.LJII.getValue();
            if (c516190KMf.LLILLJJLI == null) {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    c516190KMf.LLILLJJLI = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(room.getId());
                }
                IMessageManager iMessageManager = c516190KMf.LLILLJJLI;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(C001A.SUB_CONTRACT_STATUS_MESSAGE.getIntType(), c516190KMf);
                }
                C516350KMv c516350KMv = C516350KMv.LIZ;
                if (!C516350KMv.LIZIZ) {
                    ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerHostWS(134217803, 1, c516350KMv);
                    C516350KMv.LIZIZ = true;
                }
                C516350KMv.LIZJ.add(c516190KMf);
            }
            C0KJK c0kjk2 = this.LIZLLL;
            int i = 0;
            if (c0kjk2 != null) {
                String str = c0kjk2.LJIIIZ;
                EnumC513490KBv enumC513490KBv = EnumC513490KBv.NORMAL_SUBSCRIPTION;
                C513500KBw.LIZIZ(str, 0, enumC513490KBv);
                C513500KBw.LIZIZ(c0kjk2.LJIIIZ, 1, enumC513490KBv);
                C513500KBw.LIZIZ(c0kjk2.LJIIIZ, 2, enumC513490KBv);
            }
            C516640KNy c516640KNy = this.LIZJ;
            C516460KNg c516460KNg = this.LJFF;
            C516580KNs c516580KNs = new C516580KNs(c516640KNy, c516460KNg);
            C516520KNm c516520KNm = new C516520KNm(this);
            C1791720wj4 c1791720wj4 = new C1791720wj4(createSubOrderResult2.merchantId, true, C0KQG.LIZIZ(createSubOrderResult2.bizContent), C519980KaK.LIZ(createSubOrderResult2.bizContent, String.valueOf(UserService.getInstance().user().getCurrentUserId())));
            boolean zLIZ = c0kjk.LIZ();
            C0KM7 c0km7LIZ = C0W0R.LIZ(c0kjk.LIZJ.get());
            C516010KLn c516010KLn = C516010KLn.LIZ;
            String str2 = createSubOrderResult2.contractId;
            String str3 = c0kjk.LIZLLL;
            String str4 = c0kjk.LIZIZ;
            c516010KLn.getClass();
            C516010KLn.LJIIIZ(zLIZ, str2, str3, str4, c0km7LIZ, c0kjk);
            HashMap<String, Object> map = c0kjk.LJIJI;
            if (map != null) {
                map.put("order_id", createSubOrderResult2.contractId);
            }
            HashMap<String, Object> map2 = c0kjk.LJIJI;
            if (map2 != null) {
                map2.put("biz_content", createSubOrderResult2.bizContent);
            }
            HashMap<String, Object> map3 = c0kjk.LJIJI;
            if (map3 != null) {
                map3.put("livesub_create_contract_intent", Integer.valueOf(c0kjk.LJIILL));
            }
            C0KN4 c0kn4 = new C0KN4(c0kjk.LIZJ.get());
            c0kjk.LIZ = c0kn4;
            c0kn4.LLIZ = true;
            c516460KNg.LIZ.put("bizContent", createSubOrderResult2.bizContent);
            c516460KNg.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - c516460KNg.LIZJ));
            try {
                c516460KNg.LIZ.put("product", C2348809Ig.LJIIIIZZ(createSubOrderResult2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c516580KNs.LIZIZ.LIZ.put("contractId", createSubOrderResult2.contractId);
            C1796590wqv.LIZ("ttlive_create_subscription", c516580KNs.LIZIZ.LIZ);
            C0K8M rechargeMonitor = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
            if (rechargeMonitor != null) {
                rechargeMonitor.LJ(null, c516580KNs.LIZIZ.LIZ);
            }
            C0KN6 c0kn6 = new C0KN6(c516580KNs, c0kjk, c1791720wj4, createSubOrderResult2, c516520KNm);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                c0kn6.invoke();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C516010KLn c516010KLn2 = C516010KLn.LIZ;
                Boolean boolValueOf = Boolean.valueOf(zLIZ);
                String str5 = createSubOrderResult2.contractId;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String str6 = c0kjk.LIZLLL;
                String str7 = c0kjk.LIZIZ;
                Map linkedHashMap = c0kjk.LJ;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                C0KM7 c0km7LIZ2 = C0W0R.LIZ(c0kjk.LIZJ.get());
                C0KN4 c0kn42 = c0kjk.LIZ;
                if (c0kn42 != null) {
                    i = c0kn42.LLIZLLLIL;
                }
                c516010KLn2.getClass();
                C516010KLn.LJII(boolValueOf, str5, jCurrentTimeMillis2, LSPassThroughRecordSizeConfig.DEFAULT, 0, "", "", str6, str7, linkedHashMap, c0km7LIZ2, i, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0154  */
    @Override // X.AbstractC516450KNf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(boolean r23) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516200KMg.LIZLLL(boolean):boolean");
    }

    @Override // X.AbstractC516450KNf
    public final void LJ(String str, String str2, boolean z) {
        C0KJK c0kjk = this.LIZLLL;
        if (c0kjk == null) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C516360KMw(this, str, c0kjk, z, str2, null), 3);
    }

    public final void LJI(int i, int i2, int i3, Exception exc, InterfaceC516660KOa interfaceC516660KOa) {
        Activity activity;
        Map<String, String> mapLJ;
        String strValueOf;
        WeakReference<Activity> weakReference;
        C0KJK c0kjk = this.LIZLLL;
        if (c0kjk != null && (weakReference = c0kjk.LIZJ) != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        C0KJK c0kjk2 = this.LIZLLL;
        if (c0kjk2 == null || (mapLJ = c0kjk2.LJ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (i != 0 && i != 1 && i != 2) {
            return;
        }
        if (exc instanceof C501470JlZ) {
            long errorCode = ((C501520Jle) exc).getErrorCode();
            if (errorCode == 4025003) {
                strValueOf = "insufficient_balance";
            } else if (errorCode == 4025009) {
                strValueOf = "has_subscribed";
            } else if (errorCode == 4025006) {
                strValueOf = "not_follow";
            } else if (errorCode == 4025010) {
                strValueOf = "function_limit";
            } else if (errorCode == 4025004) {
                strValueOf = "pay_failed";
            } else if (errorCode == 4025007) {
                strValueOf = "region_limit";
            } else if (errorCode == 4025002) {
                strValueOf = "risk";
            } else if (errorCode == 4025001) {
                strValueOf = "reach_Limit";
            } else if (errorCode == 4025008) {
                strValueOf = "sub_expired";
            } else if (errorCode == 4025005) {
                strValueOf = "under_age";
            } else {
                strValueOf = String.valueOf(errorCode);
            }
        } else if (i2 == 203) {
            strValueOf = "google-apple";
        } else if (i2 == 206) {
            strValueOf = "cancel";
        } else {
            strValueOf = "";
        }
        C0KOS c0kos = new C0KOS(activity, i, i2, i3, strValueOf, exc, mapLJ, interfaceC516660KOa);
        c0kos.LJIIIIZZ = ((C516330KMt) this.LJ.getValue()).LIZIZ(i2, activity);
        C0KNM.LIZIZ(c0kos);
        C0KMV.LIZIZ(i2, strValueOf, mapLJ);
        C0KMV.LIZ(i2, strValueOf, mapLJ);
    }
}
