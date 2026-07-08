package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1466660oGm;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class ObservableInt extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new C1466660oGm(4);
    public static final long serialVersionUID = 1;
    public int mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableInt() {
    }

    public int get() {
        return this.mValue;
    }

    public ObservableInt(int i) {
        this.mValue = i;
    }

    public void set(int i) {
        if (i != this.mValue) {
            this.mValue = i;
            notifyChange();
        }
    }

    public ObservableInt(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
