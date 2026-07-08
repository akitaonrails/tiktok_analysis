package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1466660oGm;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class ObservableFloat extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new C1466660oGm(3);
    public static final long serialVersionUID = 1;
    public float mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableFloat() {
    }

    public float get() {
        return this.mValue;
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public void set(float f) {
        if (f != this.mValue) {
            this.mValue = f;
            notifyChange();
        }
    }

    public ObservableFloat(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }
}
