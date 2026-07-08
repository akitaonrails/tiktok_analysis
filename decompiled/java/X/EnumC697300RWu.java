package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC697300RWu {
    public static final /* synthetic */ EnumC697300RWu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC697300RWu M_CREATE;
    public static final EnumC697300RWu M_DECISION_RESULT;
    public static final EnumC697300RWu M_DECISION_SUBSCRIBE;
    public static final EnumC697300RWu M_DECISION_TRIGGER;
    public static final EnumC697300RWu M_ISACTIVE;
    public static final EnumC697300RWu M_ONBIND;
    public static final EnumC697300RWu M_ONFCPPOLICY;
    public static final EnumC697300RWu M_ONPARENTSET;
    public static final EnumC697300RWu M_ONREUSEDBIND;
    public static final EnumC697300RWu M_ONSELECTED;
    public static final EnumC697300RWu M_ONSELECTED_EVENT;
    public static final EnumC697300RWu M_ONUNSELECTED;
    public static final EnumC697300RWu M_ONUNSELECTED_EVENT;
    public static final EnumC697300RWu M_UNBIND;
    public static final EnumC697300RWu M_VIEWCREATED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC697300RWu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC697300RWu enumC697300RWu = new EnumC697300RWu("M_CREATE", 0, "create");
        M_CREATE = enumC697300RWu;
        EnumC697300RWu enumC697300RWu2 = new EnumC697300RWu("M_VIEWCREATED", 1, "onViewCreated");
        M_VIEWCREATED = enumC697300RWu2;
        EnumC697300RWu enumC697300RWu3 = new EnumC697300RWu("M_ONPARENTSET", 2, "onParentSet");
        M_ONPARENTSET = enumC697300RWu3;
        EnumC697300RWu enumC697300RWu4 = new EnumC697300RWu("M_ISACTIVE", 3, "isActive");
        M_ISACTIVE = enumC697300RWu4;
        EnumC697300RWu enumC697300RWu5 = new EnumC697300RWu("M_ONBIND", 4, "onBind");
        M_ONBIND = enumC697300RWu5;
        EnumC697300RWu enumC697300RWu6 = new EnumC697300RWu("M_ONREUSEDBIND", 5, "onReuseBind");
        M_ONREUSEDBIND = enumC697300RWu6;
        EnumC697300RWu enumC697300RWu7 = new EnumC697300RWu("M_UNBIND", 6, "unBind");
        M_UNBIND = enumC697300RWu7;
        EnumC697300RWu enumC697300RWu8 = new EnumC697300RWu("M_ONSELECTED", 7, "onHolderSelected");
        M_ONSELECTED = enumC697300RWu8;
        EnumC697300RWu enumC697300RWu9 = new EnumC697300RWu("M_ONUNSELECTED", 8, "onUnselected");
        M_ONUNSELECTED = enumC697300RWu9;
        EnumC697300RWu enumC697300RWu10 = new EnumC697300RWu("M_ONSELECTED_EVENT", 9, "onSelectedEvent");
        M_ONSELECTED_EVENT = enumC697300RWu10;
        EnumC697300RWu enumC697300RWu11 = new EnumC697300RWu("M_ONUNSELECTED_EVENT", 10, "onUnselectedEvent");
        M_ONUNSELECTED_EVENT = enumC697300RWu11;
        EnumC697300RWu enumC697300RWu12 = new EnumC697300RWu("M_DECISION_SUBSCRIBE", 11, "decisionSubscribe");
        M_DECISION_SUBSCRIBE = enumC697300RWu12;
        EnumC697300RWu enumC697300RWu13 = new EnumC697300RWu("M_DECISION_TRIGGER", 12, "decisionTrigger");
        M_DECISION_TRIGGER = enumC697300RWu13;
        EnumC697300RWu enumC697300RWu14 = new EnumC697300RWu("M_DECISION_RESULT", 13, "decisionResult");
        M_DECISION_RESULT = enumC697300RWu14;
        EnumC697300RWu enumC697300RWu15 = new EnumC697300RWu("M_ONFCPPOLICY", 14, "onFcpPolicy");
        M_ONFCPPOLICY = enumC697300RWu15;
        EnumC697300RWu[] enumC697300RWuArr = {enumC697300RWu, enumC697300RWu2, enumC697300RWu3, enumC697300RWu4, enumC697300RWu5, enumC697300RWu6, enumC697300RWu7, enumC697300RWu8, enumC697300RWu9, enumC697300RWu10, enumC697300RWu11, enumC697300RWu12, enumC697300RWu13, enumC697300RWu14, enumC697300RWu15};
        LLILLJJLI = enumC697300RWuArr;
        LLILLL = new C2254308sP(enumC697300RWuArr);
    }

    public static EnumC697300RWu[] values() {
        return (EnumC697300RWu[]) LLILLJJLI.clone();
    }

    public final String getEnd() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getValue());
        sbLIZ.append("_end");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getStart() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getValue());
        sbLIZ.append("_start");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC697300RWu valueOf(String str) {
        return (EnumC697300RWu) C08FF.LIZ(EnumC697300RWu.class, str);
    }

    public EnumC697300RWu(String str, int i, String str2) {
        this.LL = str2;
    }
}
