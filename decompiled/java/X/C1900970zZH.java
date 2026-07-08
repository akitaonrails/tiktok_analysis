package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900970zZH implements InterfaceC1891350zJl, InterfaceC1890700zIi {
    public final MusNotice LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final List<InterfaceC1906920zis> LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final C1242270iQr LLJ;
    public final C1901230zZh LLJI;
    public final String LLJIJIL;
    public final Function1<MusNotice, Unit> LLJILJIL;
    public final Function1<MusNotice, Unit> LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public final Map<String, String> LLJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900970zZH)) {
            return false;
        }
        C1900970zZH c1900970zZH = (C1900970zZH) obj;
        return Intrinsics.LJFF(this.LL, c1900970zZH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1900970zZH.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1900970zZH.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1900970zZH.LLILZ) && this.LLILZIL == c1900970zZH.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1900970zZH.LLILZLL) && this.LLIZ == c1900970zZH.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1900970zZH.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1900970zZH.LLJ) && Intrinsics.LJFF(this.LLJI, c1900970zZH.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1900970zZH.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1900970zZH.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1900970zZH.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1900970zZH.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1900970zZH.LLJJ);
    }

    public final String toString() {
        return "TemplateNotificationItem(notice=" + this.LL + ", timelineType=" + this.LLILLJJLI + ", tabName=" + this.LLILLL + ", enterFrom=" + this.LLILZ + ", isAggregatePage=" + this.LLILZIL + ", templateInterceptors=" + this.LLILZLL + ", handleUnread=" + this.LLIZ + ", pageName=" + this.LLIZLLLIL + ", searchInfo=" + this.LLJ + ", creatorInfo=" + this.LLJI + ", itemBtmPrefix=" + this.LLJIJIL + ", onDelete=" + this.LLJILJIL + ", onLongCLick=" + this.LLJILJILJ + ", preLoadMore=" + this.LLJILLL + ", extraMap=" + this.LLJJ + ')';
    }

    public final int hashCode() {
        Integer numLJIIJJI;
        String str = this.LL.nid;
        if (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
            return 0;
        }
        return numLJIIJJI.intValue();
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notice_");
        sbLIZ.append(this.LL.nid);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C0ZBC.LIZIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1900970zZH c1900970zZH;
        MusNotice musNotice = this.LL;
        MusNotice musNotice2 = null;
        if ((interfaceC1891350zJl instanceof C1900970zZH) && (c1900970zZH = (C1900970zZH) interfaceC1891350zJl) != null) {
            musNotice2 = c1900970zZH.LL;
        }
        return Intrinsics.LJFF(musNotice, musNotice2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1900970zZH c1900970zZH;
        MusNotice musNotice;
        String str = this.LL.nid;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1900970zZH) && (c1900970zZH = (C1900970zZH) interfaceC1891350zJl) != null && (musNotice = c1900970zZH.LL) != null) {
            str2 = musNotice.nid;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1900970zZH)) {
            return null;
        }
        C1900970zZH c1900970zZH = (C1900970zZH) interfaceC1891350zJl;
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(this.LL, c1900970zZH.LL);
        if (this.LL.isCache() == c1900970zZH.LL.isCache()) {
            z = false;
        }
        return new C1901000zZK(z2, z);
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1900970zZH) {
            return C1600110rk1.LIZJ();
        }
        return C1600110rk1.LIZ("unknown");
    }

    public /* synthetic */ C1900970zZH(MusNotice musNotice, String str, String str2, boolean z, List list, boolean z2, C1901230zZh c1901230zZh, Function1 function1, Function1 function12, Function0 function0, Map map, int i) {
        this(musNotice, str, str2, "notification_page", z, list, (i & 64) != 0 ? false : z2, null, null, (i & 512) != 0 ? null : c1901230zZh, null, function1, function12, (i & 8192) != 0 ? null : function0, (i & 16384) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1900970zZH(MusNotice musNotice, String str, String str2, String str3, boolean z, List<? extends InterfaceC1906920zis> list, boolean z2, String str4, C1242270iQr c1242270iQr, C1901230zZh c1901230zZh, String str5, Function1<? super MusNotice, Unit> function1, Function1<? super MusNotice, Unit> function12, Function0<Unit> function0, Map<String, String> map) {
        this.LL = musNotice;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = list;
        this.LLIZ = z2;
        this.LLIZLLLIL = str4;
        this.LLJ = c1242270iQr;
        this.LLJI = c1901230zZh;
        this.LLJIJIL = str5;
        this.LLJILJIL = function1;
        this.LLJILJILJ = function12;
        this.LLJILLL = function0;
        this.LLJJ = map;
    }
}
