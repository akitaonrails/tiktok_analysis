package X;

import Y.ARunnableS133S0100000_33;
import Y.AfS161S0200000_27;
import Y.AfS166S0200000_33;
import Y.AfS196S0100000_27;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.publicscreen.api.BackToAppEvent;
import com.bytedance.android.live.publicscreen.api.GameBillboardChannel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.comp.api.game.GameLivePlayTogetherPickedCancelChannel;
import com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo;
import com.bytedance.android.livesdk.game.model.PlayTogetherExtraInfo;
import com.bytedance.android.livesdk.game.model.PlayTogetherMember;
import com.bytedance.android.livesdk.game.model.PlayTogetherTemplateV2;
import com.bytedance.android.livesdk.game.playtogether.GameLivePlayTogetherController$billboardPickTimeHandler$2$1;
import com.bytedance.android.livesdk.game.playtogether.LivePlayTogetherApi;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLivePlayTogetherConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GamePlayTogether3Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtlivePlayTogetherPickedTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtlivePlayTogetherSchemaSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtlivePlayTogetherSchemaV2Setting;
import com.bytedance.android.livesdk.model.message.GameRevenueTipsMessage;
import com.bytedance.android.livesdk.model.message.PlayTogetherListChangeContent;
import com.bytedance.android.livesdk.model.message.PlayTogetherMessage;
import com.bytedance.android.livesdk.model.message.PlayTogetherPermitNoticeContent;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;
import webcast.api.game.CreatePlayTogetherRequest;
import webcast.api.game.PlayTogetherTemplate;
import webcast.api.game.StartPlayTogetherV2Request;

