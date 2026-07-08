package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19857212mg {
    Cp437(new String[0], 0, 2),
    ISO8859_1(new String[]{"ISO-8859-1"}, 1, 3),
    ISO8859_2("ISO8859_2", "ISO-8859-2"),
    ISO8859_3("ISO8859_3", "ISO-8859-3"),
    ISO8859_4("ISO8859_4", "ISO-8859-4"),
    ISO8859_5("ISO8859_5", "ISO-8859-5"),
    ISO8859_6("ISO8859_6", "ISO-8859-6"),
    ISO8859_7("ISO8859_7", "ISO-8859-7"),
    ISO8859_8("ISO8859_8", "ISO-8859-8"),
    ISO8859_9("ISO8859_9", "ISO-8859-9"),
    ISO8859_10("ISO8859_10", "ISO-8859-10"),
    ISO8859_11("ISO8859_11", "ISO-8859-11"),
    ISO8859_13("ISO8859_13", "ISO-8859-13"),
    ISO8859_14("ISO8859_14", "ISO-8859-14"),
    ISO8859_15("ISO8859_15", "ISO-8859-15"),
    ISO8859_16("ISO8859_16", "ISO-8859-16"),
    SJIS("SJIS", "Shift_JIS"),
    Cp1250("Cp1250", "windows-1250"),
    Cp1251("Cp1251", "windows-1251"),
    Cp1252("Cp1252", "windows-1252"),
    Cp1256("Cp1256", "windows-1256"),
    UnicodeBigUnmarked("UnicodeBigUnmarked", "UTF-16BE", "UnicodeBig"),
    UTF8("UTF8", "UTF-8"),
    ASCII(new String[]{"US-ASCII"}, 27, 170),
    Big5(new String[0], 28),
    GB18030("GB18030", "GB2312", "EUC_CN", "GBK"),
    EUC_KR("EUC_KR", "EUC-KR");

    public static final Map<Integer, EnumC19857212mg> LLILLL = new HashMap();
    public static final Map<String, EnumC19857212mg> LLILZ = new HashMap();
    public final int[] LL;
    public final String[] LLILLJJLI;

    EnumC19857212mg() {
        throw null;
    }

    static {
        for (EnumC19857212mg enumC19857212mg : values()) {
            for (int i : enumC19857212mg.LL) {
                LLILLL.put(Integer.valueOf(i), enumC19857212mg);
            }
            LLILZ.put(enumC19857212mg.name(), enumC19857212mg);
            for (String str : enumC19857212mg.LLILLJJLI) {
                LLILZ.put(str, enumC19857212mg);
            }
        }
    }

    public int getValue() {
        return this.LL[0];
    }

    public static EnumC19857212mg getCharacterSetECIByName(String str) {
        return (EnumC19857212mg) ((HashMap) LLILZ).get(str);
    }

    public static EnumC19857212mg getCharacterSetECIByValue(int i) throws C21628719kj {
        if (i >= 0 && i < 900) {
            return (EnumC19857212mg) ((HashMap) LLILLL).get(Integer.valueOf(i));
        }
        throw C21628719kj.getFormatInstance();
    }

    public static EnumC19857212mg valueOf(String str) {
        return (EnumC19857212mg) C08FF.LIZ(EnumC19857212mg.class, str);
    }

    EnumC19857212mg(String str, String... strArr) {
        this.LL = new int[]{i};
        this.LLILLJJLI = strArr;
    }

    EnumC19857212mg(String[] strArr, int... iArr) {
        this.LL = iArr;
        this.LLILLJJLI = strArr;
    }
}
