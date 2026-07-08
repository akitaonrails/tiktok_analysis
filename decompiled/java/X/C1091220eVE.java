package X;

import Y.AfS153S0200000_17;
import Y.AkS43S1000000_17;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveBarrageBackgroundCacheSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eVE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091220eVE {
    public static final C1091240eVG LIZ = new C1091240eVG(LiveBarrageBackgroundCacheSetting.INSTANCE.getSettingValue().length);

    public static void LIZJ(ImageModel imageModel) {
        String str;
        if (C0IKQ.LIZ(imageModel.getUrls())) {
            return;
        }
        C1091240eVG c1091240eVG = LIZ;
        int byteCount = 0;
        if (c1091240eVG.LIZ(imageModel.getUri()) != null) {
            String uri = imageModel.getUri();
            Bitmap bitmapLIZ = c1091240eVG.LIZ(imageModel.getUri());
            if (bitmapLIZ != null) {
                byteCount = bitmapLIZ.getByteCount();
            }
            LIZLLL(byteCount / 1024, "cache", uri);
            return;
        }
        List urls = imageModel.getUrls();
        if (urls != null) {
            str = (String) ListProtector.get(urls, 0);
        } else {
            str = null;
        }
        C11NZ.LJJJJZ(0).LJL(C11S5.LIZ()).LJJJJZI(new AkS43S1000000_17(str, 1)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS153S0200000_17(imageModel, 9), new C09JN() { // from class: X.09RY
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NinePatchUtil@39c.preloadNinePatchBitmap$3");
                C20441214yg.LJIIJ(6, "NinePatchUtil", ((Throwable) obj).getStackTrace());
                C1C7U.LIZIZ("NinePatchUtil@39c.preloadNinePatchBitmap$3");
            }
        });
    }

    public static void LIZLLL(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_preload_nine_patch_bitmap");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "channel");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "size");
        c474500IjALIZ.LJJII(str2, "uri");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_use_nine_patch_bitmap");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "channel");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "size");
        c474500IjALIZ.LJJII(str2, "uri");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(Bitmap bitmap, View view, boolean z, int i, Runnable runnable) {
        int density;
        Rect rect = null;
        if (bitmap != null) {
            byte[] ninePatchChunk = bitmap.getNinePatchChunk();
            if (ninePatchChunk != null) {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
                if (byteBufferOrder.get() != 0) {
                    byteBufferOrder.get();
                    byteBufferOrder.get();
                    byteBufferOrder.get();
                    byteBufferOrder.getInt();
                    byteBufferOrder.getInt();
                    rect = new Rect();
                    rect.left = byteBufferOrder.getInt();
                    rect.right = byteBufferOrder.getInt();
                    rect.top = byteBufferOrder.getInt();
                    rect.bottom = byteBufferOrder.getInt();
                }
            }
            if (bitmap != null && bitmap.getNinePatchChunk() != null && rect != null) {
                NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(C497740JfY.LJIILJJIL(), bitmap, bitmap.getNinePatchChunk(), rect, null);
                if (i > 0 && bitmap.getDensity() > 0 && bitmap.getHeight() > 0 && (density = (bitmap.getDensity() * i) / bitmap.getHeight()) > 0 && density != 1) {
                    ninePatchDrawable.setTargetDensity(density);
                }
                ninePatchDrawable.setAutoMirrored(z);
                view.setBackground(ninePatchDrawable);
                if (z && C497740JfY.LJJ()) {
                    view.setPadding(rect.right, rect.top, rect.left, rect.bottom);
                } else {
                    view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        if (bitmap != null) {
            C20441214yg.LJ("NinePatchUtil", "downloaded bitmap is null.");
        } else {
            C20441214yg.LJ("NinePatchUtil", "no ninepatch chunk found in bitmap.");
        }
    }

    public static void LIZIZ(final ImageModel imageModel, final View view, final boolean z, final int i, final Runnable runnable) {
        String str;
        if (C0IKQ.LIZ(imageModel.getUrls())) {
            return;
        }
        Bitmap bitmapLIZ = LIZ.LIZ(imageModel.mUri);
        if (bitmapLIZ != null) {
            LJ(bitmapLIZ.getByteCount() / 1024, "cache", imageModel.getUri());
            LIZ(bitmapLIZ, view, z, i, runnable);
        } else {
            List urls = imageModel.getUrls();
            if (urls != null) {
                str = (String) ListProtector.get(urls, 0);
            } else {
                str = null;
            }
            C11NZ.LJJJJZ(0).LJL(C11S5.LIZ()).LJJJJZI(new AkS43S1000000_17(str, 0)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0eVF
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("NinePatchUtil@39c.loadNinePatchDrawable$2");
                    Bitmap bitmap = (Bitmap) obj;
                    if (!Intrinsics.LJFF(imageModel.mUri, "") && bitmap != null) {
                        C1091240eVG c1091240eVG = C1091220eVE.LIZ;
                        String str2 = imageModel.mUri;
                        c1091240eVG.getClass();
                        c1091240eVG.put(str2, new SoftReference(bitmap));
                    }
                    C1091240eVG c1091240eVG2 = C1091220eVE.LIZ;
                    C1091220eVE.LJ(bitmap.getByteCount() / 1024, "network", imageModel.getUri());
                    C1091220eVE.LIZ(bitmap, view, z, i, runnable);
                    C1C7U.LIZIZ("NinePatchUtil@39c.loadNinePatchDrawable$2");
                }
            }, new C09JN() { // from class: X.0eV2
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("NinePatchUtil@39c.loadNinePatchDrawable$3");
                    C20441214yg.LJIIJ(6, "NinePatchUtil", ((Throwable) obj).getStackTrace());
                    C1C7U.LIZIZ("NinePatchUtil@39c.loadNinePatchDrawable$3");
                }
            });
        }
    }
}
