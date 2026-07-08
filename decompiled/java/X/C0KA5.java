package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.room.PlanChangeSuccessEvent;
import com.bytedance.android.live.room.ResubscribeSuccessEvent;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KA5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KA5 implements C0KA9 {
    public static final C0KA5 LIZ = new C0KA5();

    @Override // X.C0KA9
    public final void LIZIZ() {
    }

    @Override // X.C0KA9
    public final void jw(C0KAG c0kag, final C0K90 c0k90) {
        C480460Ism.LIZ().getClass();
        C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getUserInfo(c0kag.LIZ, c0kag.LIZIZ, c0kag.LIZJ, c0kag.LIZLLL), EnumC510330Jzr.GENERAL, "SubscriptionTrialLiveCardWidget", "sub/user/info", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0K9k
            @Override // X.C09JN
            public final void accept(Object obj) {
                T t;
                C1C7U.LIZ("SubscriptionStatusServiceHelper@46b2.fetchAnchorSubscribeInfo$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (t = baseResponse.data) != null) {
                    c0k90.invoke(t);
                }
                C1C7U.LIZIZ("SubscriptionStatusServiceHelper@46b2.fetchAnchorSubscribeInfo$1");
            }
        }, new C09JN() { // from class: X.00M7
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SubscriptionStatusServiceHelper@46b2.fetchAnchorSubscribeInfo$2");
                C1C7U.LIZIZ("SubscriptionStatusServiceHelper@46b2.fetchAnchorSubscribeInfo$2");
            }
        });
    }

    @Override // X.C0KA9
    public final void LIZJ(String str, Object obj, LifecycleOwner lifecycleOwner, Function2<? super AbstractC509530JyZ, ? super C0KAI, Unit> function2) {
        boolean z;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        DataChannelGlobal.LLILZ.BQ2(obj, lifecycleOwner, SubscribeSuccessEvent.class, new C0KA6(str, function2, z));
        DataChannelGlobal.LLILZ.BQ2(obj, lifecycleOwner, ResubscribeSuccessEvent.class, new C0KA7(str, function2, z));
        DataChannelGlobal.LLILZ.BQ2(obj, lifecycleOwner, PlanChangeSuccessEvent.class, new C0KA8(str, function2, z));
    }

    public static C0KAB LIZLLL(User user, AbstractC509530JyZ abstractC509530JyZ, AbstractC509530JyZ abstractC509530JyZ2, C0KAI c0kai, String str) throws JSONException {
        String secUid;
        SubscribeInfo subscribeInfo;
        int i;
        C0KAB c0kab;
        C0KAE c0kae = new C0KAE(str);
        if (user != null) {
            secUid = user.getSecUid();
        } else {
            secUid = null;
        }
        String str2 = abstractC509530JyZ2.LIZIZ;
        if (abstractC509530JyZ != null) {
            if (Intrinsics.LJFF(abstractC509530JyZ, abstractC509530JyZ2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Not updating Anchor ");
                sbLIZ.append(secUid);
                sbLIZ.append(" to ");
                sbLIZ.append(str2);
                sbLIZ.append(" by ");
                sbLIZ.append(c0kai);
                sbLIZ.append(", as it is already in this status.");
                c0kae.invoke(C2188811AlT.LIZIZ(sbLIZ));
                c0kab = C0KAB.NOT_UPDATING;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Updated Anchor ");
                sbLIZ2.append(secUid);
                sbLIZ2.append(" to ");
                sbLIZ2.append(str2);
                sbLIZ2.append(" by ");
                sbLIZ2.append(c0kai);
                sbLIZ2.append('.');
                c0kae.invoke(C2188811AlT.LIZIZ(sbLIZ2));
                LIZ.getClass();
                if (Intrinsics.LJFF(abstractC509530JyZ2, C509520JyY.LIZJ)) {
                    if (user != null) {
                        SubscribeInfo subscribeInfo2 = user.getSubscribeInfo();
                        if (subscribeInfo2 != null) {
                            subscribeInfo2.setSubscribed(false);
                        }
                        SubscribeInfo subscribeInfo3 = user.getSubscribeInfo();
                        if (subscribeInfo3 != null) {
                            subscribeInfo3.setInGracePeriod(false);
                        }
                    }
                } else if (Intrinsics.LJFF(abstractC509530JyZ2, C509540Jya.LIZJ)) {
                    if (user != null) {
                        SubscribeInfo subscribeInfo4 = user.getSubscribeInfo();
                        if (subscribeInfo4 != null) {
                            subscribeInfo4.setSubscribed(false);
                        }
                        SubscribeInfo subscribeInfo5 = user.getSubscribeInfo();
                        if (subscribeInfo5 != null) {
                            subscribeInfo5.setInGracePeriod(true);
                        }
                    }
                } else if (abstractC509530JyZ2 instanceof C512060K6i) {
                    C512060K6i c512060K6i = (C512060K6i) abstractC509530JyZ2;
                    C512220K6y c512220K6y = c512060K6i.LIZJ;
                    int i2 = 2;
                    if (c512220K6y != null) {
                        if (user != null) {
                            SubscribeInfo subscribeInfo6 = user.getSubscribeInfo();
                            if (subscribeInfo6 != null) {
                                subscribeInfo6.packageId = c512220K6y.LJ;
                            }
                            SubscribeInfo subscribeInfo7 = user.getSubscribeInfo();
                            if (subscribeInfo7 != null) {
                                subscribeInfo7.setSubscribeBadge(c512220K6y.LIZ);
                            }
                            SubscribeInfo subscribeInfo8 = user.getSubscribeInfo();
                            if (subscribeInfo8 != null) {
                                if (c512220K6y.LIZLLL) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                                subscribeInfo8.status = i;
                            }
                            user.setSubscribeStatus(true);
                        }
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).pa();
                        C1108110ewT.LJIIJJI();
                    }
                    if (c512060K6i.LIZLLL != null && user != null && (subscribeInfo = user.getSubscribeInfo()) != null) {
                        subscribeInfo.status = 2;
                    }
                    C0KAH c0kah = c512060K6i.LJ;
                    if (c0kah != null && user != null) {
                        SubscribeInfo subscribeInfo9 = user.getSubscribeInfo();
                        if (subscribeInfo9 != null) {
                            subscribeInfo9.packageId = c0kah.LIZJ;
                        }
                        SubscribeInfo subscribeInfo10 = user.getSubscribeInfo();
                        if (subscribeInfo10 != null) {
                            subscribeInfo10.setSubscribeBadge(c0kah.LIZIZ);
                        }
                        SubscribeInfo subscribeInfo11 = user.getSubscribeInfo();
                        if (subscribeInfo11 != null) {
                            if (!c0kah.LIZLLL) {
                                i2 = 1;
                            }
                            subscribeInfo11.status = i2;
                        }
                        user.setSubscribeStatus(true);
                    }
                } else {
                    throw new C1954807lC();
                }
                c0kab = C0KAB.UPDATED;
            }
            if (c0kab != null) {
                return c0kab;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Failed to update Anchor ");
        sbLIZ3.append(secUid);
        sbLIZ3.append(" to ");
        sbLIZ3.append(str2);
        sbLIZ3.append(" by ");
        sbLIZ3.append(c0kai);
        sbLIZ3.append('.');
        c0kae.invoke(C2188811AlT.LIZIZ(sbLIZ3));
        return C0KAB.FAILED;
    }

    @Override // X.C0KA9
    public final C0KAB LIZ(User user, AbstractC509530JyZ abstractC509530JyZ, AbstractC509530JyZ abstractC509530JyZ2, C0KAI c0kai, String str) {
        C512060K6i c512060K6i;
        if (c0kai == C0KAC.GIFT_SUB_ACCEPTED) {
            if ((abstractC509530JyZ2 instanceof C512060K6i) && (c512060K6i = (C512060K6i) abstractC509530JyZ2) != null && c512060K6i.LIZJ != null) {
                C0KA5 c0ka5 = LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Update by ");
                sbLIZ.append(c0kai);
                sbLIZ.append(" is internally interpreted as by ");
                sbLIZ.append(C0KAA.SUBSCRIBE_SUCCESS);
                sbLIZ.append(" =>");
                C2188811AlT.LIZIZ(sbLIZ);
                c0ka5.getClass();
                C0KAB c0kab = C0KAB.PENDING;
                if (c0kab != null) {
                    return c0kab;
                }
            }
            return LIZLLL(user, abstractC509530JyZ, abstractC509530JyZ2, c0kai, str);
        }
        if (c0kai != C0KAA.SUBSCRIBE_SUCCESS && c0kai != C0KAA.RESUBSCRIBE_SUCCESS && c0kai != C0KAA.PLAN_CHANGE_SUCCESS) {
            throw new C1954807lC();
        }
        return LIZLLL(user, abstractC509530JyZ, abstractC509530JyZ2, c0kai, str);
    }
}
