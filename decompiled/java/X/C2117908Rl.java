package X;

import android.content.ContentResolver;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;

/* JADX INFO: renamed from: X.08Rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2117908Rl {
    public static final boolean LIZ(ContentResolver contentResolver, Uri uri) {
        Object c098200Yq;
        boolean z;
        try {
            InputStream inputStreamLJ = C09NT.LJ(contentResolver, uri);
            if (inputStreamLJ == null) {
                z = false;
            } else {
                C2107108Nh.LIZ(inputStreamLJ, null);
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
