package com.bytedance.android.live.liveinteract.multiguestv3.main.gift;

import X.C01EZ;
import X.C0J8P;
import X.C12ES;
import X.C20744116Fj;
import X.C410901il;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C930540aK4;
import X.C930940aKi;
import X.C937380aV6;
import X.C937410aV9;
import X.C937460aVE;
import X.C986870bmv;
import X.RunnableC781530UlD;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSendGiftToAllThresholdSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestGiftSwitchTargetDialog extends LiveDialogFragment {
    public static User LLJJ = null;
    public static List<LinkListUser> LLJJI = null;
    public static boolean LLJJIII = false;
    public static String LLJJIJI = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2HELIOSOzE6emE+KSwiZyg6LjFiBDo/PCwLPCogPAIlLzsAPyw4KicHKTcrLDsXISQgJig=";
    public View LL;
    public RunnableC781530UlD LLILLJJLI;
    public C937410aV9 LLILLL;
    public C937380aV6 LLILZ;
    public View LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public View LLIZLLLIL;
    public C20744116Fj LLJ;
    public Function0<Unit> LLJIJIL;
    public Long LLJILJILJ;
    public Integer LLJILLL;
    public final List<LinkListUser> LLJI = new ArrayList();
    public boolean LLJILJIL = true;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public static boolean MR() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        Long lValueOf;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (C930540aK4.LIZJ()) {
            if (room == null || (multiLiveUserSettings2 = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) == null) {
                return false;
            }
            lValueOf = Long.valueOf(multiLiveUserApplySettings2.hostSendGiftsToAllEnum);
        } else {
            if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null) {
                return false;
            }
            lValueOf = Long.valueOf(multiLiveUserApplySettings.audienceSendGiftsToAllEnum);
        }
        return lValueOf != null && lValueOf.longValue() >= ((long) MultiGuestSendGiftToAllThresholdSetting.INSTANCE.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r3 = X.C465640INu.LIZIZ(r0)
            X.0Jkm r2 = new X.0Jkm
            r0 = 2131569243(0x7f0d2a5b, float:1.8764107E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L41
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L41
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L42
            r0 = 8388629(0x800015, float:1.1754973E-38)
        L27:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L3f
            r0 = -1
        L30:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L35
            r3 = -1
        L35:
            r2.LJIIJ = r3
            if (r1 == 0) goto L45
            r0 = 2131887795(0x7f1206b3, float:1.9410207E38)
            r2.LIZJ = r0
            return r2
        L3f:
            r0 = r3
            goto L30
        L41:
            r1 = 1
        L42:
            r0 = 80
            goto L27
        L45:
            r0 = 2131887796(0x7f1206b4, float:1.941021E38)
            r2.LIZJ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI = null;
        C937410aV9 c937410aV9 = this.LLILLL;
        if (c937410aV9 != null) {
            c937410aV9.LIZ();
        }
        this.LLILLL = null;
        C937380aV6 c937380aV6 = this.LLILZ;
        if (c937380aV6 != null) {
            c937380aV6.LLJ = null;
        }
        this.LLILZ = null;
        this.LLJIJIL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<LinkListUser> list;
        List<LinkListUser> list2;
        GridLayoutManager gridLayoutManager;
        RoomLinkInfo linkMicInfo;
        RoomLinkInfo.LinkmicLayoutConfig linkmicLayoutConfig;
        boolean z;
        boolean z2;
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 64), view.findViewById(R.id.yg_));
        this.LLILLJJLI = (RunnableC781530UlD) view.findViewById(R.id.tvi);
        this.LL = view.findViewById(R.id.g00);
        this.LLILLL = new C937410aV9();
        if (MR()) {
            View view2 = this.LL;
            if (view2 != null) {
                C12ES.LJIILL(4, view2);
            }
            this.LLILZIL = view.findViewById(R.id.y3j);
            this.LLILZLL = (ViewGroup) view.findViewById(R.id.y0w);
            this.LLIZ = (ViewGroup) view.findViewById(R.id.y0x);
            this.LLJ = (C20744116Fj) view.findViewById(R.id.st0);
            View viewFindViewById = view.findViewById(R.id.vg_select_all);
            this.LLIZLLLIL = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 65), viewFindViewById);
            }
        }
        if (MR()) {
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
            C500260Jjc.LJLJLJ(this.LLIZ, true);
            View view3 = this.LLIZLLLIL;
            if (((ArrayList) this.LLJI).size() > 1) {
                z = true;
            } else {
                z = false;
            }
            C500260Jjc.LJLJLJ(view3, z);
            C20744116Fj c20744116Fj = this.LLJ;
            if (c20744116Fj != null) {
                List<LinkListUser> list3 = LLJJI;
                if (list3 != null && list3.size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c20744116Fj.setChecked(z2);
            }
        }
        C937380aV6 c937380aV6 = new C937380aV6(this, LLJJ, this.LLJI, this.dataChannel, LLJJIII, LLJJIJI, this.LLJIJIL);
        c937380aV6.LLLI(LinkListUser.class, new C0J8P<LinkListUser, C937460aVE>() { // from class: X.0aV7
            public final boolean LJIIIIZZ(LinkListUser linkListUser) {
                List<LinkListUser> list4;
                Long lValueOf;
                C937380aV6 c937380aV62;
                C1117360fBO c1117360fBO = this.LIZ;
                if ((c1117360fBO instanceof C937380aV6) && (c937380aV62 = (C937380aV6) c1117360fBO) != null) {
                    list4 = c937380aV62.LLJIJIL;
                } else {
                    list4 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    return false;
                }
                Iterator<LinkListUser> it2 = list4.iterator();
                while (it2.hasNext()) {
                    User user = it2.next().user;
                    if (user != null) {
                        Long lValueOf2 = Long.valueOf(user.getId());
                        User user2 = linkListUser.user;
                        if (user2 != null) {
                            lValueOf = Long.valueOf(user2.getId());
                        } else {
                            lValueOf = null;
                        }
                        if (Intrinsics.LJFF(lValueOf2, lValueOf)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public static void LJIIJ(C937460aVE c937460aVE, LinkListUser linkListUser) {
                if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                    InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                    if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIJI()) {
                        User user = linkListUser.user;
                        if (user != null) {
                            long id = user.getId();
                            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
                            if (interfaceC302601FgLIZ2 != null) {
                                ((TextView) c937460aVE.LLILZIL.getValue()).setText(C1850730yGF.LJFF(interfaceC302601FgLIZ2.LIZJ(id)).toUpperCase(Locale.ROOT));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ((TextView) c937460aVE.LLILZIL.getValue()).setText(C1850730yGF.LJFF(linkListUser.fanTicket).toUpperCase(Locale.ROOT));
                    return;
                }
                ((TextView) c937460aVE.LLILZIL.getValue()).setText(C1850730yGF.LJFF(linkListUser.fanTicket).toUpperCase(Locale.ROOT));
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C937460aVE(viewGroup);
            }

            /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01de  */
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(X.C937460aVE r9, com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r10) {
                /*
                    Method dump skipped, instruction units count: 494
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C937390aV7.LIZJ(X.0aVE, com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser):void");
            }

            @Override // X.C0J8P
            public final void LIZLLL(RecyclerView.ViewHolder viewHolder, LinkListUser linkListUser, List list4) {
                C937460aVE c937460aVE = (C937460aVE) viewHolder;
                LinkListUser linkListUser2 = linkListUser;
                if (list4.isEmpty()) {
                    LIZJ(c937460aVE, linkListUser2);
                } else {
                    c937460aVE.itemView.setSelected(LJIIIIZZ(linkListUser2));
                }
            }
        });
        this.LLILZ = c937380aV6;
        C410901il c410901il = new C410901il();
        c410901il.addAll(this.LLJI);
        C937380aV6 c937380aV62 = this.LLILZ;
        if (c937380aV62 != null) {
            c937380aV62.LL = c410901il;
        }
        RunnableC781530UlD runnableC781530UlD = this.LLILLJJLI;
        if (runnableC781530UlD != null) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (linkmicLayoutConfig = linkMicInfo.layoutConfig) != null && linkmicLayoutConfig.cohostEnlargeEnabled) {
                gridLayoutManager = new GridLayoutManager(getContext(), 6);
                gridLayoutManager.LLIZ = new C986870bmv(this, 3);
            } else {
                gridLayoutManager = new GridLayoutManager(getContext(), 3);
            }
            runnableC781530UlD.setLayoutManager(gridLayoutManager);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLILLJJLI;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setAdapter(this.LLILZ);
        }
        List<LinkListUser> list4 = LLJJI;
        if (list4 != null) {
            C937380aV6 c937380aV63 = this.LLILZ;
            if (c937380aV63 != null && (list2 = c937380aV63.LLJIJIL) != null) {
                ((ArrayList) list2).clear();
            }
            C937380aV6 c937380aV64 = this.LLILZ;
            if (c937380aV64 != null && (list = c937380aV64.LLJIJIL) != null) {
                ((ArrayList) list).addAll(list4);
            }
        }
        if (C500260Jjc.LJJJJIZL(this.LLIZLLLIL)) {
            C01EZ.LIZ("show");
        }
    }
}
