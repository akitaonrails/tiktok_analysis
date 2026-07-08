package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08LC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LC implements InterfaceC2011507uL {
    public final String LL;
    public final File LLILLJJLI;
    public final Effect LLILLL;
    public final Long LLILZ;
    public final boolean LLILZIL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LC)) {
            return false;
        }
        C08LC c08lc = (C08LC) obj;
        return Intrinsics.LJFF(this.LL, c08lc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c08lc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c08lc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c08lc.LLILZ) && this.LLILZIL == c08lc.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Long l = this.LLILZ;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowEffect(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imgFile=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", msgSentServerTime=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isShown=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08LC(String str, File file, Effect effect, Long l) {
        this.LL = str;
        this.LLILLJJLI = file;
        this.LLILLL = effect;
        this.LLILZ = l;
    }
}
