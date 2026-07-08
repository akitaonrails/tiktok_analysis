package X;

import android.view.View;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698100RZw extends AbstractViewOnClickListenerC1637610siV {
    public boolean LLILZ = true;
    public final /* synthetic */ C698090RZv LLILZIL;
    public final /* synthetic */ VideoItemParams LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        if (this.LLILZIL.LJ && !this.LLILZ) {
            return;
        }
        IAutoDubbingService iAutoDubbingServiceLIZ = C0RT5.LIZ();
        if ((iAutoDubbingServiceLIZ != null && iAutoDubbingServiceLIZ.LIZ(this.LLILZLL.getAweme()) && !C746760TRa.LIZ().LJJLL()) || this.LLIZ) {
            IAutoDubbingService iAutoDubbingServiceLIZ2 = C0RT5.LIZ();
            if (iAutoDubbingServiceLIZ2 != null) {
                iAutoDubbingServiceLIZ2.LIZLLL(this.LLILZLL.getAweme());
            }
            if (C299180Bo4.LIZ() && (C299170Bo3.LIZIZ() || C289630BWv.LIZ() == 1)) {
                IAutoDubbingService iAutoDubbingServiceLIZ3 = C0RT5.LIZ();
                if (iAutoDubbingServiceLIZ3 != null) {
                    iAutoDubbingServiceLIZ3.LJII(this.LLILZIL.LIZJ, new DialogInterfaceOnDismissListenerC738780SyS(this, view, 4));
                }
            } else if (C299180Bo4.LIZ() && !C299170Bo3.LIZIZ() && C289630BWv.LIZ() == 2) {
                IAutoDubbingService iAutoDubbingServiceLIZ4 = C0RT5.LIZ();
                if (iAutoDubbingServiceLIZ4 != null) {
                    iAutoDubbingServiceLIZ4.LJI(this.LLILZIL.LIZJ, new DialogInterfaceOnDismissListenerC738780SyS(this, view, 5));
                }
            } else if (this.LLIZLLLIL) {
                IAutoDubbingService iAutoDubbingServiceLIZ5 = C0RT5.LIZ();
                if (iAutoDubbingServiceLIZ5 != null && iAutoDubbingServiceLIZ5.LIZLLL(this.LLILZLL.getAweme())) {
                    IAutoDubbingService iAutoDubbingServiceLIZ6 = C0RT5.LIZ();
                    if (iAutoDubbingServiceLIZ6 != null) {
                        iAutoDubbingServiceLIZ6.LJI(this.LLILZIL.LIZJ, new DialogInterfaceOnDismissListenerC738780SyS(this, view, 6));
                    }
                } else {
                    IAutoDubbingService iAutoDubbingServiceLIZ7 = C0RT5.LIZ();
                    if (iAutoDubbingServiceLIZ7 != null) {
                        iAutoDubbingServiceLIZ7.LJII(this.LLILZIL.LIZJ, new DialogInterfaceOnDismissListenerC738780SyS(this, view, 7));
                    }
                }
            }
            if (view != null) {
                view.setClickable(this.LLIZ);
            }
            this.LLILZ = this.LLIZ;
            C746760TRa.LIZ().LJJLIIIJL();
            IAutoDubbingService iAutoDubbingServiceLIZ8 = C0RT5.LIZ();
            if (iAutoDubbingServiceLIZ8 != null) {
                iAutoDubbingServiceLIZ8.LJFF(this.LLILZLL.mEventType, EnumC2748014o.CLICK.getValue(), this.LLILZLL.getAweme().getAid());
            }
        }
    }

    public final void LIZIZ(View view) {
        TuxTag tuxTag;
        C698090RZv c698090RZv = this.LLILZIL;
        if (c698090RZv.LJ) {
            Function1<Integer, Unit> function1 = c698090RZv.LIZLLL;
            if (function1 != null) {
                function1.invoke(null);
                return;
            }
            return;
        }
        if (!(view instanceof TuxTag) || (tuxTag = (TuxTag) view) == null) {
            return;
        }
        tuxTag.setTagIcon(null);
    }

    public C698100RZw(C698090RZv c698090RZv, VideoItemParams videoItemParams, boolean z, boolean z2) {
        this.LLILZIL = c698090RZv;
        this.LLILZLL = videoItemParams;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
    }
}
