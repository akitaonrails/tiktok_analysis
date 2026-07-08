package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ywt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890690Ywt extends AbstractC895380ZAq implements InterfaceC887660Ys0<C890690Ywt> {
    public final int LLILLJJLI;
    public final FilterTabType LLILLL;
    public final Integer LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C890690Ywt)) {
            return false;
        }
        C890690Ywt c890690Ywt = (C890690Ywt) obj;
        return this.LLILLJJLI == c890690Ywt.LLILLJJLI && this.LLILLL == c890690Ywt.LLILLL && Intrinsics.LJFF(this.LLILZ, c890690Ywt.LLILZ) && this.LLILZIL == c890690Ywt.LLILZIL && this.LLILZLL == c890690Ywt.LLILZLL;
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
        int iHashCode = ((this.LLILLJJLI * 31) + this.LLILLL.hashCode()) * 31;
        Integer num = this.LLILZ;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
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
        return "tab_page_status_view";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterTabPageStatusViewPod(uiType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", promoteEntryShowType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isInMultiSelectMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isSwitchingMode=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(538, 0L, this.type, false, this, null, 96);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C890710Ywv.LIZIZ;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C890690Ywt) && interfaceC1891350zJl != null && Intrinsics.LJFF(interfaceC1891350zJl, this)) {
            return C1600110rk1.LIZJ();
        }
        return C1600110rk1.LIZ("unknown");
    }

    public /* synthetic */ C890690Ywt(int i, FilterTabType filterTabType, Integer num) {
        this(i, filterTabType, num, false, false);
    }

    public C890690Ywt(int i, FilterTabType filterTabType, Integer num, boolean z, boolean z2) {
        super(11);
        this.LLILLJJLI = i;
        this.LLILLL = filterTabType;
        this.LLILZ = num;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = 538;
    }

    @Override // X.InterfaceC887660Ys0
    public final C890690Ywt copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new C890690Ywt(this.LLILLJJLI, this.LLILLL, this.LLILZ, z, z4);
    }
}
