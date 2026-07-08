package X;

/* JADX INFO: renamed from: X.0p8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499800p8E extends C1493620oyG {
    public final C1499810p8F LJJI;
    public final boolean LJJIFFI;
    public String LJJII;

    public C1499800p8E() {
        this(new C1499810p8F(false, null, null, 0, false, 31));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enable:");
        sbLIZ.append(this.LJJIFFI);
        sbLIZ.append("|strategy:[age:");
        sbLIZ.append(this.LJJI.LIZ);
        sbLIZ.append("]|url:");
        String str = this.LJJI.LIZJ;
        if (str == null) {
            str = this.LJJII;
        }
        sbLIZ.append(str);
        sbLIZ.append('|');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1499800p8E(C1499810p8F c1499810p8F) {
        this.LJJI = c1499810p8F;
        this.LJJIFFI = true;
        this.LJJII = "";
    }
}
