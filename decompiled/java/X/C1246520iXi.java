package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246520iXi implements InterfaceC1891350zJl {
    public final MusNotice LL;
    public final List<InterfaceC1906920zis> LLILLJJLI;
    public final int LLILLL;
    public final Function1<C1246520iXi, Unit> LLILZ;
    public final Function2<MusNotice, Boolean, Unit> LLILZIL;
    public final Function2<MusNotice, Function0<Unit>, Unit> LLILZLL;
    public final int LLIZ;
    public boolean LLIZLLLIL = true;

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31;
        Function1<C1246520iXi, Unit> function1 = this.LLILZ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function2<MusNotice, Boolean, Unit> function2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2<MusNotice, Function0<Unit>, Unit> function22 = this.LLILZLL;
        return ((iHashCode3 + (function22 != null ? function22.hashCode() : 0)) * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemNotificationItem(notice=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", interceptors=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clientOrder=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onDelete=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onSubscribeStateChange=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showWrapper=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", group=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1246520iXi) && Intrinsics.LJFF(interfaceC1891350zJl, this)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1246520iXi) {
            C1246520iXi c1246520iXi = (C1246520iXi) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1246520iXi.LL.nid, this.LL.nid) && c1246520iXi.LLIZ == this.LLIZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        C1246520iXi c1246520iXi;
        if (!super.equals(obj) || !(obj instanceof C1246520iXi) || (c1246520iXi = (C1246520iXi) obj) == null || this.LLIZLLLIL != c1246520iXi.LLIZLLLIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1246520iXi c1246520iXi;
        if (!(interfaceC1891350zJl instanceof C1246520iXi) || (c1246520iXi = (C1246520iXi) interfaceC1891350zJl) == null || !Intrinsics.LJFF(c1246520iXi.LL, this.LL) || c1246520iXi.LLIZLLLIL != this.LLIZLLLIL) {
            return null;
        }
        return new Object() { // from class: X.0iXj
        };
    }

    public static C1246520iXi LIZ(C1246520iXi c1246520iXi, MusNotice musNotice) {
        return new C1246520iXi(musNotice, c1246520iXi.LLILLJJLI, c1246520iXi.LLILLL, c1246520iXi.LLILZ, c1246520iXi.LLILZIL, c1246520iXi.LLILZLL, c1246520iXi.LLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1246520iXi(MusNotice musNotice, List<? extends InterfaceC1906920zis> list, int i, Function1<? super C1246520iXi, Unit> function1, Function2<? super MusNotice, ? super Boolean, Unit> function2, Function2<? super MusNotice, ? super Function0<Unit>, Unit> function22, int i2) {
        this.LL = musNotice;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = function1;
        this.LLILZIL = function2;
        this.LLILZLL = function22;
        this.LLIZ = i2;
    }
}
