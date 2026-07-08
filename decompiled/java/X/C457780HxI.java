package X;

import android.util.Log;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.0HxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457780HxI implements InterfaceC111300bX, InterfaceC457790HxJ {
    public final SessionInfo LL;
    public final boolean LLILLJJLI;
    public final EnterChatParams LLILLL;
    public final boolean LLILZ;

    @Override // X.InterfaceC457790HxJ
    public final void LIZ() {
        if (((Boolean) C141300gN.LIZ.getValue()).booleanValue()) {
            Exception exc = new Exception();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The ChatCommonHierarchyData is cleared. this: ");
            sbLIZ.append(this);
            sbLIZ.append(", trace: ");
            sbLIZ.append(Log.getStackTraceString(exc));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IM-HierarchyData");
            sbLIZ2.append(": ");
            sbLIZ2.append(strLIZIZ);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public C457780HxI(SessionInfo sessionInfo, boolean z, EnterChatParams enterChatParams) {
        boolean z2;
        if (!z && C913300ZsG.LIZ.LIZIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LL = sessionInfo;
        this.LLILLJJLI = z;
        this.LLILLL = enterChatParams;
        this.LLILZ = z2;
    }
}
