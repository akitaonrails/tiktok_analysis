package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0oic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483920oic {
    public final InterfaceC1483670oiD LIZ;
    public InterfaceC1483990oij LIZIZ;
    public RunnableC1483930oid LIZJ;
    public RunnableC1483940oie LIZLLL;

    public final void LIZJ() {
        InterfaceC1483990oij interfaceC1483990oij = this.LIZIZ;
        if (interfaceC1483990oij == null) {
            return;
        }
        if (interfaceC1483990oij.LIZIZ()) {
            new RunnableC1483940oie(this).run();
        } else {
            this.LIZLLL = new RunnableC1483940oie(this);
        }
    }

    public C1483920oic(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LIZ = interfaceC1483670oiD;
    }

    public final void LIZIZ(InterfaceC1479620obg interfaceC1479620obg) {
        RunnableC1483930oid runnableC1483930oid = this.LIZJ;
        if (runnableC1483930oid != null && TextUtils.equals(runnableC1483930oid.LL.getKey(), interfaceC1479620obg.getKey())) {
            this.LIZJ = new RunnableC1483930oid(this, interfaceC1479620obg);
            C786410Ut5.j4("prepareNext. update PlayCommand. aid:%s", new Object[]{interfaceC1479620obg.getKey()});
            return;
        }
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableNoSurfacePreRenderWithoutRender()) {
            interfaceC1479620obg.LIZLLL().LIZJ = true;
        }
        this.LIZ.LJJJLZIJ(C1479540obY.LIZ(interfaceC1479620obg, null));
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableNoSurfacePreRenderWithoutRender()) {
            interfaceC1479620obg.LIZLLL().LIZJ = false;
        }
        if (C582130MsN.LIZ().getConfig().getSimPlayerExperiment().enableNoSurfacePreRenderWithoutRenderForStartup()) {
            interfaceC1479620obg.LIZLLL().LIZJ = false;
        }
        this.LIZJ = new RunnableC1483930oid(this, interfaceC1479620obg);
        C786410Ut5.j4("prepareNext. aid:%s", new Object[]{interfaceC1479620obg.getKey()});
    }

    public final void LIZ(InterfaceC1479620obg interfaceC1479620obg, InterfaceC1483990oij interfaceC1483990oij) {
        if (interfaceC1483990oij == null) {
            LIZIZ(interfaceC1479620obg);
            return;
        }
        this.LIZIZ = interfaceC1483990oij;
        interfaceC1483990oij.LJII(new C1483980oii(this, interfaceC1483990oij));
        if (interfaceC1483990oij.LIZIZ()) {
            interfaceC1483990oij.LJIILLIIL();
            new RunnableC1483930oid(this, interfaceC1479620obg).run();
        } else {
            LIZIZ(interfaceC1479620obg);
        }
    }
}
