package X;

import android.os.Build;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import xlp.c;

/* JADX INFO: renamed from: X.0X3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C842660X3w extends C842670X3x {
    public final C1968407nO<Socket> LIZJ;
    public final C1968407nO<Socket> LIZLLL;
    public final C1968407nO<Socket> LJ;
    public final C1968407nO<Socket> LJFF;
    public final C0X44 LJI;

    @Override // X.C842670X3x
    public final SSLContext LJII() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // X.C842670X3x
    public final Object LJIIIZ() throws Throwable {
        C0X44 c0x44 = this.LJI;
        Method method = c0x44.LIZ;
        if (method != null) {
            try {
                Object objA0 = C2204961BRm.a0(method, null, new Object[0], new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyv0SdNafYoXLgheKyn58Q=", null));
                C2204961BRm.a0(c0x44.LIZIZ, objA0, new Object[]{"response.body().close()"}, new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyv0SdNafYoXLgheKyn58Q=", null));
                return objA0;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // X.C842670X3x
    public final AbstractC842630X3t LIZJ(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            final Object objNewInstance = cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager);
            final Method method = cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
            return new AbstractC842630X3t(objNewInstance, method) { // from class: X.0X3u
                public final Object LIZ;
                public final Method LIZIZ;

                public final int hashCode() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return obj instanceof C842640X3u;
                }

                {
                    this.LIZ = objNewInstance;
                    this.LIZIZ = method;
                }

                @Override // X.AbstractC842630X3t
                public final List LIZ(String str, List list) throws SSLPeerUnverifiedException {
                    try {
                        return (List) C2204961BRm.a0(this.LIZIZ, this.LIZ, new Object[]{list.toArray(new X509Certificate[list.size()]), "RSA", str}, new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyv0SdNafYoXLgheKyn58Q=", null));
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new AssertionError(e);
                    } catch (InvocationTargetException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                        sSLPeerUnverifiedException.initCause(e2);
                        throw sSLPeerUnverifiedException;
                    }
                }
            };
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return super.LIZJ(x509TrustManager);
        }
    }

    @Override // X.C842670X3x
    public final InterfaceC842620X3s LIZLLL(final X509TrustManager x509TrustManager) {
        try {
            final Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new InterfaceC842620X3s(x509TrustManager, declaredMethod) { // from class: X.0X43
                public final X509TrustManager LIZ;
                public final Method LIZIZ;

                public final int hashCode() {
                    return this.LIZ.hashCode() + (this.LIZIZ.hashCode() * 31);
                }

                @Override // X.InterfaceC842620X3s
                public final X509Certificate LIZ(X509Certificate x509Certificate) {
                    X509Certificate trustedCert = null;
                    try {
                        TrustAnchor trustAnchor = (TrustAnchor) C2204961BRm.a0(this.LIZIZ, this.LIZ, new Object[]{x509Certificate}, new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyv0SdNafYoXLgheKyn58Q=", null));
                        if (trustAnchor == null) {
                            return null;
                        }
                        trustedCert = trustAnchor.getTrustedCert();
                        return trustedCert;
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw c.LIZ("unable to get issues and signature", e);
                    } catch (InvocationTargetException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return trustedCert;
                    }
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof C0X43)) {
                        return false;
                    }
                    C0X43 c0x43 = (C0X43) obj;
                    if (this.LIZ.equals(c0x43.LIZ) && this.LIZIZ.equals(c0x43.LIZIZ)) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LIZIZ = declaredMethod;
                    this.LIZ = x509TrustManager;
                }
            };
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return super.LIZLLL(x509TrustManager);
        }
    }

    @Override // X.C842670X3x
    public String LJIIIIZZ(SSLSocket sSLSocket) {
        byte[] bArr;
        C1968407nO<Socket> c1968407nO = this.LJ;
        if (c1968407nO == null || c1968407nO.LIZ(sSLSocket.getClass()) == null || (bArr = (byte[]) this.LJ.LIZLLL(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, c.LJIIIIZZ);
    }

    @Override // X.C842670X3x
    public final boolean LJIIJ(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return LJIILIIL(cls, str, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            return true;
        } catch (IllegalAccessException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            throw c.LIZ("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            throw c.LIZ("unable to determine cleartext support", e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            return true;
        } catch (InvocationTargetException e5) {
            e = e5;
            TryCatchGuardChecker.doCheck(e);
            throw c.LIZ("unable to determine cleartext support", e);
        }
    }

    @Override // X.C842670X3x
    public final void LJIIL(Object obj, String str) throws Throwable {
        C0X44 c0x44 = this.LJI;
        c0x44.getClass();
        if (obj != null) {
            try {
                C2204961BRm.a0(c0x44.LIZJ, obj, new Object[0], new C0WZX("ezR2SBYqDITVW0MkVxyFal/WmgXgBLgsMTyv0SdNafYoXLgheKyn58Q=", null));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJIIJJI(5, str, null);
    }

    public static boolean LJIILIIL(Class cls, String str, Object obj) {
        boolean zBooleanValue = true;
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                zBooleanValue = ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
                return zBooleanValue;
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return zBooleanValue;
            }
        }
    }

    @Override // X.C842670X3x
    public void LJFF(SSLSocket sSLSocket, String str, List<EnumC847200XLi> list) throws Throwable {
        if (str != null) {
            this.LIZJ.LIZJ(sSLSocket, Boolean.TRUE);
            this.LIZLLL.LIZJ(sSLSocket, str);
        }
        C1968407nO<Socket> c1968407nO = this.LJFF;
        if (c1968407nO != null && c1968407nO.LIZ(sSLSocket.getClass()) != null) {
            Object[] objArr = new Object[1];
            C1496690p3D c1496690p3D = new C1496690p3D();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC847200XLi enumC847200XLi = (EnumC847200XLi) ListProtector.get(list, i);
                if (enumC847200XLi != EnumC847200XLi.HTTP_1_0) {
                    c1496690p3D.LJJJZ(enumC847200XLi.toString().length());
                    c1496690p3D.LJLJJLL(enumC847200XLi.toString());
                }
            }
            objArr[0] = c1496690p3D.LJZL();
            this.LJFF.LIZLLL(sSLSocket, objArr);
        }
    }

    @Override // X.C842670X3x
    public final void LJI(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            TryCatchGuardChecker.doCheck(e);
            if (c.LJIILLIIL(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            TryCatchGuardChecker.doCheck(e3);
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // X.C842670X3x
    public final void LJIIJJI(int i, String str, Throwable th) {
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('\n');
            sbLIZ.append(Log.getStackTraceString(th));
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        int length = str.length();
        int iMin = 0;
        while (iMin < length) {
            int iIndexOf = str.indexOf(10, iMin);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            do {
                iMin = Math.min(iIndexOf, iMin + 4000);
            } while (iMin < iIndexOf);
            iMin++;
        }
    }

    public C842660X3w(Class<?> cls, C1968407nO<Socket> c1968407nO, C1968407nO<Socket> c1968407nO2, C1968407nO<Socket> c1968407nO3, C1968407nO<Socket> c1968407nO4) {
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method = cls2.getMethod("get", new Class[0]);
            method3 = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            method = null;
            method2 = null;
            method3 = null;
        }
        this.LJI = new C0X44(method, method3, method2);
        this.LIZJ = c1968407nO;
        this.LIZLLL = c1968407nO2;
        this.LJ = c1968407nO3;
        this.LJFF = c1968407nO4;
    }
}
