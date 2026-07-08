package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerMetaModel;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Oyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637170Oyx {
    public final String LIZ = "enter_profile_tab";
    public final long LIZIZ = ((Number) C0AQU.LIZ.getValue()).longValue();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(675));
    public C054G LIZLLL;

    public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Function1<? super ProfileBannerModel, Unit> function1) {
        C637190Oyz c637190Oyz = C637190Oyz.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive fetch. result: ");
        sbLIZ.append(c20554115bn);
        sbLIZ.append(", timing: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c637190Oyz.getClass();
        C637190Oyz.LIZIZ.LJIIIIZZ(null, "ProfileBanner", strLIZIZ);
        if (c20554115bn.LIZ != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch result is fail. error code:");
            sbLIZ2.append(c20554115bn.LIZ);
            C637190Oyz.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            function1.invoke(null);
            C637260Oz6.LIZ.getClass();
            C637260Oz6.LIZ(null, "data_error", null, false);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("parse json, ");
        sbLIZ3.append(nVar);
        C637190Oyz.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        try {
            ProfileBannerModel profileBannerModel = (ProfileBannerModel) ((Gson) this.LIZJ.getValue()).LJII(nVar.toString(), ProfileBannerModel.class);
            if (profileBannerModel != null) {
                ProfileBannerMetaModel profileBannerMetaModel = profileBannerModel.metaModel;
                if (profileBannerMetaModel != null) {
                    profileBannerMetaModel.LIZ = c20554115bn.LIZJ;
                }
                function1.invoke(profileBannerModel);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C637190Oyz c637190Oyz2 = C637190Oyz.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("parse json error, ");
            sbLIZ4.append(e);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            c637190Oyz2.getClass();
            C637190Oyz.LIZIZ(strLIZIZ2);
        }
        function1.invoke(null);
        C637260Oz6.LIZ.getClass();
        C637260Oz6.LIZ(null, "data_error", null, false);
    }
}
