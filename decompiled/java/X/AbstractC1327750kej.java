package X;

import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.Map;

/* JADX INFO: renamed from: X.0kej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1327750kej implements Closeable, InterfaceC1330440kj4, InterfaceC1325190kab {
    public boolean isHitBitmapMemoryCache;
    public boolean isHitDiskCache;
    public boolean isHitEncodeMemoryCache;
    public boolean isRequestInternet;
    public boolean isThumbCache;
    public Map<String, String> mExtraMap;
    public int mFileSize;
    public C1330000kiM mImageFormat;

    public AbstractC1327750kej cloneOrNull() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public Rect getRegionToDecode() {
        return null;
    }

    public int getSampleSize() {
        return -1;
    }

    public abstract int getSizeInBytes();

    public Rect getSmartCrop() {
        return null;
    }

    public String getSourceUri() {
        return null;
    }

    @Override // X.InterfaceC1325190kab
    public void hitBitmapMemoryCache() {
        this.isHitBitmapMemoryCache = true;
        this.isHitEncodeMemoryCache = false;
        this.isHitDiskCache = false;
        this.isRequestInternet = false;
    }

    @Override // X.InterfaceC1325190kab
    public void hitEncodeMemoryCache() {
        this.isHitEncodeMemoryCache = true;
        this.isHitBitmapMemoryCache = false;
        this.isHitDiskCache = false;
        this.isRequestInternet = false;
    }

    public abstract boolean isClosed();

    public boolean isStateful() {
        return false;
    }

    public void setSourceUri(String str) {
    }

    public C1330000kiM getImageFormat() {
        C1330000kiM c1330000kiM = this.mImageFormat;
        return c1330000kiM == null ? C1330000kiM.LIZJ : c1330000kiM;
    }

    public boolean isHitMemoryCache() {
        return this.isHitEncodeMemoryCache || this.isHitBitmapMemoryCache;
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        String simpleName = getClass().getSimpleName();
        Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
        if (C1328570kg3.LIZ.LIZIZ(3)) {
            C1328570kg3.LIZ.d("CloseableImage", C786410Ut5.k4(null, "finalize: %s %x still open.", new Object[]{simpleName, numValueOf}));
        }
        try {
            close();
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public Map<String, String> getExtraMap() {
        return this.mExtraMap;
    }

    public int getFileSize() {
        return this.mFileSize;
    }

    public InterfaceC529960KqQ getQualityInfo() {
        return C1328060kfE.LIZLLL;
    }

    public boolean isHitBitmapMemoryCache() {
        return this.isHitBitmapMemoryCache;
    }

    public boolean isHitDiskCache() {
        return this.isHitDiskCache;
    }

    public boolean isHitEncodeMemoryCache() {
        return this.isHitEncodeMemoryCache;
    }

    public boolean isRequestInternet() {
        return this.isRequestInternet;
    }

    public boolean isThumbCache() {
        return this.isThumbCache;
    }

    public void copyImageFromTrace(C1328480kfu c1328480kfu) {
        this.isRequestInternet = c1328480kfu.LLJJ;
        this.isHitDiskCache = c1328480kfu.LLJJI;
        this.isHitEncodeMemoryCache = c1328480kfu.LLJJIII;
        this.isHitBitmapMemoryCache = c1328480kfu.LLJJIJI;
    }

    public void setExtraMap(Map<String, String> map) {
        this.mExtraMap = map;
    }

    public void setFileSize(int i) {
        this.mFileSize = i;
    }

    public void setImageFrom(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        hitBitmapMemoryCache();
                        return;
                    }
                    return;
                } else {
                    this.isHitEncodeMemoryCache = false;
                    this.isHitBitmapMemoryCache = false;
                    this.isHitDiskCache = true;
                    this.isRequestInternet = false;
                    return;
                }
            }
            hitEncodeMemoryCache();
            return;
        }
        this.isHitEncodeMemoryCache = false;
        this.isHitBitmapMemoryCache = false;
        this.isHitDiskCache = false;
        this.isRequestInternet = true;
    }

    public void setThumbCache(boolean z) {
        this.isThumbCache = z;
    }
}
