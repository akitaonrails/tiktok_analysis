package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Asa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193221Asa {
    public static final EnumC2193221Asa CLICK_PUBLISH;
    public static final EnumC2193221Asa DELETE_POST;
    public static final EnumC2193221Asa DRAFT_DELETED;
    public static final EnumC2193221Asa DRAFT_SAVED;
    public static final /* synthetic */ EnumC2193221Asa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2193221Asa PAGE_INIT;
    public static final EnumC2193221Asa PULL_TO_REFRESH;
    public static final EnumC2193221Asa VISIBILITY_CHANGE;

    public static InterfaceC2044707zh<EnumC2193221Asa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2193221Asa enumC2193221Asa = new EnumC2193221Asa("PAGE_INIT", 0);
        PAGE_INIT = enumC2193221Asa;
        EnumC2193221Asa enumC2193221Asa2 = new EnumC2193221Asa("PULL_TO_REFRESH", 1);
        PULL_TO_REFRESH = enumC2193221Asa2;
        EnumC2193221Asa enumC2193221Asa3 = new EnumC2193221Asa("VISIBILITY_CHANGE", 2);
        VISIBILITY_CHANGE = enumC2193221Asa3;
        EnumC2193221Asa enumC2193221Asa4 = new EnumC2193221Asa("CLICK_PUBLISH", 3);
        CLICK_PUBLISH = enumC2193221Asa4;
        EnumC2193221Asa enumC2193221Asa5 = new EnumC2193221Asa("DRAFT_SAVED", 4);
        DRAFT_SAVED = enumC2193221Asa5;
        EnumC2193221Asa enumC2193221Asa6 = new EnumC2193221Asa("DRAFT_DELETED", 5);
        DRAFT_DELETED = enumC2193221Asa6;
        EnumC2193221Asa enumC2193221Asa7 = new EnumC2193221Asa("DELETE_POST", 6);
        DELETE_POST = enumC2193221Asa7;
        EnumC2193221Asa[] enumC2193221AsaArr = {enumC2193221Asa, enumC2193221Asa2, enumC2193221Asa3, enumC2193221Asa4, enumC2193221Asa5, enumC2193221Asa6, enumC2193221Asa7};
        LL = enumC2193221AsaArr;
        LLILLJJLI = new C2254308sP(enumC2193221AsaArr);
    }

    public static EnumC2193221Asa[] values() {
        return (EnumC2193221Asa[]) LL.clone();
    }

    public static EnumC2193221Asa valueOf(String str) {
        return (EnumC2193221Asa) C08FF.LIZ(EnumC2193221Asa.class, str);
    }

    public EnumC2193221Asa(String str, int i) {
    }
}
