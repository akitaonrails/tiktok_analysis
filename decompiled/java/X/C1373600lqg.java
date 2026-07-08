package X;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: X.0lqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373600lqg {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ InterfaceC1369790lkX LIZIZ;

    public C1373600lqg(Context context, InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1369790lkX;
    }

    public final void LIZ(Uri uri, String str, boolean z) {
        C1375540lto c1375540lto;
        C0M7Y c0m7y = null;
        if (z) {
            if (str != null) {
                c1375540lto = new C1375540lto(C1374720lsU.LJFF(C1374720lsU.LIZIZ(), str), null, null, null, null, false, 252);
            } else {
                return;
            }
        } else {
            if (uri == null) {
                return;
            }
            C09N5.LIZ(this.LIZ, uri);
            c0m7y = null;
            c1375540lto = new C1375540lto(uri, null, null, null, null, false, 252);
        }
        InterfaceC1369790lkX interfaceC1369790lkX = this.LIZIZ;
        Context context = this.LIZ;
        String str2 = c1375540lto.LJ;
        if (str2 == null) {
            str2 = "";
        }
        c1375540lto.LIZIZ("content_url", str2);
        c1375540lto.LIZIZ("media_type", "image/png");
        interfaceC1369790lkX.LJJJIL(c1375540lto, context, c0m7y);
    }
}
