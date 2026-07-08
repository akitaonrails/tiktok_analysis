package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0lur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1376190lur {
    public abstract void LJ(Context context, C1376210lut c1376210lut);

    public boolean LJFF() {
        return false;
    }

    public final void LJJ(final Activity activity, final C1376210lut c1376210lut) {
        SharePackage sharePackage;
        Bundle bundle;
        if (LJFF() && (sharePackage = c1376210lut.LIZJ) != null && (bundle = sharePackage.extras) != null) {
            bundle.putBoolean("should_keep_loop_collection_sign", true);
        }
        C15O7.LIZJ(new Callable() { // from class: X.0luq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("BaseDownloadOnAwemeAction@2297.startExecuteDownloadAction$1");
                if (C2222691Bz1.LJIIIZ()) {
                    C19633311rf c19633311rfLIZJ = C1238740iLA.LIZJ("user_growth");
                    if (c19633311rfLIZJ.LIZ(-1, "japan_share_download_dot") != 1) {
                        c19633311rfLIZJ.LJ("japan_share_download_dot", 1);
                    }
                }
                Boolean bool = Boolean.TRUE;
                C1C7U.LIZIZ("BaseDownloadOnAwemeAction@2297.startExecuteDownloadAction$1");
                return bool;
            }
        }).LJ(new InterfaceC2385309Wh() { // from class: X.0lus
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("BaseDownloadOnAwemeAction@2297.startExecuteDownloadAction$2");
                if (C09UZ.LIZLLL(c15o7)) {
                    C1440005kM.LIZ(new C453940Hr6(true, false, 6));
                    TokenCert tokenCertWith = TokenCert.Companion.with("bpea-request_download_aweme_storage_permission");
                    Activity activity2 = activity;
                    C0XJW.LIZ(activity2, tokenCertWith, AFwS209S0000000_21.get$arr$(598), new AwS265S0300000_21(activity2, this, c1376210lut, 28), AFwS229S0000000_2.get$arr$(836));
                }
                C1C7U.LIZIZ("BaseDownloadOnAwemeAction@2297.startExecuteDownloadAction$2");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public void LIZ(Activity activity, Context context, Aweme aweme, SharePackage sharePackage, String str, String str2, InterfaceC752010Teh interfaceC752010Teh, boolean z) {
        C1376270luz.LIZ.getClass();
        C1376270luz.LJIIIIZZ = "download";
        C786410Ut5.LJJJI("download_method", str, sharePackage.extras);
        if (!C621180OYa.LIZIZ.LJIIZILJ(context, aweme, str)) {
            return;
        }
        C1376220luu c1376220luu = new C1376220luu();
        c1376220luu.LIZ = interfaceC752010Teh.C7(true);
        c1376220luu.LIZIZ = str;
        c1376220luu.LJ = aweme;
        c1376220luu.LIZLLL = sharePackage;
        c1376220luu.LIZJ = sharePackage.extras.getInt("page_type");
        C1376210lut c1376210lut = new C1376210lut(c1376220luu);
        if (z) {
            LJJ(activity, c1376210lut);
        } else {
            if (!C621180OYa.LIZIZ.LJJL(context, activity, c1376210lut, new AwS635S0100000_21(this, 176))) {
                return;
            }
            LJJ(activity, c1376210lut);
        }
    }
}
