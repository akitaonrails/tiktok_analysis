package androidx.fragment.app;

import X.C21523519Ld;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes33.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C21523519Ld(5);
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final int LLJILJIL;
    public final String LLJILJILJ;
    public final int LLJILLL;
    public final boolean LLJJ;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.LL);
        sb.append(" (");
        sb.append(this.LLILLJJLI);
        sb.append(")}:");
        if (this.LLILLL) {
            sb.append(" fromLayout");
        }
        if (this.LLILZ) {
            sb.append(" dynamicContainer");
        }
        if (this.LLILZLL != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.LLILZLL));
        }
        String str = this.LLIZ;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.LLIZ);
        }
        if (this.LLIZLLLIL) {
            sb.append(" retainInstance");
        }
        if (this.LLJ) {
            sb.append(" removing");
        }
        if (this.LLJI) {
            sb.append(" detached");
        }
        if (this.LLJIJIL) {
            sb.append(" hidden");
        }
        if (this.LLJILJILJ != null) {
            sb.append(" targetWho=");
            sb.append(this.LLJILJILJ);
            sb.append(" targetRequestCode=");
            sb.append(this.LLJILLL);
        }
        if (this.LLJJ) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.LL = parcel.readString();
        this.LLILLJJLI = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLL = z;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLILZ = z2;
        this.LLILZIL = parcel.readInt();
        this.LLILZLL = parcel.readInt();
        this.LLIZ = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLIZLLLIL = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLJ = z4;
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.LLJI = z5;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.LLJIJIL = z6;
        this.LLJILJIL = parcel.readInt();
        this.LLJILJILJ = parcel.readString();
        this.LLJILLL = parcel.readInt();
        this.LLJJ = parcel.readInt() != 0;
    }

    public FragmentState(Fragment fragment) {
        this.LL = fragment.getClass().getName();
        this.LLILLJJLI = fragment.mWho;
        this.LLILLL = fragment.mFromLayout;
        this.LLILZ = fragment.mInDynamicContainer;
        this.LLILZIL = fragment.mFragmentId;
        this.LLILZLL = fragment.mContainerId;
        this.LLIZ = fragment.mTag;
        this.LLIZLLLIL = fragment.mRetainInstance;
        this.LLJ = fragment.mRemoving;
        this.LLJI = fragment.mDetached;
        this.LLJIJIL = fragment.mHidden;
        this.LLJILJIL = fragment.mMaxState.ordinal();
        this.LLJILJILJ = fragment.mTargetWho;
        this.LLJILLL = fragment.mTargetRequestCode;
        this.LLJJ = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.LL);
        parcel.writeString(this.LLILLJJLI);
        parcel.writeInt(this.LLILLL ? 1 : 0);
        parcel.writeInt(this.LLILZ ? 1 : 0);
        parcel.writeInt(this.LLILZIL);
        parcel.writeInt(this.LLILZLL);
        parcel.writeString(this.LLIZ);
        parcel.writeInt(this.LLIZLLLIL ? 1 : 0);
        parcel.writeInt(this.LLJ ? 1 : 0);
        parcel.writeInt(this.LLJI ? 1 : 0);
        parcel.writeInt(this.LLJIJIL ? 1 : 0);
        parcel.writeInt(this.LLJILJIL);
        parcel.writeString(this.LLJILJILJ);
        parcel.writeInt(this.LLJILLL);
        parcel.writeInt(this.LLJJ ? 1 : 0);
    }
}
