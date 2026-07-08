package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.09e2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2420009e2 {
    public Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
        return null;
    }

    public void LIZLLL(Uri uri, Intent intent, boolean z) {
    }

    public void LJ(Activity activity, Uri uri, boolean z) {
    }

    public boolean LJFF(Uri uri) {
        return false;
    }

    public boolean LJII(String str, String str2) {
        return false;
    }

    public Uri LJIIIZ(Activity activity, Uri uri) {
        return null;
    }

    public String LIZJ(boolean z, Uri uri) {
        return ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJIJIIJI(uri);
    }

    public boolean LJIIIIZZ(String str, String str2, String str3) {
        return LJII(str2, str3);
    }

    public boolean LJI(Uri uri, String str, String str2, String str3) {
        return LJIIIIZZ(str, str2, str3);
    }

    public Intent LIZIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
        return LIZ(activity, uri, str, str2, str3, z);
    }
}
