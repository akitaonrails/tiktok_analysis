package X;

import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.bot.waiting.SearchTakoWaitingListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0FE5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FE5 extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ ImageView LL;
    public final /* synthetic */ int LLILLJJLI = 40;
    public final /* synthetic */ int LLILLL = 40;
    public final /* synthetic */ SearchTakoWaitingListAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FE5(SmartImageView smartImageView, SearchTakoWaitingListAssem searchTakoWaitingListAssem) {
        super(2);
        this.LL = smartImageView;
        this.LLILZ = searchTakoWaitingListAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        int i;
        bool.booleanValue();
        try {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.fromFile(new C0VSJ(str)));
            ImageView imageView = this.LL;
            if (imageView instanceof SmartImageView) {
                c1331670kl3LJI.LJJ((InterfaceC1334290kpH) imageView);
            } else {
                c1331670kl3LJI.LJJI(imageView);
            }
            SearchTakoWaitingListAssem searchTakoWaitingListAssem = this.LLILZ;
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (searchTakoWaitingListAssem.LLJLLIL) {
                i = R.raw.icon_color_tako_dark;
            } else {
                i = R.raw.icon_color_tako_light;
            }
            c419910GdJ.LIZ = i;
            c1331670kl3LJI.LJIL(c419910GdJ.LIZ(this.LL.getContext()));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
            c1331670kl3LJI.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJI.LJIIIZ = iLIZIZ2;
            c1331670kl3LJI.LJIIJJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
