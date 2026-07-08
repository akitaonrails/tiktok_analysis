package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.input.DanmakuInputFragment;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxPreloadComponent;

/* JADX INFO: renamed from: X.0UsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785860UsC extends C0W9W {
    public final int $t;
    public Object l0;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(C785860UsC c785860UsC) {
        C1C7U.LIZ("ProductDescReadTracker@e092.startTimer$lambda$3$$inlined$timerTask$1");
        boolean zLJ = C0W9U.LJ(c785860UsC.bpeaTraceContext);
        try {
            ((C1427600nFm) c785860UsC.l0).LIZLLL++;
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("ProductDescReadTracker@e092.startTimer$lambda$3$$inlined$timerTask$1");
    }

    public static final void run$1(C785860UsC c785860UsC) {
        C1C7U.LIZ("Timer@5683.init$1");
        boolean zLJ = C0W9U.LJ(c785860UsC.bpeaTraceContext);
        try {
            try {
                ((C15ZQ) c785860UsC.l0).LIZJ();
            } finally {
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("Timer@5683.init$1");
    }

    public static final void run$2(C785860UsC c785860UsC) {
        C1C7U.LIZ("DanmakuInputFragment@e18c.onStop$1");
        boolean zLJ = C0W9U.LJ(c785860UsC.bpeaTraceContext);
        try {
            ((DanmakuInputFragment) c785860UsC.l0).LLJ = false;
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("DanmakuInputFragment@e18c.onStop$1");
    }

    public static final void run$3(C785860UsC c785860UsC) {
        C1C7U.LIZ("ClassicStoryPublishManager@844a.replaceFakeAweme$1$1");
        boolean zLJ = C0W9U.LJ(c785860UsC.bpeaTraceContext);
        try {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            String aid = ((Aweme) c785860UsC.l0).getAid();
            if (aid == null) {
                aid = "";
            }
            interfaceC706770RnvLJJIIJ.LIZIZ(null, aid, AwemeExtKt.getAuthorUid((Aweme) c785860UsC.l0));
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("ClassicStoryPublishManager@844a.replaceFakeAweme$1$1");
    }

    public static final void run$4(C785860UsC c785860UsC) {
        C1C7U.LIZ("SeaProductDescReadTracker@7876.startTimer$lambda$3$$inlined$timerTask$1");
        boolean zLJ = C0W9U.LJ(c785860UsC.bpeaTraceContext);
        try {
            ((C1755140vm4) c785860UsC.l0).LIZJ++;
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("SeaProductDescReadTracker@7876.startTimer$lambda$3$$inlined$timerTask$1");
    }

    public static final void run$5(C785860UsC c785860UsC) {
        C1C7U.LIZ("StoryInboxPreloadComponent@c3dc.startTimer$1$1$1");
        boolean zLJ = C0W9U.LJ(c785860UsC.bpeaTraceContext);
        try {
            ((StoryInboxPreloadComponent) c785860UsC.l0).bo();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("StoryInboxPreloadComponent@c3dc.startTimer$1$1$1");
    }

    public C785860UsC(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
