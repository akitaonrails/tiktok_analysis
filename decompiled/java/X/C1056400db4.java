package X;

/* JADX INFO: renamed from: X.0db4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056400db4 extends IllegalStateException {
    public final EnumC1056390db3 LL;
    public final String LLILLJJLI;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public final EnumC1056390db3 getReason() {
        return this.LL;
    }

    public C1056400db4(EnumC1056390db3 enumC1056390db3) {
        this.LL = enumC1056390db3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Get contact name fail, cause by ");
        sbLIZ.append(enumC1056390db3);
        this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
    }
}
