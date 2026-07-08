package X;

import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: X.0836, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0836 extends AnonymousClass0835 {
    static {
        final int i = 0;
        AnonymousClass0835.LIZJ("getNetworkCapabilities", new AnonymousClass0838(i) { // from class: X.0837
            @Override // X.AnonymousClass0838
            public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                return null;
            }
        });
        AnonymousClass0835.LIZJ("getAllNetworks", new AnonymousClass0838(i) { // from class: X.0837
            @Override // X.AnonymousClass0838
            public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                return null;
            }
        });
        AnonymousClass0835.LIZJ("getLinkProperties", new AnonymousClass0838(i) { // from class: X.0837
            @Override // X.AnonymousClass0838
            public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                return null;
            }
        });
        AnonymousClass0835.LIZJ("getActiveNetworkInfo", new AnonymousClass0838(i) { // from class: X.0837
            @Override // X.AnonymousClass0838
            public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                return null;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0833, X.0835] */
    public final void LIZLLL() throws Throwable {
        try {
            ?? r7 = new AnonymousClass0835(this) { // from class: X.0833
                public final String LLIZ = "connectivity";

                public final void LIZLLL() {
                    Field fieldLIZ;
                    Object objLIZIZ;
                    String str = this.LLIZ;
                    try {
                        Class<?> cls = Class.forName("android.os.ServiceManager");
                        Object objLIZIZ2 = C1964607mm.LIZIZ(cls, "getService", str);
                        if (objLIZIZ2 == null || (fieldLIZ = C1962907mV.LIZ(cls, "sCache")) == null || (objLIZIZ = C1962907mV.LIZIZ(fieldLIZ, null)) == null || !(objLIZIZ instanceof Map)) {
                            return;
                        }
                        this.LLILZ = true;
                        this.LLILLJJLI = objLIZIZ2;
                        ((Map) objLIZIZ).put(str, C1961307mF.LIZ(objLIZIZ2, this));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                {
                    this.LL.put("queryLocalInterface", new AnonymousClass0838(this) { // from class: X.0834
                        public final AnonymousClass0835 LL;

                        @Override // X.AnonymousClass0838
                        public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                            return null;
                        }

                        {
                            this.LL = this;
                        }

                        @Override // X.AnonymousClass0838
                        public final Object LIZ(Object obj, Object obj2, Method method, Object[] objArr) {
                            AnonymousClass0835 anonymousClass0835 = this.LL;
                            return C1961307mF.LIZ(anonymousClass0835.LLILLJJLI, anonymousClass0835);
                        }
                    });
                }
            };
            r7.LIZLLL();
            Object objA0 = C2204961BRm.a0(C1964607mm.LIZ(Class.forName("android.net.IConnectivityManager$Stub"), "asInterface", IBinder.class), null, new Object[]{r7.LLILLJJLI}, new C0WZX("dzBzEgAjS8/YVFkiQFyUajCVf5LEaLPJXoSSIWKcBqrc2zK9vvqYSIWPh8nVwsSsGs7Nlu/3cwru7vL/KYJEl6jtFilUcXBUYNnZ+hcCefav2EY=", null));
            this.LLILZ = true;
            this.LLILLJJLI = objA0;
            AnonymousClass0892.LIZ("IConnectivityManagerProxy", "Hook proxy success!");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AnonymousClass0892.LIZ("IConnectivityManagerProxy", "Hook proxy connectivity Failed!!!");
        }
    }
}
