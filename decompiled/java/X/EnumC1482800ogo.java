package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ogo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1482800ogo {
    public static final EnumC1482800ogo INS;
    public static final /* synthetic */ EnumC1482800ogo[] LLILLJJLI;
    public InterfaceC1479620obg LL;

    static {
        EnumC1482800ogo enumC1482800ogo = new EnumC1482800ogo();
        INS = enumC1482800ogo;
        LLILLJJLI = new EnumC1482800ogo[]{enumC1482800ogo};
    }

    public static EnumC1482800ogo[] values() {
        return (EnumC1482800ogo[]) LLILLJJLI.clone();
    }

    public InterfaceC1479620obg getPreRenderingItem() {
        return this.LL;
    }

    public static EnumC1482800ogo valueOf(String str) {
        return (EnumC1482800ogo) C08FF.LIZ(EnumC1482800ogo.class, str);
    }

    public void setPreRenderingItem(InterfaceC1479620obg interfaceC1479620obg) {
        this.LL = interfaceC1479620obg;
    }
}
