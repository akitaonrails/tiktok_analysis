package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876800YaU {
    public static final C01GW<IIMMsgUtilService> LIZJ = C452501pT.LIZIZ(new C876810YaV());
    public final C876720YaM LIZ;
    public final InterfaceC1493505sz LIZIZ = C0I0B.LJFF.LIZIZ();

    public C876800YaU(C876720YaM c876720YaM) {
        this.LIZ = c876720YaM;
    }

    public static void LIZ(C876800YaU c876800YaU, String str, boolean z) {
        String str2;
        InterfaceC1493505sz interfaceC1493505sz = c876800YaU.LIZIZ;
        c876800YaU.getClass();
        int i = C2532009w6.LIZ;
        if (1 <= i && i < 101 && System.currentTimeMillis() % ((long) 100) < i) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("step_label", str);
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[1] = new Pair("is_background", str2);
            interfaceC1493505sz.sendEvent("msg_handled_by_inner_push_flow", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }
}
