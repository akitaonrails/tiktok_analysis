package X;

import Y.ARunnableS20S1300000_26;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0upw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719100upw extends AbstractC1716900umO {
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
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final int LJIJ;

    @Override // X.InterfaceC1717200ums
    public final String LJI() {
        return "COLLECT_MOBILE";
    }

    @Override // X.InterfaceC1717200ums
    public final void LJII(C19EG c19eg, C1717190umr c1717190umr, String str) {
        c19eg.runOnUiThread(new ARunnableS20S1300000_26(this, c19eg, str, c1717190umr, 4));
    }

    public C1719100upw(String str, String str2, ArrayList arrayList, boolean z, String str3, String str4, Function0 function0, String str5, Map map, String str6, String str7, String str8, String str9, String str10) {
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
        this.LJIILLIIL = str9;
        this.LJIIZILJ = str10;
        this.LJIJ = 100;
    }
}
