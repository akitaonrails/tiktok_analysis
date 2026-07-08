package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KKH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KKH extends AbstractC516030KLp<TemplateListData> {
    public final /* synthetic */ C0KKE LIZ;

    public final C11O8 LIZJ() {
        C0KJX c0kjx = this.LIZ.LIZ;
        boolean z = c0kjx.LJIILIIL || c0kjx.LJIILJJIL;
        C480460Ism.LIZ().getClass();
        SubscribeApi subscribeApi = (SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class);
        C0KJX c0kjx2 = this.LIZ.LIZ;
        String str = c0kjx2.LIZ;
        int i = c0kjx2.LIZJ;
        String strLIZ = C0KKY.LIZ(c0kjx2.LJI);
        C0KJX c0kjx3 = this.LIZ.LIZ;
        return C510380Jzw.LJIILJJIL(subscribeApi.getSubTemplateList(str, i, strLIZ, c0kjx3.LJIIJJI, c0kjx3.LJ, c0kjx3.LJFF, z, C516700KOe.LIZ()), EnumC510330Jzr.GENERAL, "source", "sub/contract/tpl_list", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public C0KKH(C0KKE c0kke) {
        this.LIZ = c0kke;
    }
}
