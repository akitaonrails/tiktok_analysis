package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IAILiveServiceKt;
import com.ss.android.ugc.aweme.services.external.ImageMonitorParams;
import kotlin.jvm.internal.AwS170S1100000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS53S0000100_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mTC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397480mTC extends C1394730mOl {
    public static final /* synthetic */ int LLJIJIL = 0;

    public C1397480mTC(Context context) {
        super(context, null, 0);
    }

    public final void LIZJ(UrlModel urlModel) {
        float fLIZJ;
        InterfaceC658750Psf interfaceC658750PsfProvideImageMonitorListener;
        if (urlModel == null) {
            return;
        }
        if (!getAttached()) {
            getPendingSetting().offer(new AwS422S0200000_21(this, urlModel, 86));
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJ(getIconView());
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        IAILiveService aiLiveService = IAILiveServiceKt.getAiLiveService();
        if (aiLiveService != null) {
            interfaceC658750PsfProvideImageMonitorListener = aiLiveService.provideImageMonitorListener(new ImageMonitorParams("anchor_panel", new AwS53S0000100_21(jCurrentTimeMillis, 0), new AwS565S0100000_21(this, 1275)));
        } else {
            interfaceC658750PsfProvideImageMonitorListener = null;
        }
        c1331670kl3LJIIIIZZ.LJJJIL = interfaceC658750PsfProvideImageMonitorListener;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        getIconView().setClipToOutline(true);
        getIconView().setOutlineProvider(new C1379000lzO(Float.valueOf(C0H9H.LIZ(2))));
    }

    public final void LIZLLL(String str) {
        if (str == null) {
            return;
        }
        if (!getAttached()) {
            getPendingSetting().offer(new AwS170S1100000_21(this, str, 6));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getIconView().getLayoutParams();
        layoutParams.width = (int) C12ES.LIZJ(64.0f, getContext());
        layoutParams.height = (int) C12ES.LIZJ(64.0f, getContext());
        C786410Ut5.G6(getIconView(), layoutParams);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIZ.LJJ(getIconView());
        c1331670kl3LJIIIZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        getIconView().setClipToOutline(true);
        getIconView().setOutlineProvider(new C1379000lzO(Float.valueOf(C0H9H.LIZ(2))));
    }
}
