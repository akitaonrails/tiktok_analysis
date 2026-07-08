package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ze1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1903910ze1 {
    public static final /* synthetic */ EnumC1903910ze1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1903910ze1 ON_ACTIVITY_CREATED;
    public static final EnumC1903910ze1 ON_ATTACH;
    public static final EnumC1903910ze1 ON_CREATE;
    public static final EnumC1903910ze1 ON_CREATE_VIEW;
    public static final EnumC1903910ze1 ON_DESTROY;
    public static final EnumC1903910ze1 ON_DESTROY_VIEW;
    public static final EnumC1903910ze1 ON_DETACH;
    public static final EnumC1903910ze1 ON_PAUSE;
    public static final EnumC1903910ze1 ON_RESUME;
    public static final EnumC1903910ze1 ON_START;
    public static final EnumC1903910ze1 ON_STOP;
    public static final EnumC1903910ze1 ON_VIEW_CREATED;

    public static InterfaceC2044707zh<EnumC1903910ze1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1903910ze1 enumC1903910ze1 = new EnumC1903910ze1("ON_ATTACH", 0);
        ON_ATTACH = enumC1903910ze1;
        EnumC1903910ze1 enumC1903910ze12 = new EnumC1903910ze1("ON_CREATE", 1);
        ON_CREATE = enumC1903910ze12;
        EnumC1903910ze1 enumC1903910ze13 = new EnumC1903910ze1("ON_CREATE_VIEW", 2);
        ON_CREATE_VIEW = enumC1903910ze13;
        EnumC1903910ze1 enumC1903910ze14 = new EnumC1903910ze1("ON_VIEW_CREATED", 3);
        ON_VIEW_CREATED = enumC1903910ze14;
        EnumC1903910ze1 enumC1903910ze15 = new EnumC1903910ze1("ON_ACTIVITY_CREATED", 4);
        ON_ACTIVITY_CREATED = enumC1903910ze15;
        EnumC1903910ze1 enumC1903910ze16 = new EnumC1903910ze1("ON_START", 5);
        ON_START = enumC1903910ze16;
        EnumC1903910ze1 enumC1903910ze17 = new EnumC1903910ze1("ON_RESUME", 6);
        ON_RESUME = enumC1903910ze17;
        EnumC1903910ze1 enumC1903910ze18 = new EnumC1903910ze1("ON_PAUSE", 7);
        ON_PAUSE = enumC1903910ze18;
        EnumC1903910ze1 enumC1903910ze19 = new EnumC1903910ze1("ON_STOP", 8);
        ON_STOP = enumC1903910ze19;
        EnumC1903910ze1 enumC1903910ze110 = new EnumC1903910ze1("ON_DESTROY_VIEW", 9);
        ON_DESTROY_VIEW = enumC1903910ze110;
        EnumC1903910ze1 enumC1903910ze111 = new EnumC1903910ze1("ON_DESTROY", 10);
        ON_DESTROY = enumC1903910ze111;
        EnumC1903910ze1 enumC1903910ze112 = new EnumC1903910ze1("ON_DETACH", 11);
        ON_DETACH = enumC1903910ze112;
        EnumC1903910ze1[] enumC1903910ze1Arr = {enumC1903910ze1, enumC1903910ze12, enumC1903910ze13, enumC1903910ze14, enumC1903910ze15, enumC1903910ze16, enumC1903910ze17, enumC1903910ze18, enumC1903910ze19, enumC1903910ze110, enumC1903910ze111, enumC1903910ze112};
        LL = enumC1903910ze1Arr;
        LLILLJJLI = new C2254308sP(enumC1903910ze1Arr);
    }

    public static EnumC1903910ze1[] values() {
        return (EnumC1903910ze1[]) LL.clone();
    }

    public static EnumC1903910ze1 valueOf(String str) {
        return (EnumC1903910ze1) C08FF.LIZ(EnumC1903910ze1.class, str);
    }

    public EnumC1903910ze1(String str, int i) {
    }
}
