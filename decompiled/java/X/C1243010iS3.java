package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.landscape.networkapi.LandscapeInnerApi;

/* JADX INFO: renamed from: X.0iS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243010iS3 implements InterfaceC736910SvR<Object> {
    public final C1218900hpA LL = new InterfaceC149400hg() { // from class: X.0hpA
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }

    public final Object LIZ(String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        getClass();
        Keva repo = Keva.getRepo("landscape_mock_info");
        String string = repo.getString("mock_list", "");
        if (string.length() == 0) {
            repo.storeString("mock_list", "");
        }
        n nVar = new n();
        nVar.LJJIII(C2286608xc.LJ(20), "count");
        nVar.LJJIII(C2286608xc.LJ(2), "pull_type");
        nVar.LJJIII(C2286608xc.LJFF(CastLongProtector.parseLong(str)), "enter_feed_aweme_id");
        nVar.LJJIII(C2286608xc.LJ(0), "filter_warn");
        nVar.LJJIIJ("brand_safety_id", str3);
        nVar.LJJIIJ("fyp_items", str2);
        nVar.LJJIIJ("mock_info", string);
        LandscapeInnerApi.LIZ.getClass();
        return C1243020iS4.LIZIZ.getValue().getLandscapeInnerList(nVar, interfaceC1364105Vn);
    }
}
