package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050120dQw extends AbstractC707180Roa {
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public InterfaceC1392640mLO LLJI;

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
    }

    private final IAdOpenHelper getAdOpenHelper() {
        return (IAdOpenHelper) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getDescView() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final SmartImageView getIconView() {
        return (SmartImageView) this.LLILZIL.getValue();
    }

    private final ICommercePageTrackingService getPageTrackingService() {
        return (ICommercePageTrackingService) this.LLJ.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    public final View getContentView() {
        return (View) this.LLILZ.getValue();
    }

    public C1050120dQw(Context context) {
        super(context);
        this.LLILZ = C452501pT.LIZIZ(new AwS417S0200000_16(this, context, 65));
        this.LLILZIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 744));
        this.LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 745));
        this.LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 743));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(411));
        this.LLJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(412));
    }

    @Override // X.InterfaceC713230RyL
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        Activity activityLIZIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJI;
        Aweme awemeLJJLIIIJJIZ = null;
        if (interfaceC1392640mLO != null) {
            activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLJI;
        if (interfaceC1392640mLO2 != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
        }
        if (activityLIZIZ != null && awemeLJJLIIIJJIZ != null) {
            IAdOpenHelper adOpenHelper = getAdOpenHelper();
            if (adOpenHelper != null) {
                adOpenHelper.LIZJ(activityLIZIZ, awemeLJJLIIIJJIZ);
            }
            AwemeRawAd awemeRawAd = awemeLJJLIIIJJIZ.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.getTiktokPageType() == 5) {
                ((C584800Mwg) C1048110dNh.LIZLLL.LIZ()).LIZIZ = awemeLJJLIIIJJIZ.getAid();
            }
        }
    }

    @Override // X.InterfaceC713230RyL
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        if (getIconView() == null) {
            return;
        }
        this.LLJI = interfaceC1392640mLO;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(anchorCommonStruct.getIcon()));
        c1331670kl3LJIIIIZZ.LJJ(getIconView());
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        TuxTextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(anchorCommonStruct.getKeyword());
        }
        TuxTextView descView = getDescView();
        if (descView != null) {
            descView.setText(anchorCommonStruct.getDescription());
        }
        if (!interfaceC1392640mLO.LJIIIIZZ() && !C715400S4k.LIZIZ()) {
            float f = C715390S4j.LIZ;
            C715390S4j.LIZ(findViewById(R.id.g3v));
        }
    }
}
