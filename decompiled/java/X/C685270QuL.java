package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685270QuL implements InterfaceC685300QuO {
    public final Template LIZ;
    public final Template LIZIZ;
    public final ViewGroup LIZJ;
    public final View LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C685270QuL)) {
            return false;
        }
        C685270QuL c685270QuL = (C685270QuL) obj;
        return Intrinsics.LJFF(this.LIZ, c685270QuL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c685270QuL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c685270QuL.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c685270QuL.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Template template = this.LIZIZ;
        int iHashCode2 = (iHashCode + (template == null ? 0 : template.hashCode())) * 31;
        ViewGroup viewGroup = this.LIZJ;
        return ((iHashCode2 + (viewGroup != null ? viewGroup.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchNimbleLayoutNode(template=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", parentTemplate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", parentLayout=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", container=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC685300QuO
    public final View LJIJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC685300QuO
    public final Template LLJJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC685300QuO
    public final ViewGroup LLJJI() {
        return this.LIZJ;
    }

    public C685270QuL(Template template, Template template2, ViewGroup viewGroup, ConstraintLayout constraintLayout) {
        this.LIZ = template;
        this.LIZIZ = template2;
        this.LIZJ = viewGroup;
        this.LIZLLL = constraintLayout;
    }
}
