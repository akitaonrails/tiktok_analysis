package X;

import com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsData;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.UpdateSettingState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xMR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816130xMR implements InterfaceC0148002o {
    public final AbstractC1623806Xk<AnchorReplaySettingsData> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final AbstractC1623806Xk<Boolean> LLILLL;
    public final AbstractC1623806Xk<Long> LLILZ;
    public final C291001Au<UpdateSettingState> LLILZIL;
    public final AbstractC1623806Xk<Boolean> LLILZLL;
    public final AbstractC1623806Xk<Long> LLIZ;
    public final AbstractC1623806Xk<EnumC1813530xIF> LLIZLLLIL;
    public final AbstractC1623806Xk<C1814380xJc> LLJ;

    public C1816130xMR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1816130xMR)) {
            return false;
        }
        C1816130xMR c1816130xMR = (C1816130xMR) obj;
        return Intrinsics.LJFF(this.LL, c1816130xMR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1816130xMR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1816130xMR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1816130xMR.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1816130xMR.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1816130xMR.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1816130xMR.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1816130xMR.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1816130xMR.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        C291001Au<UpdateSettingState> c291001Au = this.LLILZIL;
        return ((((((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveReplySettingState(resultList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shareToGuestsResult=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", authorizedModeratorCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", updateSettingState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", setRecordResult=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", autoPostLivingResult=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", autoPostVisibilityResult=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showAutoPostPanelResult=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1816130xMR(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh, c491101vh, null, c491101vh, c491101vh, c491101vh, c491101vh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1816130xMR(AbstractC1623806Xk<AnchorReplaySettingsData> abstractC1623806Xk, AbstractC1623806Xk<Boolean> abstractC1623806Xk2, AbstractC1623806Xk<Boolean> abstractC1623806Xk3, AbstractC1623806Xk<Long> abstractC1623806Xk4, C291001Au<UpdateSettingState> c291001Au, AbstractC1623806Xk<Boolean> abstractC1623806Xk5, AbstractC1623806Xk<Long> abstractC1623806Xk6, AbstractC1623806Xk<? extends EnumC1813530xIF> abstractC1623806Xk7, AbstractC1623806Xk<C1814380xJc> abstractC1623806Xk8) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = abstractC1623806Xk4;
        this.LLILZIL = c291001Au;
        this.LLILZLL = abstractC1623806Xk5;
        this.LLIZ = abstractC1623806Xk6;
        this.LLIZLLLIL = abstractC1623806Xk7;
        this.LLJ = abstractC1623806Xk8;
    }

    public static C1816130xMR LIZ(C1816130xMR c1816130xMR, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C491001vg c491001vg, C1623606Xi c1623606Xi, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk3, AbstractC1623806Xk abstractC1623806Xk4, C1623606Xi c1623606Xi2, int i) {
        AbstractC1623806Xk<Boolean> abstractC1623806Xk5;
        AbstractC1623806Xk<C1814380xJc> abstractC1623806Xk6 = c1623606Xi2;
        AbstractC1623806Xk abstractC1623806Xk7 = abstractC1623806Xk4;
        AbstractC1623806Xk abstractC1623806Xk8 = abstractC1623806Xk3;
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk<Long> abstractC1623806Xk9 = c1623606Xi;
        AbstractC1623806Xk<Boolean> abstractC1623806Xk10 = c491001vg;
        AbstractC1623806Xk abstractC1623806Xk11 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk12 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk12 = c1816130xMR.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk11 = c1816130xMR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk10 = c1816130xMR.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk9 = c1816130xMR.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1816130xMR.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk5 = c1816130xMR.LLILZLL;
        } else {
            abstractC1623806Xk5 = null;
        }
        if ((i & 64) != 0) {
            abstractC1623806Xk8 = c1816130xMR.LLIZ;
        }
        if ((i & 128) != 0) {
            abstractC1623806Xk7 = c1816130xMR.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            abstractC1623806Xk6 = c1816130xMR.LLJ;
        }
        c1816130xMR.getClass();
        return new C1816130xMR(abstractC1623806Xk12, abstractC1623806Xk11, abstractC1623806Xk10, abstractC1623806Xk9, c291001Au2, abstractC1623806Xk5, abstractC1623806Xk8, abstractC1623806Xk7, abstractC1623806Xk6);
    }
}
