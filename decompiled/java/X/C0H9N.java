package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.LruCache;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0H9N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9N {
    public static final C444880HcU LIZ = new LruCache<String, Bitmap>() { // from class: X.0HcU
        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            Bitmap bitmap3 = bitmap;
            super.entryRemoved(z, str, bitmap3, bitmap2);
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                bitmap3.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap3);
            }
        }
    };

    public static Bitmap LIZ(View view) {
        Bitmap bitmapCopy;
        ImageView imageView;
        if (view == null) {
            return null;
        }
        try {
            Bitmap bitmapLIZ = C19724012Fa.LIZ(view, Bitmap.Config.ARGB_8888);
            try {
                ArrayList<TextureView> arrayList = new ArrayList();
                LIZIZ(view, arrayList);
                if (arrayList.isEmpty()) {
                    return bitmapLIZ;
                }
                char c = 1;
                if (bitmapLIZ.isMutable()) {
                    bitmapCopy = bitmapLIZ;
                } else {
                    bitmapCopy = bitmapLIZ.copy(Bitmap.Config.ARGB_8888, true);
                }
                Canvas canvas = new Canvas(bitmapCopy);
                int i = 2;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                for (TextureView textureView : arrayList) {
                    if (textureView.isShown() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                        int[] iArr2 = new int[i];
                        textureView.getLocationInWindow(iArr2);
                        float f = iArr2[0] - iArr[0];
                        float f2 = iArr2[c] - iArr[c];
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Path pathLIZJ = LIZJ(textureView, view, iArr);
                        ViewParent parent = textureView.getParent();
                        for (int i2 = 0; (parent instanceof ViewGroup) && i2 < 4; i2++) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            View viewFindViewById = viewGroup.findViewById(R.id.video_cover);
                            if (viewFindViewById instanceof ImageView) {
                                imageView = (ImageView) viewFindViewById;
                            } else {
                                imageView = null;
                            }
                            if (imageView != null && (drawable = imageView.getDrawable()) != null) {
                                break;
                            }
                            int childCount = viewGroup.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                View childAt = viewGroup.getChildAt(i3);
                                if ((childAt instanceof ImageView) && (drawable = ((ImageView) childAt).getDrawable()) != null) {
                                    break;
                                }
                            }
                            parent = viewGroup.getParent();
                        }
                        Drawable drawable = null;
                        if (drawable != null) {
                            try {
                                Rect rect = new Rect(drawable.getBounds());
                                canvas.save();
                                if (pathLIZJ != null) {
                                    canvas.clipPath(pathLIZJ);
                                }
                                canvas.translate(f, f2);
                                drawable.setBounds(0, 0, width, height);
                                drawable.draw(canvas);
                                drawable.setBounds(rect);
                                canvas.restore();
                                LJI(canvas, textureView, view, iArr);
                            } catch (Exception e) {
                                e = e;
                            }
                        } else {
                            continue;
                        }
                    }
                    c = 1;
                    i = 2;
                }
                return bitmapCopy;
            } catch (Exception e2) {
                e = e2;
            }
            TryCatchGuardChecker.doCheck(e);
            return bitmapLIZ;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    public static void LIZIZ(View view, List list) {
        if (view == null) {
            return;
        }
        if (view instanceof TextureView) {
            ((ArrayList) list).add(view);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LIZIZ(viewGroup.getChildAt(i), list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0H9O] */
    @InterfaceC1294060jmO
    public static void LJ(final List list, final Function1 function1) {
        if (list != null && !list.isEmpty()) {
            final C03IT c03it = new C03IT(list);
            C1331660kl2.LIZJ().LJIIJ(c03it, new InterfaceC442640HXi() { // from class: X.0H9O
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v8, types: [X.0H9P] */
                @Override // X.InterfaceC442640HXi
                public final void onResult(Object obj) {
                    final C013C c013c = new C013C();
                    if (((Boolean) obj).booleanValue()) {
                        List<String> list2 = list;
                        final Function1<Bitmap, Unit> function12 = function1;
                        Iterator<String> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            C1331660kl2.LIZJ().LIZJ(UriProtector.parse(it2.next()), new InterfaceC442640HXi() { // from class: X.0H9P
                                @Override // X.InterfaceC442640HXi
                                public final void onResult(Object obj2) {
                                    Bitmap bitmap = (Bitmap) obj2;
                                    if (bitmap != null && !bitmap.isRecycled()) {
                                        C013C c013c2 = c013c;
                                        if (!c013c2.element) {
                                            c013c2.element = true;
                                            function12.invoke(bitmap);
                                        }
                                    }
                                }
                            });
                        }
                    }
                    if (!c013c.element) {
                        System.currentTimeMillis();
                        C1331660kl2.LJIIJ(c03it).LJJII(new C463080IDy(function1, 2));
                    }
                }
            });
        } else {
            function1.invoke(null);
        }
    }

    public static Object LJFF(List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        TuxIconView tuxIconView = null;
        if (list.isEmpty()) {
            return null;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        System.currentTimeMillis();
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
        c1331670kl3LJIIJ.LJJJIL = new C1338340kvo("tako_load_bot_bg", C2097608Jq.LJ(), tuxIconView, 12);
        c1331670kl3LJIIJ.LJJIIJZLJL = new Executor() { // from class: X.0Cju
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        c1331670kl3LJIIJ.LJIL = Bitmap.Config.RGB_565;
        c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.IMMEDIATE;
        c1331670kl3LJIIJ.LJJII(new C346490DiB(c2252611DEt, list, 2));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static Path LIZJ(TextureView textureView, View view, int[] iArr) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        Object parent = textureView.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            while (view2 != null && view2 != view) {
                if (view2.getClipToOutline() && view2.getOutlineProvider() != null) {
                    Outline outline = new Outline();
                    view2.getOutlineProvider().getOutline(view2, outline);
                    float radius = outline.getRadius();
                    if (radius > 0.0f) {
                        int[] iArr2 = new int[2];
                        view2.getLocationInWindow(iArr2);
                        float f = iArr2[0] - iArr[0];
                        float f2 = iArr2[1] - iArr[1];
                        Path path = new Path();
                        path.addRoundRect(new RectF(f, f2, view2.getWidth() + f, view2.getHeight() + f2), radius, radius, Path.Direction.CW);
                        return path;
                    }
                }
                Object parent2 = view2.getParent();
                if (!(parent2 instanceof View)) {
                    break;
                }
                view2 = (View) parent2;
            }
        }
        return null;
    }

    public static Bitmap LIZLLL(int i, Context context, Bitmap bitmap) {
        boolean z;
        int i2;
        Canvas canvas;
        if (bitmap.isRecycled()) {
            return null;
        }
        int i3 = 0;
        if (((Number) C0BO4.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        System.currentTimeMillis();
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(context) / i2;
        int screenWidth = ScreenUtils.getScreenWidth(context) / i2;
        float f = screenWidth;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, screenWidth, (int) ((bitmap.getHeight() / bitmap.getWidth()) * f), true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(screenWidth, fullScreenHeight, Bitmap.Config.RGB_565);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        canvas2.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        float f2 = 120;
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(((int) C0DSB.LIZ(200)) / i2), Integer.valueOf(((int) C0DSB.LIZ(f2)) / i2), Integer.valueOf(((int) C0DSB.LIZ(f2)) / i2));
        int size = listLJIIJJI.size();
        int i4 = 0;
        while (i3 < size && i4 < fullScreenHeight) {
            int iIntValue = ((Number) ListProtector.get(listLJIIJJI, i3)).intValue();
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        LJII(paint, i4, iIntValue, 153, 255, i);
                    }
                } else {
                    LJII(paint, i4, iIntValue, 0, 153, i);
                }
                int i5 = fullScreenHeight - i4;
                if (iIntValue > i5) {
                    iIntValue = i5;
                }
                if (iIntValue > 0) {
                    float f3 = i4;
                    i4 += iIntValue;
                    canvas = canvas2;
                    canvas2.drawRect(0.0f, f3, f, i4, paint);
                } else {
                    canvas = canvas2;
                }
            } else {
                canvas = canvas2;
                if (iIntValue > fullScreenHeight) {
                    iIntValue = fullScreenHeight;
                }
                i4 += iIntValue;
            }
            i3++;
            canvas2 = canvas;
        }
        if (i4 < fullScreenHeight) {
            paint.setShader(null);
            paint.setColor(i);
            canvas2.drawRect(0.0f, i4, f, fullScreenHeight, paint);
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.graphics.Canvas r13, android.view.TextureView r14, android.view.View r15, int[] r16) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H9N.LJI(android.graphics.Canvas, android.view.TextureView, android.view.View, int[]):void");
    }

    public static void LJII(Paint paint, int i, int i2, int i3, int i4, int i5) {
        paint.setShader(new LinearGradient(0.0f, i, 0.0f, i + i2, Color.argb(i3, Color.red(i5), Color.green(i5), Color.blue(i5)), Color.argb(i4, Color.red(i5), Color.green(i5), Color.blue(i5)), Shader.TileMode.CLAMP));
    }
}
