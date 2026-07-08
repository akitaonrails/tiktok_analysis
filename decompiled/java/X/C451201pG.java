package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C451201pG implements C0T09 {
    public static final C01GW<Keva> LJII = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(579));
    public final C19EG LIZ;
    public final boolean LIZIZ;
    public final WeakReference<C19EG> LIZJ;
    public final String LIZLLL;
    public final C1234230iDt LJ;
    public final InterfaceC497601wk LJFF;
    public C20515215Pi LJI;

    @Override // X.C0T09
    public final void LIZ() {
        if (C451401pI.LIZ()) {
            if (C451301pH.LIZ()) {
                C23250099c.LIZLLL(this.LJFF, null, null, new C450501p9(this, null), 3);
            } else {
                LifecycleOwnerKt.getLifecycleScope(this.LIZ).launchWhenResumed(new C450601pA(this, null));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451201pG.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C451201pG(C19EG c19eg, boolean z) {
        WeakReference<C19EG> weakReference = new WeakReference<>(c19eg);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C1234230iDt c1234230iDt = C1234230iDt.LIZIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        this.LIZ = c19eg;
        this.LIZIZ = z;
        this.LIZJ = weakReference;
        this.LIZLLL = curUserId;
        this.LJ = c1234230iDt;
        this.LJFF = c054gLIZ;
    }

    public final Object LIZJ(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String str;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        Pair pair = new Pair("to_status", str);
        int i = 1;
        C20684815ws.LJIILLIIL("account_auth_switch", C2097608Jq.LJIIIIZZ(new Pair("account_type", "link"), pair, new Pair("enter_from", "link_pop_up")));
        C1234230iDt c1234230iDt = this.LJ;
        c1234230iDt.getClass();
        if (!z) {
            i = 2;
        }
        Object objLIZIZ = C11UD.LIZIZ(c1234230iDt.LIZ("sug_to_who_share_link", i), interfaceC1364105Vn);
        if (objLIZIZ != C099R.LJFF()) {
            objLIZIZ = Unit.LIZ;
        }
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
