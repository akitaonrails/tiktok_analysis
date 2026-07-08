package X;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.148l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC202165148l implements Serializable {
    public transient Activity LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL = true;
    public boolean LLILZLL = true;

    public abstract void buildUrl(StringBuilder sb);

    public abstract int getEventLimits();

    public abstract String getServiceType();

    public abstract int getType();

    public final String getUrl() {
        String str;
        InterfaceC1800230wwn interfaceC1800230wwn;
        int type = getType();
        String serviceType = getServiceType();
        Activity activity = this.LL;
        C148U c148u = C148U.LIZ;
        String strLIZJ = C148U.LIZJ(serviceType, Intrinsics.LJIIJJI("url", ""));
        String strLIZJ2 = C148U.LIZJ(serviceType, Intrinsics.LJIIJJI("host", ""));
        if (Intrinsics.LJFF(serviceType, "twice_verify")) {
            strLIZJ2 = C202171148r.LIZ().LIZ.LIZIZ();
            C202171148r.LIZ().LIZ.url();
            strLIZJ = "https://www.tiktok.com/verifycenter/authentication";
        }
        String strLJJIFFI = null;
        if (C20221514Aj.LIZ()) {
            AnonymousClass1490 anonymousClass1490 = C1498550p6D.LIZ.LIZ;
            Pair<String, String> pair = anonymousClass1490 == null ? null : anonymousClass1490.LJIIL.get(Integer.valueOf(type));
            if (!TextUtils.isEmpty(pair == null ? null : (String) pair.first)) {
                strLIZJ = (String) pair.first;
            }
            if (!TextUtils.isEmpty(pair == null ? null : (String) pair.first)) {
                strLIZJ2 = (String) pair.second;
            }
            if (activity != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("url = ");
                sbLIZ.append((Object) strLIZJ);
                sbLIZ.append(", verifyHost = ");
                sbLIZ.append((Object) strLIZJ2);
                C786410Ut5.re(Toast.makeText(activity, C2188811AlT.LIZIZ(sbLIZ), 1));
            }
        }
        StringBuilder sb = new StringBuilder(Intrinsics.LJIIJJI("?", strLIZJ));
        if (strLIZJ2 != null) {
            try {
                sb.append("verify_host");
                sb.append("=");
                sb.append(URLEncoder.encode(strLIZJ2, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                C20221514Aj.LIZIZ();
            }
        }
        C202178148y c202178148y = C1498550p6D.LIZ;
        AnonymousClass1490 anonymousClass14902 = c202178148y.LIZ;
        if (anonymousClass14902 != null && (interfaceC1800230wwn = anonymousClass14902.LJJ) != null) {
            interfaceC1800230wwn.LIZ(anonymousClass14902);
        }
        C148N.LIZIZ(sb, "aid", anonymousClass14902 == null ? null : anonymousClass14902.LIZIZ);
        C148N.LIZIZ(sb, "lang", anonymousClass14902 == null ? null : anonymousClass14902.LIZJ);
        C148N.LIZIZ(sb, "app_name", anonymousClass14902 == null ? null : anonymousClass14902.LIZLLL);
        AnonymousClass1490 anonymousClass14903 = c202178148y.LIZ;
        C148N.LIZIZ(sb, "locale", anonymousClass14903 == null ? null : anonymousClass14903.LIZ());
        C148N.LIZIZ(sb, "ch", anonymousClass14902 == null ? null : anonymousClass14902.LJ);
        C148N.LIZIZ(sb, "channel", anonymousClass14902 == null ? null : anonymousClass14902.LJ);
        C148N.LIZIZ(sb, "app_key", anonymousClass14902 == null ? null : anonymousClass14902.LJFF);
        C148N.LIZIZ(sb, "iid", anonymousClass14902 == null ? null : anonymousClass14902.LJI);
        C148N.LIZIZ(sb, "vc", anonymousClass14902 == null ? null : anonymousClass14902.LJII);
        C148N.LIZIZ(sb, "app_version", anonymousClass14902 == null ? null : anonymousClass14902.LJII);
        C148N.LIZIZ(sb, "did", anonymousClass14902 == null ? null : anonymousClass14902.LJIIIIZZ);
        C148N.LIZIZ(sb, "session_id", anonymousClass14902 == null ? null : anonymousClass14902.LJIJJLI);
        C148N.LIZIZ(sb, "region", anonymousClass14902 == null ? null : anonymousClass14902.LIZ);
        C148N.LIZ(sb, "userMode", (anonymousClass14902 == null || !anonymousClass14902.LJIL) ? 258 : 257);
        C148U c148u2 = C148U.LIZ;
        C148N.LIZ(sb, "use_native_report", C148U.LIZLLL("common").optInt("use_native_report", 0) == 1 ? 1 : 0);
        C148N.LIZ(sb, "use_jsb_request", C148U.LIZLLL("common").optInt("use_jsb_request", 0) == 1 ? 1 : 0);
        C148N.LIZ(sb, "orientation", C148N.LJ(activity));
        C148N.LIZIZ(sb, "resolution", C148N.LJI(activity));
        C148N.LIZIZ(sb, "sdk_version", "2.4.2.i18n");
        C148N.LIZIZ(sb, "os_version", Intrinsics.LJIIJJI(Integer.valueOf(C202159148f.LIZJ), ""));
        C148N.LIZIZ(sb, "device_brand", C202159148f.LIZ);
        String str2 = C202159148f.LIZIZ;
        C148N.LIZIZ(sb, "device_model", str2);
        C148N.LIZIZ(sb, "os_name", "Android");
        if (anonymousClass14902 != null && (str = anonymousClass14902.LJII) != null) {
            strLJJIFFI = u.LJJIFFI(str, e3.d, "", false);
        }
        C148N.LIZIZ(sb, "version_code", strLJJIFFI);
        C148N.LIZIZ(sb, "device_type", str2);
        C148N.LIZIZ(sb, "device_platform", "Android");
        C148N.LIZ(sb, "os_type", 0);
        C148N.LIZIZ(sb, "store_region", anonymousClass14902.LJJII);
        if (this.LLILLL) {
            C148N.LIZ(sb, "preload", 1);
        }
        buildUrl(sb);
        return sb.toString();
    }

    public final Activity getActivity() {
        return this.LL;
    }

    public boolean getFullscreen() {
        return this.LLILLJJLI;
    }

    public final boolean getLoading() {
        return this.LLILZLL;
    }

    public final boolean getMask() {
        return this.LLILZIL;
    }

    public final boolean getMaskCancel() {
        return this.LLILZ;
    }

    public final boolean getPreCreate() {
        return this.LLILLL;
    }

    public final void setActivity(Activity activity) {
        this.LL = activity;
    }

    public void setFullscreen(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setLoading(boolean z) {
        this.LLILZLL = z;
    }

    public final void setMask(boolean z) {
        this.LLILZIL = z;
    }

    public final void setMaskCancel(boolean z) {
        this.LLILZ = z;
    }

    public final void setPreCreate(boolean z) {
        this.LLILLL = z;
    }
}
