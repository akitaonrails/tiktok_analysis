package X;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847620XMy extends AbstractC845940XGm<C0XN3> {
    public static final /* synthetic */ int LJIIIZ = 0;
    public C0XN3 LJIIIIZZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        C0XG9.LIZIZ("passport_token_beat_v2", null, null, c0xga, null);
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XN3 c0xn3 = new C0XN3(false);
        this.LJIIIIZZ = c0xn3;
        c0xn3.LJII = jSONObject2;
        c0xn3.LJIIIZ = jSONObject.optString("error_name");
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XN3 c0xn3 = new C0XN3(true);
        this.LJIIIIZZ = c0xn3;
        c0xn3.LJII = jSONObject;
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C0XN3 c0xn3 = this.LJIIIIZZ;
        if (c0xn3 == null) {
            c0xn3 = new C0XN3(z);
        } else {
            c0xn3.LIZIZ = z;
        }
        if (!z) {
            c0xn3.LIZLLL = c845980XGq.LIZIZ;
            c0xn3.LJFF = c845980XGq.LIZJ;
        }
        return c0xn3;
    }

    public C847620XMy(Context context, C845960XGo c845960XGo, AbstractC847610XMx abstractC847610XMx) {
        super(context, c845960XGo, abstractC847610XMx);
    }
}
