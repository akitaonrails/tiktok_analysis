package X;

import Y.ACallableS422S0100000_16;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1027250cq3 extends AbstractC1027370cqF {
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1045));

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() {
        String strLJJIFFI;
        C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
        c1027460cqO.LJI("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", "begin", String.valueOf(LJ().LIZ.LIZJ));
        Intent intent = (Intent) this.LIZJ.getValue();
        String strLJJIFFI2 = LJ().LIZJ.LIZ;
        String str = TextUtils.isEmpty(LJ().LIZJ.LIZJ) ? LJ().LJ.LIZ : LJ().LIZJ.LIZJ;
        boolean z = false;
        if (LJ().LIZJ.LIZLLL) {
            C1024550clh c1024550clh = C1024550clh.LIZ;
            if (strLJJIFFI2 != null) {
                if (a0.LJJIIZI(strLJJIFFI2, "__back_url__", false)) {
                    String string = (str == null || str.length() <= 0) ? strLJJIFFI2 : UriProtector.parse(strLJJIFFI2).buildUpon().appendQueryParameter("tag", str).build().toString();
                    if (string != null) {
                        strLJJIFFI = u.LJJIFFI(string, "__back_url__", Uri.encode(C1024550clh.LIZIZ), false);
                    }
                } else {
                    strLJJIFFI = strLJJIFFI2;
                }
                if (strLJJIFFI != null) {
                    strLJJIFFI2 = strLJJIFFI;
                }
            }
            C1024550clh c1024550clh2 = C1024550clh.LIZ;
            C989200bqg<C1024500clc> c989200bqg = new C989200bqg<C1024500clc>() { // from class: X.0cld
                {
                    new C1024500clc();
                }
            };
            new AwS130S1100000_16(this, str, 32).invoke(c989200bqg.LIZ);
            C1024500clc c1024500clc = c989200bqg.LIZ;
            c1024550clh2.getClass();
            C1024550clh.LIZJ = c1024500clc;
        } else if (a0.LJJIIZI(strLJJIFFI2, "__back_url__", false)) {
            strLJJIFFI2 = u.LJJIFFI(strLJJIFFI2, "__back_url__", Uri.encode(UriProtector.parse(InterfaceC1029360ctS.LIZ).buildUpon().appendQueryParameter("tag", str).toString()), false);
            C15O7.LIZJ(new ACallableS422S0100000_16(this, 10));
        }
        Uri uriBuild = UriProtector.parse(strLJJIFFI2);
        if (!TextUtils.isEmpty(LJ().LIZ.LJIIIIZZ)) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("source_aid", LJ().LIZ.LJIIIIZZ).build();
        }
        intent.setData(uriBuild);
        c1027460cqO.LJI("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", "startActivitySafely", String.valueOf(LJ().LIZ.LIZJ));
        Context contextLIZLLL = LIZLLL();
        c1027460cqO.LJI("ad_lynx_download_WebUrlHandler_startActivity", "begin", null);
        if (contextLIZLLL != null) {
            Activity activityLIZ = C1388190mED.LIZ(contextLIZLLL);
            if (activityLIZ != null) {
                contextLIZLLL = activityLIZ;
            }
            if (!(contextLIZLLL instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                c1027460cqO.LJI("ad_lynx_download_WebUrlHandler_startActivity", "try", null);
                AbstractC1027370cqF.LIZJ(contextLIZLLL, intent);
                z = true;
                return true;
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C1027460cqO.LIZIZ.LJI("ad_lynx_download_WebUrlHandler_startActivity", "fail", null);
                return z;
            } catch (SecurityException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
                C1027460cqO.LIZIZ.LJI("ad_lynx_download_WebUrlHandler_startActivity", "fail", null);
                return z;
            }
        }
        return z;
    }

    @Override // X.InterfaceC1027390cqH
    public boolean LIZ() {
        if (LJ().LIZJ.LIZIZ || TextUtils.isEmpty(LJ().LIZJ.LIZ)) {
            return false;
        }
        return C2162308dZ.LJ(LIZLLL(), (Intent) this.LIZJ.getValue());
    }
}
