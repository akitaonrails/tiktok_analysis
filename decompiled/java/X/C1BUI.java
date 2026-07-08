package X;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BUI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BUI {
    public final String LIZ;
    public C1BUN LIZIZ;
    public C1045790dJx LIZJ;
    public C1045770dJv LIZLLL;
    public C1BUL LJ;
    public long LJFF;

    public C1BUI(String str) {
        LJ();
        this.LIZ = str;
        this.LIZIZ = new C1BUN(null);
    }

    public void LIZJ(C1BUP c1bup, C1046930dLn c1046930dLn) {
        LIZLLL(c1bup, c1046930dLn, null);
    }

    public void LJFF() {
        this.LIZIZ.clear();
    }

    public final WebView LJI() {
        return this.LIZIZ.get();
    }

    public void LJII() {
    }

    public final void LJ() {
        this.LJFF = System.nanoTime();
        this.LJ = C1BUL.AD_STATE_IDLE;
    }

    public final void LIZIZ(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C1287890jcR.LIZIZ(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C1287860jcO.LIZ.LIZ(LJI(), "setLastActivity", jSONObject);
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        C1287860jcO.LIZ.LIZ(LJI(), "publishMediaEvent", str, jSONObject, this.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1BUP r10, X.C1046930dLn r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BUI.LIZLLL(X.1BUP, X.0dLn, org.json.JSONObject):void");
    }
}
