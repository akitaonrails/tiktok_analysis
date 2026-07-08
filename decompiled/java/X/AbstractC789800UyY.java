package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: X.0UyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC789800UyY<T> extends C0VG7<T> {
    public final C521490Kcl LJFF;

    public abstract IntentFilter LJFF();

    public abstract void LJI(Intent intent);

    static {
        C0VI8.LIZIZ("BrdcstRcvrCnstrntTrckr");
    }

    @Override // X.C0VG7
    public final void LIZLLL() throws Exception {
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("%s: registering receiver", new Object[]{getClass().getSimpleName()});
        c0vi8LIZ.getClass();
        C786410Ut5.LJIJJ(this.LIZIZ, this.LJFF, LJFF());
    }

    @Override // X.C0VG7
    public final void LJ() {
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("%s: unregistering receiver", new Object[]{getClass().getSimpleName()});
        c0vi8LIZ.getClass();
        C786410Ut5.LJJIFFI(this.LIZIZ, this.LJFF);
    }

    public AbstractC789800UyY(Context context, InterfaceC787600Uv0 interfaceC787600Uv0) {
        super(context, interfaceC787600Uv0);
        this.LJFF = new C521490Kcl(this, 4);
    }
}
