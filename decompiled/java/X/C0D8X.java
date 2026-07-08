package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0D8X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D8X {
    public static final ConcurrentHashMap<Class<?>, Object> LIZ;

    static {
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        InterfaceC331980Czs interfaceC331980Czs = new InterfaceC331980Czs() { // from class: X.0D8Z
            @Override // X.InterfaceC331980Czs
            public final void LIZ() {
            }
        };
        C0D83 c0d83 = new C0D83() { // from class: X.0D8a
            @Override // X.C0D83
            public final void d() {
            }

            @Override // X.C0D83
            public final void e() {
            }

            @Override // X.C0D83
            public final void i() {
            }

            @Override // X.C0D83
            public final void w() {
            }
        };
        C337140DJo c337140DJo = new C337140DJo();
        InterfaceC332180D0m interfaceC332180D0m = new InterfaceC332180D0m(contextLIZ) { // from class: X.0D8V
            public final Keva LIZIZ;

            {
                C786410Ut5.N3(contextLIZ);
                this.LIZIZ = Keva.getRepo("ads_ucp_prefs");
            }

            @Override // X.InterfaceC332180D0m
            public final String getString(String str, String str2) {
                String string = this.LIZIZ.getString(str, str2);
                if (string != null) {
                    return string;
                }
                return str2;
            }

            @Override // X.InterfaceC332180D0m
            public final void putString(String str, String str2) {
                this.LIZIZ.storeString(str, str2);
                C0D83 c0d83LIZIZ = C0D8X.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Put key: ");
                sbLIZ.append(str);
                sbLIZ.append(", value: ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                c0d83LIZIZ.d();
            }
        };
        concurrentHashMap.put(InterfaceC331980Czs.class, interfaceC331980Czs);
        concurrentHashMap.put(C0D83.class, c0d83);
        concurrentHashMap.put(C0DIX.class, c337140DJo);
        concurrentHashMap.put(InterfaceC332180D0m.class, interfaceC332180D0m);
        concurrentHashMap.put(InterfaceC333290D4t.class, new InterfaceC333290D4t() { // from class: X.0D8Y
            @Override // X.InterfaceC333290D4t
            public final void showToast(Context context, String str) {
                C334150D8b.LIZIZ(context, str);
            }
        });
    }

    public static C0DIX LIZ() {
        Object objLIZLLL = LIZLLL(C0DIX.class);
        if (objLIZLLL != null) {
            return (C0DIX) objLIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Service ");
        sbLIZ.append(C0DIX.class.getSimpleName());
        sbLIZ.append(" is not registered in UCPExternal");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C0D83 LIZIZ() {
        Object objLIZLLL = LIZLLL(C0D83.class);
        if (objLIZLLL != null) {
            return (C0D83) objLIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Service ");
        sbLIZ.append(C0D83.class.getSimpleName());
        sbLIZ.append(" is not registered in UCPExternal");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static InterfaceC331980Czs LIZJ() {
        Object objLIZLLL = LIZLLL(InterfaceC331980Czs.class);
        if (objLIZLLL != null) {
            return (InterfaceC331980Czs) objLIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Service ");
        sbLIZ.append(InterfaceC331980Czs.class.getSimpleName());
        sbLIZ.append(" is not registered in UCPExternal");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static InterfaceC332180D0m LJ() {
        Object objLIZLLL = LIZLLL(InterfaceC332180D0m.class);
        if (objLIZLLL != null) {
            return (InterfaceC332180D0m) objLIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Service ");
        sbLIZ.append(InterfaceC332180D0m.class.getSimpleName());
        sbLIZ.append(" is not registered in UCPExternal");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static InterfaceC333290D4t LJFF() {
        Object objLIZLLL = LIZLLL(InterfaceC333290D4t.class);
        if (objLIZLLL != null) {
            return (InterfaceC333290D4t) objLIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Service ");
        sbLIZ.append(InterfaceC333290D4t.class.getSimpleName());
        sbLIZ.append(" is not registered in UCPExternal");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Object LIZLLL(Class cls) {
        Object obj = LIZ.get(cls);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
