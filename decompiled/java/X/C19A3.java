package X;

import Y.ARunnableS132S0100000_32;
import Y.ARunnableS36S0201000_32;
import Y.ARunnableS97S0200000_28;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.GroupRecord;
import com.bytedance.scene.group.o;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.19A3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19A3 extends Scene implements C19BK {
    public static final C21498419Bm LLJILJILJ = new InterfaceC21499419Bw() { // from class: X.19Bm
        @Override // X.InterfaceC21499419Bw
        public final C195F LIZ() {
            return null;
        }
    };
    public final List<C801600VcU<C19AH, Boolean>> LLJIJIL = new ArrayList();
    public boolean LLJILJIL = true;
    public final C19A4 LLJI = new C19A4(this);

    public void LLLILZLLLI() {
    }

    public void LLLIZZ() {
    }

    public void LLLJ() {
    }

    @Override // X.C19BK
    public final void disableSupportRestore() {
        this.LLJILJIL = false;
    }

    @Override // X.C19BK
    public boolean isSupportChildReplaceParentScene() {
        return false;
    }

    @Override // com.bytedance.scene.Scene
    public abstract ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final void beginTransaction() {
        C19A4 c19a4 = this.LLJI;
        if (c19a4.LJI) {
            throw new IllegalStateException("you must call commitTransaction before another beginTransaction");
        }
        c19a4.LJI = true;
    }

    public final void commitTransaction() {
        final C19A4 c19a4 = this.LLJI;
        if (!c19a4.LJI) {
            throw new IllegalStateException("you must call beginTransaction before commitTransaction");
        }
        if (((ArrayList) c19a4.LJII).size() > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (AbstractC21495219Ag abstractC21495219Ag : (ArrayList) c19a4.LJII) {
                List arrayList = (List) linkedHashMap.get(abstractC21495219Ag.LIZ);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(abstractC21495219Ag.LIZ, arrayList);
                }
                arrayList.add(abstractC21495219Ag);
            }
            loop1: for (final Scene scene : linkedHashMap.keySet()) {
                List list = (List) linkedHashMap.get(scene);
                EnumC214943199x enumC214943199x = scene.mState;
                final EnumC214943199x enumC214943199x2 = ((AbstractC21495219Ag) ListProtector.get(list, list.size() - 1)).LIZIZ;
                final boolean z = ((AbstractC21495219Ag) ListProtector.get(list, list.size() - 1)).LIZJ;
                final boolean z2 = ((AbstractC21495219Ag) ListProtector.get(list, list.size() - 1)).LIZLLL;
                final boolean z3 = ((AbstractC21495219Ag) ListProtector.get(list, list.size() - 1)).LJ;
                if (enumC214943199x != enumC214943199x2 || z || z2 || z3) {
                    if (enumC214943199x == EnumC214943199x.NONE) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break loop1;
                            }
                            AbstractC21495219Ag abstractC21495219Ag2 = (AbstractC21495219Ag) ListProtector.get(list, size);
                            if (abstractC21495219Ag2 instanceof C19AN) {
                                C19AN c19an = (C19AN) abstractC21495219Ag2;
                                if (c19an != null) {
                                    if (((HashMap) c19a4.LIZJ.LIZJ).get(c19an.LJIIJJI) != null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("already have a Scene with tag ");
                                        sbLIZ.append(c19an.LJIIJJI);
                                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                    final int i = c19an.LJIIJ;
                                    final String str = c19an.LJIIJJI;
                                    C19A4.LJ(new C19AA(c19a4, scene, i, str, enumC214943199x2, z, z2, z3) { // from class: X.19Ac
                                        @Override // X.C19AA
                                        public final void LIZIZ(boolean z4) {
                                            Scene scene2 = this.LIZ;
                                            if (scene2.mView != null && this.LIZLLL) {
                                                C19A4.LJIIJ(scene2, 8);
                                            }
                                        }

                                        @Override // X.C19AA
                                        public final void LIZJ(boolean z4) {
                                            Scene scene2 = this.LIZ;
                                            if (scene2.mView != null && this.LIZJ) {
                                                C19A4.LJIIJ(scene2, 0);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        throw new IllegalStateException("you must add Scene first");
                    }
                    final int i2 = -1;
                    final String str2 = null;
                    C19A4.LJ(new C19AA(c19a4, scene, i2, str2, enumC214943199x2, z, z2, z3) { // from class: X.19Ac
                        @Override // X.C19AA
                        public final void LIZIZ(boolean z4) {
                            Scene scene2 = this.LIZ;
                            if (scene2.mView != null && this.LIZLLL) {
                                C19A4.LJIIJ(scene2, 8);
                            }
                        }

                        @Override // X.C19AA
                        public final void LIZJ(boolean z4) {
                            Scene scene2 = this.LIZ;
                            if (scene2.mView != null && this.LIZJ) {
                                C19A4.LJIIJ(scene2, 0);
                            }
                        }
                    });
                }
            }
            ((ArrayList) c19a4.LJII).clear();
        }
        c19a4.LJI = false;
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDestroy() {
        LLLIIIIL(EnumC214943199x.NONE);
        super.dispatchDestroy();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDestroyView() {
        LLLIIIIL(EnumC214943199x.CREATED);
        super.dispatchDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchPause() {
        LLLIILIL(EnumC214943199x.STARTED);
        super.dispatchPause();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchStop() {
        LLLIILIL(EnumC214943199x.ACTIVITY_CREATED);
        super.dispatchStop();
    }

    @Override // X.C19BK
    public final List<Scene> getSceneList() {
        return this.LLJI.LJII();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchResume() {
        super.dispatchResume();
        LLLIILIL(EnumC214943199x.RESUMED);
        LLLIZZ();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchStart() {
        super.dispatchStart();
        LLLIILIL(EnumC214943199x.STARTED);
        LLLJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDetachActivity() {
        super.dispatchDetachActivity();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchDetachScene() {
        super.dispatchDetachScene();
    }

    @Override // X.C19BK
    public final boolean isSupportRestore() {
        return this.LLJILJIL;
    }

    public final void LLLIIIIL(EnumC214943199x enumC214943199x) {
        C19A4 c19a4 = this.LLJI;
        List<Scene> listLJII = c19a4.LJII();
        for (int i = 0; i <= listLJII.size() - 1; i++) {
            Scene scene = (Scene) ListProtector.get(listLJII, i);
            if (c19a4.LIZJ(scene)) {
                c19a4.LIZ(scene);
                c19a4.LJIIIIZZ(c19a4.LIZ, scene, enumC214943199x, false, new ARunnableS97S0200000_28(scene, c19a4, 7));
            }
        }
    }

    public final void LLLIILIL(EnumC214943199x enumC214943199x) {
        C19A4 c19a4 = this.LLJI;
        List listUnmodifiableList = Collections.unmodifiableList(c19a4.LIZJ.LIZ);
        for (int i = 0; i <= listUnmodifiableList.size() - 1; i++) {
            GroupRecord groupRecord = (GroupRecord) ListProtector.get(listUnmodifiableList, i);
            if (!groupRecord.isHidden) {
                Scene scene = groupRecord.LLILLJJLI;
                if (c19a4.LIZJ(scene)) {
                    c19a4.LIZ(scene);
                    c19a4.LJIIIIZZ(c19a4.LIZ, groupRecord.LLILLJJLI, enumC214943199x, false, new ARunnableS97S0200000_28(scene, c19a4, 8));
                }
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchActivityCreated(Bundle bundle) {
        super.dispatchActivityCreated(bundle);
        LLLIIIIL(EnumC214943199x.ACTIVITY_CREATED);
        LLLILZLLLI();
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchAttachActivity(Activity activity) {
        super.dispatchAttachActivity(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchAttachScene(Scene scene) {
        super.dispatchAttachScene(scene);
        if (scene != 0) {
            if (scene instanceof C19BK) {
                if (!((C19BK) scene).isSupportRestore()) {
                    disableSupportRestore();
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown parent Scene type ");
                sbLIZ.append(scene.getClass());
                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchCreate(Bundle bundle) {
        super.dispatchCreate(bundle);
        LLLIIIIL(EnumC214943199x.CREATED);
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchSaveInstanceState(Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
    }

    public final <T extends Scene> T findSceneByTag(String str) {
        GroupRecord groupRecord;
        C12WP.LIZ();
        if (str == null || (groupRecord = (GroupRecord) ((HashMap) this.LLJI.LIZJ.LIZJ).get(str)) == null) {
            return null;
        }
        return (T) groupRecord.LLILLJJLI;
    }

    public final String findTagByScene(Scene scene) {
        GroupRecord groupRecordLJFF;
        C12WP.LIZ();
        if (scene == null || (groupRecordLJFF = this.LLJI.LJFF(scene)) == null) {
            return null;
        }
        return groupRecordLJFF.LLILLL;
    }

    @Override // X.C19BK
    public String getSceneDebugInfo(Scene scene) {
        Scene scene2 = scene.mParentScene;
        if (scene2 == null) {
            return null;
        }
        if (scene2 == this) {
            String strFindTagByScene = findTagByScene(scene);
            boolean z = !isShow(scene);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag: ");
            sbLIZ.append(strFindTagByScene);
            sbLIZ.append(" ");
            StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                sb.append("hidden ");
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Scene parent is incorrect");
    }

    public final void hide(Scene scene) {
        LLLILZ(scene, LLJILJILJ);
    }

    public final boolean isAdded(Scene scene) {
        if (this.LLJI.LJFF(scene) != null) {
            return true;
        }
        return false;
    }

    public final boolean isShow(Scene scene) {
        return isShowing(scene);
    }

    public final boolean isShowing(Scene scene) {
        if (this.LLJI.LJFF(scene) == null) {
            return false;
        }
        return !r0.isHidden;
    }

    @Override // com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            if (!bundle.getBoolean("bd-scene-group:support_restore", isSupportRestore())) {
                disableSupportRestore();
            }
            if (isSupportRestore()) {
                C19A4 c19a4 = this.LLJI;
                Activity activityRequireActivity = requireActivity();
                C19AY c19ay = c19a4.LIZJ;
                List<GroupRecord> list = c19ay.LIZ;
                if (list != null && ((ArrayList) list).size() > 0) {
                    throw new IllegalStateException("mSceneList size is not zero, Scene is added before restore");
                }
                ArrayList<GroupRecord> arrayList = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:group_stack"));
                c19ay.LIZ = arrayList;
                for (GroupRecord groupRecord : arrayList) {
                    Scene sceneLIZIZ = C2350509Ix.LIZIZ(activityRequireActivity, groupRecord.LLILZIL, null);
                    groupRecord.LLILLJJLI = sceneLIZIZ;
                    ((HashMap) c19ay.LIZIZ).put(sceneLIZIZ, groupRecord);
                    ((HashMap) c19ay.LIZJ).put(groupRecord.LLILLL, groupRecord);
                }
                List listUnmodifiableList = Collections.unmodifiableList(c19a4.LIZJ.LIZ);
                if (listUnmodifiableList.size() != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
                    for (int i = 0; i <= listUnmodifiableList.size() - 1; i++) {
                        GroupRecord groupRecord2 = (GroupRecord) ListProtector.get(listUnmodifiableList, i);
                        Scene scene = groupRecord2.LLILLJJLI;
                        groupRecord2.LLILZLL = (Bundle) ListProtector.get(parcelableArrayList, i);
                        if (c19a4.LIZJ(scene)) {
                            c19a4.LIZ(scene);
                            C19A3 c19a3 = c19a4.LIZ;
                            c19a4.LJIIIIZZ(c19a3, scene, c19a3.mState, false, new ARunnableS97S0200000_28(scene, c19a4, 9));
                        } else {
                            throw new C214826195k("Scene is not found");
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!bundle.containsKey("bd-scene-group:support_restore")) {
            bundle.putBoolean("bd-scene-group:support_restore", isSupportRestore());
            if (isSupportRestore()) {
                C19A4 c19a4 = this.LLJI;
                C19AY c19ay = c19a4.LIZJ;
                c19ay.getClass();
                ArrayList arrayList = new ArrayList(c19ay.LIZ);
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (int i = 0; i <= arrayList.size() - 1; i++) {
                    GroupRecord groupRecord = (GroupRecord) ListProtector.get(arrayList, i);
                    if (groupRecord.LLILLJJLI.mSceneRestoreEnabled) {
                        arrayList2.add(groupRecord);
                    }
                }
                C786410Ut5.LJJIL(bundle, "bd-scene-nav:group_stack", new ArrayList(arrayList2));
                int i2 = bundle.getInt("bd-scene:scene_save_instance_state_reason", 1);
                ArrayList arrayList3 = new ArrayList();
                List<Scene> listLJII = c19a4.LJII();
                for (int i3 = 0; i3 <= listLJII.size() - 1; i3++) {
                    Scene scene = (Scene) ListProtector.get(listLJII, i3);
                    if (scene.mSceneRestoreEnabled) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("bd-scene:scene_save_instance_state_reason", i2);
                        scene.dispatchSaveInstanceState(bundle2);
                        arrayList3.add(bundle2);
                    }
                }
                C786410Ut5.LJJIL(bundle, "bd-scene-nav:group_scene_manager", arrayList3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-group:support_restore");
    }

    public final void remove(Scene scene) {
        LLLJL(scene, LLJILJILJ);
    }

    public final void show(Scene scene) {
        LLLLII(scene, LLJILJILJ);
    }

    public final void unregisterChildSceneLifecycleCallbacks(C19AH c19ah) {
        C12WP.LIZ();
        int size = ((ArrayList) this.LLJIJIL).size();
        for (int i = 0; i < size; i++) {
            if (((C801600VcU) ListProtector.get(this.LLJIJIL, i)).LIZ == c19ah) {
                Object obj = ListProtector.get(this.LLJIJIL, i);
                if (obj != null) {
                    ((ArrayList) this.LLJIJIL).remove(obj);
                    return;
                }
                return;
            }
        }
    }

    public static void LLLIL(ViewGroup viewGroup, List list) {
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof o) {
                ((ArrayList) list).add(childAt);
            } else if (childAt instanceof ViewGroup) {
                LLLIL((ViewGroup) childAt, list);
            }
        }
    }

    public final void LLLILZ(final Scene scene, final InterfaceC21499419Bw interfaceC21499419Bw) {
        C12WP.LIZ();
        final C19A4 c19a4 = this.LLJI;
        c19a4.LIZIZ(scene);
        if (!c19a4.LJI && c19a4.LIZJ.LIZ(scene) == null) {
            throw new IllegalStateException("Target scene is not find");
        }
        C19AA c19aa = new C19AA(c19a4, scene, interfaceC21499419Bw) { // from class: X.19AP
            public final InterfaceC21499419Bw LJIIJ;

            @Override // X.C19AA
            public final void LIZIZ(boolean z) {
                final C195F c195fLIZ;
                Scene scene2 = this.LIZ;
                View view = scene2.mView;
                if (view == null) {
                    return;
                }
                C19A4.LJIIJ(scene2, 8);
                if (!z || (c195fLIZ = this.LJIIJ.LIZ()) == null) {
                    return;
                }
                int visibility = view.getVisibility();
                C786410Ut5.LJLLLLLL(0, view);
                c195fLIZ.LIZ(new ARunnableS36S0201000_32(view, visibility, this, 1));
                C19A4.LJIIIIZZ.put(this.LIZ, new C1447920nmY() { // from class: X.19BG
                    @Override // X.C1447920nmY
                    public final void LIZ() {
                        super.LIZ();
                        c195fLIZ.LIZJ();
                    }
                });
                c195fLIZ.LJII(this.LIZ.mView);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                EnumC214943199x enumC214943199x = EnumC214943199x.ACTIVITY_CREATED;
                EnumC214943199x enumC214943199x2 = c19a4.LIZ.mState;
                super(c19a4, scene, -1, null, enumC214943199x.value >= enumC214943199x2.value ? enumC214943199x2 : enumC214943199x, false, true, false);
                this.LJIIJ = interfaceC21499419Bw;
            }
        };
        if (c19a4.LJI) {
            ((ArrayList) c19a4.LJII).add(c19aa);
        } else {
            C19A4.LJ(c19aa);
        }
    }

    public final void LLLJL(Scene scene, InterfaceC21499419Bw interfaceC21499419Bw) {
        C12WP.LIZ();
        C19A4 c19a4 = this.LLJI;
        c19a4.LIZIZ(scene);
        if (!c19a4.LJI && c19a4.LIZJ.LIZ(scene) == null) {
            throw new IllegalStateException("Target scene is not find");
        }
        C19AO c19ao = new C19AO(c19a4, scene, interfaceC21499419Bw);
        if (c19a4.LJI) {
            ((ArrayList) c19a4.LJII).add(c19ao);
        } else {
            C19A4.LJ(c19ao);
        }
    }

    public final void LLLLII(final Scene scene, final InterfaceC21499419Bw interfaceC21499419Bw) {
        C12WP.LIZ();
        final C19A4 c19a4 = this.LLJI;
        c19a4.LIZIZ(scene);
        if (!c19a4.LJI && c19a4.LIZJ.LIZ(scene) == null) {
            throw new IllegalStateException("Target scene is not find");
        }
        C19AA c19aa = new C19AA(c19a4, scene, interfaceC21499419Bw) { // from class: X.19AQ
            public final InterfaceC21499419Bw LJIIJ;

            @Override // X.C19AA
            public final void LIZIZ(boolean z) {
                View view;
                final C195F c195fLIZ;
                if (!z || (view = this.LIZ.mView) == null || (c195fLIZ = this.LJIIJ.LIZ()) == null) {
                    return;
                }
                c195fLIZ.LIZ(new ARunnableS132S0100000_32(this, 21));
                C19A4.LJIIIIZZ.put(this.LIZ, new C1447920nmY() { // from class: X.19BI
                    @Override // X.C1447920nmY
                    public final void LIZ() {
                        super.LIZ();
                        c195fLIZ.LIZJ();
                    }
                });
                c195fLIZ.LJII(view);
            }

            @Override // X.C19AA
            public final void LIZJ(boolean z) {
                Scene scene2 = this.LIZ;
                if (scene2.mView == null) {
                    return;
                }
                C19A4.LJIIJ(scene2, 0);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                EnumC214943199x enumC214943199x = EnumC214943199x.RESUMED;
                EnumC214943199x enumC214943199x2 = c19a4.LIZ.mState;
                super(c19a4, scene, -1, null, enumC214943199x.value >= enumC214943199x2.value ? enumC214943199x2 : enumC214943199x, true, false, false);
                this.LJIIJ = interfaceC21499419Bw;
            }
        };
        if (c19a4.LJI) {
            ((ArrayList) c19a4.LJII).add(c19aa);
        } else {
            C19A4.LJ(c19aa);
        }
    }

    public final <T extends Scene> T createOrReuse(String str, C13XB<T> c13xb) {
        T t = (T) findSceneByTag(str);
        if (t == null) {
            return c13xb.call();
        }
        return t;
    }

    @Override // com.bytedance.scene.Scene
    public final void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        Scene sceneLIZIZ;
        super.dispatchCreateView(bundle, viewGroup);
        View view = this.mView;
        if (view instanceof ViewGroup) {
            this.LLJI.LIZIZ = (ViewGroup) view;
            ArrayList arrayList = new ArrayList();
            LLLIL((ViewGroup) requireView(), arrayList);
            if (arrayList.size() != 0) {
                if (!isSupportRestore()) {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        o oVar = (o) ListProtector.get(arrayList, i);
                        ViewGroup viewGroup2 = (ViewGroup) oVar.getParent();
                        int id = viewGroup2.getId();
                        if (id != -1) {
                            if (sparseArray.get(id) == null) {
                                sparseArray.put(id, viewGroup2);
                            } else if (sparseArray.get(id) != viewGroup2) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ScenePlaceHolderView' parent ViewGroup should have unique id, the duplicate id is ");
                                sbLIZ.append(C19BL.LIZIZ(requireSceneContext(), id));
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
                            String sceneName = oVar.getSceneName();
                            String sceneTag = oVar.getSceneTag();
                            Bundle arguments = oVar.getArguments();
                            InterfaceC214877197j sceneComponentFactory = oVar.getSceneComponentFactory();
                            if (sceneComponentFactory == null || (sceneLIZIZ = sceneComponentFactory.LIZ(requireSceneContext().getClassLoader(), sceneName, arguments)) == null) {
                                sceneLIZIZ = C2350509Ix.LIZIZ(requireSceneContext(), sceneName, arguments);
                            }
                            int iIndexOfChild = viewGroup2.indexOfChild(oVar);
                            C786410Ut5.LJJJLZIJ(oVar, viewGroup2);
                            if (oVar.getVisibility() == 0) {
                                add(id, sceneLIZIZ, sceneTag);
                            } else if (oVar.getVisibility() == 8) {
                                beginTransaction();
                                add(id, sceneLIZIZ, sceneTag);
                                hide(sceneLIZIZ);
                                commitTransaction();
                            } else {
                                throw new IllegalStateException("ScenePlaceHolderView's visibility can't be View.INVISIBLE, use View.VISIBLE or View.GONE instead");
                            }
                            View viewRequireView = sceneLIZIZ.requireView();
                            if (oVar.getId() != -1) {
                                if (viewRequireView.getId() == -1) {
                                    viewRequireView.setId(oVar.getId());
                                } else if (oVar.getId() != viewRequireView.getId()) {
                                    throw new IllegalStateException(C786410Ut5.j4("ScenePlaceHolderView's id %s is different from Scene root view's id %s", new Object[]{C19BL.LIZIZ(requireSceneContext(), oVar.getId()), C19BL.LIZIZ(requireSceneContext(), viewRequireView.getId())}));
                                }
                            }
                            C786410Ut5.LJJJLZIJ(viewRequireView, viewGroup2);
                            viewGroup2.addView(viewRequireView, iIndexOfChild, layoutParams);
                        } else {
                            throw new IllegalArgumentException("ScenePlaceHolderView parent id can't be View.NO_ID");
                        }
                    }
                } else {
                    throw new IllegalStateException("ScenePlaceHolderView can only be used when support restore is disabled");
                }
            }
            LLLIIIIL(EnumC214943199x.VIEW_CREATED);
            return;
        }
        throw new IllegalArgumentException("GroupScene onCreateView view must be ViewGroup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJIZL(scene);
                }
            }
        }
        super.dispatchOnPreSceneDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreScenePaused(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIILIIL(scene);
                }
            }
        }
        super.dispatchOnPreScenePaused(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneResumed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIJJ(scene);
                }
            }
        }
        super.dispatchOnPreSceneResumed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneStarted(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJ(scene);
                }
            }
        }
        super.dispatchOnPreSceneStarted(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneStopped(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJL(scene);
                }
            }
        }
        super.dispatchOnPreSceneStopped(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneViewDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJ();
                }
            }
        }
        super.dispatchOnPreSceneViewDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJ(scene);
                }
            }
        }
        super.dispatchOnSceneDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnScenePaused(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIFFI(scene);
                }
            }
        }
        super.dispatchOnScenePaused(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneResumed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LIZ(scene);
                }
            }
        }
        super.dispatchOnSceneResumed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneStarted(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LIZLLL(scene);
                }
            }
        }
        super.dispatchOnSceneStarted(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneStopped(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIZ(scene);
                }
            }
        }
        super.dispatchOnSceneStopped(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneViewDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIII(scene);
                }
            }
        }
        super.dispatchOnSceneViewDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIIZ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneDestroyed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperScenePaused(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LIZJ(scene);
                }
            }
        }
        super.dispatchOnSuperScenePaused(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneResumed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIIJ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneResumed(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneStarted(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIIZ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneStarted(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneStopped(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIIIZZ(scene);
                }
            }
        }
        super.dispatchOnSuperSceneStopped(scene, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneViewDestroyed(Scene scene, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIZILJ();
                }
            }
        }
        super.dispatchOnSuperSceneViewDestroyed(scene, z);
    }

    public final void hide(Scene scene, int i) {
        LLLILZ(scene, new C19BE(scene, i));
    }

    public final void registerChildSceneLifecycleCallbacks(C19AH c19ah, boolean z) {
        C12WP.LIZ();
        ((ArrayList) this.LLJIJIL).add(new C801600VcU(c19ah, Boolean.valueOf(z)));
    }

    public final void remove(Scene scene, int i) {
        LLLJL(scene, new C19BE(scene, i));
    }

    public final void show(Scene scene, int i) {
        LLLLII(scene, new C19BE(scene, i));
    }

    public final void add(int i, Scene scene, String str) {
        LLLII(i, scene, str, LLJILJILJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIILJJIL();
                }
            }
        }
        super.dispatchOnPreSceneActivityCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIJIIJIL(scene, bundle);
                }
            }
        }
        super.dispatchOnPreSceneCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIJJLI(scene, bundle);
                }
            }
        }
        super.dispatchOnPreSceneSaveInstanceState(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnPreSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJI();
                }
            }
        }
        super.dispatchOnPreSceneViewCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIIZI(scene);
                }
            }
        }
        super.dispatchOnSceneActivityCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJJZ(scene, bundle);
                }
            }
        }
        super.dispatchOnSceneCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIL(scene, bundle);
                }
            }
        }
        super.dispatchOnSceneSaveInstanceState(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void dispatchOnSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJI(scene, bundle);
                }
            }
        }
        super.dispatchOnSceneViewCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneActivityCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJII();
                }
            }
        }
        super.dispatchOnSuperSceneActivityCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJIIJJI(scene, bundle);
                }
            }
        }
        super.dispatchOnSuperSceneCreated(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneSaveInstanceState(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJJLIIL(scene, bundle);
                }
            }
        }
        super.dispatchOnSuperSceneSaveInstanceState(scene, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public void dispatchOnSuperSceneViewCreated(Scene scene, Bundle bundle, boolean z) {
        if (scene != this) {
            for (C801600VcU c801600VcU : new ArrayList(this.LLJIJIL)) {
                if (z || ((Boolean) c801600VcU.LIZIZ).booleanValue()) {
                    ((C19AH) c801600VcU.LIZ).LJJIJIIJI();
                }
            }
        }
        super.dispatchOnSuperSceneViewCreated(scene, bundle, z);
    }

    public final void LLLII(int i, Scene scene, String str, InterfaceC21499419Bw interfaceC21499419Bw) {
        String strValueOf;
        C12WP.LIZ();
        if (!TextUtils.isEmpty(str)) {
            if (scene != this) {
                if (isAdded(scene)) {
                    int i2 = this.LLJI.LIZJ.LIZ(scene).LL;
                    if (i2 == i) {
                        String str2 = this.LLJI.LIZJ.LIZ(scene).LLILLL;
                        if (!str2.equals(str)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Scene is already added, tag ");
                            sbLIZ.append(str2);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        try {
                            strValueOf = getResources().getResourceName(i2);
                        } catch (Resources.NotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            strValueOf = String.valueOf(i2);
                        }
                        throw new IllegalArgumentException("Scene is already added to another container, viewId " + strValueOf);
                    }
                } else {
                    Scene sceneFindSceneByTag = findSceneByTag(str);
                    if (sceneFindSceneByTag != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("already have a Scene ");
                        sbLIZ2.append(sceneFindSceneByTag.toString());
                        sbLIZ2.append(" with tag ");
                        sbLIZ2.append(str);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                Scene scene2 = scene.mParentScene;
                if (scene2 != null && scene2 != this) {
                    throw new IllegalArgumentException("Scene already has a parent, parent " + scene.mParentScene);
                }
                if (isSupportRestore() && scene.mSceneRestoreEnabled && !C2350509Ix.LIZJ(scene)) {
                    throw new IllegalArgumentException("Scene " + scene.getClass().getName() + " must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
                }
                C19A4 c19a4 = this.LLJI;
                c19a4.LIZIZ(scene);
                C19AN c19an = new C19AN(c19a4, i, scene, str, interfaceC21499419Bw);
                if (c19a4.LJI) {
                    ((ArrayList) c19a4.LJII).add(c19an);
                    return;
                } else {
                    C19A4.LJ(c19an);
                    return;
                }
            }
            throw new IllegalArgumentException("GroupScene can't be added to itself");
        }
        throw new IllegalArgumentException("tag can't be empty");
    }

    public final void add(int i, Scene scene, String str, int i2) {
        LLLII(i, scene, str, new C19BE(scene, i2));
    }
}
