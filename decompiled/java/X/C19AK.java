package X;

import X.C19BK;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.19AK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AK<T extends Scene & C19BK> {
    public final int LIZ;
    public final InterfaceC19394510uF LIZIZ;
    public final T LIZJ;
    public final InterfaceC21498919Br LIZLLL;
    public final boolean LJ;
    public final C19AZ<T> LJFF;
    public final InterfaceC21498219Bk LJI;

    public final void LIZIZ() {
        C19AZ<T> c19az = this.LJFF;
        if (c19az.LIZIZ == C19AU.RESUME) {
            c19az.LIZIZ = C19AU.PAUSE;
            c19az.LIZ.dispatchPause();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke onResume() first, current state ");
            sbLIZ.append(c19az.LIZIZ.toString());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZJ() {
        C19AZ<T> c19az = this.LJFF;
        C19AU c19au = c19az.LIZIZ;
        if (c19au == C19AU.START || c19au == C19AU.PAUSE) {
            c19az.LIZIZ = C19AU.RESUME;
            c19az.LIZ.dispatchResume();
            c19az.LJ = false;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke onStart() or onPause() first, current state ");
            sbLIZ.append(c19az.LIZIZ.toString());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJ() {
        C19AZ<T> c19az = this.LJFF;
        C19AU c19au = c19az.LIZIZ;
        if (c19au == C19AU.ACTIVITY_CREATED || c19au == C19AU.STOP) {
            c19az.LIZIZ = C19AU.START;
            c19az.LIZ.dispatchStart();
            c19az.LJ = false;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke onActivityCreated() or onStop() first, current state ");
            sbLIZ.append(c19az.LIZIZ.toString());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJFF() {
        C19AZ<T> c19az = this.LJFF;
        C19AU c19au = c19az.LIZIZ;
        if (c19au == C19AU.PAUSE || c19au == C19AU.START) {
            c19az.LIZIZ = C19AU.STOP;
            c19az.LIZ.dispatchStop();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke onPause() or onStart() first, current state ");
            sbLIZ.append(c19az.LIZIZ.toString());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJI() {
        C19AZ<T> c19az = this.LJFF;
        C19AU c19au = c19az.LIZIZ;
        if (c19au != C19AU.STOP && c19au != C19AU.ACTIVITY_CREATED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invoke onStop() or onActivityCreated() first, current state ");
            sbLIZ.append(c19az.LIZIZ.toString());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c19az.LIZIZ = C19AU.NONE;
        c19az.LIZ.dispatchDestroyView();
        c19az.LIZ.dispatchDestroy();
        c19az.LIZ.dispatchDetachScene();
        Activity activityRequireActivity = c19az.LIZ.requireActivity();
        c19az.LIZ.dispatchDetachActivity();
        c19az.LIZ.mRootScopeFactory = null;
        InterfaceC21498219Bk interfaceC21498219Bk = c19az.LIZLLL;
        if (interfaceC21498219Bk != null) {
            if (c19az.LIZJ) {
                if (!c19az.LJ) {
                    interfaceC21498219Bk.LJJIJIIJIL();
                } else if (activityRequireActivity.isFinishing()) {
                    c19az.LIZLLL.LJJIJIIJIL();
                }
            }
            c19az.LIZLLL = null;
        }
        c19az.LIZ = null;
    }

    public final void LIZLLL(Bundle bundle) {
        C19AZ<T> c19az = this.LJFF;
        if (!c19az.LIZJ) {
            C21494919Ad.LIZIZ.LIZ("SceneLifecycleManager", "cant invoke onSaveInstanceState when not support restore");
            return;
        }
        C19BL.LJI(bundle, "outState can't be null");
        if (c19az.LIZIZ != C19AU.NONE) {
            C786410Ut5.LJJJI("SceneLifecycleManager#SCENE", c19az.LIZ.getClass().getName(), bundle);
            int i = bundle.getInt("bd-scene:scene_save_instance_state_reason", 1);
            if (c19az.LIZLLL != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("bd-scene:scene_save_instance_state_reason", i);
                c19az.LIZ.dispatchSaveInstanceState(bundle2);
                bundle2.putBoolean("SceneLifecycleManager_onSaveInstanceState_TAG", true);
                c19az.LIZLLL.LIZ(bundle, bundle2);
            } else {
                bundle.putInt("bd-scene:scene_save_instance_state_reason", i);
                c19az.LIZ.dispatchSaveInstanceState(bundle);
                bundle.putBoolean("SceneLifecycleManager_onSaveInstanceState_TAG", true);
            }
            c19az.LJ = true;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invoke onActivityCreated() first, current state ");
        sbLIZ.append(c19az.LIZIZ.toString());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ(Activity activity, Bundle bundle) {
        InterfaceC21498219Bk interfaceC21498219Bk;
        C19AZ<T> c19az = this.LJFF;
        InterfaceC19394510uF interfaceC19394510uF = this.LIZIZ;
        int i = this.LIZ;
        T t = this.LIZJ;
        InterfaceC21498919Br interfaceC21498919Br = this.LIZLLL;
        InterfaceC21498219Bk interfaceC21498219Bk2 = this.LJI;
        boolean z = this.LJ;
        if (!z) {
            bundle = null;
        }
        c19az.getClass();
        ViewGroup viewGroup = (ViewGroup) interfaceC19394510uF.LIZ(i);
        if (c19az.LIZIZ == C19AU.NONE) {
            C19BL.LJI(activity, "activity can't be null");
            C19BL.LJI(viewGroup, "viewGroup can't be null");
            C19BL.LJI(t, "scene can't be null");
            C19BL.LJI(interfaceC21498919Br, "rootScopeFactory can't be null");
            EnumC214943199x enumC214943199x = t.mState;
            EnumC214943199x enumC214943199x2 = EnumC214943199x.NONE;
            if (enumC214943199x == enumC214943199x2) {
                c19az.LIZJ = z;
                if (!z && bundle != null) {
                    throw new IllegalArgumentException("savedInstanceState should be null when not support restore");
                }
                c19az.LIZLLL = interfaceC21498219Bk2;
                c19az.LIZIZ = C19AU.ACTIVITY_CREATED;
                c19az.LJ = false;
                c19az.LIZ = t;
                if (!z) {
                    t.disableSupportRestore();
                }
                T t2 = c19az.LIZ;
                t2.mRootScopeFactory = interfaceC21498919Br;
                t2.dispatchAttachActivity(activity);
                c19az.LIZ.dispatchAttachScene(null);
                if (bundle != null && (((interfaceC21498219Bk = c19az.LIZLLL) == null || (bundle = interfaceC21498219Bk.onRestoreInstanceState(bundle)) != null) && !bundle.getBoolean("SceneLifecycleManager_onSaveInstanceState_TAG"))) {
                    throw new C19BV("savedInstanceState argument is not null, but previous onSaveInstanceState() is missing");
                }
                c19az.LIZ.dispatchCreate(bundle);
                c19az.LIZ.dispatchCreateView(bundle, viewGroup);
                viewGroup.addView(c19az.LIZ.requireView(), new ViewGroup.LayoutParams(-1, -1));
                c19az.LIZ.dispatchActivityCreated(bundle);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene state must be ");
            sbLIZ.append(enumC214943199x2.name);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("invoke onDestroyView() first, current state ");
        sbLIZ2.append(c19az.LIZIZ.toString());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C19AK(int i, InterfaceC19394510uF interfaceC19394510uF, T t, InterfaceC21498919Br interfaceC21498919Br, boolean z) {
        this(i, interfaceC19394510uF, t, interfaceC21498919Br, null, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19AK(int i, InterfaceC19394510uF interfaceC19394510uF, Scene scene, InterfaceC21498919Br interfaceC21498919Br, C1701280uNC c1701280uNC, boolean z) {
        this.LJFF = new C19AZ<>();
        this.LIZ = i;
        this.LIZIZ = interfaceC19394510uF;
        this.LIZJ = scene;
        this.LIZLLL = interfaceC21498919Br;
        this.LJI = c1701280uNC;
        this.LJ = z;
    }
}
