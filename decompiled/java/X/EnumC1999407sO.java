package X;

/* JADX INFO: renamed from: X.07sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1999407sO {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");

    public final String LL;

    EnumC1999407sO(String str) {
        this.LL = str;
    }

    public static EnumC1999407sO valueOf(String str) {
        return (EnumC1999407sO) C08FF.LIZ(EnumC1999407sO.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }
}
