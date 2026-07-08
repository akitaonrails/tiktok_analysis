package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016H {
    public static final C016H DIGITAL_0;
    public static final C016H DIGITAL_1;
    public static final C016H DIGITAL_NEG_1;
    public static final /* synthetic */ C016H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C016H> getEntries() {
        return LLILLL;
    }

    static {
        C016H c016h = new C016H("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = c016h;
        C016H c016h2 = new C016H("DIGITAL_1", 1, "1");
        DIGITAL_1 = c016h2;
        C016H c016h3 = new C016H("DIGITAL_NEG_1", 2, "-1");
        DIGITAL_NEG_1 = c016h3;
        C016H[] c016hArr = {c016h, c016h2, c016h3};
        LLILLJJLI = c016hArr;
        LLILLL = new C2254308sP(c016hArr);
    }

    public static C016H[] values() {
        return (C016H[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016H valueOf(String str) {
        return (C016H) C08FF.LIZ(C016H.class, str);
    }

    public C016H(String str, int i, String str2) {
        this.LL = str2;
    }
}
