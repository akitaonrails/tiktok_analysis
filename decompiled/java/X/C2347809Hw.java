package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2347809Hw {
    public static final String LIZIZ(CreativeInfo creativeInfo) {
        String strLIZLLL = LIZLLL(creativeInfo);
        if (!new C0VSJ(strLIZLLL).exists()) {
            new C0VSJ(strLIZLLL).mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(File.separator);
        sbLIZ.append("PixelLoopResize.bmp");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final VEFrame LIZJ(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ame_greenscreen_upload_ve_opt", true, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zLJIIIZ) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("StickerBitmapResizeHelper", "createVEFrameByBmp use createBitmapFrame");
            return VEFrame.createBitmapFrame(bitmap, jCurrentTimeMillis);
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("StickerBitmapResizeHelper", "createVEFrameByBmp use createByteBufferFrame");
        VEFrame vEFrameCreateByteBufferFrame = VEFrame.createByteBufferFrame(bitmap, jCurrentTimeMillis);
        C2475009mu.LJ(bitmap);
        return vEFrameCreateByteBufferFrame;
    }

    public static final String LIZLLL(CreativeInfo creativeInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJ(creativeInfo));
        sbLIZ.append("resize_bitmap_tmp");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(final java.util.List<X.C1621190sI1> r9, final X.C21356918hz r10, final android.content.Context r11, final kotlin.jvm.functions.Function2<? super X.C09I6, ? super java.util.List<? extends com.ss.android.ttve.model.VEFrame>, kotlin.Unit> r12) {
        /*
            r3 = r9
            boolean r0 = r3.isEmpty()
            r9 = r12
            if (r0 == 0) goto L10
            X.09I6 r1 = X.C09I6.UNKNOWN
            X.13BV r0 = X.C13BV.INSTANCE
            r9.invoke(r1, r0)
            return
        L10:
            boolean r4 = X.C2348109Hz.LIZ()
            X.00zU r5 = new X.00zU
            r5.<init>()
            int[] r2 = com.ss.android.ugc.aweme.property.AVSettingsWrapper.getImportVideoSize()
            r1 = 2
            if (r2 == 0) goto L3a
            int r0 = r2.length
            if (r0 != r1) goto L3a
        L23:
            r5.element = r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.09I6 r0 = X.C09I6.START
            r9.invoke(r0, r8)
            X.09Hy r2 = new X.09Hy
            r7 = r11
            r6 = r10
            r2.<init>()
            X.C15O7.LIZJ(r2)
            return
        L3a:
            int[] r2 = new int[r1]
            r2 = {x0040: FILL_ARRAY_DATA , data: [720, 1280} // fill-array
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2347809Hw.LJFF(java.util.List, X.18hz, android.content.Context, kotlin.jvm.functions.Function2):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJ(String str, String str2, C21356918hz c21356918hz, Context context, Function1<? super String, Unit> function1) {
        C259800zU c259800zU = new C259800zU();
        int[] importVideoSize = AVSettingsWrapper.getImportVideoSize();
        T t = importVideoSize;
        if (importVideoSize == null) {
            t = new int[]{720, 1280};
        }
        c259800zU.element = t;
        if (!TextUtils.isEmpty(str) && C2286708xd.LIZJ(str) && ((int[]) c259800zU.element).length >= 2) {
            C23250099c.LIZLLL(C817503Hh.LL, C2108108Nr.LIZ, null, new C2347609Hu(c21356918hz, str, str2, c259800zU, function1, context, null), 2);
        } else {
            function1.invoke(str);
        }
    }

    public static final int[] LIZ(boolean z, int i, int i2, Context context, String str, int[] iArr) {
        if (z && i != -1 && i2 != -1) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(C09NT.LJ(new ContextWrapper(context).getContentResolver(), UriProtector.parse(str)), null, options);
                int i3 = options.outWidth;
                int i4 = options.outHeight;
                if (i3 > i2 || i4 > i) {
                    float f = i3;
                    float f2 = i2 / f;
                    if (Math.round(f2 * f) > i2 || Math.round(i4 * f2) > i) {
                        f2 = i / i4;
                    }
                    iArr[0] = C814420VxA.LIZIZ(f * f2);
                    iArr[1] = C814420VxA.LIZIZ(f2 * i4);
                    return iArr;
                }
            } catch (FileNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(java.util.List<X.C1621190sI1> r13, X.C21356918hz r14, android.content.Context r15, int r16, X.InterfaceC497601wk r17, kotlin.jvm.functions.Function2<? super X.C09I6, ? super java.util.List<? extends com.ss.android.ttve.model.VEFrame>, kotlin.Unit> r18) {
        /*
            r5 = r16
            r6 = r13
            boolean r0 = r6.isEmpty()
            r12 = r18
            if (r0 == 0) goto L13
            X.09I6 r1 = X.C09I6.UNKNOWN
            X.13BV r0 = X.C13BV.INSTANCE
            r12.invoke(r1, r0)
            return
        L13:
            boolean r7 = X.C2348109Hz.LIZ()
            X.00zU r8 = new X.00zU
            r8.<init>()
            int[] r4 = com.ss.android.ugc.aweme.property.AVSettingsWrapper.getImportVideoSize()
            r3 = 1
            r2 = 2
            r1 = 0
            if (r4 == 0) goto L3b
            int r0 = r4.length
            if (r0 != r2) goto L3b
        L28:
            r8.element = r4
            if (r5 >= r3) goto L2d
            r5 = 1
        L2d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
        L32:
            r13 = 0
            if (r1 >= r5) goto L41
            r11.add(r13)
            int r1 = r1 + 1
            goto L32
        L3b:
            int[] r4 = new int[r2]
            r4 = {x0056: FILL_ARRAY_DATA , data: [720, 1280} // fill-array
            goto L28
        L41:
            X.09I6 r0 = X.C09I6.START
            r12.invoke(r0, r11)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.09Hx r5 = new X.09Hx
            r10 = r15
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = r17
            X.C23250099c.LIZLLL(r1, r0, r13, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2347809Hw.LJI(java.util.List, X.18hz, android.content.Context, int, X.01wk, kotlin.jvm.functions.Function2):void");
    }
}
