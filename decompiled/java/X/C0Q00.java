package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q00, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q00 {
    public static final C0Q00 LIZ = new C0Q00();
    public static final Gson LIZIZ = new Gson();

    public static String LJFF(List list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme = (Aweme) obj;
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(aweme.getAid());
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(Aweme aweme, C654590Plx c654590Plx, EnterRoomConfig enterRoomConfig, InterfaceC644520PPu interfaceC644520PPu) {
        C653660PkS c653660PkS;
        EnterRoomConfig.RoomsData roomsData;
        String str;
        String strLJJLIIIJ;
        boolean z;
        String alasrc;
        long jLIZ;
        if (c654590Plx != null && (c653660PkS = c654590Plx.LIZIZ) != null && c653660PkS.LJFF.length() > 0) {
            InterfaceC486120J4o interfaceC486120J4o = null;
            if (1 != 0 && enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && (str = roomsData.enterFromMerge) != null && str.length() > 0) {
                SAFHelper.LIZ.getClass();
                Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
                String str2 = c653660PkS.LJFF;
                long j = c654590Plx.LIZLLL;
                List<? extends Aweme> list = c654590Plx.LIZJ;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<? extends Aweme> it2 = list.iterator();
                    while (it2.hasNext()) {
                        User author = it2.next().getAuthor();
                        if (author != null) {
                            jLIZ = C486180J4u.LIZ(author);
                        } else {
                            jLIZ = 0;
                        }
                        arrayList.add(Long.valueOf(jLIZ));
                    }
                    interfaceC486120J4o = null;
                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = "";
                }
                String str3 = c653660PkS.LJIIIIZZ;
                String str4 = c653660PkS.LJIIJ;
                SearchCardInfo searchCardInfo = c654590Plx.LIZ;
                if (searchCardInfo != null && (alasrc = searchCardInfo.getAlasrc()) != null && alasrc.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                C644510PPt c644510PPt = new C644510PPt(str2, j, strLJJLIIIJ, str3, str4, interfaceC644520PPu, Boolean.valueOf(z), interfaceC486120J4o);
                if ((aweme != null && aweme.isAd()) || C1010120cOQ.LJJIJ(aweme)) {
                    String value = C0IJD.SEARCH_MULTI_LIVE_CARD.getValue();
                    if (aweme != null) {
                        C1019110ccv.LIZIZ.LJIILJJIL(aweme, enterRoomConfig, 0, value);
                    }
                }
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIJ(activityLJIIIIZZ, enterRoomConfig, aweme, c654590Plx.LIZJ, c644510PPt, new InterfaceC486120J4o() { // from class: X.0Q02
                    @Override // X.InterfaceC486120J4o
                    public final void LIZ(Aweme aweme2, EnterRoomConfig enterRoomConfig2) {
                    }

                    @Override // X.InterfaceC486120J4o
                    public final void LIZIZ(Object obj, EnterRoomConfig enterRoomConfig2) {
                    }

                    @Override // X.InterfaceC486120J4o
                    public final void LIZJ(Aweme aweme2, EnterRoomConfig enterRoomConfig2) {
                        if ((aweme2 instanceof Aweme) && aweme2 != null) {
                            if ((aweme2.isAd() || C1010120cOQ.LJJIJ(aweme2)) && enterRoomConfig2 != null) {
                                C1019110ccv.LIZIZ.LJIILJJIL(aweme2, enterRoomConfig2, 0, C0IJD.SEARCH_MULTI_LIVE_CARD.getValue());
                            }
                        }
                    }
                });
            }
        }
    }

    public static void LIZ(Aweme aweme, C654590Plx c654590Plx, EnterRoomConfig enterRoomConfig, String str, View view, Context context) {
        long jLIZ;
        C653660PkS c653660PkS;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String uid;
        int i;
        String str7;
        String str8;
        String str9;
        InterfaceC660150Puv interfaceC660150PuvLJIJ;
        C0Q1G clickType;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        List<Product> list;
        Product product;
        String str10;
        InterfaceC655290Pn5 interfaceC655290Pn5;
        InterfaceC480520Iss interfaceC480520IssLLJJ;
        String multiStreamData;
        C664030Q2v c664030Q2v;
        String str11;
        C664000Q2s c664000Q2s;
        String str12;
        User author = aweme.getAuthor();
        if (author != null) {
            jLIZ = C486180J4u.LIZ(author);
        } else {
            jLIZ = 0;
        }
        String multiStreamData2 = null;
        if (c654590Plx != null) {
            c653660PkS = c654590Plx.LIZIZ;
        } else {
            c653660PkS = null;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (c653660PkS != null) {
            str2 = c653660PkS.LJIIJ;
        } else {
            str2 = null;
        }
        logData.search_id = str2;
        if (c653660PkS != null) {
            str3 = c653660PkS.LJFF;
        } else {
            str3 = null;
        }
        logData.search_keyword = str3;
        if (c653660PkS != null) {
            str4 = c653660PkS.LIZLLL;
        } else {
            str4 = null;
        }
        logData.search_type = str4;
        if (c653660PkS != null) {
            str5 = c653660PkS.LJIJI;
        } else {
            str5 = null;
        }
        logData.search_result_id = str5;
        if (c653660PkS != null) {
            str6 = c653660PkS.LJIIJ;
        } else {
            str6 = null;
        }
        logData.requestId = str6;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        roomsData.userId = uid;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (author != null && author.isAccuratePrivateAccount()) {
            i = 1;
        } else {
            i = 0;
        }
        roomsData2.isSecret = i;
        enterRoomConfig.mLogData.list_item_id = String.valueOf(jLIZ);
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        roomsData3.enterMethod = "live_cell";
        if (c653660PkS != null) {
            str7 = c653660PkS.LJIIIIZZ;
        } else {
            str7 = null;
        }
        roomsData3.enterFromMerge = str7;
        C651980Phk c651980Phk = C651970Phj.LLILLL;
        ArrayMap arrayMap = new ArrayMap();
        if (C123100dR.LIZ(enterRoomConfig.mLogData.search_id)) {
            arrayMap.put("search_id", enterRoomConfig.mLogData.search_id);
        }
        if (C123100dR.LIZ(enterRoomConfig.mLogData.search_result_id)) {
            arrayMap.put("search_result_id", enterRoomConfig.mLogData.search_result_id);
        }
        C646000PVm c646000PVm = C650950Pg5.Companion;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        if (c650960Pg6LIZJ != null && (c664000Q2s = c650960Pg6LIZJ.searchCommonModel) != null && (str12 = c664000Q2s.enterFrom) != null) {
            arrayMap.put("search_entrance", str12);
        }
        arrayMap.put("list_item_id", enterRoomConfig.mLogData.list_item_id);
        if (c653660PkS != null) {
            str8 = c653660PkS.LIZLLL;
        } else {
            str8 = null;
        }
        String str13 = "";
        if (str8 == null) {
            str8 = "";
        }
        arrayMap.put("search_type", str8);
        arrayMap.put("is_search_scene", "1");
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(view);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragmentLIZLLL, c19egLIZIZ);
        if (c650960Pg6LJII != null && (c664030Q2v = c650960Pg6LJII.searchVideoModel) != null && (str11 = c664030Q2v.groupId) != null) {
            str13 = str11;
        }
        arrayMap.put("last_from_group_id", str13);
        if (c653660PkS != null) {
            str9 = c653660PkS.LJFF;
        } else {
            str9 = null;
        }
        arrayMap.put("search_keyword", str9);
        c651980Phk.getClass();
        C651980Phk.LJFF(arrayMap, false);
        if (aweme.isAd() || C1010120cOQ.LJJIJ(aweme)) {
            C1019100ccu.LIZ(aweme, enterRoomConfig, 0);
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null) {
                interfaceC660150PuvLJIJ = interfaceC657510PqfLIZLLL.LJIJ(aweme);
            } else {
                interfaceC660150PuvLJIJ = null;
            }
            if ((interfaceC660150PuvLJIJ instanceof InterfaceC655290Pn5) && (interfaceC655290Pn5 = (InterfaceC655290Pn5) interfaceC660150PuvLJIJ) != null) {
                clickType = interfaceC655290Pn5.getClickType();
            } else {
                clickType = null;
            }
            if (clickType == C0Q1G.PRODUCT_ANCHOR && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (list = searchAdInfo.productsInfo) != null && (product = (Product) C13LP.LJJJLL(list)) != null && (str10 = product.schema) != null) {
                enterRoomConfig.mRoomsData.extraSchema = str10;
            }
        }
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
        C487710JAr.LIZ.getClass();
        roomsData4.followStatus = String.valueOf(C487710JAr.LIZIZ(author));
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt == null) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null) {
                newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData();
            } else {
                newLiveRoomDataExt = null;
            }
        }
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K4 != null && (interfaceC480520IssLLJJ = interfaceC20673515v3K4.LLJJ(str, true)) != null && !TextUtils.isEmpty(interfaceC480520IssLLJJ.LJJIZ())) {
            String strLJJIZ = interfaceC480520IssLLJJ.LJJIZ();
            if (newLiveRoomDataExt != null) {
                multiStreamData = newLiveRoomDataExt.getMultiStreamData();
            } else {
                multiStreamData = null;
            }
            if (Intrinsics.LJFF(strLJJIZ, multiStreamData) && interfaceC480520IssLLJJ.isPlaying()) {
                interfaceC480520IssLLJJ.LJJJJI(false);
                EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
                if (newLiveRoomDataExt != null) {
                    multiStreamData2 = newLiveRoomDataExt.getMultiStreamData();
                }
                streamData.sharePullStreamData = multiStreamData2;
                enterRoomConfig.mRoomsData.warmUpPlayerTag = str;
            }
        }
    }

    public static void LIZIZ(final long j, final Context context, final EnterRoomConfig enterRoomConfig, String str, final ArrayList arrayList, final List list) {
        if (C1ER1.LIZIZ.LJJJLL(str)) {
            C651980Phk c651980Phk = C651970Phj.LLILLL;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("is_search_scene", "1"));
            c651980Phk.getClass();
            C651980Phk.LJFF(mapLIZJ, true);
        }
        SAFHelper.LIZ.getClass();
        Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && activityLJIIIIZZ != null) {
            ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZ = activityLJIIIIZZ;
            c0xqs.LJ = new C0XTR() { // from class: X.0Q01
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                    if (i == 1 && i2 == 1) {
                        C0Q00 c0q00 = C0Q00.LIZ;
                        Context contextN3 = C786410Ut5.N3(context);
                        long j2 = j;
                        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
                        ArrayList<Long> arrayList2 = arrayList;
                        List<RoomInfo> list2 = list;
                        c0q00.getClass();
                        C0Q00.LJI(j2, contextN3, enterRoomConfig2, "from_search_live", arrayList2, list2);
                    }
                }
            };
            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
        }
        LJI(j, context, enterRoomConfig, str, arrayList, list);
    }

    public static void LJI(long j, Context context, EnterRoomConfig enterRoomConfig, String str, ArrayList arrayList, List list) {
        Context contextN3;
        C0J5O c0j5oZ5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5();
        String json = null;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        if (list != null) {
            try {
                json = GsonProtectorUtils.toJson(LIZIZ, list);
            } catch (o e) {
                TryCatchGuardChecker.doCheck(e);
                json = "";
            }
        }
        c0j5oZ5.LJIIL(contextN3, j, enterRoomConfig, str, arrayList, json);
    }

    public static void LIZJ(Aweme aweme, C654590Plx c654590Plx, InterfaceC644520PPu interfaceC644520PPu, EnterRoomConfig enterRoomConfig, String str, View view, Context context) {
        LIZ(aweme, c654590Plx, enterRoomConfig, str, view, context);
        LJ(aweme, c654590Plx, enterRoomConfig, interfaceC644520PPu);
    }

    public static void LIZLLL(LiveRoomStruct liveRoomStruct, List list, EnterRoomConfig enterRoomConfig, long j, Boolean bool, InterfaceC644520PPu interfaceC644520PPu, InterfaceC486120J4o interfaceC486120J4o) {
        EnterRoomConfig.LogData logData;
        String str;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        if (enterRoomConfig != null && (logData = enterRoomConfig.mLogData) != null && (str = logData.search_keyword) != null && str.length() > 0) {
            Long lValueOf6 = null;
            if (1 != 0) {
                interfaceC486120J4o.LIZIZ(liveRoomStruct, enterRoomConfig);
                SAFHelper.LIZ.getClass();
                Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
                if (list != null) {
                    liveRoomStruct2 = (LiveRoomStruct) ListProtector.get(list, 0);
                    liveRoomStruct3 = (LiveRoomStruct) ListProtector.get(list, list.size() - 1);
                } else {
                    liveRoomStruct2 = null;
                    liveRoomStruct3 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Start (aid: ");
                if (liveRoomStruct != null) {
                    lValueOf = Long.valueOf(liveRoomStruct.id);
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(", author: ");
                if (liveRoomStruct != null) {
                    lValueOf2 = Long.valueOf(liveRoomStruct.getAnchorId());
                } else {
                    lValueOf2 = null;
                }
                sbLIZ.append(lValueOf2);
                sbLIZ.append("), \nstart: (");
                if (liveRoomStruct2 != null) {
                    lValueOf3 = Long.valueOf(liveRoomStruct2.id);
                } else {
                    lValueOf3 = null;
                }
                sbLIZ.append(lValueOf3);
                sbLIZ.append(", ");
                if (liveRoomStruct2 != null) {
                    lValueOf4 = Long.valueOf(liveRoomStruct2.getAnchorId());
                } else {
                    lValueOf4 = null;
                }
                sbLIZ.append(lValueOf4);
                sbLIZ.append("), \nend: (");
                if (liveRoomStruct3 != null) {
                    lValueOf5 = Long.valueOf(liveRoomStruct3.id);
                } else {
                    lValueOf5 = null;
                }
                sbLIZ.append(lValueOf5);
                sbLIZ.append(", ");
                if (liveRoomStruct3 != null) {
                    lValueOf6 = Long.valueOf(liveRoomStruct3.getAnchorId());
                }
                sbLIZ.append(lValueOf6);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
                String str2 = logData2.search_keyword;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = logData2.enterLiveModule;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = logData2.search_id;
                if (str5 != null) {
                    str3 = str5;
                }
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIJJI(activityLJIIIIZZ, enterRoomConfig, liveRoomStruct, list, new C644510PPt(str2, j, "", str4, str3, interfaceC644520PPu, bool, interfaceC486120J4o), interfaceC486120J4o);
            }
        }
    }
}
