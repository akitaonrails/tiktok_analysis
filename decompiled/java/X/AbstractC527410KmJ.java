package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.UserVisibleHintGroupScene;

/* JADX INFO: renamed from: X.0KmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC527410KmJ extends PagerAdapter {
    public final C19A3 LLILLJJLI;
    public UserVisibleHintGroupScene LLILLL;

    public abstract UserVisibleHintGroupScene LJJIJL(int i);

    public long LJJIJLIJ(int i) {
        return i;
    }

    public AbstractC527410KmJ(C19A3 c19a3) {
        this.LLILLJJLI = c19a3;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        int id = viewGroup.getId();
        if (id != -1) {
            long jLJJIJLIJ = LJJIJLIJ(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("android:switcher:");
            sbLIZ.append(jLJJIJLIJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ViewPager viewPager = (ViewPager) viewGroup;
            UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) this.LLILLJJLI.findSceneByTag(strLIZIZ);
            if (userVisibleHintGroupScene != null) {
                LJJIJIL(viewPager, userVisibleHintGroupScene, i);
                this.LLILLJJLI.show(userVisibleHintGroupScene);
                return userVisibleHintGroupScene;
            }
            UserVisibleHintGroupScene userVisibleHintGroupSceneLJJIJL = LJJIJL(i);
            LJJIJIL(viewPager, userVisibleHintGroupSceneLJJIJL, i);
            this.LLILLJJLI.add(id, userVisibleHintGroupSceneLJJIJL, strLIZIZ);
            return userVisibleHintGroupSceneLJJIJL;
        }
        throw new IllegalArgumentException("ViewPager should have view id before use ScenePageAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (((Scene) obj).mView == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) obj;
        UserVisibleHintGroupScene userVisibleHintGroupScene2 = this.LLILLL;
        if (userVisibleHintGroupScene != userVisibleHintGroupScene2) {
            if (userVisibleHintGroupScene2 != null) {
                userVisibleHintGroupScene2.LLLLIIIILLL(false);
            }
            if (userVisibleHintGroupScene != null) {
                userVisibleHintGroupScene.LLLLIIIILLL(true);
            }
            this.LLILLL = userVisibleHintGroupScene;
        }
    }

    public final void LJJIJIL(ViewPager viewPager, UserVisibleHintGroupScene userVisibleHintGroupScene, int i) {
        if (this.LLILLL == null && viewPager.getCurrentItem() == i) {
            this.LLILLL = userVisibleHintGroupScene;
        }
        if (userVisibleHintGroupScene == this.LLILLL) {
            if (userVisibleHintGroupScene.LLJJ) {
                userVisibleHintGroupScene.LLLLIIIILLL(false);
            }
            userVisibleHintGroupScene.LLLLIIIILLL(true);
        } else {
            if (!userVisibleHintGroupScene.LLJJ) {
                return;
            }
            userVisibleHintGroupScene.LLLLIIIILLL(false);
        }
    }
}
