package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.NoticeItem;

/* JADX INFO: renamed from: X.003a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0160003a implements InterfaceC1891350zJl {
    public final boolean LL;
    public final NoticeItem LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0160003a)) {
            return false;
        }
        C0160003a c0160003a = (C0160003a) obj;
        return this.LL == c0160003a.LL && Intrinsics.LJFF(this.LLILLJJLI, c0160003a.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveNotificationPowerItem(hasRead=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0160003a) {
            NoticeItem noticeItem = ((C0160003a) interfaceC1891350zJl).LLILLJJLI;
            long j = noticeItem.noticeId;
            NoticeItem noticeItem2 = this.LLILLJJLI;
            if (j == noticeItem2.noticeId && noticeItem.hasRead == noticeItem2.hasRead) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0160003a) && ((C0160003a) interfaceC1891350zJl).LLILLJJLI.noticeId == this.LLILLJJLI.noticeId) {
            return true;
        }
        return false;
    }

    public C0160003a(NoticeItem noticeItem, boolean z) {
        this.LL = z;
        this.LLILLJJLI = noticeItem;
    }
}
