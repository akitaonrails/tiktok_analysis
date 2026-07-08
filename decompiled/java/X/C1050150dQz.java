package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService;
import com.ss.android.ugc.aweme.commercialize.anchor.service.CommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050150dQz extends C09AY implements Function0<InterfaceC1050170dR1> {
    public final /* synthetic */ C1050180dR2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050150dQz(C1050180dR2 c1050180dR2) {
        super(0);
        this.LL = c1050180dR2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1050170dR1 invoke() {
        ICommerceAnchorService iCommerceAnchorServiceLJIILL = CommerceAnchorService.LJIILL();
        final C1050180dR2 c1050180dR2 = this.LL;
        return iCommerceAnchorServiceLJIILL.LJII(new InterfaceC1044450dHn() { // from class: X.0dR4
            @Override // X.InterfaceC1044450dHn
            public final String getRefer() {
                return "commerce_anchor";
            }

            @Override // X.InterfaceC1044450dHn
            public final AnchorCommonStruct LIZJ() {
                return c1050180dR2.LLIZ;
            }

            @Override // X.InterfaceC1044450dHn
            public final InterfaceC1392640mLO LJII() {
                InterfaceC1392640mLO interfaceC1392640mLO = c1050180dR2.LL;
                if (interfaceC1392640mLO == null) {
                    return null;
                }
                return interfaceC1392640mLO;
            }

            @Override // X.InterfaceC1044450dHn
            public final Integer LJIIIIZZ() {
                InterfaceC1392640mLO interfaceC1392640mLO = c1050180dR2.LL;
                if (interfaceC1392640mLO == null) {
                    interfaceC1392640mLO = null;
                }
                return Integer.valueOf(interfaceC1392640mLO.LIZJ().LJIILIIL(c1050180dR2));
            }

            @Override // X.InterfaceC1044450dHn
            public final Aweme getAweme() {
                return c1050180dR2.LJIIZILJ();
            }

            @Override // X.InterfaceC1044450dHn
            public final Context getContext() {
                InterfaceC1392640mLO interfaceC1392640mLO = c1050180dR2.LL;
                if (interfaceC1392640mLO == null) {
                    interfaceC1392640mLO = null;
                }
                return interfaceC1392640mLO.LIZIZ();
            }

            @Override // X.InterfaceC1044450dHn
            public final String getEnterFrom() {
                return c1050180dR2.LJIJJLI();
            }
        });
    }
}
