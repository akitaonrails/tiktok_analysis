package X;

import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Z8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Z8 implements InterfaceC0148002o {
    public final String LL;
    public final BlockStruct LLILLJJLI;
    public final Exception LLILLL;
    public final int LLILZ;

    public C09Z8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09Z8)) {
            return false;
        }
        C09Z8 c09z8 = (C09Z8) obj;
        return Intrinsics.LJFF(this.LL, c09z8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c09z8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c09z8.LLILLL) && this.LLILZ == c09z8.LLILZ;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BlockStruct blockStruct = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (blockStruct == null ? 0 : blockStruct.hashCode())) * 31;
        Exception exc = this.LLILLL;
        return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileBlockState(blockUserID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", blockStruct=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", blockSource=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C09Z8(int i) {
        this(null, null, null, 0);
    }

    public C09Z8(String str, BlockStruct blockStruct, Exception exc, int i) {
        this.LL = str;
        this.LLILLJJLI = blockStruct;
        this.LLILLL = exc;
        this.LLILZ = i;
    }

    public static C09Z8 LIZ(C09Z8 c09z8, String str, BlockStruct blockStruct, Exception exc, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = c09z8.LL;
        }
        if ((i2 & 2) != 0) {
            blockStruct = c09z8.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            exc = c09z8.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i = c09z8.LLILZ;
        }
        c09z8.getClass();
        return new C09Z8(str, blockStruct, exc, i);
    }
}
