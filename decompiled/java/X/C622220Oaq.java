package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Oaq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622220Oaq implements InterfaceC586170Myt {
    public static final C622220Oaq LL = new C622220Oaq();

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z && i == 2) {
            C622190Oan c622190Oan = C622190Oan.LIZ;
            C622290Oax.LJFF("BulletinClientCenter", "switchAccount");
            if (C622190Oan.LJIIJ.get()) {
                C23250099c.LIZLLL((InterfaceC497601wk) C622190Oan.LIZIZ.getValue(), null, null, new C622200Oao(new C622210Oap("db_init", c622190Oan), null), 3);
            }
        }
    }
}
