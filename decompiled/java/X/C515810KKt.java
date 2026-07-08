package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlyVideoPinCardPriceDisableSetting;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515810KKt {
    public static TemplateInfo LIZ(TemplateListData templateListData) {
        TemplateInfo templateInfo;
        TemplateInfo next;
        Iterator<TemplateInfo> it2 = templateListData.templateList.iterator();
        while (true) {
            templateInfo = null;
            if (it2.hasNext()) {
                next = it2.next();
                TemplateInfo templateInfo2 = next;
                if (templateInfo2.isDefaultPackage && templateInfo2.tplType == 2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TemplateInfo templateInfo3 = next;
        if (templateInfo3 == null) {
            Iterator<TemplateInfo> it3 = templateListData.templateList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                TemplateInfo next2 = it3.next();
                TemplateInfo templateInfo4 = next2;
                if (templateInfo4.isDefaultPackage && templateInfo4.tplType == 2) {
                    templateInfo = next2;
                    break;
                }
            }
            return templateInfo;
        }
        return templateInfo3;
    }

    public static void LIZIZ(SubPinCard subPinCard, String str, String str2) {
        subPinCard.LIZ.put("original_price", str);
        subPinCard.LIZ.put("discount_price", str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPriceIntoExtraInfo ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("SubPinPerkCardPriceLogicHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(Context context, Room room, final SubPinCard subPinCard, final Function0<Unit> function0) {
        int i;
        String secUid;
        User owner;
        String secUid2;
        Pair<C470590Icr<TemplateListData>, TemplateListData> pair;
        TemplateListData second;
        TemplateInfo templateInfoLIZ;
        String str;
        User owner2;
        User owner3;
        SubscribeInfo subscribeInfo;
        if (subPinCard.templateId == 200 && !LiveSubOnlyVideoPinCardPriceDisableSetting.INSTANCE.getValue()) {
            Map<String, Object> map = subPinCard.LIZ;
            if (room != null && (owner3 = room.getOwner()) != null && (subscribeInfo = owner3.getSubscribeInfo()) != null) {
                i = subscribeInfo.status;
            } else {
                i = 0;
            }
            map.put("pay_status", Integer.valueOf(i));
            String str2 = "";
            if (room == null || (owner2 = room.getOwner()) == null || (secUid = owner2.getSecUid()) == null) {
                secUid = "";
            }
            C510150JzZ c510150JzZ = (C510150JzZ) ((LinkedHashMap) C513500KBw.LIZIZ).get(C513500KBw.LIZLLL(0, secUid));
            if (c510150JzZ != null && (pair = c510150JzZ.LIZ) != null && (second = pair.getSecond()) != null && (templateInfoLIZ = LIZ(second)) != null) {
                String str3 = templateInfoLIZ.moneyDisplay;
                OfferInfo offerInfo = templateInfoLIZ.offerInfo;
                if (offerInfo != null && (str = offerInfo.discountMoneyDisplay) != null) {
                    str2 = str;
                }
                LIZIZ(subPinCard, str3, str2);
                function0.invoke();
                return;
            }
            if (room != null && (owner = room.getOwner()) != null && (secUid2 = owner.getSecUid()) != null) {
                str2 = secUid2;
            }
            C0KJX c0kjx = new C0KJX(str2, true, 0, "prefetch_sub_for_sov_pin", 0L, 0L, false, EnumC513490KBv.ANY, null, context, new C0KKO() { // from class: X.0KKu
                @Override // X.C0KKO
                public final void LIZIZ() {
                }

                @Override // X.C0KKO
                public final void LIZJ(String str4) {
                }

                @Override // X.C0KKO
                public final void LIZLLL(int i2, int i3, int i4, String str4, C0KH1 c0kh1) {
                }

                @Override // X.C0KKO
                public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map2, C0KH1 c0kh1) {
                }

                @Override // X.C0KKO
                public final void LIZ(int i2, String str4) {
                    function0.invoke();
                }

                @Override // X.C0KKO
                public final void LJFF(long j, TemplateListData templateListData) {
                    String str4;
                    this.LIZ.getClass();
                    TemplateInfo templateInfoLIZ2 = C515810KKt.LIZ(templateListData);
                    if (templateInfoLIZ2 != null) {
                        C515810KKt c515810KKt = this.LIZ;
                        SubPinCard subPinCard2 = subPinCard;
                        Function0<Unit> function02 = function0;
                        String str5 = templateInfoLIZ2.moneyDisplay;
                        OfferInfo offerInfo2 = templateInfoLIZ2.offerInfo;
                        if (offerInfo2 == null || (str4 = offerInfo2.discountMoneyDisplay) == null) {
                            str4 = "";
                        }
                        c515810KKt.getClass();
                        C515810KKt.LIZIZ(subPinCard2, str5, str4);
                        function02.invoke();
                        return;
                    }
                    function0.invoke();
                }
            }, null, false, 63792);
            C0KKG c0kkg = new C0KKG();
            c0kkg.LIZ();
            AbstractC515830KKv<?> abstractC515830KKv = c0kkg.LL;
            if (abstractC515830KKv != null) {
                abstractC515830KKv.LIZLLL(c0kjx);
                return;
            }
            return;
        }
        function0.invoke();
    }
}
