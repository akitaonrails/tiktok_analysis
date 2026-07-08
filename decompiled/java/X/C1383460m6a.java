package X;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0m6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383460m6a {
    public final WeakReference<Context> LIZ;
    public boolean LIZLLL;
    public final CountDownLatch LIZJ = new CountDownLatch(1);
    public final String LIZIZ = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();

    public C1383460m6a(WeakReference<Context> weakReference) {
        this.LIZ = weakReference;
    }

    public final C0WIY LIZ(final String str, final C1377550lx3 c1377550lx3) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            c1377550lx3.LIZIZ();
            return new C0WIY(Boolean.FALSE, null);
        }
        c1377550lx3.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08HM.LIZJ(str));
        sbLIZ.append(".png");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String path = new C0VSJ(this.LIZIZ, strLIZIZ).getPath();
        if (C2354709Kn.LIZIZ(path)) {
            this.LIZLLL = true;
        }
        if (!this.LIZLLL) {
            C810560Vqw.LJ(new Runnable() { // from class: X.0m6b
                /* JADX WARN: Type inference failed for: r1v2, types: [X.0m6c] */
                public final void LIZ() {
                    CountDownLatch countDownLatch;
                    try {
                        if (this.LL.LIZ.get() != null) {
                            C1383460m6a c1383460m6a = this.LL;
                            Context context = c1383460m6a.LIZ.get();
                            String str3 = str;
                            String str4 = this.LL.LIZIZ;
                            String str5 = strLIZIZ;
                            final InterfaceC1377580lx6 interfaceC1377580lx6 = c1377550lx3;
                            c1383460m6a.LIZLLL = C09U7.LIZ(context, str3, str4, str5, new InterfaceC846250XHr() { // from class: X.0m6c
                                @Override // X.InterfaceC846250XHr
                                public final void LIZ(int i, Object obj) {
                                    InterfaceC1377580lx6 interfaceC1377580lx62 = interfaceC1377580lx6;
                                    if (interfaceC1377580lx62 != null) {
                                        interfaceC1377580lx62.LIZ();
                                    }
                                }
                            });
                        } else {
                            C1383460m6a c1383460m6a2 = this.LL;
                            new RuntimeException("Context is null");
                            c1383460m6a2.getClass();
                            this.LL.LIZLLL = false;
                        }
                        countDownLatch = this.LL.LIZJ;
                    } catch (Throwable th) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C1383460m6a c1383460m6a3 = this.LL;
                            c1383460m6a3.getClass();
                            c1383460m6a3.LIZLLL = false;
                            countDownLatch = c1383460m6a3.LIZJ;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            this.LL.LIZJ.countDown();
                            throw th2;
                        }
                    }
                    countDownLatch.countDown();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ImageDownloader@4765.saveImage$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ImageDownloader@4765.saveImage$1");
                }
            });
            try {
                this.LIZJ.await();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LIZLLL && !TextUtils.isEmpty(path) && this.LIZ.get() != null) {
            C0VSJ c0vsj = new C0VSJ(path);
            C1377830lxV c1377830lxV = C1377830lxV.LIZ;
            Context context = this.LIZ.get();
            c1377830lxV.getClass();
            Uri uriLIZJ = C2400409as.LIZJ(context, c0vsj.getName(), "image/*", Environment.DIRECTORY_PICTURES + "/tiktok/");
            try {
                C844470XAv.LIZ.getClass();
                ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(C844470XAv.LIZ().getContentResolver(), uriLIZJ, "w");
                if (parcelFileDescriptorLIZLLL != null) {
                    C09N1.LIZJ(c0vsj, new C0VSV(parcelFileDescriptorLIZLLL.getFileDescriptor()));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (this.LIZLLL) {
            c1377550lx3.onSuccess(path);
        } else {
            c1377550lx3.LIZIZ();
        }
        Boolean boolValueOf = Boolean.valueOf(this.LIZLLL);
        if (this.LIZLLL) {
            str2 = path;
        }
        C0WIY c0wiy = new C0WIY(boolValueOf, str2);
        this.LIZLLL = false;
        return c0wiy;
    }
}
