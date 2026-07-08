package X;

import Y.ARunnableS76S0200000_7;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.enigma.IEnigmaPublicScreenService;
import com.bytedance.android.live.room.WhisperMessageRemoveEvent;
import com.bytedance.android.live.room.WhisperMessageReplaceEvent;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.dataChannel.EnigmaCommentEnableChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import tikcast.api.privilege.enigma.EnigmaWhisperRequest;
import tikcast.api.privilege.enigma.EnigmaWhisperResponse;
import wh6.AbS324S0300000_7;

/* JADX INFO: renamed from: X.0Kbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520860Kbk implements InterfaceC1114610f6x {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final TextView LIZJ;
    public View LJFF;
    public boolean LIZLLL = true;
    public boolean LJ = true;
    public EnumC520880Kbm LJI = EnumC520880Kbm.READY;
    public String LJII = "";

    public static long LJI() {
        return InterfaceC1106030et7.y9.LIZIZ().longValue();
    }

    @Override // X.InterfaceC1114610f6x
    public final void LIZIZ() {
        if (C498310JgT.LIZ() && !C500260Jjc.LJIIZILJ(this.LIZ) && LJFF()) {
            LJII(EnumC520880Kbm.INUSE);
        }
    }

    @Override // X.InterfaceC1114610f6x
    public final boolean LIZJ() {
        return C498310JgT.LIZ() && this.LIZLLL && !C500260Jjc.LJIIZILJ(this.LIZ);
    }

    @Override // X.InterfaceC1114610f6x
    public final boolean LJ() {
        return C498310JgT.LIZ() && !C500260Jjc.LJIIZILJ(this.LIZ);
    }

    public final boolean LJFF() {
        View view;
        View view2;
        long jLIZJ = C963140bAe.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (jLIZJ < LJI() && (view2 = this.LJFF) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(view2);
            c1389890mGx.LJIIJ(C497740JfY.LJIJJ(2131852219, String.valueOf(LJI() - jLIZJ)));
            c1389890mGx.LJIIJJI();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_fail_show");
            c474500IjALIZ.LJJII("limit_reach", "fail_type");
            c474500IjALIZ.LIZ();
            LJII(EnumC520880Kbm.DISABLED);
            return false;
        }
        if (this.LJ || (view = this.LJFF) == null) {
            return true;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(view);
        c1389890mGx2.LJIIJ(C497740JfY.LJIJI(2131852218));
        c1389890mGx2.LJIIJJI();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_enigma_whisper_fail_show");
        c474500IjALIZ2.LJJII("by_host", "fail_type");
        c474500IjALIZ2.LIZ();
        LJII(EnumC520880Kbm.DISABLED);
        return false;
    }

    @Override // X.InterfaceC1114610f6x
    public final void onDestroy() {
        if (C498310JgT.LIZ()) {
            LJII(EnumC520880Kbm.READY);
        }
        this.LIZLLL = false;
        this.LJFF = null;
    }

    @Override // X.InterfaceC1114610f6x
    public final LiveIconView LIZ(View view) {
        float f;
        Object obj;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        this.LJFF = view;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.EQ2(null, EnigmaCommentEnableChannel.class, new AwS586S0100000_7(this, 334));
        }
        View viewFindViewById = view.findViewById(R.id.vxm);
        if (viewFindViewById != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
        C013C c013c = new C013C();
        LiveIconView liveIconView = new LiveIconView(view.getContext(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C439101nJ.LIZ(28), C439101nJ.LIZ(28));
        layoutParams.setMarginStart(C439101nJ.LIZ(12));
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = C439101nJ.LIZ(16);
        C786410Ut5.w6(liveIconView, layoutParams);
        liveIconView.setId(R.id.h5s);
        liveIconView.setIconAttr(R.attr.e2s);
        long jLIZJ = C963140bAe.LIZJ();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        if (jLIZJ / j >= LJI() && this.LJ) {
            f = 1.0f;
        } else {
            f = 0.48f;
        }
        C786410Ut5.i5(liveIconView, f);
        this.LIZLLL = false;
        C786410Ut5.I7(new AbS324S0300000_7(this, view, c013c, 1), liveIconView);
        long jLIZJ2 = C963140bAe.LIZJ() / j;
        if (LJI() > jLIZJ2 && (lifecycleOwner = this.LIZIZ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C520870Kbl(this, jLIZJ2, null), 3);
        }
        if (!InterfaceC1106030et7.w9.LIZIZ().booleanValue()) {
            HandlerHook.viewPostDelay(liveIconView, new ARunnableS76S0200000_7(this, liveIconView, 36), 2000L);
            c013c.element = true;
        }
        boolean z = c013c.element;
        boolean z2 = this.LIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_icon_show");
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_with_bubble");
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_availablity");
        c474500IjALIZ.LIZ();
        return liveIconView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0KZU] */
    @Override // X.InterfaceC1114610f6x
    public final void LIZLLL(C520900Kbo c520900Kbo) {
        List arrayList;
        boolean z;
        String str;
        Room room;
        C520890Kbn c520890Kbn;
        String str2;
        String str3;
        String str4;
        IMessageManager iMessageManager;
        C520890Kbn c520890Kbn2;
        C520890Kbn c520890Kbn3;
        List<EmoteWithIndex> list;
        C1114480f6k c1114480f6k = c520900Kbo.LIZ;
        if (c1114480f6k != null && (c520890Kbn3 = c1114480f6k.LJII) != null && (list = c520890Kbn3.LIZIZ) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (EmoteWithIndex emoteWithIndex : list) {
                EmoteWithIndex emoteWithIndex2 = new EmoteWithIndex();
                emoteWithIndex2.index = emoteWithIndex.index;
                emoteWithIndex2.emoteModel = emoteWithIndex.emoteModel;
                arrayList2.add(emoteWithIndex2);
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = C13BV.INSTANCE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user badge is null = ");
        List<BadgeStruct> badgeList = UserService.getInstance().user().LJIJJLI().getBadgeList();
        if (badgeList != null && !badgeList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("sendMockWhisperMessage", C2188811AlT.LIZIZ(sbLIZ));
        IEnigmaPublicScreenService iEnigmaPublicScreenService = (IEnigmaPublicScreenService) C1161920gLG.LIZJ(IEnigmaPublicScreenService.class);
        DataChannel dataChannel = c520900Kbo.LIZIZ;
        String str5 = "";
        final WhisperMessage whisperMessageRa1 = null;
        if (dataChannel != null) {
            long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
            C1114480f6k c1114480f6k2 = c520900Kbo.LIZ;
            if (c1114480f6k2 == null || (str3 = c1114480f6k2.LIZ) == null) {
                str3 = "";
            }
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            C1114480f6k c1114480f6k3 = c520900Kbo.LIZ;
            if (c1114480f6k3 == null || (c520890Kbn2 = c1114480f6k3.LJII) == null || (str4 = c520890Kbn2.LIZ) == null) {
                str4 = "";
            }
            whisperMessageRa1 = iEnigmaPublicScreenService.ra1(jLJJLIIIJ, str3, userLJIJJLI, new C520890Kbn(str4, arrayList), null);
            DataChannel dataChannel2 = c520900Kbo.LIZIZ;
            if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                iMessageManager.insertMessage(whisperMessageRa1, true);
            }
        }
        IEnigmaService iEnigmaService = (IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class);
        if (iEnigmaService != 0) {
            EnigmaWhisperRequest enigmaWhisperRequest = new EnigmaWhisperRequest();
            C1114480f6k c1114480f6k4 = c520900Kbo.LIZ;
            if (c1114480f6k4 == null || (str = c1114480f6k4.LIZ) == null) {
                str = "";
            }
            enigmaWhisperRequest.content = str;
            DataChannel dataChannel3 = c520900Kbo.LIZIZ;
            if (dataChannel3 != null) {
                enigmaWhisperRequest.roomId = C500260Jjc.LJJLIIIJ(dataChannel3);
                C1114480f6k c1114480f6k5 = c520900Kbo.LIZ;
                if (c1114480f6k5 != null && (c520890Kbn = c1114480f6k5.LJII) != null && (str2 = c520890Kbn.LIZ) != null) {
                    str5 = str2;
                }
                enigmaWhisperRequest.emotesWithIndex = str5;
                DataChannel dataChannel4 = c520900Kbo.LIZIZ;
                if (dataChannel4 != null && (room = (Room) dataChannel4.gg0(RoomChannel.class)) != null) {
                    enigmaWhisperRequest.anchorId = room.getOwnerUserId();
                    iEnigmaService.vY1(enigmaWhisperRequest, new C0KZS() { // from class: X.0KZU
                        @Override // X.C0KZS
                        public final void onFail() {
                            DataChannel dataChannel5;
                            WhisperMessage whisperMessage = whisperMessageRa1;
                            if (whisperMessage != null && (dataChannel5 = this.LIZ.LIZ) != null) {
                                dataChannel5.LC0(WhisperMessageRemoveEvent.class, whisperMessage);
                            }
                            C01CC.LJII(this.LIZ.LIZ, CardStruct.IStatusCode.DEFAULT, false);
                        }

                        @Override // X.C0KZS
                        public final void LIZ(EnigmaWhisperResponse.Data data) {
                            long j;
                            String str6;
                            String str7;
                            String str8;
                            C520860Kbk c520860Kbk = this.LIZ;
                            if (data != null) {
                                j = data.nextSendAt;
                            } else {
                                j = 0;
                            }
                            c520860Kbk.getClass();
                            InterfaceC1106030et7.y9.LJFF(Long.valueOf(j));
                            if (whisperMessageRa1 != null) {
                                if (data == null) {
                                    str7 = null;
                                } else {
                                    try {
                                        str7 = data.msgId;
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                if (C1533950q1J.LJ(str7)) {
                                    if (data != null && (str8 = data.msgId) != null) {
                                        long j2 = CastLongProtector.parseLong(str8);
                                        if (j2 > 0) {
                                            this.LIZ.LJIIIIZZ(whisperMessageRa1, j2);
                                        }
                                    }
                                } else if (data == null) {
                                    C520860Kbk c520860Kbk2 = this.LIZ;
                                    WhisperMessage whisperMessage = whisperMessageRa1;
                                    DataChannel dataChannel5 = c520860Kbk2.LIZ;
                                    if (dataChannel5 != null) {
                                        dataChannel5.LC0(WhisperMessageRemoveEvent.class, whisperMessage);
                                    }
                                }
                            }
                            DataChannel dataChannel6 = this.LIZ.LIZ;
                            if (data == null || (str6 = data.msgId) == null) {
                                str6 = CardStruct.IStatusCode.DEFAULT;
                            }
                            C01CC.LJII(dataChannel6, str6, true);
                        }
                    }, 3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.EnumC520880Kbm r5) {
        /*
            r4 = this;
            android.view.View r1 = r4.LJFF
            if (r1 == 0) goto L5e
            r0 = 2131371750(0x7f0a26e6, float:1.8363544E38)
            android.view.View r3 = r1.findViewById(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r3 = (com.bytedance.android.live.design.view.icon.LiveIconView) r3
            r0 = 2131394270(0x7f0a7ede, float:1.840922E38)
            android.view.View r2 = r1.findViewById(r0)
            X.0Kbm r0 = X.EnumC520880Kbm.INUSE
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r0) goto L63
            if (r3 == 0) goto L25
            r0 = 2131105149(0x7f06157d, float:1.7822812E38)
            r3.setIconAttr(r0)
            X.C786410Ut5.i5(r3, r1)
        L25:
            X.0Kbm r1 = r4.LJI
            X.0Kbm r0 = X.EnumC520880Kbm.DISABLED
            if (r1 == r0) goto L5f
            X.0Kbm r0 = X.EnumC520880Kbm.READY
            if (r1 == r0) goto L5f
            if (r2 == 0) goto L37
        L31:
            r0 = 2130974204(0x7f0415fc, float:1.7557224E38)
            r2.setBackgroundResource(r0)
        L37:
            android.widget.TextView r0 = r4.LIZJ
            if (r0 == 0) goto L47
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L49
        L47:
            java.lang.String r0 = ""
        L49:
            r4.LJII = r0
            android.widget.TextView r1 = r4.LIZJ
            if (r1 == 0) goto L59
            r0 = 2131852222(0x7f117bbe, float:1.9338057E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r1.setText(r0)
        L59:
            r0 = 1
            r4.LIZLLL = r0
        L5c:
            r4.LJI = r5
        L5e:
            return
        L5f:
            r2.getBackground()
            goto L31
        L63:
            if (r3 == 0) goto L75
            r0 = 2131106144(0x7f061960, float:1.782483E38)
            r3.setIconAttr(r0)
            X.0Kbm r0 = X.EnumC520880Kbm.DISABLED
            if (r5 != r0) goto L72
            r1 = 1056293519(0x3ef5c28f, float:0.48)
        L72:
            X.C786410Ut5.i5(r3, r1)
        L75:
            if (r2 == 0) goto L87
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L87
            r0 = 2130974192(0x7f0415f0, float:1.75572E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setBackground(r0)
        L87:
            java.lang.String r0 = r4.LJII
            boolean r0 = X.C1533950q1J.LJ(r0)
            if (r0 == 0) goto L98
            android.widget.TextView r1 = r4.LIZJ
            if (r1 == 0) goto L98
            java.lang.String r0 = r4.LJII
            r1.setText(r0)
        L98:
            r0 = 0
            r4.LIZLLL = r0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520860Kbk.LJII(X.0Kbm):void");
    }

    public final void LJIIIIZZ(WhisperMessage whisperMessage, long j) {
        if (j > 0) {
            WhisperMessage whisperMessage2 = new WhisperMessage();
            CommonMessageData commonMessageData = new CommonMessageData();
            CommonMessageData commonMessageData2 = whisperMessage.baseMessage;
            commonMessageData.roomId = commonMessageData2.roomId;
            commonMessageData.messageId = j;
            commonMessageData.showMsg = true;
            commonMessageData.describe = commonMessageData2.describe;
            whisperMessage2.baseMessage = commonMessageData;
            whisperMessage2.content = whisperMessage.content;
            whisperMessage2.user = whisperMessage.user;
            whisperMessage2.backgroundImage = whisperMessage.backgroundImage;
            whisperMessage2.f316emotes = whisperMessage.f316emotes;
            whisperMessage2.encodingType = whisperMessage.encodingType;
            whisperMessage2.isLocalInsertMsg = false;
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(WhisperMessageReplaceEvent.class, new C0WIY(whisperMessage, whisperMessage2));
            }
        }
    }

    public C520860Kbk(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TextView textView) {
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = textView;
    }
}
