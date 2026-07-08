package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS105S0000000_32;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import java.util.List;

/* JADX INFO: renamed from: X.19Ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21496119Ap implements InterfaceC21499219Bu {
    public final InterfaceC21496319Ar LIZ;
    public final NavigationScene LIZIZ;
    public final C21496519At LIZJ;
    public final Scene LIZLLL;
    public final C19AL LJ;
    public final InterfaceC21495319Ah LJFF;

    /* JADX WARN: Type inference failed for: r2v9, types: [X.19B2] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.19Av] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.19Ax] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.19B7] */
    @Override // X.InterfaceC21499219Bu
    public final void execute(final Runnable runnable) {
        Scene scene;
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        c21494919Ad.LIZIZ("CoordinatePushOptionOperation", "invoke execute operation");
        this.LIZ.LJIIJ();
        if (this.LIZ.LIZ()) {
            if (!this.LIZIZ.LLLLL(this.LIZLLL) && (scene = this.LIZLLL.mParentScene) != null) {
                if (scene == this.LIZ.getNavigationScene()) {
                    runnable.run();
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Scene already has a parent, parent ");
                sbLIZ.append(this.LIZLLL.mParentScene);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.LJFF != null) {
                List<C0WIY<Scene, Bundle>> listLJJII = this.LIZ.LJJII();
                if (this.LJFF.LIZIZ(listLJJII)) {
                    int iLIZJ = this.LJFF.LIZJ();
                    final Bundle bundle = this.LIZLLL.mArguments;
                    ?? r9 = new InterfaceC214941199v<Scene, Void>() { // from class: X.19B7
                        @Override // X.InterfaceC214941199v
                        public final void apply(Object obj) {
                            this.LIZIZ.LJFF.LIZ((Scene) obj, bundle);
                        }
                    };
                    if (iLIZJ > 0) {
                        if (iLIZJ < listLJJII.size()) {
                            c21494919Ad.LIZIZ("CoordinatePushOptionOperation", "Push Operation is converted to Pop Operation because of launchMode");
                            new C21496419As(this.LIZ, this.LIZJ, this.LJ.LIZ, iLIZJ, null, r9).execute(runnable);
                            return;
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("LaunchModeBehavior getPopSceneCount count > current Scene count, LaunchModeBehavior type ");
                            sbLIZ2.append(this.LJFF.getClass());
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    Record recordLIZJ = this.LIZ.LIZJ();
                    Scene scene2 = recordLIZJ.mScene;
                    EnumC214943199x enumC214943199x = scene2.mState;
                    EnumC214943199x enumC214943199x2 = EnumC214943199x.RESUMED;
                    if (enumC214943199x == enumC214943199x2) {
                        this.LIZ.LJIJJ(this.LIZIZ, scene2, EnumC214943199x.STARTED, null, false, null);
                        r9.apply(scene2);
                        this.LIZ.LJIJJ(this.LIZIZ, scene2, enumC214943199x2, null, false, null);
                    } else {
                        int i = enumC214943199x.value;
                        EnumC214943199x enumC214943199x3 = EnumC214943199x.ACTIVITY_CREATED;
                        if (i < enumC214943199x3.value) {
                            C19C0 c19c0 = c21494919Ad.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("CoordinatePushOptionOperation");
                            sbLIZ3.append(" ");
                            sbLIZ3.append("Target Scene has been destroyed, restore it firstly, then dispatch onNewIntent");
                            c19c0.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            InterfaceC21496319Ar interfaceC21496319Ar = this.LIZ;
                            NavigationScene navigationScene = this.LIZIZ;
                            Bundle bundle2 = recordLIZJ.mPreviousSavedState;
                            recordLIZJ.mPreviousSavedState = null;
                            interfaceC21496319Ar.LJIJJ(navigationScene, scene2, enumC214943199x3, bundle2, false, null);
                        }
                        r9.apply(scene2);
                    }
                    runnable.run();
                    return;
                }
            }
            final Record recordLIZJ2 = this.LIZ.LIZJ();
            final InterfaceC21496319Ar interfaceC21496319Ar2 = this.LIZ;
            final Scene scene3 = this.LIZLLL;
            final C19AL c19al = this.LJ;
            InterfaceC21499219Bu interfaceC21499219Bu = new InterfaceC21499219Bu(interfaceC21496319Ar2, scene3, c19al) { // from class: X.19Al
                public final InterfaceC21496319Ar LIZ;
                public final C19AL LIZIZ;
                public final boolean LIZJ;
                public final NavigationScene LIZLLL;

                @Override // X.InterfaceC21499219Bu
                public final void execute(Runnable runnable2) {
                    EnumC214943199x enumC214943199x4;
                    C21494919Ad.LIZIZ.LIZIZ("PushPauseOperation", "invoke execute operation");
                    InterfaceC21498119Bj<Scene> interfaceC21498119Bj = this.LIZIZ.LIZLLL;
                    if (interfaceC21498119Bj != null) {
                        List<Record> listLJIJ = this.LIZ.LJIJ();
                        int size = listLJIJ.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            Record record = (Record) ListProtector.get(listLJIJ, size);
                            Scene scene4 = record.mScene;
                            if (interfaceC21498119Bj.LIZ(scene4)) {
                                this.LIZ.LJIJJ(this.LIZLLL, scene4, EnumC214943199x.NONE, null, false, null);
                                this.LIZ.LJFF(record);
                            }
                        }
                    }
                    Record recordLIZJ3 = this.LIZ.LIZJ();
                    if (recordLIZJ3 != null && this.LIZ.LJIJ().contains(recordLIZJ3)) {
                        recordLIZJ3.LIZIZ();
                        Scene scene5 = recordLIZJ3.mScene;
                        if (this.LIZJ) {
                            enumC214943199x4 = EnumC214943199x.STARTED;
                        } else {
                            enumC214943199x4 = EnumC214943199x.ACTIVITY_CREATED;
                        }
                        EnumC214943199x enumC214943199xLJJIIJZLJL = C19A6.LJJIIJZLJL(enumC214943199x4, this.LIZLLL.mState);
                        EnumC214943199x enumC214943199x5 = EnumC214943199x.STARTED;
                        if (enumC214943199xLJJIIJZLJL == enumC214943199x5 || enumC214943199xLJJIIJZLJL == EnumC214943199x.ACTIVITY_CREATED) {
                            this.LIZ.LJIJJ(this.LIZLLL, scene5, enumC214943199x5, null, false, null);
                        }
                    }
                    runnable2.run();
                }

                {
                    boolean z;
                    this.LIZ = interfaceC21496319Ar2;
                    this.LIZLLL = interfaceC21496319Ar2.getNavigationScene();
                    this.LIZIZ = c19al;
                    if (!c19al.LIZJ && !(scene3 instanceof InterfaceC523020KfE)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.LIZJ = z;
                }
            };
            final InterfaceC21496319Ar interfaceC21496319Ar3 = this.LIZ;
            final Scene scene4 = this.LIZLLL;
            final C19AL c19al2 = this.LJ;
            ?? r5 = new InterfaceC21499219Bu(interfaceC21496319Ar3, scene4, c19al2) { // from class: X.19Ax
                public final InterfaceC21496319Ar LIZ;
                public final Scene LIZIZ;
                public final C19AL LIZJ;
                public final boolean LIZLLL;
                public final NavigationScene LJ;

                @Override // X.InterfaceC21499219Bu
                public final void execute(Runnable runnable2) {
                    C21494919Ad.LIZIZ.LIZIZ("PushCreateOperation", "invoke execute operation");
                    Record recordLIZ = Record.LIZ(this.LIZIZ, this.LIZLLL, this.LIZJ.LIZ);
                    this.LIZ.LJIIJJI().LIZIZ(recordLIZ, this.LIZJ);
                    this.LIZ.LJI(recordLIZ);
                    InterfaceC21496319Ar interfaceC21496319Ar4 = this.LIZ;
                    NavigationScene navigationScene2 = this.LJ;
                    interfaceC21496319Ar4.LJIJJ(navigationScene2, this.LIZIZ, navigationScene2.mState, null, false, null);
                    runnable2.run();
                }

                {
                    boolean z;
                    this.LIZ = interfaceC21496319Ar3;
                    this.LJ = interfaceC21496319Ar3.getNavigationScene();
                    this.LIZIZ = scene4;
                    this.LIZJ = c19al2;
                    if (!c19al2.LIZJ && !(scene4 instanceof InterfaceC523020KfE)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.LIZLLL = z;
                }
            };
            final InterfaceC21496319Ar interfaceC21496319Ar4 = this.LIZ;
            final ?? r3 = new InterfaceC21499219Bu(interfaceC21496319Ar4, recordLIZJ2) { // from class: X.19Av
                public final InterfaceC21496319Ar LIZ;
                public final NavigationScene LIZIZ;
                public final Record LIZJ;

                @Override // X.InterfaceC21499219Bu
                public final void execute(Runnable runnable2) {
                    C21494919Ad.LIZIZ.LIZIZ("PushStopOperation", "invoke execute operation");
                    List<Record> listLJIJ = this.LIZ.LJIJ();
                    Record record = (Record) ListProtector.get(listLJIJ, listLJIJ.size() - 1);
                    if (this.LIZJ == null) {
                        this.LIZ.LJJ().LLJJI(null, record.mScene, true);
                        runnable2.run();
                        return;
                    }
                    if (!record.mIsTranslucent && listLJIJ.size() > 1) {
                        EnumC214943199x enumC214943199xLJJIIJZLJL = C19A6.LJJIIJZLJL(EnumC214943199x.ACTIVITY_CREATED, this.LIZIZ.mState);
                        for (int size = listLJIJ.size() - 2; size >= 0; size--) {
                            Record record2 = (Record) ListProtector.get(listLJIJ, size);
                            this.LIZ.LJIJJ(this.LIZIZ, record2.mScene, enumC214943199xLJJIIJZLJL, null, false, null);
                            if (!record2.mIsTranslucent) {
                                break;
                            }
                        }
                    }
                    this.LIZ.LJJ().LLJJI(this.LIZJ.mScene, record.mScene, true);
                    runnable2.run();
                }

                {
                    this.LIZ = interfaceC21496319Ar4;
                    this.LIZIZ = interfaceC21496319Ar4.getNavigationScene();
                    this.LIZJ = recordLIZJ2;
                }
            };
            C21495819Am c21495819Am = new C21495819Am(this.LIZ, recordLIZJ2);
            ?? r2 = new AbstractRunnableC21499319Bv() { // from class: X.19B2
                public final void LIZ() {
                    String strLIZLLL = this.LLILLL.LIZ.LIZLLL("NavigationManager execute operation directly");
                    this.LLILLL.LIZ.LJIILJJIL(r3, runnable);
                    this.LLILLL.LIZ.LJIIL(strLIZLLL);
                    this.LLILLL.LIZ.LJIILIIL();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CoordinatePushOptionOperation@f1db.execute$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CoordinatePushOptionOperation@f1db.execute$2");
                }
            };
            if (recordLIZJ2 != null) {
                interfaceC21499219Bu.execute(new ARunnableS101S0200000_32(new C21497019Ay(this, r5, c21495819Am, r2), this, 50));
                return;
            }
            interfaceC21499219Bu.execute(new ARunnableS105S0000000_32(6));
            r5.execute(new ARunnableS105S0000000_32(7));
            r3.execute(runnable);
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Can't push, current NavigationScene state ");
        sbLIZ4.append(this.LIZIZ.mState.name);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public C21496119Ap(C19A6 c19a6, C21496519At c21496519At, Scene scene, C19AL c19al) {
        this.LIZ = c19a6;
        this.LIZIZ = c19a6.LIZ;
        this.LIZJ = c21496519At;
        this.LIZLLL = scene;
        this.LJ = c19al;
        this.LJFF = c19al.LIZ(scene.getClass());
    }
}
