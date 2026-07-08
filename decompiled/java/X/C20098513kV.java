package X;

import android.content.ClipData;
import android.view.ContentInfo;

/* JADX INFO: renamed from: X.13kV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20098513kV implements InterfaceC20099013ka {
    public final ContentInfo LIZ;

    @Override // X.InterfaceC20099013ka
    public final ClipData LIZ() {
        return this.LIZ.getClip();
    }

    @Override // X.InterfaceC20099013ka
    public final int LJJJJIZL() {
        return this.LIZ.getFlags();
    }

    @Override // X.InterfaceC20099013ka
    public final int getSource() {
        return this.LIZ.getSource();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentInfoCompat{");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20099013ka
    public final ContentInfo LIZIZ() {
        return this.LIZ;
    }

    public C20098513kV(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.LIZ = contentInfo;
    }
}
