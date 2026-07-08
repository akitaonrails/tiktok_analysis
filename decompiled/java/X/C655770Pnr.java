package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655770Pnr {
    public static boolean LIZ(InterfaceC657240PqE interfaceC657240PqE, InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC435460H5s interfaceC435460H5s;
        Aweme aweme = interfaceC657240PqE.getAweme();
        Aweme aweme2 = null;
        if ((interfaceC1891350zJl instanceof InterfaceC657240PqE) && (interfaceC435460H5s = (InterfaceC435460H5s) interfaceC1891350zJl) != null) {
            aweme2 = interfaceC435460H5s.getAweme();
        }
        return Intrinsics.LJFF(aweme, aweme2);
    }
}
