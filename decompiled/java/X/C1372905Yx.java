package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.05Yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1372905Yx implements InterfaceC440230HOb<List<? extends C440440HOw>> {
    public final int LIZ;
    public final AnonymousClass0951 LIZIZ;

    @Override // X.InterfaceC440230HOb
    public final /* bridge */ /* synthetic */ Integer LIZ() {
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final /* bridge */ /* synthetic */ Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final /* bridge */ /* synthetic */ String LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC440230HOb
    public final void LJ() {
    }

    @Override // X.InterfaceC440230HOb
    public final void LJFF(Context context, boolean z) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1372905Yx) && this.LIZ == ((C1372905Yx) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceHolderId(idType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC440230HOb
    public final int LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC440230HOb
    public final C05YD<C0HOM<? extends List<? extends C440440HOw>>> getState() {
        return this.LIZIZ;
    }

    public C1372905Yx(int i) {
        this.LIZ = i;
        this.LIZIZ = C09IC.LIZIZ(C1BNE.LIZ(new C1372405Ys(Collections.singletonList(new C440440HOw("", "", "", "", i)))));
    }
}
