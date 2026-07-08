package X;

import Y.ACListenerS114S0200000_10;
import Y.AfS44S1100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS50S1300000_10;
import kotlin.jvm.internal.AwS96S0201000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676180Qfg extends HorizontalScrollView {
    public final LinearLayout LL;
    public PhotoSearchBaseVM LLILLJJLI;
    public final List<C676240Qfm> LLILLL;

    public C676180Qfg(Context context) {
        super(context, null, 0);
        this.LLILLL = new ArrayList();
        C786410Ut5.Sd(R.layout.f2e, C786410Ut5.ne(context), this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.eqx);
        this.LL = linearLayout;
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, 0);
        }
    }

    private final void setCropImageSelected(int i) {
        boolean z;
        int i2 = 0;
        for (Object obj : (ArrayList) this.LLILLL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C676240Qfm c676240Qfm = (C676240Qfm) obj;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                c676240Qfm.LIZLLL = z;
                ((C385360F9a) c676240Qfm.LJIIJ.getValue()).setSeleted(z);
                ((View) c676240Qfm.LJIIJ.getValue()).invalidate();
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZIZ(ProductCard productCard, Integer num) {
        String strXQ2;
        C674850QdX c674850QdX;
        String str;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        String str2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        String str3;
        PhotoSearchEnterParams photoSearchEnterParams;
        String strValueOf;
        String str4;
        String str5;
        JSONObject jSONObject;
        if (num != null) {
            num.intValue();
            C676240Qfm c676240Qfm = (C676240Qfm) C13LP.LJJJLZIJ(num.intValue(), this.LLILLL);
            if (c676240Qfm == null || c676240Qfm.LIZLLL) {
                return;
            }
            PhotoSearchBaseVM photoSearchBaseVM = this.LLILLJJLI;
            if (photoSearchBaseVM != null) {
                photoSearchBaseVM.CQ2("pic_search_entity_click", new AwS50S1300000_10(num, productCard, this, 0));
            }
            PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILLJJLI;
            if (photoSearchBaseVM2 != null && (jSONObject = photoSearchBaseVM2.LLIZLLLIL) != null) {
                jSONObject.put("search_time", System.currentTimeMillis());
            }
            C676320Qfu.LIZJ(AFwS241S0000000_10.get$arr$(450));
            PhotoSearchBaseVM photoSearchBaseVM3 = this.LLILLJJLI;
            String str6 = null;
            if (photoSearchBaseVM3 != null && (photoSearchEnterParams = photoSearchBaseVM3.LLILLL) != null) {
                if (productCard == null || (strValueOf = productCard.url) == null) {
                    strValueOf = String.valueOf(System.currentTimeMillis());
                }
                photoSearchEnterParams.setImageKey(strValueOf);
                PhotoSearchToolsEnterParams photoSearchToolsEnterParams2 = photoSearchEnterParams.toolsParams;
                if (photoSearchToolsEnterParams2 != null) {
                    if (productCard != null) {
                        str5 = productCard.url;
                    } else {
                        str5 = null;
                    }
                    photoSearchToolsEnterParams2.setLocalFilePath(str5);
                }
                PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2 = photoSearchEnterParams.businessParams;
                if (photoSearchBusinessEnterParams2 != null) {
                    Pair[] pairArr = new Pair[3];
                    if (productCard != null) {
                        str4 = productCard.productId;
                    } else {
                        str4 = null;
                    }
                    pairArr[0] = new Pair("product_id", str4);
                    pairArr[1] = new Pair("position", 1);
                    pairArr[2] = new Pair("is_extra", Boolean.TRUE);
                    photoSearchBusinessEnterParams2.setAttachProducts(C1741890vQh.LJIIIIZZ(Collections.singletonList(C2097608Jq.LJIIIIZZ(pairArr))));
                }
            }
            PhotoSearchBaseVM photoSearchBaseVM4 = this.LLILLJJLI;
            if (photoSearchBaseVM4 != null) {
                if (productCard != null) {
                    str3 = productCard.productId;
                } else {
                    str3 = null;
                }
                strXQ2 = photoSearchBaseVM4.xQ2(str3);
            } else {
                strXQ2 = null;
            }
            C676050QfT c676050QfT = new C676050QfT(null, null, null, null, null, null, null);
            c676050QfT.setImageTosUri(strXQ2);
            PhotoSearchBaseVM photoSearchBaseVM5 = this.LLILLJJLI;
            if (photoSearchBaseVM5 != null) {
                if (productCard != null) {
                    str2 = productCard.productId;
                } else {
                    str2 = null;
                }
                photoSearchBaseVM5.LLJILJIL = str2;
                PhotoSearchEnterParams photoSearchEnterParams2 = photoSearchBaseVM5.LLILLL;
                if (photoSearchEnterParams2 != null && (photoSearchBusinessEnterParams = photoSearchEnterParams2.businessParams) != null) {
                    if (productCard != null) {
                        str6 = productCard.productId;
                    }
                    photoSearchBusinessEnterParams.setEnterProductId(str6);
                }
            }
            PhotoSearchBaseVM photoSearchBaseVM6 = this.LLILLJJLI;
            if (photoSearchBaseVM6 != null) {
                photoSearchBaseVM6.FQ2();
            }
            getContext();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C036E.LIZ.LIZIZ()) {
                String str7 = c676050QfT.imageTosUri;
                if (str7 != null && str7.length() > 0) {
                    PhotoSearchBaseVM photoSearchBaseVM7 = this.LLILLJJLI;
                    if (photoSearchBaseVM7 != null) {
                        getContext();
                        photoSearchBaseVM7.DQ2(new C674850QdX(null, "switch_entity", null, null, null, null, null, null, null, null, null, null, null, null, null, c676050QfT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
                    }
                } else {
                    PhotoSearchBaseVM photoSearchBaseVM8 = this.LLILLJJLI;
                    if (photoSearchBaseVM8 != null) {
                        PhotoSearchEnterParams photoSearchEnterParams3 = photoSearchBaseVM8.LLILLL;
                        if (photoSearchEnterParams3 == null || (photoSearchToolsEnterParams = photoSearchEnterParams3.toolsParams) == null || (str = photoSearchToolsEnterParams.localFilePath) == null) {
                            str = "";
                        }
                        PhotoSearchBaseVM.wQ2(str).LJJLL(new AfS44S1100000_10(this, 2), new C09JN() { // from class: X.00Nm
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("FYPProductImageCards@4c97.selectEntity$8");
                                C1C7U.LIZIZ("FYPProductImageCards@4c97.selectEntity$8");
                            }
                        });
                    }
                }
            } else {
                PhotoSearchBaseVM photoSearchBaseVM9 = this.LLILLJJLI;
                if (photoSearchBaseVM9 != null) {
                    getContext();
                    PhotoSearchBaseVM photoSearchBaseVM10 = this.LLILLJJLI;
                    if (photoSearchBaseVM10 != null && (c674850QdX = photoSearchBaseVM10.LLILZLL) != null) {
                        c674850QdX.setSearchSource("switch_entity");
                        c674850QdX.setForceRequest(true);
                        c674850QdX.setPhotoSearch(c676050QfT);
                    } else {
                        c674850QdX = new C674850QdX(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                        c674850QdX.setForceRequest(true);
                    }
                    photoSearchBaseVM9.DQ2(c674850QdX);
                }
            }
            setCropImageSelected(c676240Qfm.LJ);
        }
    }

    public final void LIZJ(List<ProductCard> list, PhotoSearchBaseVM photoSearchBaseVM) {
        boolean z;
        try {
            this.LLILLJJLI = photoSearchBaseVM;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            Unit unit = null;
            if (!z) {
                LinearLayout linearLayout = this.LL;
                if (linearLayout != null) {
                    C786410Ut5.LJJJJJL(linearLayout);
                }
                ((ArrayList) this.LLILLL).clear();
                int i = 0;
                for (ProductCard productCard : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        LIZ(i, i, productCard);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                setCropImageSelected(0);
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator<ProductCard> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().productId;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            }
            PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILLJJLI;
            if (photoSearchBaseVM2 != null) {
                photoSearchBaseVM2.CQ2("pic_search_module_show", new AwS219S0300000_10((List) list, (List<ProductCard>) this, (C676180Qfg) arrayList, (List<String>) 0));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ(int i, int i2, ProductCard productCard) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.f2d, this, false);
        C676240Qfm c676240Qfm = new C676240Qfm(viewTd, null, null);
        c676240Qfm.LJ = i;
        c676240Qfm.LJFF = i2;
        c676240Qfm.LJII = productCard;
        C786410Ut5.LLZZLLIL((C1322110kVd) c676240Qfm.LJIIIZ.getValue(), 8);
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        String str = productCard.url;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_XY;
        c1331670kl3LIZLLL.LJJI(c676240Qfm.LIZIZ());
        c1331670kl3LIZLLL.LJIIJ(new C0R4O(c676240Qfm, 0));
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            linearLayout.addView(viewTd);
        }
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
            C786410Ut5.W5(c676240Qfm.LIZ, layoutParams);
        }
        viewTd.setOutlineProvider(new C0IDB(this, 7));
        c676240Qfm.LIZIZ().setOutlineProvider(new C0IDB(this, 8));
        c676240Qfm.LIZIZ().setClipToOutline(true);
        viewTd.setClipToOutline(true);
        C786410Ut5.I7(new ACListenerS114S0200000_10(this, c676240Qfm, 16), viewTd);
        ((ArrayList) this.LLILLL).add(c676240Qfm);
        PhotoSearchBaseVM photoSearchBaseVM = this.LLILLJJLI;
        if (photoSearchBaseVM != null) {
            photoSearchBaseVM.CQ2("pic_search_entity_show", new AwS96S0201000_10(i, productCard, this, 2));
        }
    }
}
