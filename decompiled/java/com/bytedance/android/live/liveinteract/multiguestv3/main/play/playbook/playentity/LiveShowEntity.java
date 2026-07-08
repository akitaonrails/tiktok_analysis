package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC19484711Kz;
import X.AbstractC20356314kz;
import X.AbstractC928510aGn;
import X.C01EI;
import X.C01FQ;
import X.C01GW;
import X.C01IF;
import X.C0UO0;
import X.C11NJ;
import X.C1697810uHb;
import X.C1AZW;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C2095008Iq;
import X.C259800zU;
import X.C334801Rq;
import X.C452501pT;
import X.C470590Icr;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C785410UrT;
import X.C816490W1f;
import X.C915980Zwa;
import X.C921170a4x;
import X.C921180a4y;
import X.C924230a9t;
import X.C930480aJy;
import X.C930930aKh;
import X.C930940aKi;
import X.C937280aUw;
import X.C941700ac4;
import X.C946060aj6;
import X.C948450amx;
import X.C986250blv;
import X.DialogC430701lx;
import X.InterfaceC20354714kj;
import X.InterfaceC302601Fg;
import X.InterfaceC430901lz;
import X.InterfaceC941720ac6;
import X.InterfaceC953350aur;
import X.InterfaceC954180awC;
import X.InterfaceC979390bar;
import Y.AfS184S0100000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.LiveShowConfig;
import com.bytedance.android.livesdk.model.LiveShowEntryClickEvent;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveShowEntity extends AbstractC20356314kz {
    public final C11NJ LLJJJJJIL = new C11NJ();
    public final C20357914lF LLJJJJLIIL = new C20357914lF("live_show", 0, 35600000, 0, C1697810uHb.LJIIJJI("liveshow_ongoing", "liveshow_change_user", "liveshow_finished", "never"), "liveshow_ongoing", 4080);
    public final long LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLL() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        return C500260Jjc.LJJJI(interfaceC941720ac6LIZIZ != null ? Boolean.valueOf(interfaceC941720ac6LIZIZ.LJIIJ("live_show")) : null);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        this.LLJJJJJIL.LJ();
        LJJIL();
        super.destroy();
    }

    public LiveShowEntity() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        this.LLJJL = (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) ? 0L : room.getId();
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 326));
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJIIIZ((C986250blv) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        return !C924230a9t.LIZ(2);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJFF((C986250blv) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
    }

    public final ShowConfig LJJLIIIJ(C20361214lm c20361214lm) {
        String str = c20361214lm.LJI;
        if (str != null && !a0.LJJJIL(str)) {
            LiveShowConfig liveShowConfig = (LiveShowConfig) C937280aUw.LIZJ(LiveShowConfig.class, str, new LiveShowConfig());
            if (liveShowConfig.transitionDurationOfConfig >= 0) {
                ShowConfig showConfig = new ShowConfig();
                showConfig.durationPerGuest = liveShowConfig.durationPerGuest;
                showConfig.allowOpenMicFreely = liveShowConfig.allowOpenMicFreely;
                showConfig.transitionDurationOfConfig = liveShowConfig.transitionDurationOfConfig;
                return showConfig;
            }
            return null;
        }
        return null;
    }

    public final boolean LJJLIIIJILLIZJL(Object obj) {
        Boolean boolValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> abstractC928510aGnLJJJLZIJ;
        if (LJJLIIIJ(c20361214lm) == null) {
            return false;
        }
        AnchorBusinessUserManager anchorBusinessUserManager = (AnchorBusinessUserManager) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if ((anchorBusinessUserManager == null || (abstractC928510aGnLJJJLZIJ = anchorBusinessUserManager.LJJJLZIJ()) == null || C921170a4x.LIZJ(abstractC928510aGnLJJJLZIJ) <= 0) && !z) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        LiveShowConfig liveShowConfig = (LiveShowConfig) C937280aUw.LIZJ(LiveShowConfig.class, c20424814w2.LJII, new LiveShowConfig());
        ArrayList arrayList = new ArrayList();
        long j = liveShowConfig.durationPerGuest;
        if (j > 0) {
            arrayList.add(C497740JfY.LJIJJ(2131854131, String.valueOf((int) (j / ((long) 60)))));
        }
        long j2 = liveShowConfig.transitionDurationOfConfig;
        if (j2 > 0) {
            long j3 = 60;
            int i2 = (int) (j2 / j3);
            long j4 = j2 % j3;
            if (i2 > 0) {
                arrayList.add(C497740JfY.LJIJJ(2131854132, Integer.valueOf(i2), Long.valueOf(j4)));
            } else {
                arrayList.add(C497740JfY.LJIJJ(2131854133, Long.valueOf(j2)));
            }
        }
        return new C20361314ln(C497740JfY.LJIJI(2131843568), C497740JfY.LJIJI(2131843568), R.attr.dky, R.attr.dky, arrayList, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 14);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        ShowConfig showConfig;
        Context contextLIZJ;
        String str = c20361214lm.LJI;
        if (str != null) {
            if (a0.LJJJIL(str)) {
                showConfig = new ShowConfig();
                showConfig.durationPerGuest = 180L;
                showConfig.allowOpenMicFreely = false;
                showConfig.transitionDurationOfConfig = 0L;
            } else {
                LiveShowConfig liveShowConfig = (LiveShowConfig) C937280aUw.LIZJ(LiveShowConfig.class, str, new LiveShowConfig());
                showConfig = new ShowConfig();
                showConfig.durationPerGuest = liveShowConfig.durationPerGuest;
                showConfig.allowOpenMicFreely = liveShowConfig.allowOpenMicFreely;
                showConfig.transitionDurationOfConfig = liveShowConfig.transitionDurationOfConfig;
            }
        } else {
            showConfig = null;
        }
        if (lifecycleOwner != null && (contextLIZJ = PlaybookUtilKt.LIZJ(lifecycleOwner)) != null) {
            DialogC430701lx dialogC430701lx = new DialogC430701lx(contextLIZJ, new InterfaceC430901lz() { // from class: X.0blt
                @Override // X.InterfaceC430901lz
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC430901lz
                public final void LIZJ(ShowConfig showConfig2) {
                }

                @Override // X.InterfaceC430901lz
                public final void LJ(int i) {
                }

                @Override // X.InterfaceC430901lz
                public final void LJI(ShowConfig showConfig2) {
                }

                @Override // X.InterfaceC430901lz
                public final void LIZ() {
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LIZ(false);
                    }
                }

                @Override // X.InterfaceC430901lz
                public final void LIZLLL(String str2) {
                    InterfaceC979390bar interfaceC979390bar2;
                    if (!Intrinsics.LJFF(str2, "bottom_button") && (interfaceC979390bar2 = interfaceC979390bar) != null) {
                        interfaceC979390bar2.LIZJ();
                    }
                }

                @Override // X.InterfaceC430901lz
                public final void LJFF(ShowConfig showConfig2) {
                    Gson gson = C19748512Ol.LIZJ;
                    this.getClass();
                    LiveShowConfig liveShowConfig2 = new LiveShowConfig();
                    liveShowConfig2.durationPerGuest = showConfig2.durationPerGuest;
                    liveShowConfig2.allowOpenMicFreely = showConfig2.allowOpenMicFreely;
                    liveShowConfig2.transitionDurationOfConfig = showConfig2.transitionDurationOfConfig;
                    String json = GsonProtectorUtils.toJson(gson, liveShowConfig2);
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LJI(c20361214lm.LIZIZ, json, true);
                    }
                }
            }, showConfig, this.LLJ, 0, "playbook_edit");
            dialogC430701lx.show();
            C785410UrT.LIZIZ(dialogC430701lx);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC430701lx);
            C816490W1f.LIZ(dialogC430701lx);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        long jLongValue;
        List<CreateShowParams.ListUser> arrayList;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        String strU3;
        Long lLJIILIIL;
        if (!LJJLIIIJILLIZJL(null) && C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()) > 0) {
            ShowConfig showConfigLJJLIIIJ = LJJLIIIJ(c20361214lm);
            if (showConfigLJJLIIIJ != null && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null) {
                CreateShowParams createShowParams = new CreateShowParams();
                createShowParams.roomId = this.LLJJL;
                try {
                    interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                createShowParams.channelId = jLongValue;
                createShowParams.showConfig = showConfigLJJLIIIJ;
                createShowParams.mgTraceInfo = C01IF.LIZ(c334801Rq);
                InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
                if (interfaceC302601FgLIZ2 == null || (arrayList = interfaceC302601FgLIZ2.LJIILIIL()) == null) {
                    arrayList = new ArrayList<>();
                }
                createShowParams.showUsers = arrayList;
                AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> abstractC19484711KzCreateShow = interfaceC302601FgLIZ.createShow(createShowParams);
                if (abstractC19484711KzCreateShow != null) {
                    this.LLJJJJJIL.LIZ(abstractC19484711KzCreateShow.LJFF(new C0UO0()).LJJIIZ(new AfS184S0100000_15(interfaceC953350aur, 60), new AfS184S0100000_15(interfaceC953350aur, 61)));
                    return;
                }
                return;
            }
            return;
        }
        interfaceC953350aur.LIZ(false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        String str4;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        List<LinkUser> listLIZLLL;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return;
        }
        if (!LJJLIIIJILLIZJL(null) && ((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() < 2)) {
            str4 = "playbook_edit";
        } else {
            str4 = "playbook_entity";
        }
        if (LJJLIIIJILLIZJL(null)) {
            C1AZW.LJIILL(C01EI.LIZ(245, this.LLJJJJLIIL.LIZ), "toastOnGoing", null, null);
            C766270U4b.LIZLLL(2131854098);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 327));
        }
        ShowConfig showConfigLJJLIIIJ = LJJLIIIJ(c20361214lm);
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        if (LJJLIIIJILLIZJL(null)) {
            showConfigLJJLIIIJ = null;
        }
        dataChannel.LC0(LiveShowEntryClickEvent.class, new C946060aj6(showConfigLJJLIIIJ, str4, new AwS293S0300000_15(this, (LiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 10), null, new AwS559S0100000_15(this, 328), new AwS224S0300000_15(this, (LiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 20), new AwS224S0300000_15(this, (LiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 21), new AwS224S0300000_15(this, (LiveShowEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 22), false, this.LLIZ, null, new C334801Rq(str, l, str2), 5656));
    }
}
