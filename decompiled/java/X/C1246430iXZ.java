package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iXZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246430iXZ implements InterfaceC1891350zJl {
    public final int LL;
    public final NoticeChannelInfo LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final Function2<String, Function0<Unit>, Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1246430iXZ)) {
            return false;
        }
        C1246430iXZ c1246430iXZ = (C1246430iXZ) obj;
        return this.LL == c1246430iXZ.LL && Intrinsics.LJFF(this.LLILLJJLI, c1246430iXZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1246430iXZ.LLILLL) && this.LLILZ == c1246430iXZ.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1246430iXZ.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemNotificationTabBarItem(group=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", channelInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showWrapper=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1246430iXZ)) {
            return false;
        }
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1246430iXZ) || this.LL != ((C1246430iXZ) interfaceC1891350zJl).LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1246430iXZ)) {
            return null;
        }
        C1246430iXZ c1246430iXZ = (C1246430iXZ) interfaceC1891350zJl;
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(this.LLILLL, c1246430iXZ.LLILLL);
        if (this.LLILZ == c1246430iXZ.LLILZ) {
            z = false;
        }
        return new C1246440iXa(z2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1246430iXZ(int i, NoticeChannelInfo noticeChannelInfo, String str, boolean z, Function2<? super String, ? super Function0<Unit>, Unit> function2) {
        this.LL = i;
        this.LLILLJJLI = noticeChannelInfo;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = function2;
    }
}
