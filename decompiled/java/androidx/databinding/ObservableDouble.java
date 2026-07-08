package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1466660oGm;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class ObservableDouble extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new C1466660oGm(2);
    public static final long serialVersionUID = 1;
    public double mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableDouble() {
    }

    public double get() {
        return this.mValue;
    }

    public ObservableDouble(double d) {
        this.mValue = d;
    }

    public void set(double d) {
        if (d != this.mValue) {
            this.mValue = d;
            notifyChange();
        }
    }

    public ObservableDouble(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mValue);
    }
}
