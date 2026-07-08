package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20529715Ux implements Serializable {
    public static final C15V0 Companion;
    public static final EnumC20529715Ux EXPLORE_INSERT_CARD_TYPE_CHAT_GROUP;
    public static final EnumC20529715Ux EXPLORE_INSERT_CARD_TYPE_CUSTOMTOPICS;
    public static final EnumC20529715Ux EXPLORE_INSERT_CARD_TYPE_DEFAULT;
    public static final /* synthetic */ EnumC20529715Ux[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static final EnumC20529715Ux fromValue(Integer num) {
        Companion.getClass();
        return C15V0.LIZ(num);
    }

    public static InterfaceC2044707zh<EnumC20529715Ux> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20529715Ux enumC20529715Ux = new EnumC20529715Ux("EXPLORE_INSERT_CARD_TYPE_DEFAULT", 0, 0);
        EXPLORE_INSERT_CARD_TYPE_DEFAULT = enumC20529715Ux;
        EnumC20529715Ux enumC20529715Ux2 = new EnumC20529715Ux("EXPLORE_INSERT_CARD_TYPE_CUSTOMTOPICS", 1, 1);
        EXPLORE_INSERT_CARD_TYPE_CUSTOMTOPICS = enumC20529715Ux2;
        EnumC20529715Ux enumC20529715Ux3 = new EnumC20529715Ux("EXPLORE_INSERT_CARD_TYPE_CHAT_GROUP", 2, 2);
        EXPLORE_INSERT_CARD_TYPE_CHAT_GROUP = enumC20529715Ux3;
        EnumC20529715Ux[] enumC20529715UxArr = {enumC20529715Ux, enumC20529715Ux2, enumC20529715Ux3};
        LLILLJJLI = enumC20529715UxArr;
        LLILLL = new C2254308sP(enumC20529715UxArr);
        Companion = new C15V0();
    }

    public static EnumC20529715Ux[] values() {
        return (EnumC20529715Ux[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20529715Ux valueOf(String str) {
        return (EnumC20529715Ux) C08FF.LIZ(EnumC20529715Ux.class, str);
    }

    public EnumC20529715Ux(String str, int i, int i2) {
        this.LL = i2;
    }
}
