package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1027, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1027 {
    public static final AnonymousClass1027 ALL;
    public static final AnonymousClass1027 CONTENT_CHECK;
    public static final AnonymousClass1027 GENERIC;
    public static final /* synthetic */ AnonymousClass1027[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final AnonymousClass1027 MODERATION;
    public static final AnonymousClass1027 PROHIBITED;
    public static final AnonymousClass1027 RESTRICTED;

    public static InterfaceC2044707zh<AnonymousClass1027> getEntries() {
        return LLILLJJLI;
    }

    static {
        AnonymousClass1027 anonymousClass1027 = new AnonymousClass1027("ALL", 0);
        ALL = anonymousClass1027;
        AnonymousClass1027 anonymousClass10272 = new AnonymousClass1027("CONTENT_CHECK", 1);
        CONTENT_CHECK = anonymousClass10272;
        AnonymousClass1027 anonymousClass10273 = new AnonymousClass1027("PROHIBITED", 2);
        PROHIBITED = anonymousClass10273;
        AnonymousClass1027 anonymousClass10274 = new AnonymousClass1027("GENERIC", 3);
        GENERIC = anonymousClass10274;
        AnonymousClass1027 anonymousClass10275 = new AnonymousClass1027("MODERATION", 4);
        MODERATION = anonymousClass10275;
        AnonymousClass1027 anonymousClass10276 = new AnonymousClass1027("RESTRICTED", 5);
        RESTRICTED = anonymousClass10276;
        AnonymousClass1027[] anonymousClass1027Arr = {anonymousClass1027, anonymousClass10272, anonymousClass10273, anonymousClass10274, anonymousClass10275, anonymousClass10276};
        LL = anonymousClass1027Arr;
        LLILLJJLI = new C2254308sP(anonymousClass1027Arr);
    }

    public static AnonymousClass1027[] values() {
        return (AnonymousClass1027[]) LL.clone();
    }

    public static AnonymousClass1027 valueOf(String str) {
        return (AnonymousClass1027) C08FF.LIZ(AnonymousClass1027.class, str);
    }

    public AnonymousClass1027(String str, int i) {
    }
}
