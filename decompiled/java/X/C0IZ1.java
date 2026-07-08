package X;

import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import android.util.Pair;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0IZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IZ1 implements C0IZH<FeedItem> {
    public final String LIZ;
    public final FeedApi LIZIZ;
    public String LIZJ;
    public String LIZLLL = "feed_loadmore";
    public boolean LJ = true;
    public final InterfaceC470690Id1 LJFF;
    public final C11RK<String> LJI;
    public final C11RK<String> LJII;
    public final C0IZD LJIIIIZZ;
    public final String LJIIIZ;
    public final C11RK<List<ImageModel>> LJIIJ;
    public final C11NJ LJIIJJI;

    @Override // X.C0IZH
    public final C11JN LIZ(Long l, final boolean z) {
        final String str;
        long j;
        String str2;
        C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzDrawerDropsFeed;
        final String str3;
        this.LJIIJJI.LIZ(C11NZ.LJJJJZ(1).LJJI(3000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 230), new AfS132S0000000_7(26)));
        C0INV c0inv = C0IL2.LIZ;
        long j2 = c0inv.LIZ().mEnterRoomConfig.mRoomsData.roomId;
        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
        C468070IXd c468070IXdLIZ = C0IFC.LIZ();
        Long lValueOf = Long.valueOf(j2);
        c468070IXdLIZ.getClass();
        String strLIZ = C468070IXd.LIZ(c468070IXdLIZ, lValueOf, false, 2);
        C468070IXd c468070IXdLIZ2 = C0IFC.LIZ();
        if (c468070IXdLIZ2.LIZLLL) {
            c468070IXdLIZ2.LIZLLL = false;
            str = "ecom_explore_draw_refresh";
        } else {
            str = "ecom_explore_draw_loadmore";
        }
        String str4 = c0inv.LIZ().mEnterRoomConfig.mRoomsData.userId;
        if (str4 != null && !str4.isEmpty()) {
            j = CastLongProtector.parseLong(str4);
        } else {
            j = 0;
        }
        HashMap map = new HashMap();
        if (C469460Ib2.LIZJ()) {
            map.put("is_non_personalized", "1");
        }
        String str5 = C467800IWc.LJIJ.LJIIIZ;
        String str6 = "tiktok_live_game_drawer";
        if (z) {
            ((FeedRepository) this.LJIIIIZZ).LIZIZ(C0IZC.REFRESH);
            str5.getClass();
            if (!str5.equals("game_drawer_drops")) {
                if (!str5.equals("game_drawer")) {
                    if (strLIZ != null) {
                        c11nzDrawerDropsFeed = this.LIZIZ.feed(this.LIZ, 0L, str, strLIZ, j2, map);
                    } else {
                        if ("tiktok_message_drawer_following".equals(this.LIZJ)) {
                            c11nzDrawerDropsFeed = this.LIZIZ.feed(this.LIZ, 0L, this.LIZJ, map);
                        } else {
                            c11nzDrawerDropsFeed = this.LIZIZ.feed(this.LIZ, 0L, this.LIZJ, j2, map);
                        }
                        str = this.LIZJ;
                    }
                } else {
                    c11nzDrawerDropsFeed = this.LIZIZ.feed(this.LIZ, 0L, "tiktok_live_game_drawer", j, j2, map);
                    str = "tiktok_live_game_drawer";
                }
            } else {
                c11nzDrawerDropsFeed = this.LIZIZ.drawerDropsFeed(this.LIZ, 0L, "tikcast_game_drawer_same_title_drops_refresh", "1111003", j2, j, map);
                this.LJ = true;
                str = "tikcast_game_drawer_same_title_drops_refresh";
            }
            this.LJI.onNext(this.LIZJ);
            str3 = "click";
        } else {
            ((FeedRepository) this.LJIIIIZZ).LIZIZ(C0IZC.LOAD_MORE);
            str5.getClass();
            if (!str5.equals("game_drawer_drops")) {
                if (!str5.equals("game_drawer")) {
                    if (strLIZ != null) {
                        c11nzDrawerDropsFeed = this.LIZIZ.feed(this.LIZ, 0L, str, strLIZ, j2, map);
                    } else {
                        c11nzDrawerDropsFeed = this.LIZIZ.feed(this.LIZ, l.longValue(), this.LIZLLL, j2, map);
                        str = this.LIZLLL;
                    }
                    this.LJI.onNext(this.LIZLLL);
                    this.LJII.onNext(this.LIZLLL);
                    str3 = "draw";
                } else {
                    c11nzDrawerDropsFeed = this.LIZIZ.feed(this.LIZ, 0L, "tiktok_live_game_drawer", j, j2, map);
                }
            } else {
                String str7 = this.LIZLLL;
                str6 = "tikcast_game_drawer_same_title_drops_loadmore";
                if (str7.endsWith("_loadmore") || !str7.endsWith("_no_more")) {
                    str2 = "tikcast_game_drawer_same_title_drops_loadmore";
                } else if (this.LJ) {
                    this.LJ = false;
                    str2 = "tikcast_game_drawer_other_title_drops_refresh";
                } else {
                    str2 = "tikcast_game_drawer_other_title_drops_loadmore";
                }
                c11nzDrawerDropsFeed = this.LIZIZ.drawerDropsFeed(this.LIZ, 0L, str2, "1111003", j2, j, map);
            }
            str = str6;
            this.LJI.onNext(this.LIZLLL);
            this.LJII.onNext(this.LIZLLL);
            str3 = "draw";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_request_start");
        c474500IjALIZ.LJJII(str, "req_from");
        c474500IjALIZ.LJJII(this.LJIIIZ, "tab_type");
        c474500IjALIZ.LJJII(str3, "enter_type");
        c474500IjALIZ.LIZ();
        return c11nzDrawerDropsFeed.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0IZ0
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0IZC c0izc;
                String str8;
                int i;
                C0IZ1 c0iz1 = this.LL;
                boolean z2 = z;
                String str9 = str3;
                String str10 = str;
                BaseListResponse baseListResponse = (BaseListResponse) obj;
                c0iz1.getClass();
                C467820IWe.LJI();
                ArrayList<FeedItem> arrayList = new ArrayList(baseListResponse.data);
                FeedExtra feedExtra = (FeedExtra) baseListResponse.extra;
                if (!C0IKQ.LIZ(arrayList)) {
                    for (FeedItem feedItem : arrayList) {
                        if (feedItem != null) {
                            if (feedExtra != null && ((i = feedItem.type) == 1 || i == 2 || i == 19)) {
                                Room room = (Room) feedItem.item;
                                if (feedExtra.getLogPb() != null) {
                                    room.setLog_pb(feedExtra.getLogPb().toString());
                                    if (room.getOwner() != null) {
                                        room.getOwner().setLogPb(feedExtra.getLogPb().toString());
                                    }
                                }
                                room.setRequestId(feedItem.resId);
                            }
                            if (feedItem.type == 1) {
                                InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
                                if (interfaceC468260IXw instanceof Room) {
                                    ((Room) interfaceC468260IXw).isFromRecommendCard = feedItem.isRecommendCard;
                                }
                            }
                            InterfaceC468260IXw interfaceC468260IXw2 = feedItem.item;
                            if (interfaceC468260IXw2 != null && feedExtra != null) {
                                C467800IWc c467800IWc = C467800IWc.LJIJ;
                                long id = interfaceC468260IXw2.getId();
                                String str11 = feedExtra.unreadExtra;
                                Long lValueOf2 = Long.valueOf(id);
                                Map<Long, String> map2 = c467800IWc.LIZJ;
                                if (str11 == null) {
                                    str11 = "";
                                }
                                map2.put(lValueOf2, str11);
                            }
                        }
                    }
                }
                c0iz1.LJFF.LIZ(c0iz1.LIZ, arrayList, feedExtra, z2);
                if (!C467800IWc.LJIJ.LJI()) {
                    if (c0iz1.LIZLLL.startsWith("vertical_")) {
                        if (c0iz1.LIZLLL.endsWith("_no_more") && z2) {
                            c0iz1.LIZLLL = c0iz1.LIZLLL.replace("_no_more", "_loadmore");
                        }
                        if (c0iz1.LIZLLL.endsWith("_loadmore") && (!feedExtra.hasMore || arrayList.isEmpty())) {
                            FeedItem feedItem2 = new FeedItem();
                            feedItem2.type = 1005;
                            feedItem2.setRoom(new Room());
                            arrayList.add(feedItem2);
                            feedExtra.hasMore = true;
                            c0iz1.LIZLLL = c0iz1.LIZLLL.replace("_loadmore", "_no_more");
                        }
                    } else if ("tiktok_message_drawer_following".equals(c0iz1.LIZLLL) && (!feedExtra.hasMore || arrayList.isEmpty())) {
                        FeedItem feedItem3 = new FeedItem();
                        feedItem3.type = 1005;
                        feedItem3.setRoom(new Room());
                        arrayList.add(feedItem3);
                        feedExtra.hasMore = true;
                        c0iz1.LIZLLL = "vertical_following_no_more";
                    } else if ("tikcast_taxonomy_drawer_feed_loadmore".equals(c0iz1.LIZLLL) && (!feedExtra.hasMore || arrayList.isEmpty())) {
                        FeedItem feedItem4 = new FeedItem();
                        feedItem4.type = 1005;
                        feedItem4.setRoom(new Room());
                        arrayList.add(feedItem4);
                        feedExtra.hasMore = true;
                        c0iz1.LIZLLL = "vertical_base_no_more";
                    }
                }
                C0IZD c0izd = c0iz1.LJIIIIZZ;
                if (z2) {
                    c0izc = C0IZC.REFRESH;
                    str8 = c0iz1.LIZJ;
                } else {
                    c0izc = C0IZC.LOAD_MORE;
                    str8 = c0iz1.LIZLLL;
                }
                ((FeedRepository) c0izd).LIZJ(c0izc, str8, c0iz1.LJIIIZ);
                return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, str9, str10);
            }
        }).LJJIJIIJIL(new AfS176S0100000_7(this, 231)).LJJIJIIJIL(new AfS176S0100000_7(this, 232)).LJJIJIIJIL(new AfS132S0000000_7(36)).LJJIJIIJIL(new AfS176S0100000_7(this, 233)).LJJIJIIJI(new C09JN() { // from class: X.0IZ4
            @Override // X.C09JN
            public final void accept(Object obj) {
                C0IZC c0izc;
                C0IZ1 c0iz1 = this.LL;
                String str8 = str;
                String str9 = str3;
                boolean z2 = z;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    c0iz1.getClass();
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_explore_request_fail");
                    c474500IjALIZ2.LJJII(str8, "req_from");
                    c474500IjALIZ2.LJJII(c0iz1.LJIIIZ, "tab_type");
                    c474500IjALIZ2.LJJII(str9, "enter_type");
                    c474500IjALIZ2.LJJII(th.toString(), "error_msg");
                    c474500IjALIZ2.LIZ();
                }
                C0IZD c0izd = c0iz1.LJIIIIZZ;
                if (z2) {
                    c0izc = C0IZC.REFRESH;
                } else {
                    c0izc = C0IZC.LOAD_MORE;
                }
                ((FeedRepository) c0izd).LIZ(c0izc, th);
            }
        });
    }

    public C0IZ1(String str, FeedApi feedApi, InterfaceC470690Id1 interfaceC470690Id1, C11RK<Pair<String, String>> c11rk, C0IZD c0izd, C11RK<String> c11rk2, C11RK<String> c11rk3, String str2, C11RK<List<ImageModel>> c11rk4, String str3) {
        C11NJ c11nj = new C11NJ();
        this.LJIIJJI = c11nj;
        this.LIZ = str;
        this.LIZIZ = feedApi;
        this.LJFF = interfaceC470690Id1;
        this.LJI = c11rk2;
        this.LJIIIIZZ = c0izd;
        this.LJII = c11rk3;
        this.LIZJ = str2;
        this.LJIIIZ = str3;
        c11nj.LIZ(c11rk.LJJLL(new AfS176S0100000_7(this, 229), new AfS132S0000000_7(35)));
        this.LJIIJ = c11rk4;
    }
}
