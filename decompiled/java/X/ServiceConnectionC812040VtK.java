package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0VtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC812040VtK implements ServiceConnection {
    public final /* synthetic */ C812000VtG LL;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LL.LIZIZ.LIZIZ("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C786410Ut5.LJJZZIII(this.LL.LIZ(), new AbstractRunnableC811970VtD() { // from class: X.0VtL
            @Override // X.AbstractRunnableC811970VtD
            public final void LIZIZ() {
                C812000VtG c812000VtG = this.LLILLJJLI.LL;
                c812000VtG.LIZIZ.LIZIZ("unlinkToDeath", new Object[0]);
                c812000VtG.LJIIL.asBinder().unlinkToDeath(c812000VtG.LJIIIZ, 0);
                C812000VtG c812000VtG2 = this.LLILLJJLI.LL;
                c812000VtG2.LJIIL = null;
                c812000VtG2.LJI = false;
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/internal/engage/zzn", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfG79zm4E0sGuu50", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        Object obj = componentName;
        if (objArr != null) {
            Object obj2 = objArr[0];
            Object obj3 = componentName;
            if (obj2 != null) {
                obj3 = obj2;
            }
            Object obj4 = objArr[1];
            obj = obj3;
            if (obj4 != null) {
                iBinder = (IBinder) obj4;
                obj = obj3;
            }
        }
        this.LL.LIZIZ.LIZIZ("ServiceConnectionImpl.onServiceConnected(%s)", obj);
        C786410Ut5.LJJZZIII(this.LL.LIZ(), new AbstractRunnableC811970VtD(this) { // from class: X.0VtJ
            public final /* synthetic */ ServiceConnectionC812040VtK LLILLL;

            @Override // X.AbstractRunnableC811970VtD
            public final void LIZIZ() {
                IInterface iInterfaceQueryLocalInterface;
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    iInterfaceQueryLocalInterface = null;
                } else {
                    iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.engage.protocol.IAppEngageService");
                    if (!(iInterfaceQueryLocalInterface instanceof InterfaceC811930Vt9)) {
                        iInterfaceQueryLocalInterface = new C812080VtO(iBinder2);
                    }
                }
                C812000VtG c812000VtG = this.LLILLL.LL;
                c812000VtG.LJIIL = iInterfaceQueryLocalInterface;
                c812000VtG.LIZIZ.LIZIZ("linkToDeath", new Object[0]);
                try {
                    c812000VtG.LJIIL.asBinder().linkToDeath(c812000VtG.LJIIIZ, 0);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c812000VtG.LIZIZ.LIZ("linkToDeath failed", e, new Object[0]);
                }
                C812000VtG c812000VtG2 = this.LLILLL.LL;
                c812000VtG2.LJI = false;
                Iterator it2 = ((ArrayList) c812000VtG2.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((ArrayList) this.LLILLL.LL.LIZLLL).clear();
            }

            {
                this.LLILLL = this;
            }
        });
    }
}
