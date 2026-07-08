package X;

import Y.AObserverS221S0100000_17;
import Y.AfS153S0200000_17;
import Y.AfS6S0100100_17;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.livesdk.api.revenue.starcomment.DeleteStarCommentEvent;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentEntranceVisibleEvent;
import com.bytedance.android.livesdk.dataChannel.EnigmaStatus;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StarCommentPurchasePageEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.CancelStarCommentAdministratorEvent;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.livesetting.starcomment.GameLiveStarCommentEnableSetting;
import com.bytedance.android.livesdk.livesetting.starcomment.LSStarCommentProtectSetting;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentEnableSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message.StarCommentNotificationMessage;
import com.bytedance.android.livesdk.model.message.StarCommentPushMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.star_comment.StarCommentDeleteResponse;
import tikcast.api.star_comment.StarCommentItem;
import tikcast.api.star_comment.StarCommentQueue;

/* JADX INFO: renamed from: X.0f9Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116230f9Z implements InterfaceC1116290f9f, OnMessageListener {
    public static int LLJJJ = -1;
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public StarCommentViewModel LLILLL;
    public C1116280f9e LLILZ;
    public final boolean LLILZIL;
    public final IMessageManager LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public final AnonymousClass0846 LLJ;
    public final C20568083y LLJI;
    public C1116210f9X LLJIJIL;
    public EnumC1116160f9S LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final BPEAHandler LLJJI;
    public int LLJJIII;
    public C1116130f9P LLJJIJI;
    public C1116140f9Q LLJJIJIIJIL;
    public AObserverS221S0100000_17 LLJJIJIL;

    public final Room LJI() {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            return (Room) dataChannel.gg0(RoomChannel.class);
        }
        return null;
    }

    public final void LJIIJ() {
        String idStr;
        User owner;
        String secUid;
        this.LLJJI.removeMessages(1);
        if (this.LL.isAdded()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1116240f9a.LIZ++;
            C1116240f9a.LJ = SystemClock.elapsedRealtime();
            C480460Ism.LIZ().getClass();
            StarCommentApi starCommentApi = (StarCommentApi) C480460Ism.LIZLLL(StarCommentApi.class);
            Room roomLJI = LJI();
            String str = "";
            if (roomLJI == null || (idStr = roomLJI.getIdStr()) == null) {
                idStr = "";
            }
            Room roomLJI2 = LJI();
            if (roomLJI2 != null && (owner = roomLJI2.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                str = secUid;
            }
            starCommentApi.getStarCommentQueueWithParameter(idStr, str, this.LLJJIII, this.LLIZ, this.LLIZLLLIL, "").LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this.LL)).LJLJI(5L, TimeUnit.SECONDS).LJJLL(new AfS6S0100100_17(jElapsedRealtime, this, 17), new AfS6S0100100_17(jElapsedRealtime, this, 18));
        }
    }

    @Override // X.InterfaceC1116290f9f
    public final StarCommentViewModel LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1116290f9f
    public final int LIZIZ() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1116290f9f
    public final long LIZJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1116290f9f
    public final int getVersion() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1116290f9f
    public final void LIZLLL(C1116260f9c c1116260f9c) {
        Long lValueOf;
        long jLIZJ;
        MutableLiveData<C1116210f9X> mutableLiveData;
        User owner;
        C1116280f9e c1116280f9e = this.LLILZ;
        if (c1116280f9e != null) {
            Room room = (Room) c1116280f9e.LIZIZ.gg0(RoomChannel.class);
            String secUid = null;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            if (room != null && (owner = room.getOwner()) != null) {
                secUid = owner.getSecUid();
            }
            String strValueOf2 = String.valueOf(secUid);
            StarCommentViewModel starCommentViewModelLIZ = c1116280f9e.LIZ.LIZ();
            if (starCommentViewModelLIZ != null && (mutableLiveData = starCommentViewModelLIZ.LLILLJJLI) != null && mutableLiveData.getValue() != null) {
                jLIZJ = c1116280f9e.LIZ.LIZJ();
            } else {
                jLIZJ = 0;
            }
            C480460Ism.LIZ().getClass();
            ((StarCommentApi) C480460Ism.LIZLLL(StarCommentApi.class)).purchaseCommentWithParameter(strValueOf, strValueOf2, c1116260f9c.LIZ, c1116260f9c.LIZIZ, c1116260f9c.LIZLLL, c1116260f9c.LJ, c1116260f9c.LJFF, c1116280f9e.LIZ.getVersion(), jLIZJ, c1116260f9c.LJI, c1116260f9c.LJIIIIZZ, c1116260f9c.LIZJ).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(c1116280f9e.LIZJ)).LJJLL(new AfS153S0200000_17(c1116260f9c, c1116280f9e, 16), new AfS153S0200000_17(c1116260f9c, c1116280f9e, 17));
        }
    }

    public final void LJIIJJI(int i) {
        DataChannel dataChannel;
        if (i != this.LLJJIII) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("role change -> ");
            sbLIZ.append(C1116190f9V.LIZ(i));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LLJJIII == 0) {
            if (i != 0) {
                int i2 = this.LLIZ;
                if (i2 > 1) {
                    this.LLIZ = i2 - 1;
                }
                BPEAHandler bPEAHandler = this.LLJJI;
                C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(1));
            }
        } else if (i == 0) {
            this.LLJJI.removeMessages(1);
        }
        if (this.LLJJIII == 2 && i != 2 && (dataChannel = this.LLILLJJLI) != null) {
            dataChannel.FQ2(CancelStarCommentAdministratorEvent.class);
        }
        LJIILIIL(LJIIL(i));
        this.LLJJIII = i;
    }

    public final boolean LJIIL(int i) {
        Object objGg0;
        Room roomLJI;
        StarCommentConfig starCommentConfig;
        Room roomLJI2;
        Room roomLJI3;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveModeChannel.class);
        } else {
            objGg0 = null;
        }
        if (((objGg0 != LiveMode.VIDEO || !LiveStarCommentEnableSetting.INSTANCE.getSettingValue()) && ((!GameLiveStarCommentEnableSetting.INSTANCE.getValue() || objGg0 != LiveMode.SCREEN_RECORD) && (!LSStarCommentProtectSetting.INSTANCE.getSettingValue() || objGg0 != LiveMode.LIVE_STUDIO))) || (roomLJI = LJI()) == null || (starCommentConfig = roomLJI.starCommentConfig) == null || !starCommentConfig.starCommentQualification || (roomLJI2 = LJI()) == null || !roomLJI2.showStarCommentEntrance || (roomLJI3 = LJI()) == null || (roomAuthStatus = roomLJI3.getRoomAuthStatus()) == null || (starCommentPermissionSwitch = roomAuthStatus.starCommentPermissionSwitch) == null || starCommentPermissionSwitch.status != 1 || i == 1) {
            return false;
        }
        return true;
    }

    public final void LJIILIIL(boolean z) {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(StarCommentEntranceVisibleEvent.class, Boolean.valueOf(z));
        }
        if (z != LLJJJ) {
            LLJJJ = z ? 1 : 0;
            Context context = this.LL.getContext();
            if (context != null) {
                ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(context, Integer.valueOf(LLJJJ), "star_comment_entrance_visible", null);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        int i;
        Integer num;
        User user;
        long id;
        long id2;
        StarCommentViewModel starCommentViewModel;
        int i2;
        int i3;
        User user2;
        User user3;
        if (iMessage instanceof StarCommentPushMessage) {
            StarCommentPushMessage starCommentPushMessage = (StarCommentPushMessage) iMessage;
            StarCommentMessage starCommentMessage = starCommentPushMessage.current;
            if (starCommentMessage != null && (user3 = starCommentMessage.user) != null) {
                this.LLJ.put(Long.valueOf(user3.getId()), user3);
            }
            StarCommentMessage starCommentMessage2 = starCommentPushMessage.next;
            if (starCommentMessage2 != null && (user2 = starCommentMessage2.user) != null) {
                this.LLJ.put(Long.valueOf(user2.getId()), user2);
            }
            StarCommentMessage starCommentMessage3 = starCommentPushMessage.current;
            if (starCommentMessage3 != null) {
                C20568083y c20568083y = this.LLJI;
                String str = starCommentMessage3.starCommentId;
                c20568083y.put(str, str);
            }
            StarCommentMessage starCommentMessage4 = starCommentPushMessage.next;
            if (starCommentMessage4 != null) {
                C20568083y c20568083y2 = this.LLJI;
                String str2 = starCommentMessage4.starCommentId;
                c20568083y2.put(str2, str2);
            }
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                C1116240f9a.LIZJ++;
                StarCommentMessage starCommentMessage5 = starCommentPushMessage.current;
                if (starCommentMessage5 != null) {
                    HashSet<String> hashSet = C1116240f9a.LJI;
                    if (!hashSet.contains(starCommentMessage5.starCommentId)) {
                        hashSet.add(starCommentMessage5.starCommentId);
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_message_receive");
                        C1116240f9a.LIZIZ(c474500IjALIZ, dataChannel);
                        c474500IjALIZ.LJJII(starCommentMessage5.starCommentId, "msg_id");
                        c474500IjALIZ.LJJII("current", "index");
                        User user4 = starCommentMessage5.user;
                        if (user4 != null && user4.getId() == UserService.getInstance().user().getCurrentUserId()) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_self");
                        c474500IjALIZ.LJJII(Long.valueOf(starCommentMessage5.startTimeMs), "server_start_time_ms");
                        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "client_receive_time_ms");
                        c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ()), "client_receive_time_ntp_ms");
                        c474500IjALIZ.LIZ();
                    }
                }
                StarCommentMessage starCommentMessage6 = starCommentPushMessage.next;
                if (starCommentMessage6 != null) {
                    HashSet<String> hashSet2 = C1116240f9a.LJI;
                    if (!hashSet2.contains(starCommentMessage6.starCommentId)) {
                        hashSet2.add(starCommentMessage6.starCommentId);
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_push_message_receive");
                        C1116240f9a.LIZIZ(c474500IjALIZ2, dataChannel);
                        c474500IjALIZ2.LJJII(starCommentMessage6.starCommentId, "msg_id");
                        c474500IjALIZ2.LJJII("next", "index");
                        User user5 = starCommentMessage6.user;
                        if (user5 != null && user5.getId() == UserService.getInstance().user().getCurrentUserId()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c474500IjALIZ2.LJJII(Integer.valueOf(i2), "is_self");
                        c474500IjALIZ2.LJJII(Long.valueOf(starCommentMessage6.startTimeMs), "server_start_time_ms");
                        c474500IjALIZ2.LJJII(Long.valueOf(System.currentTimeMillis()), "client_receive_time_ms");
                        c474500IjALIZ2.LJJII(Long.valueOf(C158B.LIZ()), "client_receive_time_ntp_ms");
                        c474500IjALIZ2.LIZ();
                    }
                }
            }
            if (this.LLJJIII == 0) {
                Room roomLJI = LJI();
                if (roomLJI != null) {
                    id2 = roomLJI.getId();
                } else {
                    id2 = 0;
                }
                ArrayList arrayList = new ArrayList();
                StarCommentMessage starCommentMessage7 = starCommentPushMessage.current;
                if (starCommentMessage7 != null) {
                    arrayList.add(C109000bA.LIZ(starCommentMessage7, id2, "message"));
                }
                StarCommentMessage starCommentMessage8 = starCommentPushMessage.next;
                if (starCommentMessage8 != null) {
                    arrayList.add(C109000bA.LIZ(starCommentMessage8, id2, "message"));
                }
                int i4 = starCommentPushMessage.queueVersion;
                int i5 = this.LLIZ;
                if (i4 > i5) {
                    this.LLIZ = i4;
                    StarCommentViewModel starCommentViewModel2 = this.LLILLL;
                    if (starCommentViewModel2 != null) {
                        starCommentViewModel2.yQ2(arrayList);
                    }
                } else if (i4 == i5 && (!arrayList.isEmpty()) && ((C1116210f9X) ListProtector.get(arrayList, 0)).LLILZ >= this.LLIZLLLIL && (starCommentViewModel = this.LLILLL) != null) {
                    starCommentViewModel.yQ2(arrayList);
                }
            }
            int i6 = this.LLJJIII;
            if ((i6 == 1 || i6 == 2) && this.LLJJ <= 0) {
                this.LLJJ = 5;
                BPEAHandler bPEAHandler = this.LLJJI;
                C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(1));
                return;
            }
            return;
        }
        C1116220f9Y c1116220f9Y = null;
        if (iMessage instanceof StarCommentNotificationMessage) {
            if (this.LLJJIII == 1) {
                StarCommentNotificationMessage starCommentNotificationMessage = (StarCommentNotificationMessage) iMessage;
                if (starCommentNotificationMessage.starCommentAction == 1 && ((user = starCommentNotificationMessage.operator) == null || user.getId() != 1)) {
                    Room roomLJI2 = LJI();
                    if (roomLJI2 != null) {
                        id = roomLJI2.getId();
                    } else {
                        id = 0;
                    }
                    StarCommentMessage starCommentMessage9 = starCommentNotificationMessage.starCommentMessage;
                    if (starCommentMessage9 != null) {
                        C1116210f9X c1116210f9XLIZ = C109000bA.LIZ(starCommentMessage9, id, "message");
                        c1116210f9XLIZ.LLIZ = 2;
                        c1116210f9XLIZ.LLJJI = starCommentNotificationMessage.operator;
                        StarCommentViewModel starCommentViewModel3 = this.LLILLL;
                        if (starCommentViewModel3 != null) {
                            C1116230f9Z c1116230f9Z = starCommentViewModel3.LLILZLL;
                            if (c1116230f9Z != null && c1116230f9Z.LLJJIII == 1) {
                                MutableLiveData<C1116220f9Y> mutableLiveData = starCommentViewModel3.LL;
                                C1116220f9Y value = mutableLiveData.getValue();
                                if (value != null) {
                                    value.LIZ(c1116210f9XLIZ);
                                    c1116220f9Y = value;
                                }
                                mutableLiveData.setValue(c1116220f9Y);
                            }
                            starCommentViewModel3.LLJ.add(c1116210f9XLIZ.LL);
                        }
                    }
                }
            }
            if (((StarCommentNotificationMessage) iMessage).starCommentAction != 2) {
                return;
            }
            int i7 = this.LLJJIII;
            if ((i7 != 1 && i7 != 2) || this.LLJJ > 0) {
                return;
            }
            this.LLJJ = 5;
            BPEAHandler bPEAHandler2 = this.LLJJI;
            C786410Ut5.LJLJJL(bPEAHandler2, bPEAHandler2.obtainMessage(1));
            return;
        }
        if (iMessage instanceof MemberMessage) {
            if (this.LLJJIII == 1) {
                return;
            }
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i8 = memberMessage.action;
            if (i8 != 5 && i8 != 6 && i8 != 20) {
                return;
            }
            Map<Integer, Integer> map = memberMessage.adminPermissions;
            if (map != null && (num = map.get(9)) != null) {
                z = true;
                if (num.intValue() == 1) {
                    i = 2;
                }
                LJIIJJI(i);
                return;
            }
            z = true;
            StarCommentViewModel starCommentViewModel4 = this.LLILLL;
            if (starCommentViewModel4 != null && starCommentViewModel4.LLIZ == z) {
                i = 3;
            } else {
                i = 0;
            }
            LJIIJJI(i);
            return;
        }
        if (!(iMessage instanceof RoomVerifyMessage)) {
            return;
        }
        RoomVerifyMessage roomVerifyMessage = (RoomVerifyMessage) iMessage;
        int i9 = roomVerifyMessage.verifyAction;
        if (i9 != 40) {
            if (i9 != 41) {
                return;
            }
            LJII(roomVerifyMessage.content, false);
            int i10 = this.LLJJIII;
            if (i10 != 1 && i10 != 2) {
                return;
            }
            this.LLJJ = 5;
            return;
        }
        LJII(null, true);
        int i11 = this.LLJJIII;
        if (i11 != 1 && i11 != 2) {
            return;
        }
        BPEAHandler bPEAHandler3 = this.LLJJI;
        C786410Ut5.LJLJJL(bPEAHandler3, bPEAHandler3.obtainMessage(1));
    }

    public C1116230f9Z(Fragment fragment, DataChannel dataChannel) {
        boolean zBooleanValue;
        IMessageManager iMessageManager;
        int iHashCode;
        int iHashCode2;
        int i;
        Map<Integer, Integer> map;
        Integer num;
        Room roomLJI;
        Boolean bool;
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZIL = zBooleanValue;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILZLL = iMessageManager;
        this.LLJ = new AnonymousClass0846();
        this.LLJI = new C20568083y();
        this.LLJILJIL = EnumC1116160f9S.UNKNOWN;
        this.LLJJI = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 12));
        if (fragment.isAdded()) {
            C1116240f9a.LJFF = SystemClock.elapsedRealtime();
            if (dataChannel != null) {
                dataChannel.SX0(C1110110ezh.class, this);
            }
            StarCommentViewModel starCommentViewModel = (StarCommentViewModel) ViewModelProviders.of(fragment).get(StarCommentViewModel.class);
            starCommentViewModel.LLILZIL = dataChannel;
            starCommentViewModel.LLILZLL = this;
            if (dataChannel != null) {
                if (C500260Jjc.LJJIJIL((Boolean) dataChannel.gg0(C0TZM.class))) {
                    C1116130f9P c1116130f9P = new C1116130f9P(starCommentViewModel, fragment, dataChannel);
                    dataChannel.BQ2(fragment, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(c1116130f9P, 333));
                    dataChannel.BQ2(fragment, VoiceChatLayoutChannel.class, new AwS596S0100000_17(c1116130f9P, 334));
                    dataChannel.BQ2(fragment, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(c1116130f9P, 335));
                    starCommentViewModel.LLILLJJLI.observeForever(c1116130f9P.LJIILIIL);
                    starCommentViewModel.LLILZ.observe(c1116130f9P.LIZIZ, c1116130f9P.LJIILJJIL);
                    starCommentViewModel.LL.observe(c1116130f9P.LIZIZ, c1116130f9P.LJIILL);
                    this.LLJJIJI = c1116130f9P;
                } else {
                    C1116140f9Q c1116140f9Q = new C1116140f9Q(starCommentViewModel, fragment, dataChannel);
                    starCommentViewModel.LLILLJJLI.observeForever(c1116140f9Q.LJIIJ);
                    starCommentViewModel.LLILZ.observe(c1116140f9Q.LIZIZ, c1116140f9Q.LJIIJJI);
                    starCommentViewModel.LL.observe(c1116140f9Q.LIZIZ, c1116140f9Q.LJIIL);
                    this.LLJJIJIIJIL = c1116140f9Q;
                }
            }
            AObserverS221S0100000_17 aObserverS221S0100000_17 = new AObserverS221S0100000_17(this, 55);
            starCommentViewModel.LLILLJJLI.observeForever(aObserverS221S0100000_17);
            this.LLJJIJIL = aObserverS221S0100000_17;
            this.LLILLL = starCommentViewModel;
            if (!zBooleanValue) {
                Room roomLJI2 = LJI();
                if (roomLJI2 != null) {
                    iHashCode = roomLJI2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == C0165003f.LIZ && C0165003f.LIZIZ && (roomLJI = LJI()) != null) {
                    roomLJI.pollingStarComment = true;
                }
                Room roomLJI3 = LJI();
                if (roomLJI3 != null) {
                    iHashCode2 = roomLJI3.hashCode();
                } else {
                    iHashCode2 = 0;
                }
                C0165003f.LIZ = iHashCode2;
                UserAttr userAttr = UserService.getInstance().user().getCurrentUser().getUserAttr();
                if (userAttr != null && (map = userAttr.adminPermissions) != null && (num = map.get(9)) != null && num.intValue() == 1) {
                    i = 2;
                } else {
                    Room roomLJI4 = LJI();
                    if (roomLJI4 != null && roomLJI4.pollingStarComment) {
                        Room roomLJI5 = LJI();
                        if (roomLJI5 != null) {
                            roomLJI5.pollingStarComment = false;
                        }
                        this.LLJILJILJ = true;
                        i = 3;
                    } else {
                        i = 0;
                    }
                }
                LJIIJJI(i);
                C0KXB.LIZ.observe(fragment, new C237000vo(C0KXB.LIZ.getValue(), new AwS596S0100000_17(this, 715)));
            } else {
                LJIIJJI(1);
            }
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.STAR_COMMENT_PUSH_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), this);
                iMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
            }
            if (this.LLJJIII == 1 && iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.STAR_COMMENT_NOTIFICATION_MESSAGE.getIntType(), this);
            }
            if (dataChannel != null) {
                dataChannel.CQ2(DeleteStarCommentEvent.class, fragment, new AwS596S0100000_17(this, 716));
            }
            DataChannelGlobal.LLILZ.BQ2(this.LL, this.LL, StarCommentPurchasePageEvent.class, new AwS596S0100000_17(this, 717));
            DataChannelGlobal.LLILZ.BQ2(this.LL, this.LL, EnigmaStatus.class, new AwS596S0100000_17(this, 718));
            if (dataChannel != null) {
                this.LLILZ = new C1116280f9e(this, dataChannel, fragment);
            }
            Room roomLJI6 = LJI();
            if (C1116310f9h.LIZ != roomLJI6) {
                C1116310f9h.LIZ = roomLJI6;
                C1116310f9h.LJFF = null;
                C1116310f9h.LIZIZ = 0;
            }
            fragment.requireFragmentManager().LJZL(new C1151480g4Q(this, 1), false);
        }
    }

    @Override // X.InterfaceC1116290f9f
    public final void LJ(StarCommentQueue starCommentQueue, boolean z) {
        String strLJIJJ;
        Object next;
        String strLJIJJ2;
        String str;
        String str2;
        long id;
        StarCommentMessage starCommentMessage;
        C1116210f9X c1116210f9XLIZ;
        int i = starCommentQueue.queueVersion;
        if (i > this.LLIZ) {
            this.LLIZ = i;
            if (z) {
                C500260Jjc.LJJJLIIL(starCommentQueue.starCommentList, new AwS596S0100000_17(this, 714));
            }
            ArrayList<C1116210f9X> arrayList = new ArrayList();
            for (StarCommentItem starCommentItem : starCommentQueue.starCommentList) {
                Room roomLJI = LJI();
                if (roomLJI != null) {
                    id = roomLJI.getId();
                } else {
                    id = 0;
                }
                if (starCommentItem.startCommentStatus != 2 && (starCommentMessage = starCommentItem.starComment) != null && (c1116210f9XLIZ = C109000bA.LIZ(starCommentMessage, id, "api")) != null) {
                    arrayList.add(c1116210f9XLIZ);
                }
            }
            if (z && arrayList.size() == 1 && ((C1116210f9X) ListProtector.get(arrayList, 0)).LLILLJJLI.getId() == UserService.getInstance().user().getCurrentUserId()) {
                ((C1116210f9X) ListProtector.get(arrayList, 0)).LLJIJIL = EnumC1116160f9S.SELF_WAITING;
            }
            StarCommentViewModel starCommentViewModel = this.LLILLL;
            if (starCommentViewModel != null) {
                ArrayList arrayList2 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    if (starCommentViewModel.LLJILLL.isEmpty()) {
                        for (C1116210f9X c1116210f9X : arrayList) {
                            starCommentViewModel.LLJILLL.put(c1116210f9X.LL, c1116210f9X);
                        }
                    } else {
                        for (C1116210f9X c1116210f9X2 : arrayList) {
                            HashMap<String, C1116210f9X> map = starCommentViewModel.LLJILLL;
                            String str3 = c1116210f9X2.LL;
                            c1116210f9X2.LLJJIII = true;
                            map.put(str3, c1116210f9X2);
                        }
                        Iterator<Map.Entry<String, C1116210f9X>> it2 = starCommentViewModel.LLJILLL.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, C1116210f9X> next2 = it2.next();
                            if (!next2.getValue().LLJJIII) {
                                if (next2.getValue().LLILZ + next2.getValue().LLILZIL > ((C1116210f9X) ListProtector.get(arrayList, 0)).LLILZ) {
                                    arrayList2.add(next2.getValue());
                                }
                                it2.remove();
                            } else {
                                next2.getValue().LLJJIII = false;
                            }
                        }
                    }
                }
                C500260Jjc.LJJJLIIL(arrayList, new AwS596S0100000_17(starCommentViewModel, 719));
                String str4 = "myself";
                String str5 = "comment_area";
                if (!arrayList.isEmpty()) {
                    if (!arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            starCommentViewModel.LLJ.add(((C1116210f9X) it3.next()).LL);
                        }
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (((C1116210f9X) next).LLILLJJLI.getId() == UserService.getInstance().user().getCurrentUserId()) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        if (next != null) {
                            starCommentViewModel.LLILZ.setValue(new C1116150f9R(UserService.getInstance().user().getCurrentUser().getAvatarThumb(), C497740JfY.LJIJI(2131851097), EnumC1116180f9U.DELETED));
                            starCommentViewModel.LLJI = SystemClock.elapsedRealtime() + (((long) 4) * 1000);
                            DataChannel dataChannel = starCommentViewModel.LLILZIL;
                            if (dataChannel != null) {
                                C1116210f9X c1116210f9X3 = (C1116210f9X) ListProtector.get(arrayList2, 0);
                                String str6 = ((C1116210f9X) ListProtector.get(arrayList2, 0)).LL;
                                C1116210f9X value = starCommentViewModel.LLILLJJLI.getValue();
                                if (value != null) {
                                    str2 = value.LL;
                                } else {
                                    str2 = null;
                                }
                                if (!Intrinsics.LJFF(str6, str2)) {
                                    str5 = "queue_list";
                                }
                                C1116200f9W.LIZJ(dataChannel, c1116210f9X3, str5);
                            }
                        } else if (starCommentViewModel.xQ2()) {
                            MutableLiveData<C1116150f9R> mutableLiveData = starCommentViewModel.LLILZ;
                            if (Intrinsics.LJFF(((C1116210f9X) ListProtector.get(arrayList2, 0)).LL, starCommentViewModel.LLIZLLLIL)) {
                                strLJIJJ2 = C497740JfY.LJIJJ(2131844122, C0KVU.LIZ(((C1116210f9X) ListProtector.get(arrayList2, 0)).LLILLJJLI));
                            } else {
                                strLJIJJ2 = C497740JfY.LJIJJ(2131844123, C0KVU.LIZ(((C1116210f9X) ListProtector.get(arrayList2, 0)).LLILLJJLI));
                            }
                            mutableLiveData.setValue(new C1116150f9R(null, strLJIJJ2, EnumC1116180f9U.DELETED));
                            starCommentViewModel.LLJI = SystemClock.elapsedRealtime() + (((long) 4) * 1000);
                            DataChannel dataChannel2 = starCommentViewModel.LLILZIL;
                            if (dataChannel2 != null) {
                                C1116210f9X c1116210f9X4 = (C1116210f9X) ListProtector.get(arrayList2, 0);
                                if (!Intrinsics.LJFF(((C1116210f9X) ListProtector.get(arrayList2, 0)).LL, starCommentViewModel.LLIZLLLIL)) {
                                    str4 = "others";
                                }
                                String str7 = ((C1116210f9X) ListProtector.get(arrayList2, 0)).LL;
                                C1116210f9X value2 = starCommentViewModel.LLILLJJLI.getValue();
                                if (value2 != null) {
                                    str = value2.LL;
                                } else {
                                    str = null;
                                }
                                if (!Intrinsics.LJFF(str7, str)) {
                                    str5 = "queue_list";
                                }
                                C1116200f9W.LIZIZ(dataChannel2, c1116210f9X4, str4, str5);
                            }
                        }
                    }
                    starCommentViewModel.LLJILJILJ = false;
                    C1116210f9X value3 = starCommentViewModel.LLILLJJLI.getValue();
                    if (value3 != null) {
                        if (Intrinsics.LJFF(((C1116210f9X) ListProtector.get(arrayList, 0)).LL, value3.LL)) {
                            MutableLiveData<List<C1116210f9X>> mutableLiveData2 = starCommentViewModel.LLILLL;
                            List<C1116210f9X> listSubList = arrayList.subList(1, arrayList.size());
                            StarCommentViewModel.AQ2(value3.LLJI + value3.LLJILJIL + value3.LLILZIL, listSubList);
                            mutableLiveData2.setValue(listSubList);
                            starCommentViewModel.zQ2();
                            long j = ((C1116210f9X) ListProtector.get(arrayList, 0)).LLILZ;
                            value3.LLILZ = j;
                            C1116230f9Z c1116230f9Z = starCommentViewModel.LLILZLL;
                            if (c1116230f9Z != null) {
                                c1116230f9Z.LLIZLLLIL = j;
                                return;
                            }
                            return;
                        }
                        starCommentViewModel.wQ2(arrayList, true);
                        return;
                    }
                    if (!(true ^ arrayList.isEmpty())) {
                        return;
                    }
                    starCommentViewModel.LLILLL.setValue(arrayList);
                    starCommentViewModel.vQ2();
                    return;
                }
                if (!starCommentViewModel.LLJILJILJ && starCommentViewModel.LLILLJJLI.getValue() != null) {
                    starCommentViewModel.LLJILJIL.removeMessages(1);
                    starCommentViewModel.LLJILJIL.removeMessages(2);
                    C1116210f9X value4 = starCommentViewModel.LLILLJJLI.getValue();
                    if (value4 != null) {
                        starCommentViewModel.LLJ.add(value4.LL);
                        MutableLiveData<C1116210f9X> mutableLiveData3 = starCommentViewModel.LLILLJJLI;
                        value4.LLJ = 0L;
                        mutableLiveData3.setValue(value4);
                        MutableLiveData<List<C1116210f9X>> mutableLiveData4 = starCommentViewModel.LLILLL;
                        List<C1116210f9X> value5 = mutableLiveData4.getValue();
                        if (value5 != null) {
                            value5.clear();
                        } else {
                            value5 = null;
                        }
                        mutableLiveData4.setValue(value5);
                        if (value4.LLILLJJLI.getId() == UserService.getInstance().user().getCurrentUserId()) {
                            starCommentViewModel.LLILZ.setValue(new C1116150f9R(UserService.getInstance().user().getCurrentUser().getAvatarThumb(), C497740JfY.LJIJI(2131851097), EnumC1116180f9U.DELETED));
                            C1116230f9Z c1116230f9Z2 = starCommentViewModel.LLILZLL;
                            if (c1116230f9Z2 != null && c1116230f9Z2.LLJJIII == 3) {
                                c1116230f9Z2.LJIIJJI(0);
                            }
                            DataChannel dataChannel3 = starCommentViewModel.LLILZIL;
                            if (dataChannel3 != null) {
                                C1116200f9W.LIZJ(dataChannel3, value4, "comment_area");
                            }
                        } else if (starCommentViewModel.xQ2()) {
                            MutableLiveData<C1116150f9R> mutableLiveData5 = starCommentViewModel.LLILZ;
                            if (Intrinsics.LJFF(value4.LL, starCommentViewModel.LLIZLLLIL)) {
                                strLJIJJ = C497740JfY.LJIJJ(2131844122, C0KVU.LIZ(value4.LLILLJJLI));
                            } else {
                                strLJIJJ = C497740JfY.LJIJJ(2131844123, C0KVU.LIZ(value4.LLILLJJLI));
                            }
                            mutableLiveData5.setValue(new C1116150f9R(null, strLJIJJ, EnumC1116180f9U.DELETED));
                            DataChannel dataChannel4 = starCommentViewModel.LLILZIL;
                            if (dataChannel4 != null) {
                                if (!Intrinsics.LJFF(value4.LL, starCommentViewModel.LLIZLLLIL)) {
                                    str4 = "others";
                                }
                                C1116200f9W.LIZIZ(dataChannel4, value4, str4, "comment_area");
                            }
                        }
                        BPEAHandler bPEAHandler = starCommentViewModel.LLJILJIL;
                        C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(2), ((long) 4) * 1000);
                    }
                    starCommentViewModel.LLJILJILJ = true;
                    return;
                }
                starCommentViewModel.LLJILJILJ = true;
            }
        }
    }

    public final void LJII(String str, boolean z) {
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch2;
        int i;
        Room roomLJI = LJI();
        if (roomLJI != null && (roomAuthStatus2 = roomLJI.getRoomAuthStatus()) != null && (starCommentPermissionSwitch2 = roomAuthStatus2.starCommentPermissionSwitch) != null) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            starCommentPermissionSwitch2.status = i;
        }
        if (this.LLILZIL) {
            if (str == null) {
                str = "";
            }
            Room roomLJI2 = LJI();
            if (roomLJI2 != null && (roomAuthStatus = roomLJI2.getRoomAuthStatus()) != null && (starCommentPermissionSwitch = roomAuthStatus.starCommentPermissionSwitch) != null) {
                starCommentPermissionSwitch.offreason = str;
            }
        }
        LJIILIIL(LJIIL(this.LLJJIII));
    }

    public final C11NZ<C470590Icr<StarCommentDeleteResponse.Data>> LJFF(C1116360f9m c1116360f9m, Room room, boolean z) {
        C480460Ism.LIZ().getClass();
        return ((StarCommentApi) C480460Ism.LIZLLL(StarCommentApi.class)).deleteStarCommentWithParameter(c1116360f9m.LIZ.LL, room.getIdStr(), this.LLIZLLLIL, this.LLIZ, this.LLJJIII, z);
    }

    public final void LJIIIIZZ(Throwable th, C1116360f9m c1116360f9m, long j) {
        String str;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_delete_request");
            C1116240f9a.LIZIZ(c474500IjALIZ, dataChannel);
            C1116240f9a.LIZJ(c474500IjALIZ, th);
            c474500IjALIZ.LJJII(Integer.valueOf(c1116360f9m.LIZJ ? 1 : 0), "is_floating");
            c474500IjALIZ.LJJII(0, "is_successful");
            c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "duration");
            c474500IjALIZ.LJJII(c1116360f9m.LIZ.LL, "comment_id");
            c474500IjALIZ.LJJII(c1116360f9m.LIZIZ, "delete_position");
            if (c1116360f9m.LIZ.LLILZLL == 10) {
                str = "basic";
            } else {
                str = "up_grade";
            }
            c474500IjALIZ.LJJII(str, "gear_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIIIZ(C470590Icr<StarCommentDeleteResponse.Data> c470590Icr, C1116360f9m c1116360f9m, long j) {
        String str;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            String str2 = c470590Icr.LIZIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_delete_request");
            C1116240f9a.LIZIZ(c474500IjALIZ, dataChannel);
            c474500IjALIZ.LJJII(Integer.valueOf(c1116360f9m.LIZJ ? 1 : 0), "is_floating");
            c474500IjALIZ.LJJII(1, "is_successful");
            c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "duration");
            c474500IjALIZ.LJJII(c1116360f9m.LIZ.LL, "comment_id");
            c474500IjALIZ.LJJII(c1116360f9m.LIZIZ, "delete_position");
            if (c1116360f9m.LIZ.LLILZLL == 10) {
                str = "basic";
            } else {
                str = "up_grade";
            }
            c474500IjALIZ.LJJII(str, "gear_type");
            c474500IjALIZ.LJJII(str2, "log_id");
            c474500IjALIZ.LIZ();
        }
    }
}
