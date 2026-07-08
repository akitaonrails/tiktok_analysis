package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11WF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11WF {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public String LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public int LIZLLL = -1;
    public EnumC1092600eXS LJII = EnumC1092600eXS.WEBVIEW;

    public void LIZ(Intent intent) {
        String string;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("original url:");
        Uri data = intent.getData();
        Bundle extras = null;
        if (data != null) {
            string = data.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            stringExtra = intent.getStringExtra("url");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LIZ = stringExtra;
        try {
            stringExtra2 = intent.getStringExtra("add_button_show");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        this.LIZJ = Intrinsics.LJFF(stringExtra2, "1");
        try {
            stringExtra3 = intent.getStringExtra("title");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra3 = null;
        }
        this.LIZIZ = stringExtra3;
        this.LIZLLL = intent.getIntExtra("anchor_type", -1);
        try {
            stringExtra4 = intent.getStringExtra("anchor_sub_type");
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            stringExtra4 = null;
        }
        this.LJ = stringExtra4;
        try {
            if (Intrinsics.LJFF(UriProtector.parse(this.LIZ).getHost(), "lynxview")) {
                this.LJII = EnumC1092600eXS.LYNX;
            }
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            Pair[] pairArr = new Pair[1];
            try {
                extras = intent.getExtras();
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            pairArr[0] = new Pair("data", String.valueOf(extras));
            C1AF0.LIZLLL("general_anchor_url_null", C2097608Jq.LJIIJ(pairArr));
        }
    }
}
