package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756190TlR {
    public static final C756190TlR LIZ = new C756190TlR();

    public static void LIZ(Context context, OpenBAPolicyWebViewEvent openBAPolicyWebViewEvent) {
        boolean z;
        boolean z2;
        FragmentManager supportFragmentManager;
        if (!(context instanceof C19EG)) {
            C1AF0.LIZJ("slotGate's context is not FragmentActivity");
            return;
        }
        C756220TlU c756220TlU = new Object() { // from class: X.0TlU
        };
        String str = openBAPolicyWebViewEvent.schema;
        String str2 = openBAPolicyWebViewEvent.title;
        c756220TlU.getClass();
        String host = UriProtector.parse(str).getHost();
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C756380Tlk c756380Tlk = new C756380Tlk(context, str, z);
        C0OM1 c0om1 = new C0OM1();
        if (str2.length() > 0 && host != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = str2;
            c1250250idj.LIZLLL = host;
            c0om1.LIZJ = c1250250idj;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(c756380Tlk, 967));
        c0om1.LIZIZ(c1251150ifB);
        if (str2.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0om1.LIZLLL = z2;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = c756380Tlk;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZJ = (int) (((double) C14KQ.LIZJ(context)) * 0.73d);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLIZJ;
        tuxSheet2.LLJJIJIIJIL = false;
        tuxSheet2.LLJLL = true;
        tuxSheet2.LLJLLL = false;
        tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC786080UsY(c756380Tlk, 44);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxSheet2.show(supportFragmentManager, "demo");
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c756380Tlk.LLILLJJLI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r3 = 1
            java.lang.String r2 = "during_live"
            java.lang.String r1 = "before_live"
            switch(r0) {
                case -1884023019: goto L29;
                case -1095106132: goto L14;
                case -522623958: goto Ld;
                case 387613079: goto L1b;
                default: goto Lc;
            }
        Lc:
            return
        Ld:
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L32
            return
        L14:
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L23
            return
        L1b:
            java.lang.String r0 = "before_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lc
        L23:
            if (r4 >= r3) goto Lc
            X.C756200TlS.LIZIZ(r5, r6, r7, r1)
            return
        L29:
            java.lang.String r0 = "during_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L32
            return
        L32:
            if (r4 >= r3) goto Lc
            X.C756200TlS.LIZIZ(r5, r6, r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C756190TlR.LIZJ(int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            java.lang.String r2 = "during_live"
            java.lang.String r1 = "before_live"
            switch(r0) {
                case -1884023019: goto L29;
                case -1095106132: goto Lc;
                case -522623958: goto L22;
                case 387613079: goto L13;
                default: goto Lb;
            }
        Lb:
            return
        Lc:
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L1b
            return
        L13:
            java.lang.String r0 = "before_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lb
        L1b:
            r0 = 1
            if (r3 >= r0) goto Lb
            X.C756200TlS.LIZ(r4, r5, r6, r7, r1)
            return
        L22:
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L32
            return
        L29:
            java.lang.String r0 = "during_live_dialog_item"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L32
            return
        L32:
            X.C756200TlS.LIZ(r4, r5, r6, r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C756190TlR.LIZIZ(int, int, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
