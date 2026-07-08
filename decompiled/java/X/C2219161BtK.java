package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219161BtK implements InterfaceC2219141BtI {
    public Application LIZ;
    public Boolean LIZIZ;
    public Boolean LIZJ;
    public InterfaceC21358518iF LIZLLL;
    public Gson LJ;
    public InterfaceC2140108Zz LJFF;
    public InterfaceC1656280tCc LJI;
    public Function1<? super InterfaceC2219141BtI, Unit> LJII;

    @Override // X.InterfaceC2219141BtI
    public final void LIZ() {
        this.LIZIZ = Boolean.FALSE;
    }

    @Override // X.InterfaceC2219141BtI
    public final void LIZIZ() {
        this.LJI = new InterfaceC1656280tCc() { // from class: X.1BMP
            @Override // X.InterfaceC1656280tCc
            public final void LIZ(C00CO c00co, JSONObject jSONObject) {
                String serviceName = c00co.getServiceName();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI(serviceName, 0, jSONObject);
            }
        };
    }

    @Override // X.InterfaceC2219141BtI
    public final void LJI() {
        this.LIZJ = Boolean.FALSE;
    }

    public final void LJIIJ() {
        if (this.LJII != null) {
            synchronized (this) {
                try {
                    Function1<? super InterfaceC2219141BtI, Unit> function1 = this.LJII;
                    if (function1 != null) {
                        function1.invoke(this);
                    }
                    this.LJII = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC2219141BtI
    public final Boolean LIZJ() {
        LJIIJ();
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2219141BtI
    public final InterfaceC21358518iF LJFF() {
        LJIIJ();
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2219141BtI
    public final Boolean LJIIIZ() {
        LJIIJ();
        return this.LIZJ;
    }

    @Override // X.InterfaceC2219141BtI
    public final Application getAppContext() {
        LJIIJ();
        return this.LIZ;
    }

    @Override // X.InterfaceC2219141BtI
    public final Gson getGson() {
        LJIIJ();
        return this.LJ;
    }

    @Override // X.InterfaceC2219141BtI
    public final InterfaceC2140108Zz getMob() {
        LJIIJ();
        return this.LJFF;
    }

    @Override // X.InterfaceC2219141BtI
    public final InterfaceC1656280tCc getMonitor() {
        LJIIJ();
        return this.LJI;
    }

    @Override // X.InterfaceC2219141BtI
    public final void LIZLLL(Application application) {
        this.LIZ = application;
    }

    @Override // X.InterfaceC2219141BtI
    public final void LJ(C1624770sNn c1624770sNn) {
        this.LJFF = c1624770sNn;
    }

    @Override // X.InterfaceC2219141BtI
    public final void LJII(C214692190g c214692190g) {
        this.LIZLLL = c214692190g;
    }

    @Override // X.InterfaceC2219141BtI
    public final void LJIIIIZZ(Gson gson) {
        this.LJ = gson;
    }
}
