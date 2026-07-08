package Y;

import X.C0XIR;
import X.C11NZ;
import X.C1618440sDa;
import X.C2188811AlT;
import X.C727890Sgt;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes20.dex */
public class AkS44S1000000_19 implements InterfaceC1487280oo2 {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS44S1000000_19(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(AkS44S1000000_19 akS44S1000000_19, Object obj) {
        String str = akS44S1000000_19.s0;
        if (((Boolean) obj).booleanValue()) {
            return C1618440sDa.LIZIZ.LJJLIIIJLJLI().LIZLLL(str, false).LJJIJIIJIL(new AfS38S1000000_19(str, 1)).LJJLIIIIJ(new AkS44S1000000_19(str, 1));
        }
        return C11NZ.LJJJJZ(new Aweme());
    }

    public static final Object apply$1(AkS44S1000000_19 akS44S1000000_19, Object obj) {
        String str = akS44S1000000_19.s0;
        Throwable th = (Throwable) obj;
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchListRx: fetch user(");
        sbLIZ.append(str);
        sbLIZ.append(") story on error: ");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("error: ");
        sbLIZ2.append(th);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        if (th instanceof C0XIR) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", detail: ");
            sbLIZ3.append(((C0XIR) th).getResponse());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZJ("AwemeModel", strLIZIZ2, th);
        return new Aweme();
    }
}
