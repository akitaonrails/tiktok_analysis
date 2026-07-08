package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849590XUn extends AbstractC845940XGm<C849600XUo> {
    public static final /* synthetic */ int LJIIJ = 0;
    public String LJIIIIZZ;
    public JSONObject LJIIIZ;

    @Override // X.AbstractC845940XGm
    public final void LJ(C0XGA c0xga) {
        String str;
        if (!TextUtils.isEmpty(c0xga.LIZJ)) {
            if (c0xga.LIZJ.contains(C0XH1.LIZ("/passport/mobile/check_code/"))) {
                str = "passport_mobile_check_code";
            } else {
                str = "passport_email_check_code";
            }
            C0XG9.LIZIZ(str, null, null, c0xga, null);
        }
    }

    @Override // X.AbstractC845940XGm
    public final void LJFF(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIZ = jSONObject2;
    }

    @Override // X.AbstractC845940XGm
    public final void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIIIIZZ = jSONObject2.optString("ticket");
        this.LJIIIZ = jSONObject;
    }

    @Override // X.AbstractC845940XGm
    public final C0XGA LJIIJ(boolean z, C845980XGq c845980XGq) {
        C849600XUo c849600XUo = new C849600XUo(z);
        if (z) {
            c849600XUo.LJIIIZ = this.LJIIIIZZ;
        } else {
            c849600XUo.LIZLLL = c845980XGq.LIZIZ;
            c849600XUo.LJFF = c845980XGq.LIZJ;
        }
        c849600XUo.LJII = this.LJIIIZ;
        return c849600XUo;
    }

    public C849590XUn(Context context, C845960XGo c845960XGo, AbstractC849640XUs abstractC849640XUs) {
        super(context, c845960XGo, abstractC849640XUs);
    }
}
