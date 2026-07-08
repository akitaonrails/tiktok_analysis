package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveRoomBackGroundImageOptSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0kZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324610kZf implements C0JBN {
    public AbstractC298401Dq LIZJ;
    public C1320770kTT<InterfaceC1316360kMM> LIZLLL;
    public String LJIIIIZZ;
    public InterfaceC1320380kSq LJIIJ;
    public Drawable LJIIJJI;
    public InterfaceC1142670fqD LJIIL;
    public Boolean LJIILIIL;
    public float[] LJIILL;
    public EnumC1083750eJB LJIILLIIL;
    public InterfaceC2280181EMu<? super Matrix, ? super Rect, ? super Integer, ? super Integer, ? super Float, ? super Float, ? super Float, ? super Float, Unit> LJIJJLI;
    public boolean LJIL;
    public Boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public float LJJIII;
    public int LJJIIJ;
    public boolean LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public final int LIZ = 5;
    public final int LIZIZ = 19;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIZ = -1;
    public float LJIILJJIL = -1.0f;
    public float LJIIZILJ = -1.0f;
    public int LJIJ = -1;
    public int LJIJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public ImageView.ScaleType LJIJJ = ImageView.ScaleType.CENTER_CROP;

    @Override // X.C0JBN
    public final C1324610kZf LIZIZ() {
        this.LJJIFFI = true;
        return this;
    }

    public final void LJJIIJZLJL() {
        C1325710kbR c1325710kbR = (C1325710kbR) C13LQ.LJJIFFI(LJJII(null, LJJIIJ(null), false, false));
        if (c1325710kbR != null) {
            C1328130kfL.LJIILIIL().LJIIL().LJIJ(c1325710kbR, null);
        }
    }

    @Override // X.C0JBN
    public final void LJIILLIIL() {
        InterfaceC1320850kTb interfaceC1320850kTb;
        C1320770kTT<InterfaceC1316360kMM> c1320770kTT = this.LIZLLL;
        if (c1320770kTT == null || (interfaceC1320850kTb = c1320770kTT.LLILZIL) == null) {
            return;
        }
        interfaceC1320850kTb.onDetach();
    }

    public final void LJJIIZ() {
        int i;
        C1324630kZh c1324630kZh = (this.LJJII || (i = this.LJI) <= 0) ? null : new C1324630kZh(i, this.LJII);
        Boolean bool = this.LJJ;
        C1325710kbR c1325710kbR = (C1325710kbR) C13LQ.LJJIFFI(LJJII(c1324630kZh, LJJIIJ(null), bool != null ? bool.booleanValue() : false, false));
        if (c1325710kbR != null) {
            C1328130kfL.LJIILIIL().LJIIL().LJIIZILJ(c1325710kbR, null);
        }
    }

    public static AbstractC1320320kSk LJJIFFI(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            switch (C1087610ePP.LIZIZ[scaleType.ordinal()]) {
                case 1:
                    return InterfaceC1320380kSq.LJ;
                case 2:
                    return InterfaceC1320380kSq.LJI;
                case 3:
                    return InterfaceC1320380kSq.LJFF;
                case 4:
                    return InterfaceC1320380kSq.LIZJ;
                case 5:
                    return InterfaceC1320380kSq.LIZIZ;
                case 6:
                    return InterfaceC1320380kSq.LIZLLL;
                case 7:
                    return InterfaceC1320380kSq.LIZ;
                case 8:
                    return InterfaceC1320380kSq.LJII;
            }
        }
        return C1331090kk7.LJIJI;
    }

    @Override // X.C0JBN
    public final C1324610kZf LIZJ(List list) {
        this.LIZJ = new C298301Dp(list);
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LIZLLL(InterfaceC1142670fqD interfaceC1142670fqD) {
        this.LJIIL = interfaceC1142670fqD;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJ(float[] fArr) {
        this.LJIILL = fArr;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJFF(Boolean bool) {
        this.LJJ = bool;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJI(InterfaceC2280181EMu interfaceC2280181EMu) {
        this.LJIJJLI = interfaceC2280181EMu;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJII(int i) {
        this.LJIJI = i;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIIIZ(ImageModel imageModel) {
        List urls;
        if (imageModel == null || (urls = imageModel.getUrls()) == null) {
            urls = C13BV.INSTANCE;
        }
        this.LIZJ = new C298301Dp(urls);
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIIJ(final File file) {
        this.LIZJ = new AbstractC298401Dq(file) { // from class: X.01Ds
            public final File LIZ;

            @Override // X.AbstractC298401Dq
            public final List<Uri> LIZ() {
                File file2 = this.LIZ;
                return file2 == null ? C13BV.INSTANCE : Collections.singletonList(Uri.fromFile(file2));
            }

            {
                this.LIZ = file;
            }
        };
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIIJJI(Boolean bool) {
        this.LJIILIIL = bool;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIIL(Drawable drawable) {
        this.LJIIJJI = drawable;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIILIIL(String str) {
        this.LJJIIZ = str;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIIZILJ(ImageView.ScaleType scaleType) {
        this.LJIJJ = scaleType;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIJ(final int i) {
        this.LIZJ = new AbstractC298401Dq(i) { // from class: X.01l0
            public final int LIZ;

            @Override // X.AbstractC298401Dq
            public final List<Uri> LIZ() {
                return Collections.singletonList(new Uri.Builder().scheme("res").path(String.valueOf(this.LIZ)).build());
            }

            {
                this.LIZ = i;
            }
        };
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIJI(Float f) {
        float fFloatValue;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = -1.0f;
        }
        this.LJIILJJIL = fFloatValue;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIJJ(int i) {
        this.LJIIIZ = i;
        return this;
    }

    @Override // X.C0JBN
    public final boolean LJJ(View view) {
        boolean zBooleanValue;
        if (view == null || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return false;
        }
        C1324630kZh c1324630kZh = new C1324630kZh(view.getMeasuredWidth(), view.getMeasuredHeight());
        C1291840jio c1291840jioLJJIIJ = LJJIIJ(view);
        Boolean bool = this.LJJ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        C1325710kbR c1325710kbR = (C1325710kbR) C13LQ.LJJIFFI(LJJII(c1324630kZh, c1291840jioLJJIIJ, zBooleanValue, false));
        if (c1325710kbR == null || !C1328130kfL.LJIILIIL().LJIIL().LJIIL(c1325710kbR)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0397  */
    /* JADX WARN: Type inference failed for: r0v33, types: [REQUEST] */
    /* JADX WARN: Type inference failed for: r0v57, types: [REQUEST] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.0kTO, X.0kTX] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.0kTO, X.0kTX] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.0kTb] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0kbR[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.0kbR[], java.lang.Object[]] */
    @Override // X.C0JBN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1324610kZf.LJJI(android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0jio] */
    public final C1291840jio LJJIIJ(View view) {
        float f;
        if (this.LJIIZILJ < 0.0f || this.LJIJ < 0) {
            return null;
        }
        if (LiveRoomBackGroundImageOptSetting.INSTANCE.useBlurEffect() && view != null) {
            int i = this.LJIJ;
            if (i <= 0) {
                f = 35.0f;
            } else {
                f = i * 6.0f;
            }
            view.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
            return null;
        }
        final int i2 = this.LJIJ;
        final float f2 = this.LJIIZILJ;
        return new InterfaceC1291910jiv(i2, f2) { // from class: X.0jio
            public final int LIZ;
            public final float LIZIZ;

            @Override // X.InterfaceC1291910jiv
            public final String getName() {
                return "blurProcessor";
            }

            @Override // X.InterfaceC1291910jiv
            public final InterfaceC1324680kZm getPostprocessorCacheKey() {
                return new C592490NLr("blur_bitmap_processor");
            }

            {
                this.LIZ = i2;
                this.LIZIZ = f2;
            }

            @Override // X.InterfaceC1291910jiv
            public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
                float f3;
                int i3;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width >= 100 && height >= 100) {
                    if (width >= 200 && height >= 200) {
                        f3 = 0.1f;
                    } else {
                        f3 = 0.3f;
                    }
                } else {
                    f3 = 0.6f;
                }
                int iLIZIZ = C814420VxA.LIZIZ(width * f3);
                int iLIZIZ2 = C814420VxA.LIZIZ(height * f3);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iLIZIZ, iLIZIZ2, false);
                if (this.LIZIZ != 0.0f) {
                    float f4 = iLIZIZ;
                    float f5 = iLIZIZ2;
                    if (Math.abs((f4 / f5) - this.LIZ) > 0.2f) {
                        float f6 = this.LIZIZ;
                        int i4 = (int) (f4 / f6);
                        if (i4 > iLIZIZ2) {
                            i3 = (int) (f5 * f6);
                            i4 = iLIZIZ2;
                        } else {
                            i3 = iLIZIZ;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (iLIZIZ - i3) >> 1, (iLIZIZ2 - i4) >> 1, i3, i4);
                        C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                        bitmapCreateScaledBitmap = bitmapCreateBitmap;
                        iLIZIZ = i3;
                        iLIZIZ2 = i4;
                    }
                }
                abstractC1301670jyf.getClass();
                C1323050kX9<Bitmap> c1323050kX9LIZIZ = abstractC1301670jyf.LIZIZ(iLIZIZ, iLIZIZ2, Bitmap.Config.ARGB_8888, null);
                Bitmap bitmap2 = c1323050kX9LIZIZ.get();
                int i5 = this.LIZ;
                if (i5 >= 1) {
                    int width2 = bitmap2.getWidth();
                    int height2 = bitmap2.getHeight();
                    int i6 = width2 * height2;
                    int[] iArr = new int[i6];
                    bitmapCreateScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
                    int i7 = width2 - 1;
                    int i8 = height2 - 1;
                    int i9 = i5 + i5 + 1;
                    int[] iArr2 = new int[i6];
                    int[] iArr3 = new int[i6];
                    int[] iArr4 = new int[i6];
                    int[] iArr5 = new int[Math.max(width2, height2)];
                    int i10 = (i9 + 1) >> 1;
                    int i11 = i10 * i10;
                    int i12 = i11 * 256;
                    int[] iArr6 = new int[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        iArr6[i13] = i13 / i11;
                    }
                    int[][] iArr7 = new int[i9][];
                    for (int i14 = 0; i14 < i9; i14++) {
                        iArr7[i14] = new int[3];
                    }
                    int i15 = i5 + 1;
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 0; i18 < height2; i18++) {
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 0;
                        for (int i28 = -i5; i28 <= i5; i28++) {
                            int i29 = iArr[i16 + Math.min(i7, Math.max(i28, 0))];
                            int[] iArr8 = iArr7[i28 + i5];
                            iArr8[0] = (i29 & 16711680) >> 16;
                            iArr8[1] = (i29 & 65280) >> 8;
                            iArr8[2] = i29 & 255;
                            int iAbs = i15 - Math.abs(i28);
                            int i30 = iArr8[0];
                            i19 += i30 * iAbs;
                            int i31 = iArr8[1];
                            i20 += i31 * iAbs;
                            int i32 = iArr8[2];
                            i21 += iAbs * i32;
                            if (i28 > 0) {
                                i25 += i30;
                                i26 += i31;
                                i27 += i32;
                            } else {
                                i22 += i30;
                                i23 += i31;
                                i24 += i32;
                            }
                        }
                        int i33 = i5;
                        for (int i34 = 0; i34 < width2; i34++) {
                            iArr2[i16] = iArr6[i19];
                            iArr3[i16] = iArr6[i20];
                            iArr4[i16] = iArr6[i21];
                            int i35 = i19 - i22;
                            int i36 = i20 - i23;
                            int i37 = i21 - i24;
                            int[] iArr9 = iArr7[((i33 - i5) + i9) % i9];
                            int i38 = i22 - iArr9[0];
                            int i39 = i23 - iArr9[1];
                            int i40 = i24 - iArr9[2];
                            if (i18 == 0) {
                                iArr5[i34] = Math.min(i34 + i5 + 1, i7);
                            }
                            int i41 = iArr[i17 + iArr5[i34]];
                            int i42 = (i41 & 16711680) >> 16;
                            iArr9[0] = i42;
                            int i43 = (i41 & 65280) >> 8;
                            iArr9[1] = i43;
                            int i44 = i41 & 255;
                            iArr9[2] = i44;
                            int i45 = i25 + i42;
                            int i46 = i26 + i43;
                            int i47 = i27 + i44;
                            i19 = i35 + i45;
                            i20 = i36 + i46;
                            i21 = i37 + i47;
                            i33 = (i33 + 1) % i9;
                            int[] iArr10 = iArr7[i33 % i9];
                            int i48 = iArr10[0];
                            i22 = i38 + i48;
                            int i49 = iArr10[1];
                            i23 = i39 + i49;
                            int i50 = iArr10[2];
                            i24 = i40 + i50;
                            i25 = i45 - i48;
                            i26 = i46 - i49;
                            i27 = i47 - i50;
                            i16++;
                        }
                        i17 += width2;
                    }
                    for (int i51 = 0; i51 < width2; i51++) {
                        int i52 = -i5;
                        int i53 = i52 * width2;
                        int i54 = 0;
                        int i55 = 0;
                        int i56 = 0;
                        int i57 = 0;
                        int i58 = 0;
                        int i59 = 0;
                        int i60 = 0;
                        int i61 = 0;
                        int i62 = 0;
                        while (i52 <= i5) {
                            int iMax = Math.max(0, i53) + i51;
                            int[] iArr11 = iArr7[i52 + i5];
                            iArr11[0] = iArr2[iMax];
                            iArr11[1] = iArr3[iMax];
                            iArr11[2] = iArr4[iMax];
                            int iAbs2 = i15 - Math.abs(i52);
                            i54 += iArr2[iMax] * iAbs2;
                            i55 += iArr3[iMax] * iAbs2;
                            i56 += iArr4[iMax] * iAbs2;
                            if (i52 > 0) {
                                i60 += iArr11[0];
                                i61 += iArr11[1];
                                i62 += iArr11[2];
                            } else {
                                i57 += iArr11[0];
                                i58 += iArr11[1];
                                i59 += iArr11[2];
                            }
                            if (i52 < i8) {
                                i53 += width2;
                            }
                            i52++;
                        }
                        int i63 = i51;
                        int i64 = i5;
                        for (int i65 = 0; i65 < height2; i65++) {
                            iArr[i63] = (iArr[i63] & (-16777216)) | (iArr6[i54] << 16) | (iArr6[i55] << 8) | iArr6[i56];
                            int i66 = i54 - i57;
                            int i67 = i55 - i58;
                            int i68 = i56 - i59;
                            int[] iArr12 = iArr7[((i64 - i5) + i9) % i9];
                            int i69 = i57 - iArr12[0];
                            int i70 = i58 - iArr12[1];
                            int i71 = i59 - iArr12[2];
                            if (i51 == 0) {
                                iArr5[i65] = Math.min(i65 + i15, i8) * width2;
                            }
                            int i72 = iArr5[i65] + i51;
                            int i73 = iArr2[i72];
                            iArr12[0] = i73;
                            int i74 = iArr3[i72];
                            iArr12[1] = i74;
                            int i75 = iArr4[i72];
                            iArr12[2] = i75;
                            int i76 = i60 + i73;
                            int i77 = i61 + i74;
                            int i78 = i62 + i75;
                            i54 = i66 + i76;
                            i55 = i67 + i77;
                            i56 = i68 + i78;
                            i64 = (i64 + 1) % i9;
                            int[] iArr13 = iArr7[i64];
                            int i79 = iArr13[0];
                            i57 = i69 + i79;
                            int i80 = iArr13[1];
                            i58 = i70 + i80;
                            int i81 = iArr13[2];
                            i59 = i71 + i81;
                            i60 = i76 - i79;
                            i61 = i77 - i80;
                            i62 = i78 - i81;
                            i63 += width2;
                        }
                    }
                    bitmap2.setPixels(iArr, 0, width2, 0, 0, width2, height2);
                }
                C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                return c1323050kX9LIZIZ;
            }
        };
    }

    public final C1324610kZf LJJIIZI(float f) {
        this.LJIIZILJ = f;
        this.LJIJ = this.LIZ;
        return this;
    }

    public final C1324610kZf LJJIJ(ImageView.ScaleType scaleType) {
        this.LJIIJ = LJJIFFI(scaleType);
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf setUrl(String str) {
        List listSingletonList;
        if (str == null) {
            listSingletonList = C13BV.INSTANCE;
        } else {
            listSingletonList = Collections.singletonList(str);
        }
        this.LIZJ = new C298301Dp(listSingletonList);
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LIZ(int i, int i2) {
        this.LJ = i;
        this.LJFF = i2;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIIIIZZ(String str, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2089008Gi c2089008Gi = new C2089008Gi((String) it2.next());
                c2089008Gi.LIZLLL("biz_tag", str);
                arrayList.add(c2089008Gi.LJ());
            }
        }
        this.LJIIIIZZ = str;
        this.LIZJ = new C298301Dp(C13LP.LLIIII(arrayList));
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIILJJIL(int i, int i2) {
        this.LJI = i;
        this.LJII = i2;
        return this;
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIJJLI(String str, String str2) {
        if (str != null) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            c2089008Gi.LIZLLL("biz_tag", str2);
            String strLJ = c2089008Gi.LJ();
            this.LJIIIIZZ = str2;
            this.LIZJ = new C298301Dp(Collections.singletonList(strLJ));
            return this;
        }
        this.LIZJ = new C298301Dp(C13BV.INSTANCE);
        return this;
    }

    public final C1324630kZh LJJIII(int i, int i2) {
        if (!this.LJJIIJZLJL && !LiveBroadcastPictureMemOpt.frescoLoadPicEnableInSample()) {
            return new C1324630kZh(i, i2);
        }
        return new C1324630kZh(i, i2, Math.max(i, i2));
    }

    @Override // X.C0JBN
    public final C1324610kZf LJIL(float f, float f2, View view) {
        if (LiveRoomBackGroundImageOptSetting.INSTANCE.clientDrawBlur() && view != null && Build.VERSION.SDK_INT >= 31) {
            view.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.CLAMP));
            return this;
        }
        this.LJIIZILJ = f;
        this.LJIJ = this.LIZ;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1325710kbR[] LJJII(C1324630kZh c1324630kZh, C1291840jio c1291840jio, boolean z, boolean z2) {
        List<Uri> listLIZ;
        AbstractC298401Dq abstractC298401Dq = this.LIZJ;
        if (abstractC298401Dq == null || (listLIZ = abstractC298401Dq.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        if (listLIZ.isEmpty()) {
            return new C1325710kbR[0];
        }
        ArrayList arrayList = new ArrayList();
        C1335940krw c1335940krw = new C1335940krw();
        Iterator<Uri> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(it2.next());
            if (z2) {
                c1325700kbQLIZLLL.LJIILLIIL = false;
            }
            if (c1291840jio != null) {
                c1325700kbQLIZLLL.LJIILIIL = c1291840jio;
            }
            if (c1324630kZh != null) {
                c1325700kbQLIZLLL.LIZJ = c1324630kZh;
            }
            if (z) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            }
            c1325700kbQLIZLLL.LJIIZILJ = c1335940krw;
            if (this.LJJI) {
                c1325700kbQLIZLLL.LIZIZ = EnumC1320950kTl.FULL_FETCH;
            }
            if (!C2093608Ic.LJ(this.LJJIIZ)) {
                c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
                String str = this.LJJIIZ;
                str.getClass();
                c1325700kbQLIZLLL.LJIJI = str;
            }
            arrayList.add(c1325700kbQLIZLLL.LIZ());
        }
        if (arrayList.size() == 0) {
            return new C1325710kbR[0];
        }
        return new C1325710kbR[]{ListProtector.get(arrayList, 0)};
    }

    @Override // X.C0JBN
    public final void LJIILL(ImageView imageView, List list, String str, boolean z, Pair pair, final InterfaceC1142670fqD interfaceC1142670fqD, int i, ImageView.ScaleType scaleType, ImageView.ScaleType scaleType2) {
        C1324630kZh c1324630kZhLIZ;
        if (imageView instanceof C1324720kZq) {
            C1322110kVd c1322110kVd = (C1322110kVd) imageView;
            AbstractC1320320kSk abstractC1320320kSkLJJIFFI = LJJIFFI(scaleType);
            AbstractC1320320kSk abstractC1320320kSkLJJIFFI2 = LJJIFFI(scaleType2);
            if (!list.isEmpty()) {
                if (pair != null && (c1324630kZhLIZ = C1324630kZh.LIZ(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue())) != null) {
                    if (LiveBroadcastPictureMemOpt.frescoLoadPicEnableInSample()) {
                        c1324630kZhLIZ = new C1324630kZh(c1324630kZhLIZ.LIZ, c1324630kZhLIZ.LIZIZ, Math.max(r2, r1));
                    }
                } else {
                    c1324630kZhLIZ = null;
                }
                String str2 = (String) C13LP.LJJJLL(list);
                final String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                C2089008Gi c2089008Gi = new C2089008Gi(str2);
                c2089008Gi.LIZLLL("biz_tag", str);
                Uri uri = UriProtector.parse(c2089008Gi.LJ());
                C1335940krw c1335940krw = new C1335940krw();
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
                if (c1324630kZhLIZ != null) {
                    c1325700kbQLIZLLL.LIZJ = c1324630kZhLIZ;
                }
                if (z) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                    c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
                }
                c1325700kbQLIZLLL.LJIIZILJ = c1335940krw;
                C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                String str4 = (String) C13LP.LJJJLL(list);
                if (str4 != null) {
                    str3 = str4;
                }
                C1320700kTM<InterfaceC1330440kj4> c1320700kTM = new C1320700kTM<InterfaceC1330440kj4>(str3, interfaceC1142670fqD) { // from class: X.0fqE
                    public final String LIZIZ;
                    public final /* synthetic */ InterfaceC1142670fqD LIZJ;

                    {
                        this.LIZJ = interfaceC1142670fqD;
                        this.LIZIZ = str3;
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LIZ(String str5, Throwable th) {
                        RuntimeException runtimeException;
                        InterfaceC1142670fqD interfaceC1142670fqD2 = this.LIZJ;
                        if (interfaceC1142670fqD2 != null) {
                            String str6 = this.LIZIZ;
                            if (th != null) {
                                runtimeException = new RuntimeException(th);
                            } else {
                                runtimeException = null;
                            }
                            interfaceC1142670fqD2.LIZLLL(str6, runtimeException);
                        }
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LIZLLL(String str5, Throwable th) {
                        RuntimeException runtimeException;
                        InterfaceC1142670fqD interfaceC1142670fqD2 = this.LIZJ;
                        if (interfaceC1142670fqD2 != null) {
                            String str6 = this.LIZIZ;
                            if (th != null) {
                                runtimeException = new RuntimeException(th);
                            } else {
                                runtimeException = null;
                            }
                            interfaceC1142670fqD2.LIZLLL(str6, runtimeException);
                        }
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJFF(Object obj, String str5) {
                        System.currentTimeMillis();
                        InterfaceC1142670fqD interfaceC1142670fqD2 = this.LIZJ;
                        if (interfaceC1142670fqD2 != null) {
                            interfaceC1142670fqD2.LIZ();
                        }
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJ(String str5, Object obj, Animatable animatable) {
                        InterfaceC1142670fqD interfaceC1142670fqD2;
                        InterfaceC1142670fqD interfaceC1142670fqD3;
                        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                        if (interfaceC1330440kj4 != null && (interfaceC1142670fqD3 = this.LIZJ) != null) {
                            interfaceC1142670fqD3.LIZJ(interfaceC1330440kj4.getWidth(), interfaceC1330440kj4.getHeight(), this.LIZIZ);
                        }
                        if (animatable != null && (interfaceC1142670fqD2 = this.LIZJ) != null) {
                            interfaceC1142670fqD2.LIZIZ(animatable);
                        }
                    }
                };
                c1322110kVd.setImageRequest(c1325710kbRLIZ);
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
                c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
                if (abstractC1320320kSkLJJIFFI2 != null) {
                    c1322110kVd.getHierarchy().LJIIZILJ(abstractC1320320kSkLJJIFFI2);
                }
                if (i != -1) {
                    if (abstractC1320320kSkLJJIFFI != null) {
                        c1322110kVd.getHierarchy().LJJI(i, abstractC1320320kSkLJJIFFI);
                    } else {
                        c1322110kVd.getHierarchy().LJJ(i);
                    }
                }
                c1322110kVd.setImageRequest(c1325710kbRLIZ);
            }
        }
    }
}
