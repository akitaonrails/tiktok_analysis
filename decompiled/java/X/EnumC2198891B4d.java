package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1B4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2198891B4d {
    public static final C19592811l8 Companion;
    public static final EnumC2198891B4d IMAGE;
    public static final EnumC2198891B4d LINK;
    public static final /* synthetic */ EnumC2198891B4d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2198891B4d MUSIC;
    public static final EnumC2198891B4d MUSIC_FEED;
    public static final EnumC2198891B4d MUSIC_MESSAGE;
    public static final EnumC2198891B4d VIDEO;
    public static final Map<String, EnumC2198891B4d> map;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2198891B4d> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2198891B4d enumC2198891B4d = new EnumC2198891B4d("VIDEO", 0, "VIDEO");
        VIDEO = enumC2198891B4d;
        EnumC2198891B4d enumC2198891B4d2 = new EnumC2198891B4d("IMAGE", 1, "IMAGE");
        IMAGE = enumC2198891B4d2;
        EnumC2198891B4d enumC2198891B4d3 = new EnumC2198891B4d("LINK", 2, "LINK");
        LINK = enumC2198891B4d3;
        EnumC2198891B4d enumC2198891B4d4 = new EnumC2198891B4d("MUSIC", 3, "MUSIC");
        MUSIC = enumC2198891B4d4;
        EnumC2198891B4d enumC2198891B4d5 = new EnumC2198891B4d("MUSIC_FEED", 4, "MUSIC_FEED");
        MUSIC_FEED = enumC2198891B4d5;
        EnumC2198891B4d enumC2198891B4d6 = new EnumC2198891B4d("MUSIC_MESSAGE", 5, "MUSIC_MESSAGE");
        MUSIC_MESSAGE = enumC2198891B4d6;
        EnumC2198891B4d[] enumC2198891B4dArr = {enumC2198891B4d, enumC2198891B4d2, enumC2198891B4d3, enumC2198891B4d4, enumC2198891B4d5, enumC2198891B4d6};
        LLILLJJLI = enumC2198891B4dArr;
        LLILLL = new C2254308sP(enumC2198891B4dArr);
        Companion = new C19592811l8();
        EnumC2198891B4d[] enumC2198891B4dArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC2198891B4dArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC2198891B4d enumC2198891B4d7 : enumC2198891B4dArrValues) {
            linkedHashMap.put(enumC2198891B4d7.LL, enumC2198891B4d7);
        }
        map = linkedHashMap;
    }

    public static EnumC2198891B4d[] values() {
        return (EnumC2198891B4d[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2198891B4d valueOf(String str) {
        return (EnumC2198891B4d) C08FF.LIZ(EnumC2198891B4d.class, str);
    }

    public EnumC2198891B4d(String str, int i, String str2) {
        this.LL = str2;
    }
}
