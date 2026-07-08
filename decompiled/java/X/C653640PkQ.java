package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0PkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653640PkQ {
    public final ViewGroup LIZ;
    public SearchUser LIZJ;
    public C653660PkS LIZLLL;
    public C662430Pyb LJ;
    public InterfaceC653650PkR LJFF;
    public View LJI;
    public final List<MixStruct> LIZIZ = new ArrayList();
    public final C653630PkP LJII = new InterfaceC1169410gXL() { // from class: X.0PkP
        @Override // X.InterfaceC1169410gXL
        public final void LIZ(Integer num, String str, String str2) {
            String str3;
            String tokenType;
            Integer numValueOf;
            String str4;
            String str5;
            String searchResultId;
            String searchResultId2;
            String str6;
            String tokenType2;
            String str7;
            C664030Q2v c664030Q2v;
            String str8 = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C653640PkQ c653640PkQ = this.LIZ;
            C653660PkS c653660PkS = c653640PkQ.LIZLLL;
            String str9 = "1";
            if (c653660PkS != null) {
                String str10 = c653660PkS.LJIIJJI;
                String str11 = c653660PkS.LJIIJ;
                String str12 = c653660PkS.LJFF;
                String str13 = c653660PkS.LJIIIIZZ;
                int i = c653660PkS.LJIILL;
                C654740PmC c654740PmC = new C654740PmC(c653660PkS);
                c654740PmC.LJIIZILJ("impr_id", str10);
                c654740PmC.LJIIZILJ("search_id", str11);
                C662430Pyb c662430Pyb = c653640PkQ.LJ;
                if (c662430Pyb != null) {
                    searchResultId2 = c662430Pyb.getSearchResultId();
                } else {
                    searchResultId2 = null;
                }
                c654740PmC.LJIJI("search_result_id", searchResultId2);
                c654740PmC.LJIIZILJ("search_keyword", str12);
                c654740PmC.LJJIIZ(Integer.valueOf(i));
                c654740PmC.LJIJJ(str13);
                C662430Pyb c662430Pyb2 = c653640PkQ.LJ;
                if (c662430Pyb2 != null && c662430Pyb2.isAladdin()) {
                    str6 = "1";
                } else {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                c654740PmC.LJIIZILJ("is_aladdin", str6);
                C662430Pyb c662430Pyb3 = c653640PkQ.LJ;
                if (c662430Pyb3 != null) {
                    tokenType2 = c662430Pyb3.getTokenType();
                } else {
                    tokenType2 = null;
                }
                c654740PmC.LJIIZILJ("token_type", tokenType2);
                c654740PmC.LJIIZILJ("list_result_type", "playlist");
                c654740PmC.LJIIZILJ("list_item_id", str8);
                c654740PmC.LJ("aladdin_words", str2);
                c654740PmC.LJJIJL(num);
                c654740PmC.LJIIZILJ("aladdin_button_type", "click_playlist");
                C646000PVm c646000PVm = C650950Pg5.Companion;
                View view = c653640PkQ.LJI;
                c646000PVm.getClass();
                C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view);
                if (c650960Pg6LJI != null && (c664030Q2v = c650960Pg6LJI.searchVideoModel) != null) {
                    str7 = c664030Q2v.groupId;
                } else {
                    str7 = null;
                }
                c654740PmC.LJIIZILJ("last_from_group_id", str7);
                Integer num2 = c653660PkS.LJIILLIIL;
                if (num2 != null) {
                    c654740PmC.LIZLLL(num2.intValue(), "universal_rank");
                    c654740PmC.LJ("insert_type", c653660PkS.LJIIZILJ);
                }
                c654740PmC.LJIILJJIL();
            }
            C653660PkS c653660PkS2 = this.LIZ.LIZLLL;
            if (c653660PkS2 != null) {
                str3 = c653660PkS2.LJIIJ;
            } else {
                str3 = null;
            }
            linkedHashMap.put("search_id", String.valueOf(str3));
            C662430Pyb c662430Pyb4 = this.LIZ.LJ;
            String str14 = "";
            if (c662430Pyb4 == null || (tokenType = c662430Pyb4.getTokenType()) == null) {
                tokenType = "";
            }
            linkedHashMap.put("token_type", tokenType);
            C662430Pyb c662430Pyb5 = this.LIZ.LJ;
            if (c662430Pyb5 != null) {
                numValueOf = Integer.valueOf(c662430Pyb5.getRank());
            } else {
                numValueOf = null;
            }
            linkedHashMap.put("rank", String.valueOf(numValueOf));
            C662430Pyb c662430Pyb6 = this.LIZ.LJ;
            if (c662430Pyb6 == null || !c662430Pyb6.isAladdin()) {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_aladdin", str9);
            C653660PkS c653660PkS3 = this.LIZ.LIZLLL;
            if (c653660PkS3 == null || (str4 = c653660PkS3.LJJLIIIIJ) == null) {
                str4 = "";
            }
            linkedHashMap.put("list_result_type", str4);
            C653660PkS c653660PkS4 = this.LIZ.LIZLLL;
            if (c653660PkS4 == null || (str5 = c653660PkS4.LJJJJLL) == null) {
                str5 = "";
            }
            linkedHashMap.put("module", str5);
            linkedHashMap.put("is_from_video", CardStruct.IStatusCode.DEFAULT);
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("list_item_id", str8);
            C662430Pyb c662430Pyb7 = this.LIZ.LJ;
            if (c662430Pyb7 != null && (searchResultId = c662430Pyb7.getSearchResultId()) != null) {
                str14 = searchResultId;
            }
            linkedHashMap.put("search_result_id", str14);
            C651970Phj.LLILLL.getClass();
            C651980Phk.LJFF(linkedHashMap, false);
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0PkP] */
    public C653640PkQ(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    public final void LIZ(SearchUser searchUser) {
        long jLongValue;
        boolean zBooleanValue;
        String searchKeyWord;
        String str;
        String searchResultId;
        String str2;
        String uid;
        User user;
        User user2;
        Boolean bool;
        Long l;
        if (searchUser != null && searchUser.playlists != null) {
            ((ArrayList) this.LIZIZ).clear();
            this.LIZJ = searchUser;
            for (MixStruct mixStruct : searchUser.playlists) {
                if (mixStruct != null) {
                    ((ArrayList) this.LIZIZ).add(mixStruct);
                }
            }
            MixListResponse mixListResponse = new MixListResponse();
            mixListResponse.setMixList(this.LIZIZ);
            SearchUser searchUser2 = this.LIZJ;
            if (searchUser2 != null && (l = searchUser2.mixCursor) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            mixListResponse.setCursor(jLongValue);
            SearchUser searchUser3 = this.LIZJ;
            if (searchUser3 != null && (bool = searchUser3.mixHasMore) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            mixListResponse.setHasMore(zBooleanValue);
            C662430Pyb c662430Pyb = this.LJ;
            String secUid = null;
            if (c662430Pyb != null) {
                searchKeyWord = c662430Pyb.getSearchKeyWord();
            } else {
                searchKeyWord = null;
            }
            mixListResponse.setKeyWord(searchKeyWord);
            C653660PkS c653660PkS = this.LIZLLL;
            if (c653660PkS != null) {
                str = c653660PkS.LJIIJ;
            } else {
                str = null;
            }
            mixListResponse.setSearchId(str);
            C662430Pyb c662430Pyb2 = this.LJ;
            if (c662430Pyb2 != null) {
                searchResultId = c662430Pyb2.getSearchResultId();
            } else {
                searchResultId = null;
            }
            mixListResponse.setSearchResultId(searchResultId);
            C653660PkS c653660PkS2 = this.LIZLLL;
            if (c653660PkS2 != null) {
                str2 = c653660PkS2.LIZLLL;
            } else {
                str2 = null;
            }
            mixListResponse.setSearchType(str2);
            InterfaceC653650PkR interfaceC653650PkR = this.LJFF;
            if (interfaceC653650PkR != null) {
                SearchUser searchUser4 = this.LIZJ;
                if (searchUser4 == null || (user2 = searchUser4.user) == null || (uid = user2.getUid()) == null) {
                    uid = "";
                }
                SearchUser searchUser5 = this.LIZJ;
                if (searchUser5 != null && (user = searchUser5.user) != null) {
                    secUid = user.getSecUid();
                }
                interfaceC653650PkR.W4(mixListResponse, uid, secUid);
            }
        }
    }
}
