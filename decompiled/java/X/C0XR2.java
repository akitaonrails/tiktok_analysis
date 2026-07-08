package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0XR2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XR2 implements C0XR6 {
    public final WeakReference<Activity> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ DownloadDelegateActivity LIZJ;

    public C0XR2(DownloadDelegateActivity downloadDelegateActivity, String str) {
        this.LIZJ = downloadDelegateActivity;
        this.LIZIZ = str;
        this.LIZ = new WeakReference<>(this.LIZJ);
    }
}
