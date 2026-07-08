package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.WebDialog;

/* JADX INFO: renamed from: X.1BIA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BIA extends C1BI9 {
    public String LJI;
    public C1BIT LJII;
    public EnumC824980WXw LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public String LJIIL;

    public final WebDialog LIZ() {
        Bundle bundle = this.LJ;
        if (bundle == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
        C786410Ut5.LJJJI("redirect_uri", this.LJI, bundle);
        C786410Ut5.LJJJI("client_id", this.LIZIZ, bundle);
        String str = this.LJIIJJI;
        str.getClass();
        C786410Ut5.LJJJI("e2e", str, bundle);
        C786410Ut5.LJJJI("response_type", this.LJIIIIZZ == EnumC824980WXw.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain", bundle);
        C786410Ut5.LJJJI("return_scopes", "true", bundle);
        String str2 = this.LJIIL;
        str2.getClass();
        C786410Ut5.LJJJI("auth_type", str2, bundle);
        C786410Ut5.LJJJI("login_behavior", this.LJII.name(), bundle);
        if (this.LJIIIZ) {
            C786410Ut5.LJJJI("fx_app", this.LJIIIIZZ.toString(), bundle);
        }
        if (this.LJIIJ) {
            C786410Ut5.LJJJI("skip_dedupe", "true", bundle);
        }
        Context context = this.LIZ;
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }
        EnumC824980WXw enumC824980WXw = this.LJIIIIZZ;
        InterfaceC2202491BHz interfaceC2202491BHz = this.LIZLLL;
        WebDialog.LJJLIIIJLLLLLLLZ(context);
        return new WebDialog(context, "oauth", bundle, enumC824980WXw, interfaceC2202491BHz);
    }

    public C1BIA(C19EG c19eg, String str, Bundle bundle) {
        super(c19eg, str, bundle, 0);
        this.LJI = "fbconnect://success";
        this.LJII = C1BIT.NATIVE_WITH_FALLBACK;
        this.LJIIIIZZ = EnumC824980WXw.FACEBOOK;
    }
}
