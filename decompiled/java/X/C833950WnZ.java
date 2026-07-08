package X;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: X.0WnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833950WnZ {
    public static final C832010WkR<C833940WnY> LIZ = new C832010WkR<>("Wallet.API", new AbstractC831970WkN() { // from class: X.0WnX
        @Override // X.AbstractC831970WkN
        public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context, Looper looper, C831470WjZ c831470WjZ, Object obj, InterfaceC832260Wkq interfaceC832260Wkq, InterfaceC832270Wkr interfaceC832270Wkr) {
            C833940WnY c833940WnY = (C833940WnY) obj;
            if (c833940WnY == null) {
                c833940WnY = new C833940WnY(new C834050Wnj());
            }
            return new C833630Wn3(context, looper, c831470WjZ, interfaceC832260Wkq, interfaceC832270Wkr, c833940WnY.LL, c833940WnY.LLILLJJLI, c833940WnY.LLILLL);
        }
    }, new C832160Wkg());
}
