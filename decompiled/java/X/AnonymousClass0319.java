package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0319, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0319 extends AbstractC756202xM {
    public final BonusModule LLILZLL;
    public final String LLIZ = "bonus_module";
    public final String LLIZLLLIL = "bonus_module_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0319) && Intrinsics.LJFF(this.LLILZLL, ((AnonymousClass0319) obj).LLILZLL);
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BonusInfoVO(bonusModule=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public AnonymousClass0319(BonusModule bonusModule) {
        this.LLILZLL = bonusModule;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(AnonymousClass0319.class, interfaceC1891350zJl.getClass());
    }
}
