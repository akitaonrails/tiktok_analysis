package X;

import Y.ARunnableS107S0100000_7;
import android.os.Handler;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.feed.preloadfeed.FeedLiveTopLivePrefetchModel;
import com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckServiceV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS58S1000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467460IUu implements C0J6U {
    public static final C01GW<C467460IUu> LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS193S0000000_7.get$arr$(207));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(208));
    public boolean LIZIZ;
    public C0IV0 LIZJ;
    public boolean LIZLLL;

    @Override // X.C0J6U
    public final void LJFF() {
    }

    @Override // X.C0J6U
    public final void LJI() {
    }

    @Override // X.C0J6U
    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LIZJ = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).mk();
        int iLJFF = C1510700pPo.LIZ().LJFF(-1, "livesdk_live_play_label");
        C0IV0 c0iv0 = this.LIZJ;
        if (c0iv0 != null) {
            FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel = (FeedLiveTopLivePrefetchModel) this.LIZ.getValue();
            long j = C202094145s.LJIILL;
            C467450IUt c467450IUt = (C467450IUt) c0iv0;
            c467450IUt.LIZ = null;
            c467450IUt.LJI = 0L;
            ((Handler) c467450IUt.LJFF.getValue()).removeCallbacks((Runnable) c467450IUt.LJIIJJI.getValue());
            c467450IUt.LIZIZ = null;
            c467450IUt.LJ = false;
            C467450IUt.LJIILIIL = null;
            c467450IUt.LJIIIIZZ = 2;
            c467450IUt.LIZLLL = 0L;
            c467450IUt.LIZ = feedLiveTopLivePrefetchModel;
            c467450IUt.LJI = j;
            c467450IUt.LIZJ = iLJFF;
            if (feedLiveTopLivePrefetchModel == null || !feedLiveTopLivePrefetchModel.enabled) {
                return;
            }
            c467450IUt.LJIIIZ.LIZLLL();
            Handler handler = (Handler) c467450IUt.LJFF.getValue();
            ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(c467450IUt, 287);
            FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel2 = c467450IUt.LIZ;
            C786410Ut5.LJLIIL(feedLiveTopLivePrefetchModel2 != null ? feedLiveTopLivePrefetchModel2.startDelayTime : 0L, handler, aRunnableS107S0100000_7);
        }
    }

    @Override // X.C0J6U
    public final void LIZIZ() {
        if (this.LIZIZ) {
            this.LIZLLL = true;
            C0IV0 c0iv0 = this.LIZJ;
            if (c0iv0 != null) {
                ((C467450IUt) c0iv0).LIZIZ();
            }
        }
    }

    @Override // X.C0J6U
    public final boolean LIZLLL() {
        return ((FeedLiveTopLivePrefetchModel) this.LIZ.getValue()).enabledAndroidOpt;
    }

    @Override // X.C0J6U
    public final boolean LJ() {
        return ((FeedLiveTopLivePrefetchModel) this.LIZ.getValue()).enabled;
    }

    @Override // X.C0J6U
    public final void LJII() {
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).H12();
        long j = C202094145s.LJIILL;
        if (C467340IUi.LIZJ().getEnabled() && ((Boolean) C467340IUi.LJIILJJIL.getValue()).booleanValue() && !C467340IUi.LJFF) {
            C467340IUi.LIZLLL = j;
            C467340IUi.LIZIZ().removeCallbacksAndMessages(null);
            C467340IUi.LIZIZ = null;
            C467340IUi.LIZJ = 0L;
            C467340IUi.LJFF = false;
            ((ArrayList) C467340IUi.LJIIJ).clear();
            C467340IUi.LJIIJJI = "";
            C467340IUi.LJ = 4;
            C786410Ut5.LJLIIL(C467340IUi.LIZJ().getRequestDelayTime(), C467340IUi.LIZIZ(), new Runnable() { // from class: X.0IUp
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1, types: [X.0IUo] */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    ILiveStatusCheckServiceV2 iLiveStatusCheckServiceV2;
                    C1C7U.LIZ("TopLiveEntrancePreDataManagerV2@84a2.startPreFetchTopLiveWebcastDataTask$1");
                    try {
                        C467340IUi.LJI();
                        if (C467340IUi.LIZJ().getEnableCheckRoomState() && (iLiveStatusCheckServiceV2 = (ILiveStatusCheckServiceV2) C467340IUi.LJIILL.getValue()) != 0) {
                            iLiveStatusCheckServiceV2.gQ2(new InterfaceC467420IUq() { // from class: X.0IUo
                                @Override // X.InterfaceC467420IUq
                                public final boolean q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
                                    FeedItem feedItem;
                                    boolean z;
                                    C0ITP c0itp;
                                    List<FeedItem> list;
                                    List<FeedItem> list2;
                                    List<FeedItem> list3;
                                    FeedItem next;
                                    String string;
                                    String strValueOf = String.valueOf(feedUserRoomMonitorMessage.anchorId);
                                    C0ITP c0itp2 = C467340IUi.LIZIZ;
                                    if (c0itp2 != null && (list3 = c0itp2.LIZ) != null) {
                                        Iterator<FeedItem> it2 = list3.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                Room room = next.getRoom();
                                                if (room != null) {
                                                    string = Long.valueOf(room.getOwnerUserId()).toString();
                                                } else {
                                                    string = null;
                                                }
                                                if (Intrinsics.LJFF(string, strValueOf)) {
                                                    break;
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        feedItem = next;
                                    } else {
                                        feedItem = null;
                                    }
                                    if (feedItem == null) {
                                        return false;
                                    }
                                    Room room2 = feedItem.getRoom();
                                    if (room2 != null && room2.getId() == feedUserRoomMonitorMessage.roomId) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ((!z || C1697810uHb.LJIIJJI(3L, 101L, 4L).contains(Long.valueOf(feedUserRoomMonitorMessage.roomStatus))) && (c0itp = C467340IUi.LIZIZ) != null && (list = c0itp.LIZ) != null) {
                                        C19719612Di.LJJIIJ(list, new AwS58S1000000_7(strValueOf, 11), true);
                                    }
                                    C0ITP c0itp3 = C467340IUi.LIZIZ;
                                    if (c0itp3 == null || (list2 = c0itp3.LIZ) == null || list2.isEmpty()) {
                                        C467340IUi.LIZIZ = null;
                                        if (C467340IUi.LJFF && TopLivePreFetchPoolSetting.INSTANCE.getValue().getRefreshOnCacheInvalid()) {
                                            C467340IUi.LIZIZ().removeCallbacksAndMessages(null);
                                            C467340IUi.LJIIIIZZ = 3;
                                            C467340IUi.LJI();
                                        }
                                    }
                                    return true;
                                }
                            }, C467340IUi.LJIILIIL);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TopLiveEntrancePreDataManagerV2@84a2.startPreFetchTopLiveWebcastDataTask$1");
                }
            });
        }
    }

    @Override // X.C0J6U
    public final void LJIIIIZZ() {
        if (this.LIZIZ) {
            this.LIZLLL = false;
            C0IV0 c0iv0 = this.LIZJ;
            if (c0iv0 != null) {
                ((C467450IUt) c0iv0).LIZLLL();
            }
        }
    }

    @Override // X.C0J6U
    public final void LIZJ(int i) {
        C0IV0 c0iv0;
        if (this.LIZLLL) {
            return;
        }
        if (i != 0) {
            if (i == 1 && (c0iv0 = this.LIZJ) != null) {
                ((C467450IUt) c0iv0).LIZLLL();
                return;
            }
            return;
        }
        C0IV0 c0iv02 = this.LIZJ;
        if (c0iv02 == null) {
            return;
        }
        ((C467450IUt) c0iv02).LIZIZ();
    }
}
