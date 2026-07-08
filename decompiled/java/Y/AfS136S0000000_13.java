package Y;

import X.AbstractC1387200mCc;
import X.C09JN;
import X.C0CPH;
import X.C0VT7;
import X.C1397950mTx;
import X.C1C7U;
import X.C2093608Ic;
import X.C799900VZk;
import X.C813430VvZ;
import X.C827070WcT;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.RedBadgeUpdateTask;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.awemepushlib.interaction.PushSheduler;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes14.dex */
public class AfS136S0000000_13 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
        }
    }

    public AfS136S0000000_13(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        boolean z;
        C1C7U.LIZ("RegisterLifecycle@e52e.run$1L");
        AbstractC1387200mCc abstractC1387200mCc = ((C813430VvZ) obj).LIZ;
        if (abstractC1387200mCc instanceof C1397950mTx) {
            z = ((C1397950mTx) abstractC1387200mCc).LIZLLL instanceof BaseActivity;
        } else {
            z = true;
        }
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        if (z && !iAVPublishServicePublishService.isCreativeToolsPage(abstractC1387200mCc)) {
            abstractC1387200mCc.LJFF().getLifecycle().addObserver(new EventActivityComponent(abstractC1387200mCc));
        }
        C1C7U.LIZIZ("RegisterLifecycle@e52e.run$1L");
    }

    public static final void accept$1(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("PublishTestSupportTask@9b60.drillPublishTestTCE$2L");
        C1C7U.LIZIZ("PublishTestSupportTask@9b60.drillPublishTestTCE$2L");
    }

    public static final void accept$2(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("RedBadgerHelp@580.redBadgerResgiter$1L");
        PushSheduler.LIZJ(new ARunnableS113S0100000_13(obj, 133));
        C1C7U.LIZIZ("RedBadgerHelp@580.redBadgerResgiter$1L");
    }

    public static final void accept$3(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("RedBadgerHelp@580.redBadgerResgiter$2L");
        PushSheduler.LIZJ(new ARunnableS113S0100000_13(obj, 132));
        C1C7U.LIZIZ("RedBadgerHelp@580.redBadgerResgiter$2L");
    }

    public static final void accept$4(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("LiveReplyDownloader$DefaultDownloadProxyCallBack@d5e.onSuccess$1L");
        C1C7U.LIZIZ("LiveReplyDownloader$DefaultDownloadProxyCallBack@d5e.onSuccess$1L");
    }

    public static final void accept$5(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("LiveReplyDownloader$DefaultDownloadProxyCallBack@d5e.onSuccess$2L");
        C1C7U.LIZIZ("LiveReplyDownloader$DefaultDownloadProxyCallBack@d5e.onSuccess$2L");
    }

    public static final void accept$6(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("PublicScreenPresenter@c5a7.wave$1L");
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.wave$1L");
    }

    public static final void accept$7(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("PublicScreenPresenter@c5a7.wave$2L");
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.wave$2L");
    }

    public static final void accept$8(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("I18LauncherRegisterKt@df74.registerForI18KidsMode$2");
        C827070WcT.LIZ.getClass();
        if (!C2093608Ic.LJ(AppLog.getClientId()) && !C2093608Ic.LJ(C827070WcT.LIZJ())) {
            C799900VZk.LIZ.getClass();
            C0CPH c0cph = new C0CPH();
            c0cph.LIZ(new RedBadgeUpdateTask());
            c0cph.LIZIZ();
        }
        C1C7U.LIZIZ("I18LauncherRegisterKt@df74.registerForI18KidsMode$2");
    }

    public static final void accept$9(AfS136S0000000_13 afS136S0000000_13, Object obj) {
        C1C7U.LIZ("BatteryReceiver@b7a1.subscribeAppEnterOb$1L");
        if (!((Boolean) obj).booleanValue()) {
            C0VT7.LIZ().LIZIZ();
        }
        C1C7U.LIZIZ("BatteryReceiver@b7a1.subscribeAppEnterOb$1L");
    }
}
