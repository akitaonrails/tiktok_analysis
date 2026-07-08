package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC857403Wq {
    public static final /* synthetic */ EnumC857403Wq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC857403Wq RENDER_USBONUS_POPUP_TIP;
    public final int LL = 3;

    public static InterfaceC2044707zh<EnumC857403Wq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC857403Wq enumC857403Wq = new EnumC857403Wq();
        RENDER_USBONUS_POPUP_TIP = enumC857403Wq;
        EnumC857403Wq[] enumC857403WqArr = {enumC857403Wq};
        LLILLJJLI = enumC857403WqArr;
        LLILLL = new C2254308sP(enumC857403WqArr);
    }

    public static EnumC857403Wq[] values() {
        return (EnumC857403Wq[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC857403Wq valueOf(String str) {
        return (EnumC857403Wq) C08FF.LIZ(EnumC857403Wq.class, str);
    }
}
