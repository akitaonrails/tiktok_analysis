package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XYP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XYP extends C0XQW {
    public final C852220Xbw LIZJ;

    @Override // X.C0XQW
    public final boolean LIZ() {
        C852220Xbw c852220Xbw = this.LIZJ;
        if (!c852220Xbw.LIZLLL) {
            return false;
        }
        C0XYD c0xyd = this.LIZIZ;
        Bundle bundleLIZ = c852220Xbw.LIZ();
        this.LIZJ.getClass();
        bundleLIZ.putInt("current_scene", EnumC852660Xce.CHANGE_PASSWORD.getValue());
        bundleLIZ.putInt("next_page", this.LIZJ.LIZIZ().getValue());
        c0xyd.fo(bundleLIZ);
        return true;
    }

    public C0XYP(Fragment fragment, C0XYD c0xyd, JSONObject jSONObject) {
        super(fragment, c0xyd);
        this.LIZJ = new C852220Xbw(jSONObject, c0xyd.getMobParams());
    }
}
