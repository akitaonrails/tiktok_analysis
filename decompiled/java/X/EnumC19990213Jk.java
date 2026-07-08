package X;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19990213Jk {
    public static final EnumC19990213Jk DAYS;
    public static final EnumC19990213Jk HOURS;
    public static final /* synthetic */ EnumC19990213Jk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19990213Jk MICROSECONDS;
    public static final EnumC19990213Jk MILLISECONDS;
    public static final EnumC19990213Jk MINUTES;
    public static final EnumC19990213Jk NANOSECONDS;
    public static final EnumC19990213Jk SECONDS;
    public final TimeUnit LL;

    public static InterfaceC2044707zh<EnumC19990213Jk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19990213Jk enumC19990213Jk = new EnumC19990213Jk("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        NANOSECONDS = enumC19990213Jk;
        EnumC19990213Jk enumC19990213Jk2 = new EnumC19990213Jk("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        MICROSECONDS = enumC19990213Jk2;
        EnumC19990213Jk enumC19990213Jk3 = new EnumC19990213Jk("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        MILLISECONDS = enumC19990213Jk3;
        EnumC19990213Jk enumC19990213Jk4 = new EnumC19990213Jk("SECONDS", 3, TimeUnit.SECONDS);
        SECONDS = enumC19990213Jk4;
        EnumC19990213Jk enumC19990213Jk5 = new EnumC19990213Jk("MINUTES", 4, TimeUnit.MINUTES);
        MINUTES = enumC19990213Jk5;
        EnumC19990213Jk enumC19990213Jk6 = new EnumC19990213Jk("HOURS", 5, TimeUnit.HOURS);
        HOURS = enumC19990213Jk6;
        EnumC19990213Jk enumC19990213Jk7 = new EnumC19990213Jk("DAYS", 6, TimeUnit.DAYS);
        DAYS = enumC19990213Jk7;
        EnumC19990213Jk[] enumC19990213JkArr = {enumC19990213Jk, enumC19990213Jk2, enumC19990213Jk3, enumC19990213Jk4, enumC19990213Jk5, enumC19990213Jk6, enumC19990213Jk7};
        LLILLJJLI = enumC19990213JkArr;
        LLILLL = new C2254308sP(enumC19990213JkArr);
    }

    public static EnumC19990213Jk[] values() {
        return (EnumC19990213Jk[]) LLILLJJLI.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.LL;
    }

    public static EnumC19990213Jk valueOf(String str) {
        return (EnumC19990213Jk) C08FF.LIZ(EnumC19990213Jk.class, str);
    }

    public EnumC19990213Jk(String str, int i, TimeUnit timeUnit) {
        this.LL = timeUnit;
    }
}
