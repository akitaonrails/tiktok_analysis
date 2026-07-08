package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1201320hMo {
    public static final EnumC1201320hMo GPS;
    public static final /* synthetic */ EnumC1201320hMo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1201320hMo PROMOTE_PRECISE_GPS;

    public static InterfaceC2044707zh<EnumC1201320hMo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1201320hMo enumC1201320hMo = new EnumC1201320hMo("GPS", 0);
        GPS = enumC1201320hMo;
        EnumC1201320hMo enumC1201320hMo2 = new EnumC1201320hMo("PROMOTE_PRECISE_GPS", 1);
        PROMOTE_PRECISE_GPS = enumC1201320hMo2;
        EnumC1201320hMo[] enumC1201320hMoArr = {enumC1201320hMo, enumC1201320hMo2};
        LL = enumC1201320hMoArr;
        LLILLJJLI = new C2254308sP(enumC1201320hMoArr);
    }

    public static EnumC1201320hMo[] values() {
        return (EnumC1201320hMo[]) LL.clone();
    }

    public static EnumC1201320hMo valueOf(String str) {
        return (EnumC1201320hMo) C08FF.LIZ(EnumC1201320hMo.class, str);
    }

    public EnumC1201320hMo(String str, int i) {
    }
}
