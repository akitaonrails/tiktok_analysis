package X;

import Y.ARunnableS105S0000000_32;
import Y.ARunnableS132S0100000_32;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.GroupRecord;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.19A4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19A4 {
    public static final HashMap<Scene, C1447920nmY> LJIIIIZZ = new HashMap<>();
    public static final ARunnableS105S0000000_32 LJIIIZ = new ARunnableS105S0000000_32(0);
    public final C19A3 LIZ;
    public ViewGroup LIZIZ;
    public Throwable LJFF;
    public final C19AY LIZJ = new C19AY();
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final Set<C0WIY<Scene, String>> LJ = new HashSet();
    public boolean LJI = false;
    public final List<AbstractC21495219Ag> LJII = new ArrayList();

    public final List<Scene> LJII() {
        C19AY c19ay = this.LIZJ;
        c19ay.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<GroupRecord> it2 = c19ay.LIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LLILLJJLI);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public C19A4(C19A3 c19a3) {
        this.LIZ = c19a3;
    }

    public static void LJ(C19AA c19aa) {
        try {
            c19aa.LIZ(LJIIIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJJZZIII(c19aa.LJFF.LIZLLL, new RunnableC514801zW(th, 45));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC21499119Bt LJI(Scene scene) {
        if (scene == 0) {
            return null;
        }
        if (scene instanceof InterfaceC21499119Bt) {
            return (InterfaceC21499119Bt) scene;
        }
        Scene scene2 = scene.mParentScene;
        if (scene2 == null) {
            return null;
        }
        return LJI(scene2);
    }

    public final void LIZ(Scene scene) {
        String strLIZLLL;
        Iterator it2 = ((HashSet) this.LJ).iterator();
        while (it2.hasNext()) {
            if (((C0WIY) it2.next()).LIZ == scene) {
                if (this.LJFF != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Target scene ");
                    sbLIZ.append(scene.getClass().getCanonicalName());
                    sbLIZ.append(" is already tracked, last exception ");
                    throw new C19BW(C2188811AlT.LIZIZ(sbLIZ), this.LJFF);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Target scene ");
                sbLIZ2.append(scene.getClass().getCanonicalName());
                sbLIZ2.append(" is already tracked");
                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        InterfaceC21499119Bt interfaceC21499119BtLJI = LJI(this.LIZ.mParentScene);
        if (interfaceC21499119BtLJI != null) {
            strLIZLLL = interfaceC21499119BtLJI.LIZLLL(scene.toString());
        } else {
            strLIZLLL = null;
        }
        ((HashSet) this.LJ).add(new C0WIY(scene, strLIZLLL));
    }

    public final void LIZIZ(Scene scene) {
        Iterator it2 = ((HashSet) this.LJ).iterator();
        while (it2.hasNext()) {
            if (((C0WIY) it2.next()).LIZ == scene) {
                if (this.LJFF != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cant add/remove/show/hide ");
                    sbLIZ.append(scene.getClass().getCanonicalName());
                    sbLIZ.append(" before it finish previous add/remove/show/hide operation or in its lifecycle method, last exception ");
                    throw new C19BW(C2188811AlT.LIZIZ(sbLIZ), this.LJFF);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Cant add/remove/show/hide ");
                sbLIZ2.append(scene.getClass().getCanonicalName());
                sbLIZ2.append(" before it finish previous add/remove/show/hide operation or in its lifecycle method");
                throw new C1286450ja7(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final boolean LIZJ(Scene scene) {
        List listUnmodifiableList = Collections.unmodifiableList(this.LIZJ.LIZ);
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            if (((GroupRecord) ListProtector.get(listUnmodifiableList, i)).LLILLJJLI == scene) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(Scene scene) {
        for (C0WIY c0wiy : (HashSet) this.LJ) {
            if (c0wiy.LIZ == scene) {
                if (c0wiy.LIZIZ != 0) {
                    LJI(this.LIZ.mParentScene).LJIIL((String) c0wiy.LIZIZ);
                }
                ((HashSet) this.LJ).remove(c0wiy);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Target scene ");
        sbLIZ.append(scene.getClass().getCanonicalName());
        sbLIZ.append(" is not tracked");
        throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final GroupRecord LJFF(Scene scene) {
        return this.LIZJ.LIZ(scene);
    }

    public static void LJIIJ(Scene scene, int i) {
        View view = scene.mView;
        if (view.getVisibility() != i) {
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void LJIIIIZZ(C19A3 c19a3, Scene scene, EnumC214943199x enumC214943199x, boolean z, Runnable runnable) {
        try {
            LJIIIZ(c19a3, this, scene, enumC214943199x, z, runnable);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJFF = th;
            C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS132S0100000_32(th, 18));
            throw th;
        }
    }

    public static void LJIIIZ(C19A3 c19a3, C19A4 c19a4, Scene scene, EnumC214943199x enumC214943199x, boolean z, Runnable runnable) {
        EnumC214943199x enumC214943199x2 = scene.mState;
        if (enumC214943199x2 == enumC214943199x) {
            runnable.run();
            return;
        }
        if (enumC214943199x2.value < enumC214943199x.value) {
            int i = C214944199y.LIZ[enumC214943199x2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                scene.dispatchResume();
                                LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
                                return;
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("unreachable state case ");
                                sbLIZ.append(enumC214943199x2.getName());
                                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                        scene.dispatchStart();
                        LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
                        return;
                    }
                    GroupRecord groupRecordLJFF = c19a4.LJFF(scene);
                    scene.dispatchActivityCreated(groupRecordLJFF.LLILZLL);
                    groupRecordLJFF.LLILZLL = null;
                    LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
                    return;
                }
                GroupRecord groupRecordLJFF2 = c19a4.LJFF(scene);
                Bundle bundle = groupRecordLJFF2.LLILZLL;
                int i2 = c19a4.LIZJ.LIZ(scene).LL;
                ViewGroup viewGroup = (ViewGroup) c19a3.mView.findViewById(i2);
                if (viewGroup != null) {
                    View view = viewGroup;
                    while (view != c19a3.mView) {
                        Scene scene2 = (Scene) view.getTag(R.id.d8o);
                        if (scene2 == null) {
                            view = (View) view.getParent();
                            if (view == null) {
                                break;
                            }
                        } else {
                            throw new IllegalArgumentException(C786410Ut5.j4("cant add Scene to child Scene %s view hierarchy ", new Object[]{scene2.toString()}));
                        }
                    }
                    scene.dispatchCreateView(bundle, viewGroup);
                    viewGroup.addView(scene.mView);
                    if (groupRecordLJFF2.isHidden) {
                        LJIIJ(scene, 8);
                    }
                    LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
                    return;
                }
                try {
                    String resourceName = c19a3.getResources().getResourceName(i2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" ");
                    sbLIZ2.append(resourceName);
                    sbLIZ2.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(" ");
                    sbLIZ3.append(i2);
                    sbLIZ3.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            scene.dispatchAttachActivity(c19a3.requireActivity());
            scene.dispatchAttachScene(c19a3);
            scene.dispatchCreate(c19a4.LJFF(scene).LLILZLL);
            LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
            return;
        }
        int i3 = C214944199y.LIZ[enumC214943199x2.ordinal()];
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 == 6) {
                            scene.dispatchPause();
                            LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
                            return;
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("unreachable state case ");
                            sbLIZ4.append(enumC214943199x2.getName());
                            throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                    scene.dispatchStop();
                    LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
                    return;
                }
                if (enumC214943199x == EnumC214943199x.VIEW_CREATED) {
                    throw new IllegalArgumentException("cant switch state ACTIVITY_CREATED to VIEW_CREATED");
                }
            }
            View view2 = scene.mView;
            scene.dispatchDestroyView();
            if (z) {
                C19BL.LJFF(view2);
            }
            LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
            return;
        }
        scene.dispatchDestroy();
        scene.dispatchDetachScene();
        scene.dispatchDetachActivity();
        LJIIIZ(c19a3, c19a4, scene, enumC214943199x, z, runnable);
    }
}
