package androidx.databinding;

import X.C1779180wOq;
import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public class ObservableParcelable<T extends Parcelable> extends C1779180wOq<T> implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new C1864730ycp(2);
    public static final long serialVersionUID = 1;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableParcelable() {
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(get(), 0);
    }
}
