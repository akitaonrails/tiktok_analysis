package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1718480uow {
    public static final EnumC1718480uow CANCEL;
    public static final EnumC1718480uow ERROR;
    public static final /* synthetic */ EnumC1718480uow[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1718480uow SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1718480uow> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1718480uow enumC1718480uow = new EnumC1718480uow("CANCEL", 0, 0);
        CANCEL = enumC1718480uow;
        EnumC1718480uow enumC1718480uow2 = new EnumC1718480uow("SUCCESS", 1, 1);
        SUCCESS = enumC1718480uow2;
        EnumC1718480uow enumC1718480uow3 = new EnumC1718480uow("ERROR", 2, 2);
        ERROR = enumC1718480uow3;
        EnumC1718480uow[] enumC1718480uowArr = {enumC1718480uow, enumC1718480uow2, enumC1718480uow3};
        LLILLJJLI = enumC1718480uowArr;
        LLILLL = new C2254308sP(enumC1718480uowArr);
    }

    public static EnumC1718480uow[] values() {
        return (EnumC1718480uow[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1718480uow valueOf(String str) {
        return (EnumC1718480uow) C08FF.LIZ(EnumC1718480uow.class, str);
    }

    public EnumC1718480uow(String str, int i, int i2) {
        this.LL = i2;
    }
}
