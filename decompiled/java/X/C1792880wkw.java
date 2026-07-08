package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792880wkw extends AbstractC1837220xuS {
    public final C1791770wj9 LLILZIL;
    public final String LLILZLL;

    public C1792880wkw() {
        this(null, null);
    }

    public final C1792880wkw copy(C1791770wj9 c1791770wj9, String str) {
        return new C1792880wkw(c1791770wj9, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1792880wkw)) {
            return false;
        }
        C1792880wkw c1792880wkw = (C1792880wkw) obj;
        return Intrinsics.LJFF(this.LLILZIL, c1792880wkw.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1792880wkw.LLILZLL);
    }

    public int hashCode() {
        C1791770wj9 c1791770wj9 = this.LLILZIL;
        int iHashCode = (c1791770wj9 == null ? 0 : c1791770wj9.hashCode()) * 31;
        String str = this.LLILZLL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreCheckError(iapPreCheckResult=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", msgDisplay=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1837200xuQ
    public int getErrorCode() {
        C0KQW c0kqw;
        EnumC1792020wjY enumC1792020wjY;
        C1791770wj9 c1791770wj9 = this.LLILZIL;
        if (c1791770wj9 == null || (c0kqw = c1791770wj9.LIZIZ) == null || (enumC1792020wjY = c0kqw.LIZ) == null) {
            return -999;
        }
        return enumC1792020wjY.getValue();
    }

    public final C1791770wj9 getIapPreCheckResult() {
        return this.LLILZIL;
    }

    public final String getMsgDisplay() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1837210xuR
    public EnumC1837330xud getStage() {
        return EnumC1837330xud.PRE_CHECK;
    }

    public C1792880wkw(C1791770wj9 c1791770wj9, String str) {
        C0KQW c0kqw;
        String str2;
        super((c1791770wj9 == null || (c0kqw = c1791770wj9.LIZIZ) == null || (str2 = c0kqw.LIZIZ) == null) ? "Payment pre-check failed" : str2, str, null);
        this.LLILZIL = c1791770wj9;
        this.LLILZLL = str;
    }
}
