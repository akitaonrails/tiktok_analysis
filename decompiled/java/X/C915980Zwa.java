package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0Zwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915980Zwa {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(314));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(273));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(228));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(227));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(272));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(274));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(233));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(232));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(231));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(230));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(226));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(225));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(234));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(229));

    public static final ILiveCompetitionExternalService LIZ() {
        return (ILiveCompetitionExternalService) LJIIJJI.getValue();
    }

    public static final ILiveCompetitionInternalService LIZIZ() {
        return (ILiveCompetitionInternalService) LJIIJ.getValue();
    }

    public static final IHostAppContext LIZJ() {
        return (IHostAppContext) LIZ.getValue();
    }

    public static final IInteractService LIZLLL() {
        return (IInteractService) LIZJ.getValue();
    }

    public static final IMatchAICommentaryService LJ() {
        return (IMatchAICommentaryService) LJIILIIL.getValue();
    }

    public static final ILiveMatchService LJFF() {
        return (ILiveMatchService) LJIIIZ.getValue();
    }

    public static final InterfaceC952240at4 LJI() {
        return (InterfaceC952240at4) LJIIIIZZ.getValue();
    }

    public static final IMultiHostService LJII() {
        return (IMultiHostService) LJII.getValue();
    }

    public static final IMultiGuestV3InternalServiceV2 LJIIIIZZ() {
        return (IMultiGuestV3InternalServiceV2) LJI.getValue();
    }

    public static final IQuickCoHostService LJIIIZ() {
        return (IQuickCoHostService) LJIIL.getValue();
    }
}
