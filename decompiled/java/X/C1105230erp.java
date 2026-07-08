package X;

import android.net.Uri;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0erp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105230erp {
    public static final EnumC1105200erm LIZ(Uri uri) {
        String host;
        if (uri.isHierarchical() && (host = uri.getHost()) != null) {
            if (a0.LJJIIZI(host, "lynxview", false)) {
                return EnumC1105200erm.LYNX;
            }
            if (a0.LJJIIZI(host, "webview", false)) {
                return EnumC1105200erm.WEB;
            }
            if (a0.LJJIIZI(host, "sdui", false)) {
                return EnumC1105200erm.SDUI;
            }
        }
        return EnumC1105200erm.UNKNOWN;
    }
}
