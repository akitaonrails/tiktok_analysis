package X;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.AwS99S0210000_19;

/* JADX INFO: renamed from: X.07sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000507sZ extends AbstractC1223210hw7 {
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

    public C2000507sZ(Uri uri) {
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        this.LIZIZ = "link_parse_result";
        this.LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS99S0210000_19(this, zIsLogin, uri, 1));
    }
}
