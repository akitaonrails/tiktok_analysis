package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851240XaM extends AbstractC846040XGw<C0XZV> {
    public final WeakReference<InterfaceC851260XaO> LIZJ;

    public C851240XaM(InterfaceC851260XaO interfaceC851260XaO) {
        this.LIZJ = new WeakReference<>(interfaceC851260XaO);
    }

    @Override // X.AbstractC846040XGw
    public final void LIZ(C0XGA c0xga) {
        C0XZV c0xzv = (C0XZV) c0xga;
        if (c0xzv.LIZIZ) {
            if (this.LIZJ.get() != null) {
                this.LIZJ.get().LLLLIILL(c0xzv.LJIIIZ);
            }
        } else {
            if (this.LIZJ.get() == null) {
                return;
            }
            String strOptString = c0xzv.LJIILIIL;
            JSONObject jSONObject = c0xzv.LJII;
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (TextUtils.isEmpty(strOptString) && jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("profile_key")) {
                    strOptString = jSONObjectOptJSONObject.optString("profile_key", "");
                }
            }
            this.LIZJ.get().LJJLJLI(c0xzv.LIZLLL, c0xzv.LJFF, strOptString, c0xzv);
        }
    }
}
