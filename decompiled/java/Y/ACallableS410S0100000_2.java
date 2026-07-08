package Y;

import X.AbstractC21274718Nl;
import X.AnonymousClass0317;
import X.C034S;
import X.C063R;
import X.C063S;
import X.C069P;
import X.C0FI2;
import X.C0VSJ;
import X.C0YAE;
import X.C1120604Zw;
import X.C1398350mUb;
import X.C1461005nk;
import X.C1462005nu;
import X.C196909122h;
import X.C1AF0;
import X.C1AQS;
import X.C1C7U;
import X.C20012913Sd;
import X.C201955140j;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C2354709Kn;
import X.InterfaceC1456360o0A;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.services.storage.StorageSensitivityService;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ACallableS410S0100000_2 implements Callable {
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
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return call$18(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS410S0100000_2 aCallableS410S0100000_2) throws Throwable {
        C1C7U.LIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$1");
        Object objLJ = C23250099c.LJ(C23271099x.INSTANCE, new C063S((AwemeSharePackage) aCallableS410S0100000_2.l0, null));
        C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$1");
        return objLJ;
    }

    public static final Object call$1(ACallableS410S0100000_2 aCallableS410S0100000_2) throws Throwable {
        C1C7U.LIZ("ExternalShareGroupUtils@7fa9.processExternalGroupShare$1");
        Object objLJ = C23250099c.LJ(C23271099x.INSTANCE, new C063R((SharePackage) aCallableS410S0100000_2.l0, null));
        C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.processExternalGroupShare$1");
        return objLJ;
    }

    public static final Object call$10(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("SocialEditRootScene@8880.runTaskAfterExtract$1");
        Boolean boolValueOf = Boolean.valueOf(((InterfaceC1456360o0A) aCallableS410S0100000_2.l0).LIZ(Mp4ScreenVideoLoadTimeout.CONTROL));
        C1C7U.LIZIZ("SocialEditRootScene@8880.runTaskAfterExtract$1");
        return boolValueOf;
    }

    public static final Object call$11(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("ThreadExtensionKt@1792.runOnBackgroundThread$1");
        ((Function0) aCallableS410S0100000_2.l0).invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ThreadExtensionKt@1792.runOnBackgroundThread$1");
        return unit;
    }

    public static final Object call$12(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("EffectDownProcessor@e1d3.removeCachedDir$1");
        try {
            C2354709Kn.LJIJI(new C0VSJ(((Effect) aCallableS410S0100000_2.l0).getUnzipPath()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MVRes: Invalid Res Delete Failed :");
            sbLIZ.append(((Effect) aCallableS410S0100000_2.l0).getUnzipPath());
            C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("EffectDownProcessor@e1d3.removeCachedDir$1");
        return null;
    }

    public static final Object call$13(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("ProfileAigcAvatarViewModel@7228.deleteTempFiles$1");
        C20012913Sd c20012913Sd = C20012913Sd.LIZ;
        Context context = (Context) aCallableS410S0100000_2.l0;
        c20012913Sd.getClass();
        C20012913Sd.LIZ(context);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAigcAvatarViewModel@7228.deleteTempFiles$1");
        return unit;
    }

    public static final Object call$14(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("TrafficPerfMonitor@6bb0.collect$1");
        AppLogNewUtils.onEventV3("traffic_perf_every_ten_minutes", (JSONObject) aCallableS410S0100000_2.l0);
        C1C7U.LIZIZ("TrafficPerfMonitor@6bb0.collect$1");
        return null;
    }

    public static final Object call$15(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("TrafficPerfMonitor@6bb0.collect$2");
        AppLogNewUtils.onEventV3("traffic_perf_in_first_ten_minutes", (JSONObject) aCallableS410S0100000_2.l0);
        C1C7U.LIZIZ("TrafficPerfMonitor@6bb0.collect$2");
        return null;
    }

    public static final Object call$16(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("WaveBackgroundThreadExecutor@fb2c.create$1$execute$1");
        ((Runnable) aCallableS410S0100000_2.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WaveBackgroundThreadExecutor@fb2c.create$1$execute$1");
        return unit;
    }

    public static final Object call$17(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        Object objValueOf;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        String name;
        C1C7U.LIZ("BaseMetricsEvent@eb02.post$1");
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            AbstractC21274718Nl abstractC21274718Nl = (AbstractC21274718Nl) aCallableS410S0100000_2.l0;
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).mobClickCombinerEventV3(abstractC21274718Nl.LIZ, abstractC21274718Nl.LIZIZ);
            objValueOf = Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post event failed: ");
            sbLIZ.append(((AbstractC21274718Nl) aCallableS410S0100000_2.l0).LIZ);
            objValueOf = Integer.valueOf(Log.w("MetricsEvent", C2188811AlT.LIZIZ(sbLIZ), th));
        }
        C1C7U.LIZIZ("BaseMetricsEvent@eb02.post$1");
        return objValueOf;
    }

    public static final Object call$18(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        Integer numValueOf;
        C1C7U.LIZ("GroupMemberUtil@7ee8.fetchMemberInfo$1");
        C1461005nk c1461005nk = C1461005nk.LIZ;
        List<C0YAE> list = (List) aCallableS410S0100000_2.l0;
        c1461005nk.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transfer ImMemberList origin list size : ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C0YAE c0yae : list) {
                String secUid = c0yae.getSecUid();
                if (secUid == null || secUid.length() == 0) {
                    IMContactApi.LIZ.getClass();
                    secUid = C069P.LIZ().LIZLLL().LIZ(String.valueOf(c0yae.getUid()));
                }
                C1462005nu c1462005nu = new C1462005nu(String.valueOf(c0yae.getUid()), secUid);
                c1462005nu.setMember(c0yae);
                arrayList.add(c1462005nu);
            }
        }
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchMemberInfo$1");
        return arrayList;
    }

    public static final Object call$2(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("DeepLinkBootTimeReportUtils@4f55.reportDeepLinkBootEvent$1");
        AppLogNewUtils.onEventV3("deeplink_first_frame", (JSONObject) aCallableS410S0100000_2.l0);
        C1C7U.LIZIZ("DeepLinkBootTimeReportUtils@4f55.reportDeepLinkBootEvent$1");
        return null;
    }

    public static final Object call$3(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("EditRootScene@37d3.runTaskAfterExtract$1");
        Boolean boolValueOf = Boolean.valueOf(((InterfaceC1456360o0A) aCallableS410S0100000_2.l0).LIZ(Mp4ScreenVideoLoadTimeout.CONTROL));
        C1C7U.LIZIZ("EditRootScene@37d3.runTaskAfterExtract$1");
        return boolValueOf;
    }

    public static final Object call$4(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        ((C0FI2) aCallableS410S0100000_2.l0).getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadFallBackFontIfNeed$1L");
        C196909122h.LIZ().LJI("fallbackfont", !StorageSensitivityService.getLimitEffectPreload(), new IFetchEffectChannelListener() { // from class: X.05kB
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("textFontDownload err: ");
                sbLIZ.append(exceptionResult.getMsg());
                C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null && !effectChannelResponse2.getAllCategoryEffects().isEmpty()) {
                    Effect effect = (Effect) ListProtector.get(effectChannelResponse2.getAllCategoryEffects(), 0);
                    if (effect == null) {
                        C391040FUw.LIZ.getClass();
                        C391040FUw.LIZLLL("");
                        C391040FUw.LJ("");
                    } else {
                        C391040FUw c391040FUw = C391040FUw.LIZ;
                        String sdkExtra = effect.getSdkExtra();
                        c391040FUw.getClass();
                        C391040FUw.LIZLLL(sdkExtra);
                        C391040FUw.LJ(effect.getUnzipPath());
                    }
                }
            }
        });
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadFallBackFontIfNeed$1L");
        return null;
    }

    public static final Object call$5(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("PageMonitor@3af1.replaceWithECRxErrorHandler$1");
        C1AF0.LJFF((Throwable) aCallableS410S0100000_2.l0, "EcomPageMonitor: fail to replace ErrorHandler");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PageMonitor@3af1.replaceWithECRxErrorHandler$1");
        return unit;
    }

    public static final Object call$6(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("PageMonitor@3af1.restoreRxErrorHandler$1");
        C1AF0.LJFF((Throwable) aCallableS410S0100000_2.l0, "EcomPageMonitor: fail to restore ErrorHandler");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PageMonitor@3af1.restoreRxErrorHandler$1");
        return unit;
    }

    public static final Object call$7(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.trackGroupChat$4");
        Iterator it2 = ((List) aCallableS410S0100000_2.l0).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.trackGroupChat$4");
        return unit;
    }

    public static final Object call$8(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.trackPrivateChat$4");
        Iterator it2 = ((List) aCallableS410S0100000_2.l0).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.trackPrivateChat$4");
        return unit;
    }

    public static final Object call$9(ACallableS410S0100000_2 aCallableS410S0100000_2) {
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.tryReportSocialChatCellShowOnListHostReturn$1$1");
        ((Runnable) aCallableS410S0100000_2.l0).run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.tryReportSocialChatCellShowOnListHostReturn$1$1");
        return unit;
    }

    public ACallableS410S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
