package X;

/* JADX INFO: renamed from: X.12nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19864512nr {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    public final int LL;
    public final String LLILLJJLI;

    public int toInt() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LLILLJJLI;
    }

    public static EnumC19864512nr intToLevel(int i) {
        if (i != 0) {
            if (i != 10) {
                if (i != 20) {
                    if (i != 30) {
                        if (i == 40) {
                            return ERROR;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Level integer [");
                        sbLIZ.append(i);
                        sbLIZ.append("] not recognized.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return WARN;
                }
                return INFO;
            }
            return DEBUG;
        }
        return TRACE;
    }

    public static EnumC19864512nr valueOf(String str) {
        return (EnumC19864512nr) C08FF.LIZ(EnumC19864512nr.class, str);
    }

    EnumC19864512nr(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
