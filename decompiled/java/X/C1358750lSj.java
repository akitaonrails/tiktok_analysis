package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358750lSj implements InterfaceC0148002o {
    public final Unit LL;
    public final List<InterfaceC1891350zJl> LLILLJJLI;
    public final UpvoteList LLILLL;
    public final C1358520lSM LLILZ;
    public final C1358760lSk LLILZIL;

    public C1358750lSj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1358750lSj)) {
            return false;
        }
        C1358750lSj c1358750lSj = (C1358750lSj) obj;
        return Intrinsics.LJFF(this.LL, c1358750lSj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1358750lSj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1358750lSj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1358750lSj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1358750lSj.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<InterfaceC1891350zJl> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UpvoteList upvoteList = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (upvoteList == null ? 0 : upvoteList.hashCode())) * 31;
        C1358520lSM c1358520lSM = this.LLILZ;
        return ((iHashCode3 + (c1358520lSM != null ? c1358520lSM.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostPanelState(unit=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", curUpvote=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", titleState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", buttonState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1358750lSj(int i) {
        this(Unit.LIZ, null, null, new C1358520lSM(0), new C1358760lSk(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1358750lSj(Unit unit, List<? extends InterfaceC1891350zJl> list, UpvoteList upvoteList, C1358520lSM c1358520lSM, C1358760lSk c1358760lSk) {
        this.LL = unit;
        this.LLILLJJLI = list;
        this.LLILLL = upvoteList;
        this.LLILZ = c1358520lSM;
        this.LLILZIL = c1358760lSk;
    }

    public static C1358750lSj LIZ(C1358750lSj c1358750lSj, List list, UpvoteList upvoteList, C1358520lSM c1358520lSM, C1358760lSk c1358760lSk, int i) {
        Unit unit;
        C1358760lSk c1358760lSk2 = c1358760lSk;
        C1358520lSM c1358520lSM2 = c1358520lSM;
        UpvoteList upvoteList2 = upvoteList;
        List list2 = list;
        if ((i & 1) != 0) {
            unit = c1358750lSj.LL;
        } else {
            unit = null;
        }
        if ((i & 2) != 0) {
            list2 = c1358750lSj.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            upvoteList2 = c1358750lSj.LLILLL;
        }
        if ((i & 8) != 0) {
            c1358520lSM2 = c1358750lSj.LLILZ;
        }
        if ((i & 16) != 0) {
            c1358760lSk2 = c1358750lSj.LLILZIL;
        }
        c1358750lSj.getClass();
        return new C1358750lSj(unit, list2, upvoteList2, c1358520lSM2, c1358760lSk2);
    }
}
