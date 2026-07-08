package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.tiktok.forestx.builtin.processor.File2BufferProcessor;
import java.nio.ByteBuffer;
import kotlin.Pair;
import kotlin.jvm.internal.AwS438S0200000_2;

/* JADX INFO: renamed from: X.0Whw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830460Whw {
    public static File2BufferProcessor LIZ(final AwS438S0200000_2 awS438S0200000_2) {
        Object c098200Yq;
        try {
            LoadSoLancet.LIZJ("forestx_native_buffer");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("forestx_native_buffer");
            LoadSoLancet.LJ(jUptimeMillis, "forestx_native_buffer");
            LoadSoLancet.LIZLLL(jUptimeMillis, "forestx_native_buffer");
            LoadSoLancet.LIZIZ("forestx_native_buffer");
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            return null;
        }
        return new File2BufferProcessor(new AbstractC830440Whu() { // from class: X.0Whv
            @Override // X.AbstractC830440Whu
            public final Pair<ByteBuffer, Long> LIZ(String str) {
                File2BufferProcessor.LJI.getClass();
                long[] fileToNativeMemory = File2BufferProcessor.readFileToNativeMemory(str);
                if (fileToNativeMemory == null) {
                    return null;
                }
                if (fileToNativeMemory.length < 2) {
                    if (fileToNativeMemory.length != 0) {
                        long j = fileToNativeMemory[0];
                        if (j != 0) {
                            LIZIZ(j);
                        }
                    }
                    return null;
                }
                long j2 = fileToNativeMemory[0];
                long j3 = fileToNativeMemory[1];
                if (j3 > 0 && j3 < 2147483647L) {
                    ByteBuffer byteBufferInvoke = awS438S0200000_2.invoke(Long.valueOf(j2), Integer.valueOf((int) j3));
                    if (byteBufferInvoke == null) {
                        LIZIZ(j2);
                        return null;
                    }
                    return new Pair<>(byteBufferInvoke, Long.valueOf(j2));
                }
                if (j2 != 0) {
                    LIZIZ(j2);
                }
                return null;
            }

            @Override // X.AbstractC830440Whu
            public final void LIZIZ(long j) {
                File2BufferProcessor.LJI.getClass();
                File2BufferProcessor.freeMemory(j);
            }
        }, "File2Buffer_JNI");
    }
}
