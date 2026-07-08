package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C654660Pm4 implements ISearchResultStatistics {
    public static final C654660Pm4 LIZ = new C654660Pm4();

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZ(C654670Pm5 c654670Pm5) {
        String str;
        String authorUid;
        String aid;
        int iLJ;
        String str2;
        int duration;
        Video video;
        C664030Q2v c664030Q2v;
        String strLIZIZ = C653440Pk6.LIZIZ();
        C650950Pg5.Companion.getClass();
        C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
        String aid2 = null;
        if (c0prwLIZIZ != null) {
            str = c0prwLIZIZ.searchId;
        } else {
            str = null;
        }
        C654680Pm6 c654680Pm6 = new C654680Pm6(c654670Pm5.LIZ);
        c654680Pm6.LJIJJ(c654670Pm5.LIZJ);
        Aweme aweme = c654670Pm5.LIZIZ;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c654680Pm6.LJIIZILJ("author_id", authorUid);
        Aweme aweme2 = c654670Pm5.LIZIZ;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c654680Pm6.LJIIZILJ("group_id", aid);
        c654680Pm6.LJIIZILJ("log_pb", C584850Mwl.LIZ.LIZIZ(strLIZIZ));
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        if (interfaceC649890PeNLIZ != null) {
            iLJ = interfaceC649890PeNLIZ.LJ();
        } else {
            iLJ = 0;
        }
        c654680Pm6.LJIIZILJ("search_type", C0PSI.LIZ(iLJ));
        c654680Pm6.LJIJI("search_result_id", C653440Pk6.LJ);
        c654680Pm6.LJIIZILJ("impr_id", strLIZIZ);
        c654680Pm6.LJJIIZ(Integer.valueOf(C653440Pk6.LJI));
        c654680Pm6.LJIIZILJ("impr_id", str);
        c654680Pm6.LJIIZILJ("search_id", str);
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        if (c650960Pg6LIZJ != null && (c664030Q2v = c650960Pg6LIZJ.searchVideoModel) != null) {
            str2 = c664030Q2v.groupId;
        } else {
            str2 = null;
        }
        c654680Pm6.LJIIZILJ("last_from_group_id", str2);
        c654680Pm6.LIZIZ(C666580QCq.LIZIZ(c654670Pm5.LIZIZ, c654670Pm5.LIZ, c654670Pm5.LIZJ, null));
        long j = c654670Pm5.LIZLLL;
        if (j >= 0) {
            c654680Pm6.LJ("duration", String.valueOf(j));
            Aweme aweme3 = c654670Pm5.LIZIZ;
            if (aweme3 != null && (video = aweme3.getVideo()) != null) {
                duration = video.getDuration();
                if (duration >= 0) {
                }
            } else {
                duration = 0;
            }
            c654680Pm6.LJ("percentage", String.valueOf((c654670Pm5.LIZLLL * 1.0d) / ((double) duration)));
        }
        if (!TextUtils.isEmpty(c654670Pm5.LJ)) {
            c654680Pm6.LJ("previous_page", c654670Pm5.LJ);
        }
        Map<String, String> map = C653440Pk6.LJII;
        if (map != null) {
            c654680Pm6.LJIJ(map);
        }
        if (!TextUtils.isEmpty(c654670Pm5.LJFF)) {
            c654680Pm6.LJ("previous_page_position", c654670Pm5.LJFF);
        }
        String str3 = "";
        if (Intrinsics.LJFF(c654670Pm5.LIZJ, "playlist")) {
            C651980Phk c651980Phk = C651970Phj.LLILLL;
            String str4 = c654670Pm5.LJ;
            if (str4 == null) {
                str4 = "";
            }
            c651980Phk.getClass();
            Map mapLIZIZ = C651980Phk.LIZIZ(str4);
            String str5 = (String) mapLIZIZ.get("is_from_video");
            if (str5 != null) {
                str3 = str5;
            }
            String aid3 = (String) mapLIZIZ.get("list_item_id");
            if (aid3 == null) {
                Aweme aweme4 = c654670Pm5.LIZIZ;
                if (aweme4 != null) {
                    aid3 = aweme4.getAid();
                } else {
                    aid3 = null;
                }
            }
            if (Intrinsics.LJFF(str3, CardStruct.IStatusCode.DEFAULT) || Intrinsics.LJFF(str3, "2")) {
                Aweme aweme5 = c654670Pm5.LIZIZ;
                if (aweme5 != null) {
                    aid2 = aweme5.getAid();
                }
                c654680Pm6.LJ("search_third_item_id", aid2);
            }
            c654680Pm6.LJ("is_from_video", str3);
            c654680Pm6.LJ("list_item_id", aid3);
            c654680Pm6.LJJIIZ(Integer.valueOf((int) c654670Pm5.LJI));
            c654680Pm6.LJIJI("search_result_id", (String) mapLIZIZ.get("search_result_id"));
        } else if (Intrinsics.LJFF(c654670Pm5.LIZJ, "single_song")) {
            C651980Phk c651980Phk2 = C651970Phj.LLILLL;
            String str6 = c654670Pm5.LJ;
            if (str6 != null) {
                str3 = str6;
            }
            c651980Phk2.getClass();
            String str7 = (String) C651980Phk.LIZIZ(str3).get("list_item_id");
            if (str7 == null) {
                Aweme aweme6 = c654670Pm5.LIZIZ;
                if (aweme6 != null) {
                    aid2 = aweme6.getAid();
                }
            } else {
                aid2 = str7;
            }
            c654680Pm6.LJ("list_item_id", aid2);
        } else if (Intrinsics.LJFF(c654670Pm5.LIZJ, "challenge")) {
            C651980Phk c651980Phk3 = C651970Phj.LLILLL;
            String str8 = c654670Pm5.LJ;
            if (str8 != null) {
                str3 = str8;
            }
            c651980Phk3.getClass();
            String str9 = (String) C651980Phk.LIZIZ(str3).get("list_item_id");
            if (str9 == null) {
                Aweme aweme7 = c654670Pm5.LIZIZ;
                if (aweme7 != null) {
                    aid2 = aweme7.getAid();
                }
            } else {
                aid2 = str9;
            }
            c654680Pm6.LJ("list_item_id", aid2);
        } else {
            C0PRW c0prwLIZIZ2 = C646000PVm.LIZIZ();
            if (c0prwLIZIZ2 != null) {
                aid2 = c0prwLIZIZ2.searchKeyword;
            }
            c654680Pm6.LJIIZILJ("search_keyword", aid2);
        }
        Map<String, String> mapFetchSearchParams = C1ER1.LIZIZ.fetchSearchParams(c654670Pm5.LIZJ, c654670Pm5.LJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapFetchSearchParams.entrySet()) {
            String key = entry.getKey();
            if (Intrinsics.LJFF(key, "search_id") || Intrinsics.LJFF(key, "search_result_id") || Intrinsics.LJFF(key, "search_keyword") || Intrinsics.LJFF(key, "rank") || Intrinsics.LJFF(key, "is_search_scene") || Intrinsics.LJFF(key, "search_type") || Intrinsics.LJFF(key, "enter_method") || Intrinsics.LJFF(key, "impr_id") || Intrinsics.LJFF(key, "log_pb")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c654680Pm6.LJIJ(linkedHashMap);
        c654680Pm6.LJIJ(C0PIF.LIZ.LIZIZ(c654670Pm5.LIZIZ));
        c654680Pm6.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZIZ(C654690Pm7 c654690Pm7) {
        String str;
        String str2;
        C664030Q2v c664030Q2v;
        String str3 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        C654680Pm6 c654680Pm6 = new C654680Pm6(c654690Pm7.LIZ);
        c654680Pm6.LJIJJ("others_homepage");
        c654680Pm6.LJIIZILJ("enter_method", "");
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        if (c650960Pg6LIZJ != null && (c664030Q2v = c650960Pg6LIZJ.searchVideoModel) != null) {
            str = c664030Q2v.groupId;
        } else {
            str = null;
        }
        c654680Pm6.LJIIZILJ("last_from_group_id", str);
        c654680Pm6.LJIIZILJ("log_pb", C584850Mwl.LIZ.LIZIZ(str3));
        c654680Pm6.LJIJI("search_result_id", C653440Pk6.LJ);
        if (Intrinsics.LJFF(C653440Pk6.LJFF, "general_search")) {
            str2 = "general";
        } else {
            str2 = C653440Pk6.LJFF;
        }
        c654680Pm6.LJIIZILJ("search_type", str2);
        c654680Pm6.LJIIZILJ("search_id", str3);
        c654680Pm6.LJIIZILJ("previous_page", c654690Pm7.LIZJ);
        c654680Pm6.LJIJI("follow_type", c654690Pm7.LIZLLL);
        c654680Pm6.LJIIZILJ("is_search_scene", String.valueOf((Object) 1));
        c654680Pm6.LJIIZILJ("search_keyword", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL);
        c654680Pm6.LJFF("to_user_id", c654690Pm7.LIZIZ, InterfaceC1210900hcG.LIZ);
        c654680Pm6.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    public final void LIZJ(C629650Omp c629650Omp) {
        String str;
        String strLIZIZ = C653440Pk6.LIZIZ();
        C651970Phj.LLILLL.getClass();
        Map<? extends String, ? extends String> mapLIZJ = C651980Phk.LIZJ();
        C654680Pm6 c654680Pm6 = new C654680Pm6("search_favourite");
        c654680Pm6.LJIJJ("single_song");
        c654680Pm6.LJIIZILJ("log_pb", C584850Mwl.LIZ.LIZIZ(strLIZIZ));
        c654680Pm6.LJIJI("search_result_id", C653440Pk6.LJ);
        c654680Pm6.LJIIZILJ("music_id", c629650Omp.LIZ);
        c654680Pm6.LJIILLIIL.putAll(mapLIZJ);
        String str2 = mapLIZJ.get("group_id");
        if (str2 != null && str2.length() != 0 && 0 == 0 && (str = C653400Pk2.LIZ.get(str2)) != null && C123100dR.LIZ(str)) {
            c654680Pm6.LJIIZILJ("is_entity", "1");
            c654680Pm6.LJIIZILJ("entity_type", str);
        }
        c654680Pm6.LJIILJJIL();
    }
}
