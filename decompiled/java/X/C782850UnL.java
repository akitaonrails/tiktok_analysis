package X;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;
import com.bytedance.android.live.uikit.uisetting.MsgNotifyAvoidConfig;
import com.bytedance.android.live.uikit.uisetting.api.LiveMessageConfigApiService;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782850UnL {
    public static final LinkedList<C09AJ<Unit>> LIZ = new LinkedList<>();
    public static final LinkedList<C09AJ<MessageNotifyConfig>> LIZIZ = new LinkedList<>();
    public static MessageNotifyConfig LIZJ;
    public static boolean LIZLLL;
    public static final boolean LJ;

    static {
        LJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest();
    }

    public static MessageNotifyConfig LIZ() {
        MessageNotifyConfig messageNotifyConfig = LIZJ;
        if (messageNotifyConfig != null) {
            return messageNotifyConfig;
        }
        C20337914i1<String> c20337914i1 = InterfaceC1106030et7.Z6;
        if (TextUtils.isEmpty(c20337914i1.LIZIZ())) {
            return null;
        }
        try {
            C20441214yg.LJ("[Message]", "manager use cache value");
            return (MessageNotifyConfig) C19748512Ol.LIZIZ.LJIIIIZZ(c20337914i1.LIZIZ(), new TypeToken<MessageNotifyConfig>() { // from class: X.0UnO
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZIZ() {
        return LIZJ != null;
    }

    public static void LIZJ() {
        if (LIZLLL || LIZIZ()) {
            return;
        }
        LIZLLL = true;
        LiveMessageConfigApiService.LIZ.getClass();
        C480460Ism.LIZ().getClass();
        ((LiveMessageConfigApiService) C480460Ism.LIZLLL(LiveMessageConfigApiService.class)).requestSetting(LJ, null).LJJLL(new C09JN() { // from class: X.0UnM
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveMessageConfigManager@9df2.init$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                C782850UnL.LIZLLL = false;
                T t = baseResponse.data;
                C782850UnL.LIZJ = (MessageNotifyConfig) t;
                InterfaceC1106030et7.Z6.LJFF(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, t));
                C782850UnL.LIZLLL((MessageNotifyConfig) baseResponse.data, null, 2);
                C1C7U.LIZIZ("LiveMessageConfigManager@9df2.init$1");
            }
        }, new C09JN() { // from class: X.0UnN
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveMessageConfigManager@9df2.init$2");
                C782850UnL.LIZLLL = false;
                C782850UnL.LIZLLL(null, (Throwable) obj, 1);
                C1C7U.LIZIZ("LiveMessageConfigManager@9df2.init$2");
            }
        });
    }

    public static C19491211Nm LJ() {
        C259800zU c259800zU = new C259800zU();
        return C11NZ.LJIJJLI(new C786340Usy(c259800zU, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIIJ(new C786170Ush(c259800zU, 6));
    }

    public static void LIZLLL(MessageNotifyConfig messageNotifyConfig, Throwable th, int i) {
        NotifyAvoidConfig notifyAvoidConfig;
        Throwable th2;
        MsgNotifyAvoidConfig msgNotifyAvoidConfig;
        List<MsgNotifyComponentAvoidRuleV2> componentRuleListV2;
        int iIntValue;
        NotifyFCConfig notifyFCConfig = null;
        if ((i & 1) != 0) {
            messageNotifyConfig = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if (messageNotifyConfig != null && (msgNotifyAvoidConfig = messageNotifyConfig.msgNotifyAvoidConfig) != null && (componentRuleListV2 = msgNotifyAvoidConfig.getComponentRuleListV2()) != null) {
            C1102070emj.LIZ.getClass();
            C1102070emj.LJI = componentRuleListV2;
            Iterator it2 = ((LinkedHashMap) C1102070emj.LJ).entrySet().iterator();
            while (it2.hasNext()) {
                C1097740efk c1097740efk = (C1097740efk) ((Map.Entry) it2.next()).getValue();
                Integer num = c1097740efk.LJFF;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                if (iIntValue <= 1) {
                    c1097740efk.LJFF = 1;
                    c1097740efk.LJ = componentRuleListV2;
                    c1097740efk.LJIIIIZZ = null;
                }
            }
        }
        C1102250en1 c1102250en1 = C1102250en1.LIZ;
        if (messageNotifyConfig != null) {
            notifyAvoidConfig = messageNotifyConfig.noticeAvoidConfig;
        } else {
            notifyAvoidConfig = null;
        }
        c1102250en1.getClass();
        C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(notifyAvoidConfig, 705));
        boolean z = C1102370enD.LIZ;
        if (messageNotifyConfig != null) {
            notifyFCConfig = messageNotifyConfig.noticeFcConfig;
        }
        C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(notifyFCConfig, 715));
        for (C09AJ<Unit> c09aj : LIZ) {
            if (!c09aj.isDisposed()) {
                c09aj.onNext(Unit.LIZ);
            }
        }
        LIZ.clear();
        for (C09AJ<MessageNotifyConfig> c09aj2 : LIZIZ) {
            if (!c09aj2.isDisposed()) {
                if (messageNotifyConfig != null) {
                    c09aj2.onNext(messageNotifyConfig);
                } else {
                    if (th == null) {
                        th2 = new Throwable("config is null");
                    } else {
                        th2 = th;
                    }
                    c09aj2.onError(th2);
                }
            }
        }
        LIZIZ.clear();
    }
}
