package androidx.fragment.app;

import X.C21523519Ld;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C21523519Ld(4);
    public ArrayList<String> LL;
    public ArrayList<String> LLILLJJLI;
    public BackStackRecordState[] LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public final ArrayList<String> LLILZLL;
    public final ArrayList<BackStackState> LLIZ;
    public ArrayList<FragmentManager.LaunchedFragmentInfo> LLIZLLLIL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = new ArrayList<>();
        this.LL = parcel.createStringArrayList();
        this.LLILLJJLI = parcel.createStringArrayList();
        this.LLILLL = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.LLILZ = parcel.readInt();
        this.LLILZIL = parcel.readString();
        this.LLILZLL = parcel.createStringArrayList();
        this.LLIZ = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.LLIZLLLIL = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.LL);
        parcel.writeStringList(this.LLILLJJLI);
        parcel.writeTypedArray(this.LLILLL, i);
        parcel.writeInt(this.LLILZ);
        parcel.writeString(this.LLILZIL);
        parcel.writeStringList(this.LLILZLL);
        parcel.writeTypedList(this.LLIZ);
        parcel.writeTypedList(this.LLIZLLLIL);
    }
}
