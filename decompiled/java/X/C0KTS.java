package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0KTS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KTS extends C0KTU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.0KOP] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.0KR6] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextLIZLLL;
        String containerID;
        boolean z;
        C0KTT c0ktt = (C0KTT) xBaseParamModel;
        final long jLIZLLL = C518170KTv.LIZLLL(c0ktt.getIapTrackingData(), "pgcIapPay", 2);
        final long jLJ = C518170KTv.LJ("payment", null, null, null, c0ktt.getIapTrackingData(), 30);
        final long jLJ2 = C518170KTv.LJ("call_jsb", "native", "pgcIapPay", "create_order", c0ktt.getIapTrackingData(), 16);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            contextLIZLLL = interfaceC634840OvC.LIZLLL();
            if (contextLIZLLL == null) {
                contextLIZLLL = interfaceC634840OvC.getContext();
            }
        } else {
            contextLIZLLL = null;
        }
        boolean z2 = false;
        if (contextLIZLLL == null) {
            LIZJ(jLIZLLL, "context unavailable", jLJ2, jLJ, c0ktt.getIapTrackingData());
            C2382909Vj.LIZ(completionBlock, 0, "context unavailable", null, 4);
            return;
        }
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C1616790sAv c1616790sAv = EnumC1616780sAu.Companion;
        int iIntValue = c0ktt.getBizLine().intValue();
        c1616790sAv.getClass();
        if (C1616790sAv.LIZ(iIntValue).isSubscription()) {
            C0K6O c0k6oLIZ = C0K6M.LIZ();
            if (!c0k6oLIZ.isAvailable()) {
                LIZJ(jLIZLLL, "paymentServicePgc unavailable", jLJ2, jLJ, c0ktt.getIapTrackingData());
                C2382909Vj.LIZ(completionBlock, 0, "paymentServicePgc unavailable", null, 4);
                return;
            }
            Map<String, Object> iapTrackingData = c0ktt.getIapTrackingData();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_pgc_iap_popup", true) == 1) {
                z2 = true;
            }
            Map mapLJIILIIL = C2097608Jq.LJIILIIL(iapTrackingData, new Pair("iap_dialog_use_new_style", Boolean.valueOf(z2)));
            Map<String, Object> createOrderParams = c0ktt.getCreateOrderParams();
            Map<String, Object> mpParams = c0ktt.getMpParams();
            Map<String, Object> purchaseOption = c0ktt.getPurchaseOption();
            Map<String, Object> collectionDetailModel = c0ktt.getCollectionDetailModel();
            final Map<String, Object> iapTrackingData2 = c0ktt.getIapTrackingData();
            ?? r19 = new C0KLW() { // from class: X.0KOP
                @Override // X.C0KLW
                public final void onFail(int i, String str) {
                    C517250KQh.LIZ(1, "unknown", Integer.valueOf(i), str, iapTrackingData2);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C518170KTv.LIZIZ("call_jsb", "fail", jElapsedRealtime - jLIZLLL, "native", "pgcIapPay", "pay_completed", String.valueOf(i), str, "server", iapTrackingData2, 64);
                    C518170KTv.LIZJ("pgcIapPay", "fail", jElapsedRealtime - jLIZLLL, String.valueOf(i), str, "server", iapTrackingData2, 8);
                    C518170KTv.LIZIZ("payment", "fail", jElapsedRealtime - jLJ, null, null, null, String.valueOf(i), str, "server", iapTrackingData2, 120);
                }

                @Override // X.C0KLW
                public final void LIZ(C0KFM c0kfm, String str, String str2, C515650KKd c515650KKd) {
                    String str3;
                    SubscribeBadge subscribeBadge;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    Integer numValueOf;
                    Number number;
                    String str8 = null;
                    if (c515650KKd != null) {
                        str3 = c515650KKd.LIZIZ;
                    } else {
                        str3 = null;
                    }
                    C512200K6w.LIZIZ(str3);
                    if (c515650KKd != null) {
                        subscribeBadge = c515650KKd.LIZ;
                    } else {
                        subscribeBadge = null;
                    }
                    C512200K6w.LIZ(c0kfm, subscribeBadge);
                    C517250KQh.LIZ(0, "completed", null, null, iapTrackingData2);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C518170KTv.LIZIZ("call_jsb", "success", jElapsedRealtime - jLIZLLL, "native", "pgcIapPay", "pay_completed", null, null, null, iapTrackingData2, 960);
                    C518170KTv.LIZJ("pgcIapPay", "success", jElapsedRealtime - jLIZLLL, null, null, null, iapTrackingData2, 120);
                    C518170KTv.LIZIZ("payment", "success", jElapsedRealtime - jLJ, null, null, null, null, null, null, iapTrackingData2, 1016);
                    Object obj = iapTrackingData2.get("previous_page");
                    if (obj instanceof String) {
                        str4 = (String) obj;
                    } else {
                        str4 = null;
                    }
                    Object obj2 = iapTrackingData2.get("enter_from");
                    if (obj2 instanceof String) {
                        str5 = (String) obj2;
                    } else {
                        str5 = null;
                    }
                    Object obj3 = iapTrackingData2.get("series_enter_entrance");
                    if (obj3 instanceof String) {
                        str6 = (String) obj3;
                    } else {
                        str6 = null;
                    }
                    Object obj4 = iapTrackingData2.get("business_type");
                    if (obj4 instanceof String) {
                        str7 = (String) obj4;
                    } else {
                        str7 = null;
                    }
                    Object obj5 = iapTrackingData2.get("subscribe_state");
                    if ((obj5 instanceof Number) && (number = (Number) obj5) != null) {
                        numValueOf = Integer.valueOf(number.intValue());
                    } else {
                        numValueOf = null;
                    }
                    Object obj6 = iapTrackingData2.get("payment_type");
                    if (obj6 instanceof String) {
                        str8 = (String) obj6;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("action_type", "show");
                    if (str4 != null) {
                        c2344009Gk.LJFF("previous_page", str4);
                    }
                    if (str5 != null) {
                        c2344009Gk.LJFF("enter_from", str5);
                    }
                    if (str6 != null) {
                        c2344009Gk.LJFF("series_enter_entrance", str6);
                    }
                    if (str7 != null) {
                        c2344009Gk.LJFF("business_type", str7);
                    }
                    if (numValueOf != null) {
                        c2344009Gk.LIZJ(numValueOf.intValue(), "subscribe_state");
                    }
                    if (str8 != null) {
                        c2344009Gk.LJFF("payment_type", str8);
                    }
                    C20684815ws.LJIILLIIL("collection_unlock_notice", c2344009Gk.LIZ);
                }
            };
            final Map<String, Object> iapTrackingData3 = c0ktt.getIapTrackingData();
            c0k6oLIZ.LIZJ(contextLIZLLL, createOrderParams, mpParams, mapLJIILIIL, purchaseOption, collectionDetailModel, r19, new C0KOJ() { // from class: X.0KR6
                public long LIZ;

                @Override // X.C0KOJ
                public final void onSuccess(int i, int i2) {
                    int iIntValue2;
                    String str;
                    String str2;
                    Integer numValueOf;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    Long lLJIILIIL;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    String str11;
                    Integer numValueOf2;
                    String str12;
                    Number number;
                    Number number2;
                    Number number3;
                    Number number4;
                    Number number5;
                    Integer numValueOf3;
                    String str13;
                    String str14;
                    Integer numValueOf4;
                    String str15;
                    String str16;
                    String str17;
                    String str18;
                    Long lLJIILIIL2;
                    String str19;
                    String str20;
                    String str21;
                    String str22;
                    String str23;
                    Integer numValueOf5;
                    String str24;
                    Number number6;
                    Number number7;
                    Number number8;
                    Number number9;
                    Number number10;
                    Number number11;
                    Integer numValueOf6 = null;
                    if (i != 1) {
                        if (i == 2) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j = this.LIZ;
                            if (j > 0) {
                                C518170KTv.LIZIZ("call_jsb", "success", jElapsedRealtime - j, "native", "pgcIapPay", "mp_pay", null, null, null, iapTrackingData3, 960);
                            }
                            C518170KTv.LJ("call_jsb", "native", "pgcIapPay", "polling_confirmation", iapTrackingData3, 16);
                            Object obj = iapTrackingData3.get("is_auto_triggered_paywall");
                            if ((obj instanceof Number) && (number11 = (Number) obj) != null) {
                                numValueOf3 = Integer.valueOf(number11.intValue());
                            } else {
                                numValueOf3 = null;
                            }
                            Object obj2 = iapTrackingData3.get("plan_type");
                            if (obj2 instanceof String) {
                                str13 = (String) obj2;
                            } else {
                                str13 = null;
                            }
                            Object obj3 = iapTrackingData3.get("promo_type");
                            if (obj3 instanceof String) {
                                str14 = (String) obj3;
                            } else {
                                str14 = null;
                            }
                            Object obj4 = iapTrackingData3.get("discount_rate");
                            if ((obj4 instanceof Number) && (number10 = (Number) obj4) != null) {
                                numValueOf4 = Integer.valueOf(number10.intValue());
                            } else {
                                numValueOf4 = null;
                            }
                            Object obj5 = iapTrackingData3.get("tag_type");
                            if (obj5 instanceof String) {
                                str15 = (String) obj5;
                            } else {
                                str15 = null;
                            }
                            Object obj6 = iapTrackingData3.get("bundle_price_no_discount");
                            if (obj6 instanceof String) {
                                str16 = (String) obj6;
                            } else {
                                str16 = null;
                            }
                            Object obj7 = iapTrackingData3.get("bundle_price");
                            if (obj7 instanceof String) {
                                str17 = (String) obj7;
                            } else {
                                str17 = null;
                            }
                            Object obj8 = iapTrackingData3.get("bundle_title");
                            if (obj8 instanceof String) {
                                str18 = (String) obj8;
                            } else {
                                str18 = null;
                            }
                            Object obj9 = iapTrackingData3.get("group_id");
                            if ((obj9 instanceof Number) && (number9 = (Number) obj9) != null) {
                                lLJIILIIL2 = Long.valueOf(number9.longValue());
                            } else {
                                Object obj10 = iapTrackingData3.get("group_id");
                                if ((obj10 instanceof String) && (str19 = (String) obj10) != null) {
                                    lLJIILIIL2 = C2095008Iq.LJIILIIL(str19);
                                } else {
                                    lLJIILIIL2 = null;
                                }
                            }
                            Object obj11 = iapTrackingData3.get("previous_page");
                            if (obj11 instanceof String) {
                                str20 = (String) obj11;
                            } else {
                                str20 = null;
                            }
                            Object obj12 = iapTrackingData3.get("enter_from");
                            if (obj12 instanceof String) {
                                str21 = (String) obj12;
                            } else {
                                str21 = null;
                            }
                            Object obj13 = iapTrackingData3.get("series_enter_entrance");
                            if (obj13 instanceof String) {
                                str22 = (String) obj13;
                            } else {
                                str22 = null;
                            }
                            Object obj14 = iapTrackingData3.get("business_type");
                            if (obj14 instanceof String) {
                                str23 = (String) obj14;
                            } else {
                                str23 = null;
                            }
                            Object obj15 = iapTrackingData3.get("subscribe_state");
                            if ((obj15 instanceof Number) && (number8 = (Number) obj15) != null) {
                                numValueOf5 = Integer.valueOf(number8.intValue());
                            } else {
                                numValueOf5 = null;
                            }
                            Object obj16 = iapTrackingData3.get("payment_type");
                            if (obj16 instanceof String) {
                                str24 = (String) obj16;
                            } else {
                                str24 = null;
                            }
                            Object obj17 = iapTrackingData3.get("is_retention_pop");
                            if ((obj17 instanceof Number) && (number7 = (Number) obj17) != null) {
                                numValueOf6 = Integer.valueOf(number7.intValue());
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LIZJ(i2, "is_success");
                            c2344009Gk.LJFF("error_code", "");
                            c2344009Gk.LJFF("error_msg", "");
                            if (numValueOf3 != null) {
                                c2344009Gk.LIZJ(numValueOf3.intValue(), "is_auto_triggered_paywall");
                            }
                            if (str13 != null) {
                                c2344009Gk.LJFF("plan_type", str13);
                            }
                            if (str14 != null) {
                                c2344009Gk.LJFF("promo_type", str14);
                            }
                            if (numValueOf4 != null) {
                                c2344009Gk.LIZJ(numValueOf4.intValue(), "discount_rate");
                            }
                            if (str15 != null) {
                                c2344009Gk.LJFF("tag_type", str15);
                            }
                            if (str16 != null) {
                                c2344009Gk.LJFF("bundle_price_no_discount", str16);
                            }
                            if (str17 != null) {
                                c2344009Gk.LJFF("bundle_price", str17);
                            }
                            if (str18 != null) {
                                c2344009Gk.LJFF("bundle_title", str18);
                            }
                            if (lLJIILIIL2 != null) {
                                c2344009Gk.LIZLLL(lLJIILIIL2.longValue(), "group_id");
                            }
                            if (str20 != null) {
                                c2344009Gk.LJFF("previous_page", str20);
                            }
                            if (str21 != null) {
                                c2344009Gk.LJFF("enter_from", str21);
                            }
                            if (str22 != null) {
                                c2344009Gk.LJFF("series_enter_entrance", str22);
                            }
                            if (str23 != null) {
                                c2344009Gk.LJFF("business_type", str23);
                            }
                            if (numValueOf5 != null) {
                                c2344009Gk.LIZJ(numValueOf5.intValue(), "subscribe_state");
                            }
                            if (str24 != null) {
                                c2344009Gk.LJFF("payment_type", str24);
                            }
                            if (numValueOf6 != null) {
                                c2344009Gk.LIZJ(numValueOf6.intValue(), "is_retention_pop");
                            }
                            C20684815ws.LJIILLIIL("collection_in_app_purchase_confirmation", c2344009Gk.LIZ);
                            if (i2 == 0) {
                                C0KOO c0koo = C0KOO.LIZ;
                                Map<String, Object> map = iapTrackingData3;
                                C13DA c13da = new C13DA();
                                c13da.put("action_type", "show");
                                Object obj18 = map.get("previous_page");
                                if ((obj18 instanceof String) && obj18 != null) {
                                    c13da.put("previous_page", obj18);
                                }
                                Object obj19 = map.get("enter_from");
                                if ((obj19 instanceof String) && obj19 != null) {
                                    c13da.put("enter_from", obj19);
                                }
                                Object obj20 = map.get("series_enter_entrance");
                                if ((obj20 instanceof String) && obj20 != null) {
                                    c13da.put("series_enter_entrance", obj20);
                                }
                                Object obj21 = map.get("business_type");
                                if ((obj21 instanceof String) && obj21 != null) {
                                    c13da.put("business_type", obj21);
                                }
                                Object obj22 = map.get("subscribe_state");
                                if ((obj22 instanceof Number) && (number6 = (Number) obj22) != null) {
                                    c13da.put("subscribe_state", String.valueOf(number6.intValue()));
                                }
                                Object obj23 = map.get("payment_type");
                                if ((obj23 instanceof String) && obj23 != null) {
                                    c13da.put("payment_type", obj23);
                                }
                                c13da.put("show_type", "subscription_purchase");
                                c13da.put("error_code", String.valueOf(i2));
                                c13da.put("error_msg", "");
                                Map mapBuild = c13da.build();
                                c0koo.getClass();
                                C0KOO.LIZ(mapBuild);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C518170KTv.LIZIZ("call_jsb", "success", SystemClock.elapsedRealtime() - jLJ2, "native", "pgcIapPay", "create_order", null, null, null, iapTrackingData3, 960);
                    this.LIZ = C518170KTv.LJ("call_jsb", "native", "pgcIapPay", "mp_pay", iapTrackingData3, 16);
                    Object obj24 = iapTrackingData3.get("is_auto_triggered_paywall");
                    if ((obj24 instanceof Number) && (number5 = (Number) obj24) != null) {
                        iIntValue2 = number5.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    Object obj25 = iapTrackingData3.get("plan_type");
                    if (obj25 instanceof String) {
                        str = (String) obj25;
                    } else {
                        str = null;
                    }
                    Object obj26 = iapTrackingData3.get("promo_type");
                    if (obj26 instanceof String) {
                        str2 = (String) obj26;
                    } else {
                        str2 = null;
                    }
                    Object obj27 = iapTrackingData3.get("discount_rate");
                    if ((obj27 instanceof Number) && (number4 = (Number) obj27) != null) {
                        numValueOf = Integer.valueOf(number4.intValue());
                    } else {
                        numValueOf = null;
                    }
                    Object obj28 = iapTrackingData3.get("tag_type");
                    if (obj28 instanceof String) {
                        str3 = (String) obj28;
                    } else {
                        str3 = null;
                    }
                    Object obj29 = iapTrackingData3.get("bundle_price_no_discount");
                    if (obj29 instanceof String) {
                        str4 = (String) obj29;
                    } else {
                        str4 = null;
                    }
                    Object obj30 = iapTrackingData3.get("bundle_price");
                    if (obj30 instanceof String) {
                        str5 = (String) obj30;
                    } else {
                        str5 = null;
                    }
                    Object obj31 = iapTrackingData3.get("bundle_title");
                    if (obj31 instanceof String) {
                        str6 = (String) obj31;
                    } else {
                        str6 = null;
                    }
                    Object obj32 = iapTrackingData3.get("group_id");
                    if ((obj32 instanceof Number) && (number3 = (Number) obj32) != null) {
                        lLJIILIIL = Long.valueOf(number3.longValue());
                    } else {
                        Object obj33 = iapTrackingData3.get("group_id");
                        if ((obj33 instanceof String) && (str7 = (String) obj33) != null) {
                            lLJIILIIL = C2095008Iq.LJIILIIL(str7);
                        } else {
                            lLJIILIIL = null;
                        }
                    }
                    Object obj34 = iapTrackingData3.get("previous_page");
                    if (obj34 instanceof String) {
                        str8 = (String) obj34;
                    } else {
                        str8 = null;
                    }
                    Object obj35 = iapTrackingData3.get("enter_from");
                    if (obj35 instanceof String) {
                        str9 = (String) obj35;
                    } else {
                        str9 = null;
                    }
                    Object obj36 = iapTrackingData3.get("series_enter_entrance");
                    if (obj36 instanceof String) {
                        str10 = (String) obj36;
                    } else {
                        str10 = null;
                    }
                    Object obj37 = iapTrackingData3.get("business_type");
                    if (obj37 instanceof String) {
                        str11 = (String) obj37;
                    } else {
                        str11 = null;
                    }
                    Object obj38 = iapTrackingData3.get("subscribe_state");
                    if ((obj38 instanceof Number) && (number2 = (Number) obj38) != null) {
                        numValueOf2 = Integer.valueOf(number2.intValue());
                    } else {
                        numValueOf2 = null;
                    }
                    Object obj39 = iapTrackingData3.get("payment_type");
                    if (obj39 instanceof String) {
                        str12 = (String) obj39;
                    } else {
                        str12 = null;
                    }
                    Object obj40 = iapTrackingData3.get("is_retention_pop");
                    if ((obj40 instanceof Number) && (number = (Number) obj40) != null) {
                        numValueOf6 = Integer.valueOf(number.intValue());
                    }
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LIZJ(iIntValue2, "is_auto_triggered_paywall");
                    if (str != null) {
                        c2344009Gk2.LJFF("plan_type", str);
                    }
                    if (str2 != null) {
                        c2344009Gk2.LJFF("promo_type", str2);
                    }
                    if (numValueOf != null) {
                        c2344009Gk2.LIZJ(numValueOf.intValue(), "discount_rate");
                    }
                    if (str3 != null) {
                        c2344009Gk2.LJFF("tag_type", str3);
                    }
                    if (str4 != null) {
                        c2344009Gk2.LJFF("bundle_price_no_discount", str4);
                    }
                    if (str5 != null) {
                        c2344009Gk2.LJFF("bundle_price", str5);
                    }
                    if (str6 != null) {
                        c2344009Gk2.LJFF("bundle_title", str6);
                    }
                    if (lLJIILIIL != null) {
                        c2344009Gk2.LIZLLL(lLJIILIIL.longValue(), "group_id");
                    }
                    if (str8 != null) {
                        c2344009Gk2.LJFF("previous_page", str8);
                    }
                    if (str9 != null) {
                        c2344009Gk2.LJFF("enter_from", str9);
                    }
                    if (str10 != null) {
                        c2344009Gk2.LJFF("series_enter_entrance", str10);
                    }
                    if (str11 != null) {
                        c2344009Gk2.LJFF("business_type", str11);
                    }
                    if (numValueOf2 != null) {
                        c2344009Gk2.LIZJ(numValueOf2.intValue(), "subscribe_state");
                    }
                    if (str12 != null) {
                        c2344009Gk2.LJFF("payment_type", str12);
                    }
                    if (numValueOf6 != null) {
                        c2344009Gk2.LIZJ(numValueOf6.intValue(), "is_retention_pop");
                    }
                    C20684815ws.LJIILLIIL("show_collection_in_app_purchase", c2344009Gk2.LIZ);
                }
            });
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0KTV.class, containerID), "");
            return;
        }
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJII(C0KTY.class)) {
            LIZJ(jLIZLLL, "no short-drama pay handler registered", jLJ2, jLJ, c0ktt.getIapTrackingData());
            C2382909Vj.LIZ(completionBlock, 0, "no short-drama pay handler registered", null, 4);
            return;
        }
        if (c0ktt.getOptionType().intValue() == EnumC1615550s8v.PGC_OPTION_TYPE_ONE_TIME.getProtoValue()) {
            z = true;
        } else {
            z = false;
        }
        eventBusLIZLLL.LJIILL(new C0KTY(c0ktt.getCreateOrderParams(), c0ktt.getIapTrackingData(), z, c0ktt.getPurchaseOption(), c0ktt.getMpParams(), AFwS193S0000000_7.get$arr$(252), AFwS237S0000000_7.get$arr$(258)));
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0KTV.class, containerID), "");
    }

    public static void LIZJ(long j, String str, long j2, long j3, Map map) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C518170KTv.LIZIZ("call_jsb", "fail", jElapsedRealtime - j2, "native", "pgcIapPay", "create_order", CardStruct.IStatusCode.DEFAULT, str, "client", map, 64);
        C518170KTv.LIZJ("pgcIapPay", "fail", jElapsedRealtime - j, CardStruct.IStatusCode.DEFAULT, str, "client", map, 8);
        C518170KTv.LIZIZ("payment", "fail", jElapsedRealtime - j3, null, null, null, CardStruct.IStatusCode.DEFAULT, str, "client", map, 120);
    }
}
