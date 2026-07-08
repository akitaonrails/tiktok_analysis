package X;

import X.C650460PfI;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchLiveStruct;

/* JADX INFO: renamed from: X.0PmA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C654720PmA<T extends C650460PfI<T>> extends C650460PfI<T> {
    public final C653660PkS LJIIZILJ;

    @Override // X.C0Q2Q
    public final void LJIILLIIL() {
        LIZIZ(C666580QCq.LIZIZ(null, this.LIZ, this.LIZLLL, this.LJIIZILJ));
    }

    public final void LJJIL() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C653660PkS c653660PkS = this.LJIIZILJ;
        if (c653660PkS != null && (str9 = c653660PkS.LJJIJL) != null) {
            LJ("req_search_enter_from", str9);
        }
        C653660PkS c653660PkS2 = this.LJIIZILJ;
        if (c653660PkS2 != null && (str8 = c653660PkS2.LJJIJLIJ) != null) {
            LJ("req_search_enter_method", str8);
        }
        C653660PkS c653660PkS3 = this.LJIIZILJ;
        if (c653660PkS3 != null && (str7 = c653660PkS3.LJJJJLI) != null) {
            LJ("enter_group_id", str7);
        }
        C653660PkS c653660PkS4 = this.LJIIZILJ;
        if (c653660PkS4 != null && (str6 = c653660PkS4.LJJIL) != null && str6.length() > 0) {
            LJ("req_search_enter_tag_type", str6);
        }
        C653660PkS c653660PkS5 = this.LJIIZILJ;
        if (c653660PkS5 != null && (str5 = c653660PkS5.LJJIZ) != null && str5.length() > 0) {
            LJ("req_search_enter_unified_tag_id", str5);
        }
        C653660PkS c653660PkS6 = this.LJIIZILJ;
        if (c653660PkS6 != null && (str4 = c653660PkS6.LJJJIL) != null && str4.length() > 0) {
            LJ("req_search_enter_pause_time", str4);
        }
        C653660PkS c653660PkS7 = this.LJIIZILJ;
        if (c653660PkS7 != null && (str3 = c653660PkS7.LJJJJ) != null && str3.length() > 0) {
            LJ("is_req_search_enter_tag_same_with_query", str3);
        }
        if (C1823107Cb.LIZ()) {
            return;
        }
        C653660PkS c653660PkS8 = this.LJIIZILJ;
        if (c653660PkS8 != null && (str2 = c653660PkS8.LJJJ) != null && str2.length() > 0) {
            LJ("vs_result_feed_impr_id", str2);
        }
        C653660PkS c653660PkS9 = this.LJIIZILJ;
        if (c653660PkS9 == null || (str = c653660PkS9.LJJJI) == null || str.length() <= 0) {
            return;
        }
        LJ("req_visual_unified_tag_id", str);
    }

    public final void LJJIJL(Integer num) {
        LJIIZILJ("aladdin_rank", String.valueOf(num));
    }

    public final void LJJIJLIJ(Integer num) {
        LJIIZILJ("has_product_window", String.valueOf(num));
    }

    public final void LJJIZ(String str) {
        LJIIZILJ("list_item_id", str);
    }

    public final void LJJJ(Aweme aweme) {
        String str;
        SearchExtraStruct searchExtraStruct;
        SearchLiveStruct searchLiveStruct;
        if (aweme != null && (searchExtraStruct = aweme.getSearchExtraStruct()) != null && (searchLiveStruct = searchExtraStruct.getSearchLiveStruct()) != null) {
            str = searchLiveStruct.liveCoverType;
        } else {
            str = null;
        }
        LJIIZILJ("live_cover_type", str);
    }

    public final void LJJJI(Aweme aweme) {
        LiveRoomStruct newLiveRoomDataExt;
        String str;
        if (aweme != null) {
            newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        } else {
            newLiveRoomDataExt = null;
        }
        if (C486810J7f.LIZIZ(newLiveRoomDataExt)) {
            str = "vertical";
        } else {
            str = "horizontal";
        }
        LJIIZILJ("live_screen_type", str);
    }

    public C654720PmA(String str, C653660PkS c653660PkS) {
        super(str);
        this.LJIIZILJ = c653660PkS;
    }
}
