package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562230M3h {
    public static final EnumC562230M3h EFFECT;
    public static final /* synthetic */ EnumC562230M3h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC562230M3h MUSIC;

    public static InterfaceC2044707zh<EnumC562230M3h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562230M3h enumC562230M3h = new EnumC562230M3h("EFFECT", 0);
        EFFECT = enumC562230M3h;
        EnumC562230M3h enumC562230M3h2 = new EnumC562230M3h("MUSIC", 1);
        MUSIC = enumC562230M3h2;
        EnumC562230M3h[] enumC562230M3hArr = {enumC562230M3h, enumC562230M3h2};
        LL = enumC562230M3hArr;
        LLILLJJLI = new C2254308sP(enumC562230M3hArr);
    }

    public static EnumC562230M3h[] values() {
        return (EnumC562230M3h[]) LL.clone();
    }

    public static EnumC562230M3h valueOf(String str) {
        return (EnumC562230M3h) C08FF.LIZ(EnumC562230M3h.class, str);
    }

    public EnumC562230M3h(String str, int i) {
    }
}
