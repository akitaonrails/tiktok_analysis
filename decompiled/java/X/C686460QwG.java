package X;

import kotlin.jvm.internal.AFwS293S0000000_10;

/* JADX INFO: renamed from: X.0QwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686460QwG implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final EnumC686550QwP LLIZ;

    @Override // X.C0PWT
    public final boolean isLog() {
        return false;
    }

    static {
        C0Q3E.LJFF().cP2().LIZIZ(C13LE.LIZ(C686460QwG.class), AFwS293S0000000_10.get$arr$(33));
    }

    public C686460QwG(int i, EnumC686550QwP enumC686550QwP, String str, String str2, String str3, String str4, String str5, String str6) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = enumC686550QwP;
    }
}
