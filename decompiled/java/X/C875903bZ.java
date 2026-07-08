package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C875903bZ {
    public final Context LIZ;
    public final C867003a8 LIZIZ;
    public final C876403be LIZJ;
    public final C877303bn LIZLLL;
    public final C876503bf LJ;
    public final Boolean LJFF;
    public final Function1<Boolean, Unit> LJI;
    public final Function1<List<PaymentMethod>, Unit> LJII;
    public final Function1<List<PaymentMethod>, Unit> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C875903bZ)) {
            return false;
        }
        C875903bZ c875903bZ = (C875903bZ) obj;
        return Intrinsics.LJFF(this.LIZ, c875903bZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c875903bZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c875903bZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c875903bZ.LIZLLL) && Intrinsics.LJFF(this.LJ, c875903bZ.LJ) && Intrinsics.LJFF(this.LJFF, c875903bZ.LJFF) && Intrinsics.LJFF(this.LJI, c875903bZ.LJI) && Intrinsics.LJFF(this.LJII, c875903bZ.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c875903bZ.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C876403be c876403be = this.LIZJ;
        int iHashCode2 = (((iHashCode + (c876403be == null ? 0 : c876403be.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        C876503bf c876503bf = this.LJ;
        int iHashCode3 = (iHashCode2 + (c876503bf == null ? 0 : c876503bf.hashCode())) * 31;
        Boolean bool = this.LJFF;
        return ((((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntryContext(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entryModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", guideContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackContext=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", remotePageContext=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", targetChecked=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onSwitchStateChanged=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onEnableAndAddSuccess=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", onOpenList=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C875903bZ(Context context, C867003a8 c867003a8, C876403be c876403be, C877303bn c877303bn, C876503bf c876503bf, Boolean bool, Function1<? super Boolean, Unit> function1, Function1<? super List<PaymentMethod>, Unit> function12, Function1<? super List<PaymentMethod>, Unit> function13) {
        this.LIZ = context;
        this.LIZIZ = c867003a8;
        this.LIZJ = c876403be;
        this.LIZLLL = c877303bn;
        this.LJ = c876503bf;
        this.LJFF = bool;
        this.LJI = function1;
        this.LJII = function12;
        this.LJIIIIZZ = function13;
    }
}
