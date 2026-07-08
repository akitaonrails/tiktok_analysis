package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20693615yI extends C20693515yH {
    public final String LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;
    public final View.OnClickListener LLJJJJ;
    public final int LLJJJJJIL;

    @Override // X.C20693515yH
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20693615yI)) {
            return false;
        }
        C20693615yI c20693615yI = (C20693615yI) obj;
        return Intrinsics.LJFF(this.LLJJIJIL, c20693615yI.LLJJIJIL) && this.LLJJJ == c20693615yI.LLJJJ && this.LLJJJIL == c20693615yI.LLJJJIL && Intrinsics.LJFF(this.LLJJJJ, c20693615yI.LLJJJJ) && this.LLJJJJJIL == c20693615yI.LLJJJJJIL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LLJJIJIL.hashCode() * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31;
        View.OnClickListener onClickListener = this.LLJJJJ;
        return ((iHashCode + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31) + this.LLJJJJJIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadButtonItem(title=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(", blockEnd=");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", blockBegin=");
        sbLIZ.append(this.LLJJJIL);
        sbLIZ.append(", clickListener=");
        sbLIZ.append(this.LLJJJJ);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LLJJJJJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C20693515yH
    public final boolean LIZIZ() {
        return this.LLJJJIL;
    }

    @Override // X.C20693515yH
    public final boolean LIZLLL() {
        return this.LLJJJ;
    }

    @Override // X.C20693515yH
    public final String LJJIFFI() {
        return this.LLJJIJIL;
    }

    public /* synthetic */ C20693615yI(View.OnClickListener onClickListener, int i) {
        this("", false, false, onClickListener, i);
    }

    public C20693615yI(String str, boolean z, boolean z2, View.OnClickListener onClickListener, int i) {
        super(str, null, null, false, false, null, false, false, null, null, null, z2, z, 26622);
        this.LLJJIJIL = str;
        this.LLJJJ = z;
        this.LLJJJIL = z2;
        this.LLJJJJ = onClickListener;
        this.LLJJJJJIL = i;
    }
}
