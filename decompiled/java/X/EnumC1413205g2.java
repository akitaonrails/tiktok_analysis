package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05g2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1413205g2 {
    public static final /* synthetic */ EnumC1413205g2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1413205g2 MENTION_STICKER;
    public static final EnumC1413205g2 POST_PUBLISH_DESCRIPTION;
    public static final EnumC1413205g2 TEXT_MENTION;

    public static InterfaceC2044707zh<EnumC1413205g2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1413205g2 enumC1413205g2 = new EnumC1413205g2("TEXT_MENTION", 0);
        TEXT_MENTION = enumC1413205g2;
        EnumC1413205g2 enumC1413205g22 = new EnumC1413205g2("MENTION_STICKER", 1);
        MENTION_STICKER = enumC1413205g22;
        EnumC1413205g2 enumC1413205g23 = new EnumC1413205g2("POST_PUBLISH_DESCRIPTION", 2);
        POST_PUBLISH_DESCRIPTION = enumC1413205g23;
        EnumC1413205g2[] enumC1413205g2Arr = {enumC1413205g2, enumC1413205g22, enumC1413205g23};
        LL = enumC1413205g2Arr;
        LLILLJJLI = new C2254308sP(enumC1413205g2Arr);
    }

    public static EnumC1413205g2[] values() {
        return (EnumC1413205g2[]) LL.clone();
    }

    public static EnumC1413205g2 valueOf(String str) {
        return (EnumC1413205g2) C08FF.LIZ(EnumC1413205g2.class, str);
    }

    public EnumC1413205g2(String str, int i) {
    }
}
