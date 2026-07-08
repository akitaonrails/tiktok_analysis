package X;

import Y.AfS176S0100000_7;
import android.util.Pair;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0IZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZ6 implements C0IZH<FeedItem> {
    public final C469770IbX LIZ;
    public final InterfaceC470690Id1 LIZIZ;
    public final C0IZD LIZJ;
    public final C11RK<List<ImageModel>> LIZLLL;
    public final C0IZ7 LJ;
    public C0IZB LJFF = C0IZB.FIRST_ENTER;
    public boolean LJI;
    public final C11NJ LJII;

    public final String LIZIZ() {
        int i = C0IZA.LIZ[this.LJFF.ordinal()];
        if (i == 1) {
            return this.LJ.LIZIZ();
        }
        if (i == 2) {
            return this.LJ.LJI();
        }
        if (i == 3) {
            return this.LJ.LIZ();
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0IZH
    public final C11JN LIZ(Long l, final boolean z) {
        long j;
        String str;
        long jLIZIZ;
        C0IZB c0izb;
        final String str2;
        C11NZ c11nzLIZJ;
        C0IZC c0izc;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig enterRoomConfig2;
        EnterRoomConfig.RoomsData roomsData2;
        this.LJII.LIZ(C11NZ.LJJJJZ(1).LJJI(3000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 270), new C09JN() { // from class: X.00qO
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PagingLoadCallbackImpl@669e.createObservable$disposable$2");
                C20441214yg.LJI("PagingLoadCallbackImpl", (Throwable) obj);
                C1C7U.LIZIZ("PagingLoadCallbackImpl@669e.createObservable$disposable$2");
            }
        }));
        C0INV c0inv = C0IL2.LIZ;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = c0inv.LIZ();
        long jLongValue = 0;
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig2 = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData2 = enterRoomConfig2.mRoomsData) != null) {
            j = roomsData2.roomId;
        } else {
            j = 0;
        }
        EnterRoomLinkSession enterRoomLinkSessionLIZ2 = c0inv.LIZ();
        if (enterRoomLinkSessionLIZ2 == null || (enterRoomConfig = enterRoomLinkSessionLIZ2.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null || (str = roomsData.userId) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (str.length() > 0) {
            jLIZIZ = C0IZJ.LIZIZ(str);
        } else {
            jLIZIZ = 0;
        }
        HashMap map = new HashMap();
        if (C469460Ib2.LIZJ()) {
            map.put("is_non_personalized", "1");
        }
        if (z) {
            if (this.LJI) {
                c0izb = C0IZB.REFRESH;
            } else {
                c0izb = C0IZB.FIRST_ENTER;
            }
        } else {
            c0izb = C0IZB.LOAD_MORE;
        }
        this.LJFF = c0izb;
        C0IZD c0izd = this.LIZJ;
        if (c0izd != null) {
            if (z) {
                c0izc = C0IZC.REFRESH;
            } else {
                c0izc = C0IZC.LOAD_MORE;
            }
            LIZIZ();
            ((FeedRepository) c0izd).LIZIZ(c0izc);
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        if (z) {
            str2 = "click";
        } else {
            str2 = "draw";
        }
        int i = C0IZA.LIZ[this.LJFF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c259800zU.element = this.LJ.LIZ();
                    C0IZ7 c0iz7 = this.LJ;
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    c11nzLIZJ = c0iz7.LIZLLL(map, jLongValue, j, jLIZIZ);
                } else {
                    throw new C1954807lC();
                }
            } else {
                c259800zU.element = this.LJ.LJI();
                c11nzLIZJ = this.LJ.LJFF(j, jLIZIZ, map);
            }
        } else {
            c259800zU.element = this.LJ.LIZIZ();
            c11nzLIZJ = this.LJ.LIZJ(j, jLIZIZ, map);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_request_start");
        c474500IjALIZ.LJJII(c259800zU.element, "req_from");
        c474500IjALIZ.LJJII(this.LIZ.LIZ, "tab_type");
        c474500IjALIZ.LJJII(str2, "enter_type");
        c474500IjALIZ.LIZ();
        return c11nzLIZJ.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0IZ2
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0IZC c0izc2;
                int i2;
                BaseListResponse baseListResponse = (BaseListResponse) obj;
                C467820IWe.LJI();
                ArrayList<FeedItem> arrayList = new ArrayList(baseListResponse.data);
                FeedExtra feedExtra = (FeedExtra) baseListResponse.extra;
                if (!C0IKQ.LIZ(arrayList)) {
                    for (FeedItem feedItem : arrayList) {
                        this.LL.getClass();
                        if (feedItem != null) {
                            if (feedExtra != null && ((i2 = feedItem.type) == 1 || i2 == 2)) {
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
                        }
                        this.LL.getClass();
                        if (feedItem != null && feedItem.item != null && feedExtra != null) {
                            C467800IWc c467800IWc = C467800IWc.LJIJ;
                            long id = feedItem.item.getId();
                            String str3 = feedExtra.unreadExtra;
                            Long lValueOf = Long.valueOf(id);
                            Map<Long, String> map2 = c467800IWc.LIZJ;
                            if (str3 == null) {
                                str3 = "";
                            }
                            map2.put(lValueOf, str3);
                        }
                    }
                }
                C0IZ6 c0iz6 = this.LL;
                InterfaceC470690Id1 interfaceC470690Id1 = c0iz6.LIZIZ;
                if (interfaceC470690Id1 != null) {
                    interfaceC470690Id1.LIZ(c0iz6.LJ.getUrl(), arrayList, feedExtra, z);
                }
                this.LL.LJ.LJ(arrayList, feedExtra);
                C0IZ6 c0iz62 = this.LL;
                C0IZD c0izd2 = c0iz62.LIZJ;
                if (c0izd2 != null) {
                    if (z) {
                        c0izc2 = C0IZC.REFRESH;
                    } else {
                        c0izc2 = C0IZC.LOAD_MORE;
                    }
                    ((FeedRepository) c0izd2).LIZJ(c0izc2, c0iz62.LIZIZ(), this.LL.LIZ.LIZ);
                }
                return new C0ITM(Pair.create(arrayList, baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, str2, this.LL.LIZIZ());
            }
        }).LJJIJIIJIL(new AfS176S0100000_7(this, 268)).LJJIJIIJIL(new C09JN() { // from class: X.0ISG
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PagingLoadCallbackImpl@669e.createObservable$3");
                Pair pair = (Pair) ((C0ITM) obj).LIZ;
                if (!C0IKQ.LIZ((List) pair.first)) {
                    for (FeedItem feedItem : (List) pair.first) {
                        if (((FeedExtra) pair.second).getLogPb() != null) {
                            feedItem.logPb = ((FeedExtra) pair.second).getLogPb().toString();
                        }
                    }
                }
                C1C7U.LIZIZ("PagingLoadCallbackImpl@669e.createObservable$3");
            }
        }).LJJIJIIJIL(new AfS176S0100000_7(this, 269)).LJJIJIIJI(new C09JN() { // from class: X.0IZ5
            @Override // X.C09JN
            public final void accept(Object obj) {
                C0IZC c0izc2;
                C1C7U.LIZ("PagingLoadCallbackImpl@669e.createObservable$5");
                Throwable th = (Throwable) obj;
                if (th != null) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_explore_request_fail");
                    c474500IjALIZ2.LJJII(c259800zU.element, "req_from");
                    c474500IjALIZ2.LJJII(this.LIZ.LIZ, "tab_type");
                    c474500IjALIZ2.LJJII(str2, "enter_type");
                    c474500IjALIZ2.LJJII(th.toString(), "error_msg");
                    c474500IjALIZ2.LIZ();
                }
                C0IZ6 c0iz6 = this;
                C0IZD c0izd2 = c0iz6.LIZJ;
                if (c0izd2 != null) {
                    if (z) {
                        c0izc2 = C0IZC.REFRESH;
                    } else {
                        c0izc2 = C0IZC.LOAD_MORE;
                    }
                    c0iz6.LIZIZ();
                    ((FeedRepository) c0izd2).LIZ(c0izc2, th);
                }
                C1C7U.LIZIZ("PagingLoadCallbackImpl@669e.createObservable$5");
            }
        });
    }

    public C0IZ6(C469770IbX c469770IbX, InterfaceC470690Id1 interfaceC470690Id1, C0IZD c0izd, C11RK<List<ImageModel>> c11rk, C11RK<Pair<String, String>> c11rk2, C0IZ7 c0iz7) {
        InterfaceC420801kM interfaceC420801kMLJJLJLI;
        this.LIZ = c469770IbX;
        this.LIZIZ = interfaceC470690Id1;
        this.LIZJ = c0izd;
        this.LIZLLL = c11rk;
        this.LJ = c0iz7;
        C11NJ c11nj = new C11NJ();
        this.LJII = c11nj;
        if (c11rk2 != null && (interfaceC420801kMLJJLJLI = c11rk2.LJJLJLI(new AfS176S0100000_7(this, 267))) != null) {
            c11nj.LIZ(interfaceC420801kMLJJLJLI);
        }
    }
}
