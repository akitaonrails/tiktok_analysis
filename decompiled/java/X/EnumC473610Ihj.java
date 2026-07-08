package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ihj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC473610Ihj {
    public static final /* synthetic */ EnumC473610Ihj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC473610Ihj STATE_CLOSE;
    public static final EnumC473610Ihj STATE_DESTROY;
    public static final EnumC473610Ihj STATE_INIT;
    public static final EnumC473610Ihj STATE_SHOW;

    public static InterfaceC2044707zh<EnumC473610Ihj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC473610Ihj enumC473610Ihj = new EnumC473610Ihj("STATE_INIT", 0);
        STATE_INIT = enumC473610Ihj;
        EnumC473610Ihj enumC473610Ihj2 = new EnumC473610Ihj("STATE_SHOW", 1);
        STATE_SHOW = enumC473610Ihj2;
        EnumC473610Ihj enumC473610Ihj3 = new EnumC473610Ihj("STATE_CLOSE", 2);
        STATE_CLOSE = enumC473610Ihj3;
        EnumC473610Ihj enumC473610Ihj4 = new EnumC473610Ihj("STATE_DESTROY", 3);
        STATE_DESTROY = enumC473610Ihj4;
        EnumC473610Ihj[] enumC473610IhjArr = {enumC473610Ihj, enumC473610Ihj2, enumC473610Ihj3, enumC473610Ihj4};
        LL = enumC473610IhjArr;
        LLILLJJLI = new C2254308sP(enumC473610IhjArr);
    }

    public static EnumC473610Ihj[] values() {
        return (EnumC473610Ihj[]) LL.clone();
    }

    public static EnumC473610Ihj valueOf(String str) {
        return (EnumC473610Ihj) C08FF.LIZ(EnumC473610Ihj.class, str);
    }

    public EnumC473610Ihj(String str, int i) {
    }
}
