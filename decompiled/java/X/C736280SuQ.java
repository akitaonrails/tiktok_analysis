package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736280SuQ extends AbstractC736370SuZ {
    public final C1379170lzf LLILZ;
    public final InterfaceC1374230lrh LLILZIL;

    @Override // X.AbstractC736370SuZ
    public final String LJIIIZ() {
        return "report";
    }

    @Override // X.AbstractC1376810lvr
    public final void LIZJ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "video_long_press");
        C20684815ws.LJIILLIIL("tns_report_entrance_show", c2344009Gk.LIZ);
    }

    public final String LJIIJ() {
        String str;
        Aweme aweme = this.LLILLJJLI;
        return (aweme == null || !AwemeExtKt.isPhotoMode(aweme) || (str = this.LLILZ.LLILLL) == null || Intrinsics.LJFF(str, "normal_share")) ? "long_press" : this.LLILZ.LLILLL;
    }

    @Override // X.AbstractC1376810lvr
    public final Integer LJFF() {
        if (C736340SuW.LIZIZ()) {
            return Integer.valueOf(R.attr.a1l);
        }
        return null;
    }

    @Override // X.AbstractC1376810lvr
    public final Integer LJI() {
        if (C736340SuW.LIZIZ()) {
            return Integer.valueOf(R.attr.a1l);
        }
        return null;
    }

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        Activity activityLIZ;
        String aid;
        String authorUid;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Context context = view.getContext();
            String aid2 = null;
            if (context != null && (activityLIZ = C085T.LIZ(context)) != null) {
                String str = this.LLILLL;
                C627150Oin c627150Oin = new C627150Oin();
                Aweme aweme = this.LLILLJJLI;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
                Aweme aweme2 = this.LLILLJJLI;
                if (aweme2 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme2);
                } else {
                    authorUid = null;
                }
                C786410Ut5.LJJJI("author_id", authorUid, c627150Oin.LIZ);
                Aweme aweme3 = this.LLILLJJLI;
                if (aweme3 != null) {
                    aid2 = aweme3.getAid();
                }
                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid2), c627150Oin.LIZ);
                C0XPD.LIZIZ(activityLIZ, str, "click_report", c627150Oin.LIZ, new C738960Syk(this, view, 4));
                return;
            }
            return;
        }
        LJIIJJI(view);
    }

    @Override // X.AbstractC1376810lvr
    public final void LJII(View view) {
        C786410Ut5.LJJJI("action_type", "report", this.LLILZ.LLJILJILJ.extras);
        super.LJII(view);
    }

    public final void LJIIJJI(View view) {
        Context context = view.getContext();
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1313);
        Activity activityLJII = C1375500ltk.LJII(context);
        if (activityLJII != null) {
            INetworkStandardUIService iNetworkStandardUIService = (INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class);
            InterfaceC908430ZkP networkStateForSharePanel = iNetworkStandardUIService.getNetworkStateForSharePanel();
            if (networkStateForSharePanel instanceof InterfaceC908440ZkQ) {
                awS555S0100000_11.invoke();
            } else {
                iNetworkStandardUIService.showNetworkToast(activityLJII, networkStateForSharePanel, "");
            }
        }
    }

    public C736280SuQ(C1379170lzf c1379170lzf, InterfaceC1374230lrh interfaceC1374230lrh) {
        super(c1379170lzf, interfaceC1374230lrh);
        this.LLILZ = c1379170lzf;
        this.LLILZIL = interfaceC1374230lrh;
    }
}
