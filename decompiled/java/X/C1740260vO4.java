package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vO4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740260vO4 {
    public static final C1740260vO4 LIZ = new C1740260vO4();
    public static final CopyOnWriteArrayList<InterfaceC324270CnR> LIZIZ = new CopyOnWriteArrayList<>();

    public static void LIZ(String str) {
        Iterator<InterfaceC324270CnR> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str);
        }
    }

    public static boolean LIZIZ(Uri uri) {
        String host = uri.getHost();
        if (!Intrinsics.LJFF("lynxview", host) && !Intrinsics.LJFF("lynxview_popup", host) && !Intrinsics.LJFF("webview", host) && !Intrinsics.LJFF("webview_popup", host) && !Intrinsics.LJFF("webcast_lynxview", host) && !Intrinsics.LJFF("webcast_lynxview_popup", host) && !Intrinsics.LJFF("webcast_webview", host) && !Intrinsics.LJFF("webcast_webview_popup", host)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Uri uri) {
        return C123100dR.LIZ(AnonymousClass0185.LJ(uri, "ec_ug_landing_uuid"));
    }
}
