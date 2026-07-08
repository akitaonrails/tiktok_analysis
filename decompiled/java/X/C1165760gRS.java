package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165760gRS implements InterfaceC636340Oxc<C1165760gRS, C1166800gT8> {
    public final C627660Ojc<C1166800gT8> LL;
    public final C291001Au<Aweme> LLILLJJLI;
    public final C291001Au<Aweme> LLILLL;
    public final boolean LLILZ;
    public final MixStruct LLILZIL;
    public final Integer LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165760gRS)) {
            return false;
        }
        C1165760gRS c1165760gRS = (C1165760gRS) obj;
        return Intrinsics.LJFF(this.LL, c1165760gRS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1165760gRS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1165760gRS.LLILLL) && this.LLILZ == c1165760gRS.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1165760gRS.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1165760gRS.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Aweme> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Aweme> c291001Au2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        MixStruct mixStruct = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (mixStruct == null ? 0 : mixStruct.hashCode())) * 31;
        Integer num = this.LLILZLL;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistConsumptionState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectVideoChange=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentAweme=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", openBottomDialog=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", playlistDetail=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", videoRequestStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1166800gT8> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1166800gT8> getListState() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1165760gRS(C627660Ojc<C1166800gT8> c627660Ojc, C291001Au<? extends Aweme> c291001Au, C291001Au<? extends Aweme> c291001Au2, boolean z, MixStruct mixStruct, Integer num) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = z;
        this.LLILZIL = mixStruct;
        this.LLILZLL = num;
    }

    public static C1165760gRS LIZ(C1165760gRS c1165760gRS, C627660Ojc c627660Ojc, C291001Au c291001Au, C291001Au c291001Au2, boolean z, MixStruct mixStruct, Integer num, int i) {
        Integer num2 = num;
        MixStruct mixStruct2 = mixStruct;
        boolean z2 = z;
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1165760gRS.LL;
        }
        if ((i & 2) != 0) {
            c291001Au4 = c1165760gRS.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c1165760gRS.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1165760gRS.LLILZ;
        }
        if ((i & 16) != 0) {
            mixStruct2 = c1165760gRS.LLILZIL;
        }
        if ((i & 32) != 0) {
            num2 = c1165760gRS.LLILZLL;
        }
        c1165760gRS.getClass();
        return new C1165760gRS(c627660Ojc2, c291001Au4, c291001Au3, z2, mixStruct2, num2);
    }
}
