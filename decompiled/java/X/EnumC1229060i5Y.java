package X;

import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1229060i5Y {
    public static final EnumC1229060i5Y ACCOUNT_CHANGE;
    public static final EnumC1229060i5Y CAMPUS_SWITCH;
    public static final EnumC1229060i5Y COLD_START;
    public static final EnumC1229060i5Y COMPENSATE;
    public static final EnumC1229060i5Y CREATE_GROUP_SUCCESS;
    public static final C1229110i5d Companion;
    public static final EnumC1229060i5Y DISSOLVE_GROUP;
    public static final EnumC1229060i5Y ENTER_INBOX;
    public static final /* synthetic */ EnumC1229060i5Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1229060i5Y OPEN_CREATE_GROUP_PANEL;
    public static final List<EnumC1229060i5Y> controlList;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1229060i5Y> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0i5d] */
    static {
        EnumC1229060i5Y enumC1229060i5Y = new EnumC1229060i5Y("COMPENSATE", 0, "compensate");
        COMPENSATE = enumC1229060i5Y;
        EnumC1229060i5Y enumC1229060i5Y2 = new EnumC1229060i5Y("ACCOUNT_CHANGE", 1, "account_change");
        ACCOUNT_CHANGE = enumC1229060i5Y2;
        EnumC1229060i5Y enumC1229060i5Y3 = new EnumC1229060i5Y("ENTER_INBOX", 2, "enter_inbox");
        ENTER_INBOX = enumC1229060i5Y3;
        EnumC1229060i5Y enumC1229060i5Y4 = new EnumC1229060i5Y("DISSOLVE_GROUP", 3, "dissolve_group");
        DISSOLVE_GROUP = enumC1229060i5Y4;
        EnumC1229060i5Y enumC1229060i5Y5 = new EnumC1229060i5Y("OPEN_CREATE_GROUP_PANEL", 4, "open_create_group_panel");
        OPEN_CREATE_GROUP_PANEL = enumC1229060i5Y5;
        EnumC1229060i5Y enumC1229060i5Y6 = new EnumC1229060i5Y("CREATE_GROUP_SUCCESS", 5, "create_group_success");
        CREATE_GROUP_SUCCESS = enumC1229060i5Y6;
        EnumC1229060i5Y enumC1229060i5Y7 = new EnumC1229060i5Y("CAMPUS_SWITCH", 6, "campus_switch");
        CAMPUS_SWITCH = enumC1229060i5Y7;
        EnumC1229060i5Y enumC1229060i5Y8 = new EnumC1229060i5Y("COLD_START", 7, "cold_start");
        COLD_START = enumC1229060i5Y8;
        EnumC1229060i5Y[] enumC1229060i5YArr = {enumC1229060i5Y, enumC1229060i5Y2, enumC1229060i5Y3, enumC1229060i5Y4, enumC1229060i5Y5, enumC1229060i5Y6, enumC1229060i5Y7, enumC1229060i5Y8};
        LLILLJJLI = enumC1229060i5YArr;
        LLILLL = new C2254308sP(enumC1229060i5YArr);
        Companion = new Object() { // from class: X.0i5d
        };
        controlList = Collections.singletonList(enumC1229060i5Y8);
    }

    public static EnumC1229060i5Y[] values() {
        return (EnumC1229060i5Y[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1229060i5Y valueOf(String str) {
        return (EnumC1229060i5Y) C08FF.LIZ(EnumC1229060i5Y.class, str);
    }

    public EnumC1229060i5Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
