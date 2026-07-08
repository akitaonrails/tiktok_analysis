package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1656620tDA {
    public static final /* synthetic */ EnumC1656620tDA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1656620tDA NOT_RECORDING;
    public static final EnumC1656620tDA RECORDING;
    public static final EnumC1656620tDA RECORD_FIRST_FRAME;
    public static final EnumC1656620tDA START_RECORD;
    public static final EnumC1656620tDA STOP_RECORD;
    public static final EnumC1656620tDA STOP_RECORD_COLLECTING;
    public static final EnumC1656620tDA STOP_RECORD_SUCCESS;
    public static final EnumC1656620tDA STOP_RECORD_UI;

    public static InterfaceC2044707zh<EnumC1656620tDA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1656620tDA enumC1656620tDA = new EnumC1656620tDA("NOT_RECORDING", 0);
        NOT_RECORDING = enumC1656620tDA;
        EnumC1656620tDA enumC1656620tDA2 = new EnumC1656620tDA("START_RECORD", 1);
        START_RECORD = enumC1656620tDA2;
        EnumC1656620tDA enumC1656620tDA3 = new EnumC1656620tDA(C1649000t0s.LLLJIL, 2);
        RECORDING = enumC1656620tDA3;
        EnumC1656620tDA enumC1656620tDA4 = new EnumC1656620tDA("RECORD_FIRST_FRAME", 3);
        RECORD_FIRST_FRAME = enumC1656620tDA4;
        EnumC1656620tDA enumC1656620tDA5 = new EnumC1656620tDA("STOP_RECORD_UI", 4);
        STOP_RECORD_UI = enumC1656620tDA5;
        EnumC1656620tDA enumC1656620tDA6 = new EnumC1656620tDA("STOP_RECORD_COLLECTING", 5);
        STOP_RECORD_COLLECTING = enumC1656620tDA6;
        EnumC1656620tDA enumC1656620tDA7 = new EnumC1656620tDA("STOP_RECORD", 6);
        STOP_RECORD = enumC1656620tDA7;
        EnumC1656620tDA enumC1656620tDA8 = new EnumC1656620tDA("STOP_RECORD_SUCCESS", 7);
        STOP_RECORD_SUCCESS = enumC1656620tDA8;
        EnumC1656620tDA[] enumC1656620tDAArr = {enumC1656620tDA, enumC1656620tDA2, enumC1656620tDA3, enumC1656620tDA4, enumC1656620tDA5, enumC1656620tDA6, enumC1656620tDA7, enumC1656620tDA8};
        LL = enumC1656620tDAArr;
        LLILLJJLI = new C2254308sP(enumC1656620tDAArr);
    }

    public static EnumC1656620tDA[] values() {
        return (EnumC1656620tDA[]) LL.clone();
    }

    public static EnumC1656620tDA valueOf(String str) {
        return (EnumC1656620tDA) C08FF.LIZ(EnumC1656620tDA.class, str);
    }

    public EnumC1656620tDA(String str, int i) {
    }
}
