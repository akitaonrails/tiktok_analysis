package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: X.13kY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20098813kY implements C0I7C {
    public final ClipData LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public Uri LIZLLL;
    public Bundle LJ;

    @Override // X.C0I7C
    public final C20098713kX build() {
        return new C20098713kX(new InterfaceC20099013ka(this) { // from class: X.13kZ
            public final ClipData LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final Uri LIZLLL;
            public final Bundle LJ;

            @Override // X.InterfaceC20099013ka
            public final ContentInfo LIZIZ() {
                return null;
            }

            public final String toString() {
                String strLIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ContentInfoCompat{clip=");
                sbLIZ.append(this.LIZ.getDescription());
                sbLIZ.append(", source=");
                int i = this.LIZIZ;
                sbLIZ.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sbLIZ.append(", flags=");
                int i2 = this.LIZJ;
                sbLIZ.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (this.LIZLLL == null) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(", hasLinkUri(");
                    sbLIZ2.append(this.LIZLLL.toString().length());
                    sbLIZ2.append(")");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(this.LJ != null ? ", hasExtras" : "");
                sbLIZ.append("}");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC20099013ka
            public final ClipData LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC20099013ka
            public final int LJJJJIZL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC20099013ka
            public final int getSource() {
                return this.LIZIZ;
            }

            {
                ClipData clipData = this.LIZ;
                clipData.getClass();
                this.LIZ = clipData;
                int i = this.LIZIZ;
                C08IF.LIZIZ(i, 0, 5, "source");
                this.LIZIZ = i;
                int i2 = this.LIZJ;
                if ((i2 & 1) == i2) {
                    this.LIZJ = i2;
                    this.LIZLLL = this.LIZLLL;
                    this.LJ = this.LJ;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Requested flags 0x");
                    sbLIZ.append(Integer.toHexString(i2));
                    sbLIZ.append(", but only 0x");
                    sbLIZ.append(Integer.toHexString(1));
                    sbLIZ.append(" are allowed");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        });
    }

    @Override // X.C0I7C
    public final void LIZ(Uri uri) {
        this.LIZLLL = uri;
    }

    @Override // X.C0I7C
    public final void LIZIZ(int i) {
        this.LIZJ = i;
    }

    @Override // X.C0I7C
    public final void setExtras(Bundle bundle) {
        this.LJ = bundle;
    }

    public C20098813kY(ClipData clipData, int i) {
        this.LIZ = clipData;
        this.LIZIZ = i;
    }
}
