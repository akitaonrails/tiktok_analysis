package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC898050ZKx {
    public static final EnumC898050ZKx COPY;
    public static final EnumC898050ZKx DELETE;
    public static final EnumC898050ZKx FORWARD;
    public static final /* synthetic */ EnumC898050ZKx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC898050ZKx REACTION;
    public static final EnumC898050ZKx REPLY;
    public static final EnumC898050ZKx REPORT;
    public static final EnumC898050ZKx TRANSLATE;

    public static InterfaceC2044707zh<EnumC898050ZKx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC898050ZKx enumC898050ZKx = new EnumC898050ZKx("REACTION", 0);
        REACTION = enumC898050ZKx;
        EnumC898050ZKx enumC898050ZKx2 = new EnumC898050ZKx("REPLY", 1);
        REPLY = enumC898050ZKx2;
        EnumC898050ZKx enumC898050ZKx3 = new EnumC898050ZKx("FORWARD", 2);
        FORWARD = enumC898050ZKx3;
        EnumC898050ZKx enumC898050ZKx4 = new EnumC898050ZKx("COPY", 3);
        COPY = enumC898050ZKx4;
        EnumC898050ZKx enumC898050ZKx5 = new EnumC898050ZKx("TRANSLATE", 4);
        TRANSLATE = enumC898050ZKx5;
        EnumC898050ZKx enumC898050ZKx6 = new EnumC898050ZKx("DELETE", 5);
        DELETE = enumC898050ZKx6;
        EnumC898050ZKx enumC898050ZKx7 = new EnumC898050ZKx("REPORT", 6);
        REPORT = enumC898050ZKx7;
        EnumC898050ZKx[] enumC898050ZKxArr = {enumC898050ZKx, enumC898050ZKx2, enumC898050ZKx3, enumC898050ZKx4, enumC898050ZKx5, enumC898050ZKx6, enumC898050ZKx7};
        LL = enumC898050ZKxArr;
        LLILLJJLI = new C2254308sP(enumC898050ZKxArr);
    }

    public static EnumC898050ZKx[] values() {
        return (EnumC898050ZKx[]) LL.clone();
    }

    public static EnumC898050ZKx valueOf(String str) {
        return (EnumC898050ZKx) C08FF.LIZ(EnumC898050ZKx.class, str);
    }

    public EnumC898050ZKx(String str, int i) {
    }
}
