package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09EN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EN {
    public static final C09EN LL;
    public static final C09EN LLILLJJLI;
    public static final C09EN LLILLL;
    public static final /* synthetic */ C09EN[] LLILZ;

    static {
        C09EN c09en = new C09EN("Start", 0);
        LL = c09en;
        C09EN c09en2 = new C09EN("ManifestStartLeft", 1);
        LLILLJJLI = c09en2;
        C09EN c09en3 = new C09EN("ManifestStartRight", 2);
        LLILLL = c09en3;
        C09EN[] c09enArr = {c09en, c09en2, c09en3};
        LLILZ = c09enArr;
        new C2254308sP(c09enArr);
    }

    public static C09EN[] values() {
        return (C09EN[]) LLILZ.clone();
    }

    public static C09EN valueOf(String str) {
        return (C09EN) C08FF.LIZ(C09EN.class, str);
    }

    public C09EN(String str, int i) {
    }
}
