package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.051l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12859051l {
    public static final /* synthetic */ int LIZ = 0;

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message_request:");
        sbLIZ.append(C461720I8s.LIZIZ());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(long j) {
        ArrayList arrayList = (ArrayList) C13LQ.LJLI(LIZ().getStringArray("message_request_push_turn_on_guide_ignore_timestamp", new String[0]));
        arrayList.add(String.valueOf(j));
        LIZ().storeStringArray("message_request_push_turn_on_guide_ignore_timestamp", (String[]) arrayList.toArray(new String[0]));
    }
}
