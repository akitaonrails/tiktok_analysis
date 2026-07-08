package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849620XUq extends AbstractC845940XGm<C849630XUr> {
    public static final /* synthetic */ int LJIIL = 0;
    public final String LJIIIIZZ;
    public final C0XU9 LJIIIZ;
    public C0XO3 LJIIJ;
    public JSONObject LJIIJJI;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
            if (this.LJIIIIZZ.equals("mobile")) {
                C0XG9.LIZIZ("passport_mobile_reset_password", "mobile", "ticket", c0xga, null);
            } else {
                if (!this.LJIIIIZZ.equals("email")) {
                    return;
                }
                C0XG9.LIZIZ("passport_email_reset_password", "email", "ticket", c0xga, null);
            }
        }
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIJJI = jSONObject2;
        C0XV1.LIZ(this.LJIIIZ, jSONObject);
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIJ = C0XZS.LIZJ(jSONObject, jSONObject2);
        this.LJIIJJI = jSONObject;
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(final boolean z, C845980XGq c845980XGq) {
        C0XZV c0xzv = new C0XZV(z) { // from class: X.0XUr
        };
        if (z) {
            c0xzv.LJIIIZ = this.LJIIJ;
        } else {
            c0xzv.LIZLLL = c845980XGq.LIZIZ;
            c0xzv.LJFF = c845980XGq.LIZJ;
        }
        c0xzv.LJII = this.LJIIJJI;
        return c0xzv;
    }

    public C849620XUq(Context context, C845960XGo c845960XGo, String str, AbstractC849650XUt abstractC849650XUt) {
        super(context, c845960XGo, abstractC849650XUt);
        this.LJIIIIZZ = "";
        this.LJIIIIZZ = str;
        this.LJIIIZ = new C0XU9();
    }
}
