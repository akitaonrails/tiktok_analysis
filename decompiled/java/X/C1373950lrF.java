package X;

import Y.ARunnableS29S0400000_21;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: renamed from: X.0lrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1373950lrF extends AbstractC1375080lt4 {
    public final Activity LIZ;
    public final Aweme LIZIZ;
    public final SharePackage LIZJ;
    public final AlertDialogC1377870lxZ LIZLLL;

    @Override // X.AbstractC1375080lt4
    public final void LIZLLL() {
    }

    @Override // X.AbstractC1375080lt4
    public final void LIZ(String str) {
        C1373550lqb c1373550lqb = C1373550lqb.LIZ;
        Activity activity = this.LIZ;
        AlertDialogC1377870lxZ alertDialogC1377870lxZ = this.LIZLLL;
        c1373550lqb.getClass();
        C1373550lqb.LIZIZ(activity, alertDialogC1377870lxZ);
    }

    @Override // X.AbstractC1375080lt4
    public final void LIZIZ(int i) {
        C1373550lqb c1373550lqb = C1373550lqb.LIZ;
        AlertDialogC1377870lxZ alertDialogC1377870lxZ = this.LIZLLL;
        c1373550lqb.getClass();
        if (alertDialogC1377870lxZ.isShowing()) {
            alertDialogC1377870lxZ.LIZJ(i);
        }
    }

    @Override // X.AbstractC1375080lt4
    public void LJ(DownloadInfo downloadInfo) {
        C1373550lqb c1373550lqb = C1373550lqb.LIZ;
        AlertDialogC1377870lxZ alertDialogC1377870lxZ = this.LIZLLL;
        c1373550lqb.getClass();
        alertDialogC1377870lxZ.LIZJ(0);
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            Activity activity = this.LIZ;
            SharePackage sharePackage = this.LIZJ;
            AlertDialogC1377870lxZ alertDialogC1377870lxZ2 = this.LIZLLL;
            c1373540lqa.getClass();
            C786410Ut5.LJLIIL(20000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS29S0400000_21(sharePackage, activity, aweme, alertDialogC1377870lxZ2, 0));
        }
    }

    public C1373950lrF(Activity activity, Aweme aweme, SharePackage sharePackage) {
        String string;
        this.LIZ = activity;
        this.LIZIZ = aweme;
        this.LIZJ = sharePackage;
        C1373550lqb.LIZ.getClass();
        if (C294850Bh5.LIZ()) {
            string = activity.getString(2131825054);
        } else {
            string = activity.getResources().getString(2131846827);
        }
        this.LIZLLL = AlertDialogC1377870lxZ.LIZLLL(activity, string);
    }

    @Override // X.AbstractC1375080lt4
    public void LJFF(String str, String str2, boolean z) {
        C1373550lqb c1373550lqb = C1373550lqb.LIZ;
        Activity activity = this.LIZ;
        AlertDialogC1377870lxZ alertDialogC1377870lxZ = this.LIZLLL;
        c1373550lqb.getClass();
        C1373550lqb.LIZIZ(activity, alertDialogC1377870lxZ);
    }
}
