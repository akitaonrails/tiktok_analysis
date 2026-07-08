package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.09rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502209rI implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Bitmap> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C2502209rI c2502209rI, C09AJ c09aj) {
        long jLongValue;
        C1C7U.LIZ("LocalImageThumbnailUtils@28a9.loadImageBeforeAndroidQ$1");
        ContentResolver contentResolver = ((Context) c2502209rI.l0).getContentResolver();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(((MediaModel) c2502209rI.l1).id);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, jLongValue, 1, (BitmapFactory.Options) C23028090o.LIZ.getValue());
        if (c09aj.isDisposed()) {
            C1C7U.LIZIZ("LocalImageThumbnailUtils@28a9.loadImageBeforeAndroidQ$1");
            return;
        }
        if (thumbnail == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not load uri: ");
            sbLIZ.append(((MediaModel) c2502209rI.l1).LJFF());
            c09aj.tryOnError(new IOException(C2188811AlT.LIZIZ(sbLIZ)));
        } else {
            c09aj.onNext(thumbnail);
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("LocalImageThumbnailUtils@28a9.loadImageBeforeAndroidQ$1");
    }

    public static final void subscribe$1(C2502209rI c2502209rI, C09AJ c09aj) {
        c09aj.setCancellable(new C23266099s(C23250099c.LIZJ(C817503Hh.LL, C0PEM.LIZIZ.plus((CoroutineContext) c2502209rI.l0), C099V.ATOMIC, new C090G((InterfaceC346201Wa) c2502209rI.l1, c09aj, null))));
    }

    public static final void subscribe$2(C2502209rI c2502209rI, C09AJ c09aj) {
        long jLongValue;
        C1C7U.LIZ("LocalImageThumbnailUtils@890.loadImageBeforeAndroidQ$1");
        ContentResolver contentResolver = ((Context) c2502209rI.l0).getContentResolver();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(((MediaModel) c2502209rI.l1).id);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, jLongValue, 1, (BitmapFactory.Options) C23031090r.LIZ.getValue());
        if (c09aj.isDisposed()) {
            C1C7U.LIZIZ("LocalImageThumbnailUtils@890.loadImageBeforeAndroidQ$1");
            return;
        }
        if (thumbnail == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot load uri: ");
            sbLIZ.append(((MediaModel) c2502209rI.l1).LJFF());
            c09aj.tryOnError(new IOException(C2188811AlT.LIZIZ(sbLIZ)));
        } else {
            c09aj.onNext(thumbnail);
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("LocalImageThumbnailUtils@890.loadImageBeforeAndroidQ$1");
    }

    public static final void subscribe$3(C2502209rI c2502209rI, C09AJ c09aj) {
        long jLongValue;
        C1C7U.LIZ("LocalImageThumbnailUtils@a178.loadImageBeforeAndroidQ$1");
        ContentResolver contentResolver = ((Context) c2502209rI.l0).getContentResolver();
        Long lLJIILIIL = C2095008Iq.LJIILIIL(((MediaModel) c2502209rI.l1).id);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, jLongValue, 1, (BitmapFactory.Options) C23025090l.LIZ.getValue());
        if (c09aj.isDisposed()) {
            C1C7U.LIZIZ("LocalImageThumbnailUtils@a178.loadImageBeforeAndroidQ$1");
            return;
        }
        if (thumbnail == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not load uri: ");
            sbLIZ.append(((MediaModel) c2502209rI.l1).LJFF());
            c09aj.tryOnError(new IOException(C2188811AlT.LIZIZ(sbLIZ)));
        } else {
            c09aj.onNext(thumbnail);
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("LocalImageThumbnailUtils@a178.loadImageBeforeAndroidQ$1");
    }

    public C2502209rI(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
