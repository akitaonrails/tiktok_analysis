package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662400PyY implements InterfaceC663810Q1z {
    public final Function0<User> LIZ;
    public final Function0<C653660PkS> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<Boolean> LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(28));

    @Override // X.InterfaceC663810Q1z
    public final void LIZ(Product product, int i) {
        String strLIZIZ = product.LIZIZ();
        if (strLIZIZ == null || strLIZIZ.length() == 0 || !this.LJ.invoke().booleanValue()) {
            return;
        }
        Object obj = ((Map) this.LJFF.getValue()).get(strLIZIZ);
        if (obj == null) {
            ((Map) this.LJFF.getValue()).put(strLIZIZ, Boolean.TRUE);
            obj = Boolean.FALSE;
        }
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            return;
        }
        C653660PkS c653660PkSInvoke = this.LIZIZ.invoke();
        C660210Pv1 c660210Pv1 = C660210Pv1.LIZ;
        User userInvoke = this.LIZ.invoke();
        c660210Pv1.getClass();
        Map<? extends String, ? extends String> mapLIZJ = C660210Pv1.LIZJ(userInvoke, product, c653660PkSInvoke);
        mapLIZJ.put("item_order", String.valueOf(i + 1));
        C650460PfI<C662520Pyk> c650460PfI = new C650460PfI<C662520Pyk>() { // from class: X.0Pyk
        };
        c650460PfI.LJIILLIIL.putAll(mapLIZJ);
        c650460PfI.LJIILJJIL();
        C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c653660PkSInvoke);
        c654760PmELIZIZ.LJIJI("search_result_id", c653660PkSInvoke.LJIJI);
        c654760PmELIZIZ.LJIIZILJ("token_type", this.LIZJ.invoke());
        c654760PmELIZIZ.LJIIZILJ("is_aladdin", this.LIZLLL.invoke());
        c654760PmELIZIZ.LJIIZILJ("list_result_type", "mt_goods");
        c654760PmELIZIZ.LJIIZILJ("list_item_id", strLIZIZ);
        c654760PmELIZIZ.LJ("aladdin_words", product.title);
        c654760PmELIZIZ.LJJIJL(Integer.valueOf(i));
        c654760PmELIZIZ.LJJIJLIJ(1);
        c654760PmELIZIZ.LJIILJJIL();
    }

    public C662400PyY(AwS554S0100000_10 awS554S0100000_10, AwS554S0100000_10 awS554S0100000_102, AwS554S0100000_10 awS554S0100000_103, AwS554S0100000_10 awS554S0100000_104, AwS554S0100000_10 awS554S0100000_105) {
        this.LIZ = awS554S0100000_10;
        this.LIZIZ = awS554S0100000_102;
        this.LIZJ = awS554S0100000_103;
        this.LIZLLL = awS554S0100000_104;
        this.LJ = awS554S0100000_105;
    }
}
