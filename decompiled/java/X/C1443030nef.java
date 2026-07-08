package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443030nef extends DraftListenerAdapter {
    public static C1443030nef LJIIIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public String LJII;
    public RecordScene LJIIIIZZ;
    public final List<AVChallenge> LIZ = new ArrayList();
    public Boolean LJFF = Boolean.FALSE;
    public boolean LJI = false;

    public static C1443030nef LJII() {
        if (LJIIIZ == null) {
            synchronized (C1443030nef.class) {
                try {
                    if (LJIIIZ == null) {
                        LJIIIZ = new C1443030nef();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIZ;
    }

    public final void LJ() {
        if ("artist_campaign".equals(this.LIZLLL)) {
            return;
        }
        ((ArrayList) this.LIZ).clear();
    }

    public final void LJIIIZ() {
        ((ArrayList) this.LIZ).clear();
        if (ServiceManager.get().getService(ICommerceToolsService.class) != null) {
            ((ICommerceToolsService) ServiceManager.get().getService(ICommerceToolsService.class)).setCommerceChallenge(false);
        }
    }

    public C1443030nef() {
        C0CHQ.LIZ().LJI().LIZ().registerListener(this);
    }

    public static boolean LJIIIIZZ() {
        return ((IInternalAVService) ServiceManager.get().getService(IInternalAVService.class)).isPublishing(null);
    }

    public static boolean LJI(Context context) {
        boolean zLJIIIIZZ = LJIIIIZZ();
        if (!zLJIIIIZZ) {
            if (C0CHQ.LIZ().getPublishService().LJJJJJL() > 0) {
                zLJIIIIZZ = true;
            } else {
                zLJIIIIZZ = false;
            }
        }
        if (zLJIIIIZZ) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("open_camera", "check is already published: no ");
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131845919);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZJ(context, 2017, creativeToastBuilder);
            return false;
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("open_camera", "check is already published: yes ");
        return true;
    }

    public static void LJIIJ(RecordScene recordScene) {
        ExtractFramesModel extractFramesModel;
        if (recordScene != null && (extractFramesModel = recordScene.extractFramesModel) != null) {
            C2354709Kn.LJIJJ(extractFramesModel.getExtractFramesDir());
            C2354709Kn.LJIJJLI(recordScene.extractFramesModel.getExtractFramesDir());
        }
    }

    public final void LIZ(AVChallenge aVChallenge) {
        if (aVChallenge != null && aVChallenge.getCid() != null) {
            ((ArrayList) this.LIZ).clear();
            ((ArrayList) this.LIZ).add(aVChallenge);
        }
    }

    public final void LJFF(List<AVChallenge> list) {
        if (list != null && !list.isEmpty()) {
            for (AVChallenge aVChallenge : list) {
                if (aVChallenge.getCid() != null) {
                    ((ArrayList) this.LIZ).add(aVChallenge);
                }
            }
        }
    }

    public final void LJIIJJI(int i) {
        if (C554190LoP.LIZ()) {
            if (i != 2) {
                switch (i) {
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        return;
                    default:
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unknown publish status: ");
                        sbLIZ.append(i);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                return;
            }
        } else if (i != 9 && i != 10 && i != 12) {
            return;
        }
        this.LJII = "";
    }

    public final void LJIIL(String str) {
        String str2;
        if (str != null && (str2 = this.LJII) != null && str2.equals(str)) {
            return;
        }
        this.LJII = str;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        if (!updateParams.isPublish()) {
            this.LJII = "";
        }
    }
}
