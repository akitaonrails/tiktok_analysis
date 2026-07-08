package X;

/* JADX INFO: renamed from: X.0nn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448290nn9 {
    public final EnumC1448830no1 LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public C1448290nn9(EnumC1448830no1 enumC1448830no1) {
        this(enumC1448830no1, 0, 0L, 14);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartRecordingCommandEvent{recordType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1448290nn9(EnumC1448830no1 enumC1448830no1, int i, long j, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        j = (i2 & 4) != 0 ? 0L : j;
        this.LIZ = enumC1448830no1;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = false;
    }
}
