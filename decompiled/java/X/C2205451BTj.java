package X;

import X.C1BU1;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.1BTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205451BTj<T extends C1BU1> implements InterfaceC2205341BSy, InterfaceC2205331BSx, InterfaceC2205311BSv, InterfaceC2205351BSz {
    public final C2205211BSl LIZ;
    public final C1BSY LIZIZ;
    public final C1BSY LIZJ;
    public final List<C2205271BSr> LIZLLL;
    public C1BU7<T> LJ;
    public InterfaceC2205551BTt<T> LJFF;
    public final C1BSM LJI;
    public CameraPosition LJII;
    public C2205451BTj<T>.a LJIIIIZZ;
    public final Set<InterfaceC1177120gjm<T>> LJIIIZ;
    public final ReadWriteLock LJIIJ;
    public C1BU6<T> LJIIJJI;
    public C1BU4<T> LJIIL;

    @Override // X.InterfaceC2205341BSy
    public final void LIZJ() {
        InterfaceC2205551BTt<T> interfaceC2205551BTt = this.LJFF;
        if (interfaceC2205551BTt instanceof InterfaceC2205341BSy) {
            ((InterfaceC2205341BSy) interfaceC2205551BTt).LIZJ();
        }
        C1BU7<T> c1bu7 = this.LJ;
        this.LJI.LIZ();
        c1bu7.LIZJ();
        this.LJ.LJFF();
        CameraPosition cameraPosition = this.LJII;
        if (cameraPosition == null || cameraPosition.zoom != this.LJI.LIZ().zoom) {
            this.LJII = this.LJI.LIZ();
            LJ();
        }
    }

    public final void LJ() {
        ((ReentrantReadWriteLock) this.LJIIJ).writeLock().lock();
        try {
            this.LJIIIIZZ.cancel(true);
            C2205451BTj<T>.a aVar = new a();
            this.LJIIIIZZ = aVar;
            C0WP3.LIZLLL(aVar, C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2), Float.valueOf(this.LJI.LIZ().zoom));
            ((ReentrantReadWriteLock) this.LJIIJ).writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LJIIJ).writeLock().unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC2205351BSz
    public final void LIZ() {
        LIZJ();
    }

    /* JADX INFO: renamed from: X.1BTj$a */
    public class a extends PthreadAsyncTask<Float, Void, Set<? extends InterfaceC1177120gjm<T>>> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Object doInBackground(Object[] objArr) {
            Float[] fArr = (Float[]) objArr;
            C1BU7<T> c1bu7 = C2205451BTj.this.LJ;
            c1bu7.lock();
            try {
                Set<? extends InterfaceC1177120gjm<T>> setLJI = c1bu7.LJI(fArr[0].floatValue());
                c1bu7.unlock();
                return setLJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1bu7.unlock();
                throw th;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Object obj) {
            C2205451BTj.this.LJFF.LIZIZ((Set) obj);
        }
    }

    @Override // X.InterfaceC2205311BSv
    public final void LIZIZ(C2205271BSr c2205271BSr) {
        this.LIZ.LIZIZ(c2205271BSr);
    }

    @Override // X.InterfaceC2205331BSx
    public final boolean LIZLLL(C2205271BSr c2205271BSr) {
        return this.LIZ.LIZLLL(c2205271BSr);
    }

    public C2205451BTj(Context context, C1BSM c1bsm) {
        C2205211BSl c2205211BSl = new C2205211BSl(c1bsm);
        this.LIZLLL = new ArrayList();
        this.LJIIIZ = new HashSet();
        this.LJIIJ = new ReentrantReadWriteLock();
        this.LJI = c1bsm;
        this.LIZ = c2205211BSl;
        this.LIZJ = new C1BSY(c2205211BSl);
        this.LIZIZ = new C1BSY(c2205211BSl);
        this.LJFF = new DefaultClusterRenderer(context, c1bsm, this);
        this.LJ = new C2205521BTq(new C2205491BTn(new C2205481BTm()));
        this.LJIIIIZZ = new a();
        this.LJFF.LJI();
    }
}
