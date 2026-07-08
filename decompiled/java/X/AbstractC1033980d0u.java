package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1033980d0u {
    public final InterfaceC1034260d1M LL;
    public final HashMap<Integer, AbstractC1034200d1G> LLILLJJLI = new HashMap<>();
    public final C1034080d14 LLILLL = new C1034080d14();

    public void LIZLLL() {
    }

    public void LJFF() {
    }

    public void LJIIIIZZ(int i) {
    }

    public void LJIIIZ(int i) {
    }

    public void LJI() {
        this.LLILLJJLI.clear();
        this.LLILLL.LIZIZ = false;
    }

    public void LJII() {
        this.LLILLL.getClass();
    }

    public AbstractC1033980d0u(InterfaceC1034260d1M interfaceC1034260d1M) {
        this.LL = interfaceC1034260d1M;
    }

    public final C1033970d0t LIZIZ(int i) {
        return this.LL.LIZLLL(i);
    }

    public void LIZJ(C0SCK c0sck) {
        if (c0sck instanceof C0SCH) {
            this.LLILLJJLI.put(Integer.valueOf(((C0SCH) c0sck).LIZ), C1034210d1H.LIZ);
        } else {
            if (!(c0sck instanceof C0SCI)) {
                return;
            }
            this.LLILLJJLI.put(Integer.valueOf(((C0SCI) c0sck).LIZ), C1034220d1I.LIZ);
        }
    }

    public void LJ(Aweme aweme) {
        this.LLILLL.LIZ = aweme;
    }

    public void LJIIJ(int i) {
        this.LLILLL.LIZIZ = true;
    }

    public void LJIIJJI(int i) {
        this.LLILLJJLI.remove(Integer.valueOf(i));
        this.LLILLL.getClass();
    }

    public static JSONObject LJIIL(Context context, C1034120d18 c1034120d18) throws JSONException {
        if (c1034120d18 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", C418440Gaw.LJFF(c1034120d18.LIZ, context));
        jSONObject.put("y", C418440Gaw.LJFF(c1034120d18.LIZIZ, context));
        jSONObject.put("width", C418440Gaw.LJFF(c1034120d18.LIZJ, context));
        jSONObject.put("height", C418440Gaw.LJFF(c1034120d18.LIZLLL, context));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0376 A[LOOP:1: B:98:0x0370->B:100:0x0376, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0350  */
    /* JADX WARN: Type inference failed for: r0v176, types: [X.0d0w] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0d0w] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.0d1C] */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.0d1D] */
    /* JADX WARN: Type inference failed for: r8v10, types: [X.0d1D] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.0d1K] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C1033970d0t r27, int r28, kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1033980d0u.LJIILIIL(X.0d0t, int, kotlin.jvm.functions.Function1):void");
    }
}
