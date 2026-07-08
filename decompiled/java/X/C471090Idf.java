package X;

import android.text.TextUtils;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Idf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C471090Idf extends C2217421BqW implements Function1<C469770IbX, C0IZ7> {
    public C471090Idf(Object obj) {
        super(1, obj, C471270Idx.class, "createDataFlow", "createDataFlow(Lcom/bytedance/android/feed/api/DrawerExtraData;)Lcom/bytedance/android/livesdk/feed/drawerfeed/base/IDrawerDataFlow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0IZ7 invoke(C469770IbX c469770IbX) {
        final C469770IbX c469770IbX2 = c469770IbX;
        this.receiver.getClass();
        return new C0IZ7(c469770IbX2) { // from class: X.0IZ3
            public final C469770IbX LIZ;
            public boolean LIZIZ = true;
            public String LIZJ = "";
            public String LIZLLL = "";
            public String LJ = "";

            @Override // X.C0IZ7
            public final void release() {
            }

            @Override // X.C0IZ7
            public final String getUrl() {
                return C467890IWl.LIZ();
            }

            @Override // X.C0IZ7
            public final String LIZ() {
                return this.LJ;
            }

            @Override // X.C0IZ7
            public final String LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C0IZ7
            public final String LJI() {
                return this.LIZLLL;
            }

            {
                this.LIZ = c469770IbX2;
            }

            public final C0IZ8 LJII(long j) {
                C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
                if (C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(j), false, 2) != null) {
                    return C0IZ8.ECOM;
                }
                String str = this.LIZ.LIZ;
                if (str == null) {
                    str = "";
                }
                if (!TextUtils.isEmpty(C471340Ie4.LIZLLL(str))) {
                    return C0IZ8.FOLLOW;
                }
                if (TextUtils.equals(this.LIZ.LIZ, "foru")) {
                    return C0IZ8.FORU;
                }
                return C0IZ8.OTHER;
            }

            @Override // X.C0IZ7
            public final void LJ(List<FeedItem> list, FeedExtra feedExtra) {
                if (this.LIZIZ) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.isEmpty() || !feedExtra.hasMore) {
                        FeedItem feedItem = new FeedItem();
                        feedItem.type = 1005;
                        feedItem.setRoom(new Room());
                        arrayList.add(feedItem);
                        feedExtra.hasMore = true;
                        this.LIZIZ = false;
                    }
                }
            }

            @Override // X.C0IZ7
            public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LIZJ(long j, long j2, Map<String, String> map) {
                this.LIZIZ = true;
                int i = C0IZ9.LIZ[LJII(j).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("enter_auto_vertical_");
                            sbLIZ.append(this.LIZ.LIZ);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            C480460Ism.LIZ().getClass();
                            C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, strLIZIZ, j, map);
                            this.LIZJ = strLIZIZ;
                            return c11nzFeed;
                        }
                        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
                        String strLIZ = C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(j), false, 2);
                        C480460Ism.LIZ().getClass();
                        C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed2 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "ecom_explore_draw_refresh", strLIZ, j, map);
                        this.LIZJ = "ecom_explore_draw_refresh";
                        return c11nzFeed2;
                    }
                    C480460Ism.LIZ().getClass();
                    C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed3 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "tiktok_message_drawer_following", map);
                    this.LIZJ = "tiktok_message_drawer_following";
                    return c11nzFeed3;
                }
                C480460Ism.LIZ().getClass();
                C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed4 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "drawer_enter_from_room", j, map);
                this.LIZJ = "drawer_enter_from_room";
                return c11nzFeed4;
            }

            @Override // X.C0IZ7
            public final C11NZ<BaseListResponse<FeedItem, FeedExtra>> LJFF(long j, long j2, Map<String, String> map) {
                this.LIZIZ = true;
                int i = C0IZ9.LIZ[LJII(j).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("vertical_");
                            sbLIZ.append(this.LIZ.LIZ);
                            sbLIZ.append("_refresh");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            C480460Ism.LIZ().getClass();
                            C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, strLIZIZ, j, map);
                            this.LIZLLL = strLIZIZ;
                            return c11nzFeed;
                        }
                        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
                        String strLIZ = C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(j), false, 2);
                        C480460Ism.LIZ().getClass();
                        C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed2 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "ecom_explore_draw_loadmore", strLIZ, j, map);
                        this.LIZLLL = "ecom_explore_draw_loadmore";
                        return c11nzFeed2;
                    }
                    C480460Ism.LIZ().getClass();
                    C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed3 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "tiktok_message_drawer_following", j, map);
                    this.LIZLLL = "tiktok_message_drawer_following";
                    return c11nzFeed3;
                }
                C480460Ism.LIZ().getClass();
                C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed4 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "drawer_refresh", j, map);
                this.LIZLLL = "drawer_refresh";
                return c11nzFeed4;
            }

            @Override // X.C0IZ7
            public final C11NZ LIZLLL(Map map, long j, long j2, long j3) {
                int i = C0IZ9.LIZ[LJII(j2).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (this.LIZIZ) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("vertical_");
                                sbLIZ.append(this.LIZ.LIZ);
                                sbLIZ.append("_loadmore");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                C480460Ism.LIZ().getClass();
                                C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, strLIZIZ, j2, (Map<String, String>) map);
                                this.LJ = strLIZIZ;
                                return c11nzFeed;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("vertical_");
                            sbLIZ2.append(this.LIZ.LIZ);
                            sbLIZ2.append("_no_more");
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            C480460Ism.LIZ().getClass();
                            C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed2 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, strLIZIZ2, j2, (Map<String, String>) map);
                            this.LJ = strLIZIZ2;
                            return c11nzFeed2;
                        }
                        C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
                        String strLIZ = C468070IXd.LIZ(C0IFC.LIZ(), Long.valueOf(j2), false, 2);
                        C480460Ism.LIZ().getClass();
                        C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed3 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), 0L, "ecom_explore_draw_loadmore", strLIZ, j2, (Map<String, String>) map);
                        this.LIZLLL = "ecom_explore_draw_loadmore";
                        return c11nzFeed3;
                    }
                    if (this.LIZIZ) {
                        C480460Ism.LIZ().getClass();
                        C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed4 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, "tiktok_message_drawer_following", j2, (Map<String, String>) map);
                        this.LJ = "tiktok_message_drawer_following";
                        return c11nzFeed4;
                    }
                    C480460Ism.LIZ().getClass();
                    C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed5 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, "vertical_following_no_more", j2, (Map<String, String>) map);
                    this.LJ = "vertical_following_no_more";
                    return c11nzFeed5;
                }
                if (this.LIZIZ) {
                    C480460Ism.LIZ().getClass();
                    C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed6 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, "drawer_loadmore", j2, (Map<String, String>) map);
                    this.LJ = "drawer_loadmore";
                    return c11nzFeed6;
                }
                C480460Ism.LIZ().getClass();
                C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed7 = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(C467890IWl.LIZ(), j, "drawer_no_more", j2, (Map<String, String>) map);
                this.LJ = "drawer_no_more";
                return c11nzFeed7;
            }
        };
    }
}
