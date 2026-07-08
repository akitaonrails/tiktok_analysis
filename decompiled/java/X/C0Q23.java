package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.ecom.data.ShopIcon;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q23, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q23 implements InterfaceC653620PkO {
    public final ViewGroup LIZ;
    public SearchUser LIZIZ;
    public final View LIZJ;
    public C0Q24 LIZLLL;
    public final AwS554S0100000_10 LJ = new AwS554S0100000_10(this, 1349);
    public String LJFF;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceView
    public final void trackVisible() throws JSONException {
        ProductGroup productGroup;
        Integer num;
        String str;
        C0Q24 c0q24 = this.LIZLLL;
        if (Intrinsics.LJFF(c0q24 != null ? c0q24.getSearchId() : null, this.LJFF)) {
            return;
        }
        SearchUser searchUser = this.LIZIZ;
        if (searchUser != null && (productGroup = searchUser.productGroup) != null && (num = productGroup.shopType) != null) {
            if (num.intValue() != 1) {
                str = num.intValue() == 2 ? "tiktokec_shop_entrance_show" : "tiktokec_showcase_entrance_show";
            }
            SearchUser searchUser2 = this.LIZIZ;
            if (searchUser2 != null) {
                JSONObject jSONObjectLIZIZ = LIZIZ(searchUser2);
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                PageFinder pageFinderVia = PageFinder.via(this.LIZJ);
                c1507790pL7.getClass();
                C1507790pL7.LJ(str, jSONObjectLIZIZ, "a2270.b6880.c7013.d7136", pageFinderVia);
            }
        }
        C0Q24 c0q242 = this.LIZLLL;
        this.LJFF = c0q242 != null ? c0q242.getSearchId() : null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceView
    public final View getView() {
        return this.LIZJ;
    }

    public C0Q23(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZJ = C1ER1.LIZIZ.LJJLI(R.layout.f0k, viewGroup);
    }

    @Override // X.InterfaceC653620PkO
    public final void LIZ(C0Q24 c0q24) {
        this.LIZLLL = c0q24;
    }

    public final JSONObject LIZIZ(SearchUser searchUser) throws JSONException {
        String str;
        String str2;
        String uid;
        String uid2;
        String str3;
        String searchResultId;
        String searchId;
        String str4;
        String strLIZ;
        int followStatus;
        ProductGroup productGroup;
        ShopIcon shopIcon;
        Integer num;
        String str5;
        ProductGroup productGroup2;
        ProductGroup productGroup3;
        ProductGroup productGroup4;
        ShopIcon shopIcon2;
        Integer num2;
        C664000Q2s c664000Q2s;
        User user;
        ProductGroup productGroup5;
        Integer num3;
        ProductGroup productGroup6;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("page_name", "general_search");
        jSONObject.put("entrance_type", "user_card");
        SearchUser searchUser2 = this.LIZIZ;
        Integer num4 = null;
        if (searchUser2 != null && (productGroup6 = searchUser2.productGroup) != null) {
            str = productGroup6.shopId;
        } else {
            str = null;
        }
        jSONObject.put("shop_id", str);
        SearchUser searchUser3 = this.LIZIZ;
        if (searchUser3 != null && (productGroup5 = searchUser3.productGroup) != null && (num3 = productGroup5.authorType) != null) {
            int iIntValue = num3.intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    str2 = "normal";
                } else {
                    str2 = "channel";
                }
            } else {
                str2 = "official";
            }
        } else {
            str2 = null;
        }
        jSONObject.put("author_type", str2);
        SearchUser searchUser4 = this.LIZIZ;
        if (searchUser4 != null && (user = searchUser4.user) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        jSONObject.put("author_id", uid);
        User user2 = searchUser.user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        if (TextUtils.equals(uid2, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_self", str3);
        C0Q24 c0q24 = this.LIZLLL;
        String str6 = "";
        if (c0q24 == null || (searchResultId = c0q24.getSearchResultId()) == null) {
            searchResultId = "";
        }
        jSONObject.put("search_result_id", searchResultId);
        C0Q24 c0q242 = this.LIZLLL;
        if (c0q242 == null || (searchId = c0q242.getSearchId()) == null) {
            searchId = "";
        }
        jSONObject.put("search_id", searchId);
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = this.LIZJ;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view);
        if (c650960Pg6LJI == null || (c664000Q2s = c650960Pg6LJI.searchCommonModel) == null || (str4 = c664000Q2s.enterFrom) == null) {
            str4 = "";
        }
        jSONObject.put("search_entrance", str4);
        C0Q24 c0q243 = this.LIZLLL;
        if (c0q243 == null || (strLIZ = c0q243.LIZ()) == null) {
            strLIZ = "";
        }
        jSONObject.put("last_from_group_id", strLIZ);
        User user3 = searchUser.user;
        if (user3 != null) {
            followStatus = user3.getFollowStatus();
        } else {
            followStatus = -1;
        }
        jSONObject.put("follow_status", followStatus);
        jSONObject.put("token_type", "hot_user");
        jSONObject.put("search_card_type", "hot_user_normal");
        SearchUser searchUser5 = this.LIZIZ;
        if (searchUser5 != null && (productGroup4 = searchUser5.productGroup) != null && (shopIcon2 = productGroup4.shopIcon) != null && (num2 = shopIcon2.iconType) != null && num2.intValue() == 8) {
            str6 = "top_choice";
        } else {
            SearchUser searchUser6 = this.LIZIZ;
            if (searchUser6 != null && (productGroup = searchUser6.productGroup) != null && (shopIcon = productGroup.shopIcon) != null && (num = shopIcon.iconType) != null && num.intValue() == 10) {
                str6 = "mall";
            }
        }
        jSONObject.put("usercard_tag_type", str6);
        SearchUser searchUser7 = this.LIZIZ;
        if (searchUser7 != null && (productGroup3 = searchUser7.productGroup) != null) {
            num4 = productGroup3.productVolume;
        }
        jSONObject.put("product_volume", num4);
        SearchUser searchUser8 = this.LIZIZ;
        if (searchUser8 != null && (productGroup2 = searchUser8.productGroup) != null && productGroup2.soldCount != null) {
            str5 = "sold";
        } else {
            str5 = "products";
        }
        jSONObject.put("volume_type", str5);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0159 A[PHI: r3
      0x0159: PHI (r3v3 int) = (r3v2 int), (r3v4 int), (r3v4 int) binds: [B:100:0x0156, B:93:0x0147, B:95:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0176 A[PHI: r4
      0x0176: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:104:0x0173, B:75:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindData(com.ss.android.ugc.aweme.discover.model.SearchUser r9) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q23.bindData(com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }
}
