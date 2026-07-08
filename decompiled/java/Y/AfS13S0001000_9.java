package Y;

import X.C09JN;
import X.C1C7U;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C614770O9j;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public class AfS13S0001000_9 implements C09JN {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f293i0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS13S0001000_9(int i, int i2) {
        this.$t = i2;
        this.f293i0 = i;
    }

    public static final void accept$0(AfS13S0001000_9 afS13S0001000_9, Object obj) {
        String simpleName;
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.requestMixRankSkylight$3");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSkylightWidgetV2.requestMixRankSkylight: doOnError ");
        String message = null;
        if (th != null) {
            simpleName = th.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(": ");
        if (th != null) {
            message = th.getMessage();
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        C614770O9j.LIZIZ.LJ().LJIILLIIL("notification_page", th, C2097608Jq.LJIIIIZZ(new Pair("checkpoint", "InboxSkylightWidgetV2#requestMixRankSkylight"), new Pair("pull_type", String.valueOf(afS13S0001000_9.f293i0)), new Pair("api_path", "skylight/feed")));
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.requestMixRankSkylight$3");
    }

    public static final void accept$1(AfS13S0001000_9 afS13S0001000_9, Object obj) {
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.requestStoryFeedByPage$3");
        C614770O9j.LIZIZ.LJ().LJIILLIIL("notification_page", (Throwable) obj, C2097608Jq.LJIIIIZZ(new Pair("checkpoint", "InboxSkylightWidgetV2#requestStoryFeedByPage"), new Pair("pull_type", String.valueOf(afS13S0001000_9.f293i0)), new Pair("api_path", "get_feed_by_page")));
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.requestStoryFeedByPage$3");
    }
}
