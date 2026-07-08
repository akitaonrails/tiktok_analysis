package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0kVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322270kVt {
    public static void LIZIZ(final String str, InterfaceC1316360kMM interfaceC1316360kMM) {
        final String strLIZIZ;
        final C1331070kk5 c1331070kk5;
        final C1318160kPG c1318160kPG = new C1318160kPG(20, 20);
        if (str != null && (strLIZIZ = C1942307jB.LIZIZ(UriProtector.parse(str), "blurhash")) != null && strLIZIZ.length() != 0 && interfaceC1316360kMM != null && (interfaceC1316360kMM instanceof C1331070kk5) && (c1331070kk5 = (C1331070kk5) interfaceC1316360kMM) != null) {
            new C1318150kPF(strLIZIZ, c1318160kPG, new InterfaceC1318090kP9() { // from class: X.0kVr
                @Override // X.InterfaceC1318090kP9
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap == null) {
                        C1322270kVt.LIZ(false, str, strLIZIZ, c1318160kPG);
                        return;
                    }
                    try {
                        final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                        if (bitmapDrawable != null) {
                            final C1331070kk5 c1331070kk52 = c1331070kk5;
                            final String str2 = str;
                            final String str3 = strLIZIZ;
                            final C1318160kPG c1318160kPG2 = c1318160kPG;
                            if (C1289620jfE.LIZIZ()) {
                                c1331070kk52.LJIJ(bitmapDrawable, 1);
                                C1322270kVt.LIZ(true, str2, str3, c1318160kPG2);
                            } else {
                                BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                                Message messageObtain = Message.obtain(bPEAHandler, new Runnable() { // from class: X.0kVs
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("EcomBlurHashUtilsKt@6668.setBlurHashPlaceholder$1$3$msg$1");
                                        try {
                                            c1331070kk52.LJIJ(bitmapDrawable, 1);
                                            C1322270kVt.LIZ(true, str2, str3, c1318160kPG2);
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("EcomBlurHashUtilsKt@6668.setBlurHashPlaceholder$1$3$msg$1");
                                    }
                                });
                                messageObtain.setAsynchronous(true);
                                C786410Ut5.LJLJJLL(bPEAHandler, messageObtain);
                            }
                        }
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
        }
    }

    public static final void LIZ(boolean z, String str, String str2, C1318160kPG c1318160kPG) {
        C1326370kcV.LIZ(new C1322280kVu(z, str, C1334150kp3.LJI(UriProtector.parse(str)), str2, c1318160kPG));
    }
}
