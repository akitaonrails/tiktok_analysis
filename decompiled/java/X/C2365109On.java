package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* JADX INFO: renamed from: X.09On, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2365109On<T> implements InterfaceC1478005qU {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;

    public C2365109On(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Bitmap> c09aj) throws Throwable {
        Throwable th;
        String strLJIIL;
        Bitmap bitmapDecodeFile;
        C1C7U.LIZ("GeckoResourceLoader@9f63.getGeckoBitmap$1");
        if (!TextUtils.isEmpty(this.LIZ) && !TextUtils.isEmpty(this.LIZIZ)) {
            try {
                String str = this.LIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = this.LIZIZ;
                if (str3 == null) {
                    str3 = "";
                }
                th = null;
                if (!TextUtils.isEmpty(C1143780fs0.LIZIZ(str, str3))) {
                    String str4 = this.LIZ;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = this.LIZIZ;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    InputStream inputStreamLIZLLL = C1143780fs0.LIZLLL(str4, str2);
                    try {
                        try {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamLIZLLL);
                            if (bitmapDecodeStream != null) {
                                if (!c09aj.isDisposed()) {
                                    c09aj.onNext(bitmapDecodeStream);
                                    c09aj.onComplete();
                                }
                                C2107108Nh.LIZ(inputStreamLIZLLL, null);
                                C1C7U.LIZIZ("GeckoResourceLoader@9f63.getGeckoBitmap$1");
                                return;
                            }
                            C2107108Nh.LIZ(inputStreamLIZLLL, null);
                        } catch (Throwable th2) {
                            try {
                                TryCatchGuardChecker.doCheck(th2);
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th2;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            C2107108Nh.LIZ(inputStreamLIZLLL, th);
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getGeckoBitmap, load resource error, channel:");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", fileName:");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append(", exception:");
                        sbLIZ.append(e);
                        C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ));
                        if (!c09aj.isDisposed()) {
                            c09aj.onError(e);
                        }
                    }
                }
                strLJIIL = C1143780fs0.LJIIL(this.LIZ, this.LIZIZ);
            } catch (Exception e2) {
                e = e2;
            }
            if (!TextUtils.isEmpty(strLJIIL) && new C0VSJ(strLJIIL).exists() && (bitmapDecodeFile = BitmapFactory.decodeFile(strLJIIL)) != null) {
                if (!c09aj.isDisposed()) {
                    c09aj.onNext(bitmapDecodeFile);
                    c09aj.onComplete();
                }
                C1C7U.LIZIZ("GeckoResourceLoader@9f63.getGeckoBitmap$1");
                return;
            }
            List<String> listLJI = C1143780fs0.LJI(this.LIZ, this.LIZIZ);
            if (!listLJI.isEmpty()) {
                InputStream inputStreamOpenStream = new URL(listLJI.get(0)).openStream();
                try {
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenStream);
                    if (bitmapDecodeStream2 != null) {
                        if (!c09aj.isDisposed()) {
                            c09aj.onNext(bitmapDecodeStream2);
                            c09aj.onComplete();
                        }
                        C2107108Nh.LIZ(inputStreamOpenStream, null);
                        C1C7U.LIZIZ("GeckoResourceLoader@9f63.getGeckoBitmap$1");
                        return;
                    }
                    C2107108Nh.LIZ(inputStreamOpenStream, null);
                } catch (Throwable th6) {
                    try {
                        TryCatchGuardChecker.doCheck(th6);
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            th = th7;
                            th = th6;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(inputStreamOpenStream, th);
                                    throw th;
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Gecko resource not found for channel=");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(", fileName=");
            sbLIZ2.append(this.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C20441214yg.LJ("Gecko_Resource_Loader", strLIZIZ);
            if (!c09aj.isDisposed()) {
                c09aj.onError(new FileNotFoundException(strLIZIZ));
            }
            C1C7U.LIZIZ("GeckoResourceLoader@9f63.getGeckoBitmap$1");
            return;
        }
        c09aj.onError(new IllegalArgumentException("channel or fileName is empty"));
        C1C7U.LIZIZ("GeckoResourceLoader@9f63.getGeckoBitmap$1");
    }
}
