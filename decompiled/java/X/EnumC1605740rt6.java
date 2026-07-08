package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1605740rt6 {
    public static final EnumC1605740rt6 AWEME_CHANGE;
    public static final EnumC1605740rt6 BIND_AVATAR_COMPONENT;
    public static final EnumC1605740rt6 BIND_AWEME;
    public static final EnumC1605740rt6 BIND_USER;
    public static final EnumC1605740rt6 FROM_SERVER;
    public static final /* synthetic */ EnumC1605740rt6[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1605740rt6 MARK_READ;
    public static final EnumC1605740rt6 UPDATE_MINE;
    public static final EnumC1605740rt6 UPDATE_UNREAD_NUM;
    public final String LL;
    public String LLILLJJLI;

    public EnumC1605740rt6() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1605740rt6> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1605740rt6 enumC1605740rt6 = new EnumC1605740rt6("UPDATE_UNREAD_NUM", 0, "updateUnReadNum");
        UPDATE_UNREAD_NUM = enumC1605740rt6;
        EnumC1605740rt6 enumC1605740rt62 = new EnumC1605740rt6("MARK_READ", 1, "markOneStoryRead");
        MARK_READ = enumC1605740rt62;
        EnumC1605740rt6 enumC1605740rt63 = new EnumC1605740rt6("AWEME_CHANGE", 2, "aweme_change");
        AWEME_CHANGE = enumC1605740rt63;
        EnumC1605740rt6 enumC1605740rt64 = new EnumC1605740rt6("FROM_SERVER", 3, "from_server");
        FROM_SERVER = enumC1605740rt64;
        EnumC1605740rt6 enumC1605740rt65 = new EnumC1605740rt6("BIND_USER", 4, "bind_user");
        BIND_USER = enumC1605740rt65;
        EnumC1605740rt6 enumC1605740rt66 = new EnumC1605740rt6("BIND_AWEME", 5, "bind_aweme");
        BIND_AWEME = enumC1605740rt66;
        EnumC1605740rt6 enumC1605740rt67 = new EnumC1605740rt6("BIND_AVATAR_COMPONENT", 6, "bind_avatar_component");
        BIND_AVATAR_COMPONENT = enumC1605740rt67;
        EnumC1605740rt6 enumC1605740rt68 = new EnumC1605740rt6("UPDATE_MINE", 7, "update_mine_status");
        UPDATE_MINE = enumC1605740rt68;
        EnumC1605740rt6[] enumC1605740rt6Arr = {enumC1605740rt6, enumC1605740rt62, enumC1605740rt63, enumC1605740rt64, enumC1605740rt65, enumC1605740rt66, enumC1605740rt67, enumC1605740rt68};
        LLILLL = enumC1605740rt6Arr;
        LLILZ = new C2254308sP(enumC1605740rt6Arr);
    }

    public static EnumC1605740rt6[] values() {
        return (EnumC1605740rt6[]) LLILLL.clone();
    }

    public final String print() {
        if (this.LLILLJJLI == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source = ");
            sbLIZ.append(this.LL);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("(source ='");
        sbLIZ2.append(this.LL);
        sbLIZ2.append("', scene=");
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append(')');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String getS() {
        return this.LL;
    }

    public final String getScene() {
        return this.LLILLJJLI;
    }

    public static EnumC1605740rt6 valueOf(String str) {
        return (EnumC1605740rt6) C08FF.LIZ(EnumC1605740rt6.class, str);
    }

    public final EnumC1605740rt6 setScene(EnumC1606080rte enumC1606080rte) {
        String strName;
        if (enumC1606080rte != null) {
            strName = enumC1606080rte.name();
        } else {
            strName = null;
        }
        this.LLILLJJLI = strName;
        return this;
    }

    public final void setScene(String str) {
        this.LLILLJJLI = str;
    }

    public EnumC1605740rt6(String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = null;
    }
}
