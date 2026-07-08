package X;

import android.content.Context;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179271AQr implements C1ARK, C1ARB, C1ARR {
    public final Context LL;
    public final C1AOB LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4052));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4053));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4050));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4051));

    public final C2179291AQt LJFF() {
        return (C2179291AQt) this.LLILZIL.getValue();
    }

    public final C2179201AQk LJI() {
        return (C2179201AQk) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC2179331AQx
    public final C0NIR LJIIL() {
        return ((C2179301AQu) this.LLILZ.getValue()).LLILLJJLI;
    }

    public final void LJIILIIL() {
        ((C1ARQ) this.LLILZLL.getValue()).LIZJ();
        LJFF().LIZIZ();
        C2179201AQk c2179201AQkLJI = LJI();
        c2179201AQkLJI.LJFF = null;
        c2179201AQkLJI.LIZIZ().release();
    }

    @Override // X.C1ARK
    public final long LIZIZ() {
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF == null) {
            return 0L;
        }
        return c2179201AQkLJI.LIZIZ().LIZIZ();
    }

    @Override // X.C1ARK
    public final C1ANF LIZJ() {
        C2179201AQk c2179201AQkLJI = LJI();
        return c2179201AQkLJI.LJFF == null ? C1ANF.PLAYBACK_STATE_STOPPED : c2179201AQkLJI.LIZIZ().LJIL();
    }

    public final long LJ() {
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF != null) {
            return (c2179201AQkLJI.LIZIZ().getDuration() * ((long) c2179201AQkLJI.LIZIZ().LIZ())) / ((long) 100);
        }
        return 0L;
    }

    public final long LJIIIZ() {
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF == null) {
            return 0L;
        }
        return c2179201AQkLJI.LIZIZ().LJFF();
    }

    @Override // X.C1ARK
    public final long getDuration() {
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF == null) {
            return 0L;
        }
        return c2179201AQkLJI.LIZIZ().getDuration();
    }

    public final void LIZ(InterfaceC2179191AQj interfaceC2179191AQj) {
        ((C1ARQ) this.LLILZLL.getValue()).LIZ(interfaceC2179191AQj);
    }

    @Override // X.C1ARK
    public final void LIZLLL(C0NIR c0nir) {
        if (LJFF().LIZLLL(c0nir)) {
            return;
        }
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF != null) {
            c2179201AQkLJI.LIZIZ().stop();
        }
    }

    @Override // X.C1ARK
    public final void LJII(C0NIR c0nir) {
        if (LJFF().LJII(c0nir)) {
            return;
        }
        C2179201AQk c2179201AQkLJI = LJI();
        c2179201AQkLJI.LIZIZ().LIZLLL(c2179201AQkLJI.LJI);
        c2179201AQkLJI.LJI = 0L;
    }

    @Override // X.C1ARK
    public final void LJIIIIZZ(C0NIR c0nir) {
        if (LJFF().LJIIIIZZ(c0nir)) {
            return;
        }
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF != null) {
            c2179201AQkLJI.LIZIZ().pause();
        }
    }

    @Override // X.C1ARK
    public final void LJIIJ(C0NIR c0nir) {
        if (LJFF().LJIIJ(c0nir)) {
            return;
        }
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF != null) {
            c2179201AQkLJI.LIZIZ().resume();
        }
    }

    @Override // X.C1ARR
    public final void LJIIJJI(InterfaceC2179311AQv interfaceC2179311AQv) {
        LJFF().LJIIJJI(interfaceC2179311AQv);
    }

    public final void LJIILJJIL(InterfaceC2178461ANo interfaceC2178461ANo) {
        LJI().LJII = interfaceC2178461ANo;
    }

    @Override // X.C1ARK
    public final void LJIILL(C2179231AQn c2179231AQn) {
        C2179231AQn c2179231AQnLJIJJ = LJFF().LJIJJ(c2179231AQn);
        C2179201AQk c2179201AQkLJI = LJI();
        c2179201AQkLJI.LJFF = c2179231AQnLJIJJ;
        c2179201AQkLJI.LJ = EnumC2179211AQl.INIT;
        c2179201AQkLJI.LIZJ(C1AN0.INVALIDATE_PLAYER_MODEL);
        ((C1ARQ) this.LLILZLL.getValue()).LJIIJJI(c2179231AQnLJIJJ);
    }

    @Override // X.C1ARR
    public final void LJIILLIIL(InterfaceC2179311AQv interfaceC2179311AQv) {
        LJFF().LJIILLIIL(interfaceC2179311AQv);
    }

    @Override // X.C1ARB
    public final void LJIJJ(InterfaceC2179191AQj interfaceC2179191AQj) {
        ((C1ARQ) this.LLILZLL.getValue()).LJIJJ(interfaceC2179191AQj);
    }

    public C2179271AQr(Context context, C1AOB c1aob) {
        this.LL = context;
        this.LLILLJJLI = c1aob;
    }

    @Override // X.C1ARK
    public final void LJJ(long j, InterfaceC2178281AMw interfaceC2178281AMw) {
        if (LJFF().LIZ()) {
            return;
        }
        C2179201AQk c2179201AQkLJI = LJI();
        if (c2179201AQkLJI.LJFF != null && c2179201AQkLJI.LIZIZ().LJIL() != C1ANF.PLAYBACK_STATE_STOPPED) {
            c2179201AQkLJI.LIZIZ.LJIILIIL(EnumC1778440wNe.SEEKING);
            c2179201AQkLJI.LIZIZ().LJI(j, new C2179171AQh(interfaceC2178281AMw, c2179201AQkLJI));
            return;
        }
        c2179201AQkLJI.LJI = j;
        if (!(c2179201AQkLJI.LIZIZ() instanceof C2178261AMu)) {
            return;
        }
        ((C2178261AMu) c2179201AQkLJI.LIZIZ()).LJI = c2179201AQkLJI.LJI;
    }
}
