package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779930wQ3 {
    public static final EnumC1779930wQ3 FIRST;
    public static final /* synthetic */ EnumC1779930wQ3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779930wQ3 SECOND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779930wQ3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779930wQ3 enumC1779930wQ3 = new EnumC1779930wQ3("FIRST", 0, 0);
        FIRST = enumC1779930wQ3;
        EnumC1779930wQ3 enumC1779930wQ32 = new EnumC1779930wQ3("SECOND", 1, 1);
        SECOND = enumC1779930wQ32;
        EnumC1779930wQ3[] enumC1779930wQ3Arr = {enumC1779930wQ3, enumC1779930wQ32};
        LLILLJJLI = enumC1779930wQ3Arr;
        LLILLL = new C2254308sP(enumC1779930wQ3Arr);
    }

    public static EnumC1779930wQ3[] values() {
        return (EnumC1779930wQ3[]) LLILLJJLI.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public static EnumC1779930wQ3 valueOf(String str) {
        return (EnumC1779930wQ3) C08FF.LIZ(EnumC1779930wQ3.class, str);
    }

    public EnumC1779930wQ3(String str, int i, int i2) {
        this.LL = i2;
    }
}
