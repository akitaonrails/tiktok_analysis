package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.12mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractBinderC19858612mu extends Binder implements InterfaceC19858112mp {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC19858612mu() {
        attachInterface(this, "com.ss.android.ugc.cut_downloader.IDownloadCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.ugc.cut_downloader.IDownloadCallback");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
                String string = parcel.readString();
                BinderC19858712mv binderC19858712mv = (BinderC19858712mv) this;
                if (string != null) {
                    binderC19858712mv.LLILLJJLI.LJ.remove(string);
                    C19859212n0 c19859212n0 = binderC19858712mv.LLILLJJLI.LJI;
                    if (c19859212n0 != null) {
                        List list = (List) ((LinkedHashMap) c19859212n0.LLILLL).get(string);
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC19859512n3) it2.next()).notifyError(-1, "download cancel");
                            }
                        }
                        c19859212n0.LLILLL.remove(string);
                    }
                }
                return true;
            }
            parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
            ((BinderC19858712mv) this).LJJJJI(parcel.readString(), parcel.readInt());
            return true;
        }
        parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
        ((BinderC19858712mv) this).LJJI(parcel.readString(), parcel.readString());
        return true;
    }
}
