package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ETp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC365230ETp {
    public static final EnumC365230ETp CLIP;
    public static final EnumC365230ETp CLIP_LEFT;
    public static final EnumC365230ETp CLIP_RIGHT;
    public static final EnumC365230ETp LINE;
    public static final /* synthetic */ EnumC365230ETp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC365230ETp NONE;

    public static InterfaceC2044707zh<EnumC365230ETp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC365230ETp enumC365230ETp = new EnumC365230ETp("NONE", 0);
        NONE = enumC365230ETp;
        EnumC365230ETp enumC365230ETp2 = new EnumC365230ETp("CLIP", 1);
        CLIP = enumC365230ETp2;
        EnumC365230ETp enumC365230ETp3 = new EnumC365230ETp("CLIP_LEFT", 2);
        CLIP_LEFT = enumC365230ETp3;
        EnumC365230ETp enumC365230ETp4 = new EnumC365230ETp("CLIP_RIGHT", 3);
        CLIP_RIGHT = enumC365230ETp4;
        EnumC365230ETp enumC365230ETp5 = new EnumC365230ETp("LINE", 4);
        LINE = enumC365230ETp5;
        EnumC365230ETp[] enumC365230ETpArr = {enumC365230ETp, enumC365230ETp2, enumC365230ETp3, enumC365230ETp4, enumC365230ETp5};
        LL = enumC365230ETpArr;
        LLILLJJLI = new C2254308sP(enumC365230ETpArr);
    }

    public static EnumC365230ETp[] values() {
        return (EnumC365230ETp[]) LL.clone();
    }

    public static EnumC365230ETp valueOf(String str) {
        return (EnumC365230ETp) C08FF.LIZ(EnumC365230ETp.class, str);
    }

    public EnumC365230ETp(String str, int i) {
    }
}
