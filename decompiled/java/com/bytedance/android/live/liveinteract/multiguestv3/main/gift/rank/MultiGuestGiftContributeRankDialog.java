package com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank;

import X.C00YN;
import X.C01EH;
import X.C01FQ;
import X.C01HX;
import X.C01HY;
import X.C01HZ;
import X.C01Z4;
import X.C0J8P;
import X.C0KVU;
import X.C0KX4;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C11NJ;
import X.C15C3;
import X.C16F5;
import X.C16FS;
import X.C16FV;
import X.C16FZ;
import X.C307201Ha;
import X.C307301Hb;
import X.C307701Hf;
import X.C308301Hl;
import X.C410901il;
import X.C432101mB;
import X.C432501mF;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915900ZwS;
import X.C917520Zz4;
import X.C926630aDl;
import X.C927800aFe;
import X.C941700ac4;
import X.EnumC499801x6;
import X.InterfaceC058300Jh;
import X.InterfaceC302601Fg;
import X.InterfaceC307401Hc;
import X.InterfaceC941720ac6;
import X.RunnableC514801zW;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC512201z6;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownTimerPlayModeConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestGiftContributeRankDialog extends LiveDialogFragment implements InterfaceC058300Jh, InterfaceC307401Hc {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZyg6LjFiOy49I2sBPCMnIQI5LDwnDywqPQw8JjE+IC0mPCAeKCE4DCwtJSA0";
    public RunnableC781530UlD LL;
    public C01EH LLILLJJLI;
    public C1117360fBO LLILLL;
    public C16FZ LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public ViewGroup LLIZ;
    public C16FV LLIZLLLIL;
    public C16F5 LLJ;
    public C01HY LLJI;
    public C16F5 LLJIJIL;
    public C16FS LLJILJIL;
    public C16F5 LLJILJILJ;
    public FanTicketRanklistResponse.ResponseData LLJJ;
    public C00YN LLJJI;
    public User LLJJIII;
    public Room LLJJIJI;
    public Long LLJJIJIIJIL;
    public int LLJJIJIL;
    public final C11NJ LLJILLL = new C11NJ();
    public final long LLJJJ = System.currentTimeMillis();

    public MultiGuestGiftContributeRankDialog() {
        C926630aDl.LIZIZ(this, 9, true, true, false, null, 0, 240);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.InterfaceC058300Jh
    public final void LLJJJJJIL() {
        C16FZ c16fz = this.LLILZ;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, true);
        }
        RunnableC781530UlD runnableC781530UlD = this.LL;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, false);
        }
        View view = this.LLILZIL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, false);
        }
        C01HY c01hy = this.LLJI;
        if (c01hy != null) {
            C500260Jjc.LJLJLJ(c01hy, false);
        }
    }

    @Override // X.InterfaceC058300Jh
    public final void Ps() {
        C16FZ c16fz = this.LLILZ;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, false);
        }
        RunnableC781530UlD runnableC781530UlD = this.LL;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, false);
        }
        View view = this.LLILZIL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, true);
        }
        C01HY c01hy = this.LLJI;
        if (c01hy != null) {
            C500260Jjc.LJLJLJ(c01hy, false);
        }
        User user = this.LLJJIII;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        C308301Hl.LIZJ(user, null, interfaceC302601FgLIZ != null ? interfaceC302601FgLIZ.LJIJI() : false, 0);
    }

    @Override // X.InterfaceC058300Jh
    public final void S6() {
        C16FZ c16fz = this.LLILZ;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, false);
        }
        RunnableC781530UlD runnableC781530UlD = this.LL;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, false);
        }
        View view = this.LLILZIL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, true);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, false);
        }
        C01HY c01hy = this.LLJI;
        if (c01hy != null) {
            C500260Jjc.LJLJLJ(c01hy, false);
        }
        NR();
        User user = this.LLJJIII;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        C308301Hl.LIZJ(user, null, interfaceC302601FgLIZ != null ? interfaceC302601FgLIZ.LJIJI() : false, 0);
    }

    public final void NR() {
        if (MR(UserService.getInstance().user().LJIJJLI())) {
            C16FS c16fs = this.LLJILJIL;
            if (c16fs != null) {
                C500260Jjc.LJLJLJ(c16fs, false);
            }
            C16F5 c16f5 = this.LLJIJIL;
            if (c16f5 != null) {
                c16f5.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131842099), Arrays.copyOf(new Object[]{C0KVU.LIZ(this.LLJJIII)}, 1)));
                return;
            }
            return;
        }
        C16FS c16fs2 = this.LLJILJIL;
        if (c16fs2 != null) {
            C500260Jjc.LJLJLJ(c16fs2, true);
        }
        C16F5 c16f52 = this.LLJIJIL;
        if (c16f52 != null) {
            c16f52.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131842098), Arrays.copyOf(new Object[]{C0KVU.LIZ(this.LLJJIII)}, 1)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L47
            int r3 = X.C465640INu.LIZIZ(r0)
        La:
            X.0Jkm r2 = new X.0Jkm
            r0 = 2131569238(0x7f0d2a56, float:1.8764097E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L43
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L43
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L44
            r0 = 8388629(0x800015, float:1.1754973E-38)
        L29:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L41
            r0 = -1
        L32:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L37
            r3 = -1
        L37:
            r2.LJIIJ = r3
            if (r1 == 0) goto L49
            r0 = 2131887795(0x7f1206b3, float:1.9410207E38)
            r2.LIZJ = r0
            return r2
        L41:
            r0 = r3
            goto L32
        L43:
            r1 = 1
        L44:
            r0 = 80
            goto L29
        L47:
            r3 = 0
            goto La
        L49:
            r0 = 2131887796(0x7f1206b4, float:1.941021E38)
            r2.LIZJ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank.MultiGuestGiftContributeRankDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LL = null;
        C01EH c01eh = this.LLILLJJLI;
        if (c01eh != null) {
            c01eh.LIZJ();
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLJJ = null;
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("party_guest_contrbution_page"));
        }
    }

    public final boolean MR(User user) {
        Long lValueOf;
        User user2 = this.LLJJIII;
        Long lValueOf2 = null;
        if (user2 != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        if (user != null) {
            lValueOf2 = Long.valueOf(user.getId());
        }
        return Intrinsics.LJFF(lValueOf, lValueOf2);
    }

    @Override // X.InterfaceC058300Jh
    public final void YD(FanTicketRanklistResponse fanTicketRanklistResponse) {
        List<FanTicketRanklistResponse.RanklistUser> list;
        long id;
        boolean z;
        boolean zLJIJI;
        FanTicketRanklistResponse.CountdownInfo countdownInfo;
        List<FanTicketRanklistResponse.RanklistUser> list2;
        C01HX c01hx;
        List<FanTicketRanklistResponse.RanklistUser> list3;
        List<FanTicketRanklistResponse.RanklistUser> list4;
        FanTicketRanklistResponse.CountdownInfo countdownInfo2;
        C307201Ha c307201Ha;
        List<FanTicketRanklistResponse.RanklistUser> list5;
        FanTicketRanklistResponse.ResponseData responseData = fanTicketRanklistResponse.data;
        this.LLJJ = responseData;
        if (responseData != null) {
            list = responseData.ranklistUsers;
        } else {
            list = null;
        }
        int i = 1;
        if (list != null && !list.isEmpty()) {
            View view = this.LLILZIL;
            if (view != null) {
                C500260Jjc.LJLJLJ(view, false);
            }
        } else {
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C500260Jjc.LJLJLJ(view2, true);
            }
            NR();
        }
        C16FZ c16fz = this.LLILZ;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, false);
        }
        RunnableC781530UlD runnableC781530UlD = this.LL;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, true);
        }
        View view3 = this.LLILZLL;
        if (view3 != null) {
            C500260Jjc.LJLJLJ(view3, false);
        }
        C1117360fBO c1117360fBO = new C1117360fBO();
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.isOpenLiveShow() && this.LLJJI == C00YN.LIVE_SHOW_END) {
            c1117360fBO.LLLI(C307201Ha.class, new C0J8P<C307201Ha, C432101mB>() { // from class: X.01m8
                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, C307201Ha c307201Ha2) {
                    String strLJII;
                    C432101mB c432101mB = (C432101mB) viewHolder;
                    C307201Ha c307201Ha3 = c307201Ha2;
                    MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                    if (multiGuestDataHolder != null) {
                        strLJII = multiGuestDataHolder.LJII();
                    } else {
                        strLJII = null;
                    }
                    if (strLJII != null) {
                        C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJII);
                        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                            url.LJIIJJI = C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432101mB.itemView.getContext(), Integer.valueOf(c432101mB.I5().getWidth()), Integer.valueOf(c432101mB.I5().getHeight()));
                        } else {
                            url.LJIIIZ = R.drawable.emi;
                        }
                        url.LJIIL = new C987120bnK(1);
                        url.LJJI(c432101mB.I5());
                    } else if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                        C1126540fQC c1126540fQCI5 = c432101mB.I5();
                        if (c1126540fQCI5 != null) {
                            c1126540fQCI5.setImageDrawable(C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432101mB.itemView.getContext(), Integer.valueOf(c432101mB.I5().getWidth()), Integer.valueOf(c432101mB.I5().getHeight())));
                        }
                    } else {
                        C1126540fQC c1126540fQCI52 = c432101mB.I5();
                        if (c1126540fQCI52 != null) {
                            c1126540fQCI52.setActualImageResource(R.drawable.emi);
                        }
                    }
                    ((TextView) c432101mB.LLILLJJLI.getValue()).setText(C1850730yGF.LJFF(c307201Ha3.LIZ).toUpperCase(Locale.ROOT));
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C432101mB(viewGroup);
                }
            });
        }
        DataChannel dataChannel = this.dataChannel;
        User user = this.LLJJIII;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        c1117360fBO.LLLI(FanTicketRanklistResponse.CountdownInfo.class, new C307701Hf(id, dataChannel));
        FanTicketRanklistResponse.ResponseData responseData2 = this.LLJJ;
        if (responseData2 != null && (list5 = responseData2.ranklistUsers) != null && !list5.isEmpty()) {
            c1117360fBO.LLLI(C307301Hb.class, new C0J8P<C307301Hb, C432501mF>() { // from class: X.01mE
                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, C307301Hb c307301Hb) {
                    String strLJII;
                    C432501mF c432501mF = (C432501mF) viewHolder;
                    MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                    if (multiGuestDataHolder != null) {
                        strLJII = multiGuestDataHolder.LJII();
                    } else {
                        strLJII = null;
                    }
                    if (strLJII != null) {
                        C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJII);
                        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                            url.LJIIJJI = C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432501mF.itemView.getContext(), Integer.valueOf(c432501mF.I5().getWidth()), Integer.valueOf(c432501mF.I5().getHeight()));
                        } else {
                            url.LJIIIZ = R.drawable.emi;
                        }
                        url.LJIIL = new C987120bnK(2);
                        url.LJJI(c432501mF.I5());
                    } else if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                        C1126540fQC c1126540fQCI5 = c432501mF.I5();
                        if (c1126540fQCI5 != null) {
                            c1126540fQCI5.setImageDrawable(C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432501mF.itemView.getContext(), Integer.valueOf(c432501mF.I5().getWidth()), Integer.valueOf(c432501mF.I5().getHeight())));
                        }
                    } else {
                        C1126540fQC c1126540fQCI52 = c432501mF.I5();
                        if (c1126540fQCI52 != null) {
                            c1126540fQCI52.setActualImageResource(R.drawable.emi);
                        }
                    }
                    C16F5 c16f5 = (C16F5) c432501mF.LLILLJJLI.getValue();
                    Context context = c16f5.getContext();
                    if (context != null) {
                        if (C927800aFe.LIZIZ()) {
                            c16f5.setText(C497740JfY.LJIJI(2131843241));
                            c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, context));
                            c16f5.setTextSize(16.0f);
                            c16f5.LJJJI(R.style.a93);
                            return;
                        }
                        c16f5.setText(C497740JfY.LJIJI(2131842107));
                        c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ex7, context));
                        c16f5.setTextSize(13.0f);
                        c16f5.LJJJI(R.style.a9f);
                    }
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C432501mF(viewGroup);
                }
            });
        }
        Context context = getContext();
        User user2 = this.LLJJIII;
        FanTicketRanklistResponse.ResponseData responseData3 = fanTicketRanklistResponse.data;
        C11NJ c11nj = this.LLJILLL;
        int i2 = this.LLJJIJIL;
        C00YN c00yn = this.LLJJI;
        C00YN c00yn2 = C00YN.LIVE_SHOW_END;
        if (c00yn == c00yn2) {
            z = true;
        } else {
            z = false;
        }
        c1117360fBO.LLLI(FanTicketRanklistResponse.RanklistUser.class, new C15C3(context, user2, responseData3, c11nj, i2, z));
        this.LLILLL = c1117360fBO;
        C410901il c410901il = new C410901il();
        if (multiGuestLiveShowConfigSetting.isOpenLiveShow() && this.LLJJI == c00yn2) {
            FanTicketRanklistResponse.ResponseData responseData4 = fanTicketRanklistResponse.data;
            if (responseData4 != null) {
                c307201Ha = new C307201Ha(responseData4.fanTicketTotal);
            } else {
                c307201Ha = null;
            }
            c410901il.add(c307201Ha);
        }
        FanTicketRanklistResponse.ResponseData responseData5 = fanTicketRanklistResponse.data;
        if (responseData5 != null && (countdownInfo2 = responseData5.countdownInfo) != null) {
            c410901il.add(countdownInfo2);
        }
        FanTicketRanklistResponse.ResponseData responseData6 = this.LLJJ;
        if ((responseData6 != null && (list4 = responseData6.ranklistUsers) != null && !list4.isEmpty()) || !LinkmicCountDownTimerPlayModeConfig.INSTANCE.isServiceEnable()) {
            c410901il.add(new Object() { // from class: X.01Hb
            });
        }
        FanTicketRanklistResponse.ResponseData responseData7 = fanTicketRanklistResponse.data;
        if (responseData7 != null && (list3 = responseData7.ranklistUsers) != null) {
            c410901il.addAll(list3);
        }
        C1117360fBO c1117360fBO2 = this.LLILLL;
        if (c1117360fBO2 != null) {
            c1117360fBO2.LL = c410901il;
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LL;
        if (runnableC781530UlD2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                runnableC781530UlD2.setLayoutManager(new LinearLayoutManager(context2));
            } else {
                return;
            }
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LL;
        if (runnableC781530UlD3 != null) {
            runnableC781530UlD3.setAdapter(this.LLILLL);
        }
        FanTicketRanklistResponse.ResponseData responseData8 = fanTicketRanklistResponse.data;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        if (!MR(userLJIJJLI) && responseData8 != null && (list2 = responseData8.ranklistUsers) != null && !list2.isEmpty()) {
            C01HY c01hy = this.LLJI;
            if (c01hy != null) {
                C500260Jjc.LJLJLJ(c01hy, true);
            }
            if (responseData8 != null) {
                c01hx = new C01HX(userLJIJJLI, responseData8.ownIndex, responseData8.ownScore, responseData8.ranklistUsers, this.LLJJIII, responseData8);
            } else {
                c01hx = null;
            }
            C01HY c01hy2 = this.LLJI;
            if (c01hy2 != null) {
                c01hy2.e0(this.dataChannel, this, c01hx);
            }
        } else {
            C01HY c01hy3 = this.LLJI;
            if (c01hy3 != null) {
                C500260Jjc.LJLJLJ(c01hy3, false);
            }
        }
        User user3 = this.LLJJIII;
        FanTicketRanklistResponse.ResponseData responseData9 = fanTicketRanklistResponse.data;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            zLJIJI = interfaceC302601FgLIZ.LJIJI();
        } else {
            zLJIJI = false;
        }
        FanTicketRanklistResponse.ResponseData responseData10 = this.LLJJ;
        if (responseData10 != null && (countdownInfo = responseData10.countdownInfo) != null && countdownInfo.historyExists) {
            if (countdownInfo.inProgressRecord != null) {
                i = 2;
            }
        } else {
            i = 0;
        }
        C308301Hl.LIZJ(user3, responseData9, zLJIJI, i);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Long lValueOf;
        String str;
        List<FanTicketRanklistResponse.RanklistUser> list;
        super.onDismiss(dialogInterface);
        this.LLJILLL.LJ();
        User user = this.LLJJIII;
        FanTicketRanklistResponse.ResponseData responseData = this.LLJJ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        map.put("guest_id", String.valueOf(lValueOf));
        int size = 0;
        if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_own_ranking", str);
        map.put("ranking_enter_from", "guest_window");
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            size = list.size();
        }
        map.put("contributors_num", String.valueOf(size));
        map.put("user_rank", C308301Hl.LIZ(responseData));
        map.put("duration", String.valueOf(System.currentTimeMillis() - C308301Hl.LIZIZ));
        C0KX4.LIZ("livesdk_guest_charm_ranking_list_duration", map, null, true);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLJIJI;
        int i;
        ViewGroup.LayoutParams layoutParams;
        C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 9), view.findViewById(R.id.yg_));
        this.LLIZ = (ViewGroup) view.findViewById(R.id.eux);
        if (LinkmicCountDownTimerPlayModeConfig.INSTANCE.isServiceEnable()) {
            ViewGroup viewGroup = this.LLIZ;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) (((double) C497740JfY.LJIILLIIL()) * 0.7d);
                }
            } else {
                layoutParams = null;
            }
            ViewGroup viewGroup2 = this.LLIZ;
            if (viewGroup2 != null) {
                C786410Ut5.X5(layoutParams, viewGroup2);
            }
        }
        this.LL = (RunnableC781530UlD) view.findViewById(R.id.tvh);
        this.LLILZ = (C16FZ) view.findViewById(R.id.nnp);
        this.LLILZIL = view.findViewById(R.id.h3o);
        this.LLILZLL = view.findViewById(R.id.p4z);
        this.LLIZLLLIL = (C16FV) view.findViewById(R.id.k33);
        this.LLJ = (C16F5) view.findViewById(R.id.zig);
        this.LLJI = (C01HY) view.findViewById(R.id.uof);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.upi);
        this.LLJILJIL = (C16FS) view.findViewById(R.id.cuw);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.fka);
        C01EH c01eh = new C01EH();
        c01eh.LIZ(this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this);
        this.LLILLJJLI = c01eh;
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 10), view2);
        }
        C16FV c16fv = this.LLIZLLLIL;
        if (c16fv != null) {
            C786410Ut5.m8(c16fv, new ViewOnClickListenerC512201z6(this, 11));
        }
        if (C497740JfY.LJJ()) {
            C16FV c16fv2 = this.LLIZLLLIL;
            if (c16fv2 != null) {
                C786410Ut5.bc(c16fv2, -1.0f);
            }
        } else {
            C16FV c16fv3 = this.LLIZLLLIL;
            if (c16fv3 != null) {
                C786410Ut5.bc(c16fv3, 1.0f);
            }
        }
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && this.LLJJI == C00YN.LIVE_SHOW_END) {
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131843568));
            }
        } else {
            C16F5 c16f52 = this.LLJ;
            if (c16f52 != null) {
                if (C927800aFe.LIZIZ()) {
                    strLJIJI = C497740JfY.LJIJI(2131843242);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131842105);
                }
                c16f52.setText(C786410Ut5.j4(strLJIJI, Arrays.copyOf(new Object[]{C0KVU.LIZ(this.LLJJIII)}, 1)));
            }
        }
        C16F5 c16f53 = this.LLJILJILJ;
        if (c16f53 != null) {
            if (C927800aFe.LIZIZ()) {
                i = 2131843239;
            } else {
                i = 2131842104;
            }
            c16f53.setText(i);
        }
        C16FS c16fs = this.LLJILJIL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ViewOnClickListenerC512201z6(this, 12));
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null && interfaceC941720ac6LIZIZ.LJIIJ("guest_showdown")) {
            C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            if (c01hzKi1 != null) {
                c01hzKi1.LIZIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("party_guest_contrbution_page"), null);
            }
            HandlerHook.viewPost(view, new RunnableC514801zW(this, 29));
        }
    }
}
