package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS29S0100001_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368870EdB extends FrameLayout {
    public final C368920EdG LL;
    public final C368850Ed9 LLILLJJLI;
    public C368930EdH LLILLL;
    public final C368680Ecs LLILZ;
    public InterfaceC369000EdO LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public double LLJ;
    public final C368990EdN LLJI;
    public float LLJIJIL;

    public final ArrayList<C351480DqE> LIZIZ() {
        C368930EdH c368930EdH = this.LLILLL;
        if (c368930EdH == null) {
            return new ArrayList<>();
        }
        C368880EdC c368880EdC = c368930EdH.LLJI;
        if (c368880EdC != null) {
            if (c368880EdC.LLILZLL.isEmpty()) {
                c368880EdC.LJ();
            }
            ArrayList<C351480DqE> arrayList = c368880EdC.LLILZLL;
            if (arrayList != null) {
                return arrayList;
            }
        }
        return new ArrayList<>();
    }

    public final float getLimitedMinScale() {
        return this.LLJIJIL;
    }

    public final void LIZJ(int i) {
        float fLIZJ = i * C360610EBv.LIZJ();
        C368680Ecs c368680Ecs = this.LLILZ;
        if (c368680Ecs != null) {
            C368680Ecs.e0(c368680Ecs, (int) fLIZJ, false, false, 6);
        }
    }

    public final void LIZLLL(ArrayList<Pair<Long, Long>> arrayList) {
        C368950EdJ c368950EdJ;
        C368890EdD c368890EdD;
        List<C368940EdI> checkBoxInfoList$editor_trackpanel_release;
        C368940EdI c368940EdI;
        C368930EdH c368930EdH = this.LLILLL;
        if (c368930EdH != null) {
            C368880EdC c368880EdC = c368930EdH.LLJI;
            if (c368880EdC != null) {
                ArrayList arrayList2 = new ArrayList();
                boolean zIsEmpty = arrayList.isEmpty();
                int i = LSPassThroughRecordSizeConfig.DEFAULT;
                if (zIsEmpty) {
                    long jLongValue = 0;
                    Iterator it2 = ((ArrayList) c368880EdC.LLJIJIL).iterator();
                    if (it2.hasNext()) {
                        long endTime = ((NLETimeSpaceNode) it2.next()).getEndTime();
                        long j = LSPassThroughRecordSizeConfig.DEFAULT;
                        Long lValueOf = Long.valueOf(endTime / j);
                        while (it2.hasNext()) {
                            Long lValueOf2 = Long.valueOf(((NLETimeSpaceNode) it2.next()).getEndTime() / j);
                            if (lValueOf.compareTo(lValueOf2) < 0) {
                                lValueOf = lValueOf2;
                            }
                        }
                        if (lValueOf != null) {
                            jLongValue = lValueOf.longValue();
                        }
                    }
                    arrayList.add(new Pair<>(0L, Long.valueOf(jLongValue)));
                }
                arrayList2.addAll(arrayList);
                int i2 = 0;
                for (Object obj : (ArrayList) c368880EdC.LLJIJIL) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
                        long j2 = i;
                        C354710DvR c354710DvR = new C354710DvR(nLETimeSpaceNode.getStartTime() / j2, nLETimeSpaceNode.getEndTime() / j2);
                        long endTime2 = nLETimeSpaceNode.getEndTime() / j2;
                        long startTime = nLETimeSpaceNode.getStartTime() / j2;
                        C368950EdJ c368950EdJ2 = (C368950EdJ) C13LP.LJJJLZIJ(i2, c368880EdC.LLJI);
                        if (c368950EdJ2 != null) {
                            int size = arrayList2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    Pair pair = (Pair) C13LP.LJJJLZIJ(i4, arrayList2);
                                    if (pair != null) {
                                        long j3 = c354710DvR.LL;
                                        long j4 = c354710DvR.LLILLJJLI;
                                        long jLongValue2 = ((Number) pair.getFirst()).longValue();
                                        if (j3 <= jLongValue2 && jLongValue2 <= j4) {
                                            long j5 = c354710DvR.LL;
                                            long j6 = c354710DvR.LLILLJJLI;
                                            long jLongValue3 = ((Number) pair.getSecond()).longValue();
                                            if (j5 <= jLongValue3 && jLongValue3 <= j6) {
                                                c368950EdJ2.LIZIZ.LIZ(new Pair<>(pair.getFirst(), pair.getSecond()));
                                            } else {
                                                if (endTime2 - ((Number) pair.getFirst()).longValue() >= 100) {
                                                    c368950EdJ2.LIZIZ.LIZ(new Pair<>(pair.getFirst(), Long.valueOf(endTime2)));
                                                }
                                                if (((Number) pair.getSecond()).longValue() - endTime2 >= 100) {
                                                    ListProtector.set(arrayList2, i4, new Pair(Long.valueOf(endTime2), pair.getSecond()));
                                                }
                                            }
                                        } else if (((Number) pair.getFirst()).longValue() >= startTime) {
                                            c368880EdC.LJ();
                                            ArrayList<Pair<Long, Long>> arrayListLIZLLL = c368950EdJ2.LIZIZ.LIZLLL();
                                            C368230Ec9 c368230Ec9 = c368950EdJ2.LIZ.LLILLL;
                                            if (c368230Ec9 != null) {
                                                c368230Ec9.LLLFFI.clear();
                                                c368230Ec9.LLLFFI.addAll(arrayListLIZLLL);
                                                c368230Ec9.invalidate();
                                            }
                                        }
                                    }
                                    i4++;
                                } else {
                                    c368880EdC.LJ();
                                    ArrayList<Pair<Long, Long>> arrayListLIZLLL2 = c368950EdJ2.LIZIZ.LIZLLL();
                                    C368230Ec9 c368230Ec92 = c368950EdJ2.LIZ.LLILLL;
                                    if (c368230Ec92 != null) {
                                        c368230Ec92.LLLFFI.clear();
                                        c368230Ec92.LLLFFI.addAll(arrayListLIZLLL2);
                                        c368230Ec92.invalidate();
                                    }
                                }
                            }
                        }
                        i2 = i3;
                        i = LSPassThroughRecordSizeConfig.DEFAULT;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                List<C368950EdJ> list = c368880EdC.LLJI;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = ((ArrayList) list).iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((C368950EdJ) it3.next()).LIZIZ);
                }
                int i5 = 0;
                for (Object obj2 : arrayList3) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        if (c368880EdC.LIZLLL(i5, (C368890EdD) obj2) && (c368950EdJ = (C368950EdJ) C13LP.LJJJLZIJ(i6, c368880EdC.LLJI)) != null && (c368890EdD = c368950EdJ.LIZIZ) != null && (checkBoxInfoList$editor_trackpanel_release = c368890EdD.getCheckBoxInfoList$editor_trackpanel_release()) != null && (c368940EdI = (C368940EdI) C13LP.LJJJLL(checkBoxInfoList$editor_trackpanel_release)) != null) {
                            c368940EdI.LIZ.LJ(false);
                        }
                        i5 = i6;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            final C368880EdC c368880EdC2 = c368930EdH.LLJI;
            if (c368880EdC2 != null) {
                Iterator it4 = ((ArrayList) c368880EdC2.LLJI).iterator();
                while (it4.hasNext()) {
                    ((C368950EdJ) it4.next()).LIZIZ.setItemHighlightTrackCallback(new InterfaceC369060EdU() { // from class: X.0EdE
                        /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
                        @Override // X.InterfaceC369060EdU
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZJ(X.C368890EdD r9) {
                            /*
                                Method dump skipped, instruction units count: 304
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C368900EdE.LIZJ(X.0EdD):void");
                        }

                        @Override // X.InterfaceC369060EdU
                        public final boolean LJ(C368890EdD c368890EdD2) {
                            List<C368950EdJ> list2 = c368880EdC2.LLJI;
                            boolean z = false;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<C368950EdJ> it5 = list2.iterator();
                                loop0: while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    C368950EdJ next = it5.next();
                                    if (!Intrinsics.LJFF(next.LIZIZ, c368890EdD2)) {
                                        List<C368940EdI> checkBoxInfoList$editor_trackpanel_release2 = next.LIZIZ.getCheckBoxInfoList$editor_trackpanel_release();
                                        if (!(checkBoxInfoList$editor_trackpanel_release2 instanceof Collection) || !checkBoxInfoList$editor_trackpanel_release2.isEmpty()) {
                                            for (C368940EdI c368940EdI2 : checkBoxInfoList$editor_trackpanel_release2) {
                                                if (c368940EdI2.LIZIZ.getSecond().longValue() - c368940EdI2.LIZIZ.getFirst().longValue() >= 100) {
                                                    z = true;
                                                    break loop0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return !z;
                        }

                        @Override // X.InterfaceC369060EdU
                        public final void LIZIZ(int i7, C368890EdD c368890EdD2) {
                            C368950EdJ next;
                            if (i7 == 0 || i7 == c368890EdD2.getCheckBoxInfoList$editor_trackpanel_release().size() - 1) {
                                Iterator<C368950EdJ> it5 = c368880EdC2.LLJI.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        if (Intrinsics.LJFF(next.LIZIZ, c368890EdD2)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                C368950EdJ c368950EdJ3 = next;
                                if (c368950EdJ3 != null) {
                                    C368880EdC c368880EdC3 = c368880EdC2;
                                    c368880EdC3.LIZJ(null, c368950EdJ3, c368890EdD2);
                                    c368880EdC3.LIZIZ(null, c368950EdJ3, c368890EdD2);
                                }
                            }
                            InterfaceC369080EdW interfaceC369080EdW = c368880EdC2.LLJILJIL;
                            if (interfaceC369080EdW != null) {
                                interfaceC369080EdW.LJIJJLI();
                            }
                        }

                        @Override // X.InterfaceC369060EdU
                        public final void LIZLLL(EnumC368970EdL enumC368970EdL, NLETrackSlot nLETrackSlot, int i7, long j7) {
                            C351480DqE c351480DqE;
                            C368950EdJ c368950EdJ3;
                            C368940EdI c368940EdI2;
                            C368880EdC c368880EdC3 = c368880EdC2;
                            Iterator<C351480DqE> it5 = c368880EdC3.LLILZLL.iterator();
                            int i8 = 0;
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.LJFF(it5.next().LIZ, nLETrackSlot)) {
                                    if (i8 != -1 && (c351480DqE = (C351480DqE) C13LP.LJJJLZIJ(i8, c368880EdC3.LLILZLL)) != null && (c368950EdJ3 = (C368950EdJ) C13LP.LJJJLZIJ(i8, c368880EdC3.LLJI)) != null && (c368940EdI2 = (C368940EdI) C13LP.LJJJLZIJ(i7, c368950EdJ3.LIZIZ.getCheckBoxInfoList$editor_trackpanel_release())) != null) {
                                        ListProtector.set(c351480DqE.LIZIZ, i7, c368940EdI2.LIZIZ);
                                    }
                                } else {
                                    i8++;
                                }
                            }
                            InterfaceC369080EdW interfaceC369080EdW = c368880EdC2.LLJILJIL;
                            if (interfaceC369080EdW != null) {
                                interfaceC369080EdW.LJJ(enumC368970EdL, nLETrackSlot, i7, j7);
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
                        
                            com.bytedance.mt.protector.impl.collections.ListProtector.add(r8.LLLFFI, 0, new kotlin.Pair(java.lang.Long.valueOf(r6), java.lang.Long.valueOf(r21)));
                         */
                        @Override // X.InterfaceC369060EdU
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ(X.C368890EdD r17, X.EnumC368970EdL r18, int r19, int r20, long r21) {
                            /*
                                Method dump skipped, instruction units count: 403
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C368900EdE.LIZ(X.0EdD, X.0EdL, int, int, long):void");
                        }
                    });
                }
            }
        }
    }

    public final void setLimitedMinScale(float f) {
        this.LLJIJIL = f;
    }

    public final void setRulerPaint(InterfaceC369260Edo interfaceC369260Edo) {
        C368920EdG c368920EdG = this.LL;
        if (c368920EdG != null) {
            c368920EdG.setTimeLinePaint(interfaceC369260Edo);
        }
    }

    public final void setRulerVisible(boolean z) {
        int i;
        C368850Ed9 c368850Ed9 = this.LLILLJJLI;
        if (c368850Ed9 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c368850Ed9.getVisibility();
            c368850Ed9.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c368850Ed9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0EdN] */
    public C368870EdB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = 1.0d;
        this.LLJI = new InterfaceC21574019bu() { // from class: X.0EdN
            @Override // X.InterfaceC21574019bu
            public final void onScaleBegin() {
                InterfaceC369000EdO interfaceC369000EdO = this.LIZ.LLILZIL;
                if (interfaceC369000EdO != null) {
                    interfaceC369000EdO.LJJII();
                }
            }

            @Override // X.InterfaceC21574019bu
            public final void onScaleEnd() {
                InterfaceC369000EdO interfaceC369000EdO = this.LIZ.LLILZIL;
                if (interfaceC369000EdO != null) {
                    interfaceC369000EdO.LJJI();
                }
            }

            @Override // X.InterfaceC21574019bu
            public final boolean LIZ(C21573919bt c21573919bt) {
                boolean z;
                if (this.LIZ.LLJ == 0.1d) {
                    z = true;
                } else {
                    z = false;
                }
                if ((z && c21573919bt.LIZIZ() < 1.0f) || (this.LIZ.LLJ == 10.0d && c21573919bt.LIZIZ() > 1.0f)) {
                    return true;
                }
                C368870EdB c368870EdB = this.LIZ;
                float fLIZIZ = c21573919bt.LIZIZ();
                c368870EdB.getClass();
                C354270Duj.LIZJ(0L, new AwS29S0100001_5(c368870EdB, fLIZIZ, 2));
                InterfaceC369000EdO interfaceC369000EdO = c368870EdB.LLILZIL;
                if (interfaceC369000EdO != null) {
                    c21573919bt.LIZIZ();
                    interfaceC369000EdO.LIZ();
                }
                return true;
            }
        };
        this.LLJIJIL = C368130Ebz.LIZJ;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d5c, this, true);
        this.LLILLL = (C368930EdH) findViewById(R.id.jo1);
        this.LLILZ = (C368680Ecs) findViewById(R.id.jo0);
        this.LL = (C368920EdG) findViewById(R.id.icn);
        this.LLILLJJLI = (C368850Ed9) findViewById(R.id.xwh);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r12, X.C370920EgU r13) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368870EdB.LIZ(com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr, X.0EgU):void");
    }
}
