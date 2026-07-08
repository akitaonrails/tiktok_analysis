package X;

import Y.ACListenerS56S1200000_14;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdaySettingsData;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS450S0200000_14;

/* JADX INFO: renamed from: X.0Z9F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9F extends C09AY implements Function0<C0Z9E> {
    public C0Z9F() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Z9E] */
    @Override // kotlin.jvm.functions.Function0
    public final C0Z9E invoke() {
        return new InterfaceC19330810jy() { // from class: X.0Z9E
            public final PrivacySettingsFeature LL = C1336205Ku.LIZ(false).getImPrivacySettings();

            @Override // X.InterfaceC19330810jy
            public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                return false;
            }

            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return new int[]{36};
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                return false;
            }

            public final boolean LIZIZ() {
                PushFeature pushFeatureLIZ;
                return this.LL.LJIILJJIL() && (pushFeatureLIZ = PushFeature.LIZ.LIZ()) != null && pushFeatureLIZ.LJIILJJIL();
            }

            public static final C0Z9K LJ() {
                return ((C0Z9Y) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJI();
            }

            public static final String LJII(InnerPushMessage innerPushMessage) {
                List<User> list;
                User user;
                String uid = null;
                try {
                    InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                    if (uiTemplate != null && (list = uiTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLZIJ(0, list)) != null) {
                        uid = user.getUid();
                        return uid;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return uid;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJFF(InnerPushMessage innerPushMessage) {
                if (LIZIZ() && LJIIIIZZ(innerPushMessage)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJI(InnerPushMessage innerPushMessage) {
                long jLIZIZ;
                String strLJII = LJII(innerPushMessage);
                if (strLJII != null) {
                    C0Z9K c0z9kLJ = LJ();
                    String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    IMHostApi.LIZ.getClass();
                    IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                    if (iMHostApiLIZ != null) {
                        jLIZIZ = iMHostApiLIZ.LIZIZ();
                    } else {
                        jLIZIZ = 0;
                    }
                    c0z9kLJ.LJJL(jLIZIZ, strLJII, curUserId);
                }
                if (LIZIZ() && LJIIIIZZ(innerPushMessage)) {
                    LJ().LJIILJJIL(innerPushMessage, null);
                    return true;
                }
                return false;
            }

            public final boolean LJIIIIZZ(InnerPushMessage innerPushMessage) {
                long serverTime;
                C869590Y9l lastShowMessage;
                String strLJII = LJII(innerPushMessage);
                if (strLJII == null || strLJII.length() == 0) {
                    return false;
                }
                String strLJ = C0YNP.LJ(strLJII);
                if (strLJ.length() == 0) {
                    return false;
                }
                C603760NmA c603760NmA = C603760NmA.LL;
                LightInteractionExitBean lightInteractionExitBeanLJII = C603760NmA.LJII(strLJ, EnumC1696906kh.CONVERSATION);
                LightInteractionExitBean lightInteractionExitBeanCopy = null;
                lValueOf = null;
                Long lValueOf = null;
                if (lightInteractionExitBeanLJII != null) {
                    C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C1336205Ku.LIZ(false).getImChatService().LJJIIZ(strLJII));
                    if (c0y8tLIZ != null && (lastShowMessage = c0y8tLIZ.getLastShowMessage()) != null) {
                        lValueOf = Long.valueOf(lastShowMessage.getCreatedAt());
                    }
                    lightInteractionExitBeanCopy = lightInteractionExitBeanLJII.copy(lightInteractionExitBeanLJII.key, lightInteractionExitBeanLJII.updateTimingMs, lightInteractionExitBeanLJII.enterChatTimeSecond, lValueOf, lightInteractionExitBeanLJII.exitLabelMap);
                }
                IMHostApi.LIZ.getClass();
                IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                if (iMHostApiLIZ != null) {
                    serverTime = iMHostApiLIZ.getServerTime();
                } else {
                    serverTime = 0;
                }
                return C346060DhU.LIZLLL(new C346070DhV(lightInteractionExitBeanCopy, serverTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), ((LightInteractionBirthdaySettingsData) C0C95.LIZIZ.getValue()).ruleList);
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                InnerPushUITemplate uiTemplate;
                String str;
                IMainPageFragment iMainPageFragment;
                String strLJJLIIIJJI;
                if (innerPushMessage == null) {
                    return null;
                }
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                String str2 = "";
                if ((uiTemplate2 == null || (str = uiTemplate2.rightSchemaUrl) == null) && ((uiTemplate = innerPushMessage.getUiTemplate()) == null || (str = uiTemplate.globalSchemaUrl) == null)) {
                    str = "";
                }
                C0Z9K c0z9kLJ = LJ();
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("enter_from", "inner_push");
                String strLJJJJZI = LJ().LJJJJZI(str);
                if (strLJJJJZI == null) {
                    strLJJJJZI = "";
                }
                pairArr[1] = new Pair("enter_method", strLJJJJZI);
                String label = innerPushMessage.getLabel();
                if (label == null) {
                    label = "";
                }
                pairArr[2] = new Pair("push_label", label);
                IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
                if (iAwemeImManager != null && iAwemeImManager.getProxy() != null && (iMainPageFragment = (IMainPageFragment) PluggableExtentionKt.pluggableSpiForReal(IMainPageFragment.class)) != null && (strLJJLIIIJJI = iMainPageFragment.LJJLIIIJJI()) != null) {
                    str2 = strLJJLIIIJJI;
                }
                pairArr[3] = new Pair("light_interaction_enter_from", str2);
                pairArr[4] = new Pair("light_interaction_enter_method", EnumC1908380zlE.INNER_PUSH.getValue());
                return c0z9kLJ.LJIIJJI(innerPushMessage, null, false, C2097608Jq.LJIIIIZZ(pairArr), new ACListenerS56S1200000_14((Object) c20663515tR, (Context) str, (String) innerPushMessage, (Map<String, String>) 0), new AwS450S0200000_14(c20663515tR, innerPushMessage, 5));
            }
        };
    }
}
