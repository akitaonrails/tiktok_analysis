package Y;

import X.C09JN;
import X.C0OFL;
import X.C1181390gqf;
import X.C1C7U;
import X.InterfaceC1181380gqe;
import com.ss.android.ugc.aweme.favorites.business.FavoriteCountResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AfS44S1200000_18 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
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
        }
    }

    public static final void accept$0(AfS44S1200000_18 afS44S1200000_18, Object obj) {
        int iIntValue;
        HashMap<String, Integer> map;
        Integer num;
        C1C7U.LIZ("FavoriteTabCountHelper@8c64.refreshCountFromApi$1");
        FavoriteCountResponse favoriteCountResponse = (FavoriteCountResponse) obj;
        List<C0OFL> list = (List) afS44S1200000_18.l1;
        String str = afS44S1200000_18.s0;
        Function1 function1 = (Function1) afS44S1200000_18.l2;
        for (C0OFL c0ofl : list) {
            if (str == null || Intrinsics.LJFF(c0ofl.LIZ().mobKey, str)) {
                if (favoriteCountResponse != null && (map = favoriteCountResponse.count) != null && (num = map.get(c0ofl.LIZ().tabCountKey)) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c0ofl.LL.setValue(Integer.valueOf(iIntValue));
                function1.invoke(Integer.valueOf(iIntValue));
            }
        }
        C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.refreshCountFromApi$1");
    }

    public static final void accept$1(AfS44S1200000_18 afS44S1200000_18, Object obj) {
        C1C7U.LIZ("SlashVm@ffe6.update$2");
        InterfaceC1181380gqe interfaceC1181380gqe = (InterfaceC1181380gqe) afS44S1200000_18.l1;
        if (interfaceC1181380gqe != null) {
            interfaceC1181380gqe.Ag((SlashRequestParam) afS44S1200000_18.l2, afS44S1200000_18.s0);
        }
        C1C7U.LIZIZ("SlashVm@ffe6.update$2");
    }

    public AfS44S1200000_18(List list, AwS597S0100000_18 awS597S0100000_18, int i) {
        this.$t = i;
        this.l1 = list;
        this.s0 = "video";
        this.l2 = awS597S0100000_18;
    }

    public AfS44S1200000_18(C1181390gqf c1181390gqf, SlashRequestParam slashRequestParam, String str, int i) {
        this.$t = i;
        this.l1 = c1181390gqf;
        this.l2 = slashRequestParam;
        this.s0 = str;
    }
}
