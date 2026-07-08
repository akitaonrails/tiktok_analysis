package X;

/* JADX INFO: renamed from: X.09UC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UC {
    public final String LIZ;
    public final String LIZIZ;

    public C09UC() {
        this("", "");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PbRequestConfig(moduleKey='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', settingKey='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', settingClass=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09UC(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
