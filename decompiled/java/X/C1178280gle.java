package X;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.0gle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178280gle {
    public static final String LIZ(Context context) throws IOException {
        int i;
        Resources resources;
        InputStream inputStreamOpenRawResource;
        if (context != null) {
            if (C960203pA.LIZIZ(context)) {
                i = R.raw.nearby_discovery_map_dark_style;
            } else {
                i = R.raw.nearby_discovery_map_style;
            }
            if (context != null && (resources = context.getResources()) != null && (inputStreamOpenRawResource = resources.openRawResource(i)) != null) {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr, Charset.defaultCharset());
            }
            return null;
        }
        return null;
    }

    public static final String LIZIZ(Context context) throws IOException {
        int i;
        if (C960203pA.LIZIZ(context)) {
            i = R.raw.poi_dynamic_google_map_dark_style;
        } else {
            i = R.raw.poi_dynamic_google_map_style;
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
        byte[] bArr = new byte[inputStreamOpenRawResource.available()];
        inputStreamOpenRawResource.read(bArr);
        return new String(bArr, Charset.defaultCharset());
    }

    public static final String LIZJ(Context context) {
        Object c098200Yq;
        int i;
        Resources resources;
        InputStream inputStreamOpenRawResource;
        Object obj = null;
        boolean z = false;
        if (context != null) {
            try {
                if (C960203pA.LIZIZ(context)) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (z) {
            i = R.raw.poi_map_detail_dark_style;
        } else {
            i = R.raw.poi_map_detail_light_style;
        }
        if (context == null || (resources = context.getResources()) == null || (inputStreamOpenRawResource = resources.openRawResource(i)) == null) {
            return null;
        }
        byte[] bArr = new byte[inputStreamOpenRawResource.available()];
        inputStreamOpenRawResource.read(bArr);
        c098200Yq = new String(bArr, Charset.defaultCharset());
        C189200o6.m2constructorimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZLLL(Context context) {
        Object c098200Yq;
        int i;
        Resources resources;
        InputStream inputStreamOpenRawResource;
        Object obj = null;
        boolean z = false;
        if (context != null) {
            try {
                if (C960203pA.LIZIZ(context)) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (z) {
            i = R.raw.nearby_v2_map_dark_style;
        } else {
            i = R.raw.nearby_v2_map_style;
        }
        if (context == null || (resources = context.getResources()) == null || (inputStreamOpenRawResource = resources.openRawResource(i)) == null) {
            return null;
        }
        byte[] bArr = new byte[inputStreamOpenRawResource.available()];
        inputStreamOpenRawResource.read(bArr);
        c098200Yq = new String(bArr, Charset.defaultCharset());
        C189200o6.m2constructorimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }
}
