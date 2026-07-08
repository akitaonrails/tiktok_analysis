package X;

import Y.ARunnableS131S0100000_31;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.Notify;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1ASW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ASW extends C1ASY {
    public final C1ASX LL;
    public final Aweme LLILLJJLI;
    public final InterfaceC1017820caq LLILLL;
    public EnumC1017980cb6 LLILZ;

    @Override // X.C1ASX
    public final void LJJJJI(String str, int i) {
        String packageName;
        try {
            this.LL.LJJJJI(str, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1022620cia.LIZJ("runCIPCatching", th);
        }
        AwemeRawAd awemeRawAd = this.LLILLJJLI.getAwemeRawAd();
        if (awemeRawAd != null) {
            packageName = awemeRawAd.getPackageName();
        } else {
            packageName = null;
        }
        if (!TextUtils.equals(packageName, str)) {
            C1022620cia.LJ("CIPStartDownloadCallBac", "onError : packageName no same");
            return;
        }
        AwemeRawAd awemeRawAd2 = this.LLILLJJLI.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            this.LLILLL.LJIIIIZZ(awemeRawAd2).LJJIJLIJ(i);
        }
    }

    public C1ASW(C1ASX c1asx, Aweme aweme, C1022120chm c1022120chm) {
        this.LL = c1asx;
        this.LLILLJJLI = aweme;
        this.LLILLL = c1022120chm;
    }

    @Override // X.C1ASX
    public final void LLLZLL(long j, String str, float f) {
        try {
            this.LL.LLLZLL(j, str, f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1022620cia.LIZJ("runCIPCatching", th);
        }
    }

    @Override // X.C1ASX
    public final void O(int i, String str, String str2) {
        String packageName;
        try {
            this.LL.O(i, str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1022620cia.LIZJ("runCIPCatching", th);
        }
        AwemeRawAd awemeRawAd = this.LLILLJJLI.getAwemeRawAd();
        if (awemeRawAd != null) {
            packageName = awemeRawAd.getPackageName();
        } else {
            packageName = null;
        }
        if (!TextUtils.equals(packageName, str)) {
            C1022620cia.LJ("CIPStartDownloadCallBac", "onStateChange : packageName no same");
            return;
        }
        AwemeRawAd awemeRawAd2 = this.LLILLJJLI.getAwemeRawAd();
        if (awemeRawAd2 == null) {
            return;
        }
        EnumC1017980cb6.Companion.getClass();
        EnumC1017980cb6 enumC1017980cb6LIZ = C1018020cbA.LIZ(i);
        switch (C1018000cb8.LIZ[enumC1017980cb6LIZ.ordinal()]) {
            case 1:
                if (this.LLILZ != enumC1017980cb6LIZ) {
                    C1022620cia.LJ("CIPStartDownloadCallBac", "onStateChange : reportDownloadEvent cip_download_start " + str);
                    this.LLILLL.LJIIIIZZ(awemeRawAd2).LJJIJL("cip_download_start");
                }
                break;
            case 2:
                this.LLILLL.LJIIIIZZ(awemeRawAd2).LJJIJL("cip_install_start");
                break;
            case 3:
                this.LLILLL.LJIIIIZZ(awemeRawAd2).LJJIJL("cip_install_success");
                C1701940uOG.LIZIZ().LIZIZ(new ARunnableS131S0100000_31(this, 213));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                throw new C1954807lC();
        }
        this.LLILZ = enumC1017980cb6LIZ;
    }

    public static void LJJJZ(Context context, Notify notify, String str, String str2) {
        C813610Vvr c813610Vvr;
        C815520Vyw c815520Vyw = new C815520Vyw(context);
        if (Build.VERSION.SDK_INT >= 26) {
            if (C810550Vqv.LJIIIIZZ(c815520Vyw.LIZIZ, "AD_CIP") == null) {
                C810550Vqv.LIZ(c815520Vyw.LIZIZ, new NotificationChannel("AD_CIP", "Notification", 3));
            }
            c813610Vvr = new C813610Vvr(context, "AD_CIP");
        } else {
            c813610Vvr = new C813610Vvr(context, null);
        }
        Intent intentLIZIZ = C2162308dZ.LIZIZ(context, str);
        if (intentLIZIZ == null) {
            intentLIZIZ = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        } else {
            intentLIZIZ.setFlags(268468224);
        }
        if (intentLIZIZ != null) {
            C2429209fW.LIZ().appendDataFlowId(intentLIZIZ, 1207964161);
            c813610Vvr.LJI = PendingIntent.getActivity(context, 0, intentLIZIZ, 201326592);
        }
        c813610Vvr.LJJIIZI.icon = R.drawable.c8f;
        c813610Vvr.LJ(notify.getSafeText(notify.systemText, str2));
        c813610Vvr.LJIIJ = 0;
        c813610Vvr.LIZLLL(true);
        if (C838410Wul.LIZ(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        c815520Vyw.LIZJ(100012, c813610Vvr.LIZIZ());
    }
}
