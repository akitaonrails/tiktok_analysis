package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC856530Xit {
    public static final EnumC856530Xit AUDIO_FADEOUT;
    public static final EnumC856530Xit AUDIO_LOOP;
    public static final /* synthetic */ EnumC856530Xit[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC856530Xit> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC856530Xit enumC856530Xit = new EnumC856530Xit("AUDIO_FADEOUT", 0);
        AUDIO_FADEOUT = enumC856530Xit;
        EnumC856530Xit enumC856530Xit2 = new EnumC856530Xit("AUDIO_LOOP", 1);
        AUDIO_LOOP = enumC856530Xit2;
        EnumC856530Xit[] enumC856530XitArr = {enumC856530Xit, enumC856530Xit2};
        LL = enumC856530XitArr;
        LLILLJJLI = new C2254308sP(enumC856530XitArr);
    }

    public static EnumC856530Xit[] values() {
        return (EnumC856530Xit[]) LL.clone();
    }

    public static EnumC856530Xit valueOf(String str) {
        return (EnumC856530Xit) C08FF.LIZ(EnumC856530Xit.class, str);
    }

    public EnumC856530Xit(String str, int i) {
    }
}
