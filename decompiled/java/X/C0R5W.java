package X;

import Y.AObjectS287S0200000_11;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility;
import com.ss.android.ugc.feed.platform.panel.accessibility.A11yFeedToolComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R5W, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R5W extends C20094213jo {
    public final /* synthetic */ VideoViewCell LIZ;

    public C0R5W(VideoViewCell videoViewCell) {
        this.LIZ = videoViewCell;
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        C690200R5m c690200R5m = A11yFeedToolComponent.LLLFFI;
        String eventType = this.LIZ.getEventType();
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ.b;
        c690200R5m.getClass();
        if (C690200R5m.LIZ(interfaceC665370Q7z, eventType)) {
            accessibilityNodeInfoCompat.setContentDescription(this.LIZ.w(2131823200));
            accessibilityNodeInfoCompat.addAction(16);
            return;
        }
        String str = this.LIZ.f360O;
        if (str != null) {
            accessibilityNodeInfoCompat.setStateDescription(str);
        }
        C20092413jW c20092413jW = this.LIZ.P;
        if (c20092413jW != null) {
            accessibilityNodeInfoCompat.addAction(c20092413jW);
        }
        C0S78.LIZ(new AObjectS287S0200000_11(this, accessibilityNodeInfoCompat, 2), true);
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, final int i, Bundle bundle) {
        if (i == 16) {
            C690200R5m c690200R5m = A11yFeedToolComponent.LLLFFI;
            String eventType = this.LIZ.getEventType();
            InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ.b;
            c690200R5m.getClass();
            if (C690200R5m.LIZ(interfaceC665370Q7z, eventType)) {
                C1440005kM.LIZ(new C7843034n());
                return super.performAccessibilityAction(view, i, bundle);
            }
            VideoViewCell videoViewCell = this.LIZ;
            if (videoViewCell.M) {
                VideoViewCell.LLLL(videoViewCell).tryResumePlay();
            } else {
                VideoViewCell.LLLL(videoViewCell).LLLLLLLLLL();
            }
            VideoViewCell videoViewCell2 = this.LIZ;
            videoViewCell2.fw2(true ^ videoViewCell2.M);
            return super.performAccessibilityAction(view, i, bundle);
        }
        C0S78.LIZ(new Function0() { // from class: X.0R5V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                HomeViewPagerAbility homeViewPagerAbility;
                C0R5W c0r5w = this.LL;
                int i2 = i;
                c0r5w.getClass();
                C0R5Q.LIZ = Boolean.FALSE;
                if (((Boolean) C0R5Q.LIZIZ.getValue()).booleanValue()) {
                    if (i2 == R.id.y5) {
                        VideoViewCell.LLLL(c0r5w.LIZ).LLLLLLLLLL();
                        c0r5w.LIZ.fw2(!r1.M);
                        str = "pause";
                    } else if (i2 == R.id.y6) {
                        VideoViewCell.LLLL(c0r5w.LIZ).tryResumePlay();
                        c0r5w.LIZ.fw2(!r1.M);
                        str = "play";
                    } else if (i2 == R.id.y4) {
                        c0r5w.LIZ.Mb().rH();
                        str = "next";
                    } else if (i2 == R.id.y7) {
                        if (c0r5w.LIZ.Ak2() == null || c0r5w.LIZ.z.LJLJJL() != 0) {
                            c0r5w.LIZ.Mb().X20();
                        } else {
                            VideoViewCell videoViewCell3 = c0r5w.LIZ;
                            if (videoViewCell3.o == null) {
                                InterfaceC665370Q7z interfaceC665370Q7z2 = videoViewCell3.b;
                                if (C296200BjG.LIZ()) {
                                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z2, MainActivityScope.class);
                                    Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomeViewPagerAbility.class) : null;
                                    if (!(ability instanceof HomeViewPagerAbility)) {
                                        ability = null;
                                    }
                                    homeViewPagerAbility = (HomeViewPagerAbility) ability;
                                } else {
                                    homeViewPagerAbility = (HomeViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z2, HomeViewPagerAbility.class, null);
                                }
                                videoViewCell3.o = homeViewPagerAbility;
                            }
                            if (videoViewCell3.o != null) {
                                c0r5w.LIZ.o.rS0(",", "click_button", false);
                            }
                        }
                        str = "previous";
                    } else if (i2 == R.id.y1) {
                        VideoViewCell videoViewCell4 = c0r5w.LIZ;
                        if (videoViewCell4.LLLZI == null) {
                            videoViewCell4.LLLZI = videoViewCell4.Wn0();
                        }
                        InterfaceC690460R6m interfaceC690460R6m = c0r5w.LIZ.LLLZI;
                        if (interfaceC690460R6m != null) {
                            interfaceC690460R6m.LIZ(0.0f, 0.0f);
                            str = "more_options";
                        }
                    } else if (i2 == R.id.y3) {
                        VideoViewCell videoViewCell5 = c0r5w.LIZ;
                        if (videoViewCell5.p == null) {
                            videoViewCell5.p = (VideoDiggAssemAbility) C1558520qew.LIZ(videoViewCell5.b, VideoDiggAssemAbility.class, null);
                        }
                        videoViewCell5.p.Mp0(null);
                        str = "like";
                    } else if (i2 == R.id.y2) {
                        c0r5w.LIZ.j().kv0(null);
                        str = "follow";
                    } else if (i2 == R.id.y0) {
                        c0r5w.LIZ.w0(false);
                        str = "fast_forward";
                    } else if (i2 == R.id.y8) {
                        c0r5w.LIZ.w0(true);
                        str = "rewind";
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(c0r5w.LIZ.LLLIIL(), "enter_from");
                    c2344009Gk.LJIIIIZZ("enter_method", "custom_action");
                    c2344009Gk.LJIIIIZZ("button_type", str);
                    C20684815ws.LJIILLIIL("click_feed_tool_button", c2344009Gk.LIZ);
                }
                return null;
            }
        }, true);
        return super.performAccessibilityAction(view, i, bundle);
    }
}
