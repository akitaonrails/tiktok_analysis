package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LNF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LNF<AWEME_DRAFT> {
    public final Function0<Boolean> LIZ;
    public final Function1<Context, String> LIZIZ;
    public final InterfaceC1631620sYq<Context, CreativeModel, AIGCDraft, Unit> LIZJ;
    public final InterfaceC1631620sYq<Context, AIGCDraft, AWEME_DRAFT, Unit> LIZLLL;
    public final InterfaceC1631620sYq<Context, AIGCDraft, InterfaceC1364105Vn<? super Unit>, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LNF)) {
            return false;
        }
        C0LNF c0lnf = (C0LNF) obj;
        return Intrinsics.LJFF(this.LIZ, c0lnf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lnf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lnf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lnf.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lnf.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC1631620sYq<Context, CreativeModel, AIGCDraft, Unit> interfaceC1631620sYq = this.LIZJ;
        int iHashCode2 = (iHashCode + (interfaceC1631620sYq == null ? 0 : interfaceC1631620sYq.hashCode())) * 31;
        InterfaceC1631620sYq<Context, AIGCDraft, AWEME_DRAFT, Unit> interfaceC1631620sYq2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (interfaceC1631620sYq2 == null ? 0 : interfaceC1631620sYq2.hashCode())) * 31;
        InterfaceC1631620sYq<Context, AIGCDraft, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq3 = this.LJ;
        return iHashCode3 + (interfaceC1631620sYq3 != null ? interfaceC1631620sYq3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigateConfig(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", disableHintText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", generationFailureNavigation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", draftNavigation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", contentNavigation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LNF(Function0<Boolean> function0, Function1<? super Context, String> function1, InterfaceC1631620sYq<? super Context, ? super CreativeModel, ? super AIGCDraft, Unit> interfaceC1631620sYq, InterfaceC1631620sYq<? super Context, ? super AIGCDraft, ? super AWEME_DRAFT, Unit> interfaceC1631620sYq2, InterfaceC1631620sYq<? super Context, ? super AIGCDraft, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq3) {
        this.LIZ = function0;
        this.LIZIZ = function1;
        this.LIZJ = interfaceC1631620sYq;
        this.LIZLLL = interfaceC1631620sYq2;
        this.LJ = interfaceC1631620sYq3;
    }
}
