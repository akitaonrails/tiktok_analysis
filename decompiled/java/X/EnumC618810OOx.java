package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC618810OOx {
    public static final C618820OOy Companion;
    public static final EnumC618810OOx FORWARD;
    public static final EnumC618810OOx IMAGE;
    public static final EnumC618810OOx INLINE_MSG;
    public static final EnumC618810OOx LINK;
    public static final EnumC618810OOx LIVE_ROOM;
    public static final /* synthetic */ EnumC618810OOx[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC618810OOx LYNX_CARD;
    public static final EnumC618810OOx NONE;
    public static final EnumC618810OOx POLL;
    public static final EnumC618810OOx TEXT;
    public static final EnumC618810OOx VOICE;
    public static final Map<Integer, EnumC618810OOx> typeCache;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC618810OOx> getEntries() {
        return LLILZ;
    }

    static {
        EnumC618810OOx enumC618810OOx = new EnumC618810OOx("NONE", 0, 0, "");
        NONE = enumC618810OOx;
        EnumC618810OOx enumC618810OOx2 = new EnumC618810OOx("TEXT", 1, 1, "text");
        TEXT = enumC618810OOx2;
        EnumC618810OOx enumC618810OOx3 = new EnumC618810OOx("LINK", 2, 2, "text");
        LINK = enumC618810OOx3;
        EnumC618810OOx enumC618810OOx4 = new EnumC618810OOx("IMAGE", 3, 3, "photo");
        IMAGE = enumC618810OOx4;
        EnumC618810OOx enumC618810OOx5 = new EnumC618810OOx("FORWARD", 4, 4, "post");
        FORWARD = enumC618810OOx5;
        EnumC618810OOx enumC618810OOx6 = new EnumC618810OOx("LYNX_CARD", 5, 5, "lynx_card");
        LYNX_CARD = enumC618810OOx6;
        EnumC618810OOx enumC618810OOx7 = new EnumC618810OOx("LIVE_ROOM", 6, 6, "live_card");
        LIVE_ROOM = enumC618810OOx7;
        EnumC618810OOx enumC618810OOx8 = new EnumC618810OOx("INLINE_MSG", 7, 7, "inline_msg");
        INLINE_MSG = enumC618810OOx8;
        EnumC618810OOx enumC618810OOx9 = new EnumC618810OOx("POLL", 8, 8, "vote");
        POLL = enumC618810OOx9;
        EnumC618810OOx enumC618810OOx10 = new EnumC618810OOx("VOICE", 9, 9, "voice");
        VOICE = enumC618810OOx10;
        EnumC618810OOx[] enumC618810OOxArr = {enumC618810OOx, enumC618810OOx2, enumC618810OOx3, enumC618810OOx4, enumC618810OOx5, enumC618810OOx6, enumC618810OOx7, enumC618810OOx8, enumC618810OOx9, enumC618810OOx10};
        LLILLL = enumC618810OOxArr;
        LLILZ = new C2254308sP(enumC618810OOxArr);
        Companion = new C618820OOy();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC618810OOx enumC618810OOx11 : values()) {
            linkedHashMap.put(Integer.valueOf(enumC618810OOx11.LL), enumC618810OOx11);
        }
        typeCache = C2097608Jq.LJIIZILJ(linkedHashMap);
    }

    public static EnumC618810OOx[] values() {
        return (EnumC618810OOx[]) LLILLL.clone();
    }

    public final String getNameString() {
        return this.LLILLJJLI;
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC618810OOx valueOf(String str) {
        return (EnumC618810OOx) C08FF.LIZ(EnumC618810OOx.class, str);
    }

    public EnumC618810OOx(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
