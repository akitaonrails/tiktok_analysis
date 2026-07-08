package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685280QuM implements InterfaceC685300QuO {
    public final Template LIZ;
    public final Template LIZIZ;
    public final ViewGroup LIZJ;
    public final View LIZLLL;
    public final C13IQ<? extends ReusedUISlotAssem<?>> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C685280QuM)) {
            return false;
        }
        C685280QuM c685280QuM = (C685280QuM) obj;
        return Intrinsics.LJFF(this.LIZ, c685280QuM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c685280QuM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c685280QuM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c685280QuM.LIZLLL) && Intrinsics.LJFF(this.LJ, c685280QuM.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Template template = this.LIZIZ;
        int iHashCode2 = (iHashCode + (template == null ? 0 : template.hashCode())) * 31;
        ViewGroup viewGroup = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (viewGroup == null ? 0 : viewGroup.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        C13IQ<? extends ReusedUISlotAssem<?>> c13iq = this.LJ;
        return iHashCode3 + (c13iq != null ? c13iq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchNimbleComponentNode(template=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", parentTemplate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", parentLayout=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", container=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", component=");
        sbLIZ.append(this.LJ);
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

    public C685280QuM(Template template, Template template2, ViewGroup viewGroup, View view, C19719912Dl c19719912Dl) {
        this.LIZ = template;
        this.LIZIZ = template2;
        this.LIZJ = viewGroup;
        this.LIZLLL = view;
        this.LJ = c19719912Dl;
    }
}
