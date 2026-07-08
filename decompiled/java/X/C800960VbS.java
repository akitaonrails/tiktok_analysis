package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS414S0200000_13;

/* JADX INFO: renamed from: X.0VbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800960VbS implements InterfaceC800990VbV {
    public final String LIZ;
    public final AtomicBoolean LIZIZ;
    public final C01GW LIZJ;
    public final C800950VbR LIZLLL;
    public final C800950VbR LJ;
    public final C800950VbR LJFF;
    public final C800950VbR LJI;
    public final C800950VbR LJII;
    public final C800950VbR LJIIIIZZ;
    public final C800950VbR LJIIIZ;
    public final C800950VbR LJIIJ;
    public final C800950VbR LJIIJJI;
    public final C800950VbR LJIIL;
    public final C800950VbR LJIILIIL;

    public C800960VbS() {
        this(0);
    }

    public final void LJIIJJI() {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LIZIZ.set(true);
        LJIIL(this.LIZLLL, "assem_feed_total_assemble_duration");
        LJIIL(this.LJ, "assem_feed_total_assem_create_duration");
        LJIIL(this.LJFF, "assem_feed_total_assem_dsl_duration");
        LJIIL(this.LJI, "assem_on_proxy_bind_duration");
        LJIIL(this.LJII, "assem_feed_total_assem_view_model_create_duration");
        LJIIL(this.LJIIIIZZ, "assem_feed_total_assem_hierarchy_data_create_duration");
        LJIIL(this.LJIIIZ, "assem_feed_total_assem_select_subscribe_duration");
        LJIIL(this.LJIIJ, "vporvider_feed_total_create_vscope_instance");
        LJIIL(this.LJIIJJI, "vporvider_feed_total_provide_duration");
        LJIIL(this.LJIIL, "vporvider_feed_total_bind_duration");
        LJIIL(this.LJIILIIL, "assem_feed_total_lifecycle_duration");
    }

    public C800960VbS(String str) {
        this.LIZ = str;
        this.LIZIZ = new AtomicBoolean(false);
        this.LIZJ = C452501pT.LIZIZ(new C800980VbU());
        this.LIZLLL = new C800950VbR();
        this.LJ = new C800950VbR();
        this.LJFF = new C800950VbR();
        this.LJI = new C800950VbR();
        this.LJII = new C800950VbR();
        this.LJIIIIZZ = new C800950VbR();
        this.LJIIIZ = new C800950VbR();
        this.LJIIJ = new C800950VbR();
        this.LJIIJJI = new C800950VbR();
        this.LJIIL = new C800950VbR();
        this.LJIILIIL = new C800950VbR();
    }

    @Override // X.InterfaceC800990VbV
    public final void LIZ(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJI.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LIZIZ(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJ.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LIZJ(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJIIL.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LIZLLL(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LIZLLL.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LJ(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJII.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LJFF(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJIIJ.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LJI(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJIILIIL.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LJII(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJIIIZ.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LJIIIIZZ(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJIIJJI.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LJIIIZ(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJIIIIZZ.LIZ(j);
    }

    @Override // X.InterfaceC800990VbV
    public final void LJIIJ(long j) {
        if (this.LIZIZ.get()) {
            return;
        }
        this.LJFF.LIZ(j);
    }

    public /* synthetic */ C800960VbS(int i) {
        this("");
    }

    public final void LJIIL(C800950VbR c800950VbR, String str) {
        if (c800950VbR.LIZ.get() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(this.LIZ);
            C725430Scv.LIZJ(C2188811AlT.LIZIZ(sbLIZ), 1.0f, new AwS414S0200000_13(this, c800950VbR, 9));
        }
    }
}
