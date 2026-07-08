package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792870wkv extends AbstractC1837220xuS {
    public final C518080KTm LLILZIL;
    public final C0KQW LLILZLL;
    public final String LLIZ;

    public C1792870wkv() {
        this(null, null, null);
    }

    public final C1792870wkv copy(C518080KTm c518080KTm, C0KQW c0kqw, String str) {
        return new C1792870wkv(c518080KTm, c0kqw, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1792870wkv)) {
            return false;
        }
        C1792870wkv c1792870wkv = (C1792870wkv) obj;
        return Intrinsics.LJFF(this.LLILZIL, c1792870wkv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1792870wkv.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1792870wkv.LLIZ);
    }

    public int hashCode() {
        C518080KTm c518080KTm = this.LLILZIL;
        int iHashCode = (c518080KTm == null ? 0 : c518080KTm.hashCode()) * 31;
        C0KQW c0kqw = this.LLILZLL;
        int iHashCode2 = (iHashCode + (c0kqw == null ? 0 : c0kqw.hashCode())) * 31;
        String str = this.LLIZ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GpProductFetchError(v1Error=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", v2Error=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", msgDisplay=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getDetailCode() {
        C518080KTm c518080KTm = this.LLILZIL;
        if (c518080KTm != null) {
            return c518080KTm.LIZJ;
        }
        return -999;
    }

    @Override // X.AbstractC1837200xuQ
    public int getErrorCode() {
        Integer num;
        EnumC1792020wjY enumC1792020wjY;
        C0KQW c0kqw = this.LLILZLL;
        if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
            return enumC1792020wjY.getValue();
        }
        C518080KTm c518080KTm = this.LLILZIL;
        if (c518080KTm == null || (num = c518080KTm.LJIIIIZZ) == null) {
            return -999;
        }
        return num.intValue();
    }

    public final String getMsgDisplay() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1837210xuR
    public EnumC1837330xud getStage() {
        return EnumC1837330xud.GP_PRODUCT_FETCH;
    }

    public final C518080KTm getV1Error() {
        return this.LLILZIL;
    }

    public final C0KQW getV2Error() {
        return this.LLILZLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1792870wkv(C518080KTm c518080KTm, C0KQW c0kqw, String str) {
        String str2;
        if (c0kqw == null || (str2 = c0kqw.LIZIZ) == null) {
            if (c518080KTm != null) {
                str2 = c518080KTm.LJFF;
            } else {
                str2 = "Google Play product fetch failed";
            }
        }
        super(str2, str, null);
        this.LLILZIL = c518080KTm;
        this.LLILZLL = c0kqw;
        this.LLIZ = str;
    }
}
