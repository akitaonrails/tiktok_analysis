package X;

import Y.ARunnableS86S0200000_17;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.game.model.BriefCreatorCode;
import com.bytedance.android.livesdk.game.model.BriefGame;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.SalesCPSInfo;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipPropsSalesCctSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0yyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878450yyx implements InterfaceC1102810env, InterfaceC484670IzZ, InterfaceC1141530foN {
    public final boolean LL;
    public boolean LLILLJJLI;
    public Context LLILLL;
    public LifecycleOwner LLILZ;
    public DataChannel LLILZIL;
    public Room LLILZLL;
    public boolean LLIZ;
    public UserInfo LLIZLLLIL;
    public LiveIconView LLJ;
    public C20743416Fc LLJI;
    public AnonymousClass0956 LLJIJIL;
    public AnonymousClass0956 LLJILJIL;

    @Override // X.InterfaceC1102810env
    public final Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final Integer LJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceC1102810env
    public final long g0() {
        return 500L;
    }

    @Override // X.InterfaceC1102810env
    public final boolean x0(View view) {
        return false;
    }

    public final void LJFF() {
        BriefGameTask briefGameTask;
        Context context;
        PartnershipTask partnershipTask;
        SalesCPSInfo salesCPSInfo;
        Context context2 = this.LLILLL;
        if (context2 == null) {
            return;
        }
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel == null || (briefGameTask = (BriefGameTask) dataChannel.gg0(C168J.class)) == null) {
            return;
        }
        PartnershipTask partnershipTask2 = briefGameTask.task;
        int i = partnershipTask2 != null ? partnershipTask2.androidAgeLimit : 0;
        UserInfo userInfo = this.LLIZLLLIL;
        int i2 = userInfo != null ? userInfo.minAge : 0;
        if (i > 0 && i2 > 0 && i > i2) {
            iGamePartnershipService.bO(context2, "user", "game_live");
            return;
        }
        if (this.LLILLJJLI || (context = this.LLILLL) == null) {
            return;
        }
        if (partnershipTask2 != null && Integer.valueOf(partnershipTask2.taskMode) != null && (partnershipTask = briefGameTask.task) != null && partnershipTask.taskMode == 40 && (salesCPSInfo = briefGameTask.salesCpsInfo) != null && salesCPSInfo.schema != null) {
            LJIIIZ(briefGameTask);
            return;
        }
        String str = briefGameTask.gameDetailPageSchema;
        if (str != null) {
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
            for (Map.Entry<String, String> entry : LJII().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!c760370TsBLIZ.LIZJ(key)) {
                    c760370TsBLIZ.LJJIFFI(key, value);
                }
            }
            C1884390z8X c1884390z8XV01 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).V01();
            if (c1884390z8XV01 != null) {
                c1884390z8XV01.LIZ(context, c760370TsBLIZ.LIZ().toString(), C2097608Jq.LJ());
            }
        }
    }

    public final void LJI() {
        Activity activityLIZ;
        Context context = this.LLILLL;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).BP0(activityLIZ, "user", "game_live", new AwS642S0100000_28(this, 60));
    }

    public final Map<String, String> LJII() {
        String str;
        String str2;
        String str3;
        String str4;
        BriefGame briefGame;
        BriefGame briefGame2;
        BriefGame briefGame3;
        PartnershipTask partnershipTask;
        PartnershipTask partnershipTask2;
        LiveMode liveMode;
        DataChannel dataChannel = this.LLILZIL;
        String str5 = null;
        BriefGameTask briefGameTask = dataChannel != null ? (BriefGameTask) dataChannel.gg0(C168J.class) : null;
        Pair[] pairArr = new Pair[23];
        String str6 = CardStruct.IStatusCode.DEFAULT;
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("promote_task_type", "1");
        pairArr[2] = new Pair("live_traffic_source", C0IXW.LIZLLL(this.LLILZIL) ? "ad" : "normal");
        pairArr[3] = new Pair("is_host", CardStruct.IStatusCode.DEFAULT);
        Room room = this.LLILZLL;
        pairArr[4] = new Pair("request_id", String.valueOf(room != null ? room.getRequestId() : null));
        w.LIZ.getClass();
        pairArr[5] = new Pair("action_type", w.LIZLLL());
        pairArr[6] = new Pair("enter_method", w.LJIIL());
        pairArr[7] = new Pair("enter_from_merge", w.LJIIIZ());
        Room room2 = this.LLILZLL;
        pairArr[8] = new Pair("content_id", String.valueOf(room2 != null ? Long.valueOf(room2.getId()) : null));
        Room room3 = this.LLILZLL;
        pairArr[9] = new Pair("room_id", String.valueOf(room3 != null ? Long.valueOf(room3.getId()) : null));
        pairArr[10] = new Pair("host_id", String.valueOf(w.LJ()));
        pairArr[11] = new Pair("is_landscape", this.LL ? CardStruct.IStatusCode.DEFAULT : "1");
        pairArr[12] = new Pair("popup_follow_activity_ui", CardStruct.IStatusCode.DEFAULT);
        if (this.LLIZ) {
            str6 = "1";
        }
        pairArr[13] = new Pair("is_pin", str6);
        pairArr[14] = new Pair("page_from", "icon");
        DataChannel dataChannel2 = this.LLILZIL;
        String str7 = "";
        pairArr[15] = new Pair("live_type", (dataChannel2 == null || (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null) ? "" : C354201Zc.LIZ(liveMode));
        if (briefGameTask == null || (partnershipTask2 = briefGameTask.task) == null || (str = partnershipTask2.idStr) == null) {
            str = "";
        }
        pairArr[16] = new Pair("task_id", str);
        if (briefGameTask == null || (partnershipTask = briefGameTask.task) == null || (str2 = partnershipTask.gameIdStr) == null) {
            str2 = "";
        }
        pairArr[17] = new Pair("game_id", str2);
        pairArr[18] = new Pair("game_tag_id", String.valueOf((briefGameTask == null || (briefGame3 = briefGameTask.briefGame) == null) ? null : briefGame3.gameTagId));
        pairArr[19] = new Pair("game_tag_name", String.valueOf((briefGameTask == null || (briefGame2 = briefGameTask.briefGame) == null) ? null : briefGame2.gameTagName));
        if (briefGameTask != null && (briefGame = briefGameTask.briefGame) != null) {
            str5 = briefGame.headerImageUrl;
        }
        pairArr[20] = new Pair("header_image_url", String.valueOf(str5));
        if (briefGameTask == null || (str3 = briefGameTask.logExtra) == null) {
            str3 = "";
        }
        pairArr[21] = new Pair("log_extra", str3);
        if (briefGameTask != null && (str4 = briefGameTask.extraParams) != null) {
            str7 = str4;
        }
        pairArr[22] = new Pair("extra_params", str7);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1102810env
    public final void LLILLJJLI() {
        LiveIconView liveIconView = this.LLJ;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.d_o);
        }
        LiveIconView liveIconView2 = this.LLJ;
        if (liveIconView2 != null) {
            liveIconView2.LJ();
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LLILZ() {
        LiveIconView liveIconView = this.LLJ;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.dsx);
        }
        LiveIconView liveIconView2 = this.LLJ;
        if (liveIconView2 != null) {
            liveIconView2.setIconTintAttr(R.attr.exs);
        }
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 165;
    }

    @Override // X.InterfaceC1102810env
    public final void J() {
        LLILLJJLI();
    }

    @Override // X.InterfaceC1102810env
    public final C0KX7 LIZ() {
        return C0KX7.FIXED;
    }

    public C1878450yyx(boolean z) {
        this.LL = z;
    }

    public final void LJIIIZ(final BriefGameTask briefGameTask) throws Throwable {
        SalesCPSInfo salesCPSInfo;
        final String str;
        Context context = this.LLILLL;
        if (context != null && (salesCPSInfo = briefGameTask.salesCpsInfo) != null && (str = salesCPSInfo.schema) != null) {
            if (!this.LL) {
                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                C0IF2 c0if2 = new C0IF2(1);
                c0if2.LIZJ = new InterfaceC463410IFf() { // from class: X.0yyy
                    @Override // X.InterfaceC463410IFf
                    public final void LIZ(C19EG c19eg) throws Throwable {
                        Context context2 = c19eg;
                        if (c19eg == null) {
                            Context context3 = this.LIZ.LLILLL;
                            context2 = context3;
                            if (context3 == null) {
                                return;
                            }
                        }
                        C1878450yyx c1878450yyx = this.LIZ;
                        BriefGameTask briefGameTask2 = briefGameTask;
                        String str2 = str;
                        str2.toString();
                        c1878450yyx.getClass();
                        C1878450yyx.LJIIIIZZ(context2, briefGameTask2, str2);
                    }
                };
                c784440UpuLIZ.LIZIZ(c0if2);
                return;
            }
            LJIIIIZZ(context, briefGameTask, str);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws Throwable {
        DataChannel dataChannel;
        BriefGameTask briefGameTask;
        if (Intrinsics.LJFF(c262100zr.LIZ, "gamepad_open_propsale_web") && !this.LLILLJJLI && (dataChannel = this.LLILZIL) != null && (briefGameTask = (BriefGameTask) dataChannel.gg0(C168J.class)) != null) {
            LJIIIZ(briefGameTask);
        }
    }

    @Override // X.InterfaceC1102810env
    public final void onClick(View view) {
        boolean z;
        String strLIZIZ;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        BriefGame briefGame;
        String str9;
        PartnershipTask partnershipTask;
        PartnershipTask partnershipTask2;
        PartnershipTask partnershipTask3;
        SalesCPSInfo salesCPSInfo;
        PartnershipTask partnershipTask4;
        SalesCPSInfo salesCPSInfo2;
        PartnershipTask partnershipTask5;
        BriefCreatorCode briefCreatorCode;
        String str10;
        Integer numValueOf;
        BriefCreatorCode briefCreatorCode2;
        BriefCreatorCode briefCreatorCode3;
        String str11;
        Room room;
        DataChannel dataChannel;
        Context context = this.LLILLL;
        if (context != null && (room = this.LLILZLL) != null && (dataChannel = this.LLILZIL) != null) {
            UserInfo userInfo = this.LLIZLLLIL;
            if (userInfo == null) {
                ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).Nq0(context, room, dataChannel, new AwS607S0100000_28(this, 185));
            } else if (userInfo.minAge <= 0) {
                LJI();
            } else {
                LJFF();
            }
        }
        DataChannel dataChannel2 = this.LLILZIL;
        int i = 1;
        int i2 = !this.LL ? 1 : 0;
        if (dataChannel2 != null) {
            BriefGameTask briefGameTask = (BriefGameTask) dataChannel2.gg0(C168J.class);
            boolean zLIZ = C1878360yyo.LIZ(briefGameTask);
            String str12 = null;
            if (briefGameTask != null && (briefCreatorCode3 = briefGameTask.creatorCode) != null && (str11 = briefCreatorCode3.creatorCode) != null && str11.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            String str13 = "";
            if (!z && briefGameTask != null && (briefCreatorCode = briefGameTask.creatorCode) != null && (str10 = briefCreatorCode.activityId) != null && str10.length() != 0) {
                if (briefGameTask != null && (briefCreatorCode2 = briefGameTask.creatorCode) != null) {
                    numValueOf = Integer.valueOf(briefCreatorCode2.rewardType);
                } else {
                    numValueOf = null;
                }
                strLIZIZ = C1878360yyo.LIZIZ(numValueOf);
            } else {
                i = 0;
                strLIZIZ = "";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
            c474500IjALIZ.LJIJJLI(dataChannel2);
            if (C0IXW.LIZLLL(dataChannel2)) {
                str = "ad";
            } else {
                str = "normal";
            }
            c474500IjALIZ.LJJII(str, "live_traffic_source");
            c474500IjALIZ.LJJII("live_detail", "page_name");
            c474500IjALIZ.LJJII("icon", "btn_name");
            if (briefGameTask != null && (partnershipTask5 = briefGameTask.task) != null && partnershipTask5.taskMode == 40) {
                str2 = "game_props_sale";
            } else {
                str2 = "game_anchor";
            }
            c474500IjALIZ.LJJII(str2, "btn_type");
            c474500IjALIZ.LJJII(Boolean.valueOf(zLIZ), "attribution");
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_fullscreen");
            c474500IjALIZ.LJJII("user", "user_type");
            c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurrentRegionCode(), "user_country_code");
            if (briefGameTask == null || (salesCPSInfo2 = briefGameTask.salesCpsInfo) == null || (str3 = salesCPSInfo2.openId) == null) {
                str3 = "";
            }
            c474500IjALIZ.LJJII(str3, "open_id");
            if (briefGameTask == null || (partnershipTask4 = briefGameTask.task) == null || (str4 = partnershipTask4.idStr) == null) {
                str4 = "";
            }
            c474500IjALIZ.LJJII(str4, "biz_id");
            if (briefGameTask == null || (salesCPSInfo = briefGameTask.salesCpsInfo) == null || (str5 = salesCPSInfo.schema) == null) {
                str5 = "";
            }
            c474500IjALIZ.LJJII(str5, "product_link");
            c474500IjALIZ.LJJII(C1878360yyo.LIZJ, "click_id");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "host_id");
            c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "author_id");
            c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "content_id");
            if (briefGameTask == null || (partnershipTask3 = briefGameTask.task) == null || (str6 = partnershipTask3.idStr) == null) {
                str6 = "";
            }
            c474500IjALIZ.LJJII(str6, "task_id");
            if (briefGameTask == null || (partnershipTask2 = briefGameTask.task) == null || (str7 = partnershipTask2.idStr) == null) {
                str7 = "";
            }
            c474500IjALIZ.LJJII(str7, "game_task_id");
            if (briefGameTask == null || (partnershipTask = briefGameTask.task) == null || (str8 = partnershipTask.gameIdStr) == null) {
                str8 = "";
            }
            c474500IjALIZ.LJJII(str8, "game_id");
            if (briefGameTask != null && (briefGame = briefGameTask.briefGame) != null && (str9 = briefGame.name) != null) {
                str13 = str9;
            }
            c474500IjALIZ.LJJII(str13, "game_name");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_creator_code");
            c474500IjALIZ.LJJII(strLIZIZ, "creator_code_type");
            if (briefGameTask != null) {
                try {
                    str12 = briefGameTask.logExtra;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            c474500IjALIZ.LJJIIJZLJL(new JSONObject(URLDecoder.decode(String.valueOf(str12), "UTF-8")));
            C189200o6.m2constructorimpl(c474500IjALIZ);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
        Room room;
        C20743416Fc c20743416Fc;
        this.LLILLL = c1099960ejK.LIZ;
        DataChannel dataChannel = c1099960ejK.LIZJ;
        this.LLILZIL = dataChannel;
        this.LLILZ = c1099960ejK.LIZIZ;
        LifecycleOwner lifecycleOwner = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZLL = room;
        C1548820qPI.LIZLLL("gamepad_open_propsale_web", this);
        if (!this.LL) {
            C486790J7d.LJ(this.LLILZIL, new ARunnableS86S0200000_17(this, c945840aik, 33));
        }
        this.LLJ = (LiveIconView) c945840aik.findViewById(R.id.jur);
        this.LLJI = (C20743416Fc) c945840aik.findViewById(R.id.ipz);
        DataChannel dataChannel2 = this.LLILZIL;
        if (dataChannel2 != null) {
            LifecycleOwner lifecycleOwner2 = this.LLILZ;
            if (lifecycleOwner2 == null) {
                lifecycleOwner2 = null;
            }
            dataChannel2.BQ2(lifecycleOwner2, PartnershipPromoteGameCardShowChannel.class, new AwS596S0100000_17(this, 295));
        }
        DataChannel dataChannel3 = this.LLILZIL;
        if (dataChannel3 != null) {
            LifecycleOwner lifecycleOwner3 = this.LLILZ;
            if (lifecycleOwner3 != null) {
                lifecycleOwner = lifecycleOwner3;
            }
            dataChannel3.BQ2(lifecycleOwner, GamePartnershipEntranceHide.class, new AwS607S0100000_28(this, 186));
        }
        DataChannel dataChannel4 = this.LLILZIL;
        if (dataChannel4 != null && Intrinsics.LJFF(dataChannel4.gg0(C780690Ujr.class), Boolean.FALSE) && (c20743416Fc = this.LLJI) != null) {
            C786410Ut5.LLJJJJLIIL(c20743416Fc, 8);
        }
        LiveIconView liveIconView = this.LLJ;
        if (liveIconView != null) {
            liveIconView.setImageDrawable(C497740JfY.LJIIJ(R.drawable.elp));
        }
        LiveIconView liveIconView2 = this.LLJ;
        if (liveIconView2 != null) {
            liveIconView2.LJ();
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
        this.LLILLJJLI = true;
        C1548820qPI.LJIIIIZZ("gamepad_open_propsale_web", this);
        IHybridContainerManageService iHybridContainerManageService = (IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class);
        if (iHybridContainerManageService != null) {
            iHybridContainerManageService.ZP(true);
        }
        if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPartnershipNewAttrPointEnable()) {
            AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJIJIL = null;
            AnonymousClass0956 anonymousClass09562 = this.LLJILJIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLJILJIL = null;
        }
    }

    public static void LJIIIIZZ(Context context, BriefGameTask briefGameTask, String str) throws Throwable {
        String str2;
        String str3;
        String str4 = null;
        if (GameLivePartnershipPropsSalesCctSetting.INSTANCE.getConfig().enable && C817470W4z.LIZIZ(context, null) != null) {
            try {
                new C0WWG().LIZ().LIZ(context, UriProtector.parse(str));
                return;
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) PluggableExtentionKt.pluggableSpi$default(IGamePartnershipService.class, false, false, false, 14, null);
                if (iGamePartnershipService != null) {
                    SalesCPSInfo salesCPSInfo = briefGameTask.salesCpsInfo;
                    if (salesCPSInfo != null) {
                        str3 = salesCPSInfo.propSupplyWebViewMainTitle;
                        str4 = salesCPSInfo.propSupplyWebViewSubTitle;
                    } else {
                        str3 = null;
                    }
                    iGamePartnershipService.r11(context, str, str3, str4);
                    return;
                }
                return;
            }
        }
        IGamePartnershipService iGamePartnershipService2 = (IGamePartnershipService) PluggableExtentionKt.pluggableSpi$default(IGamePartnershipService.class, false, false, false, 14, null);
        if (iGamePartnershipService2 != null) {
            SalesCPSInfo salesCPSInfo2 = briefGameTask.salesCpsInfo;
            if (salesCPSInfo2 != null) {
                str2 = salesCPSInfo2.propSupplyWebViewMainTitle;
                str4 = salesCPSInfo2.propSupplyWebViewSubTitle;
            } else {
                str2 = null;
            }
            iGamePartnershipService2.r11(context, str, str2, str4);
        }
    }
}
