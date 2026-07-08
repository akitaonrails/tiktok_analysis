package X;

import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.scene.Scene;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336960kta implements InterfaceC1584740rLE {
    public final /* synthetic */ LynxTabBarView LL;

    @Override // X.InterfaceC1586460rO0
    public final void Yn(C19U0 c19u0) {
    }

    @Override // X.InterfaceC1586460rO0
    public final void ih(C19U0 c19u0) {
    }

    public C1336960kta(LynxTabBarView lynxTabBarView) {
        this.LL = lynxTabBarView;
    }

    @Override // X.InterfaceC1586460rO0
    public final void Oq(C19U0 c19u0) {
        String str;
        LynxTabBarView lynxTabBarView = this.LL;
        if (lynxTabBarView.LL) {
            int i = 0;
            if (c19u0 != null) {
                C1319530kRT c1319530kRT = lynxTabBarView.LLILLJJLI;
                if (c1319530kRT == null) {
                    c1319530kRT = null;
                }
                int tabCount = c1319530kRT.getTabCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= tabCount) {
                        break;
                    }
                    C1319530kRT c1319530kRT2 = lynxTabBarView.LLILLJJLI;
                    if (c1319530kRT2 == null) {
                        c1319530kRT2 = null;
                    }
                    if (c1319530kRT2.getTabAt(i2) == c19u0) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            LynxTabBarView lynxTabBarView2 = this.LL;
            C1298720jtu c1298720jtu = lynxTabBarView2.mContext.LLIZ;
            C1289960jfm c1289960jfm = new C1289960jfm(lynxTabBarView2.getSign(), "change");
            LynxTabBarView lynxTabBarView3 = this.LL;
            Object obj = ((HashMap) lynxTabBarView3.LLIZ).get(Integer.valueOf(i));
            if (obj == null) {
                obj = "";
            }
            c1289960jfm.LIZIZ(obj, "tag");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "index");
            if (lynxTabBarView3.LLILZIL == c19u0) {
                str = "click";
            } else {
                str = "slide";
            }
            c1289960jfm.LIZIZ(str, Scene.SCENE_SERVICE);
            c1298720jtu.LIZIZ(c1289960jfm);
            this.LL.LLILZIL = null;
        }
    }
}
