package X;

import Y.ACListenerS109S0200000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import avg.f;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0EdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368890EdD extends RelativeLayout {
    public final C01GW LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final float LLILZ;
    public InterfaceC369060EdU LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public EnumC368970EdL LLJI;
    public EnumC368970EdL LLJIJIL;
    public InterfaceC369180Edg LLJILJIL;
    public final ValueAnimator LLJILJILJ;
    public final C01GW LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C368400EcQ LLJJIJIL;
    public NLETrackSlot LLJJJ;
    public List<C368940EdI> LLJJJIL;

    private final InterfaceC369250Edn getHapticFeedback() {
        return (InterfaceC369250Edn) this.LLJILLL.getValue();
    }

    public final ArrayList<Pair<Long, Long>> LIZLLL() {
        Pair<Long, Long> pair;
        ArrayList<Pair<Long, Long>> arrayList = new ArrayList<>();
        if (this.LLJJJIL.isEmpty()) {
            NLETrackSlot nLETrackSlot = this.LLJJJ;
            arrayList.add(new Pair<>(Long.valueOf(nLETrackSlot != null ? C352310DrZ.LIZ(nLETrackSlot.getStartTime()) : 0), Long.valueOf(this.LLJJJ != null ? C352310DrZ.LIZ(r0.getEndTime()) : 0)));
        }
        int i = 0;
        for (C368940EdI c368940EdI : this.LLJJJIL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C368940EdI c368940EdI2 = c368940EdI;
            int iLJI = LJI(c368940EdI2);
            int iLJFF = LJFF(c368940EdI2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLJI, -1);
            layoutParams.addRule(20);
            layoutParams.setMarginStart(iLJFF);
            addView(c368940EdI2.LIZ, layoutParams);
            c368940EdI2.LIZ.LIZJ(C0E6E.CLIP, false);
            long jLongValue = c368940EdI2.LIZIZ.getFirst().longValue();
            NLETrackSlot nLETrackSlot2 = this.LLJJJ;
            int iLIZ = nLETrackSlot2 != null ? C352310DrZ.LIZ(nLETrackSlot2.getStartTime()) : 0;
            long jLongValue2 = c368940EdI2.LIZIZ.getSecond().longValue();
            NLETrackSlot nLETrackSlot3 = this.LLJJJ;
            int iLIZ2 = nLETrackSlot3 != null ? C352310DrZ.LIZ(nLETrackSlot3.getEndTime()) : 0;
            if (i == 0) {
                long j = iLIZ;
                if (jLongValue > j) {
                    arrayList.add(new Pair<>(Long.valueOf(j), Long.valueOf(jLongValue)));
                }
                if (this.LLJJJIL.size() == 1) {
                    long j2 = iLIZ2;
                    if (jLongValue2 < j2) {
                        arrayList.add(new Pair<>(Long.valueOf(jLongValue2), Long.valueOf(j2)));
                    }
                }
            } else {
                C368940EdI c368940EdI3 = (C368940EdI) C13LP.LJJJLZIJ(i - 1, this.LLJJJIL);
                long jLongValue3 = (c368940EdI3 == null || (pair = c368940EdI3.LIZIZ) == null) ? 0L : pair.getSecond().longValue();
                if (jLongValue > jLongValue3) {
                    arrayList.add(new Pair<>(Long.valueOf(jLongValue3), Long.valueOf(jLongValue)));
                }
                if (i == this.LLJJJIL.size() - 1) {
                    long j3 = iLIZ2;
                    if (c368940EdI2.LIZIZ.getSecond().longValue() < j3) {
                        arrayList.add(new Pair<>(c368940EdI2.LIZIZ.getSecond(), Long.valueOf(j3)));
                    }
                }
            }
            i = i2;
        }
        requestLayout();
        invalidate();
        Iterator<C368940EdI> it2 = this.LLJJJIL.iterator();
        while (it2.hasNext()) {
            C368400EcQ c368400EcQ = it2.next().LIZ;
            View.OnClickListener aCListenerS109S0200000_5 = new ACListenerS109S0200000_5(this, c368400EcQ, 18);
            if (C1848410yCV.LIZ) {
                aCListenerS109S0200000_5 = new f(aCListenerS109S0200000_5);
            }
            a aVar = new a(aCListenerS109S0200000_5);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c368400EcQ);
            }
            c368400EcQ.setOnClickListener(aVar);
            c368400EcQ.getLeftHandler().LIZIZ = new AwS619S0100000_5(this, 49);
            c368400EcQ.getRightHandler().LIZIZ = new AwS619S0100000_5(this, 50);
            c368400EcQ.getLeftHandler().LIZLLL = new AwS619S0100000_5(this, 51);
            c368400EcQ.getRightHandler().LIZLLL = new AwS619S0100000_5(this, 52);
            c368400EcQ.getLeftHandler().LIZJ = new AwS584S0100000_5(this, 927);
            c368400EcQ.getRightHandler().LIZJ = new AwS584S0100000_5(this, 928);
        }
        return arrayList;
    }

    public final boolean LJ() {
        return ((Boolean) this.LL.getValue()).booleanValue();
    }

    public final List<C368940EdI> getCheckBoxInfoList$editor_trackpanel_release() {
        return this.LLJJJIL;
    }

    public final NLETrackSlot getMainTrackSlot$editor_trackpanel_release() {
        return this.LLJJJ;
    }

    public final float getMaxPx$editor_trackpanel_release() {
        return this.LLJJI;
    }

    public final float getMinPx$editor_trackpanel_release() {
        return this.LLJJ;
    }

    public C368890EdD(Context context) {
        super(context, null, 0);
        C368390EcP c368390EcPLIZ = C368130Ebz.LIZ(context);
        this.LL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1129));
        this.LLILLJJLI = C0FU0.LIZJ(context);
        int i = c368390EcPLIZ.LJFF;
        this.LLILLL = i;
        this.LLILZ = i - C0FU0.LIZ(4.0f);
        this.LLILZLL = 1.0f;
        this.LLIZ = 2001;
        EnumC368970EdL enumC368970EdL = EnumC368970EdL.NULL;
        this.LLJI = enumC368970EdL;
        this.LLJIJIL = enumC368970EdL;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJILJILJ = valueAnimatorOfFloat;
        this.LLJILLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(312));
        this.LLJJJIL = new ArrayList();
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 27));
    }

    private final void setMinMaxPX(C368940EdI c368940EdI) {
        long jLIZ;
        long jLongValue;
        Pair<Long, Long> pair;
        Pair<Long, Long> pair2;
        int iIndexOf = this.LLJJJIL.indexOf(c368940EdI);
        if (iIndexOf != -1) {
            long jLongValue2 = c368940EdI.LIZIZ.getSecond().longValue() - c368940EdI.LIZIZ.getFirst().longValue();
            NLETrackSlot nLETrackSlot = this.LLJJJ;
            long jLongValue3 = 0;
            if (nLETrackSlot != null) {
                jLIZ = C352310DrZ.LIZ(nLETrackSlot.getStartTime());
            } else {
                jLIZ = 0;
            }
            if (iIndexOf == 0) {
                jLongValue = jLIZ;
            } else {
                C368940EdI c368940EdI2 = (C368940EdI) C13LP.LJJJLZIJ(iIndexOf - 1, this.LLJJJIL);
                if (c368940EdI2 != null && (pair = c368940EdI2.LIZIZ) != null) {
                    jLongValue = pair.getSecond().longValue();
                } else {
                    jLongValue = 0;
                }
            }
            if (iIndexOf == this.LLJJJIL.size() - 1) {
                NLETrackSlot nLETrackSlot2 = this.LLJJJ;
                if (nLETrackSlot2 != null) {
                    jLongValue3 = C352310DrZ.LIZ(nLETrackSlot2.getDuration());
                }
            } else {
                C368940EdI c368940EdI3 = (C368940EdI) C13LP.LJJJLZIJ(iIndexOf + 1, this.LLJJJIL);
                if (c368940EdI3 != null && (pair2 = c368940EdI3.LIZIZ) != null) {
                    jLongValue3 = pair2.getFirst().longValue();
                }
                jLongValue3 -= jLIZ;
            }
            float fLIZJ = (r12 - jLongValue) * C360610EBv.LIZJ();
            this.LLJJ = fLIZJ;
            this.LLJJI = (jLongValue3 - ((r12 - jLIZ) + jLongValue2)) * C360610EBv.LIZJ();
            float f = jLongValue2;
            this.LLJJIII = fLIZJ + (C360610EBv.LIZJ() * f);
            this.LLJJIJI = this.LLJJI + (f * C360610EBv.LIZJ());
        }
    }

    private final void setScrollState(float f) {
        EnumC368970EdL enumC368970EdL;
        int i = this.LLILLJJLI;
        int i2 = C360610EBv.LIZ;
        int i3 = C360610EBv.LJIIJJI;
        if (f >= i - i3) {
            if (LJ()) {
                enumC368970EdL = EnumC368970EdL.START;
            } else {
                enumC368970EdL = EnumC368970EdL.END;
            }
        } else if (f <= i3) {
            if (LJ()) {
                enumC368970EdL = EnumC368970EdL.END;
            } else {
                enumC368970EdL = EnumC368970EdL.START;
            }
        } else {
            enumC368970EdL = EnumC368970EdL.NULL;
        }
        setScrollState(enumC368970EdL);
    }

    public final void LIZ(Pair<Long, Long> pair) {
        C368400EcQ c368400EcQ = new C368400EcQ(getContext(), null);
        int i = this.LLIZ + 1;
        this.LLIZ = i;
        c368400EcQ.setId(i);
        c368400EcQ.setHollowOutDrawClipStyle$editor_trackpanel_release(true);
        c368400EcQ.setNeedDrawDurationTag$editor_trackpanel_release(true);
        c368400EcQ.setEnableClick(true);
        this.LLJJJIL.add(new C368940EdI(c368400EcQ, pair));
    }

    public final void LIZIZ(EnumC368970EdL enumC368970EdL) {
        long jLongValue;
        InterfaceC369060EdU interfaceC369060EdU;
        Pair pair;
        Iterator<C368940EdI> it2 = this.LLJJJIL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LIZ, this.LLJJIJIL)) {
                if (i != -1) {
                    C368940EdI c368940EdI = (C368940EdI) C13LP.LJJJLZIJ(i, this.LLJJJIL);
                    if (c368940EdI != null) {
                        Pair<Long, Long> pair2 = c368940EdI.LIZIZ;
                        jLongValue = pair2.getSecond().longValue() - pair2.getFirst().longValue();
                        long jMax = (long) ((Math.max(c368940EdI.LIZ.getWidth() - (this.LLILLL * 2), 0) - (jLongValue * C360610EBv.LIZJ())) / C360610EBv.LIZJ());
                        int i2 = C368980EdM.LIZ[enumC368970EdL.ordinal()];
                        if (i2 != 2) {
                            if (i2 != 3) {
                                pair = new Pair(pair2.getFirst(), pair2.getSecond());
                            } else {
                                pair = new Pair(pair2.getFirst(), Long.valueOf(pair2.getSecond().longValue() + jMax));
                            }
                        } else {
                            pair = new Pair(Long.valueOf(pair2.getFirst().longValue() - jMax), pair2.getSecond());
                        }
                        ListProtector.set(this.LLJJJIL, i, new C368940EdI(c368940EdI.LIZ, pair));
                    } else {
                        jLongValue = 0;
                    }
                    NLETrackSlot nLETrackSlot = this.LLJJJ;
                    if (nLETrackSlot != null && (interfaceC369060EdU = this.LLILZIL) != null) {
                        interfaceC369060EdU.LIZLLL(enumC368970EdL, nLETrackSlot, i, jLongValue);
                        return;
                    }
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final int LJFF(C368940EdI c368940EdI) {
        int iLIZ;
        long jLongValue = c368940EdI.LIZIZ.getFirst().longValue();
        NLETrackSlot nLETrackSlot = this.LLJJJ;
        if (nLETrackSlot != null) {
            iLIZ = C352310DrZ.LIZ(nLETrackSlot.getStartTime());
        } else {
            iLIZ = 0;
        }
        return (int) ((jLongValue - ((long) iLIZ)) * C360610EBv.LIZJ());
    }

    public final int LJI(C368940EdI c368940EdI) {
        return (int) (((c368940EdI.LIZIZ.getSecond().longValue() - c368940EdI.LIZIZ.getFirst().longValue()) * C360610EBv.LIZJ()) + (this.LLILLL * 2));
    }

    public final void setCheckBoxInfoList$editor_trackpanel_release(List<C368940EdI> list) {
        this.LLJJJIL = list;
    }

    public final void setClipState(EnumC368970EdL enumC368970EdL) {
        if (this.LLJI != enumC368970EdL) {
            this.LLJI = enumC368970EdL;
        }
    }

    public final void setData(NLETrackSlot nLETrackSlot) {
        if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            this.LLJJJ = nLETrackSlot;
        }
    }

    public final void setItemHighlightTrackCallback(InterfaceC369060EdU interfaceC369060EdU) {
        this.LLILZIL = interfaceC369060EdU;
    }

    public final void setLeftAndRightPosition(C368400EcQ c368400EcQ) {
        int[] iArr = new int[2];
        c368400EcQ.getLocationOnScreen(iArr);
        int i = iArr[0];
        this.LLIZLLLIL = this.LLILLL + i;
        this.LLJ = i + c368400EcQ.getWidth() + this.LLILLL;
    }

    public final void setMainTrackSlot$editor_trackpanel_release(NLETrackSlot nLETrackSlot) {
        this.LLJJJ = nLETrackSlot;
    }

    public final void setMaxPx$editor_trackpanel_release(float f) {
        this.LLJJI = f;
    }

    public final void setMinPx$editor_trackpanel_release(float f) {
        this.LLJJ = f;
    }

    public final void setScrollHandler(InterfaceC369180Edg interfaceC369180Edg) {
        this.LLJILJIL = interfaceC369180Edg;
    }

    public final void setScrollState(EnumC368970EdL enumC368970EdL) {
        if (this.LLJIJIL == enumC368970EdL) {
            return;
        }
        this.LLJIJIL = enumC368970EdL;
        if (C368980EdM.LIZ[enumC368970EdL.ordinal()] == 1) {
            this.LLJILJILJ.cancel();
        } else {
            this.LLJILJILJ.start();
        }
    }

    public final void LJII(EnumC368970EdL enumC368970EdL, C368400EcQ c368400EcQ) {
        C368940EdI next;
        int width;
        boolean z;
        Iterator<C368940EdI> it2 = this.LLJJJIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, c368400EcQ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C368940EdI c368940EdI = next;
        if (c368940EdI != null) {
            this.LLJJIJIL = c368400EcQ;
            boolean z2 = false;
            if (c368400EcQ != null) {
                width = c368400EcQ.getWidth();
            } else {
                width = 0;
            }
            if (width > this.LLILLL) {
                z2 = true;
            }
            if (enumC368970EdL == EnumC368970EdL.START) {
                C368400EcQ c368400EcQ2 = this.LLJJIJIL;
                if (c368400EcQ2 != null) {
                    c368400EcQ2.LIZLLL(z2);
                }
                C368400EcQ c368400EcQ3 = this.LLJJIJIL;
                if (c368400EcQ3 != null) {
                    c368400EcQ3.LJ(true);
                }
            } else if (enumC368970EdL == EnumC368970EdL.END) {
                C368400EcQ c368400EcQ4 = this.LLJJIJIL;
                if (c368400EcQ4 != null) {
                    c368400EcQ4.LIZLLL(true);
                }
                C368400EcQ c368400EcQ5 = this.LLJJIJIL;
                if (c368400EcQ5 != null) {
                    c368400EcQ5.LJ(z2);
                }
            }
            C368400EcQ c368400EcQ6 = this.LLJJIJIL;
            if (c368400EcQ6 != null && c368400EcQ6.LLJLLIL != (!z2)) {
                c368400EcQ6.LLJLLIL = z;
                c368400EcQ6.invalidate();
            }
            C368400EcQ c368400EcQ7 = this.LLJJIJIL;
            if (c368400EcQ7 != null) {
                c368400EcQ7.bringToFront();
            }
            setMinMaxPX(c368940EdI);
            setLeftAndRightPosition(c368400EcQ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c4  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C368940EdI r19, X.EnumC368970EdL r20, float r21, float r22) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368890EdD.LIZJ(X.0EdI, X.0EdL, float, float):void");
    }
}
