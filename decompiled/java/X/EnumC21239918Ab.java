package X;

/* JADX INFO: renamed from: X.18Ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21239918Ab {
    UNDEFINED(0),
    INT(1),
    STRING(2);

    public final int LL;

    public static EnumC21239918Ab valueOf(String str) {
        return (EnumC21239918Ab) C08FF.LIZ(EnumC21239918Ab.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC21239918Ab(int i) {
        this.LL = i;
    }
}
