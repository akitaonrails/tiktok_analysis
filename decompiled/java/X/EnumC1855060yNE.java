package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855060yNE {
    public static final EnumC1855060yNE ACTIVE_SEND;
    public static final EnumC1855060yNE ACTIVE_SEND_WITH_VOICE_ICON;
    public static final EnumC1855060yNE EMPTY;
    public static final /* synthetic */ EnumC1855060yNE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855060yNE NOT_ACTIVE_SEND;
    public static final EnumC1855060yNE STOP;
    public static final EnumC1855060yNE VOICE_TALK_V2;

    public static InterfaceC2044707zh<EnumC1855060yNE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855060yNE enumC1855060yNE = new EnumC1855060yNE("EMPTY", 0);
        EMPTY = enumC1855060yNE;
        EnumC1855060yNE enumC1855060yNE2 = new EnumC1855060yNE("NOT_ACTIVE_SEND", 1);
        NOT_ACTIVE_SEND = enumC1855060yNE2;
        EnumC1855060yNE enumC1855060yNE3 = new EnumC1855060yNE("STOP", 2);
        STOP = enumC1855060yNE3;
        EnumC1855060yNE enumC1855060yNE4 = new EnumC1855060yNE("ACTIVE_SEND", 3);
        ACTIVE_SEND = enumC1855060yNE4;
        EnumC1855060yNE enumC1855060yNE5 = new EnumC1855060yNE("ACTIVE_SEND_WITH_VOICE_ICON", 4);
        ACTIVE_SEND_WITH_VOICE_ICON = enumC1855060yNE5;
        EnumC1855060yNE enumC1855060yNE6 = new EnumC1855060yNE("VOICE_TALK_V2", 5);
        VOICE_TALK_V2 = enumC1855060yNE6;
        EnumC1855060yNE[] enumC1855060yNEArr = {enumC1855060yNE, enumC1855060yNE2, enumC1855060yNE3, enumC1855060yNE4, enumC1855060yNE5, enumC1855060yNE6};
        LL = enumC1855060yNEArr;
        LLILLJJLI = new C2254308sP(enumC1855060yNEArr);
    }

    public static EnumC1855060yNE[] values() {
        return (EnumC1855060yNE[]) LL.clone();
    }

    public static EnumC1855060yNE valueOf(String str) {
        return (EnumC1855060yNE) C08FF.LIZ(EnumC1855060yNE.class, str);
    }

    public EnumC1855060yNE(String str, int i) {
    }
}
