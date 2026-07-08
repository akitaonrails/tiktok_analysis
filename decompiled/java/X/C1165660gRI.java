package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gRI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165660gRI extends AbstractC1542200qEc {
    public long LLILLJJLI;
    public final /* synthetic */ String LLILZ = "TTS_BNPL";
    public String LLILLL = "";

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration", String.valueOf(System.currentTimeMillis() - this.LLILLJJLI)), new Pair("url_schema", this.LLILLL), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1"), new Pair("biz_type", this.LLILZ));
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_bnpl_webview", mapLJIIIIZZ);
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration", String.valueOf(System.currentTimeMillis() - this.LLILLJJLI)), new Pair("url_schema", this.LLILLL), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT), new Pair("biz_type", this.LLILZ));
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_bnpl_webview", mapLJIIIIZZ);
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        this.LLILLJJLI = System.currentTimeMillis();
        this.LLILLL = str;
    }
}
