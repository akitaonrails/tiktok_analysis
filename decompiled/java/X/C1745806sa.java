package X;

import com.ss.android.ugc.aweme.im.b2c.landing.BusinessAutoMessage;
import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1745806sa implements FakeMsgContent {
    public final BusinessAutoMessage LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1745806sa) && Intrinsics.LJFF(this.LL, ((C1745806sa) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("B2CLandingFakeMsgInfo(landingMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.LLILLJJLI;
    }

    public C1745806sa(BusinessAutoMessage businessAutoMessage) {
        this.LL = businessAutoMessage;
        this.LLILLJJLI = businessAutoMessage.msgType;
    }
}
