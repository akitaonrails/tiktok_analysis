package X;

import okio.ByteString;

/* JADX INFO: renamed from: X.0Zbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903170Zbv {
    public static final C2272701DxU LIZ(C0Y8T c0y8t) {
        if (c0y8t.isGroupChat() && c0y8t.isTemp()) {
            C2272711DxV c2272711DxV = new C2272711DxV();
            c2272711DxV.LIZLLL = C0IBF.FEATURE_STATUS_HIDE;
            return c2272711DxV.build();
        }
        return LIZIZ(c0y8t);
    }

    public static final C2272701DxU LIZIZ(C0Y8T c0y8t) {
        C2272701DxU c2272701DxUDecode;
        ByteString bizExt = c0y8t.getBizExt();
        if (bizExt == null || (c2272701DxUDecode = C2272701DxU.ADAPTER.decode(bizExt)) == null) {
            C2272711DxV c2272711DxV = new C2272711DxV();
            c2272711DxV.LIZLLL = C0IBF.FEATURE_STATUS_UNKNOWN;
            return c2272711DxV.build();
        }
        return c2272701DxUDecode;
    }
}
