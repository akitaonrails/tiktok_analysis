package X;

import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0fIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121700fIO {
    public static final HashMap<String, WeakReference<Bitmap>> LIZ = new HashMap<>();

    public static C11JF LIZ(ImageModel imageModel, InterfaceC1121710fIP interfaceC1121710fIP) {
        List urls;
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
            if (imageModel.getUri() != null && (weakReference = LIZ.get(imageModel.getUri())) != null && (bitmap = weakReference.get()) != null && !bitmap.isRecycled()) {
                interfaceC1121710fIP.LIZIZ(bitmap);
                return null;
            }
            return (C11JF) C11NZ.LJIJJLI(new C1339390kxV(imageModel, C822690WPb.LIZ(), 1)).LJJLL(new AfS153S0200000_17(interfaceC1121710fIP, imageModel, 35), new AfS186S0100000_17(interfaceC1121710fIP, 194));
        }
        new IllegalArgumentException();
        interfaceC1121710fIP.onFail();
        return null;
    }
}
