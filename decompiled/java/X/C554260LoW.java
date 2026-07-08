package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554260LoW implements InterfaceC1891350zJl {
    public final MentionDataItem LL;
    public final Boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final Function1<MentionDataItem, Unit> LLILZIL;
    public final Function1<MentionDataItem, Unit> LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Boolean bool = this.LLILLJJLI;
        int iHashCode2 = (((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionUIItem(dataItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSkeletonLoadingView=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", followChangeable=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onExpose=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", bottomDefaultText=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isFollowPath=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C554260LoW) {
            C554260LoW c554260LoW = (C554260LoW) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c554260LoW.LL) && this.LLILLL == c554260LoW.LLILLL && this.LLILZ == c554260LoW.LLILZ && Intrinsics.LJFF(this.LL.progress, c554260LoW.LL.progress) && Intrinsics.LJFF(this.LL.invited, c554260LoW.LL.invited) && Intrinsics.LJFF(this.LLILLJJLI, c554260LoW.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C554260LoW) && Intrinsics.LJFF(this.LL, ((C554260LoW) interfaceC1891350zJl).LL)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        if ((obj instanceof InterfaceC1891350zJl) && (interfaceC1891350zJl = (InterfaceC1891350zJl) obj) != null) {
            return areItemTheSame(interfaceC1891350zJl);
        }
        return false;
    }

    public static C554260LoW LIZ(C554260LoW c554260LoW, MentionDataItem mentionDataItem, Boolean bool, int i) {
        boolean z;
        boolean z2;
        Function1<MentionDataItem, Unit> function1;
        Function1<MentionDataItem, Unit> function12;
        boolean z3;
        Boolean bool2 = bool;
        MentionDataItem mentionDataItem2 = mentionDataItem;
        if ((i & 1) != 0) {
            mentionDataItem2 = c554260LoW.LL;
        }
        if ((i & 2) != 0) {
            bool2 = c554260LoW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c554260LoW.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = c554260LoW.LLILZ;
        } else {
            z2 = false;
        }
        String str = null;
        if ((i & 16) != 0) {
            function1 = c554260LoW.LLILZIL;
        } else {
            function1 = null;
        }
        if ((i & 32) != 0) {
            function12 = c554260LoW.LLILZLL;
        } else {
            function12 = null;
        }
        if ((i & 64) != 0) {
            str = c554260LoW.LLIZ;
        }
        if ((i & 128) != 0) {
            z3 = c554260LoW.LLIZLLLIL;
        } else {
            z3 = false;
        }
        return new C554260LoW(mentionDataItem2, bool2, z, z2, function1, function12, str, z3);
    }

    public /* synthetic */ C554260LoW(MentionDataItem mentionDataItem, Boolean bool, boolean z, boolean z2, Function1 function1, Function1 function12, boolean z3, int i) {
        this(mentionDataItem, (i & 2) != 0 ? Boolean.TRUE : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (Function1<? super MentionDataItem, Unit>) function1, (Function1<? super MentionDataItem, Unit>) function12, (String) null, (i & 128) != 0 ? false : z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C554260LoW(MentionDataItem mentionDataItem, Boolean bool, boolean z, boolean z2, Function1<? super MentionDataItem, Unit> function1, Function1<? super MentionDataItem, Unit> function12, String str, boolean z3) {
        this.LL = mentionDataItem;
        this.LLILLJJLI = bool;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = str;
        this.LLIZLLLIL = z3;
    }
}
