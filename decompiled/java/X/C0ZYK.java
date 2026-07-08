package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZYK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZYK {
    public static final C0ZYK LLILLL;
    public static final C0ZYK LLILZ;
    public static final /* synthetic */ C0ZYK[] LLILZIL;
    public final int LL;
    public final boolean LLILLJJLI;

    static {
        C0ZYK c0zyk = new C0ZYK("PRIMARY", 0, R.attr.a1h, false);
        LLILLL = c0zyk;
        C0ZYK c0zyk2 = new C0ZYK("INVERSE", 1, R.attr.ee, true);
        LLILZ = c0zyk2;
        C0ZYK[] c0zykArr = {c0zyk, c0zyk2};
        LLILZIL = c0zykArr;
        new C2254308sP(c0zykArr);
    }

    public static C0ZYK[] values() {
        return (C0ZYK[]) LLILZIL.clone();
    }

    public static C0ZYK valueOf(String str) {
        return (C0ZYK) C08FF.LIZ(C0ZYK.class, str);
    }

    public C0ZYK(String str, int i, int i2, boolean z) {
        this.LL = i2;
        this.LLILLJJLI = z;
    }
}
