package X;

import Y.ARunnableS20S1300000_26;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719450uqV extends AbstractC1716900umO {
    public final String LJFF;
    public final String LJI;
    public final ArrayList<RegionMobileCodeItem> LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Function0<String> LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final boolean LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public final boolean LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final int LJJIII;
    public WeakReference<C19EG> LJJIIJ;

    @Override // X.InterfaceC1717200ums
    public final String LJI() {
        return "COLLECT_MOBILE_FROM_TT";
    }

    @Override // X.AbstractC1716900umO, X.InterfaceC1717200ums
    public final void LJIIJJI() {
        C19EG c19eg;
        WeakReference<C19EG> weakReference = this.LJJIIJ;
        if (weakReference == null || (c19eg = weakReference.get()) == null) {
            return;
        }
        c19eg.finish();
    }

    @Override // X.InterfaceC1717200ums
    public final void LJII(C19EG c19eg, C1717190umr c1717190umr, String str) {
        c19eg.runOnUiThread(new ARunnableS20S1300000_26(c19eg, this, str, c1717190umr, 3));
    }

    public C1719450uqV(String str, String str2, ArrayList arrayList, boolean z, String str3, String str4, Function0 function0, String str5, String str6, String str7, String str8, boolean z2, String str9, String str10, boolean z3, String str11, String str12, String str13, String str14, boolean z4, Map map, String str15, String str16) {
        super(map);
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = arrayList;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
        this.LJIIJJI = function0;
        this.LJIIL = str5;
        this.LJIILIIL = str6;
        this.LJIILJJIL = str7;
        this.LJIILL = str8;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = str9;
        this.LJIJ = str10;
        this.LJIJI = z3;
        this.LJIJJ = str11;
        this.LJIJJLI = str12;
        this.LJIL = str13;
        this.LJJ = str14;
        this.LJJI = z4;
        this.LJJIFFI = str15;
        this.LJJII = str16;
        this.LJJIII = 100;
    }
}
