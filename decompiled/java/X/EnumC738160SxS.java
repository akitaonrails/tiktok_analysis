package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC738160SxS {
    public static final /* synthetic */ EnumC738160SxS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC738160SxS ON_BIND;
    public static final EnumC738160SxS ON_CREATE;
    public static final EnumC738160SxS ON_CREATE_VIEW;
    public static final EnumC738160SxS ON_DESTROY;
    public static final EnumC738160SxS ON_PARENT_SET;
    public static final EnumC738160SxS ON_PAUSE;
    public static final EnumC738160SxS ON_RESUME;
    public static final EnumC738160SxS ON_START;
    public static final EnumC738160SxS ON_STOP;
    public static final EnumC738160SxS ON_UNBIND;
    public static final EnumC738160SxS ON_VIEW_CREATED;

    public static InterfaceC2044707zh<EnumC738160SxS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC738160SxS enumC738160SxS = new EnumC738160SxS("ON_PARENT_SET", 0);
        ON_PARENT_SET = enumC738160SxS;
        EnumC738160SxS enumC738160SxS2 = new EnumC738160SxS("ON_CREATE", 1);
        ON_CREATE = enumC738160SxS2;
        EnumC738160SxS enumC738160SxS3 = new EnumC738160SxS("ON_CREATE_VIEW", 2);
        ON_CREATE_VIEW = enumC738160SxS3;
        EnumC738160SxS enumC738160SxS4 = new EnumC738160SxS("ON_VIEW_CREATED", 3);
        ON_VIEW_CREATED = enumC738160SxS4;
        EnumC738160SxS enumC738160SxS5 = new EnumC738160SxS("ON_RESUME", 4);
        ON_RESUME = enumC738160SxS5;
        EnumC738160SxS enumC738160SxS6 = new EnumC738160SxS("ON_START", 5);
        ON_START = enumC738160SxS6;
        EnumC738160SxS enumC738160SxS7 = new EnumC738160SxS("ON_PAUSE", 6);
        ON_PAUSE = enumC738160SxS7;
        EnumC738160SxS enumC738160SxS8 = new EnumC738160SxS("ON_STOP", 7);
        ON_STOP = enumC738160SxS8;
        EnumC738160SxS enumC738160SxS9 = new EnumC738160SxS("ON_DESTROY", 8);
        ON_DESTROY = enumC738160SxS9;
        EnumC738160SxS enumC738160SxS10 = new EnumC738160SxS("ON_BIND", 9);
        ON_BIND = enumC738160SxS10;
        EnumC738160SxS enumC738160SxS11 = new EnumC738160SxS("ON_UNBIND", 10);
        ON_UNBIND = enumC738160SxS11;
        EnumC738160SxS[] enumC738160SxSArr = {enumC738160SxS, enumC738160SxS2, enumC738160SxS3, enumC738160SxS4, enumC738160SxS5, enumC738160SxS6, enumC738160SxS7, enumC738160SxS8, enumC738160SxS9, enumC738160SxS10, enumC738160SxS11};
        LL = enumC738160SxSArr;
        LLILLJJLI = new C2254308sP(enumC738160SxSArr);
    }

    public static EnumC738160SxS[] values() {
        return (EnumC738160SxS[]) LL.clone();
    }

    public static EnumC738160SxS valueOf(String str) {
        return (EnumC738160SxS) C08FF.LIZ(EnumC738160SxS.class, str);
    }

    public EnumC738160SxS(String str, int i) {
    }
}
