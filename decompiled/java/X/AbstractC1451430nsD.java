package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0nsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1451430nsD extends PagerAdapter {
    public final C19A3 LLILLJJLI;
    public UserVisibleHintGroupScene LLILLL;

    public AbstractC1451430nsD(C19A3 c19a3) {
        this.LLILLJJLI = c19a3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        UserVisibleHintGroupScene userVisibleHintGroupScene;
        boolean zLJI = MethodIDManager.LJI(202380);
        int id = viewGroup.getId();
        if (id == -1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ViewPager should have view id before use ScenePageAdapter");
            if (zLJI) {
                MethodIDManager.LJ();
                throw illegalArgumentException;
            }
            throw illegalArgumentException;
        }
        C1451420nsC c1451420nsC = (C1451420nsC) this;
        String strLJJIJLIJ = c1451420nsC.LJJIJLIJ(i);
        if (strLJJIJLIJ == null) {
            strLJJIJLIJ = "";
        }
        Object objValueOf = ((LinkedHashMap) c1451420nsC.LLJIJIL).get(strLJJIJLIJ);
        if (objValueOf == null) {
            objValueOf = Long.valueOf(i);
        }
        long jLongValue = ((Number) objValueOf).longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(jLongValue);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1462760oAU c1462760oAU = (C1462760oAU) viewGroup;
        UserVisibleHintGroupScene userVisibleHintGroupScene2 = (UserVisibleHintGroupScene) this.LLILLJJLI.findSceneByTag(strLIZIZ);
        if (userVisibleHintGroupScene2 != null) {
            LJJIJIL(c1462760oAU, userVisibleHintGroupScene2, i);
            this.LLILLJJLI.show(userVisibleHintGroupScene2);
            userVisibleHintGroupScene = userVisibleHintGroupScene2;
        } else {
            List<SingleImageData> list = c1451420nsC.LLJILJIL;
            C1450990nrV c1450990nrV = new C1450990nrV((SingleImageData) ListProtector.get(list, i % list.size()), c1451420nsC.LLILZLL, c1451420nsC.LLIZ, c1451420nsC.LLIZLLLIL, c1451420nsC.LLILZ, c1451420nsC.LLILZIL, c1451420nsC.LLJ);
            c1450990nrV.LLLLJI = i;
            List<SingleImageData> list2 = c1451420nsC.LLJILJIL;
            String id2 = ((SingleImageData) ListProtector.get(list2, i % list2.size())).getId();
            if (id2 != null) {
                c1451420nsC.LLJILJILJ.put(id2, c1450990nrV);
            }
            LJJIJIL(c1462760oAU, c1450990nrV, i);
            this.LLILLJJLI.add(id, c1450990nrV, strLIZIZ);
            userVisibleHintGroupScene = c1450990nrV;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return userVisibleHintGroupScene;
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

    public final void LJJIJIL(C1462760oAU c1462760oAU, UserVisibleHintGroupScene userVisibleHintGroupScene, int i) {
        if (this.LLILLL == null && c1462760oAU.getCurrentItem() == i) {
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
