package X;

import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Date;

/* JADX INFO: renamed from: X.09ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class BinderC2462409ks extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC2462409ks() {
        attachInterface(this, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        Date date;
        C10W8 c10w8LIZ;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC2461009ke abstractBinderC2461009ke = (AbstractBinderC2461009ke) this;
        String string = null;
        Object obj = null;
        if (i != 1) {
            if (i != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = (Parcelable) creator.createFromParcel(parcel);
            }
            C2468609ls.LIZ(parcel);
            BinderC2460909kd binderC2460909kd = (BinderC2460909kd) abstractBinderC2461009ke;
            C2464409lC c2464409lC = binderC2460909kd.LLILLL.LIZIZ;
            C835520Wq6 c835520Wq6 = binderC2460909kd.LLILLJJLI;
            c2464409lC.LIZJ(c835520Wq6);
            int i3 = ((BaseBundle) obj).getInt("error.code");
            Object[] objArr = {Integer.valueOf(i3)};
            C2460309kX c2460309kX = binderC2460909kd.LL;
            if (Log.isLoggable("PlayCore", 6)) {
                C2460309kX.LIZJ(c2460309kX.LIZ, "onError(%d)", objArr);
            } else {
                c2460309kX.getClass();
            }
            c835520Wq6.LIZJ(new C812850Vud(i3));
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator2.createFromParcel(parcel);
        }
        Bundle bundle = (Bundle) parcelable;
        C2468609ls.LIZ(parcel);
        BinderC2460909kd binderC2460909kd2 = (BinderC2460909kd) abstractBinderC2461009ke;
        C2464409lC c2464409lC2 = binderC2460909kd2.LLILLL.LIZIZ;
        C835520Wq6 c835520Wq62 = binderC2460909kd2.LLILLJJLI;
        c2464409lC2.LIZJ(c835520Wq62);
        binderC2460909kd2.LL.LIZ("onCompleteCheckAgeSignals", new Object[0]);
        if (!bundle.containsKey("user.status")) {
            c10w8LIZ = new C2462509kt().LIZ();
        } else {
            C2462509kt c2462509kt = new C2462509kt();
            c2462509kt.LIZ = C10WA.LJFF(bundle, "user.status");
            c2462509kt.LIZIZ = C10WA.LJFF(bundle, "age.range.lower");
            c2462509kt.LIZJ = C10WA.LJFF(bundle, "age.range.upper");
            if (bundle.containsKey("most.recent.approval.date")) {
                date = new Date(bundle.getLong("most.recent.approval.date"));
            } else {
                date = null;
            }
            c2462509kt.LIZLLL = date;
            if (bundle.containsKey("install.id")) {
                string = bundle.getString("install.id");
            }
            c2462509kt.LJ = string;
            c10w8LIZ = c2462509kt.LIZ();
        }
        c835520Wq62.LIZLLL(c10w8LIZ);
        return true;
    }
}
