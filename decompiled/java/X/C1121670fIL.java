package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121670fIL {
    public static C1325710kbR[] LIZ(ImageModel imageModel) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C1335920kru c1335920kru = new C1335920kru();
        for (String str : imageModel.getUrls()) {
            if (!C2093608Ic.LJ(str)) {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                c1335920kru.LIZIZ++;
                c1325700kbQLIZLLL.LJIIZILJ = c1335920kru;
                arrayList.add(c1325700kbQLIZLLL.LIZ());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (C1325710kbR[]) arrayList.toArray(new C1325710kbR[arrayList.size()]);
    }

    public static Drawable LIZIZ(ImageModel imageModel) {
        if (imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            C1325710kbR[] c1325710kbRArrLIZ = LIZ(imageModel);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJFF(c1325710kbRArrLIZ, true);
            c1320810kTXLIZJ.LJIIJJI = true;
            AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
            C1331070kk5 c1331070kk5LIZ = new C1331090kk7(C497740JfY.LJIILJJIL()).LIZ();
            C497740JfY.LJII();
            C1320770kTT c1320770kTT = new C1320770kTT(c1331070kk5LIZ);
            c1320770kTT.LJIIIIZZ(abstractC1320710kTNLIZ);
            return c1320770kTT.LIZLLL();
        }
        return null;
    }

    public static Rect LIZLLL(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (byteBufferOrder.get() == 0) {
            return null;
        }
        byteBufferOrder.get();
        byteBufferOrder.get();
        byteBufferOrder.get();
        byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        Rect rect = new Rect();
        rect.left = byteBufferOrder.getInt();
        rect.right = byteBufferOrder.getInt();
        rect.top = byteBufferOrder.getInt();
        rect.bottom = byteBufferOrder.getInt();
        return rect;
    }

    public static C19482711Kf LJ(ImageModel imageModel) {
        return C11NZ.LJIJJLI(new C1339390kxV(imageModel, C2126108Up.LIZ, 1));
    }

    public static NinePatchDrawable LIZJ(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        byte[] bArrArray = null;
        if (bitmap.getNinePatchChunk() == null) {
            return null;
        }
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        if (ninePatchChunk != null) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(ninePatchChunk.length).order(ByteOrder.nativeOrder());
            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
            if (byteBufferOrder2.get() != 0) {
                byteBufferOrder.put((byte) 1);
                int i = byteBufferOrder2.get();
                int[] iArr = new int[i];
                int i2 = byteBufferOrder2.get();
                int[] iArr2 = new int[i2];
                byte b = byteBufferOrder2.get();
                byteBufferOrder.put((byte) i);
                byteBufferOrder.put((byte) i2);
                byteBufferOrder.put(b);
                byteBufferOrder.putInt(byteBufferOrder2.getInt());
                byteBufferOrder.putInt(byteBufferOrder2.getInt());
                byteBufferOrder.putInt((int) (byteBufferOrder2.getInt() * f));
                byteBufferOrder.putInt((int) (byteBufferOrder2.getInt() * f));
                byteBufferOrder.putInt((int) (byteBufferOrder2.getInt() * f));
                byteBufferOrder.putInt((int) (byteBufferOrder2.getInt() * f));
                byteBufferOrder.putInt(byteBufferOrder2.getInt());
                iArr[0] = byteBufferOrder2.getInt();
                iArr[1] = byteBufferOrder2.getInt();
                byteBufferOrder.putInt((int) (iArr[0] * f));
                byteBufferOrder.putInt((int) (iArr[1] * f));
                iArr2[0] = byteBufferOrder2.getInt();
                iArr2[1] = byteBufferOrder2.getInt();
                byteBufferOrder.putInt((int) (iArr2[0] * f));
                byteBufferOrder.putInt((int) (iArr2[1] * f));
                for (int i3 = 0; i3 < b; i3++) {
                    byteBufferOrder.putInt(byteBufferOrder2.getInt());
                }
                bArrArray = byteBufferOrder.array();
            }
        }
        return new NinePatchDrawable(C497740JfY.LJIILJJIL(), bitmapCreateBitmap, bArrArray, LIZLLL(bArrArray), null);
    }

    public static void LJI(ImageModel imageModel, C1324720kZq c1324720kZq) {
        List arrayList = new ArrayList();
        if (imageModel != null && imageModel.getUrls() != null) {
            arrayList = imageModel.getUrls();
        }
        C1819620xS4.LIZ().LIZJ(arrayList).LJJI(c1324720kZq);
    }

    public static void LJIIIZ(C1324720kZq c1324720kZq, String str) {
        if (!TextUtils.isEmpty(str)) {
            c1324720kZq.setImageURI(C1325700kbQ.LIZLLL(UriProtector.parse(str)).LIZ().LIZIZ);
        }
    }

    public static void LJII(C1324720kZq c1324720kZq, ImageModel imageModel, C1291830jin c1291830jin) {
        C1324570kZb.LIZJ(c1324720kZq, imageModel, null, c1291830jin, null, false);
    }

    public static void LJIIIIZZ(C1324720kZq c1324720kZq, ImageModel imageModel, String str) {
        List arrayList = new ArrayList();
        if (imageModel.getUrls() != null) {
            arrayList = imageModel.getUrls();
        }
        C1819620xS4.LIZ().LJIIIIZZ(str, arrayList).LJJI(c1324720kZq);
    }

    public static void LJIIJ(ImageView imageView, ImageModel imageModel, EnumC1083750eJB enumC1083750eJB) {
        PointF pointF;
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (C1819620xS4.LIZLLL(imageModel)) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModel.getUrls());
                c1324610kZfLIZJ.LJIIIZ = 0;
                c1324610kZfLIZJ.LJIILLIIL = enumC1083750eJB;
                c1324610kZfLIZJ.LJIIL = null;
                c1324610kZfLIZJ.LJJI(imageView);
                return;
            }
            return;
        }
        if (imageModel == null || C086I.LIZIZ(imageModel.getUrls()) || imageView == null || !C0JSS.LIZIZ(imageView.getContext())) {
            return;
        }
        C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(imageView.getContext());
        c1322000kVSLJFF.LIZLLL(C0JSS.LIZ(imageModel));
        c1322000kVSLJFF.LJFF = imageModel;
        c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
        if (enumC1083750eJB != null) {
            c1322000kVSLJFF.LJII = new AbstractC1320320kSk() { // from class: X.0fIM
                @Override // X.AbstractC1320320kSk
                public final void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
                    float fWidth;
                    float fHeight;
                    if (rect != null) {
                        float f5 = i;
                        float fLJIIZILJ = C497740JfY.LJIIZILJ() / f5;
                        float f6 = i2;
                        float fLJIILLIIL = C497740JfY.LJIILLIIL() / f6;
                        if (fLJIILLIIL > fLJIIZILJ) {
                            fWidth = rect.left + ((rect.width() - (f5 * fLJIILLIIL)) * 0.5f);
                            if (f2 != 0.0f && f2 == 1.0f) {
                                fHeight = (rect.height() - (f6 * fLJIILLIIL)) + rect.top;
                                fLJIIZILJ = fLJIILLIIL;
                            } else {
                                int i3 = rect.top;
                                fHeight = i3;
                                fLJIIZILJ = fLJIILLIIL;
                            }
                        } else {
                            fWidth = rect.left;
                            float f7 = f6 * fLJIIZILJ;
                            float fLJIILLIIL2 = (C497740JfY.LJIILLIIL() - f7) * 0.5f;
                            if (f2 == 0.0f) {
                                fHeight = rect.top + fLJIILLIIL2;
                            } else if (f2 == 1.0f) {
                                fHeight = rect.top + ((Math.abs(fLJIILLIIL2) + rect.height()) - f7);
                            } else {
                                fHeight = rect.top + ((rect.height() - f7) * 0.5f);
                            }
                        }
                        if (matrix != null) {
                            matrix.setScale(fLJIIZILJ, fLJIIZILJ);
                            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
                        }
                    }
                }
            };
            int i = C1083760eJC.LIZ[enumC1083750eJB.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    pointF = new PointF(0.5f, 0.5f);
                } else {
                    pointF = new PointF(0.5f, 1.0f);
                }
            } else {
                pointF = new PointF(0.5f, 0.0f);
            }
            c1322000kVSLJFF.LJIIIIZZ = pointF;
        }
        c1322000kVSLJFF.LIZJ(imageView);
    }

    public static void LJIIL(ImageView imageView, ImageModel imageModel, int i) {
        C0JSS.LJIIIIZZ(imageView, imageModel, 0, 0, i, null);
    }

    public static void LJFF(ImageView imageView, ImageModel imageModel, int i, int i2) {
        if (imageView != null && imageModel != null && !C086I.LIZIZ(imageModel.getUrls()) && C0JSS.LIZIZ(imageView.getContext())) {
            C0JSS.LIZJ(i, i2, -1, imageView, imageModel, null, false);
        }
    }

    public static void LJIIJJI(View view, ImageModel imageModel, boolean z, InterfaceC1091290eVL interfaceC1091290eVL) {
        if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            C1322200kVm.LIZ().LJIIIIZZ(C1325700kbQ.LIZLLL(UriProtector.parse((String) ListProtector.get(imageModel.getUrls(), 0))).LIZ(), null).LIZJ(new C1091300eVM(view, z, interfaceC1091290eVL), C822690WPb.LIZ());
        }
    }

    public static void LJIILIIL(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        C0JSS.LJIIIIZZ(imageView, imageModel, i, i2, i3, null);
    }
}
