package Y;

import X.C0Y8T;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC876950Yaj;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ACallableS57S1100000_2 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("PumbaaTask@7275.initCustomBPEA$3$onEvent$1");
        AppLogNewUtils.onEventV3(aCallableS57S1100000_2.s0, (JSONObject) aCallableS57S1100000_2.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PumbaaTask@7275.initCustomBPEA$3$onEvent$1");
        return unit;
    }

    public static final Object call$1(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader@362b.downloadIfNeed$1");
        Pair pair = new Pair((AVMusic) aCallableS57S1100000_2.l1, aCallableS57S1100000_2.s0);
        C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader@362b.downloadIfNeed$1");
        return pair;
    }

    public static final Object call$2(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader@362b.downloadIfNeed$2");
        Pair pair = new Pair((AVMusic) aCallableS57S1100000_2.l1, aCallableS57S1100000_2.s0);
        C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader@362b.downloadIfNeed$2");
        return pair;
    }

    public static final Object call$3(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("AiChatConversationDataSourceImpl@a6a0.conversationFromLocal$1");
        C0Y8T c0y8tLIZ = ((InterfaceC876950Yaj) aCallableS57S1100000_2.l1).LIZ(aCallableS57S1100000_2.s0);
        C1C7U.LIZIZ("AiChatConversationDataSourceImpl@a6a0.conversationFromLocal$1");
        return c0y8tLIZ;
    }

    public static final Object call$4(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("AiChatConversationDataSourceImpl@a6a0.conversationFromRepo$1");
        C0Y8T c0y8tLJIL = ((InterfaceC876950Yaj) aCallableS57S1100000_2.l1).LJIL(aCallableS57S1100000_2.s0);
        C1C7U.LIZIZ("AiChatConversationDataSourceImpl@a6a0.conversationFromRepo$1");
        return c0y8tLJIL;
    }

    public static final Object call$5(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("IMConversationDataSourceImpl@5987.conversationFromLocal$1");
        C0Y8T c0y8tLIZ = ((InterfaceC876950Yaj) aCallableS57S1100000_2.l1).LIZ(aCallableS57S1100000_2.s0);
        C1C7U.LIZIZ("IMConversationDataSourceImpl@5987.conversationFromLocal$1");
        return c0y8tLIZ;
    }

    public static final Object call$6(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("IMConversationDataSourceImpl@5987.conversationFromRepo$1");
        C0Y8T c0y8tLJIL = ((InterfaceC876950Yaj) aCallableS57S1100000_2.l1).LJIL(aCallableS57S1100000_2.s0);
        C1C7U.LIZIZ("IMConversationDataSourceImpl@5987.conversationFromRepo$1");
        return c0y8tLJIL;
    }

    public static final Object call$7(ACallableS57S1100000_2 aCallableS57S1100000_2) {
        C1C7U.LIZ("CommentLogger@c1c.onEventReportInBackground$1");
        C20684815ws.LJIILLIIL(aCallableS57S1100000_2.s0, ((C2344009Gk) aCallableS57S1100000_2.l1).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.onEventReportInBackground$1");
        return unit;
    }

    public ACallableS57S1100000_2(JSONObject jSONObject, int i) {
        this.$t = i;
        this.s0 = "pns_view_draw_check";
        this.l1 = jSONObject;
    }

    public ACallableS57S1100000_2(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
