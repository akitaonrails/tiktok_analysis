package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526100KkC {
    public final Function2<Integer, Integer, Unit> LIZ;
    public final Function1<TikTokMediaModel, Unit> LIZIZ;
    public final Function2<TikTokMediaModel, View, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C526100KkC)) {
            return false;
        }
        C526100KkC c526100KkC = (C526100KkC) obj;
        return Intrinsics.LJFF(this.LIZ, c526100KkC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c526100KkC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c526100KkC.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumBottomSelectionListAction(onSwapItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onDeleteItem=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClickItem=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C526100KkC(AwS587S0100000_8 awS587S0100000_8, AwS622S0100000_8 awS622S0100000_8, AwS622S0100000_8 awS622S0100000_82) {
        this.LIZ = awS622S0100000_8;
        this.LIZIZ = awS587S0100000_8;
        this.LIZJ = awS622S0100000_82;
    }
}
