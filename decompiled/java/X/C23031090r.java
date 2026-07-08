package X;

import Y.AfS172S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.090r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23031090r {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS189S0000000_3.get$arr$(1599));

    public static Uri LIZJ(String str) {
        boolean z;
        try {
            Uri uriLJIILIIL = C2471909mP.LJIILIIL(str);
            String scheme = uriLJIILIIL.getScheme();
            if (scheme == null || scheme.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return Uri.fromFile(new C0VSJ(str));
            }
            return uriLJIILIIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Uri.fromFile(new C0VSJ(str));
        }
    }

    public static int LIZ(C0VSJ c0vsj, Size size) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(c0vsj.getAbsolutePath(), options);
        Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (iIntValue2 > size.getHeight() || iIntValue > size.getWidth()) {
            int i2 = iIntValue2 / 2;
            int i3 = iIntValue / 2;
            while (i2 / i >= size.getHeight() && i3 / i >= size.getWidth()) {
                i *= 2;
            }
        }
        return i;
    }

    public static InterfaceC420801kM LIZIZ(final C1322110kVd c1322110kVd, MediaModel mediaModel, final Size size, final Function1 function1) {
        C19482711Kf c19482711KfLJIJJLI;
        final CancellationSignal cancellationSignal;
        final Context context = c1322110kVd.getContext();
        final String strLJFF = mediaModel.LJFF();
        c1322110kVd.setTag(strLJFF);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            cancellationSignal = new CancellationSignal();
            c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.090s
                /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
                @Override // X.InterfaceC1478005qU
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void subscribe(X.C09AJ<android.graphics.Bitmap> r8) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        java.lang.String r6 = "LocalImageThumbnailUtils@890.load$observable$1"
                        X.C1C7U.LIZ(r6)
                        X.01GW r0 = X.C23031090r.LIZ     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        java.lang.String r0 = r2     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        android.net.Uri r3 = X.C23031090r.LIZJ(r0)     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        android.content.Context r0 = r1     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        android.util.Size r1 = r3     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        android.os.CancellationSignal r0 = r4     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        android.graphics.Bitmap r1 = r2.loadThumbnail(r3, r1, r0)     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        boolean r0 = r8.isDisposed()     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        if (r0 != 0) goto L8c
                        r8.onNext(r1)     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        r8.onComplete()     // Catch: java.lang.Exception -> L28 android.os.OperationCanceledException -> L6b
                        goto L8c
                    L28:
                        r4 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
                        X.01GW r0 = X.C23031090r.LIZ
                        java.lang.String r0 = r2
                        android.util.Size r2 = r3
                        X.0VSJ r5 = new X.0VSJ
                        r5.<init>(r0)
                        boolean r0 = r5.exists()
                        r3 = 0
                        if (r0 == 0) goto L94
                        android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L90
                        r1.<init>()     // Catch: java.lang.Exception -> L90
                        int r0 = X.C23031090r.LIZ(r5, r2)     // Catch: java.lang.Exception -> L90
                        r1.inSampleSize = r0     // Catch: java.lang.Exception -> L90
                        android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> L90
                        r1.inPreferredConfig = r0     // Catch: java.lang.Exception -> L90
                        X.0VSP r2 = new X.0VSP     // Catch: java.lang.Exception -> L90
                        r2.<init>(r5)     // Catch: java.lang.Exception -> L90
                        android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r2, r3, r1)     // Catch: java.lang.Throwable -> L5a
                        X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Exception -> L90
                        goto L7e
                    L5a:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5f
                        throw r1     // Catch: java.lang.Throwable -> L65
                    L5f:
                        r0 = move-exception
                        r1 = r3
                    L61:
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
                        goto L67
                    L65:
                        r0 = move-exception
                        goto L61
                    L67:
                        X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Exception -> L90
                        throw r0     // Catch: java.lang.Exception -> L90
                    L6b:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        java.lang.String r0 = "OperationCanceled"
                        X.C1AF0.LIZJ(r0)
                        boolean r0 = r8.isDisposed()
                        if (r0 != 0) goto L8c
                        r8.onComplete()
                        goto L8c
                    L7e:
                        if (r1 == 0) goto L94
                        boolean r0 = r8.isDisposed()
                        if (r0 != 0) goto L94
                        r8.onNext(r1)
                        r8.onComplete()
                    L8c:
                        X.C1C7U.LIZIZ(r6)
                        return
                    L90:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    L94:
                        java.lang.String r0 = "LoadThumbnailError"
                        X.C1AF0.LIZJ(r0)
                        boolean r0 = r8.isDisposed()
                        if (r0 != 0) goto L8c
                        r8.tryOnError(r4)
                        goto L8c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C23032090s.subscribe(X.09AJ):void");
                }
            });
        } else {
            c19482711KfLJIJJLI = C11NZ.LJIJJLI(new C2502209rI(context, mediaModel, 2));
            cancellationSignal = null;
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = c19482711KfLJIJJLI.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0GyP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LocalImageThumbnailUtils@890.load$disposable$1");
                Bitmap bitmap = (Bitmap) obj;
                if (Intrinsics.LJFF(c1322110kVd.getTag(), strLJFF) && bitmap != null) {
                    c1322110kVd.setController(null);
                    c1322110kVd.getHierarchy().LJFF(new BitmapDrawable(context.getResources(), bitmap), 1.0f, true);
                    Function1<Bitmap, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(bitmap);
                    }
                } else {
                    Function1<Bitmap, Unit> function13 = function1;
                    if (function13 != null) {
                        function13.invoke(null);
                    }
                }
                C1C7U.LIZIZ("LocalImageThumbnailUtils@890.load$disposable$1");
            }
        }, new AfS172S0100000_3(function1, 87));
        if (i >= 29) {
            final C11JF c11jf = (C11JF) interfaceC420801kMLJJLL;
            return new InterfaceC420801kM(c11jf, cancellationSignal) { // from class: X.090q
                public final InterfaceC420801kM LL;
                public final CancellationSignal LLILLJJLI;

                @Override // X.InterfaceC420801kM
                public final void dispose() {
                    CancellationSignal cancellationSignal2 = this.LLILLJJLI;
                    if (cancellationSignal2 != null && !cancellationSignal2.isCanceled()) {
                        cancellationSignal2.cancel();
                    }
                    if (this.LL.isDisposed()) {
                        return;
                    }
                    this.LL.dispose();
                }

                @Override // X.InterfaceC420801kM
                public final boolean isDisposed() {
                    CancellationSignal cancellationSignal2;
                    return this.LL.isDisposed() && ((cancellationSignal2 = this.LLILLJJLI) == null || cancellationSignal2.isCanceled());
                }

                {
                    this.LL = c11jf;
                    this.LLILLJJLI = cancellationSignal;
                }
            };
        }
        return interfaceC420801kMLJJLL;
    }
}
