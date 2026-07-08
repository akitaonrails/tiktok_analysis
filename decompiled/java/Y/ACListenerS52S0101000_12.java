package Y;

import X.C036E;
import X.C0IJT;
import X.C0KVU;
import X.C0KYR;
import X.C0OBG;
import X.C0TO6;
import X.C0TQ2;
import X.C0TZ1;
import X.C0TZ3;
import X.C1161920gLG;
import X.C19GO;
import X.C2188811AlT;
import X.C474500IjA;
import X.C494720Jag;
import X.C494730Jah;
import X.C497740JfY;
import X.C745200TLa;
import X.C745510TMf;
import X.C745540TMi;
import X.C745910TNt;
import X.C746650TQp;
import X.C746670TQr;
import X.C746880TRm;
import X.C747550TUb;
import X.C747620TUi;
import X.C749930TbL;
import X.C755610TkV;
import X.C755630TkX;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.DialogInterfaceOnClickListenerC785930UsJ;
import X.InterfaceC743640TFa;
import X.InterfaceC745530TMh;
import X.InterfaceC746870TRl;
import X.InterfaceC747570TUd;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import webcast.api.room.MuteRule;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS52S0101000_12 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        boolean zLIZIZ;
        String strLIZ;
        String strLIZIZ;
        int i;
        Object obj;
        String str;
        String str2;
        final C749930TbL c749930TbL = (C749930TbL) aCListenerS52S0101000_12.l0;
        int i2 = aCListenerS52S0101000_12.i1;
        c749930TbL.getClass();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        String str3 = "anchor";
        if (!zLIZIZ) {
            C766270U4b.LJFF(2131843092, c749930TbL.LLIZLLLIL);
        } else {
            final User user = (User) ListProtector.get(c749930TbL.LLJ, i2);
            final String str4 = c749930TbL.LLJI;
            if (user != null) {
                c749930TbL.LLJILJIL = user;
                if (TextUtils.isEmpty(C0KVU.LIZ(user))) {
                    strLIZ = "";
                } else {
                    strLIZ = C0KVU.LIZ(user);
                }
                if (str4.equals("activity_banned_talk")) {
                    strLIZIZ = c749930TbL.LLIZLLLIL.getString(2131842175, strLIZ);
                    i = 2131841264;
                } else {
                    String string = c749930TbL.LLIZLLLIL.getString(2131851525);
                    String string2 = c749930TbL.LLIZLLLIL.getString(2131851526);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string);
                    sbLIZ.append(" ");
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(" ");
                    sbLIZ.append(string2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    i = 2131842832;
                }
                final HashMap map = new HashMap();
                map.put("anchor_id", String.valueOf(c749930TbL.LLJILLL));
                map.put("room_id", String.valueOf(c749930TbL.LLJILJILJ));
                map.put("user_id", user.getIdStr());
                if (UserService.getInstance().user().getCurrentUserId() == c749930TbL.LLJILLL) {
                    obj = "anchor";
                } else {
                    obj = "moderator";
                }
                map.put("user_type", obj);
                C19GO c19go = new C19GO(c749930TbL.LLIZLLLIL);
                c19go.LJII = strLIZIZ;
                c19go.LIZJ(2131842831, new DialogInterfaceOnClickListenerC785930UsJ(c749930TbL, map, 0), false);
                c19go.LJ(i, new DialogInterface.OnClickListener() { // from class: X.0TbR
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        String str5;
                        C749930TbL c749930TbL2 = c749930TbL;
                        Map map2 = map;
                        String str6 = str4;
                        User user2 = user;
                        if ("activity_banned_talk".equals(c749930TbL2.LLJI)) {
                            str5 = "livesdk_anchor_mute_cancel_toast_click";
                        } else {
                            str5 = "livesdk_anchor_blocklist_cancel_toast_click";
                        }
                        map2.put("action_type", "yes");
                        C474500IjA c474500IjALIZ = C0IJT.LIZ(str5);
                        c474500IjALIZ.LJJIIZI(map2);
                        c474500IjALIZ.LIZ();
                        C786410Ut5.LJLLLLLL(0, c749930TbL2.LLILZ);
                        C786410Ut5.LLIL(c749930TbL2.LLILLJJLI, 8);
                        if (str6.equals("activity_kick_out")) {
                            ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).S70(c749930TbL2, false, c749930TbL2.LLJILJILJ, user2.getId(), "UnKickOutViewHolder", null);
                        } else {
                            ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).qo1(c749930TbL2.LLJILJILJ, user2, c749930TbL2);
                        }
                        dialogInterface.dismiss();
                    }
                }, false);
                C786410Ut5.M4(c19go.LIZ());
                if ("activity_banned_talk".equals(c749930TbL.LLJI)) {
                    str = "livesdk_anchor_mute_cancel_toast_show";
                } else {
                    str = "livesdk_anchor_blocklist_cancel_toast_show";
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_mute_click");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII(Long.valueOf(((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Ru0().LIZ), "default_mute_set");
                c474500IjALIZ2.LJJII(user.getIdStr(), "to_user_id");
                c474500IjALIZ2.LJJII("admin_pannel", "entry_point");
                c474500IjALIZ2.LJJII(Long.valueOf(c749930TbL.LLJILLL), "anchor_id");
                c474500IjALIZ2.LJJII(Long.valueOf(c749930TbL.LLJILJILJ), "room_id");
                c474500IjALIZ2.LJJII(C0KYR.LIZJ(c749930TbL.LLJIJIL), "admin_type");
                c474500IjALIZ2.LJJII("cancel", "action_type");
                c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ2.LJJII(Long.valueOf(((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Ru0().LIZ), "mute_duration");
                c474500IjALIZ2.LIZ();
            }
        }
        User user2 = (User) ListProtector.get(c749930TbL.LLJ, i2);
        HashMap map2 = new HashMap();
        map2.put("anchor_id", String.valueOf(c749930TbL.LLJILLL));
        map2.put("room_id", String.valueOf(c749930TbL.LLJILJILJ));
        map2.put("user_id", user2.getIdStr());
        if (UserService.getInstance().user().getCurrentUserId() != c749930TbL.LLJILLL) {
            str3 = "moderator";
        }
        map2.put("user_type", str3);
        if ("activity_banned_talk".equals(c749930TbL.LLJI)) {
            str2 = "livesdk_anchor_mute_cancel_click";
        } else {
            str2 = "livesdk_anchor_blocklist_cancel_click";
        }
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ(str2);
        c474500IjALIZ3.LJJIIZI(map2);
        c474500IjALIZ3.LIZ();
    }

    public static final void onClick$1(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        ((C747620TUi) aCListenerS52S0101000_12.l0).LL.invoke(Integer.valueOf(aCListenerS52S0101000_12.i1));
    }

    public static final void onClick$10(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        ((C745910TNt) aCListenerS52S0101000_12.l0).LL.LIZ(aCListenerS52S0101000_12.i1);
    }

    public static final void onClick$11(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        ((C0TQ2) aCListenerS52S0101000_12.l0).LLILLJJLI.LIZ(aCListenerS52S0101000_12.i1);
    }

    public static final void onClick$12(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        InterfaceC747570TUd interfaceC747570TUd = ((C747550TUb) aCListenerS52S0101000_12.l0).LLILLJJLI;
        if (interfaceC747570TUd != null) {
            interfaceC747570TUd.LLJL(aCListenerS52S0101000_12.i1);
        }
    }

    public static final void onClick$2(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        C745510TMf c745510TMf = (C745510TMf) aCListenerS52S0101000_12.l0;
        InterfaceC745530TMh interfaceC745530TMh = c745510TMf.LL;
        int i = aCListenerS52S0101000_12.i1;
        ListProtector.get(c745510TMf.LLILLJJLI, i);
        interfaceC745530TMh.LIZ(i);
    }

    public static final void onClick$3(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        ((C745540TMi) aCListenerS52S0101000_12.l0).LL.LIZ(aCListenerS52S0101000_12.i1);
    }

    public static final void onClick$4(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        final C745200TLa c745200TLa = (C745200TLa) aCListenerS52S0101000_12.l0;
        final int i = aCListenerS52S0101000_12.i1;
        if (((ArrayList) c745200TLa.LLILLJJLI).size() > i) {
            C782110Um9 c782110Um9 = new C782110Um9(c745200TLa.LLILLL.getContext());
            c782110Um9.LIZJ = C497740JfY.LJIJJ(2131837815, ((MuteRule) ListProtector.get(c745200TLa.LLILLJJLI, i)).content);
            c782110Um9.LJII(2131837813);
            C494720Jag c494720Jag = new C494720Jag();
            c494720Jag.LIZIZ = 1;
            C755610TkV c755610TkV = new C755610TkV();
            c755610TkV.LIZ = C497740JfY.LJIJI(2131837814);
            final LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet = c745200TLa.LLILLL;
            c755610TkV.LIZJ = new InterfaceC743640TFa() { // from class: X.0TLb
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    C766270U4b.LIZLLL(2131837816);
                    DataChannel dataChannelLJ = C475510Ikn.LJ(liveMuteRulesFragmentSheet);
                    if (dataChannelLJ != null) {
                        C01C7.LIZ(dataChannelLJ, "livesdk_comment_mute_rule_delete_click", C2097608Jq.LJIIJ(new Pair("word", ((MuteRule) ListProtector.get(c745200TLa.LLILLJJLI, i)).content), new Pair("mute_duration", String.valueOf(((MuteRule) ListProtector.get(c745200TLa.LLILLJJLI, i)).durationSecond))));
                    }
                    C745200TLa c745200TLa2 = c745200TLa;
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c745200TLa2.LLILLL), null, null, new C750880Tcs(c745200TLa2.LLILLL, c745200TLa2, i, null), 3);
                    liveDialog.dismiss();
                }
            };
            c494720Jag.LIZ(new C0TZ1(c755610TkV));
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(2131837804);
            c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0TZ5
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            };
            c494720Jag.LIZ(new C0TZ3(c755630TkX));
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            if (liveDialogLIZ != null) {
                C786410Ut5.E4(liveDialogLIZ);
            }
        }
    }

    public static final void onClick$5(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        ((C0TO6) aCListenerS52S0101000_12.l0).LL.LIZ(aCListenerS52S0101000_12.i1);
    }

    public static final void onClick$6(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        ((C0TO6) aCListenerS52S0101000_12.l0).LL.LIZ(aCListenerS52S0101000_12.i1);
    }

    public static final void onClick$7(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        ((C0TO6) aCListenerS52S0101000_12.l0).LL.LIZ(aCListenerS52S0101000_12.i1);
    }

    public static final void onClick$8(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        C746650TQp c746650TQp = (C746650TQp) aCListenerS52S0101000_12.l0;
        c746650TQp.LL.ho(((C746670TQr) ListProtector.get(c746650TQp.LLILLJJLI, aCListenerS52S0101000_12.i1)).LIZ, ((C746670TQr) ListProtector.get(((C746650TQp) aCListenerS52S0101000_12.l0).LLILLJJLI, aCListenerS52S0101000_12.i1)).LIZIZ);
    }

    public static final void onClick$9(ACListenerS52S0101000_12 aCListenerS52S0101000_12, View view) {
        C746880TRm c746880TRm;
        InterfaceC746870TRl interfaceC746870TRl;
        if (!C0OBG.LIZIZ(view) && (interfaceC746870TRl = (c746880TRm = (C746880TRm) aCListenerS52S0101000_12.l0).LLILLJJLI) != null) {
            interfaceC746870TRl.LIZ((LiveEventStruct) ListProtector.get(c746880TRm.LL, aCListenerS52S0101000_12.i1));
        }
    }

    public ACListenerS52S0101000_12(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    public ACListenerS52S0101000_12(C745540TMi c745540TMi, int i, BlockWordRecommend blockWordRecommend, int i2) {
        this.$t = i2;
        this.l0 = c745540TMi;
        this.i1 = i;
    }
}
