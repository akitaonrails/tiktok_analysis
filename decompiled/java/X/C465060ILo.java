package X;

import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0ILo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465060ILo implements WeakHandler.IHandler, C0IGR {
    public final InterfaceC465090ILr LLILLJJLI;
    public C0IGR LLILLL;
    public final WeakHandler LL = new WeakHandler(this);
    public final C473030Ign LLILZ = new C473030Ign();

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        C0IGR c0igr = this.LLILLL;
        return c0igr != null && c0igr.onBackPressed();
    }

    public C465060ILo(InterfaceC465090ILr interfaceC465090ILr) {
        this.LLILLJJLI = interfaceC465090ILr;
    }

    public final void LIZJ(final long j) {
        WeakHandler weakHandler = this.LL;
        if (weakHandler != null) {
            C464950ILd.LJI.getClass();
            C1119370fEd.LIZIZ().LIZ(weakHandler, new Callable() { // from class: X.0IPM
                public final /* synthetic */ boolean LL = false;
                public final /* synthetic */ int LLILLL = 4;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("RoomManager@6c79.getRoomStats$1");
                    boolean z = this.LL;
                    long j2 = j;
                    int i = this.LLILLL;
                    C480460Ism.LIZ().getClass();
                    C470590Icr<Room> c470590Icr = ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).getRoomStats(z, j2, i).execute().LIZIZ;
                    R r = c470590Icr.extra;
                    if (r != 0) {
                        c470590Icr.data.nowTime = r.now / 1000;
                    }
                    Room room = c470590Icr.data;
                    C1C7U.LIZIZ("RoomManager@6c79.getRoomStats$1");
                    return room;
                }
            }, 12);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        InterfaceC465090ILr interfaceC465090ILr;
        int i = message.what;
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            if (i != 21 && i != 22 && (HandlerHook.getMessageObj(message.obj) instanceof C501470JlZ)) {
                C766270U4b.LJIIJJI(((C501470JlZ) HandlerHook.getMessageObj(message.obj)).getPrompt());
                return;
            }
            return;
        }
        if (22 != i && 21 != i) {
            if (i == 12 && (HandlerHook.getMessageObj(message.obj) instanceof Room) && (interfaceC465090ILr = this.LLILLJJLI) != null) {
                interfaceC465090ILr.ed((Room) HandlerHook.getMessageObj(message.obj));
                this.LLILLJJLI.xg((Room) HandlerHook.getMessageObj(message.obj));
                this.LLILLJJLI.az((Room) HandlerHook.getMessageObj(message.obj));
                return;
            }
            return;
        }
        if (!(HandlerHook.getMessageObj(message.obj) instanceof List)) {
            return;
        }
        try {
            List<Room> list = (List) HandlerHook.getMessageObj(message.obj);
            InterfaceC465090ILr interfaceC465090ILr2 = this.LLILLJJLI;
            if (interfaceC465090ILr2 == null) {
                return;
            }
            interfaceC465090ILr2.xw(list);
            StringBuilder sb = new StringBuilder();
            for (Room room : list) {
                sb.append(room.getIdStr());
                sb.append(":");
                sb.append(room.getOwnerUserId());
                sb.append(";");
            }
            HashMap map = new HashMap();
            map.put("room", sb.toString());
            C1CC2.LJII(0, "ttlive_live_end_recommend_live", map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("LiveEnd", th);
        }
    }

    public final void LIZ(Room room, String str, boolean z, Map<String, String> map) {
        if (room == null) {
            return;
        }
        this.LLILZ.LIZ(room.getOwner().getId(), room, str, new InterfaceC465100ILs() { // from class: X.0ILp
            @Override // X.InterfaceC465100ILs
            public final void LIZ(FollowPair followPair) {
                if (!followPair.LIZIZ()) {
                    C766270U4b.LIZLLL(2131853447);
                    InterfaceC465090ILr interfaceC465090ILr = this.LIZ.LLILLJJLI;
                    if (interfaceC465090ILr != null) {
                        interfaceC465090ILr.Fc();
                        return;
                    }
                    return;
                }
                C766270U4b.LIZLLL(2131841708);
            }

            @Override // X.InterfaceC465100ILs
            public final void LIZIZ(Throwable th) {
                InterfaceC465090ILr interfaceC465090ILr = this.LIZ.LLILLJJLI;
                if (interfaceC465090ILr != null) {
                    interfaceC465090ILr.Fc();
                }
                if (th instanceof C501470JlZ) {
                    C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
                } else {
                    C766270U4b.LIZLLL(2131853447);
                }
            }
        }, z, map);
    }

    public final void LIZIZ(Room room, String str, Boolean bool, Map<String, String> map) {
        OfficialChannelInfo officialChannelInfo;
        User user;
        if (room != null && (officialChannelInfo = room.officialChannelInfo) != null && (user = officialChannelInfo.channelUser) != null) {
            this.LLILZ.LIZ(user.getId(), room, str, new InterfaceC465100ILs() { // from class: X.0ILq
                @Override // X.InterfaceC465100ILs
                public final void LIZ(FollowPair followPair) {
                    if (!followPair.LIZIZ()) {
                        C766270U4b.LIZLLL(2131853447);
                        InterfaceC465090ILr interfaceC465090ILr = this.LIZ.LLILLJJLI;
                        if (interfaceC465090ILr != null) {
                            interfaceC465090ILr.Fc();
                        }
                    }
                }

                @Override // X.InterfaceC465100ILs
                public final void LIZIZ(Throwable th) {
                    InterfaceC465090ILr interfaceC465090ILr = this.LIZ.LLILLJJLI;
                    if (interfaceC465090ILr != null) {
                        interfaceC465090ILr.Fc();
                    }
                    C766270U4b.LIZLLL(2131853447);
                }
            }, bool.booleanValue(), map);
        }
    }
}
