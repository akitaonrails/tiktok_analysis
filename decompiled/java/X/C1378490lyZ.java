package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378490lyZ extends AbstractC1378510lyb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0lyc] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Integer numValueOf;
        InterfaceC1378500lya interfaceC1378500lya = (InterfaceC1378500lya) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        final InterfaceC1378540lye interfaceC1378540lye = (InterfaceC1378540lye) C1909107dp.LIZJ(InterfaceC1378540lye.class, null);
        LiveEvent liveEvent = new LiveEvent();
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            Gson gsonLJIILL = ((IUnKnownOwnershipBusinessOuterService) objPluggableSpi$default).LJIILL();
            liveEvent.setShowsIMForActivity(interfaceC1378500lya.getShowsIMForActivity());
            liveEvent.setEventID(interfaceC1378500lya.getId());
            liveEvent.setOrganizer((User) GsonProtectorUtils.fromJson(gsonLJIILL, C786410Ut5.J3(new JSONObject(interfaceC1378500lya.getOrganizer())), User.class));
            liveEvent.setTitle(interfaceC1378500lya.getTitle());
            liveEvent.setStartTime(interfaceC1378500lya.getStartTime());
            liveEvent.setInternalURL(interfaceC1378500lya.getInternalURL());
            liveEvent.setTrackInfo(GsonProtectorUtils.toJson(gsonLJIILL, interfaceC1378500lya.getTrackInfo()));
            liveEvent.setShareURL(interfaceC1378500lya.getShareURL());
            liveEvent.setAnchor(String.valueOf(interfaceC1378500lya.isAuthor()));
            liveEvent.setCustomActionItems(interfaceC1378500lya.getCustomActionItems());
            Number bulletinSharePolicy = interfaceC1378500lya.getBulletinSharePolicy();
            if (bulletinSharePolicy != null) {
                numValueOf = Integer.valueOf(bulletinSharePolicy.intValue());
            } else {
                numValueOf = null;
            }
            liveEvent.setBulletinSharePolicy(numValueOf);
            liveEvent.setBulletinAccountInfo(interfaceC1378500lya.getBulletinAccountInfo());
            liveEvent.setPopup(interfaceC1378500lya.isPopup());
            if (!TextUtils.isEmpty(liveEvent.getEventID()) && context != null) {
                ?? r3 = new C1355090lMp() { // from class: X.0lyc
                    @Override // X.C1355090lMp, X.InterfaceC1366490lfD
                    public final void LJI(Context context2, BaseSharePackage baseSharePackage) {
                        String string = baseSharePackage.extras.getString("share_platform");
                        if (string != null) {
                            interfaceC1378540lye.setShareCode(1);
                            interfaceC1378540lye.setButton(string);
                            completionBlock.onSuccess(interfaceC1378540lye, "");
                        } else {
                            interfaceC1378540lye.setShareCode(0);
                            interfaceC1378540lye.setButton("cancel");
                            completionBlock.onFailure(0, "cancel", interfaceC1378540lye);
                        }
                    }

                    @Override // X.C1355090lMp, X.InterfaceC1366490lfD
                    public final void LIZIZ(Context context2, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                        CompletionBlock<InterfaceC1378540lye> completionBlock2 = completionBlock;
                        InterfaceC1378540lye interfaceC1378540lye2 = interfaceC1378540lye;
                        interfaceC1378540lye2.setShareCode(1);
                        interfaceC1378540lye2.setButton(interfaceC1370310llN.key());
                        completionBlock2.onSuccess(interfaceC1378540lye2, "");
                    }

                    @Override // X.C1355090lMp, X.InterfaceC1361850lXj
                    public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context2) {
                        boolean z2;
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        String string5;
                        String str;
                        String string6;
                        String string7;
                        String string8;
                        Bundle bundle;
                        Bundle bundle2;
                        Bundle bundle3;
                        Bundle bundle4;
                        Bundle bundle5;
                        Bundle bundle6;
                        Bundle bundle7;
                        Bundle bundle8;
                        Bundle bundle9;
                        if (z) {
                            if (baseSharePackage != null && (bundle9 = baseSharePackage.extras) != null) {
                                z2 = bundle9.getBoolean("is_paid_event");
                            } else {
                                z2 = false;
                            }
                            if (baseSharePackage != null && (bundle8 = baseSharePackage.extras) != null) {
                                string = bundle8.getString("enter_from", "");
                            } else {
                                string = null;
                            }
                            String str2 = CardStruct.IStatusCode.DEFAULT;
                            if (baseSharePackage != null && (bundle7 = baseSharePackage.extras) != null) {
                                string2 = bundle7.getString("live_event_is_anchor", CardStruct.IStatusCode.DEFAULT);
                            } else {
                                string2 = null;
                            }
                            if (baseSharePackage != null && (bundle6 = baseSharePackage.extras) != null) {
                                string3 = bundle6.getString("business_type", "");
                            } else {
                                string3 = null;
                            }
                            if (baseSharePackage != null && (bundle5 = baseSharePackage.extras) != null) {
                                string4 = bundle5.getString("has_registered", "");
                            } else {
                                string4 = null;
                            }
                            if (baseSharePackage != null && (bundle4 = baseSharePackage.extras) != null) {
                                string5 = bundle4.getString("live_event_status", "");
                            } else {
                                string5 = null;
                            }
                            if (Intrinsics.LJFF(string2, "1")) {
                                str = "livesdk_live_event_anchor_share_confirm";
                            } else {
                                str = "livesdk_live_event_user_share_confirm";
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            if (baseSharePackage != null && (bundle3 = baseSharePackage.extras) != null) {
                                string6 = bundle3.getString("live_event_id");
                            } else {
                                string6 = null;
                            }
                            c2344009Gk.LJIIIIZZ("live_event_id", string6);
                            if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null) {
                                string7 = bundle2.getString("live_event_author_id");
                            } else {
                                string7 = null;
                            }
                            c2344009Gk.LJIIIIZZ("author_id", string7);
                            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
                                string8 = bundle.getString("live_event_author_id");
                            } else {
                                string8 = null;
                            }
                            c2344009Gk.LJIIIIZZ("anchor_id", string8);
                            c2344009Gk.LJIIIIZZ("is_anchor", string2);
                            c2344009Gk.LJIIIIZZ("platform", interfaceC1369790lkX.key());
                            c2344009Gk.LJIIIIZZ("enter_from", string);
                            c2344009Gk.LJIIIIZZ("event_page", string);
                            if (!z2) {
                                str2 = "1";
                            }
                            c2344009Gk.LJIIIIZZ("is_free", str2);
                            c2344009Gk.LJIIIIZZ("live_event_status", string5);
                            c2344009Gk.LJIIIIZZ("business_type", string3);
                            c2344009Gk.LJIIIIZZ("has_registered", string4);
                            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
                        }
                    }
                };
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    ((ShareService) ServiceManager.get().getService(ShareService.class)).LJJL(activityLIZ, liveEvent, r3, this.IBridgeSdkContext);
                    return;
                } else {
                    interfaceC1378540lye.setShareCode(0);
                    completionBlock.onFailure(0, "activity is null", interfaceC1378540lye);
                }
            } else {
                C2382909Vj.LIZ(completionBlock, 0, "id or context is null", null, 4);
            }
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
