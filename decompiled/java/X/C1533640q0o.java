package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS61S2100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533640q0o {
    public final C1533490q0Z LIZ;
    public int LIZIZ;
    public final C01GW LIZJ;
    public String LIZLLL;
    public Uri LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Pair<String, ? extends Uri> LJIIIIZZ;
    public final String LJIIIZ;
    public boolean LJIIJ;
    public final /* synthetic */ C1534070q1V LJIIJJI;

    public final List<String> LIZ() {
        return (List) this.LIZJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1533640q0o(X.C1534070q1V r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533640q0o.<init>(X.0q1V):void");
    }

    public final void LIZIZ(C1533670q0r c1533670q0r) throws JSONException {
        Object obj;
        String str;
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        C1534070q1V c1534070q1V = this.LJIIJJI;
        String str2 = c1534070q1V.LJII.LIZLLL;
        Map<String, Object> map = c1534070q1V.LIZIZ.LIZ.LJFF;
        String str3 = null;
        if (map != null) {
            obj = map.get("rl_container_uuid");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str3 = (String) obj;
        }
        JSONObject jSONObject = new JSONObject();
        C1534070q1V c1534070q1V2 = this.LJIIJJI;
        jSONObject.put("type", 1);
        jSONObject.put("url", this.LIZLLL);
        jSONObject.put("message", c1533670q0r.getErrorMessage());
        jSONObject.put("code", c1533670q0r.getErrorCode());
        jSONObject.put("http_code", c1533670q0r.getHttpCode());
        if (Intrinsics.LJFF(c1534070q1V2.LIZIZ.LIZ.LJJJJZ, C1534080q1W.LIZ)) {
            str = "ttnet";
        } else {
            str = "downloader";
        }
        jSONObject.put("extra", str);
        C086F c086f = C086F.LIZ;
        AwS61S2100000_23 awS61S2100000_23 = new AwS61S2100000_23(str2, str3, jSONObject, 2);
        c086f.getClass();
        C086F.LJI(awS61S2100000_23);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[Catch: all -> 0x00a1, PHI: r5
      0x006c: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v3 java.lang.String) binds: [B:36:0x0067, B:38:0x006a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00a1, blocks: (B:20:0x002e, B:24:0x004c, B:27:0x0055, B:30:0x005c, B:45:0x0076, B:47:0x007e, B:49:0x008e, B:50:0x0091, B:33:0x0061, B:35:0x0065, B:39:0x006c), top: B:57:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071 A[PHI: r5
      0x0071: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v7 java.lang.String) binds: [B:40:0x006e, B:38:0x006a, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:20:0x002e, B:24:0x004c, B:27:0x0055, B:30:0x005c, B:45:0x0076, B:47:0x007e, B:49:0x008e, B:50:0x0091, B:33:0x0061, B:35:0x0065, B:39:0x006c), top: B:57:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:20:0x002e, B:24:0x004c, B:27:0x0055, B:30:0x005c, B:45:0x0076, B:47:0x007e, B:49:0x008e, B:50:0x0091, B:33:0x0061, B:35:0x0065, B:39:0x006c), top: B:57:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, android.net.Uri> LIZLLL(boolean r9) {
        /*
            r8 = this;
            java.lang.String r5 = ""
            X.0q0Z r0 = r8.LIZ
            boolean r0 = r0.LJJI
            r7 = 0
            if (r0 != 0) goto La
            return r7
        La:
            if (r9 == 0) goto L11
            kotlin.Pair<java.lang.String, ? extends android.net.Uri> r0 = r8.LJIIIIZZ
            if (r0 != 0) goto L11
            return r7
        L11:
            com.bytedance.forest.Forest$Companion r1 = com.bytedance.forest.Forest.Companion
            X.0q0p r0 = r1.getGlobalConfig()
            if (r0 == 0) goto Lbc
            X.0q0s r4 = r0.LJI
            if (r4 == 0) goto Lbc
            boolean r0 = r4.LIZ
            if (r0 == 0) goto Lbc
            X.0q0p r0 = r1.getGlobalConfig()
            if (r0 == 0) goto Lbc
            X.0q0t r2 = r0.LIZ()
            if (r2 == 0) goto Lbc
            r3 = 1
            android.net.Uri r0 = r8.LJ     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "/obj/"
            java.lang.String r1 = kotlin.text.a0.LJJLIL(r1, r0, r5)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = "/"
            java.lang.String r6 = kotlin.text.a0.LJJZ(r1, r0, r5)     // Catch: java.lang.Throwable -> La1
            boolean r0 = kotlin.text.a0.LJJJIL(r6)     // Catch: java.lang.Throwable -> La1
            r0 = r0 ^ 1
            if (r0 == 0) goto La0
            if (r6 == 0) goto La0
            if (r9 != 0) goto L61
            java.util.List<java.lang.String> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> La1
            boolean r0 = r0.contains(r6)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L55
            return r7
        L55:
            X.0q0u r0 = r2.LIZ     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r0.LIZIZ     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto L5c
            r5 = r7
        L5c:
            java.lang.String r4 = r0.LIZ     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L71
            goto L72
        L61:
            X.0q0u r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L9f
            java.lang.String r5 = r0.LIZIZ     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto L6c
            r5 = r7
            if (r0 == 0) goto L71
        L6c:
            java.lang.String r4 = r0.LIZ     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L71
            goto L72
        L71:
            r4 = r7
        L72:
            if (r5 != 0) goto L76
            if (r4 == 0) goto L9f
        L76:
            android.net.Uri r0 = r8.LJ     // Catch: java.lang.Throwable -> La1
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch: java.lang.Throwable -> La1
            if (r5 == 0) goto L8c
            android.net.Uri r0 = r8.LJ     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> La1
            r0 = 0
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r1, r6, r5, r0)     // Catch: java.lang.Throwable -> La1
            r2.path(r0)     // Catch: java.lang.Throwable -> La1
        L8c:
            if (r4 == 0) goto L91
            r2.authority(r4)     // Catch: java.lang.Throwable -> La1
        L91:
            android.net.Uri r2 = r2.build()     // Catch: java.lang.Throwable -> La1
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> La1
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> La1
            return r1
        L9f:
            return r7
        La0:
            return r7
        La1:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "failed to handle url "
            r1.append(r0)
            java.lang.String r0 = r8.LIZLLL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "FETCH_TASK"
            X.C1534250q1n.LIZJ(r0, r1, r2, r3)
        Lbc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533640q0o.LIZLLL(boolean):kotlin.Pair");
    }

    public final boolean LJ(C1533670q0r c1533670q0r) throws JSONException {
        if (!this.LJIIJ) {
            return false;
        }
        if (this.LJI == 1) {
            this.LJI = 2;
            Pair<String, ? extends Uri> pair = this.LJIIIIZZ;
            if (pair != null) {
                LIZIZ(c1533670q0r);
                LIZJ(pair.getSecond(), pair.getFirst());
                LIZ().add(this.LIZLLL);
                return true;
            }
            LIZIZ(c1533670q0r);
            C1533490q0Z c1533490q0Z = this.LIZ;
            LIZJ(c1533490q0Z.LJJJJL, c1533490q0Z.LJJJJIZL);
            LIZ().add(this.LIZLLL);
            return true;
        }
        Pair<String, Uri> pairLIZLLL = LIZLLL(true);
        if (pairLIZLLL != null) {
            LIZIZ(c1533670q0r);
            this.LJIIIIZZ = null;
            LIZJ(pairLIZLLL.getSecond(), pairLIZLLL.getFirst());
            LIZ().add(this.LIZLLL);
            return true;
        }
        if (this.LJII == 1) {
            this.LJII = 2;
        }
        this.LJIIIIZZ = null;
        if (!Intrinsics.LJFF(this.LIZLLL, this.LIZ.LJJJJIZL) && this.LIZIZ == 0) {
            C1533490q0Z c1533490q0Z2 = this.LIZ;
            LIZJ(c1533490q0Z2.LJJJJL, c1533490q0Z2.LJJJJIZL);
            LIZ().add(this.LIZLLL);
            return true;
        }
        List<String> list = this.LIZ.LJJJJZI;
        if (this.LIZIZ >= list.size()) {
            this.LJIIJ = false;
            return false;
        }
        String str = (String) ListProtector.get(list, this.LIZIZ);
        this.LIZIZ++;
        int i = this.LIZ.LJJIJ + 1;
        if (i < 1) {
            i = 1;
        }
        this.LJFF = i;
        Uri uriBuild = this.LJ.buildUpon().authority(str).build();
        this.LJ = uriBuild;
        this.LIZLLL = uriBuild.toString();
        LIZ().add(this.LIZLLL);
        return true;
    }

    public final void LIZJ(Uri uri, String str) {
        this.LIZLLL = str;
        this.LJ = uri;
        int i = 1;
        int i2 = this.LIZ.LJJIJ + 1;
        if (i2 >= 1) {
            i = i2;
        }
        this.LJFF = i;
    }
}
