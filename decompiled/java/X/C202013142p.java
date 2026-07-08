package X;

import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;

/* JADX INFO: renamed from: X.142p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202013142p {
    public InterfaceC202020142w LIZ = C202018142u.LIZ;
    public AbstractC202016142s LIZIZ;

    public C202013142p() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            MediaStore.getPickImagesMaxLimit();
        }
        this.LIZIZ = C202017142t.LIZ;
    }
}
