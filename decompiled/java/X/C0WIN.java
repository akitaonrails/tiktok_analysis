package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WIN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIN implements InterfaceC820920WIg {
    public final Messenger LIZ;

    public final IBinder LIZ() {
        return this.LIZ.getBinder();
    }

    public C0WIN(Messenger messenger) {
        this.LIZ = messenger;
    }

    public final void LIZJ(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        this.LIZ.send(messageObtain);
    }

    public final void LIZIZ(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
        ArrayList arrayList;
        Bundle bundle3 = new Bundle();
        C786410Ut5.LJJJI("data_media_item_id", str, bundle3);
        C786410Ut5.LJJIIZI(bundle3, bundle, "data_options");
        C786410Ut5.LJJIIZI(bundle3, bundle2, "data_notify_children_changed_options");
        if (list != null) {
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            C786410Ut5.LJJIL(bundle3, "data_media_item_list", arrayList);
        }
        LIZJ(3, bundle3);
    }
}
