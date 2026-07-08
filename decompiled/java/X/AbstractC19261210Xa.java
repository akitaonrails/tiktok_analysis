package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19261210Xa implements InterfaceC19262510Xn {
    public EnumC19261510Xd LIZIZ;
    public boolean LIZJ;
    public EnumC19261510Xd LJ;
    public long LJFF;
    public boolean LIZ = true;
    public volatile boolean LIZLLL = true;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // X.InterfaceC19262510Xn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.LIZJ
            if (r0 != 0) goto L15
            r0 = 1
            r3.LIZJ = r0
            X.11Re r2 = X.C2214201BlK.LIZLLL()
            Y.AfS185S0100000_16 r1 = new Y.AfS185S0100000_16
            r0 = 35
            r1.<init>(r3, r0)
            r2.LJJLJLI(r1)
        L15:
            boolean r0 = r3.LIZLLL
            if (r0 == 0) goto L45
            X.10Xd r0 = r3.LJ
            if (r0 != 0) goto L45
            int r0 = r4.hashCode()
            switch(r0) {
                case -2110102721: goto L88;
                case -1915565709: goto L7d;
                case -1122151764: goto L72;
                case 163197832: goto L67;
                case 683138905: goto L5c;
                case 1231814645: goto L51;
                case 1685925711: goto L46;
                default: goto L24;
            }
        L24:
            X.10Xd r2 = X.EnumC19261510Xd.NONE
        L26:
            X.10Xd r0 = X.EnumC19261510Xd.NONE
            if (r2 != r0) goto L43
            X.10Xd r2 = X.EnumC19261510Xd.MAIN
            X.10Xd r0 = r3.LIZIZ
            if (r0 != 0) goto L43
            r3.LIZIZ = r2
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            java.lang.String r0 = "class_name"
            r1.LJIIIIZZ(r0, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "unknown_launch_method"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L43:
            r3.LJ = r2
        L45:
            return
        L46:
            java.lang.String r0 = "com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            X.10Xd r2 = X.EnumC19261510Xd.DEEP_LINK
            goto L26
        L51:
            java.lang.String r0 = "com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            X.10Xd r2 = X.EnumC19261510Xd.DEEP_LINK
            goto L26
        L5c:
            java.lang.String r0 = "com.ss.android.ugc.aweme.main.MainActivity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            X.10Xd r2 = X.EnumC19261510Xd.MAIN
            goto L26
        L67:
            java.lang.String r0 = "com.ss.android.ugc.aweme.journey.StubMainActivity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            X.10Xd r2 = X.EnumC19261510Xd.MAIN
            goto L26
        L72:
            java.lang.String r0 = "com.ss.android.ugc.aweme.share.SystemShareActivity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            X.10Xd r2 = X.EnumC19261510Xd.OPEN_SHARE
            goto L26
        L7d:
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            X.10Xd r2 = X.EnumC19261510Xd.SHORTCUT
            goto L26
        L88:
            java.lang.String r0 = "com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L24
            X.10Xd r2 = X.EnumC19261510Xd.WIDGET
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19261210Xa.LJ(java.lang.String):void");
    }

    @Override // X.InterfaceC19262510Xn
    public final void LJI(EnumC19261510Xd enumC19261510Xd, String str) {
        this.LIZLLL = false;
        this.LJ = null;
        String value = enumC19261510Xd.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("launch_from", str);
        LJII(c2344009Gk, null, value);
    }

    public final void LJII(C2344009Gk c2344009Gk, Boolean bool, String str) {
        int i;
        String str2;
        String strLJIILJJIL;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        if (bool != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            if (this.LIZ) {
                this.LIZ = false;
                i = 1;
            }
            i = 0;
        }
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("launch_method", str);
        c2344009Gk.LJIIIIZZ("c_launch_method", str);
        c2344009Gk.LIZJ(i, "is_cold_launch");
        c2344009Gk.LJIIIIZZ("from_channel", "user");
        C844470XAv.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("device_ram_type", String.valueOf(C2193808ie.LIZIZ(C844470XAv.LIZ())));
        c2344009Gk.LJIIIIZZ("device_go_type", String.valueOf(C2193808ie.LIZ()));
        c2344009Gk.LJIIIIZZ("is_gp_large_screen", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("is_pad", String.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad()));
        try {
            C786410Ut5.Y3(C844470XAv.LIZ().getPackageManager(), "com.lemon.lvoverus", 0);
            str2 = "3";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                C786410Ut5.Y3(C844470XAv.LIZ().getPackageManager(), "com.lemon.lvoverseas", 0);
                str2 = "2";
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                str2 = "1";
            }
        }
        c2344009Gk.LJIIIIZZ("cc_mode", str2);
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ())) == null) {
            strLJIILJJIL = "";
        }
        c2344009Gk.LJIIIIZZ("locale", strLJIILJJIL);
        C20684815ws.LJIILLIIL("launch_log", c2344009Gk.LIZ);
    }
}
