package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oC0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463700oC0 {
    public static final void LIZ(C1463750oC5 c1463750oC5, VideoSegment videoSegment) {
        Object objValueOf;
        float f;
        c1463750oC5.LIZJ[0] = 0;
        c1463750oC5.LIZLLL[0] = (int) videoSegment.duration;
        int[] iArr = c1463750oC5.LJII;
        if (iArr != null) {
            iArr[0] = 0;
        }
        float[] fArr = c1463750oC5.LJIIIZ;
        if (fArr != null) {
            objValueOf = Float.valueOf(fArr[0]);
        } else {
            objValueOf = 0;
        }
        if (!Intrinsics.LJFF(objValueOf, 0)) {
            f = c1463750oC5.LJIIIZ[0];
        } else {
            f = 1.0f;
        }
        int[] iArr2 = c1463750oC5.LJIIIIZZ;
        if (iArr2 != null) {
            iArr2[0] = (int) (videoSegment.duration * f);
        }
    }

    public static final void LIZJ(int i, int i2, List list) {
        if (i != i2 && i >= 0 && i2 >= 0 && i <= list.size() - 1 && i2 <= list.size() - 1) {
            ListProtector.add(list, i2, ListProtector.remove(list, i));
        }
    }

    public static final void LIZIZ(final C1322110kVd c1322110kVd, final String str, Drawable drawable, final int i, final C386930FFb c386930FFb) {
        Bitmap bitmap;
        c1322110kVd.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z = true;
        c1322110kVd.getHierarchy().LJIJ(drawable, 1);
        final Uri uriLJIILIIL = C2471909mP.LJIILIIL(str);
        boolean zLJFF = Intrinsics.LJFF(uriLJIILIIL.getScheme(), "file");
        if (C2471909mP.LJJIIZI(str) || C08QA.LJIJ(new C0VSJ(str)).length() != 0) {
            z = false;
        }
        if (!C2471909mP.LJJIII(str, z, 4) && zLJFF) {
            if (c386930FFb != null && c386930FFb.LIZJ && (bitmap = c386930FFb.LIZ.get(str)) != null && !bitmap.isRecycled()) {
                c1322110kVd.setImageBitmap(bitmap);
                return;
            } else {
                C15O7.LIZIZ(new Callable() { // from class: X.0FPL
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("EditCutExtKt@2f9c.setCover$1");
                        int i2 = i;
                        final C386930FFb c386930FFb2 = c386930FFb;
                        final String str2 = str;
                        final C1322110kVd c1322110kVd2 = c1322110kVd;
                        Integer numValueOf = Integer.valueOf(VEUtils.getVideoFrames(uriLJIILIIL.toString(), new int[]{0}, -1, i2, false, new InterfaceC1286300jZs() { // from class: X.0FPK
                            @Override // X.InterfaceC1286300jZs
                            public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                                final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                final C386930FFb c386930FFb3 = c386930FFb2;
                                final String str3 = str2;
                                final C1322110kVd c1322110kVd3 = c1322110kVd2;
                                C15O7.LIZIZ(new Callable() { // from class: X.0FPJ
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        C1C7U.LIZ("EditCutExtKt@2f9c.setCover$1$1$1");
                                        C386930FFb c386930FFb4 = c386930FFb3;
                                        if (c386930FFb4 != null) {
                                            String str4 = str3;
                                            Bitmap bitmap2 = bitmapCreateBitmap;
                                            if (c386930FFb4.LIZJ) {
                                                c386930FFb4.LIZ.put(str4, bitmap2);
                                            }
                                        }
                                        c1322110kVd3.setImageBitmap(bitmapCreateBitmap);
                                        Unit unit = Unit.LIZ;
                                        C1C7U.LIZIZ("EditCutExtKt@2f9c.setCover$1$1$1");
                                        return unit;
                                    }
                                }, C15O7.LJIIIIZZ, null);
                                return false;
                            }
                        }));
                        C1C7U.LIZIZ("EditCutExtKt@2f9c.setCover$1");
                        return numValueOf;
                    }
                }, C823050WQl.LIZLLL(), null);
                return;
            }
        }
        C1324750kZt.LIZLLL(c1322110kVd, uriLJIILIIL, i, i);
    }
}
