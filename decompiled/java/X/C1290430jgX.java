package X;

import j27.s;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1290430jgX {
    public final String LIZ = "x_audio_error";
    public final int LIZIZ;
    public final WeakReference<s> LIZJ;

    public final void LIZ(JSONObject jSONObject) {
        C1298720jtu c1298720jtu;
        s sVar = this.LIZJ.get();
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(this.LIZIZ, "errorReport");
            c1289960jfm.LIZIZ(C786410Ut5.J3(jSONObject), "category");
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    public C1290430jgX(int i, s sVar) {
        this.LIZIZ = i;
        this.LIZJ = new WeakReference<>(sVar);
    }
}
