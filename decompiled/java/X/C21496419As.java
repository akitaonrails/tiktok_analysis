package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS93S0000000_16;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19As, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21496419As implements InterfaceC21499219Bu {
    public final InterfaceC21496319Ar LIZ;
    public final C21496519At LIZIZ;
    public final AbstractC214793194d LIZJ;
    public final C19BM LIZLLL;
    public final int LJ;
    public final NavigationScene LJFF;
    public final InterfaceC214941199v<Scene, Void> LJI;

    /* JADX WARN: Type inference failed for: r0v21, types: [X.19Aq] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.19B3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.19B6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.19Au] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.19Au] */
    @Override // X.InterfaceC21499219Bu
    public final void execute(final Runnable runnable) {
        boolean z;
        AbstractRunnableC21499319Bv c19b0;
        C21494919Ad.LIZIZ.LIZIZ("CoordinatePopCountOperation", "invoke execute operation");
        this.LIZ.LJIIJ();
        if (this.LIZ.LIZ()) {
            List<Record> listLJIJ = this.LIZ.LJIJ();
            int i = this.LJ;
            if (i > 0) {
                if (i >= listLJIJ.size()) {
                    if (listLJIJ.size() > 1) {
                        new C21496419As(this.LIZ, this.LIZIZ, this.LIZJ, listLJIJ.size() - 1, this.LIZLLL).execute(new ARunnableS101S0200000_32(runnable, this, 43));
                        return;
                    }
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 <= this.LJ - 1; i2++) {
                    arrayList.add(ListProtector.get(listLJIJ, (listLJIJ.size() - 1) - i2));
                }
                final Record record = (Record) ListProtector.get(listLJIJ, (listLJIJ.size() - this.LJ) - 1);
                Scene scene = record.mScene;
                final Record recordLIZJ = this.LIZ.LIZJ();
                final Scene scene2 = recordLIZJ.mScene;
                final InterfaceC21496319Ar interfaceC21496319Ar = this.LIZ;
                InterfaceC21499219Bu interfaceC21499219Bu = new InterfaceC21499219Bu(interfaceC21496319Ar, recordLIZJ, scene2) { // from class: X.19Aw
                    public final InterfaceC21496319Ar LIZ;
                    public final NavigationScene LIZIZ;
                    public final Scene LIZJ;
                    public final Record LIZLLL;

                    @Override // X.InterfaceC21499219Bu
                    public final void execute(Runnable runnable2) {
                        C21494919Ad.LIZIZ.LIZIZ("PopPauseOperation", "invoke execute operation");
                        Scene scene3 = this.LIZJ;
                        if (scene3 != null) {
                            Record record2 = this.LIZLLL;
                            Bundle bundle = record2.mPreviousSavedState;
                            record2.mPreviousSavedState = null;
                            if (bundle != null && scene3.mState != EnumC214943199x.NONE) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Scene' previous saved state still exists when its state is ");
                                sbLIZ.append(this.LIZJ.mState.name);
                                throw new C214826195k(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            this.LIZ.LJIJJ(this.LIZIZ, scene3, EnumC214943199x.STARTED, bundle, false, null);
                        }
                        runnable2.run();
                    }

                    {
                        this.LIZ = interfaceC21496319Ar;
                        this.LIZIZ = interfaceC21496319Ar.getNavigationScene();
                        this.LIZLLL = recordLIZJ;
                        this.LIZJ = scene2;
                    }
                };
                final InterfaceC21496319Ar interfaceC21496319Ar2 = this.LIZ;
                final InterfaceC214941199v<Scene, Void> interfaceC214941199v = this.LJI;
                final ?? r0 = new InterfaceC21499219Bu(interfaceC21496319Ar2, recordLIZJ, record, interfaceC214941199v) { // from class: X.19Aq
                    public final InterfaceC21496319Ar LIZ;
                    public final NavigationScene LIZIZ;
                    public final Record LIZJ;
                    public final Record LIZLLL;
                    public final InterfaceC214941199v<Scene, Void> LJ;

                    @Override // X.InterfaceC21499219Bu
                    public final void execute(Runnable runnable2) {
                        int iIndexOf;
                        C21494919Ad.LIZIZ.LIZIZ("PopResumeOperation", "invoke execute operation");
                        Record record2 = this.LIZLLL;
                        Scene scene3 = record2.mScene;
                        if (this.LIZ.LJJIFFI(record2, scene3)) {
                            scene3 = this.LIZLLL.mScene;
                        }
                        EnumC214943199x enumC214943199x = this.LIZIZ.mState;
                        if (this.LJ != null) {
                            if (this.LIZ.LJ() && scene3.mState.value < EnumC214943199x.ACTIVITY_CREATED.value) {
                                Record record3 = this.LIZLLL;
                                Bundle bundle = record3.mPreviousSavedState;
                                record3.mPreviousSavedState = null;
                                this.LIZ.LJIIIZ(this.LIZIZ, scene3, enumC214943199x, bundle, false, this.LJ, null);
                            } else {
                                this.LJ.apply(scene3);
                                this.LIZ.LJIJJ(this.LIZIZ, scene3, enumC214943199x, null, false, null);
                            }
                        } else if (this.LIZ.LJ()) {
                            Record record4 = this.LIZLLL;
                            Bundle bundle2 = record4.mPreviousSavedState;
                            record4.mPreviousSavedState = null;
                            this.LIZ.LJIJJ(this.LIZIZ, scene3, enumC214943199x, bundle2, false, null);
                        } else {
                            this.LIZ.LJIJJ(this.LIZIZ, scene3, enumC214943199x, null, false, null);
                        }
                        if (this.LIZJ.mPushResultCallback != null && !this.LIZIZ.LLLLJI()) {
                            this.LIZ.LJIIJJI().LIZ(this.LIZJ);
                        }
                        if (this.LIZLLL.mIsTranslucent) {
                            List<Record> listLJIJ2 = this.LIZ.LJIJ();
                            if (listLJIJ2.size() > 1 && (iIndexOf = listLJIJ2.indexOf(this.LIZLLL)) > 0) {
                                for (int i3 = iIndexOf - 1; i3 >= 0; i3--) {
                                    Record record5 = (Record) ListProtector.get(listLJIJ2, i3);
                                    if (this.LIZ.LJ()) {
                                        InterfaceC21496319Ar interfaceC21496319Ar3 = this.LIZ;
                                        NavigationScene navigationScene = this.LIZIZ;
                                        interfaceC21496319Ar3.LJIJJ(navigationScene, record5.mScene, C19A6.LJJIIJZLJL(navigationScene.mState, EnumC214943199x.STARTED), record5.mPreviousSavedState, false, null);
                                        record5.mPreviousSavedState = null;
                                    } else {
                                        InterfaceC21496319Ar interfaceC21496319Ar4 = this.LIZ;
                                        NavigationScene navigationScene2 = this.LIZIZ;
                                        interfaceC21496319Ar4.LJIJJ(navigationScene2, record5.mScene, C19A6.LJJIIJZLJL(navigationScene2.mState, EnumC214943199x.STARTED), null, false, null);
                                    }
                                    if (!record5.mIsTranslucent) {
                                        break;
                                    }
                                }
                            }
                        }
                        runnable2.run();
                    }

                    {
                        this.LIZ = interfaceC21496319Ar2;
                        this.LIZIZ = interfaceC21496319Ar2.getNavigationScene();
                        this.LIZJ = recordLIZJ;
                        this.LIZLLL = record;
                        this.LJ = interfaceC214941199v;
                    }
                };
                if (scene != null && scene.mView == null && this.LJFF.LLLLIL().LJIILLIIL) {
                    z = true;
                } else {
                    z = false;
                }
                final C21499619By c21499619By = null;
                if (z) {
                    Scene scene3 = recordLIZJ.mScene;
                    final InterfaceC21496319Ar interfaceC21496319Ar3 = this.LIZ;
                    InterfaceC21499219Bu interfaceC21499219Bu2 = new InterfaceC21499219Bu(interfaceC21496319Ar3, arrayList, recordLIZJ) { // from class: X.19B6
                        public final InterfaceC21496319Ar LIZ;
                        public final List<Record> LIZIZ;
                        public final Record LIZJ;

                        @Override // X.InterfaceC21499219Bu
                        public final void execute(Runnable runnable2) {
                            C21494919Ad.LIZIZ.LIZIZ("PopDestroyMiddlePageOperationV2", "invoke execute operation");
                            for (Record record2 : this.LIZIZ) {
                                Record record3 = this.LIZJ;
                                if (record2 != record3) {
                                    this.LIZ.LJIJI(record2, record3);
                                }
                            }
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }

                        {
                            this.LIZ = interfaceC21496319Ar3;
                            this.LIZIZ = arrayList;
                            this.LIZJ = recordLIZJ;
                        }
                    };
                    final ?? r4 = new InterfaceC21499219Bu(interfaceC21496319Ar3, recordLIZJ, record, c21499619By) { // from class: X.19Au
                        public final InterfaceC21496319Ar LIZ;
                        public final NavigationScene LIZIZ;
                        public final Record LIZJ;
                        public final Record LIZLLL;
                        public final C21499619By LJ;

                        @Override // X.InterfaceC21499219Bu
                        public final void execute(Runnable runnable2) {
                            C21499619By c21499619By2;
                            C21494919Ad.LIZIZ.LIZIZ("PopDestroyOperationV2", "invoke execute operation");
                            InterfaceC21496319Ar interfaceC21496319Ar4 = this.LIZ;
                            Record record2 = this.LIZJ;
                            interfaceC21496319Ar4.LJIJI(record2, record2);
                            if (this.LIZJ.mPushResultCallback != null && this.LIZIZ.LLLLJI()) {
                                this.LIZ.LJIIJJI().LIZ(this.LIZJ);
                            }
                            this.LIZ.LJIIJJI().LIZLLL(this.LIZLLL);
                            if (C214928199i.LIZJ && (c21499619By2 = this.LJ) != null && c21499619By2.LIZ) {
                                this.LIZ.LIZIZ(this.LIZLLL.mActivityStatusRecord);
                            } else {
                                this.LIZ.LJIL(this.LIZLLL.mActivityStatusRecord);
                            }
                            this.LIZ.LJJ().LLJJI(this.LIZJ.mScene, this.LIZLLL.mScene, false);
                            this.LIZIZ.LLLIL(this.LIZJ.mScene);
                        }

                        {
                            this.LIZ = interfaceC21496319Ar3;
                            this.LIZIZ = interfaceC21496319Ar3.getNavigationScene();
                            this.LIZJ = recordLIZJ;
                            this.LIZLLL = record;
                            this.LJ = c21499619By;
                        }
                    };
                    String strLIZLLL = this.LIZ.LIZLLL("NavigationManager SkipPopAnimation execute operation directly");
                    this.LIZ.LJIILJJIL(interfaceC21499219Bu, new ARunnableS93S0000000_16(9));
                    this.LIZ.LJIILJJIL(interfaceC21499219Bu2, new ARunnableS93S0000000_16(10));
                    C786410Ut5.LJLLLLLL(8, scene3.mView);
                    this.LIZ.LJIL(record.mActivityStatusRecord);
                    this.LIZIZ.LIZJ(new AbstractRunnableC21499319Bv() { // from class: X.19B4
                        public final void LIZ() {
                            String strLIZLLL2 = this.LLILZ.LIZ.LIZLLL("NavigationManager SkipPopAnimation execute popResumeOperation directly");
                            this.LLILZ.LIZ.LJIILJJIL(r0, new ARunnableS93S0000000_16(11));
                            this.LLILZ.LIZ.LJIILJJIL(r4, runnable);
                            this.LLILZ.LIZ.LJIILIIL();
                            this.LLILZ.LIZ.LJIIL(strLIZLLL2);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CoordinatePopCountOperation@e739.executeNoAnimationOperation$1");
                        }
                    });
                    this.LIZ.LJIIL(strLIZLLL);
                    return;
                }
                C19BM c19bm = this.LIZLLL;
                if (c19bm != null && c19bm.LIZLLL) {
                    final C21499619By c21499619By2 = new C21499619By();
                    final InterfaceC21496319Ar interfaceC21496319Ar4 = this.LIZ;
                    ?? r42 = new InterfaceC21499219Bu(interfaceC21496319Ar4, arrayList, recordLIZJ) { // from class: X.19B6
                        public final InterfaceC21496319Ar LIZ;
                        public final List<Record> LIZIZ;
                        public final Record LIZJ;

                        @Override // X.InterfaceC21499219Bu
                        public final void execute(Runnable runnable2) {
                            C21494919Ad.LIZIZ.LIZIZ("PopDestroyMiddlePageOperationV2", "invoke execute operation");
                            for (Record record2 : this.LIZIZ) {
                                Record record3 = this.LIZJ;
                                if (record2 != record3) {
                                    this.LIZ.LJIJI(record2, record3);
                                }
                            }
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }

                        {
                            this.LIZ = interfaceC21496319Ar4;
                            this.LIZIZ = arrayList;
                            this.LIZJ = recordLIZJ;
                        }
                    };
                    C21495919An c21495919An = new C21495919An(interfaceC21496319Ar4, this.LIZJ, recordLIZJ, record, scene2, true, c21499619By2);
                    final InterfaceC21496319Ar interfaceC21496319Ar5 = this.LIZ;
                    final ?? r5 = new InterfaceC21499219Bu(interfaceC21496319Ar5, recordLIZJ, record, c21499619By2) { // from class: X.19Au
                        public final InterfaceC21496319Ar LIZ;
                        public final NavigationScene LIZIZ;
                        public final Record LIZJ;
                        public final Record LIZLLL;
                        public final C21499619By LJ;

                        @Override // X.InterfaceC21499219Bu
                        public final void execute(Runnable runnable2) {
                            C21499619By c21499619By22;
                            C21494919Ad.LIZIZ.LIZIZ("PopDestroyOperationV2", "invoke execute operation");
                            InterfaceC21496319Ar interfaceC21496319Ar42 = this.LIZ;
                            Record record2 = this.LIZJ;
                            interfaceC21496319Ar42.LJIJI(record2, record2);
                            if (this.LIZJ.mPushResultCallback != null && this.LIZIZ.LLLLJI()) {
                                this.LIZ.LJIIJJI().LIZ(this.LIZJ);
                            }
                            this.LIZ.LJIIJJI().LIZLLL(this.LIZLLL);
                            if (C214928199i.LIZJ && (c21499619By22 = this.LJ) != null && c21499619By22.LIZ) {
                                this.LIZ.LIZIZ(this.LIZLLL.mActivityStatusRecord);
                            } else {
                                this.LIZ.LJIL(this.LIZLLL.mActivityStatusRecord);
                            }
                            this.LIZ.LJJ().LLJJI(this.LIZJ.mScene, this.LIZLLL.mScene, false);
                            this.LIZIZ.LLLIL(this.LIZJ.mScene);
                        }

                        {
                            this.LIZ = interfaceC21496319Ar5;
                            this.LIZIZ = interfaceC21496319Ar5.getNavigationScene();
                            this.LIZJ = recordLIZJ;
                            this.LIZLLL = record;
                            this.LJ = c21499619By2;
                        }
                    };
                    c19b0 = new C19B0(this, r42, c21495919An, new AbstractRunnableC21499319Bv() { // from class: X.19B3
                        public final void LIZ() {
                            String strLIZLLL2 = this.LLILLL.LIZ.LIZLLL("NavigationManager execute popDestroyOperationV2Task operation directly");
                            this.LLILLL.LIZ.LJIILJJIL(r5, runnable);
                            this.LLILLL.LIZ.LJIIL(strLIZLLL2);
                            this.LLILLL.LIZ.LJIILIIL();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CoordinatePopCountOperation@e739.execute$3");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CoordinatePopCountOperation@e739.execute$3");
                        }
                    });
                } else {
                    final C21496019Ao c21496019Ao = new C21496019Ao(this.LIZ, this.LIZJ, arrayList, recordLIZJ, record, scene2);
                    c19b0 = new AbstractRunnableC21499319Bv() { // from class: X.19B1
                        public final void LIZ() {
                            String strLIZLLL2 = this.LLILLL.LIZ.LIZLLL("NavigationManager execute operation directly");
                            this.LLILLL.LIZ.LJIILJJIL(c21496019Ao, runnable);
                            this.LLILLL.LIZ.LJIIL(strLIZLLL2);
                            this.LLILLL.LIZ.LJIILIIL();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CoordinatePopCountOperation@e739.execute$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CoordinatePopCountOperation@e739.execute$2");
                        }
                    };
                }
                interfaceC21499219Bu.execute(new ARunnableS101S0200000_32(new C19B5(this, r0, c19b0), this, 44));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popCount can not be ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(" stackSize is ");
            sbLIZ.append(listLJIJ.size());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Can't pop, current NavigationScene state ");
        sbLIZ2.append(this.LJFF.mState.name);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C21496419As(InterfaceC21496319Ar interfaceC21496319Ar, C21496519At c21496519At, AbstractC214793194d abstractC214793194d, int i, C19BM c19bm) {
        this(interfaceC21496319Ar, c21496519At, abstractC214793194d, i, c19bm, null);
    }

    public C21496419As(InterfaceC21496319Ar interfaceC21496319Ar, C21496519At c21496519At, AbstractC214793194d abstractC214793194d, int i, C19BM c19bm, C19B7 c19b7) {
        this.LIZ = interfaceC21496319Ar;
        this.LIZIZ = c21496519At;
        this.LIZJ = abstractC214793194d;
        this.LJ = i;
        this.LIZLLL = c19bm;
        this.LJFF = interfaceC21496319Ar.getNavigationScene();
        this.LJI = c19b7;
    }
}
