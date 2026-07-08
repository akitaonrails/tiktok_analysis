package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.ActivityStatusRecord;
import com.bytedance.scene.navigation.AsyncHandler;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19A6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19A6 implements InterfaceC21498719Bp, InterfaceC21496319Ar {
    public static final C19BU LJJIFFI = new Runnable() { // from class: X.19BU
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("NavigationSceneManager@df89.<field>$1");
            C1C7U.LIZIZ("NavigationSceneManager@df89.<field>$1");
        }
    };
    public final NavigationScene LIZ;
    public final NavigationScene LIZLLL;
    public final boolean LJIIIZ;
    public C21496519At LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIJI;
    public Throwable LJIJJ;
    public final C19AC LIZIZ = new C19AC();
    public C19BT LIZJ = null;
    public AsyncHandler LJ = null;
    public final ArrayDeque<InterfaceC21499219Bu> LJFF = new ArrayDeque<>();
    public long LJI = -1;
    public final C21497819Bg LJII = new C21497819Bg();
    public final List<C801600VcU<LifecycleOwner, InterfaceC1737690vJv>> LJIIIIZZ = new ArrayList();
    public boolean LJIIJ = false;
    public Configuration LJIILIIL = null;
    public C19AE LJIILJJIL = null;
    public Scene LJIIZILJ = null;
    public boolean LJIJ = false;
    public final Set<String> LJIJJLI = new HashSet();
    public int LJIL = 0;
    public int LJJ = 0;
    public boolean LJJI = false;

    @Override // X.InterfaceC21496319Ar
    public final void LJIILIIL() {
        this.LJIIJ = true;
    }

    @Override // X.InterfaceC21496319Ar
    public final boolean LIZ() {
        return this.LIZ.mState.value >= EnumC214943199x.ACTIVITY_CREATED.value;
    }

    @Override // X.InterfaceC21496319Ar
    public final Record LIZJ() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIIJ() {
        C21497819Bg c21497819Bg = this.LJII;
        if (((ArrayList) c21497819Bg.LIZ).size() != 0) {
            ArrayList arrayList = new ArrayList(c21497819Bg.LIZ);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1447920nmY c1447920nmY = (C1447920nmY) it2.next();
                it2.remove();
                c1447920nmY.LIZ();
            }
            ((ArrayList) c21497819Bg.LIZ).removeAll(arrayList);
        }
        C20148513sZ c20148513sZ = C19BO.LJIIJ;
        if (c20148513sZ != null) {
            c20148513sZ.LIZ();
            C19BO.LJIIJ = null;
        }
    }

    @Override // X.InterfaceC21496319Ar
    public final C19BT LJIIJJI() {
        C19BT c19bt = this.LIZJ;
        if (c19bt == null) {
            c19bt = this.LJIJI ? new C19BT(this) { // from class: X.19AM
                public final InterfaceC21496319Ar LIZ;

                @Override // X.C19BT
                public final void LIZ(Record record) {
                }

                {
                    this.LIZ = this;
                }

                @Override // X.C19BT
                public final void LIZLLL(Record record) {
                    C19BA c19ba = record.mSceneResultHandler;
                    if (c19ba != null) {
                        for (C21498619Bo c21498619Bo : (ArrayList) c19ba.LIZIZ) {
                            c21498619Bo.LIZ.onResult(c21498619Bo.LIZIZ);
                        }
                        ((ArrayList) c19ba.LIZIZ).clear();
                    }
                }

                public static Scene LJ(Scene scene, NavigationScene navigationScene) {
                    Scene scene2 = scene.mParentScene;
                    if (scene2 == null) {
                        return null;
                    }
                    if (Intrinsics.LJFF(scene2, navigationScene)) {
                        return scene;
                    }
                    return LJ(scene2, navigationScene);
                }

                @Override // X.C19BT
                public final void LIZIZ(Record record, C19AL c19al) {
                    InterfaceC363130ELn interfaceC363130ELn = c19al.LIZIZ;
                    if (interfaceC363130ELn == null) {
                        return;
                    }
                    if (interfaceC363130ELn instanceof AbstractC565380MFk) {
                        AbstractC565380MFk abstractC565380MFk = (AbstractC565380MFk) interfaceC363130ELn;
                        Scene scene = abstractC565380MFk.callerSceneRef.get();
                        if (scene == null) {
                            C21494919Ad.LIZIZ.LIZ("NavigationResultActionHandler", "This scene is already destroyed, has been garbage collected");
                            return;
                        }
                        if (scene.mParentScene == null) {
                            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("This scene is not created or already destroyed, ");
                            sbLIZ.append(scene);
                            c21494919Ad.LIZ("NavigationResultActionHandler", C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        Scene sceneLJ = LJ(scene, this.LIZ.getNavigationScene());
                        if (sceneLJ != null) {
                            Record recordLJIIIIZZ = this.LIZ.LJIIIIZZ(sceneLJ);
                            if (recordLJIIIIZZ == null) {
                                abstractC565380MFk.onCallerSceneUnavailable(scene);
                                return;
                            }
                            C19BA c19ba = recordLJIIIIZZ.mSceneResultHandler;
                            if (c19ba == null) {
                                c19ba = new C19BA(null);
                                recordLJIIIIZZ.mSceneResultHandler = c19ba;
                            }
                            C21498619Bo c21498619Bo = new C21498619Bo(interfaceC363130ELn);
                            ((ArrayList) c19ba.LIZIZ).add(c21498619Bo);
                            if (record.mSceneResultHandler == null) {
                                record.mSceneResultHandler = new C19BA(new AwS611S0100000_32(c21498619Bo, 23));
                                return;
                            }
                            throw new C214826195k("Callee SceneResultHandler already exists");
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("This scene is not belong to current NavigationScene, ");
                        sbLIZ2.append(scene);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    "PushResultCallback must extends CallerAwarePushResultCallback".toString();
                    throw new IllegalArgumentException("PushResultCallback must extends CallerAwarePushResultCallback");
                }

                @Override // X.C19BT
                public final void LIZJ(Record record, Object obj) {
                    C19BA c19ba = record.mSceneResultHandler;
                    if (c19ba != null) {
                        Function1<Object, Unit> function1 = c19ba.LIZ;
                        if (function1 != null) {
                            function1.invoke(obj);
                            return;
                        }
                        return;
                    }
                    C21494919Ad.LIZIZ.LIZ("NavigationResultActionHandler", "ignore setResult because this Scene is not started by PushResultCallback");
                }
            } : new C19BT() { // from class: X.19Ak
                @Override // X.C19BT
                public final void LIZLLL(Record record) {
                }

                @Override // X.C19BT
                public final void LIZ(Record record) {
                    InterfaceC363130ELn interfaceC363130ELn = record.mPushResultCallback;
                    if (interfaceC363130ELn != null) {
                        interfaceC363130ELn.onResult(record.mPushResult);
                    }
                }

                @Override // X.C19BT
                public final void LIZIZ(Record record, C19AL c19al) {
                    record.mPushResultCallback = c19al.LIZIZ;
                }

                @Override // X.C19BT
                public final void LIZJ(Record record, Object obj) {
                    record.mPushResult = obj;
                }
            };
            this.LIZJ = c19bt;
        }
        return c19bt;
    }

    @Override // X.InterfaceC21496319Ar
    public final List<Record> LJIJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC21496319Ar
    public final List<C0WIY<Scene, Bundle>> LJJII() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        List<Record> listLJIJ = LJIJ();
        for (int i = 0; i < ((ArrayList) listLJIJ).size(); i++) {
            Record record = (Record) ListProtector.get(listLJIJ, i);
            Bundle bundle2 = record.mScene.mArguments;
            if (bundle2 == null && (bundle = record.mPreviousSavedState) != null) {
                bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
            }
            arrayList.add(new C0WIY(record.mScene, bundle2));
        }
        return arrayList;
    }

    public final void LJJIIJ() {
        if (this.LJFF.size() == 0 || !LIZ()) {
            return;
        }
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        c21494919Ad.LIZIZ("NavigationSceneManager", "executePendingOperation start");
        LJJIJLIJ().LIZLLL(new Runnable() { // from class: X.19AG
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NavigationSceneManager@df89.executePendingOperation$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NavigationSceneManager@df89.executePendingOperation$1");
            }

            public final void LIZ() {
                boolean z = System.currentTimeMillis() - this.LL.LJI > 800;
                ArrayList arrayList = new ArrayList(this.LL.LJFF);
                int i = 0;
                while (i < arrayList.size()) {
                    InterfaceC21499219Bu interfaceC21499219Bu = (InterfaceC21499219Bu) ListProtector.get(arrayList, i);
                    this.LL.LJJI = (i < arrayList.size() - 1) | z;
                    String strLIZLLL = this.LL.LIZLLL("NavigationManager executePendingOperation");
                    this.LL.LJIILJJIL(interfaceC21499219Bu, C19A6.LJJIFFI);
                    this.LL.LJIIL(strLIZLLL);
                    this.LL.LJJI = false;
                    i++;
                }
                this.LL.LJFF.removeAll(arrayList);
                if (this.LL.LJFF.size() > 0) {
                    throw new IllegalStateException("why mPendingActionList still have item?");
                }
                C19A6 c19a6 = this.LL;
                c19a6.LJI = -1L;
                c19a6.LJIIJ = true;
            }
        });
        c21494919Ad.LIZIZ("NavigationSceneManager", "executePendingOperation finish");
    }

    public final Scene LJJIIZ() {
        Record recordLIZIZ = this.LIZIZ.LIZIZ();
        if (recordLIZIZ != null) {
            return recordLIZIZ.mScene;
        }
        return null;
    }

    public final List<Scene> LJJIIZI() {
        List<Record> listLIZJ = this.LIZIZ.LIZJ();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLIZJ).iterator();
        while (it2.hasNext()) {
            arrayList.add(((Record) it2.next()).mScene);
        }
        return arrayList;
    }

    public final C21496519At LJJIJLIJ() {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new C21496519At();
        }
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC21496319Ar
    public final boolean LJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC21496319Ar
    public final boolean LJIILLIIL() {
        return this.LJJI;
    }

    @Override // X.InterfaceC21496319Ar
    public final NavigationScene LJJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC21496319Ar
    public final C21497819Bg LJJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC21496319Ar
    public final NavigationScene getNavigationScene() {
        return this.LIZ;
    }

    public C19A6(NavigationScene navigationScene) {
        this.LJIIJJI = null;
        this.LJIIL = false;
        this.LJIILL = false;
        this.LJIILLIIL = 0;
        this.LIZ = navigationScene;
        this.LIZLLL = navigationScene;
        this.LJIIIZ = navigationScene.LLJILJIL.LJFF;
        boolean z = navigationScene.LLLLIL().LJIIJJI;
        this.LJIIL = z;
        if (z) {
            this.LJIIJJI = null;
        } else {
            this.LJIIJJI = new C21496519At();
        }
        this.LJIILL = navigationScene.LLJZIJLIL;
        this.LJIILLIIL = navigationScene.LLL;
        this.LJIJI = C214928199i.LIZIZ;
    }

    @Override // X.InterfaceC21496319Ar
    public final void LIZIZ(ActivityStatusRecord activityStatusRecord) {
        if (activityStatusRecord == null) {
            return;
        }
        activityStatusRecord.LIZJ(this.LIZ.mActivity);
    }

    @Override // X.InterfaceC21496319Ar
    public final String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        int i = this.LJIL;
        this.LJIL = i + 1;
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (((HashSet) this.LJIJJLI).add(strLIZIZ)) {
            return strLIZIZ;
        }
        throw new C214826195k("suppressTag already exists");
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJFF(Record record) {
        this.LIZIZ.LJFF(record);
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJI(Record record) {
        this.LIZIZ.LJ(record);
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJII(boolean z) {
        this.LJIJ = z;
    }

    @Override // X.InterfaceC21496319Ar
    public final Record LJIIIIZZ(Scene scene) {
        return this.LIZIZ.LIZLLL(scene);
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIIL(String str) {
        if (((HashSet) this.LJIJJLI).remove(str)) {
            if (((HashSet) this.LJIJJLI).size() == 0) {
                this.LJIL = 0;
                return;
            }
            return;
        }
        throw new C214826195k("suppressTag not found");
    }

    @Override // X.InterfaceC21498719Bp
    public final void LJIILL(List<InterfaceC214942199w> list) {
        Iterator<InterfaceC214942199w> it2 = list.iterator();
        while (it2.hasNext()) {
            LJIJJ(this.LIZ, (Scene) ((InterfaceC214942199w) it2.next()), EnumC214943199x.NONE, null, true, null);
        }
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIJJLI(ActivityStatusRecord activityStatusRecord) {
        if (activityStatusRecord == null) {
            return;
        }
        activityStatusRecord.LIZLLL(this.LIZ.mActivity);
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIL(ActivityStatusRecord activityStatusRecord) {
        if (activityStatusRecord == null) {
            return;
        }
        activityStatusRecord.LIZIZ(this.LIZ.mActivity);
    }

    public final void LJJIII(boolean z) {
        View view;
        Scene sceneLJJIIZ = LJJIIZ();
        if (sceneLJJIIZ instanceof AnonymousClass1995) {
            if (sceneLJJIIZ.mState.value <= EnumC214943199x.ACTIVITY_CREATED.value) {
                C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Target Scene ");
                sbLIZ.append(sceneLJJIIZ.toString());
                sbLIZ.append(e3.e);
                sbLIZ.append(sceneLJJIIZ.mState.name);
                sbLIZ.append("] is not ready, skip dispatch WindowFocus change event");
                c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            LJJIJ(sceneLJJIIZ, z);
            return;
        }
        ArrayList arrayList = new ArrayList(LJJIIZI());
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (ListProtector.get(arrayList, size) instanceof AnonymousClass1995) {
                return;
            }
        }
        C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "uninstall useless WindowFocusChangeListener");
        NavigationScene navigationScene = this.LIZ;
        if (navigationScene.LLJILJIL.LJIIJ && navigationScene.LLJLLIL && (view = navigationScene.mView) != null) {
            navigationScene.LLJLLIL = false;
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(navigationScene.LLJLLL);
            navigationScene.LLJLLL = null;
        }
    }

    public final void LJJIJL(InterfaceC1737690vJv interfaceC1737690vJv) {
        C801600VcU c801600VcU;
        int size = ((ArrayList) this.LJIIIIZZ).size() - 1;
        while (true) {
            if (size >= 0) {
                c801600VcU = (C801600VcU) ListProtector.get(this.LJIIIIZZ, size);
                if (c801600VcU.LIZIZ == interfaceC1737690vJv) {
                    break;
                } else {
                    size--;
                }
            } else {
                c801600VcU = null;
                break;
            }
        }
        ((ArrayList) this.LJIIIIZZ).remove(c801600VcU);
    }

    public static EnumC214943199x LJJIIJZLJL(EnumC214943199x enumC214943199x, EnumC214943199x enumC214943199x2) {
        if (enumC214943199x.value > enumC214943199x2.value) {
            return enumC214943199x2;
        }
        return enumC214943199x;
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIILJJIL(InterfaceC21499219Bu interfaceC21499219Bu, Runnable runnable) {
        try {
            interfaceC21499219Bu.execute(runnable);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIJJ = th;
            if (this.LJ == null) {
                this.LJ = new AsyncHandler(Looper.getMainLooper());
            }
            this.LJ.postAtFrontOfQueue(new ARunnableS132S0100000_32(th, 23));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC21496319Ar
    public final void LJIJI(Record record, Record record2) {
        boolean z;
        View view;
        Scene scene = record.mScene;
        EnumC214943199x enumC214943199x = EnumC214943199x.NONE;
        if ((scene instanceof InterfaceC214942199w) && ((InterfaceC214942199w) scene).W1()) {
            enumC214943199x = EnumC214943199x.ACTIVITY_CREATED;
            z = true;
        } else {
            z = false;
        }
        LJIJJ(this.LIZ, scene, enumC214943199x, null, false, null);
        LJFF(record);
        if (record != record2) {
            this.LIZ.LLLIL(scene);
        }
        if (z && (view = scene.mView) != null && view.getParent() != null) {
            C19BL.LJFF(scene.mView);
        }
    }

    @Override // X.InterfaceC21496319Ar
    public final boolean LJJIFFI(Record record, Scene scene) {
        Configuration configuration = this.LJIILIIL;
        if (configuration == null) {
            return false;
        }
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        c21494919Ad.LIZIZ("NavigationSceneManager", "PopOperation dispatch onConfigurationChanged start");
        boolean zLIZ = AnonymousClass1994.LIZ(record, scene, configuration, this.LJIILLIIL, new InterfaceC214796194g<Scene>() { // from class: X.19AV
            @Override // X.InterfaceC214796194g
            public final void LIZ(Scene scene2) {
                C19A6 c19a6 = this.LIZ;
                c19a6.LJIILJJIL(new C19AB(c19a6.LIZ, c19a6, c19a6.LIZIZ, scene2, 3), null);
            }
        });
        c21494919Ad.LIZIZ("NavigationSceneManager", "PopOperation dispatch onConfigurationChanged finish");
        return zLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJ(Scene scene, boolean z) {
        NavigationScene navigationScene = this.LIZ;
        if (!navigationScene.LLJILJIL.LJIIJ || !(scene instanceof AnonymousClass1995)) {
            return;
        }
        Record recordLIZLLL = navigationScene.LLJILJILJ.LIZIZ.LIZLLL(scene);
        if (recordLIZLLL.LLILZ == z) {
            return;
        }
        ((AnonymousClass1995) scene).onWindowFocusChanged(z);
        recordLIZLLL.LLILZ = z;
    }

    public final void LJJIJIIJI(Scene scene, C19AL c19al) {
        if (scene != null) {
            if (c19al.LJ) {
                C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("push ");
                sbLIZ.append(scene.toString());
                sbLIZ.append(" by post");
                c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
                LJJJ(new C21496119Ap(this, LJJIJLIJ(), scene, c19al), c19al.LJFF, c19al.LJI);
                return;
            }
            C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("push ");
            sbLIZ2.append(scene.toString());
            c21494919Ad2.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ2));
            LJJJ(new C19A8(this, scene, c19al), false, false);
            return;
        }
        throw new NullPointerException("scene can't be null");
    }

    public final void LJJIJIL(Scene scene, int i) {
        if (scene != null) {
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recreate ");
            sbLIZ.append(scene.toString());
            c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
            LJJJ(new C19AB(this.LIZ, this, this.LIZIZ, scene, i), false, false);
            return;
        }
        throw new NullPointerException("scene can't be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJIL(X.EnumC214943199x r16, java.lang.Runnable r17) {
        /*
            r15 = this;
            r8 = r15
            com.bytedance.scene.navigation.Record r0 = r8.LIZJ()
            r14 = r17
            if (r0 != 0) goto Lf
            if (r14 == 0) goto Le
            r14.run()
        Le:
            return
        Lf:
            X.19AC r0 = r8.LIZIZ
            java.util.List r3 = r0.LIZJ()
            r2 = r3
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r1 = r2.size()
            r7 = 1
            int r1 = r1 - r7
        L1e:
            if (r1 < 0) goto L48
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            com.bytedance.scene.navigation.Record r4 = (com.bytedance.scene.navigation.Record) r4
            boolean r0 = r8.LJIILL
            r6 = 0
            if (r0 == 0) goto L78
            android.os.Bundle r12 = r4.mPreviousSavedState
            r4.mPreviousSavedState = r6
            if (r12 == 0) goto L79
            r5 = 1
        L32:
            int r0 = r2.size()
            int r0 = r0 - r7
            r11 = r16
            if (r1 != r0) goto L4e
            com.bytedance.scene.navigation.NavigationScene r9 = r8.LIZ
            com.bytedance.scene.Scene r10 = r4.mScene
            r13 = r5 ^ 1
            r8.LJIJJ(r9, r10, r11, r12, r13, r14)
            boolean r0 = r4.mIsTranslucent
            if (r0 != 0) goto L75
        L48:
            if (r14 == 0) goto L4d
            r14.run()
        L4d:
            return
        L4e:
            X.199x r0 = X.EnumC214943199x.RESUMED
            if (r11 != r0) goto L67
            X.199x r6 = X.EnumC214943199x.STARTED
        L54:
            com.bytedance.scene.navigation.NavigationScene r9 = r8.LIZ
            com.bytedance.scene.Scene r0 = r4.mScene
            r13 = r5 ^ 1
            r8 = r8
            r10 = r0
            r11 = r6
            r12 = r12
            r14 = r14
            r8.LJIJJ(r9, r10, r11, r12, r13, r14)
            boolean r0 = r4.mIsTranslucent
            if (r0 != 0) goto L75
            goto L48
        L67:
            X.199x r0 = X.EnumC214943199x.STARTED
            if (r11 == r0) goto L73
            X.199x r0 = X.EnumC214943199x.ACTIVITY_CREATED
            if (r11 == r0) goto L73
            X.199x r0 = X.EnumC214943199x.VIEW_CREATED
            if (r11 != r0) goto L54
        L73:
            r6 = r0
            goto L54
        L75:
            int r1 = r1 + (-1)
            goto L1e
        L78:
            r12 = r6
        L79:
            r5 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19A6.LJJJIL(X.199x, java.lang.Runnable):void");
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIIZILJ(Scene scene, Scene scene2, boolean z) {
        NavigationScene navigationScene = this.LIZ;
        navigationScene.getClass();
        Iterator it2 = new ArrayList(navigationScene.LLJL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1447890nmV) it2.next()).LJIILLIIL(scene2);
        }
    }

    public final void LJJIJIIJIL(Scene scene, boolean z, Runnable runnable) {
        Record recordLIZIZ = this.LIZIZ.LIZIZ();
        Scene scene2 = scene.mParentScene;
        if (scene2 != null) {
            if (scene2 == this.LIZ) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Scene already has a parent, parent ");
                sbLIZ.append(scene.mParentScene);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        Scene scene3 = null;
        this.LIZIZ.LJ(Record.LIZ(scene, z, null));
        NavigationScene navigationScene = this.LIZ;
        LJIJJ(navigationScene, scene, navigationScene.mState, null, false, null);
        NavigationScene navigationScene2 = this.LIZLLL;
        if (recordLIZIZ != null) {
            scene3 = recordLIZIZ.mScene;
        }
        navigationScene2.LLJJI(scene3, scene, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void LJJIL(Bundle bundle, EnumC214943199x enumC214943199x, boolean z) {
        int size;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:navigation_scene_manager");
        List<Record> listLIZJ = this.LIZIZ.LIZJ();
        if (this.LJIIIZ) {
            size = ((ArrayList) listLIZJ).size();
            do {
                size--;
                if (size < 0) {
                    size = 0;
                    break;
                }
            } while (((Record) ListProtector.get(listLIZJ, size)).mIsTranslucent);
        } else {
            size = 0;
            break;
        }
        while (size <= ((ArrayList) listLIZJ).size() - 1) {
            LJIJJ(this.LIZ, ((Record) ListProtector.get(listLIZJ, size)).mScene, enumC214943199x, (Bundle) ListProtector.get(parcelableArrayList, size), z, null);
            size++;
        }
    }

    public final void LJJJ(final InterfaceC21499219Bu interfaceC21499219Bu, boolean z, boolean z2) {
        if (this.LJIJJ == null) {
            if (LIZ()) {
                if (((HashSet) this.LJIJJLI).size() <= 0 && this.LJJ <= 0) {
                    AbstractRunnableC21499319Bv abstractRunnableC21499319Bv = new AbstractRunnableC21499319Bv() { // from class: X.19AR
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("NavigationSceneManager@df89.scheduleToNextUIThreadLoop$16");
                            try {
                                String strLIZLLL = this.LLILLJJLI.LIZLLL("NavigationManager execute operation directly");
                                this.LLILLJJLI.LJIILJJIL(interfaceC21499219Bu, C19A6.LJJIFFI);
                                this.LLILLJJLI.LJIIL(strLIZLLL);
                                this.LLILLJJLI.LJIIJ = true;
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("NavigationSceneManager@df89.scheduleToNextUIThreadLoop$16");
                        }
                    };
                    if (z) {
                        C21496519At c21496519AtLJJIJLIJ = LJJIJLIJ();
                        if (z2 && c21496519AtLJJIJLIJ.LIZIZ.size() <= 0) {
                            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("post ");
                            sbLIZ.append(interfaceC21499219Bu);
                            sbLIZ.append(" async to message queue head because of async and urgent argument");
                            c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
                            LJJIJLIJ().LJ(abstractRunnableC21499319Bv);
                            return;
                        }
                        C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("post ");
                        sbLIZ2.append(interfaceC21499219Bu);
                        sbLIZ2.append(" async to message queue because of async argument");
                        c21494919Ad2.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ2));
                        LJJIJLIJ().LIZIZ(abstractRunnableC21499319Bv);
                        return;
                    }
                    C21494919Ad c21494919Ad3 = C21494919Ad.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("post ");
                    sbLIZ3.append(interfaceC21499219Bu);
                    sbLIZ3.append(" sync to message queue start");
                    c21494919Ad3.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ3));
                    LJJIJLIJ().LIZLLL(abstractRunnableC21499319Bv);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("post ");
                    sbLIZ4.append(interfaceC21499219Bu);
                    sbLIZ4.append(" sync to message queue finish");
                    c21494919Ad3.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                AbstractRunnableC21499319Bv abstractRunnableC21499319Bv2 = new AbstractRunnableC21499319Bv() { // from class: X.19AD
                    public final void LIZ() {
                        C19A6 c19a6 = this.LLILLJJLI;
                        c19a6.LJJ--;
                        if (((HashSet) c19a6.LJIJJLI).size() > 0) {
                            String strJoin = TextUtils.join(",", this.LLILLJJLI.LJIJJLI);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("miss endSuppressStackOperation(), mIsNavigationStateChangeInProgress content ");
                            sbLIZ5.append(strJoin);
                            throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ5));
                        }
                        if (!this.LLILLJJLI.LIZ()) {
                            this.LLILLJJLI.LJFF.addLast(interfaceC21499219Bu);
                            this.LLILLJJLI.LJI = System.currentTimeMillis();
                        } else {
                            String strLIZLLL = this.LLILLJJLI.LIZLLL("NavigationManager execute operation by Handler.post()");
                            this.LLILLJJLI.LJIILJJIL(interfaceC21499219Bu, C19A6.LJJIFFI);
                            this.LLILLJJLI.LJIIL(strLIZLLL);
                            this.LLILLJJLI.LJIIJ = true;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NavigationSceneManager@df89.scheduleToNextUIThreadLoop$15");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NavigationSceneManager@df89.scheduleToNextUIThreadLoop$15");
                    }
                };
                this.LJJ++;
                C21494919Ad c21494919Ad4 = C21494919Ad.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("post ");
                sbLIZ5.append(interfaceC21499219Bu);
                sbLIZ5.append(" async to message queue because previous tasks are not finished");
                c21494919Ad4.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ5));
                LJJIJLIJ().LIZIZ(abstractRunnableC21499319Bv2);
                return;
            }
            C21494919Ad c21494919Ad5 = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("add ");
            sbLIZ6.append(interfaceC21499219Bu);
            sbLIZ6.append(" to pending list because of NavigationScene state is not ready");
            c21494919Ad5.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ6));
            this.LJFF.addLast(interfaceC21499219Bu);
            this.LJI = System.currentTimeMillis();
            return;
        }
        throw new C19BW("Cant navigate because previous navigation operation encounter error, last exception ", this.LJIJJ);
    }

    public final void LJJIZ(Context context, Bundle bundle, InterfaceC214877197j interfaceC214877197j, EnumC214943199x enumC214943199x) {
        C19AC c19ac = this.LIZIZ;
        c19ac.getClass();
        c19ac.LIZ = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:record_stack"));
        for (int i = 0; i < ((ArrayList) c19ac.LIZ).size(); i++) {
            Record record = (Record) ListProtector.get(c19ac.LIZ, i);
            record.mScene = C19AC.LIZ(context, i, record, interfaceC214877197j);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:navigation_scene_manager");
        List<Record> listLIZJ = this.LIZIZ.LIZJ();
        if (this.LJIIIZ) {
            C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "restoreFromBundle restore visible Scenes");
            ArrayList arrayList = (ArrayList) listLIZJ;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (!((Record) ListProtector.get(listLIZJ, size)).mIsTranslucent) {
                        break;
                    }
                } else {
                    size = 0;
                    break;
                }
            }
            int i2 = 0;
            for (int i3 = size; i3 <= arrayList.size() - 1; i3++) {
                Record record2 = (Record) ListProtector.get(listLIZJ, i3);
                LJIJJ(this.LIZ, record2.mScene, enumC214943199x, (Bundle) ListProtector.get(parcelableArrayList, i3), false, null);
                if (i3 == arrayList.size() - 1) {
                    LJIL(record2.mActivityStatusRecord);
                }
                i2++;
            }
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("restoreFromBundle has restored ");
            sbLIZ.append(i2);
            sbLIZ.append(" Scenes, total ");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(" Scenes");
            c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
            for (int i4 = 0; i4 < size; i4++) {
                ((Record) ListProtector.get(listLIZJ, i4)).mPreviousSavedState = (Bundle) ListProtector.get(parcelableArrayList, i4);
            }
            return;
        }
        C21494919Ad.LIZIZ.LIZIZ("NavigationSceneManager", "restoreFromBundle restore all Scenes");
        for (int i5 = 0; i5 <= ((ArrayList) listLIZJ).size() - 1; i5++) {
            LJIJJ(this.LIZ, ((Record) ListProtector.get(listLIZJ, i5)).mScene, enumC214943199x, (Bundle) ListProtector.get(parcelableArrayList, i5), false, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(X.EnumC214943199x r13, X.EnumC214943199x r14, boolean r15, boolean r16, java.lang.Runnable r17) {
        /*
            r12 = this;
            r5 = r12
            com.bytedance.scene.navigation.Record r0 = r5.LIZJ()
            if (r0 != 0) goto Ld
            if (r17 == 0) goto Lc
            r17.run()
        Lc:
            return
        Ld:
            X.19AC r0 = r5.LIZIZ
            java.util.List r2 = r0.LIZJ()
            if (r15 == 0) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.Collections.reverse(r0)
            r2 = r0
        L1e:
            r3 = 0
        L1f:
            int r0 = r2.size()
            if (r3 >= r0) goto L5c
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r3)
            com.bytedance.scene.navigation.Record r4 = (com.bytedance.scene.navigation.Record) r4
            com.bytedance.scene.Scene r7 = r4.mScene
            boolean r0 = r5.LJIILL
            r9 = 0
            r8 = r13
            if (r0 == 0) goto L4e
            X.199x r1 = X.EnumC214943199x.NONE
            if (r14 != r1) goto L49
            if (r8 == r14) goto L49
            X.199x r0 = r7.mState
            if (r0 != r1) goto L49
            X.19Ad r4 = X.C21494919Ad.LIZIZ
            java.lang.String r1 = "NavigationSceneManager"
            java.lang.String r0 = "Sync Scene Lifecycle skip because target Scene is already destroyed"
            r4.LIZIZ(r1, r0)
        L46:
            int r3 = r3 + 1
            goto L1f
        L49:
            android.os.Bundle r0 = r4.mPreviousSavedState
            r4.mPreviousSavedState = r9
            r9 = r0
        L4e:
            r0 = r16 ^ 1
            if (r9 == 0) goto L53
            r0 = 1
        L53:
            com.bytedance.scene.navigation.NavigationScene r6 = r5.LIZ
            r10 = r0 ^ 1
            r11 = 0
            r5.LJIJJ(r6, r7, r8, r9, r10, r11)
            goto L46
        L5c:
            if (r17 == 0) goto L61
            r17.run()
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19A6.LJJJI(X.199x, X.199x, boolean, boolean, java.lang.Runnable):void");
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIJJ(NavigationScene navigationScene, Scene scene, EnumC214943199x enumC214943199x, Bundle bundle, boolean z, Runnable runnable) {
        LJIIIZ(navigationScene, scene, enumC214943199x, bundle, z, null, runnable);
    }

    @Override // X.InterfaceC21496319Ar
    public final void LJIIIZ(NavigationScene navigationScene, Scene scene, EnumC214943199x enumC214943199x, Bundle bundle, boolean z, InterfaceC214941199v<Scene, Void> interfaceC214941199v, Runnable runnable) {
        C21497919Bh c21497919Bh;
        if (interfaceC214941199v != null) {
            c21497919Bh = new C21497919Bh();
            c21497919Bh.LIZ = interfaceC214941199v;
        } else {
            c21497919Bh = null;
        }
        if (bundle != null) {
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sync Scene ");
            sbLIZ.append(scene.toString());
            sbLIZ.append(" Lifecycle [");
            sbLIZ.append(scene.mState.name);
            sbLIZ.append(" -> ");
            sbLIZ.append(enumC214943199x.name);
            sbLIZ.append("] with previous saved State");
            c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Sync Scene ");
            sbLIZ2.append(scene.toString());
            sbLIZ2.append(" Lifecycle [");
            sbLIZ2.append(scene.mState.name);
            sbLIZ2.append(" -> ");
            sbLIZ2.append(enumC214943199x.name);
            sbLIZ2.append("] without saved State");
            c21494919Ad2.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ2));
            EnumC214943199x enumC214943199x2 = scene.mState;
            EnumC214943199x enumC214943199x3 = EnumC214943199x.NONE;
            if (enumC214943199x2 == enumC214943199x3 && enumC214943199x.value > enumC214943199x3.value && scene.mArguments == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Something error, Scene restore from State.NONE to ");
                sbLIZ3.append(enumC214943199x.name);
                sbLIZ3.append(" but without saved State \n");
                sbLIZ3.append(Log.getStackTraceString(new Throwable()));
                c21494919Ad2.LIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        if (this.LJIIZILJ != null) {
            C21494919Ad c21494919Ad3 = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Something error, previous Scene ");
            sbLIZ4.append(this.LJIIZILJ.toString());
            sbLIZ4.append(" sync lifecycle is not finished, it will throw exception in the future \n");
            sbLIZ4.append(Log.getStackTraceString(new Throwable()));
            c21494919Ad3.LIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ4));
        }
        try {
            this.LJIIZILJ = scene;
            C214940199u.LIZ(navigationScene, scene, enumC214943199x, bundle, z, c21497919Bh, runnable);
            this.LJIIZILJ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIZILJ = null;
            throw th;
        }
    }
}
