package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS21S0001000_6;

/* JADX INFO: renamed from: X.0Pti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659400Pti extends AbstractC585420Mxg implements InterfaceC661400Pww {
    public final C661470Px3 LLILLJJLI;
    public final C0Q2C LLILLL = null;
    public final C1012300cRw LLILZ;
    public final TuxIconView LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public Aweme LLIZLLLIL;
    public C1012300cRw LLJ;
    public SearchVideoHolderVM LLJI;

    @Override // X.InterfaceC661400Pww
    public final void LIZIZ(EnumC661340Pwq enumC661340Pwq) {
        boolean z;
        InterfaceC688220Qz6 interfaceC688220Qz6LJJI;
        C1012300cRw c1012300cRw;
        C661490Px5 dataProvider;
        C1012300cRw c1012300cRw2;
        TuxIconView tuxIconView;
        int[] iArr = C660930PwB.LIZ;
        int i = iArr[enumC661340Pwq.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i != 2) {
                if (i != 4 && i != 5) {
                    if (i != 6) {
                        i2 = 1;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 0;
            }
        }
        SearchVideoHolderVM searchVideoHolderVM = this.LLJI;
        if (searchVideoHolderVM != null) {
            searchVideoHolderVM.setState(new AwS21S0001000_6(i2, 17));
        }
        int i3 = iArr[enumC661340Pwq.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    C1012300cRw c1012300cRw3 = this.LLILZ;
                    if (c1012300cRw3 != null) {
                        C786410Ut5.r1(c1012300cRw3, 8);
                    }
                    C1012300cRw c1012300cRw4 = this.LLJ;
                    if (c1012300cRw4 != null) {
                        C786410Ut5.r1(c1012300cRw4, 8);
                    }
                    if (this.LLILZLL && (tuxIconView = this.LLILZIL) != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            Aweme aweme = this.LLIZLLLIL;
            if (aweme != null && aweme.isAd()) {
                z = true;
            } else {
                z = false;
            }
            AwemeRawAd awemeRawAd = null;
            c653660PkS = null;
            C653660PkS c653660PkS = null;
            if (!z) {
                C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
                C659080PtC.LJFF();
                int i4 = C659080PtC.LIZIZ;
                c1011980cRQ.getClass();
                EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i4);
                if (enumC1012120cReLIZ != null && (c1012300cRw2 = this.LLILZ) != null) {
                    c1012300cRw2.LIZ(enumC1012120cReLIZ, false);
                }
                C659060PtA c659060PtA = C659060PtA.LIZ;
                Aweme aweme2 = this.LLIZLLLIL;
                C1012300cRw c1012300cRw5 = this.LLILZ;
                TuxIconView tuxIconView2 = this.LLILZIL;
                C661470Px3 c661470Px3 = this.LLILLJJLI;
                if (c661470Px3 != null && (dataProvider = c661470Px3.getDataProvider()) != null) {
                    c653660PkS = dataProvider.LJIL;
                }
                C659060PtA.LIZLLL(c659060PtA, aweme2, c1012300cRw5, tuxIconView2, c653660PkS, null, 16);
            } else {
                C1011980cRQ c1011980cRQ2 = EnumC1012120cRe.Companion;
                C659080PtC.LJFF();
                int i5 = C659080PtC.LIZIZ;
                c1011980cRQ2.getClass();
                EnumC1012120cRe enumC1012120cReLIZ2 = C1011980cRQ.LIZ(i5);
                if (enumC1012120cReLIZ2 != null && (c1012300cRw = this.LLJ) != null) {
                    c1012300cRw.LIZ(enumC1012120cReLIZ2, false);
                }
                C1012300cRw c1012300cRw6 = this.LLJ;
                if (c1012300cRw6 == null || c1012300cRw6.getVisibility() != 0) {
                    C1012300cRw c1012300cRw7 = this.LLJ;
                    if (c1012300cRw7 != null) {
                        C786410Ut5.r1(c1012300cRw7, 0);
                    }
                    ISearchAdMainService iSearchAdMainService = (ISearchAdMainService) PluggableExtentionKt.pluggableSpi$default(ISearchAdMainService.class, false, false, false, 14, null);
                    if (iSearchAdMainService != null && (interfaceC688220Qz6LJJI = iSearchAdMainService.LJJI()) != null) {
                        Aweme aweme3 = this.LLIZLLLIL;
                        if (aweme3 != null) {
                            awemeRawAd = aweme3.getAwemeRawAd();
                        }
                        interfaceC688220Qz6LJJI.LJIIJJI(awemeRawAd, C659080PtC.LIZIZ());
                    }
                }
            }
            C661470Px3 c661470Px32 = this.LLILLJJLI;
            if (c661470Px32 == null) {
                return;
            }
            c661470Px32.setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, this.LLIZ, this.LLIZLLLIL));
            return;
        }
        C1012300cRw c1012300cRw8 = this.LLILZ;
        if (c1012300cRw8 != null) {
            C786410Ut5.r1(c1012300cRw8, 8);
        }
        C1012300cRw c1012300cRw9 = this.LLJ;
        if (c1012300cRw9 != null) {
            C786410Ut5.r1(c1012300cRw9, 8);
        }
        C661470Px3 c661470Px33 = this.LLILLJJLI;
        if (c661470Px33 == null) {
            return;
        }
        boolean z2 = C659080PtC.LIZ;
        c661470Px33.setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, this.LLIZ, this.LLIZLLLIL));
    }

    public final void UC(int i) {
        TuxIconView tuxIconView;
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC585430Mxh) it2.next()).UC(1);
        }
        SearchVideoHolderVM searchVideoHolderVM = this.LLJI;
        if (searchVideoHolderVM != null) {
            searchVideoHolderVM.setState(new AwS21S0001000_6(1, 17));
        }
        C0Q2C c0q2c = this.LLILLL;
        if (c0q2c != null) {
            c0q2c.setState(C0Q2E.PLAY);
        }
        if (C07P0.LIZIZ()) {
            C1012300cRw c1012300cRw = this.LLILZ;
            if (c1012300cRw != null) {
                C786410Ut5.r1(c1012300cRw, 8);
            }
            C1012300cRw c1012300cRw2 = this.LLJ;
            if (c1012300cRw2 != null) {
                C786410Ut5.r1(c1012300cRw2, 8);
            }
        }
        if (this.LLILZLL && (tuxIconView = this.LLILZIL) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }

    @Override // X.AbstractC585420Mxg, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        super.onRenderFirstFrame(c1480420ocy);
        C661470Px3 c661470Px3 = this.LLILLJJLI;
        if (c661470Px3 != null) {
            int visibility = c661470Px3.getVisibility();
            c661470Px3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c661470Px3);
        }
    }

    public C659400Pti(C661470Px3 c661470Px3, C1012300cRw c1012300cRw, TuxIconView tuxIconView, boolean z, int i) {
        this.LLILLJJLI = c661470Px3;
        this.LLILZ = c1012300cRw;
        this.LLILZIL = tuxIconView;
        this.LLILZLL = z;
        this.LLIZ = i;
    }
}
