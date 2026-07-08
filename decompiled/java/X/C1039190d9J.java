package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: X.0d9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039190d9J implements InterfaceC1039110d9B {
    public WeakReference<Activity> LIZ;
    public C1041600dDC LIZIZ;
    public C1027660cqi LIZJ;
    public InterfaceC1039160d9G LIZLLL;
    public final boolean LJ = true;
    public final BulletBusinessService LJFF = new BulletBusinessService(this);

    @Override // X.InterfaceC1039110d9B
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1039110d9B
    public final void LJI() {
    }

    @Override // X.InterfaceC1039110d9B
    public final void LJII() {
    }

    @Override // X.InterfaceC1039110d9B
    public final Activity getActivity() {
        WeakReference<Activity> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC1039110d9B
    public final boolean LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1039110d9B
    public final C1027660cqi getExtraParams() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1039110d9B
    public final C1041600dDC getParams() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1039110d9B
    public final <T extends BulletBusinessService.Business> T LIZIZ(Class<T> cls) {
        T tNewInstance;
        BulletBusinessService bulletBusinessService = this.LJFF;
        if (bulletBusinessService.LIZIZ.containsKey(cls)) {
            return (T) bulletBusinessService.LIZIZ.get(cls);
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(C1039190d9J.class);
                declaredConstructor.setAccessible(true);
                tNewInstance = declaredConstructor.newInstance(bulletBusinessService.LIZ);
                try {
                    bulletBusinessService.LIZIZ.put(cls, tNewInstance);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            } catch (Exception e2) {
                e = e2;
                tNewInstance = null;
            }
            if (tNewInstance != null) {
                return tNewInstance;
            }
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can't use abstract class!");
        sbLIZ.append(cls.getSimpleName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.InterfaceC1039110d9B
    public final void LJ(C1039130d9D c1039130d9D) {
        this.LIZLLL = c1039130d9D;
    }

    @Override // X.InterfaceC1039110d9B
    public final void LJFF(C1027660cqi c1027660cqi) {
        this.LIZJ = c1027660cqi;
    }

    @Override // X.InterfaceC1039110d9B
    public final void LJIIIIZZ(C1041600dDC c1041600dDC) {
        this.LIZIZ = c1041600dDC;
    }

    @Override // X.InterfaceC1039110d9B
    public final void LJIIIZ(Activity activity) {
        this.LIZ = new WeakReference<>(activity);
    }
}
