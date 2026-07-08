package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0rQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588110rQf {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(InterfaceC1361270lWn interfaceC1361270lWn) {
        if (interfaceC1361270lWn instanceof InterfaceC1357880lRK) {
            return ((InterfaceC1357880lRK) interfaceC1361270lWn).getUniqueKey();
        }
        String strLIZIZ = LIZIZ(interfaceC1361270lWn.getAweme());
        if (strLIZIZ == null) {
            return "";
        }
        return strLIZIZ;
    }

    public static String LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (C729510SjV.LJJIJIL(aweme)) {
            String strLIZ = C1588330rR1.LIZ(aweme.getAid());
            if (strLIZ == null) {
                return aweme.getAid();
            }
            return strLIZ;
        }
        return aweme.getAid();
    }

    public static String LIZJ(InterfaceC1588310rQz interfaceC1588310rQz) {
        InterfaceC1361290lWp interfaceC1361290lWpLJIL = interfaceC1588310rQz.LJIL();
        if (interfaceC1361290lWpLJIL instanceof InterfaceC1361270lWn) {
            return LIZ((InterfaceC1361270lWn) interfaceC1361290lWpLJIL);
        }
        return LIZIZ(interfaceC1588310rQz.getAweme());
    }
}
