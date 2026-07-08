package Y;

import X.C03O0;
import X.C098200Yq;
import X.C1019103yf;
import X.C1741890vQh;
import X.C189200o6;
import X.C2097608Jq;
import X.C919503ib;
import X.C925103jV;
import X.EnumC1014603xw;
import X.InterfaceC1631620sYq;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shopify.USEmailAuthorizeCell;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public class AObjectS534S0100000_1 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS534S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS534S0100000_1 aObjectS534S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        View view = (View) obj;
        String str2 = (String) obj2;
        ECRichTextExtraInfo eCRichTextExtraInfo = (ECRichTextExtraInfo) obj3;
        if (str2 != null) {
            USAggregationOrderCell uSAggregationOrderCell = (USAggregationOrderCell) aObjectS534S0100000_1.l0;
            C919503ib.LIZIZ(view.getContext(), str2, new LinkedHashMap(), false).open();
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = uSAggregationOrderCell.L5().hi1(false);
            if (eCRichTextExtraInfo != null && (str = eCRichTextExtraInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
                mapHi1.putAll(mapLJIIJ);
            }
            C03O0.LJJJJLL(c03o0, "fbt_benefits", null, mapHi1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -6, 8388607);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS534S0100000_1 aObjectS534S0100000_1, Object obj, Object obj2, Object obj3) {
        Object c098200Yq;
        String string = (String) obj2;
        if (string != null && !a0.LJJJIL(string)) {
            if (string == null || !u.LJJIIJZLJL(string, "aweme", false)) {
                string = new Uri.Builder().scheme("aweme").authority("echybrid").appendQueryParameter("url", string).build().toString();
            }
            try {
                SmartRouter.buildRoute(((TuxTextView) aObjectS534S0100000_1.l0).getContext(), UriProtector.parse(string).toString()).open();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1019103yf.LIZ(EnumC1014603xw.ERR10005, thM5exceptionOrNullimpl, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS534S0100000_1 aObjectS534S0100000_1, Object obj, Object obj2, Object obj3) {
        Object c098200Yq;
        String string = (String) obj2;
        if (string != null && !a0.LJJJIL(string)) {
            if (string == null || !u.LJJIIJZLJL(string, "aweme", false)) {
                string = new Uri.Builder().scheme("aweme").authority("echybrid").appendQueryParameter("url", string).build().toString();
            }
            try {
                SmartRouter.buildRoute(((TuxTextView) aObjectS534S0100000_1.l0).getContext(), UriProtector.parse(string).toString()).open();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1019103yf.LIZ(EnumC1014603xw.ERR10005, thM5exceptionOrNullimpl, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS534S0100000_1 aObjectS534S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        View view = (View) obj;
        String str2 = (String) obj2;
        ECRichTextExtraInfo eCRichTextExtraInfo = (ECRichTextExtraInfo) obj3;
        if (str2 != null) {
            USAggregationOrderSingleSkuCell uSAggregationOrderSingleSkuCell = (USAggregationOrderSingleSkuCell) aObjectS534S0100000_1.l0;
            C919503ib.LIZIZ(view.getContext(), str2, new LinkedHashMap(), false).open();
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = uSAggregationOrderSingleSkuCell.L5().hi1(false);
            if (eCRichTextExtraInfo != null && (str = eCRichTextExtraInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
                mapHi1.putAll(mapLJIIJ);
            }
            C03O0.LJJJJLL(c03o0, "fbt_benefits", null, mapHi1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -6, 8388607);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS534S0100000_1 aObjectS534S0100000_1, Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        if (str != null) {
            C919503ib.LIZIZ(((USEmailAuthorizeCell) aObjectS534S0100000_1.l0).itemView.getContext(), str, new LinkedHashMap(), false).open();
        }
        C03O0.LJJJJLL(C03O0.LIZ, "CRM_toggle_click_learn_more", null, ((USEmailAuthorizeCell) aObjectS534S0100000_1.l0).L5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((USEmailAuthorizeCell) aObjectS534S0100000_1.l0).L5().LLLZLZ.LIZ("c92010.d2007"), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -536870918, 8388607);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS534S0100000_1 aObjectS534S0100000_1, Object obj, Object obj2, Object obj3) {
        Uri.Builder builderLIZJ;
        String str = (String) obj2;
        if (str != null && str.length() != 0) {
            if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
                builderLIZJ = C919503ib.LIZJ(str, new LinkedHashMap());
            } else {
                builderLIZJ = C919503ib.LIZJ("aweme://echybrid", C2097608Jq.LJIIJ(new Pair("url", str)));
            }
            SmartRouter.buildRoute(((C925103jV) aObjectS534S0100000_1.l0).getContext(), builderLIZJ.toString()).open();
        }
        return Unit.LIZ;
    }
}
