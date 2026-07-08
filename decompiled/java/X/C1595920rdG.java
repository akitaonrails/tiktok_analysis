package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0rdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595920rdG {
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1595600rck LIZ(X.InterfaceC1595940rdI r11, X.C1595740rcy r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1595920rdG.LIZ(X.0rdI, X.0rcy):X.0rck");
    }

    public static C1595600rck LIZIZ(Context context, C1596360rdy c1596360rdy, int i) {
        EnumC1609560rzG enumC1609560rzG;
        C1607020rvA c1607020rvA;
        if (C729510SjV.LJJJJLI(AwemeExtKt.getAuthorUid(c1596360rdy.LLILLJJLI))) {
            enumC1609560rzG = EnumC1609560rzG.BRAND_RING;
        } else {
            enumC1609560rzG = EnumC1609560rzG.GRAY_RING;
        }
        UrlModel avatarThumb = c1596360rdy.LLILLJJLI.getAuthor().getAvatarThumb();
        if (enumC1609560rzG == EnumC1609560rzG.BRAND_RING) {
            c1607020rvA = new C1607020rvA(null, C1618440sDa.LIZIZ.LJJIJLIJ().LIZJ(context, C1596000rdO.LIZJ(), C1596000rdO.LIZJ()), 15);
        } else {
            c1607020rvA = new C1607020rvA(Integer.valueOf(i), null, 23);
        }
        return new C1595600rck(avatarThumb, c1596360rdy, c1607020rvA, enumC1609560rzG, c1596360rdy.LLILLJJLI.getAuthor(), null);
    }
}
