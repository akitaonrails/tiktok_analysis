package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.SwipeNextEvent;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveInnerWatchHistoryExtraCountSetting;
import com.bytedance.android.livesdk.dataChannel.GoLiveCardShowing;
import com.bytedance.android.livesdk.dataChannel.PromoteCardDisplayTimeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveVariantCardDisplayCalibrationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostStrategy;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.SpecialCard;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0Iby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC470040Iby extends AbstractC463340IEy {
    public EncourageGoLiveCard LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public C470070Ic1 LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public ViewGroup LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public FrameLayout LLJJJIL;
    public TextureView LLJJJJ;
    public int LLIZLLLIL = -1;
    public long LLJILJILJ = -1;

    public abstract int LJIIZILJ();

    public int LJIJ() {
        return 0;
    }

    public abstract void LJJ(View view);

    public boolean LJJI() {
        return this instanceof C470220IcG;
    }

    public boolean LJJIFFI() {
        return false;
    }

    public boolean LJJII() {
        return this instanceof C470050Ibz;
    }

    @Override // X.AbstractC463340IEy
    public void LIZJ() {
        String str;
        Boolean boolValueOf;
        C470070Ic1 c470070Ic1;
        if (this.LLJILJIL) {
            C20441214yg.LIZIZ("BasePromoteVariantCard", "onFragmentSelected ignored, already selected");
            return;
        }
        this.LLJILJIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFragmentSelected: isFirstShown=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", playerHelper=");
        sbLIZ.append(this.LLJ != null);
        sbLIZ.append(", bgVideoPlayer=");
        C470070Ic1 c470070Ic12 = this.LLJ;
        sbLIZ.append((c470070Ic12 == null || c470070Ic12.LIZJ == null) ? false : true);
        C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = System.currentTimeMillis();
        if (this.LLJI) {
            C20441214yg.LIZIZ("BasePromoteVariantCard", "onFragmentSelected: resuming existing players");
            C470070Ic1 c470070Ic13 = this.LLJ;
            if (c470070Ic13 != null) {
                c470070Ic13.LIZJ();
            }
        } else {
            this.LLJI = true;
            C470070Ic1 c470070Ic14 = this.LLJ;
            if (c470070Ic14 != null) {
                C20441214yg.LIZIZ("PromoteCardPlayerHelper", "markFirstShown");
                c470070Ic14.LIZLLL = true;
            }
            C20441214yg.LIZIZ("BasePromoteVariantCard", "onFragmentSelected: first show — starting players");
            if (LJJI()) {
                String strLJIILLIIL = LJIILLIIL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onFragmentSelected: withAudio=true, audioUrl=");
                if (strLJIILLIIL != null) {
                    boolValueOf = Boolean.valueOf(strLJIILLIIL.length() > 0);
                } else {
                    boolValueOf = null;
                }
                sbLIZ2.append(boolValueOf);
                C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ2));
                if (strLJIILLIIL != null && (c470070Ic1 = this.LLJ) != null) {
                    FrameLayout frameLayout = this.LLJJJIL;
                    if (strLJIILLIIL.length() == 0) {
                        C20441214yg.LIZIZ("PromoteCardPlayerHelper", "Audio URL empty, skipping player creation");
                    } else {
                        try {
                            InterfaceC465210IMd audioPlayerController = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getAudioPlayerController();
                            if (frameLayout != null) {
                                if (audioPlayerController != null) {
                                    audioPlayerController.LIZ(frameLayout);
                                    audioPlayerController.Lf(strLJIILLIIL);
                                }
                                c470070Ic1.LIZ = audioPlayerController;
                                C20441214yg.LIZIZ("PromoteCardPlayerHelper", "Audio player created successfully");
                            } else {
                                if (audioPlayerController != null) {
                                    audioPlayerController.Lf(strLJIILLIIL);
                                }
                                c470070Ic1.LIZ = audioPlayerController;
                                C20441214yg.LIZIZ("PromoteCardPlayerHelper", "Audio player created successfully");
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJFF("PromoteCardPlayerHelper", "Failed to create audio player", e);
                        }
                    }
                }
            }
            C470070Ic1 c470070Ic15 = this.LLJ;
            InterfaceC470090Ic3 interfaceC470090Ic3 = c470070Ic15 != null ? c470070Ic15.LIZJ : null;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onFragmentSelected: calling bgVideoPlayer.start(), player=");
            sbLIZ3.append(interfaceC470090Ic3);
            C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
            if (interfaceC470090Ic3 != null) {
                interfaceC470090Ic3.start();
            }
        }
        this.LLJILJILJ = System.currentTimeMillis();
        LiveExtraCardFrequencyManager liveExtraCardFrequencyManager = LiveExtraCardFrequencyManager.LIZ;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        String str2 = "";
        if (encourageGoLiveCard == null || (str = encourageGoLiveCard.cardId) == null) {
            str = "";
        }
        liveExtraCardFrequencyManager.getClass();
        LiveExtraCardFrequencyManager.LJII(str);
        EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZ;
        if (encourageGoLiveCard2 == null || encourageGoLiveCard2.isLynxCard) {
            return;
        }
        C20441214yg.LIZIZ("PromoteVariantCard", "not lynx Card");
        LiveExtraCardFrequencyManager.LJIIIIZZ(1);
        EncourageGoLiveCard encourageGoLiveCard3 = this.LLILZ;
        if (encourageGoLiveCard3 != null) {
            int value = LiveInnerWatchHistoryExtraCountSetting.INSTANCE.getValue();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_special_card_show");
            c474500IjALIZ.LJJIIZI(LJIILL());
            c474500IjALIZ.LJJII(C018Q.LIZ(value), "extra");
            c474500IjALIZ.LIZ();
            String str3 = this.LLILZIL;
            if (Intrinsics.LJFF(str3, "homepage_hot")) {
                str2 = "homepage_hot_draw_card";
            } else if (Intrinsics.LJFF(str3, "live_merge")) {
                str2 = "live_merge_draw_card";
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_entrance_show");
            c474500IjALIZ2.LJJIIZI(LJIILL());
            c474500IjALIZ2.LJJII(str2, "live_entrance_name");
            c474500IjALIZ2.LJJII(encourageGoLiveCard3.cardId, "item_id");
            c474500IjALIZ2.LIZ();
        }
    }

    @Override // X.AbstractC463340IEy
    public void LIZLLL() {
        LJIJJLI("draw");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFragmentUnselected: isCurrentlySelected=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(" -> false");
        C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJIL = false;
        C470070Ic1 c470070Ic1 = this.LLJ;
        if (c470070Ic1 != null) {
            c470070Ic1.LIZIZ();
        }
        if (!LiveVariantCardDisplayCalibrationSetting.INSTANCE.enable() || this.LLJJ <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJ;
        if (jCurrentTimeMillis > 0) {
            this.LLJJI += jCurrentTimeMillis;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Display duration: ");
            sbLIZ2.append(jCurrentTimeMillis);
            sbLIZ2.append("ms, accumulated: ");
            sbLIZ2.append(this.LLJJI);
            sbLIZ2.append("ms");
            C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ2));
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel != null) {
                dataChannel.zW(PromoteCardDisplayTimeChannel.class, Long.valueOf(this.LLJJI));
            }
        }
        this.LLJJ = 0L;
    }

    @Override // X.AbstractC463340IEy
    public final void LJ() {
        C20441214yg.LIZIZ("BasePromoteVariantCard", "onPause");
        C470070Ic1 c470070Ic1 = this.LLJ;
        if (c470070Ic1 != null) {
            c470070Ic1.LIZIZ();
        }
    }

    @Override // X.AbstractC463340IEy
    public final void LJI() {
        C20441214yg.LIZIZ("BasePromoteVariantCard", "onStop");
        this.LLJIJIL = true;
    }

    @Override // X.AbstractC463340IEy
    public View LJIIIIZZ() {
        if (this.LL == null) {
            C20441214yg.LJ("BasePromoteVariantCard", "Context is null, cannot create view");
            View view = new View(this.LL);
            C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, -2));
            return view;
        }
        try {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL).cloneInContext(new ContextThemeWrapper(this.LL, C011Z.LIZ.LJ())), R.layout.hjt, null, false);
            C20441214yg.LIZIZ("BasePromoteVariantCard", "View created successfully");
            return viewTd;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BasePromoteVariantCard", "Failed to inflate view", e);
            View view2 = new View(this.LL);
            C786410Ut5.W5(view2, new ViewGroup.LayoutParams(-1, -2));
            return view2;
        }
    }

    @Override // X.AbstractC463340IEy
    public final void LJIIIZ() {
        C20441214yg.LIZIZ("BasePromoteVariantCard", "startPlayer");
        LIZJ();
    }

    public final void LJIILIIL() {
        Room room;
        String str;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard != null && (str = encourageGoLiveCard.notifyLaterToast) != null) {
            C766270U4b.LJIIJJI(str);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
            c474500IjALIZ.LJJIIZI(LJIILL());
            c474500IjALIZ.LJJII(str, "msg_id");
            c474500IjALIZ.LIZ();
        }
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            long id = room.getId();
            DataChannel dataChannel2 = this.LLILLL;
            if (dataChannel2 != null) {
                dataChannel2.zW(SwipeNextEvent.class, Long.valueOf(id));
            }
        }
        EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZ;
        if (encourageGoLiveCard2 == null || encourageGoLiveCard2.isLynxCard) {
            return;
        }
        LJIJJLI("get_notified_later");
        LiveExtraCardFrequencyManager.LIZ.getClass();
        LiveExtraCardFrequencyManager.LJIIIIZZ(4);
    }

    public final void LJIILJJIL() {
        String string = UriProtector.parse(LiveEventPageLynxUrl.INSTANCE.getLiveEventGuideSchema()).buildUpon().appendQueryParameter("enter_from", "inner_shaped_card").build().toString();
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        if (iActionHandlerService != null) {
            iActionHandlerService.handle(this.LL, string);
        }
        LJIJJLI("get_notified_later");
    }

    public final Map<String, String> LJIILL() {
        String str;
        String string;
        String string2;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        HashMap map = new HashMap();
        DataChannel dataChannel = this.LLILLL;
        Long lValueOf = null;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (room != null && (interfaceC2262081DgMAuthor = room.author()) != null) {
            lValueOf = Long.valueOf(interfaceC2262081DgMAuthor.getId());
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        String str2 = this.LLILZIL;
        if (str2 == null) {
            str2 = "";
        }
        map.put("enter_from", str2);
        if (encourageGoLiveCard == null || (str = encourageGoLiveCard.cardId) == null) {
            str = "";
        }
        map.put("card_id", str);
        if (encourageGoLiveCard == null || (string = Integer.valueOf(encourageGoLiveCard.cardType).toString()) == null) {
            string = "";
        }
        map.put("card_type", string);
        if (encourageGoLiveCard == null || (string2 = Integer.valueOf(encourageGoLiveCard.style).toString()) == null) {
            string2 = "";
        }
        map.put("content_type", string2);
        String str3 = this.LLILZLL;
        map.put("request_id", str3 != null ? str3 : "");
        return map;
    }

    public String LJIILLIIL() {
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard != null) {
            return encourageGoLiveCard.bgMusicUrl;
        }
        return null;
    }

    public final boolean LJIJI() {
        int i;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        return encourageGoLiveCard != null && (i = encourageGoLiveCard.style) >= 101 && i <= 199;
    }

    @Override // X.AbstractC463340IEy
    public void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy: isFirstShown=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", isCurrentlySelected=");
        sbLIZ.append(this.LLJILJIL);
        C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        IHostStrategy iHostStrategy = (IHostStrategy) C1161920gLG.LIZJ(IHostStrategy.class);
        if (iHostStrategy != null) {
            iHostStrategy.Gg0();
        }
        this.LLJ = null;
        this.LLJI = false;
        this.LLJILJIL = false;
        C20441214yg.LIZIZ("BasePromoteVariantCard", "onDestroy: state flags reset, playerHelper released");
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
    }

    @Override // X.AbstractC463340IEy
    public final void LJIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPlayer: isCurrentlySelected=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(" -> false");
        C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJIL = false;
        C470070Ic1 c470070Ic1 = this.LLJ;
        if (c470070Ic1 != null) {
            c470070Ic1.LIZIZ();
        }
    }

    public final void LJIIL() {
        Room room;
        Room room2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomid: ");
        DataChannel dataChannel = this.LLILLL;
        sbLIZ.append((dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : Long.valueOf(room2.getId()));
        C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            long id = room.getId();
            DataChannel dataChannel3 = this.LLILLL;
            if (dataChannel3 != null) {
                dataChannel3.zW(SwipeNextEvent.class, Long.valueOf(id));
            }
        }
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null || encourageGoLiveCard.isLynxCard) {
            this.LLJILJILJ = -1L;
            return;
        }
        LJIJJLI("not_interested");
        LiveExtraCardFrequencyManager.LIZ.getClass();
        LiveExtraCardFrequencyManager.LJIIIIZZ(2);
    }

    @Override // X.AbstractC463340IEy
    public final void LJFF(boolean z) {
        boolean z2;
        C470070Ic1 c470070Ic1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume: isCurrent=");
        sbLIZ.append(z);
        sbLIZ.append(", pos=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(" ,isLeaved=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", isCurrentlySelected=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", isFirstShown=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", playerHelper=");
        if (this.LLJ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        if (z && !this.LLJILJIL) {
            LIZJ();
        } else if (this.LLJILJIL && (c470070Ic1 = this.LLJ) != null) {
            c470070Ic1.LIZJ();
        }
        if (this.LLJIJIL) {
            this.LLJILJILJ = System.currentTimeMillis();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_back_to_special_card_show");
            c474500IjALIZ.LJJIIZI(LJIILL());
            c474500IjALIZ.LIZ();
        }
        this.LLJIJIL = false;
    }

    @Override // X.AbstractC463340IEy
    public final void LJIIJJI(int i) {
        this.LLIZLLLIL = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePosition: position=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJJLI(String str) {
        if (this.LLJILJILJ == -1 || this.LLILZ == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_special_card_button_click");
        c474500IjALIZ.LJJIIZI(LJIILL());
        c474500IjALIZ.LJJII(str, "button_name");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LLJILJILJ), "stay_duration");
        c474500IjALIZ.LJJII("golive_promo_card", "card_category");
        String str2 = this.LLILZIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "enter_from_merge");
        String str4 = this.LLIZ;
        if (str4 != null) {
            str3 = str4;
        }
        c474500IjALIZ.LJJII(str3, "enter_method");
        c474500IjALIZ.LJJII("draw", "action_type");
        c474500IjALIZ.LJJII(String.valueOf(this.LLIZLLLIL), "room_position");
        c474500IjALIZ.LIZ();
        this.LLJILJILJ = -1L;
    }

    public final void LJIL(String str) {
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_special_card_image_monitor");
        c474500IjALIZ.LJJII(encourageGoLiveCard.cardId, "card_id");
        c474500IjALIZ.LJJII(Integer.valueOf(encourageGoLiveCard.style), "card_type");
        c474500IjALIZ.LJJII(str, "image_url");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC463340IEy
    public void LJII(View view, Bundle bundle) {
        Boolean boolValueOf;
        boolean z;
        boolean z2;
        int i;
        C1324720kZq c1324720kZq;
        int iLIZLLL;
        int iLIZLLL2;
        C20441214yg.LIZIZ("BasePromoteVariantCard", "onViewCreated");
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            C20441214yg.LJ("BasePromoteVariantCard", "Card data is null in onViewCreated");
            return;
        }
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILLJJLI, GoLiveCardShowing.class, new AwS586S0100000_7(this, 594));
        }
        if (encourageGoLiveCard.isLynxCard) {
            C20441214yg.LIZIZ("BasePromoteVariantCard", "Lynx card, skipping native UI setup");
            return;
        }
        this.LLJJJIL = (FrameLayout) view.findViewById(R.id.ci6);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.ded);
        this.LLJJIJI = view.findViewById(R.id.csh);
        View viewFindViewById = view.findViewById(R.id.cqm);
        InterfaceC470090Ic3 interfaceC470090Ic3LIZ = null;
        if (viewFindViewById != null) {
            if (LJIJ() == 0) {
                iLIZLLL2 = C497740JfY.LIZLLL(R.attr.exp, viewFindViewById.getContext());
            } else {
                iLIZLLL2 = C497740JfY.LIZLLL(R.attr.eya, viewFindViewById.getContext());
            }
            viewFindViewById.setBackgroundColor(iLIZLLL2);
        } else {
            viewFindViewById = null;
        }
        this.LLJJIJIIJIL = viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.znz);
        if (textView != null) {
            String str = encourageGoLiveCard.buttonText;
            if (C500260Jjc.LJJIIZ(str) && str != null) {
                textView.setText(str);
            }
            if (LJIJ() == 0) {
                iLIZLLL = C497740JfY.LIZLLL(R.attr.eyv, textView.getContext());
            } else {
                iLIZLLL = C497740JfY.LIZLLL(R.attr.ezq, textView.getContext());
            }
            textView.setTextColor(iLIZLLL);
        }
        this.LLJJIJIL = view.findViewById(R.id.zzr);
        this.LLJJJ = view.findViewById(R.id.nfw);
        this.LLJJJJ = (TextureView) view.findViewById(R.id.video_bg);
        boolean z3 = false;
        if (LJJIFFI() && (c1324720kZq = (C1324720kZq) view.findViewById(R.id.lcz)) != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            LJIJJ(encourageGoLiveCard.bgImgUrl, c1324720kZq, null);
        }
        LJJ(view);
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            C786410Ut5.Td(C786410Ut5.ne(this.LL).cloneInContext(new ContextThemeWrapper(this.LL, C011Z.LIZ.LJ())), LJIIZILJ(), viewGroup, true);
        }
        View view2 = this.LLJJIJIL;
        int i2 = 4;
        if (view2 != null) {
            if (encourageGoLiveCard.showNotifyLaterButton) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        View view3 = this.LLJJJ;
        if (view3 != null) {
            if (encourageGoLiveCard.showNotifyLaterButtonV2) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view3);
        }
        if (LJJII()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewCreated: withVideoBg=true, videoUrl=");
            String str2 = encourageGoLiveCard.videoUrl;
            if (str2 != null) {
                if (str2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(", bgVideoView=");
            if (this.LLJJJJ != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ));
            TextureView textureView = this.LLJJJJ;
            if (textureView != null) {
                C470070Ic1 c470070Ic1 = this.LLJ;
                if (c470070Ic1 != null) {
                    interfaceC470090Ic3LIZ = c470070Ic1.LIZ(textureView, encourageGoLiveCard.videoLength, encourageGoLiveCard.videoUrl);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onViewCreated: bgVideoPlayer created=$");
                if (interfaceC470090Ic3LIZ != null) {
                    z3 = true;
                }
                sbLIZ2.append(z3);
                C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                C20441214yg.LJ("BasePromoteVariantCard", "onViewCreated: bgVideoView is null, cannot create bgVideoPlayer");
            }
        }
        View view4 = this.LLJJIJIIJIL;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 333), view4);
        }
        View view5 = this.LLJJIJI;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 334), view5);
        }
        View view6 = this.LLJJIJIL;
        if (view6 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 335), view6);
        }
        View view7 = this.LLJJJ;
        if (view7 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 336), view7);
        }
    }

    public final void LJIJJ(String str, View view, ImageView.ScaleType scaleType) {
        C1324610kZf c1324610kZfLIZLLL = C1819620xS4.LIZ().LIZLLL(new C521890KdP(this, 11));
        c1324610kZfLIZLLL.setUrl(str);
        if (scaleType != null) {
            c1324610kZfLIZLLL.LJIJJ = scaleType;
        }
        c1324610kZfLIZLLL.LJJI(view);
    }

    @Override // X.AbstractC463340IEy
    public void LIZ(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, Room room) {
        EncourageGoLiveCard encourageGoLiveCard;
        String str;
        SpecialCard specialCard;
        super.LIZ(context, lifecycleOwner, dataChannel, room);
        Object objValueOf = null;
        if (room != null && (specialCard = room.specialCard) != null) {
            if (specialCard.type != 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SpecialCard type is not GO_LIVE_PROMOTE: ");
                sbLIZ.append(specialCard.type);
                C20441214yg.LIZIZ("RoomPromoteCardExt", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                String str2 = specialCard.payload;
                if (str2.length() == 0) {
                    C20441214yg.LJ("RoomPromoteCardExt", "SpecialCard payload is null or empty");
                } else {
                    try {
                        encourageGoLiveCard = (EncourageGoLiveCard) C293501Bt.LIZ().LJII(str2, EncourageGoLiveCard.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Failed to parse EncourageGoLiveCard from payload: ");
                        sbLIZ2.append(e.getMessage());
                        C20441214yg.LJ("RoomPromoteCardExt", C2188811AlT.LIZIZ(sbLIZ2));
                        encourageGoLiveCard = null;
                    }
                }
            }
            encourageGoLiveCard = null;
        } else {
            encourageGoLiveCard = null;
        }
        this.LLILZ = encourageGoLiveCard;
        if (encourageGoLiveCard == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Card data not found in room, id=");
            if (room != null) {
                objValueOf = Long.valueOf(room.getId());
            }
            sbLIZ3.append(objValueOf);
            C20441214yg.LJ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Card data loaded: cardId=");
            EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZ;
            if (encourageGoLiveCard2 != null) {
                str = encourageGoLiveCard2.cardId;
            } else {
                str = null;
            }
            sbLIZ4.append(str);
            sbLIZ4.append(", style=");
            EncourageGoLiveCard encourageGoLiveCard3 = this.LLILZ;
            if (encourageGoLiveCard3 != null) {
                objValueOf = Integer.valueOf(encourageGoLiveCard3.style);
            }
            sbLIZ4.append(objValueOf);
            C20441214yg.LIZIZ("BasePromoteVariantCard", C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (context != null) {
            this.LLJ = new C470070Ic1();
            C20441214yg.LIZIZ("BasePromoteVariantCard", "init: playerHelper created");
        } else {
            C20441214yg.LJ("BasePromoteVariantCard", "init: context is null, playerHelper not created");
        }
    }
}
