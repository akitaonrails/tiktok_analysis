package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0VKP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VKP implements C0VKA {
    @Override // X.C0VKA
    public final InterfaceC796190VLd LIZ(C0VKQ c0vkq) {
        final Context context = c0vkq.LIZ;
        final String str = c0vkq.LIZIZ;
        final C0VOE c0voe = c0vkq.LIZJ;
        final boolean z = c0vkq.LIZLLL;
        return new InterfaceC796190VLd(context, str, c0voe, z) { // from class: X.0VNt
            public final Context LL;
            public final String LLILLJJLI;
            public final C0VOE LLILLL;
            public final boolean LLILZ;
            public final Object LLILZIL = new Object();
            public C0VOC LLILZLL;
            public boolean LLIZ;

            public final C0VOC LIZ() {
                C0VOC c0voc;
                synchronized (this.LLILZIL) {
                    try {
                        if (this.LLILZLL == null) {
                            C0VOI[] c0voiArr = new C0VOI[1];
                            if (this.LLILLJJLI == null || !this.LLILZ) {
                                this.LLILZLL = new C0VOC(this.LL, this.LLILLJJLI, c0voiArr, this.LLILLL);
                            } else {
                                this.LLILZLL = new C0VOC(this.LL, new File(this.LL.getNoBackupFilesDir(), this.LLILLJJLI).getAbsolutePath(), c0voiArr, this.LLILLL);
                            }
                            this.LLILZLL.setWriteAheadLoggingEnabled(this.LLIZ);
                        }
                        c0voc = this.LLILZLL;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return c0voc;
            }

            @Override // X.InterfaceC796190VLd
            public final C0VLF LJLJJI() {
                return LIZ().LIZIZ();
            }

            @Override // X.InterfaceC796190VLd, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                LIZ().close();
            }

            @Override // X.InterfaceC796190VLd
            public final String getDatabaseName() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC796190VLd
            public final void setWriteAheadLoggingEnabled(boolean z2) {
                synchronized (this.LLILZIL) {
                    try {
                        C0VOC c0voc = this.LLILZLL;
                        if (c0voc != null) {
                            c0voc.setWriteAheadLoggingEnabled(z2);
                        }
                        this.LLIZ = z2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            {
                this.LL = context;
                this.LLILLJJLI = str;
                this.LLILLL = c0voe;
                this.LLILZ = z;
            }
        };
    }
}
