package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalPresetWebLinkSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.other.FAQSettings;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS121S1100000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493580JXg {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC493650JXn LIZJ;
    public DialogC780480UjW LJ;
    public long LJII;
    public final LiveSubscribeLynxMap LIZLLL = LiveSubscribeLynxUrl.INSTANCE.getValue();
    public final InterfaceC493630JXl[] LJFF = {new InterfaceC493630JXl() { // from class: X.0JXk
        @Override // X.InterfaceC493630JXl
        public final boolean LIZ(Bundle bundle) {
            if (bundle.getInt("route_subs_settings") == 1) {
                return true;
            }
            return false;
        }
    }, new InterfaceC493630JXl() { // from class: X.0JXj
        @Override // X.InterfaceC493630JXl
        public final boolean LIZ(Bundle bundle) {
            if (bundle.getInt("open_subscription") == 1) {
                return true;
            }
            return false;
        }
    }, new InterfaceC493630JXl() { // from class: X.0JXi
        @Override // X.InterfaceC493630JXl
        public final boolean LIZ(Bundle bundle) {
            if (bundle.getInt("open_sub_invitation") == 1) {
                return true;
            }
            return false;
        }
    }, new InterfaceC493630JXl() { // from class: X.0JXh
        @Override // X.InterfaceC493630JXl
        public final boolean LIZ(Bundle bundle) {
            if (bundle.getInt("live_goal_widget") == 1) {
                return true;
            }
            return false;
        }
    }};
    public String LJI = "live_take_page";

    public final boolean LIZIZ(final Bundle bundle) {
        String strOptString;
        if (this.LIZ == null || bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (InterfaceC493630JXl interfaceC493630JXl : this.LJFF) {
            if (interfaceC493630JXl.LIZ(bundle)) {
                if (interfaceC493630JXl instanceof C493610JXj) {
                    if (FAQSettings.INSTANCE.getValue()) {
                        InterfaceC493650JXn interfaceC493650JXn = this.LIZJ;
                        if (interfaceC493650JXn != null) {
                            interfaceC493650JXn.LIZIZ(this.LIZ, this.LIZLLL.getAnchor_low_version_popup(), "live_take_page", "live_take_page", "", "page");
                        }
                    } else {
                        this.LJI = bundle.getString("show_entrance", "live_take_page");
                        Context context = this.LIZ;
                        if (context != null) {
                            if (this.LJ == null) {
                                C780470UjV c780470UjV = new C780470UjV(context);
                                c780470UjV.LIZIZ = C497740JfY.LJIJI(2131853470);
                                this.LJ = c780470UjV.LIZ();
                            }
                            DialogC780480UjW dialogC780480UjW = this.LJ;
                            if (dialogC780480UjW != null) {
                                C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC780480UjW);
                            }
                            InterfaceC493650JXn interfaceC493650JXn2 = this.LIZJ;
                            if (interfaceC493650JXn2 != null) {
                                interfaceC493650JXn2.LIZJ(new InterfaceC492450JSx() { // from class: X.0JXe
                                    @Override // X.InterfaceC492450JSx
                                    public final void LIZ(Throwable th) {
                                    }

                                    @Override // X.InterfaceC492450JSx
                                    public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                                        InterfaceC493650JXn interfaceC493650JXn3;
                                        C493580JXg c493580JXg = this.LIZ;
                                        Bundle bundle2 = bundle;
                                        DialogC780480UjW dialogC780480UjW2 = c493580JXg.LJ;
                                        if (dialogC780480UjW2 != null) {
                                            C500260Jjc.LJJLIIIJL(dialogC780480UjW2);
                                        }
                                        Context context2 = c493580JXg.LIZ;
                                        if (context2 != null && (interfaceC493650JXn3 = c493580JXg.LIZJ) != null) {
                                            interfaceC493650JXn3.LJ(context2, c493580JXg.LJI, "live_take_page", "", new AwS251S0300000_7(bundle2, c493580JXg, context2, 10));
                                        }
                                    }
                                });
                                return true;
                            }
                        }
                    }
                } else if (interfaceC493630JXl instanceof C493620JXk) {
                    this.LJI = bundle.getString("show_entrance", "live_take_page");
                    Context context2 = this.LIZ;
                    if (context2 != null) {
                        if (this.LJ == null) {
                            C780470UjV c780470UjV2 = new C780470UjV(context2);
                            c780470UjV2.LIZIZ = C497740JfY.LJIJI(2131853470);
                            this.LJ = c780470UjV2.LIZ();
                        }
                        DialogC780480UjW dialogC780480UjW2 = this.LJ;
                        if (dialogC780480UjW2 != null) {
                            C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC780480UjW2);
                        }
                        InterfaceC493650JXn interfaceC493650JXn3 = this.LIZJ;
                        if (interfaceC493650JXn3 != null) {
                            interfaceC493650JXn3.LIZJ(new InterfaceC492450JSx() { // from class: X.0JXf
                                @Override // X.InterfaceC492450JSx
                                public final void LIZ(Throwable th) {
                                }

                                @Override // X.InterfaceC492450JSx
                                public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                                    InterfaceC493650JXn interfaceC493650JXn4;
                                    DialogC780480UjW dialogC780480UjW3 = this.LIZ.LJ;
                                    if (dialogC780480UjW3 != null) {
                                        C500260Jjc.LJJLIIIJL(dialogC780480UjW3);
                                    }
                                    C493580JXg c493580JXg = this.LIZ;
                                    Context context3 = c493580JXg.LIZ;
                                    if (context3 != null && (interfaceC493650JXn4 = c493580JXg.LIZJ) != null) {
                                        interfaceC493650JXn4.LJ(context3, c493580JXg.LJI, "live_take_page", "", new AwS551S0100000_7(c493580JXg, 553));
                                    }
                                }
                            });
                            return true;
                        }
                    }
                } else if (interfaceC493630JXl instanceof C493600JXi) {
                    this.LJII = System.currentTimeMillis();
                    this.LJI = bundle.getString("show_entrance", "live_take_page");
                    String string = bundle.getString("code", "");
                    String string2 = bundle.getString("open_type", "");
                    if (Intrinsics.LJFF(string2, "code")) {
                        InterfaceC493650JXn interfaceC493650JXn4 = this.LIZJ;
                        if (interfaceC493650JXn4 != null) {
                            interfaceC493650JXn4.LIZLLL(this.LJI, string, new AwS121S1100000_7(this, string, 3));
                            return true;
                        }
                    } else if (Intrinsics.LJFF(string2, "url_key")) {
                        String string3 = bundle.getString("open_url_key", "");
                        if (!TextUtils.isEmpty(string3) && this.LIZ != null) {
                            SubscribeInvitationLynxUrlSetting subscribeInvitationLynxUrlSetting = SubscribeInvitationLynxUrlSetting.INSTANCE;
                            if (C1533950q1J.LJ(subscribeInvitationLynxUrlSetting.getValue().optString(string3))) {
                                strOptString = subscribeInvitationLynxUrlSetting.getValue().optString(string3);
                            } else {
                                LiveSubscribeLynxUrl liveSubscribeLynxUrl = LiveSubscribeLynxUrl.INSTANCE;
                                if (C1533950q1J.LJ(liveSubscribeLynxUrl.getJsonValue().optString(string3))) {
                                    strOptString = liveSubscribeLynxUrl.getJsonValue().optString(string3);
                                }
                            }
                            if (strOptString != null) {
                                InterfaceC493650JXn interfaceC493650JXn5 = this.LIZJ;
                                if (interfaceC493650JXn5 != null) {
                                    interfaceC493650JXn5.LIZIZ(this.LIZ, strOptString, this.LJI, "live_take_page", "", "page");
                                }
                                LIZ(this.LJI, strOptString, true);
                                return true;
                            }
                        }
                    }
                } else if (interfaceC493630JXl instanceof C493590JXh) {
                    String value = LiveStreamGoalPresetWebLinkSetting.INSTANCE.getValue();
                    try {
                        Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                        builderBuildUpon.appendQueryParameter("entrance", "message");
                        builderBuildUpon.appendQueryParameter("live_type", LiveMode.VIDEO.logStreamingType);
                        value = builderBuildUpon.build().toString();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LIZ, value);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public C493580JXg(Context context, DataChannel dataChannel, InterfaceC493650JXn interfaceC493650JXn) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC493650JXn;
    }

    public final void LIZ(String str, String str2, boolean z) {
        String str3;
        if (this.LJII <= 0) {
            return;
        }
        if (z) {
            str3 = "livesdk_subscription_invitation_live_take_duration";
        } else {
            str3 = "livesdk_subscription_invitation_live_take_failed";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LJJII("live_take_page", "event_page");
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "to_page");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LJII), "duration");
        c474500IjALIZ.LIZ();
    }
}
