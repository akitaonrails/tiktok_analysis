package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS138S0110000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1394730mOl extends C1394720mOk {
    public static final /* synthetic */ int LLJI = 0;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.C1394720mOk
    public final int LIZ() {
        return R.layout.cys;
    }

    private final View getActionButton() {
        return (View) this.LLIZ.getValue();
    }

    private final SmartImageView getActionIvButton() {
        return (SmartImageView) this.LLIZLLLIL.getValue();
    }

    private final View getActionTvButton() {
        return (View) this.LLJ.getValue();
    }

    public final void LIZIZ(boolean z) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS138S0110000_21(this, z, 3));
        } else if (z) {
            C786410Ut5.LJLLLLLL(0, getActionTvButton());
            C786410Ut5.LLFF(8, getActionIvButton());
        } else {
            C786410Ut5.LJLLLLLL(8, getActionTvButton());
            C786410Ut5.LLFF(0, getActionIvButton());
        }
    }

    public final void setButtonIcon(UrlModel urlModel) {
        if (urlModel == null) {
            return;
        }
        if (!getAttached()) {
            getPendingSetting().offer(new AwS422S0200000_21(this, urlModel, 47));
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJ(getActionIvButton());
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    public final void setButtonOnClickListener(Function1<? super View, Unit> function1) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS422S0200000_21(this, (C1394730mOl) function1, (Function1<? super View, Unit>) 48));
        } else {
            C786410Ut5.I7(new ACListenerS155S0100000_21(function1, 86), getActionButton());
        }
    }

    public final void setToolsIcon(UrlModel urlModel) {
        float fLIZJ;
        if (urlModel != null) {
            urlModel.getHeight();
            urlModel.getWidth();
            if (!getAttached()) {
                getPendingSetting().offer(new AwS422S0200000_21(this, urlModel, 49));
                return;
            }
            float fLIZJ2 = C12ES.LIZJ(64.0f, getContext());
            try {
                fLIZJ = C12ES.LIZJ((urlModel.getHeight() * 64) / urlModel.getWidth(), getContext());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                fLIZJ = C12ES.LIZJ(64.0f, getContext());
            }
            ViewGroup.LayoutParams layoutParams = getIconView().getLayoutParams();
            layoutParams.width = (int) fLIZJ2;
            layoutParams.height = (int) fLIZJ;
            C786410Ut5.G6(getIconView(), layoutParams);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LJJ(getIconView());
            c1331670kl3LJIIIIZZ.LIZLLL = true;
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            getIconView().setClipToOutline(true);
            getIconView().setOutlineProvider(new C1379000lzO(Float.valueOf(C418440Gaw.LIZIZ(2))));
        }
    }

    public C1394730mOl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1394730mOl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 705));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 706));
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 707));
    }
}
