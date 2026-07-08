package X;

import Y.ACListenerS79S0300000_12;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0U6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766960U6s {
    public final C19U1 LIZ;
    public final ViewPager LIZIZ;
    public final DataChannel LIZJ;
    public final C20587315h9 LJ;
    public final C766970U6t LJFF;
    public final ArrayList<C767000U6w> LIZLLL = new ArrayList<>();
    public boolean LJI = true;

    public final void LIZ() {
        C19U1 c19u1 = this.LIZ;
        C767000U6w c767000U6w = new C767000U6w(C0UD4.LJI, "livefilter", null, 12, 0);
        this.LIZLLL.add(c767000U6w);
        C19U0 c19u0LIZIZ = LIZIZ(c767000U6w, null);
        C766980U6u.LIZ(c19u0LIZIZ);
        c19u1.addTab(c19u0LIZIZ);
    }

    public final void LIZJ(boolean z) {
        C19U0 tabAt;
        LiveIconView liveIconView;
        int i;
        if (LiveAIBeautySetting.INSTANCE.enableAIBeauty() && C500260Jjc.LJJIJLIJ() && (tabAt = this.LIZ.getTabAt(0)) != null && (liveIconView = (LiveIconView) tabAt.LJIIIIZZ.findViewById(R.id.ao6)) != null) {
            if (z) {
                i = R.attr.c7m;
            } else {
                i = R.attr.ezq;
            }
            liveIconView.setIconTintAttr(i);
        }
    }

    public final void LIZLLL(int i) {
        if (i < 0) {
            return;
        }
        C19U0 tabAt = this.LIZ.getTabAt(i);
        if (tabAt == null) {
            C19U0 tabAt2 = this.LIZ.getTabAt(0);
            if (tabAt2 != null) {
                tabAt2.LIZIZ();
            }
            this.LIZIZ.setCurrentItem(0);
            return;
        }
        tabAt.LIZIZ();
        this.LIZIZ.setCurrentItem(i);
    }

    public final C19U0 LIZIZ(C767000U6w c767000U6w, C0UX6 c0ux6) {
        View view;
        View viewFindViewById;
        C16F5 c16f5;
        TextView textView;
        C19U0 c19u0NewTab = this.LIZ.newTab();
        int i = c767000U6w.LIZLLL;
        if (i != -1) {
            c19u0NewTab.LIZJ(i);
        } else {
            c19u0NewTab.LIZJ(R.layout.gfh);
        }
        View view2 = c19u0NewTab.LJFF;
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.wyg)) != null) {
            textView.setText(c767000U6w.LIZ);
        }
        View view3 = c19u0NewTab.LJFF;
        if (view3 != null && (c16f5 = (C16F5) view3.findViewById(R.id.wyg)) != null) {
            c16f5.setReduceFont(true);
        }
        View view4 = c19u0NewTab.LJFF;
        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.wys)) != null) {
            if (LiveAIBeautySetting.INSTANCE.enableAIBeauty()) {
                if (c0ux6 != null) {
                    if (RedDotExtensionKt.LJIILLIIL(c0ux6)) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_beauty_tab_reddot_show");
                        c474500IjALIZ.LJIJJLI(this.LIZJ);
                        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(c767000U6w.LIZIZ, "tab");
                        c474500IjALIZ.LJJII(c767000U6w.LIZ, "tab_name");
                        c474500IjALIZ.LJJII(C500260Jjc.LJJJJJL(this.LIZJ), "live_type");
                        c474500IjALIZ.LIZ();
                        if (c0ux6 != null) {
                        }
                    }
                    RedDotExtensionKt.LJIILJJIL(c0ux6, viewFindViewById, true);
                }
            } else if (c0ux6 != null) {
                RedDotExtensionKt.LJIILJJIL(c0ux6, viewFindViewById, true);
            }
        }
        if (LiveAIBeautySetting.INSTANCE.enableAIBeauty() && (view = c19u0NewTab.LJFF) != null) {
            C786410Ut5.I7(new ACListenerS79S0300000_12(this, c767000U6w, c19u0NewTab, 22), view);
        }
        c19u0NewTab.LIZ = c767000U6w;
        return c19u0NewTab;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0U6t] */
    public C766960U6s(C19U1 c19u1, final C767010U6x c767010U6x, DataChannel dataChannel) {
        this.LIZ = c19u1;
        this.LIZIZ = c767010U6x;
        this.LIZJ = dataChannel;
        this.LJ = new C20587315h9(this.LIZ);
        this.LJFF = new C766990U6v(c767010U6x) { // from class: X.0U6t
            @Override // X.C766990U6v, X.InterfaceC1586460rO0
            public final void Oq(C19U0 c19u0) {
                Boolean boolValueOf;
                View viewFindViewById;
                C767000U6w c767000U6w;
                View viewFindViewById2;
                View view;
                View viewFindViewById3;
                View viewFindViewById4;
                C767000U6w c767000U6w2;
                String str;
                View viewFindViewById5;
                if (C761910Tuf.LIZ) {
                    return;
                }
                this.LL.setCurrentItem(c19u0.LJ);
                View view2 = c19u0.LJFF;
                String str2 = null;
                if (view2 != null && (viewFindViewById5 = view2.findViewById(R.id.wys)) != null) {
                    boolValueOf = Boolean.valueOf(C500260Jjc.LJJJJIZL(viewFindViewById5));
                } else {
                    boolValueOf = null;
                }
                boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                boolean z = this.LLILLJJLI.LJI;
                View view3 = c19u0.LJFF;
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.wys);
                } else {
                    viewFindViewById = null;
                }
                if (C500260Jjc.LJJJJIZL(viewFindViewById)) {
                    Object obj = c19u0.LIZ;
                    if ((obj instanceof C767000U6w) && (c767000U6w2 = (C767000U6w) obj) != null && (str = c767000U6w2.LIZIZ) != null) {
                        if (u.LJJIIJZLJL(str, "beauty", false)) {
                            C0U8H c0u8hLIZIZ = C0UF5.LIZIZ();
                            if (c0u8hLIZIZ != null) {
                                c0u8hLIZIZ.LIZ = false;
                            }
                            if (C500260Jjc.LJJIJLIJ()) {
                                RedDotExtensionKt.LIZ(C0UX6.PREVIEW_BEAUTY_TAB);
                            } else {
                                RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_BEAUTY_TAB);
                            }
                            InterfaceC766480U4w.LJJJJJ.LJFF(Boolean.TRUE);
                            InterfaceC766480U4w.LJJJJL.LJFF(Boolean.FALSE);
                        } else if (u.LJJIIJZLJL(str, "makeup", false)) {
                            C0U8H c0u8hLIZIZ2 = C0UF5.LIZIZ();
                            if (c0u8hLIZIZ2 != null) {
                                c0u8hLIZIZ2.LIZIZ = false;
                            }
                            if (C500260Jjc.LJJIJLIJ()) {
                                RedDotExtensionKt.LIZ(C0UX6.PREVIEW_MAKEUP_TAB);
                            } else {
                                RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_MAKEUP_TAB);
                            }
                            InterfaceC766480U4w.LJJJJJL.LJFF(Boolean.TRUE);
                            InterfaceC766480U4w.LJJJJLI.LJFF(Boolean.FALSE);
                        }
                    }
                    if (!z) {
                        C500260Jjc.LJIILLIIL(viewFindViewById);
                    }
                }
                View view4 = c19u0.LJFF;
                if (view4 != null && (viewFindViewById4 = view4.findViewById(R.id.wyg)) != null) {
                    C786410Ut5.T4(viewFindViewById4, 0.9f);
                }
                if (LiveAIBeautySetting.INSTANCE.enableAIBeauty() && (view = c19u0.LJFF) != null && (viewFindViewById3 = view.findViewById(R.id.ao6)) != null) {
                    C786410Ut5.T4(viewFindViewById3, 0.9f);
                }
                View view5 = c19u0.LJFF;
                if (view5 != null && (viewFindViewById2 = view5.findViewById(R.id.wxy)) != null) {
                    C500260Jjc.LLFFF(viewFindViewById2);
                }
                this.LLILLJJLI.LJI = false;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pm_live_beauty_tab_change");
                c474500IjALIZ.LJIL();
                Object obj2 = c19u0.LIZ;
                if ((obj2 instanceof C767000U6w) && (c767000U6w = (C767000U6w) obj2) != null) {
                    str2 = c767000U6w.LIZIZ;
                }
                c474500IjALIZ.LJJII(str2, "tab");
                c474500IjALIZ.LJJII(Integer.valueOf(zLJJJI ? 1 : 0), "have_red_dot");
                c474500IjALIZ.LIZ();
            }

            @Override // X.C766990U6v, X.InterfaceC1586460rO0
            public final void Yn(C19U0 c19u0) {
                if (C761910Tuf.LIZ) {
                    return;
                }
                C766980U6u.LIZ(c19u0);
            }
        };
    }
}
