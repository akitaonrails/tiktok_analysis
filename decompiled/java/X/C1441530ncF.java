package X;

import com.bytedance.bpea.basics.Cert;

/* JADX INFO: renamed from: X.0ncF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441530ncF implements InterfaceC1659000tH0 {
    @Override // X.InterfaceC1659000tH0
    public final void LIZ(Cert cert, String str) {
        String string;
        C1441430nc5 c1441430nc5 = new C1441430nc5();
        C805370ViZ c805370ViZ = c1441430nc5.LJIIJ;
        if (c805370ViZ != null) {
            if (cert != null) {
                string = cert.toString();
            } else {
                string = null;
            }
            c805370ViZ.LIZJ = string;
        }
        C805370ViZ c805370ViZ2 = c1441430nc5.LIZIZ;
        if (c805370ViZ2 != null) {
            c805370ViZ2.LIZJ = str;
        }
        C805360ViY.LIZ(c1441430nc5, C0VY4.LIZ(new Throwable("IllegalUseSensitiveApi")), "SensitiveApiManagement", "creative_tools_sensitive_api_error");
    }
}
