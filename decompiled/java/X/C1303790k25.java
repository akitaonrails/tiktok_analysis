package X;

import a17.a0;
import a17.l;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.Krypton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: renamed from: X.0k25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303790k25 {
    public static volatile C1303790k25 LJIIL;
    public C1303800k26 LIZ;
    public boolean LIZIZ;
    public Class<AbstractC1303860k2C> LIZJ;
    public boolean LIZLLL;
    public AbstractC1303880k2E LJ;
    public boolean LJFF;
    public Class<l> LJI;
    public boolean LJII;
    public Class<AbstractC1303870k2D> LJIIIIZZ;
    public boolean LJIIIZ;
    public AbstractC1303850k2B LJIIJ;
    public boolean LJIIJJI;

    public static C1303790k25 LIZIZ() {
        if (LJIIL == null) {
            synchronized (C1303790k25.class) {
                try {
                    if (LJIIL == null) {
                        LJIIL = new C1303790k25();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIL;
    }

    public final <T extends a0> T LIZ(Class<T> cls) {
        boolean z = true;
        if (AbstractC1303810k27.class.isAssignableFrom(cls)) {
            if (this.LIZ == null && !this.LIZIZ) {
                if (!LIZLLL("com.bytedance.ies.bullet.lynx.element.LynxCanvasTTPlayer")) {
                    LIZLLL("com.bytedance.lynx.hybrid.hybrid_canvas.LynxCanvasTTPlayer");
                }
                if (this.LIZ != null) {
                    z = false;
                }
                this.LIZIZ = z;
            }
            return this.LIZ;
        }
        if (AbstractC1303860k2C.class.isAssignableFrom(cls)) {
            if (this.LIZJ == null && !this.LIZLLL) {
                if (!LIZJ("com.bytedance.ies.bullet.lynx.element.LynxCanvasEffectHandler")) {
                    LIZJ("com.bytedance.lynx.hybrid.hybrid_canvas.LynxCanvasEffectHandler");
                }
                if (this.LIZJ != null) {
                    z = false;
                }
                this.LIZLLL = z;
            }
            Class<AbstractC1303860k2C> cls2 = this.LIZJ;
            if (cls2 != null) {
                try {
                    return cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create HybridCanvasEffectConfigServiceClass instance error ");
                    sbLIZ.append(e.getMessage());
                    C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean LIZJ(String str) {
        try {
            Class cls = Class.forName(str);
            if (AbstractC1303860k2C.class.isAssignableFrom(cls)) {
                this.LIZJ = cls;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("found effect config service class: ");
                sbLIZ.append(str);
                C1288370jdD.LIZJ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
            C1288370jdD.LIZIZ("KryptonReflectLoader", "reflect find service for LynxCanvasEffectHandler instance type error");
            return false;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("service class can not cast to KryptonEffectConfigService: ");
            sbLIZ2.append(str);
            sbLIZ2.append(e.getMessage());
            C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("find service class not found: ");
            sbLIZ3.append(str);
            C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0k26] */
    public final boolean LIZLLL(String str) {
        try {
            Class<?> cls = Class.forName(str);
            final Constructor<?> constructor = cls.getConstructor(Context.class, Map.class);
            if (InterfaceC1304250k2p.class.isAssignableFrom(cls) && constructor != null) {
                this.LIZ = new AbstractC1303810k27() { // from class: X.0k26
                    @Override // X.AbstractC1303810k27
                    public final InterfaceC1304250k2p LIZ(Map<String, String> map) {
                        try {
                            return (InterfaceC1304250k2p) constructor.newInstance(Krypton.LIZIZ().LIZIZ, map);
                        } catch (ExceptionInInitializerError | IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("create KryptonVideoPlayer instance error");
                            sbLIZ.append(e.getMessage());
                            C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }
                };
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("found video player service class: ");
                sbLIZ.append(str);
                C1288370jdD.LIZJ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
            C1288370jdD.LIZIZ("KryptonReflectLoader", "reflect find service for LynxCanvasTTPlayer instance type error");
            return false;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("find service class not found: ");
            sbLIZ2.append(str);
            C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("not find construct method for ");
            sbLIZ3.append(str);
            sbLIZ3.append(e2.getMessage());
            C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        } catch (SecurityException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("security exception for ");
            sbLIZ4.append(str);
            sbLIZ4.append(e3.getMessage());
            C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ4));
            return false;
        }
    }
}
