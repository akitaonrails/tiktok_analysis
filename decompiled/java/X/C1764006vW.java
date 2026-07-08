package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1764006vW implements InterfaceC908930ZlD {
    public final Context LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC908930ZlD
    public final void LIZIZ() {
        Uri uri = UriProtector.parse(this.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "im/send_message")) {
            SmartRouter.buildRoute(this.LIZ, this.LIZIZ).open();
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, this.LIZIZ);
        smartRouteBuildRoute.withCaller("20002");
        smartRouteBuildRoute.open();
    }

    public C1764006vW(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }
}
