package X;

/* JADX INFO: renamed from: X.0jMV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1278010jMV {
    LC(1, "LC"),
    HEv1(3, "HE"),
    HEv2(4, "HEv2");

    public static final C1278730jNf Companion = new Object() { // from class: X.0jNf
    };
    public final int LL;
    public final String LLILLJJLI;

    public static EnumC1278010jMV valueOf(String str) {
        return (EnumC1278010jMV) C08FF.LIZ(EnumC1278010jMV.class, str);
    }

    public final int getProfile() {
        return this.LL;
    }

    public final String getTag() {
        return this.LLILLJJLI;
    }

    EnumC1278010jMV(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
