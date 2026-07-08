package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09lU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceConnectionC2466209lU implements ServiceConnection {
    public final /* synthetic */ C2466309lV LL;

    public /* synthetic */ ServiceConnectionC2466209lU(C2466309lV c2466309lV) {
        this.LL = c2466309lV;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LL.LIZIZ.LIZLLL("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C786410Ut5.LJJZZIII(this.LL.LIZ(), new AbstractRunnableC2463609l4() { // from class: X.09lZ
            @Override // X.AbstractRunnableC2463609l4
            public final void LIZ() {
                C2466309lV c2466309lV = this.LLILLJJLI.LL;
                c2466309lV.LIZIZ.LIZLLL("unlinkToDeath", new Object[0]);
                c2466309lV.LJIIL.asBinder().unlinkToDeath(c2466309lV.LJIIIZ, 0);
                C2466309lV c2466309lV2 = this.LLILLJJLI.LL;
                c2466309lV2.LJIIL = null;
                c2466309lV2.LJI = false;
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/play/core/splitinstall/internal/zzae", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7Treipzs2kcKp7BnK9idVSsFA==", new String[]{"016a9"})));
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
        this.LL.LIZIZ.LIZLLL("ServiceConnectionImpl.onServiceConnected(%s)", obj);
        C786410Ut5.LJJZZIII(this.LL.LIZ(), new AbstractRunnableC2463609l4() { // from class: X.09lT
            @Override // X.AbstractRunnableC2463609l4
            public final void LIZ() {
                IInterface iInterfaceQueryLocalInterface;
                C2466309lV c2466309lV = this.LLILLL.LL;
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    iInterfaceQueryLocalInterface = null;
                } else {
                    iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
                    if (!(iInterfaceQueryLocalInterface instanceof InterfaceC2459209kM)) {
                        iInterfaceQueryLocalInterface = new C2463209l0(iBinder2);
                    }
                }
                c2466309lV.LJIIL = iInterfaceQueryLocalInterface;
                C2466309lV c2466309lV2 = this.LLILLL.LL;
                c2466309lV2.LIZIZ.LIZLLL("linkToDeath", new Object[0]);
                try {
                    c2466309lV2.LJIIL.asBinder().linkToDeath(c2466309lV2.LJIIIZ, 0);
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c2466309lV2.LIZIZ.LIZJ("linkToDeath failed", e, new Object[0]);
                }
                C2466309lV c2466309lV3 = this.LLILLL.LL;
                c2466309lV3.LJI = false;
                Iterator it2 = ((ArrayList) c2466309lV3.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((ArrayList) this.LLILLL.LL.LIZLLL).clear();
            }
        });
    }
}
