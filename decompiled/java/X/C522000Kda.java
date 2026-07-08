package X;

import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.RemoveFollowMsgChannel;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C522000Kda implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C522000Kda c522000Kda) {
    }

    public static final void onComplete$1(C522000Kda c522000Kda) {
    }

    public static final void onComplete$2(C522000Kda c522000Kda) {
    }

    public static final void onError$2(C522000Kda c522000Kda, Throwable th) {
    }

    public static final void onSubscribe$0(C522000Kda c522000Kda, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C522000Kda c522000Kda, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$2(C522000Kda c522000Kda, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
            case 2:
                onComplete$2(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
            case 2:
                onError$2(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
            case 2:
                onNext$2(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
            case 2:
                onSubscribe$2(this, interfaceC420801kM);
                break;
        }
    }

    public C522000Kda(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C522000Kda c522000Kda, Throwable th) {
        if (!((LiveRoomUserInfoWidget) c522000Kda.l0).isViewValid()) {
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) c522000Kda.l0;
        if (liveRoomUserInfoWidget.LLLZ != null) {
            liveRoomUserInfoWidget.LLLZ.LIZ(EnumC1096020ecy.UNFOLLOW);
        }
        C501540Jlg.LIZJ(((LiveRoomUserInfoWidget) c522000Kda.l0).context, th);
        LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = (LiveRoomUserInfoWidget) c522000Kda.l0;
        liveRoomUserInfoWidget2.R1(liveRoomUserInfoWidget2.context, th);
        ((LiveRoomUserInfoWidget) c522000Kda.l0).k = false;
    }

    public static final void onError$1(C522000Kda c522000Kda, Throwable th) {
        if (!((LiveRoomUserInfoWidget) c522000Kda.l0).isViewValid()) {
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) c522000Kda.l0;
        if (liveRoomUserInfoWidget.LLLZ != null) {
            liveRoomUserInfoWidget.LLLZ.LIZ(EnumC1096020ecy.UNFOLLOW);
        }
        C501540Jlg.LIZJ(((LiveRoomUserInfoWidget) c522000Kda.l0).context, th);
        LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = (LiveRoomUserInfoWidget) c522000Kda.l0;
        liveRoomUserInfoWidget2.R1(liveRoomUserInfoWidget2.context, th);
        ((LiveRoomUserInfoWidget) c522000Kda.l0).k = false;
    }

    public static final void onNext$0(C522000Kda c522000Kda, Object obj) {
        boolean z;
        FollowPair followPair = (FollowPair) obj;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) c522000Kda.l0;
        if (liveRoomUserInfoWidget.LLLZ != null) {
            liveRoomUserInfoWidget.LLLZ.LJIIZILJ(followPair, false);
            LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = (LiveRoomUserInfoWidget) c522000Kda.l0;
            if (followPair.LIZ() != 0) {
                z = true;
            } else {
                z = false;
            }
            liveRoomUserInfoWidget2.y1(z);
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget3 = (LiveRoomUserInfoWidget) c522000Kda.l0;
        liveRoomUserInfoWidget3.dataChannel.zW(RemoveFollowMsgChannel.class, Long.valueOf(liveRoomUserInfoWidget3.LLLLLJLJLL.getId()));
        ((LiveRoomUserInfoWidget) c522000Kda.l0).k = false;
    }

    public static final void onNext$1(C522000Kda c522000Kda, Object obj) {
        boolean z;
        FollowPair followPair = (FollowPair) obj;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) c522000Kda.l0;
        if (liveRoomUserInfoWidget.LLLZ != null) {
            liveRoomUserInfoWidget.LLLZ.LJIIZILJ(followPair, false);
            LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = (LiveRoomUserInfoWidget) c522000Kda.l0;
            if (followPair.LIZ() != 0) {
                z = true;
            } else {
                z = false;
            }
            liveRoomUserInfoWidget2.y1(z);
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget3 = (LiveRoomUserInfoWidget) c522000Kda.l0;
        liveRoomUserInfoWidget3.dataChannel.zW(RemoveFollowMsgChannel.class, Long.valueOf(liveRoomUserInfoWidget3.LLLLLJLJLL.getId()));
        LiveRoomUserInfoWidget liveRoomUserInfoWidget4 = (LiveRoomUserInfoWidget) c522000Kda.l0;
        liveRoomUserInfoWidget4.e2(liveRoomUserInfoWidget4.p, null);
        ((LiveRoomUserInfoWidget) c522000Kda.l0).k = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onNext$2(C522000Kda c522000Kda, Object obj) {
        Long lValueOf;
        Long lValueOf2;
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        EnterRoomConfig.GuestUser guestUser = null;
        Context context = null;
        if (t != 0 && ((Room) t).getId() != 0) {
            Room room = (Room) baseResponse.data;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            Room room2 = ((C463350IEz) c522000Kda.l0).LIZJ;
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getId());
            } else {
                lValueOf2 = null;
            }
            if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                final C463350IEz c463350IEz = (C463350IEz) c522000Kda.l0;
                final Room room3 = (Room) baseResponse.data;
                c463350IEz.getClass();
                Context context2 = c463350IEz.LIZ;
                if (context2 == null) {
                    context2 = null;
                }
                Object[] objArr = new Object[1];
                EnterRoomConfig.GuestUser guestUser2 = c463350IEz.LIZIZ;
                if (guestUser2 == null) {
                    guestUser2 = null;
                }
                objArr[0] = guestUser2.nickName;
                String string = context2.getString(2131842888, objArr);
                Context context3 = c463350IEz.LIZ;
                if (context3 != null) {
                    context = context3;
                }
                String string2 = context.getString(2131842726);
                InterfaceC2183601Ad4 interfaceC2183601Ad4 = new InterfaceC2183601Ad4() { // from class: X.0IIv
                    @Override // X.InterfaceC2183601Ad4
                    public final void onCancel() {
                    }

                    @Override // X.InterfaceC2183601Ad4
                    public final void LIZ() {
                        C463350IEz c463350IEz2 = c463350IEz;
                        Room room4 = room3;
                        c463350IEz2.getClass();
                        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                        C0INV c0inv = C0IL2.LIZ;
                        roomsData.guestUser = c0inv.LIZ().mEnterRoomConfig.mRoomsData.guestUser;
                        enterRoomConfig.mRoomsData.enterLiveSource = "";
                        C464330IIt.LIZLLL(room4, enterRoomConfig);
                        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                        roomsData2.enterFromMerge = "live_detail";
                        roomsData2.enterMethod = "guest_connection_distribution";
                        c0inv.LIZLLL(new EnterRoomLinkSession(enterRoomConfig));
                        IHostWatch iHostWatch = (IHostWatch) C1161920gLG.LIZJ(IHostWatch.class);
                        if (iHostWatch != null) {
                            Context context4 = c463350IEz2.LIZ;
                            if (context4 == null) {
                                context4 = null;
                            }
                            iHostWatch.watchLive(context4, enterRoomConfig);
                        }
                    }
                };
                DialogC2183591Ad3 dialogC2183591Ad3 = new DialogC2183591Ad3(context2);
                dialogC2183591Ad3.LLJILJIL = interfaceC2183601Ad4;
                dialogC2183591Ad3.LLJILJILJ = string;
                dialogC2183591Ad3.LLJILLL = string2;
                dialogC2183591Ad3.show();
                C785410UrT.LIZIZ(dialogC2183591Ad3);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(dialogC2183591Ad3);
                C816490W1f.LIZ(dialogC2183591Ad3);
                return;
            }
        }
        C463350IEz c463350IEz2 = (C463350IEz) c522000Kda.l0;
        Context context4 = c463350IEz2.LIZ;
        if (context4 == null) {
            context4 = null;
        }
        Object[] objArr2 = new Object[1];
        EnterRoomConfig.GuestUser guestUser3 = c463350IEz2.LIZIZ;
        if (guestUser3 != null) {
            guestUser = guestUser3;
        }
        objArr2[0] = guestUser.nickName;
        C766270U4b.LJIIJJI(context4.getString(2131842743, objArr2));
    }
}
