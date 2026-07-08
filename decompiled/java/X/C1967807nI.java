package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07nI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967807nI extends RuntimeException {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public String getMemberType() {
        return this.LLILLL;
    }

    public String getTargetClass() {
        return this.LL;
    }

    public String getTargetMember() {
        return this.LLILLJJLI;
    }

    public C1967807nI(String str) {
        this(str, null, new String[0]);
    }

    public C1967807nI(String str, Throwable th, String... strArr) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(str);
        if (strArr != null && strArr.length > 0) {
            sb.append(" [TargetClass: ");
            sb.append(strArr[0]);
            if (strArr.length > 1) {
                sb.append(", TargetMember: ");
                sb.append(strArr[1]);
            }
            if (strArr.length > 2) {
                sb.append(", MemberType: ");
                sb.append(strArr[2]);
            }
            sb.append(e3.f);
        }
        super(sb.toString(), th);
        if (strArr.length <= 0) {
            str2 = "unknown";
        } else {
            str2 = strArr[0];
        }
        this.LL = str2;
        if (strArr.length <= 1) {
            str3 = "unknown";
        } else {
            str3 = strArr[1];
        }
        this.LLILLJJLI = str3;
        this.LLILLL = strArr.length > 2 ? strArr[2] : "unknown";
    }
}
