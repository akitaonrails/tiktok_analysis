package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* JADX INFO: renamed from: X.07tO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2005607tO extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final C01GW LIZJ;

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return (Map) this.LIZJ.getValue();
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C2005607tO(C1233510iCj c1233510iCj, User user, long j, String str, Integer num) {
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        this.LIZIZ = "sharer_info_api_result";
        this.LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, new C1234210iDr(this, zIsLogin, c1233510iCj, j, num, user, str));
    }
}
