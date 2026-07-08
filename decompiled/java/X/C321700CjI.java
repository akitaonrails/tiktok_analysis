package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveBotItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321700CjI implements InterfaceC0148002o {
    public final C291001Au<List<InterfaceC1467705op>> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final C321710CjJ LLIZ;
    public final boolean LLIZLLLIL;
    public final CommerceAgentActiveActionItem LLJ;
    public final boolean LLJI;
    public final CommerceAgentActiveBotItem LLJIJIL;

    public C321700CjI() {
        this(null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321700CjI)) {
            return false;
        }
        C321700CjI c321700CjI = (C321700CjI) obj;
        return Intrinsics.LJFF(this.LL, c321700CjI.LL) && this.LLILLJJLI == c321700CjI.LLILLJJLI && this.LLILLL == c321700CjI.LLILLL && Intrinsics.LJFF(this.LLILZ, c321700CjI.LLILZ) && this.LLILZIL == c321700CjI.LLILZIL && this.LLILZLL == c321700CjI.LLILZLL && Intrinsics.LJFF(this.LLIZ, c321700CjI.LLIZ) && this.LLIZLLLIL == c321700CjI.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c321700CjI.LLJ) && this.LLJI == c321700CjI.LLJI && Intrinsics.LJFF(this.LLJIJIL, c321700CjI.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        CommerceAgentActiveActionItem commerceAgentActiveActionItem = this.LLJ;
        int iHashCode2 = (((iHashCode + (commerceAgentActiveActionItem == null ? 0 : commerceAgentActiveActionItem.hashCode())) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        CommerceAgentActiveBotItem commerceAgentActiveBotItem = this.LLJIJIL;
        return iHashCode2 + (commerceAgentActiveBotItem != null ? commerceAgentActiveBotItem.hashCode() : 0);
    }

    public final String toString() {
        return "MessageRepoState(messages=" + this.LL + ", askStatus=" + this.LLILLJJLI + ", withAnimationToQuestion=" + this.LLILLL + ", conversationId=" + this.LLILZ + ", shouldShowDisclaimerMessage=" + this.LLILZIL + ", historyHasMore=" + this.LLILZLL + ", postProcessPayload=" + this.LLIZ + ", pauseStatus=" + this.LLIZLLLIL + ", activeActionItem=" + this.LLJ + ", hasUserAskQuestion=" + this.LLJI + ", activeBotItem=" + this.LLJIJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C321700CjI(C291001Au c291001Au, int i) {
        boolean z;
        String str;
        boolean z2;
        C291001Au c291001Au2 = (i & 1) != 0 ? new C291001Au(C13BV.INSTANCE) : c291001Au;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(c291001Au2, z, false, str, false, z2, (i & 64) != 0 ? new C321710CjJ(0) : null, false, null, false, null);
    }

    public static C321700CjI LIZ(C321700CjI c321700CjI, C291001Au c291001Au, boolean z, boolean z2, String str, boolean z3, boolean z4, C321710CjJ c321710CjJ, boolean z5, int i) {
        boolean z6;
        CommerceAgentActiveActionItem commerceAgentActiveActionItem;
        C321710CjJ c321710CjJ2 = c321710CjJ;
        boolean z7 = z4;
        boolean z8 = z3;
        String str2 = str;
        boolean z9 = z5;
        boolean z10 = z2;
        boolean z11 = z;
        C291001Au c291001Au2 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au2 = c321700CjI.LL;
        }
        if ((i & 2) != 0) {
            z11 = c321700CjI.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z10 = c321700CjI.LLILLL;
        }
        if ((i & 8) != 0) {
            str2 = c321700CjI.LLILZ;
        }
        if ((i & 16) != 0) {
            z8 = c321700CjI.LLILZIL;
        }
        if ((i & 32) != 0) {
            z7 = c321700CjI.LLILZLL;
        }
        if ((i & 64) != 0) {
            c321710CjJ2 = c321700CjI.LLIZ;
        }
        if ((i & 128) != 0) {
            z6 = c321700CjI.LLIZLLLIL;
        } else {
            z6 = false;
        }
        CommerceAgentActiveBotItem commerceAgentActiveBotItem = null;
        if ((i & 256) != 0) {
            commerceAgentActiveActionItem = c321700CjI.LLJ;
        } else {
            commerceAgentActiveActionItem = null;
        }
        if ((i & 512) != 0) {
            z9 = c321700CjI.LLJI;
        }
        if ((i & 1024) != 0) {
            commerceAgentActiveBotItem = c321700CjI.LLJIJIL;
        }
        c321700CjI.getClass();
        return new C321700CjI(c291001Au2, z11, z10, str2, z8, z7, c321710CjJ2, z6, commerceAgentActiveActionItem, z9, commerceAgentActiveBotItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C321700CjI(C291001Au<? extends List<? extends InterfaceC1467705op>> c291001Au, boolean z, boolean z2, String str, boolean z3, boolean z4, C321710CjJ c321710CjJ, boolean z5, CommerceAgentActiveActionItem commerceAgentActiveActionItem, boolean z6, CommerceAgentActiveBotItem commerceAgentActiveBotItem) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = c321710CjJ;
        this.LLIZLLLIL = z5;
        this.LLJ = commerceAgentActiveActionItem;
        this.LLJI = z6;
        this.LLJIJIL = commerceAgentActiveBotItem;
    }
}
