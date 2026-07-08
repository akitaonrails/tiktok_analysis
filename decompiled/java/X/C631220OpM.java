package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631220OpM implements InterfaceC0148002o {
    public final C632090Oql LL;
    public final EnumC631410Opf LLILLJJLI;

    public C631220OpM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631220OpM)) {
            return false;
        }
        C631220OpM c631220OpM = (C631220OpM) obj;
        return Intrinsics.LJFF(this.LL, c631220OpM.LL) && this.LLILLJJLI == c631220OpM.LLILLJJLI;
    }

    public final int hashCode() {
        C632090Oql c632090Oql = this.LL;
        return ((c632090Oql == null ? 0 : c632090Oql.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicState(playingMusicItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playingStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C631220OpM(int i) {
        this(null, EnumC631410Opf.DEFAULT);
    }

    public C631220OpM(C632090Oql c632090Oql, EnumC631410Opf enumC631410Opf) {
        this.LL = c632090Oql;
        this.LLILLJJLI = enumC631410Opf;
    }
}
