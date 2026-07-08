package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1864730ycp;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class ObservableShort extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new C1864730ycp(3);
    public static final long serialVersionUID = 1;
    public short mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableShort() {
    }

    public short get() {
        return this.mValue;
    }

    public ObservableShort(short s) {
        this.mValue = s;
    }

    public void set(short s) {
        if (s != this.mValue) {
            this.mValue = s;
            notifyChange();
        }
    }

    public ObservableShort(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
