package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016I, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016I {
    public static final C016I DIGITAL_0;
    public static final C016I DIGITAL_1;
    public static final C016I DIGITAL_NEG_1;
    public static final /* synthetic */ C016I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C016I> getEntries() {
        return LLILLL;
    }

    static {
        C016I c016i = new C016I("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = c016i;
        C016I c016i2 = new C016I("DIGITAL_1", 1, "1");
        DIGITAL_1 = c016i2;
        C016I c016i3 = new C016I("DIGITAL_NEG_1", 2, "-1");
        DIGITAL_NEG_1 = c016i3;
        C016I[] c016iArr = {c016i, c016i2, c016i3};
        LLILLJJLI = c016iArr;
        LLILLL = new C2254308sP(c016iArr);
    }

    public static C016I[] values() {
        return (C016I[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016I valueOf(String str) {
        return (C016I) C08FF.LIZ(C016I.class, str);
    }

    public C016I(String str, int i, String str2) {
        this.LL = str2;
    }
}
