package X;

import Y.ARunnableS120S0100000_20;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UIView;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0kxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewOnAttachStateChangeListenerC1339240kxG implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC1339240kxG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        Map<String, C1299120juY> map;
        UIView uIView = (UIView) viewOnAttachStateChangeListenerC1339240kxG.l0;
        if (view == uIView.mView && (map = uIView.mEvents) != null && map.containsKey("attach")) {
            C1289910jfh c1289910jfh = new C1289910jfh(((UIView) viewOnAttachStateChangeListenerC1339240kxG.l0).getSign(), "attach");
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("impression_id", ((AndroidView) ((UIView) viewOnAttachStateChangeListenerC1339240kxG.l0).mView).getImpressionId());
            c1289910jfh.LJII = "params";
            c1289910jfh.LJIIIIZZ = map2;
            C1298720jtu c1298720jtu = ((UIView) viewOnAttachStateChangeListenerC1339240kxG.l0).mContext.LLIZ;
            if (c1298720jtu != null) {
                c1298720jtu.LIZIZ(c1289910jfh);
            }
        }
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        LynxTabBarView lynxTabBarView = (LynxTabBarView) viewOnAttachStateChangeListenerC1339240kxG.l0;
        C1319530kRT c1319530kRT = lynxTabBarView.LLILLJJLI;
        if (c1319530kRT == null) {
            c1319530kRT = null;
        }
        HandlerHook.viewPost(c1319530kRT, new ARunnableS120S0100000_20(lynxTabBarView, 145));
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        C1337020ktg c1337020ktg;
        if (view != null && (c1337020ktg = ((AbstractC1336950ktZ) viewOnAttachStateChangeListenerC1339240kxG.l0).LLJJL.get(view)) != null) {
            c1337020ktg.LIZIZ = true;
        }
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        HandlerHook.viewPost(((BaseLynxViewPager) viewOnAttachStateChangeListenerC1339240kxG.l0).LJJIJ(), new ARunnableS120S0100000_20((BaseLynxViewPager) viewOnAttachStateChangeListenerC1339240kxG.l0, 203));
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        Map<String, C1297940jse> map;
        C1299030juP c1299030juP = (C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0;
        if (view == c1299030juP.LLLLLILLIL && (map = c1299030juP.LLJIJIL) != null && map.containsKey("attach")) {
            C1294220jme c1294220jme = new C1294220jme(((C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0).LLJJ, "attach");
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("impression_id", ((C1313680kI2) ((C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0).LLLLLILLIL).getImpressionId());
            c1294220jme.LIZLLL = "params";
            c1294220jme.LJ = map2;
            C1298420jtQ c1298420jtQ = ((C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0).LLILZ.LLILLL;
            if (c1298420jtQ != null) {
                c1298420jtQ.LIZJ(c1294220jme);
            }
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        C1321510kUf c1321510kUf = (C1321510kUf) viewOnAttachStateChangeListenerC1339240kxG.l0;
        c1321510kUf.b++;
        C1168400gVi.LIZ(new AwS599S0100000_20(c1321510kUf, 7));
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        Map<String, C1299120juY> map;
        UIView uIView = (UIView) viewOnAttachStateChangeListenerC1339240kxG.l0;
        if (view == uIView.mView && (map = uIView.mEvents) != null && map.containsKey("detach")) {
            C1289910jfh c1289910jfh = new C1289910jfh(((UIView) viewOnAttachStateChangeListenerC1339240kxG.l0).getSign(), "detach");
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("impression_id", ((AndroidView) ((UIView) viewOnAttachStateChangeListenerC1339240kxG.l0).mView).getImpressionId());
            c1289910jfh.LJII = "params";
            c1289910jfh.LJIIIIZZ = map2;
            C1298720jtu c1298720jtu = ((UIView) viewOnAttachStateChangeListenerC1339240kxG.l0).mContext.LLIZ;
            if (c1298720jtu != null) {
                c1298720jtu.LIZIZ(c1289910jfh);
            }
        }
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        C1337020ktg c1337020ktg;
        if (view != null && (c1337020ktg = ((AbstractC1336950ktZ) viewOnAttachStateChangeListenerC1339240kxG.l0).LLJJL.get(view)) != null) {
            c1337020ktg.LIZIZ = false;
        }
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC1339240kxG viewOnAttachStateChangeListenerC1339240kxG, View view) {
        Map<String, C1297940jse> map;
        C1299030juP c1299030juP = (C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0;
        if (view == c1299030juP.LLLLLILLIL && (map = c1299030juP.LLJIJIL) != null && map.containsKey("detach")) {
            C1294220jme c1294220jme = new C1294220jme(((C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0).LLJJ, "detach");
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("impression_id", ((C1313680kI2) ((C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0).LLLLLILLIL).getImpressionId());
            c1294220jme.LIZLLL = "params";
            c1294220jme.LJ = map2;
            C1298420jtQ c1298420jtQ = ((C1299030juP) viewOnAttachStateChangeListenerC1339240kxG.l0).LLILZ.LLILLL;
            if (c1298420jtQ != null) {
                c1298420jtQ.LIZJ(c1294220jme);
            }
        }
    }
}
