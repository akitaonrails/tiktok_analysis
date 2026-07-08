package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC334480D9i {
    public static final EnumC334480D9i BUSINESS_ESCALATION;
    public static final EnumC334480D9i BUSINESS_FIXABLE;
    public static final EnumC334480D9i COMPLETED;
    public static final /* synthetic */ EnumC334480D9i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC334480D9i READY_FOR_COMPLETE;
    public static final EnumC334480D9i SYSTEM_ERROR;

    public static InterfaceC2044707zh<EnumC334480D9i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC334480D9i enumC334480D9i = new EnumC334480D9i("SYSTEM_ERROR", 0);
        SYSTEM_ERROR = enumC334480D9i;
        EnumC334480D9i enumC334480D9i2 = new EnumC334480D9i("BUSINESS_FIXABLE", 1);
        BUSINESS_FIXABLE = enumC334480D9i2;
        EnumC334480D9i enumC334480D9i3 = new EnumC334480D9i("BUSINESS_ESCALATION", 2);
        BUSINESS_ESCALATION = enumC334480D9i3;
        EnumC334480D9i enumC334480D9i4 = new EnumC334480D9i("READY_FOR_COMPLETE", 3);
        READY_FOR_COMPLETE = enumC334480D9i4;
        EnumC334480D9i enumC334480D9i5 = new EnumC334480D9i("COMPLETED", 4);
        COMPLETED = enumC334480D9i5;
        EnumC334480D9i[] enumC334480D9iArr = {enumC334480D9i, enumC334480D9i2, enumC334480D9i3, enumC334480D9i4, enumC334480D9i5};
        LL = enumC334480D9iArr;
        LLILLJJLI = new C2254308sP(enumC334480D9iArr);
    }

    public static EnumC334480D9i[] values() {
        return (EnumC334480D9i[]) LL.clone();
    }

    public static EnumC334480D9i valueOf(String str) {
        return (EnumC334480D9i) C08FF.LIZ(EnumC334480D9i.class, str);
    }

    public EnumC334480D9i(String str, int i) {
    }
}
