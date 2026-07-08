package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LruCache;
import com.bytedance.sdui.serializedData.common.operations.GlyphPosition;
import com.bytedance.sdui.serializedData.common.operations.GlyphRun;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.List;
import x86.j$a;

/* JADX INFO: renamed from: X.0kOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317770kOd extends C1313680kI2 {
    public int LLILZ;
    public List<GlyphRun> LLILZIL;

    public List<GlyphRun> getGlyphRuns() {
        return this.LLILZIL;
    }

    public C1317770kOd(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        setFocusable(true);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte[] bArr;
        Bitmap bitmapCreateBitmap;
        super.onDraw(canvas);
        List<GlyphRun> list = this.LLILZIL;
        if (list == null) {
            C1317870kOn.LIZ();
            return;
        }
        for (GlyphRun glyphRun : list) {
            int i = glyphRun.LIZ;
            C1317780kOe c1317780kOeLIZIZ = C1315530kL1.LJ().LIZIZ();
            c1317780kOeLIZIZ.LIZIZ();
            C1317800kOg c1317800kOg = c1317780kOeLIZIZ.LIZJ.get(Integer.valueOf(i));
            if (c1317800kOg == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("no font found, hash:");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                C1317870kOn.LIZ();
            } else {
                float f = glyphRun.LIZJ;
                C1317890kOp c1317890kOp = j$a.LIZ;
                int i2 = glyphRun.LIZIZ;
                C1317840kOk<Integer, Paint> c1317840kOk = c1317890kOp.LIZ;
                Integer numValueOf = Integer.valueOf(i2);
                LruCache<Integer, Paint> lruCache = c1317840kOk.LIZIZ.get();
                if (lruCache == null) {
                    SoftReference<LruCache<K, V>> softReference = new SoftReference<>(new LruCache(c1317840kOk.LIZ));
                    c1317840kOk.LIZIZ = softReference;
                    lruCache = (LruCache) softReference.get();
                }
                Paint paint = lruCache.get(numValueOf);
                if (paint == null) {
                    paint = new Paint();
                    paint.setColor(i2);
                    C1317840kOk<Integer, Paint> c1317840kOk2 = c1317890kOp.LIZ;
                    Integer numValueOf2 = Integer.valueOf(i2);
                    LruCache<Integer, Paint> lruCache2 = c1317840kOk2.LIZIZ.get();
                    if (lruCache2 == null) {
                        SoftReference<LruCache<K, V>> softReference2 = new SoftReference<>(new LruCache(c1317840kOk2.LIZ));
                        c1317840kOk2.LIZIZ = softReference2;
                        lruCache2 = (LruCache) softReference2.get();
                    }
                    lruCache2.put(numValueOf2, paint);
                }
                List<GlyphPosition> list2 = glyphRun.LIZLLL;
                int size = list2.size();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("drawGlyphRun sign:");
                sbLIZ2.append(this.LLILZ);
                sbLIZ2.append(" count:");
                sbLIZ2.append(size);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (C1317940kOu.LIZ.booleanValue()) {
                    int i3 = C1317360kNy.LIZ;
                }
                for (GlyphPosition glyphPosition : list2) {
                    int i4 = glyphPosition.LIZ;
                    C1317850kOl c1317850kOl = c1317800kOg.LIZLLL.get(i4);
                    if (c1317850kOl == null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("no glyph found, id:");
                        sbLIZ3.append(i4);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C1317870kOn.LIZ();
                    } else {
                        float f2 = glyphPosition.LIZIZ;
                        float f3 = glyphPosition.LIZJ;
                        int iWidth = c1317850kOl.LIZLLL.width();
                        int iHeight = c1317850kOl.LIZLLL.height();
                        if (iWidth != 0 && iHeight != 0 && (bArr = c1317850kOl.LJ) != null && bArr.length != 0) {
                            Rect rect = c1317850kOl.LIZLLL;
                            RectF rectF = new RectF((rect.left * f) + f2, (rect.top * f) + f3, f2 + (rect.right * f), f3 + (rect.bottom * f));
                            if (c1317850kOl.LJFF == null) {
                                int iWidth2 = c1317850kOl.LIZLLL.width();
                                int iHeight2 = c1317850kOl.LIZLLL.height();
                                int i5 = c1317850kOl.LIZ;
                                if (i5 != 0) {
                                    if (i5 != 1) {
                                        byte[] bArr2 = c1317850kOl.LJ;
                                        bitmapCreateBitmap = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                                    } else {
                                        byte[] bArr3 = c1317850kOl.LJ;
                                        int i6 = c1317850kOl.LIZIZ;
                                        int i7 = c1317850kOl.LIZJ;
                                        int i8 = iWidth2 * iHeight2;
                                        byte[] bArr4 = new byte[i8];
                                        int i9 = 0;
                                        for (byte b : bArr3) {
                                            int i10 = b & 255;
                                            if (i10 < i6) {
                                                int i11 = 0;
                                                while (i11 <= i10) {
                                                    bArr4[i9] = 0;
                                                    i11++;
                                                    i9++;
                                                }
                                            } else if (i10 > i7) {
                                                while (i10 <= 255) {
                                                    bArr4[i9] = -1;
                                                    i10++;
                                                    i9++;
                                                }
                                            } else {
                                                bArr4[i9] = b;
                                                i9++;
                                            }
                                        }
                                        if (i9 == i8) {
                                            bitmapCreateBitmap = Bitmap.createBitmap(iWidth2, iHeight2, Bitmap.Config.ALPHA_8);
                                            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr4));
                                        } else {
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("Uncompress error, position: ");
                                            sbLIZ4.append(i9);
                                            sbLIZ4.append(", image size: ");
                                            sbLIZ4.append(i8);
                                            sbLIZ4.append(", source size:");
                                            sbLIZ4.append(bArr3.length);
                                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
                                        }
                                    }
                                } else {
                                    int i12 = 255;
                                    byte[] bArr5 = new byte[iWidth2 * iHeight2];
                                    int i13 = 0;
                                    int i14 = 0;
                                    for (int i15 = 0; i15 < iHeight2; i15++) {
                                        int i16 = 0;
                                        while (i16 < iWidth2) {
                                            int i17 = i13 + 1;
                                            int i18 = c1317850kOl.LJ[i13];
                                            int i19 = i16 + 8;
                                            int iMin = Math.min(i19, iWidth2);
                                            while (i16 < iMin) {
                                                int i20 = i14 + 1;
                                                if (((i18 >> (7 - (i16 & 7))) & 1) == 0) {
                                                    i12 = 0;
                                                }
                                                bArr5[i14] = (byte) i12;
                                                i16++;
                                                i14 = i20;
                                                i12 = 255;
                                            }
                                            i16 = i19;
                                            i13 = i17;
                                        }
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(iWidth2, iHeight2, Bitmap.Config.ALPHA_8);
                                    bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr5));
                                }
                                c1317850kOl.LJFF = bitmapCreateBitmap;
                            }
                            canvas.drawBitmap(c1317850kOl.LJFF, (Rect) null, rectF, paint);
                        } else {
                            int i21 = C1317360kNy.LIZ;
                        }
                    }
                }
            }
        }
    }
}
