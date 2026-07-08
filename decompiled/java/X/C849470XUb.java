package X;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849470XUb extends AbstractC845940XGm<C849480XUc> {
    public static final /* synthetic */ int LJIIJ = 0;
    public C0XO3 LJIIIIZZ;
    public JSONObject LJIIIZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_account_switch", null, null, c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIZ = jSONObject2;
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIZ = jSONObject;
        this.LJIIIIZZ = C0XZS.LIZJ(jSONObject, jSONObject2);
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(final boolean z, C845980XGq c845980XGq) {
        C0XZV c0xzv = new C0XZV(z) { // from class: X.0XUc
        };
        if (z) {
            c0xzv.LJIIIZ = this.LJIIIIZZ;
        } else {
            c0xzv.LIZLLL = c845980XGq.LIZIZ;
            c0xzv.LJFF = c845980XGq.LIZJ;
        }
        c0xzv.LJII = this.LJIIIZ;
        return c0xzv;
    }

    public C849470XUb(Context context, C845960XGo c845960XGo, AbstractC849460XUa abstractC849460XUa) {
        super(context, c845960XGo, abstractC849460XUa);
    }
}
