package X;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ha5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209550ha5 extends FrameLayout {
    public C12P2 LL;
    public RelativeLayout LLILLJJLI;
    public C12P4 LLILLL;
    public C389030FNd LLILZ;
    public IBaseListFragmentPanel LLILZIL;
    public C1211700hdY LLILZLL;

    public final C12P2 getVideoSeekBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_seek_bar);
            this.LL = (C12P2) callbackFindViewById;
        }
        return (C12P2) callbackFindViewById;
    }

    public final RelativeLayout getVideoSeekDurationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_seek_duration);
            this.LLILLJJLI = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final C12P4 getVideoSeekDurationMaskFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_seek_duration_mask);
            this.LLILLL = (C12P4) callbackFindViewById;
        }
        return (C12P4) callbackFindViewById;
    }

    public final C389030FNd getVideoSeekThumFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_seek_thum);
            this.LLILZ = (C389030FNd) callbackFindViewById;
        }
        return (C389030FNd) callbackFindViewById;
    }

    public final C12P2 getVideoSeekBar() {
        return getVideoSeekBarFromXml();
    }

    public final C1211700hdY getVideoSeekBarController() {
        return this.LLILZLL;
    }

    public C1209550ha5(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        C20673215v0.LIZLLL(R.layout.blt, C1388190mED.LIZ(context), this, true);
    }

    public final void setLiveMode(boolean z) {
        if (z) {
            C786410Ut5.T1(this, 8);
        } else {
            C786410Ut5.T1(this, 0);
        }
    }

    public final void setVideoSeekBarFromXml(C12P2 c12p2) {
        this.LL = c12p2;
    }

    public final void setVideoSeekDurationFromXml(RelativeLayout relativeLayout) {
        this.LLILLJJLI = relativeLayout;
    }

    public final void setVideoSeekDurationMaskFromXml(C12P4 c12p4) {
        this.LLILLL = c12p4;
    }

    public final void setVideoSeekThumFromXml(C389030FNd c389030FNd) {
        this.LLILZ = c389030FNd;
    }

    public static final C1209550ha5 LIZ(ViewGroup viewGroup, final BaseListFragmentPanel baseListFragmentPanel, final VideoSeekBarMaskView videoSeekBarMaskView) {
        final ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ;
        VerticalViewPager verticalViewPager;
        C19EG c19eg;
        final C1209550ha5 c1209550ha5 = new C1209550ha5(viewGroup.getContext());
        Activity activity = baseListFragmentPanel.activity;
        final C1213920hh8 c1213920hh8 = null;
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
            scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19eg);
        } else {
            scrollSwitchStateManagerLIZIZ = null;
        }
        c1209550ha5.LLILZIL = baseListFragmentPanel;
        if (C1ER1.LIZIZ.LLJZIJLIL(null, baseListFragmentPanel.C7(true))) {
            c1213920hh8 = (C1213920hh8) c1209550ha5.findViewById(R.id.ug2);
        }
        final C12P2 videoSeekBarFromXml = c1209550ha5.getVideoSeekBarFromXml();
        final RelativeLayout videoSeekDurationFromXml = c1209550ha5.getVideoSeekDurationFromXml();
        final C12P4 videoSeekDurationMaskFromXml = c1209550ha5.getVideoSeekDurationMaskFromXml();
        final C389030FNd videoSeekThumFromXml = c1209550ha5.getVideoSeekThumFromXml();
        c1209550ha5.LLILZLL = new C1211700hdY(new C2248671Czp(videoSeekBarFromXml, videoSeekDurationFromXml, videoSeekDurationMaskFromXml, videoSeekThumFromXml, scrollSwitchStateManagerLIZIZ, baseListFragmentPanel, videoSeekBarMaskView, c1213920hh8) { // from class: X.1Czr
            public final C1D0A LLLIILIL;

            @Override // X.C2248671Czp
            public final String LJIILIIL() {
                return "DetailSeekBarControl";
            }

            @Override // X.C2248671Czp, X.InterfaceC1211710hdZ
            public final void LJFF() {
                LJIIJJI().LIZ();
                this.LL.setSeekBarShowType(LJIIL(false));
            }

            @Override // X.C2248671Czp, X.InterfaceC1211710hdZ
            public final void onDestroy() {
                Fragment fragment;
                IDetailFeedSafService iDetailFeedSafService;
                C128Y c128yLIZLLL;
                InterfaceC655270Pn3 interfaceC655270Pn3;
                if (C287370BOd.LIZ()) {
                    IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJJJJJIL;
                    if (iBaseListFragmentPanel == null || (fragment = iBaseListFragmentPanel.getFragment()) == null || (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) == null || (c128yLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) == null) {
                        ((InterfaceC655270Pn3) C1388190mED.LIZIZ(this.LL.getContext())).unRegisterActivityOnKeyDownListener(this.LLLIILIL);
                    } else if ((c128yLIZLLL instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) c128yLIZLLL) != null) {
                        interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this.LLLIILIL);
                    }
                }
                super.onDestroy();
            }

            @Override // X.C2248671Czp
            public final boolean LJIIZILJ(Object obj) {
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object obj6;
                Object obj7 = null;
                if (obj instanceof C1584420rKi) {
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
                if (Intrinsics.LJFF(obj, obj2)) {
                    return Intrinsics.LJFF(((C1584420rKi) obj).LIZLLL, this.LLJJJJJIL);
                }
                if (obj instanceof C1D01) {
                    obj3 = obj;
                } else {
                    obj3 = null;
                }
                if (Intrinsics.LJFF(obj, obj3)) {
                    if (Intrinsics.LJFF(((C1D01) obj).LIZLLL, this.LLJJJJJIL)) {
                        return true;
                    }
                    C786410Ut5.a0(this.LL, 8);
                    LJIIJJI().LIZ();
                    return false;
                }
                if (obj instanceof C722910SXh) {
                    obj4 = obj;
                } else {
                    obj4 = null;
                }
                if (Intrinsics.LJFF(obj, obj4)) {
                    return Intrinsics.LJFF(((C722910SXh) obj).LIZLLL, this.LLJJJJJIL);
                }
                if (obj instanceof C16ED) {
                    obj5 = obj;
                } else {
                    obj5 = null;
                }
                if (!Intrinsics.LJFF(obj, obj5)) {
                    if (obj instanceof C2248751Czx) {
                        obj6 = obj;
                    } else {
                        obj6 = null;
                    }
                    if (Intrinsics.LJFF(obj, obj6)) {
                        C2248751Czx c2248751Czx = (C2248751Czx) obj;
                        if (!Intrinsics.LJFF(c2248751Czx.LIZLLL, this.LLJJJJJIL)) {
                            WeakReference<IBaseListFragmentPanel> weakReference = c2248751Czx.LJ;
                            if (weakReference != null) {
                                obj7 = weakReference.get();
                            }
                            if (Intrinsics.LJFF(obj7, this.LLJJJJJIL)) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    if (obj instanceof C588040N4o) {
                        obj7 = obj;
                    }
                    if (Intrinsics.LJFF(obj, obj7)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // X.C2248671Czp, X.C0JO2
            public final void onStopTrackingTouch(SeekBar seekBar) {
                super.onStopTrackingTouch(seekBar);
                C1440005kM.LIZ(new C1209360hZm(false, this.LLJJ, this.LLJJJJJIL));
                this.LLJJJIL = false;
            }

            @Override // X.C2248671Czp, X.InterfaceC1211710hdZ
            public final void LIZ(float f, boolean z) {
                if (!this.LLJJJIL) {
                    C1440005kM.LIZ(new C1209360hZm(true, this.LLJJ, this.LLJJJJJIL));
                    this.LLJJJIL = true;
                }
                super.LIZ(f, z);
            }

            @Override // X.C2248671Czp, X.C0JO2
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                Context context;
                super.onProgressChanged(seekBar, i, z);
                if ((!this.LLJJI.isEmpty()) && z) {
                    float f = (i / 100.0f) / 100.0f;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(((Number) C07DK.LIZ.getValue()).floatValue())) / this.LLJILJIL;
                    Iterator it2 = ((ArrayList) this.LLJJI).iterator();
                    while (it2.hasNext()) {
                        float f2 = ((SearchKeyFramePoint) it2.next()).LIZIZ;
                        if (f2 < f + fLIZIZ && f2 > f - fLIZIZ && jCurrentTimeMillis - this.LLL > 1000) {
                            if (seekBar != null && (context = seekBar.getContext()) != null) {
                                new C0ZDN(context).LIZ(3);
                            }
                            this.LLL = jCurrentTimeMillis;
                            return;
                        }
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.0mWD, X.1D0A] */
            {
                IDetailFeedSafService iDetailFeedSafService;
                C128Y c128yLIZLLL;
                InterfaceC655270Pn3 interfaceC655270Pn3;
                super(videoSeekBarFromXml, videoSeekDurationFromXml, videoSeekDurationMaskFromXml, videoSeekThumFromXml, scrollSwitchStateManagerLIZIZ, videoSeekBarMaskView, c1213920hh8);
                ?? r2 = new InterfaceC1399350mWD() { // from class: X.1D0A
                    @Override // X.InterfaceC1399350mWD
                    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                        return false;
                    }

                    @Override // X.InterfaceC1399350mWD
                    public final boolean Fi() {
                        return this.LL.LLJJIJIL;
                    }
                };
                this.LLLIILIL = r2;
                if (C287370BOd.LIZ()) {
                    Fragment fragment = baseListFragmentPanel.getFragment();
                    if (fragment != null && (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) != null && (c128yLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
                        if ((c128yLIZLLL instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) c128yLIZLLL) != 0) {
                            interfaceC655270Pn3.registerActivityOnKeyDownListener(r2);
                        }
                    } else {
                        ((InterfaceC655270Pn3) C1388190mED.LIZIZ(videoSeekBarFromXml.getContext())).registerActivityOnKeyDownListener(r2);
                    }
                }
                this.LLJJJJJIL = baseListFragmentPanel;
                C1210140hb2.LIZ(videoSeekBarFromXml, videoSeekDurationFromXml, videoSeekDurationMaskFromXml, videoSeekThumFromXml, c1213920hh8, LJIJJ());
            }
        });
        if (!baseListFragmentPanel.LLLLIIIILLL.isPlaylistCleanMode() && (verticalViewPager = baseListFragmentPanel.LLJJIJI) != null) {
            verticalViewPager.LIZJ(new C360660ECa() { // from class: X.0VWo
                @Override // X.C360660ECa, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i == 0) {
                        C786410Ut5.T1(this.LL, 0);
                    } else {
                        C786410Ut5.T1(this.LL, 8);
                    }
                }
            });
        }
        viewGroup.addView(c1209550ha5);
        return c1209550ha5;
    }
}
