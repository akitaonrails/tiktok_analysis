package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1466660oGm;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class ObservableBoolean extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new C1466660oGm(0);
    public static final long serialVersionUID = 1;
    public boolean mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableBoolean() {
    }

    public boolean get() {
        return this.mValue;
    }

    public ObservableBoolean(boolean z) {
        this.mValue = z;
    }

    public void set(boolean z) {
        if (z != this.mValue) {
            this.mValue = z;
            notifyChange();
        }
    }

    public ObservableBoolean(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue ? 1 : 0);
    }
}
