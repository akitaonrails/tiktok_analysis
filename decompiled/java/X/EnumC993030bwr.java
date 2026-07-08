package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993030bwr {
    public static final EnumC993030bwr BoundReached;
    public static final EnumC993030bwr Finished;
    public static final /* synthetic */ EnumC993030bwr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993030bwr> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC993030bwr valueOf(String str) {
        return (EnumC993030bwr) C08FF.LIZ(EnumC993030bwr.class, str);
    }

    public static EnumC993030bwr[] values() {
        return (EnumC993030bwr[]) LL.clone();
    }

    static {
        EnumC993030bwr enumC993030bwr = new EnumC993030bwr("BoundReached", 0);
        BoundReached = enumC993030bwr;
        EnumC993030bwr enumC993030bwr2 = new EnumC993030bwr("Finished", 1);
        Finished = enumC993030bwr2;
        EnumC993030bwr[] enumC993030bwrArr = {enumC993030bwr, enumC993030bwr2};
        LL = enumC993030bwrArr;
        LLILLJJLI = new C2254308sP(enumC993030bwrArr);
    }

    public EnumC993030bwr(String str, int i) {
    }
}
