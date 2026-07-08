package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4F {
    public static final C0N4F FAILED;
    public static final /* synthetic */ C0N4F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4F SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<C0N4F> getEntries() {
        return LLILLL;
    }

    static {
        C0N4F c0n4f = new C0N4F("FAILED", 0, CardStruct.IStatusCode.DEFAULT);
        FAILED = c0n4f;
        C0N4F c0n4f2 = new C0N4F("SUCCESS", 1, "1");
        SUCCESS = c0n4f2;
        C0N4F[] c0n4fArr = {c0n4f, c0n4f2};
        LLILLJJLI = c0n4fArr;
        LLILLL = new C2254308sP(c0n4fArr);
    }

    public static C0N4F[] values() {
        return (C0N4F[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N4F valueOf(String str) {
        return (C0N4F) C08FF.LIZ(C0N4F.class, str);
    }

    public C0N4F(String str, int i, String str2) {
        this.LL = str2;
    }
}
