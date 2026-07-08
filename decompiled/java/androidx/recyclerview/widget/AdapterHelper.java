package androidx.recyclerview.widget;

import X.C1085650eMF;
import X.C13UV;
import X.C21674719s9;
import X.C21676619sS;
import X.C2188811AlT;
import X.InterfaceC20015613Te;
import X.InterfaceC21676119sN;
import X.InterfaceC21677019sW;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class AdapterHelper implements InterfaceC21676119sN {
    public final InterfaceC21677019sW mCallback;
    public final boolean mDisableRecycler;
    public int mExistingUpdateTypes;
    public Runnable mOnItemProcessedCallback;
    public final C21676619sS mOpReorderer;
    public final ArrayList<C13UV> mPendingUpdates;
    public final ArrayList<C13UV> mPostponedList;
    public InterfaceC20015613Te<C13UV> mUpdateOpPool;

    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i = 0; i < size; i++) {
            ((C21674719s9) this.mCallback).LIZ((C13UV) ListProtector.get(this.mPostponedList, i));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    public boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void preProcess() {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AdapterHelper.preProcess():void");
    }

    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i = 0; i < size; i++) {
            C13UV c13uv = (C13UV) ListProtector.get(this.mPendingUpdates, i);
            int i2 = c13uv.LIZ;
            if (i2 == 1) {
                ((C21674719s9) this.mCallback).LIZ(c13uv);
                C21674719s9 c21674719s9 = (C21674719s9) this.mCallback;
                c21674719s9.LIZ.offsetPositionRecordsForInsert(c13uv.LIZIZ, c13uv.LIZLLL);
                c21674719s9.LIZ.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                ((C21674719s9) this.mCallback).LIZ(c13uv);
                InterfaceC21677019sW interfaceC21677019sW = this.mCallback;
                int i3 = c13uv.LIZIZ;
                int i4 = c13uv.LIZLLL;
                C21674719s9 c21674719s92 = (C21674719s9) interfaceC21677019sW;
                c21674719s92.LIZ.offsetPositionRecordsForRemove(i3, i4, true);
                RecyclerView recyclerView = c21674719s92.LIZ;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.LIZJ += i4;
            } else if (i2 == 4) {
                ((C21674719s9) this.mCallback).LIZ(c13uv);
                C21674719s9 c21674719s93 = (C21674719s9) this.mCallback;
                c21674719s93.LIZ.viewRangeUpdate(c13uv.LIZIZ, c13uv.LIZLLL, c13uv.LIZJ);
                c21674719s93.LIZ.mItemsChanged = true;
            } else if (i2 == 8) {
                ((C21674719s9) this.mCallback).LIZ(c13uv);
                C21674719s9 c21674719s94 = (C21674719s9) this.mCallback;
                c21674719s94.LIZ.offsetPositionRecordsForMove(c13uv.LIZIZ, c13uv.LIZLLL);
                c21674719s94.LIZ.mItemsAddedOrRemoved = true;
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    public AdapterHelper(InterfaceC21677019sW interfaceC21677019sW) {
        this(interfaceC21677019sW, false);
    }

    private void applyAdd(C13UV c13uv) {
        postponeAndUpdateViewHolders(c13uv);
    }

    private void applyMove(C13UV c13uv) {
        postponeAndUpdateViewHolders(c13uv);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applyRemove(X.C13UV r12) {
        /*
            r11 = this;
            int r5 = r12.LIZIZ
            int r6 = r12.LIZLLL
            int r6 = r6 + r5
            r2 = -1
            r4 = r5
            r3 = 0
        L8:
            r8 = 0
            r7 = 2
            if (r4 >= r6) goto L53
            X.19sW r1 = r11.mCallback
            X.19s9 r1 = (X.C21674719s9) r1
            androidx.recyclerview.widget.RecyclerView r0 = r1.LIZ
            r9 = 1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r10 = r0.findViewHolderForPosition(r4, r9)
            if (r10 == 0) goto L27
            androidx.recyclerview.widget.RecyclerView r0 = r1.LIZ
            androidx.recyclerview.widget.ChildHelper r1 = r0.mChildHelper
            android.view.View r0 = r10.itemView
            boolean r0 = r1.isHidden(r0)
            if (r0 == 0) goto L45
            boolean r0 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
        L27:
            boolean r0 = r11.canFindInPreLayout(r4)
            if (r0 != 0) goto L45
            if (r2 != r9) goto L43
            X.13UV r0 = r11.obtainUpdateOp(r7, r5, r3, r8)
            r11.postponeAndUpdateViewHolders(r0)
            r0 = 1
        L37:
            r2 = 0
        L38:
            if (r0 == 0) goto L40
            int r4 = r4 - r3
            int r6 = r6 - r3
            r3 = 1
        L3d:
            int r4 = r4 + 1
            goto L8
        L40:
            int r3 = r3 + 1
            goto L3d
        L43:
            r0 = 0
            goto L37
        L45:
            if (r2 != 0) goto L51
            X.13UV r0 = r11.obtainUpdateOp(r7, r5, r3, r8)
            r11.dispatchAndUpdateViewHolders(r0)
            r0 = 1
        L4f:
            r2 = 1
            goto L38
        L51:
            r0 = 0
            goto L4f
        L53:
            int r0 = r12.LIZLLL
            if (r3 == r0) goto L5e
            r11.recycleUpdateOp(r12)
            X.13UV r12 = r11.obtainUpdateOp(r7, r5, r3, r8)
        L5e:
            if (r2 != 0) goto L64
            r11.dispatchAndUpdateViewHolders(r12)
            return
        L64:
            r11.postponeAndUpdateViewHolders(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AdapterHelper.applyRemove(X.13UV):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applyUpdate(X.C13UV r11) {
        /*
            r10 = this;
            int r6 = r11.LIZIZ
            int r5 = r11.LIZLLL
            int r5 = r5 + r6
            r4 = 0
            r7 = -1
            r3 = r6
        L8:
            r2 = 4
            if (r6 >= r5) goto L4e
            X.19sW r1 = r10.mCallback
            X.19s9 r1 = (X.C21674719s9) r1
            androidx.recyclerview.widget.RecyclerView r0 = r1.LIZ
            r9 = 1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r8 = r0.findViewHolderForPosition(r6, r9)
            if (r8 == 0) goto L26
            androidx.recyclerview.widget.RecyclerView r0 = r1.LIZ
            androidx.recyclerview.widget.ChildHelper r1 = r0.mChildHelper
            android.view.View r0 = r8.itemView
            boolean r0 = r1.isHidden(r0)
            if (r0 == 0) goto L3f
            boolean r0 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
        L26:
            boolean r0 = r10.canFindInPreLayout(r6)
            if (r0 != 0) goto L3f
            if (r7 != r9) goto L39
            java.lang.Object r0 = r11.LIZJ
            X.13UV r0 = r10.obtainUpdateOp(r2, r3, r4, r0)
            r10.postponeAndUpdateViewHolders(r0)
            r3 = r6
            r4 = 0
        L39:
            r7 = 0
        L3a:
            int r4 = r4 + 1
            int r6 = r6 + 1
            goto L8
        L3f:
            if (r7 != 0) goto L4c
            java.lang.Object r0 = r11.LIZJ
            X.13UV r0 = r10.obtainUpdateOp(r2, r3, r4, r0)
            r10.dispatchAndUpdateViewHolders(r0)
            r3 = r6
            r4 = 0
        L4c:
            r7 = 1
            goto L3a
        L4e:
            int r0 = r11.LIZLLL
            if (r4 == r0) goto L5b
            java.lang.Object r0 = r11.LIZJ
            r10.recycleUpdateOp(r11)
            X.13UV r11 = r10.obtainUpdateOp(r2, r3, r4, r0)
        L5b:
            if (r7 != 0) goto L61
            r10.dispatchAndUpdateViewHolders(r11)
            return
        L61:
            r10.postponeAndUpdateViewHolders(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AdapterHelper.applyUpdate(X.13UV):void");
    }

    private boolean canFindInPreLayout(int i) {
        int size = this.mPostponedList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C13UV c13uv = (C13UV) ListProtector.get(this.mPostponedList, i2);
            int i3 = c13uv.LIZ;
            if (i3 == 8) {
                if (findPositionOffset(c13uv.LIZLLL, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c13uv.LIZIZ;
                int i5 = c13uv.LIZLLL + i4;
                while (i4 < i5) {
                    if (findPositionOffset(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(C13UV c13uv) {
        int i;
        int i2 = c13uv.LIZ;
        if (i2 != 1 && i2 != 8) {
            int iUpdatePositionWithPostponed = updatePositionWithPostponed(c13uv.LIZIZ, i2);
            int i3 = c13uv.LIZIZ;
            int i4 = c13uv.LIZ;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("op should be remove or update.");
                    sbLIZ.append(c13uv);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c13uv.LIZLLL; i6++) {
                int iUpdatePositionWithPostponed2 = updatePositionWithPostponed(c13uv.LIZIZ + (i * i6), c13uv.LIZ);
                int i7 = c13uv.LIZ;
                if (i7 == 2 ? iUpdatePositionWithPostponed2 == iUpdatePositionWithPostponed : !(i7 != 4 || iUpdatePositionWithPostponed2 != iUpdatePositionWithPostponed + 1)) {
                    i5++;
                } else {
                    C13UV c13uvObtainUpdateOp = obtainUpdateOp(i7, iUpdatePositionWithPostponed, i5, c13uv.LIZJ);
                    dispatchFirstPassAndUpdateViewHolders(c13uvObtainUpdateOp, i3);
                    recycleUpdateOp(c13uvObtainUpdateOp);
                    if (c13uv.LIZ == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    iUpdatePositionWithPostponed = iUpdatePositionWithPostponed2;
                }
            }
            Object obj = c13uv.LIZJ;
            recycleUpdateOp(c13uv);
            if (i5 > 0) {
                C13UV c13uvObtainUpdateOp2 = obtainUpdateOp(c13uv.LIZ, iUpdatePositionWithPostponed, i5, obj);
                dispatchFirstPassAndUpdateViewHolders(c13uvObtainUpdateOp2, i3);
                recycleUpdateOp(c13uvObtainUpdateOp2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void postponeAndUpdateViewHolders(C13UV c13uv) {
        this.mPostponedList.add(c13uv);
        int i = c13uv.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        InterfaceC21677019sW interfaceC21677019sW = this.mCallback;
                        C21674719s9 c21674719s9 = (C21674719s9) interfaceC21677019sW;
                        c21674719s9.LIZ.offsetPositionRecordsForMove(c13uv.LIZIZ, c13uv.LIZLLL);
                        c21674719s9.LIZ.mItemsAddedOrRemoved = true;
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown update op type for ");
                    sbLIZ.append(c13uv);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                InterfaceC21677019sW interfaceC21677019sW2 = this.mCallback;
                C21674719s9 c21674719s92 = (C21674719s9) interfaceC21677019sW2;
                c21674719s92.LIZ.viewRangeUpdate(c13uv.LIZIZ, c13uv.LIZLLL, c13uv.LIZJ);
                c21674719s92.LIZ.mItemsChanged = true;
                return;
            }
            InterfaceC21677019sW interfaceC21677019sW3 = this.mCallback;
            C21674719s9 c21674719s93 = (C21674719s9) interfaceC21677019sW3;
            c21674719s93.LIZ.offsetPositionRecordsForRemove(c13uv.LIZIZ, c13uv.LIZLLL, false);
            c21674719s93.LIZ.mItemsAddedOrRemoved = true;
            return;
        }
        InterfaceC21677019sW interfaceC21677019sW4 = this.mCallback;
        C21674719s9 c21674719s94 = (C21674719s9) interfaceC21677019sW4;
        c21674719s94.LIZ.offsetPositionRecordsForInsert(c13uv.LIZIZ, c13uv.LIZLLL);
        c21674719s94.LIZ.mItemsAddedOrRemoved = true;
    }

    public AdapterHelper addUpdateOp(C13UV... c13uvArr) {
        Collections.addAll(this.mPendingUpdates, c13uvArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i) {
        int size = this.mPendingUpdates.size();
        for (int i2 = 0; i2 < size; i2++) {
            C13UV c13uv = (C13UV) ListProtector.get(this.mPendingUpdates, i2);
            int i3 = c13uv.LIZ;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = c13uv.LIZIZ;
                        if (i4 == i) {
                            i = c13uv.LIZLLL;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (c13uv.LIZLLL <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = c13uv.LIZIZ;
                    if (i5 <= i) {
                        int i6 = c13uv.LIZLLL;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (c13uv.LIZIZ <= i) {
                i += c13uv.LIZLLL;
            }
        }
        return i;
    }

    public int findPositionOffset(int i) {
        return findPositionOffset(i, 0);
    }

    public boolean hasAnyUpdateTypes(int i) {
        if ((i & this.mExistingUpdateTypes) != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21676119sN
    public void recycleUpdateOp(C13UV c13uv) {
        if (!this.mDisableRecycler) {
            c13uv.LIZJ = null;
            this.mUpdateOpPool.LIZ(c13uv);
        }
    }

    public void recycleUpdateOpsAndClearList(List<C13UV> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            recycleUpdateOp((C13UV) ListProtector.get(list, i));
        }
        list.clear();
    }

    public AdapterHelper(InterfaceC21677019sW interfaceC21677019sW, boolean z) {
        this.mUpdateOpPool = new C1085650eMF(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = interfaceC21677019sW;
        this.mDisableRecycler = z;
        this.mOpReorderer = new C21676619sS(this);
    }

    private int updatePositionWithPostponed(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            C13UV c13uv = (C13UV) ListProtector.get(this.mPostponedList, size);
            int i5 = c13uv.LIZ;
            if (i5 == 8) {
                int i6 = c13uv.LIZIZ;
                int i7 = c13uv.LIZLLL;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            c13uv.LIZLLL = i7 + 1;
                        } else if (i2 == 2) {
                            c13uv.LIZLLL = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c13uv.LIZIZ = i6 + 1;
                        } else if (i2 == 2) {
                            c13uv.LIZIZ = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        c13uv.LIZIZ = i6 + 1;
                        c13uv.LIZLLL = i7 + 1;
                    } else if (i2 == 2) {
                        c13uv.LIZIZ = i6 - 1;
                        c13uv.LIZLLL = i7 - 1;
                    }
                }
            } else {
                int i8 = c13uv.LIZIZ;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c13uv.LIZLLL;
                    } else if (i5 == 2) {
                        i += c13uv.LIZLLL;
                    }
                } else if (i2 == 1) {
                    c13uv.LIZIZ = i8 + 1;
                } else if (i2 == 2) {
                    c13uv.LIZIZ = i8 - 1;
                }
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            C13UV c13uv2 = (C13UV) ListProtector.get(this.mPostponedList, size2);
            if (c13uv2.LIZ == 8) {
                int i9 = c13uv2.LIZLLL;
                if (i9 == c13uv2.LIZIZ || i9 < 0) {
                    ListProtector.remove(this.mPostponedList, size2);
                    recycleUpdateOp(c13uv2);
                }
            } else if (c13uv2.LIZLLL <= 0) {
                ListProtector.remove(this.mPostponedList, size2);
                recycleUpdateOp(c13uv2);
            }
        }
        return i;
    }

    public void dispatchFirstPassAndUpdateViewHolders(C13UV c13uv, int i) {
        ((C21674719s9) this.mCallback).LIZ(c13uv);
        int i2 = c13uv.LIZ;
        if (i2 != 2) {
            if (i2 == 4) {
                C21674719s9 c21674719s9 = (C21674719s9) this.mCallback;
                c21674719s9.LIZ.viewRangeUpdate(i, c13uv.LIZLLL, c13uv.LIZJ);
                c21674719s9.LIZ.mItemsChanged = true;
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        InterfaceC21677019sW interfaceC21677019sW = this.mCallback;
        int i3 = c13uv.LIZLLL;
        C21674719s9 c21674719s92 = (C21674719s9) interfaceC21677019sW;
        c21674719s92.LIZ.offsetPositionRecordsForRemove(i, i3, true);
        RecyclerView recyclerView = c21674719s92.LIZ;
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.LIZJ += i3;
    }

    public int findPositionOffset(int i, int i2) {
        int size = this.mPostponedList.size();
        while (i2 < size) {
            C13UV c13uv = (C13UV) ListProtector.get(this.mPostponedList, i2);
            int i3 = c13uv.LIZ;
            if (i3 == 8) {
                int i4 = c13uv.LIZIZ;
                if (i4 == i) {
                    i = c13uv.LIZLLL;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c13uv.LIZLLL <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c13uv.LIZIZ;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c13uv.LIZLLL;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c13uv.LIZLLL;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean onItemRangeInserted(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i, i2, null));
        this.mExistingUpdateTypes |= 1;
        if (this.mPendingUpdates.size() != 1) {
            return false;
        }
        return true;
    }

    public boolean onItemRangeRemoved(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i, i2, null));
        this.mExistingUpdateTypes |= 2;
        if (this.mPendingUpdates.size() != 1) {
            return false;
        }
        return true;
    }

    public boolean onItemRangeChanged(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i, i2, obj));
        this.mExistingUpdateTypes |= 4;
        if (this.mPendingUpdates.size() != 1) {
            return false;
        }
        return true;
    }

    public boolean onItemRangeMoved(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.mPendingUpdates.add(obtainUpdateOp(8, i, i2, null));
            this.mExistingUpdateTypes |= 8;
            if (this.mPendingUpdates.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    @Override // X.InterfaceC21676119sN
    public C13UV obtainUpdateOp(int i, int i2, int i3, Object obj) {
        C13UV c13uvLIZIZ = this.mUpdateOpPool.LIZIZ();
        if (c13uvLIZIZ == null) {
            return new C13UV(i, i2, i3, obj);
        }
        c13uvLIZIZ.LIZ = i;
        c13uvLIZIZ.LIZIZ = i2;
        c13uvLIZIZ.LIZLLL = i3;
        c13uvLIZIZ.LIZJ = obj;
        return c13uvLIZIZ;
    }
}
