package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2210521BfO {
    public static final /* synthetic */ EnumC2210521BfO[] LLILLJJLI;
    public static final EnumC2210521BfO USER_ID;
    public final String LL = "user_id";

    static {
        EnumC2210521BfO enumC2210521BfO = new EnumC2210521BfO();
        USER_ID = enumC2210521BfO;
        LLILLJJLI = new EnumC2210521BfO[]{enumC2210521BfO};
    }

    public static EnumC2210521BfO[] values() {
        return (EnumC2210521BfO[]) LLILLJJLI.clone();
    }

    public String getKey() {
        return this.LL;
    }

    public static EnumC2210521BfO fromKey(String str) {
        for (EnumC2210521BfO enumC2210521BfO : values()) {
            if (enumC2210521BfO.getKey().equals(str)) {
                return enumC2210521BfO;
            }
        }
        return null;
    }

    public static EnumC2210521BfO valueOf(String str) {
        return (EnumC2210521BfO) C08FF.LIZ(EnumC2210521BfO.class, str);
    }
}
