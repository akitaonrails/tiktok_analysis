package Y;

import X.C013C;
import X.C08E0;
import X.C08E1;
import X.C08E2;
import X.C09JN;
import X.C0WZX;
import X.C11JF;
import X.C1701330uNH;
import X.C1C7U;
import X.C20441214yg;
import X.C20502815Ko;
import X.C2204961BRm;
import X.C2418809dq;
import X.C259800zU;
import X.C746290TPf;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.awemepushlib.interaction.NotificationSettingPageAuthGuideServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class AfS101S0300000_3 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public static final void accept$0(AfS101S0300000_3 afS101S0300000_3, Object obj) {
        C1C7U.LIZ("NotificationSettingPageAuthGuideServiceImpl@5e10.openSysNotificationSettingForOppo$1");
        if (((Boolean) obj).booleanValue() && !((NotificationSettingPageAuthGuideServiceImpl) afS101S0300000_3.l0).LIZ.get()) {
            Context context = (Context) afS101S0300000_3.l1;
            Intent intent = (Intent) afS101S0300000_3.l2;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxzmANobxXoKP6jm5m8EHW4nJWYn8zvb+bFAOVTi8prZIgJD4xjheG1lLNCVb37YebvTtvQr+RR", null));
            ((NotificationSettingPageAuthGuideServiceImpl) afS101S0300000_3.l0).LIZ.set(true);
        }
        C1C7U.LIZIZ("NotificationSettingPageAuthGuideServiceImpl@5e10.openSysNotificationSettingForOppo$1");
    }

    public static final void accept$1(AfS101S0300000_3 afS101S0300000_3, Object obj) {
        C1C7U.LIZ("TtlsJumpSystemSettingsMethod@8c11.realJSBCall$2");
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) afS101S0300000_3.l0;
        if (iLocationBaseServiceForMT != null && iLocationBaseServiceForMT.LJ((Context) afS101S0300000_3.l1)) {
            ((ILocationBaseServiceForMT) afS101S0300000_3.l0).LIZIZ(true);
        }
        C11JF c11jf = ((C2418809dq) afS101S0300000_3.l2).LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1C7U.LIZIZ("TtlsJumpSystemSettingsMethod@8c11.realJSBCall$2");
    }

    public static final void accept$2(AfS101S0300000_3 afS101S0300000_3, Object obj) {
        C1C7U.LIZ("CutMusicLyricView@a198.loadLyricInfos$1");
        C08E0 c08e0 = (C08E0) obj;
        String str = c08e0.LIZ;
        if (str != null && Intrinsics.LJFF(str, ((C20502815Ko) afS101S0300000_3.l0).LIZ)) {
            ArrayList<C08E1> arrayList = c08e0.LIZJ;
            ArrayList arrayList2 = (ArrayList) afS101S0300000_3.l2;
            for (C08E1 c08e1 : arrayList) {
                arrayList2.add(new C08E2(c08e1.LIZ, c08e1.LIZIZ, c08e1.LIZJ));
            }
            ((C746290TPf) afS101S0300000_3.l1).setData((ArrayList) afS101S0300000_3.l2);
        }
        C1C7U.LIZIZ("CutMusicLyricView@a198.loadLyricInfos$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS101S0300000_3 afS101S0300000_3, Object obj) {
        C1C7U.LIZ("PortalLeaf@b89.notifyPortal$4$2$1");
        if (obj != 0) {
            C20441214yg.LIZIZ("PortalLeaf", "loadCoverSuccess");
            ((C013C) afS101S0300000_3.l0).element = true;
        }
        ((C259800zU) afS101S0300000_3.l1).element = obj;
        ((CountDownLatch) afS101S0300000_3.l2).countDown();
        C1C7U.LIZIZ("PortalLeaf@b89.notifyPortal$4$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS101S0300000_3 afS101S0300000_3, Object obj) {
        C1C7U.LIZ("PortalLeaf@b89.notifyPortal$4$3$1");
        if (obj != 0) {
            C20441214yg.LIZIZ("PortalLeaf", "loadAvartarSuccess");
            ((C013C) afS101S0300000_3.l0).element = true;
        }
        ((C259800zU) afS101S0300000_3.l1).element = obj;
        ((CountDownLatch) afS101S0300000_3.l2).countDown();
        C1C7U.LIZIZ("PortalLeaf@b89.notifyPortal$4$3$1");
    }

    public AfS101S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
