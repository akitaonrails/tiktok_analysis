package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ywq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890660Ywq extends AbstractC895380ZAq {
    public final FilterTabType LLILLJJLI;
    public final Function1<FilterTabType, Unit> LLILLL;
    public final int LLILZ;

    @Override // X.AbstractC895380ZAq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C890660Ywq)) {
            return false;
        }
        C890660Ywq c890660Ywq = (C890660Ywq) obj;
        return this.LLILLJJLI == c890660Ywq.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c890660Ywq.LLILLL);
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return 0L;
    }

    @Override // X.AbstractC895380ZAq
    public final int hashCode() {
        return (this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode();
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "tab_page_guide_banner";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxFilterTabGuideBannerPod(tabType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onClickClose=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(539, 0L, this.type, false, this, null, 96);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C890710Ywv.LIZIZ;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        C890660Ywq c890660Ywq;
        FilterTabType filterTabType = null;
        if ((interfaceC1891350zJl instanceof C890660Ywq) && (c890660Ywq = (C890660Ywq) interfaceC1891350zJl) != null) {
            filterTabType = c890660Ywq.LLILLJJLI;
        }
        if (filterTabType == this.LLILLJJLI) {
            return C1600110rk1.LIZJ();
        }
        return C1600110rk1.LIZ("unknown");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C890660Ywq(FilterTabType filterTabType, Function1<? super FilterTabType, Unit> function1) {
        super(12);
        this.LLILLJJLI = filterTabType;
        this.LLILLL = function1;
        this.LLILZ = 539;
    }
}
