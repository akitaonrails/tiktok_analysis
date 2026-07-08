package androidx.fragment.app;

import X.C19EW;
import X.C21523519Ld;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C21523519Ld(1);
    public final int[] LL;
    public final ArrayList<String> LLILLJJLI;
    public final int[] LLILLL;
    public final int[] LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final CharSequence LLJ;
    public final int LLJI;
    public final CharSequence LLJIJIL;
    public final ArrayList<String> LLJILJIL;
    public final ArrayList<String> LLJILJILJ;
    public final boolean LLJILLL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BackStackRecordState(a aVar) {
        String str;
        int size = aVar.LIZJ.size();
        this.LL = new int[size * 6];
        if (aVar.LJIIIIZZ) {
            this.LLILLJJLI = new ArrayList<>(size);
            this.LLILLL = new int[size];
            this.LLILZ = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C19EW c19ew = (C19EW) ListProtector.get(aVar.LIZJ, i2);
                int i3 = i + 1;
                this.LL[i] = c19ew.LIZ;
                ArrayList<String> arrayList = this.LLILLJJLI;
                Fragment fragment = c19ew.LIZIZ;
                if (fragment != null) {
                    str = fragment.mWho;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.LL;
                int i4 = i3 + 1;
                iArr[i3] = c19ew.LIZJ ? 1 : 0;
                int i5 = i4 + 1;
                iArr[i4] = c19ew.LIZLLL;
                int i6 = i5 + 1;
                iArr[i5] = c19ew.LJ;
                int i7 = i6 + 1;
                iArr[i6] = c19ew.LJFF;
                i = i7 + 1;
                iArr[i7] = c19ew.LJI;
                this.LLILLL[i2] = c19ew.LJII.ordinal();
                this.LLILZ[i2] = c19ew.LJIIIIZZ.ordinal();
            }
            this.LLILZIL = aVar.LJII;
            this.LLILZLL = aVar.LJIIJ;
            this.LLIZ = aVar.LJIJJLI;
            this.LLIZLLLIL = aVar.LJIIJJI;
            this.LLJ = aVar.LJIIL;
            this.LLJI = aVar.LJIILIIL;
            this.LLJIJIL = aVar.LJIILJJIL;
            this.LLJILJIL = aVar.LJIILL;
            this.LLJILJILJ = aVar.LJIILLIIL;
            this.LLJILLL = aVar.LJIIZILJ;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackRecordState(Parcel parcel) {
        boolean z;
        this.LL = parcel.createIntArray();
        this.LLILLJJLI = parcel.createStringArrayList();
        this.LLILLL = parcel.createIntArray();
        this.LLILZ = parcel.createIntArray();
        this.LLILZIL = parcel.readInt();
        this.LLILZLL = parcel.readString();
        this.LLIZ = parcel.readInt();
        this.LLIZLLLIL = parcel.readInt();
        this.LLJ = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LLJI = parcel.readInt();
        this.LLJIJIL = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LLJILJIL = parcel.createStringArrayList();
        this.LLJILJILJ = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILLL = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.LL);
        parcel.writeStringList(this.LLILLJJLI);
        parcel.writeIntArray(this.LLILLL);
        parcel.writeIntArray(this.LLILZ);
        parcel.writeInt(this.LLILZIL);
        parcel.writeString(this.LLILZLL);
        parcel.writeInt(this.LLIZ);
        parcel.writeInt(this.LLIZLLLIL);
        TextUtils.writeToParcel(this.LLJ, parcel, 0);
        parcel.writeInt(this.LLJI);
        TextUtils.writeToParcel(this.LLJIJIL, parcel, 0);
        parcel.writeStringList(this.LLJILJIL);
        parcel.writeStringList(this.LLJILJILJ);
        parcel.writeInt(this.LLJILLL ? 1 : 0);
    }
}
