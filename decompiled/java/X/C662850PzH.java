package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComImage;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.OfficialCreatorInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662850PzH {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C041W LIZ(com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts r8) {
        /*
            java.lang.String r0 = r8.marketPrice
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L5b
            java.lang.Character r0 = X.C13LN.LJLLJ(r7, r0)
            if (r0 == 0) goto L5b
            char r0 = r0.charValue()
            boolean r0 = java.lang.Character.isDigit(r0)
            r2 = r0 ^ 1
        L16:
            java.lang.Integer r1 = r8.symbolPosition
            if (r1 == 0) goto L57
            int r0 = r1.intValue()
            if (r0 == r6) goto L59
            int r0 = r1.intValue()
            if (r0 != 0) goto L57
        L26:
            java.lang.Integer r0 = r8.currencyShowMode
            if (r0 == 0) goto L54
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L54
            java.lang.String r5 = r8.currency
        L33:
            X.041W r4 = new X.041W
            r4.<init>()
            java.lang.String r3 = r8.marketPriceNumber
            java.lang.String r2 = ""
            if (r3 != 0) goto L3f
            r3 = r2
        L3f:
            if (r5 != 0) goto L42
            r5 = r2
        L42:
            java.lang.Boolean r1 = r8.showCurrencySpace
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4e
            java.lang.String r2 = " "
        L4e:
            r4.LIZJ(r6, r3, r5, r2)
            r4.LJIIIIZZ = r7
            return r4
        L54:
            java.lang.String r5 = r8.currencySymbol
            goto L33
        L57:
            if (r2 == 0) goto L26
        L59:
            r6 = 0
            goto L26
        L5b:
            r2 = 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662850PzH.LIZ(com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts):X.041W");
    }

    public static final Pair<String, String> LIZLLL(EComShopCardStruct eComShopCardStruct) {
        String str;
        if (eComShopCardStruct != null) {
            String str2 = eComShopCardStruct.shopAvatarUrl;
            if (str2 != null && str2.length() > 0) {
                return new Pair<>("shop_photo", str2);
            }
            OfficialCreatorInfo officialCreatorInfo = eComShopCardStruct.officialCreator;
            if (officialCreatorInfo != null && (str = officialCreatorInfo.userAvator) != null && str.length() > 0) {
                return new Pair<>("author_photo", str);
            }
        }
        return new Pair<>("default_photo", "");
    }

    public static final boolean LJ(EComShopCardStruct eComShopCardStruct) {
        if (eComShopCardStruct != null && eComShopCardStruct.awemeRawAd != null) {
            return true;
        }
        return false;
    }

    public static final View LIZIZ(Context context, float f, AddressCardProducts addressCardProducts, boolean z, boolean z2, EnumC1769850w9n enumC1769850w9n) {
        Object objLJJJJLI;
        List<String> list;
        String str;
        List<String> list2;
        int i = 0;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bs3, null, false);
        C1378990lzN.LIZIZ(viewTd.findViewById(R.id.kdo), Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        EComImage eComImage = addressCardProducts.img;
        String str2 = "";
        if (eComImage == null || (list2 = eComImage.urlList) == null || (objLJJJJLI = C13LP.LJJJLZIJ(0, list2)) == null) {
            objLJJJJLI = "";
        }
        if (enumC1769850w9n != null) {
            IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            EComImage eComImage2 = addressCardProducts.img;
            if (eComImage2 != null && (list = eComImage2.urlList) != null && (str = (String) C13LP.LJJJLZIJ(0, list)) != null) {
                str2 = str;
            }
            objLJJJJLI = iEcomSearchService.LJJJJLI(str2, enumC1769850w9n);
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(objLJJJJLI);
        c1331670kl3LIZLLL.LJJIJL(viewTd.findViewById(R.id.kee).getContext());
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = f;
        if (z) {
            c1331750klB.LIZIZ = C418440Gaw.LIZIZ(1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
            if (numLIZJ != null) {
                c1331750klB.LIZJ = numLIZJ.intValue();
            }
        }
        c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) viewTd.findViewById(R.id.kee));
        C786410Ut5.h3(c1331670kl3LIZLLL);
        ((ImageView) viewTd.findViewById(R.id.kee)).setAdjustViewBounds(true);
        View viewFindViewById = viewTd.findViewById(R.id.tv_price);
        if (!z2) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        return viewTd;
    }
}
