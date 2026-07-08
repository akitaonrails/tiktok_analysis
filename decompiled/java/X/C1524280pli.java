package X;

import Y.AfS8S0100100_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0pli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524280pli extends AbstractC1524320plm {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(331));

    @Override // X.AbstractC1524320plm
    public final void LIZJ(C1639430slR c1639430slR, String str, final String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0X33 c0x33 = new C0X33();
        c0x33.LJII(str);
        final Request requestLIZIZ = c0x33.LIZIZ();
        AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0pC8
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<AbstractC842510X3h> interfaceC2329309At) throws Throwable {
                try {
                    C1495520p1K c1495520p1K = (C1495520p1K) this.LL.LIZ.getValue();
                    Request request = requestLIZIZ;
                    c1495520p1K.getClass();
                    C0XLY c0xlyJ0 = C2204961BRm.j0(C1495500p1I.LIZJ(c1495520p1K, request, false), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKPitc5Dd1SYlgm6WZmKewKYB12esKvbNkYJO2kFb3ozcklaAHyIaOnbybQ6Z0Eft9Tq+KiZEzC9s53OStg8=", null));
                    if (c0xlyJ0.LIZIZ()) {
                        AbstractC842510X3h abstractC842510X3h = c0xlyJ0.LLIZ;
                        if (abstractC842510X3h != null) {
                            interfaceC2329309At.onSuccess(abstractC842510X3h);
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("response body null, status code is: ");
                        sbLIZ.append(c0xlyJ0.LLILLL);
                        interfaceC2329309At.onError(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("status code error, status code is: ");
                    sbLIZ2.append(c0xlyJ0.LLILLL);
                    interfaceC2329309At.onError(new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    interfaceC2329309At.onError(e);
                }
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJIL(new InterfaceC1487280oo2() { // from class: X.0X3l
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws Throwable {
                C1496650p39 c1496650p39LIZ;
                C1524280pli c1524280pli = this.LL;
                InputStream inputStreamByteStream = ((AbstractC842510X3h) obj).byteStream();
                String str3 = str2;
                c1524280pli.getClass();
                C0VSJ c0vsj = new C0VSJ(str3);
                try {
                    c1496650p39LIZ = C1496330p2d.LIZ(new C0VSV((File) c0vsj, false));
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c0vsj.getParentFile().mkdirs();
                    c1496650p39LIZ = C1496330p2d.LIZ(new C0VSV((File) c0vsj, false));
                }
                c1496650p39LIZ.close();
                Throwable th = null;
                try {
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    }
                    C0VSV c0vsv = new C0VSV(c0vsj);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStreamByteStream.read(bArr);
                            if (i != -1) {
                                c0vsv.write(bArr, 0, i);
                            } else {
                                C2107108Nh.LIZ(c0vsv, null);
                                C2107108Nh.LIZ(inputStreamByteStream, null);
                                return Unit.LIZ;
                            }
                        }
                    } finally {
                        th = th;
                        try {
                            try {
                            } catch (Throwable th2) {
                                while (true) {
                                }
                            }
                        } catch (Throwable th3) {
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        TryCatchGuardChecker.doCheck(th4);
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th4;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(inputStreamByteStream, th);
                                    throw th;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            }
        }).LJJIIZ(new AfS8S0100100_23(c1639430slR, str, jCurrentTimeMillis, 1), new AfS8S0100100_23(c1639430slR, str, jCurrentTimeMillis, 2));
    }
}
