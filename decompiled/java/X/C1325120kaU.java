package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Map;

/* JADX INFO: renamed from: X.0kaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1325120kaU extends AbstractC1325130kaV {
    public volatile Bitmap mBitmap;
    public C1323050kX9<Bitmap> mBitmapReference;
    public final int mExifOrientation;
    public final InterfaceC529960KqQ mQualityInfo;
    public final Rect mRegionToDecode;
    public final int mRotationAngle;
    public final int mSampleSize;
    public final Rect mSmartCrop;

    private synchronized C1323050kX9<Bitmap> detachBitmapReference() {
        C1323050kX9<Bitmap> c1323050kX9;
        c1323050kX9 = this.mBitmapReference;
        this.mBitmapReference = null;
        this.mBitmap = null;
        return c1323050kX9;
    }

    public synchronized C1323050kX9<Bitmap> cloneUnderlyingBitmapReference() {
        return C1323050kX9.LJFF(this.mBitmapReference);
    }

    public synchronized C1323050kX9<Bitmap> convertToBitmapReference() {
        C1322350kW1.LIZLLL(this.mBitmapReference, "Cannot convert a closed static bitmap");
        return detachBitmapReference();
    }

    @Override // X.InterfaceC1330440kj4
    public int getImageCount() {
        return 1;
    }

    @Override // X.AbstractC1327750kej
    public synchronized boolean isClosed() {
        return this.mBitmapReference == null;
    }

    @Override // X.InterfaceC1330440kj4
    public int getHeight() {
        int i;
        return (this.mRotationAngle % 180 != 0 || (i = this.mExifOrientation) == 5 || i == 7) ? getBitmapWidth(this.mBitmap) : getBitmapHeight(this.mBitmap);
    }

    @Override // X.AbstractC1327750kej
    public int getSizeInBytes() {
        return C1327320ke2.LIZJ(this.mBitmap);
    }

    @Override // X.InterfaceC1330440kj4
    public int getWidth() {
        int i;
        return (this.mRotationAngle % 180 != 0 || (i = this.mExifOrientation) == 5 || i == 7) ? getBitmapHeight(this.mBitmap) : getBitmapWidth(this.mBitmap);
    }

    @Override // X.AbstractC1327750kej, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C1323050kX9<Bitmap> c1323050kX9DetachBitmapReference = detachBitmapReference();
        if (c1323050kX9DetachBitmapReference != null) {
            c1323050kX9DetachBitmapReference.close();
        }
    }

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    @Override // X.AbstractC1327750kej
    public InterfaceC529960KqQ getQualityInfo() {
        return this.mQualityInfo;
    }

    @Override // X.AbstractC1327750kej
    public Rect getRegionToDecode() {
        return this.mRegionToDecode;
    }

    public int getRotationAngle() {
        return this.mRotationAngle;
    }

    @Override // X.AbstractC1327750kej
    public int getSampleSize() {
        return this.mSampleSize;
    }

    @Override // X.AbstractC1327750kej
    public Rect getSmartCrop() {
        return this.mSmartCrop;
    }

    @Override // X.AbstractC1325130kaV
    public Bitmap getUnderlyingBitmap() {
        return this.mBitmap;
    }

    public static int getBitmapHeight(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public static int getBitmapWidth(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public C1325120kaU(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i) {
        this(c1323050kX9, interfaceC529960KqQ, i, 0);
    }

    public C1325120kaU(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i, C1330000kiM c1330000kiM) {
        this(c1323050kX9, interfaceC529960KqQ, i, 0, (Rect) null, (Rect) null, -1, c1330000kiM);
    }

    public C1325120kaU(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2) {
        this(c1323050kX9, interfaceC529960KqQ, i, i2, null, null, -1);
    }

    public C1325120kaU(Bitmap bitmap, InterfaceC1290810jh9<Bitmap> interfaceC1290810jh9, InterfaceC529960KqQ interfaceC529960KqQ, int i) {
        this(bitmap, interfaceC1290810jh9, interfaceC529960KqQ, i, 0);
    }

    public C1325120kaU(Bitmap bitmap, InterfaceC1290810jh9<Bitmap> interfaceC1290810jh9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2) {
        this(bitmap, interfaceC1290810jh9, interfaceC529960KqQ, i, i2, (Rect) null, (Rect) null, -1);
    }

    public C1325120kaU(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3) {
        C1323050kX9<Bitmap> c1323050kX9LIZLLL = c1323050kX9.LIZLLL();
        c1323050kX9LIZLLL.getClass();
        this.mBitmapReference = c1323050kX9LIZLLL;
        this.mBitmap = c1323050kX9LIZLLL.get();
        this.mQualityInfo = interfaceC529960KqQ;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
    }

    public C1325120kaU(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3, C1330000kiM c1330000kiM) {
        C1323050kX9<Bitmap> c1323050kX9LIZLLL = c1323050kX9.LIZLLL();
        c1323050kX9LIZLLL.getClass();
        this.mBitmapReference = c1323050kX9LIZLLL;
        this.mBitmap = c1323050kX9LIZLLL.get();
        this.mQualityInfo = interfaceC529960KqQ;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
        this.mImageFormat = c1330000kiM;
    }

    public C1325120kaU(Bitmap bitmap, InterfaceC1290810jh9<Bitmap> interfaceC1290810jh9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3) {
        bitmap.getClass();
        this.mBitmap = bitmap;
        Bitmap bitmap2 = this.mBitmap;
        interfaceC1290810jh9.getClass();
        this.mBitmapReference = C1323050kX9.LJJIZ(bitmap2, interfaceC1290810jh9);
        this.mQualityInfo = interfaceC529960KqQ;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
    }

    public C1325120kaU(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3, C1330000kiM c1330000kiM, int i4) {
        C1323050kX9<Bitmap> c1323050kX9LIZLLL = c1323050kX9.LIZLLL();
        c1323050kX9LIZLLL.getClass();
        this.mBitmapReference = c1323050kX9LIZLLL;
        this.mBitmap = c1323050kX9LIZLLL.get();
        this.mQualityInfo = interfaceC529960KqQ;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
        this.mImageFormat = c1330000kiM;
        setImageFrom(i4);
    }

    public C1325120kaU(Bitmap bitmap, InterfaceC1290810jh9<Bitmap> interfaceC1290810jh9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3, C1330000kiM c1330000kiM) {
        bitmap.getClass();
        this.mBitmap = bitmap;
        Bitmap bitmap2 = this.mBitmap;
        interfaceC1290810jh9.getClass();
        this.mBitmapReference = C1323050kX9.LJJIZ(bitmap2, interfaceC1290810jh9);
        this.mQualityInfo = interfaceC529960KqQ;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
        this.mImageFormat = c1330000kiM;
    }

    public C1325120kaU(C1323050kX9<Bitmap> c1323050kX9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3, C1330000kiM c1330000kiM, int i4, Map<String, String> map) {
        C1323050kX9<Bitmap> c1323050kX9LIZLLL = c1323050kX9.LIZLLL();
        c1323050kX9LIZLLL.getClass();
        this.mBitmapReference = c1323050kX9LIZLLL;
        this.mBitmap = c1323050kX9LIZLLL.get();
        this.mQualityInfo = interfaceC529960KqQ;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
        this.mImageFormat = c1330000kiM;
        this.mExtraMap = map;
        setImageFrom(i4);
    }

    public C1325120kaU(Bitmap bitmap, InterfaceC1290810jh9<Bitmap> interfaceC1290810jh9, InterfaceC529960KqQ interfaceC529960KqQ, int i, int i2, Rect rect, Rect rect2, int i3, C1330000kiM c1330000kiM, Map<String, String> map) {
        bitmap.getClass();
        this.mBitmap = bitmap;
        Bitmap bitmap2 = this.mBitmap;
        interfaceC1290810jh9.getClass();
        this.mBitmapReference = C1323050kX9.LJJIZ(bitmap2, interfaceC1290810jh9);
        this.mQualityInfo = interfaceC529960KqQ;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
        this.mImageFormat = c1330000kiM;
        this.mExtraMap = map;
    }
}
