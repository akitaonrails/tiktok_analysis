package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D77, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D77 extends Exception {
    public static final C0D78 Companion = new Object() { // from class: X.0D78
    };
    public final EnumC334020D7o LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean isAuthenticationFailed() {
        Integer num;
        return this.LL == EnumC334020D7o.JSON_RPC && (num = this.LLILLJJLI) != null && num.intValue() == -32000 && Intrinsics.LJFF(getMessage(), "AuthenticationFailed");
    }

    @Override // java.lang.Throwable
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.LLILLL;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append(']');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        String message = getMessage();
        if (message != null) {
            arrayList.add(message);
        }
        String str2 = this.LLILZIL;
        if (str2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("(path: ");
            sbLIZ2.append(str2);
            sbLIZ2.append(')');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!arrayList.isEmpty()) {
            return C13LP.LJJLIIIJ(arrayList, " ", null, null, 0, null, null, 62);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("UcpResponseError(");
        sbLIZ3.append(this.LL);
        sbLIZ3.append(')');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public final String getCode() {
        return this.LLILLL;
    }

    public final EnumC334020D7o getKind() {
        return this.LL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILZ;
    }

    public final String getPath() {
        return this.LLILZIL;
    }

    public final Integer getRpcCode() {
        return this.LLILLJJLI;
    }

    public C0D77(EnumC334020D7o enumC334020D7o, Integer num, String str, String str2, String str3, Throwable th) {
        super(str2, th);
        this.LL = enumC334020D7o;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }
}
