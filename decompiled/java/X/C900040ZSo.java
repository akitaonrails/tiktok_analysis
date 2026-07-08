package X;

import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900040ZSo implements InterfaceC900060ZSq {
    public final String LL;
    public final DynamicCardTemplate LLILLJJLI;
    public final C0IB0 LLILLL;
    public final C462620ICe LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900040ZSo)) {
            return false;
        }
        C900040ZSo c900040ZSo = (C900040ZSo) obj;
        return Intrinsics.LJFF(this.LL, c900040ZSo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900040ZSo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900040ZSo.LLILLL) && Intrinsics.LJFF(this.LLILZ, c900040ZSo.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        DynamicCardTemplate dynamicCardTemplate = this.LLILLJJLI;
        return ((((iHashCode + (dynamicCardTemplate == null ? 0 : dynamicCardTemplate.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotDynamicCardData(selectedEffectId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dynamicCardTemplate=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", backgroundConfig=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC900060ZSq
    public final C462620ICe LIZJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC900060ZSq
    public final DynamicCardTemplate LJJLIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C900050ZSp.LIZ(this, interfaceC1891350zJl);
    }

    public C900040ZSo(String str, DynamicCardTemplate dynamicCardTemplate, C0IB0 c0ib0, C462620ICe c462620ICe) {
        this.LL = str;
        this.LLILLJJLI = dynamicCardTemplate;
        this.LLILLL = c0ib0;
        this.LLILZ = c462620ICe;
    }
}
