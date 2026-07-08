package X;

/* JADX INFO: renamed from: X.0a1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC919160a1i {
    PLAYTYPE_INVITE(0),
    PLAYTYPE_APPLY(1);

    public int value;

    public static EnumC919160a1i valueOf(String str) {
        return (EnumC919160a1i) C08FF.LIZ(EnumC919160a1i.class, str);
    }

    EnumC919160a1i(int i) {
        this.value = i;
    }
}
