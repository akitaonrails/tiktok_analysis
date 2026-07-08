package Y;

import X.AbstractRunnableC2239851Clb;
import X.C0T9S;
import X.C1C7U;
import X.C20684815ws;
import X.C2097608Jq;
import X.C443120HZe;
import X.EnumC1159500gHM;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentVM;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.TopicUpdatePreference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ACallableS419S0100000_12 implements Callable {
    public final int $t;
    public Object l0;

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

    public static final Object call$0(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("InboxEnterMobEventByPushAssem@f780.logEnterInboxTabByPush$2");
        C20684815ws.LJIILLIIL("enter_homepage_message", (Map) aCallableS419S0100000_12.l0);
        C1C7U.LIZIZ("InboxEnterMobEventByPushAssem@f780.logEnterInboxTabByPush$2");
        return null;
    }

    public static final Object call$1(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("DetailBufferPhotoStrategy@1464.triggerPreload$1$1");
        ((AbstractRunnableC2239851Clb) aCallableS419S0100000_12.l0).run();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("DetailBufferPhotoStrategy@1464.triggerPreload$1$1");
        return bool;
    }

    public static final Object call$2(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("PhotoSplitLoadStrategy@b534.triggerPreload$1$1");
        ((AbstractRunnableC2239851Clb) aCallableS419S0100000_12.l0).run();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("PhotoSplitLoadStrategy@b534.triggerPreload$1$1");
        return bool;
    }

    public static final Object call$3(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("PhotoStrategy@221a.triggerPreload$1$1");
        ((AbstractRunnableC2239851Clb) aCallableS419S0100000_12.l0).run();
        Boolean bool = Boolean.TRUE;
        C1C7U.LIZIZ("PhotoStrategy@221a.triggerPreload$1$1");
        return bool;
    }

    public static final Object call$4(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onProgress$1");
        ((C0T9S) aCallableS419S0100000_12.l0).LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onProgress$1");
        return unit;
    }

    public static final Object call$5(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onStart$1");
        ((C0T9S) aCallableS419S0100000_12.l0).onStart();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadAwemeVideoServiceImpl@6b64.getProxyAbsMointorDownloadListener$1$onStart$1");
        return unit;
    }

    public static final Object call$6(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("CompileTask@a3ca.executeExpensiveOpInVECallback$1");
        ((Function0) aCallableS419S0100000_12.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CompileTask@a3ca.executeExpensiveOpInVECallback$1");
        return unit;
    }

    public static final Object call$7(ACallableS419S0100000_12 aCallableS419S0100000_12) {
        C1C7U.LIZ("ManageTopicsContentVM@4b1f.handleSaveClicked$1");
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(((ManageTopicsContentVM) aCallableS419S0100000_12.l0).LLILZIL);
        Map mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(((ManageTopicsContentVM) aCallableS419S0100000_12.l0).LLILZLL);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapLJIIZILJ2.entrySet()) {
            arrayList.add(new TopicUpdatePreference(((Number) entry.getKey()).intValue(), ((EnumC1159500gHM) entry.getValue()).getServerValue()));
        }
        C443120HZe c443120HZe = new C443120HZe(arrayList, mapLJIIZILJ, mapLJIIZILJ2);
        C1C7U.LIZIZ("ManageTopicsContentVM@4b1f.handleSaveClicked$1");
        return c443120HZe;
    }

    public ACallableS419S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ACallableS419S0100000_12(C0T9S c0t9s, int i, long j, long j2, int i2) {
        this.$t = i2;
        this.l0 = c0t9s;
    }
}
