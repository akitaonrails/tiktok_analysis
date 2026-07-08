package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0XOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848060XOq {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(boolean z) {
        Keva repo = Keva.getRepo("password_status");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C848230XPh c848230XPh = C848230XPh.LL;
        sbLIZ.append(C848230XPh.LIZLLL());
        sbLIZ.append("_password_set_status");
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }
}
