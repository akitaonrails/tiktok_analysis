package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12927054b {
    public static final C12942054q Companion;
    public static final EnumC12927054b DAY;
    public static final EnumC12927054b HOUR;
    public static final /* synthetic */ EnumC12927054b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12927054b MINUTE;
    public static final EnumC12927054b SECOND;
    public static final C01GW<Map<String, EnumC12927054b>> map$delegate;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12927054b> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.054q] */
    static {
        EnumC12927054b enumC12927054b = new EnumC12927054b("SECOND", 0, "second");
        SECOND = enumC12927054b;
        EnumC12927054b enumC12927054b2 = new EnumC12927054b("MINUTE", 1, "minute");
        MINUTE = enumC12927054b2;
        EnumC12927054b enumC12927054b3 = new EnumC12927054b("HOUR", 2, "hour");
        HOUR = enumC12927054b3;
        EnumC12927054b enumC12927054b4 = new EnumC12927054b("DAY", 3, "day");
        DAY = enumC12927054b4;
        EnumC12927054b[] enumC12927054bArr = {enumC12927054b, enumC12927054b2, enumC12927054b3, enumC12927054b4};
        LLILLJJLI = enumC12927054bArr;
        LLILLL = new C2254308sP(enumC12927054bArr);
        Companion = new Object() { // from class: X.054q
        };
        map$delegate = C452501pT.LIZIZ(new C054V());
    }

    public static EnumC12927054b[] values() {
        return (EnumC12927054b[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC12927054b valueOf(String str) {
        return (EnumC12927054b) C08FF.LIZ(EnumC12927054b.class, str);
    }

    public final long getTimeInMs(long j) {
        long j2;
        int i = C054U.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        j2 = 86400000;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    j2 = 3600000;
                }
            } else {
                j2 = 60000;
            }
        } else {
            j2 = 1000;
        }
        return j * j2;
    }

    public EnumC12927054b(String str, int i, String str2) {
        this.LL = str2;
    }
}
