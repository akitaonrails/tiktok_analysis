package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0W0H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0H extends AbstractC815450Vyp {
    public final SparseIntArray LIZLLL;
    public final Parcel LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;

    @Override // X.AbstractC815450Vyp
    public final C0W0H LIZ() {
        Parcel parcel = this.LJ;
        int iDataPosition = parcel.dataPosition();
        int i = this.LJIIIZ;
        if (i == this.LJFF) {
            i = this.LJI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJII);
        sbLIZ.append("  ");
        return new C0W0H(parcel, iDataPosition, i, C2188811AlT.LIZIZ(sbLIZ), this.LIZ, this.LIZIZ, this.LIZJ);
    }

    @Override // X.AbstractC815450Vyp
    public final boolean LJ() {
        return this.LJ.readInt() != 0;
    }

    @Override // X.AbstractC815450Vyp
    public final byte[] LJFF() {
        int i = this.LJ.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.LJ.readByteArray(bArr);
        return bArr;
    }

    @Override // X.AbstractC815450Vyp
    public final CharSequence LJI() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.LJ);
    }

    @Override // X.AbstractC815450Vyp
    public final int LJIIIIZZ() {
        return this.LJ.readInt();
    }

    @Override // X.AbstractC815450Vyp
    public final <T extends Parcelable> T LJIIJ() {
        return (T) this.LJ.readParcelable(C0W0H.class.getClassLoader());
    }

    @Override // X.AbstractC815450Vyp
    public final String LJIIL() {
        return this.LJ.readString();
    }

    public final void LJJ() {
        int i = this.LJIIIIZZ;
        if (i >= 0) {
            int i2 = this.LIZLLL.get(i);
            int iDataPosition = this.LJ.dataPosition();
            this.LJ.setDataPosition(i2);
            this.LJ.writeInt(iDataPosition - i2);
            this.LJ.setDataPosition(iDataPosition);
        }
    }

    public C0W0H(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C830490Whz(), new C830490Whz(), new C830490Whz());
    }

    @Override // X.AbstractC815450Vyp
    public final boolean LJII(int i) {
        while (this.LJIIIZ < this.LJI) {
            int i2 = this.LJIIJ;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.LJ.setDataPosition(this.LJIIIZ);
            int i3 = this.LJ.readInt();
            this.LJIIJ = this.LJ.readInt();
            this.LJIIIZ += i3;
        }
        if (this.LJIIJ == i) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC815450Vyp
    public final void LJIILJJIL(int i) {
        LJJ();
        this.LJIIIIZZ = i;
        this.LIZLLL.put(i, this.LJ.dataPosition());
        LJIJ(0);
        LJIJ(i);
    }

    @Override // X.AbstractC815450Vyp
    public final void LJIILL(boolean z) {
        this.LJ.writeInt(z ? 1 : 0);
    }

    @Override // X.AbstractC815450Vyp
    public final void LJIILLIIL(byte[] bArr) {
        if (bArr != null) {
            this.LJ.writeInt(bArr.length);
            this.LJ.writeByteArray(bArr);
        } else {
            this.LJ.writeInt(-1);
        }
    }

    @Override // X.AbstractC815450Vyp
    public final void LJIIZILJ(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.LJ, 0);
    }

    @Override // X.AbstractC815450Vyp
    public final void LJIJ(int i) {
        this.LJ.writeInt(i);
    }

    @Override // X.AbstractC815450Vyp
    public final void LJIJJ(Parcelable parcelable) {
        this.LJ.writeParcelable(parcelable, 0);
    }

    @Override // X.AbstractC815450Vyp
    public final void LJIJJLI(String str) {
        this.LJ.writeString(str);
    }

    public C0W0H(Parcel parcel, int i, int i2, String str, C830490Whz<String, Method> c830490Whz, C830490Whz<String, Method> c830490Whz2, C830490Whz<String, Class> c830490Whz3) {
        super(c830490Whz, c830490Whz2, c830490Whz3);
        this.LIZLLL = new SparseIntArray();
        this.LJIIIIZZ = -1;
        this.LJIIJ = -1;
        this.LJ = parcel;
        this.LJFF = i;
        this.LJI = i2;
        this.LJIIIZ = i;
        this.LJII = str;
    }
}
