package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0XBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844740XBw extends C0XC4 {
    public boolean LJII;
    public final C844770XBz LJIIIIZZ;
    public final C844630XBl LJIIIZ;
    public final C0XCH LJIIJ;

    @Override // X.C0XC4
    public final String LIZJ() {
        return "ac";
    }

    @Override // X.C0XC4
    public final void LJ() {
    }

    @Override // X.C0XC4
    public final void LJFF() {
    }

    @Override // X.C0XC4
    public final long LJI() {
        return 0L;
    }

    @Override // X.C0XC4
    public final boolean LIZIZ() {
        String string;
        Pair<String, Boolean> pairLIZ;
        String strLIZ = this.LJIIIZ.LLILLJJLI.LLILLJJLI;
        C0XCH c0xch = this.LJIIJ;
        if (c0xch != null) {
            strLIZ = c0xch.LIZ(this.LIZ, new StringBuilder(strLIZ), true, C0XDP.L0);
        }
        StringBuilder sb = new StringBuilder(strLIZ);
        try {
            float rawOffset = (TimeZone.getDefault().getRawOffset() * 1.0f) / 3600000.0f;
            if (rawOffset < -12.0f) {
                rawOffset = -12.0f;
            } else if (rawOffset > 12.0f) {
                rawOffset = 12.0f;
            }
            C23069092d.LIZIZ(sb, "req_id", C844700XBs.LIZ.LIZIZ(new Object[0]));
            if (!this.LJIIIZ.LL && (pairLIZ = C0WV3.LIZ(this.LIZ, this.LJIIIIZZ)) != null && !TextUtils.isEmpty((CharSequence) pairLIZ.first)) {
                C23069092d.LIZIZ(sb, "google_aid", (String) pairLIZ.first);
                C23069092d.LIZIZ(sb, "gaid_limited", ((Boolean) pairLIZ.second).booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
            }
            this.LJIIIIZZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(rawOffset);
            sbLIZ.append("");
            C23069092d.LIZIZ(sb, "timezone", C2188811AlT.LIZIZ(sbLIZ));
            String str = this.LJIIIIZZ.LJ;
            if (!TextUtils.isEmpty(str)) {
                C23069092d.LIZIZ(sb, "package", str);
                C23069092d.LIZIZ(sb, "real_package_name", this.LIZ.getPackageName());
            }
            try {
                C820710WHl c820710WHl = this.LJIIIIZZ.LJJIIJ;
                C23069092d.LIZIZ(sb, "carrier", c820710WHl != null ? c820710WHl.LIZLLL() : "");
                C820710WHl c820710WHl2 = this.LJIIIIZZ.LJJIIJ;
                C23069092d.LIZIZ(sb, "mcc_mnc", c820710WHl2 != null ? c820710WHl2.LIZJ() : "");
                C820710WHl c820710WHl3 = this.LJIIIIZZ.LJJIIJ;
                C23069092d.LIZIZ(sb, "sim_region", c820710WHl3 != null ? c820710WHl3.LJ() : "");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C23069092d.LIZIZ(sb, "app_version_minor", this.LJIIIIZZ.LJIILLIIL.LIZIZ);
            C23069092d.LIZIZ(sb, "custom_bt", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            this.LJIIIIZZ.getClass();
            string = sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C844830XCf.LIZLLL(th);
            string = sb.toString();
        }
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            C0XCI c0xci = this.LJ;
            if (c0xci != null) {
                c0xci.LIZJ.LIZ(true);
            }
            C0XCD c0xcdLIZ = C0XC2.LIZJ().LIZ(this.LJIIIIZZ.LIZ);
            if (c0xcdLIZ != null && c0xcdLIZ.LIZ <= 0) {
                c0xcdLIZ.LIZ = System.currentTimeMillis();
            }
            HashMap map = new HashMap();
            C844770XBz c844770XBz = this.LJIIIIZZ;
            boolean zLIZ = C23069092d.LIZ(c844770XBz.LIZIZ, string, c844770XBz.LJJ, c844770XBz.LJIIZILJ, this.LJII, map);
            if (c0xcdLIZ != null && c0xcdLIZ.LIZIZ <= 0) {
                c0xcdLIZ.LIZIZ = System.currentTimeMillis();
            }
            if (zLIZ) {
                this.LJII = true;
            }
            C0XCI c0xci2 = this.LJ;
            if (c0xci2 != null) {
                c0xci2.LIZJ.LIZ(false);
            }
            if (zLIZ) {
                this.LJFF = true;
            }
            return zLIZ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0XCI c0xci3 = this.LJ;
            if (c0xci3 != null) {
                c0xci3.LIZJ.LIZ(false);
            }
            throw th2;
        }
    }

    @Override // X.C0XC4
    public final void LIZ() {
        C0XCD c0xcdLIZ = C0XC2.LIZJ().LIZ(this.LJIIIIZZ.LIZ);
        C844770XBz c844770XBz = this.LJIIIIZZ;
        SharedPreferences sharedPreferencesLIZ = C844580XBg.LIZ(c844770XBz.LIZJ, c844770XBz);
        SharedPreferences.Editor editorEdit = sharedPreferencesLIZ.edit();
        if (!sharedPreferencesLIZ.getBoolean("is_first_activate_for_app", false) && editorEdit != null) {
            editorEdit.putBoolean("is_first_activate_for_app", true);
            editorEdit.apply();
            c0xcdLIZ.LIZLLL = true;
        }
        C844770XBz c844770XBz2 = this.LJIIIIZZ;
        C0XC2.LIZJ().LIZ(c844770XBz2.LIZ).LIZIZ(c844770XBz2, "dr_active_result");
    }

    @Override // X.C0XC4
    public final long[] LIZLLL() {
        return C844730XBv.LJIILLIIL;
    }

    @Override // X.C0XC4
    public final void LJII(boolean z) {
        C0XC2.LIZJ().LIZ(this.LJIIIIZZ.LIZ).LJI = z;
    }

    @Override // X.C0XC4
    public final void LJIIIIZZ(int i) {
        C0XCD c0xcdLIZ = C0XC2.LIZJ().LIZ(this.LIZIZ.LIZ);
        if (c0xcdLIZ != null) {
            c0xcdLIZ.LIZJ = i;
        }
    }

    public C844740XBw(C844770XBz c844770XBz, C844630XBl c844630XBl) {
        super(c844770XBz.LIZJ, c844770XBz);
        this.LJII = false;
        this.LJIIIIZZ = c844770XBz;
        this.LJIIIZ = c844630XBl;
        C0XCI c0xci = this.LJ;
        if (c0xci != null) {
            this.LJIIJ = c0xci.LJI;
        }
    }
}
