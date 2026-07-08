package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1864730ycp;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class ObservableByte extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new C1864730ycp(1);
    public static final long serialVersionUID = 1;
    public byte mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableByte() {
    }

    public byte get() {
        return this.mValue;
    }

    public ObservableByte(byte b) {
        this.mValue = b;
    }

    public void set(byte b) {
        if (b != this.mValue) {
            this.mValue = b;
            notifyChange();
        }
    }

    public ObservableByte(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mValue);
    }
}
