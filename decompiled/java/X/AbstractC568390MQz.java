package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.UserVisibleHintGroupScene;

/* JADX INFO: renamed from: X.0MQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC568390MQz extends C0MR0<UserVisibleHintGroupScene> {
    public final C19A3 LLILZ;

    public AbstractC568390MQz(C19A3 c19a3) {
        this.LLILZ = c19a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        int id = viewGroup.getId();
        if (id != -1) {
            int id2 = viewGroup.getId();
            StringBuilder sb = new StringBuilder("android:switcher:");
            sb.append(id2);
            sb.append(':');
            sb.append(i);
            String string = sb.toString();
            UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) this.LLILZ.findSceneByTag(string);
            if (userVisibleHintGroupScene != null) {
                if (this.LLILLL != userVisibleHintGroupScene) {
                    userVisibleHintGroupScene.LLLLIIIILLL(false);
                }
                this.LLILZ.show(userVisibleHintGroupScene);
                return userVisibleHintGroupScene;
            }
            UserVisibleHintGroupScene userVisibleHintGroupScene2 = (UserVisibleHintGroupScene) LJJIJL(i);
            if (userVisibleHintGroupScene2 instanceof InterfaceC528520Ko6) {
                if (this.LLILLL != userVisibleHintGroupScene2) {
                    userVisibleHintGroupScene2.LLLLIIIILLL(false);
                }
                this.LLILLJJLI.put(i, (T) userVisibleHintGroupScene2);
                return userVisibleHintGroupScene2;
            }
            if (this.LLILLL != userVisibleHintGroupScene2) {
                userVisibleHintGroupScene2.LLLLIIIILLL(false);
            }
            this.LLILZ.add(id, userVisibleHintGroupScene2, string);
            return userVisibleHintGroupScene2;
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

    @Override // X.C0MR0
    /* JADX INFO: renamed from: LJJIJLIJ, reason: merged with bridge method [inline-methods] */
    public final UserVisibleHintGroupScene LJJIJIL(int i, ViewGroup viewGroup) {
        UserVisibleHintGroupScene userVisibleHintGroupScene = (UserVisibleHintGroupScene) this.LLILLJJLI.get(i);
        if (userVisibleHintGroupScene != null) {
            int id = viewGroup.getId();
            StringBuilder sb = new StringBuilder("android:switcher:");
            sb.append(id);
            sb.append(':');
            sb.append(i);
            String string = sb.toString();
            if (this.LLILZ.findSceneByTag(string) == null) {
                this.LLILZ.add(viewGroup.getId(), userVisibleHintGroupScene, string);
                this.LLILLJJLI.remove(i);
            }
            return userVisibleHintGroupScene;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        Scene scene = (Scene) obj;
        if (scene.mParentScene != null) {
            this.LLILZ.remove(scene);
        } else {
            this.LLILLJJLI.remove(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.bytedance.scene.group.UserVisibleHintGroupScene] */
    @Override // X.C0MR0, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLILLJJLI.get(i) != null) {
            LJJIJIL(i, viewGroup);
            LJIJI(viewGroup);
        }
        ?? r6 = (UserVisibleHintGroupScene) obj;
        T t = this.LLILLL;
        if (r6 != t) {
            if (t != 0) {
                ((UserVisibleHintGroupScene) t).LLLLIIIILLL(false);
            }
            if (r6 != 0) {
                r6.LLLLIIIILLL(true);
            }
            this.LLILLL = r6;
        }
    }
}
