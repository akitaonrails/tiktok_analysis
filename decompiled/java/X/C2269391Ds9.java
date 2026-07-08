package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.music.IMusicBridgeService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ds9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269391Ds9 extends C09AY implements Function0<C1457550o25> {
    public C2269391Ds9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0o25] */
    @Override // kotlin.jvm.functions.Function0
    public final C1457550o25 invoke() {
        return new InterfaceC573550MeX() { // from class: X.0o25
            @Override // X.InterfaceC573550MeX
            public final boolean LIZ() {
                ICommerceMediaService iCommerceMediaService;
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "reverse_ai_music_panel_type", true) != 0) {
                    return true;
                }
                C15MA c15ma = C15MA.LL;
                if (C15MA.LIZLLL()) {
                    return true;
                }
                IMusicBridgeService iMusicBridgeService = (IMusicBridgeService) PluggableExtentionKt.pluggableSpi$default(IMusicBridgeService.class, false, false, false, 14, null);
                return ((iMusicBridgeService != null && iMusicBridgeService.enableBAAccountRequestRecommendMusic() && C0CHQ.LIZ().getAccountService().LJIIJJI()) || (iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null)) == null || !iCommerceMediaService.LJ()) ? false : true;
            }
        };
    }
}
