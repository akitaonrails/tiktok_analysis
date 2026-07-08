package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356080Dxe {
    public static final EnumC356080Dxe ADDED;
    public static final EnumC356080Dxe CANCEL;
    public static final EnumC356080Dxe CLIP_DONE;
    public static final EnumC356080Dxe DONE;
    public static final EnumC356080Dxe ERROR;
    public static final EnumC356080Dxe IDLE;
    public static final EnumC356080Dxe INTERACTIVE_MASK;
    public static final /* synthetic */ EnumC356080Dxe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356080Dxe PROGRESS;
    public static final EnumC356080Dxe REMOVED;
    public static final EnumC356080Dxe START;

    public static InterfaceC2044707zh<EnumC356080Dxe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356080Dxe enumC356080Dxe = new EnumC356080Dxe("IDLE", 0);
        IDLE = enumC356080Dxe;
        EnumC356080Dxe enumC356080Dxe2 = new EnumC356080Dxe("ERROR", 1);
        ERROR = enumC356080Dxe2;
        EnumC356080Dxe enumC356080Dxe3 = new EnumC356080Dxe("CANCEL", 2);
        CANCEL = enumC356080Dxe3;
        EnumC356080Dxe enumC356080Dxe4 = new EnumC356080Dxe("REMOVED", 3);
        REMOVED = enumC356080Dxe4;
        EnumC356080Dxe enumC356080Dxe5 = new EnumC356080Dxe("ADDED", 4);
        ADDED = enumC356080Dxe5;
        EnumC356080Dxe enumC356080Dxe6 = new EnumC356080Dxe("START", 5);
        START = enumC356080Dxe6;
        EnumC356080Dxe enumC356080Dxe7 = new EnumC356080Dxe("INTERACTIVE_MASK", 6);
        INTERACTIVE_MASK = enumC356080Dxe7;
        EnumC356080Dxe enumC356080Dxe8 = new EnumC356080Dxe("PROGRESS", 7);
        PROGRESS = enumC356080Dxe8;
        EnumC356080Dxe enumC356080Dxe9 = new EnumC356080Dxe("CLIP_DONE", 8);
        CLIP_DONE = enumC356080Dxe9;
        EnumC356080Dxe enumC356080Dxe10 = new EnumC356080Dxe("DONE", 9);
        DONE = enumC356080Dxe10;
        EnumC356080Dxe[] enumC356080DxeArr = {enumC356080Dxe, enumC356080Dxe2, enumC356080Dxe3, enumC356080Dxe4, enumC356080Dxe5, enumC356080Dxe6, enumC356080Dxe7, enumC356080Dxe8, enumC356080Dxe9, enumC356080Dxe10};
        LL = enumC356080DxeArr;
        LLILLJJLI = new C2254308sP(enumC356080DxeArr);
    }

    public static EnumC356080Dxe[] values() {
        return (EnumC356080Dxe[]) LL.clone();
    }

    public static EnumC356080Dxe valueOf(String str) {
        return (EnumC356080Dxe) C08FF.LIZ(EnumC356080Dxe.class, str);
    }

    public EnumC356080Dxe(String str, int i) {
    }
}
