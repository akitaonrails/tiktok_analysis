package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0616, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0616 implements Serializable, InterfaceC111300bX {
    public final IMAIBotInfo LL;
    public final EnumC1684406ig LLILLJJLI;

    public final AnonymousClass0616 copy(IMAIBotInfo iMAIBotInfo, EnumC1684406ig enumC1684406ig) {
        return new AnonymousClass0616(iMAIBotInfo, enumC1684406ig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0616)) {
            return false;
        }
        AnonymousClass0616 anonymousClass0616 = (AnonymousClass0616) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0616.LL) && this.LLILLJJLI == anonymousClass0616.LLILLJJLI;
    }

    public int hashCode() {
        IMAIBotInfo iMAIBotInfo = this.LL;
        return ((iMAIBotInfo == null ? 0 : iMAIBotInfo.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotChatDetailData(botInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final IMAIBotInfo getBotInfo() {
        return this.LL;
    }

    public final EnumC1684406ig getEnterFrom() {
        return this.LLILLJJLI;
    }

    public AnonymousClass0616(IMAIBotInfo iMAIBotInfo, EnumC1684406ig enumC1684406ig) {
        this.LL = iMAIBotInfo;
        this.LLILLJJLI = enumC1684406ig;
    }
}
