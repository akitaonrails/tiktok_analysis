package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017M<T> extends AbstractC401801hI<T> {
    public final List<LiveEffect> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C017M)) {
            return false;
        }
        C017M c017m = (C017M) obj;
        return Intrinsics.LJFF(this.LIZ, c017m.LIZ) && this.LIZIZ == c017m.LIZIZ && Intrinsics.LJFF(this.LIZJ, c017m.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchStickerList(effectList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", byNeedMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C017M(List<? extends LiveEffect> list, boolean z, String str) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
