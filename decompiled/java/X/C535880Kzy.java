package X;

import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloaderListener;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0Kzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535880Kzy implements InterfaceC531800KtO {
    public final /* synthetic */ Map<String, Integer> LIZ;
    public final /* synthetic */ IWuZhuiDownloaderListener LIZIZ;
    public final /* synthetic */ AtomicLong LIZJ;

    @Override // X.InterfaceC531800KtO
    public final void LJJI(String str, String str2) {
        int iIntValue;
        IWuZhuiDownloaderListener iWuZhuiDownloaderListener;
        Integer num = this.LIZ.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        AtomicLong atomicLong = this.LIZJ;
        long jDecrementAndGet = 0;
        for (int i = 0; i < iIntValue; i++) {
            jDecrementAndGet = atomicLong.decrementAndGet();
        }
        if (jDecrementAndGet <= 0 && (iWuZhuiDownloaderListener = this.LIZIZ) != null) {
            iWuZhuiDownloaderListener.onProgress(1.0f);
        }
    }

    public C535880Kzy(Map map, IWuZhuiDownloaderListener iWuZhuiDownloaderListener, AtomicLong atomicLong) {
        this.LIZ = map;
        this.LIZIZ = iWuZhuiDownloaderListener;
        this.LIZJ = atomicLong;
    }

    @Override // X.InterfaceC531800KtO
    public final void onError(String str, int i, String str2) {
        int iIntValue;
        IWuZhuiDownloaderListener iWuZhuiDownloaderListener;
        Integer num = this.LIZ.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        AtomicLong atomicLong = this.LIZJ;
        long jDecrementAndGet = 0;
        for (int i2 = 0; i2 < iIntValue; i2++) {
            jDecrementAndGet = atomicLong.decrementAndGet();
        }
        if (jDecrementAndGet <= 0 && (iWuZhuiDownloaderListener = this.LIZIZ) != null) {
            iWuZhuiDownloaderListener.onProgress(1.0f);
        }
    }
}
