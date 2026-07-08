package X;

/* JADX INFO: renamed from: X.10t7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19387510t7 {
    public static final C19387510t7 LIZ = new C19387510t7();

    public static void LIZ(String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("fileLocalPath", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download1047_");
        sbLIZ.append(C256070A1t.LIZ());
        c2344009Gk.LJIIIIZZ("error_type", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isLogin=");
        sbLIZ2.append(z);
        c2344009Gk.LJIIIIZZ("extra", C2188811AlT.LIZIZ(sbLIZ2));
        C20684815ws.LJIILLIIL("voice_conversion_extra_error", c2344009Gk.LIZ);
    }
}
