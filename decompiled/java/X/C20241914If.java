package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14If, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20241914If implements InterfaceC0148002o {
    public final boolean LL;
    public final EnumC20241814Ie LLILLJJLI;
    public final String LLILLL;
    public final Message LLILZ;

    public C20241914If() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20241914If)) {
            return false;
        }
        C20241914If c20241914If = (C20241914If) obj;
        return this.LL == c20241914If.LL && this.LLILLJJLI == c20241914If.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c20241914If.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20241914If.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Message message = this.LLILZ;
        return iZ2 + (message == null ? 0 : message.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoNovelBotState(enableContinue=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadingStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", continueText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", latestMessage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20241914If(int i) {
        this(false, EnumC20241814Ie.UNINITIALIZED, "", null);
    }

    public C20241914If(boolean z, EnumC20241814Ie enumC20241814Ie, String str, Message message) {
        this.LL = z;
        this.LLILLJJLI = enumC20241814Ie;
        this.LLILLL = str;
        this.LLILZ = message;
    }

    public static C20241914If LIZ(C20241914If c20241914If, boolean z, EnumC20241814Ie enumC20241814Ie, int i) {
        String str;
        if ((i & 1) != 0) {
            z = c20241914If.LL;
        }
        if ((i & 2) != 0) {
            enumC20241814Ie = c20241914If.LLILLJJLI;
        }
        Message message = null;
        if ((i & 4) != 0) {
            str = c20241914If.LLILLL;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            message = c20241914If.LLILZ;
        }
        c20241914If.getClass();
        return new C20241914If(z, enumC20241814Ie, str, message);
    }
}
