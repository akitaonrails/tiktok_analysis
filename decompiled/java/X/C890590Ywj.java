package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ywj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890590Ywj extends AbstractC895380ZAq implements InterfaceC887660Ys0<C890590Ywj> {
    public final C05RV LLILLJJLI;
    public final List<C889910Yvd> LLILLL;
    public final List<C880720Ygo> LLILZ;
    public final FilterTabType LLILZIL;
    public final Set<EnumC880480YgQ> LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C890590Ywj)) {
            return false;
        }
        C890590Ywj c890590Ywj = (C890590Ywj) obj;
        return this.LLILLJJLI == c890590Ywj.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c890590Ywj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c890590Ywj.LLILZ) && this.LLILZIL == c890590Ywj.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c890590Ywj.LLILZLL) && this.LLIZ == c890590Ywj.LLIZ && this.LLIZLLLIL == c890590Ywj.LLIZLLLIL && this.LLJ == c890590Ywj.LLJ && this.LLJI == c890590Ywj.LLJI;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return true;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getEnableSelect() {
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public final Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect() {
        return null;
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return 0L;
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        return (((((((((((((((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI);
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSelected() {
        return false;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "filter_tab_bar";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxFilterBarPod(inboxMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabs=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", filterOptions=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedTabType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", selectedFilterOptionTypes=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", autoScrollToSelectedTab=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", showFilterSelector=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isInMultiSelectMode=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isSwitchingMode=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(540, 0L, this.type, false, this, null, 96);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C890710Ywv.LIZIZ;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLJ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C890590Ywj)) {
            return C1600110rk1.LIZ("unknown");
        }
        if (((C890590Ywj) interfaceC1891350zJl).LLILLJJLI != this.LLILLJJLI) {
            return C1600110rk1.LIZ("inbox_mode_switch");
        }
        return C1600110rk1.LIZJ();
    }

    @Override // X.InterfaceC887660Ys0
    public final C890590Ywj copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new C890590Ywj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, z, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C890590Ywj(C05RV c05rv, List<C889910Yvd> list, List<C880720Ygo> list2, FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set, boolean z, boolean z2, boolean z3, boolean z4) {
        super(10);
        this.LLILLJJLI = c05rv;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = filterTabType;
        this.LLILZLL = set;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = z4;
        this.LLJIJIL = 540;
    }
}
