package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992160bvS {
    public static final /* synthetic */ EnumC992160bvS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992160bvS PUBLISH_OPTIONS;
    public static final EnumC992160bvS PUBLISH_UI;

    public static InterfaceC2044707zh<EnumC992160bvS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992160bvS enumC992160bvS = new EnumC992160bvS("PUBLISH_UI", 0);
        PUBLISH_UI = enumC992160bvS;
        EnumC992160bvS enumC992160bvS2 = new EnumC992160bvS("PUBLISH_OPTIONS", 1);
        PUBLISH_OPTIONS = enumC992160bvS2;
        EnumC992160bvS[] enumC992160bvSArr = {enumC992160bvS, enumC992160bvS2};
        LL = enumC992160bvSArr;
        LLILLJJLI = new C2254308sP(enumC992160bvSArr);
    }

    public static EnumC992160bvS[] values() {
        return (EnumC992160bvS[]) LL.clone();
    }

    public static EnumC992160bvS valueOf(String str) {
        return (EnumC992160bvS) C08FF.LIZ(EnumC992160bvS.class, str);
    }

    public EnumC992160bvS(String str, int i) {
    }
}
