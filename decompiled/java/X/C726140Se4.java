package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.Map;

/* JADX INFO: renamed from: X.0Se4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726140Se4 implements InterfaceC1350330lF9 {
    public FrameLayout LIZ;
    public IAnoleManager LIZIZ;
    public final String LIZJ = C0RQ7.ANOLE_FEED_COMMENT_TOP.getSlotName();

    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "commerce_comment_top_bar";
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJFF(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJII(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJIIIZ(Aweme aweme) {
    }

    @Override // X.InterfaceC1350330lF9
    public final int zg() {
        return 3;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZ() {
        IAnoleManager iAnoleManager = this.LIZIZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIJJI(this.LIZJ);
        }
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(final CommentContextSource commentContextSource, final Aweme aweme) {
        Context context;
        C1350340lFA.LIZ(this, aweme, commentContextSource);
        ICommerceCommentService iCommerceCommentServiceLIZJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZJ();
        FrameLayout frameLayout = this.LIZ;
        IAnoleManager iAnoleManager = null;
        if (frameLayout != null) {
            context = frameLayout.getContext();
        } else {
            context = null;
        }
        C1009310cN7 c1009310cN7LIZIZ = iCommerceCommentServiceLIZJ.LIZIZ(context, aweme);
        if (c1009310cN7LIZIZ != null) {
            iAnoleManager = c1009310cN7LIZIZ.LLILZ;
        }
        this.LIZIZ = iAnoleManager;
        if (iAnoleManager != null) {
            iAnoleManager.mount(this.LIZ, this.LIZJ, new InterfaceC1014340cVE() { // from class: X.0Se5
                @Override // X.InterfaceC1014340cVE
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZLLL(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJFF(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJJJIL() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJII() {
                    C726140Se4 c726140Se4 = this.LIZ;
                    Aweme aweme2 = aweme;
                    CommentContextSource commentContextSource2 = commentContextSource;
                    String strEnterFrom = commentContextSource2 != null ? CommentContextSourceKt.enterFrom(commentContextSource2) : null;
                    c726140Se4.getClass();
                    C1350340lFA.LIZIZ(c726140Se4, aweme2, strEnterFrom);
                }
            });
        }
        IAnoleManager iAnoleManager2 = this.LIZIZ;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LJIJI(this.LIZJ);
        }
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        return C1017180cZo.LIZIZ(awemeRawAd, this.LIZJ);
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        return C1017180cZo.LIZIZ(awemeRawAd, this.LIZJ);
    }

    @Override // X.InterfaceC1350330lF9
    public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        this.LIZ = frameLayout;
        return frameLayout;
    }
}
