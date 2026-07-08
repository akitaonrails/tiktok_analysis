package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.09nW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2478809nW implements InterfaceC1487280oo2<String, C098D<Long>> {
    public final /* synthetic */ C2478709nV LL;

    public C2478809nW(C2478709nV c2478709nV) {
        this.LL = c2478709nV;
    }

    @Override // X.InterfaceC1487280oo2
    public final C098D<Long> apply(String str) {
        long j;
        C2478909nX c2478909nXLJFF;
        byte[] bArr;
        String str2 = str;
        C2478709nV c2478709nV = this.LL;
        synchronized (c2478709nV) {
            j = 0;
            if (c2478709nV.LIZ != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BufferedInputStream bufferedInputStream = null;
                try {
                    try {
                        c2478909nXLJFF = c2478709nV.LIZ.LJFF(str2);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e) {
                    e = e;
                }
                if (c2478909nXLJFF == null) {
                    C2260008tK.LIZ(byteArrayOutputStream);
                } else {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(c2478909nXLJFF.LL[0]);
                    try {
                        bArr = new byte[1024];
                    } catch (Exception e2) {
                        e = e2;
                        bufferedInputStream = bufferedInputStream2;
                        TryCatchGuardChecker.doCheck(e);
                        C2260008tK.LIZ(bufferedInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        TryCatchGuardChecker.doCheck(th);
                        C2260008tK.LIZ(bufferedInputStream);
                        C2260008tK.LIZ(byteArrayOutputStream);
                        throw th;
                    }
                    while (true) {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        C2260008tK.LIZ(byteArrayOutputStream);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    byteBufferAllocate.put(byteArray);
                    byteBufferAllocate.flip();
                    j = byteBufferAllocate.getLong();
                    C2260008tK.LIZ(bufferedInputStream2);
                    C2260008tK.LIZ(byteArrayOutputStream);
                }
                TryCatchGuardChecker.doCheck(e);
                C2260008tK.LIZ(bufferedInputStream);
                C2260008tK.LIZ(byteArrayOutputStream);
            }
        }
        return C11NZ.LJJJJZ(Long.valueOf(j));
    }
}
