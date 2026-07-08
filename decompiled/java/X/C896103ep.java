package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C896103ep implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final Object LLILLJJLI;
    public final Object LLILLL;
    public final C948003nC<String> LLILZ;
    public final Object LLILZIL;
    public final C948003nC<Pair<String, String>> LLILZLL;
    public final Object LLIZ;

    public C896103ep() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C896103ep)) {
            return false;
        }
        C896103ep c896103ep = (C896103ep) obj;
        return Intrinsics.LJFF(this.LL, c896103ep.LL) && Intrinsics.LJFF(this.LLILLJJLI, c896103ep.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c896103ep.LLILLL) && Intrinsics.LJFF(this.LLILZ, c896103ep.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c896103ep.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c896103ep.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c896103ep.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Object obj = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        C948003nC<String> c948003nC = this.LLILZ;
        int iHashCode4 = (((iHashCode3 + (c948003nC == null ? 0 : c948003nC.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        C948003nC<Pair<String, String>> c948003nC2 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c948003nC2 == null ? 0 : c948003nC2.hashCode())) * 31;
        Object obj3 = this.LLIZ;
        return iHashCode5 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ATMCardState(powerItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dismiss=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissAll=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", force=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showLearnMore=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", showSaveRetention=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C896103ep(int i) {
        this(new ArrayList(), null, null, null, new Object(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C896103ep(List<? extends InterfaceC1891350zJl> list, Object obj, Object obj2, C948003nC<String> c948003nC, Object obj3, C948003nC<Pair<String, String>> c948003nC2, Object obj4) {
        this.LL = list;
        this.LLILLJJLI = obj;
        this.LLILLL = obj2;
        this.LLILZ = c948003nC;
        this.LLILZIL = obj3;
        this.LLILZLL = c948003nC2;
        this.LLIZ = obj4;
    }

    public static C896103ep LIZ(C896103ep c896103ep, List list, Object obj, C948003nC c948003nC, Object obj2, C948003nC c948003nC2, Object obj3, int i) {
        Object obj4;
        Object obj5 = obj3;
        C948003nC c948003nC3 = c948003nC2;
        Object obj6 = obj2;
        C948003nC c948003nC4 = c948003nC;
        Object obj7 = obj;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c896103ep.LL;
        }
        if ((i & 2) != 0) {
            obj4 = c896103ep.LLILLJJLI;
        } else {
            obj4 = null;
        }
        if ((i & 4) != 0) {
            obj7 = c896103ep.LLILLL;
        }
        if ((i & 8) != 0) {
            c948003nC4 = c896103ep.LLILZ;
        }
        if ((i & 16) != 0) {
            obj6 = c896103ep.LLILZIL;
        }
        if ((i & 32) != 0) {
            c948003nC3 = c896103ep.LLILZLL;
        }
        if ((i & 64) != 0) {
            obj5 = c896103ep.LLIZ;
        }
        c896103ep.getClass();
        return new C896103ep(list2, obj4, obj7, c948003nC4, obj6, c948003nC3, obj5);
    }
}
