package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.ChannelSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ow3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635370Ow3 implements InterfaceC1891350zJl {
    public final int LL;
    public final ChannelSetting LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C635370Ow3)) {
            return false;
        }
        C635370Ow3 c635370Ow3 = (C635370Ow3) obj;
        return this.LL == c635370Ow3.LL && Intrinsics.LJFF(this.LLILLJJLI, c635370Ow3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c635370Ow3.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        ChannelSetting channelSetting = this.LLILLJJLI;
        int iHashCode = (i + (channelSetting == null ? 0 : channelSetting.hashCode())) * 31;
        String str = this.LLILLL;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeChannelOptionItem(groupId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", channelData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", accountType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C635370Ow3(int i, ChannelSetting channelSetting, String str) {
        this.LL = i;
        this.LLILLJJLI = channelSetting;
        this.LLILLL = str;
    }
}
