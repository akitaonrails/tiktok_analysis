package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KJM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJM extends C0KJP {
    public static Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> LLJ;
    public final String LLILLL = "IapForSubscriptionV2Method";
    public final Map<String, String> LLILZ = new HashMap();
    public Map<String, String> LLILZIL = new HashMap();
    public String LLILZLL = "";
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(231));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(232));

    public static final String LIZJ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1255350552) {
                if (iHashCode != 0) {
                    if (iHashCode == 1352224630 && str.equals("sub_change_price_email")) {
                        return "price_change";
                    }
                    return "unknown_jsb";
                }
                if (str.equals("")) {
                    return "normal_sub";
                }
                return "unknown_jsb";
            }
            if (str.equals("normal_sub")) {
                return "normal_sub";
            }
            return "unknown_jsb";
        }
        return "unknown_jsb";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.0KJT] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        Object obj;
        Long lValueOf;
        int iIntValue;
        C0KKG c0kkgLIZIZ;
        LinkedHashMap linkedHashMap2;
        int iIntValue2;
        String str;
        String json;
        Object obj2;
        String str2;
        Object objValueOf;
        ArrayList arrayList;
        TemplateInfo templateInfo;
        OfferInfo offerInfo;
        Activity activityLIZLLL;
        String str3;
        boolean zBooleanValue;
        int iIntValue3;
        int iIntValue4;
        C0KKG c0kkgLIZ;
        Collection<? extends List<SubscriptionProductDetailWithTemplateInfo>> collectionValues;
        Object next;
        Context context;
        Integer numLJIIJJI;
        String toUid;
        boolean z3;
        int iIntValue5;
        C0KKG c0kkgLIZ2;
        User owner;
        C0KJN c0kjn = (C0KJN) xBaseParamModel;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        String subscribeType = c0kjn.getSubscribeType();
        String str4 = "";
        if (subscribeType == null) {
            subscribeType = "";
        }
        this.LLILZLL = subscribeType;
        Number action = c0kjn.getAction();
        if (action != null && action.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        Activity activityLIZLLL2 = null;
        Context context2 = null;
        Activity activityLIZLLL3 = null;
        if (z) {
            if ((room == null || (owner = room.getOwner()) == null || (toUid = owner.getSecUid()) == null) && (toUid = c0kjn.getToUid()) == null) {
                toUid = "";
            }
            if (toUid.length() == 0) {
                C20441214yg.LIZIZ(this.LLILLL, "JSB room is null");
                C2382909Vj.LIZ(completionBlock, -1, "jsb to uid is null.", null, 4);
                return;
            }
            Map<String, String> map = this.LLILZ;
            String iapId = c0kjn.getIapId();
            if (iapId == null) {
                iapId = "";
            }
            String offerId = c0kjn.getOfferId();
            if (offerId != null) {
                str4 = offerId;
            }
            ((HashMap) map).put(iapId, str4);
            C0KKO c0kko = new C0KKO() { // from class: X.0KJQ
                @Override // X.C0KKO
                public final void LIZ(int i, String str5) {
                }

                @Override // X.C0KKO
                public final void LIZIZ() {
                }

                @Override // X.C0KKO
                public final void LIZJ(String str5) {
                }

                @Override // X.C0KKO
                public final void LJFF(long j, TemplateListData templateListData) {
                }

                @Override // X.C0KKO
                public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map2, C0KH1 c0kh1) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                    Iterator<T> it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Object key = entry.getKey();
                        Iterable iterable = (Iterable) entry.getValue();
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                        Iterator it3 = iterable.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new XBaseResultModel((SubscriptionProductDetailWithTemplateInfo) it3.next()) { // from class: X.00p1
                                public final SubscriptionProductDetailWithTemplateInfo LIZ;

                                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                                public final Map<String, Object> convert() {
                                    Object objLJIIIIZZ;
                                    SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = this.LIZ;
                                    try {
                                        Gson gson = C19748512Ol.LIZIZ;
                                        objLJIIIIZZ = gson.LJIIIIZZ(gson.LJIILL(subscriptionProductDetailWithTemplateInfo), new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Vl
                                        }.getType());
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C20441214yg.LJII(e);
                                        objLJIIIIZZ = null;
                                    }
                                    Map<String, Object> map3 = (Map) objLJIIIIZZ;
                                    return map3 == null ? C2097608Jq.LJ() : map3;
                                }

                                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                                public final JSONObject toJSON() {
                                    try {
                                        return new JSONObject(C19748512Ol.LIZIZ.LJIILL(this.LIZ));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        return new JSONObject();
                                    }
                                }

                                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
                                public final List<String> provideResultList() {
                                    return C13BV.INSTANCE;
                                }

                                {
                                    this.LIZ = subscriptionProductDetailWithTemplateInfo;
                                }
                            });
                        }
                        linkedHashMap3.put(key, arrayList2);
                    }
                    this.LIZ.getClass();
                    C0KJW c0kjw = (C0KJW) C1909107dp.LIZJ(C0KJW.class, null);
                    c0kjw.setPayStatus(1);
                    c0kjw.setGetSkuResponse(linkedHashMap3);
                    c0kjw.setPackageId("");
                    c0kjw.setPayMessage("success");
                    try {
                        completionBlock.onSuccess(c0kjw, "");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C0KJM.LLJ = map2;
                }

                @Override // X.C0KKO
                public final void LIZLLL(int i, int i2, int i3, String str5, C0KH1 c0kh1) {
                    String strLJIJI;
                    this.LIZ.getClass();
                    C0KJW c0kjw = (C0KJW) C1909107dp.LIZJ(C0KJW.class, null);
                    c0kjw.setPayStatus(Integer.valueOf(i3));
                    c0kjw.setGetSkuResponse(null);
                    c0kjw.setPackageId("");
                    if (str5.length() == 0) {
                        strLJIJI = C497740JfY.LJIJI(2131844613);
                    } else {
                        strLJIJI = str5;
                    }
                    c0kjw.setPayMessage(strLJIJI);
                    completionBlock.onFailure(i2, str5, c0kjw);
                }
            };
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context2 = interfaceC634840OvC.getContext();
            }
            EnumC513490KBv enumC513490KBv = EnumC513490KBv.NORMAL_SUBSCRIPTION;
            Number allowCache = c0kjn.getAllowCache();
            if (allowCache != null && allowCache.intValue() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            Number scene = c0kjn.getScene();
            if (scene != null) {
                iIntValue5 = scene.intValue();
            } else {
                iIntValue5 = 0;
            }
            C0KJX c0kjx = new C0KJX(toUid, z3, iIntValue5, LIZJ(c0kjn.getFromId()), 0L, 0L, true, enumC513490KBv, null, context2, c0kko, null, false, 63792);
            C0KJL c0kjl = (C0KJL) this.LLIZLLLIL.getValue();
            if (c0kjl == null || (c0kkgLIZ2 = c0kjl.LIZ()) == null) {
                return;
            }
            c0kkgLIZ2.LJ(c0kjx);
            return;
        }
        Number action2 = c0kjn.getAction();
        if (action2 != null && action2.intValue() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.LLIZ.getValue() != null) {
                boolean zLJFF = Intrinsics.LJFF(this.LLILZLL, "auto_sub");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_tpl_page_sub_click");
                c474500IjALIZ.LJJII(Integer.valueOf(C516010KLn.LIZLLL(Boolean.valueOf(zLJFF))), "type");
                c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
                c474500IjALIZ.LIZ();
            }
            HashMap map2 = new HashMap();
            Map<String, Object> trackInfo = c0kjn.getTrackInfo();
            if (trackInfo != null) {
                linkedHashMap2 = new LinkedHashMap(C500260Jjc.LLD(trackInfo));
            } else {
                linkedHashMap2 = new LinkedHashMap();
            }
            this.LLILZIL = linkedHashMap2;
            String orderSource = c0kjn.getOrderSource();
            if (orderSource != null && (numLJIIJJI = C2095008Iq.LJIIJJI(orderSource)) != null) {
                iIntValue2 = numLJIIJJI.intValue();
            } else {
                iIntValue2 = 1;
            }
            map2.put("order_source", Integer.valueOf(iIntValue2));
            final String packageId = c0kjn.getPackageId();
            if (packageId == null) {
                packageId = "";
            }
            if (Intrinsics.LJFF(packageId, "null")) {
                str = "";
            } else {
                str = packageId;
            }
            map2.put("package_id", str);
            if (c0kjn.getExtraLogPb() == null) {
                json = "";
            } else {
                json = GsonProtectorUtils.toJson(C293501Bt.LIZ(), c0kjn.getExtraLogPb());
            }
            map2.put("extra_log_pb", json);
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 != null) {
                map2.put("room_id", Long.valueOf(room2.getId()));
            }
            Map<String, Object> trackInfo2 = c0kjn.getTrackInfo();
            if (trackInfo2 != null) {
                obj2 = trackInfo2.get("show_entrance");
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                str2 = "";
            }
            HashMap<String, Object> map3 = new HashMap<>();
            C516010KLn c516010KLn = C516010KLn.LIZ;
            Boolean boolValueOf = Boolean.valueOf(Intrinsics.LJFF(this.LLILZLL, "auto_sub"));
            c516010KLn.getClass();
            map3.put("type", Integer.valueOf(C516010KLn.LIZLLL(boolValueOf)));
            map3.put("order_id", "");
            map3.put("source", "normal_sub");
            map3.put("show_entrance", str2);
            if (room == null) {
                objValueOf = "";
            } else {
                objValueOf = Long.valueOf(room.getId());
            }
            map3.put("room_id", objValueOf);
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae().getClass();
            String toUid2 = c0kjn.getToUid();
            if (toUid2 == null) {
                toUid2 = "";
            }
            String packageId2 = c0kjn.getPackageId();
            if (packageId2 == null) {
                packageId2 = "";
            }
            EnumC513410KBn enumC513410KBnLIZ = C513500KBw.LIZ(toUid2, packageId2, false);
            if (C500260Jjc.LJJIIZ(c0kjn.getOfferToken()) && (enumC513410KBnLIZ == EnumC513410KBn.INCORRECT_GP_ACCOUNT || enumC513410KBnLIZ == EnumC513410KBn.INCORRECT_TIKTOK_OR_GP_ACCOUNT)) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    context = interfaceC634840OvC2.getContext();
                } else {
                    context = null;
                }
                FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
                if (fragmentManagerLJIL != null) {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae();
                    String anchorName = c0kjn.getAnchorName();
                    if (anchorName == null) {
                        anchorName = "";
                    }
                    C0KBB.LIZIZ(fragmentManagerLJIL, anchorName, enumC513410KBnLIZ);
                }
                completionBlock.onFailure(-801, "", (XBaseResultModel) C1909107dp.LIZJ(C0KJW.class, null));
                return;
            }
            Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map4 = LLJ;
            if (map4 != null && (collectionValues = map4.values()) != null) {
                List listLJIJJLI = C15438062q.LJIJJLI(collectionValues);
                arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) listLJIJJLI).iterator();
                while (it2.hasNext()) {
                    TemplateInfo templateInfo2 = ((SubscriptionProductDetailWithTemplateInfo) it2.next()).getTemplateInfo();
                    if (templateInfo2 != null) {
                        arrayList.add(templateInfo2);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(((TemplateInfo) next).iapId, c0kjn.getIapId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                templateInfo = (TemplateInfo) next;
            } else {
                arrayList = null;
                templateInfo = null;
            }
            if (templateInfo != null) {
                offerInfo = templateInfo.offerInfo;
            } else {
                offerInfo = null;
            }
            C513970KDr.LIZ(offerInfo);
            C513970KDr.LIZIZ(arrayList);
            this.LLILZIL.put("auto_discount_1m", C513970KDr.LIZ);
            this.LLILZIL.put("auto_discount_package_quantity_1m", C513970KDr.LIZIZ);
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                activityLIZLLL = interfaceC634840OvC3.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            WeakReference weakReference = new WeakReference(activityLIZLLL);
            if (Intrinsics.LJFF(packageId, "null")) {
                str3 = "";
            } else {
                str3 = packageId;
            }
            Boolean needOpenOnboarding = c0kjn.getNeedOpenOnboarding();
            if (needOpenOnboarding != null) {
                zBooleanValue = needOpenOnboarding.booleanValue();
            } else {
                zBooleanValue = false;
            }
            boolean zLJFF2 = Intrinsics.LJFF(this.LLILZLL, "auto_sub");
            String toUid3 = c0kjn.getToUid();
            if (toUid3 == null) {
                toUid3 = "";
            }
            boolean zLJFF3 = Intrinsics.LJFF(c0kjn.getFromId(), "sub_change_price_email");
            Map<String, String> map5 = this.LLILZIL;
            String str5 = this.LLILZLL;
            String strLIZJ = LIZJ(c0kjn.getFromId());
            String iapId2 = c0kjn.getIapId();
            if (iapId2 == null) {
                iapId2 = "";
            }
            C0KJK c0kjk = new C0KJK(weakReference, str3, zBooleanValue, zLJFF2, toUid3, zLJFF3, str5, iapId2, strLIZJ, map5);
            c0kjk.LIZIZ = str2;
            Number createContractIntent = c0kjn.getCreateContractIntent();
            if (createContractIntent != null) {
                iIntValue3 = createContractIntent.intValue();
            } else {
                iIntValue3 = 0;
            }
            c0kjk.LJIILL = iIntValue3;
            Number subCircle = c0kjn.getSubCircle();
            if (subCircle != null) {
                iIntValue4 = subCircle.intValue();
            } else {
                iIntValue4 = 0;
            }
            c0kjk.LJIILLIIL = iIntValue4;
            c0kjk.LJIJI = map3;
            String productId = c0kjn.getProductId();
            if (productId == null) {
                productId = "";
            }
            c0kjk.LJIJJ = productId;
            String skuName = c0kjn.getSkuName();
            if (skuName == null) {
                skuName = "";
            }
            c0kjk.LJIJJLI = skuName;
            c0kjk.LJIL = map2;
            String offerId2 = c0kjn.getOfferId();
            if (offerId2 == null) {
                offerId2 = "";
            }
            c0kjk.LJIIZILJ = offerId2;
            String offerToken = c0kjn.getOfferToken();
            if (offerToken != null) {
                str4 = offerToken;
            }
            c0kjk.LJJ = str4;
            c0kjk.LJJI = new C0KMQ() { // from class: X.0KJS
                @Override // X.C0KMQ
                public final void onFail(int i, String str6) {
                    this.LIZ.getClass();
                    C0KJW c0kjw = (C0KJW) C1909107dp.LIZJ(C0KJW.class, null);
                    c0kjw.setPayStatus(Integer.valueOf(i));
                    c0kjw.setPayMessage(str6);
                    c0kjw.setGetSkuResponse(null);
                    c0kjw.setPackageId("");
                    completionBlock.onFailure(i, str6, c0kjw);
                    C513970KDr.LIZ = "1";
                    C513970KDr.LIZIZ = CardStruct.IStatusCode.DEFAULT;
                }

                @Override // X.C0KMQ
                public final void LIZ(C0KJK c0kjk2, String str6, String str7, C515420KJg c515420KJg) {
                    SubscribeBadge subscribeBadge;
                    this.LIZ.getClass();
                    String str8 = null;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0KJW.class, null);
                    String str9 = packageId;
                    C0KJW c0kjw = (C0KJW) xBaseModelLIZJ;
                    c0kjw.setPayStatus(1);
                    c0kjw.setPayMessage(str7);
                    c0kjw.setGetSkuResponse(null);
                    c0kjw.setPackageId(str9);
                    if (c515420KJg != null) {
                        subscribeBadge = c515420KJg.LIZ;
                    } else {
                        subscribeBadge = null;
                    }
                    C0KIT.LIZ(c0kjk2, subscribeBadge);
                    if (c515420KJg != null) {
                        str8 = c515420KJg.LIZIZ;
                    }
                    C0KIT.LIZIZ(str8);
                    completionBlock.onSuccess(c0kjw, str7);
                    C513970KDr.LIZ = "1";
                    C513970KDr.LIZIZ = CardStruct.IStatusCode.DEFAULT;
                }
            };
            C0KJL c0kjl2 = (C0KJL) this.LLIZLLLIL.getValue();
            if (c0kjl2 == null || (c0kkgLIZ = c0kjl2.LIZ()) == null) {
                return;
            }
            c0kkgLIZ.LIZLLL(c0kjk);
            return;
        }
        Number action3 = c0kjn.getAction();
        if (action3 != null && action3.intValue() == 3) {
            Map<String, Object> trackInfo3 = c0kjn.getTrackInfo();
            if (trackInfo3 != null) {
                linkedHashMap = new LinkedHashMap(C500260Jjc.LLD(trackInfo3));
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            this.LLILZIL = linkedHashMap;
            ?? r3 = new C0KMQ() { // from class: X.0KJT
                @Override // X.C0KMQ
                public final void onFail(int i, String str6) {
                    this.LIZ.getClass();
                    C0KJW c0kjw = (C0KJW) C1549500qQO.LIZ(C0KJW.class);
                    c0kjw.setPayStatus(Integer.valueOf(i));
                    c0kjw.setPayMessage(str6);
                    c0kjw.setGetSkuResponse(null);
                    c0kjw.setPackageId("");
                    completionBlock.onFailure(0, str6, c0kjw);
                }

                @Override // X.C0KMQ
                public final void LIZ(C0KJK c0kjk2, String str6, String str7, C515420KJg c515420KJg) {
                    SubscribeBadge subscribeBadge;
                    this.LIZ.getClass();
                    String str8 = null;
                    C0KJW c0kjw = (C0KJW) C1909107dp.LIZJ(C0KJW.class, null);
                    c0kjw.setPayStatus(1);
                    c0kjw.setPayMessage(str7);
                    c0kjw.setGetSkuResponse(null);
                    c0kjw.setPackageId(c0kjw.getPackageId());
                    if (c515420KJg != null) {
                        subscribeBadge = c515420KJg.LIZ;
                    } else {
                        subscribeBadge = null;
                    }
                    C0KIT.LIZ(c0kjk2, subscribeBadge);
                    if (c515420KJg != null) {
                        str8 = c515420KJg.LIZIZ;
                    }
                    C0KIT.LIZIZ(str8);
                    completionBlock.onSuccess(c0kjw, str7);
                }
            };
            HashMap map6 = new HashMap();
            C516010KLn c516010KLn2 = C516010KLn.LIZ;
            Boolean boolValueOf2 = Boolean.valueOf(Intrinsics.LJFF(this.LLILZLL, "auto_sub"));
            c516010KLn2.getClass();
            map6.put("type", Integer.valueOf(C516010KLn.LIZLLL(boolValueOf2)));
            map6.put("order_id", "");
            map6.put("source", "recover_sub");
            Map<String, Object> trackInfo4 = c0kjn.getTrackInfo();
            if (trackInfo4 != null) {
                obj = trackInfo4.get("show_entrance");
            } else {
                obj = null;
            }
            if (!(obj instanceof String) || obj == null) {
                obj = "";
            }
            map6.put("show_entrance", obj);
            if (room == null) {
                lValueOf = "";
            } else {
                lValueOf = Long.valueOf(room.getId());
            }
            map6.put("room_id", lValueOf);
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                activityLIZLLL3 = interfaceC634840OvC4.LIZLLL();
            }
            String toUid4 = c0kjn.getToUid();
            if (toUid4 != null) {
                str4 = toUid4;
            }
            C0KKO c0kko2 = new C0KKO() { // from class: X.0KAQ
                @Override // X.C0KKO
                public final void LIZ(int i, String str6) {
                }

                @Override // X.C0KKO
                public final void LIZIZ() {
                }

                @Override // X.C0KKO
                public final void LIZJ(String str6) {
                }

                @Override // X.C0KKO
                public final void LIZLLL(int i, int i2, int i3, String str6, C0KH1 c0kh1) {
                }

                @Override // X.C0KKO
                public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map7, C0KH1 c0kh1) {
                }

                @Override // X.C0KKO
                public final void LJFF(long j, TemplateListData templateListData) {
                }
            };
            EnumC513490KBv enumC513490KBv2 = EnumC513490KBv.UNKNOWN;
            Number scene2 = c0kjn.getScene();
            if (scene2 != null) {
                iIntValue = scene2.intValue();
            } else {
                iIntValue = 0;
            }
            C0KJX c0kjx2 = new C0KJX(str4, false, iIntValue, "recover_sub", 0L, 0L, false, enumC513490KBv2, null, activityLIZLLL3, c0kko2, this.LLILZIL, false, 59696);
            C0KJL c0kjl3 = (C0KJL) this.LLIZLLLIL.getValue();
            if (c0kjl3 == null || (c0kkgLIZIZ = c0kjl3.LIZIZ()) == 0) {
                return;
            }
            c0kkgLIZIZ.LJI(c0kjx2, r3);
            return;
        }
        Number action4 = c0kjn.getAction();
        if (action4 != null && action4.intValue() == 5) {
            Number scene3 = c0kjn.getScene();
            if (scene3 == null) {
                return;
            }
            int iIntValue6 = scene3.intValue();
            C0KFS.Companion.getClass();
            for (C0KFS c0kfs : C0KFS.values()) {
                if (c0kfs.getValue() == iIntValue6) {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                    InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC5 != null) {
                        activityLIZLLL2 = interfaceC634840OvC5.LIZLLL();
                    }
                    C517110KPt.LJIILIIL(activityLIZLLL2, c0kfs);
                    return;
                }
            }
            return;
        }
        Number action5 = c0kjn.getAction();
        if (action5 == null || action5.intValue() != 4) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0KJR(this, completionBlock, null), 3);
    }
}
