package X;

import com.bytedance.android.live.base.model.HashtagResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819630xS5 implements InterfaceC636340Oxc<C1819630xS5, C0230005s> {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final HashtagResponse LLILLL;
    public final C0URY LLILZ;
    public final C627660Ojc<C0230005s> LLILZIL;

    public C1819630xS5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1819630xS5)) {
            return false;
        }
        C1819630xS5 c1819630xS5 = (C1819630xS5) obj;
        return this.LL == c1819630xS5.LL && this.LLILLJJLI == c1819630xS5.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1819630xS5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1819630xS5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1819630xS5.LLILZIL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        HashtagResponse hashtagResponse = this.LLILLL;
        int iHashCode = (iZ2 + (hashtagResponse == null ? 0 : hashtagResponse.hashCode())) * 31;
        C0URY c0ury = this.LLILZ;
        return ((iHashCode + (c0ury != null ? c0ury.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameTopicListState(resultEmpty=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isError=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hashtagResponse=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C0230005s> getListItemState() {
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
    public final C627660Ojc<C0230005s> getListState() {
        return this.LLILZIL;
    }

    public /* synthetic */ C1819630xS5(int i) {
        this(false, false, null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1819630xS5(boolean z, boolean z2, HashtagResponse hashtagResponse, C0URY c0ury, C627660Ojc<C0230005s> c627660Ojc) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = hashtagResponse;
        this.LLILZ = c0ury;
        this.LLILZIL = c627660Ojc;
    }

    public static C1819630xS5 LIZ(C1819630xS5 c1819630xS5, boolean z, boolean z2, HashtagResponse hashtagResponse, C0URY c0ury, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C0URY c0ury2 = c0ury;
        HashtagResponse hashtagResponse2 = hashtagResponse;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c1819630xS5.LL;
        }
        if ((i & 2) != 0) {
            z3 = c1819630xS5.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            hashtagResponse2 = c1819630xS5.LLILLL;
        }
        if ((i & 8) != 0) {
            c0ury2 = c1819630xS5.LLILZ;
        }
        if ((i & 16) != 0) {
            c627660Ojc2 = c1819630xS5.LLILZIL;
        }
        c1819630xS5.getClass();
        return new C1819630xS5(z4, z3, hashtagResponse2, c0ury2, c627660Ojc2);
    }
}
