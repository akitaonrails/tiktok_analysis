package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1476080oVy {
    public static final C1476070oVx Companion;
    public static final EnumC1476080oVy FirstMemoryThenDisk;
    public static final EnumC1476080oVy FromDisk;
    public static final EnumC1476080oVy FromMemory;
    public static final /* synthetic */ EnumC1476080oVy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1476080oVy> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0oVx] */
    static {
        EnumC1476080oVy enumC1476080oVy = new EnumC1476080oVy("FromMemory", 0);
        FromMemory = enumC1476080oVy;
        EnumC1476080oVy enumC1476080oVy2 = new EnumC1476080oVy("FromDisk", 1);
        FromDisk = enumC1476080oVy2;
        EnumC1476080oVy enumC1476080oVy3 = new EnumC1476080oVy("FirstMemoryThenDisk", 2);
        FirstMemoryThenDisk = enumC1476080oVy3;
        EnumC1476080oVy[] enumC1476080oVyArr = {enumC1476080oVy, enumC1476080oVy2, enumC1476080oVy3};
        LL = enumC1476080oVyArr;
        LLILLJJLI = new C2254308sP(enumC1476080oVyArr);
        Companion = new Object() { // from class: X.0oVx
        };
    }

    public static EnumC1476080oVy[] values() {
        return (EnumC1476080oVy[]) LL.clone();
    }

    public static final EnumC1476080oVy valueOf(int i) {
        Companion.getClass();
        if (i != 1) {
            if (i != 2) {
                return FromMemory;
            }
            return FirstMemoryThenDisk;
        }
        return FromDisk;
    }

    public static EnumC1476080oVy valueOf(String str) {
        return (EnumC1476080oVy) C08FF.LIZ(EnumC1476080oVy.class, str);
    }

    public EnumC1476080oVy(String str, int i) {
    }
}