/* JADX INFO: renamed from: X.1AIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177041AIc implements InterfaceC501410JlT, OnIMMessageListener, InterfaceC777850UfH, InterfaceC1141530foN {
    public C492290JSh LL;
    public Room LLILLJJLI;
    public C11JF LLILLL;
    public C11JF LLILZ;
    public C11JF LLILZIL;
    public List<PlayTogetherTemplate> LLILZLL;
    public IMessageManager LLIZ;
    public DataChannel LLIZLLLIL;
    public Context LLJ;
    public C11JF LLJI;
    public boolean LLJIJIL;
    public PlayTogetherMessage LLJILJIL;
    public long LLJILJILJ;
    public C19487111Lx LLJJI;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public SparkContext LLJL;
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(11));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 59));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(10));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(12));
    public final long LLJJIJIIJIL = 300000;
    public final int LLJJIJIL = 2;
    public final long LLJJJ = 900000;
    public final int LLJJJIL = 10;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(136));

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "play_together_widgets";
    }

    public final GameLivePlayTogetherController$billboardPickTimeHandler$2$1 LIZ() {
        return (GameLivePlayTogetherController$billboardPickTimeHandler$2$1) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC501410JlT
    public final boolean LIZJ() {
        PlayTogetherBasicInfo playTogetherBasicInfo;
        Room room = this.LLILLJJLI;
        return ((room != null ? room.playTogetherInfo : null) == null || room == null || (playTogetherBasicInfo = room.playTogetherInfo) == null || playTogetherBasicInfo.status != 6) ? false : true;
    }

    @Override // X.InterfaceC501410JlT
    public final void LJ() {
        C20337914i1<Boolean> c20337914i1;
        String creatprQueueSchema;
        LiveMode streamType;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        String str;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        PlayTogetherBasicInfo playTogetherBasicInfo2;
        GameLivePlayTogetherConfigSetting gameLivePlayTogetherConfigSetting = GameLivePlayTogetherConfigSetting.INSTANCE;
        boolean zEnableV2 = gameLivePlayTogetherConfigSetting.enableV2();
        if (LIZJ()) {
            Room room = this.LLILLJJLI;
            if (room == null || (playTogetherBasicInfo2 = room.playTogetherInfo) == null || playTogetherBasicInfo2.businessVersion != 1) {
                zEnableV2 = false;
            } else {
                zEnableV2 = true;
            }
        } else {
            c20337914i1 = zEnableV2 ? InterfaceC772390URp.m0 : InterfaceC772390URp.l0;
        }
        Boolean boolLIZIZ = c20337914i1.LIZIZ();
        if (zEnableV2) {
            if (LIZJ()) {
                creatprQueueSchema = TtlivePlayTogetherSchemaV2Setting.INSTANCE.getCreatorQueueSchema();
            } else if (boolLIZIZ.booleanValue()) {
                creatprQueueSchema = TtlivePlayTogetherSchemaV2Setting.INSTANCE.getCreatorSettingSchema();
            } else {
                InterfaceC772390URp.m0.LJFF(Boolean.TRUE);
                creatprQueueSchema = TtlivePlayTogetherSchemaV2Setting.INSTANCE.getCreatorGuideSchema();
            }
        } else if (boolLIZIZ.booleanValue()) {
            creatprQueueSchema = LIZJ() ? TtlivePlayTogetherSchemaSetting.INSTANCE.getCreatprQueueSchema() : TtlivePlayTogetherSchemaSetting.INSTANCE.getCreatorSettingSchema();
        } else {
            InterfaceC772390URp.l0.LJFF(Boolean.TRUE);
            creatprQueueSchema = TtlivePlayTogetherSchemaSetting.INSTANCE.getCreatorGuideSchema();
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(creatprQueueSchema).buildUpon().appendQueryParameter("show_entrance", "interact_panel");
        Room room2 = this.LLILLJJLI;
        if (room2 == null || (streamType = room2.getStreamType()) == null) {
            streamType = LiveMode.SCREEN_RECORD;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("live_type", C354201Zc.LIZ(streamType)).appendQueryParameter("use_spark", "1");
        if (LIZJ()) {
            Room room3 = this.LLILLJJLI;
            if (room3 == null || (playTogetherBasicInfo = room3.playTogetherInfo) == null || (str = playTogetherBasicInfo.playTogetherId) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            builderAppendQueryParameter2.appendQueryParameter("play_together_id", str);
        }
        if (zEnableV2) {
            builderAppendQueryParameter2.appendQueryParameter("enable_show_board", gameLivePlayTogetherConfigSetting.enableBoard() ? "1" : CardStruct.IStatusCode.DEFAULT);
            builderAppendQueryParameter2.appendQueryParameter("force_theme_style", "light");
        }
        String string = builderAppendQueryParameter2.build().toString();
        SparkContext sparkContext = this.LLJL;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        Context context = this.LLJ;
        if (context != null) {
            SparkContext sparkContextYC1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, string, null);
            sparkContextYC1.LJJJJZI(new C2189801An4(this, 0));
            this.LLJL = sparkContextYC1;
        }
    }

    @Override // X.InterfaceC501410JlT
    public final void LJJII() {
        PlayTogetherBasicInfo playTogetherBasicInfo;
        User userLJIIIIZZ;
        String str;
        Room room = this.LLILLJJLI;
        if (room == null || (playTogetherBasicInfo = room.playTogetherInfo) == null) {
            return;
        }
        if (playTogetherBasicInfo.businessVersion == 1) {
            StartPlayTogetherV2Request startPlayTogetherV2Request = new StartPlayTogetherV2Request();
            PlayTogetherTemplateV2 playTogetherTemplateV2 = playTogetherBasicInfo.templateInfo;
            if (playTogetherTemplateV2 == null || (str = playTogetherTemplateV2.templateId) == null) {
                str = "";
            }
            startPlayTogetherV2Request.templateId = str;
            Room room2 = this.LLILLJJLI;
            startPlayTogetherV2Request.roomIdStr = String.valueOf(room2 != null ? Long.valueOf(room2.getId()) : null);
            startPlayTogetherV2Request.allowLimitTypes = playTogetherBasicInfo.applyLimitType;
            startPlayTogetherV2Request.isWithTemplate = false;
            startPlayTogetherV2Request.template = playTogetherBasicInfo.templateInfo;
            C480460Ism.LIZ().getClass();
            this.LLILLL = (C11JF) ((LivePlayTogetherApi) C480460Ism.LIZLLL(LivePlayTogetherApi.class)).startPlayTogetherV2(startPlayTogetherV2Request).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.00MW
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("GameLivePlayTogetherController@b91.startPlayTogether$1");
                    C1C7U.LIZIZ("GameLivePlayTogetherController@b91.startPlayTogether$1");
                }
            });
            return;
        }
        CreatePlayTogetherRequest createPlayTogetherRequest = new CreatePlayTogetherRequest();
        DataChannel dataChannel = this.LLIZLLLIL;
        createPlayTogetherRequest.anchorId = (dataChannel == null || (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel)) == null) ? 0L : userLJIIIIZZ.getId();
        createPlayTogetherRequest.applyLimitType = playTogetherBasicInfo.applyLimitType;
        createPlayTogetherRequest.applyNote = playTogetherBasicInfo.applyNote;
        Room room3 = this.LLILLJJLI;
        createPlayTogetherRequest.roomId = room3 != null ? room3.getId() : 0L;
        createPlayTogetherRequest.description = playTogetherBasicInfo.description;
        try {
            createPlayTogetherRequest.useTemplateId = CastLongProtector.parseLong(playTogetherBasicInfo.playTogetherId);
            C480460Ism.LIZ().getClass();
            this.LLILLL = (C11JF) ((LivePlayTogetherApi) C480460Ism.LIZLLL(LivePlayTogetherApi.class)).startPlayTogether(createPlayTogetherRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.00MX
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("GameLivePlayTogetherController@b91.startPlayTogether$2");
                    C1C7U.LIZIZ("GameLivePlayTogetherController@b91.startPlayTogether$2");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play together id is not long, id=");
            sbLIZ.append(playTogetherBasicInfo.playTogetherId);
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public final void LJJIIJ() {
        if (this.LLJJJJJIL < this.LLJJIJIL) {
            ((Handler) this.LLJILLL.getValue()).removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(this.LLJJJ, (Handler) this.LLJILLL.getValue(), new ARunnableS133S0100000_33(this, 26));
            this.LLJJL = true;
        }
    }

    public final void LJJIIZ() {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Room room;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        String str;
        Context context = this.LLJ;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || (room = this.LLILLJJLI) == null || (playTogetherBasicInfo = room.playTogetherInfo) == null || (str = playTogetherBasicInfo.playTogetherId) == null || this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        C480460Ism.LIZ().getClass();
        this.LLILZIL = (C11JF) ((LivePlayTogetherApi) C480460Ism.LIZLLL(LivePlayTogetherApi.class)).getPlayTogetherPickedInfo(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS161S0200000_27(supportFragmentManager, this, 6), new AfS196S0100000_27(this, 19));
    }

    public final void LJIIIZ() {
        PlayTogetherBasicInfo playTogetherBasicInfo;
        if (LIZJ()) {
            if (this.LLJJJJLIIL) {
                Iterator it2 = ((Set) this.LLJJIJI.getValue()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC501420JlU) it2.next()).onEnd();
                }
                this.LLJJJJJIL = 0;
                ((HashMap) this.LLJJIII.getValue()).clear();
                ((Handler) this.LLJILLL.getValue()).removeCallbacksAndMessages(null);
                this.LLJJL = false;
            } else {
                Room room = this.LLILLJJLI;
                if (room != null && (playTogetherBasicInfo = room.playTogetherInfo) != null && playTogetherBasicInfo.isApplying) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855141));
                    LJIIJJI("play_end");
                }
                DataChannel dataChannel = this.LLIZLLLIL;
                if (dataChannel != null) {
                    dataChannel.zQ2(this);
                }
                DataChannelGlobal.LLILZ.zQ2(this);
                C19487111Lx c19487111Lx = this.LLJJI;
                if (c19487111Lx != null) {
                    c19487111Lx.dispose();
                }
                this.LLJJI = null;
                C20441214yg.LIZIZ("test_lzk_playtogher", "close play together");
                DataChannel dataChannel2 = this.LLIZLLLIL;
                if (dataChannel2 != null) {
                    dataChannel2.zW(GameBillboardChannel.class, new C0IMF(null, 2, null, null));
                }
            }
            Room room2 = this.LLILLJJLI;
            if (room2 != null) {
                room2.playTogetherInfo = null;
            }
            this.LLJILJIL = null;
        }
    }

    @Override // X.InterfaceC501410JlT
    public final boolean LJIJI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r1 = "test_lzk_playtogher"
            java.lang.String r0 = "start"
            X.C20441214yg.LIZIZ(r1, r0)
            boolean r0 = X.C464660IKa.LIZ()
            if (r0 == 0) goto L76
            android.content.Context r1 = r4.LLJ
            r0 = 0
            androidx.lifecycle.LifecycleOwner r1 = X.C520010KaN.LJJIFFI(r1, r0)
        L14:
            if (r1 == 0) goto L33
        L16:
            X.0K9Q r0 = com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService.LJIIIZ
            r0.getClass()
            com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService r2 = X.C0K9Q.LIZ()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLILLJJLI
            X.0JSh r3 = r2.fi2(r0, r4, r1)
            r4.LL = r3
            if (r3 == 0) goto L33
            kotlin.jvm.internal.AwS596S0100000_17 r2 = new kotlin.jvm.internal.AwS596S0100000_17
            r0 = 396(0x18c, float:5.55E-43)
            r2.<init>(r4, r0)
            r3.LIZIZ(r1, r2)
        L33:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r4.LLIZLLLIL
            if (r3 == 0) goto L43
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent> r2 = com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent.class
            kotlin.jvm.internal.AwS596S0100000_17 r1 = new kotlin.jvm.internal.AwS596S0100000_17
            r0 = 119(0x77, float:1.67E-43)
            r1.<init>(r4, r0)
            r3.CQ2(r2, r4, r1)
        L43:
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            X.11NZ r1 = r0.LJFF()
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r1.LJJJLZIJ(r0)
            Y.AkS479S0100000_17 r1 = new Y.AkS479S0100000_17
            r0 = 1
            r1.<init>(r4, r0)
            X.11ON r1 = r2.LJJJJZI(r1)
            X.11IW r0 = new X.11IW
            r0.<init>(r1)
            X.11Lf r0 = r0.LJIILL()
            X.01kM r0 = r0.LJIIZILJ()
            X.11Lx r0 = (X.C19487111Lx) r0
            r4.LLJJI = r0
            r4.LJIJ(r5)
            return
        L76:
            android.content.Context r2 = r4.LLJ
            boolean r0 = r2 instanceof androidx.lifecycle.LifecycleOwner
            r1 = 0
            if (r0 == 0) goto L84
            r0 = r2
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto L84
            r1 = r0
            goto L16
        L84:
            if (r2 == 0) goto L8a
            android.app.Activity r1 = X.C737910Sx3.LIZIZ(r2)
        L8a:
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L33
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2177041AIc.LIZIZ(java.lang.String):void");
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        if (abstractC777950UfR instanceof C778880Ugw) {
            LJFF(((C778880Ugw) abstractC777950UfR).LJFF, "show");
        }
    }

    public final void LJIIJJI(String str) {
        PlayTogetherBasicInfo playTogetherBasicInfo;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_play_together_toast");
        c474500IjALIZ.LJIJJLI(this.LLIZLLLIL);
        c474500IjALIZ.LJJII(str, "toast_type");
        Room room = this.LLILLJJLI;
        if (room != null && (playTogetherBasicInfo = room.playTogetherInfo) != null) {
            int i = playTogetherBasicInfo.applyLimitType;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            str2 = "";
                        } else {
                            str2 = "subscriber";
                        }
                    } else {
                        str2 = "creator_team";
                    }
                } else {
                    str2 = "followers";
                }
            } else {
                str2 = "all";
            }
            c474500IjALIZ.LJJII(str2, "who_can_play");
            c474500IjALIZ.LJJII(playTogetherBasicInfo.playTogetherId, "play_together_id");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC501410JlT
    public final void LJIIL(InterfaceC501420JlU interfaceC501420JlU) {
        ((Set) this.LLJJIJI.getValue()).add(interfaceC501420JlU);
    }

    @Override // X.InterfaceC501410JlT
    public final void LJIILIIL(InterfaceC501420JlU interfaceC501420JlU) {
        ((Set) this.LLJJIJI.getValue()).remove(interfaceC501420JlU);
    }

    public final void LJIILLIIL(PlayTogetherMessage playTogetherMessage) {
        String str;
        String str2;
        List<PlayTogetherTemplate> list = this.LLILZLL;
        String str3 = null;
        if (list != null) {
            Iterator<PlayTogetherTemplate> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PlayTogetherTemplate next = it2.next();
                String str4 = next.description;
                PlayTogetherBasicInfo playTogetherBasicInfo = playTogetherMessage.basicInfo;
                if (playTogetherBasicInfo != null) {
                    str2 = playTogetherBasicInfo.description;
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(str4, str2)) {
                    str3 = next.templateId;
                    break;
                }
            }
        }
        PlayTogetherBasicInfo playTogetherBasicInfo2 = playTogetherMessage.basicInfo;
        if (playTogetherBasicInfo2 != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_play_together_start_success");
            c474500IjALIZ.LJIJJLI(this.LLIZLLLIL);
            c474500IjALIZ.LJJII(playTogetherBasicInfo2.playTogetherId, "play_together_id");
            if (str3 != null) {
                try {
                    c474500IjALIZ.LJJII(Long.valueOf(CastLongProtector.parseLong(str3)), "theme_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parse to long error, theme_id=");
                    sbLIZ.append(str3);
                    C20441214yg.LJIIIZ("PlayTogether", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            int i = playTogetherBasicInfo2.applyLimitType;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            str = "";
                        } else {
                            str = "subscriber";
                        }
                    } else {
                        str = "creator_team";
                    }
                } else {
                    str = "followers";
                }
            } else {
                str = "all";
            }
            c474500IjALIZ.LJJII(str, "who_can_play");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIJ(String str) {
        PlayTogetherBasicInfo playTogetherBasicInfo;
        PlayTogetherExtraInfo playTogetherExtraInfo;
        PlayTogetherExtraInfo playTogetherExtraInfo2;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer numValueOf;
        Room room = this.LLILLJJLI;
        if (room != null && (playTogetherBasicInfo = room.playTogetherInfo) != null && playTogetherBasicInfo.isOpenBulletinBoard) {
            DataChannel dataChannel = this.LLIZLLLIL;
            String str6 = null;
            if (dataChannel != null) {
                PlayTogetherTemplateV2 playTogetherTemplateV2 = playTogetherBasicInfo.templateInfo;
                if (playTogetherTemplateV2 != null) {
                    str2 = playTogetherTemplateV2.title;
                    str3 = playTogetherTemplateV2.description;
                } else {
                    str2 = null;
                    str3 = null;
                }
                String strLJIJI = C497740JfY.LJIJI(2131855127);
                int i = playTogetherBasicInfo.applyLimitType;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                str4 = "";
                            } else {
                                str4 = "subscriber";
                            }
                        } else {
                            str4 = "creator_team";
                        }
                    } else {
                        str4 = "followers";
                    }
                } else {
                    str4 = "all";
                }
                String str7 = playTogetherBasicInfo.playTogetherId;
                PlayTogetherTemplateV2 playTogetherTemplateV22 = playTogetherBasicInfo.templateInfo;
                if (playTogetherTemplateV22 != null) {
                    str5 = playTogetherTemplateV22.templateId;
                    numValueOf = Integer.valueOf(playTogetherTemplateV22.templateConfigId);
                } else {
                    str5 = null;
                    numValueOf = null;
                }
                dataChannel.zW(GameBillboardChannel.class, new C0IMF(1, str2, str3, strLJIJI, str4, str7, str5, String.valueOf(numValueOf)));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lastPickedTimeStr: ");
            Room room2 = this.LLILLJJLI;
            if (room2 != null && (playTogetherExtraInfo2 = room2.playTogetherExtraInfo) != null) {
                str6 = playTogetherExtraInfo2.lastPickedTimeStr;
            }
            sbLIZ.append(str6);
            C20441214yg.LIZIZ("test_lzk_playtogher", C2188811AlT.LIZIZ(sbLIZ));
            Room room3 = this.LLILLJJLI;
            if (room3 != null && (playTogetherExtraInfo = room3.playTogetherExtraInfo) != null) {
                try {
                    this.LLJILJILJ = CastLongProtector.parseLong(playTogetherExtraInfo.lastPickedTimeStr);
                    if (this.LLJILJIL == null) {
                        PlayTogetherMessage playTogetherMessage = new PlayTogetherMessage();
                        playTogetherMessage.messageType = 0;
                        playTogetherMessage.basicInfo = playTogetherBasicInfo;
                        this.LLJILJIL = playTogetherMessage;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLJILJILJ = 0L;
                    C20441214yg.LJI("PlayTogether", e);
                }
            }
        }
        LJJIJIL(str);
    }

    @Override // X.InterfaceC501410JlT
    public final void LJJ(RecycleSource recycleSource) {
        C2660011e c2660011e;
        if (this.LLJJJJLIIL) {
            ((Set) this.LLJJIJI.getValue()).clear();
            ((Handler) this.LLJILLL.getValue()).removeCallbacksAndMessages(null);
            this.LLJJL = false;
        }
        if (recycleSource == RecycleSource.FROM_ROOM_CHANGE) {
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel != null) {
                dataChannel.SX0(C2276271E7t.class, null);
            }
            DataChannel dataChannel2 = this.LLIZLLLIL;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C1083440eIg.class, null);
            }
        }
        LIZ().removeCallbacksAndMessages(null);
        DataChannel dataChannel3 = this.LLIZLLLIL;
        if (dataChannel3 != null) {
            dataChannel3.zW(GameBillboardChannel.class, new C0IMF(null, 2, null, null));
        }
        DataChannel dataChannel4 = this.LLIZLLLIL;
        if (dataChannel4 != null) {
            dataChannel4.zW(GameLivePlayTogetherPickedCancelChannel.class, Boolean.TRUE);
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        DataChannel dataChannel5 = this.LLIZLLLIL;
        if (dataChannel5 != null && (c2660011e = (C2660011e) dataChannel5.gg0(C770500UKi.class)) != null) {
            ((ConcurrentHashMap) c2660011e.LIZ).remove(InterfaceC501410JlT.class);
        }
        DataChannel dataChannel6 = this.LLIZLLLIL;
        if (dataChannel6 != null) {
            dataChannel6.zQ2(this);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C492290JSh c492290JSh = this.LL;
        if (c492290JSh != null) {
            c492290JSh.LIZ();
        }
        C1548820qPI.LJIIIIZZ("game_play_together_indicator_loaded", this);
        C1548820qPI.LJIIIIZZ("game_play_together_open_picked_panel", this);
        C1548820qPI.LJIIIIZZ("game_play_together_anchor_operate", this);
        C1548820qPI.LJIIIIZZ("game_play_together_end", this);
        this.LLIZLLLIL = null;
        this.LLILLJJLI = null;
        this.LLJ = null;
        C19487111Lx c19487111Lx = this.LLJJI;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLJJI = null;
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        this.LLIZ = null;
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILLL = null;
        C11JF c11jf2 = this.LLILZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLILZ = null;
        C11JF c11jf3 = this.LLILZIL;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        this.LLILZIL = null;
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJI(EnumC777480Ueg.PLAY_TOGETHER, this);
        }
    }

    public final void LJJIJIL(String str) {
        PlayTogetherMessage playTogetherMessage = this.LLJILJIL;
        if (playTogetherMessage != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new message from ");
            sbLIZ.append(str);
            sbLIZ.append(" come : ");
            sbLIZ.append(playTogetherMessage.messageType);
            C20441214yg.LIZIZ("test_lzk_playtogher", C2188811AlT.LIZIZ(sbLIZ));
            LIZ().removeMessages(1001);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1001;
            LIZ().sendMessage(messageObtain);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        C2177051AId c2177051AId;
        String str;
        Room room;
        PlayTogetherBasicInfo playTogetherBasicInfo2;
        String str2 = c262100zr.LIZ;
        switch (str2.hashCode()) {
            case -979341375:
                if (str2.equals("game_play_together_anchor_operate")) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "action", "")) != null) {
                        if (Intrinsics.LJFF("open", strLJFF)) {
                            this.LLJJLIIIJLLLLLLLZ = true;
                        } else if (Intrinsics.LJFF("close", strLJFF)) {
                            this.LLJJLIIIJLLLLLLLZ = false;
                        }
                    }
                    if (this.LLJJL) {
                        LJJIIJ();
                    }
                }
                break;
            case -857819597:
                if (str2.equals("game_play_together_open_picked_panel") && !this.LLJJJJLIIL) {
                    LJJIIZ();
                    break;
                }
                break;
            case 261258300:
                if (str2.equals("game_play_together_indicator_loaded") && LIZJ()) {
                    PlayTogetherMessage playTogetherMessage = new PlayTogetherMessage();
                    Room room2 = this.LLILLJJLI;
                    String str3 = null;
                    if (room2 != null) {
                        playTogetherBasicInfo = room2.playTogetherInfo;
                    } else {
                        playTogetherBasicInfo = null;
                    }
                    playTogetherMessage.basicInfo = playTogetherBasicInfo;
                    DataChannel dataChannel = this.LLIZLLLIL;
                    if (dataChannel != null) {
                        c2177051AId = (C2177051AId) dataChannel.gg0(C2276271E7t.class);
                        if (c2177051AId != null) {
                            str = c2177051AId.LIZ;
                        }
                        room = this.LLILLJJLI;
                        if (room != null && (playTogetherBasicInfo2 = room.playTogetherInfo) != null) {
                            str3 = playTogetherBasicInfo2.playTogetherId;
                        }
                        if (Intrinsics.LJFF(str, str3) && c2177051AId != null && c2177051AId.LIZIZ != null) {
                            playTogetherMessage.messageType = 0;
                            playTogetherMessage.permitNoticeContent = c2177051AId.LIZIZ;
                        }
                        LJIIZILJ(playTogetherMessage, "enter_room");
                    } else {
                        c2177051AId = null;
                    }
                    str = null;
                    room = this.LLILLJJLI;
                    if (room != null) {
                        str3 = playTogetherBasicInfo2.playTogetherId;
                    }
                    if (Intrinsics.LJFF(str, str3)) {
                        playTogetherMessage.messageType = 0;
                        playTogetherMessage.permitNoticeContent = c2177051AId.LIZIZ;
                    }
                    LJIIZILJ(playTogetherMessage, "enter_room");
                    break;
                }
                break;
            case 1997167988:
                if (str2.equals("game_play_together_end")) {
                    LJIIIZ();
                }
                break;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Text text;
        long j;
        String str;
        String str2;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        List<PlayTogetherMember> list;
        PlayTogetherBasicInfo playTogetherBasicInfo2;
        PlayTogetherListChangeContent playTogetherListChangeContent;
        List<PlayTogetherMember> list2;
        PlayTogetherBasicInfo playTogetherBasicInfo3;
        Integer numValueOf;
        String str3;
        String str4;
        PlayTogetherBasicInfo playTogetherBasicInfo4;
        PlayTogetherBasicInfo playTogetherBasicInfo5;
        String str5 = null;
        C2177041AIc c2177041AIc = this;
        if (iMessage instanceof PlayTogetherMessage) {
            Room room = c2177041AIc.LLILLJJLI;
            long j2 = 0;
            if (room != null && (playTogetherBasicInfo5 = room.playTogetherInfo) != null) {
                j = playTogetherBasicInfo5.applyUserNum;
            } else {
                j = 0;
            }
            PlayTogetherMessage playTogetherMessage = c2177041AIc.LLJILJIL;
            if (playTogetherMessage != null) {
                PlayTogetherMessage playTogetherMessage2 = (PlayTogetherMessage) iMessage;
                if (playTogetherMessage2.messageType != 4) {
                    playTogetherMessage2.permitNoticeContent = playTogetherMessage.permitNoticeContent;
                }
            }
            PlayTogetherMessage playTogetherMessage3 = (PlayTogetherMessage) iMessage;
            c2177041AIc.LLJILJIL = playTogetherMessage3;
            int i = playTogetherMessage3.messageType;
            boolean z = true;
            if (i != 1 && room != null) {
                room.playTogetherInfo = playTogetherMessage3.basicInfo;
            }
            switch (i) {
                case 0:
                    if (c2177041AIc.LLJJJJLIIL) {
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(1, "g_interaction_bring_play");
                        Iterator it2 = ((Set) c2177041AIc.LLJJIJI.getValue()).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC501420JlU) it2.next()).onStart();
                        }
                        c2177041AIc.LJJIIZI(C497740JfY.LJIJI(2131855147), "start", true, true, false, false, null, null);
                        if (c2177041AIc.LLILZLL == null) {
                            C480460Ism.LIZ().getClass();
                            c2177041AIc.LLILZ = (C11JF) ((LivePlayTogetherApi) C480460Ism.LIZLLL(LivePlayTogetherApi.class)).getPlayTogetherTemplate().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS166S0200000_33(c2177041AIc, playTogetherMessage3, 7));
                        } else {
                            c2177041AIc.LJIILLIIL(playTogetherMessage3);
                        }
                    } else {
                        c2177041AIc.LIZIZ("im");
                    }
                    break;
                case 1:
                    if (room != null && (playTogetherBasicInfo4 = room.playTogetherInfo) != null) {
                        str3 = playTogetherBasicInfo4.playTogetherId;
                    } else {
                        str3 = null;
                    }
                    PlayTogetherBasicInfo playTogetherBasicInfo6 = playTogetherMessage3.basicInfo;
                    if (playTogetherBasicInfo6 != null) {
                        str4 = playTogetherBasicInfo6.playTogetherId;
                    } else {
                        str4 = null;
                    }
                    if (Intrinsics.LJFF(str3, str4)) {
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(0, "g_interaction_bring_play");
                        c2177041AIc.LJIIIZ();
                    }
                    break;
                case 2:
                    if (c2177041AIc.LLJJJJLIIL && (playTogetherBasicInfo3 = playTogetherMessage3.basicInfo) != null && (numValueOf = Integer.valueOf(playTogetherBasicInfo3.status)) != null) {
                        if (numValueOf.intValue() != 3 && numValueOf.intValue() != 4 && numValueOf.intValue() != 5) {
                            if (numValueOf.intValue() == 2) {
                                c2177041AIc.LJJIIZI(C497740JfY.LJIJI(2131855139), "approved", true, true, false, true, playTogetherMessage3, null);
                            }
                        } else {
                            c2177041AIc.LJJIIZI(C497740JfY.LJIJI(2131855144), "notapproved", true, true, true, false, null, null);
                        }
                    }
                    break;
                case 3:
                    if (c2177041AIc.LLJJJJLIIL) {
                        if (j == 0 && (playTogetherBasicInfo2 = playTogetherMessage3.basicInfo) != null && playTogetherBasicInfo2.applyUserNum > 0 && (playTogetherListChangeContent = playTogetherMessage3.listChangeContent) != null && (list2 = playTogetherListChangeContent.applyListMembers) != null) {
                            for (PlayTogetherMember playTogetherMember : list2) {
                                Long l = (Long) ((HashMap) c2177041AIc.LLJJIII.getValue()).get(playTogetherMember.userId);
                                if (l == null || System.currentTimeMillis() - l.longValue() > c2177041AIc.LLJJIJIIJIL) {
                                    ((HashMap) c2177041AIc.LLJJIII.getValue()).put(playTogetherMember.userId, Long.valueOf(System.currentTimeMillis()));
                                    c2177041AIc = c2177041AIc;
                                    c2177041AIc.LJJIIZI(C497740JfY.LJIJI(2131855148), "someone_joined", false, true, true, false, null, null);
                                }
                            }
                        }
                        PlayTogetherBasicInfo playTogetherBasicInfo7 = playTogetherMessage3.basicInfo;
                        if (playTogetherBasicInfo7 != null) {
                            j2 = playTogetherBasicInfo7.applyUserNum;
                        }
                        if (j2 > c2177041AIc.LLJJJIL) {
                            if (!c2177041AIc.LLJJL) {
                                c2177041AIc.LJJIIJ();
                            }
                        } else if (c2177041AIc.LLJJL) {
                            ((Handler) c2177041AIc.LLJILLL.getValue()).removeCallbacksAndMessages(null);
                            c2177041AIc.LLJJL = false;
                        }
                    } else {
                        if (room != null && (playTogetherBasicInfo = room.playTogetherInfo) != null) {
                            PlayTogetherListChangeContent playTogetherListChangeContent2 = playTogetherMessage3.listChangeContent;
                            if (playTogetherListChangeContent2 != null && (list = playTogetherListChangeContent2.applyListMembers) != null && !list.isEmpty()) {
                                Iterator<PlayTogetherMember> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (Intrinsics.LJFF(it3.next().userId, c2177041AIc.LLJJJJ.getValue())) {
                                        playTogetherBasicInfo.isApplying = z;
                                    }
                                }
                                z = false;
                                playTogetherBasicInfo.isApplying = z;
                            } else {
                                z = false;
                                playTogetherBasicInfo.isApplying = z;
                            }
                        }
                        DataChannel dataChannel = c2177041AIc.LLIZLLLIL;
                        if (dataChannel != null) {
                            dataChannel.SX0(C1083440eIg.class, c2177041AIc.LLJILJIL);
                        }
                        c2177041AIc.LJJIJIL("im");
                    }
                    break;
                case 4:
                    if (!c2177041AIc.LLJJJJLIIL) {
                        DataChannel dataChannel2 = c2177041AIc.LLIZLLLIL;
                        if (dataChannel2 != null) {
                            PlayTogetherBasicInfo playTogetherBasicInfo8 = playTogetherMessage3.basicInfo;
                            if (playTogetherBasicInfo8 != null) {
                                str2 = playTogetherBasicInfo8.playTogetherId;
                            } else {
                                str2 = null;
                            }
                            PlayTogetherPermitNoticeContent playTogetherPermitNoticeContent = playTogetherMessage3.permitNoticeContent;
                            Long lValueOf = Long.valueOf(System.currentTimeMillis());
                            Room room2 = c2177041AIc.LLILLJJLI;
                            if (room2 != null) {
                                room2.getId();
                            }
                            dataChannel2.SX0(C2276271E7t.class, new C2177051AId(str2, playTogetherPermitNoticeContent, lValueOf));
                        }
                        c2177041AIc.LJJIJIL("im");
                    }
                    break;
                case 5:
                    if (!c2177041AIc.LLJJJJLIIL) {
                        c2177041AIc.LJIJ("im");
                    }
                    break;
                case 6:
                    if (!c2177041AIc.LLJJJJLIIL) {
                        DataChannel dataChannel3 = c2177041AIc.LLIZLLLIL;
                        if (dataChannel3 != null) {
                            PlayTogetherBasicInfo playTogetherBasicInfo9 = playTogetherMessage3.basicInfo;
                            if (playTogetherBasicInfo9 != null) {
                                str = playTogetherBasicInfo9.playTogetherId;
                            } else {
                                str = null;
                            }
                            PlayTogetherPermitNoticeContent playTogetherPermitNoticeContent2 = playTogetherMessage3.permitNoticeContent;
                            Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
                            Room room3 = c2177041AIc.LLILLJJLI;
                            if (room3 != null) {
                                room3.getId();
                            }
                            dataChannel3.SX0(C2276271E7t.class, new C2177051AId(str, playTogetherPermitNoticeContent2, lValueOf2));
                        }
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1002;
                        c2177041AIc.LIZ().removeMessages(1002);
                        c2177041AIc.LIZ().sendMessageDelayed(messageObtain, TtlivePlayTogetherPickedTimeOutSetting.INSTANCE.getValue());
                        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground() && (GamePlayTogether3Setting.INSTANCE.getValue() || C497740JfY.LJIL())) {
                            c2177041AIc.LJJIIZ();
                        }
                    }
                    break;
            }
            if (playTogetherMessage3.messageType == 0) {
                LJIIZILJ(playTogetherMessage3, "start_test");
                return;
            } else {
                LJIIZILJ(playTogetherMessage3, null);
                return;
            }
        }
        if (iMessage instanceof RoomMessage) {
            if (!Intrinsics.LJFF(((RoomMessage) iMessage).scene, "play_together_pick_notice")) {
                return;
            }
            c2177041AIc.LJIIJJI("picked");
            return;
        }
        if (!(iMessage instanceof GameRevenueTipsMessage) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) {
            return;
        }
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        GameRevenueTipsMessage gameRevenueTipsMessage = (GameRevenueTipsMessage) iMessage;
        Text text2 = gameRevenueTipsMessage.tipsText;
        if (text2 != null) {
            str5 = text2.key;
        }
        c1124870fNVLIZJ.getClass();
        String strLIZIZ = C1124870fNV.LIZIZ(str5);
        if (strLIZIZ == null && ((text = gameRevenueTipsMessage.tipsText) == null || (strLIZIZ = text.defaultPattern) == null)) {
            strLIZIZ = "";
        }
        c2177041AIc.LJJIIZI(strLIZIZ, "revenue_tips", true, true, true, false, null, Integer.valueOf((int) gameRevenueTipsMessage.showDurationOutapp));
    }

    public static void LJIIZILJ(PlayTogetherMessage playTogetherMessage, String str) {
        JSONObject jSONObject;
        if (GamePlayTogether3Setting.INSTANCE.getValue() || C497740JfY.LJIL()) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("play_together_message", new JSONObject(C19748512Ol.LIZJ.LJIILL(playTogetherMessage)));
                if (str != null) {
                    jSONObject.put(Scene.SCENE_SERVICE, str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse PlayTogetherMessage to JsonObject error, msg=");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("PlayTogether", C2188811AlT.LIZIZ(sbLIZ));
                jSONObject = null;
            }
            C20441214yg.LJIIIZ("talllsytest", "status change");
            if (jSONObject != null) {
                C389001fE.LIZ("play_together_status_change", jSONObject, System.currentTimeMillis(), false);
            }
        }
    }

    public static void LJIL(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, i);
            if (jSONObject != null) {
                C389001fE.LIZ("audience_info_update", jSONObject, System.currentTimeMillis(), false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse user info to JsonObject error, msg=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("PlayTogether", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJJIFFI(C0IMF c0imf, long j) {
        if (j < 60) {
            c0imf.LIZLLL = u.LJJIFFI(C497740JfY.LJIJI(2131855125), "%1$s", C497740JfY.LJIJI(2131855145), false);
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131855125);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j / 60);
        sbLIZ.append(" m ago");
        c0imf.LIZLLL = u.LJJIFFI(strLJIJI, "%1$s", C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // X.InterfaceC501410JlT
    public final void LJFF(String str, String str2) {
        String str3;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_play_together_toast");
        c474500IjALIZ.LJIJJLI(this.LLIZLLLIL);
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJII(str, "toast_type");
        Room room = this.LLILLJJLI;
        if (room == null || (playTogetherBasicInfo = room.playTogetherInfo) == null || (str3 = playTogetherBasicInfo.playTogetherId) == null) {
            str3 = "";
        }
        c474500IjALIZ.LJJII(str3, "play_together_id");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        if ((abstractC777950UfR instanceof C778880Ugw) && enumC778130Ufj == EnumC778130Ufj.USER_CLICK) {
            C778880Ugw c778880Ugw = (C778880Ugw) abstractC777950UfR;
            if (Intrinsics.LJFF(c778880Ugw.LJ, "pass")) {
                if (c778880Ugw.LJI != null) {
                    LJJII();
                }
                LJFF("approved", "click");
            } else {
                if (!Intrinsics.LJFF(c778880Ugw.LJ, "back")) {
                    return;
                }
                DataChannel dataChannel = this.LLIZLLLIL;
                if (dataChannel != null) {
                    dataChannel.FQ2(BackToAppEvent.class);
                }
                if (!this.LLJJLIIIJLLLLLLLZ) {
                    LJ();
                }
                LJFF(c778880Ugw.LJFF, "click");
            }
        }
    }

    public final void LJIIIIZZ(Context context, DataChannel dataChannel) {
        Room roomLJJLIIIIJ;
        IMessageManager iMessageManager;
        PlayTogetherBasicInfo playTogetherBasicInfo;
        C2177051AId c2177051AId;
        long jLongValue;
        Long l;
        PlayTogetherBasicInfo playTogetherBasicInfo2;
        PlayTogetherMessage playTogetherMessage;
        String str;
        String str2;
        PlayTogetherBasicInfo playTogetherBasicInfo3;
        this.LLIZLLLIL = dataChannel;
        String str3 = null;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        this.LLILLJJLI = roomLJJLIIIIJ;
        this.LLJJJJLIIL = C500260Jjc.LJIIZILJ(dataChannel);
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJ = context;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLIZ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.PLAY_TOGETHER_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        if (!this.LLJJJJLIIL) {
            IMessageManager iMessageManager2 = this.LLIZ;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(C001A.ROOM.getIntType(), (OnIMMessageListener) this);
            }
        } else {
            IMessageManager iMessageManager3 = this.LLIZ;
            if (iMessageManager3 != null) {
                iMessageManager3.addMessageListener(C001A.GAME_REVENUE_TIPS_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
            Room room = this.LLILLJJLI;
            if (room != null && (playTogetherBasicInfo = room.playTogetherInfo) != null && playTogetherBasicInfo.applyUserNum > this.LLJJJIL) {
                LJJIIJ();
            }
        }
        C1548820qPI.LIZLLL("game_play_together_end", this);
        C1548820qPI.LIZLLL("game_play_together_indicator_loaded", this);
        C1548820qPI.LIZLLL("game_play_together_open_picked_panel", this);
        C1548820qPI.LIZLLL("game_play_together_anchor_operate", this);
        if (dataChannel != null && (playTogetherMessage = (PlayTogetherMessage) dataChannel.gg0(C1083440eIg.class)) != null) {
            PlayTogetherBasicInfo playTogetherBasicInfo4 = playTogetherMessage.basicInfo;
            if (playTogetherBasicInfo4 != null) {
                str = playTogetherBasicInfo4.playTogetherId;
            } else {
                str = null;
            }
            Room room2 = this.LLILLJJLI;
            if (room2 != null && (playTogetherBasicInfo3 = room2.playTogetherInfo) != null) {
                str2 = playTogetherBasicInfo3.playTogetherId;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str, str2) && LIZJ()) {
                this.LLJILJIL = playTogetherMessage;
            }
        }
        if (LIZJ()) {
            LIZIZ("init");
        }
        if (dataChannel != null) {
            C2659011d.LIZIZ(dataChannel, InterfaceC501410JlT.class, this, false);
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZ(EnumC777480Ueg.PLAY_TOGETHER, this);
        }
        if (dataChannel != null && (c2177051AId = (C2177051AId) dataChannel.gg0(C2276271E7t.class)) != null) {
            String str4 = c2177051AId.LIZ;
            Room room3 = this.LLILLJJLI;
            if (room3 != null && (playTogetherBasicInfo2 = room3.playTogetherInfo) != null) {
                str3 = playTogetherBasicInfo2.playTogetherId;
            }
            if (Intrinsics.LJFF(str4, str3) && LIZJ()) {
                TtlivePlayTogetherPickedTimeOutSetting ttlivePlayTogetherPickedTimeOutSetting = TtlivePlayTogetherPickedTimeOutSetting.INSTANCE;
                long value = ttlivePlayTogetherPickedTimeOutSetting.getValue();
                C2177051AId c2177051AId2 = (C2177051AId) dataChannel.gg0(C2276271E7t.class);
                if (c2177051AId2 != null && (l = c2177051AId2.LIZJ) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                long jCurrentTimeMillis = (value + jLongValue) - System.currentTimeMillis();
                if (jCurrentTimeMillis > 0 && jCurrentTimeMillis <= ttlivePlayTogetherPickedTimeOutSetting.getValue()) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1002;
                    LIZ().sendMessageDelayed(messageObtain, jCurrentTimeMillis);
                }
            }
        }
    }

    public final void LJJIIZI(final String str, final String str2, boolean z, boolean z2, boolean z3, boolean z4, final PlayTogetherMessage playTogetherMessage, Integer num) {
        final int iOrdinal;
        String str3;
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground() && z2) {
            if (z3) {
                iOrdinal = EnumC778100Ufg.LIVE_TIP_PLAY_TOGETHER_WITH_BACK_BUTTON.ordinal();
            } else if (z4) {
                iOrdinal = EnumC778100Ufg.LIVE_TIP_PLAY_TOGETHER_REVIEW_PASS.ordinal();
            } else {
                iOrdinal = EnumC778100Ufg.LIVE_TIP_PLAY_TOGETHER.ordinal();
            }
            if (z3) {
                str3 = "back";
            } else if (z4) {
                str3 = "pass";
            } else {
                str3 = "default";
            }
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LJII(new C778880Ugw(str3, str, str2, playTogetherMessage, num));
            } else {
                C11JF c11jf = this.LLJI;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                this.LLJI = (C11JF) C11NZ.LJJJJZ("ttlive_ic_play_together.png").LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0UhI
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return C1143680frq.LIZ("tiktok_live_game_demand_2", (String) obj);
                    }
                }).LJIILIIL(new C0UO0()).LJJLJLI(new C09JN() { // from class: X.0Ugd
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameLivePlayTogetherController@b91.showToastOrPip$2");
                        Drawable drawable = (Drawable) obj;
                        if (drawable != null) {
                            C2177041AIc c2177041AIc = this.LL;
                            String str4 = str;
                            int i = iOrdinal;
                            Object obj2 = str2;
                            PlayTogetherMessage playTogetherMessage2 = playTogetherMessage;
                            DataChannel dataChannel = c2177041AIc.LLIZLLLIL;
                            if (dataChannel != null) {
                                if (Intrinsics.LJFF(obj2, "approved")) {
                                    obj2 = playTogetherMessage2;
                                }
                                dataChannel.zW(TipMessageChannel.class, new C778500UgK(str4, i, new C778680Ugc(obj2, new C778580UgS(drawable, null)), 8));
                            }
                        }
                        C1C7U.LIZIZ("GameLivePlayTogetherController@b91.showToastOrPip$2");
                    }
                });
            }
        } else if (z) {
            C766270U4b.LJIIJJI(str);
        }
        if (!GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            LJFF(str2, "show");
        }
    }
}
