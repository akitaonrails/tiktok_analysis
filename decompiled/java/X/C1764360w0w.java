package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import irm.AkS93S0100000_26;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS110S1000000_26;
import kotlin.jvm.internal.AwS39S1110000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764360w0w extends AbstractC1764180w0e {
    public C1766620w4a LLILZIL;
    public SmartImageView LLILZLL;
    public SmartImageView LLIZ;
    public View LLIZLLLIL;
    public LinearLayout LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public SeekBar LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public Function1<? super Boolean, Unit> LLJJI;
    public final C01GW LLJJIII;
    public String LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super InterfaceC20270014Ta, Unit> LLJJJ;
    public boolean LLJJJIL;

    public final boolean LIZIZ() {
        C1766620w4a c1766620w4a;
        C1766620w4a c1766620w4a2 = this.LLILZIL;
        return (c1766620w4a2 == null || !c1766620w4a2.LJIJ() || (c1766620w4a = this.LLILZIL) == null || c1766620w4a.LLILZ) ? false : true;
    }

    public final int getDuration() {
        C1766620w4a c1766620w4a = this.LLILZIL;
        if (c1766620w4a != null) {
            return c1766620w4a.getDuration();
        }
        return 0;
    }

    public final ISeaListHelper getListHelper() {
        return (ISeaListHelper) this.LLJJ.getValue();
    }

    public final PageStateContext getPageStateContext() {
        return (PageStateContext) this.LLJJIII.getValue();
    }

    public final String getVideoId() {
        C1766620w4a c1766620w4a = this.LLILZIL;
        if (c1766620w4a != null) {
            return c1766620w4a.getVideoId();
        }
        return null;
    }

    public final Function1<Boolean, Unit> getAudioListener() {
        return this.LLJJI;
    }

    public final boolean getLastOtherPageMuteState() {
        return this.LLJJJIL;
    }

    public final boolean getManuallyPause() {
        return this.LLJJIJIL;
    }

    public final int getPlayDuration() {
        return this.LLJJIJIIJIL;
    }

    public final int getPlayProgress() {
        return this.LLJJIJIIJIL;
    }

    public final String getVideoType() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1764180w0e
    public final View LIZ(Context context) {
        C1766620w4a c1766620w4a;
        Lifecycle lifecycle;
        int iHashCode = 0;
        C1755600vmo.LIZ.getClass();
        View viewLIZ = C1755600vmo.LIZ(R.layout.ata, context, this, false, false);
        this.LLILZIL = (C1766620w4a) viewLIZ.findViewById(R.id.video_view);
        Fragment fragment = getFragment();
        if (fragment != null && (c1766620w4a = this.LLILZIL) != null) {
            LifecycleOwner lifecycleOwner = c1766620w4a.LLJLLIL;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(c1766620w4a);
            }
            fragment.getLifecycle().addObserver(c1766620w4a);
            c1766620w4a.LLJLLIL = fragment;
        }
        this.LLIZ = (SmartImageView) viewLIZ.findViewById(R.id.c4m);
        this.LLILZLL = (SmartImageView) viewLIZ.findViewById(R.id.cover);
        this.LLIZLLLIL = viewLIZ.findViewById(R.id.qmn);
        this.LLJ = (LinearLayout) viewLIZ.findViewById(R.id.qm_);
        this.LLJI = (TuxIconView) viewLIZ.findViewById(R.id.qmj);
        this.LLJIJIL = (TuxIconView) viewLIZ.findViewById(R.id.qn8);
        this.LLJILJIL = (TuxIconView) viewLIZ.findViewById(R.id.qma);
        this.LLJILJILJ = (SeekBar) viewLIZ.findViewById(R.id.video_progress_bar);
        C1766620w4a c1766620w4a2 = this.LLILZIL;
        if (c1766620w4a2 != null) {
            c1766620w4a2.setVodTag("gec_head_creator_video");
        }
        C1766620w4a c1766620w4a3 = this.LLILZIL;
        if (c1766620w4a3 != null) {
            c1766620w4a3.setVodSceneTag("gec_head_creator_video_scene");
        }
        C1766620w4a c1766620w4a4 = this.LLILZIL;
        if (c1766620w4a4 != null) {
            c1766620w4a4.setObjectFit("contain");
        }
        C1766620w4a c1766620w4a5 = this.LLILZIL;
        if (c1766620w4a5 != null) {
            c1766620w4a5.setLoop(true);
        }
        C1766620w4a c1766620w4a6 = this.LLILZIL;
        if (c1766620w4a6 != null) {
            c1766620w4a6.setSinglePlayer(true);
        }
        C1766620w4a c1766620w4a7 = this.LLILZIL;
        if (c1766620w4a7 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pdp_head_video_scene_");
            InterfaceC665370Q7z vScope = getVScope();
            if (vScope != null) {
                iHashCode = vScope.hashCode();
            }
            sbLIZ.append(iHashCode);
            c1766620w4a7.setSinglePlayerScene(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1766620w4a c1766620w4a8 = this.LLILZIL;
        if (c1766620w4a8 != null) {
            c1766620w4a8.setAutoLifecycle(true);
        }
        C1766620w4a c1766620w4a9 = this.LLILZIL;
        if (c1766620w4a9 != null) {
            c1766620w4a9.setScrollObservable(true);
        }
        C1766620w4a c1766620w4a10 = this.LLILZIL;
        if (c1766620w4a10 != null) {
            c1766620w4a10.setVideoStateChangedCallback(new InterfaceC1764820w1g() { // from class: X.0w1O
                @Override // X.InterfaceC1764820w1g
                public final void LIZ(boolean z) {
                    if (z) {
                        TuxIconView tuxIconView = this.LIZ.LLJIJIL;
                        if (tuxIconView != null) {
                            tuxIconView.setIconRes(R.raw.icon_speaker_x_mark_fill_ltr);
                            return;
                        }
                        return;
                    }
                    TuxIconView tuxIconView2 = this.LIZ.LLJIJIL;
                    if (tuxIconView2 == null) {
                        return;
                    }
                    tuxIconView2.setIconRes(R.raw.icon_speaker_2_fill_ltr);
                }
            });
        }
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS93S0100000_26(this, 3), tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AkS93S0100000_26(this, 4), tuxIconView2);
        }
        TuxIconView tuxIconView3 = this.LLJILJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.I7(new AkS93S0100000_26(this, 5), tuxIconView3);
        }
        C1766620w4a c1766620w4a11 = this.LLILZIL;
        if (c1766620w4a11 != null) {
            c1766620w4a11.setStateChangeReporter(new AwS675S0100000_26(this, 22));
        }
        return viewLIZ;
    }

    public final void LIZJ(String str) {
        Object objLIZ;
        PageStateContext pageStateContext = getPageStateContext();
        if (pageStateContext != null) {
            objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
        } else {
            objLIZ = null;
        }
        C1748720vbi.LIZLLL(this, new C049Y(), new AwS39S1110000_26(Intrinsics.LJFF(objLIZ, 2), this, str, 3));
    }

    public final void LJ(Boolean bool) {
        C1766620w4a c1766620w4a;
        if (bool != null && (c1766620w4a = this.LLILZIL) != null) {
            c1766620w4a.setMuted(bool.booleanValue());
        }
        C1766620w4a c1766620w4a2 = this.LLILZIL;
        if (c1766620w4a2 != null) {
            if (C1766620w4a.LLLJIL) {
                c1766620w4a2.LJIJJLI("playMedia");
            }
            c1766620w4a2.LLLFFI = true;
            c1766620w4a2.LIZ(null);
        }
        C1766620w4a c1766620w4a3 = this.LLILZIL;
        if (c1766620w4a3 != null) {
            c1766620w4a3.setClickPlayWhenHalfScreen(true);
        }
    }

    public final void setAudioListener(Function1<? super Boolean, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setAutoPlay(boolean z) {
        C1766620w4a c1766620w4a = this.LLILZIL;
        if (c1766620w4a != null) {
            c1766620w4a.setAutoPlay(z);
        }
    }

    public final void setLastOtherPageMuteState(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setManuallyPause(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setMuted(boolean z) {
        C1766620w4a c1766620w4a = this.LLILZIL;
        if (c1766620w4a != null) {
            c1766620w4a.LJJI(z, EnumC1308950kAP.ACTIVE);
        }
        C1766620w4a c1766620w4a2 = this.LLILZIL;
        if (c1766620w4a2 != null) {
            c1766620w4a2.LIZIZ();
        }
        Function1<? super Boolean, Unit> function1 = this.LLJJI;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public final void setPlayDuration(int i) {
        this.LLJJIJIIJIL = i;
    }

    public final void setVideo(String str) {
        C1766620w4a c1766620w4a = this.LLILZIL;
        if (c1766620w4a != null) {
            c1766620w4a.setSrc(str);
        }
        C1766620w4a c1766620w4a2 = this.LLILZIL;
        if (c1766620w4a2 != null) {
            c1766620w4a2.LJIIIIZZ();
        }
    }

    public final void setVideoBackground(Image image) {
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LJIL = Bitmap.Config.RGB_565;
        c1331670kl3LIZLLL.LJJIFFI = new C1332060klg(25, 3, 0);
        c1331670kl3LIZLLL.LJJ(this.LLIZ);
        C786410Ut5.h3(c1331670kl3LIZLLL);
    }

    public final void setVideoStateListener(InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super InterfaceC20270014Ta, Unit> interfaceC1631620sYq) {
        this.LLJJJ = interfaceC1631620sYq;
    }

    public final void setVideoType(String str) {
        this.LLJJIJI = str;
    }

    public final void LIZLLL(TuxIconView tuxIconView, String str) {
        Object objLIZ;
        PageStateContext pageStateContext = getPageStateContext();
        if (pageStateContext != null) {
            objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
        } else {
            objLIZ = null;
        }
        boolean zLJFF = Intrinsics.LJFF(objLIZ, 2);
        if (tuxIconView != null) {
            C1748720vbi.LJFF(tuxIconView, new C049X(), new AwS110S1000000_26(str, 0), new AwS39S1110000_26(zLJFF, this, str, 4));
        }
    }

    public final void LJFF(boolean z, EnumC1764120w0Y enumC1764120w0Y) {
        if (z) {
            C1766620w4a c1766620w4a = this.LLILZIL;
            if (c1766620w4a != null && c1766620w4a.LLLIILIL) {
                c1766620w4a.LLLILZJ = false;
                if ((1 & c1766620w4a.LLLIL) != 0) {
                    c1766620w4a.LLLIL = 0;
                    c1766620w4a.LJJ();
                    return;
                }
                return;
            }
            return;
        }
        C1766620w4a c1766620w4a2 = this.LLILZIL;
        if (c1766620w4a2 == null || !c1766620w4a2.LLLIILIL) {
            return;
        }
        if (enumC1764120w0Y == EnumC1764120w0Y.BLACK_PAGE) {
            c1766620w4a2.LLLILZJ = true;
        }
        if (!c1766620w4a2.LJIJ()) {
            return;
        }
        c1766620w4a2.LLLIL = 1;
        c1766620w4a2.LJIL(EnumC1308950kAP.PASSIVE);
    }

    public C1764360w0w(Context context, InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment) {
        super(context, (AttributeSet) null, 0, interfaceC665370Q7z, fragment);
        this.LLJILLL = true;
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1278));
        this.LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1279));
    }
}
