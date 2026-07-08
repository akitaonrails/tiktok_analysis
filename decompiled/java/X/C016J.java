package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016J {
    public static final C016J DIGITAL_0;
    public static final C016J DIGITAL_1;
    public static final C016J DIGITAL_NEG_1;
    public static final /* synthetic */ C016J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C016J> getEntries() {
        return LLILLL;
    }

    static {
        C016J c016j = new C016J("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = c016j;
        C016J c016j2 = new C016J("DIGITAL_1", 1, "1");
        DIGITAL_1 = c016j2;
        C016J c016j3 = new C016J("DIGITAL_NEG_1", 2, "-1");
        DIGITAL_NEG_1 = c016j3;
        C016J[] c016jArr = {c016j, c016j2, c016j3};
        LLILLJJLI = c016jArr;
        LLILLL = new C2254308sP(c016jArr);
    }

    public static C016J[] values() {
        return (C016J[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016J valueOf(String str) {
        return (C016J) C08FF.LIZ(C016J.class, str);
    }

    public C016J(String str, int i, String str2) {
        this.LL = str2;
    }
}
