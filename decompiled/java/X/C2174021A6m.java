package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.MediaStore;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174021A6m {
    public boolean LIZ;
    public boolean LIZIZ;
    public C2174031A6n LIZJ;
    public C2174041A6o LIZLLL;
    public Function0<Unit> LJI;
    public long LJII;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LJFF = C452501pT.LIZIZ(new C2174051A6p(this));
    public final long LJIIIIZZ = 500;

    public final void LIZ() {
        if (System.currentTimeMillis() - this.LJII > this.LJIIIIZZ) {
            Function0<Unit> function0 = this.LJI;
            if (function0 != null) {
                function0.invoke();
            }
            this.LJII = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1A6n] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1A6o] */
    public final void LIZIZ(Activity activity) {
        String str;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        boolean z;
        if (!this.LIZ && !this.LIZIZ) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                str = "android.permission.READ_MEDIA_IMAGES";
            } else {
                str = "android.permission.READ_EXTERNAL_STORAGE";
            }
            try {
                if (C838410Wul.LIZ(activity, str) == 0) {
                    final BPEAHandler bPEAHandler = this.LJ;
                    this.LIZJ = new ContentObserver(bPEAHandler) { // from class: X.1A6n
                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z2) {
                            super.onChange(z2);
                            this.LIZ.LIZ();
                        }
                    };
                    final BPEAHandler bPEAHandler2 = this.LJ;
                    this.LIZLLL = new ContentObserver(bPEAHandler2) { // from class: X.1A6o
                        @Override // android.database.ContentObserver
                        public final void onChange(boolean z2) {
                            super.onChange(z2);
                            this.LIZ.LIZ();
                        }
                    };
                    C2174031A6n c2174031A6n = this.LIZJ;
                    boolean z2 = false;
                    if (c2174031A6n != null) {
                        ContentResolver contentResolver = C786410Ut5.L3(activity).getContentResolver();
                        Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                        if (i > 28) {
                            z = true;
                        } else {
                            z = false;
                        }
                        contentResolver.registerContentObserver(uri, z, c2174031A6n);
                    }
                    C2174041A6o c2174041A6o = this.LIZLLL;
                    if (c2174041A6o != null) {
                        ContentResolver contentResolver2 = C786410Ut5.L3(activity).getContentResolver();
                        Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        if (i > 28) {
                            z2 = true;
                        }
                        contentResolver2.registerContentObserver(uri2, z2, c2174041A6o);
                    }
                    this.LIZ = true;
                    return;
                }
                if (i >= 34) {
                    Object value = this.LJFF.getValue();
                    if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null) {
                        activity.registerScreenCaptureCallback(activity.getMainExecutor(), screenCaptureCallback);
                        this.LIZIZ = true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR92, e, null);
            }
        }
    }

    public final void LIZJ(Activity activity) {
        Activity.ScreenCaptureCallback screenCaptureCallback;
        if (this.LIZ) {
            try {
                C2174031A6n c2174031A6n = this.LIZJ;
                if (c2174031A6n != null) {
                    activity.getContentResolver().unregisterContentObserver(c2174031A6n);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR92, e, null);
            }
            this.LIZJ = null;
            try {
                C2174041A6o c2174041A6o = this.LIZLLL;
                if (c2174041A6o != null) {
                    activity.getContentResolver().unregisterContentObserver(c2174041A6o);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1019103yf.LIZ(EnumC1014603xw.ERR92, e2, null);
            }
            this.LIZLLL = null;
            this.LIZ = false;
        }
        if (this.LIZIZ && Build.VERSION.SDK_INT >= 34) {
            Object value = this.LJFF.getValue();
            if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null) {
                try {
                    activity.unregisterScreenCaptureCallback(screenCaptureCallback);
                    this.LIZIZ = false;
                } catch (IllegalStateException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C1019103yf.LIZ(EnumC1014603xw.ERR92, e3, null);
                    this.LIZIZ = false;
                }
            }
        }
    }
}
