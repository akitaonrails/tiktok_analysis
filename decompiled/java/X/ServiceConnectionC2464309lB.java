package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: X.09lB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC2464309lB implements ServiceConnection {
    public final /* synthetic */ C2464409lC LL;

    public /* synthetic */ ServiceConnectionC2464309lB(C2464409lC c2464409lC) {
        this.LL = c2464409lC;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2464409lC c2464409lC = this.LL;
        c2464409lC.LIZIZ.LIZ("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C786410Ut5.LJJZZIII(c2464409lC.LIZ(), new AbstractRunnableC2461209kg(this) { // from class: X.09lA
            public final /* synthetic */ ServiceConnectionC2464309lB LLILLJJLI;

            @Override // X.AbstractRunnableC2461209kg
            public final void LIZJ() {
                C2464409lC c2464409lC2 = this.LLILLJJLI.LL;
                c2464409lC2.LIZIZ.LIZ("unlinkToDeath", new Object[0]);
                c2464409lC2.LJIIL.asBinder().unlinkToDeath(c2464409lC2.LJIIIZ, 0);
                c2464409lC2.LJIIL = null;
                c2464409lC2.LJI = false;
            }

            {
                Objects.requireNonNull(this);
                this.LLILLJJLI = this;
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/internal/playcore_age_signals/zzm", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGu9T+gF0Fapct7wVDkzd2x0L3SLqHVOGs=", new String[]{"016a9"})));
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
        C2464409lC c2464409lC = this.LL;
        c2464409lC.LIZIZ.LIZ("ServiceConnectionImpl.onServiceConnected(%s)", obj);
        C786410Ut5.LJJZZIII(c2464409lC.LIZ(), new AbstractRunnableC2461209kg(this) { // from class: X.09l9
            public final /* synthetic */ ServiceConnectionC2464309lB LLILLL;

            @Override // X.AbstractRunnableC2461209kg
            public final void LIZJ() {
                IInterface iInterfaceQueryLocalInterface;
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    iInterfaceQueryLocalInterface = null;
                } else {
                    iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
                    if (!(iInterfaceQueryLocalInterface instanceof InterfaceC2460809kc)) {
                        iInterfaceQueryLocalInterface = new C2462809kw(iBinder2);
                    }
                }
                C2464409lC c2464409lC2 = this.LLILLL.LL;
                c2464409lC2.LJIIL = iInterfaceQueryLocalInterface;
                c2464409lC2.LIZIZ.LIZ("linkToDeath", new Object[0]);
                try {
                    c2464409lC2.LJIIL.asBinder().linkToDeath(c2464409lC2.LJIIIZ, 0);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2460309kX c2460309kX = c2464409lC2.LIZIZ;
                    Object[] objArr2 = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        C2460309kX.LIZJ(c2460309kX.LIZ, "linkToDeath failed", objArr2);
                    } else {
                        c2460309kX.getClass();
                    }
                }
                c2464409lC2.LJI = false;
                Iterator it2 = ((ArrayList) c2464409lC2.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((ArrayList) c2464409lC2.LIZLLL).clear();
            }

            {
                Objects.requireNonNull(this);
                this.LLILLL = this;
            }
        });
    }
}
