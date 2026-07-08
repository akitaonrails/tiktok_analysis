package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.provider.MediaStore;
import android.util.LruCache;
import android.util.Size;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.097t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23215097t {
    public static final C23216097u LIZ = new LruCache<String, Bitmap>() { // from class: X.097u
        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    };
    public static final LinkedHashSet<String> LIZIZ = new LinkedHashSet<>();
    public static final HashMap<String, C11NZ<Bitmap>> LIZJ = new HashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS189S0000000_3.get$arr$(547));
    public static final C19501611Rm LJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.097u] */
    static {
        LJ = new C19501611Rm(C04TS.LIZ() ? new ExecutorServiceC822430WOb(C823050WQl.LIZLLL(), Math.abs(C1837007Hk.LIZ())) : C786410Ut5.d4(Math.abs(C1837007Hk.LIZ())));
    }

    public static boolean LJIIIIZZ(MediaModel mediaModel) {
        boolean zContains;
        if (!AnonymousClass0982.LIZ()) {
            return false;
        }
        LinkedHashSet<String> linkedHashSet = LIZIZ;
        synchronized (linkedHashSet) {
            try {
                zContains = linkedHashSet.contains(mediaModel.id);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContains;
    }

    public static String LIZ(MediaModel mediaModel, Size size) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(mediaModel.id);
        sbLIZ.append('_');
        sbLIZ.append(size.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(size.getHeight());
        sbLIZ.append('_');
        sbLIZ.append(mediaModel.LJFF());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(MediaModel mediaModel, Size size) {
        String strLJFF;
        if (!LJIIIIZZ(mediaModel) || a0.LJJJIL(mediaModel.id) || (strLJFF = mediaModel.LJFF()) == null || a0.LJJJIL(strLJFF)) {
            return null;
        }
        return LIZ(mediaModel, size);
    }

    public static C19482711Kf LJFF(final Context context, final MediaModel mediaModel) {
        final int i;
        if (C23214097s.LIZ()) {
            i = 3;
        } else {
            i = 1;
        }
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.090i
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Bitmap> c09aj) {
                Bitmap thumbnail;
                C1C7U.LIZ("LocalImageThumbnailUtils@4a0b.loadImageBeforeAndroidQ$1");
                if (mediaModel.LJIILJJIL()) {
                    thumbnail = MediaStore.Video.Thumbnails.getThumbnail(context.getContentResolver(), CastLongProtector.parseLong(mediaModel.id), i, (BitmapFactory.Options) C23215097t.LIZLLL.getValue());
                } else {
                    thumbnail = MediaStore.Images.Thumbnails.getThumbnail(context.getContentResolver(), CastLongProtector.parseLong(mediaModel.id), i, (BitmapFactory.Options) C23215097t.LIZLLL.getValue());
                }
                if (c09aj.isDisposed()) {
                    C1C7U.LIZIZ("LocalImageThumbnailUtils@4a0b.loadImageBeforeAndroidQ$1");
                    return;
                }
                if (thumbnail == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("can not load uri: ");
                    sbLIZ.append(mediaModel.LJFF());
                    c09aj.tryOnError(new IOException(C2188811AlT.LIZIZ(sbLIZ)));
                } else {
                    c09aj.onNext(thumbnail);
                    c09aj.onComplete();
                }
                C1C7U.LIZIZ("LocalImageThumbnailUtils@4a0b.loadImageBeforeAndroidQ$1");
            }
        });
    }

    public static void LJII(MediaModel mediaModel, Size size, Bitmap bitmap) {
        if (LJIIIIZZ(mediaModel) && bitmap != null && !bitmap.isRecycled()) {
            String strLIZ = LIZ(mediaModel, size);
            C23216097u c23216097u = LIZ;
            synchronized (c23216097u) {
                try {
                    c23216097u.put(strLIZ, bitmap);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11NZ LIZJ(android.content.Context r5, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r6, android.util.Size r7, java.lang.String r8) {
        /*
            java.util.HashMap<java.lang.String, X.11NZ<android.graphics.Bitmap>> r3 = X.C23215097t.LIZJ
            monitor-enter(r3)
            java.lang.Object r0 = r3.get(r8)     // Catch: java.lang.Throwable -> L66
            X.11NZ r0 = (X.C11NZ) r0     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto Ld
            monitor-exit(r3)
            return r0
        Ld:
            monitor-exit(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L4c
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel
            if (r0 == 0) goto L46
            r2 = r6
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r2 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel) r2
            X.0L8y r1 = r2.loadSource
            X.0L8y r0 = X.EnumC538220L8y.PHOTO_PICKER
            if (r1 != r0) goto L3d
            X.097p r0 = new X.097p
            r0.<init>(r2, r7, r4)
            X.11Kf r2 = X.C11NZ.LJIJJLI(r0)
        L2f:
            java.lang.String r1 = "initialCapacity"
            r0 = 16
            X.C1701890uOB.LIZIZ(r0, r1)
            X.11Ri r1 = new X.11Ri
            r1.<init>(r2, r0)
            monitor-enter(r3)
            goto L51
        L3d:
            r0 = r6
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel) r0
            boolean r0 = r0.isResized
            if (r0 == 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            X.11Kf r2 = LJ(r5, r4, r7, r6, r0)
            goto L2f
        L4c:
            X.11Kf r2 = LJFF(r5, r6)
            goto L2f
        L51:
            java.lang.Object r0 = r3.get(r8)     // Catch: java.lang.Throwable -> L60
            X.11NZ r0 = (X.C11NZ) r0     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L5b
            monitor-exit(r3)
            return r0
        L5b:
            r3.put(r8, r1)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r3)
            return r1
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r3)
            throw r0
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23215097t.LIZJ(android.content.Context, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, android.util.Size, java.lang.String):X.11NZ");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC420801kM LIZLLL(android.widget.ImageView r12, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r13, android.util.Size r14, kotlin.jvm.functions.Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23215097t.LIZLLL(android.widget.ImageView, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, android.util.Size, kotlin.jvm.functions.Function2):X.01kM");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJI(android.content.Context r8, final com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r9, final android.util.Size r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23215097t.LJI(android.content.Context, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, android.util.Size, X.05Vn):java.lang.Object");
    }

    public static C19482711Kf LJ(final Context context, final CancellationSignal cancellationSignal, final Size size, final MediaModel mediaModel, final boolean z) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.090f
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Bitmap> c09aj) {
                Bitmap bitmapDecodeFile;
                C1C7U.LIZ("LocalImageThumbnailUtils@4a0b.loadImageAfterAndroidQ$1");
                try {
                    Uri uriLJIILIIL = C2471909mP.LJIILIIL(mediaModel.LJFF());
                    if (!z) {
                        bitmapDecodeFile = context.getContentResolver().loadThumbnail(uriLJIILIIL, size, cancellationSignal);
                    } else {
                        bitmapDecodeFile = BitmapFactory.decodeFile(mediaModel.LJFF());
                    }
                    if (!c09aj.isDisposed()) {
                        c09aj.onNext(bitmapDecodeFile);
                        c09aj.onComplete();
                    }
                } catch (OperationCanceledException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (!c09aj.isDisposed()) {
                        c09aj.onComplete();
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    if (!c09aj.isDisposed()) {
                        c09aj.onError(e2);
                    }
                }
                C1C7U.LIZIZ("LocalImageThumbnailUtils@4a0b.loadImageAfterAndroidQ$1");
            }
        });
    }
}
