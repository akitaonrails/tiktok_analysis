package X;

/* JADX INFO: renamed from: X.15rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20653915rt implements InterfaceC20677715vj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC20677715vj
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(EnumC20654715s1.FEED_COMPONENT.getTypeName());
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20653915rt(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
