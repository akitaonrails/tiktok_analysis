package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689600R3e implements InterfaceC1891350zJl {
    public final int LL;
    public final boolean LLILLJJLI;
    public final TakoVideoItem LLILLL;
    public final String LLILZ;
    public final Function2<Integer, View, Unit> LLILZIL;
    public final Integer LLILZLL;
    public final boolean LLIZ;
    public final C689590R3d LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689600R3e)) {
            return false;
        }
        C689600R3e c689600R3e = (C689600R3e) obj;
        return this.LL == c689600R3e.LL && this.LLILLJJLI == c689600R3e.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c689600R3e.LLILLL) && Intrinsics.LJFF(this.LLILZ, c689600R3e.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c689600R3e.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c689600R3e.LLILZLL) && this.LLIZ == c689600R3e.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c689600R3e.LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = ((((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        Function2<Integer, View, Unit> function2 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        C689590R3d c689590R3d = this.LLIZLLLIL;
        return iHashCode3 + (c689590R3d != null ? c689590R3d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showSup=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", placeholderSourceId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", itemClickCallback=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", showPlayIcon=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", videoComponentLocateInfo=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C689600R3e(int i, boolean z, TakoVideoItem takoVideoItem, String str, AwS624S0100000_10 awS624S0100000_10, Integer num, boolean z2, C689590R3d c689590R3d) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = takoVideoItem;
        this.LLILZ = str;
        this.LLILZIL = awS624S0100000_10;
        this.LLILZLL = num;
        this.LLIZ = z2;
        this.LLIZLLLIL = c689590R3d;
    }
}
