package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.List;
import webcast.api.profit.IapListResult;
import webcast.api.profit.ListV3Result;

/* JADX INFO: renamed from: X.0x3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804300x3M extends AbstractC1804230x3F<ListV3Result> {
    public final InterfaceC1804470x3d LJI;
    public final InterfaceC1804520x3i LJII;
    public final InterfaceC1804530x3j LJIIIIZZ;

    @Override // X.AbstractC1804230x3F
    public final boolean LJIILIIL(ListV3Result listV3Result) {
        ListV3Result.Data data;
        List<Diamond> list;
        ListV3Result listV3Result2 = listV3Result;
        if (listV3Result2 != null && (data = listV3Result2.data) != null && (list = data.list) != null && list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1804230x3F
    public final void LJIILL(ListV3Result listV3Result) {
        String str;
        ListV3Result.Extra extra;
        IapListResult.IapCustomData iapCustomData;
        ListV3Result listV3Result2 = listV3Result;
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService.canRedirectRechargeV3()) {
            Long lValueOf = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
            if (listV3Result2 != null && (extra = listV3Result2.extra) != null && (iapCustomData = extra.iapCustomData) != null) {
                str = iapCustomData.rechargeV3PanelUrl;
            } else {
                str = null;
            }
            iWalletService.setRechargeV3Cache(lValueOf, str);
        }
    }

    @Override // X.AbstractC1804230x3F
    public final /* bridge */ /* synthetic */ void LJIIJ(C1804420x3Y c1804420x3Y, ListV3Result listV3Result) {
    }

    @Override // X.AbstractC1804230x3F
    public final Object LJIIL(C1804420x3Y c1804420x3Y, String str, C1804290x3L c1804290x3L) {
        return this.LJII.LJ(new C1804690x3z(c1804420x3Y, str), c1804290x3L);
    }

    @Override // X.AbstractC1804230x3F
    public final Object LJIILJJIL(List list, Object obj, C1804290x3L c1804290x3L) {
        List list2;
        List<Diamond> list3;
        ListV3Result.Data data;
        ListV3Result.Data data2;
        ListV3Result listV3Result = (ListV3Result) obj;
        ListV3Result.Extra extra = null;
        if (listV3Result == null || (data2 = listV3Result.data) == null || (list2 = data2.list) == null) {
            list2 = C13BV.INSTANCE;
        }
        if (listV3Result != null && (data = listV3Result.data) != null) {
            list3 = data.listV3;
        } else {
            list3 = null;
            if (listV3Result != null) {
            }
            return this.LJIIIIZZ.LJ(new C1804440x3a(list2, list3, extra, list), c1804290x3L);
        }
        extra = listV3Result.extra;
        return this.LJIIIIZZ.LJ(new C1804440x3a(list2, list3, extra, list), c1804290x3L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.13BV] */
    @Override // X.AbstractC1804230x3F
    /* JADX INFO: renamed from: LJIILLIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.C1804420x3Y r9, webcast.api.profit.ListV3Result r10, X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdk.wallet.Diamond>> r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1804300x3M.LJIIJJI(X.0x3Y, webcast.api.profit.ListV3Result, X.05Vn):java.lang.Object");
    }

    public C1804300x3M(C1804410x3X c1804410x3X, C1804430x3Z c1804430x3Z, C1804320x3O c1804320x3O, C1796830wrJ c1796830wrJ, C1804220x3E c1804220x3E, C1804590x3p c1804590x3p, C1807890x99 c1807890x99, C1803570x2B c1803570x2B) {
        super(c1796830wrJ, c1804220x3E, c1804590x3p, c1807890x99, c1803570x2B);
        this.LJI = c1804410x3X;
        this.LJII = c1804430x3Z;
        this.LJIIIIZZ = c1804320x3O;
    }
}
