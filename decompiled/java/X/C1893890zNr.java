package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0zNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893890zNr extends AbstractC1893900zNs {
    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "path_parse_handler";
    }

    public C1893890zNr(InterfaceC1879420z0W interfaceC1879420z0W) {
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
            if (!C086I.LIZIZ(pathSegments) && pathSegments.size() >= 3 && TextUtils.equals("share", (String) ListProtector.get(pathSegments, 0))) {
                String str2 = (String) ListProtector.get(pathSegments, 1);
                String str3 = (String) ListProtector.get(pathSegments, 2);
                int iLIZIZ = C1900270zY9.LIZIZ(str2);
                this.LIZ = C1900270zY9.LIZ(iLIZIZ, str3);
                return this.LIZIZ.LIZ(iLIZIZ, str3, str, null);
            }
        }
        return false;
    }
}
