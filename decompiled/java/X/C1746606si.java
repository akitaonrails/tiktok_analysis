package X;

import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1746606si implements FakeMsgContent {
    public final BusinessAutoMessage LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1746606si) && Intrinsics.LJFF(this.LL, ((C1746606si) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("B2CLocalReplyFakeMsgInfo(autoReplyMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.LLILLJJLI;
    }

    public C1746606si(BusinessAutoMessage businessAutoMessage) {
        this.LL = businessAutoMessage;
        this.LLILLJJLI = businessAutoMessage.msgType;
    }
}
