package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0zNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893880zNq extends AbstractC1893900zNs {
    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "reflow_link_handler";
    }

    public C1893880zNq(InterfaceC1879420z0W interfaceC1879420z0W) {
        super(interfaceC1879420z0W);
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host) && C841040Wz0.LIZ(host)) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() > 1 && Intrinsics.LJFF(ListProtector.get(pathSegments, 0), "v")) {
                return this.LIZIZ.LIZ(1, (String) C13LP.LJJJLL(a0.LJJLIIIJILLIZJL((CharSequence) ListProtector.get(pathSegments, 1), new String[]{e3.d}, 0, 6)), str, null);
            }
            if (pathSegments.size() >= 4 && Intrinsics.LJFF(ListProtector.get(pathSegments, 2), "video")) {
                return this.LIZIZ.LIZ(1, (String) ListProtector.get(pathSegments, 3), str, null);
            }
        }
        return false;
    }
}
