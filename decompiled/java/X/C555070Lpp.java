package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS94S0201000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555070Lpp implements InterfaceC1891350zJl {
    public final MentionDataItem LL;
    public final C555080Lpq LLILLJJLI;
    public final C0GYU LLILLL;
    public final Function1<MentionDataItem, Unit> LLILZ;
    public final Function1<MentionDataItem, Unit> LLILZIL;
    public final Function1<MentionDataItem, Unit> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555070Lpp)) {
            return false;
        }
        C555070Lpp c555070Lpp = (C555070Lpp) obj;
        return Intrinsics.LJFF(this.LL, c555070Lpp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c555070Lpp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c555070Lpp.LLILLL) && Intrinsics.LJFF(this.LLILZ, c555070Lpp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c555070Lpp.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c555070Lpp.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C555080Lpq c555080Lpq = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c555080Lpq == null ? 0 : c555080Lpq.hashCode())) * 31;
        C0GYU c0gyu = this.LLILLL;
        return ((((((iHashCode2 + (c0gyu != null ? c0gyu.hashCode() : 0)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionPanelUiItem(mentionDataItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", circleLoadingViewConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", clickMentionCallback=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", clickInviteCallback=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onExpose=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C555070Lpp) {
            C555070Lpp c555070Lpp = (C555070Lpp) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c555070Lpp.LL, this.LL) && Intrinsics.LJFF(c555070Lpp.LL.progress, this.LL.progress) && Intrinsics.LJFF(c555070Lpp.LL.permissionResult, this.LL.permissionResult) && Intrinsics.LJFF(c555070Lpp.LL.invited, this.LL.invited)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C555070Lpp) && Intrinsics.LJFF(((C555070Lpp) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    public C555070Lpp(MentionDataItem mentionDataItem, C555080Lpq c555080Lpq, C0GYU c0gyu, AwS94S0201000_8 awS94S0201000_8, AwS94S0201000_8 awS94S0201000_82, AwS116S0101000_8 awS116S0101000_8) {
        this.LL = mentionDataItem;
        this.LLILLJJLI = c555080Lpq;
        this.LLILLL = c0gyu;
        this.LLILZ = awS94S0201000_8;
        this.LLILZIL = awS94S0201000_82;
        this.LLILZLL = awS116S0101000_8;
    }
}
