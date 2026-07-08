package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC921560a5a {
    public static final /* synthetic */ EnumC921560a5a[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC921560a5a PLAYBOOK_CREATE_SCHEMA;
    public static final EnumC921560a5a PLAYBOOK_DETAIL_SCHEMA;
    public static final EnumC921560a5a PLAYBOOK_ENTITY_SCHEMA;
    public static final EnumC921560a5a PLAYBOOK_MANAGE_SCHEMA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC921560a5a> getEntries() {
        return LLILLL;
    }

    static {
        EnumC921560a5a enumC921560a5a = new EnumC921560a5a("PLAYBOOK_CREATE_SCHEMA", 0, "webcast_playbook_create");
        PLAYBOOK_CREATE_SCHEMA = enumC921560a5a;
        EnumC921560a5a enumC921560a5a2 = new EnumC921560a5a("PLAYBOOK_MANAGE_SCHEMA", 1, "webcast_playbook_manage");
        PLAYBOOK_MANAGE_SCHEMA = enumC921560a5a2;
        EnumC921560a5a enumC921560a5a3 = new EnumC921560a5a("PLAYBOOK_DETAIL_SCHEMA", 2, "webcast_playbook_detail");
        PLAYBOOK_DETAIL_SCHEMA = enumC921560a5a3;
        EnumC921560a5a enumC921560a5a4 = new EnumC921560a5a("PLAYBOOK_ENTITY_SCHEMA", 3, "webcast_play");
        PLAYBOOK_ENTITY_SCHEMA = enumC921560a5a4;
        EnumC921560a5a[] enumC921560a5aArr = {enumC921560a5a, enumC921560a5a2, enumC921560a5a3, enumC921560a5a4};
        LLILLJJLI = enumC921560a5aArr;
        LLILLL = new C2254308sP(enumC921560a5aArr);
    }

    public static EnumC921560a5a[] values() {
        return (EnumC921560a5a[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC921560a5a valueOf(String str) {
        return (EnumC921560a5a) C08FF.LIZ(EnumC921560a5a.class, str);
    }

    public EnumC921560a5a(String str, int i, String str2) {
        this.LL = str2;
    }
}
