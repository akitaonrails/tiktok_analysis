package Y;

import X.C0CNO;
import X.C0IJT;
import X.C1616650sAh;
import X.C16FS;
import X.C19252910Tv;
import X.C21458918yR;
import X.C21660919pv;
import X.C21661119px;
import X.C21661419q0;
import X.C474500IjA;
import X.C500260Jjc;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewECLiveStudioPageWidget;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.tablet.FastForwardButtonComponent;
import com.ss.android.ugc.feed.platform.tablet.RewindButtonComponent;
import kotlin.jvm.internal.AwS14S0410000_5;
import webcast.api.room.LiveManagerEntranceInfo;

/* JADX INFO: loaded from: classes34.dex */
public class ACListenerS97S0300000_33 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS97S0300000_33 aCListenerS97S0300000_33, View view) {
        String str;
        ((PreviewECLiveStudioPageWidget) aCListenerS97S0300000_33.l0).getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_button_click");
        c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        c474500IjALIZ.LJJII("go_live_page", "page_name");
        c474500IjALIZ.LJJII("get_access", "button_name");
        c474500IjALIZ.LIZ();
        if (C500260Jjc.LJJIIZ(((LiveManagerEntranceInfo) aCListenerS97S0300000_33.l1).oecWebsiteSchema)) {
            str = ((LiveManagerEntranceInfo) aCListenerS97S0300000_33.l1).oecWebsiteSchema;
        } else {
            str = "aweme://roma_redirect/?spark_page=live_manager_send_link_page&page_name=pre_live";
        }
        SmartRouter.buildRoute(((C16FS) aCListenerS97S0300000_33.l2).getContext(), str).open();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024f  */
    /* JADX WARN: Type inference failed for: r2v54, types: [X.1A58] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS97S0300000_33 r28, android.view.View r29) {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS97S0300000_33.onClick$1(Y.ACListenerS97S0300000_33, android.view.View):void");
    }

    public static final void onClick$2(ACListenerS97S0300000_33 aCListenerS97S0300000_33, View view) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LLIFFJFJJ()) {
            C1616650sAh.LIZIZ((View) aCListenerS97S0300000_33.l0);
        } else {
            if (((ImageView) aCListenerS97S0300000_33.l1) == null) {
                return;
            }
            Context context = ((FastForwardButtonComponent) aCListenerS97S0300000_33.l2).getContext();
            FastForwardButtonComponent fastForwardButtonComponent = (FastForwardButtonComponent) aCListenerS97S0300000_33.l2;
            AnimatorSet animatorSet = fastForwardButtonComponent.LLL;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = fastForwardButtonComponent.LLLF;
            ImageView imageView = (ImageView) aCListenerS97S0300000_33.l1;
            if (animatorSet != null && accelerateDecelerateInterpolator != null) {
                C0CNO.LIZLLL(0L, new AwS14S0410000_5(animatorSet, context, (View) imageView, accelerateDecelerateInterpolator, false, 2));
            }
        }
        C1616650sAh.LIZJ((IFeedPanelPlatformAbility) ((FastForwardButtonComponent) aCListenerS97S0300000_33.l2).LLJLLIL.getValue(), "click_fast_forward");
        C1616650sAh.LJIIIIZZ(false, (IPlayerComponentAbility) ((FastForwardButtonComponent) aCListenerS97S0300000_33.l2).LLJZ.getValue());
        c19252910Tv.LIZLLL().LJIJI().LJII(true);
    }

    public static final void onClick$3(ACListenerS97S0300000_33 aCListenerS97S0300000_33, View view) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LLIFFJFJJ()) {
            C1616650sAh.LIZIZ((View) aCListenerS97S0300000_33.l0);
        } else {
            if (((ImageView) aCListenerS97S0300000_33.l1) == null) {
                return;
            }
            Context context = ((RewindButtonComponent) aCListenerS97S0300000_33.l2).getContext();
            RewindButtonComponent rewindButtonComponent = (RewindButtonComponent) aCListenerS97S0300000_33.l2;
            AnimatorSet animatorSet = rewindButtonComponent.LLL;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = rewindButtonComponent.LLLF;
            ImageView imageView = (ImageView) aCListenerS97S0300000_33.l1;
            if (animatorSet != null && accelerateDecelerateInterpolator != null) {
                C0CNO.LIZLLL(0L, new AwS14S0410000_5(animatorSet, context, (View) imageView, accelerateDecelerateInterpolator, true, 2));
            }
        }
        C1616650sAh.LIZJ((IFeedPanelPlatformAbility) ((RewindButtonComponent) aCListenerS97S0300000_33.l2).LLJLLIL.getValue(), "click_rewind");
        C1616650sAh.LJIIIIZZ(true, (IPlayerComponentAbility) ((RewindButtonComponent) aCListenerS97S0300000_33.l2).LLJZ.getValue());
        c19252910Tv.LIZLLL().LJIJI().LLILLJJLI(true);
    }

    public static final void onClick$4(ACListenerS97S0300000_33 aCListenerS97S0300000_33, View view) {
        ((C21660919pv) aCListenerS97S0300000_33.l0).LLILZ.bL(((C21661419q0) aCListenerS97S0300000_33.l1).LIZ, (C21458918yR) ((C21661119px) aCListenerS97S0300000_33.l2).LLILLJJLI.getValue());
    }

    public ACListenerS97S0300000_33(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
