package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.CreatorShowcaseText;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.zhiliaoapp.musically.R;
import g1c.AjS42S0200000_10;
import irm.AkS82S0100000_10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q21, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q21 implements InterfaceC653610PkN {
    public final View LIZ;
    public SearchUser LIZIZ;
    public C0Q24 LIZJ;
    public final List<C0Q28> LIZLLL = new ArrayList(3);
    public String LJ;

    @Override // X.InterfaceC653610PkN
    public final void trackVisible() {
        C0Q24 c0q24 = this.LIZJ;
        if (Intrinsics.LJFF(c0q24 != null ? c0q24.getSearchId() : null, this.LJ)) {
            return;
        }
        LIZ(this, "tiktokec_showcase_entrance_show");
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((C0Q28) it2.next()).LIZ();
        }
        C0Q24 c0q242 = this.LIZJ;
        this.LJ = c0q242 != null ? c0q242.getSearchId() : null;
    }

    @Override // X.InterfaceC653610PkN
    public final View getView() {
        return this.LIZ;
    }

    public C0Q21(ViewGroup viewGroup) {
        this.LIZ = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bsb, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    @Override // X.InterfaceC653610PkN
    public final void bindData(SearchUser searchUser) {
        ProductGroup productGroup;
        List<Product> list;
        int marginStart;
        int marginEnd;
        String str;
        String str2;
        SearchUser searchUser2;
        ProductGroup productGroup2;
        CreatorShowcaseText creatorShowcaseText;
        String str3;
        String str4;
        int marginStart2;
        int marginEnd2;
        String str5;
        String str6;
        int i;
        int i2;
        String str7;
        ProductGroup productGroup3;
        CreatorShowcaseText creatorShowcaseText2;
        ProductGroup productGroup4;
        CreatorShowcaseText creatorShowcaseText3;
        ProductGroup productGroup5;
        CreatorShowcaseText creatorShowcaseText4;
        ProductGroup productGroup6;
        CreatorShowcaseText creatorShowcaseText5;
        this.LIZIZ = searchUser;
        if (searchUser != null && (productGroup = searchUser.productGroup) != null && (list = productGroup.productList) != null) {
            int i3 = 3;
            boolean z = 0;
            int i4 = 1;
            if (list.size() >= 3 && 1 != 0) {
                int iLIZIZ = C497820Jfg.LIZIZ(this.LIZ.getContext());
                ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    marginStart = 0;
                }
                int i5 = iLIZIZ - marginStart;
                ViewGroup.LayoutParams layoutParams2 = this.LIZ.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                } else {
                    marginEnd = 0;
                }
                int iLIZIZ2 = (i5 - marginEnd) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int iLIZIZ3 = C814420VxA.LIZIZ(iLIZIZ2 * 0.7f);
                int i6 = iLIZIZ2 - iLIZIZ3;
                TextView textView = (TextView) this.LIZ.findViewById(R.id.user_showcase_product_showcase_title);
                SearchUser searchUser3 = this.LIZIZ;
                if (searchUser3 == null || (productGroup6 = searchUser3.productGroup) == null || (creatorShowcaseText5 = productGroup6.creatorShowcaseText) == null || (str = creatorShowcaseText5.showcaseFull) == null) {
                    str = "";
                }
                int iLIZIZ4 = C814420VxA.LIZIZ(textView.getPaint().measureText(str));
                SearchUser searchUser4 = this.LIZIZ;
                if (searchUser4 != null && (productGroup5 = searchUser4.productGroup) != null && (creatorShowcaseText4 = productGroup5.creatorShowcaseText) != null) {
                    str2 = creatorShowcaseText4.showcaseFull;
                } else {
                    str2 = null;
                }
                if ((iLIZIZ4 > iLIZIZ3 || !C123100dR.LIZ(str2)) && ((searchUser2 = this.LIZIZ) == null || (productGroup2 = searchUser2.productGroup) == null || (creatorShowcaseText = productGroup2.creatorShowcaseText) == null || (str2 = creatorShowcaseText.showcase) == null)) {
                    str2 = "";
                }
                TextView textView2 = (TextView) this.LIZ.findViewById(R.id.user_showcase_product_showcase_title);
                textView2.setWidth(iLIZIZ3);
                textView2.setText(str2);
                View view = this.LIZ;
                TextView textView3 = (TextView) view.findViewById(R.id.user_showcase_view_all_tv);
                SearchUser searchUser5 = this.LIZIZ;
                if (searchUser5 == null || (productGroup4 = searchUser5.productGroup) == null || (creatorShowcaseText3 = productGroup4.creatorShowcaseText) == null || (str3 = creatorShowcaseText3.viewAll) == null) {
                    str3 = "";
                }
                textView3.setText(str3);
                TextView textView4 = (TextView) view.findViewById(R.id.user_showcase_view_all_count);
                SearchUser searchUser6 = this.LIZIZ;
                if (searchUser6 == null || (productGroup3 = searchUser6.productGroup) == null || (creatorShowcaseText2 = productGroup3.creatorShowcaseText) == null || (str4 = creatorShowcaseText2.productsNumber) == null) {
                    str4 = "";
                }
                textView4.setText(str4);
                C1744700vVE.LJIIL(view.findViewById(R.id.user_showcase_view_all_area), i6);
                C786410Ut5.I7(new AkS82S0100000_10(this, 0), this.LIZ.findViewById(R.id.user_showcase_product_top_area));
                int iLIZIZ5 = C497820Jfg.LIZIZ(this.LIZ.getContext());
                ViewGroup.LayoutParams layoutParams3 = this.LIZ.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
                } else {
                    marginStart2 = 0;
                }
                int i7 = iLIZIZ5 - marginStart2;
                ViewGroup.LayoutParams layoutParams4 = this.LIZ.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                } else {
                    marginEnd2 = 0;
                }
                int i8 = 8;
                int iLIZIZ6 = C814420VxA.LIZIZ(((i7 - marginEnd2) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) / 3.0f);
                View view2 = this.LIZ;
                int i9 = R.id.user_showcase_product_sub_card_list;
                ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.user_showcase_product_sub_card_list);
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
                viewGroup.removeAllViewsInLayout();
                ((ArrayList) this.LIZLLL).clear();
                int size = list.size();
                int i10 = 0;
                while (i10 < size && i10 < i3) {
                    Product product = (Product) ListProtector.get(list, i10);
                    C0Q22 c0q22 = new C0Q22(iLIZIZ6, i10, viewGroup);
                    if (i10 > 0) {
                        C426750GoL.LJIIIZ(c0q22.LIZIZ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i8)))), null, null, null, z, 30);
                    }
                    c0q22.LIZLLL = this.LIZJ;
                    ((ViewGroup) viewGroup.getRootView().findViewById(i9)).addView(c0q22.LIZIZ);
                    ((ArrayList) this.LIZLLL).add(c0q22);
                    c0q22.LIZJ = product;
                    C1744700vVE.LJIIL(c0q22.LIZIZ, iLIZIZ6);
                    List<String> list2 = product.imgUrlList;
                    if (list2 == null || (str5 = (String) C13LP.LJJJLL(list2)) == null) {
                        str5 = "";
                    }
                    C1334210kp9.LIZIZ(str5, EnumC1769850w9n.GENERAL_SEARCH_USER_SHOWCASE_PRODUCT_COVER, null, null, z, z, null, null);
                    SmartImageView smartImageView = (SmartImageView) c0q22.LIZIZ.findViewById(R.id.rzn);
                    String[] strArr = new String[i4];
                    strArr[z] = str5;
                    C03IT c03it = new C03IT(C1697810uHb.LJIILJJIL(strArr));
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = C418440Gaw.LIZIZ(Integer.valueOf(i8));
                    C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bag_fill;
                    c419910GdJ.LIZLLL = C435210H4t.LIZIZ("#E0E0E0");
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ6)));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ6)));
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(smartImageView.getContext());
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ6)));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ6)));
                    c384050F3z.LIZ = C435210H4t.LIZIZ("#F6F6F6");
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i8)));
                    LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(smartImageView.getContext()));
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
                    c1331670kl3LIZLLL.LJJI = c1331730kl9;
                    c1331670kl3LIZLLL.LJJIIZI(layerDrawableLJIILIIL);
                    c1331670kl3LIZLLL.LJIL(layerDrawableLJIILIIL);
                    c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
                    c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
                    c1331670kl3LIZLLL.LIZLLL("showcase_product_sub_card_cover");
                    c1331670kl3LIZLLL.LJJ(smartImageView);
                    c1331670kl3LIZLLL.LJIIJ(c0q22.LJ);
                    View view3 = c0q22.LIZIZ;
                    TextView textView5 = (TextView) view3.findViewById(R.id.rzr);
                    String str8 = product.title;
                    if (str8 == null) {
                        str8 = "";
                    }
                    textView5.setText(str8);
                    TextView textView6 = (TextView) view3.findViewById(R.id.rzq);
                    Context context = view3.getContext();
                    Integer num = product.currencyShowMode;
                    if (num != null && num.intValue() == 2) {
                        str6 = product.currency;
                    } else {
                        str6 = product.currencySymbol;
                    }
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str9 = product.formatPriceNumber;
                    if (str9 == null && (str9 = product.formatOriginPriceNumber) == null) {
                        str9 = "";
                    }
                    Integer num2 = product.creatorShowcasePriceStyle;
                    if (num2 != null && num2.intValue() == 1) {
                        i = R.attr.a1q;
                    } else {
                        i = R.attr.a1h;
                    }
                    Integer num3 = product.symbolPosition;
                    if (num3 != null && num3.intValue() == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    C041W c041w = new C041W();
                    if (!Intrinsics.LJFF(product.showCurrencySpace, Boolean.TRUE)) {
                        str7 = "";
                    } else {
                        str7 = " ";
                    }
                    c041w.LIZJ(i2, str9, str6, str7);
                    c041w.LJII = i;
                    c041w.LJ = 72;
                    c041w.LJFF = 43;
                    textView6.setText(c041w.LIZIZ(context));
                    String str10 = product.formatDiscount;
                    if (str10 == null) {
                        C337180DJs.LIZ(view3.findViewById(R.id.rzo));
                    } else {
                        C337180DJs.LIZJ(view3.findViewById(R.id.rzo));
                        ((TextView) view3.findViewById(R.id.rzo)).setText(str10);
                    }
                    C786410Ut5.I7(new AjS42S0200000_10(c0q22, product, 0), c0q22.LIZIZ);
                    i10++;
                    i3 = 3;
                    z = 0;
                    i4 = 1;
                    i8 = 8;
                    i9 = R.id.user_showcase_product_sub_card_list;
                }
            }
        }
    }

    public static void LIZ(C0Q21 c0q21, String str) {
        String str2;
        String searchResultId;
        String searchId;
        C664000Q2s c664000Q2s;
        String str3;
        User user;
        ProductGroup productGroup;
        c0q21.getClass();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("page_name", "general_search");
        jSONObject.put("source_previous_page", "general_search");
        jSONObject.put("entrance_type", "user_card");
        SearchUser searchUser = c0q21.LIZIZ;
        String uid = null;
        if (searchUser != null && (productGroup = searchUser.productGroup) != null) {
            str2 = productGroup.shopId;
        } else {
            str2 = null;
        }
        jSONObject.put("shop_id", str2);
        SearchUser searchUser2 = c0q21.LIZIZ;
        if (searchUser2 != null && (user = searchUser2.user) != null) {
            uid = user.getUid();
        }
        jSONObject.put("author_id", uid);
        jSONObject.put("is_self", CardStruct.IStatusCode.DEFAULT);
        C0Q24 c0q24 = c0q21.LIZJ;
        String str4 = "";
        if (c0q24 == null || (searchResultId = c0q24.getSearchResultId()) == null) {
            searchResultId = "";
        }
        jSONObject.put("search_result_id", searchResultId);
        C0Q24 c0q242 = c0q21.LIZJ;
        if (c0q242 == null || (searchId = c0q242.getSearchId()) == null) {
            searchId = "";
        }
        jSONObject.put("search_id", searchId);
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = c0q21.LIZ;
        c646000PVm.getClass();
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view);
        if (c650960Pg6LJI != null && (c664000Q2s = c650960Pg6LJI.searchCommonModel) != null && (str3 = c664000Q2s.enterFrom) != null) {
            str4 = str3;
        }
        jSONObject.put("search_entrance", str4);
        PageFinder pageFinderVia = PageFinder.via(c0q21.LIZ);
        c1507790pL7.getClass();
        C1507790pL7.LJ(str, jSONObject, "a2270.b6880.c7013.d29458", pageFinderVia);
    }
}
