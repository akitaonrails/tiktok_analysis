package X;

import Y.ARunnableS106S0100000_6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989150bqb implements InterfaceC990700bt6 {
    public static final C989150bqb LIZ = new C989150bqb();

    @Override // X.InterfaceC990700bt6
    public final void LJIIZILJ(String str) {
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIJ(Aweme aweme) {
        AdProductTile productTile;
        List<AdNativeProduct> productList;
        synchronized (aweme) {
            try {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && (productTile = awemeRawAd.getProductTile()) != null && (productList = productTile.getProductList()) != null && (!productList.isEmpty())) {
                    C823050WQl.LIZLLL().execute(new ARunnableS106S0100000_6(productList, 250));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC990700bt6
    public final void LJIILLIIL(int i, List list) {
        AdProductTile productTile;
        List<AdNativeProduct> productList;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AwemeRawAd awemeRawAd = ((Aweme) it2.next()).getAwemeRawAd();
            if (awemeRawAd != null && (productTile = awemeRawAd.getProductTile()) != null && (productList = productTile.getProductList()) != null && (!productList.isEmpty())) {
                C823050WQl.LIZLLL().execute(new ARunnableS106S0100000_6(productList, 250));
            }
        }
    }
}
