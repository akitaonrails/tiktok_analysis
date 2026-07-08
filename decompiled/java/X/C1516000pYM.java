package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0pYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516000pYM {
    public static final String LIZJ(Object obj) {
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj);
    }

    public static final String LIZLLL(Object obj) {
        return Base64.encodeToString(LIZJ(obj).getBytes(Charsets.UTF_8), 2);
    }

    public static final byte[] LJ(Object obj) {
        C1496710p3F c1496710p3F;
        C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
        Class<?> cls = obj.getClass();
        c1515210pX5LIZLLL.getClass();
        InterfaceC1132110fZB interfaceC1132110fZBLJII = C1515210pX5.LJII(cls);
        C1496710p3F c1496710p3F2 = null;
        byteArray = null;
        byteArray = null;
        byte[] byteArray = null;
        try {
            if (interfaceC1132110fZBLJII != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    c1496710p3F = new C1496710p3F(C1496330p2d.LIZ(byteArrayOutputStream));
                    try {
                        try {
                            interfaceC1132110fZBLJII.LIZ(new C1142350fph(c1496710p3F), obj);
                            c1496710p3F.flush();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJII(e);
                            if (c1496710p3F != null) {
                            }
                            return byteArray;
                        }
                    } catch (Throwable th) {
                        th = th;
                        c1496710p3F2 = c1496710p3F;
                        TryCatchGuardChecker.doCheck(th);
                        if (c1496710p3F2 != null) {
                            c1496710p3F2.close();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    c1496710p3F = null;
                }
                c1496710p3F.close();
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final <T> T LIZ(Class<T> cls, String str) {
        try {
            try {
                return (T) C19748512Ol.LIZIZ.LJII(new String(Base64.decode(str, 2), Charsets.UTF_8), cls);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJII(e2);
            return null;
        }
    }

    public static final Object LIZIZ(byte[] bArr, Class cls) {
        try {
            C1515210pX5.LIZLLL().getClass();
            C0IMD c0imdLJI = C1515210pX5.LJI(cls);
            if (c0imdLJI != null) {
                C1516680pZS c1516680pZS = new C1516680pZS();
                c1516680pZS.LJIIL(new C1506330pIl(bArr));
                return c0imdLJI.LIZJ(c1516680pZS);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return null;
        }
    }

    public static final <T> String LJFF(T t, InterfaceC1132110fZB<T> interfaceC1132110fZB) {
        byte[] bArrLIZ = C1515990pYL.LIZ(t, interfaceC1132110fZB);
        if (bArrLIZ != null) {
            return Base64.encodeToString(bArrLIZ, 2);
        }
        return null;
    }
}
