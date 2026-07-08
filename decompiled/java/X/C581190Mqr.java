package X;

import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.tools.draft.music.DraftOnlineMusicProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.DraftSoundEffectProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.DraftStreamMusicProcessor;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Mqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581190Mqr implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            default:
                return null;
        }
    }

    public C581190Mqr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C581190Mqr c581190Mqr, C15O7 c15o7) {
        C1C7U.LIZ("VEMediaParserProviderV2@d09d.releaseAllTask$1");
        VEMediaParserProviderV2 vEMediaParserProviderV2 = (VEMediaParserProviderV2) c581190Mqr.l0;
        vEMediaParserProviderV2.LLILLL.execute(new RunnableC530220Kqq(vEMediaParserProviderV2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.releaseAllTask$1");
        return unit;
    }

    public static final Object then$1(C581190Mqr c581190Mqr, C15O7 c15o7) {
        Unit unit;
        C1C7U.LIZ("AVInfoServiceImpl@8a43.audioLegal$2");
        IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) c581190Mqr.l0;
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(c15o7.LJIIL());
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("AVInfoServiceImpl@8a43.audioLegal$2");
        return unit;
    }

    public static final Object then$2(C581190Mqr c581190Mqr, C15O7 c15o7) {
        C0MPH c0mph;
        C1C7U.LIZ("FTCVideoPublishFragment@5dbf.prepareEffectPlatform$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCVideoPublish finishPrepareEffectPlatform:");
        sbLIZ.append(((FTCVideoPublishFragment) c581190Mqr.l0).LLILZLL);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        FTCVideoPublishFragment fTCVideoPublishFragment = (FTCVideoPublishFragment) c581190Mqr.l0;
        C19EG activity = fTCVideoPublishFragment.getActivity();
        if (activity != null && fTCVideoPublishFragment.LLIZ.decrementAndGet() == 0 && (c0mph = fTCVideoPublishFragment.LLILZLL) != null && c0mph.isShowing() && !activity.isFinishing()) {
            C0MPH c0mph2 = fTCVideoPublishFragment.LLILZLL;
            if (c0mph2 != null) {
                c0mph2.dismiss();
                C785410UrT.LIZ(c0mph2);
            }
            fTCVideoPublishFragment.LLILZLL = null;
        }
        C1C7U.LIZIZ("FTCVideoPublishFragment@5dbf.prepareEffectPlatform$2");
        return null;
    }

    public static final Object then$3(C581190Mqr c581190Mqr, C15O7 c15o7) {
        C1C7U.LIZ("DraftOnlineMusicProcessor@2279.realProcess$1");
        DraftOnlineMusicProcessor draftOnlineMusicProcessor = (DraftOnlineMusicProcessor) c581190Mqr.l0;
        InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq = draftOnlineMusicProcessor.LLILLJJLI;
        if (interfaceC1631620sYq != null) {
            Boolean bool = Boolean.TRUE;
            draftOnlineMusicProcessor.getClass();
            interfaceC1631620sYq.invoke(bool, bool, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftOnlineMusicProcessor@2279.realProcess$1");
        return unit;
    }

    public static final Object then$4(C581190Mqr c581190Mqr, C15O7 c15o7) {
        Unit unit;
        C1C7U.LIZ("DraftSoundEffectProcessor@c98.process$4");
        DraftSoundEffectProcessor draftSoundEffectProcessor = (DraftSoundEffectProcessor) c581190Mqr.l0;
        C0MYU c0myu = draftSoundEffectProcessor.LLILLJJLI;
        if (c0myu != null) {
            c0myu.LIZ(draftSoundEffectProcessor.LLILZ);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("DraftSoundEffectProcessor@c98.process$4");
        return unit;
    }

    public static final Object then$5(C581190Mqr c581190Mqr, C15O7 c15o7) {
        C1C7U.LIZ("DraftStreamMusicProcessor@cca2.realProcess$1$1");
        DraftStreamMusicProcessor draftStreamMusicProcessor = (DraftStreamMusicProcessor) c581190Mqr.l0;
        InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq = draftStreamMusicProcessor.LLILLJJLI;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Boolean.TRUE, Boolean.valueOf(draftStreamMusicProcessor.LLILLL), ((DraftStreamMusicProcessor) c581190Mqr.l0).LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftStreamMusicProcessor@cca2.realProcess$1$1");
        return unit;
    }
}
