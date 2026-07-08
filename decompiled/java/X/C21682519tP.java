package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;

/* JADX INFO: renamed from: X.19tP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21682519tP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            iMALogApiLIZ.LIZ(4, "Media-ALog", str);
        }
    }

    public static void LIZIZ(String str, boolean z) {
        int i;
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            if (z) {
                i = 4;
            } else {
                i = 6;
            }
            iMALogApiLIZ.LIZ(i, "Media-ALog", str);
        }
    }
}
