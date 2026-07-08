package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1347870lBB {
    public static final EnumC1347870lBB AUDIO;
    public static final C1348120lBa Companion;
    public static final EnumC1347870lBB EMOJI;
    public static final EnumC1347870lBB GIFT;
    public static final EnumC1347870lBB GROUP_CHAT;
    public static final /* synthetic */ EnumC1347870lBB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1347870lBB MENTION;
    public static final EnumC1347870lBB PHOTO;
    public static final EnumC1347870lBB POLL;
    public static final EnumC1347870lBB PRODUCT;
    public static final EnumC1347870lBB STICKER;
    public static final Map<String, EnumC1347870lBB> byRaw;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1347870lBB> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0lBa] */
    static {
        EnumC1347870lBB enumC1347870lBB = new EnumC1347870lBB("PHOTO", 0, "photo");
        PHOTO = enumC1347870lBB;
        EnumC1347870lBB enumC1347870lBB2 = new EnumC1347870lBB("STICKER", 1, "sticker");
        STICKER = enumC1347870lBB2;
        EnumC1347870lBB enumC1347870lBB3 = new EnumC1347870lBB("MENTION", 2, "mention");
        MENTION = enumC1347870lBB3;
        EnumC1347870lBB enumC1347870lBB4 = new EnumC1347870lBB("AUDIO", 3, "audio");
        AUDIO = enumC1347870lBB4;
        EnumC1347870lBB enumC1347870lBB5 = new EnumC1347870lBB("EMOJI", 4, "emoji");
        EMOJI = enumC1347870lBB5;
        EnumC1347870lBB enumC1347870lBB6 = new EnumC1347870lBB("PRODUCT", 5, "product");
        PRODUCT = enumC1347870lBB6;
        EnumC1347870lBB enumC1347870lBB7 = new EnumC1347870lBB("GIFT", 6, "gift");
        GIFT = enumC1347870lBB7;
        EnumC1347870lBB enumC1347870lBB8 = new EnumC1347870lBB("GROUP_CHAT", 7, "group_chat");
        GROUP_CHAT = enumC1347870lBB8;
        EnumC1347870lBB enumC1347870lBB9 = new EnumC1347870lBB("POLL", 8, "poll");
        POLL = enumC1347870lBB9;
        EnumC1347870lBB[] enumC1347870lBBArr = {enumC1347870lBB, enumC1347870lBB2, enumC1347870lBB3, enumC1347870lBB4, enumC1347870lBB5, enumC1347870lBB6, enumC1347870lBB7, enumC1347870lBB8, enumC1347870lBB9};
        LLILLJJLI = enumC1347870lBBArr;
        LLILLL = new C2254308sP(enumC1347870lBBArr);
        Companion = new Object() { // from class: X.0lBa
        };
        EnumC1347870lBB[] enumC1347870lBBArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1347870lBBArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1347870lBB enumC1347870lBB10 : enumC1347870lBBArrValues) {
            linkedHashMap.put(enumC1347870lBB10.LL, enumC1347870lBB10);
        }
        byRaw = linkedHashMap;
    }

    public static EnumC1347870lBB[] values() {
        return (EnumC1347870lBB[]) LLILLJJLI.clone();
    }

    public final String getRaw() {
        return this.LL;
    }

    public static EnumC1347870lBB valueOf(String str) {
        return (EnumC1347870lBB) C08FF.LIZ(EnumC1347870lBB.class, str);
    }

    public EnumC1347870lBB(String str, int i, String str2) {
        this.LL = str2;
    }
}
