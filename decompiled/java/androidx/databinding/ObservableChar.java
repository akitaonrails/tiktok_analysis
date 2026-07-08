package androidx.databinding;

import X.AbstractC1779190wOr;
import X.C1466660oGm;
import X.InterfaceC1779210wOt;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class ObservableChar extends AbstractC1779190wOr implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new C1466660oGm(1);
    public static final long serialVersionUID = 1;
    public char mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableChar() {
    }

    public char get() {
        return this.mValue;
    }

    public ObservableChar(char c) {
        this.mValue = c;
    }

    public void set(char c) {
        if (c != this.mValue) {
            this.mValue = c;
            notifyChange();
        }
    }

    public ObservableChar(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        super(interfaceC1779210wOtArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
