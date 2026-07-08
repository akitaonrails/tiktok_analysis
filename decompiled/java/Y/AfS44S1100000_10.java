package Y;

import X.AnonymousClass0186;
import X.C09JN;
import X.C1C7U;
import X.C2097608Jq;
import X.C674850QdX;
import X.C676050QfT;
import X.C676180Qfg;
import X.C683340QrE;
import X.C683410QrL;
import com.ss.android.ugc.aweme.ecommerce.search.cart.model.SearchCartEntry;
import com.ss.android.ugc.aweme.ecommerce.search.cart.vm.SearchCartVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public class AfS44S1100000_10 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS44S1100000_10(C676180Qfg c676180Qfg, int i) {
        this.$t = i;
        this.l1 = c676180Qfg;
        this.s0 = "switch_entity";
    }

    public static final void accept$0(AfS44S1100000_10 afS44S1100000_10, Object obj) {
        C1C7U.LIZ("SearchCartVM@c436.requestCartInfo$2");
        SearchCartEntry searchCartEntry = (SearchCartEntry) obj;
        Integer num = searchCartEntry.itemCount;
        if (num != null) {
            int iIntValue = num.intValue();
            String str = searchCartEntry.schema;
            if (str == null) {
                ((SearchCartVM) afS44S1100000_10.l1).vQ2(afS44S1100000_10.s0, "schema is null", searchCartEntry.code, null);
            } else {
                SearchCartVM searchCartVM = (SearchCartVM) afS44S1100000_10.l1;
                String str2 = afS44S1100000_10.s0;
                searchCartVM.getClass();
                searchCartVM.setState(new C683410QrL(str2, str, iIntValue));
                searchCartVM.xQ2(iIntValue, str2);
                AnonymousClass0186.LIZ("vm_requestCartSucceed", C2097608Jq.LJIIJ(new Pair("source", str2), new Pair("schema", str), new Pair("count", Integer.valueOf(iIntValue))));
                C683340QrE c683340QrE = C683340QrE.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("trigger_type", str2);
                linkedHashMap.put("is_login", "1");
                linkedHashMap.put("is_success", "1");
                linkedHashMap.put("notice_number", String.valueOf(iIntValue));
                c683340QrE.getClass();
                C683340QrE.LIZ("rd_tiktokec_cart_request_end", linkedHashMap);
            }
        } else {
            ((SearchCartVM) afS44S1100000_10.l1).vQ2(afS44S1100000_10.s0, "itemCount is null", searchCartEntry.code, null);
        }
        C1C7U.LIZIZ("SearchCartVM@c436.requestCartInfo$2");
    }

    public static final void accept$1(AfS44S1100000_10 afS44S1100000_10, Object obj) {
        C1C7U.LIZ("SearchCartVM@c436.requestCartInfo$3");
        ((SearchCartVM) afS44S1100000_10.l1).vQ2(afS44S1100000_10.s0, "network error", null, (Throwable) obj);
        C1C7U.LIZIZ("SearchCartVM@c436.requestCartInfo$3");
    }

    public static final void accept$2(AfS44S1100000_10 afS44S1100000_10, Object obj) {
        C1C7U.LIZ("FYPProductImageCards@4c97.selectEntity$7");
        C676050QfT c676050QfT = (C676050QfT) obj;
        C676180Qfg c676180Qfg = (C676180Qfg) afS44S1100000_10.l1;
        PhotoSearchBaseVM photoSearchBaseVM = c676180Qfg.LLILLJJLI;
        if (photoSearchBaseVM != null) {
            c676180Qfg.getContext();
            photoSearchBaseVM.DQ2(new C674850QdX(null, afS44S1100000_10.s0, null, null, null, null, null, null, null, null, null, null, null, null, null, c676050QfT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
        }
        C1C7U.LIZIZ("FYPProductImageCards@4c97.selectEntity$7");
    }

    public AfS44S1100000_10(SearchCartVM searchCartVM, String str, int i) {
        this.$t = i;
        this.l1 = searchCartVM;
        this.s0 = str;
    }
}
