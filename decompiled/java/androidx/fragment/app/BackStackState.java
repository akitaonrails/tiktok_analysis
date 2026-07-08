package androidx.fragment.app;

import X.C21523519Ld;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C21523519Ld(2);
    public final List<String> LL;
    public final List<BackStackRecordState> LLILLJJLI;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BackStackState(Parcel parcel) {
        this.LL = parcel.createStringArrayList();
        this.LLILLJJLI = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.LL);
        parcel.writeTypedList(this.LLILLJJLI);
    }
}
