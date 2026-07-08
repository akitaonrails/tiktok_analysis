package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937150aUj extends AbstractC960470b6L<C936690aTz> {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final EnumC928480aGk LLILLL;
    public final Map<String, String> LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C466310IQj LLJIJIL;
    public Long LLJILJIL;
    public String LLJILJILJ;
    public ARunnableS112S0100000_12 LLJILLL;

    public final C21569819bE L5() {
        return (C21569819bE) this.LLIZ.getValue();
    }

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        C466310IQj c466310IQj = this.LLJIJIL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJILLL;
        if (aRunnableS112S0100000_12 != null) {
            HandlerHook.viewRemoveCallbacks(this.itemView, aRunnableS112S0100000_12);
            this.LLJILLL = null;
        }
    }

    public final void R5() {
        C16FS c16fs = (C16FS) this.LLJI.getValue();
        c16fs.setText(C497740JfY.LJIJI(2131854171));
        c16fs.j0(R.style.a7a);
        c16fs.setEnabled(false);
        c16fs.setTextColor(C20736316Cj.LIZIZ(R.attr.c95, c16fs.getContext()));
    }

    public final void N5(Context context) {
        L5().setOuterCircleColors(-1);
        L5().LIZJ(EnumC21569519bB.LIVE_INBOX_LIVING_ICON_NEW);
        L5().setOuterCircleStrokeWidth(C418440Gaw.LIZIZ(2));
        L5().setDisableAnim(false);
        HandlerHook.viewPost(L5(), new ARunnableS115S0100000_15(this, 145));
        L5().LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    @Override // X.AbstractC960470b6L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(int r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C937150aUj.I5(int, java.lang.Object):void");
    }

    public final void P5(String str, C936690aTz c936690aTz) {
        Long lValueOf;
        GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem;
        Long lValueOf2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = C937170aUl.LIZ[c936690aTz.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem = c936690aTz.LIZJ;
                if (guestInvitedItem != null) {
                    linkedHashMap.put("guest_invite_type", "anchor_invite_guest");
                    linkedHashMap.put("event_room_id", String.valueOf(guestInvitedItem.roomId));
                    User user = guestInvitedItem.anchor;
                    if (user != null) {
                        lValueOf2 = Long.valueOf(user.getId());
                    } else {
                        lValueOf2 = null;
                    }
                    linkedHashMap.put("event_anchor_id", String.valueOf(lValueOf2));
                    Long l = this.LLJILJIL;
                    if (l != null) {
                        linkedHashMap.put("join_countdown_num", String.valueOf(l.longValue()));
                    }
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem2 = c936690aTz.LIZIZ;
            if (guestApplyItem2 != null) {
                User user2 = guestApplyItem2.anchor;
                if (user2 != null) {
                    lValueOf = Long.valueOf(user2.getId());
                } else {
                    lValueOf = null;
                }
                linkedHashMap.put("event_anchor_id", String.valueOf(lValueOf));
                linkedHashMap.put("event_room_id", String.valueOf(guestApplyItem2.roomId));
                linkedHashMap.put("guest_invite_type", "guest_apply_anchor");
                linkedHashMap.put("event_applying_guest_cnt", String.valueOf(guestApplyItem2.channelApplyGuestCount));
                linkedHashMap.put("link_id", guestApplyItem2.preLinkmicId);
                Long l2 = this.LLJILJIL;
                if (l2 != null) {
                    linkedHashMap.put("join_countdown_num", String.valueOf(l2.longValue()));
                }
            }
        }
        linkedHashMap.put("applying_guest_cnt", String.valueOf(c936690aTz.LJFF));
        List<GuestApplyStillInLineResponse.GuestApplyItem> list = c936690aTz.LIZLLL;
        List<GuestApplyStillInLineResponse.GuestInvitedItem> list2 = c936690aTz.LJ;
        EnumC928480aGk enumC928480aGk = this.LLILLL;
        String str2 = this.LLILZ.get("sub_apply_panel_type");
        String str3 = "apply_panel";
        if (str2 == null) {
            str2 = "apply_panel";
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("event_action_type", str);
        map.putAll(linkedHashMap);
        map.putAll(C928460aGi.LIZ(enumC928480aGk, list, str2, list2));
        C0KX4.LIZ("livesdk_multi_guest_application_panel_in_line_room", map, null, true);
        if (c936690aTz.LIZ == EnumC937180aUm.APPLY) {
            String str4 = "timeout";
            if ((Intrinsics.LJFF(str, "cancel") || Intrinsics.LJFF(str, "timeout")) && (guestApplyItem = c936690aTz.LIZIZ) != null) {
                EnumC928480aGk enumC928480aGk2 = this.LLILLL;
                List<GuestApplyStillInLineResponse.GuestApplyItem> list3 = c936690aTz.LIZLLL;
                String str5 = this.LLILZ.get("sub_apply_panel_type");
                if (str5 != null) {
                    str3 = str5;
                }
                if (Intrinsics.LJFF(str, "cancel")) {
                    str4 = "click";
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - (guestApplyItem.applyTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                HashMap map2 = new HashMap();
                C01Z4.LIZ(null, map2);
                map2.put("withdraw_action_type", str4);
                map2.put("withdraw_trigger", "apply_panel_outroom");
                map2.put("duration", strValueOf);
                map2.putAll(linkedHashMap);
                map2.putAll(C928460aGi.LIZ(enumC928480aGk2, list3, str3, null));
                C0KX4.LIZ("livesdk_guest_connection_apply_withdraw", map2, null, true);
            }
        }
    }

    public final void S5(long j, final C936690aTz c936690aTz, final EnumC937180aUm enumC937180aUm) {
        C466310IQj c466310IQj = this.LLJIJIL;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        C466310IQj c466310IQj2 = new C466310IQj(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), 1000L, new InterfaceC466320IQk() { // from class: X.0aUk
            @Override // X.InterfaceC466320IQk
            public final void onStart() {
            }

            @Override // X.InterfaceC466320IQk
            public final void LIZLLL() {
                this.LIZ.R5();
                EnumC937180aUm enumC937180aUm2 = enumC937180aUm;
                int[] iArr = C937190aUn.LIZ;
                int i = iArr[enumC937180aUm2.ordinal()];
                if (i == 1) {
                    Function0<Unit> function0 = this.LIZ.LL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    C928400aGc.LLIZ--;
                } else {
                    if (i != 2) {
                        throw new C1954807lC();
                    }
                    C928340aGW.LLIZ--;
                }
                C937150aUj c937150aUj = this.LIZ;
                String strLJIJI = null;
                c937150aUj.LLJIJIL = null;
                TextView textView = (TextView) c937150aUj.LLJ.getValue();
                int i2 = iArr[c936690aTz.LIZ.ordinal()];
                if (i2 == 1) {
                    GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem = c936690aTz.LIZIZ;
                    if (guestApplyItem != null) {
                        strLJIJI = guestApplyItem.descText;
                    }
                } else {
                    if (i2 != 2) {
                        throw new C1954807lC();
                    }
                    strLJIJI = C497740JfY.LJIJI(2131854550);
                }
                textView.setText(strLJIJI);
                this.LIZ.P5("timeout", c936690aTz);
            }

            @Override // X.InterfaceC466320IQk
            public final void LJJI(long j2) {
                String strLJIJJ;
                this.LIZ.LLJILJIL = Long.valueOf(j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                TextView textView = (TextView) this.LIZ.LLJ.getValue();
                int i = C937190aUn.LIZ[enumC937180aUm.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        strLJIJJ = "";
                    } else {
                        strLJIJJ = C497740JfY.LJIJJ(2131854549, this.LIZ.LLJILJIL);
                    }
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131854169, this.LIZ.LLJILJIL);
                }
                textView.setText(strLJIJJ);
            }
        });
        this.LLJIJIL = c466310IQj2;
        c466310IQj2.LJ();
    }

    public C937150aUj(View view, Function0<Unit> function0, Function0<Unit> function02, EnumC928480aGk enumC928480aGk, Map<String, String> map) {
        super(view);
        this.LL = function0;
        this.LLILLJJLI = function02;
        this.LLILLL = enumC928480aGk;
        this.LLILZ = map;
        this.LLILZIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 797));
        this.LLILZLL = C292401Bi.LIZ(new AwS559S0100000_15(view, 800));
        this.LLIZ = C292401Bi.LIZ(new AwS559S0100000_15(view, 799));
        this.LLIZLLLIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 802));
        this.LLJ = C292401Bi.LIZ(new AwS559S0100000_15(view, 801));
        this.LLJI = C292401Bi.LIZ(new AwS559S0100000_15(view, 798));
    }
}
