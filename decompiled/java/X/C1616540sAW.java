package X;

import Y.ARunnableS111S0100000_11;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.ITabletBottomControlBar;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.PersonalizedFeedTabConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0sAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616540sAW implements InterfaceC1616480sAQ {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static C0P0T LJ;
    public static String LJFF;
    public static int LJI;
    public static final C1616540sAW LIZ = new C1616540sAW();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(456));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(240));

    @Override // X.InterfaceC1616480sAQ
    public final void LJJIJLIJ() {
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJLJLLL() {
        return true;
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LLJLILLLLZIIL() {
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLJLLIL() {
        return true;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLLFZ() {
        return true;
    }

    @Override // X.InterfaceC1616480sAQ
    public final C0RG7 LJIIJ() {
        C20595015iO.LIZ.getClass();
        if (!C20595015iO.LJ()) {
            C20593115i5.LIZ.getClass();
            if (!C20593115i5.LJIIIIZZ(null)) {
                return (C20594315iH.LIZIZ() || (C20594315iH.LIZ() == 600 && ((Number) C04VA.LIZ.getValue()).intValue() == 1)) ? C1616590sAb.LLILLL : new AbstractC533970Kwt() { // from class: X.0Kwu
                    @Override // X.C0RG7
                    public final boolean LIZLLL() {
                        return false;
                    }

                    @Override // X.C0RG7
                    public final C533990Kwv LIZIZ(C533990Kwv c533990Kwv) {
                        return AbstractC533970Kwt.LJ(c533990Kwv);
                    }

                    @Override // X.AbstractC533970Kwt
                    public final boolean LJFF(C533990Kwv c533990Kwv) {
                        if (c533990Kwv.LIZ > 0 && c533990Kwv.LIZIZ > 0 && c533990Kwv.LIZJ > 0 && c533990Kwv.LIZLLL > 0) {
                            return true;
                        }
                        return false;
                    }
                };
            }
        }
        return C1616590sAb.LLILLL;
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LJIILLIIL() {
        return ((Number) C0AV4.LIZ.getValue()).intValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LJJIIJZLJL() {
        if (C1616560sAY.LIZ("ITabletFeed.getVideoImageLayoutMode")) {
            return 1;
        }
        if (C1616610sAd.LJIJJ().getBoolean("get_video_image_layout_is_first", true)) {
            C1616610sAd.LJIJJ().storeBoolean("get_video_image_layout_is_first", false);
            return 1;
        }
        C20594415iI.LIZ.getClass();
        return !C20594415iI.LIZ(null) ? 1 : 0;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJJIZ() {
        C20593115i5.LIZ.getClass();
        return !C20593115i5.LJIIIIZZ(null) && ((Number) C264040AWk.LIZ.getValue()).intValue() == 2;
    }

    @Override // X.InterfaceC1616480sAQ
    public final float LJJJ() {
        return ((Number) C2556109zz.LIZ.getValue()).floatValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJJJI() {
        C20593115i5.LIZ.getClass();
        return (C20593115i5.LJIIIIZZ(null) || C1616660sAi.LIZLLL() || !C0C64.LJIILLIIL().LJIIIZ(31744, "pad_redesign_background_color", true, false)) ? false : true;
    }

    @Override // X.InterfaceC1616480sAQ
    public final C1A2M LJJLIIIJ() {
        return (C744920TJy) LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJJLJ() {
        return ((Number) C0AVA.LIZ.getValue()).intValue() > 0 && ((Number) C2555909zx.LIZ.getValue()).floatValue() > 0.0f;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJJZ() {
        return ((Boolean) C0AV3.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJL() {
        return ((Boolean) C306240BzS.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJLILLLLZI() {
        return ((Number) C0AVI.LIZ.getValue()).intValue() == 1;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJLLILLLL() {
        return ((Boolean) C0AV8.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LL() {
        return ((Boolean) C0AVS.LIZ.getValue()).booleanValue() && ((Number) C0AVI.LIZ.getValue()).intValue() != 3;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLFII() {
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIIIIZZ(null)) {
            return false;
        }
        int iIntValue = ((Number) C264040AWk.LIZ.getValue()).intValue();
        return iIntValue == 1 || iIntValue == 2;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLIFFJFJJ() {
        return ((Boolean) C0AV5.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLII() {
        return ((Boolean) C0AVB.LIZ.getValue()).booleanValue() && C1616610sAd.LJIJJ().getInt("tablet_playlist_tooltip_count", 0) < 3 && !LIZLLL;
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC690260R5s LLILLIZIL() {
        return C1616560sAY.LIZ("ITabletFeed.getVideoViewHelper") ? C1616510sAT.LIZ : C0SKL.LIZ;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLJJIJIL() {
        if (!((Boolean) C263860AVs.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C20593115i5.LIZ.getClass();
        return !C20593115i5.LJIIIIZZ(null);
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLJJLIIIJLLLLLLLZ() {
        return !C1616560sAY.LIZ("ITabletFeed.isSwipeOptOpen");
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLJZ() {
        return ((Number) C0AVI.LIZ.getValue()).intValue() == 2;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLL() {
        return ((Boolean) C306230BzR.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLLI() {
        C20594415iI.LIZ.getClass();
        return C20594415iI.LIZ(null);
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLLIIII() {
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIIIIZZ(null)) {
            return false;
        }
        int iIntValue = ((Number) C264040AWk.LIZ.getValue()).intValue();
        return iIntValue == 1 || iIntValue == 2;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLLIIIIL() {
        return ((Boolean) C263850AVr.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLLJIL() {
        C20593115i5.LIZ.getClass();
        return (C20593115i5.LJIIIIZZ(null) || C1616660sAi.LIZLLL() || !C0C64.LJIILLIIL().LJIIIZ(31744, "pad_redesign_tab_bar_spacing", true, false)) ? false : true;
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LLLJL() {
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIIIIZZ(null)) {
            return;
        }
        C1616660sAi.LIZLLL();
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLLLIIIILLL() {
        C20593115i5.LIZ.getClass();
        return (C20593115i5.LJIIIIZZ(null) || C1616660sAi.LIZLLL() || !C0C64.LJIILLIIL().LJIIIZ(31744, "pad_redesign_tab_bar", true, false)) ? false : true;
    }

    @Override // X.InterfaceC1616480sAQ
    public final ITabletBottomControlBar LLLLIILLL() {
        return (ITabletBottomControlBar) PluggableExtentionKt.pluggableSpi$default(ITabletBottomControlBar.class, false, false, false, 14, null);
    }

    @Override // X.InterfaceC1616480sAQ
    public final void Z5() {
        C0P0T c0p0t = LJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJJIJL() {
        return LJLILLLLZI() || LLJZ() || ((Number) C0AVI.LIZ.getValue()).intValue() == 3;
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LJJJLIIL() {
        C1616610sAd.LJIJJ().storeLong("tablet_playlist_exp_install_time", System.currentTimeMillis());
    }

    @Override // X.InterfaceC1616480sAQ
    public final String LJJJLZIJ() {
        return LLLI() ? "intro_tablet_horizontal_swipe_up_tux_lottie.json" : "";
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLJILLL() {
        long j = C1616610sAd.LJIJJ().getLong("tablet_playlist_exp_install_time", -1L);
        return j < 0 && System.currentTimeMillis() - j > 604800000;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLLJ() {
        return C13WW.LIZ();
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC1563540qn2 LJIL() {
        return C13WY.LIZ;
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC732170Snn LJJL() {
        return C737680Swg.LIZ;
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC606700Nqu LJLLI() {
        return new InterfaceC606700Nqu() { // from class: X.0m9g
            public static boolean LIZIZ;
            public static Function1<? super Boolean, Unit> LIZJ;

            @Override // X.InterfaceC606700Nqu
            public final boolean LJJIII() {
                C01GW c01gw = C0AV6.LIZ;
                return ((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2;
            }

            @Override // X.InterfaceC606700Nqu
            public final boolean LJ() {
                return LIZIZ;
            }

            @Override // X.InterfaceC606700Nqu
            public final void LJJLIIIJLJLI(boolean z) {
                LIZIZ = z;
            }

            @Override // X.InterfaceC606700Nqu
            public final void LJLJJI(AwS588S0100000_9 awS588S0100000_9) {
                LIZJ = awS588S0100000_9;
            }

            @Override // X.InterfaceC606700Nqu
            public final void LJZL(boolean z) {
                Function1<? super Boolean, Unit> function1 = LIZJ;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }

            @Override // X.InterfaceC606700Nqu
            public final boolean LJJIIJ(float f, Aweme aweme) {
                int duration;
                Video video;
                if (C1D0F.LIZ.isConnected()) {
                    return false;
                }
                if (aweme != null && (video = aweme.getVideo()) != null) {
                    duration = video.getDuration();
                } else {
                    duration = 0;
                }
                if (duration <= TimeUnit.MINUTES.toMillis(1L) && f == 1.0f) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC606700Nqu
            public final void LLJIJIL(C19EG c19eg, View view, String str, float f) {
                boolean z;
                boolean z2;
                boolean z3;
                String strJ4 = str;
                Integer numValueOf = null;
                if (C1389340mG4.LIZJ(c19eg, null).LIZIZ() > 600) {
                    z = true;
                } else {
                    z = false;
                }
                if (f == 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    strJ4 = c19eg.getResources().getString(2131840502);
                } else if (((Number) C0AV6.LIZ.getValue()).intValue() != 2 || z) {
                    strJ4 = C786410Ut5.j4(c19eg.getResources().getString(2131840503), Arrays.copyOf(new Object[]{strJ4}, 1));
                }
                C1383230m6D c1383230m6D = new C1383230m6D(null, 31);
                C1389920mH0 c1389920mH0 = c1383230m6D.LIZ;
                c1389920mH0.LIZIZ = strJ4;
                c1389920mH0.LJ = 3000L;
                if (!z && ((Number) C0AV6.LIZ.getValue()).intValue() == 2) {
                    numValueOf = Integer.valueOf(R.raw.icon_play_fill);
                }
                if (((Number) C0AV6.LIZ.getValue()).intValue() == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                new C1390080mHG(c19eg, view, c1383230m6D, numValueOf, numValueOf, z3, false, 64).LJJIIJZLJL();
            }
        };
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LJLLL() {
        return LIZIZ;
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC704100Rjc LLFF() {
        return new InterfaceC704100Rjc() { // from class: X.0DRm
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2496));
            public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2497));

            @Override // X.InterfaceC704100Rjc
            public final boolean LIZ() {
                return ((Number) LIZJ.getValue()).intValue() == 1;
            }

            @Override // X.InterfaceC704100Rjc
            public final boolean LIZJ() {
                return ((Boolean) LIZIZ.getValue()).booleanValue();
            }

            @Override // X.InterfaceC704100Rjc
            public final boolean LJ() {
                return ((Number) LIZJ.getValue()).intValue() == 2;
            }

            @Override // X.InterfaceC704100Rjc
            public final int LJFF() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            }

            @Override // X.InterfaceC704100Rjc
            public final void LIZIZ(C0SOW c0sow) {
                if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
                    return;
                }
                if (((Number) LIZJ.getValue()).intValue() == 3) {
                    if (c0sow != null) {
                        c0sow.setBackgroundResource(R.drawable.dde);
                    } else {
                        return;
                    }
                } else if (c0sow == null) {
                    return;
                }
                C426750GoL.LJIIIZ(c0sow, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
            }

            @Override // X.InterfaceC704100Rjc
            public final boolean LIZLLL(Integer num, Integer num2) {
                int iLIZIZ;
                int iLIZ;
                C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
                if (num != null) {
                    iLIZIZ = num.intValue();
                } else {
                    iLIZIZ = c1389350mG5LIZJ.LIZIZ();
                }
                if (num2 != null) {
                    iLIZ = num2.intValue();
                } else {
                    iLIZ = c1389350mG5LIZJ.LIZ();
                }
                if (iLIZIZ > 600 && iLIZ > 650 && ((Boolean) LIZIZ.getValue()).booleanValue()) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC1582890rIF LLI() {
        return new InterfaceC1582890rIF() { // from class: X.0rIf
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(455));
            public static final Map<Integer, InterfaceC1583180rIi> LIZJ = new LinkedHashMap();

            @Override // X.InterfaceC1582890rIF
            public final boolean LJJLIIIJJIZ() {
                return !LIZJ.isEmpty();
            }

            @Override // X.InterfaceC1582890rIF
            public final void LLF() {
                Iterator it2 = ((LinkedHashMap) LIZJ).entrySet().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1583180rIi) ((Map.Entry) it2.next()).getValue()).LIZ();
                }
            }

            @Override // X.InterfaceC1582890rIF
            public final int LLILZIL() {
                C1583140rIe.LIZ.getClass();
                return C1583140rIe.LIZIZ().tabs.size();
            }

            @Override // X.InterfaceC1582890rIF
            public final void LLLIIIL() {
                ((Keva) LIZIZ.getValue()).storeBoolean("pad_personalized_topic_show_tooltip", false);
            }

            @Override // X.InterfaceC1582890rIF
            public final String getDataSource() {
                C1583140rIe.LIZ.getClass();
                return C1583140rIe.LIZIZ().dataSource;
            }

            @Override // X.InterfaceC1582890rIF
            public final boolean LJIIJJI(int i) {
                if (i == 0 && ((Keva) LIZIZ.getValue()).getBoolean("pad_personalized_topic_show_tooltip", true)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1582890rIF
            public final void LJIIL(C1582880rIE c1582880rIE) throws JSONException {
                C1583140rIe.LIZ.getClass();
                AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c1582880rIE, 1207);
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    awS568S0100000_24.invoke();
                } else {
                    C2487409ou.LIZJ(new ARunnableS113S0100000_13(awS568S0100000_24, (Function0<Unit>) 122));
                }
            }

            @Override // X.InterfaceC1582890rIF
            public final boolean LJIJI(int i) {
                if (LLLL(i).LIZ && !Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE) && C703302op.LIZ(getDataSource())) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1582890rIF
            public final void LJJIL(int i) {
                C1583140rIe.LIZ.getClass();
                Keva keva = (Keva) C1583140rIe.LJ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pad_personalized_enable_red_dot_topic_id_");
                sbLIZ.append(i);
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            }

            @Override // X.InterfaceC1582890rIF
            public final InterfaceC1583180rIi LJLJLJ(int i) {
                InterfaceC1583180rIi interfaceC1583180rIi = (InterfaceC1583180rIi) ((LinkedHashMap) LIZJ).get(Integer.valueOf(i));
                if (interfaceC1583180rIi == null) {
                    return new InterfaceC1583180rIi() { // from class: X.0rIh
                        @Override // X.InterfaceC1583180rIi
                        public final void LIZ() {
                        }
                    };
                }
                return interfaceC1583180rIi;
            }

            @Override // X.InterfaceC1582890rIF
            public final PersonalizedFeedTabConfig LLLL(int i) {
                C1583140rIe.LIZ.getClass();
                PersonalizedFeedTabConfig personalizedFeedTabConfig = (PersonalizedFeedTabConfig) C13LP.LJJJLZIJ(i, C1583140rIe.LIZIZ().tabs);
                if (personalizedFeedTabConfig == null) {
                    return new PersonalizedFeedTabConfig(false, 0, "", "", "", false, null);
                }
                return personalizedFeedTabConfig;
            }

            @Override // X.InterfaceC1582890rIF
            public final void LLJJI(int i, C1582930rIJ c1582930rIJ) {
                LIZJ.put(Integer.valueOf(i), c1582930rIJ);
            }
        };
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC1611090s1j LLILZLL() {
        return C21392918nn.LIZ;
    }

    @Override // X.InterfaceC1616480sAQ
    public final C0R7C LLJJJJ() {
        return new C0R7C() { // from class: X.0S0z
            @Override // X.C0R7C
            public final boolean LJI() {
                return true;
            }

            @Override // X.C0R7C
            public final boolean LJFF() {
                return ((Number) C0AVJ.LIZ.getValue()).intValue() > 0;
            }

            @Override // X.C0R7C
            public final double LJIIIIZZ() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(350));
            }

            @Override // X.C0R7C
            public final boolean LJIIIZ() {
                C20593115i5.LIZ.getClass();
                return ((C20593115i5.LJIILIIL() && !C20593115i5.LJIIIIZZ(null)) || C20593115i5.LJIIIIZZ(null)) && !LJFF();
            }

            @Override // X.C0R7C
            public final boolean LIZJ() {
                return LJIIIZ();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
            @Override // X.C0R7C
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZIZ(int r4) {
                /*
                    r3 = this;
                    int r1 = X.C1389340mG4.LJ()
                    r0 = 800(0x320, float:1.121E-42)
                    r2 = 0
                    if (r1 > r0) goto L10
                    r0 = 650(0x28a, float:9.11E-43)
                    if (r1 <= r0) goto L2f
                    r0 = 2
                    if (r4 != r0) goto L2f
                L10:
                    X.15i5 r0 = X.C20593115i5.LIZ
                    r0.getClass()
                    r0 = 0
                    boolean r0 = X.C20593115i5.LJIIIIZZ(r0)
                    if (r0 != 0) goto L2f
                    r1 = 1
                L1d:
                    X.01GW r0 = X.C0AVJ.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    if (r0 <= 0) goto L2e
                    if (r1 == 0) goto L2e
                    r2 = 1
                L2e:
                    return r2
                L2f:
                    r1 = 0
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C714510S0z.LIZIZ(int):boolean");
            }

            @Override // X.C0R7C
            public final void LIZLLL(ARunnableS111S0100000_11 aRunnableS111S0100000_11) {
                aRunnableS111S0100000_11.run();
            }

            @Override // X.C0R7C
            public final boolean LIZ(Context context, boolean z) {
                if (C1389340mG4.LIZJ(context, null).LIZIZ() < 700 || !C1389340mG4.LIZJ(context, null).LJFF || !LJIIIZ() || !z) {
                    return false;
                }
                return true;
            }

            @Override // X.C0R7C
            public final void LJ(int i, ViewGroup viewGroup, boolean z) {
                boolean z2;
                ViewGroup.LayoutParams layoutParams;
                int iLIZIZ;
                if (LIZIZ(i) && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                    if (z2) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C0AVJ.LIZ.getValue()).intValue())));
                    } else {
                        iLIZIZ = -1;
                    }
                    layoutParams.width = iLIZIZ;
                }
            }

            @Override // X.C0R7C
            public final boolean LJII(Context context, boolean z, boolean z2) {
                if (z && LIZ(context, z2)) {
                    return true;
                }
                return false;
            }

            @Override // X.C0R7C
            public final void LJIIJ(int i, Context context, View view, boolean z) {
                ViewGroup.LayoutParams layoutParams;
                if (!LIZ(context, z)) {
                    C0R7D.LIZ.LJIIJ(i, context, view, z);
                } else if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(350));
                }
            }
        };
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLJLL() {
        return LIZJ;
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LLLF() {
        return LJI;
    }

    @Override // X.InterfaceC1616480sAQ
    public final C0SXI LLLFF() {
        return new C0SXI() { // from class: X.0Sf7
            public static final Set<String> LIZIZ = new LinkedHashSet();

            @Override // X.C0SXI
            public final float LJLJL(float f) {
                return 1.0f;
            }

            @Override // X.C0SXI
            public final boolean LLIIZ() {
                if (!((Boolean) C0AV7.LIZ.getValue()).booleanValue()) {
                    return false;
                }
                C20593115i5.LIZ.getClass();
                return !C20593115i5.LJIIIIZZ(null);
            }

            @Override // X.C0SXI
            public final boolean LLLIIL() {
                if (!((Boolean) C0AVE.LIZ.getValue()).booleanValue()) {
                    return false;
                }
                C20593115i5.LIZ.getClass();
                return !C20593115i5.LJIIIIZZ(null);
            }

            @Override // X.C0SXI
            public final boolean LJJJJZ(Aweme aweme, boolean z) {
                String aid;
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    return false;
                }
                Set<String> set = LIZIZ;
                if (set.contains(aid)) {
                    return false;
                }
                set.add(aid);
                if (!z || !((Boolean) C0AV7.LIZ.getValue()).booleanValue()) {
                    return false;
                }
                C20594415iI.LIZ.getClass();
                if (!C20594415iI.LIZ(null)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
            @Override // X.C0SXI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LLJLLL(int r4, com.ss.android.ugc.aweme.feed.model.Aweme r5) {
                /*
                    Method dump skipped, instruction units count: 212
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C726790Sf7.LLJLLL(int, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
            }

            @Override // X.C0SXI
            public final C726550Sej LJJJJL(Aweme aweme, View view, View view2, View view3) {
                return new C726550Sej(aweme, view, view2, view3);
            }
        };
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LIZ(boolean z) {
        if (C1616560sAY.LIZ("ITabletFeed.isOptShareDialog")) {
            return false;
        }
        return z;
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LJII(boolean z) {
        LIZIZ = z;
    }

    @Override // X.InterfaceC1616480sAQ
    public final View LJIIIIZZ(Context context) {
        C0AVR.LIZ.getClass();
        C737680Swg.LIZ.getClass();
        Pair pairLJJIJIIJI = C737680Swg.LJJIJIIJI();
        int iIntValue = ((Number) pairLJJIJIIJI.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLJJIJIIJI.getSecond()).intValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        c419910GdJ.LIZ = R.raw.icon_magnifying_glass_offset;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C10VO.LIZJ(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(c419910GdJ);
        tuxIconView.setClickable(true);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iLIZ = C341940Daq.LIZ(iIntValue2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ, iLIZ);
        layoutParams.setMargins(0, 0, 0, 0);
        C786410Ut5.M6(tuxIconView, layoutParams);
        return tuxIconView;
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LJIILIIL(boolean z) {
        if (z) {
            if (LJFF != null) {
                return 3;
            }
            if (LJFF == null) {
                return 2;
            }
            return 0;
        }
        if (LJFF != null) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    @Override // X.InterfaceC1616480sAQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJI(long r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB r0 = com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB.LIZ
            r0.getClass()
            X.01GW r0 = X.C0AV5.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 5
            if (r0 == 0) goto Lb0
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.util.List<com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB$TabletFastForwardRewindConfigurationItem> r2 = com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB.LIZIZ
            java.lang.String r1 = "tablet_fast_forward_rewind_configuration"
            r0 = 1
            java.lang.Object r1 = r4.LJJII(r3, r2, r1, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L7e
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L7e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L34:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r3 = r7.next()
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB.TabletFastForwardRewindConfigurationItem
            if (r0 == 0) goto L48
            if (r3 == 0) goto L34
        L44:
            r6.add(r3)
            goto L34
        L48:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB$TabletFastForwardRewindConfigurationItem r4 = new com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB$TabletFastForwardRewindConfigurationItem
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r0 = "aweme_duration_threshold_ms"
            java.lang.Object r1 = r3.get(r0)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L7b
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L7b
            long r1 = r1.longValue()
        L62:
            java.lang.String r0 = "tablet_fast_forward_rewind_time_seconds"
            java.lang.Object r3 = r3.get(r0)
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L79
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L79
            int r0 = r3.intValue()
        L74:
            r4.<init>(r1, r0)
            r3 = r4
            goto L44
        L79:
            r0 = 5
            goto L74
        L7b:
            r1 = -1
            goto L62
        L7e:
            java.util.List<com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB$TabletFastForwardRewindConfigurationItem> r1 = com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB.LIZIZ
            goto L97
        L81:
            Y.AComparatorS42S0000000_23 r1 = new Y.AComparatorS42S0000000_23
            r0 = 6
            r1.<init>(r0)
            java.util.List r1 = X.C13LP.LJLLLL(r1, r6)
            if (r1 == 0) goto L7e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L97
            java.util.List<com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB$TabletFastForwardRewindConfigurationItem> r1 = com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB.LIZIZ
            if (r1 == 0) goto L7e
        L97:
            java.util.Iterator r4 = r1.iterator()
        L9b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB$TabletFastForwardRewindConfigurationItem r3 = (com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB.TabletFastForwardRewindConfigurationItem) r3
            long r1 = r3.awemeDurationThresholdMs
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9b
            int r5 = r3.tabletFastForwardRewindTimeSeconds
            goto L9b
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1616540sAW.LJJI(long):int");
    }

    @Override // X.InterfaceC1616480sAQ
    public final ImageView LJJIJIIJIL(Context context) {
        C0AVR.LIZ.getClass();
        C737680Swg.LIZ.getClass();
        Pair pairLJJIJIIJI = C737680Swg.LJJIJIIJI();
        int iIntValue = ((Number) pairLJJIJIIJI.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLJJIJIIJI.getSecond()).intValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        c419910GdJ.LIZ = R.raw.icon_live;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setTuxIcon(c419910GdJ);
        tuxIconView.setClickable(true);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iLIZ = C341940Daq.LIZ(iIntValue2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ, iLIZ);
        layoutParams.setMargins(0, 0, 0, 0);
        C786410Ut5.M6(tuxIconView, layoutParams);
        return tuxIconView;
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LJJJJJ(int i) {
        int i2;
        C844470XAv.LIZ.getClass();
        int iLJFF = C418440Gaw.LJFF(i, C844470XAv.LIZ());
        if (iLJFF < C20590215hc.LJ.LIZ) {
            i2 = 480;
        } else if (iLJFF < C20590215hc.LJFF.LIZ) {
            i2 = 520;
        } else if (iLJFF < C20590215hc.LJI.LIZ) {
            i2 = 580;
        } else {
            i2 = 650;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LJJJJLI(C0P0T c0p0t) {
        LIZLLL = true;
        LJ = c0p0t;
        C1616610sAd.LJIJJ().storeInt("tablet_playlist_tooltip_count", C1616610sAd.LJIJJ().getInt("tablet_playlist_tooltip_count", 0) + 1);
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LJJZZI(C1604620rrI c1604620rrI) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, c1604620rrI.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        c1604620rrI.setBackgroundColor(iIntValue);
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LJLJJL(int i) {
        if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(800))) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C0AVA.LIZ.getValue()).intValue())));
        }
        return -1;
    }

    @Override // X.InterfaceC1616480sAQ
    public final boolean LLFZ(String str) {
        return Intrinsics.LJFF(str, LJFF);
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LLILL(int i) {
        int iLIZIZ = ((i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(219))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(224))) / 2;
        if (iLIZIZ <= 0) {
            return 0;
        }
        return iLIZIZ;
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LLILLJJLI(boolean z) {
        LIZJ = z;
    }

    @Override // X.InterfaceC1616480sAQ
    public final C0T08 LLJI(String str) {
        int i;
        if (LLLI()) {
            str = "intro_tablet_horizontal_rotation_swipe_up_tux_lottie.json";
            i = 2131837978;
        } else {
            i = 2131849403;
        }
        return new C0T08(str, i);
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LLJILJIL(String str) {
        LJFF = str;
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LLJJJIL(int i) {
        LJI = i;
    }

    @Override // X.InterfaceC1616480sAQ
    public final void LLJJL(Fragment fragment) {
        View rootView;
        Context context;
        View view = fragment.getView();
        if (view == null || (rootView = view.getRootView()) == null || (context = fragment.getContext()) == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C897300ZIa(fragment, context, rootView, null), 3);
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LJJJLL(int i, C19EG c19eg) {
        C0T45.LIZ.getClass();
        if (C1616660sAi.LIZJ() && c19eg != null) {
            return i - C0T45.LIZIZ(c19eg);
        }
        return i;
    }

    @Override // X.InterfaceC1616480sAQ
    public final InterfaceC690040R4w LLILZ(ViewStub viewStub, int i) {
        return new C1029200ctC(viewStub, i);
    }

    @Override // X.InterfaceC1616480sAQ
    public final int LLJ(int i, long j) {
        if (j > 3) {
            return (int) (i * ((Number) C2555909zx.LIZ.getValue()).floatValue());
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(368));
    }
}
