package X;

import Y.ACListenerS152S0100000_17;
import Y.ATListenerS450S0100000_17;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.gift.LivePSMGiftIconSpaceFixSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageMarginOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenClickCloseKeyboardSetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mr0.r0;
import qo2.w;

/* JADX INFO: renamed from: X.0f1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1111050f1D<MODEL extends r0<? extends AbstractC1136060ffY>> extends AbstractC1111060f1E<MODEL> implements InterfaceC176300m1 {
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final SimpleLiveTextView LLJ;
    public final C421320Gfa LLJI;
    public final View LLJIJIL;
    public CharSequence LLJILJIL;
    public final View LLJILJILJ;
    public ValueAnimator LLJILLL;
    public boolean LLJJ;
    public final C1114030f61 LLJJI;
    public final boolean LLJJIII;
    public final float LLJJIJI;
    public final float LLJJIJIIJIL;
    public int LLJJIJIL;
    public final int LLJJJ;

    @Override // X.AbstractC1111020f1A
    public final void LLIILZL() {
        super.LLIILZL();
        AbstractC1113530f5D abstractC1113530f5D = this.LLILZ;
        if (abstractC1113530f5D != null) {
            abstractC1113530f5D.LJIIIIZZ();
        }
    }

    @Override // X.AbstractC1111020f1A
    public void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJILLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C1114030f61 c1114030f61 = this.LLJJI;
        if (c1114030f61 != null) {
            ((Handler) c1114030f61.LIZJ.getValue()).removeCallbacksAndMessages(null);
        }
    }

    public boolean R5(MODEL model) {
        PublicAreaMessageCommon.OperationInfo operationInfo;
        PublicAreaMessageCommon.OperationState operationState;
        if (this.LLILZLL) {
            return false;
        }
        C161200ja c161200ja = C161200ja.LIZ;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = model.LLIIII();
        Boolean boolValueOf = null;
        if (publicAreaMessageCommonLLIIII != null) {
            operationInfo = publicAreaMessageCommonLLIIII.operationInfo;
        } else {
            operationInfo = null;
        }
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9.LJI);
        }
        c161200ja.getClass();
        if (operationInfo == null || (operationState = operationInfo.initialState) == null) {
            return false;
        }
        if (Intrinsics.LJFF(operationState.scene, "wave") && !Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public final void S5(String str) {
        C1109770ez9 c1109770ez9 = this.LL;
        if (c1109770ez9 != null) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = this.LLILLJJLI;
            C1111350f1h c1111350f1h = new C1111350f1h();
            c1111350f1h.LJFF = str;
            c1111350f1h.LIZ = "report_user";
            c1111350f1h.LIZIZ = "long_press";
            c1109770ez9.LJII(abstractC1110800f0o, c1111350f1h);
        }
    }

    @Override // X.InterfaceC176300m1
    public final void LLLL(Bitmap bitmap, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o) {
        Spannable spannable;
        Spannable spannable2;
        if (bitmap != null && abstractC1110800f0o != null) {
            if (LivePSMGiftIconSpaceFixSetting.INSTANCE.enabled()) {
                CharSequence charSequence = this.LLJILJIL;
                if ((charSequence instanceof Spannable) && (spannable2 = (Spannable) charSequence) != null) {
                    C1133830fbx.LIZLLL(spannable2, bitmap, abstractC1110800f0o, true);
                }
            } else {
                int iLJJJJI = a0.LJJJJI(String.valueOf(this.LLJILJIL), " . ", 0, 6);
                if (iLJJJJI != -1) {
                    CharSequence charSequence2 = this.LLJILJIL;
                    if ((charSequence2 instanceof Spannable) && (spannable = (Spannable) charSequence2) != null) {
                        C1133830fbx.LIZIZ(spannable, bitmap, iLJJJJI + 1, iLJJJJI + 2, abstractC1110800f0o);
                    }
                }
            }
            this.LLJ.setText(this.LLJILJIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x038b, code lost:
    
        if (r3 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038d, code lost:
    
        r1 = r7.getSpanEnd(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0391, code lost:
    
        if (r1 <= r6) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0393, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041e  */
    @Override // X.AbstractC1111060f1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P5(X.C1109770ez9 r28, final MODEL r29, java.util.List<java.lang.Object> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111050f1D.P5(X.0ez9, X.0f0o, java.util.List):void");
    }

    public void T5(String str, EnumC1110950f13 enumC1110950f13, C1109770ez9 c1109770ez9, MODEL model, List<Object> list) {
        long id;
        if (str != null && C1110960f14.LIZ[enumC1110950f13.ordinal()] == 1 && Intrinsics.LJFF(str, "follow")) {
            C161200ja c161200ja = C161200ja.LIZ;
            final DataChannel dataChannel = c1109770ez9.LJIIIZ;
            final Room room = c1109770ez9.LJII;
            final long jLLIIJI = model.LLIIJI();
            final MESSAGE message = model.LJIL;
            AwS383S0200000_17 awS383S0200000_17 = new AwS383S0200000_17(this, (C1111050f1D<int>) model, 135);
            c161200ja.getClass();
            if (UserService.getInstance().user().isLogin()) {
                if (message instanceof SocialMessage) {
                    C161200ja.LIZ(dataChannel, "follow", (SocialMessage) message);
                }
                awS383S0200000_17.invoke(EnumC1110950f13.OPERATION_STATE_SUCCESS_STATUS);
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                C1099420eiS c1099420eiS = new C1099420eiS();
                c1099420eiS.LIZIZ(jLLIIJI);
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                c1099420eiS.LJ(id);
                c1099420eiS.getClass();
                interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0JG0
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        String str2;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        String str3;
                        Object obj5;
                        String str4;
                        C1C7U.LIZ("MessageOperationStateUtils@1b1d.handleTextOperationStateFollow$1");
                        C784440Upu.LIZ().LIZIZ(new C257100z3((FollowPair) obj));
                        C161200ja c161200ja2 = C161200ja.LIZ;
                        DataChannel dataChannel2 = dataChannel;
                        Room room2 = room;
                        long j = jLLIIJI;
                        AbstractC1136060ffY abstractC1136060ffY = message;
                        c161200ja2.getClass();
                        CommonMessageData commonMessageData = abstractC1136060ffY.baseMessage;
                        String str5 = "";
                        if (commonMessageData == null || (str2 = commonMessageData.logId) == null) {
                            str2 = "";
                        }
                        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                        if (iInteractService.J8()) {
                            obj2 = "anchor";
                        } else if (iInteractService.Nf2()) {
                            obj2 = "guest";
                        } else {
                            obj2 = "audience";
                        }
                        if ((room2 != null && j == room2.getOwnerUserId()) || 0 != 0) {
                            obj3 = "anchor";
                        } else if (iInteractService.rm0(j) == 2) {
                            obj3 = "guest";
                        } else {
                            obj3 = "audience";
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow");
                        String str6 = CardStruct.IStatusCode.DEFAULT;
                        if (room2 != null) {
                            c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(room2.getId())), "server_heat_level");
                            c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(room2.getId())), "client_heat_level");
                            c474500IjALIZ.LJJII(Long.valueOf(room2.liveSubOnly), "is_sub_only_live");
                            if (room2.getOwner() != null && room2.getOwner().isAnchorHasSubQualification()) {
                                if (room2.getOwner().isSubscribed()) {
                                    str4 = "1";
                                } else {
                                    str4 = CardStruct.IStatusCode.DEFAULT;
                                }
                            } else {
                                str4 = "-1";
                            }
                            c474500IjALIZ.LJJII(str4, "is_subscription");
                            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2(), "multi_tool");
                        }
                        if (Intrinsics.LJFF(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "manual_pk")) {
                            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                                c474500IjALIZ.LJJII("pk_phase", "match_status");
                            } else {
                                c474500IjALIZ.LJJII(LiveCenterMockToolSwitch.PUNISH, "match_status");
                            }
                        }
                        c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12()) {
                            List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
                            if (listB70.size() > 2) {
                                obj5 = "1";
                            } else {
                                obj5 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c474500IjALIZ.LJJII(obj5, "is_multi");
                            c474500IjALIZ.LJJII(String.valueOf(listB70.size()), "current_connection_cnts");
                            c474500IjALIZ.LJJII(listB70.toString(), "uid_list");
                        } else {
                            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_multi");
                            c474500IjALIZ.LJJII(new Long[]{Long.valueOf(j), Long.valueOf(UserService.getInstance().user().getCurrentUserId())}.toString(), "uid_list");
                            c474500IjALIZ.LJJII("2", "current_connection_cnts");
                        }
                        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
                        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
                        c474500IjALIZ.LJJII(Long.valueOf(iLiveHostCrossRoomEventHelper.getIsTransfer()), "is_transfer");
                        c474500IjALIZ.LJJII(Long.valueOf(iLiveHostCrossRoomEventHelper.getIsMatchOpponent()), "is_match_opponent");
                        if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1()) {
                            ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Wz0(c474500IjALIZ);
                        }
                        if (Intrinsics.LJFF(obj2, "anchor") && Intrinsics.LJFF(obj3, "audience")) {
                            str5 = "live_anchor_c_audience";
                        } else if (Intrinsics.LJFF(obj2, "anchor") && Intrinsics.LJFF(obj3, "anchor")) {
                            str5 = "live_anchor_c_anchor";
                        } else if (Intrinsics.LJFF(obj2, "anchor") && Intrinsics.LJFF(obj3, "guest")) {
                            str5 = "live_anchor_c_guest";
                        } else if (Intrinsics.LJFF(obj2, "guest") && Intrinsics.LJFF(obj3, "audience")) {
                            str5 = "live_guest_c_audience";
                        } else if (Intrinsics.LJFF(obj2, "guest") && Intrinsics.LJFF(obj3, "anchor")) {
                            str5 = "live_guest_c_anchor";
                        } else if (Intrinsics.LJFF(obj2, "guest") && Intrinsics.LJFF(obj3, "guest")) {
                            str5 = "live_guest_c_guest";
                        } else if (Intrinsics.LJFF(obj2, "audience") && Intrinsics.LJFF(obj3, "audience")) {
                            str5 = "live_audience_c_audience";
                        } else if (Intrinsics.LJFF(obj2, "audience") && Intrinsics.LJFF(obj3, "guest")) {
                            str5 = "live_audience_c_guest";
                        }
                        c474500IjALIZ.LJJII(str5, "request_page");
                        c474500IjALIZ.LJJII("mg_cta_comment", "click_user_position");
                        c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
                        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "connection_type");
                        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oE2(), "core_connection_type");
                        c474500IjALIZ.LJJII(str2, "notification_request_id");
                        c474500IjALIZ.LJJII("follow_guide_chat", "notification_type");
                        w.LIZ.getClass();
                        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
                            obj4 = "1";
                        } else {
                            obj4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c474500IjALIZ.LJJII(obj4, "is_portal_user");
                        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJ()), "portal_id");
                        if (C924810aAp.LJ().LJJII > 0) {
                            str6 = "1";
                        }
                        c474500IjALIZ.LJJII(str6, "is_guest_connection");
                        if (C497740JfY.LJIL()) {
                            str3 = "portrait";
                        } else {
                            str3 = "landscape";
                        }
                        c474500IjALIZ.LJJII(str3, "room_orientation");
                        c474500IjALIZ.LJJII("follow_back", "follow_icon_type");
                        c474500IjALIZ.LJJIIZI(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(Long.valueOf(j)));
                        c474500IjALIZ.LJIJJLI(dataChannel2);
                        c474500IjALIZ.LJJIZ(dataChannel2);
                        c474500IjALIZ.LIZ();
                        C1C7U.LIZIZ("MessageOperationStateUtils@1b1d.handleTextOperationStateFollow$1");
                    }
                }, new C09JN() { // from class: X.00Ko
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("MessageOperationStateUtils@1b1d.handleTextOperationStateFollow$2");
                        C1C7U.LIZIZ("MessageOperationStateUtils@1b1d.handleTextOperationStateFollow$2");
                    }
                });
            }
        }
    }

    public C1111050f1D(View view, AbstractC1113530f5D abstractC1113530f5D, boolean z, boolean z2, boolean z3, boolean z4) throws Throwable {
        super(view, abstractC1113530f5D);
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = z4;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.m6p);
        this.LLIZLLLIL = viewGroup;
        SimpleLiveTextView simpleLiveTextView = (SimpleLiveTextView) view.findViewById(R.id.text);
        this.LLJ = simpleLiveTextView;
        C421320Gfa c421320Gfa = (C421320Gfa) view.findViewById(R.id.k55);
        this.LLJI = c421320Gfa;
        this.LLJIJIL = view;
        this.LLJILJILJ = view.findViewById(R.id.bnu);
        this.LLJJ = true;
        this.LLJJIII = LiveMessageMarginOptSetting.INSTANCE.enable();
        this.LLJJIJI = 1.0f;
        AbstractViewOnLongClickListenerC1111100f1I abstractViewOnLongClickListenerC1111100f1I = new AbstractViewOnLongClickListenerC1111100f1I(this) { // from class: X.0f1H
            public final /* synthetic */ C1111050f1D<MODEL> LLILLJJLI;

            @Override // X.AbstractViewOnLongClickListenerC1111100f1I
            public final void LIZ() {
                this.LLILLJJLI.S5("comment");
            }

            {
                this.LLILLJJLI = this;
            }
        };
        ATListenerS450S0100000_17 aTListenerS450S0100000_17 = new ATListenerS450S0100000_17(this, 17);
        C1098990ehl.LIZ(new ACListenerS152S0100000_17(this, 211), c421320Gfa);
        if (c421320Gfa != null) {
            c421320Gfa.setOnLongClickListener(new AbstractViewOnLongClickListenerC1111100f1I(this) { // from class: X.0f1F
                public final /* synthetic */ C1111050f1D<MODEL> LLILLJJLI;

                @Override // X.AbstractViewOnLongClickListenerC1111100f1I
                public final void LIZ() {
                    AbstractC1111020f1A abstractC1111020f1A = this.LLILLJJLI;
                    C1109770ez9 c1109770ez9 = abstractC1111020f1A.LL;
                    if (c1109770ez9 != null) {
                        AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = abstractC1111020f1A.LLILLJJLI;
                        C1111350f1h c1111350f1h = new C1111350f1h();
                        c1111350f1h.LJFF = "avatar";
                        c1111350f1h.LIZ = "report_message";
                        c1111350f1h.LIZIZ = "long_press";
                        c1109770ez9.LJII(abstractC1110800f0o, c1111350f1h);
                    }
                }

                {
                    this.LLILLJJLI = this;
                }
            });
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "comment";
        C1109960ezS c1109960ezS = new C1109960ezS();
        c1109960ezS.LJ = false;
        c1109960ezS.LJIIIIZZ = new InterfaceC1109980ezU() { // from class: X.0f0u
            @Override // X.InterfaceC1109980ezU
            public final void onEventDown(ClickableSpan clickableSpan) {
                if (clickableSpan instanceof C1110020ezY) {
                    c259800zU.element = "user_name";
                } else {
                    if (!(clickableSpan instanceof C1110050ezb)) {
                        return;
                    }
                    c259800zU.element = "comment";
                }
            }
        };
        simpleLiveTextView.setMovementMethod(c1109960ezS);
        simpleLiveTextView.setOnLongClickListener(new AbstractViewOnLongClickListenerC1111100f1I(this) { // from class: X.0f1G
            public final /* synthetic */ C1111050f1D<MODEL> LLILLJJLI;

            @Override // X.AbstractViewOnLongClickListenerC1111100f1I
            public final void LIZ() {
                this.LLILLJJLI.S5(c259800zU.element);
            }

            {
                this.LLILLJJLI = this;
            }
        });
        this.LLJJIJIIJIL = simpleLiveTextView.getLineSpacingExtra();
        this.LLJJIJI = simpleLiveTextView.getLineSpacingMultiplier();
        view.setOnLongClickListener(abstractViewOnLongClickListenerC1111100f1I);
        view.setOnTouchListener(aTListenerS450S0100000_17);
        if (z3) {
            AbstractC1111020f1A.I5(simpleLiveTextView, z2);
        } else {
            C1152540g68.LIZJ(simpleLiveTextView, z4, z2);
        }
        if (LivePublicScreenClickCloseKeyboardSetting.INSTANCE.marginCanNotCloseKeyboard(z4)) {
            view.setOnTouchListener(new ATListenerS450S0100000_17(this, 16));
        }
        this.LLJJI = new C1114030f61(view.getContext(), simpleLiveTextView);
        int paddingBottom = viewGroup.getPaddingBottom();
        this.LLJJJ = paddingBottom;
        this.LLJJIJIL = paddingBottom;
    }
}
