package X;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WIO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIO<T> {
    public final MediaBrowserService.Result LIZ;

    public C0WIO(MediaBrowserService.Result result) {
        this.LIZ = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(T t) {
        ArrayList arrayList = null;
        if (t instanceof List) {
            MediaBrowserService.Result result = this.LIZ;
            List<Parcel> list = (List) t;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
            return;
        }
        if (t instanceof Parcel) {
            Parcel parcel2 = (Parcel) t;
            parcel2.setDataPosition(0);
            this.LIZ.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
            return;
        }
        this.LIZ.sendResult(null);
    }
}
