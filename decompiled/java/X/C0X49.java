package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0X49, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X49 extends C0X47<C0X4A> {
    @Override // X.C0X47, X.C09JN
    public final void accept(Object obj) {
        Activity activity;
        C1C7U.LIZ("NoticeCountFetchManager@b197.mainActivityCreateSubscriber$1");
        C0X4A c0x4a = (C0X4A) obj;
        if (c0x4a != null) {
            activity = c0x4a.LIZ;
        } else {
            activity = null;
        }
        if (activity instanceof InterfaceC1603190roz) {
            super.accept(c0x4a);
            C0X4D.LIZJ.LL = true;
        }
        C1C7U.LIZIZ("NoticeCountFetchManager@b197.mainActivityCreateSubscriber$1");
    }
}
