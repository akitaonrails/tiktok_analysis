package X;

import Y.ACallableS436S0100000_34;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.09kC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2458209kC implements InterfaceC2457409k4 {
    public static final C2458209kC LIZ = new C2458209kC();

    public static final void LIZJ(AbstractC2457909k9 abstractC2457909k9) {
        int i;
        if (abstractC2457909k9.LJII() == 5 && (i = Build.VERSION.SDK_INT) >= 26) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (!((Boolean) C306880C1e.LIZJ.getValue()).booleanValue() && i < 28) {
                C2458409kE c2458409kE = C2458309kD.LIZ;
                c2458409kE.LIZLLL("Calling dispatchPackageBroadcast", new Object[0]);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Method method = cls.getMethod("currentActivityThread", new Class[0]);
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mAppThread");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{contextLIZ.getPackageName()});
                    c2458409kE.LIZLLL("Called dispatchPackageBroadcast", new Object[0]);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2458309kD.LIZ.LIZJ("Update app info with dispatchPackageBroadcast failed!", e, new Object[0]);
                }
            }
        }
        C15O7.LIZIZ(new ACallableS436S0100000_34(abstractC2457909k9, 1), C15O7.LJIIIIZZ, null);
        Iterator<String> it2 = abstractC2457909k9.LJ().iterator();
        while (it2.hasNext()) {
            InterfaceC2203391BLl interfaceC2203391BLl = C1BLO.LIZIZ.get(it2.next());
            if (interfaceC2203391BLl != null) {
                interfaceC2203391BLl.LIZ(abstractC2457909k9);
            }
        }
        Iterator it3 = ((CopyOnWriteArrayList) C1BLO.LIZ).iterator();
        while (it3.hasNext()) {
            ((InterfaceC2425409eu) it3.next()).LIZ(abstractC2457909k9);
        }
    }

    @Override // X.InterfaceC2425409eu
    public final /* bridge */ /* synthetic */ void LIZ(AbstractC2457909k9 abstractC2457909k9) {
        int i;
        AbstractC2457909k9 abstractC2457909k92 = abstractC2457909k9;
        if (abstractC2457909k92.LJII() == 5 && (i = Build.VERSION.SDK_INT) >= 26) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (!((Boolean) C306880C1e.LIZJ.getValue()).booleanValue() && i < 28) {
                C2458409kE c2458409kE = C2458309kD.LIZ;
                c2458409kE.LIZLLL("Calling dispatchPackageBroadcast", new Object[0]);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Method method = cls.getMethod("currentActivityThread", new Class[0]);
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mAppThread");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{contextLIZ.getPackageName()});
                    c2458409kE.LIZLLL("Called dispatchPackageBroadcast", new Object[0]);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2458309kD.LIZ.LIZJ("Update app info with dispatchPackageBroadcast failed!", e, new Object[0]);
                }
            }
        }
        C15O7.LIZIZ(new ACallableS436S0100000_34(abstractC2457909k92, 1), C15O7.LJIIIIZZ, null);
        Iterator<String> it2 = abstractC2457909k92.LJ().iterator();
        while (it2.hasNext()) {
            InterfaceC2203391BLl interfaceC2203391BLl = C1BLO.LIZIZ.get(it2.next());
            if (interfaceC2203391BLl != null) {
                interfaceC2203391BLl.LIZ(abstractC2457909k92);
            }
        }
        Iterator it3 = ((CopyOnWriteArrayList) C1BLO.LIZ).iterator();
        while (it3.hasNext()) {
            ((InterfaceC2425409eu) it3.next()).LIZ(abstractC2457909k92);
        }
    }
}
