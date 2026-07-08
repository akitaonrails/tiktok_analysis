package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19AB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AB implements InterfaceC21499219Bu {
    public final NavigationScene LIZ;
    public final InterfaceC21496319Ar LIZIZ;
    public final C19AC LIZJ;
    public final Scene LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC21499219Bu
    public final void execute(Runnable runnable) {
        Scene sceneLIZ;
        NavigationScene navigationScene;
        InterfaceC214877197j interfaceC214877197j;
        Scene scene = this.LIZLLL;
        EnumC214943199x enumC214943199x = scene.mState;
        EnumC214943199x enumC214943199x2 = EnumC214943199x.NONE;
        if (enumC214943199x == enumC214943199x2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (scene.mSceneRestoreEnabled) {
            if (C2350509Ix.LIZJ(scene)) {
                Record recordLIZLLL = this.LIZJ.LIZLLL(this.LIZLLL);
                EnumC214943199x enumC214943199x3 = this.LIZLLL.mState;
                C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RecreateOperation current Scene save latest data, current Scene instance ");
                sbLIZ.append(this.LIZLLL.toString());
                c21494919Ad.LIZIZ("RecreateOperation", C2188811AlT.LIZIZ(sbLIZ));
                Bundle bundle = new Bundle();
                bundle.putInt("bd-scene:scene_save_instance_state_reason", this.LJ);
                this.LIZLLL.dispatchSaveInstanceState(bundle);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RecreateOperation current Scene destroy itself, current Scene instance ");
                sbLIZ2.append(this.LIZLLL.toString());
                c21494919Ad.LIZIZ("RecreateOperation", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZIZ.LJIJJ(this.LIZ, this.LIZLLL, enumC214943199x2, null, false, null);
                C19AC c19ac = this.LIZJ;
                Scene scene2 = this.LIZLLL;
                boolean z = false;
                if (!((ArrayList) c19ac.LIZ).isEmpty() && ((Record) ListProtector.get(c19ac.LIZ, 0)).mScene == scene2) {
                    z = true;
                }
                if (z && (interfaceC214877197j = (navigationScene = this.LIZ).LLJIJIL) != null && (sceneLIZ = interfaceC214877197j.LIZ(navigationScene.requireActivity().getClassLoader(), recordLIZLLL.LLILLJJLI, null)) != null) {
                    if (sceneLIZ.mParentScene == null) {
                        c21494919Ad.LIZIZ("RecreateOperation", "RecreateOperation create new Scene by SceneComponentFactory");
                    } else {
                        throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                    }
                } else {
                    c21494919Ad.LIZIZ("RecreateOperation", "RecreateOperation create new Scene directly");
                    sceneLIZ = C2350509Ix.LIZ(null, this.LIZLLL.getClass());
                }
                recordLIZLLL.mScene = sceneLIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("RecreateOperation new created Scene restore from previous data, new Scene instance ");
                sbLIZ3.append(sceneLIZ.toString());
                c21494919Ad.LIZIZ("RecreateOperation", C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZIZ.LJIJJ(this.LIZ, sceneLIZ, enumC214943199x3, bundle, false, null);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Scene ");
            sbLIZ4.append(this.LIZLLL.getClass().getName());
            sbLIZ4.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated.");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Scene ");
        sbLIZ5.append(this.LIZLLL.getClass().getName());
        sbLIZ5.append(" don't support restore, so it can't use recreate");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
    }

    public C19AB(NavigationScene navigationScene, C19A6 c19a6, C19AC c19ac, Scene scene, int i) {
        this.LIZ = navigationScene;
        this.LIZIZ = c19a6;
        this.LIZJ = c19ac;
        this.LIZLLL = scene;
        this.LJ = i;
    }
}
