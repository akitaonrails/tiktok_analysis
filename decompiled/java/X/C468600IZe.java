package X;

/* JADX INFO: renamed from: X.0IZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468600IZe {
    public long LIZ;
    public EnumC468660IZk LIZIZ;
    public boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C468600IZe)) {
            return false;
        }
        C468600IZe c468600IZe = (C468600IZe) obj;
        return this.LIZ == c468600IZe.LIZ && this.LIZIZ == c468600IZe.LIZIZ && this.LIZJ == c468600IZe.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomEntry(anchorId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reported=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        EnumC468660IZk enumC468660IZk = this.LIZIZ;
        return enumC468660IZk == EnumC468660IZk.LLILLL || enumC468660IZk == EnumC468660IZk.LLILLJJLI;
    }

    public C468600IZe(long j, EnumC468660IZk enumC468660IZk) {
        this.LIZ = j;
        this.LIZIZ = enumC468660IZk;
    }
}
