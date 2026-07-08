package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0zr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911970zr1 {
    public String LJ;
    public C1911980zr2 LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public String LIZ = "";
    public List<String> LIZIZ = C13BV.INSTANCE;
    public String LIZJ = "";
    public final Keva LIZLLL = Keva.getRepo("pendant_lottie_keva");
    public final List<InterfaceC1912070zrB> LJII = new ArrayList();
    public final Object LJIIIZ = new Object();

    public final void LIZ() {
        if (this.LJ == null) {
            this.LJ = this.LIZLLL.getString("previous_activity_id", "");
        }
        C2137908Zd.LIZJ.LIZLLL(new C1911980zr2(this.LJ, this.LIZIZ, this.LIZJ).LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0VSP LIZJ(int r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r5.LJI
            if (r0 == 0) goto L57
            X.0zr2 r4 = r5.LJFF
            if (r4 == 0) goto L55
            if (r6 == 0) goto L48
            r0 = 1
            if (r6 == r0) goto L45
            r0 = 2
            if (r6 == r0) goto L42
            r0 = 3
            if (r6 != r0) goto L48
            java.lang.String r0 = "coin2"
        L15:
            X.0VSJ r3 = new X.0VSJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = ".json"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r4.LIZLLL()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.<init>(r0)
            goto L4b
        L42:
            java.lang.String r0 = "campagin_reward_lottie"
            goto L15
        L45:
            java.lang.String r0 = "new_year_normal_button_collapsed"
            goto L15
        L48:
            java.lang.String r0 = "new_year_normal_button"
            goto L15
        L4b:
            X.0VSP r0 = new X.0VSP     // Catch: java.lang.Throwable -> L51
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L51
            return r0
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            r0 = 0
            return r0
        L57:
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "HAS NOT inited"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1911970zr1.LIZJ(int):X.0VSP");
    }

    public final void LIZIZ(String str, String str2, List list) {
        String str3;
        if (this.LJI) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "default_activity";
        } else {
            str3 = str;
        }
        this.LIZ = str3;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LJI = true;
        this.LIZLLL.storeString("previous_activity_id", str3);
        this.LJFF = new C1911980zr2(this.LIZ, list, str2);
        String string = this.LIZLLL.getString("previous_activity_id", "");
        this.LJ = string;
        if (!TextUtils.isEmpty(string) && !TextUtils.equals(str, this.LJ)) {
            LIZ();
        }
    }
}
