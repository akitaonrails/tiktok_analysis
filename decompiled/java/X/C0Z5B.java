package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z5B, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5B {
    public static final C0Z5A Companion;
    public static final C0Z5B DISABLED;
    public static final C0Z5B ENABLED;
    public static final /* synthetic */ C0Z5B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0Z5B NOT_QUALIFIED;
    public static final C01GW<Map<String, C0Z5B>> map$delegate;
    public final String LL;

    public static InterfaceC2044707zh<C0Z5B> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Z5A] */
    static {
        C0Z5B c0z5b = new C0Z5B("NOT_QUALIFIED", 0, "");
        NOT_QUALIFIED = c0z5b;
        C0Z5B c0z5b2 = new C0Z5B("DISABLED", 1, CardStruct.IStatusCode.DEFAULT);
        DISABLED = c0z5b2;
        C0Z5B c0z5b3 = new C0Z5B("ENABLED", 2, "1");
        ENABLED = c0z5b3;
        C0Z5B[] c0z5bArr = {c0z5b, c0z5b2, c0z5b3};
        LLILLJJLI = c0z5bArr;
        LLILLL = new C2254308sP(c0z5bArr);
        Companion = new Object() { // from class: X.0Z5A
        };
        map$delegate = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(590));
    }

    public static C0Z5B[] values() {
        return (C0Z5B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0Z5B valueOf(String str) {
        return (C0Z5B) C08FF.LIZ(C0Z5B.class, str);
    }

    public C0Z5B(String str, int i, String str2) {
        this.LL = str2;
    }
}
