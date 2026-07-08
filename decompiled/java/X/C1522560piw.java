package X;

import com.google.gson.n;

/* JADX INFO: renamed from: X.0piw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522560piw {
    public static final /* synthetic */ int LIZ = 0;

    public static Throwable LIZ(EnumC1522550piv enumC1522550piv) {
        n nVar = new n();
        nVar.LJJIII(Integer.valueOf(enumC1522550piv.getCode()), "error_code");
        nVar.LJJIIJ("error_message", enumC1522550piv.getMsg());
        return new Throwable(nVar.toString());
    }
}
