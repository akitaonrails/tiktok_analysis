package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WV7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WV7 {
    public static final GraphRequest LIZ(AccessToken accessToken, Uri uri, C0WVA c0wva) {
        String path = uri.getPath();
        if (u.LJIJI("file", uri.getScheme(), true) && path != null) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new C0VSJ(path), 268435456));
            Bundle bundle = new Bundle(1);
            C786410Ut5.LJJIJL(bundle, "file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, C0WV6.POST, c0wva, 32);
        }
        if (u.LJIJI("content", uri.getScheme(), true)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType2 = new GraphRequest.ParcelableResourceWithMimeType(uri);
            Bundle bundle2 = new Bundle(1);
            C786410Ut5.LJJIJL(bundle2, "file", parcelableResourceWithMimeType2);
            return new GraphRequest(accessToken, "me/staging_resources", bundle2, C0WV6.POST, c0wva, 32);
        }
        throw new C1BJO("The image Uri must be either a file:// or content:// Uri");
    }
}
