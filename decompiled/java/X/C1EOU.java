package X;

import android.view.Surface;
import android.view.SurfaceControl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.1EOU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EOU {
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C1491050ou7 LJ;
    public String LJII;
    public String LJIIIIZZ;
    public SurfaceControl LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public Surface LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;
    public ExecutorService LJIILLIIL;
    public boolean LJIIZILJ;
    public InterfaceC1279730jPH<String> LJIJ;
    public Boolean LJIJI;
    public Float LJIJJ;
    public Float LJIJJLI;
    public Boolean LJIL;
    public InterfaceC1279750jPJ LJJ;
    public Boolean LJJI;
    public Boolean LJJIFFI;
    public String LJJII;
    public Integer LJJIII;
    public Boolean LJJIIJ;
    public Boolean LJJIIJZLJL;
    public Integer LJJIIZ;
    public Boolean LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public C1279660jPA LJJIJIL;
    public final ReadWriteLock LIZ = new ReentrantReadWriteLock();
    public EnumC1279670jPB LJFF = EnumC1279670jPB.IDLE;
    public EnumC1487020onc LJI = EnumC1487020onc.NONE;
    public EnumC1487030ond LJIIIZ = EnumC1487030ond.NONE;

    public final void LIZLLL() {
        this.LJJIJ = false;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = null;
        this.LJI = EnumC1487020onc.NONE;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = EnumC1487030ond.NONE;
        this.LJIIJ = null;
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LJIILIIL = null;
        this.LJIILJJIL = 0L;
        this.LJIILL = false;
        this.LJIILLIIL = null;
        this.LJIIZILJ = false;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIIJ = null;
        this.LJJIIJZLJL = null;
        this.LJJIIZ = null;
        this.LJJIIZI = null;
    }

    public final boolean LIZ() {
        return this.LIZIZ && this.LIZJ;
    }

    public final void LIZIZ() {
        ((ReentrantReadWriteLock) this.LIZ).readLock().lock();
    }

    public final void LIZJ() {
        ((ReentrantReadWriteLock) this.LIZ).readLock().unlock();
    }

    public final void LJ() {
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
    }

    public final void LJFF() {
        ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
    }
}
