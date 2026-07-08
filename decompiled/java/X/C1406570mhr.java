package X;

import c1b.m;
import c1b.q0;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406570mhr implements InterfaceC1059904Cn {
    public final Video LL;
    public final boolean LLILLJJLI;
    public final m LLILLL;
    public String LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406570mhr)) {
            return false;
        }
        C1406570mhr c1406570mhr = (C1406570mhr) obj;
        return Intrinsics.LJFF(this.LL, c1406570mhr.LL) && this.LLILLJJLI == c1406570mhr.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1406570mhr.LLILLL);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        m mVar = this.LLILLL;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductVideoVO(video=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showViewMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", descStyle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILZIL;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLILZ = str;
    }

    public C1406570mhr(Video video, boolean z, m mVar) {
        this.LL = video;
        this.LLILLJJLI = z;
        this.LLILLL = mVar;
        this.LLILZ = "undefined";
        this.LLILZIL = EnumC1752690vi7.DESCRIPTION.getValue();
    }

    public /* synthetic */ C1406570mhr(Video video, q0 q0Var, int i) {
        this(video, false, (m) ((i & 4) != 0 ? null : q0Var));
    }
}
