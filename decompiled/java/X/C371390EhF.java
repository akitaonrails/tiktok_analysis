package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371390EhF {
    public static String LIZ(String str) {
        boolean z;
        long jLastModified;
        Unit unit;
        ParcelFileDescriptor parcelFileDescriptorLIZLLL;
        String str2 = C370950EgX.LIZIZ.get(str);
        if (str2 == null) {
            String strLIZIZ = "";
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                return "";
            }
            try {
                Uri uri = UriProtector.parse(str);
                if (Intrinsics.LJFF(uri.getScheme(), "content")) {
                    C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
                    Context context = C0E46.LIZ().LIZ;
                    unit = null;
                    Throwable th = null;
                    unit = null;
                    if (context == null) {
                        context = null;
                    }
                    ContentResolver contentResolver = context.getContentResolver();
                    if (contentResolver != null && (parcelFileDescriptorLIZLLL = C09NT.LIZLLL(contentResolver, uri, "r")) != null) {
                        try {
                            final C0VSP c0vsp = new C0VSP(parcelFileDescriptorLIZLLL.getFileDescriptor());
                            try {
                                strLIZIZ = C20130113pb.LIZ(new InterfaceC20130413pe(c0vsp) { // from class: X.0W9B
                                    public final FileInputStream LIZ;
                                    public final FileChannel LIZIZ;
                                    public final ByteBuffer LIZJ;

                                    @Override // X.InterfaceC20130413pe
                                    public final void close() {
                                        Unit unit2;
                                        try {
                                            FileChannel fileChannel = this.LIZIZ;
                                            if (fileChannel != null) {
                                                fileChannel.close();
                                                unit2 = Unit.LIZ;
                                            } else {
                                                unit2 = null;
                                            }
                                            C189200o6.m2constructorimpl(unit2);
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                                        }
                                        try {
                                            this.LIZ.close();
                                            C189200o6.m2constructorimpl(Unit.LIZ);
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            C189200o6.m2constructorimpl(new C098200Yq(th3));
                                        }
                                    }

                                    @Override // X.InterfaceC20130413pe
                                    public final long length() {
                                        FileChannel fileChannel = this.LIZIZ;
                                        if (fileChannel != null) {
                                            return fileChannel.size();
                                        }
                                        return -1L;
                                    }

                                    {
                                        Object c098200Yq;
                                        Object c098200Yq2;
                                        this.LIZ = c0vsp;
                                        try {
                                            c098200Yq = c0vsp.getChannel();
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            c098200Yq = new C098200Yq(th2);
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        }
                                        this.LIZIZ = (FileChannel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                                        try {
                                            c098200Yq2 = ByteBuffer.allocate(8192);
                                            C189200o6.m2constructorimpl(c098200Yq2);
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            c098200Yq2 = new C098200Yq(th3);
                                            C189200o6.m2constructorimpl(c098200Yq2);
                                        }
                                        this.LIZJ = (ByteBuffer) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
                                    }

                                    @Override // X.InterfaceC20130413pe
                                    public final void LIZIZ(long j) throws IOException {
                                        FileChannel fileChannel = this.LIZIZ;
                                        if (fileChannel != null) {
                                            fileChannel.position(j);
                                        }
                                    }

                                    @Override // X.InterfaceC20130413pe
                                    public final int LIZ(byte[] bArr, int i) throws IOException {
                                        FileChannel fileChannel;
                                        ByteBuffer byteBuffer = this.LIZJ;
                                        if (byteBuffer == null || (fileChannel = this.LIZIZ) == null) {
                                            return -1;
                                        }
                                        int i2 = fileChannel.read(byteBuffer);
                                        if (i2 != -1) {
                                            byteBuffer.flip();
                                            byteBuffer.get(bArr, 0, i2);
                                            byteBuffer.clear();
                                        }
                                        return i2;
                                    }
                                }, 9, 8192L);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                            C2107108Nh.LIZ(parcelFileDescriptorLIZLLL, null);
                            unit = Unit.LIZ;
                        } finally {
                            try {
                                try {
                                } catch (Throwable th3) {
                                    while (true) {
                                    }
                                }
                            } catch (Throwable th4) {
                            }
                        }
                    }
                } else {
                    C0VSJ c0vsj = new C0VSJ(str);
                    try {
                        if (c0vsj.exists()) {
                            strLIZIZ = C20130113pb.LIZ(new C20130213pc(c0vsj), 9, 8192L);
                        }
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                    }
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                C189200o6.m2constructorimpl(new C098200Yq(th6));
            }
            if (strLIZIZ != null && !a0.LJJJIL(strLIZIZ)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                C370720EgA.LIZ.getClass();
                C0VSJ c0vsj2 = new C0VSJ(str);
                if (c0vsj2.exists() && c0vsj2.isFile()) {
                    jLastModified = c0vsj2.lastModified();
                } else {
                    jLastModified = 0;
                }
                sbLIZ.append(jLastModified);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C370950EgX.LIZIZ.put(str, strLIZIZ);
            return strLIZIZ;
        }
        return str2;
    }

    public static String LIZIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('#');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
