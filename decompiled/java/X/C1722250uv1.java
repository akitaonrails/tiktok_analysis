package X;

/* JADX INFO: renamed from: X.0uv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722250uv1 extends Exception {
    public final EnumC2218681BsY LL;
    public final String LLILLJJLI;

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error type: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(". ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EnumC2218681BsY getErrorType() {
        return this.LL;
    }

    public C1722250uv1(EnumC2218681BsY enumC2218681BsY, String str) {
        super(str);
        this.LLILLJJLI = str;
        this.LL = enumC2218681BsY;
    }
}
