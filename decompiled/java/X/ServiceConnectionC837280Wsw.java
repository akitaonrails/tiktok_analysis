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

/* JADX INFO: renamed from: X.0Wsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC837280Wsw implements ServiceConnection {
    public final /* synthetic */ C837260Wsu LL;

    public /* synthetic */ ServiceConnectionC837280Wsw(C837260Wsu c837260Wsu) {
        this.LL = c837260Wsu;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LL.LIZIZ.LIZ("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C786410Ut5.LJJZZIII(this.LL.LIZ(), new AbstractRunnableC837330Wt1() { // from class: X.0Wsy
            @Override // X.AbstractRunnableC837330Wt1
            public final void LIZIZ() {
                C837260Wsu c837260Wsu = this.LLILLJJLI.LL;
                c837260Wsu.LIZIZ.LIZ("unlinkToDeath", new Object[0]);
                c837260Wsu.LJIIL.asBinder().unlinkToDeath(c837260Wsu.LJIIIZ, 0);
                C837260Wsu c837260Wsu2 = this.LLILLJJLI.LL;
                c837260Wsu2.LJIIL = null;
                c837260Wsu2.LJI = false;
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/play/integrity/internal/u", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57Xuyd1hfi1NeOKtVrNKDfHNuBy5aNB8=", new String[]{"016a9"})));
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
        this.LL.LIZIZ.LIZ("ServiceConnectionImpl.onServiceConnected(%s)", obj);
        C786410Ut5.LJJZZIII(this.LL.LIZ(), new AbstractRunnableC837330Wt1() { // from class: X.0Wsv
            @Override // X.AbstractRunnableC837330Wt1
            public final void LIZIZ() {
                IInterface iInterfaceQueryLocalInterface;
                C837260Wsu c837260Wsu = this.LLILLL.LL;
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    iInterfaceQueryLocalInterface = null;
                } else {
                    iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    if (!(iInterfaceQueryLocalInterface instanceof InterfaceC837360Wt4)) {
                        iInterfaceQueryLocalInterface = new C837320Wt0(iBinder2);
                    }
                }
                c837260Wsu.LJIIL = iInterfaceQueryLocalInterface;
                C837260Wsu c837260Wsu2 = this.LLILLL.LL;
                c837260Wsu2.LIZIZ.LIZ("linkToDeath", new Object[0]);
                try {
                    c837260Wsu2.LJIIL.asBinder().linkToDeath(c837260Wsu2.LJIIIZ, 0);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2461309kh c2461309kh = c837260Wsu2.LIZIZ;
                    Object[] objArr2 = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        C2461309kh.LIZIZ(c2461309kh.LIZ, "linkToDeath failed", objArr2);
                    } else {
                        c2461309kh.getClass();
                    }
                }
                C837260Wsu c837260Wsu3 = this.LLILLL.LL;
                c837260Wsu3.LJI = false;
                Iterator it2 = ((ArrayList) c837260Wsu3.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((ArrayList) this.LLILLL.LL.LIZLLL).clear();
            }
        });
    }
}
