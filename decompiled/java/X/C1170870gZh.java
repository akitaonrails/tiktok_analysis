package X;

import android.view.View;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170870gZh implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final CollaborativeUserInfo LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;
    public final Function1<View, Unit> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170870gZh)) {
            return false;
        }
        C1170870gZh c1170870gZh = (C1170870gZh) obj;
        return Intrinsics.LJFF(this.LL, c1170870gZh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1170870gZh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1170870gZh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1170870gZh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1170870gZh.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1170870gZh.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1170870gZh.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        CollaborativeUserInfo collaborativeUserInfo = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (collaborativeUserInfo == null ? 0 : collaborativeUserInfo.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        Integer num = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LLIZ;
        return iHashCode4 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollaborativeCollectionListHierarchyData(authorNickName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", collaborativeUserInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", conversationID=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", statusViewTopMarginDp=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onStatusViewReady=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1170870gZh(String str, String str2, String str3, CollaborativeUserInfo collaborativeUserInfo, String str4, Integer num, Function1<? super View, Unit> function1) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = collaborativeUserInfo;
        this.LLILZIL = str4;
        this.LLILZLL = num;
        this.LLIZ = function1;
    }
}
