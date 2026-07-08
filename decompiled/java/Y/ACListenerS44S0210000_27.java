package Y;

import X.C08JS;
import X.C13LP;
import X.C1845270y7R;
import X.C1857100yQW;
import X.C1857170yQd;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.send.imagetext.TakoSendImageTextAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class ACListenerS44S0210000_27 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS44S0210000_27 aCListenerS44S0210000_27, View view) {
        ((TakoSendBaseAssem) aCListenerS44S0210000_27.l0).Vp("up");
        ((TakoSendBaseAssem) aCListenerS44S0210000_27.l0).Ip((C1857170yQd) aCListenerS44S0210000_27.l1, aCListenerS44S0210000_27.z2);
    }

    public static final void onClick$1(ACListenerS44S0210000_27 aCListenerS44S0210000_27, View view) {
        ((TakoSendBaseAssem) aCListenerS44S0210000_27.l0).Vp("down");
        ((TakoSendBaseAssem) aCListenerS44S0210000_27.l0).Jp((C1857170yQd) aCListenerS44S0210000_27.l1, aCListenerS44S0210000_27.z2);
    }

    public static final void onClick$2(ACListenerS44S0210000_27 aCListenerS44S0210000_27, View view) {
        BaseVideo baseVideo;
        double dDoubleValue;
        if (aCListenerS44S0210000_27.z2) {
            List<BaseVideo> list = ((C1857100yQW) aCListenerS44S0210000_27.l0).LLJILJIL;
            Map<String, String> commonParams = null;
            if (list != null && (baseVideo = (BaseVideo) C13LP.LJJJLL(list)) != null) {
                try {
                    String str = ((TakoSendImageTextAssem) aCListenerS44S0210000_27.l1).Yy1().uuid;
                    String str2 = baseVideo.videoModel;
                    String str3 = baseVideo.fileHash;
                    String str4 = baseVideo.vid;
                    List<String> list2 = baseVideo.urlList;
                    Integer num = baseVideo.width;
                    Integer num2 = baseVideo.height;
                    String str5 = baseVideo.videoUrl;
                    Double d = baseVideo.duration;
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    long j = (long) (dDoubleValue * ((double) LSPassThroughRecordSizeConfig.DEFAULT));
                    Long l = baseVideo.expireTime;
                    ITakoContextAbility iTakoContextAbilityZp = ((TakoSendImageTextAssem) aCListenerS44S0210000_27.l1).zp();
                    if (iTakoContextAbilityZp != null) {
                        commonParams = iTakoContextAbilityZp.getCommonParams();
                    }
                    String strLIZLLL = C08JS.LIZLLL(new C1845270y7R(str2, str4, str3, list2, num, num2, null, null, str5, Long.valueOf(j), l, str, null, commonParams, false, 20672, null));
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//tako/video/detail");
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    smartRouteBuildRoute.withParam("video_info", strLIZLLL);
                    smartRouteBuildRoute.open();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS44S0210000_27(Object obj, TakoSendBaseAssem<T> takoSendBaseAssem, C1857170yQd c1857170yQd, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = takoSendBaseAssem;
        this.z2 = c1857170yQd;
    }
}
