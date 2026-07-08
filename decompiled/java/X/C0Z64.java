package X;

import com.bytedance.ies.im.core.api.PlatformApi;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: X.0Z64, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z64 implements InterfaceC872790YLt {
    public static final /* synthetic */ C0Z64 LIZ = new C0Z64();
    public static PlatformApi LIZIZ = LIZLLL();

    public static PlatformApi LIZLLL() {
        String str;
        IRetrofitFactory iRetrofitFactory;
        C1499850p8J c1499850p8JCreateBuilder;
        try {
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            if (iMHostApiLIZ != null) {
                iMHostApiLIZ.LJIIJ();
                str = "https://im-va.tiktokv.com/";
            } else {
                str = "";
            }
            if (str.length() != 0 && (iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpiForReal(IRetrofitFactory.class)) != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) != null) {
                return (PlatformApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PlatformApi.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public final PlatformApi LIZJ() {
        if (LIZIZ == null) {
            synchronized (this) {
                try {
                    if (LIZIZ == null) {
                        LIZ.getClass();
                        LIZIZ = LIZLLL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static C19478811Is LIZ(Throwable th) {
        if (th instanceof C0VYA) {
            C0VYA c0vya = (C0VYA) th;
            if (c0vya.getExceptions().size() == 1) {
                return AbstractC19484711Kz.LJIILLIIL((Throwable) ListProtector.get(c0vya.getExceptions(), 0));
            }
            return AbstractC19484711Kz.LJIILLIIL(th);
        }
        return AbstractC19484711Kz.LJIILLIIL(th);
    }

    public static C0YMW LIZIZ(Throwable th) throws Throwable {
        C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
        C0YMW c0ymw = c0ymxNewBuilder.LIZ;
        c0ymw.throwable = th;
        if (th instanceof C0XIR) {
            c0ymw.status = -1032;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ApiServerException: code ");
            C0XIR c0xir = (C0XIR) th;
            sbLIZ.append(c0xir.getErrorCode());
            sbLIZ.append(" msg ");
            sbLIZ.append(c0xir.getErrorMsg());
            c0ymxNewBuilder.LIZ.statusMsg = C2188811AlT.LIZIZ(sbLIZ);
            c0ymxNewBuilder.LIZ.ext = c0xir.getResponse();
        } else if (th instanceof C1494450ozb) {
            c0ymw.status = -1014;
        } else if (th instanceof C1494430ozZ) {
            c0ymw.status = -1033;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HttpResponseException: code ");
            sbLIZ2.append(((C1494430ozZ) th).getStatusCode());
            sbLIZ2.append(" msg ");
            sbLIZ2.append(th.getMessage());
            c0ymxNewBuilder.LIZ.statusMsg = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (th instanceof C1494690ozz) {
            c0ymw.status = -1031;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("HttpResponseException: code ");
            sbLIZ3.append(((C1494690ozz) th).getStatusCode());
            sbLIZ3.append(" msg ");
            sbLIZ3.append(th.getMessage());
            c0ymxNewBuilder.LIZ.statusMsg = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (!(th instanceof ConnectTimeoutException) && !(th instanceof SocketTimeoutException)) {
            if (!(th instanceof BindException) && !(th instanceof ConnectException) && !(th instanceof SocketException) && !(th instanceof NoRouteToHostException)) {
                if (th instanceof PortUnreachableException) {
                    c0ymw.status = -1023;
                    c0ymxNewBuilder.LIZ.statusMsg = th.getMessage();
                } else if (th instanceof UnknownHostException) {
                    c0ymw.status = -1024;
                    c0ymxNewBuilder.LIZ.statusMsg = th.getMessage();
                } else if (th instanceof C0Z68) {
                    c0ymw.status = -1025;
                    c0ymxNewBuilder.LIZ.statusMsg = th.getMessage();
                } else if (th instanceof C1494440oza) {
                    c0ymw.status = -1026;
                    c0ymxNewBuilder.LIZ.statusMsg = th.getMessage();
                } else if (th instanceof IOException) {
                    c0ymw.status = -1027;
                    c0ymxNewBuilder.LIZ.statusMsg = th.getMessage();
                } else if (th instanceof C0VYA) {
                    c0ymw.status = -1030;
                    C0VYA c0vya = (C0VYA) th;
                    c0ymxNewBuilder.LIZ.statusMsg = c0vya.getMessage();
                    c0ymxNewBuilder.LIZ.throwable = c0vya.getCause();
                    C1AF0.LJFF(th, "IM-PlatformApi composite error");
                    C0I0B c0i0b = C0I0B.LJFF;
                    c0i0b.LIZJ();
                    if (!Intrinsics.LJFF(C894660Z7w.LIZIZ(), "local_test")) {
                        c0i0b.LIZJ();
                        if (!Intrinsics.LJFF(C894660Z7w.LIZIZ(), "lark_inhouse")) {
                            c0i0b.LIZJ();
                            if (C894660Z7w.LIZJ()) {
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                } else {
                    C1AF0.LJFF(th, "IM-PlatformApi unknown http error");
                    C0I0B c0i0b2 = C0I0B.LJFF;
                    c0i0b2.LIZJ();
                    if (!Intrinsics.LJFF(C894660Z7w.LIZIZ(), "local_test")) {
                        c0i0b2.LIZJ();
                        if (!Intrinsics.LJFF(C894660Z7w.LIZIZ(), "lark_inhouse")) {
                            c0i0b2.LIZJ();
                            if (C894660Z7w.LIZJ()) {
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                }
            } else {
                c0ymw.status = -1006;
                c0ymxNewBuilder.LIZ.statusMsg = th.getMessage();
            }
        } else {
            c0ymw.status = -1021;
            c0ymxNewBuilder.LIZ.statusMsg = th.getMessage();
        }
        return c0ymxNewBuilder.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final X.C883410Yl9 r11, final X.C914120Zta r12) {
        /*
            r10 = this;
            com.bytedance.ies.im.core.api.PlatformApi r3 = r10.LIZJ()
            if (r3 != 0) goto L1f
            X.0YMX r2 = X.C0YMW.newBuilder()
            X.0YMW r1 = r2.LIZ
            r0 = -1022(0xfffffffffffffc02, float:NaN)
            r1.code = r0
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "platformApi is null"
            r1.<init>(r0)
            X.0YMW r0 = r2.LIZ
            r0.throwable = r1
            r12.LIZIZ(r0)
            return
        L1f:
            X.01GW r0 = X.C270270AiX.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L2f
            r0 = 0
        L2f:
            java.lang.String r2 = "X-Biz-Id"
            java.lang.String r1 = "Content-Type"
            java.lang.String r7 = ""
            if (r0 == 0) goto L83
            java.lang.String r4 = r11.LIZ
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.LIZIZ
            java.lang.Object r5 = r0.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L44
            r5 = r7
        L44:
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r0 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            if (r0 == 0) goto L63
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L63
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZJ()
            android.content.Context r0 = X.C894660Z7w.LIZ()
            java.lang.String r6 = r1.LJIILJJIL(r0)
            if (r6 != 0) goto L64
        L63:
            r6 = r7
        L64:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.LIZIZ
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6f
            r7 = r0
        L6f:
            REQUEST_BODY r8 = r11.LIZLLL
            com.bytedance.im.core.proto.Request r8 = (com.bytedance.im.core.proto.Request) r8
            X.0oyG r9 = r11.LJ
            X.0X9S r2 = r3.post(r4, r5, r6, r7, r8, r9)
            X.0Ztc r1 = new X.0Ztc
            r0 = 0
            r1.<init>(r12, r0)
            r2.enqueue(r1)
            return
        L83:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.LIZIZ
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L8e
            r1 = r7
        L8e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.LIZIZ
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L99
            r7 = r0
        L99:
            X.0YlG r0 = new X.0YlG
            r0.<init>()
            X.11Iq r1 = new X.11Iq
            r1.<init>(r0)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Ks r1 = r1.LJJIJIIJI(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11HU r1 = r1.LJJ(r0)
            X.0Z66<T, R> r0 = new X.InterfaceC1487280oo2() { // from class: X.0Z66
                static {
                    /*
                        X.0Z66 r0 = new X.0Z66
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Z66<T, R>) X.0Z66.LL X.0Z66
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0Z66.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0Z66.<init>():void");
                }

                @Override // X.InterfaceC1487280oo2
                public final java.lang.Object apply(java.lang.Object r2) {
                    /*
                        r1 = this;
                        java.lang.Throwable r2 = (java.lang.Throwable) r2
                        X.0Z64 r0 = X.C0Z64.LIZ
                        r0.getClass()
                        X.11Is r0 = X.C0Z64.LIZ(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0Z66.apply(java.lang.Object):java.lang.Object");
                }
            }
            X.11HW r2 = r1.LJJI(r0)
            X.0YSx r1 = new X.0YSx
            r1.<init>()
            X.0Z62 r0 = new X.0Z62
            r0.<init>()
            r2.LJJIIZ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z64.LJ(X.0Yl9, X.0Zta):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C883410Yl9 r11, X.C914120Zta r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z64.LJFF(X.0Yl9, X.0Zta):void");
    }
}
