package X;

import Y.ARunnableS10S1400000_24;
import Y.ARunnableS124S0100000_24;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0sCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617740sCS implements InterfaceC1581620rGC {
    public final InterfaceC1617760sCU LIZ;
    public final IAVPublishService LIZIZ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();

    @Override // X.InterfaceC1581620rGC
    public final void onAttach() {
        if (((Number) C287030BMv.LIZ.getValue()).intValue() == 1) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C280480Az0.LIZ.getValue()).longValue()), new ARunnableS124S0100000_24(this, 177));
            return;
        }
        if (C1827607Du.LJ(new AnonymousClass0735(), C1785006yu.LIZJ())) {
            C823050WQl.LJ().schedule(new ARunnableS124S0100000_24(this, 177), 3000L, TimeUnit.MILLISECONDS);
        } else {
            C810560Vqw.LIZLLL(new ARunnableS124S0100000_24(this, 177), LivePreCreateNextRoomPlayer.ENABLE);
        }
    }

    @Override // X.InterfaceC1581620rGC
    public final void onCreate() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC1581620rGC
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
    }

    public C1617740sCS(InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LIZ = interfaceC1617760sCU;
    }

    public static void LIZIZ(C1617740sCS c1617740sCS) {
        IMainService iMainService;
        boolean z;
        C1C7U.LIZ("AvApiFragmentObserver@e080.onAttach$3L");
        if (c1617740sCS.LIZ.isViewValid()) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isPublishing() && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class)) != null && iMainService.isMainActivity(c1617740sCS.LIZ.getActivity()) && !ComplianceServiceProvider.LJFF().LIZJ(1)) {
                C01GW c01gw = C287030BMv.LIZ;
                if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
                    z = false;
                } else {
                    z = true;
                }
                c1617740sCS.LIZJ(null, false, "AvApiFragmentObserver onAttach", null, z);
            }
        }
        C1C7U.LIZIZ("AvApiFragmentObserver@e080.onAttach$3L");
    }

    @C14EU
    public void onHideUploadRecoverEvent(C1445930njL c1445930njL) {
        boolean z = c1445930njL.LIZ;
        boolean z2 = c1445930njL.LIZIZ;
        if (this.LIZ.isViewValid()) {
            this.LIZIZ.hideUploadRecoverWindow(this.LIZ.getActivity(), z, z2);
        }
    }

    @C14EU(sticky = true)
    public void onPublishStatusUpdate(C1445970njP c1445970njP) {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        if (c1445970njP.LIZ == 9 && c1445970njP.LJ && !c1445970njP.LJIIIZ) {
            BaseShortVideoContext baseShortVideoContext = c1445970njP.LJIIJJI.editModel;
            if (!(baseShortVideoContext instanceof VideoPublishEditModel) || !C1428470nHB.LJJJLL((VideoPublishEditModel) baseShortVideoContext)) {
                LIZJ(c1445970njP, c1445970njP.LJI, "publish status failed", c1445970njP.LIZLLL, false);
            }
        }
        if (c1445970njP.LIZ == 10) {
            Object obj = c1445970njP.LIZJ;
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                if (aweme.isPaidContent) {
                    return;
                }
                try {
                    long createTime = aweme.getCreateTime() - (Calendar.getInstance().getTimeInMillis() / 1000);
                    if (createTime < -120 || createTime > 10) {
                        C2241008qG c2241008qG = new C2241008qG();
                        c2241008qG.LIZ.put("server_create_time", String.valueOf(aweme.getCreateTime()));
                        c2241008qG.LIZ.put("client_insert_time", String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000));
                        c2241008qG.LIZ.put("group_id", aweme.getAid());
                        C793770VBv.LJ("aweme_publish_upload_create_time_error", c2241008qG.LJ());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final void LIZ(C19EG c19eg, PublishFailureReason publishFailureReason, PublishModel publishModel, String str) {
        if (((Number) C287030BMv.LIZ.getValue()).intValue() == 2) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C280490Az1.LIZ.getValue()).longValue()), new ARunnableS10S1400000_24(this, publishFailureReason, c19eg, publishModel, str, 1));
            return;
        }
        if (C1827607Du.LJ(new AnonymousClass0735(), C1785006yu.LIZJ())) {
            try {
                this.LIZIZ.showUploadRecoverIfNeed(publishFailureReason, c19eg, publishModel, str, false, false);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0VY3.LIZLLL(th, "AvApiFragmentObserverAttachExperiment", "AvApiFragmentObserver", "doShowUploadRecoverIfNeed", "");
                C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS10S1400000_24(this, publishFailureReason, c19eg, publishModel, str, 2));
                return;
            }
        }
        this.LIZIZ.showUploadRecoverIfNeed(publishFailureReason, c19eg, publishModel, str, false, false);
    }

    public final void LIZJ(C1445970njP c1445970njP, boolean z, String str, String str2, boolean z2) {
        final String str3;
        C1434650nR9 c1434650nR9 = null;
        if (c1445970njP != null) {
            str3 = c1445970njP.LJIIJ;
            c1434650nR9 = c1445970njP.LJFF;
        } else {
            str3 = null;
        }
        final PublishFailureReason publishFailureReason = new PublishFailureReason(c1434650nR9, z, str, str2);
        if (c1445970njP == null) {
            this.LIZIZ.tryRestorePublish(this.LIZ.getActivity(), z2, new Function1() { // from class: X.0sCT
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C1617740sCS c1617740sCS = this.LL;
                    PublishFailureReason publishFailureReason2 = publishFailureReason;
                    String str4 = str3;
                    c1617740sCS.getClass();
                    if (!((Boolean) obj).booleanValue()) {
                        c1617740sCS.LIZ(c1617740sCS.LIZ.getActivity(), publishFailureReason2, null, str4);
                    } else if (c1617740sCS.LIZIZ.canAutoRetry()) {
                        c1617740sCS.LIZIZ.checkAndAutoRetryIfNeed(c1617740sCS.LIZ.getActivity());
                        return null;
                    }
                    return null;
                }
            });
        } else {
            LIZ(this.LIZ.getActivity(), publishFailureReason, c1445970njP.LJIIJJI, str3);
        }
    }
}
