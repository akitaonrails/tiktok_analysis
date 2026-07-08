package X;

import android.app.Application;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.1BtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219091BtD {
    public static final C2219091BtD LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C1663470tOD LIZJ;
    public static final C1663470tOD LIZLLL;
    public static final C1663470tOD LJ;
    public static final C1663470tOD LJFF;
    public static final C1663470tOD LJI;
    public static final C1663470tOD LJII;
    public static final C1663470tOD LJIIIIZZ;
    public static InterfaceC2219141BtI LJIIIZ;
    public static InterfaceC2219181BtM LJIIJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C2219091BtD.class, "backendContext", "getBackendContext()Landroid/app/Application;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C2219091BtD.class, "backendDebug", "getBackendDebug()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(C2219091BtD.class, "backendOnlyDebug", "getBackendOnlyDebug()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR4 = new C2217371BqR(C2219091BtD.class, "backendGson", "getBackendGson()Lcom/google/gson/Gson;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR5 = new C2217371BqR(C2219091BtD.class, "backendMob", "getBackendMob()Lcom/ss/android/ugc/tools/mob/IMob;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR6 = new C2217371BqR(C2219091BtD.class, "backendMonitor", "getBackendMonitor()Lcom/ss/android/ugc/tools/monitor/IMonitor;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR7 = new C2217371BqR(C2219091BtD.class, "backendLogger", "getBackendLogger()Lcom/ss/android/ugc/tools/utils/IToolsLogger;", 0);
        c09r3.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6, c2217371BqR7};
        LIZ = new C2219091BtD();
        LIZJ = new C1663470tOD(new C2219061BtA());
        LIZLLL = new C1663470tOD(new C2219071BtB());
        LJ = new C1663470tOD(new C2219081BtC());
        LJFF = new C1663470tOD(new C2219051Bt9());
        LJI = new C1663470tOD(new C2219111BtF());
        LJII = new C1663470tOD(new C2219131BtH());
        LJIIIIZZ = new C1663470tOD(new C2219101BtE());
    }

    public static final Application LIZ() {
        C2219091BtD c2219091BtD = LIZ;
        c2219091BtD.getClass();
        return (Application) LIZJ.getValue(c2219091BtD, LIZIZ[0]);
    }

    public static final boolean LIZIZ() {
        C2219091BtD c2219091BtD = LIZ;
        c2219091BtD.getClass();
        return ((Boolean) LIZLLL.getValue(c2219091BtD, LIZIZ[1])).booleanValue();
    }

    public static final Gson LIZJ() {
        C2219091BtD c2219091BtD = LIZ;
        c2219091BtD.getClass();
        return (Gson) LJFF.getValue(c2219091BtD, LIZIZ[3]);
    }

    public static final InterfaceC1463990oCT LIZLLL() {
        C2219091BtD c2219091BtD = LIZ;
        c2219091BtD.getClass();
        return (InterfaceC1463990oCT) LJIIIIZZ.getValue(c2219091BtD, LIZIZ[6]);
    }

    public static final InterfaceC2140108Zz LJ() {
        C2219091BtD c2219091BtD = LIZ;
        c2219091BtD.getClass();
        return (InterfaceC2140108Zz) LJI.getValue(c2219091BtD, LIZIZ[4]);
    }
}
