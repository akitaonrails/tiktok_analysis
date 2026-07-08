package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModelKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11qJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19624911qJ extends AbstractC19588311kP<LiveEventStoryStickerModel> implements InterfaceC1141530foN {
    public ConstraintLayout LLILZIL;
    public C1324720kZq LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public C0GSX LLJI;
    public C1324720kZq LLJIJIL;
    public C0GSX LLJILJIL;
    public C11JF LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void destroy() {
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1548820qPI.LJIIIIZZ("live_event_update_result", this);
    }

    public final InterfaceC19625011qK getOnClickListener() {
        return (InterfaceC19625011qK) this.LLJILLL.getValue();
    }

    public final JSONObject getStoryParams() {
        return (JSONObject) this.LLJJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r6 = this;
            super.onAttachedToWindow()
            boolean r0 = r6.LLJJIII
            if (r0 != 0) goto L5f
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r6.getStruct()
            X.11ks r0 = r6.getInteractStickerContainerCommonParam()
            if (r0 == 0) goto L65
            X.0RmZ r5 = r0.LJFF
        L13:
            X.11ks r0 = r6.getInteractStickerContainerCommonParam()
            r4 = 0
            if (r0 == 0) goto L63
            boolean r0 = r0.LJIIJ
            r1 = 1
            if (r0 != r1) goto L63
        L1f:
            java.lang.String r0 = "livesdk_live_event_user_entrance_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            X.C19615611oo.LIZ(r2, r3, r5, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "is_multi_event"
            r2.LJJII(r1, r0)
            com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct r0 = r3.getCountDownStickerStruct()
            java.lang.String r1 = X.C19615611oo.LIZJ(r0)
            java.lang.String r0 = "main_live_event_status"
            r2.LJJII(r1, r0)
            com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct r0 = r3.getCountDownStickerStruct()
            long r0 = r0.getEventId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "main_live_event_id"
            r2.LJJII(r1, r0)
            boolean r0 = X.C19615611oo.LIZLLL(r3)
            if (r0 == 0) goto L60
            java.lang.String r1 = "story"
        L57:
            java.lang.String r0 = "event_page"
            r2.LJJII(r1, r0)
            r2.LIZ()
        L5f:
            return
        L60:
            java.lang.String r1 = "sticker"
            goto L57
        L63:
            r1 = 0
            goto L1f
        L65:
            r5 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19624911qJ.onAttachedToWindow():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupButtonAtConsumeScene(com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L81
            java.lang.Boolean r1 = r13.getSubscribe()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        Lc:
            r12.LJ(r0)
            X.127h r2 = r12.LLJ
            if (r2 == 0) goto L1d
            Y.ACListenerS163S0100000_29 r1 = new Y.ACListenerS163S0100000_29
            r0 = 301(0x12d, float:4.22E-43)
            r1.<init>(r12, r0)
            X.C786410Ut5.U8(r2, r1)
        L1d:
            X.11ks r0 = r12.getInteractStickerContainerCommonParam()
            r5 = 0
            if (r0 == 0) goto L7f
            X.0RmZ r0 = r0.LJFF
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.LIZJ
        L2a:
            X.11JF r0 = r12.LLJILJILJ
            if (r0 == 0) goto L31
            r0.dispose()
        L31:
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r6 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto L74
            X.15v3 r4 = r0.k4()
            if (r4 == 0) goto L74
            if (r3 == 0) goto L79
            java.lang.String r0 = r3.getUid()
            if (r0 == 0) goto L79
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L79
            long r1 = r0.longValue()
        L59:
            java.lang.String r0 = r3.getSecUid()
        L5d:
            X.11NZ r2 = r4.LJFF(r1, r0)
            if (r2 == 0) goto L74
            r0 = 1
            X.11Hu r2 = r2.LJLIIL(r0)
            Y.AfS163S0200000_29 r1 = new Y.AfS163S0200000_29
            r0 = 15
            r1.<init>(r12, r3, r0)
            X.01kM r5 = r2.LJJLJLI(r1)
        L74:
            X.11JF r5 = (X.C11JF) r5
            r12.LLJILJILJ = r5
            return
        L79:
            r1 = 0
            if (r3 != 0) goto L59
            r0 = r5
            goto L5d
        L7f:
            r3 = r5
            goto L2a
        L81:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19624911qJ.setupButtonAtConsumeScene(com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct):void");
    }

    public final void LJ(boolean z) {
        this.LLJJI = z;
        if (z) {
            C197039127h c197039127h = this.LLJ;
            if (c197039127h != null) {
                c197039127h.setText(getContext().getString(2131851061));
            }
            C197039127h c197039127h2 = this.LLJ;
            if (c197039127h2 != null) {
                c197039127h2.setButtonVariant(1);
                return;
            }
            return;
        }
        C197039127h c197039127h3 = this.LLJ;
        if (c197039127h3 != null) {
            c197039127h3.setText(getContext().getString(2131851060));
        }
        C197039127h c197039127h4 = this.LLJ;
        if (c197039127h4 == null) {
            return;
        }
        c197039127h4.setButtonVariant(0);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        LiveEventModule liveEventModuleLIZ;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_update_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (liveEventModuleLIZ = C477390Inp.LIZ(interfaceC1107590evd)) == null) {
            return;
        }
        LJ(liveEventModuleLIZ.subscribed);
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(liveEventModuleLIZ.title);
        }
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C1840140xzA.LIZ(liveEventModuleLIZ.startTime * 1000));
        }
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
        this.LLJJIII = false;
        LIZIZ(this, null, interactStickerStruct.getCountDownStickerStruct(), 1);
        C1548820qPI.LIZLLL("live_event_update_result", this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19624911qJ(int i, Context context, C19591211ks c19591211ks) {
        c19591211ks = (i & 8) != 0 ? null : c19591211ks;
        super(0, context, (AttributeSet) null, c19591211ks);
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(c19591211ks, 979));
        this.LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1063));
    }

    public final void LIZLLL(Context context, User user, long j) {
        String str;
        String strOptString;
        C0J5O c0j5oZ5;
        C705930RmZ c705930RmZ;
        C0R60 c0r60;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mRoomsData.userId = user.getUid();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        String strOptString2 = null;
        if (interactStickerContainerCommonParam != null && (c705930RmZ = interactStickerContainerCommonParam.LJFF) != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        roomsData.enterFromMerge = str;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.enterMethod = "story_liveevent";
        roomsData2.enterType = "click";
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        logData.anchorType = "click";
        roomsData2.windowMode = "full_screen";
        JSONObject storyParams = getStoryParams();
        if (storyParams != null) {
            strOptString = storyParams.optString("enter_from");
        } else {
            strOptString = null;
        }
        logData.storyEnterFrom = strOptString;
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        JSONObject storyParams2 = getStoryParams();
        if (storyParams2 != null) {
            strOptString2 = storyParams2.optString("enter_position");
        }
        logData2.storyEnterPosition = strOptString2;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.watchLive(context, enterRoomConfig, user.roomData);
        }
    }

    public static void LIZIZ(C19624911qJ c19624911qJ, LiveEventStoryStickerModel liveEventStoryStickerModel, CountDownStickerStruct countDownStickerStruct, int i) {
        C705930RmZ c705930RmZ;
        User user;
        UrlModel avatarMedium;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        FrameLayout.LayoutParams layoutParams;
        ImageModel imageModel = null;
        if ((i & 1) != 0) {
            liveEventStoryStickerModel = null;
        }
        if ((i & 2) != 0) {
            countDownStickerStruct = null;
        }
        ViewGroup.LayoutParams layoutParams2 = c19624911qJ.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) C786410Ut5.Td(C786410Ut5.ne(c19624911qJ.getContext()), R.layout.dcp, c19624911qJ, false);
        c19624911qJ.LLILZIL = constraintLayout;
        c19624911qJ.LLILZLL = (C1324720kZq) constraintLayout.findViewById(R.id.ln6);
        c19624911qJ.LLIZ = (TuxTextView) constraintLayout.findViewById(R.id.zux);
        c19624911qJ.LLIZLLLIL = (TuxTextView) constraintLayout.findViewById(R.id.zuy);
        c19624911qJ.LLJ = (C197039127h) constraintLayout.findViewById(R.id.crq);
        c19624911qJ.LLJI = (C0GSX) constraintLayout.findViewById(R.id.ln2);
        c19624911qJ.LLJIJIL = (C1324720kZq) constraintLayout.findViewById(R.id.mts);
        c19624911qJ.LLJILJIL = (C0GSX) constraintLayout.findViewById(R.id.mtu);
        c19624911qJ.addView(c19624911qJ.LLILZIL);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(28));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
        Drawable drawableLIZ = c384050F3z.LIZ(c19624911qJ.getContext());
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZIZ(2);
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
        c19659111vp.LJFF = CaptionModelKt.toColor("#0000001F");
        c19659111vp.LIZ = C418440Gaw.LIZIZ(28);
        c19624911qJ.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(c19624911qJ.getContext())));
        c19624911qJ.postInvalidate();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, c19624911qJ.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C0GSX c0gsx = c19624911qJ.LLJILJIL;
            if (c0gsx != null) {
                c0gsx.LIZ(iIntValue, iIntValue);
            }
        }
        if (c19624911qJ.LLJJIII) {
            if (liveEventStoryStickerModel != null) {
                long endTime = liveEventStoryStickerModel.getEndTime();
                TuxTextView tuxTextView3 = c19624911qJ.LLIZ;
                if (tuxTextView3 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    long j = endTime * 1000;
                    sbLIZ.append(C1838110xvt.LIZ(j, true));
                    sbLIZ.append(", ");
                    sbLIZ.append(C1838110xvt.LIZJ.format(Long.valueOf(j)));
                    tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                String title = liveEventStoryStickerModel.getTitle();
                if (title != null && (tuxTextView2 = c19624911qJ.LLIZLLLIL) != null) {
                    tuxTextView2.setText(title);
                }
            }
            C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarMedium()).LJJI(c19624911qJ.LLILZLL);
            C197039127h c197039127h = c19624911qJ.LLJ;
            if (c197039127h != null) {
                c197039127h.setText(2131852232);
            }
            ConstraintLayout constraintLayout2 = c19624911qJ.LLILZIL;
            if (constraintLayout2 != null) {
                C786410Ut5.Y7(constraintLayout2, new ACListenerS131S0200000_29(c19624911qJ, liveEventStoryStickerModel, 56));
                return;
            }
            return;
        }
        if (countDownStickerStruct != null) {
            Long expiredTime = countDownStickerStruct.getExpiredTime();
            if (expiredTime != null) {
                long jLongValue = expiredTime.longValue();
                TuxTextView tuxTextView4 = c19624911qJ.LLIZ;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(C1840140xzA.LIZ(jLongValue * 1000));
                }
            }
            String title2 = countDownStickerStruct.getTitle();
            if (title2 != null && (tuxTextView = c19624911qJ.LLIZLLLIL) != null) {
                tuxTextView.setText(title2);
            }
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        C19591211ks interactStickerContainerCommonParam = c19624911qJ.getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam != null && (c705930RmZ = interactStickerContainerCommonParam.LJFF) != null && (user = c705930RmZ.LIZJ) != null && (avatarMedium = user.getAvatarMedium()) != null) {
            imageModel = new ImageModel(avatarMedium.getUri(), avatarMedium.getUrlList());
        }
        c0jbnLIZ.LJIIIZ(imageModel).LJJI(c19624911qJ.LLILZLL);
        c19624911qJ.setupButtonAtConsumeScene(countDownStickerStruct);
        ConstraintLayout constraintLayout3 = c19624911qJ.LLILZIL;
        if (constraintLayout3 == null) {
            return;
        }
        C786410Ut5.Y7(constraintLayout3, new ACListenerS163S0100000_29(c19624911qJ, 302));
    }
}
