package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.fe.method.SendLogMethod;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059130dfT extends AbstractC1056760dbe implements InterfaceC1061400dj8 {
    @Override // X.InterfaceC1061400dj8
    public final void LIZ(String str) {
    }

    @Override // X.AbstractC1056750dbd
    public final List<String> LIZJ() {
        return C1059320dfm.LIZ();
    }

    @Override // X.AbstractC1056750dbd
    public final boolean LJ() {
        return C19273110af.LIZ().enableBoe() && C19273110af.LIZ().enableBoeJsbBypass();
    }

    public C1059130dfT(Context context) {
        new AbstractC1056750dbd(context) { // from class: X.0dbe
        };
        new C1BRZ();
    }

    @Override // X.AbstractC1056750dbd, X.InterfaceC1048350dO5
    public final void LIZIZ(JSONObject jSONObject) throws JSONException {
        super.LIZIZ(jSONObject);
        if (TextUtils.equals(null, "1") && !TextUtils.isEmpty(null)) {
            return;
        }
        C1027990crF.LIZ.getClass();
    }

    public final void LJFF(C2203531BLz c2203531BLz) {
        SendLogMethod sendLogMethod = new SendLogMethod(c2203531BLz.LIZJ, this);
        sendLogMethod.attach(this.LLILLJJLI);
        c2203531BLz.LIZIZ("sendLog", sendLogMethod);
    }

    @Override // X.AbstractC1056750dbd
    public final List<String> LIZLLL(List<String> list, boolean z) {
        List<String> listLIZIZ = C1059320dfm.LIZIZ(list, z);
        this.LLILZ = listLIZIZ;
        return listLIZIZ;
    }
}
