package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1466660oGm;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class ObservableLong extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new C1466660oGm(5);
    public static final long serialVersionUID = 1;
    public long mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableLong() {
    }

    public long get() {
        return this.mValue;
    }

    public ObservableLong(long j) {
        this.mValue = j;
    }

    public void set(long j) {
        if (j != this.mValue) {
            this.mValue = j;
            notifyChange();
        }
    }

    public ObservableLong(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mValue);
    }
}
